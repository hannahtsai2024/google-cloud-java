// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ExportTestCasesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI to a file containing the exported test cases. This field is
   * populated only if `gcs_uri` is specified in
   * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   * @return Whether the gcsUri field is set.
   */
  boolean hasGcsUri();
  /**
   * <pre>
   * The URI to a file containing the exported test cases. This field is
   * populated only if `gcs_uri` is specified in
   * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   * @return The gcsUri.
   */
  java.lang.String getGcsUri();
  /**
   * <pre>
   * The URI to a file containing the exported test cases. This field is
   * populated only if `gcs_uri` is specified in
   * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   * @return The bytes for gcsUri.
   */
  com.google.protobuf.ByteString
      getGcsUriBytes();

  /**
   * <pre>
   * Uncompressed raw byte content for test cases.
   * </pre>
   *
   * <code>bytes content = 2;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * Uncompressed raw byte content for test cases.
   * </pre>
   *
   * <code>bytes content = 2;</code>
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.DestinationCase getDestinationCase();
}
