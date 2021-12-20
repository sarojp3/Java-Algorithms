// Inheritance means extending the properties of child class with their parent class.
// Inheriting class can access(public and protected only, not private) attributes and methods of parent class.

class Bird{
    protected String motionBird; //Only the inheriting class can access this attribute.
    public String reproduction = "egg";
    public String outerCovering = "feather";

    public void getFeatures(){
        System.out.println("Reproduction: " + reproduction);
        System.out.println("Outer Covering: " + outerCovering);
    }

}
//Inheriting the properties of class Bird
class Animal extends  Bird {
    private String name;
    private String motionAnimal;
    private double averageWeight;
    private int numberOfLegs;

    //Getter Methods
    public String getName(){
        return name;
    }

    public double getAverageWeight(){
        return averageWeight;
    }

    public int getNumberOfLegs(){
        return numberOfLegs;
    }

    public String getMotionBird(){
        return motionBird;
    }
    public String getMotionAnimal(){
        return motionAnimal;
    }

    //Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setAverageWeight(double weight){
        this.averageWeight = weight;
    }
    public void setNumberOfLegs(int legs){
        this.numberOfLegs = legs;
    }
    public void setMotionAnimal(String mA){
        this.motionAnimal = mA;
    }
    public void setMotionBird(String mB){
        this.motionBird = mB;
    }


}

public class TestAnimal{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        myAnimal.setName("Dog");
        myAnimal.setAverageWeight(20.67);
        myAnimal.setNumberOfLegs(4);
        myAnimal.setMotionAnimal("walk");

        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average Weight: " + myAnimal.getAverageWeight() + "kg");
        System.out.println("Number of Legs: " + myAnimal.getNumberOfLegs());
        System.out.println("Motion: " + myAnimal.getMotionAnimal());
        System.out.println();

        myAnimal.setName("Eagle");
        myAnimal.setNumberOfLegs(2);
        myAnimal.setAverageWeight(1.5);
        myAnimal.setMotionBird("fly");

        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average Weight: " + myAnimal.getAverageWeight() + "kg");
        System.out.println("Number of Legs: " + myAnimal.getNumberOfLegs());
        System.out.println("Motion: " + myAnimal.getMotionBird());

        myAnimal.getFeatures();
    }
}
