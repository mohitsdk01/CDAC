

var arr=[{uname:'user1',passwd:'pass1'},{uname:'user2',passwd:'pass2'}]
exports.validate_user=function(username,password){
    for(var ob of arr){
        if(ob.uname===username && ob.passwd===password){
            return ob;
        }
    }
    return null
}