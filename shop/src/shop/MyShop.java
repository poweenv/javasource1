package shop;

import java.util.ArrayList;
import java.util.Scanner;
//배열로 선언된 부분==> ArrayList 로 변경(프로그램 수정)


public class MyShop implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열 ArrList
	ArrayList<User> users = new ArrayList<>();
	//product 정보 저장 배열 ArrList
	ArrayList<Product> products= new ArrayList<>();
	//구매한 제품을 저장 배열(cart) ArrList
	ArrayList<Product> carts = new ArrayList<>();
	//선택된 user 저장
	private int selUser;
	
	Scanner sc = new Scanner(System.in);

	

	@Override
	public void setTitle(String title) {		
		this.title = title;
	}

	@Override
	public void genUser() {		
		//User 2명 생성 후 배열에 저장
		users.add(new User("홍길동", PayType.CARD));
		users.add(new User("성춘향", PayType.CASH));
		
	}

	@Override
	public void genProduct() {		
		//Product 4개(CellPhone 2개, SmartTv 2개) 생성 후 배열에 저장
		products.add(new CellPhone("갤럭시 노트 10", 500000,"SKT"));
		products.add(new CellPhone("애플 아이폰 13", 500000,"U+"));
		products.add(new SmartTv("삼성 3D Smart", 500000,"4K"));
		products.add(new SmartTv("LG Smart Tv", 500000,"Full HD"));
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================================");
		
//		for (int i = 0; i < users.size(); i++) {
//			System.out.printf("[%d] %s(%s)\n",i,users.get(i),users.get(i));
//		}
		int i =0;
		for (User user : users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
		
		System.out.println("[x] 종   료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		// 0,1 => productList() 호출
		// 다른걸 입력 시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x": case "X":
			System.exit(0);  //프로그램 종료
			break;
		case "0": case "1":
			selUser=Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}		
	}
	
	public void productList() {
		System.out.println(title+" : 상품 목록 - 상품선택 ");
		System.out.println("=============================");
		//products 배열 출력
//		for (int i = 0; i < products.size(); i++) {
//			System.out.printf("[%d]",i);
//			products.getPrintDetail();
//			products[i].printExtra();
//		}
		int  i=0;
		for (Product product:products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
			product.printExtra();
		}
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] check out");
		System.out.println("chose :  ");
		String sel = sc.nextLine();
		// 상품선택 시0~3
		// h=> start 메소드 호출, c=> checkOut() 호출
	switch (sel) {
	case "0": case"1": case "2": case "3":
		
				carts.add(products.get(Integer.parseInt(sel)));
		productList();
		break;
	case "h": case"H":
		start();

	case "c" : case"C":
		checkOut();
	default:
		System.out.println("입력값을 확인해 주세요");
		productList();
		break;
	}	
	}
	
	public void checkOut() {
		//myShop : 체크아웃
		System.out.println(title+" check out");
		System.out.println("==========================");
		int i = 0;
		int total =0;
		for (Product cart : carts) {
			if(carts !=null) {
				System.out.printf("[%d] %s(%d)\n",i++,cart.getName(),cart.getPrice());
				total+=cart.getPrice();
			}
//			System.out.println(sumPrice);
//			System.out.println("결제방법을 선택해 주세요");
			
			
		}
		System.out.println("========================");
		System.out.println("결제 방법 : "+users.get(selUser).getPayType());
		System.out.println("결제 금액 : "+total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("choose : ");
		String sel=sc.nextLine();
		/*
		 *  장바구니에 담겨있는 상품 목록 출력
		 *  가격 합계 구하기
		 *  
		 *  결제 방법 :CARD
		 *  결제 금액 : 5000000
		 *  [p] : 이전 , [q]: 결제완료
		 */
		// p 일때는 productList 호출
		// q 일때는 결제가 완료되었습니다. 프로그램 종료
		// 잘못입력시 checkOut() 호출
		String select=sc.nextLine();
		switch (select) {
		case "p":
			productList();
		case "q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
			break;

		default:
			checkOut();
			break;
		}
	}
}








