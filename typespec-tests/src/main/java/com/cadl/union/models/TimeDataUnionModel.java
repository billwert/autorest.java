// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.union.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;

/** The TimeDataUnionModel model. */
@Immutable
public final class TimeDataUnionModel extends DataUnionModelBase {
    private final OffsetDateTime value;

    /**
     * Creates an instance of TimeDataUnionModel class.
     *
     * @param value the value.
     */
    public TimeDataUnionModel(OffsetDateTime value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value.
     */
    @JsonValue
    public OffsetDateTime getValue() {
        return this.value;
    }
}