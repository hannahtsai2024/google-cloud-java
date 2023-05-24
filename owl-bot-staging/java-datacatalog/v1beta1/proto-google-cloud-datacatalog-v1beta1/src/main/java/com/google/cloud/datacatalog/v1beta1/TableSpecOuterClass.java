// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

package com.google.cloud.datacatalog.v1beta1;

public final class TableSpecOuterClass {
  private TableSpecOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_TableSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TableSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryDateShardedSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_BigQueryDateShardedSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/datacatalog/v1beta1/table" +
      "_spec.proto\022 google.cloud.datacatalog.v1" +
      "beta1\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\370\001\n\021BigQueryTa" +
      "bleSpec\022R\n\021table_source_type\030\001 \001(\01621.goo" +
      "gle.cloud.datacatalog.v1beta1.TableSourc" +
      "eTypeB\004\342A\001\003\022?\n\tview_spec\030\002 \001(\0132*.google." +
      "cloud.datacatalog.v1beta1.ViewSpecH\000\022A\n\n" +
      "table_spec\030\003 \001(\0132+.google.cloud.datacata" +
      "log.v1beta1.TableSpecH\000B\013\n\ttype_spec\"$\n\010" +
      "ViewSpec\022\030\n\nview_query\030\001 \001(\tB\004\342A\001\003\"M\n\tTa" +
      "bleSpec\022@\n\rgrouped_entry\030\001 \001(\tB)\342A\001\003\372A\"\n" +
      " datacatalog.googleapis.com/Entry\"\214\001\n\027Bi" +
      "gQueryDateShardedSpec\022:\n\007dataset\030\001 \001(\tB)" +
      "\342A\001\003\372A\"\n datacatalog.googleapis.com/Entr" +
      "y\022\032\n\014table_prefix\030\002 \001(\tB\004\342A\001\003\022\031\n\013shard_c" +
      "ount\030\003 \001(\003B\004\342A\001\003*[\n\017TableSourceType\022!\n\035T" +
      "ABLE_SOURCE_TYPE_UNSPECIFIED\020\000\022\021\n\rBIGQUE" +
      "RY_VIEW\020\002\022\022\n\016BIGQUERY_TABLE\020\005B\337\001\n$com.go" +
      "ogle.cloud.datacatalog.v1beta1P\001ZFcloud." +
      "google.com/go/datacatalog/apiv1beta1/dat" +
      "acatalogpb;datacatalogpb\370\001\001\252\002 Google.Clo" +
      "ud.DataCatalog.V1Beta1\312\002 Google\\Cloud\\Da" +
      "taCatalog\\V1beta1\352\002#Google::Cloud::DataC" +
      "atalog::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor,
        new java.lang.String[] { "TableSourceType", "ViewSpec", "TableSpec", "TypeSpec", });
    internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_descriptor,
        new java.lang.String[] { "ViewQuery", });
    internal_static_google_cloud_datacatalog_v1beta1_TableSpec_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1beta1_TableSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_TableSpec_descriptor,
        new java.lang.String[] { "GroupedEntry", });
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryDateShardedSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryDateShardedSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_BigQueryDateShardedSpec_descriptor,
        new java.lang.String[] { "Dataset", "TablePrefix", "ShardCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
