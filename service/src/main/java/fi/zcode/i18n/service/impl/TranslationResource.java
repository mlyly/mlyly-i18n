package fi.zcode.i18n.service.impl;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * REST Web Service
 *
 * @author mlyly
 */
@Path("translation")
public class TranslationResource {

    private static final Logger LOG = LoggerFactory.getLogger(TranslationResource.class);

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TranslationResource
     */
    public TranslationResource() {
        LOG.info("TranslationResource()");
    }

    /**
     * Retrieves representation of an instance of fi.zcode.i18n.service.impl.TranslationResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TranslationRDTO getJson() {
        LOG.info("getJson()");
        return new TranslationRDTO();
    }

    /**
     * PUT method for updating or creating an instance of TranslationResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(TranslationRDTO content) {
        LOG.info("putJson({})", content);
    }


}
