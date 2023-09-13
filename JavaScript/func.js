function add(a,b,c){
    let d = a+b+c;
    return d;
}


// console.log("the sum is:" + add(1,2,3));



// ------------------------------------------------------------------

function SI(p,r,t){     //Function to calculate SI
    return (p*r*t)/100;
}

let si_a=SI(100,4.4,2); //SI for person A
let si_b=SI(180,5.4,4); //SI for person B

// console.log("SI A is: "+si_a);
// console.log("SI B is: "+si_b);
// console.log("SI A and B is: "+(si_a+si_b)); //Total SI
// console.log("SI A and B is: "+(SI(100,4.4,2)+SI(180,5.4,4))); //Total SI

// -----------------------------------------------------------------------

function add(){
    let sum=0;
    for(let i=0;i<arguments.length;i++){
        sum+=arguments[i];
    }
    console.log(sum);
}

// add(1,2,3);
// add(1,2,3,4,5,3);
// add(1,2,3.1,2);

// Function expresssion

let addfunc = function(a,b,c){
    let d = a+b+c;
    return d;
}
// console.log(addfunc(1,2,3));

// -----------------------------------------------------------------------

//Arrow Function
let sumfunc = (a,b,c) => console.log(a+b+c);
sumfunc(1,2,3);

