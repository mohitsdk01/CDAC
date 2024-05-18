//import expressjs
const express=require('express');
//create a object of expressjs
var app=express();
//define middleware
// used for only checking the url is working or not
app.use(function(req,resp,next){
    console.log(req.url+"--->"+req.method)
    next();
})
app.use(function(req,resp,next){
    console.log("In second middleware")
    next()
})
app.use(function(req,resp,next){
    console.log("in third middleware")
    next()
})

app.get("/hello",function(req,resp){
    resp.send("<h1>Hello world!!</h2>");
})
app.get("/welcome",function(req,resp){
    var str="<h1>Hello world!!</h1><h3>Welcome to nodejs programming</h3>";
    str=str+"<h4>This is third line code</h4>"
    resp.send(str);
})

app.listen(3001,function(){
    console.log("server is running on port 3001");
})