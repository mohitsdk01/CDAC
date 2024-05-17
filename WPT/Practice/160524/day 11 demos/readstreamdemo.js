const fs=require('fs');
//default size of stream is 65536
//highWaterMark---will help to change the size of stream
//var rs=fs.createReadStream("myfile.txt","utf-8",{highWaterMark:200})
var rs=fs.createReadStream("myfile.txt","utf-8");
var ws=fs.createWriteStream("myfilecopy3.txt");
var value=""
rs.on("data",function(chunk){
    console.log("data event occure",chunk.length)
    value=value+chunk;
    ws.write(chunk.toString())
})
rs.on("end",function(){
    console.log("end event occur")
    ws.end(); 
})
rs.on("error",function(err){
    console.log("error occured")
})