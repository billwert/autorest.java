// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.specialwords.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.specialwords.ModelPropertiesClient;
import com.specialwords.ModelsClient;
import com.specialwords.OperationsClient;
import com.specialwords.ParametersClient;
import com.specialwords.SpecialWordsClientBuilder;

class SpecialWordsClientTestBase extends TestProxyTestBase {
    protected ModelsClient modelsClient;

    protected ModelPropertiesClient modelPropertiesClient;

    protected OperationsClient operationsClient;

    protected ParametersClient parametersClient;

    @Override
    protected void beforeTest() {
        SpecialWordsClientBuilder modelsClientbuilder =
                new SpecialWordsClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            modelsClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            modelsClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        modelsClient = modelsClientbuilder.buildModelsClient();

        SpecialWordsClientBuilder modelPropertiesClientbuilder =
                new SpecialWordsClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            modelPropertiesClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            modelPropertiesClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        modelPropertiesClient = modelPropertiesClientbuilder.buildModelPropertiesClient();

        SpecialWordsClientBuilder operationsClientbuilder =
                new SpecialWordsClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            operationsClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            operationsClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        operationsClient = operationsClientbuilder.buildOperationsClient();

        SpecialWordsClientBuilder parametersClientbuilder =
                new SpecialWordsClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            parametersClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            parametersClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        parametersClient = parametersClientbuilder.buildParametersClient();
    }
}
