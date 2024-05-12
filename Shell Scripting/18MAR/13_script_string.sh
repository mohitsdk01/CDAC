#!/bin/bash

read str
read str1

concanate(){
num1=$1
num2=$2
echo $num1$num2
}

lenofstring(){
num1=$1
num2=$2
echo ${#num1} ${#num2}
}

compare(){
num1=$1
num2=$2
if [ "$num1" == "$num2" ]
then
	echo "EQUAL"
else
	echo "NOT EQUAL"
fi

}

palindrome(){
num1=$1
if [ $(rev <<< "$1") == "$1" ]
then
	echo "Palindrome"
else
	echo "NOT PALINDROME"
fi
}

reverse(){
num1=$1
( rev <<< "$1" )
echo $rev
}

concanate $str $str1
lenofstring $str $str1
compare $str $str1
palindrome $str
reverse $str















