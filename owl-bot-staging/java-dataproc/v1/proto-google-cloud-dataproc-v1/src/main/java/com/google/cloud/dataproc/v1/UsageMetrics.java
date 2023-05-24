// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Usage metrics represent approximate total resources consumed by a workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.UsageMetrics}
 */
public final class UsageMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.UsageMetrics)
    UsageMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsageMetrics.newBuilder() to construct.
  private UsageMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsageMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsageMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_UsageMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_UsageMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.UsageMetrics.class, com.google.cloud.dataproc.v1.UsageMetrics.Builder.class);
  }

  public static final int MILLI_DCU_SECONDS_FIELD_NUMBER = 1;
  private long milliDcuSeconds_ = 0L;
  /**
   * <pre>
   * Optional. DCU (Dataproc Compute Units) usage in (`milliDCU` x `seconds`)
   * (see [Dataproc Serverless pricing]
   * (https://cloud.google.com/dataproc-serverless/pricing)).
   * </pre>
   *
   * <code>int64 milli_dcu_seconds = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The milliDcuSeconds.
   */
  @java.lang.Override
  public long getMilliDcuSeconds() {
    return milliDcuSeconds_;
  }

  public static final int SHUFFLE_STORAGE_GB_SECONDS_FIELD_NUMBER = 2;
  private long shuffleStorageGbSeconds_ = 0L;
  /**
   * <pre>
   * Optional. Shuffle storage usage in (`GB` x `seconds`) (see
   * [Dataproc Serverless pricing]
   * (https://cloud.google.com/dataproc-serverless/pricing)).
   * </pre>
   *
   * <code>int64 shuffle_storage_gb_seconds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The shuffleStorageGbSeconds.
   */
  @java.lang.Override
  public long getShuffleStorageGbSeconds() {
    return shuffleStorageGbSeconds_;
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
    if (milliDcuSeconds_ != 0L) {
      output.writeInt64(1, milliDcuSeconds_);
    }
    if (shuffleStorageGbSeconds_ != 0L) {
      output.writeInt64(2, shuffleStorageGbSeconds_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (milliDcuSeconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, milliDcuSeconds_);
    }
    if (shuffleStorageGbSeconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, shuffleStorageGbSeconds_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.UsageMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.UsageMetrics other = (com.google.cloud.dataproc.v1.UsageMetrics) obj;

    if (getMilliDcuSeconds()
        != other.getMilliDcuSeconds()) return false;
    if (getShuffleStorageGbSeconds()
        != other.getShuffleStorageGbSeconds()) return false;
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
    hash = (37 * hash) + MILLI_DCU_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMilliDcuSeconds());
    hash = (37 * hash) + SHUFFLE_STORAGE_GB_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getShuffleStorageGbSeconds());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.UsageMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.UsageMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.UsageMetrics parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.UsageMetrics prototype) {
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
   * Usage metrics represent approximate total resources consumed by a workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.UsageMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.UsageMetrics)
      com.google.cloud.dataproc.v1.UsageMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_UsageMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_UsageMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.UsageMetrics.class, com.google.cloud.dataproc.v1.UsageMetrics.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.UsageMetrics.newBuilder()
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
      milliDcuSeconds_ = 0L;
      shuffleStorageGbSeconds_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_UsageMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.UsageMetrics getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.UsageMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.UsageMetrics build() {
      com.google.cloud.dataproc.v1.UsageMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.UsageMetrics buildPartial() {
      com.google.cloud.dataproc.v1.UsageMetrics result = new com.google.cloud.dataproc.v1.UsageMetrics(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.UsageMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.milliDcuSeconds_ = milliDcuSeconds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shuffleStorageGbSeconds_ = shuffleStorageGbSeconds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1.UsageMetrics) {
        return mergeFrom((com.google.cloud.dataproc.v1.UsageMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.UsageMetrics other) {
      if (other == com.google.cloud.dataproc.v1.UsageMetrics.getDefaultInstance()) return this;
      if (other.getMilliDcuSeconds() != 0L) {
        setMilliDcuSeconds(other.getMilliDcuSeconds());
      }
      if (other.getShuffleStorageGbSeconds() != 0L) {
        setShuffleStorageGbSeconds(other.getShuffleStorageGbSeconds());
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
              milliDcuSeconds_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              shuffleStorageGbSeconds_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long milliDcuSeconds_ ;
    /**
     * <pre>
     * Optional. DCU (Dataproc Compute Units) usage in (`milliDCU` x `seconds`)
     * (see [Dataproc Serverless pricing]
     * (https://cloud.google.com/dataproc-serverless/pricing)).
     * </pre>
     *
     * <code>int64 milli_dcu_seconds = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The milliDcuSeconds.
     */
    @java.lang.Override
    public long getMilliDcuSeconds() {
      return milliDcuSeconds_;
    }
    /**
     * <pre>
     * Optional. DCU (Dataproc Compute Units) usage in (`milliDCU` x `seconds`)
     * (see [Dataproc Serverless pricing]
     * (https://cloud.google.com/dataproc-serverless/pricing)).
     * </pre>
     *
     * <code>int64 milli_dcu_seconds = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The milliDcuSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setMilliDcuSeconds(long value) {

      milliDcuSeconds_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. DCU (Dataproc Compute Units) usage in (`milliDCU` x `seconds`)
     * (see [Dataproc Serverless pricing]
     * (https://cloud.google.com/dataproc-serverless/pricing)).
     * </pre>
     *
     * <code>int64 milli_dcu_seconds = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearMilliDcuSeconds() {
      bitField0_ = (bitField0_ & ~0x00000001);
      milliDcuSeconds_ = 0L;
      onChanged();
      return this;
    }

    private long shuffleStorageGbSeconds_ ;
    /**
     * <pre>
     * Optional. Shuffle storage usage in (`GB` x `seconds`) (see
     * [Dataproc Serverless pricing]
     * (https://cloud.google.com/dataproc-serverless/pricing)).
     * </pre>
     *
     * <code>int64 shuffle_storage_gb_seconds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The shuffleStorageGbSeconds.
     */
    @java.lang.Override
    public long getShuffleStorageGbSeconds() {
      return shuffleStorageGbSeconds_;
    }
    /**
     * <pre>
     * Optional. Shuffle storage usage in (`GB` x `seconds`) (see
     * [Dataproc Serverless pricing]
     * (https://cloud.google.com/dataproc-serverless/pricing)).
     * </pre>
     *
     * <code>int64 shuffle_storage_gb_seconds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The shuffleStorageGbSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setShuffleStorageGbSeconds(long value) {

      shuffleStorageGbSeconds_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Shuffle storage usage in (`GB` x `seconds`) (see
     * [Dataproc Serverless pricing]
     * (https://cloud.google.com/dataproc-serverless/pricing)).
     * </pre>
     *
     * <code>int64 shuffle_storage_gb_seconds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearShuffleStorageGbSeconds() {
      bitField0_ = (bitField0_ & ~0x00000002);
      shuffleStorageGbSeconds_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.UsageMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.UsageMetrics)
  private static final com.google.cloud.dataproc.v1.UsageMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.UsageMetrics();
  }

  public static com.google.cloud.dataproc.v1.UsageMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageMetrics>
      PARSER = new com.google.protobuf.AbstractParser<UsageMetrics>() {
    @java.lang.Override
    public UsageMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.UsageMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

