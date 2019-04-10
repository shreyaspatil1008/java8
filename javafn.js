var MyClassImpl = Java.type('nashorn.MyClass');
var greeting = MyClassImpl.sayHello("riya");
print (greeting);


var myClassObj = new MyClassImpl();
var sum = myClassObj.doAdd(10,20);
print(sum);