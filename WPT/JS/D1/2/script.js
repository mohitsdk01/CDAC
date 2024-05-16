// 2. Accept an integer value and a message from user and print the message that many number oftimes.
function showMsg(){
    var num=document.getElementById("num").value;
    var msg=document.getElementById("msg").value;
    var loop  = ""
    for(var i=0;i<num;i++)
        {
            // printarr[i] = msg;
            // myHTML += '<div class="test">Testing out my script! loop #' + (i + 1) + '</div><br/><br/>';
            loop += "<div>"+msg+"</div>" ;
        }
        document.getElementById("res").innerHTML = loop;
}