/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface CreateClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.CreateClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the cluster
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the cluster
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Required. The cluster to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.Cluster cluster = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasCluster();
  /**
   *
   *
   * <pre>
   * Required. The cluster to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.Cluster cluster = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.Cluster getCluster();
  /**
   *
   *
   * <pre>
   * Required. The cluster to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.Cluster cluster = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.ClusterOrBuilder getClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [CreateClusterRequest][google.cloud.dataproc.v1beta2.CreateClusterRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created and stored in the backend
   * is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [CreateClusterRequest][google.cloud.dataproc.v1beta2.CreateClusterRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created and stored in the backend
   * is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
