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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface UploadRagFileResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UploadRagFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   *
   * @return Whether the ragFile field is set.
   */
  boolean hasRagFile();
  /**
   *
   *
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   *
   * @return The ragFile.
   */
  com.google.cloud.aiplatform.v1beta1.RagFile getRagFile();
  /**
   *
   *
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder getRagFileOrBuilder();

  /**
   *
   *
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.ResultCase getResultCase();
}
