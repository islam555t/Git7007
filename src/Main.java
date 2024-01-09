import java.nio.file.attribute.UserPrincipal;

class main {
    public static void main(String[] args) {
        }
    }

class Hero {
    private int health;
    private int damage;
    private String superpower;

    // Конструктор с заданием всех полей
    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    // Конструктор с заданием только здоровья и урона
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        // По умолчанию суперспособность не задана
        this.superpower = "Нет суперспособности";
    }

    // Геттеры для всех полей
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

public class Main  {
    public static void main(String[] args) {
        // Создание экземпляра босса и задание свойств
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        // Вывод информации о боссе
        System.out.println("Информация о боссе:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());
    }
}
