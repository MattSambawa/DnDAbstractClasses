public abstract class GameCharacter {

  public static final String DEFAULT_NAME = "Legolas", DEFAULT_CHARCLASS = "Archer", DEFAULT_ALIGNMENT = "Neutral Good";
  public static final int DEFAULT_GOLD = 100, DEFAULT_HITPOINTS = 10, DEFAULT_ARMORCLASS = 2;
  public static final Weapon DEFAULT_WEAPON1 = new Weapon(), DEFAULT_WEAPON2 = null;
  
  private String name, charClass, alignment;
  private int gold, hitPoints, armorClass;
  private Weapon weapon1, weapon2;

  public abstract void assist(GameCharacter gc);
  public abstract boolean attack(GameCharacter gc);

  //FULL CONSTRUCTOR
  public GameCharacter(String name, String charClass, String alignment, int gold, int hitPoints, int armorClass, Weapon weapon1, Weapon weapon2) {
    if(!setAll(name, charClass, alignment, gold, hitPoints, armorClass, weapon1, weapon2)) {
      System.out.println("ERROR: invalid data given to full Weapon constructor. Shutting down.");
      System.exit(0);
    }
  }

  //DEFAULT CONSTRUCTOR
  public GameCharacter() {
    this(DEFAULT_NAME, DEFAULT_CHARCLASS, DEFAULT_ALIGNMENT, DEFAULT_GOLD, DEFAULT_HITPOINTS, DEFAULT_ARMORCLASS, DEFAULT_WEAPON1, DEFAULT_WEAPON2);
  }

  //COPY CONSTRUCTOR
  public GameCharacter(GameCharacter original) {
    if(original == null) {
      System.out.println("ERROR: null data given to copy constructor. Shutting down program.");
      System.exit(0);
    } else {
      this.setAll(original.name, original.charClass, original.alignment, original.gold, original.hitPoints, original.armorClass, original.weapon1, original.weapon2);
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

  public String getName() {
    return name;
  }

  public boolean setCharClass(String charClass) {
    if(charClass != null && charClass.length() > 0) {
      this.charClass = charClass;
      return true;
    } else {
      return false;
    }
  }

  public String getCharClass() {
    return charClass;
  }

  public boolean setAlignment(String alignment) {
    if(alignment != null && alignment.length() > 0) {
      this.alignment = alignment;
      return true;
    } else {
      return false;
    }
  }

  public String getAlignment() {
    return alignment;
  }

  public boolean setGold(int gold) {
    if(gold >= 0) {
      this.gold = gold;
      return true;
    } else {
      return false;
    }
  }

  public int getGold() {
    return gold;
  }

  public boolean setHitPoints(int hitPoints) {
    if(hitPoints > 0) {
      this.hitPoints = hitPoints;
      return true;
    } else {
      return false;
    }
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public boolean setArmorClass(int armorClass) {
    if(armorClass >= 0) {
      this.armorClass = armorClass;
      return true;
    } else {
      return false;
    }
  }

  public int getArmorClass() {
    return armorClass;
  }

  public boolean setWeapon1(Weapon weapon1) {
    this.weapon1 = weapon1;
    return true;
  }

  public Weapon getWeapon1() {
    return weapon1;
  }

  public boolean setWeapon2(Weapon weapon2) {
    this.weapon2 = weapon2;
    return true;
  }

  public Weapon getWeapon2() {
    return weapon2;
  }

  public boolean setAll(String name, String charClass, String alignment, int gold, int hitPoints, int armorClass, Weapon weapon1, Weapon weapon2) {
    return setName(name) && setCharClass(charClass) && setAlignment(alignment) && setGold(gold) && setHitPoints(hitPoints) && setArmorClass(armorClass) && setWeapon1(weapon1) && setWeapon2(weapon2);
  }

  public String toString() {
    return "Stats: " + name + ", " + charClass + ", " + alignment + ", " + gold + ", " + hitPoints + ", " + armorClass + ", " + weapon1 + ", " + weapon2;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GameCharacter that = (GameCharacter) o;
    return this.name.equals(that.name) && this.charClass.equals(that.charClass) && this.alignment.equals(that.alignment) && this.gold == that.gold && this.hitPoints == that.hitPoints && this.armorClass == that.armorClass && this.weapon1.equals(that.weapon1) && this.weapon2.equals(that.weapon2);
  }
}
