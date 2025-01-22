package chap09.sec02.test3;

public class CheckBoxExam {
	public static void main(String[] args) {
		CheckBox check = new CheckBox();
		check.setOnSelectListener(
				new CheckBox.OnSelectListener() {
					
					@Override
					public void onSelect() {
						// TODO Auto-generated method stub
						System.out.println("배경을 변경합니다.");
					}
				});
		check.select();
	}
}
