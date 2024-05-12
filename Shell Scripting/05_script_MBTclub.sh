#!/bin/bash

echo "Enter the Weight: "
read weight
if [ $weight -le 250 ] && [ $weight -ge 30 ]
then
	echo "Accepted"
else
	echo "Denied"
fi


