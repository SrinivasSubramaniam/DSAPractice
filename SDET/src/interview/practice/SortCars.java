package interview.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

public class SortCars {
	
	@Test
	public void sortUsingCompare() {
		
		List<ZoomCars> cars = new ArrayList<ZoomCars>();
		cars.add(new ZoomCars("Maruti Swift AT", "Diesel", 1258));
		cars.add(new ZoomCars("Toyoto Glanza", "Petrol", 1208));
		cars.add(new ZoomCars("Ford Ecosport", "Diesel", 1359));
		cars.add(new ZoomCars("Maruti Swift", "Diesel", 1153));
		cars.add(new ZoomCars("Tata Tiago", "Diesel", 978));
		
		Predicate<ZoomCars> predic=cars1->cars1.getType().equals("Diesel");
		
		
		List<ZoomCars> checked=cars.stream().filter(predic).collect(Collectors.toList());
		Collections.sort(checked,(car1,car2)->	Integer.compare(car1.getPrice(), car2.getPrice()));
		/*cars.sort((car1,car2)->{
			if(car1.getPrice() > car2.getPrice())
				return -1;
			else if(car1.getPrice() < car2.getPrice())
				return 1;
			else return 0;
		});
		
		
		Collections.sort(cars,(car1,car2)->	Integer.compare(car1.getPrice(), car2.getPrice()));
		Collections.sort(cars,Comparator.comparing(ZoomCars::getPrice));*/
				
		/*Collections.sort(cars, new Comparator<ZoomCars>() {

			@Override
			public int compare(ZoomCars car1, ZoomCars car2) {
				if(car1.getPrice() > car2.getPrice())
					return -1;
				else if(car1.getPrice() < car2.getPrice())
					return 1;
				else return 0;
			}
		});*/
		
		System.out.println(checked.toString());
		
	}

}
