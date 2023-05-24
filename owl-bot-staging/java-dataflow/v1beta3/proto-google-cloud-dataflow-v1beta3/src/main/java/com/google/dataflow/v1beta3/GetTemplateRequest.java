// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/templates.proto

package com.google.dataflow.v1beta3;

/**
 * <pre>
 * A request to retrieve a Cloud Dataflow job template.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.GetTemplateRequest}
 */
public final class GetTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.GetTemplateRequest)
    GetTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTemplateRequest.newBuilder() to construct.
  private GetTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTemplateRequest() {
    projectId_ = "";
    view_ = 0;
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTemplateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.dataflow.v1beta3.TemplatesProto.internal_static_google_dataflow_v1beta3_GetTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.TemplatesProto.internal_static_google_dataflow_v1beta3_GetTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.GetTemplateRequest.class, com.google.dataflow.v1beta3.GetTemplateRequest.Builder.class);
  }

  /**
   * <pre>
   * The various views of a template that may be retrieved.
   * </pre>
   *
   * Protobuf enum {@code google.dataflow.v1beta3.GetTemplateRequest.TemplateView}
   */
  public enum TemplateView
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Template view that retrieves only the metadata associated with the
     * template.
     * </pre>
     *
     * <code>METADATA_ONLY = 0;</code>
     */
    METADATA_ONLY(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Template view that retrieves only the metadata associated with the
     * template.
     * </pre>
     *
     * <code>METADATA_ONLY = 0;</code>
     */
    public static final int METADATA_ONLY_VALUE = 0;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TemplateView valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TemplateView forNumber(int value) {
      switch (value) {
        case 0: return METADATA_ONLY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TemplateView>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TemplateView> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TemplateView>() {
            public TemplateView findValueByNumber(int number) {
              return TemplateView.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.dataflow.v1beta3.GetTemplateRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final TemplateView[] VALUES = values();

    public static TemplateView valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TemplateView(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.GetTemplateRequest.TemplateView)
  }

  private int templateCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object template_;
  public enum TemplateCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_PATH(2),
    TEMPLATE_NOT_SET(0);
    private final int value;
    private TemplateCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TemplateCase valueOf(int value) {
      return forNumber(value);
    }

    public static TemplateCase forNumber(int value) {
      switch (value) {
        case 2: return GCS_PATH;
        case 0: return TEMPLATE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TemplateCase
  getTemplateCase() {
    return TemplateCase.forNumber(
        templateCase_);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   * <pre>
   * Required. The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_PATH_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Required. A Cloud Storage path to the template from which to
   * create the job.
   * Must be valid Cloud Storage URL, beginning with 'gs://'.
   * </pre>
   *
   * <code>string gcs_path = 2;</code>
   * @return Whether the gcsPath field is set.
   */
  public boolean hasGcsPath() {
    return templateCase_ == 2;
  }
  /**
   * <pre>
   * Required. A Cloud Storage path to the template from which to
   * create the job.
   * Must be valid Cloud Storage URL, beginning with 'gs://'.
   * </pre>
   *
   * <code>string gcs_path = 2;</code>
   * @return The gcsPath.
   */
  public java.lang.String getGcsPath() {
    java.lang.Object ref = "";
    if (templateCase_ == 2) {
      ref = template_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (templateCase_ == 2) {
        template_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Required. A Cloud Storage path to the template from which to
   * create the job.
   * Must be valid Cloud Storage URL, beginning with 'gs://'.
   * </pre>
   *
   * <code>string gcs_path = 2;</code>
   * @return The bytes for gcsPath.
   */
  public com.google.protobuf.ByteString
      getGcsPathBytes() {
    java.lang.Object ref = "";
    if (templateCase_ == 2) {
      ref = template_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (templateCase_ == 2) {
        template_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 3;
  private int view_ = 0;
  /**
   * <pre>
   * The view to retrieve. Defaults to METADATA_ONLY.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.GetTemplateRequest.TemplateView view = 3;</code>
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override public int getViewValue() {
    return view_;
  }
  /**
   * <pre>
   * The view to retrieve. Defaults to METADATA_ONLY.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.GetTemplateRequest.TemplateView view = 3;</code>
   * @return The view.
   */
  @java.lang.Override public com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView getView() {
    com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView result = com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView.forNumber(view_);
    return result == null ? com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView.UNRECOGNIZED : result;
  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
   * which to direct the request.
   * </pre>
   *
   * <code>string location = 4;</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
   * which to direct the request.
   * </pre>
   *
   * <code>string location = 4;</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (templateCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, template_);
    }
    if (view_ != com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView.METADATA_ONLY.getNumber()) {
      output.writeEnum(3, view_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, location_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (templateCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, template_);
    }
    if (view_ != com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView.METADATA_ONLY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, view_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, location_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.GetTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.GetTemplateRequest other = (com.google.dataflow.v1beta3.GetTemplateRequest) obj;

    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (view_ != other.view_) return false;
    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (!getTemplateCase().equals(other.getTemplateCase())) return false;
    switch (templateCase_) {
      case 2:
        if (!getGcsPath()
            .equals(other.getGcsPath())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    switch (templateCase_) {
      case 2:
        hash = (37 * hash) + GCS_PATH_FIELD_NUMBER;
        hash = (53 * hash) + getGcsPath().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.GetTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.GetTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.GetTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.google.dataflow.v1beta3.GetTemplateRequest prototype) {
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
   * A request to retrieve a Cloud Dataflow job template.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.GetTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.GetTemplateRequest)
      com.google.dataflow.v1beta3.GetTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.dataflow.v1beta3.TemplatesProto.internal_static_google_dataflow_v1beta3_GetTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.TemplatesProto.internal_static_google_dataflow_v1beta3_GetTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.GetTemplateRequest.class, com.google.dataflow.v1beta3.GetTemplateRequest.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.GetTemplateRequest.newBuilder()
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
      projectId_ = "";
      view_ = 0;
      location_ = "";
      templateCase_ = 0;
      template_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.dataflow.v1beta3.TemplatesProto.internal_static_google_dataflow_v1beta3_GetTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.GetTemplateRequest getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.GetTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.GetTemplateRequest build() {
      com.google.dataflow.v1beta3.GetTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.GetTemplateRequest buildPartial() {
      com.google.dataflow.v1beta3.GetTemplateRequest result = new com.google.dataflow.v1beta3.GetTemplateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.GetTemplateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectId_ = projectId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.view_ = view_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.location_ = location_;
      }
    }

    private void buildPartialOneofs(com.google.dataflow.v1beta3.GetTemplateRequest result) {
      result.templateCase_ = templateCase_;
      result.template_ = this.template_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.dataflow.v1beta3.GetTemplateRequest) {
        return mergeFrom((com.google.dataflow.v1beta3.GetTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.GetTemplateRequest other) {
      if (other == com.google.dataflow.v1beta3.GetTemplateRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      switch (other.getTemplateCase()) {
        case GCS_PATH: {
          templateCase_ = 2;
          template_ = other.template_;
          onChanged();
          break;
        }
        case TEMPLATE_NOT_SET: {
          break;
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
              projectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              templateCase_ = 2;
              template_ = s;
              break;
            } // case 18
            case 24: {
              view_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              location_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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
    private int templateCase_ = 0;
    private java.lang.Object template_;
    public TemplateCase
        getTemplateCase() {
      return TemplateCase.forNumber(
          templateCase_);
    }

    public Builder clearTemplate() {
      templateCase_ = 0;
      template_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * Required. The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Required. A Cloud Storage path to the template from which to
     * create the job.
     * Must be valid Cloud Storage URL, beginning with 'gs://'.
     * </pre>
     *
     * <code>string gcs_path = 2;</code>
     * @return Whether the gcsPath field is set.
     */
    @java.lang.Override
    public boolean hasGcsPath() {
      return templateCase_ == 2;
    }
    /**
     * <pre>
     * Required. A Cloud Storage path to the template from which to
     * create the job.
     * Must be valid Cloud Storage URL, beginning with 'gs://'.
     * </pre>
     *
     * <code>string gcs_path = 2;</code>
     * @return The gcsPath.
     */
    @java.lang.Override
    public java.lang.String getGcsPath() {
      java.lang.Object ref = "";
      if (templateCase_ == 2) {
        ref = template_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (templateCase_ == 2) {
          template_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. A Cloud Storage path to the template from which to
     * create the job.
     * Must be valid Cloud Storage URL, beginning with 'gs://'.
     * </pre>
     *
     * <code>string gcs_path = 2;</code>
     * @return The bytes for gcsPath.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGcsPathBytes() {
      java.lang.Object ref = "";
      if (templateCase_ == 2) {
        ref = template_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (templateCase_ == 2) {
          template_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. A Cloud Storage path to the template from which to
     * create the job.
     * Must be valid Cloud Storage URL, beginning with 'gs://'.
     * </pre>
     *
     * <code>string gcs_path = 2;</code>
     * @param value The gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      templateCase_ = 2;
      template_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Cloud Storage path to the template from which to
     * create the job.
     * Must be valid Cloud Storage URL, beginning with 'gs://'.
     * </pre>
     *
     * <code>string gcs_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcsPath() {
      if (templateCase_ == 2) {
        templateCase_ = 0;
        template_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. A Cloud Storage path to the template from which to
     * create the job.
     * Must be valid Cloud Storage URL, beginning with 'gs://'.
     * </pre>
     *
     * <code>string gcs_path = 2;</code>
     * @param value The bytes for gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      templateCase_ = 2;
      template_ = value;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     * <pre>
     * The view to retrieve. Defaults to METADATA_ONLY.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.GetTemplateRequest.TemplateView view = 3;</code>
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override public int getViewValue() {
      return view_;
    }
    /**
     * <pre>
     * The view to retrieve. Defaults to METADATA_ONLY.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.GetTemplateRequest.TemplateView view = 3;</code>
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      view_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The view to retrieve. Defaults to METADATA_ONLY.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.GetTemplateRequest.TemplateView view = 3;</code>
     * @return The view.
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView getView() {
      com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView result = com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView.forNumber(view_);
      return result == null ? com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The view to retrieve. Defaults to METADATA_ONLY.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.GetTemplateRequest.TemplateView view = 3;</code>
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.dataflow.v1beta3.GetTemplateRequest.TemplateView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The view to retrieve. Defaults to METADATA_ONLY.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.GetTemplateRequest.TemplateView view = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000004);
      view_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
     * which to direct the request.
     * </pre>
     *
     * <code>string location = 4;</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
     * which to direct the request.
     * </pre>
     *
     * <code>string location = 4;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
     * which to direct the request.
     * </pre>
     *
     * <code>string location = 4;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      location_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
     * which to direct the request.
     * </pre>
     *
     * <code>string location = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
     * which to direct the request.
     * </pre>
     *
     * <code>string location = 4;</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.GetTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.GetTemplateRequest)
  private static final com.google.dataflow.v1beta3.GetTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.GetTemplateRequest();
  }

  public static com.google.dataflow.v1beta3.GetTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTemplateRequest>() {
    @java.lang.Override
    public GetTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.GetTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

