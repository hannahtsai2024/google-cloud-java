// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore_federation.proto

package com.google.cloud.metastore.v1;

public interface GetFederationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.GetFederationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The relative resource name of the metastore federation to
   * retrieve, in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The relative resource name of the metastore federation to
   * retrieve, in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
