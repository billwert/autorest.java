/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import fixtures.paging.ProductProperties;

/**
 * The ProductInner model.
 */
public class ProductInner {
    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private ProductProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public ProductProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ProductInner object itself.
     */
    public ProductInner withProperties(ProductProperties properties) {
        this.properties = properties;
        return this;
    }

}
