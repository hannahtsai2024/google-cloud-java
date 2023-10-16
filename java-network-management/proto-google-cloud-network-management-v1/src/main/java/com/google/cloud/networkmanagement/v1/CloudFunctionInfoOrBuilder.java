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
// source: google/cloud/networkmanagement/v1/trace.proto

package com.google.cloud.networkmanagement.v1;

public interface CloudFunctionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.CloudFunctionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of a Cloud Function.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name of a Cloud Function.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * URI of a Cloud Function.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of a Cloud Function.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Location in which the Cloud Function is deployed.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Location in which the Cloud Function is deployed.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Latest successfully deployed version id of the Cloud Function.
   * </pre>
   *
   * <code>int64 version_id = 4;</code>
   *
   * @return The versionId.
   */
  long getVersionId();
}
