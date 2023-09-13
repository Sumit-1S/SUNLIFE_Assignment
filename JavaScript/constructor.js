function Employee(name,age,dept){
    this.name = name;
    this.age = age;
    this.dept = dept;
    this.calculate = function(){

    }
}

let a = new Employee('sumit',23,'tech');
console.log(Employee.dept);