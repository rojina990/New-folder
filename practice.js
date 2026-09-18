const age = 20;

if (age >= 18) {
  console.log("Adult");
} else {
  console.log("Not Adult");
}



let count = 0;

for (let i = 1; i <= 10; i++) {
  count = count + i;
}

console.log("Total:", count);




const arr = [4, 2, 9, 1, 7];
let max = arr[0];

for (let i = 1; i < arr.length; i++) {
  if (arr[i] > max) {
    max = arr[i];
  }
}

console.log("Max:", max);
