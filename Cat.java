package homework1;

public class Cat {

    private String name;
    private double age;
    private double weight;
    private String color;
    private String breed;
    private String temper = "not specified";


    public Cat(String name, double age, double weight, String color, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.breed = breed;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTemper() {
        return temper;
    }

    public String catTemper(int sleepOurs) {
        if (sleepOurs <= 2) {
            temper = "active";
        } else if (sleepOurs > 2 && sleepOurs <= 4) {
            temper = "normal";
        } else {
            temper = "lazy";
        }
        return temper;
    }
    public void meow(){
        System.out.println("MEOW!!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", temper='" + temper + '\'' +
                '}';
    }
}
