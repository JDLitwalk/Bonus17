import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList  <GameCharacter> GameCharacters = new ArrayList<>();

        GameCharacters.add(new Warrior("Oloff",87,47,"Axe"));
        GameCharacters.add(new Warrior("Stinnger",68,56,"bow"));
        GameCharacters.add(new Warrior("Dain",79,53,"Sword"));
        GameCharacters.add( new Wizard("neee",55,88,45,55));
        GameCharacters.add(new Wizard("rhinheart",3,99,98,40));

        for (GameCharacter GC: GameCharacters){
            GC.play();
        }


    }
}
