public class Dwarf extends GameCharacter {

  public Dwarf(String name, String charClass, String alignment, int gold, int hitPoints, int armorClass, Weapon weapon1, Weapon weapon2) {
    super(name, charClass, alignment, gold, hitPoints, armorClass,weapon1, weapon2);
  }

  public void assist(GameCharacter gc) {
    gc.setArmorClass(gc.getArmorClass() + 1);
  }

  public boolean attack(GameCharacter gc) {
    if (gc.getArmorClass() == 1) {
      gc.setHitPoints(gc.getHitPoints() - 10);
      return true;
    } else if (gc.getArmorClass() == 2) {
      gc.setHitPoints(gc.getHitPoints() - 5);
      return true;
    } else if (gc.getArmorClass() == 3) {
      gc.setHitPoints(gc.getHitPoints() - 3);
      return true;
    } else if (gc.getArmorClass() < 1) {
      gc.setHitPoints(gc.getHitPoints() - 15);
      return true;
    } else {
      return false;
    }
  } 
}
