debugger;
x = 30;
console.log(`Value of x 1 is ${x}`); //30
greet();
var x = 10;
console.log(`Value of x 2 is ${x}`); //10
let y = 12;
console.log(`value of y is ${y}`);
function greet() {
  console.log('hiii');
}
/*
Memory phase
x=undefined
x=30 (update after execution)


Execution Phase
x = 30;
console.log(`Value of x 1 is ${x}`);

var x = 10;

*/