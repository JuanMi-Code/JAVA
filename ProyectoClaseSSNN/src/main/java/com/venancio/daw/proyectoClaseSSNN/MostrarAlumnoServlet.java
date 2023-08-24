package com.venancio.daw.proyectoClaseSSNN;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

public class MostrarAlumnoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	 
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	
	    	super.doGet(request, response);

	        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
	        
	        ctx.setVariable("today", new Date());
	        
	        TemplateEngine engine = configThymeleaf.getTemplateEngine();
	        
	        engine.process("mostrarAlumno", ctx, response.getWriter());

	    }
	    
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {

	    	
	    	System.out.println("Recibo la info del formulario");
	    	
	    	request.setCharacterEncoding("UTF-8");  
	    	int codigoAl = 0;
	    	try {
	  
		        if(request.getParameter("codigoAlumno") != null) {
		        	codigoAl = Integer.valueOf(request.getParameter("codigoAlumno"));
		        }		        

	    	}catch(NumberFormatException e){
	    		System.err.println("ERROR");
	    	}finally {
	    		
	    		request.setAttribute("idAlumno",codigoAl);
	    		
	    		RequestDispatcher dispatcher = request.getRequestDispatcher("mostrarAlumnoListado");
	    		dispatcher.forward(request, response);
	    	}	        
	    }	    
}
