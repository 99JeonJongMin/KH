package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdressExam {
public static void main(String[] args) {
	List<Adress> list = new ArrayList<Adress>();
	Adress ad = new Adress();
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println();
		ad.menu();
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select){
		case 1:
			System.out.print("이름을 입력하세요 :");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요 :");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("전화번호를 입력하세요 :");
			String tel = sc.nextLine();
			System.out.print("주소를 입력하세요 :");
			String addr = sc.nextLine();
			
			list.add(new Adress(name,addr,tel,age));
			break;
		case 2:
			System.out.print("삭제하고자 하는 번호를 입력하세요 :");
			int no = sc.nextInt();
			list.remove(no-1);
		case 3:
//			for(int i = 0; i<list.size(); i++) {
//				Adress str = list.get(i);
//				System.out.println((i+1)+". "+str.name+" "+str.addr+" "+str.tel);
//			}
			int count = 0;
			System.out.println("번호|  이름  |나이|     전화번호    |주소");
			for(Adress str : list) {
				count+=1;
				System.out.println(count+".   "+str.name+"   "+str.age+"  "+str.tel+" "+str.addr);
			}
			break;
		case 4:
			System.exit(0);
		default :
			System.out.println("메뉴를 다시 선택하세요!");
		}
	}
}
}
