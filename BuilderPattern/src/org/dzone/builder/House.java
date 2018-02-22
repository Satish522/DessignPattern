package org.dzone.builder;

public class House {
	private String basement;
	private String structure;
	private String roof;
	private String interior;
	
	public static class HouseBuilder{
		private String basement;
		private String structure;
		private String roof;
		private String interior;
		
		public HouseBuilder(String basement , String structure) {
			this.basement=basement;
			this.structure=structure;
		}
		
		public HouseBuilder withRoof(String roof) {
			this.roof=roof;
			return this;
		}
		
		public HouseBuilder sytleInterior(String interior) {
			this.interior=interior;
			return this;
		}
		
		public House build() {
			House house=new House();
			house.basement=this.basement;
			house.structure=this.structure;
			house.roof=this.roof;
			house.interior=this.interior;
			
			return house;
		}
	}
	

	@Override
	public String toString() {
		return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
				+ "]";
	}
	
	
}
