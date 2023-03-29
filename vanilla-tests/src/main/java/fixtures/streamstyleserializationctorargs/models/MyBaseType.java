// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserializationctorargs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** The MyBaseType model. */
@Fluent
public class MyBaseType implements JsonSerializable<MyBaseType> {
    /*
     * The propB1 property.
     */
    private String propB1;

    /*
     * The propBH1 property.
     */
    private String propBH1;

    /** Creates an instance of MyBaseType class. */
    public MyBaseType() {}

    /**
     * Get the propB1 property: The propB1 property.
     *
     * @return the propB1 value.
     */
    public String getPropB1() {
        return this.propB1;
    }

    /**
     * Set the propB1 property: The propB1 property.
     *
     * @param propB1 the propB1 value to set.
     * @return the MyBaseType object itself.
     */
    public MyBaseType setPropB1(String propB1) {
        this.propB1 = propB1;
        return this;
    }

    /**
     * Get the propBH1 property: The propBH1 property.
     *
     * @return the propBH1 value.
     */
    public String getPropBH1() {
        return this.propBH1;
    }

    /**
     * Set the propBH1 property: The propBH1 property.
     *
     * @param propBH1 the propBH1 value to set.
     * @return the MyBaseType object itself.
     */
    public MyBaseType setPropBH1(String propBH1) {
        this.propBH1 = propBH1;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("propB1", this.propB1);
        if (propBH1 != null) {
            jsonWriter.writeStartObject("helper");
            jsonWriter.writeStringField("propBH1", this.propBH1);
            jsonWriter.writeEndObject();
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MyBaseType from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MyBaseType if the JsonReader was pointing to an instance of it, or null if it was pointing
     *     to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the MyBaseType.
     */
    public static MyBaseType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    String discriminatorValue = null;
                    JsonReader readerToUse = null;

                    // Read the first field name and determine if it's the discriminator field.
                    reader.nextToken();
                    if ("kind".equals(reader.getFieldName())) {
                        reader.nextToken();
                        discriminatorValue = reader.getString();
                        readerToUse = reader;
                    } else {
                        // If it isn't the discriminator field buffer the JSON to make it replayable and find the
                        // discriminator field value.
                        JsonReader replayReader = reader.bufferObject();
                        replayReader.nextToken(); // Prepare for reading
                        while (replayReader.nextToken() != JsonToken.END_OBJECT) {
                            String fieldName = replayReader.getFieldName();
                            replayReader.nextToken();
                            if ("kind".equals(fieldName)) {
                                discriminatorValue = replayReader.getString();
                                break;
                            } else {
                                replayReader.skipChildren();
                            }
                        }

                        if (discriminatorValue != null) {
                            readerToUse = replayReader.reset();
                        }
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("Kind1".equals(discriminatorValue)) {
                        return MyDerivedType.fromJson(readerToUse);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field 'kind' didn't match one of the expected values 'Kind1'");
                    }
                });
    }
}