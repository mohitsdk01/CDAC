// 17. Create a HTML form that accepts radius and displays the area and circumference of a circle. Make use of
// Math object.
// alert("here")

$(document).ready(function(){
    
    var area = ()=>{
        let radius = $('#radius').val();
        // let radius = 12;
        return Math.PI * (radius * radius); 
    }  

    var circumference = ()=>{
        let radius = $('#radius').val();
        return 2 * Math.PI * radius;
    }

    $('#displaybtn').click(function(){
        $('#res').html(`Area of Circle is: ${area()}<br><br> Circumference of Circle is: ${circumference()}`)
    })
    
    // $("displaybtn").keypress(function(){
    //     if(event.keyCode == 13){
    //         radius.value = "";
    //     }
    //   });
    
})