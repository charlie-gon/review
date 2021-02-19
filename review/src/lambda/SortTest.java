package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import util.Emp;

public class SortTest {
	public static void main(String[] args) {
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1, "ㄱ", "인사"));
		emplist.add(new Emp(2, "ㄴ", "기획"));
		emplist.add(new Emp(3, "ㄷ", "개발"));
		
		Collections.sort(emplist, (Emp o1, Emp o2)-> 
				o1.getDept().compareTo(o2.getDept()) // return이 하나라면 return 구문 생략 가능
			);
		System.out.println(emplist);
		
//		Collections.sort(emplist, new Comparator<Emp>(){
//			public int compare(Emp o1, Emp o2) {
//				return o1.getDept().compareTo(o2.getDept());
//			}});
//		System.out.println(emplist);
	}
}

//class EmpCompare implements Comparator<Emp>{
//
//	@Override
//	public int compare(Emp o1, Emp o2) {
//		// TODO Auto-generated method stub
//		return o1.getDept().compareTo(o2.getDept());
//	}
//}