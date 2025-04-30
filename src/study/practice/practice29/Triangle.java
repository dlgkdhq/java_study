package study.practice.practice29;

public class Triangle {
	
	int under;
	int height;
	
	void setSize(int under, int height){
		this.under = under;
		this.height = height;
	}
	
	double getArea() {
		return under * height / 2;
	}
}
