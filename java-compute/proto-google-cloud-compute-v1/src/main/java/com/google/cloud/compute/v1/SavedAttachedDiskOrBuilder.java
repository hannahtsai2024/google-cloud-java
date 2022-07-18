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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SavedAttachedDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SavedAttachedDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 464761403;</code>
   *
   * @return Whether the autoDelete field is set.
   */
  boolean hasAutoDelete();
  /**
   *
   *
   * <pre>
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 464761403;</code>
   *
   * @return The autoDelete.
   */
  boolean getAutoDelete();

  /**
   *
   *
   * <pre>
   * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
   * </pre>
   *
   * <code>optional bool boot = 3029746;</code>
   *
   * @return Whether the boot field is set.
   */
  boolean hasBoot();
  /**
   *
   *
   * <pre>
   * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
   * </pre>
   *
   * <code>optional bool boot = 3029746;</code>
   *
   * @return The boot.
   */
  boolean getBoot();

  /**
   *
   *
   * <pre>
   * Specifies the name of the disk attached to the source instance.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   *
   * @return Whether the deviceName field is set.
   */
  boolean hasDeviceName();
  /**
   *
   *
   * <pre>
   * Specifies the name of the disk attached to the source instance.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   *
   * @return The deviceName.
   */
  java.lang.String getDeviceName();
  /**
   *
   *
   * <pre>
   * Specifies the name of the disk attached to the source instance.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   *
   * @return The bytes for deviceName.
   */
  com.google.protobuf.ByteString getDeviceNameBytes();

  /**
   *
   *
   * <pre>
   * The encryption key for the disk.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return Whether the diskEncryptionKey field is set.
   */
  boolean hasDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * The encryption key for the disk.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return The diskEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * The encryption key for the disk.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getDiskEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The size of the disk in base-2 GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return Whether the diskSizeGb field is set.
   */
  boolean hasDiskSizeGb();
  /**
   *
   *
   * <pre>
   * The size of the disk in base-2 GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   *
   * @return Whether the diskType field is set.
   */
  boolean hasDiskType();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<com.google.cloud.compute.v1.GuestOsFeature> getGuestOsFeaturesList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeature getGuestOsFeatures(int index);
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  int getGuestOsFeaturesCount();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.GuestOsFeatureOrBuilder>
      getGuestOsFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeatureOrBuilder getGuestOsFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specifies zero-based index of the disk that is attached to the source instance.
   * </pre>
   *
   * <code>optional int32 index = 100346066;</code>
   *
   * @return Whether the index field is set.
   */
  boolean hasIndex();
  /**
   *
   *
   * <pre>
   * Specifies zero-based index of the disk that is attached to the source instance.
   * </pre>
   *
   * <code>optional int32 index = 100346066;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return Whether the interface field is set.
   */
  boolean hasInterface();
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return The interface.
   */
  java.lang.String getInterface();
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return The bytes for interface.
   */
  com.google.protobuf.ByteString getInterfaceBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return A list containing the licenses.
   */
  java.util.List<java.lang.String> getLicensesList();
  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return The count of licenses.
   */
  int getLicensesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the element to return.
   * @return The licenses at the given index.
   */
  java.lang.String getLicenses(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the licenses at the given index.
   */
  com.google.protobuf.ByteString getLicensesBytes(int index);

  /**
   *
   *
   * <pre>
   * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   *
   *
   * <pre>
   * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   *
   *
   * <pre>
   * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString getModeBytes();

  /**
   *
   *
   * <pre>
   * Specifies a URL of the disk attached to the source instance.
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * Specifies a URL of the disk attached to the source instance.
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Specifies a URL of the disk attached to the source instance.
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A size of the storage used by the disk's snapshot by this machine image.
   * </pre>
   *
   * <code>optional int64 storage_bytes = 424631719;</code>
   *
   * @return Whether the storageBytes field is set.
   */
  boolean hasStorageBytes();
  /**
   *
   *
   * <pre>
   * [Output Only] A size of the storage used by the disk's snapshot by this machine image.
   * </pre>
   *
   * <code>optional int64 storage_bytes = 424631719;</code>
   *
   * @return The storageBytes.
   */
  long getStorageBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
   * Check the StorageBytesStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string storage_bytes_status = 490739082;</code>
   *
   * @return Whether the storageBytesStatus field is set.
   */
  boolean hasStorageBytesStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
   * Check the StorageBytesStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string storage_bytes_status = 490739082;</code>
   *
   * @return The storageBytesStatus.
   */
  java.lang.String getStorageBytesStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
   * Check the StorageBytesStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string storage_bytes_status = 490739082;</code>
   *
   * @return The bytes for storageBytesStatus.
   */
  com.google.protobuf.ByteString getStorageBytesStatusBytes();

  /**
   *
   *
   * <pre>
   * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}