/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import fixtures.url.models.ErrorException;
import fixtures.url.models.UriColor;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in
 * Paths.
 */
public interface Paths {
    /**
     * Get true Boolean value on path.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getBooleanTrue();

    /**
     * Get true Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> getBooleanTrueAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get true Boolean value on path.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> getBooleanTrueWithRestResponseAsync();

    /**
     * Get true Boolean value on path.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable getBooleanTrueAsync();

    /**
     * Get false Boolean value on path.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getBooleanFalse();

    /**
     * Get false Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> getBooleanFalseAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value on path.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> getBooleanFalseWithRestResponseAsync();

    /**
     * Get false Boolean value on path.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable getBooleanFalseAsync();

    /**
     * Get '1000000' integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getIntOneMillion();

    /**
     * Get '1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> getIntOneMillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '1000000' integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> getIntOneMillionWithRestResponseAsync();

    /**
     * Get '1000000' integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable getIntOneMillionAsync();

    /**
     * Get '-1000000' integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getIntNegativeOneMillion();

    /**
     * Get '-1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> getIntNegativeOneMillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1000000' integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> getIntNegativeOneMillionWithRestResponseAsync();

    /**
     * Get '-1000000' integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable getIntNegativeOneMillionAsync();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getTenBillion();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> getTenBillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> getTenBillionWithRestResponseAsync();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable getTenBillionAsync();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getNegativeTenBillion();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> getNegativeTenBillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> getNegativeTenBillionWithRestResponseAsync();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable getNegativeTenBillionAsync();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void floatScientificPositive();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> floatScientificPositiveAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '1.034E+20' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> floatScientificPositiveWithRestResponseAsync();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable floatScientificPositiveAsync();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void floatScientificNegative();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> floatScientificNegativeAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> floatScientificNegativeWithRestResponseAsync();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable floatScientificNegativeAsync();

    /**
     * Get '9999999.999' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void doubleDecimalPositive();

    /**
     * Get '9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> doubleDecimalPositiveAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '9999999.999' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> doubleDecimalPositiveWithRestResponseAsync();

    /**
     * Get '9999999.999' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable doubleDecimalPositiveAsync();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void doubleDecimalNegative();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> doubleDecimalNegativeAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-9999999.999' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> doubleDecimalNegativeWithRestResponseAsync();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable doubleDecimalNegativeAsync();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringUnicode();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> stringUnicodeAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> stringUnicodeWithRestResponseAsync();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable stringUnicodeAsync();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringUrlEncoded();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> stringUrlEncodedAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> stringUrlEncodedWithRestResponseAsync();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable stringUrlEncodedAsync();

    /**
     * Get ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringEmpty();

    /**
     * Get ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> stringEmptyAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> stringEmptyWithRestResponseAsync();

    /**
     * Get ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable stringEmptyAsync();

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringNull(@NonNull String stringPath);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> stringNullAsync(@NonNull String stringPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> stringNullWithRestResponseAsync(@NonNull String stringPath);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable stringNullAsync(@NonNull String stringPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enumValid(@NonNull UriColor enumPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> enumValidAsync(@NonNull UriColor enumPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> enumValidWithRestResponseAsync(@NonNull UriColor enumPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable enumValidAsync(@NonNull UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enumNull(@NonNull UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> enumNullAsync(@NonNull UriColor enumPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> enumNullWithRestResponseAsync(@NonNull UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable enumNullAsync(@NonNull UriColor enumPath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void byteMultiByte(@NonNull byte[] bytePath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> byteMultiByteAsync(@NonNull byte[] bytePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> byteMultiByteWithRestResponseAsync(@NonNull byte[] bytePath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable byteMultiByteAsync(@NonNull byte[] bytePath);

    /**
     * Get '' as byte array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void byteEmpty();

    /**
     * Get '' as byte array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> byteEmptyAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '' as byte array.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> byteEmptyWithRestResponseAsync();

    /**
     * Get '' as byte array.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable byteEmptyAsync();

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void byteNull(@NonNull byte[] bytePath);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> byteNullAsync(@NonNull byte[] bytePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> byteNullWithRestResponseAsync(@NonNull byte[] bytePath);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable byteNullAsync(@NonNull byte[] bytePath);

    /**
     * Get '2012-01-01' as date.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateValid();

    /**
     * Get '2012-01-01' as date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> dateValidAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01' as date.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> dateValidWithRestResponseAsync();

    /**
     * Get '2012-01-01' as date.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable dateValidAsync();

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateNull(@NonNull LocalDate datePath);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> dateNullAsync(@NonNull LocalDate datePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> dateNullWithRestResponseAsync(@NonNull LocalDate datePath);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable dateNullAsync(@NonNull LocalDate datePath);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateTimeValid();

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> dateTimeValidAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> dateTimeValidWithRestResponseAsync();

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable dateTimeValidAsync();

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateTimeNull(@NonNull OffsetDateTime dateTimePath);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> dateTimeNullAsync(@NonNull OffsetDateTime dateTimePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> dateTimeNullWithRestResponseAsync(@NonNull OffsetDateTime dateTimePath);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable dateTimeNullAsync(@NonNull OffsetDateTime dateTimePath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void base64Url(@NonNull byte[] base64UrlPath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> base64UrlAsync(@NonNull byte[] base64UrlPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> base64UrlWithRestResponseAsync(@NonNull byte[] base64UrlPath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable base64UrlAsync(@NonNull byte[] base64UrlPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void arrayCsvInPath(@NonNull List<String> arrayPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> arrayCsvInPathAsync(@NonNull List<String> arrayPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> arrayCsvInPathWithRestResponseAsync(@NonNull List<String> arrayPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable arrayCsvInPathAsync(@NonNull List<String> arrayPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unixTimeUrl(@NonNull OffsetDateTime unixTimeUrlPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> unixTimeUrlAsync(@NonNull OffsetDateTime unixTimeUrlPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> unixTimeUrlWithRestResponseAsync(@NonNull OffsetDateTime unixTimeUrlPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable unixTimeUrlAsync(@NonNull OffsetDateTime unixTimeUrlPath);
}
