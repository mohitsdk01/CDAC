const mysql=require("mysql");
//database connection configration
//mysql details
var mysqlConnection=mysql.createConnection({
    host:'127.0.0.1',
    user:'root',
    password:'password',
    database:'test',
    port:3306
});

mysqlConnection.connect((err)=>{
    if(!err){
        console.log("connection done");
    }else{
        console.log("connection failed" + err);
    }

})

module.exports=mysqlConnection