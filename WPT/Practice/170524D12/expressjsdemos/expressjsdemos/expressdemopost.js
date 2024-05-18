const express=require("express");
var app=express();
const bodyparser=require("body-parser");
const m1=require("./server4module");

app.use(bodyparser.urlencoded({extended:false}))
app.use(function(req,resp,next){
    console.log(req.url+"--->"+req.method)
    console.log(req.body);
    next();
})
app.get("/hello",function(req,resp){
    resp.sendFile("public/hello.html",{root:__dirname})
})
app.get("/form",function(req,resp){
    resp.sendFile("public/form.html",{root:__dirname})
})
app.post("/submit-data",function(req,resp){
    var num1=parseInt(req.body.num1);
    // .btn ?
    switch(req.body.btn){
        case "add":
            var num2=parseInt(req.body.num2);
            var ans=m1.addition(num1,num2)
            resp.send(`num1 ${num1} num2 : ${num2} Addition:${ans}`)
            break;
        case "fact":
            var ans=m1.factorial(num1);
            resp.send(`num1 ${num1}  Factorial: ${ans}`)
        case "printable":
            
            break;

    }
    // if(req.body.btn==="add"){
        
    // }else if(req.body.btn === "fact"){

    // }

})
app.listen(3001,function(){
    console.log("server is running at port 3001")
})