/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/vehicle_info.proto

package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * Encapsulates the vehicle information, such as the license plate last
 * character.
 * </pre>
 *
 * Protobuf type {@code google.maps.routing.v2.VehicleInfo}
 */
public final class VehicleInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.routing.v2.VehicleInfo)
    VehicleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VehicleInfo.newBuilder() to construct.
  private VehicleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VehicleInfo() {
    emissionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VehicleInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.routing.v2.VehicleInfoProto
        .internal_static_google_maps_routing_v2_VehicleInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routing.v2.VehicleInfoProto
        .internal_static_google_maps_routing_v2_VehicleInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routing.v2.VehicleInfo.class,
            com.google.maps.routing.v2.VehicleInfo.Builder.class);
  }

  public static final int EMISSION_TYPE_FIELD_NUMBER = 2;
  private int emissionType_ = 0;
  /**
   *
   *
   * <pre>
   * Describes the vehicle's emission type.
   * Applies only to the `DRIVE` travel mode.
   * </pre>
   *
   * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
   *
   * @return The enum numeric value on the wire for emissionType.
   */
  @java.lang.Override
  public int getEmissionTypeValue() {
    return emissionType_;
  }
  /**
   *
   *
   * <pre>
   * Describes the vehicle's emission type.
   * Applies only to the `DRIVE` travel mode.
   * </pre>
   *
   * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
   *
   * @return The emissionType.
   */
  @java.lang.Override
  public com.google.maps.routing.v2.VehicleEmissionType getEmissionType() {
    com.google.maps.routing.v2.VehicleEmissionType result =
        com.google.maps.routing.v2.VehicleEmissionType.forNumber(emissionType_);
    return result == null ? com.google.maps.routing.v2.VehicleEmissionType.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (emissionType_
        != com.google.maps.routing.v2.VehicleEmissionType.VEHICLE_EMISSION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, emissionType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (emissionType_
        != com.google.maps.routing.v2.VehicleEmissionType.VEHICLE_EMISSION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, emissionType_);
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
    if (!(obj instanceof com.google.maps.routing.v2.VehicleInfo)) {
      return super.equals(obj);
    }
    com.google.maps.routing.v2.VehicleInfo other = (com.google.maps.routing.v2.VehicleInfo) obj;

    if (emissionType_ != other.emissionType_) return false;
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
    hash = (37 * hash) + EMISSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + emissionType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.VehicleInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.maps.routing.v2.VehicleInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Encapsulates the vehicle information, such as the license plate last
   * character.
   * </pre>
   *
   * Protobuf type {@code google.maps.routing.v2.VehicleInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.routing.v2.VehicleInfo)
      com.google.maps.routing.v2.VehicleInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.routing.v2.VehicleInfoProto
          .internal_static_google_maps_routing_v2_VehicleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routing.v2.VehicleInfoProto
          .internal_static_google_maps_routing_v2_VehicleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routing.v2.VehicleInfo.class,
              com.google.maps.routing.v2.VehicleInfo.Builder.class);
    }

    // Construct using com.google.maps.routing.v2.VehicleInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      emissionType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.routing.v2.VehicleInfoProto
          .internal_static_google_maps_routing_v2_VehicleInfo_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.VehicleInfo getDefaultInstanceForType() {
      return com.google.maps.routing.v2.VehicleInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routing.v2.VehicleInfo build() {
      com.google.maps.routing.v2.VehicleInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.VehicleInfo buildPartial() {
      com.google.maps.routing.v2.VehicleInfo result =
          new com.google.maps.routing.v2.VehicleInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.routing.v2.VehicleInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emissionType_ = emissionType_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.maps.routing.v2.VehicleInfo) {
        return mergeFrom((com.google.maps.routing.v2.VehicleInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routing.v2.VehicleInfo other) {
      if (other == com.google.maps.routing.v2.VehicleInfo.getDefaultInstance()) return this;
      if (other.emissionType_ != 0) {
        setEmissionTypeValue(other.getEmissionTypeValue());
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
            case 16:
              {
                emissionType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
            default:
              {
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

    private int emissionType_ = 0;
    /**
     *
     *
     * <pre>
     * Describes the vehicle's emission type.
     * Applies only to the `DRIVE` travel mode.
     * </pre>
     *
     * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
     *
     * @return The enum numeric value on the wire for emissionType.
     */
    @java.lang.Override
    public int getEmissionTypeValue() {
      return emissionType_;
    }
    /**
     *
     *
     * <pre>
     * Describes the vehicle's emission type.
     * Applies only to the `DRIVE` travel mode.
     * </pre>
     *
     * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for emissionType to set.
     * @return This builder for chaining.
     */
    public Builder setEmissionTypeValue(int value) {
      emissionType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the vehicle's emission type.
     * Applies only to the `DRIVE` travel mode.
     * </pre>
     *
     * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
     *
     * @return The emissionType.
     */
    @java.lang.Override
    public com.google.maps.routing.v2.VehicleEmissionType getEmissionType() {
      com.google.maps.routing.v2.VehicleEmissionType result =
          com.google.maps.routing.v2.VehicleEmissionType.forNumber(emissionType_);
      return result == null ? com.google.maps.routing.v2.VehicleEmissionType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Describes the vehicle's emission type.
     * Applies only to the `DRIVE` travel mode.
     * </pre>
     *
     * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
     *
     * @param value The emissionType to set.
     * @return This builder for chaining.
     */
    public Builder setEmissionType(com.google.maps.routing.v2.VehicleEmissionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      emissionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the vehicle's emission type.
     * Applies only to the `DRIVE` travel mode.
     * </pre>
     *
     * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmissionType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      emissionType_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.maps.routing.v2.VehicleInfo)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routing.v2.VehicleInfo)
  private static final com.google.maps.routing.v2.VehicleInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.routing.v2.VehicleInfo();
  }

  public static com.google.maps.routing.v2.VehicleInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VehicleInfo> PARSER =
      new com.google.protobuf.AbstractParser<VehicleInfo>() {
        @java.lang.Override
        public VehicleInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<VehicleInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VehicleInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routing.v2.VehicleInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
