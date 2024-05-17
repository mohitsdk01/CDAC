var buf=Buffer.alloc(256);
//write will return number of bytes written in the buffer
var lengthdata=buf.write("this is data in the buffer")
console.log("length : "+lengthdata)
console.log(buf.toString());

const b = Buffer.alloc(10).fill('a');

console.log(b.toString());
// This will print aaaaaaaaaa

//allocate memory and write data into the buffer
const buf1 = Buffer.from('this is a buffer');
//to check whether given string exists in the buffer or not
console.log(buf1.includes('this'));
// This will print true
var x=Buffer.from('a buffer example')
console.log(buf1.includes(x));
// This will print false

