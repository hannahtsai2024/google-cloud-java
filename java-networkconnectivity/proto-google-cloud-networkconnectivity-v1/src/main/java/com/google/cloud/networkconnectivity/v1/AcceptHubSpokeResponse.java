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
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

/**
 *
 *
 * <pre>
 * The response for
 * [HubService.AcceptHubSpoke][google.cloud.networkconnectivity.v1.HubService.AcceptHubSpoke].
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse}
 */
public final class AcceptHubSpokeResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse)
    AcceptHubSpokeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcceptHubSpokeResponse.newBuilder() to construct.
  private AcceptHubSpokeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcceptHubSpokeResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcceptHubSpokeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_AcceptHubSpokeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_AcceptHubSpokeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse.class,
            com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse.Builder.class);
  }

  public static final int SPOKE_FIELD_NUMBER = 1;
  private com.google.cloud.networkconnectivity.v1.Spoke spoke_;
  /**
   *
   *
   * <pre>
   * The spoke that was operated on.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
   *
   * @return Whether the spoke field is set.
   */
  @java.lang.Override
  public boolean hasSpoke() {
    return spoke_ != null;
  }
  /**
   *
   *
   * <pre>
   * The spoke that was operated on.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
   *
   * @return The spoke.
   */
  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.Spoke getSpoke() {
    return spoke_ == null
        ? com.google.cloud.networkconnectivity.v1.Spoke.getDefaultInstance()
        : spoke_;
  }
  /**
   *
   *
   * <pre>
   * The spoke that was operated on.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.SpokeOrBuilder getSpokeOrBuilder() {
    return spoke_ == null
        ? com.google.cloud.networkconnectivity.v1.Spoke.getDefaultInstance()
        : spoke_;
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
    if (spoke_ != null) {
      output.writeMessage(1, getSpoke());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spoke_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSpoke());
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
    if (!(obj instanceof com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse other =
        (com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse) obj;

    if (hasSpoke() != other.hasSpoke()) return false;
    if (hasSpoke()) {
      if (!getSpoke().equals(other.getSpoke())) return false;
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
    if (hasSpoke()) {
      hash = (37 * hash) + SPOKE_FIELD_NUMBER;
      hash = (53 * hash) + getSpoke().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse parseFrom(
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
      com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse prototype) {
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
   * The response for
   * [HubService.AcceptHubSpoke][google.cloud.networkconnectivity.v1.HubService.AcceptHubSpoke].
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse)
      com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_AcceptHubSpokeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_AcceptHubSpokeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse.class,
              com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse.Builder.class);
    }

    // Construct using com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      spoke_ = null;
      if (spokeBuilder_ != null) {
        spokeBuilder_.dispose();
        spokeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_AcceptHubSpokeResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse
        getDefaultInstanceForType() {
      return com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse build() {
      com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse buildPartial() {
      com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse result =
          new com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.spoke_ = spokeBuilder_ == null ? spoke_ : spokeBuilder_.build();
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
      if (other instanceof com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse) {
        return mergeFrom((com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse other) {
      if (other
          == com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse.getDefaultInstance())
        return this;
      if (other.hasSpoke()) {
        mergeSpoke(other.getSpoke());
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
                input.readMessage(getSpokeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.networkconnectivity.v1.Spoke spoke_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkconnectivity.v1.Spoke,
            com.google.cloud.networkconnectivity.v1.Spoke.Builder,
            com.google.cloud.networkconnectivity.v1.SpokeOrBuilder>
        spokeBuilder_;
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     *
     * @return Whether the spoke field is set.
     */
    public boolean hasSpoke() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     *
     * @return The spoke.
     */
    public com.google.cloud.networkconnectivity.v1.Spoke getSpoke() {
      if (spokeBuilder_ == null) {
        return spoke_ == null
            ? com.google.cloud.networkconnectivity.v1.Spoke.getDefaultInstance()
            : spoke_;
      } else {
        return spokeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     */
    public Builder setSpoke(com.google.cloud.networkconnectivity.v1.Spoke value) {
      if (spokeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spoke_ = value;
      } else {
        spokeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     */
    public Builder setSpoke(com.google.cloud.networkconnectivity.v1.Spoke.Builder builderForValue) {
      if (spokeBuilder_ == null) {
        spoke_ = builderForValue.build();
      } else {
        spokeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     */
    public Builder mergeSpoke(com.google.cloud.networkconnectivity.v1.Spoke value) {
      if (spokeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && spoke_ != null
            && spoke_ != com.google.cloud.networkconnectivity.v1.Spoke.getDefaultInstance()) {
          getSpokeBuilder().mergeFrom(value);
        } else {
          spoke_ = value;
        }
      } else {
        spokeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     */
    public Builder clearSpoke() {
      bitField0_ = (bitField0_ & ~0x00000001);
      spoke_ = null;
      if (spokeBuilder_ != null) {
        spokeBuilder_.dispose();
        spokeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     */
    public com.google.cloud.networkconnectivity.v1.Spoke.Builder getSpokeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpokeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     */
    public com.google.cloud.networkconnectivity.v1.SpokeOrBuilder getSpokeOrBuilder() {
      if (spokeBuilder_ != null) {
        return spokeBuilder_.getMessageOrBuilder();
      } else {
        return spoke_ == null
            ? com.google.cloud.networkconnectivity.v1.Spoke.getDefaultInstance()
            : spoke_;
      }
    }
    /**
     *
     *
     * <pre>
     * The spoke that was operated on.
     * </pre>
     *
     * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkconnectivity.v1.Spoke,
            com.google.cloud.networkconnectivity.v1.Spoke.Builder,
            com.google.cloud.networkconnectivity.v1.SpokeOrBuilder>
        getSpokeFieldBuilder() {
      if (spokeBuilder_ == null) {
        spokeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.networkconnectivity.v1.Spoke,
                com.google.cloud.networkconnectivity.v1.Spoke.Builder,
                com.google.cloud.networkconnectivity.v1.SpokeOrBuilder>(
                getSpoke(), getParentForChildren(), isClean());
        spoke_ = null;
      }
      return spokeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse)
  private static final com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse();
  }

  public static com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceptHubSpokeResponse> PARSER =
      new com.google.protobuf.AbstractParser<AcceptHubSpokeResponse>() {
        @java.lang.Override
        public AcceptHubSpokeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcceptHubSpokeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceptHubSpokeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.AcceptHubSpokeResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
