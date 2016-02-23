/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author prodigy4440
 */
@Stateless
@Path("demo")
public class DemoAPI {

  @Context
  private ResourceContext resourceContext;

  @Context
  private UriInfo uriInfo;

  @Inject
  private Service service;

  @GET
  @Path("application")
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public Response getApplication() {
    return Response.ok(uriInfo).build();
  }

  @GET
  @Path("icustomer")
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public Response insertCustomer() {
    return Response.ok(uriInfo.toString()).build();
  }

}
