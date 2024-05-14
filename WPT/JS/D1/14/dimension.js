// 14. Create a custom object for rectangle and circle. Individual Rectangle objects should be able to store
// dimension, and have methods to print area and perimeter. Individual Circle objects should be able to
// store radius, and have methods to print area and circumference. Display dimensions, area and perimeter
// of rectangle and circle objects. Make use of pre-defined objects.


var rect = {
    length: 12,
    width: 10,
    area: function(){
        return `Area of Rectangle: ${this.length * this.width}`;
    },
    perimeter:function(){
        return `Perimeter of Rectangle: ${2 * (this.length + this.width)}`;
    }
}

var circle = {
    radius: 5,
    circumference: function(){
        return `Circumference of Circle: ${2 * Math.PI * this.radius}`;
    }
}

// document.write(`Rectangle Data: <r> Length: ${rect.length} Width: ${rect.width} Area: ${rect.area} Perimeter: ${rect.perimeter}`);
// document.write(`<br>Circle Data: <r> Radius: ${circle.radius} Circumference: ${circle.circumference}`);

document.write("RECTANGLE: <br>" + "Length: " + rect.length + "&nbsp;&nbsp;&nbsp;&nbsp;Width: " + rect.width + "&nbsp;&nbsp;&nbsp;&nbsp;Area: " + rect.area() + "&nbsp;&nbsp;&nbsp;&nbsp;Perimeter: " + rect.perimeter() + "<br>");
document.write("<br>CIRCLE: <br>" + "Radius: " + circle.radius + "&nbsp;&nbsp;&nbsp;&nbsp;Circumference: " + circle.circumference());

