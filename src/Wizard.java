/**
 * Created by johndavid on 2/21/17.
 */
public class Wizard extends MagicUserCharacter {
    private int spellNumber;

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    public Wizard(String name, int str, int intelligence, int mana, int spellNumber) {
        super(name, str, intelligence, mana);
        this.spellNumber = spellNumber;

    }

    @Override
    public void play(){
        super.play();
        System.out.println("SpellNumber "+spellNumber);
    }

}
