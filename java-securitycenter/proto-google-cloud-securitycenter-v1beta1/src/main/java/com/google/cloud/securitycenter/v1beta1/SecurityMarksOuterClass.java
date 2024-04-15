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
// source: google/cloud/securitycenter/v1beta1/security_marks.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1beta1;

public final class SecurityMarksOuterClass {
  private SecurityMarksOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_MarksEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_MarksEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/securitycenter/v1beta1/se"
          + "curity_marks.proto\022#google.cloud.securit"
          + "ycenter.v1beta1\032\031google/api/resource.pro"
          + "to\"\330\002\n\rSecurityMarks\022\014\n\004name\030\001 \001(\t\022L\n\005ma"
          + "rks\030\002 \003(\0132=.google.cloud.securitycenter."
          + "v1beta1.SecurityMarks.MarksEntry\032,\n\nMark"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\274"
          + "\001\352A\270\001\n+securitycenter.googleapis.com/Sec"
          + "urityMarks\0229organizations/{organization}"
          + "/assets/{asset}/securityMarks\022Norganizat"
          + "ions/{organization}/sources/{source}/fin"
          + "dings/{finding}/securityMarksB|\n\'com.goo"
          + "gle.cloud.securitycenter.v1beta1P\001ZOclou"
          + "d.google.com/go/securitycenter/apiv1beta"
          + "1/securitycenterpb;securitycenterpbb\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_descriptor,
            new java.lang.String[] {
              "Name", "Marks",
            });
    internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_MarksEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_MarksEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_MarksEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
