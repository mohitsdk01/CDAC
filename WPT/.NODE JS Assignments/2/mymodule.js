
function factorial(a){
    let fact = 1;
    for(let i=1; i<=a; i++){
        fact *= i;
    }
    return fact;
}

function myprime(number){
    if (number < 2) {
        return false;
      }
    
      for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i === 0) {
          return false;
        }
      }
    
      return true;
}

function printtable(a){
    let str = "";
    for(let i=1; i<=10; i++){
        str += `${a} * ${i} = ${a * i}<br>`
    }
    return str;
}

module.exports={
    factorial,
    myprime,
    printtable
}