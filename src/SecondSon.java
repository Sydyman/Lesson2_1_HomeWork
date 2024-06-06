public class SecondSon extends Father{
    private String work;

    public SecondSon(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void print() {
        System.out.println("Name : " + getName() + " Age : " + getAge() + " Work : " + getWork());

    }
}
