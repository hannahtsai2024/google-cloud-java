// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/line_item_enums.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

/**
 * <pre>
 * Wrapper message for
 * [CreativeRotationType][google.ads.admanager.v1.CreativeRotationTypeEnum.CreativeRotationType].
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.CreativeRotationTypeEnum}
 */
public final class CreativeRotationTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.CreativeRotationTypeEnum)
    CreativeRotationTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreativeRotationTypeEnum.newBuilder() to construct.
  private CreativeRotationTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreativeRotationTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreativeRotationTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_CreativeRotationTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_CreativeRotationTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.CreativeRotationTypeEnum.class, com.google.ads.admanager.v1.CreativeRotationTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The strategy to use for displaying multiple
   * [creatives][google.ads.admanager.v1.Creative] that are associated with a
   * line item.
   * </pre>
   *
   * Protobuf enum {@code google.ads.admanager.v1.CreativeRotationTypeEnum.CreativeRotationType}
   */
  public enum CreativeRotationType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified value
     * </pre>
     *
     * <code>CREATIVE_ROTATION_TYPE_UNSPECIFIED = 0;</code>
     */
    CREATIVE_ROTATION_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Creatives are displayed approximately the same number of times over the
     * duration of the line item.
     * </pre>
     *
     * <code>EVENLY = 1;</code>
     */
    EVENLY(1),
    /**
     * <pre>
     * Creatives are served approximately proportionally to their performance.
     * </pre>
     *
     * <code>OPTIMIZED = 2;</code>
     */
    OPTIMIZED(2),
    /**
     * <pre>
     * Creatives are served approximately proportionally to their weights, set
     * on the `LineItemCreativeAssociation`.
     * </pre>
     *
     * <code>WEIGHTED = 3;</code>
     */
    WEIGHTED(3),
    /**
     * <pre>
     * Creatives are served exactly in sequential order, aka Storyboarding. Set
     * on the `LineItemCreativeAssociation`.
     * </pre>
     *
     * <code>SEQUENTIAL = 4;</code>
     */
    SEQUENTIAL(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified value
     * </pre>
     *
     * <code>CREATIVE_ROTATION_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int CREATIVE_ROTATION_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Creatives are displayed approximately the same number of times over the
     * duration of the line item.
     * </pre>
     *
     * <code>EVENLY = 1;</code>
     */
    public static final int EVENLY_VALUE = 1;
    /**
     * <pre>
     * Creatives are served approximately proportionally to their performance.
     * </pre>
     *
     * <code>OPTIMIZED = 2;</code>
     */
    public static final int OPTIMIZED_VALUE = 2;
    /**
     * <pre>
     * Creatives are served approximately proportionally to their weights, set
     * on the `LineItemCreativeAssociation`.
     * </pre>
     *
     * <code>WEIGHTED = 3;</code>
     */
    public static final int WEIGHTED_VALUE = 3;
    /**
     * <pre>
     * Creatives are served exactly in sequential order, aka Storyboarding. Set
     * on the `LineItemCreativeAssociation`.
     * </pre>
     *
     * <code>SEQUENTIAL = 4;</code>
     */
    public static final int SEQUENTIAL_VALUE = 4;


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
    public static CreativeRotationType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CreativeRotationType forNumber(int value) {
      switch (value) {
        case 0: return CREATIVE_ROTATION_TYPE_UNSPECIFIED;
        case 1: return EVENLY;
        case 2: return OPTIMIZED;
        case 3: return WEIGHTED;
        case 4: return SEQUENTIAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CreativeRotationType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CreativeRotationType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CreativeRotationType>() {
            public CreativeRotationType findValueByNumber(int number) {
              return CreativeRotationType.forNumber(number);
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
      return com.google.ads.admanager.v1.CreativeRotationTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CreativeRotationType[] VALUES = values();

    public static CreativeRotationType valueOf(
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

    private CreativeRotationType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.admanager.v1.CreativeRotationTypeEnum.CreativeRotationType)
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
    if (!(obj instanceof com.google.ads.admanager.v1.CreativeRotationTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.CreativeRotationTypeEnum other = (com.google.ads.admanager.v1.CreativeRotationTypeEnum) obj;

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

  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.admanager.v1.CreativeRotationTypeEnum prototype) {
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
   * [CreativeRotationType][google.ads.admanager.v1.CreativeRotationTypeEnum.CreativeRotationType].
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.CreativeRotationTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.CreativeRotationTypeEnum)
      com.google.ads.admanager.v1.CreativeRotationTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_CreativeRotationTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_CreativeRotationTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.CreativeRotationTypeEnum.class, com.google.ads.admanager.v1.CreativeRotationTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.CreativeRotationTypeEnum.newBuilder()
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
      return com.google.ads.admanager.v1.LineItemEnumsProto.internal_static_google_ads_admanager_v1_CreativeRotationTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.CreativeRotationTypeEnum getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.CreativeRotationTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.CreativeRotationTypeEnum build() {
      com.google.ads.admanager.v1.CreativeRotationTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.CreativeRotationTypeEnum buildPartial() {
      com.google.ads.admanager.v1.CreativeRotationTypeEnum result = new com.google.ads.admanager.v1.CreativeRotationTypeEnum(this);
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
      if (other instanceof com.google.ads.admanager.v1.CreativeRotationTypeEnum) {
        return mergeFrom((com.google.ads.admanager.v1.CreativeRotationTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.CreativeRotationTypeEnum other) {
      if (other == com.google.ads.admanager.v1.CreativeRotationTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.CreativeRotationTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.CreativeRotationTypeEnum)
  private static final com.google.ads.admanager.v1.CreativeRotationTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.CreativeRotationTypeEnum();
  }

  public static com.google.ads.admanager.v1.CreativeRotationTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreativeRotationTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<CreativeRotationTypeEnum>() {
    @java.lang.Override
    public CreativeRotationTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreativeRotationTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreativeRotationTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.CreativeRotationTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

