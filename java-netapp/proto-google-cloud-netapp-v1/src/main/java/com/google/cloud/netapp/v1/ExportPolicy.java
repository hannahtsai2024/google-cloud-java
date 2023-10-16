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
// source: google/cloud/netapp/v1/volume.proto

package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * Defines the export policy for the volume.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.ExportPolicy}
 */
public final class ExportPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.ExportPolicy)
    ExportPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportPolicy.newBuilder() to construct.
  private ExportPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportPolicy() {
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_ExportPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.ExportPolicy.class,
            com.google.cloud.netapp.v1.ExportPolicy.Builder.class);
  }

  public static final int RULES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.netapp.v1.SimpleExportPolicyRule> rules_;
  /**
   *
   *
   * <pre>
   * Required. List of export policy rules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.netapp.v1.SimpleExportPolicyRule> getRulesList() {
    return rules_;
  }
  /**
   *
   *
   * <pre>
   * Required. List of export policy rules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.netapp.v1.SimpleExportPolicyRuleOrBuilder>
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   *
   *
   * <pre>
   * Required. List of export policy rules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. List of export policy rules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.SimpleExportPolicyRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. List of export policy rules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.SimpleExportPolicyRuleOrBuilder getRulesOrBuilder(int index) {
    return rules_.get(index);
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
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(1, rules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, rules_.get(i));
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
    if (!(obj instanceof com.google.cloud.netapp.v1.ExportPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.ExportPolicy other = (com.google.cloud.netapp.v1.ExportPolicy) obj;

    if (!getRulesList().equals(other.getRulesList())) return false;
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
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.ExportPolicy parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.ExportPolicy prototype) {
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
   * Defines the export policy for the volume.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.ExportPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.ExportPolicy)
      com.google.cloud.netapp.v1.ExportPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_ExportPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.ExportPolicy.class,
              com.google.cloud.netapp.v1.ExportPolicy.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.ExportPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
      } else {
        rules_ = null;
        rulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.ExportPolicy getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.ExportPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.ExportPolicy build() {
      com.google.cloud.netapp.v1.ExportPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.ExportPolicy buildPartial() {
      com.google.cloud.netapp.v1.ExportPolicy result =
          new com.google.cloud.netapp.v1.ExportPolicy(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.netapp.v1.ExportPolicy result) {
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.netapp.v1.ExportPolicy result) {
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
      if (other instanceof com.google.cloud.netapp.v1.ExportPolicy) {
        return mergeFrom((com.google.cloud.netapp.v1.ExportPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.ExportPolicy other) {
      if (other == com.google.cloud.netapp.v1.ExportPolicy.getDefaultInstance()) return this;
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rulesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRulesFieldBuilder()
                    : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
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
                com.google.cloud.netapp.v1.SimpleExportPolicyRule m =
                    input.readMessage(
                        com.google.cloud.netapp.v1.SimpleExportPolicyRule.parser(),
                        extensionRegistry);
                if (rulesBuilder_ == null) {
                  ensureRulesIsMutable();
                  rules_.add(m);
                } else {
                  rulesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.netapp.v1.SimpleExportPolicyRule> rules_ =
        java.util.Collections.emptyList();

    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rules_ = new java.util.ArrayList<com.google.cloud.netapp.v1.SimpleExportPolicyRule>(rules_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.netapp.v1.SimpleExportPolicyRule,
            com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder,
            com.google.cloud.netapp.v1.SimpleExportPolicyRuleOrBuilder>
        rulesBuilder_;

    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.netapp.v1.SimpleExportPolicyRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.SimpleExportPolicyRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRules(int index, com.google.cloud.netapp.v1.SimpleExportPolicyRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRules(
        int index, com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRules(com.google.cloud.netapp.v1.SimpleExportPolicyRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRules(int index, com.google.cloud.netapp.v1.SimpleExportPolicyRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRules(
        com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRules(
        int index, com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.cloud.netapp.v1.SimpleExportPolicyRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder getRulesBuilder(int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.SimpleExportPolicyRuleOrBuilder getRulesOrBuilder(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.netapp.v1.SimpleExportPolicyRuleOrBuilder>
        getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder()
          .addBuilder(com.google.cloud.netapp.v1.SimpleExportPolicyRule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder addRulesBuilder(int index) {
      return getRulesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.netapp.v1.SimpleExportPolicyRule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. List of export policy rules
     * </pre>
     *
     * <code>
     * repeated .google.cloud.netapp.v1.SimpleExportPolicyRule rules = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder>
        getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.netapp.v1.SimpleExportPolicyRule,
            com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder,
            com.google.cloud.netapp.v1.SimpleExportPolicyRuleOrBuilder>
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.netapp.v1.SimpleExportPolicyRule,
                com.google.cloud.netapp.v1.SimpleExportPolicyRule.Builder,
                com.google.cloud.netapp.v1.SimpleExportPolicyRuleOrBuilder>(
                rules_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        rules_ = null;
      }
      return rulesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.ExportPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.ExportPolicy)
  private static final com.google.cloud.netapp.v1.ExportPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.ExportPolicy();
  }

  public static com.google.cloud.netapp.v1.ExportPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportPolicy> PARSER =
      new com.google.protobuf.AbstractParser<ExportPolicy>() {
        @java.lang.Override
        public ExportPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.ExportPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
