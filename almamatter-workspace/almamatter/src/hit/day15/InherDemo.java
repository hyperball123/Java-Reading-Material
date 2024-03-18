package hit.day15;

public class InherDemo {
	public static void main(String[] args) {
		Hall bhall=new Hall();
		
		bhall.party=new BirthDayParty();
		//bhall.party=new EngagementParty();
		
		Party p=new Party();
		GenericHall ghall=new GenericHall();
		ghall.party=new BirthDayParty();
		ghall.party=new EngagementParty();
		
		PaintBrush brush=new PaintBrush();
		brush.paint=new GreenPaint();
		brush.paint=new BluePaint();
	}
}

class Hall{// not reusable for all parties
	BirthDayParty party;
}
class GenericHall{//reusable for all parties  - reusable object
	Party party;
}
abstract class Party{}
class BirthDayParty extends Party{}//birthdayparty is a kind of party
class EngagementParty extends Party{}//engagementparty is a kind of party
class AssociationParty extends Party{}//AssociationParty is a kind of party

class PaintBrush{//generic paint brush - reusable object
	Paint paint;
}

abstract class Paint{}
class BluePaint extends Paint{}//bluepaint is a kind of paint
class GreenPaint extends Paint{}//greenpaint is a kind of paint