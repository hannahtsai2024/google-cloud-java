// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/gcs.proto

package com.google.cloud.dialogflow.cx.v3;

public interface GcsDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Google Cloud Storage URI for the exported objects. A URI is
   * of the form: `gs://bucket/object-name-or-prefix` Whether a full object
   * name, or just a prefix, its usage depends on the Dialogflow operation.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Required. The Google Cloud Storage URI for the exported objects. A URI is
   * of the form: `gs://bucket/object-name-or-prefix` Whether a full object
   * name, or just a prefix, its usage depends on the Dialogflow operation.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
