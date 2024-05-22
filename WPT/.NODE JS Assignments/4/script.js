const http = require('http')
const url = require('url')
const fs = require('fs')
const md = require('./modules')

var server = http.createServer(function(req, res){
    var q = url.parse(req.url, true);
    res.writeHead(200, {'content-type' : 'text/html'})

    switch(q.pathname){
        case '/':
            var rs = fs.createReadStream('./index.html');
            rs.pipe(res);
            break;
        case '/print':
            res.write(md.print());
            break;
    }
})
server.listen(3001, ()=>{
    console.log("Server Running...");
});