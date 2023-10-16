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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

/**
 *
 *
 * <pre>
 * ManagedActiveDirectoryConfig contains all the parameters for connecting
 * to Managed Active Directory.
 * </pre>
 *
 * Protobuf type {@code google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig}
 */
public final class ManagedActiveDirectoryConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig)
    ManagedActiveDirectoryConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ManagedActiveDirectoryConfig.newBuilder() to construct.
  private ManagedActiveDirectoryConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ManagedActiveDirectoryConfig() {
    domain_ = "";
    computer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ManagedActiveDirectoryConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
        .internal_static_google_cloud_filestore_v1beta1_ManagedActiveDirectoryConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
        .internal_static_google_cloud_filestore_v1beta1_ManagedActiveDirectoryConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig.class,
            com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig.Builder.class);
  }

  public static final int DOMAIN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object domain_ = "";
  /**
   *
   *
   * <pre>
   * Fully qualified domain name.
   * </pre>
   *
   * <code>string domain = 1;</code>
   *
   * @return The domain.
   */
  @java.lang.Override
  public java.lang.String getDomain() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domain_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Fully qualified domain name.
   * </pre>
   *
   * <code>string domain = 1;</code>
   *
   * @return The bytes for domain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDomainBytes() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      domain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPUTER_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object computer_ = "";
  /**
   *
   *
   * <pre>
   * The computer name is used as a prefix to the mount remote target.
   * Example: if the computer_name is `my-computer`, the mount command will
   * look like: `$mount -o vers=4,sec=krb5
   * my-computer.filestore.&lt;domain&gt;:&lt;share&gt;`.
   * </pre>
   *
   * <code>string computer = 2;</code>
   *
   * @return The computer.
   */
  @java.lang.Override
  public java.lang.String getComputer() {
    java.lang.Object ref = computer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      computer_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The computer name is used as a prefix to the mount remote target.
   * Example: if the computer_name is `my-computer`, the mount command will
   * look like: `$mount -o vers=4,sec=krb5
   * my-computer.filestore.&lt;domain&gt;:&lt;share&gt;`.
   * </pre>
   *
   * <code>string computer = 2;</code>
   *
   * @return The bytes for computer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getComputerBytes() {
    java.lang.Object ref = computer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      computer_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, domain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(computer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, computer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, domain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(computer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, computer_);
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
    if (!(obj instanceof com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig other =
        (com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig) obj;

    if (!getDomain().equals(other.getDomain())) return false;
    if (!getComputer().equals(other.getComputer())) return false;
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
    hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getDomain().hashCode();
    hash = (37 * hash) + COMPUTER_FIELD_NUMBER;
    hash = (53 * hash) + getComputer().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig prototype) {
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
   * ManagedActiveDirectoryConfig contains all the parameters for connecting
   * to Managed Active Directory.
   * </pre>
   *
   * Protobuf type {@code google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig)
      com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_ManagedActiveDirectoryConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_ManagedActiveDirectoryConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig.class,
              com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig.Builder.class);
    }

    // Construct using com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      domain_ = "";
      computer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_ManagedActiveDirectoryConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig
        getDefaultInstanceForType() {
      return com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig build() {
      com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig buildPartial() {
      com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig result =
          new com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.domain_ = domain_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.computer_ = computer_;
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
      if (other instanceof com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig) {
        return mergeFrom((com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig other) {
      if (other
          == com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig.getDefaultInstance())
        return this;
      if (!other.getDomain().isEmpty()) {
        domain_ = other.domain_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getComputer().isEmpty()) {
        computer_ = other.computer_;
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
            case 10:
              {
                domain_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                computer_ = input.readStringRequireUtf8();
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

    private java.lang.Object domain_ = "";
    /**
     *
     *
     * <pre>
     * Fully qualified domain name.
     * </pre>
     *
     * <code>string domain = 1;</code>
     *
     * @return The domain.
     */
    public java.lang.String getDomain() {
      java.lang.Object ref = domain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name.
     * </pre>
     *
     * <code>string domain = 1;</code>
     *
     * @return The bytes for domain.
     */
    public com.google.protobuf.ByteString getDomainBytes() {
      java.lang.Object ref = domain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        domain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name.
     * </pre>
     *
     * <code>string domain = 1;</code>
     *
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      domain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name.
     * </pre>
     *
     * <code>string domain = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      domain_ = getDefaultInstance().getDomain();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name.
     * </pre>
     *
     * <code>string domain = 1;</code>
     *
     * @param value The bytes for domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomainBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      domain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object computer_ = "";
    /**
     *
     *
     * <pre>
     * The computer name is used as a prefix to the mount remote target.
     * Example: if the computer_name is `my-computer`, the mount command will
     * look like: `$mount -o vers=4,sec=krb5
     * my-computer.filestore.&lt;domain&gt;:&lt;share&gt;`.
     * </pre>
     *
     * <code>string computer = 2;</code>
     *
     * @return The computer.
     */
    public java.lang.String getComputer() {
      java.lang.Object ref = computer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        computer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The computer name is used as a prefix to the mount remote target.
     * Example: if the computer_name is `my-computer`, the mount command will
     * look like: `$mount -o vers=4,sec=krb5
     * my-computer.filestore.&lt;domain&gt;:&lt;share&gt;`.
     * </pre>
     *
     * <code>string computer = 2;</code>
     *
     * @return The bytes for computer.
     */
    public com.google.protobuf.ByteString getComputerBytes() {
      java.lang.Object ref = computer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        computer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The computer name is used as a prefix to the mount remote target.
     * Example: if the computer_name is `my-computer`, the mount command will
     * look like: `$mount -o vers=4,sec=krb5
     * my-computer.filestore.&lt;domain&gt;:&lt;share&gt;`.
     * </pre>
     *
     * <code>string computer = 2;</code>
     *
     * @param value The computer to set.
     * @return This builder for chaining.
     */
    public Builder setComputer(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      computer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The computer name is used as a prefix to the mount remote target.
     * Example: if the computer_name is `my-computer`, the mount command will
     * look like: `$mount -o vers=4,sec=krb5
     * my-computer.filestore.&lt;domain&gt;:&lt;share&gt;`.
     * </pre>
     *
     * <code>string computer = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearComputer() {
      computer_ = getDefaultInstance().getComputer();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The computer name is used as a prefix to the mount remote target.
     * Example: if the computer_name is `my-computer`, the mount command will
     * look like: `$mount -o vers=4,sec=krb5
     * my-computer.filestore.&lt;domain&gt;:&lt;share&gt;`.
     * </pre>
     *
     * <code>string computer = 2;</code>
     *
     * @param value The bytes for computer to set.
     * @return This builder for chaining.
     */
    public Builder setComputerBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      computer_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig)
  private static final com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig();
  }

  public static com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagedActiveDirectoryConfig> PARSER =
      new com.google.protobuf.AbstractParser<ManagedActiveDirectoryConfig>() {
        @java.lang.Override
        public ManagedActiveDirectoryConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManagedActiveDirectoryConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagedActiveDirectoryConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.ManagedActiveDirectoryConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
