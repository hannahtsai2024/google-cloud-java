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
// source: google/cloud/contentwarehouse/v1/pipelines.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * The DocAI processor information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.ProcessorInfo}
 */
public final class ProcessorInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.ProcessorInfo)
    ProcessorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProcessorInfo.newBuilder() to construct.
  private ProcessorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProcessorInfo() {
    processorName_ = "";
    documentType_ = "";
    schemaName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProcessorInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.PipelinesProto
        .internal_static_google_cloud_contentwarehouse_v1_ProcessorInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.PipelinesProto
        .internal_static_google_cloud_contentwarehouse_v1_ProcessorInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.ProcessorInfo.class,
            com.google.cloud.contentwarehouse.v1.ProcessorInfo.Builder.class);
  }

  public static final int PROCESSOR_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object processorName_ = "";
  /**
   *
   *
   * <pre>
   * The processor resource name.
   * Format is `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string processor_name = 1;</code>
   *
   * @return The processorName.
   */
  @java.lang.Override
  public java.lang.String getProcessorName() {
    java.lang.Object ref = processorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processorName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The processor resource name.
   * Format is `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string processor_name = 1;</code>
   *
   * @return The bytes for processorName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProcessorNameBytes() {
    java.lang.Object ref = processorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      processorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCUMENT_TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object documentType_ = "";
  /**
   *
   *
   * <pre>
   * The processor will process the documents with this document type.
   * </pre>
   *
   * <code>string document_type = 2;</code>
   *
   * @return The documentType.
   */
  @java.lang.Override
  public java.lang.String getDocumentType() {
    java.lang.Object ref = documentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      documentType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The processor will process the documents with this document type.
   * </pre>
   *
   * <code>string document_type = 2;</code>
   *
   * @return The bytes for documentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDocumentTypeBytes() {
    java.lang.Object ref = documentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      documentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMA_NAME_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object schemaName_ = "";
  /**
   *
   *
   * <pre>
   * The Document schema resource name. All documents processed by this
   * processor will use this schema.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>string schema_name = 3;</code>
   *
   * @return The schemaName.
   */
  @java.lang.Override
  public java.lang.String getSchemaName() {
    java.lang.Object ref = schemaName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schemaName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The Document schema resource name. All documents processed by this
   * processor will use this schema.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>string schema_name = 3;</code>
   *
   * @return The bytes for schemaName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSchemaNameBytes() {
    java.lang.Object ref = schemaName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      schemaName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, processorName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(documentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, documentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schemaName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, schemaName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, processorName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(documentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, documentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schemaName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, schemaName_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.ProcessorInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.ProcessorInfo other =
        (com.google.cloud.contentwarehouse.v1.ProcessorInfo) obj;

    if (!getProcessorName().equals(other.getProcessorName())) return false;
    if (!getDocumentType().equals(other.getDocumentType())) return false;
    if (!getSchemaName().equals(other.getSchemaName())) return false;
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
    hash = (37 * hash) + PROCESSOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getProcessorName().hashCode();
    hash = (37 * hash) + DOCUMENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDocumentType().hashCode();
    hash = (37 * hash) + SCHEMA_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSchemaName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.ProcessorInfo prototype) {
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
   * The DocAI processor information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.ProcessorInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.ProcessorInfo)
      com.google.cloud.contentwarehouse.v1.ProcessorInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.PipelinesProto
          .internal_static_google_cloud_contentwarehouse_v1_ProcessorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.PipelinesProto
          .internal_static_google_cloud_contentwarehouse_v1_ProcessorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.ProcessorInfo.class,
              com.google.cloud.contentwarehouse.v1.ProcessorInfo.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.ProcessorInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      processorName_ = "";
      documentType_ = "";
      schemaName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.PipelinesProto
          .internal_static_google_cloud_contentwarehouse_v1_ProcessorInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ProcessorInfo getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.ProcessorInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ProcessorInfo build() {
      com.google.cloud.contentwarehouse.v1.ProcessorInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ProcessorInfo buildPartial() {
      com.google.cloud.contentwarehouse.v1.ProcessorInfo result =
          new com.google.cloud.contentwarehouse.v1.ProcessorInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.ProcessorInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.processorName_ = processorName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.documentType_ = documentType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.schemaName_ = schemaName_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.ProcessorInfo) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.ProcessorInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.ProcessorInfo other) {
      if (other == com.google.cloud.contentwarehouse.v1.ProcessorInfo.getDefaultInstance())
        return this;
      if (!other.getProcessorName().isEmpty()) {
        processorName_ = other.processorName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDocumentType().isEmpty()) {
        documentType_ = other.documentType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSchemaName().isEmpty()) {
        schemaName_ = other.schemaName_;
        bitField0_ |= 0x00000004;
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
                processorName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                documentType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                schemaName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object processorName_ = "";
    /**
     *
     *
     * <pre>
     * The processor resource name.
     * Format is `projects/{project}/locations/{location}/processors/{processor}`,
     * or
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_name = 1;</code>
     *
     * @return The processorName.
     */
    public java.lang.String getProcessorName() {
      java.lang.Object ref = processorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The processor resource name.
     * Format is `projects/{project}/locations/{location}/processors/{processor}`,
     * or
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_name = 1;</code>
     *
     * @return The bytes for processorName.
     */
    public com.google.protobuf.ByteString getProcessorNameBytes() {
      java.lang.Object ref = processorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        processorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The processor resource name.
     * Format is `projects/{project}/locations/{location}/processors/{processor}`,
     * or
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_name = 1;</code>
     *
     * @param value The processorName to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      processorName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processor resource name.
     * Format is `projects/{project}/locations/{location}/processors/{processor}`,
     * or
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProcessorName() {
      processorName_ = getDefaultInstance().getProcessorName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processor resource name.
     * Format is `projects/{project}/locations/{location}/processors/{processor}`,
     * or
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_name = 1;</code>
     *
     * @param value The bytes for processorName to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      processorName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object documentType_ = "";
    /**
     *
     *
     * <pre>
     * The processor will process the documents with this document type.
     * </pre>
     *
     * <code>string document_type = 2;</code>
     *
     * @return The documentType.
     */
    public java.lang.String getDocumentType() {
      java.lang.Object ref = documentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        documentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The processor will process the documents with this document type.
     * </pre>
     *
     * <code>string document_type = 2;</code>
     *
     * @return The bytes for documentType.
     */
    public com.google.protobuf.ByteString getDocumentTypeBytes() {
      java.lang.Object ref = documentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        documentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The processor will process the documents with this document type.
     * </pre>
     *
     * <code>string document_type = 2;</code>
     *
     * @param value The documentType to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      documentType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processor will process the documents with this document type.
     * </pre>
     *
     * <code>string document_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDocumentType() {
      documentType_ = getDefaultInstance().getDocumentType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processor will process the documents with this document type.
     * </pre>
     *
     * <code>string document_type = 2;</code>
     *
     * @param value The bytes for documentType to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      documentType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object schemaName_ = "";
    /**
     *
     *
     * <pre>
     * The Document schema resource name. All documents processed by this
     * processor will use this schema.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>string schema_name = 3;</code>
     *
     * @return The schemaName.
     */
    public java.lang.String getSchemaName() {
      java.lang.Object ref = schemaName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schemaName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Document schema resource name. All documents processed by this
     * processor will use this schema.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>string schema_name = 3;</code>
     *
     * @return The bytes for schemaName.
     */
    public com.google.protobuf.ByteString getSchemaNameBytes() {
      java.lang.Object ref = schemaName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        schemaName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Document schema resource name. All documents processed by this
     * processor will use this schema.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>string schema_name = 3;</code>
     *
     * @param value The schemaName to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      schemaName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Document schema resource name. All documents processed by this
     * processor will use this schema.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>string schema_name = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSchemaName() {
      schemaName_ = getDefaultInstance().getSchemaName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Document schema resource name. All documents processed by this
     * processor will use this schema.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>string schema_name = 3;</code>
     *
     * @param value The bytes for schemaName to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      schemaName_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.ProcessorInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.ProcessorInfo)
  private static final com.google.cloud.contentwarehouse.v1.ProcessorInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.ProcessorInfo();
  }

  public static com.google.cloud.contentwarehouse.v1.ProcessorInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessorInfo> PARSER =
      new com.google.protobuf.AbstractParser<ProcessorInfo>() {
        @java.lang.Override
        public ProcessorInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProcessorInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessorInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ProcessorInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
