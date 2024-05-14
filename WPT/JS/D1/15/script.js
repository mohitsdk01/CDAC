// 15. An array contains a set of 5 words. Write Javascript to reverse each word and arrange the resulting words
// in alphabetical order. Make use of array functions.

var arr = [
    "Model", "Front", "Earth", "Would", "Brand"
]
var arr1 = []
function operations(){
    for(let i in arr){
        arr1.push(arr[i].split('').reverse().join(''))
        // arr1.push(arr[i].reverse()); // wrong
    }
   return arr1.sort();
}

console.log(operations());