

### js基础

* javascript变量以及类型

弱语言。

symbol， bitInt。

script中所有的函数的参数都是按值传递的。



每个从Symbol()返回的symbol值都是唯一的。一个Symbol值能作为对象属性的标识符。这是该数据类型仅有的目的

Symbol.for(key)

不能用new 创建Symbol

不可枚举性

应用场景：1 防止Xss在React中 2.私有属性 3防止属性污染

Number 遵循IEEE 754标准，使用64位固定长度表示。

Javascript使用的是64位双精度浮点数编码，它的符号位占一位，指数占11位，尾数占52位。

尾数存储52位数字，而十进制小数的二进制表示大多是无限循环的。所以必然会造成精度的丢失。





* 包装类型  拆箱装箱

  布尔类

  数字类

  String



* typeof

  判断不出对象

* instanceof

  ```javascript
  [] instanceof Array
  new Date() instanceof Date
  new RegExp() instanceof RegExp 
  ```

  `[] instanceof Array`实际上是判断`Array.prototype`是否在`[]`的原型链上.所以一般不用来判断数据类型。

* ![Screen Shot 2020-11-29 at 6.19.06 PM](/Users/apeng/Library/Application Support/typora-user-images/Screen Shot 2020-11-29 at 6.19.06 PM.png)









1. 原型链的理解

   原型是用来实现继承的。每一个对象和函数都有一个______proto______属性指向他们构造函数的prototype

   函数还有一个显式的protoType指向原型

2. 在js中，查找一个对象的属性和方法会去该实例对象上找，如果没有找到则会去他的______prototype_______中寻找，这就是原型链