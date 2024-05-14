function pow(x, y=0){
    let power = 1;
    for(let i=0; i<y; i++){
        power *= x;
    }
    return power;
}

console.log(pow(3,4));