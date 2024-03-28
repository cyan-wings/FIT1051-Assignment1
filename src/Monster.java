/**
 * Monster class for task 2
 * @author Matthew Yeow
 * @version JDK 21 SE
 */
public class Monster {
    private String name;
    private int attackVal;
    private int defenceVal;
    private int healthVal;

    /**
     * <p>
     *     Default class constructor.
     *     Creates a default monster.
     * </p>
     *
     * @return      Monster
     */
    public Monster() {
        setName("Mattasaur");
        setAttackVal(8);
        setDefenceVal(3);
        setHealthVal(60);
    }

    /**
     * <p>
     *     Parameterised constructor.
     *     Creates a monster with customised attributes.
     * </p>
     *
     * @param  name         name of monster
     * @param  attackVal    attack amount
     * @param  defenceVal   defence amount
     * @param  healthVal    health amount
     */
    public Monster(String name, int attackVal, int defenceVal, int healthVal) {
        setName(name);
        setAttackVal(attackVal);
        setDefenceVal(defenceVal);
        setHealthVal(healthVal);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackVal() {
        return this.attackVal;
    }

    public void setAttackVal(int attackVal) {
        if (attackVal >= 0 && attackVal <= 10) {
            this.attackVal = attackVal;
        }
        else {
            System.out.println("Attack value must be between 0 and 10");
        }
    }

    public int getDefenceVal() {
        return this.defenceVal;
    }

    public void setDefenceVal(int defenceVal) {
        if (defenceVal >= 0 && defenceVal <= 10) {
            this.defenceVal = defenceVal;
        }
        else {
            System.out.println("Defence value must be between 0 and 10");
        }
    }

    public int getHealthVal() {
        return this.healthVal;
    }

    public void setHealthVal(int healthVal) {
        if (healthVal >= 0 && healthVal <= 100) {
            this.healthVal = healthVal;
        }
        else {
            System.out.println("Health value must be between 0 and 100");
        }
    }
}