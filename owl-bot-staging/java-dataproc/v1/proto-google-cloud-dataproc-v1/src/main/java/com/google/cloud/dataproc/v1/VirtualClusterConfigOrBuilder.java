// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface VirtualClusterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.VirtualClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A Cloud Storage bucket used to stage job
   * dependencies, config files, and job driver console output.
   * If you do not specify a staging bucket, Cloud
   * Dataproc will determine a Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the
   * Compute Engine zone where your cluster is deployed, and then create
   * and manage this project-level, per-location bucket (see
   * [Dataproc staging and temp
   * buckets](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * **This field requires a Cloud Storage bucket name, not a `gs://...` URI to
   * a Cloud Storage bucket.**
   * </pre>
   *
   * <code>string staging_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The stagingBucket.
   */
  java.lang.String getStagingBucket();
  /**
   * <pre>
   * Optional. A Cloud Storage bucket used to stage job
   * dependencies, config files, and job driver console output.
   * If you do not specify a staging bucket, Cloud
   * Dataproc will determine a Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the
   * Compute Engine zone where your cluster is deployed, and then create
   * and manage this project-level, per-location bucket (see
   * [Dataproc staging and temp
   * buckets](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * **This field requires a Cloud Storage bucket name, not a `gs://...` URI to
   * a Cloud Storage bucket.**
   * </pre>
   *
   * <code>string staging_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for stagingBucket.
   */
  com.google.protobuf.ByteString
      getStagingBucketBytes();

  /**
   * <pre>
   * Required. The configuration for running the Dataproc cluster on
   * Kubernetes.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KubernetesClusterConfig kubernetes_cluster_config = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the kubernetesClusterConfig field is set.
   */
  boolean hasKubernetesClusterConfig();
  /**
   * <pre>
   * Required. The configuration for running the Dataproc cluster on
   * Kubernetes.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KubernetesClusterConfig kubernetes_cluster_config = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The kubernetesClusterConfig.
   */
  com.google.cloud.dataproc.v1.KubernetesClusterConfig getKubernetesClusterConfig();
  /**
   * <pre>
   * Required. The configuration for running the Dataproc cluster on
   * Kubernetes.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KubernetesClusterConfig kubernetes_cluster_config = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1.KubernetesClusterConfigOrBuilder getKubernetesClusterConfigOrBuilder();

  /**
   * <pre>
   * Optional. Configuration of auxiliary services used by this cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.AuxiliaryServicesConfig auxiliary_services_config = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the auxiliaryServicesConfig field is set.
   */
  boolean hasAuxiliaryServicesConfig();
  /**
   * <pre>
   * Optional. Configuration of auxiliary services used by this cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.AuxiliaryServicesConfig auxiliary_services_config = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The auxiliaryServicesConfig.
   */
  com.google.cloud.dataproc.v1.AuxiliaryServicesConfig getAuxiliaryServicesConfig();
  /**
   * <pre>
   * Optional. Configuration of auxiliary services used by this cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.AuxiliaryServicesConfig auxiliary_services_config = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.AuxiliaryServicesConfigOrBuilder getAuxiliaryServicesConfigOrBuilder();

  com.google.cloud.dataproc.v1.VirtualClusterConfig.InfrastructureConfigCase getInfrastructureConfigCase();
}
