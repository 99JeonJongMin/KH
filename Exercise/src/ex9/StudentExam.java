package ex9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentExam {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		File dir = new File("C:/Temp/Student");
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		boolean test = false;
		
		if(dir.exists() == false) dir.mkdir();
		Reader rd = new FileReader("C:/Temp/Student/student.txt");
		
		BufferedReader br = new BufferedReader(rd);

		int count = 0;
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			if (data.equals("이름  | 주소  |  번호")) {
				test = true;
			}
			map.put(count++, data);
			
		}
		
		
		

		Writer wr = new FileWriter("C:/Temp/Student/student.txt");
		if(test == false) {
		String str0 = "이름  | 주소  |  번호";
		wr.write(str0 +"\n");
		wr.flush();
		}
		while(true) {
			std.menu();
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				System.out.print("학생의 이름을 입력 하세요 : ");
				String name = sc.nextLine();
				System.out.print("학생의 주소를 입력 하세요 : ");
				String addr = sc.nextLine();
				System.out.print("학생의 전화번호를 입력 하세요 : ");
				String tel = sc.nextLine();
				
				String str = name+" "+addr+" "+tel+" ";
				map.put(count++,str);
				break;
			case 2:
				Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
				Iterator<Map.Entry<Integer,String>> entryIterator = entrySet.iterator();
				
				while(entryIterator.hasNext()) {
					Map.Entry<Integer, String> entry = entryIterator.next();
					Integer key = entry.getKey();
					String value = entry.getValue();
					
					System.out.println("\t " + key + " : " + value);
				}
					System.out.println();
					
				break;
			case 3:
				System.out.println("삭제 시킬 학생의 번호를 입력하시오 : ");
				int num = sc.nextInt();
				sc.nextLine();
				map.remove(num);
				
				
				break;
			case 4:
				Set<Map.Entry<Integer, String>> entrySet1 = map.entrySet();
				Iterator<Map.Entry<Integer,String>> entryIterator1 = entrySet1.iterator();
				
				while(entryIterator1.hasNext()) {
					Map.Entry<Integer, String> entry = entryIterator1.next();
					Integer key = entry.getKey();
					String value = entry.getValue();
					
					
					wr.write(value+"\n");
					wr.flush();
				}
				wr.close();
				rd.close();
				System.exit(0);

			default :
				System.out.println("번호를 잘못 입력했습니다.");
				break;
			}

		}
		
	}
}