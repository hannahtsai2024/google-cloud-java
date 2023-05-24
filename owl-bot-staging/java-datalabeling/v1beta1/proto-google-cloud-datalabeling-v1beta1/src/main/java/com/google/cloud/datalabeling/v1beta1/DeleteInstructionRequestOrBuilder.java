// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface DeleteInstructionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.DeleteInstructionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Instruction resource name, format:
   * projects/{project_id}/instructions/{instruction_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Instruction resource name, format:
   * projects/{project_id}/instructions/{instruction_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
