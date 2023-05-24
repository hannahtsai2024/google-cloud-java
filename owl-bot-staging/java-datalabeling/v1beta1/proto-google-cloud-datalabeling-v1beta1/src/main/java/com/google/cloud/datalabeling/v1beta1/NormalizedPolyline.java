// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Normalized polyline.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.NormalizedPolyline}
 */
public final class NormalizedPolyline extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.NormalizedPolyline)
    NormalizedPolylineOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NormalizedPolyline.newBuilder() to construct.
  private NormalizedPolyline(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NormalizedPolyline() {
    normalizedVertices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NormalizedPolyline();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.NormalizedPolyline.class, com.google.cloud.datalabeling.v1beta1.NormalizedPolyline.Builder.class);
  }

  public static final int NORMALIZED_VERTICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datalabeling.v1beta1.NormalizedVertex> normalizedVertices_;
  /**
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datalabeling.v1beta1.NormalizedVertex> getNormalizedVerticesList() {
    return normalizedVertices_;
  }
  /**
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder> 
      getNormalizedVerticesOrBuilderList() {
    return normalizedVertices_;
  }
  /**
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
   */
  @java.lang.Override
  public int getNormalizedVerticesCount() {
    return normalizedVertices_.size();
  }
  /**
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.NormalizedVertex getNormalizedVertices(int index) {
    return normalizedVertices_.get(index);
  }
  /**
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
      int index) {
    return normalizedVertices_.get(index);
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
    for (int i = 0; i < normalizedVertices_.size(); i++) {
      output.writeMessage(1, normalizedVertices_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < normalizedVertices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, normalizedVertices_.get(i));
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.NormalizedPolyline)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.NormalizedPolyline other = (com.google.cloud.datalabeling.v1beta1.NormalizedPolyline) obj;

    if (!getNormalizedVerticesList()
        .equals(other.getNormalizedVerticesList())) return false;
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
    if (getNormalizedVerticesCount() > 0) {
      hash = (37 * hash) + NORMALIZED_VERTICES_FIELD_NUMBER;
      hash = (53 * hash) + getNormalizedVerticesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.NormalizedPolyline prototype) {
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
   * Normalized polyline.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.NormalizedPolyline}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.NormalizedPolyline)
      com.google.cloud.datalabeling.v1beta1.NormalizedPolylineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.NormalizedPolyline.class, com.google.cloud.datalabeling.v1beta1.NormalizedPolyline.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.NormalizedPolyline.newBuilder()
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
      if (normalizedVerticesBuilder_ == null) {
        normalizedVertices_ = java.util.Collections.emptyList();
      } else {
        normalizedVertices_ = null;
        normalizedVerticesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.NormalizedPolyline getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.NormalizedPolyline.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.NormalizedPolyline build() {
      com.google.cloud.datalabeling.v1beta1.NormalizedPolyline result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.NormalizedPolyline buildPartial() {
      com.google.cloud.datalabeling.v1beta1.NormalizedPolyline result = new com.google.cloud.datalabeling.v1beta1.NormalizedPolyline(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.datalabeling.v1beta1.NormalizedPolyline result) {
      if (normalizedVerticesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          normalizedVertices_ = java.util.Collections.unmodifiableList(normalizedVertices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.normalizedVertices_ = normalizedVertices_;
      } else {
        result.normalizedVertices_ = normalizedVerticesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.NormalizedPolyline result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.NormalizedPolyline) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.NormalizedPolyline)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.NormalizedPolyline other) {
      if (other == com.google.cloud.datalabeling.v1beta1.NormalizedPolyline.getDefaultInstance()) return this;
      if (normalizedVerticesBuilder_ == null) {
        if (!other.normalizedVertices_.isEmpty()) {
          if (normalizedVertices_.isEmpty()) {
            normalizedVertices_ = other.normalizedVertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNormalizedVerticesIsMutable();
            normalizedVertices_.addAll(other.normalizedVertices_);
          }
          onChanged();
        }
      } else {
        if (!other.normalizedVertices_.isEmpty()) {
          if (normalizedVerticesBuilder_.isEmpty()) {
            normalizedVerticesBuilder_.dispose();
            normalizedVerticesBuilder_ = null;
            normalizedVertices_ = other.normalizedVertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            normalizedVerticesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNormalizedVerticesFieldBuilder() : null;
          } else {
            normalizedVerticesBuilder_.addAllMessages(other.normalizedVertices_);
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
            case 10: {
              com.google.cloud.datalabeling.v1beta1.NormalizedVertex m =
                  input.readMessage(
                      com.google.cloud.datalabeling.v1beta1.NormalizedVertex.parser(),
                      extensionRegistry);
              if (normalizedVerticesBuilder_ == null) {
                ensureNormalizedVerticesIsMutable();
                normalizedVertices_.add(m);
              } else {
                normalizedVerticesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.datalabeling.v1beta1.NormalizedVertex> normalizedVertices_ =
      java.util.Collections.emptyList();
    private void ensureNormalizedVerticesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        normalizedVertices_ = new java.util.ArrayList<com.google.cloud.datalabeling.v1beta1.NormalizedVertex>(normalizedVertices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.NormalizedVertex, com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder, com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder> normalizedVerticesBuilder_;

    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.NormalizedVertex> getNormalizedVerticesList() {
      if (normalizedVerticesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(normalizedVertices_);
      } else {
        return normalizedVerticesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public int getNormalizedVerticesCount() {
      if (normalizedVerticesBuilder_ == null) {
        return normalizedVertices_.size();
      } else {
        return normalizedVerticesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.NormalizedVertex getNormalizedVertices(int index) {
      if (normalizedVerticesBuilder_ == null) {
        return normalizedVertices_.get(index);
      } else {
        return normalizedVerticesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder setNormalizedVertices(
        int index, com.google.cloud.datalabeling.v1beta1.NormalizedVertex value) {
      if (normalizedVerticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNormalizedVerticesIsMutable();
        normalizedVertices_.set(index, value);
        onChanged();
      } else {
        normalizedVerticesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder setNormalizedVertices(
        int index, com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder builderForValue) {
      if (normalizedVerticesBuilder_ == null) {
        ensureNormalizedVerticesIsMutable();
        normalizedVertices_.set(index, builderForValue.build());
        onChanged();
      } else {
        normalizedVerticesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder addNormalizedVertices(com.google.cloud.datalabeling.v1beta1.NormalizedVertex value) {
      if (normalizedVerticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNormalizedVerticesIsMutable();
        normalizedVertices_.add(value);
        onChanged();
      } else {
        normalizedVerticesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder addNormalizedVertices(
        int index, com.google.cloud.datalabeling.v1beta1.NormalizedVertex value) {
      if (normalizedVerticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNormalizedVerticesIsMutable();
        normalizedVertices_.add(index, value);
        onChanged();
      } else {
        normalizedVerticesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder addNormalizedVertices(
        com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder builderForValue) {
      if (normalizedVerticesBuilder_ == null) {
        ensureNormalizedVerticesIsMutable();
        normalizedVertices_.add(builderForValue.build());
        onChanged();
      } else {
        normalizedVerticesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder addNormalizedVertices(
        int index, com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder builderForValue) {
      if (normalizedVerticesBuilder_ == null) {
        ensureNormalizedVerticesIsMutable();
        normalizedVertices_.add(index, builderForValue.build());
        onChanged();
      } else {
        normalizedVerticesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder addAllNormalizedVertices(
        java.lang.Iterable<? extends com.google.cloud.datalabeling.v1beta1.NormalizedVertex> values) {
      if (normalizedVerticesBuilder_ == null) {
        ensureNormalizedVerticesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, normalizedVertices_);
        onChanged();
      } else {
        normalizedVerticesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder clearNormalizedVertices() {
      if (normalizedVerticesBuilder_ == null) {
        normalizedVertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        normalizedVerticesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public Builder removeNormalizedVertices(int index) {
      if (normalizedVerticesBuilder_ == null) {
        ensureNormalizedVerticesIsMutable();
        normalizedVertices_.remove(index);
        onChanged();
      } else {
        normalizedVerticesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder getNormalizedVerticesBuilder(
        int index) {
      return getNormalizedVerticesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
        int index) {
      if (normalizedVerticesBuilder_ == null) {
        return normalizedVertices_.get(index);  } else {
        return normalizedVerticesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder> 
         getNormalizedVerticesOrBuilderList() {
      if (normalizedVerticesBuilder_ != null) {
        return normalizedVerticesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(normalizedVertices_);
      }
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder addNormalizedVerticesBuilder() {
      return getNormalizedVerticesFieldBuilder().addBuilder(
          com.google.cloud.datalabeling.v1beta1.NormalizedVertex.getDefaultInstance());
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder addNormalizedVerticesBuilder(
        int index) {
      return getNormalizedVerticesFieldBuilder().addBuilder(
          index, com.google.cloud.datalabeling.v1beta1.NormalizedVertex.getDefaultInstance());
    }
    /**
     * <pre>
     * The normalized polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder> 
         getNormalizedVerticesBuilderList() {
      return getNormalizedVerticesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.NormalizedVertex, com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder, com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder> 
        getNormalizedVerticesFieldBuilder() {
      if (normalizedVerticesBuilder_ == null) {
        normalizedVerticesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.NormalizedVertex, com.google.cloud.datalabeling.v1beta1.NormalizedVertex.Builder, com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder>(
                normalizedVertices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        normalizedVertices_ = null;
      }
      return normalizedVerticesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.NormalizedPolyline)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.NormalizedPolyline)
  private static final com.google.cloud.datalabeling.v1beta1.NormalizedPolyline DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.NormalizedPolyline();
  }

  public static com.google.cloud.datalabeling.v1beta1.NormalizedPolyline getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedPolyline>
      PARSER = new com.google.protobuf.AbstractParser<NormalizedPolyline>() {
    @java.lang.Override
    public NormalizedPolyline parsePartialFrom(
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

  public static com.google.protobuf.Parser<NormalizedPolyline> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedPolyline> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.NormalizedPolyline getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

