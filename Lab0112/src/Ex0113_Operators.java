
public class Ex0113_Operators {
	public static void main(String[] args) {
		// <���� ��Ģ>
		// �ڹٴ� ������ ��� ������ int�� ��ȯ��Ų��!
		// byte + byte => int + int
		byte b = 10;
		byte c = 10;
		// byte d = b + c; �ȵȴ�! ��� �޽��� : add cast to "byte"
		// �ذ���
		byte d = (byte)(b + c);
		int e = b + c;
		
		// byte + short => int + int
		// char + char => int + int
		
		// ������ ū ���� ���󰣴�.
		// float + int => float + float
		// float + long => float + float
		// float + double => double + double
		
		// ���� 1. 1 ~ 10���� ¦���� �� ���ϱ�
		int sum = 0;
		for(int i = 1 ; i < 11 ; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);
		
		// �ϱ�! <if�� ��� 3�׿�����!>
		int p = 10;
		int k = -10;
		int result = (p==10)? p : k;
		
		// <���� ������(short circuit ������ ���� ����)> : && (and) || (or)
		// DB select * from emp where salary > 100 and job != 'sales' or ename = 'king';
		// �̰� �ȵȴ�! ��� �Ⱦ��Ѵ�!
		// DB select * from emp where salary > 100 or job != 'sales';
		
		// if(10 > 0 && -1 > 1 && 100 > 2) {}
		// �� ������ -1 > 1���� �����̹Ƿ� �ڿ� �ƹ��� ���� ������ �־ �� ����. => ������!
		// if(10 > 0 || -1 > 1 || 100 > 2) {}
		// �� ������ 10 > 0���� ���̹Ƿ� �ڿ� �ִ� ������ �Ⱥ���.
		
		// ���� 2. ���� ����
		// ������ 90 �̸� A
		// ������ 90 �̻��̰� 95 �̻��̸� A+
		// 95 �̻��� �ƴ� �������� A-
		// ���� ����
		int score = 96;
		String grade = "";
		
		if(score >= 90) {
			grade += "A";
			if(score >= 95)
				grade += "+";
			else
				grade += "-";
		}
		
		System.out.println("����� ������ : " + grade);
		
		// <switch ����> : break�� ��������
		int s = 80;
		switch(s) {
		case 100:
			System.out.println("100");
			break;
		case 80:
			System.out.println("80");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}