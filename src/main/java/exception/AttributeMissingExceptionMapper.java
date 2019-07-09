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
public class AttributeMissingExceptionMapper implements ExceptionMapper<AttributeMissingException>{

	@Override
	public Response toResponse(AttributeMissingException exception) {
		Date d = new Date();
		SimpleDateFormat timeGMT = new SimpleDateFormat("EEE dd/MM/yyyy HH:mm:ss z");
		timeGMT.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
		String timeStampLocal = timeGMT.format(d);
		ErrorResponse errorResponse = new ErrorResponse(400, exception.getMessage(), timeStampLocal);
		return Response.status(Status.BAD_REQUEST).entity(errorResponse).build();
	}

}
