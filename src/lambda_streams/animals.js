//Bonus:  refactor Animals.java into javascript

let animals = ["peacoCK","rabbit","chiwawa","OranguTAN","vipeR","cobra","paNDa","bUffalo","DeeR","maLLard"];

function main () {
   console.log(capsFirst(animals, false))
   console.log(addAnimal("Doggy dog"))
   console.log(animals)
   console.log(lowerFirst(animals, false))
   console.log("Flip animals is ", flipAnimals())
   console.log("Sorted animals ", sortAnimals(false))
}

// capsFirst
const capsFirst = (arr, bool) => {
   if ( bool ) {
      let newArr = arr.slice();
      return newArr.map(val => val.slice(0, 1).toUpperCase() + val.slice(1).toLowerCase())
   }
   else {
      return arr.map(val => val.slice(0, 1).toUpperCase() + val.slice(1).toLowerCase());
   }
}


// addAnimal
const addAnimal = animalName => {
   animals.push(animalName);
   return animalName;
}


// lowerFirst
const lowerFirst = ( arr, mutate ) => {
   if (mutate) {
      return arr.map(v => v.slice(0, 1).toLowerCase() + v.slice(1).toUpperCase());
   }
   let newArr = arr.slice();
   return newArr.map(v => v.slice(0, 1).toLowerCase() + v.slice(1).toUpperCase());
}


// flipAnimals
const flipAnimals  = mutate => {
   let array = ["Flip","the","animals","list","."," ","Mutate","the","animals","only","if","flag","true"];
   if (mutate) {
      array.reverse();
      return array;
   } else {
      let newArray = array.slice();
      newArray.reverse();
      return newArray;
   }
}


// sort animals
const sortAnimals = mutate => {
   if ( mutate ) {
      animals.sort();
      return animals;
   } else {
      let sorted = animals.slice();
      sorted.sort();
      return sorted;
   }
}


main();