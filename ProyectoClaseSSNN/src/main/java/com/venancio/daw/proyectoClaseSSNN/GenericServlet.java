package com.venancio.daw.proyectoClaseSSNN;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.venancio.daw.proyectoClaseSSNN.config.ThymeleafConfig;
import com.venancio.daw.proyectoClaseSSNN.utils.DBConnection;

public class GenericServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected ThymeleafConfig configThymeleaf;
    protected ServletContext servletContext;

    @Override
    public void init(ServletConfig config) throws ServletException {
        servletContext = config.getServletContext();
        // Instanciamos la clase que nos permite ejecutar la primera plantilla
        configThymeleaf = new ThymeleafConfig(servletContext);

    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	// Configuramos las cabeceras de las respuestas web.
        response.setContentType("text/html;charset=UTF-8");
        // Evitamos el cacheo de información
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
    }
    
    @Override
    public void destroy() {
    	DBConnection.getInstance().destroyConnection();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response, int id)
			throws ServletException, IOException {
    	// Configuramos las cabeceras de las respuestas web.
        response.setContentType("text/html;charset=UTF-8");
        // Evitamos el cacheo de información
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
		
	}

}
