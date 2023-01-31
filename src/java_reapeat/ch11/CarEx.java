
package java_reapeat.ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class CarEx {

	public static void main(String[] args) {

		ArrayList<Car> al = new ArrayList<>();
		al.add(new Car());
		al.add(new Bus());
		al.add(new Taxi());
		for (Car car : al) {
			car.print();
			if (car instanceof Bus) {
				((Bus)car).move();
			}
		}
		
	}

}
