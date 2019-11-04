/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

/**
 *
 *
 * <pre>
 * Specifies the resources used to actively manage an instance group.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.ManagedGroupConfig}
 */
public final class ManagedGroupConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.ManagedGroupConfig)
    ManagedGroupConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ManagedGroupConfig.newBuilder() to construct.
  private ManagedGroupConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ManagedGroupConfig() {
    instanceTemplateName_ = "";
    instanceGroupManagerName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ManagedGroupConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              instanceTemplateName_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              instanceGroupManagerName_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1beta2.ClustersProto
        .internal_static_google_cloud_dataproc_v1beta2_ManagedGroupConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.ClustersProto
        .internal_static_google_cloud_dataproc_v1beta2_ManagedGroupConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.ManagedGroupConfig.class,
            com.google.cloud.dataproc.v1beta2.ManagedGroupConfig.Builder.class);
  }

  public static final int INSTANCE_TEMPLATE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object instanceTemplateName_;
  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Template used for the Managed
   * Instance Group.
   * </pre>
   *
   * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public java.lang.String getInstanceTemplateName() {
    java.lang.Object ref = instanceTemplateName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceTemplateName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Template used for the Managed
   * Instance Group.
   * </pre>
   *
   * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public com.google.protobuf.ByteString getInstanceTemplateNameBytes() {
    java.lang.Object ref = instanceTemplateName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceTemplateName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_GROUP_MANAGER_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object instanceGroupManagerName_;
  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Group Manager for this group.
   * </pre>
   *
   * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public java.lang.String getInstanceGroupManagerName() {
    java.lang.Object ref = instanceGroupManagerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceGroupManagerName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Group Manager for this group.
   * </pre>
   *
   * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public com.google.protobuf.ByteString getInstanceGroupManagerNameBytes() {
    java.lang.Object ref = instanceGroupManagerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceGroupManagerName_ = b;
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
    if (!getInstanceTemplateNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceTemplateName_);
    }
    if (!getInstanceGroupManagerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceGroupManagerName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInstanceTemplateNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceTemplateName_);
    }
    if (!getInstanceGroupManagerNameBytes().isEmpty()) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceGroupManagerName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.ManagedGroupConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.ManagedGroupConfig other =
        (com.google.cloud.dataproc.v1beta2.ManagedGroupConfig) obj;

    if (!getInstanceTemplateName().equals(other.getInstanceTemplateName())) return false;
    if (!getInstanceGroupManagerName().equals(other.getInstanceGroupManagerName())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INSTANCE_TEMPLATE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceTemplateName().hashCode();
    hash = (37 * hash) + INSTANCE_GROUP_MANAGER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceGroupManagerName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.ManagedGroupConfig prototype) {
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
   * Specifies the resources used to actively manage an instance group.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.ManagedGroupConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.ManagedGroupConfig)
      com.google.cloud.dataproc.v1beta2.ManagedGroupConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.ClustersProto
          .internal_static_google_cloud_dataproc_v1beta2_ManagedGroupConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.ClustersProto
          .internal_static_google_cloud_dataproc_v1beta2_ManagedGroupConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.ManagedGroupConfig.class,
              com.google.cloud.dataproc.v1beta2.ManagedGroupConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.ManagedGroupConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      instanceTemplateName_ = "";

      instanceGroupManagerName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.ClustersProto
          .internal_static_google_cloud_dataproc_v1beta2_ManagedGroupConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ManagedGroupConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.ManagedGroupConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ManagedGroupConfig build() {
      com.google.cloud.dataproc.v1beta2.ManagedGroupConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ManagedGroupConfig buildPartial() {
      com.google.cloud.dataproc.v1beta2.ManagedGroupConfig result =
          new com.google.cloud.dataproc.v1beta2.ManagedGroupConfig(this);
      result.instanceTemplateName_ = instanceTemplateName_;
      result.instanceGroupManagerName_ = instanceGroupManagerName_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.ManagedGroupConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.ManagedGroupConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.ManagedGroupConfig other) {
      if (other == com.google.cloud.dataproc.v1beta2.ManagedGroupConfig.getDefaultInstance())
        return this;
      if (!other.getInstanceTemplateName().isEmpty()) {
        instanceTemplateName_ = other.instanceTemplateName_;
        onChanged();
      }
      if (!other.getInstanceGroupManagerName().isEmpty()) {
        instanceGroupManagerName_ = other.instanceGroupManagerName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dataproc.v1beta2.ManagedGroupConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1beta2.ManagedGroupConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object instanceTemplateName_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Template used for the Managed
     * Instance Group.
     * </pre>
     *
     * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.lang.String getInstanceTemplateName() {
      java.lang.Object ref = instanceTemplateName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceTemplateName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Template used for the Managed
     * Instance Group.
     * </pre>
     *
     * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.ByteString getInstanceTemplateNameBytes() {
      java.lang.Object ref = instanceTemplateName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceTemplateName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Template used for the Managed
     * Instance Group.
     * </pre>
     *
     * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setInstanceTemplateName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      instanceTemplateName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Template used for the Managed
     * Instance Group.
     * </pre>
     *
     * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearInstanceTemplateName() {

      instanceTemplateName_ = getDefaultInstance().getInstanceTemplateName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Template used for the Managed
     * Instance Group.
     * </pre>
     *
     * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setInstanceTemplateNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      instanceTemplateName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object instanceGroupManagerName_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Group Manager for this group.
     * </pre>
     *
     * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.lang.String getInstanceGroupManagerName() {
      java.lang.Object ref = instanceGroupManagerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceGroupManagerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Group Manager for this group.
     * </pre>
     *
     * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.ByteString getInstanceGroupManagerNameBytes() {
      java.lang.Object ref = instanceGroupManagerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceGroupManagerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Group Manager for this group.
     * </pre>
     *
     * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setInstanceGroupManagerName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      instanceGroupManagerName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Group Manager for this group.
     * </pre>
     *
     * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearInstanceGroupManagerName() {

      instanceGroupManagerName_ = getDefaultInstance().getInstanceGroupManagerName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Instance Group Manager for this group.
     * </pre>
     *
     * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setInstanceGroupManagerNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      instanceGroupManagerName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.ManagedGroupConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.ManagedGroupConfig)
  private static final com.google.cloud.dataproc.v1beta2.ManagedGroupConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.ManagedGroupConfig();
  }

  public static com.google.cloud.dataproc.v1beta2.ManagedGroupConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagedGroupConfig> PARSER =
      new com.google.protobuf.AbstractParser<ManagedGroupConfig>() {
        @java.lang.Override
        public ManagedGroupConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ManagedGroupConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ManagedGroupConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagedGroupConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.ManagedGroupConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
