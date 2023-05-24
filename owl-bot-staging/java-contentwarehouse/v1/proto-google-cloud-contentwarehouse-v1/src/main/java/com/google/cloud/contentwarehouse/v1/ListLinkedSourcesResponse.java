// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document_link_service.proto

package com.google.cloud.contentwarehouse.v1;

/**
 * <pre>
 * Response message for DocumentLinkService.ListLinkedSources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse}
 */
public final class ListLinkedSourcesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse)
    ListLinkedSourcesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLinkedSourcesResponse.newBuilder() to construct.
  private ListLinkedSourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLinkedSourcesResponse() {
    documentLinks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListLinkedSourcesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto.internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto.internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse.class, com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse.Builder.class);
  }

  public static final int DOCUMENT_LINKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.contentwarehouse.v1.DocumentLink> documentLinks_;
  /**
   * <pre>
   * Source document-links.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contentwarehouse.v1.DocumentLink> getDocumentLinksList() {
    return documentLinks_;
  }
  /**
   * <pre>
   * Source document-links.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder> 
      getDocumentLinksOrBuilderList() {
    return documentLinks_;
  }
  /**
   * <pre>
   * Source document-links.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
   */
  @java.lang.Override
  public int getDocumentLinksCount() {
    return documentLinks_.size();
  }
  /**
   * <pre>
   * Source document-links.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DocumentLink getDocumentLinks(int index) {
    return documentLinks_.get(index);
  }
  /**
   * <pre>
   * Source document-links.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder getDocumentLinksOrBuilder(
      int index) {
    return documentLinks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < documentLinks_.size(); i++) {
      output.writeMessage(1, documentLinks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < documentLinks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, documentLinks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse other = (com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse) obj;

    if (!getDocumentLinksList()
        .equals(other.getDocumentLinksList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getDocumentLinksCount() > 0) {
      hash = (37 * hash) + DOCUMENT_LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentLinksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse prototype) {
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
   * Response message for DocumentLinkService.ListLinkedSources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse)
      com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto.internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto.internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse.class, com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse.newBuilder()
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
      if (documentLinksBuilder_ == null) {
        documentLinks_ = java.util.Collections.emptyList();
      } else {
        documentLinks_ = null;
        documentLinksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto.internal_static_google_cloud_contentwarehouse_v1_ListLinkedSourcesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse build() {
      com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse buildPartial() {
      com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse result = new com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse result) {
      if (documentLinksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          documentLinks_ = java.util.Collections.unmodifiableList(documentLinks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.documentLinks_ = documentLinks_;
      } else {
        result.documentLinks_ = documentLinksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse other) {
      if (other == com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse.getDefaultInstance()) return this;
      if (documentLinksBuilder_ == null) {
        if (!other.documentLinks_.isEmpty()) {
          if (documentLinks_.isEmpty()) {
            documentLinks_ = other.documentLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDocumentLinksIsMutable();
            documentLinks_.addAll(other.documentLinks_);
          }
          onChanged();
        }
      } else {
        if (!other.documentLinks_.isEmpty()) {
          if (documentLinksBuilder_.isEmpty()) {
            documentLinksBuilder_.dispose();
            documentLinksBuilder_ = null;
            documentLinks_ = other.documentLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            documentLinksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDocumentLinksFieldBuilder() : null;
          } else {
            documentLinksBuilder_.addAllMessages(other.documentLinks_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
              com.google.cloud.contentwarehouse.v1.DocumentLink m =
                  input.readMessage(
                      com.google.cloud.contentwarehouse.v1.DocumentLink.parser(),
                      extensionRegistry);
              if (documentLinksBuilder_ == null) {
                ensureDocumentLinksIsMutable();
                documentLinks_.add(m);
              } else {
                documentLinksBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.contentwarehouse.v1.DocumentLink> documentLinks_ =
      java.util.Collections.emptyList();
    private void ensureDocumentLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        documentLinks_ = new java.util.ArrayList<com.google.cloud.contentwarehouse.v1.DocumentLink>(documentLinks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.contentwarehouse.v1.DocumentLink, com.google.cloud.contentwarehouse.v1.DocumentLink.Builder, com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder> documentLinksBuilder_;

    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.DocumentLink> getDocumentLinksList() {
      if (documentLinksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(documentLinks_);
      } else {
        return documentLinksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public int getDocumentLinksCount() {
      if (documentLinksBuilder_ == null) {
        return documentLinks_.size();
      } else {
        return documentLinksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentLink getDocumentLinks(int index) {
      if (documentLinksBuilder_ == null) {
        return documentLinks_.get(index);
      } else {
        return documentLinksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder setDocumentLinks(
        int index, com.google.cloud.contentwarehouse.v1.DocumentLink value) {
      if (documentLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentLinksIsMutable();
        documentLinks_.set(index, value);
        onChanged();
      } else {
        documentLinksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder setDocumentLinks(
        int index, com.google.cloud.contentwarehouse.v1.DocumentLink.Builder builderForValue) {
      if (documentLinksBuilder_ == null) {
        ensureDocumentLinksIsMutable();
        documentLinks_.set(index, builderForValue.build());
        onChanged();
      } else {
        documentLinksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder addDocumentLinks(com.google.cloud.contentwarehouse.v1.DocumentLink value) {
      if (documentLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentLinksIsMutable();
        documentLinks_.add(value);
        onChanged();
      } else {
        documentLinksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder addDocumentLinks(
        int index, com.google.cloud.contentwarehouse.v1.DocumentLink value) {
      if (documentLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentLinksIsMutable();
        documentLinks_.add(index, value);
        onChanged();
      } else {
        documentLinksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder addDocumentLinks(
        com.google.cloud.contentwarehouse.v1.DocumentLink.Builder builderForValue) {
      if (documentLinksBuilder_ == null) {
        ensureDocumentLinksIsMutable();
        documentLinks_.add(builderForValue.build());
        onChanged();
      } else {
        documentLinksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder addDocumentLinks(
        int index, com.google.cloud.contentwarehouse.v1.DocumentLink.Builder builderForValue) {
      if (documentLinksBuilder_ == null) {
        ensureDocumentLinksIsMutable();
        documentLinks_.add(index, builderForValue.build());
        onChanged();
      } else {
        documentLinksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder addAllDocumentLinks(
        java.lang.Iterable<? extends com.google.cloud.contentwarehouse.v1.DocumentLink> values) {
      if (documentLinksBuilder_ == null) {
        ensureDocumentLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, documentLinks_);
        onChanged();
      } else {
        documentLinksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder clearDocumentLinks() {
      if (documentLinksBuilder_ == null) {
        documentLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        documentLinksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public Builder removeDocumentLinks(int index) {
      if (documentLinksBuilder_ == null) {
        ensureDocumentLinksIsMutable();
        documentLinks_.remove(index);
        onChanged();
      } else {
        documentLinksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentLink.Builder getDocumentLinksBuilder(
        int index) {
      return getDocumentLinksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder getDocumentLinksOrBuilder(
        int index) {
      if (documentLinksBuilder_ == null) {
        return documentLinks_.get(index);  } else {
        return documentLinksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder> 
         getDocumentLinksOrBuilderList() {
      if (documentLinksBuilder_ != null) {
        return documentLinksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(documentLinks_);
      }
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentLink.Builder addDocumentLinksBuilder() {
      return getDocumentLinksFieldBuilder().addBuilder(
          com.google.cloud.contentwarehouse.v1.DocumentLink.getDefaultInstance());
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentLink.Builder addDocumentLinksBuilder(
        int index) {
      return getDocumentLinksFieldBuilder().addBuilder(
          index, com.google.cloud.contentwarehouse.v1.DocumentLink.getDefaultInstance());
    }
    /**
     * <pre>
     * Source document-links.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentLink document_links = 1;</code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.DocumentLink.Builder> 
         getDocumentLinksBuilderList() {
      return getDocumentLinksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.contentwarehouse.v1.DocumentLink, com.google.cloud.contentwarehouse.v1.DocumentLink.Builder, com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder> 
        getDocumentLinksFieldBuilder() {
      if (documentLinksBuilder_ == null) {
        documentLinksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.DocumentLink, com.google.cloud.contentwarehouse.v1.DocumentLink.Builder, com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder>(
                documentLinks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        documentLinks_ = null;
      }
      return documentLinksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse)
  private static final com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse();
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLinkedSourcesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLinkedSourcesResponse>() {
    @java.lang.Override
    public ListLinkedSourcesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListLinkedSourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLinkedSourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

