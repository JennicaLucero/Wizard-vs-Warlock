public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }

    /**
     * airBlast Method:
     * First wizard damage spell
     * Decreases the enemy's HP by 20
     * Costs 30 mana
     * Calls characterStats method and damageTarget method
     * @param enemyCharacter
     */
    public void airBlast(Character enemyCharacter){
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Air Blast (Damage = 20 and Mana -30)");
        super.manaPoints -= 30;
        int damagePoints = 20;
        characterStats(enemyCharacter);
        damageTarget(enemyCharacter, damagePoints);
    }

    /**
     * meteorFall Method:
     * Second wizard damage spell
     * Decreases the enemy's HP by 50
     * Costs 75 mana
     * Calls characterStats method and damageTarget method
     * @param enemyCharacter
     */
    public void meteorFall (Character enemyCharacter){
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Meteor Fall (Damage = 50 and Mana -75)");
        super.manaPoints -= 75;
        int damagePoints = 50;
        characterStats(enemyCharacter);
        damageTarget(enemyCharacter, damagePoints);
    }

    /**
     * waterHealing method:
     * Wizard recover spell
     * Increases HP by 20 and mana by 40
     * Displays character's current HP and mana after the increase
     */
    public void waterHealing (){
        super.healthPoints += 20;
        super.manaPoints += 40;
        System.out.println("\n" + super.characterName + " activates Water Healing (HP +20 and Mana +40)");
        System.out.println(super.characterName + " HP Left = " + healthPoints);
        System.out.println(super.characterName + " Mana Left = " + manaPoints);
    }
}
