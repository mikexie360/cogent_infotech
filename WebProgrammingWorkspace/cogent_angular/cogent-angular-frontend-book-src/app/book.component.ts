import { Component, OnInit } from "@angular/core";
import { Book } from "./book";
import { BookService } from "./book.service";

@Component({
    selector:"app-book",
    templateUrl:"./book.component.html"
})

export class BookComponent implements OnInit{
    books:Book[];
    constructor(private bookService:BookService){
        this.books=[];
    }

    ngOnInit(): void {
        this.bookService.getBooks().subscribe((data:Book[])=>{
            console.log(data);
            this.books=data;
        })
    }

}