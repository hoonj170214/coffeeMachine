package coffeemachine;

public class Latte {
    static String name = "라떼";
    static int money = 7000;
    static int water = 350;
    static int milk = 75;
    static int coffeeBean = 20;

    //생성자

    public Latte(int money, int water,int milk, int coffeeBean, int cup) {
        this.money = money;
        this.water = water;
        this.coffeeBean = coffeeBean;
    }


    //메소드
    public static int getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public int getCoffeeBean() {
        return coffeeBean;
    }

    public static String getName() {
        return name;
    }

    public static int getMilk() {
        return milk;
    }


    public static void setName(String name) {
        Latte.name = name;
    }

    public static void setMoney(int money) {
        Latte.money = money;
    }

    public static void setWater(int water) {
        Latte.water = water;
    }

    public static void setMilk(int milk) {
        Latte.milk = milk;
    }

    public static void setCoffeeBean(int coffeeBean) {
        Latte.coffeeBean = coffeeBean;
    }
}
