// Triangle.js – isEquilateral(side1, side2, side3), calcPerimeter()

function isEquilateral(side, side1, side2){
    if(side === side1 && side1 === side2){
        return 'Triangle has same sides and quilateral.'
    }
    else{
        return 'Triangle not equilateral.'
    }
}

function calcPerimeter(...side){
    return side[0] + side[1] + side[2];
}

module.exports= {
    isEquilateral,
    calcPerimeter
}