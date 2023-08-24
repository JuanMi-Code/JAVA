package com.venancio.daw.proyectoClaseSSNN;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

public class EquipoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	super.doGet(request, response);

        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        
        ctx.setVariable("today", new Date());
        
        TemplateEngine engine = configThymeleaf.getTemplateEngine();

        engine.process("Equipo", ctx, response.getWriter());

    }
}
