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
// source: google/cloud/vision/v1p3beta1/product_search.proto

package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Supported product search categories.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.vision.v1p3beta1.ProductSearchCategory}
 */
public enum ProductSearchCategory implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value used when a category is not specified.
   * </pre>
   *
   * <code>PRODUCT_SEARCH_CATEGORY_UNSPECIFIED = 0;</code>
   */
  PRODUCT_SEARCH_CATEGORY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Shoes category.
   * </pre>
   *
   * <code>SHOES = 1;</code>
   */
  SHOES(1),
  /**
   *
   *
   * <pre>
   * Bags category.
   * </pre>
   *
   * <code>BAGS = 2;</code>
   */
  BAGS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value used when a category is not specified.
   * </pre>
   *
   * <code>PRODUCT_SEARCH_CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int PRODUCT_SEARCH_CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Shoes category.
   * </pre>
   *
   * <code>SHOES = 1;</code>
   */
  public static final int SHOES_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Bags category.
   * </pre>
   *
   * <code>BAGS = 2;</code>
   */
  public static final int BAGS_VALUE = 2;

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
  public static ProductSearchCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProductSearchCategory forNumber(int value) {
    switch (value) {
      case 0:
        return PRODUCT_SEARCH_CATEGORY_UNSPECIFIED;
      case 1:
        return SHOES;
      case 2:
        return BAGS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProductSearchCategory>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ProductSearchCategory>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProductSearchCategory>() {
            public ProductSearchCategory findValueByNumber(int number) {
              return ProductSearchCategory.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final ProductSearchCategory[] VALUES = values();

  public static ProductSearchCategory valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProductSearchCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.vision.v1p3beta1.ProductSearchCategory)
}
