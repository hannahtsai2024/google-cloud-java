/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/securitycenter/v2/source.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

public final class SourceProto {
  private SourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Source_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Source_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/securitycenter/v2/source."
          + "proto\022\036google.cloud.securitycenter.v2\032\031g"
          + "oogle/api/resource.proto\"\375\001\n\006Source\022\014\n\004n"
          + "ame\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013descr"
          + "iption\030\003 \001(\t\022\026\n\016canonical_name\030\004 \001(\t:\241\001\352"
          + "A\235\001\n$securitycenter.googleapis.com/Sourc"
          + "e\022-organizations/{organization}/sources/"
          + "{source}\022!folders/{folder}/sources/{sour"
          + "ce}\022#projects/{project}/sources/{source}"
          + "B\345\001\n\"com.google.cloud.securitycenter.v2B"
          + "\013SourceProtoP\001ZJcloud.google.com/go/secu"
          + "ritycenter/apiv2/securitycenterpb;securi"
          + "tycenterpb\252\002\036Google.Cloud.SecurityCenter"
          + ".V2\312\002\036Google\\Cloud\\SecurityCenter\\V2\352\002!G"
          + "oogle::Cloud::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_Source_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Source_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Source_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "CanonicalName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
