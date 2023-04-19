import { Component, Output,EventEmitter } from "@angular/core";

@Component({
    selector: "deposit",
    templateUrl: "./deposit.component.html"
})
// the child to account component
export class DepositComponent{


    @Output()
    depositEvent = new EventEmitter<any>();

    deposit:number=0;

    depositToAccount(myDeposit:number|undefined){
        this.depositEvent.emit(myDeposit);
    }


}