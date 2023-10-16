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
// source: google/cloud/notebooks/v2/gce_setup.proto

package com.google.cloud.notebooks.v2;

/**
 *
 *
 * <pre>
 * Possible disk types.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.notebooks.v2.DiskType}
 */
public enum DiskType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Disk type not set.
   * </pre>
   *
   * <code>DISK_TYPE_UNSPECIFIED = 0;</code>
   */
  DISK_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Standard persistent disk type.
   * </pre>
   *
   * <code>PD_STANDARD = 1;</code>
   */
  PD_STANDARD(1),
  /**
   *
   *
   * <pre>
   * SSD persistent disk type.
   * </pre>
   *
   * <code>PD_SSD = 2;</code>
   */
  PD_SSD(2),
  /**
   *
   *
   * <pre>
   * Balanced persistent disk type.
   * </pre>
   *
   * <code>PD_BALANCED = 3;</code>
   */
  PD_BALANCED(3),
  /**
   *
   *
   * <pre>
   * Extreme persistent disk type.
   * </pre>
   *
   * <code>PD_EXTREME = 4;</code>
   */
  PD_EXTREME(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Disk type not set.
   * </pre>
   *
   * <code>DISK_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DISK_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Standard persistent disk type.
   * </pre>
   *
   * <code>PD_STANDARD = 1;</code>
   */
  public static final int PD_STANDARD_VALUE = 1;
  /**
   *
   *
   * <pre>
   * SSD persistent disk type.
   * </pre>
   *
   * <code>PD_SSD = 2;</code>
   */
  public static final int PD_SSD_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Balanced persistent disk type.
   * </pre>
   *
   * <code>PD_BALANCED = 3;</code>
   */
  public static final int PD_BALANCED_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Extreme persistent disk type.
   * </pre>
   *
   * <code>PD_EXTREME = 4;</code>
   */
  public static final int PD_EXTREME_VALUE = 4;

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
  public static DiskType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DiskType forNumber(int value) {
    switch (value) {
      case 0:
        return DISK_TYPE_UNSPECIFIED;
      case 1:
        return PD_STANDARD;
      case 2:
        return PD_SSD;
      case 3:
        return PD_BALANCED;
      case 4:
        return PD_EXTREME;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiskType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DiskType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DiskType>() {
        public DiskType findValueByNumber(int number) {
          return DiskType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.notebooks.v2.GceSetupProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final DiskType[] VALUES = values();

  public static DiskType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DiskType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.notebooks.v2.DiskType)
}
