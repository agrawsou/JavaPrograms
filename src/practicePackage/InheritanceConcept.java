package practicePackage;

class Car {

	void start() {
		System.out.println("Start car");
	}

	void stop() {
		System.out.println("Stop car");
	}

	void refuel() {
		System.out.println("Refuel car");
	}
}

class BMW extends Car{
	void refuel() {
		System.out.println("Refuel BMW");
	}
	
	void autoStart() {
		System.out.println("Autostart BMW");
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {
		Car c = new BMW();
		c.refuel();
		c.start();
		c.stop();
		
		
		BMW b = new BMW();
		b.refuel();
		b.start();
		b.stop();
		b.autoStart();
		
		Car c1 = new Car();
		c1.refuel();
		c1.start();
		c1.stop();

	}

}
