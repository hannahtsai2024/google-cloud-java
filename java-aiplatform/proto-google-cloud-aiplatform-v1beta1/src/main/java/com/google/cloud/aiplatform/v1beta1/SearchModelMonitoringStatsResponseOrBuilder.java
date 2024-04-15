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
// source: google/cloud/aiplatform/v1beta1/model_monitoring_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface SearchModelMonitoringStatsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SearchModelMonitoringStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStats monitoring_stats = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelMonitoringStats> getMonitoringStatsList();
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStats monitoring_stats = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringStats getMonitoringStats(int index);
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStats monitoring_stats = 1;
   * </code>
   */
  int getMonitoringStatsCount();
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStats monitoring_stats = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsOrBuilder>
      getMonitoringStatsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStats monitoring_stats = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsOrBuilder getMonitoringStatsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The page token that can be used by the next
   * [ModelMonitoringService.SearchModelMonitoringStats][google.cloud.aiplatform.v1beta1.ModelMonitoringService.SearchModelMonitoringStats]
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The page token that can be used by the next
   * [ModelMonitoringService.SearchModelMonitoringStats][google.cloud.aiplatform.v1beta1.ModelMonitoringService.SearchModelMonitoringStats]
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
