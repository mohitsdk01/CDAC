// Rectangle.js – calcArea(length, breadth), calcPerimeter(length, breadth)

function calcArea(l, b){
    return l * b;
}

function calcPerimeter(l, b){
    return 2 * (l + b);
}

module. exports = {
    calcArea,
    calcPerimeter
}