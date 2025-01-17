// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.model.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Resource1 model.
 */
@Immutable
public final class Resource1 implements JsonSerializable<Resource1> {
    /*
     * The name property.
     */
    @Generated
    private final String name;

    /*
     * The outputData property.
     */
    @Generated
    private OutputData outputData;

    /*
     * The outputData2 property.
     */
    @Generated
    private InputOutputData2 outputData2;

    /**
     * Creates an instance of Resource1 class.
     * 
     * @param name the name value to set.
     */
    @Generated
    public Resource1(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the outputData property: The outputData property.
     * 
     * @return the outputData value.
     */
    @Generated
    public OutputData getOutputData() {
        return this.outputData;
    }

    /**
     * Get the outputData2 property: The outputData2 property.
     * 
     * @return the outputData2 value.
     */
    @Generated
    public InputOutputData2 getOutputData2() {
        return this.outputData2;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Resource1 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Resource1 if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Resource1.
     */
    @Generated
    public static Resource1 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            OutputData outputData = null;
            InputOutputData2 outputData2 = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("outputData".equals(fieldName)) {
                    outputData = OutputData.fromJson(reader);
                } else if ("outputData2".equals(fieldName)) {
                    outputData2 = InputOutputData2.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            Resource1 deserializedResource1 = new Resource1(name);
            deserializedResource1.outputData = outputData;
            deserializedResource1.outputData2 = outputData2;

            return deserializedResource1;
        });
    }
}
