// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package cadl.testserver.servicedriven2.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ContentTypePath. */
public enum ContentTypePath {
    /** Enum value json. */
    JSON("json"),

    /** Enum value jpeg. */
    JPEG("jpeg");

    /** The actual serialized value for a ContentTypePath instance. */
    private final String value;

    ContentTypePath(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ContentTypePath instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ContentTypePath object, or null if unable to parse.
     */
    @JsonCreator
    public static ContentTypePath fromString(String value) {
        if (value == null) {
            return null;
        }
        ContentTypePath[] items = ContentTypePath.values();
        for (ContentTypePath item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}