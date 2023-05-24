// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/version.proto

package com.google.cloud.dialogflow.v2;

public final class VersionProto {
  private VersionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_Version_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_GetVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/version.pro" +
      "to\022\032google.cloud.dialogflow.v2\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032\033google/protob" +
      "uf/empty.proto\032 google/protobuf/field_ma" +
      "sk.proto\032\037google/protobuf/timestamp.prot" +
      "o\"\310\003\n\007Version\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\031\n\013des" +
      "cription\030\002 \001(\tB\004\342A\001\001\022\034\n\016version_number\030\003" +
      " \001(\005B\004\342A\001\003\0225\n\013create_time\030\004 \001(\0132\032.google" +
      ".protobuf.TimestampB\004\342A\001\003\022G\n\006status\030\006 \001(" +
      "\01621.google.cloud.dialogflow.v2.Version.V" +
      "ersionStatusB\004\342A\001\003\"W\n\rVersionStatus\022\036\n\032V" +
      "ERSION_STATUS_UNSPECIFIED\020\000\022\017\n\013IN_PROGRE" +
      "SS\020\001\022\t\n\005READY\020\002\022\n\n\006FAILED\020\003:\226\001\352A\222\001\n!dial" +
      "ogflow.googleapis.com/Version\022+projects/" +
      "{project}/agent/versions/{version}\022@proj" +
      "ects/{project}/locations/{location}/agen" +
      "t/versions/{version}\"\204\001\n\023ListVersionsReq" +
      "uest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\022!dialogflo" +
      "w.googleapis.com/Version\022\027\n\tpage_size\030\002 " +
      "\001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\"f\n\024L" +
      "istVersionsResponse\0225\n\010versions\030\001 \003(\0132#." +
      "google.cloud.dialogflow.v2.Version\022\027\n\017ne" +
      "xt_page_token\030\002 \001(\t\"M\n\021GetVersionRequest" +
      "\0228\n\004name\030\001 \001(\tB*\342A\001\002\372A#\n!dialogflow.goog" +
      "leapis.com/Version\"\216\001\n\024CreateVersionRequ" +
      "est\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\022!dialogflow" +
      ".googleapis.com/Version\022:\n\007version\030\002 \001(\013" +
      "2#.google.cloud.dialogflow.v2.VersionB\004\342" +
      "A\001\002\"\211\001\n\024UpdateVersionRequest\022:\n\007version\030" +
      "\001 \001(\0132#.google.cloud.dialogflow.v2.Versi" +
      "onB\004\342A\001\002\0225\n\013update_mask\030\002 \001(\0132\032.google.p" +
      "rotobuf.FieldMaskB\004\342A\001\002\"P\n\024DeleteVersion" +
      "Request\0228\n\004name\030\001 \001(\tB*\342A\001\002\372A#\n!dialogfl" +
      "ow.googleapis.com/Version2\374\t\n\010Versions\022\340" +
      "\001\n\014ListVersions\022/.google.cloud.dialogflo" +
      "w.v2.ListVersionsRequest\0320.google.cloud." +
      "dialogflow.v2.ListVersionsResponse\"m\332A\006p" +
      "arent\202\323\344\223\002^\022&/v2/{parent=projects/*/agen" +
      "t}/versionsZ4\0222/v2/{parent=projects/*/lo" +
      "cations/*/agent}/versions\022\315\001\n\nGetVersion" +
      "\022-.google.cloud.dialogflow.v2.GetVersion" +
      "Request\032#.google.cloud.dialogflow.v2.Ver" +
      "sion\"k\332A\004name\202\323\344\223\002^\022&/v2/{name=projects/" +
      "*/agent/versions/*}Z4\0222/v2/{name=project" +
      "s/*/locations/*/agent/versions/*}\022\360\001\n\rCr" +
      "eateVersion\0220.google.cloud.dialogflow.v2" +
      ".CreateVersionRequest\032#.google.cloud.dia" +
      "logflow.v2.Version\"\207\001\332A\016parent,version\202\323" +
      "\344\223\002p\"&/v2/{parent=projects/*/agent}/vers" +
      "ions:\007versionZ=\"2/v2/{parent=projects/*/" +
      "locations/*/agent}/versions:\007version\022\206\002\n" +
      "\rUpdateVersion\0220.google.cloud.dialogflow" +
      ".v2.UpdateVersionRequest\032#.google.cloud." +
      "dialogflow.v2.Version\"\235\001\332A\023version,updat" +
      "e_mask\202\323\344\223\002\200\0012./v2/{version.name=project" +
      "s/*/agent/versions/*}:\007versionZE2:/v2/{v" +
      "ersion.name=projects/*/locations/*/agent" +
      "/versions/*}:\007version\022\306\001\n\rDeleteVersion\022" +
      "0.google.cloud.dialogflow.v2.DeleteVersi" +
      "onRequest\032\026.google.protobuf.Empty\"k\332A\004na" +
      "me\202\323\344\223\002^*&/v2/{name=projects/*/agent/ver" +
      "sions/*}Z4*2/v2/{name=projects/*/locatio" +
      "ns/*/agent/versions/*}\032x\312A\031dialogflow.go" +
      "ogleapis.com\322AYhttps://www.googleapis.co" +
      "m/auth/cloud-platform,https://www.google" +
      "apis.com/auth/dialogflowB\225\001\n\036com.google." +
      "cloud.dialogflow.v2B\014VersionProtoP\001Z>clo" +
      "ud.google.com/go/dialogflow/apiv2/dialog" +
      "flowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\032Google.Clo" +
      "ud.Dialogflow.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2_Version_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_Version_descriptor,
        new java.lang.String[] { "Name", "Description", "VersionNumber", "CreateTime", "Status", });
    internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_descriptor,
        new java.lang.String[] { "Versions", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2_GetVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_GetVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_descriptor,
        new java.lang.String[] { "Parent", "Version", });
    internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_descriptor,
        new java.lang.String[] { "Version", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
