// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.arrays.itemtypes;

import com.arrays.itemtypes.implementation.ModelValuesImpl;
import com.arrays.itemtypes.models.InnerModel;
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
import com.azure.core.util.serializer.TypeReference;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ItemTypesClient type. */
@ServiceClient(builder = ItemTypesClientBuilder.class, isAsync = true)
public final class ModelValueAsyncClient {
    @Generated private final ModelValuesImpl serviceClient;

    /**
     * Initializes an instance of ModelValueAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ModelValueAsyncClient(ModelValuesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The get operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         property: String (Required)
     *         children (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return array of InnerModel along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(requestOptions);
    }

    /**
     * The put operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         property: String (Required)
     *         children (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * ]
     * }</pre>
     *
     * @param body Array of InnerModel.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.putWithResponseAsync(body, requestOptions);
    }

    /**
     * The get operation.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of InnerModel on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<InnerModel>> get() {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(TYPE_REFERENCE_LIST_INNER_MODEL));
    }

    /**
     * The put operation.
     *
     * @param body Array of InnerModel.
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
    public Mono<Void> put(List<InnerModel> body) {
        // Generated convenience method for putWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return putWithResponse(BinaryData.fromObject(body), requestOptions).flatMap(FluxUtil::toMono);
    }

    @Generated
    private static final TypeReference<List<InnerModel>> TYPE_REFERENCE_LIST_INNER_MODEL =
            new TypeReference<List<InnerModel>>() {};
}