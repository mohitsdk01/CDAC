// module.exports = "hello world"

/*module.exports = */ function addition(a, b){
    return a+b;
}

function subtract(a, b){
    return a-b;
}

// exporting the modules/ functions (simply say made public them)--> prefferd (making object of exports and exporting required modules)
module.exports = { 
    add :addition, // we also can define properties to the exporting modules.
    sub :subtract
}

// another way to export (but if I export like this then it will override sub over addition fun) (barely recommended)
// module.exports = addition // directly by exports object (for one time use)
// module.exports = sub;


// Another way to export the functions (anynomously)
// exports.add1 = (a,b) => a+b;
// exports.sub1 = (a,b) => a-b;

