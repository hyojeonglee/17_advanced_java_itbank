import java.util.Random;

public class Ex0113_Operators2 {
	public static void main(String[] args) {
		// ���� 3. ��ǰ ��÷ ���α׷�
		Random r = new Random();
		int score = r.nextInt(10) + 1;
		score *= 100; // ������ 100, 200, ... �̷��� ��������
		String result = "";
		switch(score) {
		case 1000:
			result += "TV ";
		case 900:
			result += "Notebook ";
		case 800:
			result += "����� ";
		case 700:
			result += "�ѿ� ";
		case 600:
			result += "���� ";
		default :
			result += "�縻";
		}
		System.out.println("���� : " + score);
		System.out.println("��� : " + result);
	}
}