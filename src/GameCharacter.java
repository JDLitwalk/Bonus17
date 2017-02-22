/**
 * Created by johndavid on 2/21/17.
 */
public class GameCharacter {

     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    private int str;
     private int intelligence;

    public GameCharacter(String name, int str, int intelligence) {
        this.name = name;
        this.str = str;
        this.intelligence = intelligence;
    }

    public void play(){
        System.out.println("Name: "+ name);
        System.out.println("STR: "+str);
        System.out.println("INT: "+intelligence);

    }




}
