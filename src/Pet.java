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

    public void setColor(String color) {
        List<String> validColors = Arrays.asList("yellow", "brown", "black", "blue", "red", "white", "grey");
        if(validColors.contains(color))
            this.color = color;
        else
            throw new IllegalArgumentException(color+ "is not valid, please chooe from: "+validColors);
    }

    public String speak(){
        String petTalk = new String();
        if(type.equals("dog"))
            petTalk = "woof woof";
        else if(type.equals("cat"))
            petTalk ="meow meow";
        else if(type.equals("bird"))
            petTalk = "chirp chirp";
        else if(type.equals("reptile"))
            petTalk = "hiss";
        else if(type.equals("fish"))
            petTalk = "swimming sound";

        return petTalk;
    }

    public String movesBy(){
        String petMoves = new String();
        if(type.equals("dog"))
            petMoves = "walks or runs";
        else if(type.equals("cat"))
            petMoves ="walks or runs";
        else if(type.equals("bird"))
            petMoves = "flies";
        else if(type.equals("reptile"))
            petMoves = "slither or walk";
        else if(type.equals("fish"))
            petMoves = "swim";

        return petMoves;
    }
    public static boolean hasfur;
    public boolean hasFur(){
        if(type.equals("dog"))
            hasfur = true;
        else if(type.equals("cat"))
            hasfur =true;
        else if(type.equals("bird"))
            hasfur =false;
        else if(type.equals("reptile"))
            hasfur = false;
        else if(type.equals("fish"))
            hasfur =false;
        return hasfur;
    }

//    “[name] is a [age] year old [colour][type]”

    public String toString(){
        return name+ "is a "+ age + "year old" + color + type;
    }

}
