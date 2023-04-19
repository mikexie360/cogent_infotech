import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ItemComponent } from './item.component';
import { ItemListComponent } from './itemList.component';
import { DepositComponent } from './deposit.component';
import { AccountComponent } from './account.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatProgressBarModule } from '@angular/material/progress-bar';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent, ItemComponent, ItemListComponent,
    DepositComponent, AccountComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,MatSlideToggleModule,MatProgressBarModule
    ,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
