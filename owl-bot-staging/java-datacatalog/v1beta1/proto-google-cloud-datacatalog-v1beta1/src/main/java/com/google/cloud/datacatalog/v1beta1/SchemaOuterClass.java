// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/schema.proto

package com.google.cloud.datacatalog.v1beta1;

public final class SchemaOuterClass {
  private SchemaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_Schema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/datacatalog/v1beta1/schem" +
      "a.proto\022 google.cloud.datacatalog.v1beta" +
      "1\032\037google/api/field_behavior.proto\"O\n\006Sc" +
      "hema\022E\n\007columns\030\002 \003(\0132..google.cloud.dat" +
      "acatalog.v1beta1.ColumnSchemaB\004\342A\001\002\"\261\001\n\014" +
      "ColumnSchema\022\024\n\006column\030\006 \001(\tB\004\342A\001\002\022\022\n\004ty" +
      "pe\030\001 \001(\tB\004\342A\001\002\022\031\n\013description\030\002 \001(\tB\004\342A\001" +
      "\001\022\022\n\004mode\030\003 \001(\tB\004\342A\001\001\022H\n\nsubcolumns\030\007 \003(" +
      "\0132..google.cloud.datacatalog.v1beta1.Col" +
      "umnSchemaB\004\342A\001\001B\337\001\n$com.google.cloud.dat" +
      "acatalog.v1beta1P\001ZFcloud.google.com/go/" +
      "datacatalog/apiv1beta1/datacatalogpb;dat" +
      "acatalogpb\370\001\001\252\002 Google.Cloud.DataCatalog" +
      ".V1Beta1\312\002 Google\\Cloud\\DataCatalog\\V1be" +
      "ta1\352\002#Google::Cloud::DataCatalog::V1beta" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1beta1_Schema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_Schema_descriptor,
        new java.lang.String[] { "Columns", });
    internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_descriptor,
        new java.lang.String[] { "Column", "Type", "Description", "Mode", "Subcolumns", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
