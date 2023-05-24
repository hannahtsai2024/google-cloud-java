// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Snapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] The architecture of the snapshot. Valid values are ARM64 or X86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   * @return Whether the architecture field is set.
   */
  boolean hasArchitecture();
  /**
   * <pre>
   * [Output Only] The architecture of the snapshot. Valid values are ARM64 or X86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   * @return The architecture.
   */
  java.lang.String getArchitecture();
  /**
   * <pre>
   * [Output Only] The architecture of the snapshot. Valid values are ARM64 or X86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   * @return The bytes for architecture.
   */
  com.google.protobuf.ByteString
      getArchitectureBytes();

  /**
   * <pre>
   * [Output Only] Set to true if snapshots are automatically created by applying resource policy on the target disk.
   * </pre>
   *
   * <code>optional bool auto_created = 463922264;</code>
   * @return Whether the autoCreated field is set.
   */
  boolean hasAutoCreated();
  /**
   * <pre>
   * [Output Only] Set to true if snapshots are automatically created by applying resource policy on the target disk.
   * </pre>
   *
   * <code>optional bool auto_created = 463922264;</code>
   * @return The autoCreated.
   */
  boolean getAutoCreated();

  /**
   * <pre>
   * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
   * </pre>
   *
   * <code>optional string chain_name = 68644169;</code>
   * @return Whether the chainName field is set.
   */
  boolean hasChainName();
  /**
   * <pre>
   * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
   * </pre>
   *
   * <code>optional string chain_name = 68644169;</code>
   * @return The chainName.
   */
  java.lang.String getChainName();
  /**
   * <pre>
   * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
   * </pre>
   *
   * <code>optional string chain_name = 68644169;</code>
   * @return The bytes for chainName.
   */
  com.google.protobuf.ByteString
      getChainNameBytes();

  /**
   * <pre>
   * [Output Only] Size in bytes of the snapshot at creation time.
   * </pre>
   *
   * <code>optional int64 creation_size_bytes = 125400077;</code>
   * @return Whether the creationSizeBytes field is set.
   */
  boolean hasCreationSizeBytes();
  /**
   * <pre>
   * [Output Only] Size in bytes of the snapshot at creation time.
   * </pre>
   *
   * <code>optional int64 creation_size_bytes = 125400077;</code>
   * @return The creationSizeBytes.
   */
  long getCreationSizeBytes();

  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString
      getCreationTimestampBytes();

  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * [Output Only] Size of the source disk, specified in GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   * @return Whether the diskSizeGb field is set.
   */
  boolean hasDiskSizeGb();
  /**
   * <pre>
   * [Output Only] Size of the source disk, specified in GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   * <pre>
   * [Output Only] Number of bytes downloaded to restore a snapshot to a disk.
   * </pre>
   *
   * <code>optional int64 download_bytes = 435054068;</code>
   * @return Whether the downloadBytes field is set.
   */
  boolean hasDownloadBytes();
  /**
   * <pre>
   * [Output Only] Number of bytes downloaded to restore a snapshot to a disk.
   * </pre>
   *
   * <code>optional int64 download_bytes = 435054068;</code>
   * @return The downloadBytes.
   */
  long getDownloadBytes();

  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   * @return Whether the labelFingerprint field is set.
   */
  boolean hasLabelFingerprint();
  /**
   * <pre>
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   * <pre>
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString
      getLabelFingerprintBytes();

  /**
   * <pre>
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
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
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * [Output Only] Integer license codes indicating which licenses are attached to this snapshot.
   * </pre>
   *
   * <code>repeated int64 license_codes = 45482664;</code>
   * @return A list containing the licenseCodes.
   */
  java.util.List<java.lang.Long> getLicenseCodesList();
  /**
   * <pre>
   * [Output Only] Integer license codes indicating which licenses are attached to this snapshot.
   * </pre>
   *
   * <code>repeated int64 license_codes = 45482664;</code>
   * @return The count of licenseCodes.
   */
  int getLicenseCodesCount();
  /**
   * <pre>
   * [Output Only] Integer license codes indicating which licenses are attached to this snapshot.
   * </pre>
   *
   * <code>repeated int64 license_codes = 45482664;</code>
   * @param index The index of the element to return.
   * @return The licenseCodes at the given index.
   */
  long getLicenseCodes(int index);

  /**
   * <pre>
   * [Output Only] A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   * @return A list containing the licenses.
   */
  java.util.List<java.lang.String>
      getLicensesList();
  /**
   * <pre>
   * [Output Only] A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   * @return The count of licenses.
   */
  int getLicensesCount();
  /**
   * <pre>
   * [Output Only] A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   * @param index The index of the element to return.
   * @return The licenses at the given index.
   */
  java.lang.String getLicenses(int index);
  /**
   * <pre>
   * [Output Only] A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   * @param index The index of the value to return.
   * @return The bytes of the licenses at the given index.
   */
  com.google.protobuf.ByteString
      getLicensesBytes(int index);

  /**
   * <pre>
   * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
   * </pre>
   *
   * <code>optional string location_hint = 350519505;</code>
   * @return Whether the locationHint field is set.
   */
  boolean hasLocationHint();
  /**
   * <pre>
   * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
   * </pre>
   *
   * <code>optional string location_hint = 350519505;</code>
   * @return The locationHint.
   */
  java.lang.String getLocationHint();
  /**
   * <pre>
   * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
   * </pre>
   *
   * <code>optional string location_hint = 350519505;</code>
   * @return The bytes for locationHint.
   */
  com.google.protobuf.ByteString
      getLocationHintBytes();

  /**
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();
  /**
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey snapshot_encryption_key = 43334526;</code>
   * @return Whether the snapshotEncryptionKey field is set.
   */
  boolean hasSnapshotEncryptionKey();
  /**
   * <pre>
   * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey snapshot_encryption_key = 43334526;</code>
   * @return The snapshotEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSnapshotEncryptionKey();
  /**
   * <pre>
   * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey snapshot_encryption_key = 43334526;</code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getSnapshotEncryptionKeyOrBuilder();

  /**
   * <pre>
   * Indicates the type of the snapshot.
   * Check the SnapshotType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string snapshot_type = 124349653;</code>
   * @return Whether the snapshotType field is set.
   */
  boolean hasSnapshotType();
  /**
   * <pre>
   * Indicates the type of the snapshot.
   * Check the SnapshotType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string snapshot_type = 124349653;</code>
   * @return The snapshotType.
   */
  java.lang.String getSnapshotType();
  /**
   * <pre>
   * Indicates the type of the snapshot.
   * Check the SnapshotType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string snapshot_type = 124349653;</code>
   * @return The bytes for snapshotType.
   */
  com.google.protobuf.ByteString
      getSnapshotTypeBytes();

  /**
   * <pre>
   * The source disk used to create this snapshot.
   * </pre>
   *
   * <code>optional string source_disk = 451753793;</code>
   * @return Whether the sourceDisk field is set.
   */
  boolean hasSourceDisk();
  /**
   * <pre>
   * The source disk used to create this snapshot.
   * </pre>
   *
   * <code>optional string source_disk = 451753793;</code>
   * @return The sourceDisk.
   */
  java.lang.String getSourceDisk();
  /**
   * <pre>
   * The source disk used to create this snapshot.
   * </pre>
   *
   * <code>optional string source_disk = 451753793;</code>
   * @return The bytes for sourceDisk.
   */
  com.google.protobuf.ByteString
      getSourceDiskBytes();

  /**
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey source_disk_encryption_key = 531501153;</code>
   * @return Whether the sourceDiskEncryptionKey field is set.
   */
  boolean hasSourceDiskEncryptionKey();
  /**
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey source_disk_encryption_key = 531501153;</code>
   * @return The sourceDiskEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceDiskEncryptionKey();
  /**
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey source_disk_encryption_key = 531501153;</code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getSourceDiskEncryptionKeyOrBuilder();

  /**
   * <pre>
   * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given disk name.
   * </pre>
   *
   * <code>optional string source_disk_id = 454190809;</code>
   * @return Whether the sourceDiskId field is set.
   */
  boolean hasSourceDiskId();
  /**
   * <pre>
   * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given disk name.
   * </pre>
   *
   * <code>optional string source_disk_id = 454190809;</code>
   * @return The sourceDiskId.
   */
  java.lang.String getSourceDiskId();
  /**
   * <pre>
   * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given disk name.
   * </pre>
   *
   * <code>optional string source_disk_id = 454190809;</code>
   * @return The bytes for sourceDiskId.
   */
  com.google.protobuf.ByteString
      getSourceDiskIdBytes();

  /**
   * <pre>
   * [Output Only] URL of the resource policy which created this scheduled snapshot.
   * </pre>
   *
   * <code>optional string source_snapshot_schedule_policy = 235756291;</code>
   * @return Whether the sourceSnapshotSchedulePolicy field is set.
   */
  boolean hasSourceSnapshotSchedulePolicy();
  /**
   * <pre>
   * [Output Only] URL of the resource policy which created this scheduled snapshot.
   * </pre>
   *
   * <code>optional string source_snapshot_schedule_policy = 235756291;</code>
   * @return The sourceSnapshotSchedulePolicy.
   */
  java.lang.String getSourceSnapshotSchedulePolicy();
  /**
   * <pre>
   * [Output Only] URL of the resource policy which created this scheduled snapshot.
   * </pre>
   *
   * <code>optional string source_snapshot_schedule_policy = 235756291;</code>
   * @return The bytes for sourceSnapshotSchedulePolicy.
   */
  com.google.protobuf.ByteString
      getSourceSnapshotSchedulePolicyBytes();

  /**
   * <pre>
   * [Output Only] ID of the resource policy which created this scheduled snapshot.
   * </pre>
   *
   * <code>optional string source_snapshot_schedule_policy_id = 70489047;</code>
   * @return Whether the sourceSnapshotSchedulePolicyId field is set.
   */
  boolean hasSourceSnapshotSchedulePolicyId();
  /**
   * <pre>
   * [Output Only] ID of the resource policy which created this scheduled snapshot.
   * </pre>
   *
   * <code>optional string source_snapshot_schedule_policy_id = 70489047;</code>
   * @return The sourceSnapshotSchedulePolicyId.
   */
  java.lang.String getSourceSnapshotSchedulePolicyId();
  /**
   * <pre>
   * [Output Only] ID of the resource policy which created this scheduled snapshot.
   * </pre>
   *
   * <code>optional string source_snapshot_schedule_policy_id = 70489047;</code>
   * @return The bytes for sourceSnapshotSchedulePolicyId.
   */
  com.google.protobuf.ByteString
      getSourceSnapshotSchedulePolicyIdBytes();

  /**
   * <pre>
   * [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion.
   * </pre>
   *
   * <code>optional int64 storage_bytes = 424631719;</code>
   * @return Whether the storageBytes field is set.
   */
  boolean hasStorageBytes();
  /**
   * <pre>
   * [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion.
   * </pre>
   *
   * <code>optional int64 storage_bytes = 424631719;</code>
   * @return The storageBytes.
   */
  long getStorageBytes();

  /**
   * <pre>
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
   * Check the StorageBytesStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string storage_bytes_status = 490739082;</code>
   * @return Whether the storageBytesStatus field is set.
   */
  boolean hasStorageBytesStatus();
  /**
   * <pre>
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
   * Check the StorageBytesStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string storage_bytes_status = 490739082;</code>
   * @return The storageBytesStatus.
   */
  java.lang.String getStorageBytesStatus();
  /**
   * <pre>
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
   * Check the StorageBytesStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string storage_bytes_status = 490739082;</code>
   * @return The bytes for storageBytesStatus.
   */
  com.google.protobuf.ByteString
      getStorageBytesStatusBytes();

  /**
   * <pre>
   * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   * @return A list containing the storageLocations.
   */
  java.util.List<java.lang.String>
      getStorageLocationsList();
  /**
   * <pre>
   * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   * @return The count of storageLocations.
   */
  int getStorageLocationsCount();
  /**
   * <pre>
   * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   * @param index The index of the element to return.
   * @return The storageLocations at the given index.
   */
  java.lang.String getStorageLocations(int index);
  /**
   * <pre>
   * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   * @param index The index of the value to return.
   * @return The bytes of the storageLocations at the given index.
   */
  com.google.protobuf.ByteString
      getStorageLocationsBytes(int index);
}
