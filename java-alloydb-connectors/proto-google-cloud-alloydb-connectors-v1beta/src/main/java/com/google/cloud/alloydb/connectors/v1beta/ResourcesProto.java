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
// source: google/cloud/alloydb/connectors/v1beta/resources.proto

package com.google.cloud.alloydb.connectors.v1beta;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/alloydb/connectors/v1beta"
          + "/resources.proto\022&google.cloud.alloydb.c"
          + "onnectors.v1beta\032\037google/api/field_behav"
          + "ior.proto\"\352\001\n\027MetadataExchangeRequest\022\030\n"
          + "\nuser_agent\030\001 \001(\tB\004\342A\001\001\022[\n\tauth_type\030\002 \001"
          + "(\0162H.google.cloud.alloydb.connectors.v1b"
          + "eta.MetadataExchangeRequest.AuthType\022\024\n\014"
          + "oauth2_token\030\003 \001(\t\"B\n\010AuthType\022\031\n\025AUTH_T"
          + "YPE_UNSPECIFIED\020\000\022\r\n\tDB_NATIVE\020\001\022\014\n\010AUTO"
          + "_IAM\020\002\"\327\001\n\030MetadataExchangeResponse\022d\n\rr"
          + "esponse_code\030\001 \001(\0162M.google.cloud.alloyd"
          + "b.connectors.v1beta.MetadataExchangeResp"
          + "onse.ResponseCode\022\023\n\005error\030\002 \001(\tB\004\342A\001\001\"@"
          + "\n\014ResponseCode\022\035\n\031RESPONSE_CODE_UNSPECIF"
          + "IED\020\000\022\006\n\002OK\020\001\022\t\n\005ERROR\020\002B\211\002\n*com.google."
          + "cloud.alloydb.connectors.v1betaB\016Resourc"
          + "esProtoP\001ZJcloud.google.com/go/alloydb/c"
          + "onnectors/apiv1beta/connectorspb;connect"
          + "orspb\252\002&Google.Cloud.AlloyDb.Connectors."
          + "V1Beta\312\002&Google\\Cloud\\AlloyDb\\Connectors"
          + "\\V1beta\352\002*Google::Cloud::AlloyDb::Connec"
          + "tors::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_descriptor,
            new java.lang.String[] {
              "UserAgent", "AuthType", "Oauth2Token",
            });
    internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeResponse_descriptor,
            new java.lang.String[] {
              "ResponseCode", "Error",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
