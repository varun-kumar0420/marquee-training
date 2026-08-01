let arrayOfCars = ['Maruti', 'Brezza', 'Innova Crysta', 'Fortuner'];
const [first, second, ...third] = [arrayOfCars];
console.log(first);
console.log(second);
console.log(third);


let arrayOfCars = [
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