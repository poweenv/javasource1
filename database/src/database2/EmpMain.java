package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao empDAO = new EmpDao();
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			System.out.println("======================");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 수정");
			System.out.println("4. 사원 조회(사번)");
			System.out.println("5. 사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("======================");
			
			//메뉴번호 입력받기
			System.out.println("메뉴입력>>");
			int menu = Integer.parseInt(sc.nextLine());
			//switch 작성
			switch(menu) {
			case 1:

				break;
			case 2:
				
				break;
			case 3:
				//empno,sal 입력받기
				System.out.println("수정할 정보 입력>>");
				System.out.println("사원번호");
				int empno = Integer.parseInt(sc.nextLine());
				
				System.out.println("수정급여");
				int sal = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.update(sal,empno)?"급여 변경 성공":"급여 변경 실패");
				
				break;
			case 4:
				System.out.println("조회할 사원번호를 입력해 주세요");
				empno = Integer.parseInt(sc.nextLine());
				//EmpDTO가 null 상태일 수도 있음
				EmpDTO dto =empDAO.getrow(empno);
				//출력
				
				if(dto!=null) {
				System.out.println("\n*** 사원정보 조회***");
				System.out.println("사원번호 : "+dto.getEmpno());
				System.out.println("사원명 : "+dto.getEname());
				System.out.println("직무 : "+dto.getJob());
				System.out.println("급여 : "+dto.getSal());
				System.out.println("추가수당 : "+dto.getComm());
				System.out.println("부서번호 : "+dto.getDeptno());
				System.out.println();
				}else {
					System.out.println("사원정보를 확인해주세요");
				}
				break;
			case 5:
				System.out.println("조회할 사원명 입력>>");
				String ename = sc.nextLine();
				ArrayList<EmpDTO> list =empDAO.getList(ename);
				System.out.println();
				
				if(list.isEmpty()) {
					System.out.println("조회된 사원이 없습니다");
				}else {

				System.out.println("사번\t사원명\t직무\t입사일");
				System.out.println("============================");
				for (EmpDTO empDTO : list) {
					System.out.print(empDTO.getEmpno()+"\t");
					System.out.print(empDTO.getEname()+"\t");
					System.out.print(empDTO.getJob()+"\t");
					System.out.print(empDTO.getHiredate()+"\n\n");
				
				}
				}		
				break;
			case 6:
				flag=false;
				break;
			default:
				System.out.println("메뉴 번호 확인");	
			}
			
		}

	}

}
