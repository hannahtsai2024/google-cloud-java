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
// source: google/cloud/confidentialcomputing/v1/service.proto

package com.google.cloud.confidentialcomputing.v1;

public interface TokenOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.confidentialcomputing.v1.TokenOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Optional string to issue the token with a custom audience claim.
   * Required if one or more nonces are specified.
   * </pre>
   *
   * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The audience.
   */
  java.lang.String getAudience();
  /**
   *
   *
   * <pre>
   * Optional. Optional string to issue the token with a custom audience claim.
   * Required if one or more nonces are specified.
   * </pre>
   *
   * <code>string audience = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for audience.
   */
  com.google.protobuf.ByteString getAudienceBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the nonce.
   */
  java.util.List<java.lang.String> getNonceList();
  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of nonce.
   */
  int getNonceCount();
  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The nonce at the given index.
   */
  java.lang.String getNonce(int index);
  /**
   *
   *
   * <pre>
   * Optional. Optional parameter to place one or more nonces in the eat_nonce
   * claim in the output token. The minimum size for JSON-encoded EATs is 10
   * bytes and the maximum size is 74 bytes.
   * </pre>
   *
   * <code>repeated string nonce = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nonce at the given index.
   */
  com.google.protobuf.ByteString getNonceBytes(int index);
}
