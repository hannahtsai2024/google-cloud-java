// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest}
 */
public final class SubnetworksSetPrivateIpGoogleAccessRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest)
    SubnetworksSetPrivateIpGoogleAccessRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubnetworksSetPrivateIpGoogleAccessRequest.newBuilder() to construct.
  private SubnetworksSetPrivateIpGoogleAccessRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubnetworksSetPrivateIpGoogleAccessRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubnetworksSetPrivateIpGoogleAccessRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworksSetPrivateIpGoogleAccessRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworksSetPrivateIpGoogleAccessRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest.class, com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PRIVATE_IP_GOOGLE_ACCESS_FIELD_NUMBER = 421491790;
  private boolean privateIpGoogleAccess_ = false;
  /**
   * <code>optional bool private_ip_google_access = 421491790;</code>
   * @return Whether the privateIpGoogleAccess field is set.
   */
  @java.lang.Override
  public boolean hasPrivateIpGoogleAccess() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool private_ip_google_access = 421491790;</code>
   * @return The privateIpGoogleAccess.
   */
  @java.lang.Override
  public boolean getPrivateIpGoogleAccess() {
    return privateIpGoogleAccess_;
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
      output.writeBool(421491790, privateIpGoogleAccess_);
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
        .computeBoolSize(421491790, privateIpGoogleAccess_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest other = (com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest) obj;

    if (hasPrivateIpGoogleAccess() != other.hasPrivateIpGoogleAccess()) return false;
    if (hasPrivateIpGoogleAccess()) {
      if (getPrivateIpGoogleAccess()
          != other.getPrivateIpGoogleAccess()) return false;
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
    if (hasPrivateIpGoogleAccess()) {
      hash = (37 * hash) + PRIVATE_IP_GOOGLE_ACCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPrivateIpGoogleAccess());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest)
      com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworksSetPrivateIpGoogleAccessRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworksSetPrivateIpGoogleAccessRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest.class, com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest.newBuilder()
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
      privateIpGoogleAccess_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworksSetPrivateIpGoogleAccessRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest build() {
      com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest buildPartial() {
      com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest result = new com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.privateIpGoogleAccess_ = privateIpGoogleAccess_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest) {
        return mergeFrom((com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest other) {
      if (other == com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest.getDefaultInstance()) return this;
      if (other.hasPrivateIpGoogleAccess()) {
        setPrivateIpGoogleAccess(other.getPrivateIpGoogleAccess());
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
            case -923032976: {
              privateIpGoogleAccess_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case -923032976
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

    private boolean privateIpGoogleAccess_ ;
    /**
     * <code>optional bool private_ip_google_access = 421491790;</code>
     * @return Whether the privateIpGoogleAccess field is set.
     */
    @java.lang.Override
    public boolean hasPrivateIpGoogleAccess() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool private_ip_google_access = 421491790;</code>
     * @return The privateIpGoogleAccess.
     */
    @java.lang.Override
    public boolean getPrivateIpGoogleAccess() {
      return privateIpGoogleAccess_;
    }
    /**
     * <code>optional bool private_ip_google_access = 421491790;</code>
     * @param value The privateIpGoogleAccess to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateIpGoogleAccess(boolean value) {

      privateIpGoogleAccess_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool private_ip_google_access = 421491790;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivateIpGoogleAccess() {
      bitField0_ = (bitField0_ & ~0x00000001);
      privateIpGoogleAccess_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest)
  private static final com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest();
  }

  public static com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubnetworksSetPrivateIpGoogleAccessRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubnetworksSetPrivateIpGoogleAccessRequest>() {
    @java.lang.Override
    public SubnetworksSetPrivateIpGoogleAccessRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubnetworksSetPrivateIpGoogleAccessRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubnetworksSetPrivateIpGoogleAccessRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

