

$(document).ready(function(){
    var amtOfLoan = $('#loan').val();
    var rate = $('#rate').val();
    var repayment = $('#repayment').val();
    $('#compute').click(function(){
        validations();
    })

    
    function validations(){
        if(amtOfLoan > 1500000){
            alert("Amount should be between 1 to 15Lakhs")
        }
        if((repayment < 7 || repayment > 15)){
            alert("Repayment years should be between 7 to 15 years")
        }
    }
})