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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.datatransfer.v1;

public interface TransferRunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.TransferRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the transfer run.
   * Transfer run names have the form
   * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
   * The name is ignored when creating a transfer run.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the transfer run.
   * Transfer run names have the form
   * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
   * The name is ignored when creating a transfer run.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Minimum time after which a transfer run can be started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 3;</code>
   *
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();
  /**
   *
   *
   * <pre>
   * Minimum time after which a transfer run can be started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 3;</code>
   *
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   *
   *
   * <pre>
   * Minimum time after which a transfer run can be started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * For batch transfer runs, specifies the date and time of the data should be
   * ingested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp run_time = 10;</code>
   *
   * @return Whether the runTime field is set.
   */
  boolean hasRunTime();
  /**
   *
   *
   * <pre>
   * For batch transfer runs, specifies the date and time of the data should be
   * ingested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp run_time = 10;</code>
   *
   * @return The runTime.
   */
  com.google.protobuf.Timestamp getRunTime();
  /**
   *
   *
   * <pre>
   * For batch transfer runs, specifies the date and time of the data should be
   * ingested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp run_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Status of the transfer run.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 21;</code>
   *
   * @return Whether the errorStatus field is set.
   */
  boolean hasErrorStatus();
  /**
   *
   *
   * <pre>
   * Status of the transfer run.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 21;</code>
   *
   * @return The errorStatus.
   */
  com.google.rpc.Status getErrorStatus();
  /**
   *
   *
   * <pre>
   * Status of the transfer run.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 21;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when transfer run was started.
   * Parameter ignored by server for input requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when transfer run was started.
   * Parameter ignored by server for input requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when transfer run was started.
   * Parameter ignored by server for input requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when transfer run ended.
   * Parameter ignored by server for input requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when transfer run ended.
   * Parameter ignored by server for input requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when transfer run ended.
   * Parameter ignored by server for input requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last time the data transfer run state was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last time the data transfer run state was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last time the data transfer run state was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Parameters specific to each data source. For more information
   * see the bq tab in the 'Setting up a data transfer' section for each data
   * source. For example the parameters for Cloud Storage transfers are listed
   * here:
   * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   *
   *
   * <pre>
   * Output only. Parameters specific to each data source. For more information
   * see the bq tab in the 'Setting up a data transfer' section for each data
   * source. For example the parameters for Cloud Storage transfers are listed
   * here:
   * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The params.
   */
  com.google.protobuf.Struct getParams();
  /**
   *
   *
   * <pre>
   * Output only. Parameters specific to each data source. For more information
   * see the bq tab in the 'Setting up a data transfer' section for each data
   * source. For example the parameters for Cloud Storage transfers are listed
   * here:
   * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The BigQuery target dataset id.
   * </pre>
   *
   * <code>string destination_dataset_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the destinationDatasetId field is set.
   */
  boolean hasDestinationDatasetId();
  /**
   *
   *
   * <pre>
   * Output only. The BigQuery target dataset id.
   * </pre>
   *
   * <code>string destination_dataset_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The destinationDatasetId.
   */
  java.lang.String getDestinationDatasetId();
  /**
   *
   *
   * <pre>
   * Output only. The BigQuery target dataset id.
   * </pre>
   *
   * <code>string destination_dataset_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for destinationDatasetId.
   */
  com.google.protobuf.ByteString getDestinationDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Data source id.
   * </pre>
   *
   * <code>string data_source_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dataSourceId.
   */
  java.lang.String getDataSourceId();
  /**
   *
   *
   * <pre>
   * Output only. Data source id.
   * </pre>
   *
   * <code>string data_source_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for dataSourceId.
   */
  com.google.protobuf.ByteString getDataSourceIdBytes();

  /**
   *
   *
   * <pre>
   * Data transfer run state. Ignored for input requests.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferState state = 8;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Data transfer run state. Ignored for input requests.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferState state = 8;</code>
   *
   * @return The state.
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferState getState();

  /**
   *
   *
   * <pre>
   * Deprecated. Unique ID of the user on whose behalf transfer is done.
   * </pre>
   *
   * <code>int64 user_id = 11;</code>
   *
   * @return The userId.
   */
  long getUserId();

  /**
   *
   *
   * <pre>
   * Output only. Describes the schedule of this transfer run if it was
   * created as part of a regular schedule. For batch transfer runs that are
   * scheduled manually, this is empty.
   * NOTE: the system might choose to delay the schedule depending on the
   * current load, so `schedule_time` doesn't always match this.
   * </pre>
   *
   * <code>string schedule = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   *
   *
   * <pre>
   * Output only. Describes the schedule of this transfer run if it was
   * created as part of a regular schedule. For batch transfer runs that are
   * scheduled manually, this is empty.
   * NOTE: the system might choose to delay the schedule depending on the
   * current load, so `schedule_time` doesn't always match this.
   * </pre>
   *
   * <code>string schedule = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString getScheduleBytes();

  /**
   *
   *
   * <pre>
   * Output only. Pub/Sub topic where a notification will be sent after this
   * transfer run finishes.
   *
   * The format for specifying a pubsub topic is:
   * `projects/{project_id}/topics/{topic_id}`
   * </pre>
   *
   * <code>string notification_pubsub_topic = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The notificationPubsubTopic.
   */
  java.lang.String getNotificationPubsubTopic();
  /**
   *
   *
   * <pre>
   * Output only. Pub/Sub topic where a notification will be sent after this
   * transfer run finishes.
   *
   * The format for specifying a pubsub topic is:
   * `projects/{project_id}/topics/{topic_id}`
   * </pre>
   *
   * <code>string notification_pubsub_topic = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for notificationPubsubTopic.
   */
  com.google.protobuf.ByteString getNotificationPubsubTopicBytes();

  /**
   *
   *
   * <pre>
   * Output only. Email notifications will be sent according to these
   * preferences to the email address of the user who owns the transfer config
   * this run was derived from.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.EmailPreferences email_preferences = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the emailPreferences field is set.
   */
  boolean hasEmailPreferences();
  /**
   *
   *
   * <pre>
   * Output only. Email notifications will be sent according to these
   * preferences to the email address of the user who owns the transfer config
   * this run was derived from.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.EmailPreferences email_preferences = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The emailPreferences.
   */
  com.google.cloud.bigquery.datatransfer.v1.EmailPreferences getEmailPreferences();
  /**
   *
   *
   * <pre>
   * Output only. Email notifications will be sent according to these
   * preferences to the email address of the user who owns the transfer config
   * this run was derived from.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.EmailPreferences email_preferences = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.EmailPreferencesOrBuilder
      getEmailPreferencesOrBuilder();

  com.google.cloud.bigquery.datatransfer.v1.TransferRun.DestinationCase getDestinationCase();
}
