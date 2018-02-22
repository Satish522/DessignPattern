package org.javapaper.builder;

public class AndhraHouse implements HouseBuilder {
	
	private House house;
	
	public AndhraHouse() {
		this.house = new House();
	}
	
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Wooden Poles");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("Wood and Ice");
	}

	@Override
	public void bulidRoof() {
		// TODO Auto-generated method stub
		house.setRoof("Wood, caribou and seal skins");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Fire Wood");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return this.house;
	}

}
