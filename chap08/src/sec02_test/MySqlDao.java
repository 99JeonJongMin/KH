package sec02_test;

public class MySqlDao implements DataAccessObject {
	String data = "MySql";
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(data+" DB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(data+" DB에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(data+" DB를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(data+" DB에서 삭제");
	}

}
