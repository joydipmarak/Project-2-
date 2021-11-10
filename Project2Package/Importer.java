package Project2Package;
import alternatePackage.Container;
import container2.SecondNumber;
//Question 11

public class Importer {
	public static void main(String[] args) {
		Container thing = new Container();
		System.out.println(thing.sec);
		
		SecondNumber thing2 = new SecondNumber();
		System.out.println(thing2.thing);
	}
}
