/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

package com.google.cloud.policytroubleshooter.iam.v3;

public interface ExplainedAllowPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this policy_ provides the specified permission
   * to the specified principal for the specified resource.
   *
   * This field does _not_ indicate whether the principal actually has the
   * permission for the resource. There might be another policy that overrides
   * this policy. To determine whether the principal actually has the
   * permission, use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowAccessState allow_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for allowAccessState.
   */
  int getAllowAccessStateValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this policy_ provides the specified permission
   * to the specified principal for the specified resource.
   *
   * This field does _not_ indicate whether the principal actually has the
   * permission for the resource. There might be another policy that overrides
   * this policy. To determine whether the principal actually has the
   * permission, use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowAccessState allow_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The allowAccessState.
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowAccessState getAllowAccessState();

  /**
   *
   *
   * <pre>
   * The full resource name that identifies the resource. For example,
   * `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   *
   * For examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   *
   * @return The fullResourceName.
   */
  java.lang.String getFullResourceName();
  /**
   *
   *
   * <pre>
   * The full resource name that identifies the resource. For example,
   * `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   *
   * For examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   *
   * @return The bytes for fullResourceName.
   */
  com.google.protobuf.ByteString getFullResourceNameBytes();

  /**
   *
   *
   * <pre>
   * Details about how each role binding in the policy affects the principal's
   * ability, or inability, to use the permission for the resource. The order of
   * the role bindings matches the role binding order in the policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation binding_explanations = 3;
   * </code>
   */
  java.util.List<com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation>
      getBindingExplanationsList();
  /**
   *
   *
   * <pre>
   * Details about how each role binding in the policy affects the principal's
   * ability, or inability, to use the permission for the resource. The order of
   * the role bindings matches the role binding order in the policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation binding_explanations = 3;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation getBindingExplanations(
      int index);
  /**
   *
   *
   * <pre>
   * Details about how each role binding in the policy affects the principal's
   * ability, or inability, to use the permission for the resource. The order of
   * the role bindings matches the role binding order in the policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation binding_explanations = 3;
   * </code>
   */
  int getBindingExplanationsCount();
  /**
   *
   *
   * <pre>
   * Details about how each role binding in the policy affects the principal's
   * ability, or inability, to use the permission for the resource. The order of
   * the role bindings matches the role binding order in the policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation binding_explanations = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanationOrBuilder>
      getBindingExplanationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Details about how each role binding in the policy affects the principal's
   * ability, or inability, to use the permission for the resource. The order of
   * the role bindings matches the role binding order in the policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation binding_explanations = 3;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanationOrBuilder
      getBindingExplanationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The relevance of this policy to the overall access state in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 4;</code>
   *
   * @return The enum numeric value on the wire for relevance.
   */
  int getRelevanceValue();
  /**
   *
   *
   * <pre>
   * The relevance of this policy to the overall access state in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 4;</code>
   *
   * @return The relevance.
   */
  com.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance getRelevance();

  /**
   *
   *
   * <pre>
   * The IAM allow policy attached to the resource.
   *
   * If the sender of the request does not have access to the policy, this field
   * is empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 5;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * The IAM allow policy attached to the resource.
   *
   * If the sender of the request does not have access to the policy, this field
   * is empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 5;</code>
   *
   * @return The policy.
   */
  com.google.iam.v1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * The IAM allow policy attached to the resource.
   *
   * If the sender of the request does not have access to the policy, this field
   * is empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 5;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder();
}
