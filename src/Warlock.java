public class Warlock extends Character {
    Warlock(String name){
        super(name);
    }

    /**
     * fireDagger Method:
     * First warlock damage spell
     * Decreases the enemy's HP by 30
     * Costs 45 mana
     * Calls characterStats method and damageTarget method
     * @param enemyCharacter
     */
    public void fireDagger(Character enemyCharacter){
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Fire Dagger (Damage = 30 and Mana -45)");
        super.manaPoints -= 45;
        int damagePoints = 30;
        characterStats(enemyCharacter);
        damageTarget(enemyCharacter, damagePoints);
    }

    /**
     * combustion Method:
     * Second warlock damage spell
     * Decreases the enemy's HP by 40
     * Costs 60 mana
     * Calls characterStats method and damageTarget method
     * @param enemyCharacter
     */
    public void combustion(Character enemyCharacter){
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Combustion (Damage = 40 and Mana -60)");
        super.manaPoints -= 60;
        int damagePoints = 40;
        characterStats(enemyCharacter);
        damageTarget(enemyCharacter, damagePoints);
    }

    /**
     * breathOfFire Method:
     * Warlock recover spell
     * Increases HP by 10 and mana by 30
     * Displays character's current HP and mana after the increase
     */
    public void breathOfFire(){
        super.healthPoints += 10;
        super.manaPoints += 30;
        System.out.println("\n" + super.characterName + " activates Breath of Fire. (HP +10 and Mana +30)");
        System.out.println(super.characterName + " HP Left = " + healthPoints);
        System.out.println(super.characterName + " Mana Left = " + manaPoints);
    }
}
