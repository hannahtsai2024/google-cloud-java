// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/custom_field_enums.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

/**
 * <pre>
 * Wrapper message for
 * [CustomFieldEntityType][google.ads.admanager.v1.CustomFieldEntityTypeEnum.CustomFieldEntityType]
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.CustomFieldEntityTypeEnum}
 */
public final class CustomFieldEntityTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.CustomFieldEntityTypeEnum)
    CustomFieldEntityTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomFieldEntityTypeEnum.newBuilder() to construct.
  private CustomFieldEntityTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomFieldEntityTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomFieldEntityTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.admanager.v1.CustomFieldEnumsProto.internal_static_google_ads_admanager_v1_CustomFieldEntityTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.CustomFieldEnumsProto.internal_static_google_ads_admanager_v1_CustomFieldEntityTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.class, com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The types of entities that a CustomField can be applied to.
   * </pre>
   *
   * Protobuf enum {@code google.ads.admanager.v1.CustomFieldEntityTypeEnum.CustomFieldEntityType}
   */
  public enum CustomFieldEntityType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value specified
     * </pre>
     *
     * <code>CUSTOM_FIELD_ENTITY_TYPE_UNSPECIFIED = 0;</code>
     */
    CUSTOM_FIELD_ENTITY_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * The CustomField is applied to LineItems.
     * </pre>
     *
     * <code>LINE_ITEM = 1;</code>
     */
    LINE_ITEM(1),
    /**
     * <pre>
     * The CustomField is applied to Orders.
     * </pre>
     *
     * <code>ORDER = 2;</code>
     */
    ORDER(2),
    /**
     * <pre>
     * The CustomField is applied to Creatives.
     * </pre>
     *
     * <code>CREATIVE = 3;</code>
     */
    CREATIVE(3),
    /**
     * <pre>
     * The CustomField is applied to Proposals.
     * </pre>
     *
     * <code>PROPOSAL = 4;</code>
     */
    PROPOSAL(4),
    /**
     * <pre>
     * The CustomField is applied to ProposalLineItems.
     * </pre>
     *
     * <code>PROPOSAL_LINE_ITEM = 5;</code>
     */
    PROPOSAL_LINE_ITEM(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value specified
     * </pre>
     *
     * <code>CUSTOM_FIELD_ENTITY_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int CUSTOM_FIELD_ENTITY_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The CustomField is applied to LineItems.
     * </pre>
     *
     * <code>LINE_ITEM = 1;</code>
     */
    public static final int LINE_ITEM_VALUE = 1;
    /**
     * <pre>
     * The CustomField is applied to Orders.
     * </pre>
     *
     * <code>ORDER = 2;</code>
     */
    public static final int ORDER_VALUE = 2;
    /**
     * <pre>
     * The CustomField is applied to Creatives.
     * </pre>
     *
     * <code>CREATIVE = 3;</code>
     */
    public static final int CREATIVE_VALUE = 3;
    /**
     * <pre>
     * The CustomField is applied to Proposals.
     * </pre>
     *
     * <code>PROPOSAL = 4;</code>
     */
    public static final int PROPOSAL_VALUE = 4;
    /**
     * <pre>
     * The CustomField is applied to ProposalLineItems.
     * </pre>
     *
     * <code>PROPOSAL_LINE_ITEM = 5;</code>
     */
    public static final int PROPOSAL_LINE_ITEM_VALUE = 5;


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
    public static CustomFieldEntityType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CustomFieldEntityType forNumber(int value) {
      switch (value) {
        case 0: return CUSTOM_FIELD_ENTITY_TYPE_UNSPECIFIED;
        case 1: return LINE_ITEM;
        case 2: return ORDER;
        case 3: return CREATIVE;
        case 4: return PROPOSAL;
        case 5: return PROPOSAL_LINE_ITEM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CustomFieldEntityType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CustomFieldEntityType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CustomFieldEntityType>() {
            public CustomFieldEntityType findValueByNumber(int number) {
              return CustomFieldEntityType.forNumber(number);
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
      return com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CustomFieldEntityType[] VALUES = values();

    public static CustomFieldEntityType valueOf(
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

    private CustomFieldEntityType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.admanager.v1.CustomFieldEntityTypeEnum.CustomFieldEntityType)
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
    if (!(obj instanceof com.google.ads.admanager.v1.CustomFieldEntityTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.CustomFieldEntityTypeEnum other = (com.google.ads.admanager.v1.CustomFieldEntityTypeEnum) obj;

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

  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.admanager.v1.CustomFieldEntityTypeEnum prototype) {
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
   * [CustomFieldEntityType][google.ads.admanager.v1.CustomFieldEntityTypeEnum.CustomFieldEntityType]
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.CustomFieldEntityTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.CustomFieldEntityTypeEnum)
      com.google.ads.admanager.v1.CustomFieldEntityTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.admanager.v1.CustomFieldEnumsProto.internal_static_google_ads_admanager_v1_CustomFieldEntityTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.CustomFieldEnumsProto.internal_static_google_ads_admanager_v1_CustomFieldEntityTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.class, com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.newBuilder()
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
      return com.google.ads.admanager.v1.CustomFieldEnumsProto.internal_static_google_ads_admanager_v1_CustomFieldEntityTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.CustomFieldEntityTypeEnum getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.CustomFieldEntityTypeEnum build() {
      com.google.ads.admanager.v1.CustomFieldEntityTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.CustomFieldEntityTypeEnum buildPartial() {
      com.google.ads.admanager.v1.CustomFieldEntityTypeEnum result = new com.google.ads.admanager.v1.CustomFieldEntityTypeEnum(this);
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
      if (other instanceof com.google.ads.admanager.v1.CustomFieldEntityTypeEnum) {
        return mergeFrom((com.google.ads.admanager.v1.CustomFieldEntityTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.CustomFieldEntityTypeEnum other) {
      if (other == com.google.ads.admanager.v1.CustomFieldEntityTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.CustomFieldEntityTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.CustomFieldEntityTypeEnum)
  private static final com.google.ads.admanager.v1.CustomFieldEntityTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.CustomFieldEntityTypeEnum();
  }

  public static com.google.ads.admanager.v1.CustomFieldEntityTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomFieldEntityTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<CustomFieldEntityTypeEnum>() {
    @java.lang.Override
    public CustomFieldEntityTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomFieldEntityTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomFieldEntityTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.CustomFieldEntityTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

