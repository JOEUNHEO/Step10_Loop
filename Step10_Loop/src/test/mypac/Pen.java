package test.mypac;

public class Pen {
	//��� �ʵ�
	public String color;
	//������
	public Pen(String color) {
		this.color = color;
	}
	//��� �޼ҵ�
	public Pen write() {
		System.out.println(color+" �� Pen ���� �ʱ⸦ �ؿ�");
		return this;
	}
	public Pen draw() {
		System.out.println(color+" �� Pen ���� �׸��� �׷���");
		return this;
	}
}