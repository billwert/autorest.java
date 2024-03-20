// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.client.naming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import com.client.naming.implementation.UnionEnumsImpl;
import com.client.naming.models.ClientExtensibleEnum;
import com.client.naming.models.ExtensibleEnum;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous NamingClient type.
 */
@ServiceClient(builder = NamingClientBuilder.class, isAsync = true)
public final class UnionEnumAsyncClient {
    @Generated
    private final UnionEnumsImpl serviceClient;

    /**
     * Initializes an instance of UnionEnumAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    UnionEnumAsyncClient(UnionEnumsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The unionEnumName operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * String(value1)
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> unionEnumNameWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.unionEnumNameWithResponseAsync(body, requestOptions);
    }

    /**
     * The unionEnumMemberName operation.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * String(value1/value2)
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> unionEnumMemberNameWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.unionEnumMemberNameWithResponseAsync(body, requestOptions);
    }

    /**
     * The unionEnumName operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> unionEnumName(ClientExtensibleEnum body) {
        // Generated convenience method for unionEnumNameWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return unionEnumNameWithResponse(BinaryData.fromObject(body == null ? null : body.toString()), requestOptions)
            .flatMap(FluxUtil::toMono);
    }

    /**
     * The unionEnumMemberName operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> unionEnumMemberName(ExtensibleEnum body) {
        // Generated convenience method for unionEnumMemberNameWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return unionEnumMemberNameWithResponse(BinaryData.fromObject(body == null ? null : body.toString()),
            requestOptions).flatMap(FluxUtil::toMono);
    }
}