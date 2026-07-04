let isAdmin = false;
checkIsAdminOrNot(isAdmin);
canVote(19);
checkEvenOdd(36);
function checkEvenOdd(value) {
  if (value % 2 === 0) {
    console.log(`${value} is Even`);
  }
  else {
    console.log(`${value} is Odd`);
  }
}

function checkIsAdminOrNot(value) {
  if (value === true) {
    console.log(`User is Admin`);
  }
  else {
    console.log(`Guest User`);
  }
}

function canVote(age) {
  if (age >= 18 && age<=100 && age!=0) {
    console.log(`Person can vote`);
  }
  else {
    console.log(`Person can not vote`);
  }
}


