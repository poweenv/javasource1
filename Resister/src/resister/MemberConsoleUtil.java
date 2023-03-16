package resister;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberConsoleUtil {
	public Member getNewMember(Scanner sc) {
		
		//새로운 멤버 정보 입력 받기
		System.out.println("회원 등록을 진행하겠습니다");
		System.out.println("id를 입력해주세요");
		String id = sc.nextLine();
		System.out.println("이름을 입력해 주세요");
		String name = sc.nextLine();
		System.out.println("주소를 입력해 주세요");
		String address = sc.nextLine();
		System.out.println("메일을 입력해 주세요");
		String email = sc.nextLine();
		System.out.println("나이를 입력해 주세요");
		int age = Integer.parseInt(sc.nextLine());
		
		Member member = new Member(id, name, address, email, age);
		return member;
		
		
	}
	public void printAddSuccessMessage(Member member) {
		// 홍길동님 회원 정보 추가 성공 메세지 출력
		System.out.println(member.getName()+"님 회원 정보가 추가되었습니다.");
		
	}
	public void printMemberList(ArrayList<Member> list) {
		// list에 들어있는 member 출력
		for (Member member : list) {
			System.out.printf("%5s",member.getId());
			System.out.printf("%6s",member.getName());
			System.out.printf("%8s",member.getAddress());
			System.out.printf("%10s",member.getEmail());
			System.out.println(member.getAge());
			
		}
	}
	public Member updateMember(Scanner sc,ArrayList<Member> list) {
	//수정할 회원의 아이디 입력받기
		System.out.println("수정할 아이디를 입력해주세요");
		String id = sc.nextLine();
//		//list에서 입력된 회원의 아이디랑 일치하는 회원 찾기
//		Iterator<Member> it = list.iterator();
//		//list = > Iterator 변경
//		while (it.hasNext()) {
//			Member member = it.next();
//			
//			if(member.getId().equals(id)) {
//				//회원이 존재한다면 변경할 주소를 입력받기
//				System.out.println("변경 주소 입력 : ");
//				String address = sc.nextLine();
//				//주소 변경
//				member.setAddress(address);
//				return member;
//				
//				//주소를 변경한다.
//				
//				//수정된 회원을 리턴
			

//		}
		for (Member member : list) {
			if(member.getId().equals(id)) {
				System.out.println("변경할 주소 입력 : ");
				String address = sc.nextLine();
				member.setAddress(address);
				return member;
			}
			//일치하는 회원이 없다면
			
		}
		return null;
	}
		public void printUpdteSuccessMessage(Member member) {
			//홍길동님 회원 정보 수정 성공 메세지 출력
			System.out.println(member.getName()+"님 회원 정보 수정 성공");
		}
		public void printUpdateFailMessage() {
			//회원 정보 수정에 실패하였습니다
			System.out.println(" 회원 정보 수정에 실패하셨습니다");
		}
		
		
		public Member removeMember(Scanner sc,ArrayList<Member> list) {
			System.out.println("삭제할 회원 아이디를 입력해주세요");
			String id = sc.nextLine();
			for (Member member : list) {
				if(member.getId().equals(id)) {
					list.remove(member);
					
					return member;
				}
				
			}
			//삭제할 회원 아이디가 존재하는지 확인하기 존재한다면 삭제
			//삭제된 회원 리턴
			return null;
			//회원 아이디가 존재하지 않는다면 null;
			
		}
		public void printRemoveSuccessMessage(Member member) {
			System.out.println(member.getName()+"님 회원정보 삭제 성공");
		}
		public void printRemoveFailMessage() {
			System.err.println("회원 정보 삭제에 실패하셨습니다.");
		}
		
		
	}
