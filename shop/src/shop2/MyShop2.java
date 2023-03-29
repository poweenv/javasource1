package shop2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MyShop2 implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열
	UserDTO[] users = new UserDTO[2];
	//product 정보 저장 배열
	Product products[] = new Product[4];
	//구매한 제품을 저장 배열(cart)
	Product carts[] = new Product[10];
	
	//선택된 user 저장
	private int selUser;
	
	//userDAO 객체 생성
	UserDAO userDAO = new UserDAO();
	ProductDAO productDAO = new ProductDAO();
	OrderDAO orderDAO = new OrderDAO();
	Scanner sc = new Scanner(System.in);
	

	@Override
	public void setTitle(String title) {		
		this.title = title;
	}

	@Override
	public void genUser() {		
		//user 정보 입력받아서 suser 테이블에 저장
		System.out.println("****** User 입력 ******");
		//
		System.out.println("id 입력>>");
		int userId = Integer.parseInt(sc.nextLine());
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("payNo  >>");
		int payNo = Integer.parseInt(sc.nextLine());
		
		
		System.out.println(userDAO.insert(userId,name,payNo)?"user 추가 성공":"user 추가 실패");
	}

	public void userList() {
		System.out.println("****** User 목록 ******");
		System.out.println("userId\tname\tpayNo");
		System.out.println("===============================");
		List<UserDTO> list = userDAO.getList();
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserId()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPayNo()+"\n");
		}
	}
	
	@Override
	public void genProduct() {		
		// 상품 정보 입력받아서 테이블 저장					
		System.out.println("****** 상품 목록 ******");
		System.out.println("productId >>");
		int productId = Integer.parseInt(sc.nextLine());
		System.out.println("pname >>");
		String pname = sc.nextLine();
		System.out.println("price >>");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("content >>");
		String content = sc.nextLine();
		ProductDTO dto = new ProductDTO(productId, pname, price, content);
		// 상품정보 입력받기 => ProductDTO에 담기
		System.out.println(productDAO.insert(dto)?" 상품 추가 성공":"상품 추가 실패"); 
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================================");
		
		//현재 user 정보 출력 
		List<UserDTO> list = userDAO.getList();
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserId()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPayNo()+"\n");
		}
		
		System.out.println("[x] 종   료");
		System.out.print("회원코드입력 : ");
		String sel = sc.nextLine(); // 숫자("1000"),x
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		// 0,1 => productList() 호출
		// 다른걸 입력 시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x": case "X":
			System.exit(0);  //프로그램 종료
			break;
		case "1000": case "1010":
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
		
		//product 데이터베이스 상품 출력
		//product_id, pname, price, content
		List<ProductDTO> list= productDAO.getList();
		for (ProductDTO productDTO : list) {
			System.out.print(productDTO.getProductId()+"\t");
			System.out.print(productDTO.getPname()+"\t");
			System.out.print(productDTO.getPrice()+"\t");
			System.out.print(productDTO.getContent()+"\n");
		}
		
		
		
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] check out");
		System.out.println("chose :  ");
		String sel = sc.nextLine();
		// 상품선택 시0~3 => sorder 저장, productList() 호출
		// h=> start 메소드 호출, c=> checkOut() 호출
	switch (sel) {
	case "12": case"13": case "15": case "21":
		
				orderDAO.insert(selUser, Integer.parseInt(sel));
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
		int sumPrice = 0;
		for (int i = 0; i < carts.length; i++) {
			if(carts[i]!=null) {
				System.out.printf("[%d] %s(%d)\n",i,carts[i].getName(),carts[i].getPrice());
				sumPrice+=carts[i].getPrice();
			}
//			System.out.println(sumPrice);
//			System.out.println("결제방법을 선택해 주세요");
			
			
		}
		System.out.println("========================");
//		System.out.println("결제 방법 : "+users[selUser].getPayType());
		System.out.println("결제 금액 : "+sumPrice);
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








