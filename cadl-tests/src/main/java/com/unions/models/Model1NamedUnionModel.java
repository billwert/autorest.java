// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.unions.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonValue;

/** The Model1NamedUnionModel model. */
@Immutable
public final class Model1NamedUnionModel extends NamedUnionModelBase {
    private final Model1 value;

    /**
     * Creates an instance of Model1NamedUnionModel class.
     *
     * @param value the value.
     */
    public Model1NamedUnionModel(Model1 value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value.
     */
    @JsonValue
    public Model1 getValue() {
        return this.value;
    }
}