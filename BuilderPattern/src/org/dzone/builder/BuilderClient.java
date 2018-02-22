package org.dzone.builder;

import org.dzone.builder.House.HouseBuilder;

public class BuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house=new House.HouseBuilder("Iron rod","Square").withRoof("Some Design").sytleInterior("Mat with wall paper").build();
		
		System.out.println(house);
	}

}
