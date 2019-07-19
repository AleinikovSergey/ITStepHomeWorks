public class Animal {

        private int age;
        private double weight;
        private String color;
        private String status;

        public Animal(int age, double weight, String color, String status) {
            this.age = age;
            this.weight = weight;
            this.color = color;
            this.status = status;
        }


        public int getAge (){
            return age;
        }


        public double getWeight() {
            return weight;
        }


        public String getColor (){
            return color;
        }


        public String getStatus (){
            return status;
        }


        public void animalInfo (){
            System.out.print("Возраст: "+getAge()+", вес: "+getWeight()+", окрас: "+getColor()+", сейчас: "+getStatus());

        }
    }


