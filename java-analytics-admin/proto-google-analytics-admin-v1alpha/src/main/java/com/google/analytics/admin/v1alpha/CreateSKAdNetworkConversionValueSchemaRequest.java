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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for CreateSKAdNetworkConversionValueSchema RPC.
 * </pre>
 *
 * Protobuf type {@code
 * google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest}
 */
public final class CreateSKAdNetworkConversionValueSchemaRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest)
    CreateSKAdNetworkConversionValueSchemaRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSKAdNetworkConversionValueSchemaRequest.newBuilder() to construct.
  private CreateSKAdNetworkConversionValueSchemaRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSKAdNetworkConversionValueSchemaRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSKAdNetworkConversionValueSchemaRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateSKAdNetworkConversionValueSchemaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateSKAdNetworkConversionValueSchemaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest.class,
            com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest.Builder
                .class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this schema will be created.
   * Format: properties/{property}/dataStreams/{dataStream}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this schema will be created.
   * Format: properties/{property}/dataStreams/{dataStream}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKADNETWORK_CONVERSION_VALUE_SCHEMA_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
      skadnetworkConversionValueSchema_;
  /**
   *
   *
   * <pre>
   * Required. SKAdNetwork conversion value schema to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the skadnetworkConversionValueSchema field is set.
   */
  @java.lang.Override
  public boolean hasSkadnetworkConversionValueSchema() {
    return skadnetworkConversionValueSchema_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. SKAdNetwork conversion value schema to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The skadnetworkConversionValueSchema.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
      getSkadnetworkConversionValueSchema() {
    return skadnetworkConversionValueSchema_ == null
        ? com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema.getDefaultInstance()
        : skadnetworkConversionValueSchema_;
  }
  /**
   *
   *
   * <pre>
   * Required. SKAdNetwork conversion value schema to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchemaOrBuilder
      getSkadnetworkConversionValueSchemaOrBuilder() {
    return skadnetworkConversionValueSchema_ == null
        ? com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema.getDefaultInstance()
        : skadnetworkConversionValueSchema_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (skadnetworkConversionValueSchema_ != null) {
      output.writeMessage(2, getSkadnetworkConversionValueSchema());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (skadnetworkConversionValueSchema_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getSkadnetworkConversionValueSchema());
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
    if (!(obj
        instanceof
        com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest other =
        (com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSkadnetworkConversionValueSchema() != other.hasSkadnetworkConversionValueSchema())
      return false;
    if (hasSkadnetworkConversionValueSchema()) {
      if (!getSkadnetworkConversionValueSchema()
          .equals(other.getSkadnetworkConversionValueSchema())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSkadnetworkConversionValueSchema()) {
      hash = (37 * hash) + SKADNETWORK_CONVERSION_VALUE_SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getSkadnetworkConversionValueSchema().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest prototype) {
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
   * Request message for CreateSKAdNetworkConversionValueSchema RPC.
   * </pre>
   *
   * Protobuf type {@code
   * google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest)
      com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateSKAdNetworkConversionValueSchemaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateSKAdNetworkConversionValueSchemaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
                  .class,
              com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
                  .Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      skadnetworkConversionValueSchema_ = null;
      if (skadnetworkConversionValueSchemaBuilder_ != null) {
        skadnetworkConversionValueSchemaBuilder_.dispose();
        skadnetworkConversionValueSchemaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateSKAdNetworkConversionValueSchemaRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
        build() {
      com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
        buildPartial() {
      com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest result =
          new com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest(
              this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skadnetworkConversionValueSchema_ =
            skadnetworkConversionValueSchemaBuilder_ == null
                ? skadnetworkConversionValueSchema_
                : skadnetworkConversionValueSchemaBuilder_.build();
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
      if (other
          instanceof
          com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSkadnetworkConversionValueSchema()) {
        mergeSkadnetworkConversionValueSchema(other.getSkadnetworkConversionValueSchema());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getSkadnetworkConversionValueSchemaFieldBuilder().getBuilder(),
                    extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this schema will be created.
     * Format: properties/{property}/dataStreams/{dataStream}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this schema will be created.
     * Format: properties/{property}/dataStreams/{dataStream}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this schema will be created.
     * Format: properties/{property}/dataStreams/{dataStream}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this schema will be created.
     * Format: properties/{property}/dataStreams/{dataStream}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this schema will be created.
     * Format: properties/{property}/dataStreams/{dataStream}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
        skadnetworkConversionValueSchema_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema,
            com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema.Builder,
            com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchemaOrBuilder>
        skadnetworkConversionValueSchemaBuilder_;
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the skadnetworkConversionValueSchema field is set.
     */
    public boolean hasSkadnetworkConversionValueSchema() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The skadnetworkConversionValueSchema.
     */
    public com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
        getSkadnetworkConversionValueSchema() {
      if (skadnetworkConversionValueSchemaBuilder_ == null) {
        return skadnetworkConversionValueSchema_ == null
            ? com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
                .getDefaultInstance()
            : skadnetworkConversionValueSchema_;
      } else {
        return skadnetworkConversionValueSchemaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSkadnetworkConversionValueSchema(
        com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema value) {
      if (skadnetworkConversionValueSchemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skadnetworkConversionValueSchema_ = value;
      } else {
        skadnetworkConversionValueSchemaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSkadnetworkConversionValueSchema(
        com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema.Builder
            builderForValue) {
      if (skadnetworkConversionValueSchemaBuilder_ == null) {
        skadnetworkConversionValueSchema_ = builderForValue.build();
      } else {
        skadnetworkConversionValueSchemaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSkadnetworkConversionValueSchema(
        com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema value) {
      if (skadnetworkConversionValueSchemaBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && skadnetworkConversionValueSchema_ != null
            && skadnetworkConversionValueSchema_
                != com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
                    .getDefaultInstance()) {
          getSkadnetworkConversionValueSchemaBuilder().mergeFrom(value);
        } else {
          skadnetworkConversionValueSchema_ = value;
        }
      } else {
        skadnetworkConversionValueSchemaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSkadnetworkConversionValueSchema() {
      bitField0_ = (bitField0_ & ~0x00000002);
      skadnetworkConversionValueSchema_ = null;
      if (skadnetworkConversionValueSchemaBuilder_ != null) {
        skadnetworkConversionValueSchemaBuilder_.dispose();
        skadnetworkConversionValueSchemaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema.Builder
        getSkadnetworkConversionValueSchemaBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSkadnetworkConversionValueSchemaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchemaOrBuilder
        getSkadnetworkConversionValueSchemaOrBuilder() {
      if (skadnetworkConversionValueSchemaBuilder_ != null) {
        return skadnetworkConversionValueSchemaBuilder_.getMessageOrBuilder();
      } else {
        return skadnetworkConversionValueSchema_ == null
            ? com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema
                .getDefaultInstance()
            : skadnetworkConversionValueSchema_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. SKAdNetwork conversion value schema to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema skadnetwork_conversion_value_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema,
            com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema.Builder,
            com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchemaOrBuilder>
        getSkadnetworkConversionValueSchemaFieldBuilder() {
      if (skadnetworkConversionValueSchemaBuilder_ == null) {
        skadnetworkConversionValueSchemaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema,
                com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchema.Builder,
                com.google.analytics.admin.v1alpha.SKAdNetworkConversionValueSchemaOrBuilder>(
                getSkadnetworkConversionValueSchema(), getParentForChildren(), isClean());
        skadnetworkConversionValueSchema_ = null;
      }
      return skadnetworkConversionValueSchemaBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest)
  private static final com.google.analytics.admin.v1alpha
          .CreateSKAdNetworkConversionValueSchemaRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSKAdNetworkConversionValueSchemaRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<CreateSKAdNetworkConversionValueSchemaRequest>() {
            @java.lang.Override
            public CreateSKAdNetworkConversionValueSchemaRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<CreateSKAdNetworkConversionValueSchemaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSKAdNetworkConversionValueSchemaRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateSKAdNetworkConversionValueSchemaRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
