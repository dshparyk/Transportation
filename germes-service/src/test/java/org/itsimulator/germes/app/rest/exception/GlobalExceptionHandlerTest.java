package org.itsimulator.germes.app.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Verifies that {@link GlobalExceptionHandler} correctly handles application
 * exceptions
 * 
 * @author Morenets
 *
 */
public class GlobalExceptionHandlerTest {
	/**
	 * Current exception handler
	 */
	private ExceptionMapper<Exception> handler;

	@Before
	public void setup() {
		handler = new GlobalExceptionHandler();
	}

	@Test
	public void testToResponseReturnServerError() {
		Exception exception = new Exception("test");
		Response response = handler.toResponse(exception);
		assertEquals(response.getStatus(), Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
	}

}
