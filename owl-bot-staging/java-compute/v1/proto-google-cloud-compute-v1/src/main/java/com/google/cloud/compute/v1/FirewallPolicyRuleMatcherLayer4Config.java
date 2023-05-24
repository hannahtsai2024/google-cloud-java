// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config}
 */
public final class FirewallPolicyRuleMatcherLayer4Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config)
    FirewallPolicyRuleMatcherLayer4ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FirewallPolicyRuleMatcherLayer4Config.newBuilder() to construct.
  private FirewallPolicyRuleMatcherLayer4Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FirewallPolicyRuleMatcherLayer4Config() {
    ipProtocol_ = "";
    ports_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FirewallPolicyRuleMatcherLayer4Config();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleMatcherLayer4Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleMatcherLayer4Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config.class, com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config.Builder.class);
  }

  private int bitField0_;
  public static final int IP_PROTOCOL_FIELD_NUMBER = 475958960;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ipProtocol_ = "";
  /**
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * </pre>
   *
   * <code>optional string ip_protocol = 475958960;</code>
   * @return Whether the ipProtocol field is set.
   */
  @java.lang.Override
  public boolean hasIpProtocol() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * </pre>
   *
   * <code>optional string ip_protocol = 475958960;</code>
   * @return The ipProtocol.
   */
  @java.lang.Override
  public java.lang.String getIpProtocol() {
    java.lang.Object ref = ipProtocol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipProtocol_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * </pre>
   *
   * <code>optional string ip_protocol = 475958960;</code>
   * @return The bytes for ipProtocol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpProtocolBytes() {
    java.lang.Object ref = ipProtocol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipProtocol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORTS_FIELD_NUMBER = 106854418;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ports_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   * @return A list containing the ports.
   */
  public com.google.protobuf.ProtocolStringList
      getPortsList() {
    return ports_;
  }
  /**
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   * @return The count of ports.
   */
  public int getPortsCount() {
    return ports_.size();
  }
  /**
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   * @param index The index of the element to return.
   * @return The ports at the given index.
   */
  public java.lang.String getPorts(int index) {
    return ports_.get(index);
  }
  /**
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ports at the given index.
   */
  public com.google.protobuf.ByteString
      getPortsBytes(int index) {
    return ports_.getByteString(index);
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
    for (int i = 0; i < ports_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 106854418, ports_.getRaw(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 475958960, ipProtocol_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ports_.size(); i++) {
        dataSize += computeStringSizeNoTag(ports_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getPortsList().size();
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(475958960, ipProtocol_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config other = (com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config) obj;

    if (hasIpProtocol() != other.hasIpProtocol()) return false;
    if (hasIpProtocol()) {
      if (!getIpProtocol()
          .equals(other.getIpProtocol())) return false;
    }
    if (!getPortsList()
        .equals(other.getPortsList())) return false;
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
    if (hasIpProtocol()) {
      hash = (37 * hash) + IP_PROTOCOL_FIELD_NUMBER;
      hash = (53 * hash) + getIpProtocol().hashCode();
    }
    if (getPortsCount() > 0) {
      hash = (37 * hash) + PORTS_FIELD_NUMBER;
      hash = (53 * hash) + getPortsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config)
      com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleMatcherLayer4Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleMatcherLayer4Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config.class, com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config.newBuilder()
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
      ipProtocol_ = "";
      ports_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleMatcherLayer4Config_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config build() {
      com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config buildPartial() {
      com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config result = new com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ipProtocol_ = ipProtocol_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        ports_.makeImmutable();
        result.ports_ = ports_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config) {
        return mergeFrom((com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config other) {
      if (other == com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config.getDefaultInstance()) return this;
      if (other.hasIpProtocol()) {
        ipProtocol_ = other.ipProtocol_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.ports_.isEmpty()) {
        if (ports_.isEmpty()) {
          ports_ = other.ports_;
          bitField0_ |= 0x00000002;
        } else {
          ensurePortsIsMutable();
          ports_.addAll(other.ports_);
        }
        onChanged();
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
            case 854835346: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePortsIsMutable();
              ports_.add(s);
              break;
            } // case 854835346
            case -487295614: {
              ipProtocol_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -487295614
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

    private java.lang.Object ipProtocol_ = "";
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * </pre>
     *
     * <code>optional string ip_protocol = 475958960;</code>
     * @return Whether the ipProtocol field is set.
     */
    public boolean hasIpProtocol() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * </pre>
     *
     * <code>optional string ip_protocol = 475958960;</code>
     * @return The ipProtocol.
     */
    public java.lang.String getIpProtocol() {
      java.lang.Object ref = ipProtocol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipProtocol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * </pre>
     *
     * <code>optional string ip_protocol = 475958960;</code>
     * @return The bytes for ipProtocol.
     */
    public com.google.protobuf.ByteString
        getIpProtocolBytes() {
      java.lang.Object ref = ipProtocol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipProtocol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * </pre>
     *
     * <code>optional string ip_protocol = 475958960;</code>
     * @param value The ipProtocol to set.
     * @return This builder for chaining.
     */
    public Builder setIpProtocol(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ipProtocol_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * </pre>
     *
     * <code>optional string ip_protocol = 475958960;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpProtocol() {
      ipProtocol_ = getDefaultInstance().getIpProtocol();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * </pre>
     *
     * <code>optional string ip_protocol = 475958960;</code>
     * @param value The bytes for ipProtocol to set.
     * @return This builder for chaining.
     */
    public Builder setIpProtocolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ipProtocol_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList ports_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePortsIsMutable() {
      if (!ports_.isModifiable()) {
        ports_ = new com.google.protobuf.LazyStringArrayList(ports_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @return A list containing the ports.
     */
    public com.google.protobuf.ProtocolStringList
        getPortsList() {
      ports_.makeImmutable();
      return ports_;
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @return The count of ports.
     */
    public int getPortsCount() {
      return ports_.size();
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @param index The index of the element to return.
     * @return The ports at the given index.
     */
    public java.lang.String getPorts(int index) {
      return ports_.get(index);
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @param index The index of the value to return.
     * @return The bytes of the ports at the given index.
     */
    public com.google.protobuf.ByteString
        getPortsBytes(int index) {
      return ports_.getByteString(index);
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @param index The index to set the value at.
     * @param value The ports to set.
     * @return This builder for chaining.
     */
    public Builder setPorts(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePortsIsMutable();
      ports_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @param value The ports to add.
     * @return This builder for chaining.
     */
    public Builder addPorts(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePortsIsMutable();
      ports_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @param values The ports to add.
     * @return This builder for chaining.
     */
    public Builder addAllPorts(
        java.lang.Iterable<java.lang.String> values) {
      ensurePortsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ports_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @return This builder for chaining.
     */
    public Builder clearPorts() {
      ports_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * </pre>
     *
     * <code>repeated string ports = 106854418;</code>
     * @param value The bytes of the ports to add.
     * @return This builder for chaining.
     */
    public Builder addPortsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePortsIsMutable();
      ports_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config)
  private static final com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config();
  }

  public static com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FirewallPolicyRuleMatcherLayer4Config>
      PARSER = new com.google.protobuf.AbstractParser<FirewallPolicyRuleMatcherLayer4Config>() {
    @java.lang.Override
    public FirewallPolicyRuleMatcherLayer4Config parsePartialFrom(
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

  public static com.google.protobuf.Parser<FirewallPolicyRuleMatcherLayer4Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FirewallPolicyRuleMatcherLayer4Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

