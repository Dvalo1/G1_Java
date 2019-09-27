package BTU_company;

public class TestClass {
    String name;
    public String lastName;
    private int age;

    public void setAge(int _age) {
        age = _age;
    }

    public void printNameAndLastname() {
        System.out.println(name + " " + lastName + " " + age);
    }

    public int returnAfterYears() {
        return age + 4;
    }

}
