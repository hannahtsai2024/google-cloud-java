/*
 * Copyright 2023 Google LLC
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
// source: google/shopping/merchant/inventories/v1beta/localinventory.proto

package com.google.shopping.merchant.inventories.v1beta;

public interface ListLocalInventoriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.inventories.v1beta.ListLocalInventoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `name` of the parent product to list local inventories for.
   * Format:
   * `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The `name` of the parent product to list local inventories for.
   * Format:
   * `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of `LocalInventory` resources for the given
   * product to return. The service returns fewer than this value if the number
   * of inventories for the given product is less that than the `pageSize`. The
   * default value is 25000. The maximum value is 25000; If a value higher than
   * the maximum is specified, then the `pageSize` will default to the maximum
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListLocalInventories` call.
   * Provide the page token to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListLocalInventories`
   * must match the call that provided the page token. The token returned as
   * [nextPageToken][google.shopping.merchant.inventories.v1beta.ListLocalInventoriesResponse.next_page_token]
   * in the response to the previous request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListLocalInventories` call.
   * Provide the page token to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListLocalInventories`
   * must match the call that provided the page token. The token returned as
   * [nextPageToken][google.shopping.merchant.inventories.v1beta.ListLocalInventoriesResponse.next_page_token]
   * in the response to the previous request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
