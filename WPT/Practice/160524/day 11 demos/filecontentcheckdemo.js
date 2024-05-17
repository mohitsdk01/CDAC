const fs=require('fs');
fs.readFile("test.txt",function(err,data){
    if(err){
        console.log("error occured",err)
    }else{
        if(data.includes("welcome")){
            console.log("found")
        }else{
            console.log("not found")
        }
    }
})