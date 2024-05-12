#!/bin/bash

read a
echo "Enter Number: "
for ((i=0; i<a; i++))
do
	for ((j=0; j<i; j++))
	do
		echo -n "*"
	done
	echo
done

