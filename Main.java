public class Main {

  public static void main(String[] args) {
    Weapon weapon1 = new Weapon("Bow and Arrow", 5, 20, 5);
    Weapon weapon2 = new Weapon("Broad Sword", 10, 5, 5);
    Weapon weapon3 = new Weapon("Dagger", 3, 5, 2);

    GameCharacter elf = new Elf("Legolas", "Ranger", "Chaotic Evil", 50, 20, 1, weapon1, weapon3);

    GameCharacter dwarf = new Dwarf("Gimli", "Brawler", "Lawful Neutral", 25, 40, 2, weapon2, weapon3);

    System.out.println("");
    System.out.println(elf);
    System.out.println("----------------------");
    System.out.println(dwarf);

    System.out.println("");
    System.out.println(elf.getName() + " is assisting " + dwarf.getName() + "!");
    
    //Should print +10 gold and +5 hitpoints for dwarf
    //Dwarf, 35, 45, 2
    elf.assist(dwarf);
    System.out.println("");
    System.out.println(dwarf);

    System.out.println("");
    System.out.println(elf.getName() + " is attacking " + dwarf.getName() + "!");
    
    //Should print -5 hitpoints
    //Dwarf, 35, 40, 2
    elf.attack(dwarf);
    System.out.println("");
    System.out.println(dwarf);
  }
}
