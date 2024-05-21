$(document).ready(function(){
    // alert("here")
    var empArr = []
    $('#btn').click(function(event){
        event.preventDefault();
        addEmp();
    })

    function addEmp(){
        var name = $('#emp').val().trim();
        if(name != ''){
            empArr.push(name); 
            empArr.sort();
            displayEmp();
            $('#emp').val('');
            $('#emp').focus();
        }
    }

    function displayEmp(){
        var list = '';
        empArr.forEach(function(name){
            list += '<li>' + name + '</li>';
        });
        $('#res').html(list);
    }

    // $('#btn').keypress(function(event){
    //     if(event.which === 13) {
    //         addEmployee();
    //     }
    // });
    
})