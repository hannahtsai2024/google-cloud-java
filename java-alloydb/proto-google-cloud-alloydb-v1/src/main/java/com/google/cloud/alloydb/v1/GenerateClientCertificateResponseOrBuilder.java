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
// source: google/cloud/alloydb/v1/service.proto

package com.google.cloud.alloydb.v1;

public interface GenerateClientCertificateResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.GenerateClientCertificateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the pemCertificateChain.
   */
  java.util.List<java.lang.String> getPemCertificateChainList();
  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of pemCertificateChain.
   */
  int getPemCertificateChainCount();
  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The pemCertificateChain at the given index.
   */
  java.lang.String getPemCertificateChain(int index);
  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the pemCertificateChain at the given index.
   */
  com.google.protobuf.ByteString getPemCertificateChainBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The pem-encoded cluster ca X.509 certificate.
   * </pre>
   *
   * <code>string ca_cert = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The caCert.
   */
  java.lang.String getCaCert();
  /**
   *
   *
   * <pre>
   * Optional. The pem-encoded cluster ca X.509 certificate.
   * </pre>
   *
   * <code>string ca_cert = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for caCert.
   */
  com.google.protobuf.ByteString getCaCertBytes();
}
