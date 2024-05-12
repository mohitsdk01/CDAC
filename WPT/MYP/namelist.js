var arr = ["Mohit", "Pratik", "Linay"]

function addname(ev){
    ev.preventDefault();
    var name = document.getElementById("name").value;
    arr.push(name);
    document.getElementById("name").value = "";
    displayList();
}

function deleteName(ev){
    ev.preventDefault();
    var name = document.getElementById("name").value;
    var pos = arr.indexOf(name);
    if(pos === -1) alert("Not Found");
    arr.splice(pos, 1);
    document.getElementById("name").value = "";
    displayList();
}

function searchName(ev){
    ev.preventDefault();
    var name = document.getElementById("name").value;
    var pos = arr.indexOf(name);
    if(pos === -1) alert("Not Found");
    alert(`The ${name} is on ${pos}`);
}

function displayList(){
    var str = "<ul>";
    for(var p of arr){
        str += `<li>${p}</li>`
    }
    str += "</u>";
    console.log(str);
    document.getElementById("res").innerHTML = str;
}