function areaOfRectangle(side:number,width:number):number{
    return side*width;
}

function areaOfTriangle(a:number,b:number,c:number):number{
    let s:number = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
console.log(areaOfRectangle(100,200));
console.log(areaOfTriangle(300,300,300));