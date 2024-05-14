function sumOfDigits(event){
    event.preventDefault();
    let num = parseInt(document.getElementById('num').value);
    let sum = 0;
    while(num > 0){
        let digit = parseInt(num % 10)  ;
        sum += digit;
        num = parseInt(num / 10);
    }
    document.getElementById('div').innerHTML = `Sum of Digits are: ${sum}`;
}