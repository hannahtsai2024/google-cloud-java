// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/ad_partner_declaration.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public final class AdPartnerDeclarationProto {
  private AdPartnerDeclarationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_AdPartnerDeclaration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_AdPartnerDeclaration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_DeclarationTypeEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_DeclarationTypeEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/admanager/v1/ad_partner_dec" +
      "laration.proto\022\027google.ads.admanager.v1\032" +
      "\031google/api/resource.proto\"\240\001\n\024AdPartner" +
      "Declaration\022J\n\004type\030\001 \001(\0162<.google.ads.a" +
      "dmanager.v1.DeclarationTypeEnum.Declarat" +
      "ionType\022<\n\013ad_partners\030\002 \003(\tB\'\372A$\n\"adman" +
      "ager.googleapis.com/AdPartner\"b\n\023Declara" +
      "tionTypeEnum\"K\n\017DeclarationType\022 \n\034DECLA" +
      "RATION_TYPE_UNSPECIFIED\020\000\022\010\n\004NONE\020\001\022\014\n\010D" +
      "ECLARED\020\002B\266\001\n\033com.google.ads.admanager.v" +
      "1B\031AdPartnerDeclarationProtoP\001Z@google.g" +
      "olang.org/genproto/googleapis/ads/admana" +
      "ger/v1;admanager\242\002\003GAA\252\002\027Google.Ads.AdMa" +
      "nager.V1\312\002\027Google\\Ads\\AdManager\\V1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_admanager_v1_AdPartnerDeclaration_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_AdPartnerDeclaration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_AdPartnerDeclaration_descriptor,
        new java.lang.String[] { "Type", "AdPartners", });
    internal_static_google_ads_admanager_v1_DeclarationTypeEnum_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_DeclarationTypeEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_DeclarationTypeEnum_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
