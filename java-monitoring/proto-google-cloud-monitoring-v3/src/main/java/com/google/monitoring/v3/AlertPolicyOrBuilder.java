/*
 * Copyright 2020 Google LLC
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
// source: google/monitoring/v3/alert.proto

package com.google.monitoring.v3;

public interface AlertPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.AlertPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required if the policy exists. The resource name for this policy. The
   * format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID]
   * `[ALERT_POLICY_ID]` is assigned by Cloud Monitoring when the policy
   * is created. When calling the
   * [alertPolicies.create][google.monitoring.v3.AlertPolicyService.CreateAlertPolicy]
   * method, do not include the `name` field in the alerting policy passed as
   * part of the request.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required if the policy exists. The resource name for this policy. The
   * format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID]
   * `[ALERT_POLICY_ID]` is assigned by Cloud Monitoring when the policy
   * is created. When calling the
   * [alertPolicies.create][google.monitoring.v3.AlertPolicyService.CreateAlertPolicy]
   * method, do not include the `name` field in the alerting policy passed as
   * part of the request.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A short name or phrase used to identify the policy in dashboards,
   * notifications, and incidents. To avoid confusion, don't use the same
   * display name for multiple policies in the same project. The name is
   * limited to 512 Unicode characters.
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
   * A short name or phrase used to identify the policy in dashboards,
   * notifications, and incidents. To avoid confusion, don't use the same
   * display name for multiple policies in the same project. The name is
   * limited to 512 Unicode characters.
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
   * Documentation that is included with notifications and incidents related to
   * this policy. Best practice is for the documentation to include information
   * to help responders understand, mitigate, escalate, and correct the
   * underlying problems detected by the alerting policy. Notification channels
   * that have limited capacity might not show this documentation.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.Documentation documentation = 13;</code>
   *
   * @return Whether the documentation field is set.
   */
  boolean hasDocumentation();
  /**
   *
   *
   * <pre>
   * Documentation that is included with notifications and incidents related to
   * this policy. Best practice is for the documentation to include information
   * to help responders understand, mitigate, escalate, and correct the
   * underlying problems detected by the alerting policy. Notification channels
   * that have limited capacity might not show this documentation.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.Documentation documentation = 13;</code>
   *
   * @return The documentation.
   */
  com.google.monitoring.v3.AlertPolicy.Documentation getDocumentation();
  /**
   *
   *
   * <pre>
   * Documentation that is included with notifications and incidents related to
   * this policy. Best practice is for the documentation to include information
   * to help responders understand, mitigate, escalate, and correct the
   * underlying problems detected by the alerting policy. Notification channels
   * that have limited capacity might not show this documentation.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.Documentation documentation = 13;</code>
   */
  com.google.monitoring.v3.AlertPolicy.DocumentationOrBuilder getDocumentationOrBuilder();

  /**
   *
   *
   * <pre>
   * User-supplied key/value data to be used for organizing and
   * identifying the `AlertPolicy` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 16;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * User-supplied key/value data to be used for organizing and
   * identifying the `AlertPolicy` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 16;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * User-supplied key/value data to be used for organizing and
   * identifying the `AlertPolicy` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * User-supplied key/value data to be used for organizing and
   * identifying the `AlertPolicy` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 16;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User-supplied key/value data to be used for organizing and
   * identifying the `AlertPolicy` objects.
   * The field can contain up to 64 entries. Each key and value is limited to
   * 63 Unicode characters or 128 bytes, whichever is smaller. Labels and
   * values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 16;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A list of conditions for the policy. The conditions are combined by AND or
   * OR according to the `combiner` field. If the combined conditions evaluate
   * to true, then an incident is created. A policy can have from one to six
   * conditions.
   * If `condition_time_series_query_language` is present, it must be the only
   * `condition`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy.Condition conditions = 12;</code>
   */
  java.util.List<com.google.monitoring.v3.AlertPolicy.Condition> getConditionsList();
  /**
   *
   *
   * <pre>
   * A list of conditions for the policy. The conditions are combined by AND or
   * OR according to the `combiner` field. If the combined conditions evaluate
   * to true, then an incident is created. A policy can have from one to six
   * conditions.
   * If `condition_time_series_query_language` is present, it must be the only
   * `condition`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy.Condition conditions = 12;</code>
   */
  com.google.monitoring.v3.AlertPolicy.Condition getConditions(int index);
  /**
   *
   *
   * <pre>
   * A list of conditions for the policy. The conditions are combined by AND or
   * OR according to the `combiner` field. If the combined conditions evaluate
   * to true, then an incident is created. A policy can have from one to six
   * conditions.
   * If `condition_time_series_query_language` is present, it must be the only
   * `condition`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy.Condition conditions = 12;</code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * A list of conditions for the policy. The conditions are combined by AND or
   * OR according to the `combiner` field. If the combined conditions evaluate
   * to true, then an incident is created. A policy can have from one to six
   * conditions.
   * If `condition_time_series_query_language` is present, it must be the only
   * `condition`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy.Condition conditions = 12;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.AlertPolicy.ConditionOrBuilder>
      getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of conditions for the policy. The conditions are combined by AND or
   * OR according to the `combiner` field. If the combined conditions evaluate
   * to true, then an incident is created. A policy can have from one to six
   * conditions.
   * If `condition_time_series_query_language` is present, it must be the only
   * `condition`.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy.Condition conditions = 12;</code>
   */
  com.google.monitoring.v3.AlertPolicy.ConditionOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * How to combine the results of multiple conditions to determine if an
   * incident should be opened.
   * If `condition_time_series_query_language` is present, this must be
   * `COMBINE_UNSPECIFIED`.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.ConditionCombinerType combiner = 6;</code>
   *
   * @return The enum numeric value on the wire for combiner.
   */
  int getCombinerValue();
  /**
   *
   *
   * <pre>
   * How to combine the results of multiple conditions to determine if an
   * incident should be opened.
   * If `condition_time_series_query_language` is present, this must be
   * `COMBINE_UNSPECIFIED`.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.ConditionCombinerType combiner = 6;</code>
   *
   * @return The combiner.
   */
  com.google.monitoring.v3.AlertPolicy.ConditionCombinerType getCombiner();

  /**
   *
   *
   * <pre>
   * Whether or not the policy is enabled. On write, the default interpretation
   * if unset is that the policy is enabled. On read, clients should not make
   * any assumption about the state if it has not been populated. The
   * field should always be populated on List and Get operations, unless
   * a field projection has been specified that strips it out.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 17;</code>
   *
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   *
   *
   * <pre>
   * Whether or not the policy is enabled. On write, the default interpretation
   * if unset is that the policy is enabled. On read, clients should not make
   * any assumption about the state if it has not been populated. The
   * field should always be populated on List and Get operations, unless
   * a field projection has been specified that strips it out.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 17;</code>
   *
   * @return The enabled.
   */
  com.google.protobuf.BoolValue getEnabled();
  /**
   *
   *
   * <pre>
   * Whether or not the policy is enabled. On write, the default interpretation
   * if unset is that the policy is enabled. On read, clients should not make
   * any assumption about the state if it has not been populated. The
   * field should always be populated on List and Get operations, unless
   * a field projection has been specified that strips it out.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 17;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnabledOrBuilder();

  /**
   *
   *
   * <pre>
   * Read-only description of how the alert policy is invalid. OK if the alert
   * policy is valid. If not OK, the alert policy will not generate incidents.
   * </pre>
   *
   * <code>.google.rpc.Status validity = 18;</code>
   *
   * @return Whether the validity field is set.
   */
  boolean hasValidity();
  /**
   *
   *
   * <pre>
   * Read-only description of how the alert policy is invalid. OK if the alert
   * policy is valid. If not OK, the alert policy will not generate incidents.
   * </pre>
   *
   * <code>.google.rpc.Status validity = 18;</code>
   *
   * @return The validity.
   */
  com.google.rpc.Status getValidity();
  /**
   *
   *
   * <pre>
   * Read-only description of how the alert policy is invalid. OK if the alert
   * policy is valid. If not OK, the alert policy will not generate incidents.
   * </pre>
   *
   * <code>.google.rpc.Status validity = 18;</code>
   */
  com.google.rpc.StatusOrBuilder getValidityOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifies the notification channels to which notifications should be sent
   * when incidents are opened or closed or when new violations occur on
   * an already opened incident. Each element of this array corresponds to
   * the `name` field in each of the
   * [`NotificationChannel`][google.monitoring.v3.NotificationChannel]
   * objects that are returned from the [`ListNotificationChannels`]
   * [google.monitoring.v3.NotificationChannelService.ListNotificationChannels]
   * method. The format of the entries in this field is:
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * </pre>
   *
   * <code>repeated string notification_channels = 14;</code>
   *
   * @return A list containing the notificationChannels.
   */
  java.util.List<java.lang.String> getNotificationChannelsList();
  /**
   *
   *
   * <pre>
   * Identifies the notification channels to which notifications should be sent
   * when incidents are opened or closed or when new violations occur on
   * an already opened incident. Each element of this array corresponds to
   * the `name` field in each of the
   * [`NotificationChannel`][google.monitoring.v3.NotificationChannel]
   * objects that are returned from the [`ListNotificationChannels`]
   * [google.monitoring.v3.NotificationChannelService.ListNotificationChannels]
   * method. The format of the entries in this field is:
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * </pre>
   *
   * <code>repeated string notification_channels = 14;</code>
   *
   * @return The count of notificationChannels.
   */
  int getNotificationChannelsCount();
  /**
   *
   *
   * <pre>
   * Identifies the notification channels to which notifications should be sent
   * when incidents are opened or closed or when new violations occur on
   * an already opened incident. Each element of this array corresponds to
   * the `name` field in each of the
   * [`NotificationChannel`][google.monitoring.v3.NotificationChannel]
   * objects that are returned from the [`ListNotificationChannels`]
   * [google.monitoring.v3.NotificationChannelService.ListNotificationChannels]
   * method. The format of the entries in this field is:
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * </pre>
   *
   * <code>repeated string notification_channels = 14;</code>
   *
   * @param index The index of the element to return.
   * @return The notificationChannels at the given index.
   */
  java.lang.String getNotificationChannels(int index);
  /**
   *
   *
   * <pre>
   * Identifies the notification channels to which notifications should be sent
   * when incidents are opened or closed or when new violations occur on
   * an already opened incident. Each element of this array corresponds to
   * the `name` field in each of the
   * [`NotificationChannel`][google.monitoring.v3.NotificationChannel]
   * objects that are returned from the [`ListNotificationChannels`]
   * [google.monitoring.v3.NotificationChannelService.ListNotificationChannels]
   * method. The format of the entries in this field is:
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * </pre>
   *
   * <code>repeated string notification_channels = 14;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the notificationChannels at the given index.
   */
  com.google.protobuf.ByteString getNotificationChannelsBytes(int index);

  /**
   *
   *
   * <pre>
   * A read-only record of the creation of the alerting policy. If provided
   * in a call to create or update, this field will be ignored.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord creation_record = 10;</code>
   *
   * @return Whether the creationRecord field is set.
   */
  boolean hasCreationRecord();
  /**
   *
   *
   * <pre>
   * A read-only record of the creation of the alerting policy. If provided
   * in a call to create or update, this field will be ignored.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord creation_record = 10;</code>
   *
   * @return The creationRecord.
   */
  com.google.monitoring.v3.MutationRecord getCreationRecord();
  /**
   *
   *
   * <pre>
   * A read-only record of the creation of the alerting policy. If provided
   * in a call to create or update, this field will be ignored.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord creation_record = 10;</code>
   */
  com.google.monitoring.v3.MutationRecordOrBuilder getCreationRecordOrBuilder();

  /**
   *
   *
   * <pre>
   * A read-only record of the most recent change to the alerting policy. If
   * provided in a call to create or update, this field will be ignored.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord mutation_record = 11;</code>
   *
   * @return Whether the mutationRecord field is set.
   */
  boolean hasMutationRecord();
  /**
   *
   *
   * <pre>
   * A read-only record of the most recent change to the alerting policy. If
   * provided in a call to create or update, this field will be ignored.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord mutation_record = 11;</code>
   *
   * @return The mutationRecord.
   */
  com.google.monitoring.v3.MutationRecord getMutationRecord();
  /**
   *
   *
   * <pre>
   * A read-only record of the most recent change to the alerting policy. If
   * provided in a call to create or update, this field will be ignored.
   * </pre>
   *
   * <code>.google.monitoring.v3.MutationRecord mutation_record = 11;</code>
   */
  com.google.monitoring.v3.MutationRecordOrBuilder getMutationRecordOrBuilder();

  /**
   *
   *
   * <pre>
   * Control over how this alert policy's notification channels are notified.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.AlertStrategy alert_strategy = 21;</code>
   *
   * @return Whether the alertStrategy field is set.
   */
  boolean hasAlertStrategy();
  /**
   *
   *
   * <pre>
   * Control over how this alert policy's notification channels are notified.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.AlertStrategy alert_strategy = 21;</code>
   *
   * @return The alertStrategy.
   */
  com.google.monitoring.v3.AlertPolicy.AlertStrategy getAlertStrategy();
  /**
   *
   *
   * <pre>
   * Control over how this alert policy's notification channels are notified.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy.AlertStrategy alert_strategy = 21;</code>
   */
  com.google.monitoring.v3.AlertPolicy.AlertStrategyOrBuilder getAlertStrategyOrBuilder();
}
