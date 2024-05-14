$(document).ready(function(){
    // alert("here")
    $('#cmpbtn').click(function(event){
        event.preventDefault();
        let p = parseInt($('#principle').val());
        let r = parseInt($('#rate').val());
        let n = parseInt($('#period').val());

        var cmpInterest = p * Math.pow(1 + (r/100), n);
        var interest = cmpInterest - p;


        $('#res').html($('#res').html()+` Compound Interest is: ${interest}`);        
    })
})