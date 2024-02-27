// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.extension.base.model.codemodel;

import java.util.List;

/**
 * Represents a test model.
 */
public class TestModel {
    private List<ScenarioTest> scenarioTests;

    /**
     * Gets the API scenario definitions.
     *
     * @return The API scenario definitions.
     */
    public List<ScenarioTest> getScenarioTests() {
        return scenarioTests;
    }

    /**
     * Sets the API scenario definitions.
     *
     * @param scenarioTests The API scenario definitions.
     */
    public void setScenarioTests(List<ScenarioTest> scenarioTests) {
        this.scenarioTests = scenarioTests;
    }
}
