
function add(a, b){
    return a + b;
}

function subtract(a, b){
    return a - b;
}

function multiply(a, b){
    return a * b;
}


function divide(a,b){
    return a / b;
}


function square(a){
    return a * a;
}

function sum(...a){
    var sum = 0;
    for(let i of a){
        sum += i;
    }
    return sum;
}

module.exports = {
    add,
    subtract,
    divide,
    sum,
    square,
    multiply
}