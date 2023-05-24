// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface ProcessLinkInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.ProcessLinkInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the link in the format of
   * `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>string link = 1;</code>
   * @return The link.
   */
  java.lang.String getLink();
  /**
   * <pre>
   * The name of the link in the format of
   * `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>string link = 1;</code>
   * @return The bytes for link.
   */
  com.google.protobuf.ByteString
      getLinkBytes();

  /**
   * <pre>
   * The start of the first event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The start of the first event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * The start of the first event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * The end of the last event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The end of the last event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * The end of the last event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
