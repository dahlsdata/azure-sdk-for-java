/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import java.util.List;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.ReferenceDataSetKeyProperty;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.DataStringComparisonBehavior;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.ProvisioningState;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A reference data set provides metadata about the events in an environment.
 * Metadata in the reference data set will be joined with events as they are
 * read from event sources. The metadata that makes up the reference data set
 * is uploaded or modified through the Time Series Insights data plane APIs.
 */
@JsonFlatten
public class ReferenceDataSetResourceInner extends Resource {
    /**
     * The list of key properties for the reference data set.
     */
    @JsonProperty(value = "properties.keyProperties", required = true)
    private List<ReferenceDataSetKeyProperty> keyProperties;

    /**
     * The reference data set key comparison behavior can be set using this
     * property. By default, the value is 'Ordinal' - which means case
     * sensitive key comparison will be performed while joining reference data
     * with events or while adding new reference data. When 'OrdinalIgnoreCase'
     * is set, case insensitive comparison will be used. Possible values
     * include: 'Ordinal', 'OrdinalIgnoreCase'.
     */
    @JsonProperty(value = "properties.dataStringComparisonBehavior")
    private DataStringComparisonBehavior dataStringComparisonBehavior;

    /**
     * Provisioning state of the resource. Possible values include: 'Accepted',
     * 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The time the resource was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Get the list of key properties for the reference data set.
     *
     * @return the keyProperties value
     */
    public List<ReferenceDataSetKeyProperty> keyProperties() {
        return this.keyProperties;
    }

    /**
     * Set the list of key properties for the reference data set.
     *
     * @param keyProperties the keyProperties value to set
     * @return the ReferenceDataSetResourceInner object itself.
     */
    public ReferenceDataSetResourceInner withKeyProperties(List<ReferenceDataSetKeyProperty> keyProperties) {
        this.keyProperties = keyProperties;
        return this;
    }

    /**
     * Get the reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used. Possible values include: 'Ordinal', 'OrdinalIgnoreCase'.
     *
     * @return the dataStringComparisonBehavior value
     */
    public DataStringComparisonBehavior dataStringComparisonBehavior() {
        return this.dataStringComparisonBehavior;
    }

    /**
     * Set the reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used. Possible values include: 'Ordinal', 'OrdinalIgnoreCase'.
     *
     * @param dataStringComparisonBehavior the dataStringComparisonBehavior value to set
     * @return the ReferenceDataSetResourceInner object itself.
     */
    public ReferenceDataSetResourceInner withDataStringComparisonBehavior(DataStringComparisonBehavior dataStringComparisonBehavior) {
        this.dataStringComparisonBehavior = dataStringComparisonBehavior;
        return this;
    }

    /**
     * Get provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ReferenceDataSetResourceInner object itself.
     */
    public ReferenceDataSetResourceInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the time the resource was created.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

}
