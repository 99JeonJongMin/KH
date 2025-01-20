package sec01.exam06;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public void turnOn();
	public abstract void turnOff();
	public void setVolume(int volume);
}
