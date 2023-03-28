package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

	//생성자, getter/setter, toString ==> lombok 라이브러리 이용(프로젝트 포함)
	
	private int userId;
	private String name;
	private int payNo;
	

}
