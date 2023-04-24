// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.union;

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
import com.type.union.implementation.UnionClientImpl;
import com.type.union.models.ModelWithNamedUnionProperty;
import com.type.union.models.ModelWithSimpleUnionProperty;

/** Initializes a new instance of the synchronous UnionClient type. */
@ServiceClient(builder = UnionClientBuilder.class)
public final class UnionClient {
    @Generated private final UnionClientImpl serviceClient;

    /**
     * Initializes an instance of UnionClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    UnionClient(UnionClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The sendInt operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     simpleUnion: SimpleUnionModelBase (Required)
     * }
     * }</pre>
     *
     * @param input The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendIntWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.sendIntWithResponse(input, requestOptions);
    }

    /**
     * The sendIntArray operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     simpleUnion: SimpleUnionModelBase (Required)
     * }
     * }</pre>
     *
     * @param input The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendIntArrayWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.sendIntArrayWithResponse(input, requestOptions);
    }

    /**
     * The sendFirstNamedUnionValue operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     namedUnion: NamedUnionModelBase (Required)
     * }
     * }</pre>
     *
     * @param input The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendFirstNamedUnionValueWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.sendFirstNamedUnionValueWithResponse(input, requestOptions);
    }

    /**
     * The sendSecondNamedUnionValue operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     namedUnion: NamedUnionModelBase (Required)
     * }
     * }</pre>
     *
     * @param input The input parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendSecondNamedUnionValueWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.sendSecondNamedUnionValueWithResponse(input, requestOptions);
    }

    /**
     * The sendInt operation.
     *
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendInt(ModelWithSimpleUnionProperty input) {
        // Generated convenience method for sendIntWithResponse
        RequestOptions requestOptions = new RequestOptions();
        sendIntWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /**
     * The sendIntArray operation.
     *
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendIntArray(ModelWithSimpleUnionProperty input) {
        // Generated convenience method for sendIntArrayWithResponse
        RequestOptions requestOptions = new RequestOptions();
        sendIntArrayWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /**
     * The sendFirstNamedUnionValue operation.
     *
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendFirstNamedUnionValue(ModelWithNamedUnionProperty input) {
        // Generated convenience method for sendFirstNamedUnionValueWithResponse
        RequestOptions requestOptions = new RequestOptions();
        sendFirstNamedUnionValueWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /**
     * The sendSecondNamedUnionValue operation.
     *
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendSecondNamedUnionValue(ModelWithNamedUnionProperty input) {
        // Generated convenience method for sendSecondNamedUnionValueWithResponse
        RequestOptions requestOptions = new RequestOptions();
        sendSecondNamedUnionValueWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }
}