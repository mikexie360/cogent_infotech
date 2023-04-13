class Book{
    constructor(id, name, author, price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    toString(){
        return "<br>id: "+this.id + "<br>name: " + this.name +
        "<br>author: " + this.author + "<br>price: " + this.price;
    }
    display(){
        document.write(this.toString());
    }
}

book1 = new Book(1,"java","mike",10);
book1.display();