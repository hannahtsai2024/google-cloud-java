// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/network_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public final class NetworkServiceProto {
  private NetworkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_Network_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_Network_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_GetNetworkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetNetworkRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/admanager/v1/network_servic" +
      "e.proto\022\027google.ads.admanager.v1\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\"\231\003\n\007Network\022" +
      "\021\n\004name\030\001 \001(\tB\003\340A\010\022\031\n\014display_name\030\002 \001(\t" +
      "B\003\340A\001\022\031\n\014network_code\030\003 \001(\tB\003\340A\003\022\032\n\rprop" +
      "erty_code\030\004 \001(\tB\003\340A\003\022\026\n\ttime_zone\030\005 \001(\tB" +
      "\003\340A\003\022\032\n\rcurrency_code\030\006 \001(\tB\003\340A\003\022%\n\030seco" +
      "ndary_currency_codes\030\007 \003(\tB\003\340A\001\022G\n\026effec" +
      "tive_root_ad_unit\030\010 \001(\tB\'\340A\003\372A!\n\037admanag" +
      "er.googleapis.com/AdUnit\022\031\n\014test_network" +
      "\030\n \001(\010B\003\340A\003\022\027\n\nnetwork_id\030\013 \001(\003B\003\340A\003:Q\352A" +
      "N\n admanager.googleapis.com/Network\022\027net" +
      "works/{network_code}*\010networks2\007network\"" +
      "K\n\021GetNetworkRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372" +
      "A\"\n admanager.googleapis.com/Network2\260\001\n" +
      "\016NetworkService\022\200\001\n\nGetNetwork\022*.google." +
      "ads.admanager.v1.GetNetworkRequest\032 .goo" +
      "gle.ads.admanager.v1.Network\"$\332A\004name\202\323\344" +
      "\223\002\027\022\025/v1/{name=networks/*}\032\033\312A\030admanager" +
      ".googleapis.comB\260\001\n\033com.google.ads.adman" +
      "ager.v1B\023NetworkServiceProtoP\001Z@google.g" +
      "olang.org/genproto/googleapis/ads/admana" +
      "ger/v1;admanager\242\002\003GAA\252\002\027Google.Ads.AdMa" +
      "nager.V1\312\002\027Google\\Ads\\AdManager\\V1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_admanager_v1_Network_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_Network_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_Network_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "NetworkCode", "PropertyCode", "TimeZone", "CurrencyCode", "SecondaryCurrencyCodes", "EffectiveRootAdUnit", "TestNetwork", "NetworkId", });
    internal_static_google_ads_admanager_v1_GetNetworkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_GetNetworkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_GetNetworkRequest_descriptor,
        new java.lang.String[] { "Name", });
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
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
