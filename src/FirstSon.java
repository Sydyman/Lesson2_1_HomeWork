public class FirstSon extends Father{
    private String car;


    public FirstSon(String name, int age, String car) {
        super(name, age);
        this.car = car;
    }



    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public void print() {
        System.out.println("Name : " + getName() + "Age : " + getAge() + " Car : " + getCar());
    }
}
