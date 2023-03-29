package DbShop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
// 카멜(Camel case) 표기법 : 두단어가 합쳐지는 경우 뒷단어를 대문자로 시작
// productName

// 데이터베이스
// snake case : 두 단어가 합쳐지는 경우_로 연결
// product_name : 필드명
//@Data //getter,setter, equals,canEqual,hashCode,toString, 기본생성자
public class ProductDTO {

	private int productId;
	private String pname;
	private int price;
	private String content;
}
