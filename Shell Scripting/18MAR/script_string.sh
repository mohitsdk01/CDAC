#!/bin/bash

myvar="Hello All"

len=${#myvar}

upper=${myvar^^}
lower=${myvar,,}

echo "$myvar"
echo "$len"
echo "$upper"
echo "$lower"
