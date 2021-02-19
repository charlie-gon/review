package oop;

public class Emp extends Member {
	
	String dept; // 부서
	String rank; // 호봉
	
	@Override
	public void sal() {
		// TODO Auto-generated method stub
		System.out.println("직원 급여");
	}
	
	@Override
	public void print() {
		System.out.println("직원");
		
	}
	
	public void meth() {
		System.out.println("자재관리");
	}
	
}
