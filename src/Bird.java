public class Bird extends Animal{
    private boolean flying;

    public Bird(int age, double weight, String color, String status, boolean flying) {
        super(age, weight, color, status);
        this.flying=flying;
    }

    @Override
    public void animalInfo() {
        System.out.println("Птица: ");
        super.animalInfo();
        System.out.print(" - "+flying);
        System.out.println (" ");

    }
}