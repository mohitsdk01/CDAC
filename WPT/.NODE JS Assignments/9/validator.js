
var users = [{user:'u1', pass:'p11111'}, {user:'u2', pass:'p22222'}, {user:'u3', pass:'p33333'}]

function userValidator(user, pass){
    var ob = users.find(ob=>ob.user === user && ob.pass === pass)
    if(ob !== undefined){
        return ob;
    }
    return null;
}

module.exports={
    userValidator
}
