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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

package com.google.cloud.policytroubleshooter.iam.v3;

/**
 *
 *
 * <pre>
 * Whether a role includes a specific permission.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.policytroubleshooter.iam.v3.RolePermissionInclusionState}
 */
public enum RolePermissionInclusionState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>ROLE_PERMISSION_INCLUSION_STATE_UNSPECIFIED = 0;</code>
   */
  ROLE_PERMISSION_INCLUSION_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The permission is included in the role.
   * </pre>
   *
   * <code>ROLE_PERMISSION_INCLUDED = 1;</code>
   */
  ROLE_PERMISSION_INCLUDED(1),
  /**
   *
   *
   * <pre>
   * The permission is not included in the role.
   * </pre>
   *
   * <code>ROLE_PERMISSION_NOT_INCLUDED = 2;</code>
   */
  ROLE_PERMISSION_NOT_INCLUDED(2),
  /**
   *
   *
   * <pre>
   * The sender of the request is not allowed to access the role definition.
   * </pre>
   *
   * <code>ROLE_PERMISSION_UNKNOWN_INFO = 3;</code>
   */
  ROLE_PERMISSION_UNKNOWN_INFO(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>ROLE_PERMISSION_INCLUSION_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int ROLE_PERMISSION_INCLUSION_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The permission is included in the role.
   * </pre>
   *
   * <code>ROLE_PERMISSION_INCLUDED = 1;</code>
   */
  public static final int ROLE_PERMISSION_INCLUDED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The permission is not included in the role.
   * </pre>
   *
   * <code>ROLE_PERMISSION_NOT_INCLUDED = 2;</code>
   */
  public static final int ROLE_PERMISSION_NOT_INCLUDED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The sender of the request is not allowed to access the role definition.
   * </pre>
   *
   * <code>ROLE_PERMISSION_UNKNOWN_INFO = 3;</code>
   */
  public static final int ROLE_PERMISSION_UNKNOWN_INFO_VALUE = 3;

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
  public static RolePermissionInclusionState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RolePermissionInclusionState forNumber(int value) {
    switch (value) {
      case 0:
        return ROLE_PERMISSION_INCLUSION_STATE_UNSPECIFIED;
      case 1:
        return ROLE_PERMISSION_INCLUDED;
      case 2:
        return ROLE_PERMISSION_NOT_INCLUDED;
      case 3:
        return ROLE_PERMISSION_UNKNOWN_INFO;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RolePermissionInclusionState>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RolePermissionInclusionState>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RolePermissionInclusionState>() {
            public RolePermissionInclusionState findValueByNumber(int number) {
              return RolePermissionInclusionState.forNumber(number);
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
    return com.google.cloud.policytroubleshooter.iam.v3.TroubleshooterProto.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final RolePermissionInclusionState[] VALUES = values();

  public static RolePermissionInclusionState valueOf(
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

  private RolePermissionInclusionState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.policytroubleshooter.iam.v3.RolePermissionInclusionState)
}
