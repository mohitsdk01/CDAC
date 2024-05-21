// 16. Say, have an array that holds many web site names. Eg, www.google.com, www.msn.com,
// www.amazon.co.in, in.answers.yahoo.com, en.m.wikipedia.com, codehs.gitbooks.io,
// www.coderanch.com etc. Search for all sites that begin with “www” and display the total number of such
// sites. Eg for above eg, total is 4.


var url = [
    "www.google.com",
    "www.msn.com",
    "www.amazon.co.in",
    "in.answers.yahoo.com",
    "en.m.wikipedia.com",
    "codehs.gitbooks.io",
    "www.coderanch.com"
]

var count = 0;
for(let i in url)
    {
        if(url[i].startsWith("www"))
            {
                count++;
            }
        }
console.log(count);