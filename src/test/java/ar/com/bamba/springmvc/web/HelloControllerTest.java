package ar.com.bamba.springmvc.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTest {

	@Test
	public void testHandleRequestView(){
		
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello.jsp", modelAndView.getViewName());
	}
	
}
