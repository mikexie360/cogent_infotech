var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.showInfo = function () {
        return "Employee name: ".concat(this.name, "\n        Employee Salary: ").concat(this.salary);
    };
    return Employee;
}());
var emp = new Employee();
emp.name = "mike";
emp.salary = 100;
console.log(emp.showInfo());
