const http = require('http')
const fs = require('fs')
const url = require('url')
const circle = require('./Shapes/circle')
const circle = require('./Shapes/rectangle')
const circle = require('./Shapes/triangle')

var server = http.createServer(function(req, res){
    var q = url.parse(req.url, true);
    res.writeHead(200, {'content-type' : 'text/html'})

    switch(q.pathname){
        case '/':
            var rs = fs.createReadStream('./index.html');
            rs.pipe(res);
            break;
        case '/print':
            res.write();
            break;
    }
})

server.listen(3000, function(){
    console.log("Server is running...");
})