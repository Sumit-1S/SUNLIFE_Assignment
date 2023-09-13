class vehicle{
    #capacity = 0;
    constructor(name, capacity){
        this.name = name;
        this.#capacity = capacity;
    }
    set setCapacity(capacity){
        this.#capacity = capacity;
    }
    get getCapacity(){
        return this.#capacity;
    }
    startEngine(){
        console.log(`${this.name} can start and has capacity of ${this.#capacity}`);
    }
    stopEngine(){
        console.log(`${this.name} can stop and has capacity of ${this.#capacity}`);
    }
    run(){
        console.log(`${this.name} can run on manual mode`);
    }
    static brake(){
        console.log(`we are calling a static method`);
    }
    callCapacity(){
        console.log(`${this.name} has this much ${this.#capacity} capacity`);
    }
}

class W2 extends vehicle{
    constructor(Vname, capacity, engine){
        super(Vname, capacity)
        this.tyre = 2;
        this.engine = engine;
    }
    printDetails(){
        console.log(this.name);
        console.log(this.getCapacity);
        console.log(this.tyre);
        console.log(this.engine);
    }
}
class W3 extends vehicle{
    constructor(Vname, capacity, engine){
        super(Vname, capacity)
        this.tyre = 3;
        this.engine = engine;
    }
    printDetails(){
        console.log(this.name);
        console.log(this.getCapacity);
        console.log(this.tyre);
        console.log(this.engine);
    }
}


bike = new W2('RE','4000W','3000cc');
bike.printDetails();
car = new W3('Superb','4000W','6000cc');
car.printDetails();
