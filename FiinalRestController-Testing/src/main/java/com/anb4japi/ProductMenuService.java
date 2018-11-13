package com.anb4japi;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/getAllproducts")
public class ProductMenuService{
    private List<Product> Products = new ArrayList<Product>();
    public ProductMenuService(){
        Products.add(new Product("Hotel1","Estancia",200f,"Hotel todo incluido"));
        Products.add(new Product("Restaurante","Gastronomia",200f,"Hotel todo incluido"));
        Products.add(new Product("Relax & SPA","RelaX",200f,"Muchos Masajes y más"));
    }
  @GET
    @Path("/")
    @Produces({"application/json"})
    public Response index() {
        return Response.ok()
                .entity(Products)
                .build();
  }

  @GET
    @Path("/{id}")
    @Produces({"application/json"})
    public Response Product(@PathParam("id")int id) {
        return Response.ok()
                .entity(Products.get(id))
                .build();
  }

    @POST
    @Path("/")
    @Consumes({"application/json"})
    @Produces({"application/json"})
  public Response create (Product product) {
        Products.add(product);
        return Response.ok()
                .entity(product)
                .build();
    }

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces({"application/json"})
    public Response update(@PathParam("id") int id, Product product) {
        Products.set(id, product);
        return Response.ok()
                .entity(product)
                .build();
    }

    @DELETE
    @Path("/{id}")
    @Produces({ "application/json" })
    public Response delete(@PathParam("id") int id) {
       Product product = Products.get(id);
        Products.remove(id);
        return Response.ok()
                .entity(product)
                .build();
    }



}
