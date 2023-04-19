import { Component } from "@angular/core";

@Component({
    selector:"item",
    templateUrl:"./item.component.html"
})

export class ItemComponent{
    itemNo:number=100;
    itemName:string="car";
    itemPrice:number= 10.5;
    itemDescription:string="lightly used";
}

// var item1 = new ItemComponent();
// item1.itemNo = 1;
// item1.itemName = "bike"
// item1.itemPrice =5;
// item1.itemDescription = "a bike";
// export item1;
