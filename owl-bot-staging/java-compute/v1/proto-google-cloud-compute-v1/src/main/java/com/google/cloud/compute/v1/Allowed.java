// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Allowed}
 */
public final class Allowed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Allowed)
    AllowedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Allowed.newBuilder() to construct.
  private Allowed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Allowed() {
    iPProtocol_ = "";
    ports_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Allowed();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Allowed_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Allowed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Allowed.class, com.google.cloud.compute.v1.Allowed.Builder.class);
  }

  private int bitField0_;
  public static final int I_P_PROTOCOL_FIELD_NUMBER = 488094525;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iPProtocol_ = "";
  /**
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
   * </pre>
   *
   * <code>optional string I_p_protocol = 488094525;</code>
   * @return Whether the iPProtocol field is set.
   */
  @java.lang.Override
  public boolean hasIPProtocol() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
   * </pre>
   *
   * <code>optional string I_p_protocol = 488094525;</code>
   * @return The iPProtocol.
   */
  @java.lang.Override
  public java.lang.String getIPProtocol() {
    java.lang.Object ref = iPProtocol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iPProtocol_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
   * </pre>
   *
   * <code>optional string I_p_protocol = 488094525;</code>
   * @return The bytes for iPProtocol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIPProtocolBytes() {
    java.lang.Object ref = iPProtocol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iPProtocol_ = b;
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
   * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
   * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
   * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
   * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 488094525, iPProtocol_);
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(488094525, iPProtocol_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.Allowed)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Allowed other = (com.google.cloud.compute.v1.Allowed) obj;

    if (hasIPProtocol() != other.hasIPProtocol()) return false;
    if (hasIPProtocol()) {
      if (!getIPProtocol()
          .equals(other.getIPProtocol())) return false;
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
    if (hasIPProtocol()) {
      hash = (37 * hash) + I_P_PROTOCOL_FIELD_NUMBER;
      hash = (53 * hash) + getIPProtocol().hashCode();
    }
    if (getPortsCount() > 0) {
      hash = (37 * hash) + PORTS_FIELD_NUMBER;
      hash = (53 * hash) + getPortsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Allowed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Allowed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Allowed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Allowed parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.Allowed prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.Allowed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Allowed)
      com.google.cloud.compute.v1.AllowedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Allowed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Allowed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Allowed.class, com.google.cloud.compute.v1.Allowed.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Allowed.newBuilder()
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
      iPProtocol_ = "";
      ports_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Allowed_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Allowed getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Allowed.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Allowed build() {
      com.google.cloud.compute.v1.Allowed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Allowed buildPartial() {
      com.google.cloud.compute.v1.Allowed result = new com.google.cloud.compute.v1.Allowed(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.Allowed result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.iPProtocol_ = iPProtocol_;
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
      if (other instanceof com.google.cloud.compute.v1.Allowed) {
        return mergeFrom((com.google.cloud.compute.v1.Allowed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Allowed other) {
      if (other == com.google.cloud.compute.v1.Allowed.getDefaultInstance()) return this;
      if (other.hasIPProtocol()) {
        iPProtocol_ = other.iPProtocol_;
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
            case -390211094: {
              iPProtocol_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -390211094
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

    private java.lang.Object iPProtocol_ = "";
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * </pre>
     *
     * <code>optional string I_p_protocol = 488094525;</code>
     * @return Whether the iPProtocol field is set.
     */
    public boolean hasIPProtocol() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * </pre>
     *
     * <code>optional string I_p_protocol = 488094525;</code>
     * @return The iPProtocol.
     */
    public java.lang.String getIPProtocol() {
      java.lang.Object ref = iPProtocol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iPProtocol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * </pre>
     *
     * <code>optional string I_p_protocol = 488094525;</code>
     * @return The bytes for iPProtocol.
     */
    public com.google.protobuf.ByteString
        getIPProtocolBytes() {
      java.lang.Object ref = iPProtocol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iPProtocol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * </pre>
     *
     * <code>optional string I_p_protocol = 488094525;</code>
     * @param value The iPProtocol to set.
     * @return This builder for chaining.
     */
    public Builder setIPProtocol(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iPProtocol_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * </pre>
     *
     * <code>optional string I_p_protocol = 488094525;</code>
     * @return This builder for chaining.
     */
    public Builder clearIPProtocol() {
      iPProtocol_ = getDefaultInstance().getIPProtocol();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * </pre>
     *
     * <code>optional string I_p_protocol = 488094525;</code>
     * @param value The bytes for iPProtocol to set.
     * @return This builder for chaining.
     */
    public Builder setIPProtocolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iPProtocol_ = value;
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Allowed)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Allowed)
  private static final com.google.cloud.compute.v1.Allowed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Allowed();
  }

  public static com.google.cloud.compute.v1.Allowed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Allowed>
      PARSER = new com.google.protobuf.AbstractParser<Allowed>() {
    @java.lang.Override
    public Allowed parsePartialFrom(
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

  public static com.google.protobuf.Parser<Allowed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Allowed> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Allowed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

