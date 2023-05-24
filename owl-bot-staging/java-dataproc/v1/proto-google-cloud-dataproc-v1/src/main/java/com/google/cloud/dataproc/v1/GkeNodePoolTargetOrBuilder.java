// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface GkeNodePoolTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.GkeNodePoolTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The target GKE node pool.
   * Format:
   * 'projects/{project}/locations/{location}/clusters/{cluster}/nodePools/{node_pool}'
   * </pre>
   *
   * <code>string node_pool = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nodePool.
   */
  java.lang.String getNodePool();
  /**
   * <pre>
   * Required. The target GKE node pool.
   * Format:
   * 'projects/{project}/locations/{location}/clusters/{cluster}/nodePools/{node_pool}'
   * </pre>
   *
   * <code>string node_pool = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for nodePool.
   */
  com.google.protobuf.ByteString
      getNodePoolBytes();

  /**
   * <pre>
   * Required. The roles associated with the GKE node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the roles.
   */
  java.util.List<com.google.cloud.dataproc.v1.GkeNodePoolTarget.Role> getRolesList();
  /**
   * <pre>
   * Required. The roles associated with the GKE node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of roles.
   */
  int getRolesCount();
  /**
   * <pre>
   * Required. The roles associated with the GKE node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The roles at the given index.
   */
  com.google.cloud.dataproc.v1.GkeNodePoolTarget.Role getRoles(int index);
  /**
   * <pre>
   * Required. The roles associated with the GKE node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for roles.
   */
  java.util.List<java.lang.Integer>
  getRolesValueList();
  /**
   * <pre>
   * Required. The roles associated with the GKE node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of roles at the given index.
   */
  int getRolesValue(int index);

  /**
   * <pre>
   * Input only. The configuration for the GKE node pool.
   *
   * If specified, Dataproc attempts to create a node pool with the
   * specified shape. If one with the same name already exists, it is
   * verified against all specified fields. If a field differs, the
   * virtual cluster creation will fail.
   *
   * If omitted, any node pool with the specified name is used. If a
   * node pool with the specified name does not exist, Dataproc create a
   * node pool with default values.
   *
   * This is an input only field. It will not be returned by the API.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GkeNodePoolConfig node_pool_config = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return Whether the nodePoolConfig field is set.
   */
  boolean hasNodePoolConfig();
  /**
   * <pre>
   * Input only. The configuration for the GKE node pool.
   *
   * If specified, Dataproc attempts to create a node pool with the
   * specified shape. If one with the same name already exists, it is
   * verified against all specified fields. If a field differs, the
   * virtual cluster creation will fail.
   *
   * If omitted, any node pool with the specified name is used. If a
   * node pool with the specified name does not exist, Dataproc create a
   * node pool with default values.
   *
   * This is an input only field. It will not be returned by the API.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GkeNodePoolConfig node_pool_config = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The nodePoolConfig.
   */
  com.google.cloud.dataproc.v1.GkeNodePoolConfig getNodePoolConfig();
  /**
   * <pre>
   * Input only. The configuration for the GKE node pool.
   *
   * If specified, Dataproc attempts to create a node pool with the
   * specified shape. If one with the same name already exists, it is
   * verified against all specified fields. If a field differs, the
   * virtual cluster creation will fail.
   *
   * If omitted, any node pool with the specified name is used. If a
   * node pool with the specified name does not exist, Dataproc create a
   * node pool with default values.
   *
   * This is an input only field. It will not be returned by the API.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GkeNodePoolConfig node_pool_config = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.GkeNodePoolConfigOrBuilder getNodePoolConfigOrBuilder();
}
