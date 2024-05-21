
function factorial(a){
    let fact = 1;
    for(let i=1; i<=a; i++){
        fact *= i;
    }
    return fact;
}

function myprime(a){
    if (a <= 1) return false; // Numbers less than or equal to 1 are not prime
    for (let i = 2; i < a; i++) {
        if (a % i === 0) {
            return "Not Prime"; // If num is divisible by any number other than 1 and itself
        }
    }
    return "It is a Prime"; // If no divisors were found, num is a prime number
}

function printtable(a){
    let str = "";
    for(let i of 10){
        str += `${a} * ${i} = ${a * i}<br>`
    }
    return str;
}

module.exports={
    factorial,
    myprime,
    printtable
}