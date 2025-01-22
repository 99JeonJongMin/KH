package chap09.sec01.test;

public class CheckBox {

	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
		}

	
	 interface OnSelectListener {
		void onSelect();
	}
}	
