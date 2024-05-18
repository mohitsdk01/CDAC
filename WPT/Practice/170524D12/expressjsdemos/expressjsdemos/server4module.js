exports.addition=function(a,b){
    return a+b;
}

exports.factorial=function(n){
    var f=1
    for(var i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}

exports.printTable = function(n){
    str += "<table>"
    for(let i in n){
        str+=`<tr><td></td><td></td><td></td></tr>`
    }
}