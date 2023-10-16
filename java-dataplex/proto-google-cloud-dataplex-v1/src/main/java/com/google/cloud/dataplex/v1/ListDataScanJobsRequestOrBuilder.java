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
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

public interface ListDataScanJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListDataScanJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent environment:
   * `projects/{project}/locations/{location_id}/dataScans/{data_scan_id}`
   * where `project` refers to a *project_id* or *project_number* and
   * `location_id` refers to a GCP region.
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
   * Required. The resource name of the parent environment:
   * `projects/{project}/locations/{location_id}/dataScans/{data_scan_id}`
   * where `project` refers to a *project_id* or *project_number* and
   * `location_id` refers to a GCP region.
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
   * Optional. Maximum number of DataScanJobs to return. The service may return
   * fewer than this value. If unspecified, at most 10 DataScanJobs will be
   * returned. The maximum value is 1000; values above 1000 will be coerced to
   * 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Page token received from a previous `ListDataScanJobs` call.
   * Provide this to retrieve the subsequent page. When paginating, all other
   * parameters provided to `ListDataScanJobs` must match the call that provided
   * the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Page token received from a previous `ListDataScanJobs` call.
   * Provide this to retrieve the subsequent page. When paginating, all other
   * parameters provided to `ListDataScanJobs` must match the call that provided
   * the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the ListDataScanJobs
   * request.
   *
   * If unspecified, all datascan jobs will be returned. Multiple filters can be
   * applied (with `AND`, `OR` logical operators). Filters are case-sensitive.
   *
   * Allowed fields are:
   *
   * - `start_time`
   * - `end_time`
   *
   * `start_time` and `end_time` expect RFC-3339 formatted strings (e.g.
   * 2018-10-08T18:30:00-07:00).
   *
   * For instance, 'start_time &gt; 2018-10-08T00:00:00.123456789Z AND end_time &lt;
   * 2018-10-09T00:00:00.123456789Z' limits results to DataScanJobs between
   * specified start and end times.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the ListDataScanJobs
   * request.
   *
   * If unspecified, all datascan jobs will be returned. Multiple filters can be
   * applied (with `AND`, `OR` logical operators). Filters are case-sensitive.
   *
   * Allowed fields are:
   *
   * - `start_time`
   * - `end_time`
   *
   * `start_time` and `end_time` expect RFC-3339 formatted strings (e.g.
   * 2018-10-08T18:30:00-07:00).
   *
   * For instance, 'start_time &gt; 2018-10-08T00:00:00.123456789Z AND end_time &lt;
   * 2018-10-09T00:00:00.123456789Z' limits results to DataScanJobs between
   * specified start and end times.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
