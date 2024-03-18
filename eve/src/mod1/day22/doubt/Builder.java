package mod1.day22.doubt;

import java.lang.reflect.Field;

public class Builder{
	public Kitchen createKitchen() throws Exception{
		Kitchen kitchen=new Kitchen();
		
		Field f1=kitchen.getClass().getDeclaredField("marble");
		f1.setAccessible(true);
		Inject inj=(Inject)f1.getAnnotation(Inject.class);
		System.out.println(inj);
		if(inj!=null) {
			kitchen.setMarble("marble is set......");
		}
		
		f1=kitchen.getClass().getDeclaredField("granite");
		f1.setAccessible(true);
		inj=(Inject)f1.getAnnotation(Inject.class);
		if(inj!=null) {
			kitchen.setGranite("granite is set...........");
		}
		System.out.println(inj);
		f1=kitchen.getClass().getDeclaredField("pvcDoors");
		f1.setAccessible(true);
		inj=(Inject)f1.getAnnotation(Inject.class);
		if(inj!=null) {
			kitchen.setPvcDoors("pvc doors set.....................");
		}
		
		f1=kitchen.getClass().getDeclaredField("plywoodDoor");
		f1.setAccessible(true);
		inj=(Inject)f1.getAnnotation(Inject.class);
		if(inj!=null) {
			kitchen.setPlywoodDoor("ply wood door set.........................");
		}
		return kitchen;
		
	}
}