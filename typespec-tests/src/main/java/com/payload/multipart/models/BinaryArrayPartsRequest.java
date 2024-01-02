// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.payload.multipart.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The BinaryArrayPartsRequest model.
 */
@Immutable
public final class BinaryArrayPartsRequest implements JsonSerializable<BinaryArrayPartsRequest> {
    /*
     * The id property.
     */
    @Generated
    private final String id;

    /*
     * The pictures property.
     */
    @Generated
    private final List<byte[]> pictures;

    /**
     * Creates an instance of BinaryArrayPartsRequest class.
     * 
     * @param id the id value to set.
     * @param pictures the pictures value to set.
     */
    @Generated
    public BinaryArrayPartsRequest(String id, List<byte[]> pictures) {
        this.id = id;
        this.pictures = pictures;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the pictures property: The pictures property.
     * 
     * @return the pictures value.
     */
    @Generated
    public List<byte[]> getPictures() {
        return this.pictures;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeArrayField("pictures", this.pictures, (writer, element) -> writer.writeBinary(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BinaryArrayPartsRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BinaryArrayPartsRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BinaryArrayPartsRequest.
     */
    public static BinaryArrayPartsRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            List<byte[]> pictures = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("pictures".equals(fieldName)) {
                    pictures = reader.readArray(reader1 -> reader1.getBinary());
                } else {
                    reader.skipChildren();
                }
            }
            return new BinaryArrayPartsRequest(id, pictures);
        });
    }
}