import { Component } from "@angular/core";

@Component({
    selector:"product",
    templateUrl:"./product.component.html"
})

export class ProductComponent{
    productNo:number=1001;
    productName:string = "HP Laptop";
    productPrice:number =500;

}