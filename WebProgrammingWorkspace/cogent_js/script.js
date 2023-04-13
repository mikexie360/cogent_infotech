// var bookId = 5001;
// var bookName= "java Jumpstart";
// var bookPrice=5.0;
// class Book{
//     constructor(id, name, price){
//         this.id = id;
//         this.name = name;
//         this.price = price;
//     }
// }
// book = new Book(5002,"Cpp", 10.5);
// document.write("<center><font size=5 color=blue>book ID: " + book.id) ;
// document.write("<br>Book Name: " + book.name);
// document.write("<br>Book price: "+ book.price + "</font></center>");

// var global="cogent Infotech";
// function f1(){
//     var x=10;
//     var y=20;
//     document.write("x is: " +x);
//     document.write("y is: " + y);
//     document.write("global is: " + global);
// }

// function f2(){
//     var a = 500;
//     var b = 600;
//     document.write("a is: " +a);
//     document.write("b is: " + b);
//     document.write("global is: " + global);
// }
// f1();
// f2();

// var age=20;
// if (age<20){
//     document.write("you are not eligible to vote");
// }
// else{
//     document.write("you are eligble to vote");
// }

// for(i=0;i<=100;i++){
//     if (i%2==0){
//         document.write(i);
//     }
// }
// var i=0;
// while(i<=100){
//     if (i%2==0){
//         document.write(i);
//     }
//     i++;
// }


// function myReverse(number){
//     document.write("the number: "+number+"<br>");
//     var temp =0;
//     while(number >0){
//         temp = (temp *10) + (number%10);
//         number = Math.floor(number / 10);
//     }
//     document.write("the reversed number: "+temp +"<br>");

// }
// myReverse(12345);

// var iResult=50;
// var result = (iResult <=20)?0:1;
// document.write("Result: " + result);
// document.write(typeof iResult);

// function book(){
//     this.name="cpp";
//     this.author="mike";
//     this.display = function(){
//         document.write(this.name + this.author);
//     }
// }

// var mybook = new book();
// book.prototype.year = "2001";
// document.write(mybook.year);
// mybook.display();

// personObj = new Object();
// personObj.firstName="Cogent";
// personObj.lastName="infotech";
// personObj.age=20;
// personObj.address="washington";
// with(personObj){
//     document.write(firstName);
//     document.write(lastName);
//     document.write(age);
//     document.write(address);
// }

// a = new Array("a","b","c","d","e","f");
// b = new Array("m","p","o","n");
// c = new Array();
// c = a.concat(0);
// document.write(c);

// numbers= new Array(10,20,30,40,50);
// for(i=0;i<numbers.length;i++){
//     document.write(numbers[i]);
// }

// arr1=new Array(10,20,30,40,50);
// arr2=new Array("a","b");
// arr3=arr1.concat(arr2);

// document.write(arr3);

// arr4 = new Array(38,390,40,1,29,37,56,74,383);
// arr4.sort();
// document.write("<br>"+arr4.sort(function(a, b){return a - b})+"<br>");

// document.write("<br>"+arr4.reverse()+"<br>");

// arr5 = new Array("d","b","e","f");

// function maxmin(arr1){
//     var max = arr1[0];
//     var min = arr1[0];

//     for (i = 0; i<arr1.length;i++){
//         if(arr1[i] > max){
//             max = arr1[i];
//         }
//         if(arr1[i]< min){
//             min= arr1[i];
//         }
//     }
//     document.write("The max is: " + max+"<br>");
//     document.write("The min is: " + min + "<br>");
// }

// maxmin([20,30,10,40,60]);

// var bird = ["bird","eagle",];
// bird.push("penguin");
// bird.shift();
// var birdstring = bird.join(", ");
// bird.pop();
// bird.unshift("flamingo", "pigeon");
// bird.sort();

// document.write(bird);

// function sum(a,b){
//     s=a+b;
//     return s;
// }
// function multiply(x,y){
//     m=x*y;
//     return m;
// }
// function divide(a,b){
//     d=a/b;
//     return d;
// }
// function subtraction(x,y){
//     d=x-y;
//     return d;
// }

// function green(){
//     document.bgColor="green";
// }
// function blue(){
//     document.bgColor="blue";
// }
// function red(){
//     document.bgColor="red";
// }
// function yellow(){
//     document.bgColor="yellow";
// }
// function white(){
//     document.bgColor="white";
// }












