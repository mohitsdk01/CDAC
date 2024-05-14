function findResult(event){
    // alert('here')
    event.preventDefault();
    let num1 = parseInt(document.getElementById('num1').value);
    let num2 = parseInt(document.getElementById('num2').value);

    var uSelectedIndex = document.getElementById("ops").selectedIndex;
    var uSelectedName = document.getElementById("ops").options;
    
    // alert(uSelectedName[uSelectedIndex].text);
    let result;
    if(uSelectedName[uSelectedIndex].text === '+'){
        document.getElementById('res').innerHTML = `Sum is: ${num1 + num2}`;
    }
    else if(uSelectedName[uSelectedIndex].text === '-'){
        document.getElementById('res').innerHTML = `Subtraction is: ${num1 - num2}`;
    }
    else if(uSelectedName[uSelectedIndex].text === '*'){
        document.getElementById('res').innerHTML = `Product is: ${num1 * num2}`;
    }
    else{
        document.getElementById('res').innerHTML = `Division is: ${num1 / num2}`;
    }
    document.getElementById('num1').value = "";
    document.getElementById('num2').value = "";
    // return;
}