"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = exports.age = void 0;
exports.age = 20;
var Employee = /** @class */ (function () {
    function Employee(name, code) {
        this.empName = name;
        this.empCode = code;
    }
    Employee.prototype.displayEmployee = function () {
        console.log("employee code: " + this.empCode + " Employee name: " + this.empName);
    };
    return Employee;
}());
exports.Employee = Employee;
