import { Component } from "@angular/core";

@Component({
    selector: "account",
    templateUrl: "./account.component.html"
})
// the parent
export class AccountComponent{
    accountNumber:number = 0;

    updateAccount(deposit:string){
        this.accountNumber += Number(deposit);
    }
}