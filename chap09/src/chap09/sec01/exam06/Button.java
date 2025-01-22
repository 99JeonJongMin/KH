package chap09.sec01.exam06;

public class Button {
	static interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listner;
	
	void setOnClickListener(OnClickListener listener) {
		this.listner = listener;
	}
	
	void touch() {
		listner.onClick();
	}
}
