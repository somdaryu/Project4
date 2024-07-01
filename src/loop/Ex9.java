package loop;

public class Ex9 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1; i<=20; i++) {
			sum = sum + i;
			System.out.println("i : "+ i );
			System.out.println("sum : "+ sum);
			if(sum >= 100) { // 합이 100을 넘으면 for문 종료
				break; //break는 특정조건에서 빠져나와야 할 때 사용할 것
			}
		}

	}

}
