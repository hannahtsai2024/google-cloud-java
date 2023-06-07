/*
 * Copyright 2020 Google LLC
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
// source: google/monitoring/dashboard/v1/dashboards_service.proto

package com.google.monitoring.dashboard.v1;

/**
 *
 *
 * <pre>
 * The `CreateDashboard` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.CreateDashboardRequest}
 */
public final class CreateDashboardRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.CreateDashboardRequest)
    CreateDashboardRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDashboardRequest.newBuilder() to construct.
  private CreateDashboardRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDashboardRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDashboardRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.dashboard.v1.DashboardsServiceProto
        .internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.DashboardsServiceProto
        .internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.CreateDashboardRequest.class,
            com.google.monitoring.dashboard.v1.CreateDashboardRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project on which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project on which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DASHBOARD_FIELD_NUMBER = 2;
  private com.google.monitoring.dashboard.v1.Dashboard dashboard_;
  /**
   *
   *
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dashboard field is set.
   */
  @java.lang.Override
  public boolean hasDashboard() {
    return dashboard_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dashboard.
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.Dashboard getDashboard() {
    return dashboard_ == null
        ? com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance()
        : dashboard_;
  }
  /**
   *
   *
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.DashboardOrBuilder getDashboardOrBuilder() {
    return dashboard_ == null
        ? com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance()
        : dashboard_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * If set, validate the request and preview the review, but do not actually
   * save it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (dashboard_ != null) {
      output.writeMessage(2, getDashboard());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
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
    if (dashboard_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDashboard());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.CreateDashboardRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.CreateDashboardRequest other =
        (com.google.monitoring.dashboard.v1.CreateDashboardRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDashboard() != other.hasDashboard()) return false;
    if (hasDashboard()) {
      if (!getDashboard().equals(other.getDashboard())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasDashboard()) {
      hash = (37 * hash) + DASHBOARD_FIELD_NUMBER;
      hash = (53 * hash) + getDashboard().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest parseFrom(
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
      com.google.monitoring.dashboard.v1.CreateDashboardRequest prototype) {
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
   * The `CreateDashboard` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.CreateDashboardRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.CreateDashboardRequest)
      com.google.monitoring.dashboard.v1.CreateDashboardRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.DashboardsServiceProto
          .internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.DashboardsServiceProto
          .internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.CreateDashboardRequest.class,
              com.google.monitoring.dashboard.v1.CreateDashboardRequest.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.CreateDashboardRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      dashboard_ = null;
      if (dashboardBuilder_ != null) {
        dashboardBuilder_.dispose();
        dashboardBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.DashboardsServiceProto
          .internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.CreateDashboardRequest getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.CreateDashboardRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.CreateDashboardRequest build() {
      com.google.monitoring.dashboard.v1.CreateDashboardRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.CreateDashboardRequest buildPartial() {
      com.google.monitoring.dashboard.v1.CreateDashboardRequest result =
          new com.google.monitoring.dashboard.v1.CreateDashboardRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.CreateDashboardRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dashboard_ = dashboardBuilder_ == null ? dashboard_ : dashboardBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.CreateDashboardRequest) {
        return mergeFrom((com.google.monitoring.dashboard.v1.CreateDashboardRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.CreateDashboardRequest other) {
      if (other == com.google.monitoring.dashboard.v1.CreateDashboardRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDashboard()) {
        mergeDashboard(other.getDashboard());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getDashboardFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project on which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project on which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project on which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project on which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project on which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.monitoring.dashboard.v1.Dashboard dashboard_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.dashboard.v1.Dashboard,
            com.google.monitoring.dashboard.v1.Dashboard.Builder,
            com.google.monitoring.dashboard.v1.DashboardOrBuilder>
        dashboardBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dashboard field is set.
     */
    public boolean hasDashboard() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dashboard.
     */
    public com.google.monitoring.dashboard.v1.Dashboard getDashboard() {
      if (dashboardBuilder_ == null) {
        return dashboard_ == null
            ? com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance()
            : dashboard_;
      } else {
        return dashboardBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDashboard(com.google.monitoring.dashboard.v1.Dashboard value) {
      if (dashboardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dashboard_ = value;
      } else {
        dashboardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDashboard(
        com.google.monitoring.dashboard.v1.Dashboard.Builder builderForValue) {
      if (dashboardBuilder_ == null) {
        dashboard_ = builderForValue.build();
      } else {
        dashboardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDashboard(com.google.monitoring.dashboard.v1.Dashboard value) {
      if (dashboardBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && dashboard_ != null
            && dashboard_ != com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance()) {
          getDashboardBuilder().mergeFrom(value);
        } else {
          dashboard_ = value;
        }
      } else {
        dashboardBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDashboard() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dashboard_ = null;
      if (dashboardBuilder_ != null) {
        dashboardBuilder_.dispose();
        dashboardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.dashboard.v1.Dashboard.Builder getDashboardBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDashboardFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.dashboard.v1.DashboardOrBuilder getDashboardOrBuilder() {
      if (dashboardBuilder_ != null) {
        return dashboardBuilder_.getMessageOrBuilder();
      } else {
        return dashboard_ == null
            ? com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance()
            : dashboard_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The initial dashboard specification.
     * </pre>
     *
     * <code>
     * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.dashboard.v1.Dashboard,
            com.google.monitoring.dashboard.v1.Dashboard.Builder,
            com.google.monitoring.dashboard.v1.DashboardOrBuilder>
        getDashboardFieldBuilder() {
      if (dashboardBuilder_ == null) {
        dashboardBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.dashboard.v1.Dashboard,
                com.google.monitoring.dashboard.v1.Dashboard.Builder,
                com.google.monitoring.dashboard.v1.DashboardOrBuilder>(
                getDashboard(), getParentForChildren(), isClean());
        dashboard_ = null;
      }
      return dashboardBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * save it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * save it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * save it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.CreateDashboardRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.CreateDashboardRequest)
  private static final com.google.monitoring.dashboard.v1.CreateDashboardRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.CreateDashboardRequest();
  }

  public static com.google.monitoring.dashboard.v1.CreateDashboardRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDashboardRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDashboardRequest>() {
        @java.lang.Override
        public CreateDashboardRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDashboardRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDashboardRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.CreateDashboardRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
