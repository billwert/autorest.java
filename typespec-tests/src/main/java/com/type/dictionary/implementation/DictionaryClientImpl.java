// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.dictionary.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the DictionaryClient type. */
public final class DictionaryClientImpl {
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

    /** The Int32ValuesImpl object to access its operations. */
    private final Int32ValuesImpl int32Values;

    /**
     * Gets the Int32ValuesImpl object to access its operations.
     *
     * @return the Int32ValuesImpl object.
     */
    public Int32ValuesImpl getInt32Values() {
        return this.int32Values;
    }

    /** The Int64ValuesImpl object to access its operations. */
    private final Int64ValuesImpl int64Values;

    /**
     * Gets the Int64ValuesImpl object to access its operations.
     *
     * @return the Int64ValuesImpl object.
     */
    public Int64ValuesImpl getInt64Values() {
        return this.int64Values;
    }

    /** The BooleanValuesImpl object to access its operations. */
    private final BooleanValuesImpl booleanValues;

    /**
     * Gets the BooleanValuesImpl object to access its operations.
     *
     * @return the BooleanValuesImpl object.
     */
    public BooleanValuesImpl getBooleanValues() {
        return this.booleanValues;
    }

    /** The StringValuesImpl object to access its operations. */
    private final StringValuesImpl stringValues;

    /**
     * Gets the StringValuesImpl object to access its operations.
     *
     * @return the StringValuesImpl object.
     */
    public StringValuesImpl getStringValues() {
        return this.stringValues;
    }

    /** The Float32ValuesImpl object to access its operations. */
    private final Float32ValuesImpl float32Values;

    /**
     * Gets the Float32ValuesImpl object to access its operations.
     *
     * @return the Float32ValuesImpl object.
     */
    public Float32ValuesImpl getFloat32Values() {
        return this.float32Values;
    }

    /** The DatetimeValuesImpl object to access its operations. */
    private final DatetimeValuesImpl datetimeValues;

    /**
     * Gets the DatetimeValuesImpl object to access its operations.
     *
     * @return the DatetimeValuesImpl object.
     */
    public DatetimeValuesImpl getDatetimeValues() {
        return this.datetimeValues;
    }

    /** The DurationValuesImpl object to access its operations. */
    private final DurationValuesImpl durationValues;

    /**
     * Gets the DurationValuesImpl object to access its operations.
     *
     * @return the DurationValuesImpl object.
     */
    public DurationValuesImpl getDurationValues() {
        return this.durationValues;
    }

    /** The UnknownValuesImpl object to access its operations. */
    private final UnknownValuesImpl unknownValues;

    /**
     * Gets the UnknownValuesImpl object to access its operations.
     *
     * @return the UnknownValuesImpl object.
     */
    public UnknownValuesImpl getUnknownValues() {
        return this.unknownValues;
    }

    /** The ModelValuesImpl object to access its operations. */
    private final ModelValuesImpl modelValues;

    /**
     * Gets the ModelValuesImpl object to access its operations.
     *
     * @return the ModelValuesImpl object.
     */
    public ModelValuesImpl getModelValues() {
        return this.modelValues;
    }

    /** The RecursiveModelValuesImpl object to access its operations. */
    private final RecursiveModelValuesImpl recursiveModelValues;

    /**
     * Gets the RecursiveModelValuesImpl object to access its operations.
     *
     * @return the RecursiveModelValuesImpl object.
     */
    public RecursiveModelValuesImpl getRecursiveModelValues() {
        return this.recursiveModelValues;
    }

    /** The NullableFloatValuesImpl object to access its operations. */
    private final NullableFloatValuesImpl nullableFloatValues;

    /**
     * Gets the NullableFloatValuesImpl object to access its operations.
     *
     * @return the NullableFloatValuesImpl object.
     */
    public NullableFloatValuesImpl getNullableFloatValues() {
        return this.nullableFloatValues;
    }

    /** Initializes an instance of DictionaryClient client. */
    public DictionaryClientImpl() {
        this(
                new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
                JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of DictionaryClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public DictionaryClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of DictionaryClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     */
    public DictionaryClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.int32Values = new Int32ValuesImpl(this);
        this.int64Values = new Int64ValuesImpl(this);
        this.booleanValues = new BooleanValuesImpl(this);
        this.stringValues = new StringValuesImpl(this);
        this.float32Values = new Float32ValuesImpl(this);
        this.datetimeValues = new DatetimeValuesImpl(this);
        this.durationValues = new DurationValuesImpl(this);
        this.unknownValues = new UnknownValuesImpl(this);
        this.modelValues = new ModelValuesImpl(this);
        this.recursiveModelValues = new RecursiveModelValuesImpl(this);
        this.nullableFloatValues = new NullableFloatValuesImpl(this);
    }
}
