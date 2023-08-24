package com.venancio.daw.proyectoClaseSSNN;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import com.venancio.daw.proyectoClaseSSNN.model.Alumno;
import com.venancio.daw.proyectoClaseSSNN.service.CursosServices;

public class InsertarAlumnoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	super.doGet(request, response);

        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());

        ctx.setVariable("today", new Date());

        TemplateEngine engine = configThymeleaf.getTemplateEngine();

        engine.process("insertarAlumno", ctx, response.getWriter());
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {
    	
    	System.out.println("Recibo la info del formulario");
    	
    	request.setCharacterEncoding("UTF-8");
    	
        CursosServices cs = new CursosServices();
        
        Alumno a = new Alumno();
    	
    	try {
  
	        if(request.getParameter("codigoAlumno") != null) {
	        	a.setCodigoAlumno(Integer.valueOf(request.getParameter("codigoAlumno")));
	        }
	
	        if(request.getParameter("nombre") != null) {
	        	a.setNombre(request.getParameter("nombre"));
	        }
	        
	        if(request.getParameter("apellidos") != null) {
	        	a.setApellidos(request.getParameter("apellidos"));
	        }
	        
	        if(request.getParameter("telefono") != null) {
	        	a.setTelefono(request.getParameter("telefono"));
	        }
	
	        if(request.getParameter("fechaNacimiento") != null) {
	        	a.setFechaNacimiento(request.getParameter("fechaNacimiento"));
	        }
	
	        cs.anadirAlumo(a);

    	}catch(NumberFormatException e){
    		System.err.println("ERROR");
    	}finally {
    		response.sendRedirect(request.getRequestURI());
    	}        
    }   
}
