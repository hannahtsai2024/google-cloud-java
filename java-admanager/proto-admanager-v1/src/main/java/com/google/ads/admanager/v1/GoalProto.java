// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/goal.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public final class GoalProto {
  private GoalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_Goal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_Goal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_GoalTypeEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GoalTypeEnum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_admanager_v1_UnitTypeEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_UnitTypeEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/ads/admanager/v1/goal.proto\022\027go" +
      "ogle.ads.admanager.v1\"\233\001\n\004Goal\022A\n\tgoal_t" +
      "ype\030\001 \001(\0162..google.ads.admanager.v1.Goal" +
      "TypeEnum.GoalType\022A\n\tunit_type\030\002 \001(\0162..g" +
      "oogle.ads.admanager.v1.UnitTypeEnum.Unit" +
      "Type\022\r\n\005units\030\003 \001(\003\"X\n\014GoalTypeEnum\"H\n\010G" +
      "oalType\022\031\n\025GOAL_TYPE_UNSPECIFIED\020\000\022\010\n\004NO" +
      "NE\020\001\022\014\n\010LIFETIME\020\002\022\t\n\005DAILY\020\003\"\350\001\n\014UnitTy" +
      "peEnum\"\327\001\n\010UnitType\022\031\n\025UNIT_TYPE_UNSPECI" +
      "FIED\020\000\022\017\n\013IMPRESSIONS\020\001\022\n\n\006CLICKS\020\002\022!\n\035C" +
      "LICK_THROUGH_CPA_CONVERSIONS\020\003\022 \n\034VIEW_T" +
      "HROUGH_CPA_CONVERSIONS\020\004\022\031\n\025TOTAL_CPA_CO" +
      "NVERSIONS\020\005\022\030\n\024VIEWABLE_IMPRESSIONS\020\006\022\031\n" +
      "\025IN_TARGET_IMPRESSIONS\020\007B\246\001\n\033com.google." +
      "ads.admanager.v1B\tGoalProtoP\001Z@google.go" +
      "lang.org/genproto/googleapis/ads/admanag" +
      "er/v1;admanager\242\002\003GAA\252\002\027Google.Ads.AdMan" +
      "ager.V1\312\002\027Google\\Ads\\AdManager\\V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_admanager_v1_Goal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_Goal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_Goal_descriptor,
        new java.lang.String[] { "GoalType", "UnitType", "Units", });
    internal_static_google_ads_admanager_v1_GoalTypeEnum_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_GoalTypeEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_GoalTypeEnum_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_admanager_v1_UnitTypeEnum_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_UnitTypeEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_admanager_v1_UnitTypeEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
