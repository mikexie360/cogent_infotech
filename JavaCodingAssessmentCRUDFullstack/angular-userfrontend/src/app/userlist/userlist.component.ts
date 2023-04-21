import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';



@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit{
  
  showForm:boolean=false;
  myUser:User = new User(0,"",0,0);
  
  users:User[];
  constructor(private userService:UserService){
    this.users=[];
  }

  ngOnInit(): void {
      this.userService.getUsers().subscribe((data:User[])=>{
        console.log(data);
        this.users=data;
      })
  }
  remove(event:any, user:User){
      this.userService.deleteUser(user).subscribe(()=>{
    })
    window.location.reload();
  }
  editUser(user:any){
    if (this.showForm){
      this.showForm = false;
    } else{
      this.showForm=true;
    }

  }
  onSubmitPost(event:any,user:User,name:any,age:any,salary:any){
    this.myUser.id=user.id;
    this.myUser.name = name;
    this.myUser.age = age;
    this.myUser.salary = salary;
    this.userService.putUser(this.myUser).subscribe(()=>{

    })
    window.location.reload();

  }
}
