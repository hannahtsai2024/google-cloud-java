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
// source: google/cloud/osconfig/v1/os_policy_assignment_reports.proto

package com.google.cloud.osconfig.v1;

public interface OSPolicyAssignmentReportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.OSPolicyAssignmentReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `OSPolicyAssignmentReport` API resource name.
   * Format:
   * `projects/{project_number}/locations/{location}/instances/{instance_id}/osPolicyAssignments/{os_policy_assignment_id}/report`
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
   * The `OSPolicyAssignmentReport` API resource name.
   * Format:
   * `projects/{project_number}/locations/{location}/instances/{instance_id}/osPolicyAssignments/{os_policy_assignment_id}/report`
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
   * The Compute Engine VM instance name.
   * </pre>
   *
   * <code>string instance = 2;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * The Compute Engine VM instance name.
   * </pre>
   *
   * <code>string instance = 2;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * Reference to the `OSPolicyAssignment` API resource that the `OSPolicy`
   * belongs to.
   * Format:
   * `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id&#64;revision_id}`
   * </pre>
   *
   * <code>string os_policy_assignment = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The osPolicyAssignment.
   */
  java.lang.String getOsPolicyAssignment();
  /**
   *
   *
   * <pre>
   * Reference to the `OSPolicyAssignment` API resource that the `OSPolicy`
   * belongs to.
   * Format:
   * `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id&#64;revision_id}`
   * </pre>
   *
   * <code>string os_policy_assignment = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for osPolicyAssignment.
   */
  com.google.protobuf.ByteString getOsPolicyAssignmentBytes();

  /**
   *
   *
   * <pre>
   * Compliance data for each `OSPolicy` that is applied to the VM.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance os_policy_compliances = 4;
   * </code>
   */
  java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance>
      getOsPolicyCompliancesList();
  /**
   *
   *
   * <pre>
   * Compliance data for each `OSPolicy` that is applied to the VM.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance os_policy_compliances = 4;
   * </code>
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance getOsPolicyCompliances(
      int index);
  /**
   *
   *
   * <pre>
   * Compliance data for each `OSPolicy` that is applied to the VM.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance os_policy_compliances = 4;
   * </code>
   */
  int getOsPolicyCompliancesCount();
  /**
   *
   *
   * <pre>
   * Compliance data for each `OSPolicy` that is applied to the VM.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance os_policy_compliances = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyComplianceOrBuilder>
      getOsPolicyCompliancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Compliance data for each `OSPolicy` that is applied to the VM.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance os_policy_compliances = 4;
   * </code>
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyComplianceOrBuilder
      getOsPolicyCompliancesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Timestamp for when the report was last generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Timestamp for when the report was last generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Timestamp for when the report was last generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Unique identifier of the last attempted run to apply the OS policies
   * associated with this assignment on the VM.
   * This ID is logged by the OS Config agent while applying the OS
   * policies associated with this assignment on the VM.
   * NOTE: If the service is unable to successfully connect to the agent for
   * this run, then this id will not be available in the agent logs.
   * </pre>
   *
   * <code>string last_run_id = 6;</code>
   *
   * @return The lastRunId.
   */
  java.lang.String getLastRunId();
  /**
   *
   *
   * <pre>
   * Unique identifier of the last attempted run to apply the OS policies
   * associated with this assignment on the VM.
   * This ID is logged by the OS Config agent while applying the OS
   * policies associated with this assignment on the VM.
   * NOTE: If the service is unable to successfully connect to the agent for
   * this run, then this id will not be available in the agent logs.
   * </pre>
   *
   * <code>string last_run_id = 6;</code>
   *
   * @return The bytes for lastRunId.
   */
  com.google.protobuf.ByteString getLastRunIdBytes();
}
