package Task_07;

public class Person {
    private String name,address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(){
        this.address = address;
    }
    @Override
    public String toString(){
        return name + "(" +address+ ")";
    }
}
