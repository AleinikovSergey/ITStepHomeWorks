public class Cat extends Animal {

    public Cat(int age, double weight, String color, String status) {
        super(age, weight, color, status);
    }

    @Override
    public void animalInfo(){
        System.out.println("Кошка: ");
        super.animalInfo();
        System.out.println (" ");

    }
}
