package chap07_02_exam05;

public class ChildExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(); //자동 타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2;
//		parent.method3();
		
		Child child = (Child)parent; //Parent를 child형으로 강제 형변환 하여서 Parent를 Child의 field2,method3를 사용할 수 있게끔 함
		
		child.field2 = "yyy";
		child.method3();
	}

}
