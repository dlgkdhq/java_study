package study.practice.practice29;

public class TV {

	int inch;
	int madeYear;
	String brand;
	
	TV(String brand, int madeYear, int inch){
		this.brand = brand;
		this.madeYear = madeYear;
		this.inch = inch;
	}
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n", brand, madeYear, inch);
	}
}
