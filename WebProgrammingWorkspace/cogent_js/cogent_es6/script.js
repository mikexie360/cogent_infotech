let arr=[];
for (let i=0;i<2;i++){
    arr.push(function(){return i});
}

let value=arr[1]();
document.write(value);

let getNumber = () => 42;

document.write(typeof getNumber);

let getPrice = (quantity, text) =>(quantity*5)*(1+text);
const gl=(message)=> console.log(message);

console.log(getPrice(2,0.95));

console.log(gl("hi"));

let getSum2=function(a=1,b=41){
    console.log(a+b);
};

getSum2(undefined,6);
let getName=function(firstName="john",lastName="doe"){
    console.log(firstName + " " + lastName);
};

getName("jane");

let showCollections = function(id,...collections){
    console.log(collections);
}

showCollections(42,"movies","music");

let values1=[100,300,400];
let newSet=[100,...values1,500];
console.log(newSet);

let price =4.20, quantity=20;
let invoiceData={
    price,
    quantity
}
console.log(invoiceData);

let user="kevin";
console.log(`Hi ${user}!`);
document.write(`${user}`)
let save=`dsfasdfsda



fdsa`;

console.log(save);

class Car{
    constructor(brand){
        this.brand = brand;
    }

    start(){
        console.log(`${this.brand} is ready to go.`);
    }
}

const myHonda=new Car("Honda city");
myHonda.start();


