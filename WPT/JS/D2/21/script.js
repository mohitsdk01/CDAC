
var arr = ['John', 'Steve', 'Ben', 'Damon', 'Ian']
$(function(){
    var str = "<ol>"
    for(let i in arr){
        str += `<li>${arr[i]}</li> `;
    }
    str += "</ol>";

    $('#list').html(str);
})