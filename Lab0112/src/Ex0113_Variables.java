import kr.or.bank.Car;

public class Ex0113_Variables {
	public static void main(String [] args) {
		
		String str = "ȫ�浿"; // Ŭ���� (��� �� �Ϲ� Ÿ��)
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s);
		
		System.out.println("ȫ\"��\"��"); // ��ȣ ����� ���� \ ���!
		System.out.println("100" + 100); // 100100
		System.out.println(100 + "100");
		System.out.println(100 + 100 + "100");
		System.out.println(100 + "100" + 100);
		
		Car c = new Car(); // Ŭ������ Ÿ���̴�! (�޸𸮿� �ø����� new ������ ���)
		System.out.println(c.hashCode());
		Car c2 = new Car();
		System.out.println(c.hashCode());
		System.out.println(c.equals(c2)); // instanceOf()�� �� ���!
	}
}