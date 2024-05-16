const user = {
    username:"Mohit",
    price: 999,

    welcome: () =>{
        console.log(this.username)
    }
}

// console.log(user.welcome());


function fun(){
    console.log(this);
}
fun()
// console.log(this);