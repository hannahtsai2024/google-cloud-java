// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse}
 */
public final class SecurityPoliciesListPreconfiguredExpressionSetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse)
    SecurityPoliciesListPreconfiguredExpressionSetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityPoliciesListPreconfiguredExpressionSetsResponse.newBuilder() to construct.
  private SecurityPoliciesListPreconfiguredExpressionSetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityPoliciesListPreconfiguredExpressionSetsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityPoliciesListPreconfiguredExpressionSetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SecurityPoliciesListPreconfiguredExpressionSetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SecurityPoliciesListPreconfiguredExpressionSetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse.class, com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PRECONFIGURED_EXPRESSION_SETS_FIELD_NUMBER = 536200826;
  private com.google.cloud.compute.v1.SecurityPoliciesWafConfig preconfiguredExpressionSets_;
  /**
   * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
   * @return Whether the preconfiguredExpressionSets field is set.
   */
  @java.lang.Override
  public boolean hasPreconfiguredExpressionSets() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
   * @return The preconfiguredExpressionSets.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPoliciesWafConfig getPreconfiguredExpressionSets() {
    return preconfiguredExpressionSets_ == null ? com.google.cloud.compute.v1.SecurityPoliciesWafConfig.getDefaultInstance() : preconfiguredExpressionSets_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPoliciesWafConfigOrBuilder getPreconfiguredExpressionSetsOrBuilder() {
    return preconfiguredExpressionSets_ == null ? com.google.cloud.compute.v1.SecurityPoliciesWafConfig.getDefaultInstance() : preconfiguredExpressionSets_;
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
      output.writeMessage(536200826, getPreconfiguredExpressionSets());
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
        .computeMessageSize(536200826, getPreconfiguredExpressionSets());
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
    if (!(obj instanceof com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse other = (com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse) obj;

    if (hasPreconfiguredExpressionSets() != other.hasPreconfiguredExpressionSets()) return false;
    if (hasPreconfiguredExpressionSets()) {
      if (!getPreconfiguredExpressionSets()
          .equals(other.getPreconfiguredExpressionSets())) return false;
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
    if (hasPreconfiguredExpressionSets()) {
      hash = (37 * hash) + PRECONFIGURED_EXPRESSION_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getPreconfiguredExpressionSets().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse)
      com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SecurityPoliciesListPreconfiguredExpressionSetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SecurityPoliciesListPreconfiguredExpressionSetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse.class, com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPreconfiguredExpressionSetsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      preconfiguredExpressionSets_ = null;
      if (preconfiguredExpressionSetsBuilder_ != null) {
        preconfiguredExpressionSetsBuilder_.dispose();
        preconfiguredExpressionSetsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SecurityPoliciesListPreconfiguredExpressionSetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse build() {
      com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse buildPartial() {
      com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse result = new com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.preconfiguredExpressionSets_ = preconfiguredExpressionSetsBuilder_ == null
            ? preconfiguredExpressionSets_
            : preconfiguredExpressionSetsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse) {
        return mergeFrom((com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse other) {
      if (other == com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse.getDefaultInstance()) return this;
      if (other.hasPreconfiguredExpressionSets()) {
        mergePreconfiguredExpressionSets(other.getPreconfiguredExpressionSets());
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
            case -5360686: {
              input.readMessage(
                  getPreconfiguredExpressionSetsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case -5360686
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

    private com.google.cloud.compute.v1.SecurityPoliciesWafConfig preconfiguredExpressionSets_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.SecurityPoliciesWafConfig, com.google.cloud.compute.v1.SecurityPoliciesWafConfig.Builder, com.google.cloud.compute.v1.SecurityPoliciesWafConfigOrBuilder> preconfiguredExpressionSetsBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     * @return Whether the preconfiguredExpressionSets field is set.
     */
    public boolean hasPreconfiguredExpressionSets() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     * @return The preconfiguredExpressionSets.
     */
    public com.google.cloud.compute.v1.SecurityPoliciesWafConfig getPreconfiguredExpressionSets() {
      if (preconfiguredExpressionSetsBuilder_ == null) {
        return preconfiguredExpressionSets_ == null ? com.google.cloud.compute.v1.SecurityPoliciesWafConfig.getDefaultInstance() : preconfiguredExpressionSets_;
      } else {
        return preconfiguredExpressionSetsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     */
    public Builder setPreconfiguredExpressionSets(com.google.cloud.compute.v1.SecurityPoliciesWafConfig value) {
      if (preconfiguredExpressionSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        preconfiguredExpressionSets_ = value;
      } else {
        preconfiguredExpressionSetsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     */
    public Builder setPreconfiguredExpressionSets(
        com.google.cloud.compute.v1.SecurityPoliciesWafConfig.Builder builderForValue) {
      if (preconfiguredExpressionSetsBuilder_ == null) {
        preconfiguredExpressionSets_ = builderForValue.build();
      } else {
        preconfiguredExpressionSetsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     */
    public Builder mergePreconfiguredExpressionSets(com.google.cloud.compute.v1.SecurityPoliciesWafConfig value) {
      if (preconfiguredExpressionSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          preconfiguredExpressionSets_ != null &&
          preconfiguredExpressionSets_ != com.google.cloud.compute.v1.SecurityPoliciesWafConfig.getDefaultInstance()) {
          getPreconfiguredExpressionSetsBuilder().mergeFrom(value);
        } else {
          preconfiguredExpressionSets_ = value;
        }
      } else {
        preconfiguredExpressionSetsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     */
    public Builder clearPreconfiguredExpressionSets() {
      bitField0_ = (bitField0_ & ~0x00000001);
      preconfiguredExpressionSets_ = null;
      if (preconfiguredExpressionSetsBuilder_ != null) {
        preconfiguredExpressionSetsBuilder_.dispose();
        preconfiguredExpressionSetsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     */
    public com.google.cloud.compute.v1.SecurityPoliciesWafConfig.Builder getPreconfiguredExpressionSetsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPreconfiguredExpressionSetsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     */
    public com.google.cloud.compute.v1.SecurityPoliciesWafConfigOrBuilder getPreconfiguredExpressionSetsOrBuilder() {
      if (preconfiguredExpressionSetsBuilder_ != null) {
        return preconfiguredExpressionSetsBuilder_.getMessageOrBuilder();
      } else {
        return preconfiguredExpressionSets_ == null ?
            com.google.cloud.compute.v1.SecurityPoliciesWafConfig.getDefaultInstance() : preconfiguredExpressionSets_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.SecurityPoliciesWafConfig preconfigured_expression_sets = 536200826;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.SecurityPoliciesWafConfig, com.google.cloud.compute.v1.SecurityPoliciesWafConfig.Builder, com.google.cloud.compute.v1.SecurityPoliciesWafConfigOrBuilder> 
        getPreconfiguredExpressionSetsFieldBuilder() {
      if (preconfiguredExpressionSetsBuilder_ == null) {
        preconfiguredExpressionSetsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.SecurityPoliciesWafConfig, com.google.cloud.compute.v1.SecurityPoliciesWafConfig.Builder, com.google.cloud.compute.v1.SecurityPoliciesWafConfigOrBuilder>(
                getPreconfiguredExpressionSets(),
                getParentForChildren(),
                isClean());
        preconfiguredExpressionSets_ = null;
      }
      return preconfiguredExpressionSetsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse)
  private static final com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse();
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityPoliciesListPreconfiguredExpressionSetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SecurityPoliciesListPreconfiguredExpressionSetsResponse>() {
    @java.lang.Override
    public SecurityPoliciesListPreconfiguredExpressionSetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityPoliciesListPreconfiguredExpressionSetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityPoliciesListPreconfiguredExpressionSetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPoliciesListPreconfiguredExpressionSetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

