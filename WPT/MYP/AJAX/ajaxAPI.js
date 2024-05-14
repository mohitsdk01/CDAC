// function getData(){
//     var promise = fetch("https://jsonplaceholder.typicode.com/todos/1").then((req)=>{
//         if(req === 200 && req.ok){
//             console.log(req.json());
//             // return req.json();
//         }
//         else{
//             throw "error in req..."
//         }
//     }).catch((err)=>{
//         console.log(err);
//     });

//     promise.then((res)=>{
//         alert(res);
//         // displayObj(res);
//     }).catch((err)=>{
//         console.log(err);
//     })
// }

// ------------------------------------------------

// function getData(){
//     let promise = fetch('https://jsonplaceholder.typicode.com/todos')
//     .then((result)=>{
//         if(result.status===200 && result.ok){
//             console.log(result);
//             return result.json();
//         }
//         else{
//             throw "Result Not found.";
//         }
//     })
//     .catch((err)=>{
//         console.log(err);
//     });

//     promise.then((response) =>{
//         console.log(response);
//         displayTable(response);
//     })
//     .catch((err)=>{
//         console.log(err);
//     })
//     console.log("test");
// }

function displayTable(response){
    let str = "<table border = '2'><tr><th>userId</th><th>id</th><th>title</th><th>completed</th></tr>"

    for(let object of response){
        str += `<tr><td>${object.userId}</td><td>${object.id}</td><td>${object.title}</td><td>${object.completed}</td></tr>`
    }
    str += "</table>"
    document.getElementById('mytable').innerHTML = str;
}



// ------------------------------------
async function getData(){
    var urlReq = await fetch('https://jsonplaceholder.typicode.com/posts');

    if(urlReq === 200 && urlReq.ok){
        var data = await urlReq.json();
        displayTable(data);
    }
    else{
        console.log("error...")
    }
}