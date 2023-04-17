class Employee{
    name:string;
    salary:number;
    showInfo():string{
        return `Employee name: ${this.name}
        Employee Salary: ${this.salary}`;
    }


}

var emp = new Employee();
emp.name = "mike";
emp.salary = 100;
console.log(emp.showInfo());