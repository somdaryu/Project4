package conditional.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		int stuScore = 88;
		int value = stuScore / 10;
		
		
		switch (stuScore) {
		case 9 :
			System.out.println("수");
			break;
		case 8 :
			System.out.println("우");
			break;
		case 7 :
			System.out.println("미");
			break;
		default :
			System.out.println("양");
			break;
		}
		
	}

}
