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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface RangeInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.RangeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Name of a range.
   * </pre>
   *
   * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rangeName.
   */
  java.lang.String getRangeName();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Name of a range.
   * </pre>
   *
   * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rangeName.
   */
  com.google.protobuf.ByteString getRangeNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] The utilization of the range.
   * </pre>
   *
   * <code>double utilization = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The utilization.
   */
  double getUtilization();
}
