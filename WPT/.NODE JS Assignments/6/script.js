const http = require('http')
const url = require('url')

http.createServer(function(req, res){
    var q = url.parse(req.url);
    res.writeHead(200, {'content-type': 'text/html'})
    res.write("Welcome to NodeJS");
    res.end();  
    // if(q.pathname === '/'){
        
    // }

}).listen(5000, ()=>{
    console.log("Server is Running...");
})