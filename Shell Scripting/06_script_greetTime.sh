#!/bin/bash

time=`date +%H`

if [ $time -lt 12 ]
then
	echo Good Morning
elif [ $time -lt 18 ]
then
	echo Good Afternoon
else
	echo Good Evening
fi
