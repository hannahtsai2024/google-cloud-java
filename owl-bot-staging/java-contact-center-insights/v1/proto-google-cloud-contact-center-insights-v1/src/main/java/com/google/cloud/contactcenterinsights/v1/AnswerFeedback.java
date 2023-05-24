// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * The feedback that the customer has about a certain answer in the
 * conversation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.AnswerFeedback}
 */
public final class AnswerFeedback extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.AnswerFeedback)
    AnswerFeedbackOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnswerFeedback.newBuilder() to construct.
  private AnswerFeedback(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnswerFeedback() {
    correctnessLevel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnswerFeedback();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnswerFeedback_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnswerFeedback_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.AnswerFeedback.class, com.google.cloud.contactcenterinsights.v1.AnswerFeedback.Builder.class);
  }

  /**
   * <pre>
   * The correctness level of an answer.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel}
   */
  public enum CorrectnessLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Correctness level unspecified.
     * </pre>
     *
     * <code>CORRECTNESS_LEVEL_UNSPECIFIED = 0;</code>
     */
    CORRECTNESS_LEVEL_UNSPECIFIED(0),
    /**
     * <pre>
     * Answer is totally wrong.
     * </pre>
     *
     * <code>NOT_CORRECT = 1;</code>
     */
    NOT_CORRECT(1),
    /**
     * <pre>
     * Answer is partially correct.
     * </pre>
     *
     * <code>PARTIALLY_CORRECT = 2;</code>
     */
    PARTIALLY_CORRECT(2),
    /**
     * <pre>
     * Answer is fully correct.
     * </pre>
     *
     * <code>FULLY_CORRECT = 3;</code>
     */
    FULLY_CORRECT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Correctness level unspecified.
     * </pre>
     *
     * <code>CORRECTNESS_LEVEL_UNSPECIFIED = 0;</code>
     */
    public static final int CORRECTNESS_LEVEL_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Answer is totally wrong.
     * </pre>
     *
     * <code>NOT_CORRECT = 1;</code>
     */
    public static final int NOT_CORRECT_VALUE = 1;
    /**
     * <pre>
     * Answer is partially correct.
     * </pre>
     *
     * <code>PARTIALLY_CORRECT = 2;</code>
     */
    public static final int PARTIALLY_CORRECT_VALUE = 2;
    /**
     * <pre>
     * Answer is fully correct.
     * </pre>
     *
     * <code>FULLY_CORRECT = 3;</code>
     */
    public static final int FULLY_CORRECT_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CorrectnessLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CorrectnessLevel forNumber(int value) {
      switch (value) {
        case 0: return CORRECTNESS_LEVEL_UNSPECIFIED;
        case 1: return NOT_CORRECT;
        case 2: return PARTIALLY_CORRECT;
        case 3: return FULLY_CORRECT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CorrectnessLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CorrectnessLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CorrectnessLevel>() {
            public CorrectnessLevel findValueByNumber(int number) {
              return CorrectnessLevel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.AnswerFeedback.getDescriptor().getEnumTypes().get(0);
    }

    private static final CorrectnessLevel[] VALUES = values();

    public static CorrectnessLevel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CorrectnessLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel)
  }

  public static final int CORRECTNESS_LEVEL_FIELD_NUMBER = 1;
  private int correctnessLevel_ = 0;
  /**
   * <pre>
   * The correctness level of an answer.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
   * @return The enum numeric value on the wire for correctnessLevel.
   */
  @java.lang.Override public int getCorrectnessLevelValue() {
    return correctnessLevel_;
  }
  /**
   * <pre>
   * The correctness level of an answer.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
   * @return The correctnessLevel.
   */
  @java.lang.Override public com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel getCorrectnessLevel() {
    com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel result = com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel.forNumber(correctnessLevel_);
    return result == null ? com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel.UNRECOGNIZED : result;
  }

  public static final int CLICKED_FIELD_NUMBER = 2;
  private boolean clicked_ = false;
  /**
   * <pre>
   * Indicates whether an answer or item was clicked by the human agent.
   * </pre>
   *
   * <code>bool clicked = 2;</code>
   * @return The clicked.
   */
  @java.lang.Override
  public boolean getClicked() {
    return clicked_;
  }

  public static final int DISPLAYED_FIELD_NUMBER = 3;
  private boolean displayed_ = false;
  /**
   * <pre>
   * Indicates whether an answer or item was displayed to the human agent in the
   * agent desktop UI.
   * </pre>
   *
   * <code>bool displayed = 3;</code>
   * @return The displayed.
   */
  @java.lang.Override
  public boolean getDisplayed() {
    return displayed_;
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
    if (correctnessLevel_ != com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel.CORRECTNESS_LEVEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, correctnessLevel_);
    }
    if (clicked_ != false) {
      output.writeBool(2, clicked_);
    }
    if (displayed_ != false) {
      output.writeBool(3, displayed_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (correctnessLevel_ != com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel.CORRECTNESS_LEVEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, correctnessLevel_);
    }
    if (clicked_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, clicked_);
    }
    if (displayed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, displayed_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.AnswerFeedback)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.AnswerFeedback other = (com.google.cloud.contactcenterinsights.v1.AnswerFeedback) obj;

    if (correctnessLevel_ != other.correctnessLevel_) return false;
    if (getClicked()
        != other.getClicked()) return false;
    if (getDisplayed()
        != other.getDisplayed()) return false;
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
    hash = (37 * hash) + CORRECTNESS_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + correctnessLevel_;
    hash = (37 * hash) + CLICKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getClicked());
    hash = (37 * hash) + DISPLAYED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisplayed());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.AnswerFeedback prototype) {
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
   * The feedback that the customer has about a certain answer in the
   * conversation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.AnswerFeedback}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.AnswerFeedback)
      com.google.cloud.contactcenterinsights.v1.AnswerFeedbackOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnswerFeedback_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnswerFeedback_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.AnswerFeedback.class, com.google.cloud.contactcenterinsights.v1.AnswerFeedback.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.AnswerFeedback.newBuilder()
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
      correctnessLevel_ = 0;
      clicked_ = false;
      displayed_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnswerFeedback_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.AnswerFeedback getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.AnswerFeedback.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.AnswerFeedback build() {
      com.google.cloud.contactcenterinsights.v1.AnswerFeedback result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.AnswerFeedback buildPartial() {
      com.google.cloud.contactcenterinsights.v1.AnswerFeedback result = new com.google.cloud.contactcenterinsights.v1.AnswerFeedback(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contactcenterinsights.v1.AnswerFeedback result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.correctnessLevel_ = correctnessLevel_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clicked_ = clicked_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.displayed_ = displayed_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contactcenterinsights.v1.AnswerFeedback) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.AnswerFeedback)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.AnswerFeedback other) {
      if (other == com.google.cloud.contactcenterinsights.v1.AnswerFeedback.getDefaultInstance()) return this;
      if (other.correctnessLevel_ != 0) {
        setCorrectnessLevelValue(other.getCorrectnessLevelValue());
      }
      if (other.getClicked() != false) {
        setClicked(other.getClicked());
      }
      if (other.getDisplayed() != false) {
        setDisplayed(other.getDisplayed());
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
              correctnessLevel_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              clicked_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              displayed_ = input.readBool();
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private int correctnessLevel_ = 0;
    /**
     * <pre>
     * The correctness level of an answer.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
     * @return The enum numeric value on the wire for correctnessLevel.
     */
    @java.lang.Override public int getCorrectnessLevelValue() {
      return correctnessLevel_;
    }
    /**
     * <pre>
     * The correctness level of an answer.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
     * @param value The enum numeric value on the wire for correctnessLevel to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectnessLevelValue(int value) {
      correctnessLevel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The correctness level of an answer.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
     * @return The correctnessLevel.
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel getCorrectnessLevel() {
      com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel result = com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel.forNumber(correctnessLevel_);
      return result == null ? com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The correctness level of an answer.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
     * @param value The correctnessLevel to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectnessLevel(com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      correctnessLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The correctness level of an answer.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCorrectnessLevel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      correctnessLevel_ = 0;
      onChanged();
      return this;
    }

    private boolean clicked_ ;
    /**
     * <pre>
     * Indicates whether an answer or item was clicked by the human agent.
     * </pre>
     *
     * <code>bool clicked = 2;</code>
     * @return The clicked.
     */
    @java.lang.Override
    public boolean getClicked() {
      return clicked_;
    }
    /**
     * <pre>
     * Indicates whether an answer or item was clicked by the human agent.
     * </pre>
     *
     * <code>bool clicked = 2;</code>
     * @param value The clicked to set.
     * @return This builder for chaining.
     */
    public Builder setClicked(boolean value) {

      clicked_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether an answer or item was clicked by the human agent.
     * </pre>
     *
     * <code>bool clicked = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClicked() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clicked_ = false;
      onChanged();
      return this;
    }

    private boolean displayed_ ;
    /**
     * <pre>
     * Indicates whether an answer or item was displayed to the human agent in the
     * agent desktop UI.
     * </pre>
     *
     * <code>bool displayed = 3;</code>
     * @return The displayed.
     */
    @java.lang.Override
    public boolean getDisplayed() {
      return displayed_;
    }
    /**
     * <pre>
     * Indicates whether an answer or item was displayed to the human agent in the
     * agent desktop UI.
     * </pre>
     *
     * <code>bool displayed = 3;</code>
     * @param value The displayed to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayed(boolean value) {

      displayed_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether an answer or item was displayed to the human agent in the
     * agent desktop UI.
     * </pre>
     *
     * <code>bool displayed = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayed() {
      bitField0_ = (bitField0_ & ~0x00000004);
      displayed_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.AnswerFeedback)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.AnswerFeedback)
  private static final com.google.cloud.contactcenterinsights.v1.AnswerFeedback DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.AnswerFeedback();
  }

  public static com.google.cloud.contactcenterinsights.v1.AnswerFeedback getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnswerFeedback>
      PARSER = new com.google.protobuf.AbstractParser<AnswerFeedback>() {
    @java.lang.Override
    public AnswerFeedback parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnswerFeedback> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnswerFeedback> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.AnswerFeedback getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

