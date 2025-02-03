package ex10;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Output2Exam {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Writer wr = new FileWriter("C:/Temp/output2.txt");
		List<People> list = new ArrayList<People>();
		String bmi;
		int count = 0;
		
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력 해 주세요 :");
			String name = sc.nextLine();
			System.out.println("키(m)를 입력 해 주세요 : ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.println("몸무게(kg)를 입력 해 주세요");
			int weight = sc.nextInt();
			sc.nextLine();
			
			if(weight/(height*height) >=25) {
				bmi = "과체중";
			} else if(weight/(height*height)>=20) {
				bmi = "표준체중";
			} else {
				bmi = "저체중";
			}
			list.add(new People(name, height, weight, bmi));
		}
		for(People people : list) {
			String str = ++count+" "+people.name+"씨의 키는 "+people.height+"cm 이고 몸무게는 "+people.weight+"kg입니다 bmi 지수는"+people.bmi+"입니다. \n";
			wr.write(str);
			wr.flush();
			System.out.println(str);
		}
		wr.close();
	}

}
