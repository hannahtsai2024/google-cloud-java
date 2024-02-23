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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface SetLabelsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetLabelsRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=4041
   * @return The projectId.
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetLabelsRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=4041
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetLabelsRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=4047
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetLabelsRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=4047
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetLabelsRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=4051
   * @return The clusterId.
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetLabelsRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=4051
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getResourceLabelsCount();
  /**
   *
   *
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsResourceLabels(java.lang.String key);
  /** Use {@link #getResourceLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getResourceLabels();
  /**
   *
   *
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getResourceLabelsMap();
  /**
   *
   *
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  /* nullable */
  java.lang.String getResourceLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.lang.String getResourceLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The fingerprint of the previous set of labels for this resource,
   * used to detect conflicts. The fingerprint is initially generated by
   * Kubernetes Engine and changes after every request to modify or update
   * labels. You must always provide an up-to-date fingerprint hash when
   * updating or changing labels. Make a `get()` request to the
   * resource to get the latest fingerprint.
   * </pre>
   *
   * <code>string label_fingerprint = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   *
   *
   * <pre>
   * Required. The fingerprint of the previous set of labels for this resource,
   * used to detect conflicts. The fingerprint is initially generated by
   * Kubernetes Engine and changes after every request to modify or update
   * labels. You must always provide an up-to-date fingerprint hash when
   * updating or changing labels. Make a `get()` request to the
   * resource to get the latest fingerprint.
   * </pre>
   *
   * <code>string label_fingerprint = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString getLabelFingerprintBytes();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster name) of the cluster to set labels.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 7;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster name) of the cluster to set labels.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 7;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
