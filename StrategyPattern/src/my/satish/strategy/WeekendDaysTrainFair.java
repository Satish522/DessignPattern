package my.satish.strategy;

public class WeekendDaysTrainFair implements TrainFairStrategy {

	public final static float fairUpto10KMDistance= 2.0f;
	public final static float fairUpto15KMDistance= 4.7f;
	public final static float fairUpto20KMDistance= 6.2f;
	
	
	@Override
	public float calculateFair(int distanceInKM) {
		float fair=0.0f;
		if(distanceInKM<=10) {
			fair=fairUpto10KMDistance*distanceInKM;
		}else if(distanceInKM <= 15 && distanceInKM > 10 ) {
			fair=fairUpto15KMDistance * distanceInKM;
		}else if(distanceInKM > 15  ) {
			fair=fairUpto20KMDistance * distanceInKM;
		}
		return fair;
	}


}
