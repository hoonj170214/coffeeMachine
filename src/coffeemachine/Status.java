package coffeemachine;

import java.util.Scanner;

public class Status {
    //필드
    static int water;
    static int milk;
    static int coffeeBean;
    static int cup;
    static int money;

    Cappuccino cappuccino =new Cappuccino(6000,200,100, 12,1 );
    Espresso espresso = new Espresso(4000,250,16,1);
    Latte latte = new Latte(7000, 350,75,20,1);
    //생성자

    Status(int water, int milk, int coffeeBean, int cup, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBean = coffeeBean;
        this.cup = cup;
        this.money = money;
    }

    //메서드
    void PrintStatus(){
        System.out.println("남은 재료와 돈 상태 : ");
        System.out.println("물 : " + water + " ml");
        System.out.println("우유 : " + milk + " ml");
        System.out.println("원두 : " + coffeeBean + " g");
        System.out.println("일회용 컵 " + cup + " 개");
        System.out.println("돈 : " + money + " 원");
    }
    void Espresso(){
        Status.water-=espresso.water;
        Status.coffeeBean-=espresso.coffeeBean;
        Status.money+=espresso.getMoney();
        Status.cup --;
    }

    void Cappuccino(){
        Status.water -= Cappuccino.water;
        Status.milk -= Cappuccino.milk;
        Status.coffeeBean -= Cappuccino.coffeeBean;
        Status.money += cappuccino.getMoney();
        Status.cup --;

    }

    void Latte(){
        Status.water -= Latte.water;
        Status.milk -= Latte.milk;
        Status.coffeeBean -= Latte.coffeeBean;
        Status.money += Latte.getMoney();
        Status.cup --;

    }
    static int Withdraw(int withdraw){
        System.out.println("출금할 돈을 입력해주세요.");
        money -= withdraw;
        return money;
    }



}
