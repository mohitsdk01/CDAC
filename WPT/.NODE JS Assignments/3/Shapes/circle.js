// Circle.js has functions like : calcArea(radius), calcCircumference(radius), calcDiameter(radius)

function calcArea(r){
    return Math.PI * (r*r);
}

function calcCircumference(r){
    return 2 * Math.PI * r;
}

function calcDiameter(r){
    return 2 * r;
}

module.exports = {
    calcArea,
    calcCircumference,
    calcDiameter
}