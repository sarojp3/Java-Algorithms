//Polymorphism means having many forms. This means different classes related to each other(through inheritance)
//shares same method name. In java, we achieve polymorphism in two ways:
// i. either by defining same function name but different number/type of parameters (Static Polymorphism) Or,
// ii. by creating the instances(using grandparent class) of each classes and accessing the methods. (Dynamic Polymorphism)

class Creature{
    public void soundAnimal(){
        System.out.println("The creature makes the sound.");
    }

}

class Pig extends Creature{
    public void soundAnimal(){
        System.out.println("The pig makes wee!! wee!! sound.");
    }

}

class Dog extends Creature{
    public void soundAnimal(){
        System.out.println("The dog makes bow!! bow!! sound.");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Creature myCreature = new Creature();
        Creature myPig = new Pig();
        Creature myDog = new Dog();

        myCreature.soundAnimal();
        myPig.soundAnimal();
        myDog.soundAnimal();

    }
}
