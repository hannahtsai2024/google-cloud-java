// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The result of sentiment analysis. Sentiment analysis inspects user input
 * and identifies the prevailing subjective opinion, especially to determine a
 * user's attitude as positive, negative, or neutral.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.SentimentAnalysisResult}
 */
public final class SentimentAnalysisResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.SentimentAnalysisResult)
    SentimentAnalysisResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SentimentAnalysisResult.newBuilder() to construct.
  private SentimentAnalysisResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SentimentAnalysisResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SentimentAnalysisResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.SessionProto.internal_static_google_cloud_dialogflow_cx_v3_SentimentAnalysisResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.SessionProto.internal_static_google_cloud_dialogflow_cx_v3_SentimentAnalysisResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult.class, com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult.Builder.class);
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_ = 0F;
  /**
   * <pre>
   * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
   * sentiment).
   * </pre>
   *
   * <code>float score = 1;</code>
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
  }

  public static final int MAGNITUDE_FIELD_NUMBER = 2;
  private float magnitude_ = 0F;
  /**
   * <pre>
   * A non-negative number in the [0, +inf) range, which represents the absolute
   * magnitude of sentiment, regardless of score (positive or negative).
   * </pre>
   *
   * <code>float magnitude = 2;</code>
   * @return The magnitude.
   */
  @java.lang.Override
  public float getMagnitude() {
    return magnitude_;
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
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      output.writeFloat(1, score_);
    }
    if (java.lang.Float.floatToRawIntBits(magnitude_) != 0) {
      output.writeFloat(2, magnitude_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, score_);
    }
    if (java.lang.Float.floatToRawIntBits(magnitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, magnitude_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult other = (com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
    if (java.lang.Float.floatToIntBits(getMagnitude())
        != java.lang.Float.floatToIntBits(
            other.getMagnitude())) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    hash = (37 * hash) + MAGNITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMagnitude());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult prototype) {
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
   * The result of sentiment analysis. Sentiment analysis inspects user input
   * and identifies the prevailing subjective opinion, especially to determine a
   * user's attitude as positive, negative, or neutral.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.SentimentAnalysisResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.SentimentAnalysisResult)
      com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.SessionProto.internal_static_google_cloud_dialogflow_cx_v3_SentimentAnalysisResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.SessionProto.internal_static_google_cloud_dialogflow_cx_v3_SentimentAnalysisResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult.class, com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult.newBuilder()
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
      score_ = 0F;
      magnitude_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.SessionProto.internal_static_google_cloud_dialogflow_cx_v3_SentimentAnalysisResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult build() {
      com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult buildPartial() {
      com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult result = new com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.score_ = score_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.magnitude_ = magnitude_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult other) {
      if (other == com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult.getDefaultInstance()) return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.getMagnitude() != 0F) {
        setMagnitude(other.getMagnitude());
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
            case 13: {
              score_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
            case 21: {
              magnitude_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
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

    private float score_ ;
    /**
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
     * sentiment).
     * </pre>
     *
     * <code>float score = 1;</code>
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
     * sentiment).
     * </pre>
     *
     * <code>float score = 1;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {

      score_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
     * sentiment).
     * </pre>
     *
     * <code>float score = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      score_ = 0F;
      onChanged();
      return this;
    }

    private float magnitude_ ;
    /**
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents the absolute
     * magnitude of sentiment, regardless of score (positive or negative).
     * </pre>
     *
     * <code>float magnitude = 2;</code>
     * @return The magnitude.
     */
    @java.lang.Override
    public float getMagnitude() {
      return magnitude_;
    }
    /**
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents the absolute
     * magnitude of sentiment, regardless of score (positive or negative).
     * </pre>
     *
     * <code>float magnitude = 2;</code>
     * @param value The magnitude to set.
     * @return This builder for chaining.
     */
    public Builder setMagnitude(float value) {

      magnitude_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents the absolute
     * magnitude of sentiment, regardless of score (positive or negative).
     * </pre>
     *
     * <code>float magnitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagnitude() {
      bitField0_ = (bitField0_ & ~0x00000002);
      magnitude_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.SentimentAnalysisResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.SentimentAnalysisResult)
  private static final com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult();
  }

  public static com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentimentAnalysisResult>
      PARSER = new com.google.protobuf.AbstractParser<SentimentAnalysisResult>() {
    @java.lang.Override
    public SentimentAnalysisResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<SentimentAnalysisResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentimentAnalysisResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

