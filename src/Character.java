public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    Character(String name){
        characterName = name;
    }

    /**
     * displayName Method:
     * Method that displays the name of the Character
     * @param newCharName
     */
    public void displayName(String newCharName){
        System.out.println("Character Initialized: " + newCharName);
    }

    /**
     * damageTarget Method:
     * Method to damage Target Character
     * @param enemyCharacter
     * @param damagePoints
     */
    public void damageTarget(Character enemyCharacter, int damagePoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        /**
         * Displays the enemy's current HP after the deduction
         */
        System.out.println(enemyCharacter.characterName + " HP Left = " + enemyCharacter.healthPoints);
        if (enemyCharacter.healthPoints <= 0) {
            /**
             * Displays the character who lost if HP falls below or equal to 0
             */
            System.out.println("\nCharacter " + enemyCharacter.characterName + " has been defeated.");
            /**
             * Calls the levelUp Method for the character that won
             */
            levelUp();
        }
    }

    /**
     * levelUp Method:
     * Increases the winner's level by 10
     * Displays the winner's current level after winning
     */
    public void levelUp(){
        level += 10;
        System.out.println("Character " + characterName + " won. (Level +10)");
        System.out.println("Character " + characterName + " Level = " + level);
    }

    /**
     * characterStats method:
     * Displays both the characters' HP and mana
     * @param enemyCharacter
     */
    public void characterStats(Character enemyCharacter){
        System.out.println(characterName + " Mana Left = " + manaPoints);
        System.out.println(characterName + " HP Left = " + healthPoints);
        System.out.println(enemyCharacter.characterName + " Mana Left = " + enemyCharacter.manaPoints);
    }
}
