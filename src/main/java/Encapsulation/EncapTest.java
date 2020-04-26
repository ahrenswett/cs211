package Encapsulation;

public class EncapTest {

    private String name;
    private String id;
    private int age;

    public EncapTest(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
