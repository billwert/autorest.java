// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The ModelWithSimpleUnionProperty model.
 */
@Immutable
public final class ModelWithSimpleUnionProperty implements JsonSerializable<ModelWithSimpleUnionProperty> {
    /*
     * The simpleUnion property.
     */
    @Generated
    private final BinaryData simpleUnion;

    /**
     * Creates an instance of ModelWithSimpleUnionProperty class.
     * 
     * @param simpleUnion the simpleUnion value to set.
     */
    @Generated
    public ModelWithSimpleUnionProperty(BinaryData simpleUnion) {
        this.simpleUnion = simpleUnion;
    }

    /**
     * Get the simpleUnion property: The simpleUnion property.
     * 
     * @return the simpleUnion value.
     */
    @Generated
    public BinaryData getSimpleUnion() {
        return this.simpleUnion;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("simpleUnion", this.simpleUnion.toObject(Object.class));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModelWithSimpleUnionProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModelWithSimpleUnionProperty if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ModelWithSimpleUnionProperty.
     */
    public static ModelWithSimpleUnionProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean simpleUnionFound = false;
            BinaryData simpleUnion = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("simpleUnion".equals(fieldName)) {
                    simpleUnion = BinaryData.fromObject(reader.readUntyped());
                    simpleUnionFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (simpleUnionFound) {
                ModelWithSimpleUnionProperty deserializedModelWithSimpleUnionProperty
                    = new ModelWithSimpleUnionProperty(simpleUnion);

                return deserializedModelWithSimpleUnionProperty;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!simpleUnionFound) {
                missingProperties.add("simpleUnion");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
