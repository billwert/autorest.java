// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.encode.duration;

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
import com.azure.core.util.FluxUtil;
import com.encode.duration.implementation.HeadersImpl;
import java.time.Duration;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous DurationClient type. */
@ServiceClient(builder = DurationClientBuilder.class, isAsync = true)
public final class HeaderAsyncClient {
    @Generated private final HeadersImpl serviceClient;

    /**
     * Initializes an instance of HeaderAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    HeaderAsyncClient(HeadersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The defaultMethod operation.
     *
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> defaultMethodWithResponse(Duration duration, RequestOptions requestOptions) {
        return this.serviceClient.defaultMethodWithResponseAsync(duration, requestOptions);
    }

    /**
     * The iso8601 operation.
     *
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> iso8601WithResponse(Duration duration, RequestOptions requestOptions) {
        return this.serviceClient.iso8601WithResponseAsync(duration, requestOptions);
    }

    /**
     * The iso8601Array operation.
     *
     * @param duration Array of Duration.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> iso8601ArrayWithResponse(List<Duration> duration, RequestOptions requestOptions) {
        return this.serviceClient.iso8601ArrayWithResponseAsync(duration, requestOptions);
    }

    /**
     * The int32Seconds operation.
     *
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> int32SecondsWithResponse(Duration duration, RequestOptions requestOptions) {
        return this.serviceClient.int32SecondsWithResponseAsync(duration, requestOptions);
    }

    /**
     * The floatSeconds operation.
     *
     * @param duration The duration parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> floatSecondsWithResponse(Duration duration, RequestOptions requestOptions) {
        return this.serviceClient.floatSecondsWithResponseAsync(duration, requestOptions);
    }

    /**
     * The defaultMethod operation.
     *
     * @param duration The duration parameter.
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
    public Mono<Void> defaultMethod(Duration duration) {
        // Generated convenience method for defaultMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return defaultMethodWithResponse(duration, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The iso8601 operation.
     *
     * @param duration The duration parameter.
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
    public Mono<Void> iso8601(Duration duration) {
        // Generated convenience method for iso8601WithResponse
        RequestOptions requestOptions = new RequestOptions();
        return iso8601WithResponse(duration, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The iso8601Array operation.
     *
     * @param duration Array of Duration.
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
    public Mono<Void> iso8601Array(List<Duration> duration) {
        // Generated convenience method for iso8601ArrayWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return iso8601ArrayWithResponse(duration, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The int32Seconds operation.
     *
     * @param duration The duration parameter.
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
    public Mono<Void> int32Seconds(Duration duration) {
        // Generated convenience method for int32SecondsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return int32SecondsWithResponse(duration, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The floatSeconds operation.
     *
     * @param duration The duration parameter.
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
    public Mono<Void> floatSeconds(Duration duration) {
        // Generated convenience method for floatSecondsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return floatSecondsWithResponse(duration, requestOptions).flatMap(FluxUtil::toMono);
    }
}
