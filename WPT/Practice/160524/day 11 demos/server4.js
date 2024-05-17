const http=require('http');
const fs=require('fs')
const url=require('url')
const m1=require('./server4module')
var server=http.createServer(function(req,resp){
    console.log(req.url+"----"+req.method)
    //this will parse the url and seperate the url 
    //and the querystring
    //the second parameter true will convert the 
    //query string into a object
    var q=url.parse(req.url,true)
    console.log("q: ",q);
    resp.writeHeader(200,{'content-type':'text/html'})
    switch(q.pathname){
        case "/form":
            var rs=fs.createReadStream("./public/form.html");
            rs.pipe(resp);
            break
        case '/submit-data':
            
            resp.write("<h3>num1 : "+q.query.num1+"</h3>")
            resp.write("<h3>num2 : "+q.query.num2+"</h3>")
            var ans=m1.addition(parseInt(q.query.num1),parseInt(q.query.num2))
            resp.end("<h3>Addition : "+ans+"</h3>")
            break;
        default:
            resp.write("<h1>In default case</h1>");
            resp.end();

    }


})
server.listen(3001,function(){
    console.log("server is running on port 3001");
})