// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.core.lro.rpc.legacy.implementation;

import com._specs_.azure.core.lro.rpc.legacy.LegacyServiceVersion;
import com._specs_.azure.core.lro.rpc.legacy.models.JobResult;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.PollingStrategyOptions;
import com.azure.core.util.polling.SyncDefaultPollingStrategy;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.TypeReference;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the LegacyClient type. */
public final class LegacyClientImpl {
    /** The proxy service used to perform REST calls. */
    private final LegacyClientService service;

    /** Service version. */
    private final LegacyServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public LegacyServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of LegacyClient client.
     *
     * @param serviceVersion Service version.
     */
    public LegacyClientImpl(LegacyServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                serviceVersion);
    }

    /**
     * Initializes an instance of LegacyClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serviceVersion Service version.
     */
    public LegacyClientImpl(HttpPipeline httpPipeline, LegacyServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), serviceVersion);
    }

    /**
     * Initializes an instance of LegacyClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param serviceVersion Service version.
     */
    public LegacyClientImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, LegacyServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.serviceVersion = serviceVersion;
        this.service = RestProxy.create(LegacyClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for LegacyClient to be used by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    @ServiceInterface(name = "LegacyClient")
    public interface LegacyClientService {
        @Post("/azure/core/lro/rpc/legacy/create-resource-poll-via-operation-location/jobs")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> createJob(
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData jobData,
                RequestOptions requestOptions,
                Context context);

        @Post("/azure/core/lro/rpc/legacy/create-resource-poll-via-operation-location/jobs")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> createJobSync(
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData jobData,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Creates a Job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     comment: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     comment: String (Required)
     *     status: String(notStarted/running/succeeded/failed/canceled/partiallyCompleted) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     results (Optional): [
     *         String (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param jobData Data of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BinaryData>> createJobWithResponseAsync(BinaryData jobData, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createJob(
                                this.getServiceVersion().getVersion(), accept, jobData, requestOptions, context));
    }

    /**
     * Creates a Job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     comment: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     comment: String (Required)
     *     status: String(notStarted/running/succeeded/failed/canceled/partiallyCompleted) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     results (Optional): [
     *         String (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param jobData Data of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Response<BinaryData> createJobWithResponse(BinaryData jobData, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createJobSync(
                this.getServiceVersion().getVersion(), accept, jobData, requestOptions, Context.NONE);
    }

    /**
     * Creates a Job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     comment: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     comment: String (Required)
     *     status: String(notStarted/running/succeeded/failed/canceled/partiallyCompleted) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     results (Optional): [
     *         String (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param jobData Data of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateJobAsync(BinaryData jobData, RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.createJobWithResponseAsync(jobData, requestOptions),
                new DefaultPollingStrategy<>(
                        new PollingStrategyOptions(this.getHttpPipeline())
                                .setContext(
                                        requestOptions != null && requestOptions.getContext() != null
                                                ? requestOptions.getContext()
                                                : Context.NONE)
                                .setServiceVersion(this.getServiceVersion().getVersion())),
                TypeReference.createInstance(BinaryData.class),
                TypeReference.createInstance(BinaryData.class));
    }

    /**
     * Creates a Job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     comment: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     comment: String (Required)
     *     status: String(notStarted/running/succeeded/failed/canceled/partiallyCompleted) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     results (Optional): [
     *         String (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param jobData Data of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginCreateJob(BinaryData jobData, RequestOptions requestOptions) {
        return SyncPoller.createPoller(
                Duration.ofSeconds(1),
                () -> this.createJobWithResponse(jobData, requestOptions),
                new SyncDefaultPollingStrategy<>(
                        new PollingStrategyOptions(this.getHttpPipeline())
                                .setContext(
                                        requestOptions != null && requestOptions.getContext() != null
                                                ? requestOptions.getContext()
                                                : Context.NONE)
                                .setServiceVersion(this.getServiceVersion().getVersion())),
                TypeReference.createInstance(BinaryData.class),
                TypeReference.createInstance(BinaryData.class));
    }

    /**
     * Creates a Job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     comment: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     comment: String (Required)
     *     status: String(notStarted/running/succeeded/failed/canceled/partiallyCompleted) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     results (Optional): [
     *         String (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param jobData Data of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<JobResult, JobResult> beginCreateJobWithModelAsync(
            BinaryData jobData, RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.createJobWithResponseAsync(jobData, requestOptions),
                new DefaultPollingStrategy<>(
                        new PollingStrategyOptions(this.getHttpPipeline())
                                .setContext(
                                        requestOptions != null && requestOptions.getContext() != null
                                                ? requestOptions.getContext()
                                                : Context.NONE)
                                .setServiceVersion(this.getServiceVersion().getVersion())),
                TypeReference.createInstance(JobResult.class),
                TypeReference.createInstance(JobResult.class));
    }

    /**
     * Creates a Job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     comment: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     comment: String (Required)
     *     status: String(notStarted/running/succeeded/failed/canceled/partiallyCompleted) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     results (Optional): [
     *         String (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param jobData Data of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<JobResult, JobResult> beginCreateJobWithModel(BinaryData jobData, RequestOptions requestOptions) {
        return SyncPoller.createPoller(
                Duration.ofSeconds(1),
                () -> this.createJobWithResponse(jobData, requestOptions),
                new SyncDefaultPollingStrategy<>(
                        new PollingStrategyOptions(this.getHttpPipeline())
                                .setContext(
                                        requestOptions != null && requestOptions.getContext() != null
                                                ? requestOptions.getContext()
                                                : Context.NONE)
                                .setServiceVersion(this.getServiceVersion().getVersion())),
                TypeReference.createInstance(JobResult.class),
                TypeReference.createInstance(JobResult.class));
    }
}
