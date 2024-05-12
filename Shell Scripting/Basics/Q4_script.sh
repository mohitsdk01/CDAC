#!/bin/bash

a=6
b=$(date +%u)
if [ $b -le 6 ]
then
	echo "Working day"
else

	echo "Not Working day"
fi
