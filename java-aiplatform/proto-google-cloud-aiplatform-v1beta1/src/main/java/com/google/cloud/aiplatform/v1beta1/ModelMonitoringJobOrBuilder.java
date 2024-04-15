/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_monitoring_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ModelMonitoringJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelMonitoringJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of a ModelMonitoringJob. Format:
   * `projects/{project_id}/locations/{location_id}/modelMonitors/{model_monitor_id}/modelMonitoringJobs/{model_monitoring_job_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of a ModelMonitoringJob. Format:
   * `projects/{project_id}/locations/{location_id}/modelMonitors/{model_monitor_id}/modelMonitoringJobs/{model_monitoring_job_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The display name of the ModelMonitoringJob.
   * The name can be up to 128 characters long and can consist of any UTF-8.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the ModelMonitoringJob.
   * The name can be up to 128 characters long and can consist of any UTF-8.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Monitoring monitoring job spec. It outlines the specifications for
   * monitoring objectives, notifications, and result exports. If left blank,
   * the default monitoring specifications from the top-level resource
   * 'ModelMonitor' will be applied. If provided, we will use the specification
   * defined here rather than the default one.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringSpec model_monitoring_spec = 3;</code>
   *
   * @return Whether the modelMonitoringSpec field is set.
   */
  boolean hasModelMonitoringSpec();
  /**
   *
   *
   * <pre>
   * Monitoring monitoring job spec. It outlines the specifications for
   * monitoring objectives, notifications, and result exports. If left blank,
   * the default monitoring specifications from the top-level resource
   * 'ModelMonitor' will be applied. If provided, we will use the specification
   * defined here rather than the default one.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringSpec model_monitoring_spec = 3;</code>
   *
   * @return The modelMonitoringSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpec getModelMonitoringSpec();
  /**
   *
   *
   * <pre>
   * Monitoring monitoring job spec. It outlines the specifications for
   * monitoring objectives, notifications, and result exports. If left blank,
   * the default monitoring specifications from the top-level resource
   * 'ModelMonitor' will be applied. If provided, we will use the specification
   * defined here rather than the default one.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringSpec model_monitoring_spec = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecOrBuilder
      getModelMonitoringSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was updated most
   * recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was updated most
   * recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was updated most
   * recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the monitoring job.
   *  * When the job is still creating, the state will be 'JOB_STATE_PENDING'.
   *  * Once the job is successfully created, the state will be
   *    'JOB_STATE_RUNNING'.
   *  * Once the job is finished, the state will be one of
   *    'JOB_STATE_FAILED', 'JOB_STATE_SUCCEEDED',
   *    'JOB_STATE_PARTIALLY_SUCCEEDED'.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the monitoring job.
   *  * When the job is still creating, the state will be 'JOB_STATE_PENDING'.
   *  * Once the job is successfully created, the state will be
   *    'JOB_STATE_RUNNING'.
   *  * Once the job is finished, the state will be one of
   *    'JOB_STATE_FAILED', 'JOB_STATE_SUCCEEDED',
   *    'JOB_STATE_PARTIALLY_SUCCEEDED'.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.JobState getState();

  /**
   *
   *
   * <pre>
   * Output only. Schedule resource name. It will only appear when this job is
   * triggered by a schedule.
   * </pre>
   *
   * <code>
   * string schedule = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   *
   *
   * <pre>
   * Output only. Schedule resource name. It will only appear when this job is
   * triggered by a schedule.
   * </pre>
   *
   * <code>
   * string schedule = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString getScheduleBytes();

  /**
   *
   *
   * <pre>
   * Output only. Execution results for all the monitoring objectives.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringJobExecutionDetail job_execution_detail = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the jobExecutionDetail field is set.
   */
  boolean hasJobExecutionDetail();
  /**
   *
   *
   * <pre>
   * Output only. Execution results for all the monitoring objectives.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringJobExecutionDetail job_execution_detail = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The jobExecutionDetail.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringJobExecutionDetail getJobExecutionDetail();
  /**
   *
   *
   * <pre>
   * Output only. Execution results for all the monitoring objectives.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringJobExecutionDetail job_execution_detail = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringJobExecutionDetailOrBuilder
      getJobExecutionDetailOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was scheduled. It will
   * only appear when this job is triggered by a schedule.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp schedule_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was scheduled. It will
   * only appear when this job is triggered by a schedule.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp schedule_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitoringJob was scheduled. It will
   * only appear when this job is triggered by a schedule.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp schedule_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();
}
