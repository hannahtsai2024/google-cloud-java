// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.TargetHttpsProxiesScopedList}
 */
public final class TargetHttpsProxiesScopedList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TargetHttpsProxiesScopedList)
    TargetHttpsProxiesScopedListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetHttpsProxiesScopedList.newBuilder() to construct.
  private TargetHttpsProxiesScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetHttpsProxiesScopedList() {
    targetHttpsProxies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetHttpsProxiesScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TargetHttpsProxiesScopedList.class, com.google.cloud.compute.v1.TargetHttpsProxiesScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_HTTPS_PROXIES_FIELD_NUMBER = 366607882;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.TargetHttpsProxy> targetHttpsProxies_;
  /**
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.TargetHttpsProxy> getTargetHttpsProxiesList() {
    return targetHttpsProxies_;
  }
  /**
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder> 
      getTargetHttpsProxiesOrBuilderList() {
    return targetHttpsProxies_;
  }
  /**
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
   */
  @java.lang.Override
  public int getTargetHttpsProxiesCount() {
    return targetHttpsProxies_.size();
  }
  /**
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TargetHttpsProxy getTargetHttpsProxies(int index) {
    return targetHttpsProxies_.get(index);
  }
  /**
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder getTargetHttpsProxiesOrBuilder(
      int index) {
    return targetHttpsProxies_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < targetHttpsProxies_.size(); i++) {
      output.writeMessage(366607882, targetHttpsProxies_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < targetHttpsProxies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(366607882, targetHttpsProxies_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.TargetHttpsProxiesScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TargetHttpsProxiesScopedList other = (com.google.cloud.compute.v1.TargetHttpsProxiesScopedList) obj;

    if (!getTargetHttpsProxiesList()
        .equals(other.getTargetHttpsProxiesList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning()
          .equals(other.getWarning())) return false;
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
    if (getTargetHttpsProxiesCount() > 0) {
      hash = (37 * hash) + TARGET_HTTPS_PROXIES_FIELD_NUMBER;
      hash = (53 * hash) + getTargetHttpsProxiesList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.TargetHttpsProxiesScopedList prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.TargetHttpsProxiesScopedList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TargetHttpsProxiesScopedList)
      com.google.cloud.compute.v1.TargetHttpsProxiesScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TargetHttpsProxiesScopedList.class, com.google.cloud.compute.v1.TargetHttpsProxiesScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TargetHttpsProxiesScopedList.newBuilder()
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
        getTargetHttpsProxiesFieldBuilder();
        getWarningFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (targetHttpsProxiesBuilder_ == null) {
        targetHttpsProxies_ = java.util.Collections.emptyList();
      } else {
        targetHttpsProxies_ = null;
        targetHttpsProxiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetHttpsProxiesScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TargetHttpsProxiesScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetHttpsProxiesScopedList build() {
      com.google.cloud.compute.v1.TargetHttpsProxiesScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetHttpsProxiesScopedList buildPartial() {
      com.google.cloud.compute.v1.TargetHttpsProxiesScopedList result = new com.google.cloud.compute.v1.TargetHttpsProxiesScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.compute.v1.TargetHttpsProxiesScopedList result) {
      if (targetHttpsProxiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          targetHttpsProxies_ = java.util.Collections.unmodifiableList(targetHttpsProxies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.targetHttpsProxies_ = targetHttpsProxies_;
      } else {
        result.targetHttpsProxies_ = targetHttpsProxiesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.TargetHttpsProxiesScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null
            ? warning_
            : warningBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.TargetHttpsProxiesScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.TargetHttpsProxiesScopedList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TargetHttpsProxiesScopedList other) {
      if (other == com.google.cloud.compute.v1.TargetHttpsProxiesScopedList.getDefaultInstance()) return this;
      if (targetHttpsProxiesBuilder_ == null) {
        if (!other.targetHttpsProxies_.isEmpty()) {
          if (targetHttpsProxies_.isEmpty()) {
            targetHttpsProxies_ = other.targetHttpsProxies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetHttpsProxiesIsMutable();
            targetHttpsProxies_.addAll(other.targetHttpsProxies_);
          }
          onChanged();
        }
      } else {
        if (!other.targetHttpsProxies_.isEmpty()) {
          if (targetHttpsProxiesBuilder_.isEmpty()) {
            targetHttpsProxiesBuilder_.dispose();
            targetHttpsProxiesBuilder_ = null;
            targetHttpsProxies_ = other.targetHttpsProxies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            targetHttpsProxiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTargetHttpsProxiesFieldBuilder() : null;
          } else {
            targetHttpsProxiesBuilder_.addAllMessages(other.targetHttpsProxies_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274: {
              input.readMessage(
                  getWarningFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 405634274
            case -1362104238: {
              com.google.cloud.compute.v1.TargetHttpsProxy m =
                  input.readMessage(
                      com.google.cloud.compute.v1.TargetHttpsProxy.parser(),
                      extensionRegistry);
              if (targetHttpsProxiesBuilder_ == null) {
                ensureTargetHttpsProxiesIsMutable();
                targetHttpsProxies_.add(m);
              } else {
                targetHttpsProxiesBuilder_.addMessage(m);
              }
              break;
            } // case -1362104238
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

    private java.util.List<com.google.cloud.compute.v1.TargetHttpsProxy> targetHttpsProxies_ =
      java.util.Collections.emptyList();
    private void ensureTargetHttpsProxiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        targetHttpsProxies_ = new java.util.ArrayList<com.google.cloud.compute.v1.TargetHttpsProxy>(targetHttpsProxies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.TargetHttpsProxy, com.google.cloud.compute.v1.TargetHttpsProxy.Builder, com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder> targetHttpsProxiesBuilder_;

    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.TargetHttpsProxy> getTargetHttpsProxiesList() {
      if (targetHttpsProxiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(targetHttpsProxies_);
      } else {
        return targetHttpsProxiesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public int getTargetHttpsProxiesCount() {
      if (targetHttpsProxiesBuilder_ == null) {
        return targetHttpsProxies_.size();
      } else {
        return targetHttpsProxiesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public com.google.cloud.compute.v1.TargetHttpsProxy getTargetHttpsProxies(int index) {
      if (targetHttpsProxiesBuilder_ == null) {
        return targetHttpsProxies_.get(index);
      } else {
        return targetHttpsProxiesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder setTargetHttpsProxies(
        int index, com.google.cloud.compute.v1.TargetHttpsProxy value) {
      if (targetHttpsProxiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetHttpsProxiesIsMutable();
        targetHttpsProxies_.set(index, value);
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder setTargetHttpsProxies(
        int index, com.google.cloud.compute.v1.TargetHttpsProxy.Builder builderForValue) {
      if (targetHttpsProxiesBuilder_ == null) {
        ensureTargetHttpsProxiesIsMutable();
        targetHttpsProxies_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder addTargetHttpsProxies(com.google.cloud.compute.v1.TargetHttpsProxy value) {
      if (targetHttpsProxiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetHttpsProxiesIsMutable();
        targetHttpsProxies_.add(value);
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder addTargetHttpsProxies(
        int index, com.google.cloud.compute.v1.TargetHttpsProxy value) {
      if (targetHttpsProxiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetHttpsProxiesIsMutable();
        targetHttpsProxies_.add(index, value);
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder addTargetHttpsProxies(
        com.google.cloud.compute.v1.TargetHttpsProxy.Builder builderForValue) {
      if (targetHttpsProxiesBuilder_ == null) {
        ensureTargetHttpsProxiesIsMutable();
        targetHttpsProxies_.add(builderForValue.build());
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder addTargetHttpsProxies(
        int index, com.google.cloud.compute.v1.TargetHttpsProxy.Builder builderForValue) {
      if (targetHttpsProxiesBuilder_ == null) {
        ensureTargetHttpsProxiesIsMutable();
        targetHttpsProxies_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder addAllTargetHttpsProxies(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.TargetHttpsProxy> values) {
      if (targetHttpsProxiesBuilder_ == null) {
        ensureTargetHttpsProxiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, targetHttpsProxies_);
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder clearTargetHttpsProxies() {
      if (targetHttpsProxiesBuilder_ == null) {
        targetHttpsProxies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public Builder removeTargetHttpsProxies(int index) {
      if (targetHttpsProxiesBuilder_ == null) {
        ensureTargetHttpsProxiesIsMutable();
        targetHttpsProxies_.remove(index);
        onChanged();
      } else {
        targetHttpsProxiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public com.google.cloud.compute.v1.TargetHttpsProxy.Builder getTargetHttpsProxiesBuilder(
        int index) {
      return getTargetHttpsProxiesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder getTargetHttpsProxiesOrBuilder(
        int index) {
      if (targetHttpsProxiesBuilder_ == null) {
        return targetHttpsProxies_.get(index);  } else {
        return targetHttpsProxiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder> 
         getTargetHttpsProxiesOrBuilderList() {
      if (targetHttpsProxiesBuilder_ != null) {
        return targetHttpsProxiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(targetHttpsProxies_);
      }
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public com.google.cloud.compute.v1.TargetHttpsProxy.Builder addTargetHttpsProxiesBuilder() {
      return getTargetHttpsProxiesFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.TargetHttpsProxy.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public com.google.cloud.compute.v1.TargetHttpsProxy.Builder addTargetHttpsProxiesBuilder(
        int index) {
      return getTargetHttpsProxiesFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.TargetHttpsProxy.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of TargetHttpsProxies contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.TargetHttpsProxy.Builder> 
         getTargetHttpsProxiesBuilderList() {
      return getTargetHttpsProxiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.TargetHttpsProxy, com.google.cloud.compute.v1.TargetHttpsProxy.Builder, com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder> 
        getTargetHttpsProxiesFieldBuilder() {
      if (targetHttpsProxiesBuilder_ == null) {
        targetHttpsProxiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.TargetHttpsProxy, com.google.cloud.compute.v1.TargetHttpsProxy.Builder, com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder>(
                targetHttpsProxies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        targetHttpsProxies_ = null;
      }
      return targetHttpsProxiesBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder> warningBuilder_;
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(
        com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          warning_ != null &&
          warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null ?
            com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
      }
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder> 
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(),
                getParentForChildren(),
                isClean());
        warning_ = null;
      }
      return warningBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TargetHttpsProxiesScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TargetHttpsProxiesScopedList)
  private static final com.google.cloud.compute.v1.TargetHttpsProxiesScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TargetHttpsProxiesScopedList();
  }

  public static com.google.cloud.compute.v1.TargetHttpsProxiesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetHttpsProxiesScopedList>
      PARSER = new com.google.protobuf.AbstractParser<TargetHttpsProxiesScopedList>() {
    @java.lang.Override
    public TargetHttpsProxiesScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetHttpsProxiesScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetHttpsProxiesScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TargetHttpsProxiesScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

