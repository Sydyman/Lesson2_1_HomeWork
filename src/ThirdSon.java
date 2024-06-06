public class ThirdSon extends Father{
    private String hobby;

    public ThirdSon(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void print() {
        System.out.println("Name : " + getName() + " Age : " + getAge() + " Hobby : " + getHobby());
    }
}
