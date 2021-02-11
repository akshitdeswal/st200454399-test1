public class Pet {
    private String name;
    private String type;
    private int age;
    private String color;

    public Pet(String name,String type,int age, String color){
        setName(name);
        setType(type);
        setAge(age);
        setColor(color);
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

}
