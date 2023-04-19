import { ItemEntity } from "./item.entity";
import { Component } from "@angular/core";

@Component({
    selector:"itemList",
    templateUrl:"./itemList.html"
})
export class ItemListComponent{
    public items:Array<ItemEntity>;
    constructor(){
        var itemOne:ItemEntity= new ItemEntity("keyboard",10,"to enter words into the computer");
        var itemTwo:ItemEntity= new ItemEntity("mouse",15, "to move the mouse pointer");
        var itemThree:ItemEntity= new ItemEntity("monitor",20,"to see the display");
        var itemFour:ItemEntity = new ItemEntity("Ethernet",100,"To access the internet");
        var itemFive:ItemEntity = new ItemEntity("EarPhones", 20, "To listen to audio");
        
        
        this.items=[itemOne, itemTwo, itemThree,itemFour,itemFive];
    }
}