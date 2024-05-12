#!/bin/bash

day=`date +%u`
weekday=0

if [ $day -le 5 ] && [ weekday=1 ]
then
	echo "Week Day"
else
	echo "Not Week Day"

fi
