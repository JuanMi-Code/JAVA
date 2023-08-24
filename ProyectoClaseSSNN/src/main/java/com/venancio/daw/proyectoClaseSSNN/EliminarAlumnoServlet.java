package com.venancio.daw.proyectoClaseSSNN;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import com.venancio.daw.proyectoClaseSSNN.model.Alumno;
import com.venancio.daw.proyectoClaseSSNN.service.CursosServices;

public class EliminarAlumnoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	super.doGet(request, response);

        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());

        ctx.setVariable("today", new Date());
        
        TemplateEngine engine = configThymeleaf.getTemplateEngine();

        engine.process("eliminarAlumno", ctx, response.getWriter());
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	
    	System.out.println("Recibo la info del formulario");
    	
    	request.setCharacterEncoding("UTF-8");
    
        CursosServices cs = new CursosServices();
    	    	
    	try {
  
	        if(request.getParameter("codigoAlumno") != null) {
	        	cs.eliminarAlumno(Integer.valueOf(request.getParameter("codigoAlumno")));
	        }

    	}catch(NumberFormatException e){
    		System.err.println("ERROR");
    	}finally {
    		response.sendRedirect(request.getRequestURI());
    	}
    }
    
    
}
