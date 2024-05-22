const fs = require('fs')

var data = fs.readFileSync('./file.txt', 'utf-8')

const lines = data.split(/\r?\n/);

lines.forEach((line, index)=>{
    console.log(`${index+1}. ${line}`);
});
