// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

public interface JobExecutionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.JobExecutionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  int getStagesCount();
  /**
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  boolean containsStages(
      java.lang.String key);
  /**
   * Use {@link #getStagesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
  getStages();
  /**
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.dataflow.v1beta3.JobExecutionStageInfo>
  getStagesMap();
  /**
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  /* nullable */
com.google.dataflow.v1beta3.JobExecutionStageInfo getStagesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.dataflow.v1beta3.JobExecutionStageInfo defaultValue);
  /**
   * <pre>
   * A mapping from each stage to the information about that stage.
   * </pre>
   *
   * <code>map&lt;string, .google.dataflow.v1beta3.JobExecutionStageInfo&gt; stages = 1;</code>
   */
  com.google.dataflow.v1beta3.JobExecutionStageInfo getStagesOrThrow(
      java.lang.String key);
}
