package git_test2;

public class Hello {
	String message = "안녕하세요 메세지 찐수정";


	
	public Hello() {
		this("안녕하세요");	
	}
	public Hello(String message) {
		this.message = message;
	}
	public String say() {
		return message;
	}

}
