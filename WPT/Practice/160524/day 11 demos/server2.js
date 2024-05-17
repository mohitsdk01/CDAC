const http=require('http')
var server=http.createServer(function(req,resp){
    console.log(req.url+"----"+req.method);
    resp.writeHeader(200,{'content-type':'text/html'});
    switch(req.url){
        case "/home":
            resp.write("<h1>In home page</h1>");
            resp.end();
            break;
        case "/aboutus":
            resp.write("<h1>about us</h1>");
            resp.end();
            break;
        case "/submitdata":
            resp.write("<h1>In submit data</h1>");
            resp.end();
            break;
        default:
            resp.write("<h1>In default page</h1>");
            resp.end();
            break;
    }

})
server.listen(3001,function(){
    console.log("server is running port 3001")
})