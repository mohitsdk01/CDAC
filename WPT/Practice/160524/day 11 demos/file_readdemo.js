const fs=require('fs');
fs.exists("myfile.txt",function(exists){
    if(exists){
        fs.stat("myfile.txt",function(err,status){
            console.log(status);
            fs.open("myfile.txt","r",function(err,fd){
                if(err){
                    console.log("error occured")
                }else{
                    var buff=Buffer.alloc(100)
                    fs.read(fd,buff,0,20,null,function(err,bytesread,buff){
                        if(err){
                            console.log("error occured")
                        }else{
                            //show number of bytes read
                            console.log("length read",bytesread);
                            //shows actual data
                            console.log(buff.toString());
                        }
                    })//read ends
                }

            })//open ends 
        })//stat ends 
    
    }
})//exists end
