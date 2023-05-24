// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog.v1beta1;

public final class Tags {
  private Tags() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/datacatalog/v1beta1/tags." +
      "proto\022 google.cloud.datacatalog.v1beta1\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\037google/protobuf/tim" +
      "estamp.proto\"\223\003\n\003Tag\022\014\n\004name\030\001 \001(\t\022\026\n\010te" +
      "mplate\030\002 \001(\tB\004\342A\001\002\022#\n\025template_display_n" +
      "ame\030\005 \001(\tB\004\342A\001\003\022\020\n\006column\030\004 \001(\tH\000\022G\n\006fie" +
      "lds\030\003 \003(\01321.google.cloud.datacatalog.v1b" +
      "eta1.Tag.FieldsEntryB\004\342A\001\002\032Y\n\013FieldsEntr" +
      "y\022\013\n\003key\030\001 \001(\t\0229\n\005value\030\002 \001(\0132*.google.c" +
      "loud.datacatalog.v1beta1.TagField:\0028\001:\201\001" +
      "\352A~\n\036datacatalog.googleapis.com/Tag\022\\pro" +
      "jects/{project}/locations/{location}/ent" +
      "ryGroups/{entry_group}/entries/{entry}/t" +
      "ags/{tag}B\007\n\005scope\"\257\002\n\010TagField\022\032\n\014displ" +
      "ay_name\030\001 \001(\tB\004\342A\001\003\022\026\n\014double_value\030\002 \001(" +
      "\001H\000\022\026\n\014string_value\030\003 \001(\tH\000\022\024\n\nbool_valu" +
      "e\030\004 \001(\010H\000\0225\n\017timestamp_value\030\005 \001(\0132\032.goo" +
      "gle.protobuf.TimestampH\000\022J\n\nenum_value\030\006" +
      " \001(\01324.google.cloud.datacatalog.v1beta1." +
      "TagField.EnumValueH\000\022\023\n\005order\030\007 \001(\005B\004\342A\001" +
      "\003\032!\n\tEnumValue\022\024\n\014display_name\030\001 \001(\tB\006\n\004" +
      "kind\"\327\002\n\013TagTemplate\022\014\n\004name\030\001 \001(\t\022\024\n\014di" +
      "splay_name\030\002 \001(\t\022O\n\006fields\030\003 \003(\01329.googl" +
      "e.cloud.datacatalog.v1beta1.TagTemplate." +
      "FieldsEntryB\004\342A\001\002\032a\n\013FieldsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022A\n\005value\030\002 \001(\01322.google.cloud.data" +
      "catalog.v1beta1.TagTemplateField:\0028\001:p\352A" +
      "m\n&datacatalog.googleapis.com/TagTemplat" +
      "e\022Cprojects/{project}/locations/{locatio" +
      "n}/tagTemplates/{tag_template}\"\251\002\n\020TagTe" +
      "mplateField\022\022\n\004name\030\006 \001(\tB\004\342A\001\003\022\024\n\014displ" +
      "ay_name\030\001 \001(\t\022?\n\004type\030\002 \001(\0132+.google.clo" +
      "ud.datacatalog.v1beta1.FieldTypeB\004\342A\001\002\022\023" +
      "\n\013is_required\030\003 \001(\010\022\r\n\005order\030\005 \001(\005:\205\001\352A\201" +
      "\001\n+datacatalog.googleapis.com/TagTemplat" +
      "eField\022Rprojects/{project}/locations/{lo" +
      "cation}/tagTemplates/{tag_template}/fiel" +
      "ds/{field}\"\250\003\n\tFieldType\022S\n\016primitive_ty" +
      "pe\030\001 \001(\01629.google.cloud.datacatalog.v1be" +
      "ta1.FieldType.PrimitiveTypeH\000\022I\n\tenum_ty" +
      "pe\030\002 \001(\01324.google.cloud.datacatalog.v1be" +
      "ta1.FieldType.EnumTypeH\000\032\213\001\n\010EnumType\022V\n" +
      "\016allowed_values\030\001 \003(\0132>.google.cloud.dat" +
      "acatalog.v1beta1.FieldType.EnumType.Enum" +
      "Value\032\'\n\tEnumValue\022\032\n\014display_name\030\001 \001(\t" +
      "B\004\342A\001\002\"`\n\rPrimitiveType\022\036\n\032PRIMITIVE_TYP" +
      "E_UNSPECIFIED\020\000\022\n\n\006DOUBLE\020\001\022\n\n\006STRING\020\002\022" +
      "\010\n\004BOOL\020\003\022\r\n\tTIMESTAMP\020\004B\013\n\ttype_declB\337\001" +
      "\n$com.google.cloud.datacatalog.v1beta1P\001" +
      "ZFcloud.google.com/go/datacatalog/apiv1b" +
      "eta1/datacatalogpb;datacatalogpb\370\001\001\252\002 Go" +
      "ogle.Cloud.DataCatalog.V1Beta1\312\002 Google\\" +
      "Cloud\\DataCatalog\\V1beta1\352\002#Google::Clou" +
      "d::DataCatalog::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_Tag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor,
        new java.lang.String[] { "Name", "Template", "TemplateDisplayName", "Column", "Fields", "Scope", });
    internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_descriptor =
      internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_TagField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor,
        new java.lang.String[] { "DisplayName", "DoubleValue", "StringValue", "BoolValue", "TimestampValue", "EnumValue", "Order", "Kind", });
    internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_descriptor =
      internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_descriptor,
        new java.lang.String[] { "DisplayName", });
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Fields", });
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_descriptor =
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Type", "IsRequired", "Order", });
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor,
        new java.lang.String[] { "PrimitiveType", "EnumType", "TypeDecl", });
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor =
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor,
        new java.lang.String[] { "AllowedValues", });
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_descriptor =
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_descriptor,
        new java.lang.String[] { "DisplayName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
