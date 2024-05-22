const fs = require('fs')

fs.readFile('./mydata.txt', (err, res)=>{
    if(err){
        console.log("File Not Found!");
    }
    else{
        console.log(res.toString().trim("").length);
    }
});

fs.readFile('./myfile.data', (err, res)=>{
    if(err){
        console.log("File Not Found!");
    }
    else{
        console.log(res.toString().trim("").length);
    }
});