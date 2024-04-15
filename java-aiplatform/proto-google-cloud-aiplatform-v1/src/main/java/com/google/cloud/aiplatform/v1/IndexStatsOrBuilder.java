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
// source: google/cloud/aiplatform/v1/index.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface IndexStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.IndexStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The number of vectors in the Index.
   * </pre>
   *
   * <code>int64 vectors_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vectorsCount.
   */
  long getVectorsCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of shards in the Index.
   * </pre>
   *
   * <code>int32 shards_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The shardsCount.
   */
  int getShardsCount();
}
