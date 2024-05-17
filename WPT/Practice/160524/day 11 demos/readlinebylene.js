const readline=require('readline');
const fs=require('fs');
let rl=readline.createInterface({
    input:fs.createReadStream("myfile.txt")
})

var linenum=0;
rl.on("line",function(data){
    linenum++;
    console.log("line evvent occur",linenum)
    console.log(linenum+"--->"+data);
})
rl.on("close",function(){
    console.log(`total line counts : ${linenum }`)
})