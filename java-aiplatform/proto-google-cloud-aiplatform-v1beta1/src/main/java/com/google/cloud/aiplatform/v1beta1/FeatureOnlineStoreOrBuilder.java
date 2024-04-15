/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/feature_online_store.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface FeatureOnlineStoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureOnlineStore)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Contains settings for the Cloud Bigtable instance that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Bigtable bigtable = 8;</code>
   *
   * @return Whether the bigtable field is set.
   */
  boolean hasBigtable();
  /**
   *
   *
   * <pre>
   * Contains settings for the Cloud Bigtable instance that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Bigtable bigtable = 8;</code>
   *
   * @return The bigtable.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Bigtable getBigtable();
  /**
   *
   *
   * <pre>
   * Contains settings for the Cloud Bigtable instance that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Bigtable bigtable = 8;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.BigtableOrBuilder getBigtableOrBuilder();

  /**
   *
   *
   * <pre>
   * Contains settings for the Optimized store that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore. When choose Optimized storage type, need to set
   * [PrivateServiceConnectConfig.enable_private_service_connect][google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.enable_private_service_connect]
   * to use private endpoint. Otherwise will use public endpoint by default.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Optimized optimized = 12;</code>
   *
   * @return Whether the optimized field is set.
   */
  boolean hasOptimized();
  /**
   *
   *
   * <pre>
   * Contains settings for the Optimized store that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore. When choose Optimized storage type, need to set
   * [PrivateServiceConnectConfig.enable_private_service_connect][google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.enable_private_service_connect]
   * to use private endpoint. Otherwise will use public endpoint by default.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Optimized optimized = 12;</code>
   *
   * @return The optimized.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Optimized getOptimized();
  /**
   *
   *
   * <pre>
   * Contains settings for the Optimized store that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore. When choose Optimized storage type, need to set
   * [PrivateServiceConnectConfig.enable_private_service_connect][google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.enable_private_service_connect]
   * to use private endpoint. Otherwise will use public endpoint by default.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.Optimized optimized = 12;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.OptimizedOrBuilder getOptimizedOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifier. Name of the FeatureOnlineStore. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Name of the FeatureOnlineStore. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. State of the featureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the featureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.State getState();

  /**
   *
   *
   * <pre>
   * Optional. The dedicated serving endpoint for this FeatureOnlineStore, which
   * is different from common Vertex service endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.DedicatedServingEndpoint dedicated_serving_endpoint = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dedicatedServingEndpoint field is set.
   */
  boolean hasDedicatedServingEndpoint();
  /**
   *
   *
   * <pre>
   * Optional. The dedicated serving endpoint for this FeatureOnlineStore, which
   * is different from common Vertex service endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.DedicatedServingEndpoint dedicated_serving_endpoint = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dedicatedServingEndpoint.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.DedicatedServingEndpoint
      getDedicatedServingEndpoint();
  /**
   *
   *
   * <pre>
   * Optional. The dedicated serving endpoint for this FeatureOnlineStore, which
   * is different from common Vertex service endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.DedicatedServingEndpoint dedicated_serving_endpoint = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.DedicatedServingEndpointOrBuilder
      getDedicatedServingEndpointOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Deprecated: This field is no longer needed anymore and embedding
   * management is automatically enabled when specifying Optimized storage type.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.EmbeddingManagement embedding_management = 11 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.FeatureOnlineStore.embedding_management is
   *     deprecated. See google/cloud/aiplatform/v1beta1/feature_online_store.proto;l=174
   * @return Whether the embeddingManagement field is set.
   */
  @java.lang.Deprecated
  boolean hasEmbeddingManagement();
  /**
   *
   *
   * <pre>
   * Optional. Deprecated: This field is no longer needed anymore and embedding
   * management is automatically enabled when specifying Optimized storage type.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.EmbeddingManagement embedding_management = 11 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.FeatureOnlineStore.embedding_management is
   *     deprecated. See google/cloud/aiplatform/v1beta1/feature_online_store.proto;l=174
   * @return The embeddingManagement.
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.EmbeddingManagement
      getEmbeddingManagement();
  /**
   *
   *
   * <pre>
   * Optional. Deprecated: This field is no longer needed anymore and embedding
   * management is automatically enabled when specifying Optimized storage type.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureOnlineStore.EmbeddingManagement embedding_management = 11 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.EmbeddingManagementOrBuilder
      getEmbeddingManagementOrBuilder();

  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore.StorageTypeCase getStorageTypeCase();
}
