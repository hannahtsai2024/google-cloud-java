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
// source: google/cloud/talent/v4beta1/tenant.proto

package com.google.cloud.talent.v4beta1;

public final class TenantResourceProto {
  private TenantResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Tenant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Tenant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/talent/v4beta1/tenant.pro"
          + "to\022\033google.cloud.talent.v4beta1\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\"\304\002\n\006Tenant\022\014\n\004name\030\001 \001(\t\022\031\n\013"
          + "external_id\030\002 \001(\tB\004\342A\001\002\022E\n\nusage_type\030\003 "
          + "\001(\01621.google.cloud.talent.v4beta1.Tenant"
          + ".DataUsageType\0224\n,keyword_searchable_pro"
          + "file_custom_attributes\030\004 \003(\t\"N\n\rDataUsag"
          + "eType\022\037\n\033DATA_USAGE_TYPE_UNSPECIFIED\020\000\022\016"
          + "\n\nAGGREGATED\020\001\022\014\n\010ISOLATED\020\002:D\352AA\n\032jobs."
          + "googleapis.com/Tenant\022#projects/{project"
          + "}/tenants/{tenant}Bw\n\037com.google.cloud.t"
          + "alent.v4beta1B\023TenantResourceProtoP\001Z7cl"
          + "oud.google.com/go/talent/apiv4beta1/tale"
          + "ntpb;talentpb\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_Tenant_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Tenant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Tenant_descriptor,
            new java.lang.String[] {
              "Name", "ExternalId", "UsageType", "KeywordSearchableProfileCustomAttributes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
