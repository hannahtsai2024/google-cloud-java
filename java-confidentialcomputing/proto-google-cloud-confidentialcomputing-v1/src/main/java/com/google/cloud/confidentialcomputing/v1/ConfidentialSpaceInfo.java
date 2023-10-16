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
// source: google/cloud/confidentialcomputing/v1/service.proto

package com.google.cloud.confidentialcomputing.v1;

/**
 *
 *
 * <pre>
 * ConfidentialSpaceInfo contains information related to the Confidential Space
 * TEE.
 * </pre>
 *
 * Protobuf type {@code google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo}
 */
public final class ConfidentialSpaceInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo)
    ConfidentialSpaceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConfidentialSpaceInfo.newBuilder() to construct.
  private ConfidentialSpaceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConfidentialSpaceInfo() {
    signedEntities_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConfidentialSpaceInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo.class,
            com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo.Builder.class);
  }

  public static final int SIGNED_ENTITIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.confidentialcomputing.v1.SignedEntity> signedEntities_;
  /**
   *
   *
   * <pre>
   * Optional. A list of signed entities containing container image signatures
   * that can be used for server-side signature verification.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.confidentialcomputing.v1.SignedEntity>
      getSignedEntitiesList() {
    return signedEntities_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of signed entities containing container image signatures
   * that can be used for server-side signature verification.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.confidentialcomputing.v1.SignedEntityOrBuilder>
      getSignedEntitiesOrBuilderList() {
    return signedEntities_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of signed entities containing container image signatures
   * that can be used for server-side signature verification.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public int getSignedEntitiesCount() {
    return signedEntities_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of signed entities containing container image signatures
   * that can be used for server-side signature verification.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.SignedEntity getSignedEntities(int index) {
    return signedEntities_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of signed entities containing container image signatures
   * that can be used for server-side signature verification.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.SignedEntityOrBuilder getSignedEntitiesOrBuilder(
      int index) {
    return signedEntities_.get(index);
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
    for (int i = 0; i < signedEntities_.size(); i++) {
      output.writeMessage(1, signedEntities_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < signedEntities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, signedEntities_.get(i));
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
    if (!(obj instanceof com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo other =
        (com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo) obj;

    if (!getSignedEntitiesList().equals(other.getSignedEntitiesList())) return false;
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
    if (getSignedEntitiesCount() > 0) {
      hash = (37 * hash) + SIGNED_ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getSignedEntitiesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo parseFrom(
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
      com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo prototype) {
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
   * ConfidentialSpaceInfo contains information related to the Confidential Space
   * TEE.
   * </pre>
   *
   * Protobuf type {@code google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo)
      com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo.class,
              com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo.Builder.class);
    }

    // Construct using com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (signedEntitiesBuilder_ == null) {
        signedEntities_ = java.util.Collections.emptyList();
      } else {
        signedEntities_ = null;
        signedEntitiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo
        getDefaultInstanceForType() {
      return com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo build() {
      com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo buildPartial() {
      com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo result =
          new com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo result) {
      if (signedEntitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          signedEntities_ = java.util.Collections.unmodifiableList(signedEntities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.signedEntities_ = signedEntities_;
      } else {
        result.signedEntities_ = signedEntitiesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo) {
        return mergeFrom((com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo other) {
      if (other
          == com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo.getDefaultInstance())
        return this;
      if (signedEntitiesBuilder_ == null) {
        if (!other.signedEntities_.isEmpty()) {
          if (signedEntities_.isEmpty()) {
            signedEntities_ = other.signedEntities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSignedEntitiesIsMutable();
            signedEntities_.addAll(other.signedEntities_);
          }
          onChanged();
        }
      } else {
        if (!other.signedEntities_.isEmpty()) {
          if (signedEntitiesBuilder_.isEmpty()) {
            signedEntitiesBuilder_.dispose();
            signedEntitiesBuilder_ = null;
            signedEntities_ = other.signedEntities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            signedEntitiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSignedEntitiesFieldBuilder()
                    : null;
          } else {
            signedEntitiesBuilder_.addAllMessages(other.signedEntities_);
          }
        }
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
                com.google.cloud.confidentialcomputing.v1.SignedEntity m =
                    input.readMessage(
                        com.google.cloud.confidentialcomputing.v1.SignedEntity.parser(),
                        extensionRegistry);
                if (signedEntitiesBuilder_ == null) {
                  ensureSignedEntitiesIsMutable();
                  signedEntities_.add(m);
                } else {
                  signedEntitiesBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.confidentialcomputing.v1.SignedEntity> signedEntities_ =
        java.util.Collections.emptyList();

    private void ensureSignedEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        signedEntities_ =
            new java.util.ArrayList<com.google.cloud.confidentialcomputing.v1.SignedEntity>(
                signedEntities_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.confidentialcomputing.v1.SignedEntity,
            com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder,
            com.google.cloud.confidentialcomputing.v1.SignedEntityOrBuilder>
        signedEntitiesBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<com.google.cloud.confidentialcomputing.v1.SignedEntity>
        getSignedEntitiesList() {
      if (signedEntitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(signedEntities_);
      } else {
        return signedEntitiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public int getSignedEntitiesCount() {
      if (signedEntitiesBuilder_ == null) {
        return signedEntities_.size();
      } else {
        return signedEntitiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.confidentialcomputing.v1.SignedEntity getSignedEntities(int index) {
      if (signedEntitiesBuilder_ == null) {
        return signedEntities_.get(index);
      } else {
        return signedEntitiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSignedEntities(
        int index, com.google.cloud.confidentialcomputing.v1.SignedEntity value) {
      if (signedEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignedEntitiesIsMutable();
        signedEntities_.set(index, value);
        onChanged();
      } else {
        signedEntitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSignedEntities(
        int index, com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder builderForValue) {
      if (signedEntitiesBuilder_ == null) {
        ensureSignedEntitiesIsMutable();
        signedEntities_.set(index, builderForValue.build());
        onChanged();
      } else {
        signedEntitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addSignedEntities(com.google.cloud.confidentialcomputing.v1.SignedEntity value) {
      if (signedEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignedEntitiesIsMutable();
        signedEntities_.add(value);
        onChanged();
      } else {
        signedEntitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addSignedEntities(
        int index, com.google.cloud.confidentialcomputing.v1.SignedEntity value) {
      if (signedEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignedEntitiesIsMutable();
        signedEntities_.add(index, value);
        onChanged();
      } else {
        signedEntitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addSignedEntities(
        com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder builderForValue) {
      if (signedEntitiesBuilder_ == null) {
        ensureSignedEntitiesIsMutable();
        signedEntities_.add(builderForValue.build());
        onChanged();
      } else {
        signedEntitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addSignedEntities(
        int index, com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder builderForValue) {
      if (signedEntitiesBuilder_ == null) {
        ensureSignedEntitiesIsMutable();
        signedEntities_.add(index, builderForValue.build());
        onChanged();
      } else {
        signedEntitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addAllSignedEntities(
        java.lang.Iterable<? extends com.google.cloud.confidentialcomputing.v1.SignedEntity>
            values) {
      if (signedEntitiesBuilder_ == null) {
        ensureSignedEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, signedEntities_);
        onChanged();
      } else {
        signedEntitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearSignedEntities() {
      if (signedEntitiesBuilder_ == null) {
        signedEntities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        signedEntitiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder removeSignedEntities(int index) {
      if (signedEntitiesBuilder_ == null) {
        ensureSignedEntitiesIsMutable();
        signedEntities_.remove(index);
        onChanged();
      } else {
        signedEntitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder getSignedEntitiesBuilder(
        int index) {
      return getSignedEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.confidentialcomputing.v1.SignedEntityOrBuilder
        getSignedEntitiesOrBuilder(int index) {
      if (signedEntitiesBuilder_ == null) {
        return signedEntities_.get(index);
      } else {
        return signedEntitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.confidentialcomputing.v1.SignedEntityOrBuilder>
        getSignedEntitiesOrBuilderList() {
      if (signedEntitiesBuilder_ != null) {
        return signedEntitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(signedEntities_);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder
        addSignedEntitiesBuilder() {
      return getSignedEntitiesFieldBuilder()
          .addBuilder(com.google.cloud.confidentialcomputing.v1.SignedEntity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder addSignedEntitiesBuilder(
        int index) {
      return getSignedEntitiesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.confidentialcomputing.v1.SignedEntity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of signed entities containing container image signatures
     * that can be used for server-side signature verification.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.confidentialcomputing.v1.SignedEntity signed_entities = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder>
        getSignedEntitiesBuilderList() {
      return getSignedEntitiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.confidentialcomputing.v1.SignedEntity,
            com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder,
            com.google.cloud.confidentialcomputing.v1.SignedEntityOrBuilder>
        getSignedEntitiesFieldBuilder() {
      if (signedEntitiesBuilder_ == null) {
        signedEntitiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.confidentialcomputing.v1.SignedEntity,
                com.google.cloud.confidentialcomputing.v1.SignedEntity.Builder,
                com.google.cloud.confidentialcomputing.v1.SignedEntityOrBuilder>(
                signedEntities_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        signedEntities_ = null;
      }
      return signedEntitiesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo)
  private static final com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo();
  }

  public static com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfidentialSpaceInfo> PARSER =
      new com.google.protobuf.AbstractParser<ConfidentialSpaceInfo>() {
        @java.lang.Override
        public ConfidentialSpaceInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfidentialSpaceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfidentialSpaceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
