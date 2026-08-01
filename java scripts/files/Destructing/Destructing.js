// let arrayOfCars = ['Maruti', 'Brezza', 'Innova Crysta', 'Fortuner'];
// const [first, second, ...third] = [arrayOfCars];
// console.log(first);
// console.log(second);
// console.log(third);


let arrayOfCar = [
  [90, true, false],
  'Maruti',
  'Brezza',
  'Innova',
  'Fortuner',
];
const [first, second = 'Maruti', ...third] = ['Hundai', 'Bmw', 'Bullet'];
console.log(first); // Hundai
console.log(second); // Bmw
console.log(third); // Bullet



const user = {
  name: 'Sunny',
  age: 21,
  email: 'sunnykumar@gmail.com',
  phone:6200724250
}

let obj = {
  user,
  age: 25,
  name: 'Sujal',
  username: 'Atul'
};

const { age, phone, address, name, email } = user;
console.log(name); // sunny
console.log(email);  // sunnykumar@gmail.com
console.log(address);  // undefined --> address is not present in the user.

const {age: objage, name:objname, username:objusername } = obj;
console.log(objage);
console.log(objname);
console.log(objusername);