function writeTable(event){
    // alert("here")
    event.preventDefault();
    var num = document.getElementById('num').value;
    var res = "<p>";
    for(let i=1; i<=10; i++){
        res += `${num} * ${i} = ${num * i}</p><br>`
        // alert(res);
        // document.getElementById('div').innerHTML = `<p>num * ${i} = ${res}</p><br>`;
        document.getElementById('div').innerHTML = res;
        // document.write(`num * ${i} = ${res}<br>`);
    }
}