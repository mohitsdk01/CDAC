// Calling JSON API using AJAX

$(document).ready(function(){
    function showData(result){
        var str = "<table border='2'><tr><th>userId</th><th>id</th><th>title</th><th>completed</th></tr>"
        for(let i in result){
            str += `<tr><td>${i.userid}</td><td>${i.id}</td><td>${i.title}</td><td>${i.completed}</td></tr>`
        }
        str += "</table>"
        $('#div').html(str);
    };
    $('#btn').click(function(){
        $.ajax({
            url: "https://jsonplaceholder.typicode.com/todos",
            type:'GET',
            async:true,
            succes:function(result){
                console.log(result);
                showData(result.json());
            },
            error: function(err){
                console.log(err);
            }
        })
    })
});
// not working properly