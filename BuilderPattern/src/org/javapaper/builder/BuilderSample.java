package org.javapaper.builder;

public class BuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseBuilder builder= new AndhraHouse();
		builder.buildBasement();
		builder.buildStructure();
		builder.bulidRoof();
		builder.buildInterior();
		HousePlan house = builder . getHouse();
		System.out.println(house);
	}

}
