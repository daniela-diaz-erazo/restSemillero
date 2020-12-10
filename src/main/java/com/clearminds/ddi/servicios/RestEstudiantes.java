package com.clearminds.ddi.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.ddi.dtos.Estudiante;
import com.clearminds.ddi.excepciones.BDDException;
import com.clearminds.servicios.ServicioEstudiante;

@Path("/estudiantes")
public class RestEstudiantes {
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante) {
		estudiante.toString();
		ServicioEstudiante servicio = new ServicioEstudiante();
		try {
			servicio.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}

	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Estudiante actualizar(Estudiante estudiante) {
		estudiante.toString();
		ServicioEstudiante servicio = new ServicioEstudiante();
		try {

			servicio.actualizarEstudiante(estudiante);

		} catch (BDDException e) {
			e.printStackTrace();
		}
		return estudiante;
	}

}
