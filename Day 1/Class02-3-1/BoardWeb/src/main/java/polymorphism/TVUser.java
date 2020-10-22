package polymorphism;

public class TVUser {

	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		LgTV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}

}
