const express=require("express");
const app=express();
const bodyParser = require("body-parser");
//import database connection
const connection=require("./db/dbconnection");
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
    connection.query("select * from userlogin where uname=? and passwd=?",[uname,passwd],function(err,data,fields){
         if(err){
            console.log(err);
            resp.send("<h2>Invalid user</h2>");
         }else{
            console.log(data);
            if(data.length>0){
                console.log(data[0].role+","+data[0].uname+","+data[0].passwd);
                //console.log(fields);
                //var ob={uname:data[0].uname,passwd:data[0].passwd}
                resp.send("<h2>Login successfull!!</h2>");
            }else{
                resp.send("<h2>Invalid user</h2>");
            }
           
               
            }
         
    })
    //var ob=m1.validate_user(uname,passwd);
    


})

app.listen(3001,function(){
    console.log("server running on port 3001")
})



