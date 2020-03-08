package test.pipeline;

class Person{
	int age
	String name

	Person(String name, int age){
		this.name=name
		this.age=age
	}
	
	String getName(){
		return this.Name
	}
	
	int getAge(){
		return this.age
	}
	
	void details(){
		println "${this.name}'s age is ${this.age}"
	}
}