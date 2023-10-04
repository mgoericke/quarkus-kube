package de.javamark;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://server/hello")
public interface ExampleService {
    @GET
    Response get();
}
