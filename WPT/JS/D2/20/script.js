// 20. Assume i have an array of member names. Read the array and display all member names as a string
// delimited by comma all in uppercase


$(function(){
    $('#btn').click(function(){
        var arr = $('#names').val().split(',');
        var str = "<p>"
        for(let i in arr){
            str += `${arr[i].toUpperCase()}, `;
        }
        str += "</p>";

        $('#res').html(str);
    })
    
})