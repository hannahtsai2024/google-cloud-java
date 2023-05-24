// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * The request to create an analysis.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreateAnalysisRequest}
 */
public final class CreateAnalysisRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.CreateAnalysisRequest)
    CreateAnalysisRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAnalysisRequest.newBuilder() to construct.
  private CreateAnalysisRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAnalysisRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAnalysisRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateAnalysisRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateAnalysisRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.class, com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource of the analysis.
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
   * Required. The parent resource of the analysis.
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

  public static final int ANALYSIS_FIELD_NUMBER = 2;
  private com.google.cloud.contactcenterinsights.v1.Analysis analysis_;
  /**
   * <pre>
   * Required. The analysis to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the analysis field is set.
   */
  @java.lang.Override
  public boolean hasAnalysis() {
    return analysis_ != null;
  }
  /**
   * <pre>
   * Required. The analysis to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The analysis.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.Analysis getAnalysis() {
    return analysis_ == null ? com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance() : analysis_;
  }
  /**
   * <pre>
   * Required. The analysis to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder getAnalysisOrBuilder() {
    return analysis_ == null ? com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance() : analysis_;
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
    if (analysis_ != null) {
      output.writeMessage(2, getAnalysis());
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
    if (analysis_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAnalysis());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest other = (com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasAnalysis() != other.hasAnalysis()) return false;
    if (hasAnalysis()) {
      if (!getAnalysis()
          .equals(other.getAnalysis())) return false;
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
    if (hasAnalysis()) {
      hash = (37 * hash) + ANALYSIS_FIELD_NUMBER;
      hash = (53 * hash) + getAnalysis().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest prototype) {
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
   * The request to create an analysis.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreateAnalysisRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.CreateAnalysisRequest)
      com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateAnalysisRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateAnalysisRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.class, com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.newBuilder()
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
      analysis_ = null;
      if (analysisBuilder_ != null) {
        analysisBuilder_.dispose();
        analysisBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateAnalysisRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest build() {
      com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest buildPartial() {
      com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest result = new com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.analysis_ = analysisBuilder_ == null
            ? analysis_
            : analysisBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest other) {
      if (other == com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAnalysis()) {
        mergeAnalysis(other.getAnalysis());
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
              input.readMessage(
                  getAnalysisFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource of the analysis.
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
     * Required. The parent resource of the analysis.
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
     * Required. The parent resource of the analysis.
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
     * Required. The parent resource of the analysis.
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
     * Required. The parent resource of the analysis.
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

    private com.google.cloud.contactcenterinsights.v1.Analysis analysis_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.Analysis, com.google.cloud.contactcenterinsights.v1.Analysis.Builder, com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder> analysisBuilder_;
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the analysis field is set.
     */
    public boolean hasAnalysis() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The analysis.
     */
    public com.google.cloud.contactcenterinsights.v1.Analysis getAnalysis() {
      if (analysisBuilder_ == null) {
        return analysis_ == null ? com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance() : analysis_;
      } else {
        return analysisBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAnalysis(com.google.cloud.contactcenterinsights.v1.Analysis value) {
      if (analysisBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        analysis_ = value;
      } else {
        analysisBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAnalysis(
        com.google.cloud.contactcenterinsights.v1.Analysis.Builder builderForValue) {
      if (analysisBuilder_ == null) {
        analysis_ = builderForValue.build();
      } else {
        analysisBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAnalysis(com.google.cloud.contactcenterinsights.v1.Analysis value) {
      if (analysisBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          analysis_ != null &&
          analysis_ != com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance()) {
          getAnalysisBuilder().mergeFrom(value);
        } else {
          analysis_ = value;
        }
      } else {
        analysisBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAnalysis() {
      bitField0_ = (bitField0_ & ~0x00000002);
      analysis_ = null;
      if (analysisBuilder_ != null) {
        analysisBuilder_.dispose();
        analysisBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.contactcenterinsights.v1.Analysis.Builder getAnalysisBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAnalysisFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder getAnalysisOrBuilder() {
      if (analysisBuilder_ != null) {
        return analysisBuilder_.getMessageOrBuilder();
      } else {
        return analysis_ == null ?
            com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance() : analysis_;
      }
    }
    /**
     * <pre>
     * Required. The analysis to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.Analysis analysis = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.Analysis, com.google.cloud.contactcenterinsights.v1.Analysis.Builder, com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder> 
        getAnalysisFieldBuilder() {
      if (analysisBuilder_ == null) {
        analysisBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Analysis, com.google.cloud.contactcenterinsights.v1.Analysis.Builder, com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder>(
                getAnalysis(),
                getParentForChildren(),
                isClean());
        analysis_ = null;
      }
      return analysisBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.CreateAnalysisRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.CreateAnalysisRequest)
  private static final com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAnalysisRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAnalysisRequest>() {
    @java.lang.Override
    public CreateAnalysisRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAnalysisRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAnalysisRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

