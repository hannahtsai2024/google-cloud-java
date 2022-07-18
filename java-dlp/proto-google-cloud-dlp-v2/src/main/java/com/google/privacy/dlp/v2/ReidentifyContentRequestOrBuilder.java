/*
 * Copyright 2020 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ReidentifyContentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ReidentifyContentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   * The format of this value varies depending on whether you have [specified a
   * processing
   * location](https://cloud.google.com/dlp/docs/specifying-location):
   * + Projects scope, location specified:&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Projects scope, no location specified (defaults to global):&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *     parent=projects/example-project/locations/europe-west3
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   * The format of this value varies depending on whether you have [specified a
   * processing
   * location](https://cloud.google.com/dlp/docs/specifying-location):
   * + Projects scope, location specified:&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Projects scope, no location specified (defaults to global):&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *     parent=projects/example-project/locations/europe-west3
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Configuration for the re-identification of the content item.
   * This field shares the same proto message type that is used for
   * de-identification, however its usage here is for the reversal of the
   * previous de-identification. Re-identification is performed by examining
   * the transformations used to de-identify the items and executing the
   * reverse. This requires that only reversible transformations
   * be provided here. The reversible transformations are:
   *  - `CryptoDeterministicConfig`
   *  - `CryptoReplaceFfxFpeConfig`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyConfig reidentify_config = 2;</code>
   *
   * @return Whether the reidentifyConfig field is set.
   */
  boolean hasReidentifyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the re-identification of the content item.
   * This field shares the same proto message type that is used for
   * de-identification, however its usage here is for the reversal of the
   * previous de-identification. Re-identification is performed by examining
   * the transformations used to de-identify the items and executing the
   * reverse. This requires that only reversible transformations
   * be provided here. The reversible transformations are:
   *  - `CryptoDeterministicConfig`
   *  - `CryptoReplaceFfxFpeConfig`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyConfig reidentify_config = 2;</code>
   *
   * @return The reidentifyConfig.
   */
  com.google.privacy.dlp.v2.DeidentifyConfig getReidentifyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the re-identification of the content item.
   * This field shares the same proto message type that is used for
   * de-identification, however its usage here is for the reversal of the
   * previous de-identification. Re-identification is performed by examining
   * the transformations used to de-identify the items and executing the
   * reverse. This requires that only reversible transformations
   * be provided here. The reversible transformations are:
   *  - `CryptoDeterministicConfig`
   *  - `CryptoReplaceFfxFpeConfig`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyConfig reidentify_config = 2;</code>
   */
  com.google.privacy.dlp.v2.DeidentifyConfigOrBuilder getReidentifyConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 3;</code>
   *
   * @return Whether the inspectConfig field is set.
   */
  boolean hasInspectConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 3;</code>
   *
   * @return The inspectConfig.
   */
  com.google.privacy.dlp.v2.InspectConfig getInspectConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 3;</code>
   */
  com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The item to re-identify. Will be treated as text.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 4;</code>
   *
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   *
   *
   * <pre>
   * The item to re-identify. Will be treated as text.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 4;</code>
   *
   * @return The item.
   */
  com.google.privacy.dlp.v2.ContentItem getItem();
  /**
   *
   *
   * <pre>
   * The item to re-identify. Will be treated as text.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 4;</code>
   */
  com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder();

  /**
   *
   *
   * <pre>
   * Template to use. Any configuration directly specified in
   * `inspect_config` will override those set in the template. Singular fields
   * that are set in this request will replace their corresponding fields in the
   * template. Repeated fields are appended. Singular sub-messages and groups
   * are recursively merged.
   * </pre>
   *
   * <code>string inspect_template_name = 5;</code>
   *
   * @return The inspectTemplateName.
   */
  java.lang.String getInspectTemplateName();
  /**
   *
   *
   * <pre>
   * Template to use. Any configuration directly specified in
   * `inspect_config` will override those set in the template. Singular fields
   * that are set in this request will replace their corresponding fields in the
   * template. Repeated fields are appended. Singular sub-messages and groups
   * are recursively merged.
   * </pre>
   *
   * <code>string inspect_template_name = 5;</code>
   *
   * @return The bytes for inspectTemplateName.
   */
  com.google.protobuf.ByteString getInspectTemplateNameBytes();

  /**
   *
   *
   * <pre>
   * Template to use. References an instance of `DeidentifyTemplate`.
   * Any configuration directly specified in `reidentify_config` or
   * `inspect_config` will override those set in the template. The
   * `DeidentifyTemplate` used must include only reversible transformations.
   * Singular fields that are set in this request will replace their
   * corresponding fields in the template. Repeated fields are appended.
   * Singular sub-messages and groups are recursively merged.
   * </pre>
   *
   * <code>string reidentify_template_name = 6;</code>
   *
   * @return The reidentifyTemplateName.
   */
  java.lang.String getReidentifyTemplateName();
  /**
   *
   *
   * <pre>
   * Template to use. References an instance of `DeidentifyTemplate`.
   * Any configuration directly specified in `reidentify_config` or
   * `inspect_config` will override those set in the template. The
   * `DeidentifyTemplate` used must include only reversible transformations.
   * Singular fields that are set in this request will replace their
   * corresponding fields in the template. Repeated fields are appended.
   * Singular sub-messages and groups are recursively merged.
   * </pre>
   *
   * <code>string reidentify_template_name = 6;</code>
   *
   * @return The bytes for reidentifyTemplateName.
   */
  com.google.protobuf.ByteString getReidentifyTemplateNameBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}