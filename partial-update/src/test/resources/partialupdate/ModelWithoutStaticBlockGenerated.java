// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.util;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

@Fluent
public final class Model {

    @Generated
    private Boolean bypassSelectors;

    /**
     * Creates an instance of ModelWithStaticBlock class.
     */
    @Generated
    public ModelWithStaticBlock() {
    }

    /**
     * Get the bypassSelectors property: If set to true, then router will match workers to jobs even if they don't match label selectors. Warning: You may get workers that are not qualified for a job they are matched with if you set this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @return the bypassSelectors value.
     */
    @Generated
    public Boolean isBypassSelectors() {
        return this.bypassSelectors;
    }

    /**
     * Set the bypassSelectors property: If set to true, then router will match workers to jobs even if they don't match label selectors. Warning: You may get workers that are not qualified for a job they are matched with if you set this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @param bypassSelectors the bypassSelectors value to set.
     * @return the ModelWithStaticBlock object itself.
     */
    @Generated
    public DistributionModeInternal setBypassSelectors(Boolean bypassSelectors) {
        this.bypassSelectors = bypassSelectors;
        this.updatedProperties.add("bypassSelectors");
        return this;
    }
}
