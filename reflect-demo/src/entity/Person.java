package entity;

public class Person extends Animal {
    public String name;

    public Person(String name,int id){
        super(id);
        this.name = name;
    }
}
