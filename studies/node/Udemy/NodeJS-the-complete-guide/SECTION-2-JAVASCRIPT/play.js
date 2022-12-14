/*
const name = 'Max';
let age = 29;
const hasHobbies = true;

const summarizeUser = (userName, userAge, userHobby) => {
    return (
        'Name is ' + userName + ', age is ' + userAge + ' and the user has hobbies: ' + userHobby
    );
}

const add = (a, b) => a + b;
const addOne = a => a + 1;
const addRandom = () => 1 + 2;

console.log(summarizeUser(name, age, hasHobbies));
console.log(add(2, 1));
console.log(addOne(1));
console.log(addRandom());
*/

const person = {
    name: 'Max',
    age: 29,
    greet() {
        console.log('Hi, I am ' + this.name);
    }
};

const copiedPerson = {...person};
console.log(copiedPerson);

const hobbies = ['Sports', 'Cooking'];
// for(let hobby of hobbies) {
//    console.log(hobby)
// }
// console.log(hobbies.map(hobby => 'Hobby: ' + hobby));
// console.log(hobbies);
const copiedArray = [...hobbies];
console.log(copiedArray);

const toArray = (...args) => args;
console.log(toArray(1, 2, 3, 4));