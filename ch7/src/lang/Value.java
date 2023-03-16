package lang;

public class Value {

	int value;
	
	public Value(int value) {
		super();
		this.value = value;
	}
	//Object가  equals()주소 비교로 넘겨줬음
	//값 비교로 바꾸고 싶은 상황==> 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value) {
			//instanceof : 특정 객체의 인스턴스인지 확인
			Value v = (Value) obj;
			//obj가 Value 객체의 인스턴스냐? 물어보는거
			if(this.value==v.value) {
				return true;
			}
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
}
