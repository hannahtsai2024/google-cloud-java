// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/page.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The request message for
 * [Pages.CreatePage][google.cloud.dialogflow.cx.v3.Pages.CreatePage].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.CreatePageRequest}
 */
public final class CreatePageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.CreatePageRequest)
    CreatePageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePageRequest.newBuilder() to construct.
  private CreatePageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePageRequest() {
    parent_ = "";
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePageRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.PageProto.internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.PageProto.internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.CreatePageRequest.class, com.google.cloud.dialogflow.cx.v3.CreatePageRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The flow to create a page for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
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
   * Required. The flow to create a page for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
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

  public static final int PAGE_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3.Page page_;
  /**
   * <pre>
   * Required. The page to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the page field is set.
   */
  @java.lang.Override
  public boolean hasPage() {
    return page_ != null;
  }
  /**
   * <pre>
   * Required. The page to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The page.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Page getPage() {
    return page_ == null ? com.google.cloud.dialogflow.cx.v3.Page.getDefaultInstance() : page_;
  }
  /**
   * <pre>
   * Required. The page to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.PageOrBuilder getPageOrBuilder() {
    return page_ == null ? com.google.cloud.dialogflow.cx.v3.Page.getDefaultInstance() : page_;
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object languageCode_ = "";
  /**
   * <pre>
   * The language of the following fields in `page`:
   *
   * *  `Page.entry_fulfillment.messages`
   * *  `Page.entry_fulfillment.conditional_cases`
   * *  `Page.event_handlers.trigger_fulfillment.messages`
   * *  `Page.event_handlers.trigger_fulfillment.conditional_cases`
   * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
   * *
   * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases`
   * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
   * *
   * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases`
   * *  `Page.transition_routes.trigger_fulfillment.messages`
   * *  `Page.transition_routes.trigger_fulfillment.conditional_cases`
   *
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The language of the following fields in `page`:
   *
   * *  `Page.entry_fulfillment.messages`
   * *  `Page.entry_fulfillment.conditional_cases`
   * *  `Page.event_handlers.trigger_fulfillment.messages`
   * *  `Page.event_handlers.trigger_fulfillment.conditional_cases`
   * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
   * *
   * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases`
   * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
   * *
   * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases`
   * *  `Page.transition_routes.trigger_fulfillment.messages`
   * *  `Page.transition_routes.trigger_fulfillment.conditional_cases`
   *
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
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
    if (page_ != null) {
      output.writeMessage(2, getPage());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
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
    if (page_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPage());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.CreatePageRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.CreatePageRequest other = (com.google.cloud.dialogflow.cx.v3.CreatePageRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasPage() != other.hasPage()) return false;
    if (hasPage()) {
      if (!getPage()
          .equals(other.getPage())) return false;
    }
    if (!getLanguageCode()
        .equals(other.getLanguageCode())) return false;
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
    if (hasPage()) {
      hash = (37 * hash) + PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPage().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.CreatePageRequest prototype) {
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
   * [Pages.CreatePage][google.cloud.dialogflow.cx.v3.Pages.CreatePage].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.CreatePageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.CreatePageRequest)
      com.google.cloud.dialogflow.cx.v3.CreatePageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.PageProto.internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.PageProto.internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.CreatePageRequest.class, com.google.cloud.dialogflow.cx.v3.CreatePageRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.CreatePageRequest.newBuilder()
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
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      languageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.PageProto.internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreatePageRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.CreatePageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreatePageRequest build() {
      com.google.cloud.dialogflow.cx.v3.CreatePageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreatePageRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.CreatePageRequest result = new com.google.cloud.dialogflow.cx.v3.CreatePageRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.CreatePageRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.page_ = pageBuilder_ == null
            ? page_
            : pageBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.languageCode_ = languageCode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3.CreatePageRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.CreatePageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.CreatePageRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3.CreatePageRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPage()) {
        mergePage(other.getPage());
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              languageCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * Required. The flow to create a page for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
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
     * Required. The flow to create a page for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
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
     * Required. The flow to create a page for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
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
     * Required. The flow to create a page for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
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
     * Required. The flow to create a page for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
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

    private com.google.cloud.dialogflow.cx.v3.Page page_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Page, com.google.cloud.dialogflow.cx.v3.Page.Builder, com.google.cloud.dialogflow.cx.v3.PageOrBuilder> pageBuilder_;
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the page field is set.
     */
    public boolean hasPage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The page.
     */
    public com.google.cloud.dialogflow.cx.v3.Page getPage() {
      if (pageBuilder_ == null) {
        return page_ == null ? com.google.cloud.dialogflow.cx.v3.Page.getDefaultInstance() : page_;
      } else {
        return pageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPage(com.google.cloud.dialogflow.cx.v3.Page value) {
      if (pageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        page_ = value;
      } else {
        pageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPage(
        com.google.cloud.dialogflow.cx.v3.Page.Builder builderForValue) {
      if (pageBuilder_ == null) {
        page_ = builderForValue.build();
      } else {
        pageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePage(com.google.cloud.dialogflow.cx.v3.Page value) {
      if (pageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          page_ != null &&
          page_ != com.google.cloud.dialogflow.cx.v3.Page.getDefaultInstance()) {
          getPageBuilder().mergeFrom(value);
        } else {
          page_ = value;
        }
      } else {
        pageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Page.Builder getPageBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.PageOrBuilder getPageOrBuilder() {
      if (pageBuilder_ != null) {
        return pageBuilder_.getMessageOrBuilder();
      } else {
        return page_ == null ?
            com.google.cloud.dialogflow.cx.v3.Page.getDefaultInstance() : page_;
      }
    }
    /**
     * <pre>
     * Required. The page to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Page page = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Page, com.google.cloud.dialogflow.cx.v3.Page.Builder, com.google.cloud.dialogflow.cx.v3.PageOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Page, com.google.cloud.dialogflow.cx.v3.Page.Builder, com.google.cloud.dialogflow.cx.v3.PageOrBuilder>(
                getPage(),
                getParentForChildren(),
                isClean());
        page_ = null;
      }
      return pageBuilder_;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * The language of the following fields in `page`:
     *
     * *  `Page.entry_fulfillment.messages`
     * *  `Page.entry_fulfillment.conditional_cases`
     * *  `Page.event_handlers.trigger_fulfillment.messages`
     * *  `Page.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
     * *
     * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
     * *
     * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases`
     * *  `Page.transition_routes.trigger_fulfillment.messages`
     * *  `Page.transition_routes.trigger_fulfillment.conditional_cases`
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The language of the following fields in `page`:
     *
     * *  `Page.entry_fulfillment.messages`
     * *  `Page.entry_fulfillment.conditional_cases`
     * *  `Page.event_handlers.trigger_fulfillment.messages`
     * *  `Page.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
     * *
     * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
     * *
     * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases`
     * *  `Page.transition_routes.trigger_fulfillment.messages`
     * *  `Page.transition_routes.trigger_fulfillment.conditional_cases`
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The language of the following fields in `page`:
     *
     * *  `Page.entry_fulfillment.messages`
     * *  `Page.entry_fulfillment.conditional_cases`
     * *  `Page.event_handlers.trigger_fulfillment.messages`
     * *  `Page.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
     * *
     * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
     * *
     * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases`
     * *  `Page.transition_routes.trigger_fulfillment.messages`
     * *  `Page.transition_routes.trigger_fulfillment.conditional_cases`
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      languageCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the following fields in `page`:
     *
     * *  `Page.entry_fulfillment.messages`
     * *  `Page.entry_fulfillment.conditional_cases`
     * *  `Page.event_handlers.trigger_fulfillment.messages`
     * *  `Page.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
     * *
     * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
     * *
     * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases`
     * *  `Page.transition_routes.trigger_fulfillment.messages`
     * *  `Page.transition_routes.trigger_fulfillment.conditional_cases`
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      languageCode_ = getDefaultInstance().getLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the following fields in `page`:
     *
     * *  `Page.entry_fulfillment.messages`
     * *  `Page.entry_fulfillment.conditional_cases`
     * *  `Page.event_handlers.trigger_fulfillment.messages`
     * *  `Page.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
     * *
     * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases`
     * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
     * *
     * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases`
     * *  `Page.transition_routes.trigger_fulfillment.messages`
     * *  `Page.transition_routes.trigger_fulfillment.conditional_cases`
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      languageCode_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.CreatePageRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.CreatePageRequest)
  private static final com.google.cloud.dialogflow.cx.v3.CreatePageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.CreatePageRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.CreatePageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePageRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreatePageRequest>() {
    @java.lang.Override
    public CreatePageRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.CreatePageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

