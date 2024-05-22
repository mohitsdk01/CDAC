const express=require("express");
const app=express();
const bodyParser = require("body-parser");
const m1=require("./uservalidatemodule");
app.use(bodyParser.urlencoded({extended:false}))

app.use(function(req,resp,next){
    console.log(req.url+"---->"+req.method);
    console.log(req.body)
    next();
})

app.get("/login",function(req,resp){
    console.log("current folder ",__dirname);
    console.log("File name ",__filename);
    resp.sendFile("public/loginform.html",{root:__dirname});
})

app.post("/validate_user",function(req,resp){
    var uname=req.body.uname;
    var passwd=req.body.pass;
    var ob=m1.validate_user(uname,passwd);
    if(ob!==null){
        resp.send("<h2>Login successfull!!</h2>");
    }else{
        resp.send("<h2>Invalid user</h2>");
    }


})

app.listen(3001,function(){
    console.log("server running on port 3001")
})



