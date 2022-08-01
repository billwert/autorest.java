// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.List;

/** The Siamese model. */
@Fluent
public final class Siamese extends Cat {
    /*
     * The breed property.
     */
    private String breed;

    /**
     * Get the breed property: The breed property.
     *
     * @return the breed value.
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Set the breed property: The breed property.
     *
     * @param breed the breed value to set.
     * @return the Siamese object itself.
     */
    public Siamese setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Siamese setColor(String color) {
        super.setColor(color);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Siamese setHates(List<Dog> hates) {
        super.setHates(hates);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Siamese setId(Integer id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Siamese setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntegerField("id", getId(), false);
        jsonWriter.writeStringField("name", getName(), false);
        jsonWriter.writeStringField("color", getColor(), false);
        jsonWriter.writeArrayField("hates", getHates(), false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("breed", this.breed, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of Siamese from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Siamese if the JsonReader was pointing to an instance of it, or null if it was pointing to
     *     JSON null.
     */
    public static Siamese fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    Integer id = null;
                    String name = null;
                    String color = null;
                    List<Dog> hates = null;
                    String breed = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("id".equals(fieldName)) {
                            id = reader.getIntegerNullableValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                        } else if ("color".equals(fieldName)) {
                            color = reader.getStringValue();
                        } else if ("hates".equals(fieldName)) {
                            hates = reader.readArray(reader1 -> Dog.fromJson(reader1));
                        } else if ("breed".equals(fieldName)) {
                            breed = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    Siamese deserializedValue = new Siamese();
                    deserializedValue.setId(id);
                    deserializedValue.setName(name);
                    deserializedValue.setColor(color);
                    deserializedValue.setHates(hates);
                    deserializedValue.breed = breed;

                    return deserializedValue;
                });
    }
}