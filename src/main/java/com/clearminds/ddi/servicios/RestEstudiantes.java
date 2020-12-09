package com.clearminds.ddi.servicios;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.ddi.dtos.Estudiante;
@Path("/estudiantes")
public class RestEstudiantes {
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		estudiante.toString();
		System.out.println(estudiante);
	}
	

}
