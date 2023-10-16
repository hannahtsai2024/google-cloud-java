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
// source: google/cloud/baremetalsolution/v2/instance.proto

package com.google.cloud.baremetalsolution.v2;

public interface ServerNetworkTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.ServerNetworkTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Template's unique name. The full resource name follows the
   * pattern:
   * `projects/{project}/locations/{location}/serverNetworkTemplate/{server_network_template}`
   * Generally, the {server_network_template} follows the syntax of
   * "bond&lt;interface_type_index&gt;&lt;bond_mode&gt;" or "nic&lt;interface_type_index&gt;".
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
   * Output only. Template's unique name. The full resource name follows the
   * pattern:
   * `projects/{project}/locations/{location}/serverNetworkTemplate/{server_network_template}`
   * Generally, the {server_network_template} follows the syntax of
   * "bond&lt;interface_type_index&gt;&lt;bond_mode&gt;" or "nic&lt;interface_type_index&gt;".
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
   * Instance types this template is applicable to.
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 2;</code>
   *
   * @return A list containing the applicableInstanceTypes.
   */
  java.util.List<java.lang.String> getApplicableInstanceTypesList();
  /**
   *
   *
   * <pre>
   * Instance types this template is applicable to.
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 2;</code>
   *
   * @return The count of applicableInstanceTypes.
   */
  int getApplicableInstanceTypesCount();
  /**
   *
   *
   * <pre>
   * Instance types this template is applicable to.
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The applicableInstanceTypes at the given index.
   */
  java.lang.String getApplicableInstanceTypes(int index);
  /**
   *
   *
   * <pre>
   * Instance types this template is applicable to.
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the applicableInstanceTypes at the given index.
   */
  com.google.protobuf.ByteString getApplicableInstanceTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Logical interfaces.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterface logical_interfaces = 3;
   * </code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterface>
      getLogicalInterfacesList();
  /**
   *
   *
   * <pre>
   * Logical interfaces.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterface logical_interfaces = 3;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterface getLogicalInterfaces(
      int index);
  /**
   *
   *
   * <pre>
   * Logical interfaces.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterface logical_interfaces = 3;
   * </code>
   */
  int getLogicalInterfacesCount();
  /**
   *
   *
   * <pre>
   * Logical interfaces.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterface logical_interfaces = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterfaceOrBuilder>
      getLogicalInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Logical interfaces.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterface logical_interfaces = 3;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.ServerNetworkTemplate.LogicalInterfaceOrBuilder
      getLogicalInterfacesOrBuilder(int index);
}
