"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Triangle = exports.Rectangle = void 0;
var Rectangle = /** @class */ (function () {
    function Rectangle(side, width) {
        this.side = side;
        this.width = width;
        this.areaOfRectangle(this.side, this.width);
    }
    Rectangle.prototype.areaOfRectangle = function (side, width) {
        //console.log(side*width);
        return side * width;
    };
    return Rectangle;
}());
exports.Rectangle = Rectangle;
var Triangle = /** @class */ (function () {
    function Triangle(a, b, c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.areaOfTriangle(this.a, this.b, this.c);
    }
    Triangle.prototype.areaOfTriangle = function (a, b, c) {
        var s = (a + b + c) / 2;
        //console.log(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    };
    return Triangle;
}());
exports.Triangle = Triangle;
