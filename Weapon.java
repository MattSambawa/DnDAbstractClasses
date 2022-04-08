public class Weapon {

  protected String name;
  protected int damage;
  protected int range;
  protected int attackBonus;

  public Weapon(String name, int damage, int range, int attackBonus) {
    // this.name = name;
    // this.damage = damage;
    // this.range = range;
    // this.attackBonus = attackBonus;
    if(!setAll(name, damage, range, attackBonus)){
      System.out.println("ERROR: invalid data given to full Weapon constructor. Shutting down.");
      System.exit(0);
    }
  }

  public Weapon() {
    // this.name = "Knife";
    // this.damage = 0;
    // this.range = 0;
    // this.attackBonus = 0;
    this("Knife", 1, 1, 0);
  }

  public Weapon(Weapon original){
    if(original == null){
      System.out.println("ERROR: invalid data given to full Weapon constructor. Shutting down.");
      System.exit(0);
    }else{
      setAll(original.name, original.damage, original.range, original.attackBonus);
    }
  }

  public boolean setName(String name) {
    if(name != null && name.length() > 0){
      this.name = name;
      return true;
    } else {
      return false;
    }
  }

  public boolean setDamage(int damage) {
    if(damage >= 0) {
      this.damage = damage;
      return true;
    } else {
      return false;
    }
  }

  public int getDamage() {
    return damage;
  }

  public boolean setRange(int range) {
    if(range >= 1) {
      this.range = range;
      return true;
    } else {
      return false;
    }
  }

  public int getRange() {
    return range;
  }

  public boolean setAttackBonus(int attackBonus) {
    if(attackBonus >= 0) {
      this.attackBonus = attackBonus;
      return true;
    } else {
      return false;
    }
  }

  public int getattackBonus() {
    return attackBonus;
  }

  public boolean setAll(String name, int damage, int range, int attackBonus){
    return setName(name) && setDamage(damage) && setRange(range) && setAttackBonus(attackBonus);
  }

  public String toString() {
    return "Weapon stats: " + name + ", " + damage + ", " + range + ", " + attackBonus;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Weapon that = (Weapon) o;
    return this.damage == that.damage && this.range == that.range && this.attackBonus == that.attackBonus;
  }
}
