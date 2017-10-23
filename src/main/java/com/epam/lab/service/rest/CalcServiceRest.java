package com.epam.lab.service.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 */

@Path("/calc")
public class CalcServiceRest {
    @GET
    @Path("/plus/{firstN}/{secondN}")
    @Produces(MediaType.APPLICATION_JSON)
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Calc plus(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
        return CalcDAO.plus(firstN, secondN);
    }

    @GET
    @Path("/minus/{firstN}/{secondN}")
    @Produces(MediaType.APPLICATION_JSON)
    public Calc minus(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
        return CalcDAO.minus(firstN, secondN);
    }

    @GET
    @Path("/division/{firstN}/{secondN}")
    @Produces(MediaType.APPLICATION_JSON)
    public Calc division(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
        return CalcDAO.division(firstN, secondN);
    }

    @GET
    @Path("/multiple/{firstN}/{secondN}")
    @Produces(MediaType.APPLICATION_JSON)
    public Calc multiple(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
        return CalcDAO.multiple(firstN, secondN);
    }

    @GET
    @Path("/percent/{firstN}/{secondN}")
    @Produces(MediaType.APPLICATION_JSON)
    public Calc percent(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
        return CalcDAO.percent(firstN, secondN);
    }
}
