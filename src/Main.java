public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(250);
        boss.setDamage(45);
        boss.setName("Mudzan");
        boss.weapon.setWeaponType(WeaponType.STEEL_ARMS);
        boss.weapon.setWeponName("knife");
        System.out.println("WeaponType: " + boss.weapon.getWeaponType()+  " Damage: " +
                boss.getDamage() + " Health: " + boss.getHealth() + " Name: " +
                boss.getName() + " Weapon: " + boss.weapon.getWeponName());



        }
    }
