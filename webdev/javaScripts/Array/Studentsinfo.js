function BasicStudentDetails() {
  const students = [
    {
      name: "Sunny Kumar",
      email: "sunny@example.com",
      phone: "1234567890"
    },
    {
      name: "Anubhav Kumar",
      email: "anubhav@example.com",
      phone: "98765432879"
    },
    {
      name: "Prashant Kumar",
      email: "prashant@example.com",
      phone: "9876544751"
    },
    {
      name: "Sujal Kumar",
      email: "sujal@example.com",
      phone: "98765447895"
    }
  ];
  return students;
}
let studentArray = BasicStudentDetails();
console.log(studentArray);