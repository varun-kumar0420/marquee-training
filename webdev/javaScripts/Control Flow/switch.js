function getGrade(marks) {
  switch (true) {
    case marks >= 90:
      return "A+";
    case marks >= 80:
      return "A";
    case marks >= 70:
      return "B";
    case marks >= 60:
      return "C";
    case marks >= 50:
      return "D";
    case marks >= 40:
      return 'Fail';
    default:
      return "Invalid marks";
  }
}

console.log(getGrade(100));

