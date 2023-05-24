// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface NodeGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.NodeGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Node group [resource name](https://aip.dev/122).
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The Node group [resource name](https://aip.dev/122).
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Node group roles.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeGroup.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the roles.
   */
  java.util.List<com.google.cloud.dataproc.v1.NodeGroup.Role> getRolesList();
  /**
   * <pre>
   * Required. Node group roles.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeGroup.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of roles.
   */
  int getRolesCount();
  /**
   * <pre>
   * Required. Node group roles.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeGroup.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The roles at the given index.
   */
  com.google.cloud.dataproc.v1.NodeGroup.Role getRoles(int index);
  /**
   * <pre>
   * Required. Node group roles.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeGroup.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for roles.
   */
  java.util.List<java.lang.Integer>
  getRolesValueList();
  /**
   * <pre>
   * Required. Node group roles.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeGroup.Role roles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of roles at the given index.
   */
  int getRolesValue(int index);

  /**
   * <pre>
   * Optional. The node group instance group configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig node_group_config = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the nodeGroupConfig field is set.
   */
  boolean hasNodeGroupConfig();
  /**
   * <pre>
   * Optional. The node group instance group configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig node_group_config = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nodeGroupConfig.
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig getNodeGroupConfig();
  /**
   * <pre>
   * Optional. The node group instance group configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig node_group_config = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfigOrBuilder getNodeGroupConfigOrBuilder();

  /**
   * <pre>
   * Optional. Node group labels.
   *
   * * Label **keys** must consist of from 1 to 63 characters and conform to
   *   [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * * Label **values** can be empty. If specified, they must consist of from
   *   1 to 63 characters and conform to [RFC 1035]
   *   (https://www.ietf.org/rfc/rfc1035.txt).
   * * The node group must have no more than 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. Node group labels.
   *
   * * Label **keys** must consist of from 1 to 63 characters and conform to
   *   [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * * Label **values** can be empty. If specified, they must consist of from
   *   1 to 63 characters and conform to [RFC 1035]
   *   (https://www.ietf.org/rfc/rfc1035.txt).
   * * The node group must have no more than 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Node group labels.
   *
   * * Label **keys** must consist of from 1 to 63 characters and conform to
   *   [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * * Label **values** can be empty. If specified, they must consist of from
   *   1 to 63 characters and conform to [RFC 1035]
   *   (https://www.ietf.org/rfc/rfc1035.txt).
   * * The node group must have no more than 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. Node group labels.
   *
   * * Label **keys** must consist of from 1 to 63 characters and conform to
   *   [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * * Label **values** can be empty. If specified, they must consist of from
   *   1 to 63 characters and conform to [RFC 1035]
   *   (https://www.ietf.org/rfc/rfc1035.txt).
   * * The node group must have no more than 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Node group labels.
   *
   * * Label **keys** must consist of from 1 to 63 characters and conform to
   *   [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * * Label **values** can be empty. If specified, they must consist of from
   *   1 to 63 characters and conform to [RFC 1035]
   *   (https://www.ietf.org/rfc/rfc1035.txt).
   * * The node group must have no more than 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
