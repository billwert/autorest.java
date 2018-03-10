/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Defines headers for responseDatetime operation.
 */
public final class HeaderResponseDatetimeHeaders {
    /**
     * response with header values "2010-01-01T12:34:56Z" or
     * "0001-01-01T00:00:00Z".
     */
    @JsonProperty(value = "value")
    private OffsetDateTime value;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public OffsetDateTime value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the HeaderResponseDatetimeHeaders object itself.
     */
    public HeaderResponseDatetimeHeaders withValue(OffsetDateTime value) {
        this.value = value;
        return this;
    }
}
