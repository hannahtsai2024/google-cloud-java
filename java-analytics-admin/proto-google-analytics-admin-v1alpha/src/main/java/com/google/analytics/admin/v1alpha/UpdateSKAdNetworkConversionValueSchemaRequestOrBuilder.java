/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface UpdateSKAdNetworkConversionValueSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UpdateSKAdNetworkConversionValueSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. SKAdNetwork conversion value schema to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the skadnetworkConversionValueSchema field is set.
   */
  boolean hasSkadnetworkConversionValueSchema();
  /**
   *
   *
   * <pre>
   * Required. SKAdNetwork conversion value schema to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The skadnetworkConversionValueSchema.
   */
  com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
      getSkadnetworkConversionValueSchema();
  /**
   *
   *
   * <pre>
   * Required. SKAdNetwork conversion value schema to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchemaOrBuilder
      getSkadnetworkConversionValueSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
