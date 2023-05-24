// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document_link_service.proto

package com.google.cloud.contentwarehouse.v1;

public interface DeleteDocumentLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.DeleteDocumentLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the document-link to be deleted.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{source_document_id}/documentLinks/{document_link_id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the document-link to be deleted.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{source_document_id}/documentLinks/{document_link_id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   * @return The requestMetadata.
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata();
  /**
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder getRequestMetadataOrBuilder();
}
