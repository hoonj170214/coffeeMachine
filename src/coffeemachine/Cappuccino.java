package coffeemachine;

public class Cappuccino {
    static String name = "카푸치노";
    public int cup;
    int money = 6000;
    static int water = 200;
    static int milk = 100;
    static int coffeeBean = 12;

    //생성자
    public Cappuccino(int money, int water, int milk, int coffeeBean,int cup) {
        this.money = money;
        this.water = water;
        this.coffeeBean = coffeeBean;
    }


    //메소드
    public int getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public int getCoffeeBean() {
        return coffeeBean;
    }

    public int getMilk() {
        return milk;
    }

    public static String getName() {
        return name;
    }

    public int setMoney(int money) {
        this.money += money;
        return money;
    }

    public int setWater(int water) {
        this.water -= water;
        return water;
    }

    public int setCoffeeBean(int coffeeBean) {
        this.coffeeBean -= coffeeBean;
        return coffeeBean;
    }

    public int setMilk(int milk) {
        this.milk -= milk;
        return milk;
    }

    public static void setName(String name) {
        Cappuccino.name = name;
    }
}
