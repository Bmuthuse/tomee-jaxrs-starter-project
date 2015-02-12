package org.superbiz;

/**
 * Created by bmuthuse on 2/11/15.
 */

import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/NewService")
@Singleton
public class NewService {
    public NewService(){}

    @Path("author")
    @GET
    @Produces({ APPLICATION_JSON })
    public Author getAuthor() {

        return new Author("test1", 11);}

}
