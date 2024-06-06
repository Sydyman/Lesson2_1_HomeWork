public class Main {
    public static void main(String[] args) {
        Printable obj1 = createObject("Child1");
        Printable obj2 = createObject("Child2");
        Printable obj3 = createObject("Child3");
        Printable[] objects = {obj1, obj2, obj3};


        for (Printable obj : objects) {
            obj.print();
        }

    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Child1":
                return new FirstSon("Jack", 30, "Bmw");
            case "Child2":
                return new SecondSon("Dempsey", 26, "Manager");
            case "Child3":
                return new ThirdSon("Junior", 20, "MMA");
            default:
                return null;
        }
    }
}