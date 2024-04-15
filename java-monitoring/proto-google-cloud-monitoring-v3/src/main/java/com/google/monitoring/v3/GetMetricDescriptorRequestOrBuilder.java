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
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public interface GetMetricDescriptorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetMetricDescriptorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The metric descriptor on which to execute the request. The format
   * is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *
   * An example value of `[METRIC_ID]` is
   * `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The metric descriptor on which to execute the request. The format
   * is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *
   * An example value of `[METRIC_ID]` is
   * `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
