/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies the metric alert rule criteria for a web test resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata\\.type", defaultImpl = WebtestLocationAvailabilityCriteria.class)
@JsonTypeName("Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria")
public class WebtestLocationAvailabilityCriteria extends MetricAlertCriteria {
    /**
     * The Application Insights web test Id.
     */
    @JsonProperty(value = "webTestId", required = true)
    private String webTestId;

    /**
     * The Application Insights resource Id.
     */
    @JsonProperty(value = "componentId", required = true)
    private String componentId;

    /**
     * The number of failed locations.
     */
    @JsonProperty(value = "failedLocationCount", required = true)
    private double failedLocationCount;

    /**
     * Get the Application Insights web test Id.
     *
     * @return the webTestId value
     */
    public String webTestId() {
        return this.webTestId;
    }

    /**
     * Set the Application Insights web test Id.
     *
     * @param webTestId the webTestId value to set
     * @return the WebtestLocationAvailabilityCriteria object itself.
     */
    public WebtestLocationAvailabilityCriteria withWebTestId(String webTestId) {
        this.webTestId = webTestId;
        return this;
    }

    /**
     * Get the Application Insights resource Id.
     *
     * @return the componentId value
     */
    public String componentId() {
        return this.componentId;
    }

    /**
     * Set the Application Insights resource Id.
     *
     * @param componentId the componentId value to set
     * @return the WebtestLocationAvailabilityCriteria object itself.
     */
    public WebtestLocationAvailabilityCriteria withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * Get the number of failed locations.
     *
     * @return the failedLocationCount value
     */
    public double failedLocationCount() {
        return this.failedLocationCount;
    }

    /**
     * Set the number of failed locations.
     *
     * @param failedLocationCount the failedLocationCount value to set
     * @return the WebtestLocationAvailabilityCriteria object itself.
     */
    public WebtestLocationAvailabilityCriteria withFailedLocationCount(double failedLocationCount) {
        this.failedLocationCount = failedLocationCount;
        return this;
    }

}
