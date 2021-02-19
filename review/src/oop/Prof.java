package oop;

// Refactor - superclass
public class Prof extends Member { // 교수 클래스

	String dept;

	@Override // 상속받은 메서드 재정의
	public void sal() {
		System.out.println("교수 급여");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//super.print(); // 부모
		System.out.println("교수");
	}
	
} // end of class
