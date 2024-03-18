package compstore.emailpack;

import java.io.Serializable;

public interface EmailComponent extends Serializable{
	public void sendEmail(String data);
}
