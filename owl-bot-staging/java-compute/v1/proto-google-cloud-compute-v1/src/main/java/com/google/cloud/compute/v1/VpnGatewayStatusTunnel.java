// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Contains some information about a VPN tunnel.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.VpnGatewayStatusTunnel}
 */
public final class VpnGatewayStatusTunnel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.VpnGatewayStatusTunnel)
    VpnGatewayStatusTunnelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VpnGatewayStatusTunnel.newBuilder() to construct.
  private VpnGatewayStatusTunnel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VpnGatewayStatusTunnel() {
    tunnelUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VpnGatewayStatusTunnel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatusTunnel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatusTunnel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.VpnGatewayStatusTunnel.class, com.google.cloud.compute.v1.VpnGatewayStatusTunnel.Builder.class);
  }

  private int bitField0_;
  public static final int LOCAL_GATEWAY_INTERFACE_FIELD_NUMBER = 158764330;
  private int localGatewayInterface_ = 0;
  /**
   * <pre>
   * The VPN gateway interface this VPN tunnel is associated with.
   * </pre>
   *
   * <code>optional uint32 local_gateway_interface = 158764330;</code>
   * @return Whether the localGatewayInterface field is set.
   */
  @java.lang.Override
  public boolean hasLocalGatewayInterface() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The VPN gateway interface this VPN tunnel is associated with.
   * </pre>
   *
   * <code>optional uint32 local_gateway_interface = 158764330;</code>
   * @return The localGatewayInterface.
   */
  @java.lang.Override
  public int getLocalGatewayInterface() {
    return localGatewayInterface_;
  }

  public static final int PEER_GATEWAY_INTERFACE_FIELD_NUMBER = 214380385;
  private int peerGatewayInterface_ = 0;
  /**
   * <pre>
   * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway.
   * </pre>
   *
   * <code>optional uint32 peer_gateway_interface = 214380385;</code>
   * @return Whether the peerGatewayInterface field is set.
   */
  @java.lang.Override
  public boolean hasPeerGatewayInterface() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway.
   * </pre>
   *
   * <code>optional uint32 peer_gateway_interface = 214380385;</code>
   * @return The peerGatewayInterface.
   */
  @java.lang.Override
  public int getPeerGatewayInterface() {
    return peerGatewayInterface_;
  }

  public static final int TUNNEL_URL_FIELD_NUMBER = 78975256;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tunnelUrl_ = "";
  /**
   * <pre>
   * URL reference to the VPN tunnel.
   * </pre>
   *
   * <code>optional string tunnel_url = 78975256;</code>
   * @return Whether the tunnelUrl field is set.
   */
  @java.lang.Override
  public boolean hasTunnelUrl() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * URL reference to the VPN tunnel.
   * </pre>
   *
   * <code>optional string tunnel_url = 78975256;</code>
   * @return The tunnelUrl.
   */
  @java.lang.Override
  public java.lang.String getTunnelUrl() {
    java.lang.Object ref = tunnelUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tunnelUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL reference to the VPN tunnel.
   * </pre>
   *
   * <code>optional string tunnel_url = 78975256;</code>
   * @return The bytes for tunnelUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTunnelUrlBytes() {
    java.lang.Object ref = tunnelUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tunnelUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 78975256, tunnelUrl_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt32(158764330, localGatewayInterface_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(214380385, peerGatewayInterface_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(78975256, tunnelUrl_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(158764330, localGatewayInterface_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(214380385, peerGatewayInterface_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.VpnGatewayStatusTunnel)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.VpnGatewayStatusTunnel other = (com.google.cloud.compute.v1.VpnGatewayStatusTunnel) obj;

    if (hasLocalGatewayInterface() != other.hasLocalGatewayInterface()) return false;
    if (hasLocalGatewayInterface()) {
      if (getLocalGatewayInterface()
          != other.getLocalGatewayInterface()) return false;
    }
    if (hasPeerGatewayInterface() != other.hasPeerGatewayInterface()) return false;
    if (hasPeerGatewayInterface()) {
      if (getPeerGatewayInterface()
          != other.getPeerGatewayInterface()) return false;
    }
    if (hasTunnelUrl() != other.hasTunnelUrl()) return false;
    if (hasTunnelUrl()) {
      if (!getTunnelUrl()
          .equals(other.getTunnelUrl())) return false;
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
    if (hasLocalGatewayInterface()) {
      hash = (37 * hash) + LOCAL_GATEWAY_INTERFACE_FIELD_NUMBER;
      hash = (53 * hash) + getLocalGatewayInterface();
    }
    if (hasPeerGatewayInterface()) {
      hash = (37 * hash) + PEER_GATEWAY_INTERFACE_FIELD_NUMBER;
      hash = (53 * hash) + getPeerGatewayInterface();
    }
    if (hasTunnelUrl()) {
      hash = (37 * hash) + TUNNEL_URL_FIELD_NUMBER;
      hash = (53 * hash) + getTunnelUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.VpnGatewayStatusTunnel prototype) {
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
   * Contains some information about a VPN tunnel.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.VpnGatewayStatusTunnel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.VpnGatewayStatusTunnel)
      com.google.cloud.compute.v1.VpnGatewayStatusTunnelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatusTunnel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatusTunnel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.VpnGatewayStatusTunnel.class, com.google.cloud.compute.v1.VpnGatewayStatusTunnel.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.VpnGatewayStatusTunnel.newBuilder()
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
      localGatewayInterface_ = 0;
      peerGatewayInterface_ = 0;
      tunnelUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatusTunnel_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewayStatusTunnel getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.VpnGatewayStatusTunnel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewayStatusTunnel build() {
      com.google.cloud.compute.v1.VpnGatewayStatusTunnel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewayStatusTunnel buildPartial() {
      com.google.cloud.compute.v1.VpnGatewayStatusTunnel result = new com.google.cloud.compute.v1.VpnGatewayStatusTunnel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.VpnGatewayStatusTunnel result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.localGatewayInterface_ = localGatewayInterface_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.peerGatewayInterface_ = peerGatewayInterface_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tunnelUrl_ = tunnelUrl_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.VpnGatewayStatusTunnel) {
        return mergeFrom((com.google.cloud.compute.v1.VpnGatewayStatusTunnel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.VpnGatewayStatusTunnel other) {
      if (other == com.google.cloud.compute.v1.VpnGatewayStatusTunnel.getDefaultInstance()) return this;
      if (other.hasLocalGatewayInterface()) {
        setLocalGatewayInterface(other.getLocalGatewayInterface());
      }
      if (other.hasPeerGatewayInterface()) {
        setPeerGatewayInterface(other.getPeerGatewayInterface());
      }
      if (other.hasTunnelUrl()) {
        tunnelUrl_ = other.tunnelUrl_;
        bitField0_ |= 0x00000004;
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
            case 631802050: {
              tunnelUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 631802050
            case 1270114640: {
              localGatewayInterface_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 1270114640
            case 1715043080: {
              peerGatewayInterface_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 1715043080
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

    private int localGatewayInterface_ ;
    /**
     * <pre>
     * The VPN gateway interface this VPN tunnel is associated with.
     * </pre>
     *
     * <code>optional uint32 local_gateway_interface = 158764330;</code>
     * @return Whether the localGatewayInterface field is set.
     */
    @java.lang.Override
    public boolean hasLocalGatewayInterface() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The VPN gateway interface this VPN tunnel is associated with.
     * </pre>
     *
     * <code>optional uint32 local_gateway_interface = 158764330;</code>
     * @return The localGatewayInterface.
     */
    @java.lang.Override
    public int getLocalGatewayInterface() {
      return localGatewayInterface_;
    }
    /**
     * <pre>
     * The VPN gateway interface this VPN tunnel is associated with.
     * </pre>
     *
     * <code>optional uint32 local_gateway_interface = 158764330;</code>
     * @param value The localGatewayInterface to set.
     * @return This builder for chaining.
     */
    public Builder setLocalGatewayInterface(int value) {

      localGatewayInterface_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The VPN gateway interface this VPN tunnel is associated with.
     * </pre>
     *
     * <code>optional uint32 local_gateway_interface = 158764330;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalGatewayInterface() {
      bitField0_ = (bitField0_ & ~0x00000001);
      localGatewayInterface_ = 0;
      onChanged();
      return this;
    }

    private int peerGatewayInterface_ ;
    /**
     * <pre>
     * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway.
     * </pre>
     *
     * <code>optional uint32 peer_gateway_interface = 214380385;</code>
     * @return Whether the peerGatewayInterface field is set.
     */
    @java.lang.Override
    public boolean hasPeerGatewayInterface() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway.
     * </pre>
     *
     * <code>optional uint32 peer_gateway_interface = 214380385;</code>
     * @return The peerGatewayInterface.
     */
    @java.lang.Override
    public int getPeerGatewayInterface() {
      return peerGatewayInterface_;
    }
    /**
     * <pre>
     * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway.
     * </pre>
     *
     * <code>optional uint32 peer_gateway_interface = 214380385;</code>
     * @param value The peerGatewayInterface to set.
     * @return This builder for chaining.
     */
    public Builder setPeerGatewayInterface(int value) {

      peerGatewayInterface_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway.
     * </pre>
     *
     * <code>optional uint32 peer_gateway_interface = 214380385;</code>
     * @return This builder for chaining.
     */
    public Builder clearPeerGatewayInterface() {
      bitField0_ = (bitField0_ & ~0x00000002);
      peerGatewayInterface_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object tunnelUrl_ = "";
    /**
     * <pre>
     * URL reference to the VPN tunnel.
     * </pre>
     *
     * <code>optional string tunnel_url = 78975256;</code>
     * @return Whether the tunnelUrl field is set.
     */
    public boolean hasTunnelUrl() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * URL reference to the VPN tunnel.
     * </pre>
     *
     * <code>optional string tunnel_url = 78975256;</code>
     * @return The tunnelUrl.
     */
    public java.lang.String getTunnelUrl() {
      java.lang.Object ref = tunnelUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tunnelUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL reference to the VPN tunnel.
     * </pre>
     *
     * <code>optional string tunnel_url = 78975256;</code>
     * @return The bytes for tunnelUrl.
     */
    public com.google.protobuf.ByteString
        getTunnelUrlBytes() {
      java.lang.Object ref = tunnelUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tunnelUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL reference to the VPN tunnel.
     * </pre>
     *
     * <code>optional string tunnel_url = 78975256;</code>
     * @param value The tunnelUrl to set.
     * @return This builder for chaining.
     */
    public Builder setTunnelUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tunnelUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL reference to the VPN tunnel.
     * </pre>
     *
     * <code>optional string tunnel_url = 78975256;</code>
     * @return This builder for chaining.
     */
    public Builder clearTunnelUrl() {
      tunnelUrl_ = getDefaultInstance().getTunnelUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL reference to the VPN tunnel.
     * </pre>
     *
     * <code>optional string tunnel_url = 78975256;</code>
     * @param value The bytes for tunnelUrl to set.
     * @return This builder for chaining.
     */
    public Builder setTunnelUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tunnelUrl_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.VpnGatewayStatusTunnel)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.VpnGatewayStatusTunnel)
  private static final com.google.cloud.compute.v1.VpnGatewayStatusTunnel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.VpnGatewayStatusTunnel();
  }

  public static com.google.cloud.compute.v1.VpnGatewayStatusTunnel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VpnGatewayStatusTunnel>
      PARSER = new com.google.protobuf.AbstractParser<VpnGatewayStatusTunnel>() {
    @java.lang.Override
    public VpnGatewayStatusTunnel parsePartialFrom(
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

  public static com.google.protobuf.Parser<VpnGatewayStatusTunnel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VpnGatewayStatusTunnel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.VpnGatewayStatusTunnel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

