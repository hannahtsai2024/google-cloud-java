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
// source: google/cloud/netapp/v1/storage_pool.proto

package com.google.cloud.netapp.v1;

public interface StoragePoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.StoragePool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the storage pool
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
   * Output only. Name of the storage pool
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
   * Required. Service level of the storage pool
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.ServiceLevel service_level = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for serviceLevel.
   */
  int getServiceLevelValue();
  /**
   *
   *
   * <pre>
   * Required. Service level of the storage pool
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.ServiceLevel service_level = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The serviceLevel.
   */
  com.google.cloud.netapp.v1.ServiceLevel getServiceLevel();

  /**
   *
   *
   * <pre>
   * Required. Capacity in GIB of the pool
   * </pre>
   *
   * <code>int64 capacity_gib = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The capacityGib.
   */
  long getCapacityGib();

  /**
   *
   *
   * <pre>
   * Output only. Allocated size of all volumes in GIB in the storage pool
   * </pre>
   *
   * <code>int64 volume_capacity_gib = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The volumeCapacityGib.
   */
  long getVolumeCapacityGib();

  /**
   *
   *
   * <pre>
   * Output only. Volume count of the storage pool
   * </pre>
   *
   * <code>int32 volume_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The volumeCount.
   */
  int getVolumeCount();

  /**
   *
   *
   * <pre>
   * Output only. State of the storage pool
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.StoragePool.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the storage pool
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.StoragePool.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.netapp.v1.StoragePool.State getState();

  /**
   *
   *
   * <pre>
   * Output only. State details of the storage pool
   * </pre>
   *
   * <code>string state_details = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateDetails.
   */
  java.lang.String getStateDetails();
  /**
   *
   *
   * <pre>
   * Output only. State details of the storage pool
   * </pre>
   *
   * <code>string state_details = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateDetails.
   */
  com.google.protobuf.ByteString getStateDetailsBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time of the storage pool
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time of the storage pool
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time of the storage pool
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of the storage pool
   * </pre>
   *
   * <code>string description = 9;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the storage pool
   * </pre>
   *
   * <code>string description = 9;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
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
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. VPC Network name.
   * Format: projects/{project}/global/networks/{network}
   * </pre>
   *
   * <code>
   * string network = 11 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Required. VPC Network name.
   * Format: projects/{project}/global/networks/{network}
   * </pre>
   *
   * <code>
   * string network = 11 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Specifies the Active Directory to be used for creating a SMB volume.
   * </pre>
   *
   * <code>string active_directory = 12 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The activeDirectory.
   */
  java.lang.String getActiveDirectory();
  /**
   *
   *
   * <pre>
   * Specifies the Active Directory to be used for creating a SMB volume.
   * </pre>
   *
   * <code>string active_directory = 12 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for activeDirectory.
   */
  com.google.protobuf.ByteString getActiveDirectoryBytes();

  /**
   *
   *
   * <pre>
   * Specifies the KMS config to be used for volume encryption.
   * </pre>
   *
   * <code>string kms_config = 13 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The kmsConfig.
   */
  java.lang.String getKmsConfig();
  /**
   *
   *
   * <pre>
   * Specifies the KMS config to be used for volume encryption.
   * </pre>
   *
   * <code>string kms_config = 13 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for kmsConfig.
   */
  com.google.protobuf.ByteString getKmsConfigBytes();

  /**
   *
   *
   * <pre>
   * Flag indicating if the pool is NFS LDAP enabled or not.
   * </pre>
   *
   * <code>bool ldap_enabled = 14;</code>
   *
   * @return The ldapEnabled.
   */
  boolean getLdapEnabled();

  /**
   *
   *
   * <pre>
   * Name of the Private Service Access allocated range. If
   * not provided, any available range will be chosen.
   * </pre>
   *
   * <code>string psa_range = 15;</code>
   *
   * @return The psaRange.
   */
  java.lang.String getPsaRange();
  /**
   *
   *
   * <pre>
   * Name of the Private Service Access allocated range. If
   * not provided, any available range will be chosen.
   * </pre>
   *
   * <code>string psa_range = 15;</code>
   *
   * @return The bytes for psaRange.
   */
  com.google.protobuf.ByteString getPsaRangeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Specifies the current pool encryption key source.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.EncryptionType encryption_type = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for encryptionType.
   */
  int getEncryptionTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Specifies the current pool encryption key source.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.EncryptionType encryption_type = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionType.
   */
  com.google.cloud.netapp.v1.EncryptionType getEncryptionType();

  /**
   *
   *
   * <pre>
   * Optional. Allows SO pool to access AD or DNS server from other regions.
   * </pre>
   *
   * <code>optional bool global_access_allowed = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the globalAccessAllowed field is set.
   */
  boolean hasGlobalAccessAllowed();
  /**
   *
   *
   * <pre>
   * Optional. Allows SO pool to access AD or DNS server from other regions.
   * </pre>
   *
   * <code>optional bool global_access_allowed = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The globalAccessAllowed.
   */
  boolean getGlobalAccessAllowed();
}
