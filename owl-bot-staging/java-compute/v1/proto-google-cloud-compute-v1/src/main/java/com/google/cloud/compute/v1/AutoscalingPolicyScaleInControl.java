// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AutoscalingPolicyScaleInControl}
 */
public final class AutoscalingPolicyScaleInControl extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AutoscalingPolicyScaleInControl)
    AutoscalingPolicyScaleInControlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoscalingPolicyScaleInControl.newBuilder() to construct.
  private AutoscalingPolicyScaleInControl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoscalingPolicyScaleInControl() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoscalingPolicyScaleInControl();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AutoscalingPolicyScaleInControl_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AutoscalingPolicyScaleInControl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl.class, com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_SCALED_IN_REPLICAS_FIELD_NUMBER = 180710123;
  private com.google.cloud.compute.v1.FixedOrPercent maxScaledInReplicas_;
  /**
   * <pre>
   * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
   * @return Whether the maxScaledInReplicas field is set.
   */
  @java.lang.Override
  public boolean hasMaxScaledInReplicas() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
   * @return The maxScaledInReplicas.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.FixedOrPercent getMaxScaledInReplicas() {
    return maxScaledInReplicas_ == null ? com.google.cloud.compute.v1.FixedOrPercent.getDefaultInstance() : maxScaledInReplicas_;
  }
  /**
   * <pre>
   * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.FixedOrPercentOrBuilder getMaxScaledInReplicasOrBuilder() {
    return maxScaledInReplicas_ == null ? com.google.cloud.compute.v1.FixedOrPercent.getDefaultInstance() : maxScaledInReplicas_;
  }

  public static final int TIME_WINDOW_SEC_FIELD_NUMBER = 36405300;
  private int timeWindowSec_ = 0;
  /**
   * <pre>
   * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
   * </pre>
   *
   * <code>optional int32 time_window_sec = 36405300;</code>
   * @return Whether the timeWindowSec field is set.
   */
  @java.lang.Override
  public boolean hasTimeWindowSec() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
   * </pre>
   *
   * <code>optional int32 time_window_sec = 36405300;</code>
   * @return The timeWindowSec.
   */
  @java.lang.Override
  public int getTimeWindowSec() {
    return timeWindowSec_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(36405300, timeWindowSec_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(180710123, getMaxScaledInReplicas());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(36405300, timeWindowSec_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(180710123, getMaxScaledInReplicas());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl other = (com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl) obj;

    if (hasMaxScaledInReplicas() != other.hasMaxScaledInReplicas()) return false;
    if (hasMaxScaledInReplicas()) {
      if (!getMaxScaledInReplicas()
          .equals(other.getMaxScaledInReplicas())) return false;
    }
    if (hasTimeWindowSec() != other.hasTimeWindowSec()) return false;
    if (hasTimeWindowSec()) {
      if (getTimeWindowSec()
          != other.getTimeWindowSec()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMaxScaledInReplicas()) {
      hash = (37 * hash) + MAX_SCALED_IN_REPLICAS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScaledInReplicas().hashCode();
    }
    if (hasTimeWindowSec()) {
      hash = (37 * hash) + TIME_WINDOW_SEC_FIELD_NUMBER;
      hash = (53 * hash) + getTimeWindowSec();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AutoscalingPolicyScaleInControl}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AutoscalingPolicyScaleInControl)
      com.google.cloud.compute.v1.AutoscalingPolicyScaleInControlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AutoscalingPolicyScaleInControl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AutoscalingPolicyScaleInControl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl.class, com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMaxScaledInReplicasFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxScaledInReplicas_ = null;
      if (maxScaledInReplicasBuilder_ != null) {
        maxScaledInReplicasBuilder_.dispose();
        maxScaledInReplicasBuilder_ = null;
      }
      timeWindowSec_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AutoscalingPolicyScaleInControl_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl build() {
      com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl buildPartial() {
      com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl result = new com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxScaledInReplicas_ = maxScaledInReplicasBuilder_ == null
            ? maxScaledInReplicas_
            : maxScaledInReplicasBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeWindowSec_ = timeWindowSec_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl) {
        return mergeFrom((com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl other) {
      if (other == com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl.getDefaultInstance()) return this;
      if (other.hasMaxScaledInReplicas()) {
        mergeMaxScaledInReplicas(other.getMaxScaledInReplicas());
      }
      if (other.hasTimeWindowSec()) {
        setTimeWindowSec(other.getTimeWindowSec());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 291242400: {
              timeWindowSec_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 291242400
            case 1445680986: {
              input.readMessage(
                  getMaxScaledInReplicasFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 1445680986
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.cloud.compute.v1.FixedOrPercent maxScaledInReplicas_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.FixedOrPercent, com.google.cloud.compute.v1.FixedOrPercent.Builder, com.google.cloud.compute.v1.FixedOrPercentOrBuilder> maxScaledInReplicasBuilder_;
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     * @return Whether the maxScaledInReplicas field is set.
     */
    public boolean hasMaxScaledInReplicas() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     * @return The maxScaledInReplicas.
     */
    public com.google.cloud.compute.v1.FixedOrPercent getMaxScaledInReplicas() {
      if (maxScaledInReplicasBuilder_ == null) {
        return maxScaledInReplicas_ == null ? com.google.cloud.compute.v1.FixedOrPercent.getDefaultInstance() : maxScaledInReplicas_;
      } else {
        return maxScaledInReplicasBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     */
    public Builder setMaxScaledInReplicas(com.google.cloud.compute.v1.FixedOrPercent value) {
      if (maxScaledInReplicasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxScaledInReplicas_ = value;
      } else {
        maxScaledInReplicasBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     */
    public Builder setMaxScaledInReplicas(
        com.google.cloud.compute.v1.FixedOrPercent.Builder builderForValue) {
      if (maxScaledInReplicasBuilder_ == null) {
        maxScaledInReplicas_ = builderForValue.build();
      } else {
        maxScaledInReplicasBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     */
    public Builder mergeMaxScaledInReplicas(com.google.cloud.compute.v1.FixedOrPercent value) {
      if (maxScaledInReplicasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          maxScaledInReplicas_ != null &&
          maxScaledInReplicas_ != com.google.cloud.compute.v1.FixedOrPercent.getDefaultInstance()) {
          getMaxScaledInReplicasBuilder().mergeFrom(value);
        } else {
          maxScaledInReplicas_ = value;
        }
      } else {
        maxScaledInReplicasBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     */
    public Builder clearMaxScaledInReplicas() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxScaledInReplicas_ = null;
      if (maxScaledInReplicasBuilder_ != null) {
        maxScaledInReplicasBuilder_.dispose();
        maxScaledInReplicasBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     */
    public com.google.cloud.compute.v1.FixedOrPercent.Builder getMaxScaledInReplicasBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMaxScaledInReplicasFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     */
    public com.google.cloud.compute.v1.FixedOrPercentOrBuilder getMaxScaledInReplicasOrBuilder() {
      if (maxScaledInReplicasBuilder_ != null) {
        return maxScaledInReplicasBuilder_.getMessageOrBuilder();
      } else {
        return maxScaledInReplicas_ == null ?
            com.google.cloud.compute.v1.FixedOrPercent.getDefaultInstance() : maxScaledInReplicas_;
      }
    }
    /**
     * <pre>
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.FixedOrPercent max_scaled_in_replicas = 180710123;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.FixedOrPercent, com.google.cloud.compute.v1.FixedOrPercent.Builder, com.google.cloud.compute.v1.FixedOrPercentOrBuilder> 
        getMaxScaledInReplicasFieldBuilder() {
      if (maxScaledInReplicasBuilder_ == null) {
        maxScaledInReplicasBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.FixedOrPercent, com.google.cloud.compute.v1.FixedOrPercent.Builder, com.google.cloud.compute.v1.FixedOrPercentOrBuilder>(
                getMaxScaledInReplicas(),
                getParentForChildren(),
                isClean());
        maxScaledInReplicas_ = null;
      }
      return maxScaledInReplicasBuilder_;
    }

    private int timeWindowSec_ ;
    /**
     * <pre>
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * </pre>
     *
     * <code>optional int32 time_window_sec = 36405300;</code>
     * @return Whether the timeWindowSec field is set.
     */
    @java.lang.Override
    public boolean hasTimeWindowSec() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * </pre>
     *
     * <code>optional int32 time_window_sec = 36405300;</code>
     * @return The timeWindowSec.
     */
    @java.lang.Override
    public int getTimeWindowSec() {
      return timeWindowSec_;
    }
    /**
     * <pre>
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * </pre>
     *
     * <code>optional int32 time_window_sec = 36405300;</code>
     * @param value The timeWindowSec to set.
     * @return This builder for chaining.
     */
    public Builder setTimeWindowSec(int value) {

      timeWindowSec_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * </pre>
     *
     * <code>optional int32 time_window_sec = 36405300;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeWindowSec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeWindowSec_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AutoscalingPolicyScaleInControl)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AutoscalingPolicyScaleInControl)
  private static final com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl();
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoscalingPolicyScaleInControl>
      PARSER = new com.google.protobuf.AbstractParser<AutoscalingPolicyScaleInControl>() {
    @java.lang.Override
    public AutoscalingPolicyScaleInControl parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AutoscalingPolicyScaleInControl> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoscalingPolicyScaleInControl> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

