public class Dog extends Animal {

    public Dog(int age, double weight, String color, String status) {
        super(age, weight, color, status);
    }

    @Override
    public void animalInfo() {
        System.out.println ("Собака: ");
        super.animalInfo();
        System.out.println (" ");

    }
}
