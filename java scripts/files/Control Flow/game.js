function playGame(userChoice) {
  let choices = ["rock", "paper", "scissors"];
  let randomIndex = Math.floor(Math.random() * 3);
  let computerChoice = choices[randomIndex];

  console.log("User:", userChoice);
  console.log("Computer:", computerChoice);

  switch (userChoice) {
    case "rock":
      switch (computerChoice) {
        case "rock":
          console.log("Draw");
          break;
        case "paper":
          console.log("Computer Wins");
          break;
        case "scissors":
          console.log("You Win");
          break;
      }
      break;

    case "paper":
      switch (computerChoice) {
        case "rock":
          console.log("You Win");
          break;
        case "paper":
          console.log("Draw");
          break;
        case "scissors":
          console.log("Computer Wins");
          break;
      }
      break;

    case "scissors":
      switch (computerChoice) {
        case "rock":
          console.log("Computer Wins");
          break;
        case "paper":
          console.log("You Win");
          break;
        case "scissors":
          console.log("Draw");
          break;
      }
      break;

    default:
      console.log("Invalid Choice");
  }
}

playGame("scissors");