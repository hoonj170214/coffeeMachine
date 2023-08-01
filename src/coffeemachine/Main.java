package coffeemachine;

import java.util.Scanner;

public class Main {
    private static int money;
    public static void Purchase()
    {
        System.out.println("어떤 커피를 구매하시겠습니까?");
        System.out.println("1. 에스프레소 (가격 : 4000원)");
        System.out.println("2. 라떼 (가격 : 7000원)");
        System.out.println("3. 카푸치노 (가격 : 6000원)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Status status =new Status(400,540,120,9,50000);

        boolean run = true;

        System.out.print("커피머신이 가동되었습니다.");
        while (run) {
            System.out.println("==========옵션을 선택하세요.==========");
            System.out.println("1. 구매 , 2. 채우기, 3. 가져가기, 4.종료");
            int option = sc.nextInt();
            System.out.print("메뉴를 선택하세요 >>>");


            if (option == 1) {
                Purchase();
                int menu = sc.nextInt();
                if(menu ==1) {
                    System.out.println("커피를 구매하였습니다. 감사합니다.");
                    System.out.println(Espresso.name + "가 준비되었습니다. 맛있게 드세요!");
                    status.PrintStatus();
                }else if(menu ==2){
                System.out.println("커피를 구매하였습니다. 감사합니다.");
                System.out.println(Latte.name + "가 준비되었습니다. 맛있게 드세요!");
                    status.PrintStatus();
                }else if(menu ==3) {
                    System.out.println("커피를 구매하였습니다. 감사합니다.");
                    System.out.println(Cappuccino.name + "가 준비되었습니다. 맛있게 드세요!");
                    status.PrintStatus();
                }
//                if (coffee > out) {
//                    System.out.println("요금이 부족합니다.");
//                }

//            } else if (option == 2) {
//                out = in - cocoa;
//                System.out.println("맛있게 드세요.");
//                if (cocoa > out) {
//                    System.out.println("요금이 부족합니다.");
//                }

            } else if (option == 3) {
                System.out.print("돈을 꺼내기 : ");
                int withdraw = sc.nextInt();
                money = Status.Withdraw(withdraw);
                status.PrintStatus();
            } else if (option == 4) {
                System.out.println("커피머신이 종료되었습니다.");
                run = false;
            }
        }
    }
}

