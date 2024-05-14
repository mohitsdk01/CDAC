async function getData(){ 
        var urlReq = await fetch('https://jsonplaceholder.typicode.com/posts');
    
        if(urlReq.status === 200 && urlReq.ok){
            var data = await urlReq.json();
            displayTable(data);
        }
        else{
            console.log("error...")
        }
}

function displayTable(response){
    let str = "<table border = '2'><tr><th>userId</th><th>id</th><th>title</th><th>completed</th></tr>"

    for(let object of response){
        str += `<tr><td>${object.userId}</td><td>${object.id}</td><td>${object.title}</td><td>${object.completed}</td></tr>`
    }
    str += "</table>"
    document.getElementById('mytable').innerHTML = str;
}