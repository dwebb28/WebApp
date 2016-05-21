package webapp.data;

import java.util.Date;

public abstract class AbstractRequest {
	
	private String requestingUser;
	private	Date requestTime;
	private String requestDescription;
	
	public String getRequestingUser() {
		return requestingUser;
	}
	public void setRequestingUser(String requestingUser) {
		this.requestingUser = requestingUser;
	}
	public Date getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}
	public String getRequestDescription() {
		return requestDescription;
	}
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

}
