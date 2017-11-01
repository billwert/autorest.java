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
import java.util.List;

/**
 * The ArrayWrapper model.
 */
public class ArrayWrapper {
    /**
     * The array property.
     */
    @JsonProperty(value = "array")
    private List<String> array;

    /**
     * Get the array value.
     *
     * @return the array value
     */
    public List<String> array() {
        return this.array;
    }

    /**
     * Set the array value.
     *
     * @param array the array value to set
     * @return the ArrayWrapper object itself.
     */
    public ArrayWrapper withArray(List<String> array) {
        this.array = array;
        return this;
    }

}
