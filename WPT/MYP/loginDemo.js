function validateuser(ev){
    console.log(ev);
    ev.preventDefault();
    var name = document.getElementById("nm").value;
    var pass = document.getElementById("pass").value;
    if(name === "admin" && pass === "admin"){
        document.getElementById("mydiv").innerHTML="valid user"
    }else{
        document.getElementById("mydiv").innerHTML="wrong credentials"
    }
}