package study.practice.practice29;

public class Rectangle {

	int under;
	int height;
	
	Rectangle(int under, int height){
		this.under = under;
		this.height = height;
	}
	
	double getArea() {
		return under * height;
	}
}
