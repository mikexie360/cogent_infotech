export class Rectangle{
    side:number;
    width:number;
    constructor(side:number,width:number){
        this.side = side;
        this.width=width;
        this.areaOfRectangle(this.side,this.width);
    }
    areaOfRectangle(side:number,width:number):number{
        //console.log(side*width);
        return side*width;
    }
}

export class Triangle{
    a:number;
    b:number;
    c:number;
    constructor(a:number,b:number,c:number){
        this.a=a;
        this.b=b;
        this.c=c;
        this.areaOfTriangle(this.a,this.b,this.c);
    }
    areaOfTriangle(a:number,b:number,c:number):number{
        let s:number = (a+b+c)/2;
        //console.log(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}