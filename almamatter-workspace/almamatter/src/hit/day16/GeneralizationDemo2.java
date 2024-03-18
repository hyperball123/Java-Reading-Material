package hit.day16;
//object reusability and code reusability
public class GeneralizationDemo2 {
	public static void main(String[] args) {
		Hall myHall=new Hall();
		myHall.party=new BirthdayParty();
		//myHall.party=new EngagementParty(); this is not acceptable
		GeneralHall generalHall=new GeneralHall();
		generalHall.party=new BirthdayParty();
		generalHall.party=new EngagementParty();
	}
}

//object reusability
class Hall{// is hall reusable or not
	BirthdayParty party;
}
class GeneralHall{//this hall is reusable
	Party party;
}
class Party{
	
}
class BirthdayParty extends Party{}

class EngagementParty extends Party{}
