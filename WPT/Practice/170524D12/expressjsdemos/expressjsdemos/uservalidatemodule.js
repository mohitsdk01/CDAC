var arr=[{uname:'user1',passwd:'pass1'},{uname:'user2',passwd:'pass2'}]
exports.validate_user=function(username,password){
    var ob=arr.find(ob=>ob.uname===username && ob.passwd===password );
    if(ob!==undefined)
        return ob;
    return null
}