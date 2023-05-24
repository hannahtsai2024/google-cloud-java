// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Options regarding evaluation between bounding boxes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions}
 */
public final class BoundingBoxEvaluationOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions)
    BoundingBoxEvaluationOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoundingBoxEvaluationOptions.newBuilder() to construct.
  private BoundingBoxEvaluationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoundingBoxEvaluationOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoundingBoxEvaluationOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.class, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.Builder.class);
  }

  public static final int IOU_THRESHOLD_FIELD_NUMBER = 1;
  private float iouThreshold_ = 0F;
  /**
   * <pre>
   * Minimum
   * [intersection-over-union
   *
   * (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union)
   * required for 2 bounding boxes to be considered a match. This must be a
   * number between 0 and 1.
   * </pre>
   *
   * <code>float iou_threshold = 1;</code>
   * @return The iouThreshold.
   */
  @java.lang.Override
  public float getIouThreshold() {
    return iouThreshold_;
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
    if (java.lang.Float.floatToRawIntBits(iouThreshold_) != 0) {
      output.writeFloat(1, iouThreshold_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(iouThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, iouThreshold_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions other = (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) obj;

    if (java.lang.Float.floatToIntBits(getIouThreshold())
        != java.lang.Float.floatToIntBits(
            other.getIouThreshold())) return false;
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
    hash = (37 * hash) + IOU_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIouThreshold());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions prototype) {
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
   * Options regarding evaluation between bounding boxes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions)
      com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.class, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.newBuilder()
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
      iouThreshold_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions build() {
      com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions buildPartial() {
      com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions result = new com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.iouThreshold_ = iouThreshold_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions other) {
      if (other == com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance()) return this;
      if (other.getIouThreshold() != 0F) {
        setIouThreshold(other.getIouThreshold());
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
              iouThreshold_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
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

    private float iouThreshold_ ;
    /**
     * <pre>
     * Minimum
     * [intersection-over-union
     *
     * (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union)
     * required for 2 bounding boxes to be considered a match. This must be a
     * number between 0 and 1.
     * </pre>
     *
     * <code>float iou_threshold = 1;</code>
     * @return The iouThreshold.
     */
    @java.lang.Override
    public float getIouThreshold() {
      return iouThreshold_;
    }
    /**
     * <pre>
     * Minimum
     * [intersection-over-union
     *
     * (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union)
     * required for 2 bounding boxes to be considered a match. This must be a
     * number between 0 and 1.
     * </pre>
     *
     * <code>float iou_threshold = 1;</code>
     * @param value The iouThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setIouThreshold(float value) {

      iouThreshold_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum
     * [intersection-over-union
     *
     * (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union)
     * required for 2 bounding boxes to be considered a match. This must be a
     * number between 0 and 1.
     * </pre>
     *
     * <code>float iou_threshold = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIouThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      iouThreshold_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions)
  private static final com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions();
  }

  public static com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoundingBoxEvaluationOptions>
      PARSER = new com.google.protobuf.AbstractParser<BoundingBoxEvaluationOptions>() {
    @java.lang.Override
    public BoundingBoxEvaluationOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<BoundingBoxEvaluationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoundingBoxEvaluationOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

