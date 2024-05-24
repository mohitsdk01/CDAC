// 19. Write a program that accepts (from the html form) a positive integer less than 1000 and prints out the
// sum of the digits of this number.
// Enter a +ve no less than 1000: -4
// Entered number is out of range
// Enter a +ve no less than 1000: 1234
// Entered number is out of range
// Enter a +ve no less than 1000: 546
// Sum of the digits of 546 is 15

$(document).ready(function(){
    $('#btn').click(function(){
        //debugger
        var number = $('#num').val();
        if(number > 1000 || number < 0){
            $('#res').html('Entered Number is Out of Range.');
        }
        else{
            var sum = 0;
            while(number > 0){
                let digit = number % 10;
                sum += digit;
                number = parseInt(number / 10);
            }
            $('#res').html(`The sum of Digits is: ${sum}`);
        }
    })

})