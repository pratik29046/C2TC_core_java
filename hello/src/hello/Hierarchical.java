package hello;

class Animals{
	void eat(){System.out.println("eating");
	}  
} 

	class Dog extends Animals{  
	void bark(){System.out.println("barking");
	}  
}  
	class Cat extends Animals{  
	void meow(){System.out.println("meowing");
	}  
} 


public class Hierarchical {

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.meow();
		c.eat();
		
		Dog d=new Dog();
		d.bark();
		c.eat();
		
	}

}
