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
// source: google/cloud/dataplex/v1/service.proto

package com.google.cloud.dataplex.v1;

public interface ListSessionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListSessionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent environment:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}`.
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
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}`.
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
   * Optional. Maximum number of sessions to return. The service may return fewer than
   * this value. If unspecified, at most 10 sessions will be returned. The
   * maximum value is 1000; values above 1000 will be coerced to 1000.
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
   * Optional. Page token received from a previous `ListSessions` call. Provide this to
   * retrieve the subsequent page. When paginating, all other parameters
   * provided to `ListSessions` must match the call that provided the page
   * token.
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
   * Optional. Page token received from a previous `ListSessions` call. Provide this to
   * retrieve the subsequent page. When paginating, all other parameters
   * provided to `ListSessions` must match the call that provided the page
   * token.
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
   * Optional. Filter request. The following `mode` filter is supported to return only the
   * sessions belonging to the requester when the mode is USER and return
   * sessions of all the users when the mode is ADMIN. When no filter is sent
   * default to USER mode.
   * NOTE: When the mode is ADMIN, the requester should have
   * `dataplex.environments.listAllSessions` permission to list all sessions,
   * in absence of the permission, the request fails.
   * mode = ADMIN | USER
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
   * Optional. Filter request. The following `mode` filter is supported to return only the
   * sessions belonging to the requester when the mode is USER and return
   * sessions of all the users when the mode is ADMIN. When no filter is sent
   * default to USER mode.
   * NOTE: When the mode is ADMIN, the requester should have
   * `dataplex.environments.listAllSessions` permission to list all sessions,
   * in absence of the permission, the request fails.
   * mode = ADMIN | USER
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
