package my.satish.strategy;

import java.util.Calendar;
import java.util.Date;

public class CalculateTrainFaiPayment {
	
	TrainFairStrategy trainFair;
	
	public void calculateTrainfair(int distanceInKM) {
		Calendar cal=Calendar.getInstance(); 
		Date date=new Date();
		cal.setTime(date);
		System.out.println(date+"====> "+ cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.TUESDAY));
		if( cal.get(Calendar.DAY_OF_WEEK)== Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK)== Calendar.SATURDAY ) {
			trainFair = new WeekendDaysTrainFair();
			System.out.println("Please pay train fair :- "+trainFair.calculateFair(distanceInKM));
			
		}else {
			trainFair = new WeekdaysTrainFair();
			System.out.println("Please pay train fair :- "+trainFair.calculateFair(distanceInKM));			
		}
		
	}
	
	public static void main(String[] args) {
		new CalculateTrainFaiPayment().calculateTrainfair(2);
	}
	
	
}
