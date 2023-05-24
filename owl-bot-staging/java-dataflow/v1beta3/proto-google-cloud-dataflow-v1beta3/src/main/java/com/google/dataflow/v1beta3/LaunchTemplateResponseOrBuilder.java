// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/templates.proto

package com.google.dataflow.v1beta3;

public interface LaunchTemplateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.LaunchTemplateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   * @return The job.
   */
  com.google.dataflow.v1beta3.Job getJob();
  /**
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   */
  com.google.dataflow.v1beta3.JobOrBuilder getJobOrBuilder();
}
