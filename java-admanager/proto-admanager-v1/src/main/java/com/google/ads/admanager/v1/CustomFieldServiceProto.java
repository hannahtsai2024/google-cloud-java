// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/custom_field_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public final class CustomFieldServiceProto {
  private CustomFieldServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_CustomField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_CustomField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_CustomFieldOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_CustomFieldOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_GetCustomFieldRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetCustomFieldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_ListCustomFieldsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListCustomFieldsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_ListCustomFieldsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListCustomFieldsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/admanager/v1/custom_field_s" +
      "ervice.proto\022\027google.ads.admanager.v1\0320g" +
      "oogle/ads/admanager/v1/custom_field_enum" +
      "s.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"\254\005\n\013CustomField\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\034\n" +
      "\017custom_field_id\030\002 \001(\003B\003\340A\003\022\031\n\014display_n" +
      "ame\030\003 \001(\tB\003\340A\002\022\030\n\013description\030\004 \001(\tB\003\340A\001" +
      "\022U\n\006status\030\005 \001(\0162@.google.ads.admanager." +
      "v1.CustomFieldStatusEnum.CustomFieldStat" +
      "usB\003\340A\003\022b\n\013entity_type\030\007 \001(\0162H.google.ad" +
      "s.admanager.v1.CustomFieldEntityTypeEnum" +
      ".CustomFieldEntityTypeB\003\340A\002\022\\\n\tdata_type" +
      "\030\010 \001(\0162D.google.ads.admanager.v1.CustomF" +
      "ieldDataTypeEnum.CustomFieldDataTypeB\003\340A" +
      "\002\022a\n\nvisibility\030\t \001(\0162H.google.ads.adman" +
      "ager.v1.CustomFieldVisibilityEnum.Custom" +
      "FieldVisibilityB\003\340A\002\022@\n\007options\030\n \003(\0132*." +
      "google.ads.admanager.v1.CustomFieldOptio" +
      "nB\003\340A\001:y\352Av\n$admanager.googleapis.com/Cu" +
      "stomField\0223networks/{network_code}/custo" +
      "mFields/{custom_field}*\014customFields2\013cu" +
      "stomField\"S\n\021CustomFieldOption\022#\n\026custom" +
      "_field_option_id\030\001 \001(\003B\003\340A\003\022\031\n\014display_n" +
      "ame\030\002 \001(\tB\003\340A\002\"S\n\025GetCustomFieldRequest\022" +
      ":\n\004name\030\001 \001(\tB,\340A\002\372A&\n$admanager.googlea" +
      "pis.com/CustomField\"\303\001\n\027ListCustomFields" +
      "Request\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\n admanag" +
      "er.googleapis.com/Network\022\026\n\tpage_size\030\002" +
      " \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006fi" +
      "lter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\022\021" +
      "\n\004skip\030\006 \001(\005B\003\340A\001\"\204\001\n\030ListCustomFieldsRe" +
      "sponse\022;\n\rcustom_fields\030\001 \003(\0132$.google.a" +
      "ds.admanager.v1.CustomField\022\027\n\017next_page" +
      "_token\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\0052\200\003\n\022Cus" +
      "tomFieldService\022\233\001\n\016GetCustomField\022..goo" +
      "gle.ads.admanager.v1.GetCustomFieldReque" +
      "st\032$.google.ads.admanager.v1.CustomField" +
      "\"3\332A\004name\202\323\344\223\002&\022$/v1/{name=networks/*/cu" +
      "stomFields/*}\022\256\001\n\020ListCustomFields\0220.goo" +
      "gle.ads.admanager.v1.ListCustomFieldsReq" +
      "uest\0321.google.ads.admanager.v1.ListCusto" +
      "mFieldsResponse\"5\332A\006parent\202\323\344\223\002&\022$/v1/{p" +
      "arent=networks/*}/customFields\032\033\312A\030adman" +
      "ager.googleapis.comB\264\001\n\033com.google.ads.a" +
      "dmanager.v1B\027CustomFieldServiceProtoP\001Z@" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/admanager/v1;admanager\242\002\003GAA\252\002\027Google." +
      "Ads.AdManager.V1\312\002\027Google\\Ads\\AdManager\\" +
      "V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.admanager.v1.CustomFieldEnumsProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_admanager_v1_CustomField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_CustomField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_CustomField_descriptor,
        new java.lang.String[] { "Name", "CustomFieldId", "DisplayName", "Description", "Status", "EntityType", "DataType", "Visibility", "Options", });
    internal_static_google_ads_admanager_v1_CustomFieldOption_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_CustomFieldOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_CustomFieldOption_descriptor,
        new java.lang.String[] { "CustomFieldOptionId", "DisplayName", });
    internal_static_google_ads_admanager_v1_GetCustomFieldRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_GetCustomFieldRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_GetCustomFieldRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_ads_admanager_v1_ListCustomFieldsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_admanager_v1_ListCustomFieldsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_ListCustomFieldsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "Skip", });
    internal_static_google_ads_admanager_v1_ListCustomFieldsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_admanager_v1_ListCustomFieldsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_ListCustomFieldsResponse_descriptor,
        new java.lang.String[] { "CustomFields", "NextPageToken", "TotalSize", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.admanager.v1.CustomFieldEnumsProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
