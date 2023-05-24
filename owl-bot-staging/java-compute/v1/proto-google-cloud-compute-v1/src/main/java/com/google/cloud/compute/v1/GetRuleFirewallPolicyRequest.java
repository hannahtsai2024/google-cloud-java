// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for FirewallPolicies.GetRule. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetRuleFirewallPolicyRequest}
 */
public final class GetRuleFirewallPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetRuleFirewallPolicyRequest)
    GetRuleFirewallPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRuleFirewallPolicyRequest.newBuilder() to construct.
  private GetRuleFirewallPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRuleFirewallPolicyRequest() {
    firewallPolicy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRuleFirewallPolicyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleFirewallPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleFirewallPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest.class, com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FIREWALL_POLICY_FIELD_NUMBER = 498173265;
  @SuppressWarnings("serial")
  private volatile java.lang.Object firewallPolicy_ = "";
  /**
   * <pre>
   * Name of the firewall policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The firewallPolicy.
   */
  @java.lang.Override
  public java.lang.String getFirewallPolicy() {
    java.lang.Object ref = firewallPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firewallPolicy_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the firewall policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for firewallPolicy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirewallPolicyBytes() {
    java.lang.Object ref = firewallPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firewallPolicy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIORITY_FIELD_NUMBER = 445151652;
  private int priority_ = 0;
  /**
   * <pre>
   * The priority of the rule to get from the firewall policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return Whether the priority field is set.
   */
  @java.lang.Override
  public boolean hasPriority() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The priority of the rule to get from the firewall policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return The priority.
   */
  @java.lang.Override
  public int getPriority() {
    return priority_;
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
      output.writeInt32(445151652, priority_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firewallPolicy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 498173265, firewallPolicy_);
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
        .computeInt32Size(445151652, priority_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firewallPolicy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(498173265, firewallPolicy_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest other = (com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest) obj;

    if (!getFirewallPolicy()
        .equals(other.getFirewallPolicy())) return false;
    if (hasPriority() != other.hasPriority()) return false;
    if (hasPriority()) {
      if (getPriority()
          != other.getPriority()) return false;
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
    hash = (37 * hash) + FIREWALL_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + getFirewallPolicy().hashCode();
    if (hasPriority()) {
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + getPriority();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest prototype) {
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
   * A request message for FirewallPolicies.GetRule. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetRuleFirewallPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetRuleFirewallPolicyRequest)
      com.google.cloud.compute.v1.GetRuleFirewallPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleFirewallPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest.class, com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      firewallPolicy_ = "";
      priority_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest build() {
      com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest buildPartial() {
      com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest result = new com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.firewallPolicy_ = firewallPolicy_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.priority_ = priority_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest other) {
      if (other == com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest.getDefaultInstance()) return this;
      if (!other.getFirewallPolicy().isEmpty()) {
        firewallPolicy_ = other.firewallPolicy_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPriority()) {
        setPriority(other.getPriority());
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
            case -733754080: {
              priority_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case -733754080
            case -309581174: {
              firewallPolicy_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -309581174
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

    private java.lang.Object firewallPolicy_ = "";
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The firewallPolicy.
     */
    public java.lang.String getFirewallPolicy() {
      java.lang.Object ref = firewallPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firewallPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for firewallPolicy.
     */
    public com.google.protobuf.ByteString
        getFirewallPolicyBytes() {
      java.lang.Object ref = firewallPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firewallPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The firewallPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setFirewallPolicy(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      firewallPolicy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFirewallPolicy() {
      firewallPolicy_ = getDefaultInstance().getFirewallPolicy();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for firewallPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setFirewallPolicyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      firewallPolicy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @return Whether the priority field is set.
     */
    @java.lang.Override
    public boolean hasPriority() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {

      priority_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      bitField0_ = (bitField0_ & ~0x00000002);
      priority_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetRuleFirewallPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetRuleFirewallPolicyRequest)
  private static final com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest();
  }

  public static com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRuleFirewallPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetRuleFirewallPolicyRequest>() {
    @java.lang.Override
    public GetRuleFirewallPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRuleFirewallPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRuleFirewallPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

