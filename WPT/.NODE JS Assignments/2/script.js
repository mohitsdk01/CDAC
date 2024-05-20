const express = require('express')
const ops = require('./mymodule')
const http = require('http')
const url = require('url')

var app = express();

app.get('/', (req, res)=>{
    res.send('')
})