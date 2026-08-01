function Dog(name, breed, age, weight = 0) {
  this.dogname = name;
  this.dogBreed = breed;
  this.dogAge = age;
  this.dogweight = weight;
  this.sound = function () {};
  this.eat = function () {};
  this.updateName = function (name) {
    this.dogname = name;
  };
}

let bullDog = new Dog('Sweety', 'Labra', 3, 14);
console.log(bullDog.dogname);
bullDog.updateName('');




























// function Dog(name, breed, age, weightKg) {
//   this.name = name;
//   this.breed = breed;
//   this.age = age;
//   this.weightKg = weightKg;
// }
// Dog.prototype.eat = function () {
//   console.log(`${this.name} is eating.`);
// };
// 
// Dog.prototype.bark = function () {
//   console.log(`${this.name} says Woof!`);
// };
// 
// Dog.prototype.sleep = function () {
//   console.log(`${this.name} is sleeping.`);
// };
// 
// Dog.prototype.info = function () {
//   console.log("----- Dog Information -----");
//   console.log("Name:", this.name);
//   console.log("Breed:", this.breed);
//   console.log("Age:", this.age, "years");
//   console.log("Weight:", this.weightKg, "kg");
// };
// 
// const dog1 = new Dog("Marley", "Pitbull", 3, 30);
// const dog2 = new Dog("Bruno", "Labrador", 5, 35);
// console.log(dog1);
// console.log(dog2);
// dog1.info();
// dog1.eat();
// dog1.bark();
// dog1.sleep();
// 
// console.log("------------------");
// 
// dog2.info();
// dog2.eat();
// dog2.bark();
// dog2.sleep();