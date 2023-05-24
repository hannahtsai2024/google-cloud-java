// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface TestRunDifferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TestRunDifference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of diff.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of diff.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
   * @return The type.
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType getType();

  /**
   * <pre>
   * A description of the diff, showing the actual output vs expected output.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description of the diff, showing the actual output vs expected output.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
