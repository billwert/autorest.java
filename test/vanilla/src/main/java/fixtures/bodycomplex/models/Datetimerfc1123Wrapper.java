/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.v2.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * The Datetimerfc1123Wrapper model.
 */
public final class Datetimerfc1123Wrapper {
    /**
     * The field property.
     */
    @JsonProperty(value = "field")
    private DateTimeRfc1123 field;

    /**
     * The now property.
     */
    @JsonProperty(value = "now")
    private DateTimeRfc1123 now;

    /**
     * Get the field value.
     *
     * @return the field value.
     */
    public OffsetDateTime field() {
        if (this.field == null) {
            return null;
        }
        return this.field.dateTime();
    }

    /**
     * Set the field value.
     *
     * @param field the field value to set.
     * @return the Datetimerfc1123Wrapper object itself.
     */
    public Datetimerfc1123Wrapper withField(OffsetDateTime field) {
        if (field == null) {
            this.field = null;
        } else {
            this.field = new DateTimeRfc1123(field);
        }
        return this;
    }

    /**
     * Get the now value.
     *
     * @return the now value.
     */
    public OffsetDateTime now() {
        if (this.now == null) {
            return null;
        }
        return this.now.dateTime();
    }

    /**
     * Set the now value.
     *
     * @param now the now value to set.
     * @return the Datetimerfc1123Wrapper object itself.
     */
    public Datetimerfc1123Wrapper withNow(OffsetDateTime now) {
        if (now == null) {
            this.now = null;
        } else {
            this.now = new DateTimeRfc1123(now);
        }
        return this;
    }
}
