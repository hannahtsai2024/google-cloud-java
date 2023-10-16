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
// source: google/cloud/discoveryengine/v1beta/document.proto

package com.google.cloud.discoveryengine.v1beta;

public interface DocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The structured JSON data for the document. It should conform to the
   * registered [Schema][google.cloud.discoveryengine.v1beta.Schema] or an
   * `INVALID_ARGUMENT` error is thrown.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_data = 4;</code>
   *
   * @return Whether the structData field is set.
   */
  boolean hasStructData();
  /**
   *
   *
   * <pre>
   * The structured JSON data for the document. It should conform to the
   * registered [Schema][google.cloud.discoveryengine.v1beta.Schema] or an
   * `INVALID_ARGUMENT` error is thrown.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_data = 4;</code>
   *
   * @return The structData.
   */
  com.google.protobuf.Struct getStructData();
  /**
   *
   *
   * <pre>
   * The structured JSON data for the document. It should conform to the
   * registered [Schema][google.cloud.discoveryengine.v1beta.Schema] or an
   * `INVALID_ARGUMENT` error is thrown.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_data = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getStructDataOrBuilder();

  /**
   *
   *
   * <pre>
   * The JSON string representation of the document. It should conform to the
   * registered [Schema][google.cloud.discoveryengine.v1beta.Schema] or an
   * `INVALID_ARGUMENT` error is thrown.
   * </pre>
   *
   * <code>string json_data = 5;</code>
   *
   * @return Whether the jsonData field is set.
   */
  boolean hasJsonData();
  /**
   *
   *
   * <pre>
   * The JSON string representation of the document. It should conform to the
   * registered [Schema][google.cloud.discoveryengine.v1beta.Schema] or an
   * `INVALID_ARGUMENT` error is thrown.
   * </pre>
   *
   * <code>string json_data = 5;</code>
   *
   * @return The jsonData.
   */
  java.lang.String getJsonData();
  /**
   *
   *
   * <pre>
   * The JSON string representation of the document. It should conform to the
   * registered [Schema][google.cloud.discoveryengine.v1beta.Schema] or an
   * `INVALID_ARGUMENT` error is thrown.
   * </pre>
   *
   * <code>string json_data = 5;</code>
   *
   * @return The bytes for jsonData.
   */
  com.google.protobuf.ByteString getJsonDataBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The full resource name of the document.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}/documents/{document_id}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The full resource name of the document.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}/documents/{document_id}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The identifier of the document.
   *
   * Id should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Immutable. The identifier of the document.
   *
   * Id should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The identifier of the schema located in the same data store.
   * </pre>
   *
   * <code>string schema_id = 3;</code>
   *
   * @return The schemaId.
   */
  java.lang.String getSchemaId();
  /**
   *
   *
   * <pre>
   * The identifier of the schema located in the same data store.
   * </pre>
   *
   * <code>string schema_id = 3;</code>
   *
   * @return The bytes for schemaId.
   */
  com.google.protobuf.ByteString getSchemaIdBytes();

  /**
   *
   *
   * <pre>
   * The unstructured data linked to this document. Content must be set if this
   * document is under a
   * `CONTENT_REQUIRED` data store.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Document.Content content = 10;</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   *
   *
   * <pre>
   * The unstructured data linked to this document. Content must be set if this
   * document is under a
   * `CONTENT_REQUIRED` data store.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Document.Content content = 10;</code>
   *
   * @return The content.
   */
  com.google.cloud.discoveryengine.v1beta.Document.Content getContent();
  /**
   *
   *
   * <pre>
   * The unstructured data linked to this document. Content must be set if this
   * document is under a
   * `CONTENT_REQUIRED` data store.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Document.Content content = 10;</code>
   */
  com.google.cloud.discoveryengine.v1beta.Document.ContentOrBuilder getContentOrBuilder();

  /**
   *
   *
   * <pre>
   * The identifier of the parent document. Currently supports at most two level
   * document hierarchy.
   *
   * Id should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters.
   * </pre>
   *
   * <code>string parent_document_id = 7;</code>
   *
   * @return The parentDocumentId.
   */
  java.lang.String getParentDocumentId();
  /**
   *
   *
   * <pre>
   * The identifier of the parent document. Currently supports at most two level
   * document hierarchy.
   *
   * Id should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters.
   * </pre>
   *
   * <code>string parent_document_id = 7;</code>
   *
   * @return The bytes for parentDocumentId.
   */
  com.google.protobuf.ByteString getParentDocumentIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. This field is OUTPUT_ONLY.
   * It contains derived data that are not in the original input document.
   * </pre>
   *
   * <code>
   * .google.protobuf.Struct derived_struct_data = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the derivedStructData field is set.
   */
  boolean hasDerivedStructData();
  /**
   *
   *
   * <pre>
   * Output only. This field is OUTPUT_ONLY.
   * It contains derived data that are not in the original input document.
   * </pre>
   *
   * <code>
   * .google.protobuf.Struct derived_struct_data = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The derivedStructData.
   */
  com.google.protobuf.Struct getDerivedStructData();
  /**
   *
   *
   * <pre>
   * Output only. This field is OUTPUT_ONLY.
   * It contains derived data that are not in the original input document.
   * </pre>
   *
   * <code>
   * .google.protobuf.Struct derived_struct_data = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.StructOrBuilder getDerivedStructDataOrBuilder();

  com.google.cloud.discoveryengine.v1beta.Document.DataCase getDataCase();
}
