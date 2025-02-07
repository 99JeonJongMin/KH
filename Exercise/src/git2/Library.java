package git2;


import java.io.IOException;

//1. 아래와 같이 도서 정보를 ArrayList에 저장하고 검색할 수 있는 자바 프로그램을 이클립스로 작성하시오. 
//- 도서들의 정보는 Book이라는 클래스로 나타내며, Book 클래스는 도서명, 저자, 출판사, 가격 등의 필드를 가진다.
//- ArrayList의 입출력을 처리할 때 반복문을 사용하시오.
//- 도서들의 정보를 추가, 조회, 삭제하는 간단한 메뉴를 출력되도록 작성하시오.
//
//- 출력예 -
//== 메뉴 ==
//1. 도서 추가
//2. 도서 조회
//3. 도서 삭제
//4. 종료
//
//2. 1번 문제의 자바 애플리케이션을 배포하고자 한다. 실행 가능한 JAR 파일을 생성하시오. 단, 파일명은 Book.jar로 하시오.
//
//3. 아래와 같이 git (깃), github (깃허브)에서 실습하고 깃허브 주소를 공유하여 보시오.
//- 조건 -
//(1) C드라이브에 myProject 디렉토리를 생성하고 초기화한 후 깃 저장소를 만드시오. 그리고, 사용자명과 메일주소를 등록하시오.
//(3) 2번에서 생성한 jar 파일을 스테이지 영역에 추가하고 로컬저장소에 커밋하시오.
//(3) 깃허브로 myTest라는 리포지터리를 생성하시오. 단, public으로 설정하시오.
//(4) 깃허브에 로컬저장소를 원격저장소로 올려보고 확인해보시오.
//(5) 원격저장소에 있는 내용을 클론하여 로컬저장소로 가져오시오. 단, 로컬저장소는 C:\git_test로 하시오.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();
		Book book = new Book();
		boolean check = true;
		int count = 0;
		
		while(check) {
			book.menu();
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("도서명을 입력하세요 : ");
				String name = sc.nextLine();
				System.out.println("저자를 입력하세요 : ");
				String author = sc.nextLine();
				System.out.println("출판사를 입력하세요 : ");
				String pub = sc.nextLine();
				System.out.println("가격을 입력하세요 : ");
				int price = sc.nextInt();
				sc.nextLine();
				list.add(new Book(++count,name, author, pub, price));
				break;
				
			case 2:
				for(Book books : list) {
					System.out.println(books.no + "번 책 도서명 : "+books.name+ " 저자 : "+books.author+ " 출판사 : "+books.pub+ " 가격 : "+books.price+"원");
				}
				break;
			case 3:								
				//2025 02 07 findNo로 받은값이 null값이어도 삭제된다는 문구 출력 되었던 점 수정 - 전종민
				System.out.println("삭제 시킬 도서의 번호를 입력하세요 : ");
				int removeNo = sc.nextInt();

				boolean result = list.remove(findNo(list, removeNo));
				if(result != false) {
					System.out.println(removeNo+"번 도서가 삭제 되었습니다.");
					
				}
				else { 
					System.out.println(removeNo+"번의 도서는 존재하지 않습니다!");
				}
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				check = false;
				pause();
				break;
			default:
				System.out.println("번호를 잘못 입력했습니다 ! ! !");
				break;
			}
		}

		
	}
				public static Book findNo(List<Book> list, int rNo) { //Book객체List 해당 no를 찾아내어 Book객체로 전달
					for(Book books : list) {
									if(books.getNo() == rNo) {
										return books;
									}
								}	
					return null;
				}
				
				private static void pause() {
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO: handle exception
					}
				}
}
