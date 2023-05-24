// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

public interface TextInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.TextInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The UTF-8 encoded natural language text to be processed. Text
   * length must not exceed 256 characters.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Required. The UTF-8 encoded natural language text to be processed. Text
   * length must not exceed 256 characters.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}
