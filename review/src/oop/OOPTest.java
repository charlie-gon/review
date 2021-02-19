package oop;

import java.util.ArrayList;

/**
 * 
 * 다형성
 * 1. 부모타입의 참조변수가 자식 객체 참조 가능
 * 2. 실행 메서드는 참조하는 객체의 메서드 호출(실행결과 다를 수 있다)
 *
 */

public class OOPTest {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		Member member;
		
		member = new Prof();
		member.setName("김홍"); // 캡슐화
		list.add(member);
		
		member = new Emp();
		member.setName("박홍"); // 캡슐화
		list.add(member);
		
//		형변환
//		long a = 10;
//		int b = (int) a;
		
		for(Member m : list) {
			m.print();
			m.sal();
			if(m instanceof Emp) {
				// 객체간 형변환은 부모-자식 관계에서만 가능
				((Emp)m).meth(); // 다운캐스팅(형변환)
			}
		}
		System.out.println(" --- ");
		
		for(int i = 0; i<list.size(); i++) {
			Member m = list.get(i);
			m.print();
			m.sal();
		}
		System.out.println(" --- ");
	}

}
