// import required packages
const http = require('http');
const fs = require('fs');
const url = require('url');

var server = http.createServer(function(req, res){
    fs.appendFile('./files/test.txt', `${req.url} " " ${req.method}`)
    var q = url.parse(req.url, true);
    console.log('q:', q);
    res.writeHead(200,{'content-type':'text/html'});

});

server.listen(3000, ()=>{
    console.log("Server Started");
})