// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.nestedmodelsbasic.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Round-trip model with nested model properties. */
@Immutable
public final class RoundTripModel {
    /*
     * Required nested round-trip model.
     */
    @JsonProperty(value = "NestedRoundTripModel", required = true)
    private NestedRoundTripOnlyModel nestedRoundTripModel;

    /*
     * Required nested shared model.
     */
    @JsonProperty(value = "NestedSharedModel", required = true)
    private NestedRoundTripSharedModel nestedSharedModel;

    /**
     * Creates an instance of RoundTripModel class.
     *
     * @param nestedRoundTripModel the nestedRoundTripModel value to set.
     * @param nestedSharedModel the nestedSharedModel value to set.
     */
    @JsonCreator
    public RoundTripModel(
            @JsonProperty(value = "NestedRoundTripModel", required = true)
                    NestedRoundTripOnlyModel nestedRoundTripModel,
            @JsonProperty(value = "NestedSharedModel", required = true) NestedRoundTripSharedModel nestedSharedModel) {
        this.nestedRoundTripModel = nestedRoundTripModel;
        this.nestedSharedModel = nestedSharedModel;
    }

    /**
     * Get the nestedRoundTripModel property: Required nested round-trip model.
     *
     * @return the nestedRoundTripModel value.
     */
    public NestedRoundTripOnlyModel getNestedRoundTripModel() {
        return this.nestedRoundTripModel;
    }

    /**
     * Get the nestedSharedModel property: Required nested shared model.
     *
     * @return the nestedSharedModel value.
     */
    public NestedRoundTripSharedModel getNestedSharedModel() {
        return this.nestedSharedModel;
    }
}
