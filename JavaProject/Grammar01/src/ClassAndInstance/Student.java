package ClassAndInstance;

public class Student {

    private int num;
    private int age;
    private boolean sex;
    private String name;
    private Address address;
    public static final String UNI_NAME = "Uni Stuttgart";

    //Constructor with parameter
    public Student(String user, int num, int age, boolean sex, String name, Address address) {
        System.out.println("Object --> "+ user +" as Student created successfully");
        this.num = num;
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.address = address;
        this.studentInfoPrint();
    }
    //Constructor with no parameter
    public Student() {
        this("NULL",0,0,false,"NULL",new Address());
    }

    //Setters and Getters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void studentInfoPrint(){
        System.out.print("Num: " + this.getNum() + "\t");
        System.out.print("Age: " + this.getAge()+ "\t");
        System.out.print("Sex: " + this.getSex()+ "\t");
        System.out.print("Name: " + this.getName()+ "\t");
        System.out.print("City: " + this.getAddress().getCity()+ "\t");
        System.out.print("Street: " + this.getAddress().getStreet()+ "\t");
        System.out.println("Room: " + this.getAddress().getRoom()+ "\n");
    }
}


class Address {

    private String city;
    private String street;
    private int room;

    public Address(String city, String street, int room) {
        this.city = city;
        this.street = street;
        this.room = room;
    }

    public Address() {
        this("NULL","NULL",0);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}


interface MyMath {

    double PI = 3.1415926;
    int sum (int a, int b);

}

class MyMathImpl implements MyMath{
    //必须重写抽象类/接口中的抽象方法

    public int sum(int a, int b) {
        return a + b;
    }
}