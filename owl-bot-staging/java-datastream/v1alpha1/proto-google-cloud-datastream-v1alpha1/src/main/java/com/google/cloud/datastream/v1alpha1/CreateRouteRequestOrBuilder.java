// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream.proto

package com.google.cloud.datastream.v1alpha1;

public interface CreateRouteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.CreateRouteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent that owns the collection of Routes.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent that owns the collection of Routes.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The Route identifier.
   * </pre>
   *
   * <code>string route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The routeId.
   */
  java.lang.String getRouteId();
  /**
   * <pre>
   * Required. The Route identifier.
   * </pre>
   *
   * <code>string route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for routeId.
   */
  com.google.protobuf.ByteString
      getRouteIdBytes();

  /**
   * <pre>
   * Required. The Route resource to create.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Route route = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the route field is set.
   */
  boolean hasRoute();
  /**
   * <pre>
   * Required. The Route resource to create.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Route route = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The route.
   */
  com.google.cloud.datastream.v1alpha1.Route getRoute();
  /**
   * <pre>
   * Required. The Route resource to create.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Route route = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datastream.v1alpha1.RouteOrBuilder getRouteOrBuilder();

  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
