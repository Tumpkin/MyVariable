package variableTest;

public class FormatTest {
	public static void main(String[] args) {

//	이름, 나이, 몸무게 저장할 변수 선언
		String name = "황지수";
		int age = 25;
		double weight = 73.6;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %02d살\n몸무게 : %.1fkg",age,weight);

	}
}
