package fixtures.bodycomplex.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Readonlyproperties. */
public final class ReadonlypropertiesImpl {
    /** The proxy service used to perform REST calls. */
    private final ReadonlypropertiesService service;

    /** The service client containing this operation class. */
    private final AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of ReadonlypropertiesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReadonlypropertiesImpl(AutoRestComplexTestServiceImpl client) {
        this.service =
                RestProxy.create(
                        ReadonlypropertiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestComplexTestServiceReadonlyproperties to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestComplexTestS")
    private interface ReadonlypropertiesService {
        @Get("/complex/readonlyproperty/valid")
        Mono<Response<BinaryData>> getValid(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/readonlyproperty/valid")
        Mono<Response<Void>> putValid(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get complex types that have readonly properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that have readonly properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getValid(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types that have readonly properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that have readonly properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getValid(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types that have readonly properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that have readonly properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getValidWithResponse(RequestOptions requestOptions, Context context) {
        return getValidWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types that have readonly properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
     * }
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putValid(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types that have readonly properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
     * }
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putValid(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
     * }
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putValidWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putValidWithResponseAsync(complexBody, requestOptions, context).block();
    }
}