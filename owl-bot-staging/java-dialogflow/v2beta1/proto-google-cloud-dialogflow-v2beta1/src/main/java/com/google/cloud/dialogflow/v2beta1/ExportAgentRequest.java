// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for
 * [Agents.ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ExportAgentRequest}
 */
public final class ExportAgentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
    ExportAgentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportAgentRequest.newBuilder() to construct.
  private ExportAgentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportAgentRequest() {
    parent_ = "";
    agentUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportAgentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.class, com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_URI_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object agentUri_ = "";
  /**
   * <pre>
   * Optional. The
   * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
   * URI to export the agent to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * If left unspecified, the serialized agent is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   * @return The agentUri.
   */
  @java.lang.Override
  public java.lang.String getAgentUri() {
    java.lang.Object ref = agentUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The
   * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
   * URI to export the agent to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * If left unspecified, the serialized agent is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   * @return The bytes for agentUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentUriBytes() {
    java.lang.Object ref = agentUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentUri_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agentUri_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agentUri_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ExportAgentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ExportAgentRequest other = (com.google.cloud.dialogflow.v2beta1.ExportAgentRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getAgentUri()
        .equals(other.getAgentUri())) return false;
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
    hash = (37 * hash) + AGENT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getAgentUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest prototype) {
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
   * The request message for
   * [Agents.ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ExportAgentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
      com.google.cloud.dialogflow.v2beta1.ExportAgentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.class, com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.newBuilder()
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
      parent_ = "";
      agentUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest build() {
      com.google.cloud.dialogflow.v2beta1.ExportAgentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ExportAgentRequest result = new com.google.cloud.dialogflow.v2beta1.ExportAgentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentUri_ = agentUri_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ExportAgentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ExportAgentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAgentUri().isEmpty()) {
        agentUri_ = other.agentUri_;
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              agentUri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object agentUri_ = "";
    /**
     * <pre>
     * Optional. The
     * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
     * URI to export the agent to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * If left unspecified, the serialized agent is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     * @return The agentUri.
     */
    public java.lang.String getAgentUri() {
      java.lang.Object ref = agentUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The
     * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
     * URI to export the agent to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * If left unspecified, the serialized agent is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     * @return The bytes for agentUri.
     */
    public com.google.protobuf.ByteString
        getAgentUriBytes() {
      java.lang.Object ref = agentUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The
     * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
     * URI to export the agent to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * If left unspecified, the serialized agent is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     * @param value The agentUri to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      agentUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The
     * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
     * URI to export the agent to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * If left unspecified, the serialized agent is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentUri() {
      agentUri_ = getDefaultInstance().getAgentUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The
     * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
     * URI to export the agent to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * If left unspecified, the serialized agent is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     * @param value The bytes for agentUri to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      agentUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
  private static final com.google.cloud.dialogflow.v2beta1.ExportAgentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ExportAgentRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportAgentRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportAgentRequest>() {
    @java.lang.Override
    public ExportAgentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportAgentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportAgentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

