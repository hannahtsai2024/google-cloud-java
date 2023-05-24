// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

/**
 * <pre>
 * Request to set a breakpoint
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.SetBreakpointRequest}
 */
public final class SetBreakpointRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.SetBreakpointRequest)
    SetBreakpointRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetBreakpointRequest.newBuilder() to construct.
  private SetBreakpointRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetBreakpointRequest() {
    debuggeeId_ = "";
    clientVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetBreakpointRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.SetBreakpointRequest.class, com.google.devtools.clouddebugger.v2.SetBreakpointRequest.Builder.class);
  }

  public static final int DEBUGGEE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object debuggeeId_ = "";
  /**
   * <pre>
   * Required. ID of the debuggee where the breakpoint is to be set.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggeeId.
   */
  @java.lang.Override
  public java.lang.String getDebuggeeId() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      debuggeeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. ID of the debuggee where the breakpoint is to be set.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for debuggeeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDebuggeeIdBytes() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      debuggeeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BREAKPOINT_FIELD_NUMBER = 2;
  private com.google.devtools.clouddebugger.v2.Breakpoint breakpoint_;
  /**
   * <pre>
   * Required. Breakpoint specification to set.
   * The field `location` of the breakpoint must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the breakpoint field is set.
   */
  @java.lang.Override
  public boolean hasBreakpoint() {
    return breakpoint_ != null;
  }
  /**
   * <pre>
   * Required. Breakpoint specification to set.
   * The field `location` of the breakpoint must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The breakpoint.
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint() {
    return breakpoint_ == null ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance() : breakpoint_;
  }
  /**
   * <pre>
   * Required. Breakpoint specification to set.
   * The field `location` of the breakpoint must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder() {
    return breakpoint_ == null ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance() : breakpoint_;
  }

  public static final int CLIENT_VERSION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientVersion_ = "";
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientVersion.
   */
  @java.lang.Override
  public java.lang.String getClientVersion() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientVersionBytes() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(debuggeeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, debuggeeId_);
    }
    if (breakpoint_ != null) {
      output.writeMessage(2, getBreakpoint());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, clientVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(debuggeeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, debuggeeId_);
    }
    if (breakpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBreakpoint());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, clientVersion_);
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.SetBreakpointRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.SetBreakpointRequest other = (com.google.devtools.clouddebugger.v2.SetBreakpointRequest) obj;

    if (!getDebuggeeId()
        .equals(other.getDebuggeeId())) return false;
    if (hasBreakpoint() != other.hasBreakpoint()) return false;
    if (hasBreakpoint()) {
      if (!getBreakpoint()
          .equals(other.getBreakpoint())) return false;
    }
    if (!getClientVersion()
        .equals(other.getClientVersion())) return false;
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
    hash = (37 * hash) + DEBUGGEE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDebuggeeId().hashCode();
    if (hasBreakpoint()) {
      hash = (37 * hash) + BREAKPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getBreakpoint().hashCode();
    }
    hash = (37 * hash) + CLIENT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getClientVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.SetBreakpointRequest prototype) {
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
   * Request to set a breakpoint
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.SetBreakpointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.SetBreakpointRequest)
      com.google.devtools.clouddebugger.v2.SetBreakpointRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.SetBreakpointRequest.class, com.google.devtools.clouddebugger.v2.SetBreakpointRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.SetBreakpointRequest.newBuilder()
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
      debuggeeId_ = "";
      breakpoint_ = null;
      if (breakpointBuilder_ != null) {
        breakpointBuilder_.dispose();
        breakpointBuilder_ = null;
      }
      clientVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_SetBreakpointRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.SetBreakpointRequest getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.SetBreakpointRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.SetBreakpointRequest build() {
      com.google.devtools.clouddebugger.v2.SetBreakpointRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.SetBreakpointRequest buildPartial() {
      com.google.devtools.clouddebugger.v2.SetBreakpointRequest result = new com.google.devtools.clouddebugger.v2.SetBreakpointRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.clouddebugger.v2.SetBreakpointRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.debuggeeId_ = debuggeeId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.breakpoint_ = breakpointBuilder_ == null
            ? breakpoint_
            : breakpointBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.clientVersion_ = clientVersion_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.clouddebugger.v2.SetBreakpointRequest) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.SetBreakpointRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.SetBreakpointRequest other) {
      if (other == com.google.devtools.clouddebugger.v2.SetBreakpointRequest.getDefaultInstance()) return this;
      if (!other.getDebuggeeId().isEmpty()) {
        debuggeeId_ = other.debuggeeId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBreakpoint()) {
        mergeBreakpoint(other.getBreakpoint());
      }
      if (!other.getClientVersion().isEmpty()) {
        clientVersion_ = other.clientVersion_;
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
              debuggeeId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBreakpointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 34: {
              clientVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private java.lang.Object debuggeeId_ = "";
    /**
     * <pre>
     * Required. ID of the debuggee where the breakpoint is to be set.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The debuggeeId.
     */
    public java.lang.String getDebuggeeId() {
      java.lang.Object ref = debuggeeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        debuggeeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the debuggee where the breakpoint is to be set.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for debuggeeId.
     */
    public com.google.protobuf.ByteString
        getDebuggeeIdBytes() {
      java.lang.Object ref = debuggeeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        debuggeeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the debuggee where the breakpoint is to be set.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The debuggeeId to set.
     * @return This builder for chaining.
     */
    public Builder setDebuggeeId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      debuggeeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the debuggee where the breakpoint is to be set.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDebuggeeId() {
      debuggeeId_ = getDefaultInstance().getDebuggeeId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the debuggee where the breakpoint is to be set.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for debuggeeId to set.
     * @return This builder for chaining.
     */
    public Builder setDebuggeeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      debuggeeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.devtools.clouddebugger.v2.Breakpoint breakpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouddebugger.v2.Breakpoint, com.google.devtools.clouddebugger.v2.Breakpoint.Builder, com.google.devtools.clouddebugger.v2.BreakpointOrBuilder> breakpointBuilder_;
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the breakpoint field is set.
     */
    public boolean hasBreakpoint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The breakpoint.
     */
    public com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint() {
      if (breakpointBuilder_ == null) {
        return breakpoint_ == null ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance() : breakpoint_;
      } else {
        return breakpointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBreakpoint(com.google.devtools.clouddebugger.v2.Breakpoint value) {
      if (breakpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        breakpoint_ = value;
      } else {
        breakpointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBreakpoint(
        com.google.devtools.clouddebugger.v2.Breakpoint.Builder builderForValue) {
      if (breakpointBuilder_ == null) {
        breakpoint_ = builderForValue.build();
      } else {
        breakpointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeBreakpoint(com.google.devtools.clouddebugger.v2.Breakpoint value) {
      if (breakpointBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          breakpoint_ != null &&
          breakpoint_ != com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance()) {
          getBreakpointBuilder().mergeFrom(value);
        } else {
          breakpoint_ = value;
        }
      } else {
        breakpointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearBreakpoint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      breakpoint_ = null;
      if (breakpointBuilder_ != null) {
        breakpointBuilder_.dispose();
        breakpointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.clouddebugger.v2.Breakpoint.Builder getBreakpointBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBreakpointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder() {
      if (breakpointBuilder_ != null) {
        return breakpointBuilder_.getMessageOrBuilder();
      } else {
        return breakpoint_ == null ?
            com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance() : breakpoint_;
      }
    }
    /**
     * <pre>
     * Required. Breakpoint specification to set.
     * The field `location` of the breakpoint must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouddebugger.v2.Breakpoint, com.google.devtools.clouddebugger.v2.Breakpoint.Builder, com.google.devtools.clouddebugger.v2.BreakpointOrBuilder> 
        getBreakpointFieldBuilder() {
      if (breakpointBuilder_ == null) {
        breakpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Breakpoint, com.google.devtools.clouddebugger.v2.Breakpoint.Builder, com.google.devtools.clouddebugger.v2.BreakpointOrBuilder>(
                getBreakpoint(),
                getParentForChildren(),
                isClean());
        breakpoint_ = null;
      }
      return breakpointBuilder_;
    }

    private java.lang.Object clientVersion_ = "";
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The clientVersion.
     */
    public java.lang.String getClientVersion() {
      java.lang.Object ref = clientVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for clientVersion.
     */
    public com.google.protobuf.ByteString
        getClientVersionBytes() {
      java.lang.Object ref = clientVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientVersion() {
      clientVersion_ = getDefaultInstance().getClientVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.SetBreakpointRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.SetBreakpointRequest)
  private static final com.google.devtools.clouddebugger.v2.SetBreakpointRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.SetBreakpointRequest();
  }

  public static com.google.devtools.clouddebugger.v2.SetBreakpointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetBreakpointRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetBreakpointRequest>() {
    @java.lang.Override
    public SetBreakpointRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetBreakpointRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetBreakpointRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.SetBreakpointRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

