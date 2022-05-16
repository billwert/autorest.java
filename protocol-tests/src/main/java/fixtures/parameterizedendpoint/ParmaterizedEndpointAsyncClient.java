// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.parameterizedendpoint;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.parameterizedendpoint.implementation.ParmaterizedEndpointClientImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ParmaterizedEndpointClient type. */
@ServiceClient(builder = ParmaterizedEndpointClientBuilder.class, isAsync = true)
public final class ParmaterizedEndpointAsyncClient {
    @Generated private final ParmaterizedEndpointClientImpl serviceClient;

    /**
     * Initializes an instance of ParmaterizedEndpointAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ParmaterizedEndpointAsyncClient(ParmaterizedEndpointClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Basic get to make sure base url formatting of 'endpoint' works.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(requestOptions);
    }

    /**
     * Sends the {@code httpRequest}.
     *
     * @param httpRequest The HTTP request to send.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> sendRequest(HttpRequest httpRequest) {
        return this.serviceClient.sendRequestAsync(httpRequest);
    }

    /**
     * Gets the service endpoint that the client is connected to.
     *
     * @return the service endpoint that the client is connected to.
     */
    public String getEndpoint() {
        return this.serviceClient.getEndpoint();
    }
}
