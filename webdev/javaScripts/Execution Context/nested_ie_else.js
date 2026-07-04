let age = 19;
let hasLicense = true;
personCanDriveOrNot(age, hasLicense);
function personCanDriveOrNot(age, license) {
  if (age >= 18) {
    if (license === true) {
      console.log(`### User can Drive ###`);
    }
    else {
      console.log(`### User cannot Drive ###`);
    }
  }
  else {
    console.log(`### User cannot Drive ###`);
  }
}