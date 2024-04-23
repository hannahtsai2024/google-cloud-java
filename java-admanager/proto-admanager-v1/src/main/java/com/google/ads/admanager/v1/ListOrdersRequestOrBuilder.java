// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/order_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public interface ListOrdersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.ListOrdersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent, which owns this collection of Orders.
   * Format: `networks/{network_code}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent, which owns this collection of Orders.
   * Format: `networks/{network_code}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The maximum number of `Orders` to return. The service may return
   * fewer than this value. If unspecified, at most 50 `Orders` will be
   * returned. The maximum value is 1000; values above 1000 will be coerced to
   * 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A page token, received from a previous `ListOrders` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListOrders` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token, received from a previous `ListOrders` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListOrders` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. Expression to filter the response.
   * See syntax details at
   * https://developers.google.com/ad-manager/api/beta/filters
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. Expression to filter the response.
   * See syntax details at
   * https://developers.google.com/ad-manager/api/beta/filters
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional. Expression to specify sorting order.
   * See syntax details at
   * https://developers.google.com/ad-manager/api/beta/filters#order
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. Expression to specify sorting order.
   * See syntax details at
   * https://developers.google.com/ad-manager/api/beta/filters#order
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Optional. Number of individual resources to skip while paginating.
   * </pre>
   *
   * <code>int32 skip = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The skip.
   */
  int getSkip();
}
