/**
 * Created by johndavid on 2/21/17.
 */
public class Warrior extends GameCharacter {

    private String weaponType;

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public Warrior(String name, int str, int intelligence, String weaponType) {
        super(name, str, intelligence);
        this.weaponType = weaponType;
    }


        @Override
        public void play(){
            super.play();
            System.out.println("weapon "+ weaponType);

        }



}
