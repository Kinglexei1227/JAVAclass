
class Animal {
    void sound() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("I am a dog");
    }
}


public class OOPEx {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); //"I am a dog"
    }
}
