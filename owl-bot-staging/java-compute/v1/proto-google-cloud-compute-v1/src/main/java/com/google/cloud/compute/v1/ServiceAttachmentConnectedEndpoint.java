// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * [Output Only] A connection connected to this service attachment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint}
 */
public final class ServiceAttachmentConnectedEndpoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint)
    ServiceAttachmentConnectedEndpointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceAttachmentConnectedEndpoint.newBuilder() to construct.
  private ServiceAttachmentConnectedEndpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceAttachmentConnectedEndpoint() {
    endpoint_ = "";
    status_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceAttachmentConnectedEndpoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ServiceAttachmentConnectedEndpoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ServiceAttachmentConnectedEndpoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.class, com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.Builder.class);
  }

  /**
   * <pre>
   * The status of a connected endpoint to this service attachment.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_STATUS = 0;</code>
     */
    UNDEFINED_STATUS(0),
    /**
     * <pre>
     * The connection has been accepted by the producer.
     * </pre>
     *
     * <code>ACCEPTED = 246714279;</code>
     */
    ACCEPTED(246714279),
    /**
     * <pre>
     * The connection has been closed by the producer.
     * </pre>
     *
     * <code>CLOSED = 380163436;</code>
     */
    CLOSED(380163436),
    /**
     * <pre>
     * The connection has been accepted by the producer, but the producer needs to take further action before the forwarding rule can serve traffic.
     * </pre>
     *
     * <code>NEEDS_ATTENTION = 344491452;</code>
     */
    NEEDS_ATTENTION(344491452),
    /**
     * <pre>
     * The connection is pending acceptance by the producer.
     * </pre>
     *
     * <code>PENDING = 35394935;</code>
     */
    PENDING(35394935),
    /**
     * <pre>
     * The consumer is still connected but not using the connection.
     * </pre>
     *
     * <code>REJECTED = 174130302;</code>
     */
    REJECTED(174130302),
    /**
     * <code>STATUS_UNSPECIFIED = 42133066;</code>
     */
    STATUS_UNSPECIFIED(42133066),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_STATUS = 0;</code>
     */
    public static final int UNDEFINED_STATUS_VALUE = 0;
    /**
     * <pre>
     * The connection has been accepted by the producer.
     * </pre>
     *
     * <code>ACCEPTED = 246714279;</code>
     */
    public static final int ACCEPTED_VALUE = 246714279;
    /**
     * <pre>
     * The connection has been closed by the producer.
     * </pre>
     *
     * <code>CLOSED = 380163436;</code>
     */
    public static final int CLOSED_VALUE = 380163436;
    /**
     * <pre>
     * The connection has been accepted by the producer, but the producer needs to take further action before the forwarding rule can serve traffic.
     * </pre>
     *
     * <code>NEEDS_ATTENTION = 344491452;</code>
     */
    public static final int NEEDS_ATTENTION_VALUE = 344491452;
    /**
     * <pre>
     * The connection is pending acceptance by the producer.
     * </pre>
     *
     * <code>PENDING = 35394935;</code>
     */
    public static final int PENDING_VALUE = 35394935;
    /**
     * <pre>
     * The consumer is still connected but not using the connection.
     * </pre>
     *
     * <code>REJECTED = 174130302;</code>
     */
    public static final int REJECTED_VALUE = 174130302;
    /**
     * <code>STATUS_UNSPECIFIED = 42133066;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 42133066;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_STATUS;
        case 246714279: return ACCEPTED;
        case 380163436: return CLOSED;
        case 344491452: return NEEDS_ATTENTION;
        case 35394935: return PENDING;
        case 174130302: return REJECTED;
        case 42133066: return STATUS_UNSPECIFIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.Status)
  }

  private int bitField0_;
  public static final int ENDPOINT_FIELD_NUMBER = 130489749;
  @SuppressWarnings("serial")
  private volatile java.lang.Object endpoint_ = "";
  /**
   * <pre>
   * The url of a connected endpoint.
   * </pre>
   *
   * <code>optional string endpoint = 130489749;</code>
   * @return Whether the endpoint field is set.
   */
  @java.lang.Override
  public boolean hasEndpoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The url of a connected endpoint.
   * </pre>
   *
   * <code>optional string endpoint = 130489749;</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public java.lang.String getEndpoint() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpoint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The url of a connected endpoint.
   * </pre>
   *
   * <code>optional string endpoint = 130489749;</code>
   * @return The bytes for endpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndpointBytes() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PSC_CONNECTION_ID_FIELD_NUMBER = 292082397;
  private long pscConnectionId_ = 0L;
  /**
   * <pre>
   * The PSC connection id of the connected endpoint.
   * </pre>
   *
   * <code>optional uint64 psc_connection_id = 292082397;</code>
   * @return Whether the pscConnectionId field is set.
   */
  @java.lang.Override
  public boolean hasPscConnectionId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The PSC connection id of the connected endpoint.
   * </pre>
   *
   * <code>optional uint64 psc_connection_id = 292082397;</code>
   * @return The pscConnectionId.
   */
  @java.lang.Override
  public long getPscConnectionId() {
    return pscConnectionId_;
  }

  public static final int STATUS_FIELD_NUMBER = 181260274;
  @SuppressWarnings("serial")
  private volatile java.lang.Object status_ = "";
  /**
   * <pre>
   * The status of a connected endpoint to this service attachment.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The status of a connected endpoint to this service attachment.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The status of a connected endpoint to this service attachment.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 130489749, endpoint_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 181260274, status_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(292082397, pscConnectionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(130489749, endpoint_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(181260274, status_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(292082397, pscConnectionId_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint other = (com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint) obj;

    if (hasEndpoint() != other.hasEndpoint()) return false;
    if (hasEndpoint()) {
      if (!getEndpoint()
          .equals(other.getEndpoint())) return false;
    }
    if (hasPscConnectionId() != other.hasPscConnectionId()) return false;
    if (hasPscConnectionId()) {
      if (getPscConnectionId()
          != other.getPscConnectionId()) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    if (hasEndpoint()) {
      hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getEndpoint().hashCode();
    }
    if (hasPscConnectionId()) {
      hash = (37 * hash) + PSC_CONNECTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPscConnectionId());
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint prototype) {
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
   * [Output Only] A connection connected to this service attachment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint)
      com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ServiceAttachmentConnectedEndpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ServiceAttachmentConnectedEndpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.class, com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.newBuilder()
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
      endpoint_ = "";
      pscConnectionId_ = 0L;
      status_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ServiceAttachmentConnectedEndpoint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint build() {
      com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint buildPartial() {
      com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint result = new com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpoint_ = endpoint_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pscConnectionId_ = pscConnectionId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.status_ = status_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint) {
        return mergeFrom((com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint other) {
      if (other == com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint.getDefaultInstance()) return this;
      if (other.hasEndpoint()) {
        endpoint_ = other.endpoint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPscConnectionId()) {
        setPscConnectionId(other.getPscConnectionId());
      }
      if (other.hasStatus()) {
        status_ = other.status_;
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
            case 1043917994: {
              endpoint_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1043917994
            case 1450082194: {
              status_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 1450082194
            case -1958308120: {
              pscConnectionId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case -1958308120
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

    private java.lang.Object endpoint_ = "";
    /**
     * <pre>
     * The url of a connected endpoint.
     * </pre>
     *
     * <code>optional string endpoint = 130489749;</code>
     * @return Whether the endpoint field is set.
     */
    public boolean hasEndpoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The url of a connected endpoint.
     * </pre>
     *
     * <code>optional string endpoint = 130489749;</code>
     * @return The endpoint.
     */
    public java.lang.String getEndpoint() {
      java.lang.Object ref = endpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The url of a connected endpoint.
     * </pre>
     *
     * <code>optional string endpoint = 130489749;</code>
     * @return The bytes for endpoint.
     */
    public com.google.protobuf.ByteString
        getEndpointBytes() {
      java.lang.Object ref = endpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The url of a connected endpoint.
     * </pre>
     *
     * <code>optional string endpoint = 130489749;</code>
     * @param value The endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoint(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The url of a connected endpoint.
     * </pre>
     *
     * <code>optional string endpoint = 130489749;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpoint() {
      endpoint_ = getDefaultInstance().getEndpoint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The url of a connected endpoint.
     * </pre>
     *
     * <code>optional string endpoint = 130489749;</code>
     * @param value The bytes for endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long pscConnectionId_ ;
    /**
     * <pre>
     * The PSC connection id of the connected endpoint.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @return Whether the pscConnectionId field is set.
     */
    @java.lang.Override
    public boolean hasPscConnectionId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The PSC connection id of the connected endpoint.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @return The pscConnectionId.
     */
    @java.lang.Override
    public long getPscConnectionId() {
      return pscConnectionId_;
    }
    /**
     * <pre>
     * The PSC connection id of the connected endpoint.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @param value The pscConnectionId to set.
     * @return This builder for chaining.
     */
    public Builder setPscConnectionId(long value) {

      pscConnectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The PSC connection id of the connected endpoint.
     * </pre>
     *
     * <code>optional uint64 psc_connection_id = 292082397;</code>
     * @return This builder for chaining.
     */
    public Builder clearPscConnectionId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pscConnectionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     * The status of a connected endpoint to this service attachment.
     * Check the Status enum for the list of possible values.
     * </pre>
     *
     * <code>optional string status = 181260274;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The status of a connected endpoint to this service attachment.
     * Check the Status enum for the list of possible values.
     * </pre>
     *
     * <code>optional string status = 181260274;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The status of a connected endpoint to this service attachment.
     * Check the Status enum for the list of possible values.
     * </pre>
     *
     * <code>optional string status = 181260274;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The status of a connected endpoint to this service attachment.
     * Check the Status enum for the list of possible values.
     * </pre>
     *
     * <code>optional string status = 181260274;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      status_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of a connected endpoint to this service attachment.
     * Check the Status enum for the list of possible values.
     * </pre>
     *
     * <code>optional string status = 181260274;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      status_ = getDefaultInstance().getStatus();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of a connected endpoint to this service attachment.
     * Check the Status enum for the list of possible values.
     * </pre>
     *
     * <code>optional string status = 181260274;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      status_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint)
  private static final com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint();
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceAttachmentConnectedEndpoint>
      PARSER = new com.google.protobuf.AbstractParser<ServiceAttachmentConnectedEndpoint>() {
    @java.lang.Override
    public ServiceAttachmentConnectedEndpoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceAttachmentConnectedEndpoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAttachmentConnectedEndpoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

