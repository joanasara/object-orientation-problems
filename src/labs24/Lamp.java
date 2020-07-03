package labs24;

public class Lamp {

	String model;
	String voltage;
	int power;
	String color;
	String typeLight;
	int monthsWarranty;
	String[] types;
	boolean typesAbajus;
	boolean connected;

	void Turn_On() {
		connected = true;
	}

	void off() {
		connected = false;
	}

	void showStatus() {
		if (connected) {
			System.out.println("the lamp is on ");
		} else {
			System.out.println(" the lamp is off");
		}
	}

	void changeState() {
		if (connected) {
			off();
		} else {
			Turn_On();
		}

	}

}
