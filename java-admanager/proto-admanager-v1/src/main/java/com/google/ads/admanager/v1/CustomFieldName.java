/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.admanager.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class CustomFieldName implements ResourceName {
  private static final PathTemplate NETWORK_CODE_CUSTOM_FIELD =
      PathTemplate.createWithoutUrlEncoding("networks/{network_code}/customFields/{custom_field}");
  private volatile Map<String, String> fieldValuesMap;
  private final String networkCode;
  private final String customField;

  @Deprecated
  protected CustomFieldName() {
    networkCode = null;
    customField = null;
  }

  private CustomFieldName(Builder builder) {
    networkCode = Preconditions.checkNotNull(builder.getNetworkCode());
    customField = Preconditions.checkNotNull(builder.getCustomField());
  }

  public String getNetworkCode() {
    return networkCode;
  }

  public String getCustomField() {
    return customField;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomFieldName of(String networkCode, String customField) {
    return newBuilder().setNetworkCode(networkCode).setCustomField(customField).build();
  }

  public static String format(String networkCode, String customField) {
    return newBuilder().setNetworkCode(networkCode).setCustomField(customField).build().toString();
  }

  public static CustomFieldName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        NETWORK_CODE_CUSTOM_FIELD.validatedMatch(
            formattedString, "CustomFieldName.parse: formattedString not in valid format");
    return of(matchMap.get("network_code"), matchMap.get("custom_field"));
  }

  public static List<CustomFieldName> parseList(List<String> formattedStrings) {
    List<CustomFieldName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomFieldName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomFieldName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return NETWORK_CODE_CUSTOM_FIELD.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (networkCode != null) {
            fieldMapBuilder.put("network_code", networkCode);
          }
          if (customField != null) {
            fieldMapBuilder.put("custom_field", customField);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return NETWORK_CODE_CUSTOM_FIELD.instantiate(
        "network_code", networkCode, "custom_field", customField);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomFieldName that = ((CustomFieldName) o);
      return Objects.equals(this.networkCode, that.networkCode)
          && Objects.equals(this.customField, that.customField);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(networkCode);
    h *= 1000003;
    h ^= Objects.hashCode(customField);
    return h;
  }

  /** Builder for networks/{network_code}/customFields/{custom_field}. */
  public static class Builder {
    private String networkCode;
    private String customField;

    protected Builder() {}

    public String getNetworkCode() {
      return networkCode;
    }

    public String getCustomField() {
      return customField;
    }

    public Builder setNetworkCode(String networkCode) {
      this.networkCode = networkCode;
      return this;
    }

    public Builder setCustomField(String customField) {
      this.customField = customField;
      return this;
    }

    private Builder(CustomFieldName customFieldName) {
      this.networkCode = customFieldName.networkCode;
      this.customField = customFieldName.customField;
    }

    public CustomFieldName build() {
      return new CustomFieldName(this);
    }
  }
}
