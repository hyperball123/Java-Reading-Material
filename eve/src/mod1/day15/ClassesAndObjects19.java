package mod1.day15;
/*
 * Inheritance advantages are
 * 1. Code Reusability
 * 2. part whole hierarchy
 * 3. composition
 * 4. object reusability
 * 5. polymorphic queries
 * 6. removal of if-else-if
 */

public class ClassesAndObjects19 {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		Paint rp=new BlackPaint();
		brush.paint=rp;
		brush.doPaint();
	}
}
/*
 * The paintbrush code is definitely a open ended code
 * In future conditions may increase.
 * So in this case using if-else-if or switch case is hight discouraged or rather
 * its a bad programming practice to use if-else-if in dynamic code
 * PRINCIPLE
 * OUR CODE SHOULD ALWAYS BE OPEN FOR EXTENSION BUT CLOSED FOR MODIFICATION
 */
/*
 * Solution - the stretegy to write programs without if-else-if
 * 1. Remove the conditional blocks
 * 2. Convert the condition to classes
 * 3. Group them under a part-whole hierarchy
 * 4. Make the parent class abstract
 * 5. Create a association between the abstract class and the using class
 * 
 * outcome of the above golden 5 rules is
 * 
 * I eliminated the if-else-if conditional ladder of paint brush
 * and also I have made the paintbrush object reusable
 */
class PaintBrush{
	Paint paint;//association - knowledge of or part of
	public void doPaint() {
		System.out.println(paint);
	}	
}

abstract class Paint{}
class RedPaint extends Paint{
}
class BluePaint extends Paint{
}
class GreenPaint extends Paint{
}
//creating a new class is extension
class BlackPaint extends Paint{}