const express = require('express')
const app = express();
const bodyparser = require('body-parser')
const valid = require('./validator')

app.use(bodyparser.urlencoded({extended:false}))

app.get('/login', function(req, res){
    console.log("current folder ",__dirname);
    console.log("File name ",__filename);
    res.sendFile('./login.html', {root:__dirname});
})

app.get('/submit', (req, res)=>{
    var uname=req.query.username;
    var passwd=req.query.pass;
    console.log(uname + "-->" + passwd);

    if(passwd.length < 6) res.send(`<h1>Password must be 6 or greater than 6 characters.</h1>`)
    var ob2 = valid.userValidator(uname, passwd);
    if(ob2 !== null){
        res.sendFile('./success.html', {root:__dirname});
    }
    else{
        res.sendFile('./failure.html', {root:__dirname});
    }

})

app.listen(5000, ()=>{
    console.log("Server is Running...");
})