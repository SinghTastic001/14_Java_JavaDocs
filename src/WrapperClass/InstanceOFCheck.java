package WrapperClass;

class Animal {
    // Some code related to Animal class
}

class Dog extends Animal {
    // Some code related to Dog class
}

public class InstanceOFCheck {
	
	public static void main(String[] args) {
        Animal animal = new Dog();

        // Using instanceof to check if the object is an instance of a class
        if (animal instanceof Animal) {
            System.out.println("The object is a Dog.");
        } else {
            System.out.println("The object is not a Dog.");
        }
    }

}
