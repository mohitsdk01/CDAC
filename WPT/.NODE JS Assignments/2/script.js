const http = require('http')
const fs = require('fs')
const url = require('url')
const ops = require('./mymodule')

var server = http.createServer(function(req, res){
    var q = url.parse(req.url, true)
    res.writeHead(200, {'content-type' : 'text/html'})
    debugger
    switch(q.pathname){
        case '/form':
            var rs = fs.createReadStream('./index.html');
            rs.pipe(res);
            break;
        case '/find':
            var num = parseInt(q.query.num);
            if(num < 5){
                res.write(`<h1>Factorial is: ${ops.factorial(num)}</h1>`);
            }
            else if(num > 10)
                    if(ops.myprime(num) === true)
                        res.write("Number is Prime");
                    else{
                        res.write("Number is not Prime");
                    }
            else{
                res.write(`The Table is:<br> ${ops.printtable(num)}`);
            }
            break;
    }
}).listen(3001, ()=>{
    console.log('server is running...');
});