import java.util.Random;

public class Ex0113_Operators2 {
	public static void main(String[] args) {
		// 문제 3. 경품 추첨 프로그램
		Random r = new Random();
		int score = r.nextInt(10) + 1;
		score *= 100; // 점수가 100, 200, ... 이렇게 나오도록
		String result = "";
		switch(score) {
		case 1000:
			result += "TV ";
		case 900:
			result += "Notebook ";
		case 800:
			result += "냉장고 ";
		case 700:
			result += "한우 ";
		case 600:
			result += "휴지 ";
		default :
			result += "양말";
		}
		System.out.println("점수 : " + score);
		System.out.println("결과 : " + result);
	}
}
