// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Request message for
 * [ExportTaxonomies][google.cloud.datacatalog.v1.PolicyTagManagerSerialization.ExportTaxonomies].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.ExportTaxonomiesRequest}
 */
public final class ExportTaxonomiesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.ExportTaxonomiesRequest)
    ExportTaxonomiesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportTaxonomiesRequest.newBuilder() to construct.
  private ExportTaxonomiesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportTaxonomiesRequest() {
    parent_ = "";
    taxonomies_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportTaxonomiesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto.internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto.internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest.class, com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest.Builder.class);
  }

  private int destinationCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object destination_;
  public enum DestinationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SERIALIZED_TAXONOMIES(3),
    DESTINATION_NOT_SET(0);
    private final int value;
    private DestinationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationCase valueOf(int value) {
      return forNumber(value);
    }

    public static DestinationCase forNumber(int value) {
      switch (value) {
        case 3: return SERIALIZED_TAXONOMIES;
        case 0: return DESTINATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DestinationCase
  getDestinationCase() {
    return DestinationCase.forNumber(
        destinationCase_);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Resource name of the project that the exported taxonomies belong
   * to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Resource name of the project that the exported taxonomies belong
   * to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAXONOMIES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList taxonomies_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Required. Resource names of the taxonomies to export.
   * </pre>
   *
   * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return A list containing the taxonomies.
   */
  public com.google.protobuf.ProtocolStringList
      getTaxonomiesList() {
    return taxonomies_;
  }
  /**
   * <pre>
   * Required. Resource names of the taxonomies to export.
   * </pre>
   *
   * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The count of taxonomies.
   */
  public int getTaxonomiesCount() {
    return taxonomies_.size();
  }
  /**
   * <pre>
   * Required. Resource names of the taxonomies to export.
   * </pre>
   *
   * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The taxonomies at the given index.
   */
  public java.lang.String getTaxonomies(int index) {
    return taxonomies_.get(index);
  }
  /**
   * <pre>
   * Required. Resource names of the taxonomies to export.
   * </pre>
   *
   * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the taxonomies at the given index.
   */
  public com.google.protobuf.ByteString
      getTaxonomiesBytes(int index) {
    return taxonomies_.getByteString(index);
  }

  public static final int SERIALIZED_TAXONOMIES_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Serialized export taxonomies that contain all the policy
   * tags as nested protocol buffers.
   * </pre>
   *
   * <code>bool serialized_taxonomies = 3;</code>
   * @return Whether the serializedTaxonomies field is set.
   */
  @java.lang.Override
  public boolean hasSerializedTaxonomies() {
    return destinationCase_ == 3;
  }
  /**
   * <pre>
   * Serialized export taxonomies that contain all the policy
   * tags as nested protocol buffers.
   * </pre>
   *
   * <code>bool serialized_taxonomies = 3;</code>
   * @return The serializedTaxonomies.
   */
  @java.lang.Override
  public boolean getSerializedTaxonomies() {
    if (destinationCase_ == 3) {
      return (java.lang.Boolean) destination_;
    }
    return false;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < taxonomies_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, taxonomies_.getRaw(i));
    }
    if (destinationCase_ == 3) {
      output.writeBool(
          3, (boolean)((java.lang.Boolean) destination_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < taxonomies_.size(); i++) {
        dataSize += computeStringSizeNoTag(taxonomies_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTaxonomiesList().size();
    }
    if (destinationCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            3, (boolean)((java.lang.Boolean) destination_));
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest other = (com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getTaxonomiesList()
        .equals(other.getTaxonomiesList())) return false;
    if (!getDestinationCase().equals(other.getDestinationCase())) return false;
    switch (destinationCase_) {
      case 3:
        if (getSerializedTaxonomies()
            != other.getSerializedTaxonomies()) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getTaxonomiesCount() > 0) {
      hash = (37 * hash) + TAXONOMIES_FIELD_NUMBER;
      hash = (53 * hash) + getTaxonomiesList().hashCode();
    }
    switch (destinationCase_) {
      case 3:
        hash = (37 * hash) + SERIALIZED_TAXONOMIES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSerializedTaxonomies());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest prototype) {
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
   * Request message for
   * [ExportTaxonomies][google.cloud.datacatalog.v1.PolicyTagManagerSerialization.ExportTaxonomies].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.ExportTaxonomiesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.ExportTaxonomiesRequest)
      com.google.cloud.datacatalog.v1.ExportTaxonomiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto.internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto.internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest.class, com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest.newBuilder()
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
      parent_ = "";
      taxonomies_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      destinationCase_ = 0;
      destination_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto.internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest build() {
      com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest buildPartial() {
      com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest result = new com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        taxonomies_.makeImmutable();
        result.taxonomies_ = taxonomies_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest result) {
      result.destinationCase_ = destinationCase_;
      result.destination_ = this.destination_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest other) {
      if (other == com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.taxonomies_.isEmpty()) {
        if (taxonomies_.isEmpty()) {
          taxonomies_ = other.taxonomies_;
          bitField0_ |= 0x00000002;
        } else {
          ensureTaxonomiesIsMutable();
          taxonomies_.addAll(other.taxonomies_);
        }
        onChanged();
      }
      switch (other.getDestinationCase()) {
        case SERIALIZED_TAXONOMIES: {
          setSerializedTaxonomies(other.getSerializedTaxonomies());
          break;
        }
        case DESTINATION_NOT_SET: {
          break;
        }
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureTaxonomiesIsMutable();
              taxonomies_.add(s);
              break;
            } // case 18
            case 24: {
              destination_ = input.readBool();
              destinationCase_ = 3;
              break;
            } // case 24
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
    private int destinationCase_ = 0;
    private java.lang.Object destination_;
    public DestinationCase
        getDestinationCase() {
      return DestinationCase.forNumber(
          destinationCase_);
    }

    public Builder clearDestination() {
      destinationCase_ = 0;
      destination_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Resource name of the project that the exported taxonomies belong
     * to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the project that the exported taxonomies belong
     * to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the project that the exported taxonomies belong
     * to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the project that the exported taxonomies belong
     * to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the project that the exported taxonomies belong
     * to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList taxonomies_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTaxonomiesIsMutable() {
      if (!taxonomies_.isModifiable()) {
        taxonomies_ = new com.google.protobuf.LazyStringArrayList(taxonomies_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return A list containing the taxonomies.
     */
    public com.google.protobuf.ProtocolStringList
        getTaxonomiesList() {
      taxonomies_.makeImmutable();
      return taxonomies_;
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The count of taxonomies.
     */
    public int getTaxonomiesCount() {
      return taxonomies_.size();
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param index The index of the element to return.
     * @return The taxonomies at the given index.
     */
    public java.lang.String getTaxonomies(int index) {
      return taxonomies_.get(index);
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param index The index of the value to return.
     * @return The bytes of the taxonomies at the given index.
     */
    public com.google.protobuf.ByteString
        getTaxonomiesBytes(int index) {
      return taxonomies_.getByteString(index);
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The taxonomies to set.
     * @return This builder for chaining.
     */
    public Builder setTaxonomies(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTaxonomiesIsMutable();
      taxonomies_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The taxonomies to add.
     * @return This builder for chaining.
     */
    public Builder addTaxonomies(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTaxonomiesIsMutable();
      taxonomies_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param values The taxonomies to add.
     * @return This builder for chaining.
     */
    public Builder addAllTaxonomies(
        java.lang.Iterable<java.lang.String> values) {
      ensureTaxonomiesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, taxonomies_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTaxonomies() {
      taxonomies_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource names of the taxonomies to export.
     * </pre>
     *
     * <code>repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes of the taxonomies to add.
     * @return This builder for chaining.
     */
    public Builder addTaxonomiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTaxonomiesIsMutable();
      taxonomies_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Serialized export taxonomies that contain all the policy
     * tags as nested protocol buffers.
     * </pre>
     *
     * <code>bool serialized_taxonomies = 3;</code>
     * @return Whether the serializedTaxonomies field is set.
     */
    public boolean hasSerializedTaxonomies() {
      return destinationCase_ == 3;
    }
    /**
     * <pre>
     * Serialized export taxonomies that contain all the policy
     * tags as nested protocol buffers.
     * </pre>
     *
     * <code>bool serialized_taxonomies = 3;</code>
     * @return The serializedTaxonomies.
     */
    public boolean getSerializedTaxonomies() {
      if (destinationCase_ == 3) {
        return (java.lang.Boolean) destination_;
      }
      return false;
    }
    /**
     * <pre>
     * Serialized export taxonomies that contain all the policy
     * tags as nested protocol buffers.
     * </pre>
     *
     * <code>bool serialized_taxonomies = 3;</code>
     * @param value The serializedTaxonomies to set.
     * @return This builder for chaining.
     */
    public Builder setSerializedTaxonomies(boolean value) {

      destinationCase_ = 3;
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Serialized export taxonomies that contain all the policy
     * tags as nested protocol buffers.
     * </pre>
     *
     * <code>bool serialized_taxonomies = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSerializedTaxonomies() {
      if (destinationCase_ == 3) {
        destinationCase_ = 0;
        destination_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.ExportTaxonomiesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.ExportTaxonomiesRequest)
  private static final com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest();
  }

  public static com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportTaxonomiesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportTaxonomiesRequest>() {
    @java.lang.Override
    public ExportTaxonomiesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportTaxonomiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportTaxonomiesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ExportTaxonomiesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

