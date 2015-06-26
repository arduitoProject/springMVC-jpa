package ar.com.bamba.springmvc.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
		
		logger.info("retornando hello.jsp");
		return new ModelAndView("hello.jsp");
	}
	
	
	
	public static void main(String[] args) {
		
		Date julio = new Date(2015, 07, 01);
		Date fin = new Date(2006, 06, 01);
		
		System.out.println("ida: " + julio);
		System.out.println("fin de año: " + fin);

		final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
		
		
		java.util.Date fechaAnterior, fechaPosterior;
		
		fechaAnterior = fin;
		fechaPosterior = julio;
		
		long diferencia = ( fechaAnterior.getTime() - fechaPosterior.getTime() )/ MILLSECS_PER_DAY;
		
		System.out.println(diferencia);
		
		
		
		   int m1 = fin.getYear() * 12 + fin.getMonth();
		    int m2 = julio.getYear() * 12 + julio.getMonth();
		    int cal = m2 - m1 + 1;
		    
		    System.out.println("meses: " + cal );
		
		
	}
	
}
