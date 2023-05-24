// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SetQuicOverrideTargetHttpsProxyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest target_https_proxies_set_quic_override_request_resource = 72940258 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the targetHttpsProxiesSetQuicOverrideRequestResource field is set.
   */
  boolean hasTargetHttpsProxiesSetQuicOverrideRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest target_https_proxies_set_quic_override_request_resource = 72940258 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetHttpsProxiesSetQuicOverrideRequestResource.
   */
  com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest getTargetHttpsProxiesSetQuicOverrideRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest target_https_proxies_set_quic_override_request_resource = 72940258 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequestOrBuilder getTargetHttpsProxiesSetQuicOverrideRequestResourceOrBuilder();

  /**
   * <pre>
   * Name of the TargetHttpsProxy resource to set the QUIC override policy for. The name should conform to RFC1035.
   * </pre>
   *
   * <code>string target_https_proxy = 52336748 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetHttpsProxy.
   */
  java.lang.String getTargetHttpsProxy();
  /**
   * <pre>
   * Name of the TargetHttpsProxy resource to set the QUIC override policy for. The name should conform to RFC1035.
   * </pre>
   *
   * <code>string target_https_proxy = 52336748 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetHttpsProxy.
   */
  com.google.protobuf.ByteString
      getTargetHttpsProxyBytes();
}
