function Student(name,age,gender){
    this.student_name = name;
    this.student_age = age;
    this.student_gender = gender;

}


obj1 = new Student('Pankaj',23,'Male');
obj2 = new Student('Reena',25,'Female');
obj3 = new Student('Rajeev',26,'Male');

console.log(obj1.student_name);
console.log(obj1.student_age);
console.log(obj1.student_gender);
console.log(obj2.student_name);
console.log(obj2.student_age);
console.log(obj2.student_gender);
console.log(obj3.student_name);
console.log(obj3.student_age);
console.log(obj3.student_gender);

Student.prototype.branch = 'CSE';
Student.prototype.college= 'ABC';

console.log(obj1.student_name);
console.log(obj1.branch);
console.log(obj1.college);
console.log(obj2.student_name);
console.log(obj2.branch);
console.log(obj2.college);
console.log(obj3.student_name);
console.log(obj3.branch);
console.log(obj3.college);
