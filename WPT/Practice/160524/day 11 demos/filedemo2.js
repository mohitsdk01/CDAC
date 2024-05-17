const fs=require('fs');
console.log("before async file read")
fs.readFile("myfile.txt",function(err,data){
    if(err){
        console.log("error occured",err);
    }else{
        fs.writeFile("myfilecopy11.txt",data,function(err){
            if(err){
                console.log("error occured")
            }
            else{
                console.log("File copy completed")
            }
        })
    }

})
console.log("after async readfile")

console.log("after async file read")