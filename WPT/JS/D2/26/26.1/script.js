

$(document).ready(function(){
    $('#btn').click(function(){
        var name = $('#name').val();
        var birthDate = $('#date').val();
        var email = $('#email').val();
        // var name = $('#name').val();
        var selectedGender = $('input[type="gender"]:checked').val();
        var luckyNumber = $('#luckynumber').val();
        var selectedFood = new Array();
        $('input[name="box"]:checked').each(function(){
            selectedFood.push(this.value);
        })

        $('#result').html(`Name: ${name}<br> Birth Data: ${birthDate}<br> Email: ${email}<br> Gender: ${selectedGender}<br> Lucky Number: ${luckyNumber}<br> List of Fav Food: ${showFood(selectedFood)}`)
    })

    function showFood(selectedFood){
        var str = ""
        for(let i in selectedFood){
            str += `${selectedFood[i].toUpperCase()}, `;
        }
        return str;
    }
    // function showGender(){

    // }
})
// var selectedLanguage = new Array();
// 		$('input[name="language"]:checked').each(function() {
// 			selectedLanguage.push(this.value);
//         })

// $.each(fruitsArray, function(index, value){
//     $("#result").append(index + ": " + value + '<br>');
// })