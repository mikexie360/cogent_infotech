import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { HttpClient } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import { UserComponent } from './user.component';

@NgModule({
  declarations: [
    AppComponent,UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
