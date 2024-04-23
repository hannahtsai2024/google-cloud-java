// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/goal.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

/**
 * <pre>
 * Defines the criteria a [LineItem][google.ads.admanager.v1.LineItem] needs to
 * satisfy to meet its delivery
 *  goal.
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.Goal}
 */
public final class Goal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.Goal)
    GoalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Goal.newBuilder() to construct.
  private Goal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Goal() {
    goalType_ = 0;
    unitType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Goal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.admanager.v1.GoalProto.internal_static_google_ads_admanager_v1_Goal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.GoalProto.internal_static_google_ads_admanager_v1_Goal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.Goal.class, com.google.ads.admanager.v1.Goal.Builder.class);
  }

  public static final int GOAL_TYPE_FIELD_NUMBER = 1;
  private int goalType_ = 0;
  /**
   * <pre>
   * The type of the goal for the LineItem. It defines the period over which the
   * goal should be reached.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.GoalTypeEnum.GoalType goal_type = 1;</code>
   * @return The enum numeric value on the wire for goalType.
   */
  @java.lang.Override public int getGoalTypeValue() {
    return goalType_;
  }
  /**
   * <pre>
   * The type of the goal for the LineItem. It defines the period over which the
   * goal should be reached.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.GoalTypeEnum.GoalType goal_type = 1;</code>
   * @return The goalType.
   */
  @java.lang.Override public com.google.ads.admanager.v1.GoalTypeEnum.GoalType getGoalType() {
    com.google.ads.admanager.v1.GoalTypeEnum.GoalType result = com.google.ads.admanager.v1.GoalTypeEnum.GoalType.forNumber(goalType_);
    return result == null ? com.google.ads.admanager.v1.GoalTypeEnum.GoalType.UNRECOGNIZED : result;
  }

  public static final int UNIT_TYPE_FIELD_NUMBER = 2;
  private int unitType_ = 0;
  /**
   * <pre>
   * The type of the goal unit for the LineItem.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.UnitTypeEnum.UnitType unit_type = 2;</code>
   * @return The enum numeric value on the wire for unitType.
   */
  @java.lang.Override public int getUnitTypeValue() {
    return unitType_;
  }
  /**
   * <pre>
   * The type of the goal unit for the LineItem.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.UnitTypeEnum.UnitType unit_type = 2;</code>
   * @return The unitType.
   */
  @java.lang.Override public com.google.ads.admanager.v1.UnitTypeEnum.UnitType getUnitType() {
    com.google.ads.admanager.v1.UnitTypeEnum.UnitType result = com.google.ads.admanager.v1.UnitTypeEnum.UnitType.forNumber(unitType_);
    return result == null ? com.google.ads.admanager.v1.UnitTypeEnum.UnitType.UNRECOGNIZED : result;
  }

  public static final int UNITS_FIELD_NUMBER = 3;
  private long units_ = 0L;
  /**
   * <pre>
   * If this is a primary goal, it represents the number or percentage of
   * impressions or clicks that will be reserved. If the line item is of type
   * [LineItemTypeEnum.LineItemType.SPONSORSHIP][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.SPONSORSHIP],
   * it represents the percentage of available impressions reserved. If the line
   * item is of type
   * [LineItemTypeEnum.LineItemType.BULK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.BULK]
   * or
   * [LineItemTypeEnum.LineItemType.PRICE_PRIORITY][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.PRICE_PRIORITY],
   * it represents the number of remaining impressions reserved. If the line
   * item is of type
   * [LineItemTypeEnum.LineItemType.NETWORK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.NETWORK]
   * or
   * [LineItemTypeEnum.LineItemType.HOUSE][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.HOUSE],
   * it represents the percentage of remaining impressions reserved. &lt;p&gt;If this
   * is an impression cap goal, it represents the number of impressions or
   * conversions that the line item will stop serving at if reached. For valid
   * line item types, see [LineItem.impressions_cap][].
   * </pre>
   *
   * <code>int64 units = 3;</code>
   * @return The units.
   */
  @java.lang.Override
  public long getUnits() {
    return units_;
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
    if (goalType_ != com.google.ads.admanager.v1.GoalTypeEnum.GoalType.GOAL_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, goalType_);
    }
    if (unitType_ != com.google.ads.admanager.v1.UnitTypeEnum.UnitType.UNIT_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, unitType_);
    }
    if (units_ != 0L) {
      output.writeInt64(3, units_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (goalType_ != com.google.ads.admanager.v1.GoalTypeEnum.GoalType.GOAL_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, goalType_);
    }
    if (unitType_ != com.google.ads.admanager.v1.UnitTypeEnum.UnitType.UNIT_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, unitType_);
    }
    if (units_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, units_);
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
    if (!(obj instanceof com.google.ads.admanager.v1.Goal)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.Goal other = (com.google.ads.admanager.v1.Goal) obj;

    if (goalType_ != other.goalType_) return false;
    if (unitType_ != other.unitType_) return false;
    if (getUnits()
        != other.getUnits()) return false;
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
    hash = (37 * hash) + GOAL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + goalType_;
    hash = (37 * hash) + UNIT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + unitType_;
    hash = (37 * hash) + UNITS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnits());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.admanager.v1.Goal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.Goal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.Goal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.admanager.v1.Goal parseFrom(
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
  public static Builder newBuilder(com.google.ads.admanager.v1.Goal prototype) {
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
   * Defines the criteria a [LineItem][google.ads.admanager.v1.LineItem] needs to
   * satisfy to meet its delivery
   *  goal.
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.Goal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.Goal)
      com.google.ads.admanager.v1.GoalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.admanager.v1.GoalProto.internal_static_google_ads_admanager_v1_Goal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.GoalProto.internal_static_google_ads_admanager_v1_Goal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.Goal.class, com.google.ads.admanager.v1.Goal.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.Goal.newBuilder()
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
      goalType_ = 0;
      unitType_ = 0;
      units_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.admanager.v1.GoalProto.internal_static_google_ads_admanager_v1_Goal_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.Goal getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.Goal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.Goal build() {
      com.google.ads.admanager.v1.Goal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.Goal buildPartial() {
      com.google.ads.admanager.v1.Goal result = new com.google.ads.admanager.v1.Goal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.admanager.v1.Goal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.goalType_ = goalType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.unitType_ = unitType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.units_ = units_;
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
      if (other instanceof com.google.ads.admanager.v1.Goal) {
        return mergeFrom((com.google.ads.admanager.v1.Goal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.Goal other) {
      if (other == com.google.ads.admanager.v1.Goal.getDefaultInstance()) return this;
      if (other.goalType_ != 0) {
        setGoalTypeValue(other.getGoalTypeValue());
      }
      if (other.unitType_ != 0) {
        setUnitTypeValue(other.getUnitTypeValue());
      }
      if (other.getUnits() != 0L) {
        setUnits(other.getUnits());
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
              goalType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              unitType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              units_ = input.readInt64();
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

    private int goalType_ = 0;
    /**
     * <pre>
     * The type of the goal for the LineItem. It defines the period over which the
     * goal should be reached.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.GoalTypeEnum.GoalType goal_type = 1;</code>
     * @return The enum numeric value on the wire for goalType.
     */
    @java.lang.Override public int getGoalTypeValue() {
      return goalType_;
    }
    /**
     * <pre>
     * The type of the goal for the LineItem. It defines the period over which the
     * goal should be reached.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.GoalTypeEnum.GoalType goal_type = 1;</code>
     * @param value The enum numeric value on the wire for goalType to set.
     * @return This builder for chaining.
     */
    public Builder setGoalTypeValue(int value) {
      goalType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the goal for the LineItem. It defines the period over which the
     * goal should be reached.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.GoalTypeEnum.GoalType goal_type = 1;</code>
     * @return The goalType.
     */
    @java.lang.Override
    public com.google.ads.admanager.v1.GoalTypeEnum.GoalType getGoalType() {
      com.google.ads.admanager.v1.GoalTypeEnum.GoalType result = com.google.ads.admanager.v1.GoalTypeEnum.GoalType.forNumber(goalType_);
      return result == null ? com.google.ads.admanager.v1.GoalTypeEnum.GoalType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the goal for the LineItem. It defines the period over which the
     * goal should be reached.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.GoalTypeEnum.GoalType goal_type = 1;</code>
     * @param value The goalType to set.
     * @return This builder for chaining.
     */
    public Builder setGoalType(com.google.ads.admanager.v1.GoalTypeEnum.GoalType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      goalType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the goal for the LineItem. It defines the period over which the
     * goal should be reached.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.GoalTypeEnum.GoalType goal_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGoalType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      goalType_ = 0;
      onChanged();
      return this;
    }

    private int unitType_ = 0;
    /**
     * <pre>
     * The type of the goal unit for the LineItem.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.UnitTypeEnum.UnitType unit_type = 2;</code>
     * @return The enum numeric value on the wire for unitType.
     */
    @java.lang.Override public int getUnitTypeValue() {
      return unitType_;
    }
    /**
     * <pre>
     * The type of the goal unit for the LineItem.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.UnitTypeEnum.UnitType unit_type = 2;</code>
     * @param value The enum numeric value on the wire for unitType to set.
     * @return This builder for chaining.
     */
    public Builder setUnitTypeValue(int value) {
      unitType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the goal unit for the LineItem.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.UnitTypeEnum.UnitType unit_type = 2;</code>
     * @return The unitType.
     */
    @java.lang.Override
    public com.google.ads.admanager.v1.UnitTypeEnum.UnitType getUnitType() {
      com.google.ads.admanager.v1.UnitTypeEnum.UnitType result = com.google.ads.admanager.v1.UnitTypeEnum.UnitType.forNumber(unitType_);
      return result == null ? com.google.ads.admanager.v1.UnitTypeEnum.UnitType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the goal unit for the LineItem.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.UnitTypeEnum.UnitType unit_type = 2;</code>
     * @param value The unitType to set.
     * @return This builder for chaining.
     */
    public Builder setUnitType(com.google.ads.admanager.v1.UnitTypeEnum.UnitType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      unitType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the goal unit for the LineItem.
     * </pre>
     *
     * <code>.google.ads.admanager.v1.UnitTypeEnum.UnitType unit_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnitType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      unitType_ = 0;
      onChanged();
      return this;
    }

    private long units_ ;
    /**
     * <pre>
     * If this is a primary goal, it represents the number or percentage of
     * impressions or clicks that will be reserved. If the line item is of type
     * [LineItemTypeEnum.LineItemType.SPONSORSHIP][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.SPONSORSHIP],
     * it represents the percentage of available impressions reserved. If the line
     * item is of type
     * [LineItemTypeEnum.LineItemType.BULK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.BULK]
     * or
     * [LineItemTypeEnum.LineItemType.PRICE_PRIORITY][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.PRICE_PRIORITY],
     * it represents the number of remaining impressions reserved. If the line
     * item is of type
     * [LineItemTypeEnum.LineItemType.NETWORK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.NETWORK]
     * or
     * [LineItemTypeEnum.LineItemType.HOUSE][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.HOUSE],
     * it represents the percentage of remaining impressions reserved. &lt;p&gt;If this
     * is an impression cap goal, it represents the number of impressions or
     * conversions that the line item will stop serving at if reached. For valid
     * line item types, see [LineItem.impressions_cap][].
     * </pre>
     *
     * <code>int64 units = 3;</code>
     * @return The units.
     */
    @java.lang.Override
    public long getUnits() {
      return units_;
    }
    /**
     * <pre>
     * If this is a primary goal, it represents the number or percentage of
     * impressions or clicks that will be reserved. If the line item is of type
     * [LineItemTypeEnum.LineItemType.SPONSORSHIP][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.SPONSORSHIP],
     * it represents the percentage of available impressions reserved. If the line
     * item is of type
     * [LineItemTypeEnum.LineItemType.BULK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.BULK]
     * or
     * [LineItemTypeEnum.LineItemType.PRICE_PRIORITY][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.PRICE_PRIORITY],
     * it represents the number of remaining impressions reserved. If the line
     * item is of type
     * [LineItemTypeEnum.LineItemType.NETWORK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.NETWORK]
     * or
     * [LineItemTypeEnum.LineItemType.HOUSE][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.HOUSE],
     * it represents the percentage of remaining impressions reserved. &lt;p&gt;If this
     * is an impression cap goal, it represents the number of impressions or
     * conversions that the line item will stop serving at if reached. For valid
     * line item types, see [LineItem.impressions_cap][].
     * </pre>
     *
     * <code>int64 units = 3;</code>
     * @param value The units to set.
     * @return This builder for chaining.
     */
    public Builder setUnits(long value) {

      units_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If this is a primary goal, it represents the number or percentage of
     * impressions or clicks that will be reserved. If the line item is of type
     * [LineItemTypeEnum.LineItemType.SPONSORSHIP][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.SPONSORSHIP],
     * it represents the percentage of available impressions reserved. If the line
     * item is of type
     * [LineItemTypeEnum.LineItemType.BULK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.BULK]
     * or
     * [LineItemTypeEnum.LineItemType.PRICE_PRIORITY][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.PRICE_PRIORITY],
     * it represents the number of remaining impressions reserved. If the line
     * item is of type
     * [LineItemTypeEnum.LineItemType.NETWORK][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.NETWORK]
     * or
     * [LineItemTypeEnum.LineItemType.HOUSE][google.ads.admanager.v1.LineItemTypeEnum.LineItemType.HOUSE],
     * it represents the percentage of remaining impressions reserved. &lt;p&gt;If this
     * is an impression cap goal, it represents the number of impressions or
     * conversions that the line item will stop serving at if reached. For valid
     * line item types, see [LineItem.impressions_cap][].
     * </pre>
     *
     * <code>int64 units = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnits() {
      bitField0_ = (bitField0_ & ~0x00000004);
      units_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.Goal)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.Goal)
  private static final com.google.ads.admanager.v1.Goal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.Goal();
  }

  public static com.google.ads.admanager.v1.Goal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Goal>
      PARSER = new com.google.protobuf.AbstractParser<Goal>() {
    @java.lang.Override
    public Goal parsePartialFrom(
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

  public static com.google.protobuf.Parser<Goal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Goal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.Goal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

