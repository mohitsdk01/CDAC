#!/bin/bash

a=5
b=10
let c=a+b
((d=a-b))
e=`expr $a * $b`
echo "sum = $c"
echo "Sub - $d"
echo "Multiplication: $e"
