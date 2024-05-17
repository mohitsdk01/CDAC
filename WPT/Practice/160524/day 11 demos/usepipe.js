const fs=require('fs');
var rs=fs.createReadStream("myfile.txt");
var ws=fs.createWriteStream("test111.txt")
rs.pipe(ws);