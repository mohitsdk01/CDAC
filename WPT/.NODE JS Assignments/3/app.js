const http = require("http");
const fs = require("fs");
const url = require("url");
const circleF = require("./Shapes/circle");
const rectangleF = require("./Shapes/rectangle");
const triangleF = require("./Shapes/triangle");
var purl = "";

var server = http.createServer(function (req, res) {
  var q = url.parse(req.url, true);
  res.writeHead(200, { "content-type": "text/html" });
  let index = fs.createReadStream("./index.html");
  let circle = fs.createReadStream("./circle.html");
  let rectangle = fs.createReadStream("./rectangle.html");
  let triangle = fs.createReadStream("./triangle.html");

  index.pipe(res);
  res.write(`<a href="/">Home</a><br>`);
  index.on("data", () => {
    switch (q.pathname) {
      case "/circle":
        circle.pipe(res);
        purl = "circle";
        break;

      case "/rectangle":
        rectangle.pipe(res);
        purl = "rectangle";
        break;

      case "/triangle":
        triangle.pipe(res);
        purl = "triangle";
        break;

      case "/output":
        let inp1 = Number(q.query.inp1);
        let inp2 = Number(q.query.inp2);
        let inp3 = Number(q.query.inp3);
        if (purl === "circle") {
          circle.pipe(res);
          res.write("Area of Circle: " + circleF.calcArea(inp1) + "<br>");
          res.write(
            "Circumference of Circle: " +
              circleF.calcCircumference(inp1) +
              "<br>"
          );
          res.write(
            "Diameter of Circle: " + circleF.calcDiameter(inp1) + "<br>"
          );
        } else if (purl === "rectangle") {
          rectangle.pipe(res);
          res.write(
            "Area of Rectangle: " + rectangleF.calcArea(inp1, inp2) + "<br>"
          );
          res.write(
            "Perimeter of Rectangle: " +
              rectangleF.calcPerimeter(inp1, inp2) +
              "<br>"
          );
        } else if (purl === "triangle") {
          triangle.pipe(res);
          res.write(
            triangleF.isEquilateral(inp1, inp2, inp3)
              ? "Triangle is Equilateral triangle<br>"
              : "Triangle is not Equilateral triangle<br>"
          );
          res.write(
            "Perimeter of Triangle: " +
              triangleF.calcPerimeter(inp1, inp2, inp3) +
              "<br>"
          );
        }
      default:
        break;
    }
  });
})

server.listen(3000, function () {
  console.log("Server is running...");
});
