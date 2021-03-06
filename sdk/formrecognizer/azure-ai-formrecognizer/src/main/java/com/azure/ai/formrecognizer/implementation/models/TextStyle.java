// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TextStyle. */
public final class TextStyle extends ExpandableStringEnum<TextStyle> {
    /** Static value other for TextStyle. */
    public static final TextStyle OTHER = fromString("other");

    /** Static value handwriting for TextStyle. */
    public static final TextStyle HANDWRITING = fromString("handwriting");

    /**
     * Creates or finds a TextStyle from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TextStyle.
     */
    @JsonCreator
    public static TextStyle fromString(String name) {
        return fromString(name, TextStyle.class);
    }

    /** @return known TextStyle values. */
    public static Collection<TextStyle> values() {
        return values(TextStyle.class);
    }
}
