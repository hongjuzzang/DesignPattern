package Concrete;

import java.util.Scanner;

import abst.IBeverage;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// base

		IBeverage beverage = new Base();
		boolean done = false;
		while (!done) {
			System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
			System.out.println("선택 1: 샷추가 / 2: 우유 추가 / 0: 종료");
			switch (sc.nextInt()) {
			case 1:
				beverage = new Espresso(beverage);
				break;
			case 2:
				beverage = new Milk(beverage);
				break;
			case 0:
				done = true;
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}

		}

	}

}
