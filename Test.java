import java.util.*;

public class Test {
	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.printName();
		cow.printColor();
		Whale whale = new Whale();
		whale.printName();
		Cow animal = new Whale();
		animal.printName();
	}
	public static class Cow {
		public void printName() {
			System.out.println("Tim_Cow");
		}

		public void printColor() {
			System.out.println("Blue");
		}
	}

	public static class Whale extends Cow {
		public void printName() {
			System.out.println("Tim_Whale");
		}
	}
}
