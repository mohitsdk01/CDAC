const http=require('http')
const fs=require('fs')
var server=http.createServer(function(req,resp){
    console.log(req.url+"---->"+req.method)
    resp.writeHeader(200,{'content-type':'text/html'})
    switch(req.url){
        case '/home':
            var rs=fs.createReadStream("./public/hello.html")
            rs.pipe(resp)
            break;
        case '/aboutus':
            var rs=fs.createReadStream("./public/aboutus.html")
            rs.pipe(resp)
            break;
        default:
             resp.write("<h1>In dafault case</h1>")
    }
})
server.listen(3001,function(){
    console.log("server is running at port 3001")
})