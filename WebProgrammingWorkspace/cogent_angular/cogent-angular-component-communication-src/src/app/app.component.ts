import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';
import { PostService } from './post.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'cogent-angular-component-communication';
  products=[] as any;

  posts:any;

  data:any;
  constructor(private service:AppService, private postservice:PostService){

  }

  mytitle ="products";
  showMessage = "Cogent Infotech DHM-65 Batch";
  showMessagebool = true;

  ngOnInit(): void{
    this.products = this.getProduct();
    this.data = this.service.getData();
    this.postservice.getPost()
      .subscribe(Response=>{
        this.posts=Response
    })
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

  num:number =0;
  items: item[]=[
    {name: 'One', val:1},
    {name: 'Two', val:2},
    {name: 'Three', val:3},
    {name: 'Four', val:4},
    {name: 'Five', val:5},
  ]
  selectedValue1: string='One';
  selectedValue2: string='One';
  selectedValue3: string='One';
  selectedValue4: string='One';
  selectedValue5: string='One';

  companyName="Cogent University";
  productName="Cricket bat"
  productPrice=990;



}
class item{
  name:string = "";
  val:number =0;
}