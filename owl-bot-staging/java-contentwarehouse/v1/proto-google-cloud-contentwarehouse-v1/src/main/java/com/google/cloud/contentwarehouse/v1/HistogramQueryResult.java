// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/histogram.proto

package com.google.cloud.contentwarehouse.v1;

/**
 * <pre>
 * Histogram result that matches
 * [HistogramQuery][google.cloud.contentwarehouse.v1.HistogramQuery] specified
 * in searches.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.HistogramQueryResult}
 */
public final class HistogramQueryResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.HistogramQueryResult)
    HistogramQueryResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistogramQueryResult.newBuilder() to construct.
  private HistogramQueryResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistogramQueryResult() {
    histogramQuery_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistogramQueryResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetHistogram();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.HistogramQueryResult.class, com.google.cloud.contentwarehouse.v1.HistogramQueryResult.Builder.class);
  }

  public static final int HISTOGRAM_QUERY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object histogramQuery_ = "";
  /**
   * <pre>
   * Requested histogram expression.
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
   * Requested histogram expression.
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

  public static final int HISTOGRAM_FIELD_NUMBER = 2;
  private static final class HistogramDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_HistogramEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> histogram_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetHistogram() {
    if (histogram_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          HistogramDefaultEntryHolder.defaultEntry);
    }
    return histogram_;
  }
  public int getHistogramCount() {
    return internalGetHistogram().getMap().size();
  }
  /**
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   *
   * The key format is:
   *
   * * (for string histogram) string values stored in the field.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public boolean containsHistogram(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetHistogram().getMap().containsKey(key);
  }
  /**
   * Use {@link #getHistogramMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getHistogram() {
    return getHistogramMap();
  }
  /**
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   *
   * The key format is:
   *
   * * (for string histogram) string values stored in the field.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getHistogramMap() {
    return internalGetHistogram().getMap();
  }
  /**
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   *
   * The key format is:
   *
   * * (for string histogram) string values stored in the field.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public long getHistogramOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetHistogram().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   *
   * The key format is:
   *
   * * (for string histogram) string values stored in the field.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public long getHistogramOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetHistogram().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetHistogram(),
        HistogramDefaultEntryHolder.defaultEntry,
        2);
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
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetHistogram().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      histogram__ = HistogramDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, histogram__);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.HistogramQueryResult)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.HistogramQueryResult other = (com.google.cloud.contentwarehouse.v1.HistogramQueryResult) obj;

    if (!getHistogramQuery()
        .equals(other.getHistogramQuery())) return false;
    if (!internalGetHistogram().equals(
        other.internalGetHistogram())) return false;
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
    if (!internalGetHistogram().getMap().isEmpty()) {
      hash = (37 * hash) + HISTOGRAM_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHistogram().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.HistogramQueryResult prototype) {
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
   * Histogram result that matches
   * [HistogramQuery][google.cloud.contentwarehouse.v1.HistogramQuery] specified
   * in searches.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.HistogramQueryResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.HistogramQueryResult)
      com.google.cloud.contentwarehouse.v1.HistogramQueryResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetHistogram();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableHistogram();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.HistogramQueryResult.class, com.google.cloud.contentwarehouse.v1.HistogramQueryResult.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.HistogramQueryResult.newBuilder()
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
      internalGetMutableHistogram().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.HistogramProto.internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.HistogramQueryResult getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.HistogramQueryResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.HistogramQueryResult build() {
      com.google.cloud.contentwarehouse.v1.HistogramQueryResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.HistogramQueryResult buildPartial() {
      com.google.cloud.contentwarehouse.v1.HistogramQueryResult result = new com.google.cloud.contentwarehouse.v1.HistogramQueryResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.HistogramQueryResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.histogramQuery_ = histogramQuery_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.histogram_ = internalGetHistogram();
        result.histogram_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contentwarehouse.v1.HistogramQueryResult) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.HistogramQueryResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.HistogramQueryResult other) {
      if (other == com.google.cloud.contentwarehouse.v1.HistogramQueryResult.getDefaultInstance()) return this;
      if (!other.getHistogramQuery().isEmpty()) {
        histogramQuery_ = other.histogramQuery_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableHistogram().mergeFrom(
          other.internalGetHistogram());
      bitField0_ |= 0x00000002;
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
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              histogram__ = input.readMessage(
                  HistogramDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableHistogram().getMutableMap().put(
                  histogram__.getKey(), histogram__.getValue());
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

    private java.lang.Object histogramQuery_ = "";
    /**
     * <pre>
     * Requested histogram expression.
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
     * Requested histogram expression.
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
     * Requested histogram expression.
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
     * Requested histogram expression.
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
     * Requested histogram expression.
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> histogram_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetHistogram() {
      if (histogram_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HistogramDefaultEntryHolder.defaultEntry);
      }
      return histogram_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableHistogram() {
      if (histogram_ == null) {
        histogram_ = com.google.protobuf.MapField.newMapField(
            HistogramDefaultEntryHolder.defaultEntry);
      }
      if (!histogram_.isMutable()) {
        histogram_ = histogram_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return histogram_;
    }
    public int getHistogramCount() {
      return internalGetHistogram().getMap().size();
    }
    /**
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     *
     * The key format is:
     *
     * * (for string histogram) string values stored in the field.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public boolean containsHistogram(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetHistogram().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHistogramMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getHistogram() {
      return getHistogramMap();
    }
    /**
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     *
     * The key format is:
     *
     * * (for string histogram) string values stored in the field.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getHistogramMap() {
      return internalGetHistogram().getMap();
    }
    /**
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     *
     * The key format is:
     *
     * * (for string histogram) string values stored in the field.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public long getHistogramOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetHistogram().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     *
     * The key format is:
     *
     * * (for string histogram) string values stored in the field.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public long getHistogramOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetHistogram().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearHistogram() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableHistogram().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     *
     * The key format is:
     *
     * * (for string histogram) string values stored in the field.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    public Builder removeHistogram(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableHistogram().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
        getMutableHistogram() {
      bitField0_ |= 0x00000002;
      return internalGetMutableHistogram().getMutableMap();
    }
    /**
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     *
     * The key format is:
     *
     * * (for string histogram) string values stored in the field.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    public Builder putHistogram(
        java.lang.String key,
        long value) {
      if (key == null) { throw new NullPointerException("map key"); }

      internalGetMutableHistogram().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     *
     * The key format is:
     *
     * * (for string histogram) string values stored in the field.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    public Builder putAllHistogram(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableHistogram().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.HistogramQueryResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.HistogramQueryResult)
  private static final com.google.cloud.contentwarehouse.v1.HistogramQueryResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.HistogramQueryResult();
  }

  public static com.google.cloud.contentwarehouse.v1.HistogramQueryResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistogramQueryResult>
      PARSER = new com.google.protobuf.AbstractParser<HistogramQueryResult>() {
    @java.lang.Override
    public HistogramQueryResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<HistogramQueryResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistogramQueryResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.HistogramQueryResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

