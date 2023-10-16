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
// source: google/cloud/alloydb/v1beta/service.proto

package com.google.cloud.alloydb.v1beta;

public interface GenerateClientCertificateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.GenerateClientCertificateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource. The required format is:
   *  * projects/{project}/locations/{location}/clusters/{cluster}
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
   * Required. The name of the parent resource. The required format is:
   *  * projects/{project}/locations/{location}/clusters/{cluster}
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
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes after the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes after the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. A pem-encoded X.509 certificate signing request (CSR).
   * </pre>
   *
   * <code>string pem_csr = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @deprecated google.cloud.alloydb.v1beta.GenerateClientCertificateRequest.pem_csr is deprecated.
   *     See google/cloud/alloydb/v1beta/service.proto;l=1351
   * @return The pemCsr.
   */
  @java.lang.Deprecated
  java.lang.String getPemCsr();
  /**
   *
   *
   * <pre>
   * Optional. A pem-encoded X.509 certificate signing request (CSR).
   * </pre>
   *
   * <code>string pem_csr = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @deprecated google.cloud.alloydb.v1beta.GenerateClientCertificateRequest.pem_csr is deprecated.
   *     See google/cloud/alloydb/v1beta/service.proto;l=1351
   * @return The bytes for pemCsr.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getPemCsrBytes();

  /**
   *
   *
   * <pre>
   * Optional. An optional hint to the endpoint to generate the client
   * certificate with the requested duration. The duration can be from 1 hour to
   * 24 hours. The endpoint may or may not honor the hint. If the hint is left
   * unspecified or is not honored, then the endpoint will pick an appropriate
   * default duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration cert_duration = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the certDuration field is set.
   */
  boolean hasCertDuration();
  /**
   *
   *
   * <pre>
   * Optional. An optional hint to the endpoint to generate the client
   * certificate with the requested duration. The duration can be from 1 hour to
   * 24 hours. The endpoint may or may not honor the hint. If the hint is left
   * unspecified or is not honored, then the endpoint will pick an appropriate
   * default duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration cert_duration = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The certDuration.
   */
  com.google.protobuf.Duration getCertDuration();
  /**
   *
   *
   * <pre>
   * Optional. An optional hint to the endpoint to generate the client
   * certificate with the requested duration. The duration can be from 1 hour to
   * 24 hours. The endpoint may or may not honor the hint. If the hint is left
   * unspecified or is not honored, then the endpoint will pick an appropriate
   * default duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration cert_duration = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getCertDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The public key from the client.
   * </pre>
   *
   * <code>string public_key = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The publicKey.
   */
  java.lang.String getPublicKey();
  /**
   *
   *
   * <pre>
   * Optional. The public key from the client.
   * </pre>
   *
   * <code>string public_key = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for publicKey.
   */
  com.google.protobuf.ByteString getPublicKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. An optional hint to the endpoint to generate a client
   * ceritificate that can be used by AlloyDB connectors to exchange additional
   * metadata with the server after TLS handshake.
   * </pre>
   *
   * <code>bool use_metadata_exchange = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The useMetadataExchange.
   */
  boolean getUseMetadataExchange();
}
