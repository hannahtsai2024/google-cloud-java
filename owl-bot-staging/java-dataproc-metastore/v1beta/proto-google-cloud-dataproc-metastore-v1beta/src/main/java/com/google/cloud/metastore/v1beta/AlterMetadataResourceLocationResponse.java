// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

package com.google.cloud.metastore.v1beta;

/**
 * <pre>
 * Response message for
 * [DataprocMetastore.AlterMetadataResourceLocation][google.cloud.metastore.v1beta.DataprocMetastore.AlterMetadataResourceLocation].
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse}
 */
public final class AlterMetadataResourceLocationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse)
    AlterMetadataResourceLocationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterMetadataResourceLocationResponse.newBuilder() to construct.
  private AlterMetadataResourceLocationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterMetadataResourceLocationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterMetadataResourceLocationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_AlterMetadataResourceLocationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_AlterMetadataResourceLocationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse.class, com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse other = (com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse prototype) {
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
   * Response message for
   * [DataprocMetastore.AlterMetadataResourceLocation][google.cloud.metastore.v1beta.DataprocMetastore.AlterMetadataResourceLocation].
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse)
      com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_AlterMetadataResourceLocationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_AlterMetadataResourceLocationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse.class, com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_AlterMetadataResourceLocationResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse build() {
      com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse buildPartial() {
      com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse result = new com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse) {
        return mergeFrom((com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse other) {
      if (other == com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse)
  private static final com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse();
  }

  public static com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterMetadataResourceLocationResponse>
      PARSER = new com.google.protobuf.AbstractParser<AlterMetadataResourceLocationResponse>() {
    @java.lang.Override
    public AlterMetadataResourceLocationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlterMetadataResourceLocationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterMetadataResourceLocationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1beta.AlterMetadataResourceLocationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

