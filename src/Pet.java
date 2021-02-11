import java.util.Arrays;
import java.util.List;

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

    public void setName(String name) {
        if (name.length() >= 2)
            this.name = name;
        else
            throw new IllegalArgumentException("name must contain at least 2 characters");
    }

    public void setType(String type) {
        List<String> validTypes =Arrays.asList("dog", "cat", "bird", "reptile", "fish");
        if(validTypes.contains(type))
            this.type = type;
        else
            throw new IllegalArgumentException(type+ " is an invalid input, please choose from these options: "+validTypes);
    }

    public void setAge(int age) {
        if(age<60 && age>0)
            this.age = age;
        else
            throw new IllegalArgumentException(age+" is not a valid input, please select age between 0-60 years");
    }
}
