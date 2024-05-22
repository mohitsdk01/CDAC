const express = require('express')
const app = express();
const bodyparser = require('body-parser')
const prime = require('./primeFinder')
app.use(bodyparser.urlencoded({extended:false}))
app.get('/prime', (req, res)=>{
    res.sendFile('./index.html', {root:__dirname})
})

app.get('/find', (req, res)=>{
    var num = req.query.num;
    var isPrime = prime.isPrime(num);
    if(isPrime === true){
        res.send(`<h1> Number is Prime.</h1>`)
    }
    else{
        res.send(`<h1> Number is not Prime.</h1>`)
    }
})

app.listen(5000, ()=>{
    console.log("Server is Running...");
})