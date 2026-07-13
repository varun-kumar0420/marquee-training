function outer() {
  let sum = 0;
  function inner(){
    sum++;
     return sum;
    console.log(`Sum is ${sum}`);
  }
   return inner;
}
// console.log(outer());
let outerfn = outer();
console.log(outerfn());
console.log(outerfn());
console.log(outerfn());






// create a function createArray that
// 1. push() element into array
// 2. return the array.

function createArray() {
  let arr = [];
  return arr;
}
const myArray = createArray();
myArray.push(10);
myArray.push(30);
myArray.push(20);
myArray.push(40);
console.log(myArray.getElement(1));
console.log(myArray.getArray);