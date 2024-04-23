// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/ad_partner_declaration.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

/**
 * <pre>
 * Represents a set of declarations about what (if any) ad partners
 * are associated with a given creative. This can be set at the network level,
 * as a default for all creatives, or overridden for a particular creative.
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.AdPartnerDeclaration}
 */
public final class AdPartnerDeclaration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.AdPartnerDeclaration)
    AdPartnerDeclarationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdPartnerDeclaration.newBuilder() to construct.
  private AdPartnerDeclaration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdPartnerDeclaration() {
    type_ = 0;
    adPartners_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdPartnerDeclaration();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.admanager.v1.AdPartnerDeclarationProto.internal_static_google_ads_admanager_v1_AdPartnerDeclaration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.AdPartnerDeclarationProto.internal_static_google_ads_admanager_v1_AdPartnerDeclaration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.AdPartnerDeclaration.class, com.google.ads.admanager.v1.AdPartnerDeclaration.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * They type of declaration.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * They type of declaration.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType getType() {
    com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType result = com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType.forNumber(type_);
    return result == null ? com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType.UNRECOGNIZED : result;
  }

  public static final int AD_PARTNERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList adPartners_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The resource names of AdPartners being declared.
   * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
   * </pre>
   *
   * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the adPartners.
   */
  public com.google.protobuf.ProtocolStringList
      getAdPartnersList() {
    return adPartners_;
  }
  /**
   * <pre>
   * The resource names of AdPartners being declared.
   * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
   * </pre>
   *
   * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of adPartners.
   */
  public int getAdPartnersCount() {
    return adPartners_.size();
  }
  /**
   * <pre>
   * The resource names of AdPartners being declared.
   * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
   * </pre>
   *
   * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The adPartners at the given index.
   */
  public java.lang.String getAdPartners(int index) {
    return adPartners_.get(index);
  }
  /**
   * <pre>
   * The resource names of AdPartners being declared.
   * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
   * </pre>
   *
   * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the adPartners at the given index.
   */
  public com.google.protobuf.ByteString
      getAdPartnersBytes(int index) {
    return adPartners_.getByteString(index);
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
    if (type_ != com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType.DECLARATION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    for (int i = 0; i < adPartners_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, adPartners_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType.DECLARATION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < adPartners_.size(); i++) {
        dataSize += computeStringSizeNoTag(adPartners_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAdPartnersList().size();
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
    if (!(obj instanceof com.google.ads.admanager.v1.AdPartnerDeclaration)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.AdPartnerDeclaration other = (com.google.ads.admanager.v1.AdPartnerDeclaration) obj;

    if (type_ != other.type_) return false;
    if (!getAdPartnersList()
        .equals(other.getAdPartnersList())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (getAdPartnersCount() > 0) {
      hash = (37 * hash) + AD_PARTNERS_FIELD_NUMBER;
      hash = (53 * hash) + getAdPartnersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.AdPartnerDeclaration parseFrom(
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
  public static Builder newBuilder(com.google.ads.admanager.v1.AdPartnerDeclaration prototype) {
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
   * Represents a set of declarations about what (if any) ad partners
   * are associated with a given creative. This can be set at the network level,
   * as a default for all creatives, or overridden for a particular creative.
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.AdPartnerDeclaration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.AdPartnerDeclaration)
      com.google.ads.admanager.v1.AdPartnerDeclarationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.admanager.v1.AdPartnerDeclarationProto.internal_static_google_ads_admanager_v1_AdPartnerDeclaration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.AdPartnerDeclarationProto.internal_static_google_ads_admanager_v1_AdPartnerDeclaration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.AdPartnerDeclaration.class, com.google.ads.admanager.v1.AdPartnerDeclaration.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.AdPartnerDeclaration.newBuilder()
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
      type_ = 0;
      adPartners_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.admanager.v1.AdPartnerDeclarationProto.internal_static_google_ads_admanager_v1_AdPartnerDeclaration_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.AdPartnerDeclaration getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.AdPartnerDeclaration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.AdPartnerDeclaration build() {
      com.google.ads.admanager.v1.AdPartnerDeclaration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.AdPartnerDeclaration buildPartial() {
      com.google.ads.admanager.v1.AdPartnerDeclaration result = new com.google.ads.admanager.v1.AdPartnerDeclaration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.admanager.v1.AdPartnerDeclaration result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        adPartners_.makeImmutable();
        result.adPartners_ = adPartners_;
      }
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
      if (other instanceof com.google.ads.admanager.v1.AdPartnerDeclaration) {
        return mergeFrom((com.google.ads.admanager.v1.AdPartnerDeclaration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.AdPartnerDeclaration other) {
      if (other == com.google.ads.admanager.v1.AdPartnerDeclaration.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.adPartners_.isEmpty()) {
        if (adPartners_.isEmpty()) {
          adPartners_ = other.adPartners_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAdPartnersIsMutable();
          adPartners_.addAll(other.adPartners_);
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
            case 8: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAdPartnersIsMutable();
              adPartners_.add(s);
              break;
            } // case 18
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

    private int type_ = 0;
    /**
     * <pre>
     * They type of declaration.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * They type of declaration.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * They type of declaration.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType getType() {
      com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType result = com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType.forNumber(type_);
      return result == null ? com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * They type of declaration.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * They type of declaration.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.DeclarationTypeEnum.DeclarationType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList adPartners_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAdPartnersIsMutable() {
      if (!adPartners_.isModifiable()) {
        adPartners_ = new com.google.protobuf.LazyStringArrayList(adPartners_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return A list containing the adPartners.
     */
    public com.google.protobuf.ProtocolStringList
        getAdPartnersList() {
      adPartners_.makeImmutable();
      return adPartners_;
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The count of adPartners.
     */
    public int getAdPartnersCount() {
      return adPartners_.size();
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param index The index of the element to return.
     * @return The adPartners at the given index.
     */
    public java.lang.String getAdPartners(int index) {
      return adPartners_.get(index);
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param index The index of the value to return.
     * @return The bytes of the adPartners at the given index.
     */
    public com.google.protobuf.ByteString
        getAdPartnersBytes(int index) {
      return adPartners_.getByteString(index);
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The adPartners to set.
     * @return This builder for chaining.
     */
    public Builder setAdPartners(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdPartnersIsMutable();
      adPartners_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The adPartners to add.
     * @return This builder for chaining.
     */
    public Builder addAdPartners(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdPartnersIsMutable();
      adPartners_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param values The adPartners to add.
     * @return This builder for chaining.
     */
    public Builder addAllAdPartners(
        java.lang.Iterable<java.lang.String> values) {
      ensureAdPartnersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, adPartners_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAdPartners() {
      adPartners_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource names of AdPartners being declared.
     * Format: "networks/{network_code}/adPartners/{ad_partner_id}"
     * </pre>
     *
     * <code>repeated string ad_partners = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes of the adPartners to add.
     * @return This builder for chaining.
     */
    public Builder addAdPartnersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAdPartnersIsMutable();
      adPartners_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.AdPartnerDeclaration)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.AdPartnerDeclaration)
  private static final com.google.ads.admanager.v1.AdPartnerDeclaration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.AdPartnerDeclaration();
  }

  public static com.google.ads.admanager.v1.AdPartnerDeclaration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdPartnerDeclaration>
      PARSER = new com.google.protobuf.AbstractParser<AdPartnerDeclaration>() {
    @java.lang.Override
    public AdPartnerDeclaration parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdPartnerDeclaration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdPartnerDeclaration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.AdPartnerDeclaration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

