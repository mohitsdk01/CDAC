const http = require("http")
const fs = require("fs")
const url = require("url")
const m1 = require("./uservalidatemodule")

var server=http.createServer(function(req,resp){
console.log(req.url+"--->"+ req.method)
var q = url.parse(req.url,true)
console.log("q=  "+q);
resp.writeHead(200,{"content-type":"text/html"})
switch(q.pathname){
    case '/loginform': 
        var rs= fs.createReadStream("./public/loginform.html")
        rs.pipe(resp);
        break;
    case "/validate_user":
        resp.write("<h3>User name:"+q.query.uname+"</h3>")
        resp.write("<h3>Password:"+q.query.pass+"</h3>")
        var answer= m1.validate_user(q.query.uname,q.query.pass)
        if(answer!==null){
            resp.write("<h3>Login Successfull!</h3>")
        }else{
            resp.write("<h3>Invalid Credentials!</h3>")
        }
    resp.end()
    break;
    default: resp.write("Default case...")
    }
})
server.listen(3001,function(){
    console.log("Server is running at port 3001")
})