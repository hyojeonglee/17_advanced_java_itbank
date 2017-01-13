import kr.or.bank.Card;

// ��ü ���� ���
// 1. Method Overloading : �ϳ��� �̸����� �������� ���! �Ķ���� ������ Ÿ��(����) �ٲ۴�! (�������̽�)
// �̶� ����Ÿ���� ��� ����.
// Q. ������ ���忡�� �����ε�(�ߺ�����)�� �� ����? ���ɰ��� ����� ����. ���ϰ� ������!

class OverTest {
	int add(int i) { 
		return i + 100;
	}
	
	int add(int i, int j) { // ����
		return i + j;
	}
	
	String add(String s) { // ����
		return s;
	}
	
	String add(String s, int i) { // ����
		return s+i;
	}
	
	String add(int i, String s) { // ����
		return s+i;
	}
	
	int[] add(int[] param) {
		int[] target = new int[param.length];
		for(int i = 0 ; i < param.length ; i++)
			target[i] = param[i] + 1;
		return target;
	}
	// �� �Լ��� ������ target�̶�� ���� ������ ��������� �迭 ��ü�� ��������ʴ´�.(heap �޸𸮿� �ö� �����Ƿ�!)
	// heap �޸𸮴� ���� �ǵ帮�� �� �ƴϰ�, �������� ������ ������ �÷��Ͱ� �˾Ƽ� ġ���ش�.
	
	Card add(Card c) {
		return c;
	}
	
	int[] add(int[] so, int[] so2) {
		int n = (so.length >= so2.length)? so2.length : so.length;
		int[] result = new int[n];
		for(int i = 0 ; i < n ; i++)
			result[i] = so[i] + so2[i];
		return result;
	}
}

public class Ex0113_OOP {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
		Card c = new Card();
		Card c2 = ot.add(c);
		// Q. �� �� c�� c2�� �ּҴ� ����.
		c.equals(c2); // True
		
		// cf. c2.toString() �� �ص� c2�� �ᵵ �ڵ����� ���ش�.
		
		Card c3 = ot.add(new Card()); // �̰� �ɱ�?
		System.out.println(c3); // �ǳ�
		
		int[] numbers = new int[10];
		for(int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = i;
			System.out.print(numbers[i]);
		}
		System.out.println("");
		numbers = ot.add(numbers);
		for(int i = 0 ; i < numbers.length ; i++)
			System.out.print(numbers[i]);
		// ������ for��! ��ü�� �迭 �ٷ� ���� �̰� ����!!! ���������δ� while
		for(int i : numbers)
			System.out.print(i);
		System.out.println("");
		
		int[] b = {1, 2, 3, 4, 5};
		int[] b2 = {1, 2, 3, 4, 5, 6, 7};
		b2 = ot.add(b, b2);
		for(int i : b2) 
			System.out.print(i);
	}
}