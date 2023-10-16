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
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

public interface ResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name.
   * Format:
   * `projects/{project}/locations/{location}/deployments/{deployment}/revisions/{revision}/resources/{resource}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name.
   * Format:
   * `projects/{project}/locations/{location}/deployments/{deployment}/revisions/{revision}/resources/{resource}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Terraform-specific info if this resource was created using
   * Terraform.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ResourceTerraformInfo terraform_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the terraformInfo field is set.
   */
  boolean hasTerraformInfo();
  /**
   *
   *
   * <pre>
   * Output only. Terraform-specific info if this resource was created using
   * Terraform.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ResourceTerraformInfo terraform_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The terraformInfo.
   */
  com.google.cloud.config.v1.ResourceTerraformInfo getTerraformInfo();
  /**
   *
   *
   * <pre>
   * Output only. Terraform-specific info if this resource was created using
   * Terraform.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ResourceTerraformInfo terraform_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.ResourceTerraformInfoOrBuilder getTerraformInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Map of Cloud Asset Inventory (CAI) type to CAI info (e.g. CAI
   * ID). CAI type format follows
   * https://cloud.google.com/asset-inventory/docs/supported-asset-types
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.config.v1.ResourceCAIInfo&gt; cai_assets = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getCaiAssetsCount();
  /**
   *
   *
   * <pre>
   * Output only. Map of Cloud Asset Inventory (CAI) type to CAI info (e.g. CAI
   * ID). CAI type format follows
   * https://cloud.google.com/asset-inventory/docs/supported-asset-types
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.config.v1.ResourceCAIInfo&gt; cai_assets = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsCaiAssets(java.lang.String key);
  /** Use {@link #getCaiAssetsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.config.v1.ResourceCAIInfo> getCaiAssets();
  /**
   *
   *
   * <pre>
   * Output only. Map of Cloud Asset Inventory (CAI) type to CAI info (e.g. CAI
   * ID). CAI type format follows
   * https://cloud.google.com/asset-inventory/docs/supported-asset-types
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.config.v1.ResourceCAIInfo&gt; cai_assets = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.config.v1.ResourceCAIInfo> getCaiAssetsMap();
  /**
   *
   *
   * <pre>
   * Output only. Map of Cloud Asset Inventory (CAI) type to CAI info (e.g. CAI
   * ID). CAI type format follows
   * https://cloud.google.com/asset-inventory/docs/supported-asset-types
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.config.v1.ResourceCAIInfo&gt; cai_assets = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.config.v1.ResourceCAIInfo getCaiAssetsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.config.v1.ResourceCAIInfo defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Map of Cloud Asset Inventory (CAI) type to CAI info (e.g. CAI
   * ID). CAI type format follows
   * https://cloud.google.com/asset-inventory/docs/supported-asset-types
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.config.v1.ResourceCAIInfo&gt; cai_assets = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.ResourceCAIInfo getCaiAssetsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Intent of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Resource.Intent intent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for intent.
   */
  int getIntentValue();
  /**
   *
   *
   * <pre>
   * Output only. Intent of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Resource.Intent intent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The intent.
   */
  com.google.cloud.config.v1.Resource.Intent getIntent();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Resource.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Resource.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.config.v1.Resource.State getState();
}
