// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Encapsulates numeric value that can be either absolute or relative.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.FixedOrPercent}
 */
public final class FixedOrPercent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.FixedOrPercent)
    FixedOrPercentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FixedOrPercent.newBuilder() to construct.
  private FixedOrPercent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FixedOrPercent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FixedOrPercent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FixedOrPercent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FixedOrPercent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.FixedOrPercent.class, com.google.cloud.compute.v1.FixedOrPercent.Builder.class);
  }

  private int bitField0_;
  public static final int CALCULATED_FIELD_NUMBER = 472082878;
  private int calculated_ = 0;
  /**
   * <pre>
   * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded. 
   * </pre>
   *
   * <code>optional int32 calculated = 472082878;</code>
   * @return Whether the calculated field is set.
   */
  @java.lang.Override
  public boolean hasCalculated() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded. 
   * </pre>
   *
   * <code>optional int32 calculated = 472082878;</code>
   * @return The calculated.
   */
  @java.lang.Override
  public int getCalculated() {
    return calculated_;
  }

  public static final int FIXED_FIELD_NUMBER = 97445748;
  private int fixed_ = 0;
  /**
   * <pre>
   * Specifies a fixed number of VM instances. This must be a positive integer.
   * </pre>
   *
   * <code>optional int32 fixed = 97445748;</code>
   * @return Whether the fixed field is set.
   */
  @java.lang.Override
  public boolean hasFixed() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Specifies a fixed number of VM instances. This must be a positive integer.
   * </pre>
   *
   * <code>optional int32 fixed = 97445748;</code>
   * @return The fixed.
   */
  @java.lang.Override
  public int getFixed() {
    return fixed_;
  }

  public static final int PERCENT_FIELD_NUMBER = 394814533;
  private int percent_ = 0;
  /**
   * <pre>
   * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
   * </pre>
   *
   * <code>optional int32 percent = 394814533;</code>
   * @return Whether the percent field is set.
   */
  @java.lang.Override
  public boolean hasPercent() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
   * </pre>
   *
   * <code>optional int32 percent = 394814533;</code>
   * @return The percent.
   */
  @java.lang.Override
  public int getPercent() {
    return percent_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(97445748, fixed_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(394814533, percent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(472082878, calculated_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(97445748, fixed_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(394814533, percent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(472082878, calculated_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.FixedOrPercent)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.FixedOrPercent other = (com.google.cloud.compute.v1.FixedOrPercent) obj;

    if (hasCalculated() != other.hasCalculated()) return false;
    if (hasCalculated()) {
      if (getCalculated()
          != other.getCalculated()) return false;
    }
    if (hasFixed() != other.hasFixed()) return false;
    if (hasFixed()) {
      if (getFixed()
          != other.getFixed()) return false;
    }
    if (hasPercent() != other.hasPercent()) return false;
    if (hasPercent()) {
      if (getPercent()
          != other.getPercent()) return false;
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
    if (hasCalculated()) {
      hash = (37 * hash) + CALCULATED_FIELD_NUMBER;
      hash = (53 * hash) + getCalculated();
    }
    if (hasFixed()) {
      hash = (37 * hash) + FIXED_FIELD_NUMBER;
      hash = (53 * hash) + getFixed();
    }
    if (hasPercent()) {
      hash = (37 * hash) + PERCENT_FIELD_NUMBER;
      hash = (53 * hash) + getPercent();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FixedOrPercent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FixedOrPercent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.FixedOrPercent parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.FixedOrPercent prototype) {
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
   * Encapsulates numeric value that can be either absolute or relative.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.FixedOrPercent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.FixedOrPercent)
      com.google.cloud.compute.v1.FixedOrPercentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FixedOrPercent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FixedOrPercent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.FixedOrPercent.class, com.google.cloud.compute.v1.FixedOrPercent.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.FixedOrPercent.newBuilder()
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
      calculated_ = 0;
      fixed_ = 0;
      percent_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FixedOrPercent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FixedOrPercent getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.FixedOrPercent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FixedOrPercent build() {
      com.google.cloud.compute.v1.FixedOrPercent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FixedOrPercent buildPartial() {
      com.google.cloud.compute.v1.FixedOrPercent result = new com.google.cloud.compute.v1.FixedOrPercent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.FixedOrPercent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.calculated_ = calculated_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fixed_ = fixed_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.percent_ = percent_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.FixedOrPercent) {
        return mergeFrom((com.google.cloud.compute.v1.FixedOrPercent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.FixedOrPercent other) {
      if (other == com.google.cloud.compute.v1.FixedOrPercent.getDefaultInstance()) return this;
      if (other.hasCalculated()) {
        setCalculated(other.getCalculated());
      }
      if (other.hasFixed()) {
        setFixed(other.getFixed());
      }
      if (other.hasPercent()) {
        setPercent(other.getPercent());
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
            case 779565984: {
              fixed_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 779565984
            case -1136451032: {
              percent_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case -1136451032
            case -518304272: {
              calculated_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case -518304272
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

    private int calculated_ ;
    /**
     * <pre>
     * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded. 
     * </pre>
     *
     * <code>optional int32 calculated = 472082878;</code>
     * @return Whether the calculated field is set.
     */
    @java.lang.Override
    public boolean hasCalculated() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded. 
     * </pre>
     *
     * <code>optional int32 calculated = 472082878;</code>
     * @return The calculated.
     */
    @java.lang.Override
    public int getCalculated() {
      return calculated_;
    }
    /**
     * <pre>
     * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded. 
     * </pre>
     *
     * <code>optional int32 calculated = 472082878;</code>
     * @param value The calculated to set.
     * @return This builder for chaining.
     */
    public Builder setCalculated(int value) {

      calculated_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded. 
     * </pre>
     *
     * <code>optional int32 calculated = 472082878;</code>
     * @return This builder for chaining.
     */
    public Builder clearCalculated() {
      bitField0_ = (bitField0_ & ~0x00000001);
      calculated_ = 0;
      onChanged();
      return this;
    }

    private int fixed_ ;
    /**
     * <pre>
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * </pre>
     *
     * <code>optional int32 fixed = 97445748;</code>
     * @return Whether the fixed field is set.
     */
    @java.lang.Override
    public boolean hasFixed() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * </pre>
     *
     * <code>optional int32 fixed = 97445748;</code>
     * @return The fixed.
     */
    @java.lang.Override
    public int getFixed() {
      return fixed_;
    }
    /**
     * <pre>
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * </pre>
     *
     * <code>optional int32 fixed = 97445748;</code>
     * @param value The fixed to set.
     * @return This builder for chaining.
     */
    public Builder setFixed(int value) {

      fixed_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * </pre>
     *
     * <code>optional int32 fixed = 97445748;</code>
     * @return This builder for chaining.
     */
    public Builder clearFixed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fixed_ = 0;
      onChanged();
      return this;
    }

    private int percent_ ;
    /**
     * <pre>
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * </pre>
     *
     * <code>optional int32 percent = 394814533;</code>
     * @return Whether the percent field is set.
     */
    @java.lang.Override
    public boolean hasPercent() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * </pre>
     *
     * <code>optional int32 percent = 394814533;</code>
     * @return The percent.
     */
    @java.lang.Override
    public int getPercent() {
      return percent_;
    }
    /**
     * <pre>
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * </pre>
     *
     * <code>optional int32 percent = 394814533;</code>
     * @param value The percent to set.
     * @return This builder for chaining.
     */
    public Builder setPercent(int value) {

      percent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * </pre>
     *
     * <code>optional int32 percent = 394814533;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      percent_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.FixedOrPercent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.FixedOrPercent)
  private static final com.google.cloud.compute.v1.FixedOrPercent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.FixedOrPercent();
  }

  public static com.google.cloud.compute.v1.FixedOrPercent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FixedOrPercent>
      PARSER = new com.google.protobuf.AbstractParser<FixedOrPercent>() {
    @java.lang.Override
    public FixedOrPercent parsePartialFrom(
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

  public static com.google.protobuf.Parser<FixedOrPercent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FixedOrPercent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.FixedOrPercent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

