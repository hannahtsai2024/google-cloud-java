/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/discoveryengine/v1alpha/grounded_generation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Specification for the grounding check.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.CheckGroundingSpec}
 */
public final class CheckGroundingSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.CheckGroundingSpec)
    CheckGroundingSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CheckGroundingSpec.newBuilder() to construct.
  private CheckGroundingSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CheckGroundingSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CheckGroundingSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.GroundedGenerationServiceProto
        .internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.GroundedGenerationServiceProto
        .internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec.class,
            com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec.Builder.class);
  }

  private int bitField0_;
  public static final int CITATION_THRESHOLD_FIELD_NUMBER = 1;
  private double citationThreshold_ = 0D;
  /**
   *
   *
   * <pre>
   * The threshold (in [0,1]) used for determining whether a fact must be
   * cited for a claim in the answer candidate. Choosing a higher threshold
   * will lead to fewer but very strong citations, while choosing a lower
   * threshold may lead to more but somewhat weaker citations. If unset, the
   * threshold will default to 0.6.
   * </pre>
   *
   * <code>optional double citation_threshold = 1;</code>
   *
   * @return Whether the citationThreshold field is set.
   */
  @java.lang.Override
  public boolean hasCitationThreshold() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The threshold (in [0,1]) used for determining whether a fact must be
   * cited for a claim in the answer candidate. Choosing a higher threshold
   * will lead to fewer but very strong citations, while choosing a lower
   * threshold may lead to more but somewhat weaker citations. If unset, the
   * threshold will default to 0.6.
   * </pre>
   *
   * <code>optional double citation_threshold = 1;</code>
   *
   * @return The citationThreshold.
   */
  @java.lang.Override
  public double getCitationThreshold() {
    return citationThreshold_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(1, citationThreshold_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, citationThreshold_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec other =
        (com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec) obj;

    if (hasCitationThreshold() != other.hasCitationThreshold()) return false;
    if (hasCitationThreshold()) {
      if (java.lang.Double.doubleToLongBits(getCitationThreshold())
          != java.lang.Double.doubleToLongBits(other.getCitationThreshold())) return false;
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
    if (hasCitationThreshold()) {
      hash = (37 * hash) + CITATION_THRESHOLD_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getCitationThreshold()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec parseFrom(
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
      com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec prototype) {
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
   * Specification for the grounding check.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.CheckGroundingSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.CheckGroundingSpec)
      com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.GroundedGenerationServiceProto
          .internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.GroundedGenerationServiceProto
          .internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec.class,
              com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      citationThreshold_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.GroundedGenerationServiceProto
          .internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec build() {
      com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec result =
          new com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.citationThreshold_ = citationThreshold_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec other) {
      if (other == com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec.getDefaultInstance())
        return this;
      if (other.hasCitationThreshold()) {
        setCitationThreshold(other.getCitationThreshold());
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
            case 9:
              {
                citationThreshold_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
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

    private double citationThreshold_;
    /**
     *
     *
     * <pre>
     * The threshold (in [0,1]) used for determining whether a fact must be
     * cited for a claim in the answer candidate. Choosing a higher threshold
     * will lead to fewer but very strong citations, while choosing a lower
     * threshold may lead to more but somewhat weaker citations. If unset, the
     * threshold will default to 0.6.
     * </pre>
     *
     * <code>optional double citation_threshold = 1;</code>
     *
     * @return Whether the citationThreshold field is set.
     */
    @java.lang.Override
    public boolean hasCitationThreshold() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The threshold (in [0,1]) used for determining whether a fact must be
     * cited for a claim in the answer candidate. Choosing a higher threshold
     * will lead to fewer but very strong citations, while choosing a lower
     * threshold may lead to more but somewhat weaker citations. If unset, the
     * threshold will default to 0.6.
     * </pre>
     *
     * <code>optional double citation_threshold = 1;</code>
     *
     * @return The citationThreshold.
     */
    @java.lang.Override
    public double getCitationThreshold() {
      return citationThreshold_;
    }
    /**
     *
     *
     * <pre>
     * The threshold (in [0,1]) used for determining whether a fact must be
     * cited for a claim in the answer candidate. Choosing a higher threshold
     * will lead to fewer but very strong citations, while choosing a lower
     * threshold may lead to more but somewhat weaker citations. If unset, the
     * threshold will default to 0.6.
     * </pre>
     *
     * <code>optional double citation_threshold = 1;</code>
     *
     * @param value The citationThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setCitationThreshold(double value) {

      citationThreshold_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The threshold (in [0,1]) used for determining whether a fact must be
     * cited for a claim in the answer candidate. Choosing a higher threshold
     * will lead to fewer but very strong citations, while choosing a lower
     * threshold may lead to more but somewhat weaker citations. If unset, the
     * threshold will default to 0.6.
     * </pre>
     *
     * <code>optional double citation_threshold = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCitationThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      citationThreshold_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.CheckGroundingSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.CheckGroundingSpec)
  private static final com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec();
  }

  public static com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckGroundingSpec> PARSER =
      new com.google.protobuf.AbstractParser<CheckGroundingSpec>() {
        @java.lang.Override
        public CheckGroundingSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckGroundingSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckGroundingSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.CheckGroundingSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
