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
// source: google/cloud/alloydb/connectors/v1alpha/resources.proto

package com.google.cloud.alloydb.connectors.v1alpha;

public interface MetadataExchangeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.connectors.v1alpha.MetadataExchangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Connector information.
   * </pre>
   *
   * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   *
   *
   * <pre>
   * Optional. Connector information.
   * </pre>
   *
   * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString getUserAgentBytes();

  /**
   *
   *
   * <pre>
   * Authentication type.
   * </pre>
   *
   * <code>.google.cloud.alloydb.connectors.v1alpha.MetadataExchangeRequest.AuthType auth_type = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for authType.
   */
  int getAuthTypeValue();
  /**
   *
   *
   * <pre>
   * Authentication type.
   * </pre>
   *
   * <code>.google.cloud.alloydb.connectors.v1alpha.MetadataExchangeRequest.AuthType auth_type = 2;
   * </code>
   *
   * @return The authType.
   */
  com.google.cloud.alloydb.connectors.v1alpha.MetadataExchangeRequest.AuthType getAuthType();

  /**
   *
   *
   * <pre>
   * IAM token used for both IAM user authentiation and
   * `alloydb.instances.connect` permission check.
   * </pre>
   *
   * <code>string oauth2_token = 3;</code>
   *
   * @return The oauth2Token.
   */
  java.lang.String getOauth2Token();
  /**
   *
   *
   * <pre>
   * IAM token used for both IAM user authentiation and
   * `alloydb.instances.connect` permission check.
   * </pre>
   *
   * <code>string oauth2_token = 3;</code>
   *
   * @return The bytes for oauth2Token.
   */
  com.google.protobuf.ByteString getOauth2TokenBytes();
}
