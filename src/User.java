public class User {
    private int age;
    private String name;

    private User(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public static User createUser(String name, int age) {
        return new User(name, age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
