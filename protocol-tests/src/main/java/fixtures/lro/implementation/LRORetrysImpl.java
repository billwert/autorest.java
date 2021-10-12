package fixtures.lro.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.serializer.TypeReference;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LRORetrys. */
public final class LRORetrysImpl {
    /** The proxy service used to perform REST calls. */
    private final LRORetrysService service;

    /** The service client containing this operation class. */
    private final AutoRestLongRunningOperationTestServiceImpl client;

    /**
     * Initializes an instance of LRORetrysImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LRORetrysImpl(AutoRestLongRunningOperationTestServiceImpl client) {
        this.service =
                RestProxy.create(LRORetrysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestLongRunningOperationTestServiceLRORetrys to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestLongRunningO")
    private interface LRORetrysService {
        @Put("/lro/retryerror/put/201/creating/succeeded/200")
        Mono<Response<BinaryData>> put201CreatingSucceeded200(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/lro/retryerror/putasync/retry/succeeded")
        Mono<Response<BinaryData>> putAsyncRelativeRetrySucceeded(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Delete("/lro/retryerror/delete/provisioning/202/accepted/200/succeeded")
        Mono<Response<BinaryData>> deleteProvisioning202Accepted200Succeeded(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Delete("/lro/retryerror/delete/202/retry/200")
        Mono<Response<Void>> delete202Retry200(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Delete("/lro/retryerror/deleteasync/retry/succeeded")
        Mono<Response<Void>> deleteAsyncRelativeRetrySucceeded(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/lro/retryerror/post/202/retry/200")
        Mono<Response<Void>> post202Retry200(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/lro/retryerror/postasync/retry/succeeded")
        Mono<Response<Void>> postAsyncRelativeRetrySucceeded(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> put201CreatingSucceeded200WithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.put201CreatingSucceeded200(this.client.getHost(), requestOptions, context));
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> put201CreatingSucceeded200WithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.put201CreatingSucceeded200(this.client.getHost(), requestOptions, context);
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPut201CreatingSucceeded200Async(RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.put201CreatingSucceeded200WithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPut201CreatingSucceeded200Async(
            RequestOptions requestOptions, Context context) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.put201CreatingSucceeded200WithResponseAsync(requestOptions, context),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginPut201CreatingSucceeded200(
            RequestOptions requestOptions, Context context) {
        return this.beginPut201CreatingSucceeded200Async(requestOptions, context).getSyncPoller();
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putAsyncRelativeRetrySucceededWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putAsyncRelativeRetrySucceeded(this.client.getHost(), requestOptions, context));
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putAsyncRelativeRetrySucceededWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.putAsyncRelativeRetrySucceeded(this.client.getHost(), requestOptions, context);
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPutAsyncRelativeRetrySucceededAsync(RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.putAsyncRelativeRetrySucceededWithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPutAsyncRelativeRetrySucceededAsync(
            RequestOptions requestOptions, Context context) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.putAsyncRelativeRetrySucceededWithResponseAsync(requestOptions, context),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginPutAsyncRelativeRetrySucceeded(
            RequestOptions requestOptions, Context context) {
        return this.beginPutAsyncRelativeRetrySucceededAsync(requestOptions, context).getSyncPoller();
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> deleteProvisioning202Accepted200SucceededWithResponseAsync(
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.deleteProvisioning202Accepted200Succeeded(
                                this.client.getHost(), requestOptions, context));
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> deleteProvisioning202Accepted200SucceededWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.deleteProvisioning202Accepted200Succeeded(this.client.getHost(), requestOptions, context);
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeleteProvisioning202Accepted200SucceededAsync(
            RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.deleteProvisioning202Accepted200SucceededWithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeleteProvisioning202Accepted200SucceededAsync(
            RequestOptions requestOptions, Context context) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.deleteProvisioning202Accepted200SucceededWithResponseAsync(requestOptions, context),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginDeleteProvisioning202Accepted200Succeeded(
            RequestOptions requestOptions, Context context) {
        return this.beginDeleteProvisioning202Accepted200SucceededAsync(requestOptions, context).getSyncPoller();
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> delete202Retry200WithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.delete202Retry200(this.client.getHost(), requestOptions, context));
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> delete202Retry200WithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.delete202Retry200(this.client.getHost(), requestOptions, context);
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDelete202Retry200Async(RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.delete202Retry200WithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDelete202Retry200Async(
            RequestOptions requestOptions, Context context) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.delete202Retry200WithResponseAsync(requestOptions, context),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginDelete202Retry200(RequestOptions requestOptions, Context context) {
        return this.beginDelete202Retry200Async(requestOptions, context).getSyncPoller();
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteAsyncRelativeRetrySucceededWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.deleteAsyncRelativeRetrySucceeded(this.client.getHost(), requestOptions, context));
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteAsyncRelativeRetrySucceededWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.deleteAsyncRelativeRetrySucceeded(this.client.getHost(), requestOptions, context);
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeleteAsyncRelativeRetrySucceededAsync(
            RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.deleteAsyncRelativeRetrySucceededWithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeleteAsyncRelativeRetrySucceededAsync(
            RequestOptions requestOptions, Context context) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.deleteAsyncRelativeRetrySucceededWithResponseAsync(requestOptions, context),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginDeleteAsyncRelativeRetrySucceeded(
            RequestOptions requestOptions, Context context) {
        return this.beginDeleteAsyncRelativeRetrySucceededAsync(requestOptions, context).getSyncPoller();
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> post202Retry200WithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.post202Retry200(this.client.getHost(), requestOptions, context));
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> post202Retry200WithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.post202Retry200(this.client.getHost(), requestOptions, context);
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPost202Retry200Async(RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.post202Retry200WithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPost202Retry200Async(
            RequestOptions requestOptions, Context context) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.post202Retry200WithResponseAsync(requestOptions, context),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginPost202Retry200(RequestOptions requestOptions, Context context) {
        return this.beginPost202Retry200Async(requestOptions, context).getSyncPoller();
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postAsyncRelativeRetrySucceededWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.postAsyncRelativeRetrySucceeded(this.client.getHost(), requestOptions, context));
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postAsyncRelativeRetrySucceededWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.postAsyncRelativeRetrySucceeded(this.client.getHost(), requestOptions, context);
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPostAsyncRelativeRetrySucceededAsync(RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.postAsyncRelativeRetrySucceededWithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPostAsyncRelativeRetrySucceededAsync(
            RequestOptions requestOptions, Context context) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.postAsyncRelativeRetrySucceededWithResponseAsync(requestOptions, context),
                new DefaultPollingStrategy<>(this.client.getHttpPipeline()),
                new TypeReferenceBinaryData(),
                new TypeReferenceBinaryData());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     type: String
     *     tags: {
     *         String: String
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         provisioningState: String
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginPostAsyncRelativeRetrySucceeded(
            RequestOptions requestOptions, Context context) {
        return this.beginPostAsyncRelativeRetrySucceededAsync(requestOptions, context).getSyncPoller();
    }

    private static final class TypeReferenceBinaryData extends TypeReference<BinaryData> {}
}
