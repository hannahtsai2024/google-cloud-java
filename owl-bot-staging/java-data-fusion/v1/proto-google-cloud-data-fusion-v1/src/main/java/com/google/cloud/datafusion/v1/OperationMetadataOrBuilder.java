// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1/datafusion.proto

package com.google.cloud.datafusion.v1;

public interface OperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   * @return The verb.
   */
  java.lang.String getVerb();
  /**
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   * @return The bytes for verb.
   */
  com.google.protobuf.ByteString
      getVerbBytes();

  /**
   * <pre>
   * Human-readable status of the operation if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   * @return The statusDetail.
   */
  java.lang.String getStatusDetail();
  /**
   * <pre>
   * Human-readable status of the operation if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   * @return The bytes for statusDetail.
   */
  com.google.protobuf.ByteString
      getStatusDetailBytes();

  /**
   * <pre>
   * Identifies whether the user has requested cancellation
   * of the operation. Operations that have successfully been cancelled
   * have [Operation.error][] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1,
   * corresponding to `Code.CANCELLED`.
   * </pre>
   *
   * <code>bool requested_cancellation = 6;</code>
   * @return The requestedCancellation.
   */
  boolean getRequestedCancellation();

  /**
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   * @return The apiVersion.
   */
  java.lang.String getApiVersion();
  /**
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   * @return The bytes for apiVersion.
   */
  com.google.protobuf.ByteString
      getApiVersionBytes();

  /**
   * <pre>
   * Map to hold any additional status info for the operation
   * If there is an accelerator being enabled/disabled/deleted, this will be
   * populated with accelerator name as key and status as
   * ENABLING, DISABLING or DELETING
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_status = 8;</code>
   */
  int getAdditionalStatusCount();
  /**
   * <pre>
   * Map to hold any additional status info for the operation
   * If there is an accelerator being enabled/disabled/deleted, this will be
   * populated with accelerator name as key and status as
   * ENABLING, DISABLING or DELETING
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_status = 8;</code>
   */
  boolean containsAdditionalStatus(
      java.lang.String key);
  /**
   * Use {@link #getAdditionalStatusMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAdditionalStatus();
  /**
   * <pre>
   * Map to hold any additional status info for the operation
   * If there is an accelerator being enabled/disabled/deleted, this will be
   * populated with accelerator name as key and status as
   * ENABLING, DISABLING or DELETING
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_status = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAdditionalStatusMap();
  /**
   * <pre>
   * Map to hold any additional status info for the operation
   * If there is an accelerator being enabled/disabled/deleted, this will be
   * populated with accelerator name as key and status as
   * ENABLING, DISABLING or DELETING
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_status = 8;</code>
   */
  /* nullable */
java.lang.String getAdditionalStatusOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Map to hold any additional status info for the operation
   * If there is an accelerator being enabled/disabled/deleted, this will be
   * populated with accelerator name as key and status as
   * ENABLING, DISABLING or DELETING
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_status = 8;</code>
   */
  java.lang.String getAdditionalStatusOrThrow(
      java.lang.String key);
}
