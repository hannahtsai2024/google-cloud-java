/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * In memory (tmpfs) ephemeral storage.
 * It is ephemeral in the sense that when the sandbox is taken down, the data is
 * destroyed with it (it does not persist across sandbox runs).
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.EmptyDirVolumeSource}
 */
public final class EmptyDirVolumeSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.EmptyDirVolumeSource)
    EmptyDirVolumeSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EmptyDirVolumeSource.newBuilder() to construct.
  private EmptyDirVolumeSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EmptyDirVolumeSource() {
    medium_ = 0;
    sizeLimit_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EmptyDirVolumeSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_EmptyDirVolumeSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_EmptyDirVolumeSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.EmptyDirVolumeSource.class,
            com.google.cloud.run.v2.EmptyDirVolumeSource.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The different types of medium supported for EmptyDir.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.run.v2.EmptyDirVolumeSource.Medium}
   */
  public enum Medium implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * When not specified, falls back to the default implementation which
     * is currently in memory (this may change over time).
     * </pre>
     *
     * <code>MEDIUM_UNSPECIFIED = 0;</code>
     */
    MEDIUM_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Explicitly set the EmptyDir to be in memory. Uses tmpfs.
     * </pre>
     *
     * <code>MEMORY = 1;</code>
     */
    MEMORY(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * When not specified, falls back to the default implementation which
     * is currently in memory (this may change over time).
     * </pre>
     *
     * <code>MEDIUM_UNSPECIFIED = 0;</code>
     */
    public static final int MEDIUM_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Explicitly set the EmptyDir to be in memory. Uses tmpfs.
     * </pre>
     *
     * <code>MEMORY = 1;</code>
     */
    public static final int MEMORY_VALUE = 1;

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
    public static Medium valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Medium forNumber(int value) {
      switch (value) {
        case 0:
          return MEDIUM_UNSPECIFIED;
        case 1:
          return MEMORY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Medium> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Medium> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Medium>() {
          public Medium findValueByNumber(int number) {
            return Medium.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.run.v2.EmptyDirVolumeSource.getDescriptor().getEnumTypes().get(0);
    }

    private static final Medium[] VALUES = values();

    public static Medium valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Medium(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.run.v2.EmptyDirVolumeSource.Medium)
  }

  public static final int MEDIUM_FIELD_NUMBER = 1;
  private int medium_ = 0;
  /**
   *
   *
   * <pre>
   * The medium on which the data is stored. Acceptable values today is only
   * MEMORY or none. When none, the default will currently be backed by memory
   * but could change over time. +optional
   * </pre>
   *
   * <code>.google.cloud.run.v2.EmptyDirVolumeSource.Medium medium = 1;</code>
   *
   * @return The enum numeric value on the wire for medium.
   */
  @java.lang.Override
  public int getMediumValue() {
    return medium_;
  }
  /**
   *
   *
   * <pre>
   * The medium on which the data is stored. Acceptable values today is only
   * MEMORY or none. When none, the default will currently be backed by memory
   * but could change over time. +optional
   * </pre>
   *
   * <code>.google.cloud.run.v2.EmptyDirVolumeSource.Medium medium = 1;</code>
   *
   * @return The medium.
   */
  @java.lang.Override
  public com.google.cloud.run.v2.EmptyDirVolumeSource.Medium getMedium() {
    com.google.cloud.run.v2.EmptyDirVolumeSource.Medium result =
        com.google.cloud.run.v2.EmptyDirVolumeSource.Medium.forNumber(medium_);
    return result == null
        ? com.google.cloud.run.v2.EmptyDirVolumeSource.Medium.UNRECOGNIZED
        : result;
  }

  public static final int SIZE_LIMIT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sizeLimit_ = "";
  /**
   *
   *
   * <pre>
   * Limit on the storage usable by this EmptyDir volume.
   * The size limit is also applicable for memory medium.
   * The maximum usage on memory medium EmptyDir would be the minimum value
   * between the SizeLimit specified here and the sum of memory limits of all
   * containers. The default is nil which means that the limit is undefined.
   * More info:
   * https://cloud.google.com/run/docs/configuring/in-memory-volumes#configure-volume.
   * Info in Kubernetes:
   * https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
   * </pre>
   *
   * <code>string size_limit = 2;</code>
   *
   * @return The sizeLimit.
   */
  @java.lang.Override
  public java.lang.String getSizeLimit() {
    java.lang.Object ref = sizeLimit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sizeLimit_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Limit on the storage usable by this EmptyDir volume.
   * The size limit is also applicable for memory medium.
   * The maximum usage on memory medium EmptyDir would be the minimum value
   * between the SizeLimit specified here and the sum of memory limits of all
   * containers. The default is nil which means that the limit is undefined.
   * More info:
   * https://cloud.google.com/run/docs/configuring/in-memory-volumes#configure-volume.
   * Info in Kubernetes:
   * https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
   * </pre>
   *
   * <code>string size_limit = 2;</code>
   *
   * @return The bytes for sizeLimit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSizeLimitBytes() {
    java.lang.Object ref = sizeLimit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sizeLimit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (medium_
        != com.google.cloud.run.v2.EmptyDirVolumeSource.Medium.MEDIUM_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, medium_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sizeLimit_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sizeLimit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (medium_
        != com.google.cloud.run.v2.EmptyDirVolumeSource.Medium.MEDIUM_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, medium_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sizeLimit_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sizeLimit_);
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
    if (!(obj instanceof com.google.cloud.run.v2.EmptyDirVolumeSource)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.EmptyDirVolumeSource other =
        (com.google.cloud.run.v2.EmptyDirVolumeSource) obj;

    if (medium_ != other.medium_) return false;
    if (!getSizeLimit().equals(other.getSizeLimit())) return false;
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
    hash = (37 * hash) + MEDIUM_FIELD_NUMBER;
    hash = (53 * hash) + medium_;
    hash = (37 * hash) + SIZE_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getSizeLimit().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.EmptyDirVolumeSource prototype) {
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
   * In memory (tmpfs) ephemeral storage.
   * It is ephemeral in the sense that when the sandbox is taken down, the data is
   * destroyed with it (it does not persist across sandbox runs).
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.EmptyDirVolumeSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.EmptyDirVolumeSource)
      com.google.cloud.run.v2.EmptyDirVolumeSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_EmptyDirVolumeSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_EmptyDirVolumeSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.EmptyDirVolumeSource.class,
              com.google.cloud.run.v2.EmptyDirVolumeSource.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.EmptyDirVolumeSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      medium_ = 0;
      sizeLimit_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_EmptyDirVolumeSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.EmptyDirVolumeSource getDefaultInstanceForType() {
      return com.google.cloud.run.v2.EmptyDirVolumeSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.EmptyDirVolumeSource build() {
      com.google.cloud.run.v2.EmptyDirVolumeSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.EmptyDirVolumeSource buildPartial() {
      com.google.cloud.run.v2.EmptyDirVolumeSource result =
          new com.google.cloud.run.v2.EmptyDirVolumeSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.EmptyDirVolumeSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.medium_ = medium_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sizeLimit_ = sizeLimit_;
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
      if (other instanceof com.google.cloud.run.v2.EmptyDirVolumeSource) {
        return mergeFrom((com.google.cloud.run.v2.EmptyDirVolumeSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.EmptyDirVolumeSource other) {
      if (other == com.google.cloud.run.v2.EmptyDirVolumeSource.getDefaultInstance()) return this;
      if (other.medium_ != 0) {
        setMediumValue(other.getMediumValue());
      }
      if (!other.getSizeLimit().isEmpty()) {
        sizeLimit_ = other.sizeLimit_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 8:
              {
                medium_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                sizeLimit_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private int medium_ = 0;
    /**
     *
     *
     * <pre>
     * The medium on which the data is stored. Acceptable values today is only
     * MEMORY or none. When none, the default will currently be backed by memory
     * but could change over time. +optional
     * </pre>
     *
     * <code>.google.cloud.run.v2.EmptyDirVolumeSource.Medium medium = 1;</code>
     *
     * @return The enum numeric value on the wire for medium.
     */
    @java.lang.Override
    public int getMediumValue() {
      return medium_;
    }
    /**
     *
     *
     * <pre>
     * The medium on which the data is stored. Acceptable values today is only
     * MEMORY or none. When none, the default will currently be backed by memory
     * but could change over time. +optional
     * </pre>
     *
     * <code>.google.cloud.run.v2.EmptyDirVolumeSource.Medium medium = 1;</code>
     *
     * @param value The enum numeric value on the wire for medium to set.
     * @return This builder for chaining.
     */
    public Builder setMediumValue(int value) {
      medium_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The medium on which the data is stored. Acceptable values today is only
     * MEMORY or none. When none, the default will currently be backed by memory
     * but could change over time. +optional
     * </pre>
     *
     * <code>.google.cloud.run.v2.EmptyDirVolumeSource.Medium medium = 1;</code>
     *
     * @return The medium.
     */
    @java.lang.Override
    public com.google.cloud.run.v2.EmptyDirVolumeSource.Medium getMedium() {
      com.google.cloud.run.v2.EmptyDirVolumeSource.Medium result =
          com.google.cloud.run.v2.EmptyDirVolumeSource.Medium.forNumber(medium_);
      return result == null
          ? com.google.cloud.run.v2.EmptyDirVolumeSource.Medium.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The medium on which the data is stored. Acceptable values today is only
     * MEMORY or none. When none, the default will currently be backed by memory
     * but could change over time. +optional
     * </pre>
     *
     * <code>.google.cloud.run.v2.EmptyDirVolumeSource.Medium medium = 1;</code>
     *
     * @param value The medium to set.
     * @return This builder for chaining.
     */
    public Builder setMedium(com.google.cloud.run.v2.EmptyDirVolumeSource.Medium value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      medium_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The medium on which the data is stored. Acceptable values today is only
     * MEMORY or none. When none, the default will currently be backed by memory
     * but could change over time. +optional
     * </pre>
     *
     * <code>.google.cloud.run.v2.EmptyDirVolumeSource.Medium medium = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMedium() {
      bitField0_ = (bitField0_ & ~0x00000001);
      medium_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sizeLimit_ = "";
    /**
     *
     *
     * <pre>
     * Limit on the storage usable by this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value
     * between the SizeLimit specified here and the sum of memory limits of all
     * containers. The default is nil which means that the limit is undefined.
     * More info:
     * https://cloud.google.com/run/docs/configuring/in-memory-volumes#configure-volume.
     * Info in Kubernetes:
     * https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
     * </pre>
     *
     * <code>string size_limit = 2;</code>
     *
     * @return The sizeLimit.
     */
    public java.lang.String getSizeLimit() {
      java.lang.Object ref = sizeLimit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sizeLimit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Limit on the storage usable by this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value
     * between the SizeLimit specified here and the sum of memory limits of all
     * containers. The default is nil which means that the limit is undefined.
     * More info:
     * https://cloud.google.com/run/docs/configuring/in-memory-volumes#configure-volume.
     * Info in Kubernetes:
     * https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
     * </pre>
     *
     * <code>string size_limit = 2;</code>
     *
     * @return The bytes for sizeLimit.
     */
    public com.google.protobuf.ByteString getSizeLimitBytes() {
      java.lang.Object ref = sizeLimit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sizeLimit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Limit on the storage usable by this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value
     * between the SizeLimit specified here and the sum of memory limits of all
     * containers. The default is nil which means that the limit is undefined.
     * More info:
     * https://cloud.google.com/run/docs/configuring/in-memory-volumes#configure-volume.
     * Info in Kubernetes:
     * https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
     * </pre>
     *
     * <code>string size_limit = 2;</code>
     *
     * @param value The sizeLimit to set.
     * @return This builder for chaining.
     */
    public Builder setSizeLimit(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sizeLimit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Limit on the storage usable by this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value
     * between the SizeLimit specified here and the sum of memory limits of all
     * containers. The default is nil which means that the limit is undefined.
     * More info:
     * https://cloud.google.com/run/docs/configuring/in-memory-volumes#configure-volume.
     * Info in Kubernetes:
     * https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
     * </pre>
     *
     * <code>string size_limit = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSizeLimit() {
      sizeLimit_ = getDefaultInstance().getSizeLimit();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Limit on the storage usable by this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value
     * between the SizeLimit specified here and the sum of memory limits of all
     * containers. The default is nil which means that the limit is undefined.
     * More info:
     * https://cloud.google.com/run/docs/configuring/in-memory-volumes#configure-volume.
     * Info in Kubernetes:
     * https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
     * </pre>
     *
     * <code>string size_limit = 2;</code>
     *
     * @param value The bytes for sizeLimit to set.
     * @return This builder for chaining.
     */
    public Builder setSizeLimitBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sizeLimit_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.EmptyDirVolumeSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.EmptyDirVolumeSource)
  private static final com.google.cloud.run.v2.EmptyDirVolumeSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.EmptyDirVolumeSource();
  }

  public static com.google.cloud.run.v2.EmptyDirVolumeSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmptyDirVolumeSource> PARSER =
      new com.google.protobuf.AbstractParser<EmptyDirVolumeSource>() {
        @java.lang.Override
        public EmptyDirVolumeSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmptyDirVolumeSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmptyDirVolumeSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.EmptyDirVolumeSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
