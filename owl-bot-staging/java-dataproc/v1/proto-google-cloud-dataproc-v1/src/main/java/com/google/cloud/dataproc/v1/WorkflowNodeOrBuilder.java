// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface WorkflowNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.WorkflowNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the node.
   * </pre>
   *
   * <code>string step_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The stepId.
   */
  java.lang.String getStepId();
  /**
   * <pre>
   * Output only. The name of the node.
   * </pre>
   *
   * <code>string step_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for stepId.
   */
  com.google.protobuf.ByteString
      getStepIdBytes();

  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the prerequisiteStepIds.
   */
  java.util.List<java.lang.String>
      getPrerequisiteStepIdsList();
  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of prerequisiteStepIds.
   */
  int getPrerequisiteStepIdsCount();
  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The prerequisiteStepIds at the given index.
   */
  java.lang.String getPrerequisiteStepIds(int index);
  /**
   * <pre>
   * Output only. Node's prerequisite nodes.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the prerequisiteStepIds at the given index.
   */
  com.google.protobuf.ByteString
      getPrerequisiteStepIdsBytes(int index);

  /**
   * <pre>
   * Output only. The job id; populated after the node enters RUNNING state.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * Output only. The job id; populated after the node enters RUNNING state.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * Output only. The node state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowNode.NodeState state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The node state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowNode.NodeState state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.dataproc.v1.WorkflowNode.NodeState getState();

  /**
   * <pre>
   * Output only. The error detail.
   * </pre>
   *
   * <code>string error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <pre>
   * Output only. The error detail.
   * </pre>
   *
   * <code>string error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
