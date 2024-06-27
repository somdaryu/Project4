package conditional.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		char gender = 'f';
		
		if(gender == 'f') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("남성입니다.");
		}
		
		int i = 150;
		
		if(i > 100 && i < 200) {
			System.out.println("i는 100보다 크고 200보다 작습니다.");
		}else {
			System.out.println("i는 100이하거나 200이상 입니다.");
		}

	}

}
