const express = require('express')
const bodyparser = require('body-parser')
const app= express()
const connection = require('./db/dbconnection')

app.use(bodyparser.urlencoded({extended:false}))
app.get('/form', function(req, resp){
    resp.sendFile("public/productform.html",{root:__dirname})
})

app.post('/submit-data', function(req,resp){
    var pid = req.body.pid;
    connection.query("select * from product where pid=?",[pid],function(err,data){
        if(err){
            resp.send('<h2>Not Found</h2>')
        }else{
            if(data.length>0){
                var str=data[0].pid +"<br>"+data[0].pname +"<br>"+data[0].qty +"<br>"+data[0].price;
                resp.send(str)
            }else{
                resp.send('<h2>Not Found</h2>')
            }
        }
    })
})

app.listen(3001,function(){
    console.log("Server running at port 3001")
})