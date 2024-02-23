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
// source: google/cloud/batch/v1alpha/job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.batch.v1alpha;

public interface TaskGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.TaskGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. TaskGroup name.
   * The system generates this field based on parent Job name.
   * For example:
   * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01".
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
   * Output only. TaskGroup name.
   * The system generates this field based on parent Job name.
   * For example:
   * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01".
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
   * Required. Tasks in the group share the same task spec.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.TaskSpec task_spec = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the taskSpec field is set.
   */
  boolean hasTaskSpec();
  /**
   *
   *
   * <pre>
   * Required. Tasks in the group share the same task spec.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.TaskSpec task_spec = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The taskSpec.
   */
  com.google.cloud.batch.v1alpha.TaskSpec getTaskSpec();
  /**
   *
   *
   * <pre>
   * Required. Tasks in the group share the same task spec.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.TaskSpec task_spec = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.batch.v1alpha.TaskSpecOrBuilder getTaskSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of Tasks in the TaskGroup.
   * Default is 1.
   * </pre>
   *
   * <code>int64 task_count = 4;</code>
   *
   * @return The taskCount.
   */
  long getTaskCount();

  /**
   *
   *
   * <pre>
   * Max number of tasks that can run in parallel.
   * Default to min(task_count, parallel tasks per job limit).
   * See: [Job Limits](https://cloud.google.com/batch/quotas#job_limits).
   * Field parallelism must be 1 if the scheduling_policy is IN_ORDER.
   * </pre>
   *
   * <code>int64 parallelism = 5;</code>
   *
   * @return The parallelism.
   */
  long getParallelism();

  /**
   *
   *
   * <pre>
   * Scheduling policy for Tasks in the TaskGroup.
   * The default value is AS_SOON_AS_POSSIBLE.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskGroup.SchedulingPolicy scheduling_policy = 6;</code>
   *
   * @return The enum numeric value on the wire for schedulingPolicy.
   */
  int getSchedulingPolicyValue();
  /**
   *
   *
   * <pre>
   * Scheduling policy for Tasks in the TaskGroup.
   * The default value is AS_SOON_AS_POSSIBLE.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskGroup.SchedulingPolicy scheduling_policy = 6;</code>
   *
   * @return The schedulingPolicy.
   */
  com.google.cloud.batch.v1alpha.TaskGroup.SchedulingPolicy getSchedulingPolicy();

  /**
   *
   *
   * <pre>
   * Compute resource allocation for the TaskGroup.
   * If specified, it overrides resources in Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy allocation_policy = 7;</code>
   *
   * @return Whether the allocationPolicy field is set.
   */
  boolean hasAllocationPolicy();
  /**
   *
   *
   * <pre>
   * Compute resource allocation for the TaskGroup.
   * If specified, it overrides resources in Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy allocation_policy = 7;</code>
   *
   * @return The allocationPolicy.
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy getAllocationPolicy();
  /**
   *
   *
   * <pre>
   * Compute resource allocation for the TaskGroup.
   * If specified, it overrides resources in Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy allocation_policy = 7;</code>
   */
  com.google.cloud.batch.v1alpha.AllocationPolicyOrBuilder getAllocationPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels for the TaskGroup.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels for the TaskGroup.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels for the TaskGroup.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels for the TaskGroup.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels for the TaskGroup.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels.  [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   *
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Environment task_environments = 9;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.Environment> getTaskEnvironmentsList();
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   *
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Environment task_environments = 9;</code>
   */
  com.google.cloud.batch.v1alpha.Environment getTaskEnvironments(int index);
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   *
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Environment task_environments = 9;</code>
   */
  int getTaskEnvironmentsCount();
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   *
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Environment task_environments = 9;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.EnvironmentOrBuilder>
      getTaskEnvironmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of environment variable mappings, which are passed to Tasks with
   * matching indices. If task_environments is used then task_count should
   * not be specified in the request (and will be ignored). Task count will be
   * the length of task_environments.
   *
   * Tasks get a BATCH_TASK_INDEX and BATCH_TASK_COUNT environment variable, in
   * addition to any environment variables set in task_environments, specifying
   * the number of Tasks in the Task's parent TaskGroup, and the specific Task's
   * index in the TaskGroup (0 through BATCH_TASK_COUNT - 1).
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.Environment task_environments = 9;</code>
   */
  com.google.cloud.batch.v1alpha.EnvironmentOrBuilder getTaskEnvironmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Max number of tasks that can be run on a VM at the same time.
   * If not specified, the system will decide a value based on available
   * compute resources on a VM and task requirements.
   * </pre>
   *
   * <code>int64 task_count_per_node = 10;</code>
   *
   * @return The taskCountPerNode.
   */
  long getTaskCountPerNode();

  /**
   *
   *
   * <pre>
   * When true, Batch will populate a file with a list of all VMs assigned to
   * the TaskGroup and set the BATCH_HOSTS_FILE environment variable to the path
   * of that file. Defaults to false. The host file supports up to 1000 VMs.
   * </pre>
   *
   * <code>bool require_hosts_file = 11;</code>
   *
   * @return The requireHostsFile.
   */
  boolean getRequireHostsFile();

  /**
   *
   *
   * <pre>
   * When true, Batch will configure SSH to allow passwordless login between
   * VMs running the Batch tasks in the same TaskGroup.
   * </pre>
   *
   * <code>bool permissive_ssh = 12;</code>
   *
   * @return The permissiveSsh.
   */
  boolean getPermissiveSsh();

  /**
   *
   *
   * <pre>
   * Optional. If not set or set to false, Batch uses the root user to execute
   * runnables. If set to true, Batch runs the runnables using a non-root user.
   * Currently, the non-root user Batch used is generated by OS Login. For more
   * information, see [About OS
   * Login](https://cloud.google.com/compute/docs/oslogin).
   * </pre>
   *
   * <code>bool run_as_non_root = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The runAsNonRoot.
   */
  boolean getRunAsNonRoot();
}
