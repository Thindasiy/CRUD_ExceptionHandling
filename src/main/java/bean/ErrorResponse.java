
package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorResponse {

	private int errorCode;
	private String errorMessage;
	private String timeStamp;

	public ErrorResponse() {
	}

	public ErrorResponse(int errorCode, String errorMessage, String timeStamp) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String geterrorMessage() {
		return errorMessage;
	}

	public void seterrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
