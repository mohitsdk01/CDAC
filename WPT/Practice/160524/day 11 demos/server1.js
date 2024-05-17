const http=require('http');
var server=http.createServer(function(req,resp){
    //req--->readstream object
    //resp---> writestrem object
    //console.log(req);
    console.log("received request : "+req.url+"--->"+req.method)
    resp.writeHeader(200,{'content-type':'text/html','content-length':10000})
    resp.write("<h1>Hello World</h1>")
    resp.write("<h1>Welcome to nodejs programming</h1>")
    resp.end("<h3>This is my first web app</h3>");
})
server.listen(3001,function(){
    console.log("server is running on port 3001");
})