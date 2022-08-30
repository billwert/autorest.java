// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.models.property.types.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Model with collection string properties. */
@Fluent
public final class CollectionsStringProperty {
    /*
     * Property
     */
    @JsonProperty(value = "property", required = true)
    private List<String> property;

    /**
     * Creates an instance of CollectionsStringProperty class.
     *
     * @param property the property value to set.
     */
    @JsonCreator
    public CollectionsStringProperty(@JsonProperty(value = "property", required = true) List<String> property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     *
     * @return the property value.
     */
    public List<String> getProperty() {
        return this.property;
    }
}
