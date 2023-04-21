import { Component, OnInit } from '@angular/core';

import { FormControl } from "@angular/forms";
import { User } from '../user';
import { UserService } from '../user.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit{
  user:User = new User(0,"",0,0);

  constructor(private userService:UserService){
  }
  ngOnInit(): void {
  }
  onSubmitPost(event:any,name:any,age:any,salary:any){
    this.user.name = name;
    this.user.age = age;
    this.user.salary = salary;
    this.userService.postUser(this.user).subscribe((data:User)=>{
      console.log(data);
      this.user=data;
    })
    window.location.reload();

  }
  refresh(event:any){
    window.location.reload();
  }

}
