package jr.dinamic_proxies;

public class Man implements Person {
    private String name;
    private int age;
    private String city;
    private String country;

    public Man(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void introduce(String name) {
        System.out.println("My name is " + this.name);
    }

    @Override
    public void sayAge(int age) {
        System.out.println("I am " + this.age);
    }

    @Override
    public void sayFrom(String city, String country) {
        System.out.println("I am from " + this.city + ", " + this.country);
    }

}
