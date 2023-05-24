// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/histogram.proto

package com.google.cloud.contentwarehouse.v1;

/**
 * <pre>
 * The histogram request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.HistogramQuery}
 */
public final class HistogramQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.HistogramQuery)
    HistogramQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistogramQuery.newBuilder() to construct.
  private HistogramQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistogramQuery() {
    histogramQuery_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistogramQuery();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.HistogramQuery.class, com.google.cloud.contentwarehouse.v1.HistogramQuery.Builder.class);
  }

  public static final int HISTOGRAM_QUERY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object histogramQuery_ = "";
  /**
   * <pre>
   * An expression specifies a histogram request against matching documents for
   * searches.
   *
   * See
   * [SearchDocumentsRequest.histogram_queries][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.histogram_queries]
   * for details about syntax.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   * @return The histogramQuery.
   */
  @java.lang.Override
  public java.lang.String getHistogramQuery() {
    java.lang.Object ref = histogramQuery_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      histogramQuery_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An expression specifies a histogram request against matching documents for
   * searches.
   *
   * See
   * [SearchDocumentsRequest.histogram_queries][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.histogram_queries]
   * for details about syntax.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   * @return The bytes for histogramQuery.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHistogramQueryBytes() {
    java.lang.Object ref = histogramQuery_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      histogramQuery_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUIRE_PRECISE_RESULT_SIZE_FIELD_NUMBER = 2;
  private boolean requirePreciseResultSize_ = false;
  /**
   * <pre>
   * Controls if the histogram query requires the return of a precise count.
   * Enable this flag may adversely impact performance.
   *
   * Defaults to true.
   * </pre>
   *
   * <code>bool require_precise_result_size = 2;</code>
   * @return The requirePreciseResultSize.
   */
  @java.lang.Override
  public boolean getRequirePreciseResultSize() {
    return requirePreciseResultSize_;
  }

  public static final int FILTERS_FIELD_NUMBER = 3;
  private com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters_;
  /**
   * <pre>
   * Optional. Filter the result of histogram query by the property names. It
   * only works with histogram query count('FilterableProperties'). It is an
   * optional. It will perform histogram on all the property names for all the
   * document schemas. Setting this field will have a better performance.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the filters field is set.
   */
  @java.lang.Override
  public boolean hasFilters() {
    return filters_ != null;
  }
  /**
   * <pre>
   * Optional. Filter the result of histogram query by the property names. It
   * only works with histogram query count('FilterableProperties'). It is an
   * optional. It will perform histogram on all the property names for all the
   * document schemas. Setting this field will have a better performance.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filters.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter getFilters() {
    return filters_ == null ? com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.getDefaultInstance() : filters_;
  }
  /**
   * <pre>
   * Optional. Filter the result of histogram query by the property names. It
   * only works with histogram query count('FilterableProperties'). It is an
   * optional. It will perform histogram on all the property names for all the
   * document schemas. Setting this field will have a better performance.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilterOrBuilder getFiltersOrBuilder() {
    return filters_ == null ? com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.getDefaultInstance() : filters_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(histogramQuery_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, histogramQuery_);
    }
    if (requirePreciseResultSize_ != false) {
      output.writeBool(2, requirePreciseResultSize_);
    }
    if (filters_ != null) {
      output.writeMessage(3, getFilters());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(histogramQuery_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, histogramQuery_);
    }
    if (requirePreciseResultSize_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, requirePreciseResultSize_);
    }
    if (filters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFilters());
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.HistogramQuery)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.HistogramQuery other = (com.google.cloud.contentwarehouse.v1.HistogramQuery) obj;

    if (!getHistogramQuery()
        .equals(other.getHistogramQuery())) return false;
    if (getRequirePreciseResultSize()
        != other.getRequirePreciseResultSize()) return false;
    if (hasFilters() != other.hasFilters()) return false;
    if (hasFilters()) {
      if (!getFilters()
          .equals(other.getFilters())) return false;
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
    hash = (37 * hash) + HISTOGRAM_QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getHistogramQuery().hashCode();
    hash = (37 * hash) + REQUIRE_PRECISE_RESULT_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequirePreciseResultSize());
    if (hasFilters()) {
      hash = (37 * hash) + FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFilters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQuery parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.HistogramQuery prototype) {
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
   * The histogram request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.HistogramQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.HistogramQuery)
      com.google.cloud.contentwarehouse.v1.HistogramQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.HistogramQuery.class, com.google.cloud.contentwarehouse.v1.HistogramQuery.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.HistogramQuery.newBuilder()
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
      histogramQuery_ = "";
      requirePreciseResultSize_ = false;
      filters_ = null;
      if (filtersBuilder_ != null) {
        filtersBuilder_.dispose();
        filtersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.HistogramQuery getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.HistogramQuery.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.HistogramQuery build() {
      com.google.cloud.contentwarehouse.v1.HistogramQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.HistogramQuery buildPartial() {
      com.google.cloud.contentwarehouse.v1.HistogramQuery result = new com.google.cloud.contentwarehouse.v1.HistogramQuery(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.HistogramQuery result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.histogramQuery_ = histogramQuery_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requirePreciseResultSize_ = requirePreciseResultSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.filters_ = filtersBuilder_ == null
            ? filters_
            : filtersBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contentwarehouse.v1.HistogramQuery) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.HistogramQuery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.HistogramQuery other) {
      if (other == com.google.cloud.contentwarehouse.v1.HistogramQuery.getDefaultInstance()) return this;
      if (!other.getHistogramQuery().isEmpty()) {
        histogramQuery_ = other.histogramQuery_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getRequirePreciseResultSize() != false) {
        setRequirePreciseResultSize(other.getRequirePreciseResultSize());
      }
      if (other.hasFilters()) {
        mergeFilters(other.getFilters());
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
              histogramQuery_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              requirePreciseResultSize_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getFiltersFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object histogramQuery_ = "";
    /**
     * <pre>
     * An expression specifies a histogram request against matching documents for
     * searches.
     *
     * See
     * [SearchDocumentsRequest.histogram_queries][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @return The histogramQuery.
     */
    public java.lang.String getHistogramQuery() {
      java.lang.Object ref = histogramQuery_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        histogramQuery_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching documents for
     * searches.
     *
     * See
     * [SearchDocumentsRequest.histogram_queries][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @return The bytes for histogramQuery.
     */
    public com.google.protobuf.ByteString
        getHistogramQueryBytes() {
      java.lang.Object ref = histogramQuery_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        histogramQuery_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching documents for
     * searches.
     *
     * See
     * [SearchDocumentsRequest.histogram_queries][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @param value The histogramQuery to set.
     * @return This builder for chaining.
     */
    public Builder setHistogramQuery(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      histogramQuery_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching documents for
     * searches.
     *
     * See
     * [SearchDocumentsRequest.histogram_queries][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHistogramQuery() {
      histogramQuery_ = getDefaultInstance().getHistogramQuery();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching documents for
     * searches.
     *
     * See
     * [SearchDocumentsRequest.histogram_queries][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @param value The bytes for histogramQuery to set.
     * @return This builder for chaining.
     */
    public Builder setHistogramQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      histogramQuery_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean requirePreciseResultSize_ ;
    /**
     * <pre>
     * Controls if the histogram query requires the return of a precise count.
     * Enable this flag may adversely impact performance.
     *
     * Defaults to true.
     * </pre>
     *
     * <code>bool require_precise_result_size = 2;</code>
     * @return The requirePreciseResultSize.
     */
    @java.lang.Override
    public boolean getRequirePreciseResultSize() {
      return requirePreciseResultSize_;
    }
    /**
     * <pre>
     * Controls if the histogram query requires the return of a precise count.
     * Enable this flag may adversely impact performance.
     *
     * Defaults to true.
     * </pre>
     *
     * <code>bool require_precise_result_size = 2;</code>
     * @param value The requirePreciseResultSize to set.
     * @return This builder for chaining.
     */
    public Builder setRequirePreciseResultSize(boolean value) {

      requirePreciseResultSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Controls if the histogram query requires the return of a precise count.
     * Enable this flag may adversely impact performance.
     *
     * Defaults to true.
     * </pre>
     *
     * <code>bool require_precise_result_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequirePreciseResultSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requirePreciseResultSize_ = false;
      onChanged();
      return this;
    }

    private com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter, com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.Builder, com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilterOrBuilder> filtersBuilder_;
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the filters field is set.
     */
    public boolean hasFilters() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The filters.
     */
    public com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter getFilters() {
      if (filtersBuilder_ == null) {
        return filters_ == null ? com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.getDefaultInstance() : filters_;
      } else {
        return filtersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setFilters(com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filters_ = value;
      } else {
        filtersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setFilters(
        com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        filters_ = builderForValue.build();
      } else {
        filtersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeFilters(com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter value) {
      if (filtersBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          filters_ != null &&
          filters_ != com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.getDefaultInstance()) {
          getFiltersBuilder().mergeFrom(value);
        } else {
          filters_ = value;
        }
      } else {
        filtersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearFilters() {
      bitField0_ = (bitField0_ & ~0x00000004);
      filters_ = null;
      if (filtersBuilder_ != null) {
        filtersBuilder_.dispose();
        filtersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.Builder getFiltersBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFiltersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilterOrBuilder getFiltersOrBuilder() {
      if (filtersBuilder_ != null) {
        return filtersBuilder_.getMessageOrBuilder();
      } else {
        return filters_ == null ?
            com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.getDefaultInstance() : filters_;
      }
    }
    /**
     * <pre>
     * Optional. Filter the result of histogram query by the property names. It
     * only works with histogram query count('FilterableProperties'). It is an
     * optional. It will perform histogram on all the property names for all the
     * document schemas. Setting this field will have a better performance.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter filters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter, com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.Builder, com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilterOrBuilder> 
        getFiltersFieldBuilder() {
      if (filtersBuilder_ == null) {
        filtersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter, com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.Builder, com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilterOrBuilder>(
                getFilters(),
                getParentForChildren(),
                isClean());
        filters_ = null;
      }
      return filtersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.HistogramQuery)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.HistogramQuery)
  private static final com.google.cloud.contentwarehouse.v1.HistogramQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.HistogramQuery();
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistogramQuery>
      PARSER = new com.google.protobuf.AbstractParser<HistogramQuery>() {
    @java.lang.Override
    public HistogramQuery parsePartialFrom(
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

  public static com.google.protobuf.Parser<HistogramQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistogramQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.HistogramQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

