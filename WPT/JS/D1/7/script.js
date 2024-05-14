var minNumber = []
function min(...args){ // Rest Parameters
    let min = args[0];

    for(let i=1; i<=args.length; i++){
        if(min > args[i]){
            min = args[i];
        }
    }
    return min;
}

console.log(min(6,21,53,5,7,8))