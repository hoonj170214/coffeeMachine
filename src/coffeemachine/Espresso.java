package coffeemachine;

public class Espresso extends Menu {

    public int cup;
    private String Espresso;
    //필드
    static String name = "에스프레소";
    static int money = 4000;
    int water = 250;
    int coffeeBean = 16;

    //생성자

    public Espresso(int money, int water, int coffeeBean, int cup) {
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

    public String getEspresso() {
        return Espresso;
    }

    public static String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public void setWater(int water) {
        this.water -= water;
    }

    public void setCoffeeBean(int coffeeBean) {
        this.coffeeBean -= coffeeBean;
    }

    public void setEspresso(String espresso) {
        Espresso = espresso;
    }

}
