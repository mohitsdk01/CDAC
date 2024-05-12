#!/bin/bash

myfun(){

	echo "HELLO"
}

myfun

addition(){
num1=$1
num2=$2
let sum=$num1+$num2
echo "Sum: $sum"
}
addition 10 20

