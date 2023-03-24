package database2;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;

/*
 	table 컬럼과 동일하게 작성
 	getter/setter ,toString,
 */
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;

	
	
}
