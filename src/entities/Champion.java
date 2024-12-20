package entities;

public class Champion {
    private String name;
    private Integer life;
    private Integer attack;
    private Integer armor;

    public Champion() {
    }

    public Champion(String name, Integer life, Integer attack, Integer armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion champion) {
        int damage = 0;

        if(this.getArmor() >= champion.getAttack()){
            damage = 1;
        } else {
            damage = champion.getAttack() - this.getArmor();
        }

        this.setLife(this.getLife() - damage);
    }

    public String status() {
        if (this.getLife() <= 0) {
            return this.getName() + ": 0 de vida (morreu)";
        } else {
            return this.getName() + ": " + this.getLife() + " de vida";
        }
    }
}
