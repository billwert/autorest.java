// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.cadl.armresourceprovider.fluent.models.ChildResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response of a ChildResource list operation.
 */
@Fluent
public final class ChildResourceListResult {
    /*
     * The ChildResource items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<ChildResourceInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ChildResourceListResult class.
     */
    public ChildResourceListResult() {
    }

    /**
     * Get the value property: The ChildResource items on this page.
     * 
     * @return the value value.
     */
    public List<ChildResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The ChildResource items on this page.
     * 
     * @param value the value value to set.
     * @return the ChildResourceListResult object itself.
     */
    public ChildResourceListResult withValue(List<ChildResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model ChildResourceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ChildResourceListResult.class);
}
