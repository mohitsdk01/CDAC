#!/bin/bash/

ls -l | awk '{print $5, $9}' |sort -n | awk 'NR==2 {print " MIN VALUE: " $0} END {print "MAX VALUE: " $0}'

