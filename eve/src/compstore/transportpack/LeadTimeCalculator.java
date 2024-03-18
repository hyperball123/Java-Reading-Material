package compstore.transportpack;

import java.io.Serializable;

public interface LeadTimeCalculator extends Serializable{
	public void calculateLeadTime(String data);
}
