/**
 * Created by johndavid on 2/21/17.
 */
public class MagicUserCharacter extends GameCharacter {

    private int mana;

    public MagicUserCharacter(String name, int str, int intelligence, int mana) {
        super(name, str, intelligence);
        this.mana = mana;

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void play(){
        super.play();
        System.out.println("Mana: "+ mana);
    }
}
