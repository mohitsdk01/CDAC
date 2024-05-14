// 18. Create the HTML form given below. Use JS to manipulate strings. Display the output below the button

// • 1st radio button : search the given sub string (second text box) in main string (first text box)
// • 2nd & 3rd radio button: convert one of the strings to upper/lower case
// • 4th radio button : trim spaces around first string
// • 5th radio button : concatenate strings in first and 2nd text boxes
// • 6th radio button : do as shown

$(document).ready(function(){
    
    function searchSubstring(){
        let str = $('#str').val().trim();
        let substr = $('#substr').val().trim();

        if(str.includes(substr)){
            alert(`${substr} is present!`);
        }
        else{
            alert(`${substr} is not present!`);
        }
    }

    function upperString(){
        let str = $('#str').val().trim();
        console.log(str.toUpperCase());
    }

    function lowerString(){

    }

    function trimStr(){

    }

    function concatStr(){

    }

    function replaceStr(){

    }

    $('#btn').click(function(){
        switch($('#main').val()){
            case '[name="Search"]': searchSubstring();
            case 'Upper' : upperString();
            case 'Lower' : lowerString();
            case 'Trim' : trimStr();
            case 'Concat' : concatStr();
            case 'Replace' :replaceStr();
            default : alert('Wrong Choice');
        }
    })
})
'[name="area"]'