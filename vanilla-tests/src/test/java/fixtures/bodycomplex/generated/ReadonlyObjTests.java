// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.ReadonlyObj;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReadonlyObjTests {
    @Test
    public void testDeserialize() {
        ReadonlyObj model =
                BinaryData.fromString("{\"id\":\"tumkdosvqwhbm\",\"size\":1497620633}").toObject(ReadonlyObj.class);
        Assertions.assertEquals(1497620633, model.getSize());
    }

    @Test
    public void testSerialize() {
        ReadonlyObj model = new ReadonlyObj().setSize(1497620633);
        model = BinaryData.fromObject(model).toObject(ReadonlyObj.class);
        Assertions.assertEquals(1497620633, model.getSize());
    }
}