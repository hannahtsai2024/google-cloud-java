// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/line_item_enums.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

/**
 * <pre>
 * Wrapper message for
 * [ReservationStatus][google.ads.admanager.v1.ReservationStatusEnum.ReservationStatus].
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.ReservationStatusEnum}
 */
public final class ReservationStatusEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.ReservationStatusEnum)
    ReservationStatusEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReservationStatusEnum.newBuilder() to construct.
  private ReservationStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReservationStatusEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReservationStatusEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_ReservationStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_ReservationStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.ReservationStatusEnum.class, com.google.ads.admanager.v1.ReservationStatusEnum.Builder.class);
  }

  /**
   * <pre>
   * Defines the different reservation statuses of a line item.
   * </pre>
   *
   * Protobuf enum {@code google.ads.admanager.v1.ReservationStatusEnum.ReservationStatus}
   */
  public enum ReservationStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value specified
     * </pre>
     *
     * <code>RESERVATION_STATUS_UNSPECIFIED = 0;</code>
     */
    RESERVATION_STATUS_UNSPECIFIED(0),
    /**
     * <pre>
     * Indicates that inventory has been reserved for the line item.
     * </pre>
     *
     * <code>RESERVED = 1;</code>
     */
    RESERVED(1),
    /**
     * <pre>
     * Indicates that inventory has not been reserved for the line item.
     * </pre>
     *
     * <code>UNRESERVED = 2;</code>
     */
    UNRESERVED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value specified
     * </pre>
     *
     * <code>RESERVATION_STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int RESERVATION_STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Indicates that inventory has been reserved for the line item.
     * </pre>
     *
     * <code>RESERVED = 1;</code>
     */
    public static final int RESERVED_VALUE = 1;
    /**
     * <pre>
     * Indicates that inventory has not been reserved for the line item.
     * </pre>
     *
     * <code>UNRESERVED = 2;</code>
     */
    public static final int UNRESERVED_VALUE = 2;


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
    public static ReservationStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReservationStatus forNumber(int value) {
      switch (value) {
        case 0: return RESERVATION_STATUS_UNSPECIFIED;
        case 1: return RESERVED;
        case 2: return UNRESERVED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReservationStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReservationStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReservationStatus>() {
            public ReservationStatus findValueByNumber(int number) {
              return ReservationStatus.forNumber(number);
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
      return com.google.ads.admanager.v1.ReservationStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReservationStatus[] VALUES = values();

    public static ReservationStatus valueOf(
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

    private ReservationStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.admanager.v1.ReservationStatusEnum.ReservationStatus)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.admanager.v1.ReservationStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.ReservationStatusEnum other = (com.google.ads.admanager.v1.ReservationStatusEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.ReservationStatusEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.ReservationStatusEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.ReservationStatusEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.admanager.v1.ReservationStatusEnum prototype) {
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
   * Wrapper message for
   * [ReservationStatus][google.ads.admanager.v1.ReservationStatusEnum.ReservationStatus].
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.ReservationStatusEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.ReservationStatusEnum)
      com.google.ads.admanager.v1.ReservationStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_ReservationStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_ReservationStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.ReservationStatusEnum.class, com.google.ads.admanager.v1.ReservationStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.ReservationStatusEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_ReservationStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.ReservationStatusEnum getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.ReservationStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.ReservationStatusEnum build() {
      com.google.ads.admanager.v1.ReservationStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.ReservationStatusEnum buildPartial() {
      com.google.ads.admanager.v1.ReservationStatusEnum result = new com.google.ads.admanager.v1.ReservationStatusEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.admanager.v1.ReservationStatusEnum) {
        return mergeFrom((com.google.ads.admanager.v1.ReservationStatusEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.ReservationStatusEnum other) {
      if (other == com.google.ads.admanager.v1.ReservationStatusEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.ReservationStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.ReservationStatusEnum)
  private static final com.google.ads.admanager.v1.ReservationStatusEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.ReservationStatusEnum();
  }

  public static com.google.ads.admanager.v1.ReservationStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationStatusEnum>
      PARSER = new com.google.protobuf.AbstractParser<ReservationStatusEnum>() {
    @java.lang.Override
    public ReservationStatusEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReservationStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.ReservationStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

