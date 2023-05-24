// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

public interface BatchRunTestCasesMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.BatchRunTestCasesMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError errors = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.TestError> 
      getErrorsList();
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.TestError getErrors(int index);
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError errors = 1;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError errors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder getErrorsOrBuilder(
      int index);
}
