package mod1.day22.doubt;

public class Kitchen{
	public Kitchen() {
		System.out.println("kitchen object created...");
		marble=null;
		granite=null;
		pvcDoors=null;
		plywoodDoor=null;
	}
	
	volatile private String marble;
	
	@Inject
	volatile private String granite;
	public String getMarble() {
		return marble;
	}
	public void setMarble(String marble) {
		this.marble = marble;
	}
	public String getGranite() {
		return granite;
	}
	public void setGranite(String granite) {
		this.granite = granite;
	}
	public String getPvcDoors() {
		return pvcDoors;
	}
	public void setPvcDoors(String pvcDoors) {
		this.pvcDoors = pvcDoors;
	}
	public String getPlywoodDoor() {
		return plywoodDoor;
	}
	public void setPlywoodDoor(String plywoodDoor) {
		this.plywoodDoor = plywoodDoor;
	}
	
	private String pvcDoors;
	@Inject
	private String plywoodDoor;
	@Override
	public String toString() {
		return "Kitchen [marble=" + marble + ", granite=" + granite + ", pvcDoors=" + pvcDoors + ", plywoodDoor="
				+ plywoodDoor + "]";
	}
	
}
