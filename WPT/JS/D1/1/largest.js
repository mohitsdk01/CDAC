// 1. Write a program to accept three positive numbers and output the largest of them.

function findLargest(){
    // alert("here")
    var n1 = document.getElementById("num1").value;
    var n2 = document.getElementById("num2").value;
    var n3 = document.getElementById("num3").value;

    if(n1 > n2 && n1 > n3){
        // alert("Here") 
        document.getElementById("res").innerHTML = `Largest Number is: ${n1}`;
        // alert(`Largest Number is: ${n1}`)
        return true;
    }
    else if(n2 > n3  && n2 > n1){
        document.getElementById("res").innerHTML= `Largest Number is: ${n2}`;
        return true;
    }   
    else {
        document.getElementById("res").innerHTML= `Largest Number is: ${n3}`;
        return true;
    }
}