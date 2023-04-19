import {Injectable} from '@angular/core';

@Injectable({
    providedIn:'root'
})

export class AppService{


    constructor(){

    }

    getData(){

        return this.getProduct();
    }
    getProduct(){
        return[
          { 'id' : 1,'title':"screwdriver",'price':400,"stock":10},
          { 'id' : 2,'title':"nut bolt",'price':300,"stock":100},
          { 'id' : 3,'title':"register",'price':200,"stock":200},
          { 'id' : 4,'title':"tractor",'price':100,"stock":300},
          { 'id' : 5,'title':"roller",'price':10,"stock":400},
          { 'id' : 6,'title':"keyboard",'price':50,"stock":400},
          { 'id' : 7,'title':"mouse",'price':30,"stock":400},
          { 'id' : 8,'title':"earphones",'price':5,"stock":400},
          { 'id' : 9,'title':"monitor",'price':101,"stock":400},
          { 'id' : 10,'title':"charger",'price':99,"stock":400},
    
        ]
      }
}



