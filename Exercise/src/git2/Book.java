package git2;

public class Book {
	int no;
	String name;
	String author;
	String pub;
	int price;
	
	public Book(int no,String name, String author, String pub, int price) {
		this.no = no;
		this.name = name;
		this.author = author;
		this.pub = pub;
		this.price = price;
	}
	
	public Book() {
	}
	
	public int getNo() {
		return no;
	}
	public void menu() {
		System.out.println("== 메뉴 ==\r\n"
				+ "1. 도서 추가\r\n"
				+ "2. 도서 조회\r\n"
				+ "3. 도서 삭제\r\n"
				+ "4. 종료");
	}
}
