package labs24;

public class TestLamp {

	public static void main(String[] args) {

		Lamp lamp = new Lamp();
		lamp.model = "a60";
		lamp.voltage = "Bivolt";
		lamp.monthsWarranty = 36;
		lamp.power = 7;
		lamp.color = "amarela";
		lamp.typeLight = "amarela";
		lamp.typesAbajus = true;

		lamp.types = new String[5];
		lamp.types[0] = "lampshades";
		lamp.types[1] = "lanterns";

		lamp.Turn_On();
		lamp.showStatus();

		lamp.off();
		lamp.showStatus();
		
		
		lamp.Turn_On();
		lamp.showStatus();
		
		

		System.out.println("the lamp model and: " + lamp.model);
		System.out.println("the color of the lamp and:" + lamp.color);
		System.out.println("lamp voltage and: " + lamp.voltage);
		System.out.println("the lamp warranty and: " + lamp.monthsWarranty);
		System.out.println("the power of the lamp and: " + lamp.power);
		System.out.println("the type of light and: " + lamp.typeLight);
		System.out.println("lamp types: " + lamp.typesAbajus);

		System.out.println(lamp.types[0]);
		System.out.println(lamp.types[1]);

	}

}
