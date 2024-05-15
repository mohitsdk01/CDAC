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
        alert(str.toUpperCase());
    }

    function lowerString(){
        let str = $('#str').val().trim();
        alert(str.toLowerCase());
    }

    function trimStr(){
        let str = $('#str').val().trim();
        alert($.trim(str));
    }

    function concatStr(){
        let str = $('#str').val().trim();
        let str2 = $('#substr').val();
        alert(str.concat(str2));
    }

    function replaceStr(){
        // let str = $('#str').val();
        // let str2 = $('#rstr').val();
        let res = str.replace("Mohit", "Mohi");
        alert(res);
    }

    $('#btn').click(function(){
        // debugger
            var selected = $('input[type="radio"]:checked').val();
            switch(selected){
                case "Search":
                    searchSubstring();
                    break;
                case "Upper":
                    upperString();
                    break;
                case "Lower":
                    lowerString();
                    break;
                case "Trim":
                    trimStr();
                    break;
                case "Concat":
                    concatStr();
                case "Replace":
                    replaceStr();
                    break;
                default:
                    console.log("No option selected");
            }
        // })
    })
});

// $(document).ready(function() {
//     $("#myForm").change(function() {
//       var selectedValue = $("input[name='choice']:checked").val();
  
//       switch (selectedValue) {
//         case "option1":
//           console.log("Option 1 selected");
//           break;
//         case "option2":
//           console.log("Option 2 selected");
//           break;
//         default:
//           console.log("No option selected");
//       }
//     });
//   });
  
  