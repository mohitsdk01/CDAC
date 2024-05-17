const fs = require('fs');

// fs.writeFileSync('./Text Files/test1.txt',"Hello Everyone");

// var res = fs.readFileSync('./Text Files/test1.txt', 'utf-8');
// console.log(res);

fs.writeFile('./Text Files/test1.txt',"Hey I am Mohit", (err)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log('Done');
    }
})