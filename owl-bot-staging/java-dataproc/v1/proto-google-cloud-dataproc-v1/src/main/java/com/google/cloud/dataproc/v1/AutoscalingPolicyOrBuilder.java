// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public interface AutoscalingPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.AutoscalingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The policy id.
   *
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Required. The policy id.
   *
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`
   *
   * * For `projects.locations.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`
   *
   * * For `projects.locations.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm basic_algorithm = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the basicAlgorithm field is set.
   */
  boolean hasBasicAlgorithm();
  /**
   * <code>.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm basic_algorithm = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The basicAlgorithm.
   */
  com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm getBasicAlgorithm();
  /**
   * <code>.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm basic_algorithm = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithmOrBuilder getBasicAlgorithmOrBuilder();

  /**
   * <pre>
   * Required. Describes how the autoscaler will operate for primary workers.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig worker_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the workerConfig field is set.
   */
  boolean hasWorkerConfig();
  /**
   * <pre>
   * Required. Describes how the autoscaler will operate for primary workers.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig worker_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The workerConfig.
   */
  com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig getWorkerConfig();
  /**
   * <pre>
   * Required. Describes how the autoscaler will operate for primary workers.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig worker_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfigOrBuilder getWorkerConfigOrBuilder();

  /**
   * <pre>
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig secondary_worker_config = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the secondaryWorkerConfig field is set.
   */
  boolean hasSecondaryWorkerConfig();
  /**
   * <pre>
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig secondary_worker_config = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The secondaryWorkerConfig.
   */
  com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig getSecondaryWorkerConfig();
  /**
   * <pre>
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig secondary_worker_config = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfigOrBuilder getSecondaryWorkerConfigOrBuilder();

  /**
   * <pre>
   * Optional. The labels to associate with this autoscaling policy.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with an autoscaling policy.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The labels to associate with this autoscaling policy.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with an autoscaling policy.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The labels to associate with this autoscaling policy.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with an autoscaling policy.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The labels to associate with this autoscaling policy.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with an autoscaling policy.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The labels to associate with this autoscaling policy.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with an autoscaling policy.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  com.google.cloud.dataproc.v1.AutoscalingPolicy.AlgorithmCase getAlgorithmCase();
}
