// Write a Node program that prints all the numbers between 1 and 100, each on a separate line. A
// few caveats:
// o if the number is divisible by 3, print “fizz”
// o if the number is divisible by 5, print “buzz”
// o if the number is divisible by both 3 and 5, print “fizzbuzz”

const print = ()=>{
    var a = 100;
    var res = ""
    for(let i = 1; i<=100; i++){
        if(i % 3 == 0){
            res += `<h4>${i} = Fizz</h4><br>`
        }
        else if(i % 5 == 0){
            res += `<h4>${i} = Buzz</h4><br>`
        }
        else{
            res += `<h4>${i} = FizzBuzz</h4><br>`
        }
        
    }
    return res;
}

module.exports={
    print
}