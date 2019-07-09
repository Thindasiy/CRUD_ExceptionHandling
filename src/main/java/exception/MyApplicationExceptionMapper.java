
package exception;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import bean.ErrorResponse;

@Provider
public class MyApplicationExceptionMapper implements ExceptionMapper<MyApplicationException> {

	@Override
	public Response toResponse(MyApplicationException exception) {

		Date d = new Date();
		SimpleDateFormat timeGMT = new SimpleDateFormat("EEE dd/MM/yyyy HH:mm:ss z");
		timeGMT.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
		String timeStampLocal = timeGMT.format(d);
		//String timestamp = new SimpleDateFormat("EEE dd/MM/yyyy HH:mm:ss z").format(new Date());
		ErrorResponse errorResponse = new ErrorResponse(404, exception.getMessage(), timeStampLocal);
		return Response.status(Status.NOT_FOUND).entity(errorResponse).build();
	}

}
