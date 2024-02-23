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
// source: google/cloud/aiplatform/v1beta1/feature_view.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class FeatureViewProto {
  private FeatureViewProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/featur"
          + "e_view.proto\022\037google.cloud.aiplatform.v1"
          + "beta1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\"\210\021\n\013FeatureView\022\\\n\020bi"
          + "g_query_source\030\006 \001(\0132;.google.cloud.aipl"
          + "atform.v1beta1.FeatureView.BigQuerySourc"
          + "eB\003\340A\001H\000\022j\n\027feature_registry_source\030\t \001("
          + "\0132B.google.cloud.aiplatform.v1beta1.Feat"
          + "ureView.FeatureRegistrySourceB\003\340A\001H\000\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\010\0224\n\013create_time\030\002 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\0224\n\013update_"
          + "time\030\003 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022\021\n\004etag\030\004 \001(\tB\003\340A\001\022M\n\006labels\030\005 \003(\01328"
          + ".google.cloud.aiplatform.v1beta1.Feature"
          + "View.LabelsEntryB\003\340A\001\022L\n\013sync_config\030\007 \001"
          + "(\01327.google.cloud.aiplatform.v1beta1.Fea"
          + "tureView.SyncConfig\022b\n\024vector_search_con"
          + "fig\030\010 \001(\0132?.google.cloud.aiplatform.v1be"
          + "ta1.FeatureView.VectorSearchConfigB\003\340A\001\022"
          + "^\n\022service_agent_type\030\016 \001(\0162=.google.clo"
          + "ud.aiplatform.v1beta1.FeatureView.Servic"
          + "eAgentTypeB\003\340A\001\022\"\n\025service_account_email"
          + "\030\r \001(\tB\003\340A\003\032B\n\016BigQuerySource\022\020\n\003uri\030\001 \001"
          + "(\tB\003\340A\002\022\036\n\021entity_id_columns\030\002 \003(\tB\003\340A\002\032"
          + "\032\n\nSyncConfig\022\014\n\004cron\030\001 \001(\t\032\222\006\n\022VectorSe"
          + "archConfig\022k\n\016tree_ah_config\030\010 \001(\0132L.goo"
          + "gle.cloud.aiplatform.v1beta1.FeatureView"
          + ".VectorSearchConfig.TreeAHConfigB\003\340A\001H\000\022"
          + "s\n\022brute_force_config\030\t \001(\0132P.google.clo"
          + "ud.aiplatform.v1beta1.FeatureView.Vector"
          + "SearchConfig.BruteForceConfigB\003\340A\001H\000\022\035\n\020"
          + "embedding_column\030\003 \001(\tB\003\340A\001\022\033\n\016filter_co"
          + "lumns\030\004 \003(\tB\003\340A\001\022\034\n\017crowding_column\030\005 \001("
          + "\tB\003\340A\001\022%\n\023embedding_dimension\030\006 \001(\005B\003\340A\001"
          + "H\001\210\001\001\022w\n\025distance_measure_type\030\007 \001(\0162S.g"
          + "oogle.cloud.aiplatform.v1beta1.FeatureVi"
          + "ew.VectorSearchConfig.DistanceMeasureTyp"
          + "eB\003\340A\001\032\022\n\020BruteForceConfig\032Y\n\014TreeAHConf"
          + "ig\022+\n\031leaf_node_embedding_count\030\001 \001(\003B\003\340"
          + "A\001H\000\210\001\001B\034\n\032_leaf_node_embedding_count\"\204\001"
          + "\n\023DistanceMeasureType\022%\n!DISTANCE_MEASUR"
          + "E_TYPE_UNSPECIFIED\020\000\022\027\n\023SQUARED_L2_DISTA"
          + "NCE\020\001\022\023\n\017COSINE_DISTANCE\020\002\022\030\n\024DOT_PRODUC"
          + "T_DISTANCE\020\003B\022\n\020algorithm_configB\026\n\024_emb"
          + "edding_dimension\032\316\001\n\025FeatureRegistrySour"
          + "ce\022l\n\016feature_groups\030\001 \003(\0132O.google.clou"
          + "d.aiplatform.v1beta1.FeatureView.Feature"
          + "RegistrySource.FeatureGroupB\003\340A\002\032G\n\014Feat"
          + "ureGroup\022\035\n\020feature_group_id\030\001 \001(\tB\003\340A\002\022"
          + "\030\n\013feature_ids\030\002 \003(\tB\003\340A\002\032-\n\013LabelsEntry"
          + "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"{\n\020Serv"
          + "iceAgentType\022\"\n\036SERVICE_AGENT_TYPE_UNSPE"
          + "CIFIED\020\000\022\036\n\032SERVICE_AGENT_TYPE_PROJECT\020\001"
          + "\022#\n\037SERVICE_AGENT_TYPE_FEATURE_VIEW\020\002:\233\001"
          + "\352A\227\001\n%aiplatform.googleapis.com/FeatureV"
          + "iew\022nprojects/{project}/locations/{locat"
          + "ion}/featureOnlineStores/{feature_online"
          + "_store}/featureViews/{feature_view}B\010\n\006s"
          + "ourceB\347\001\n#com.google.cloud.aiplatform.v1"
          + "beta1B\020FeatureViewProtoP\001ZCcloud.google."
          + "com/go/aiplatform/apiv1beta1/aiplatformp"
          + "b;aiplatformpb\252\002\037Google.Cloud.AIPlatform"
          + ".V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1bet"
          + "a1\352\002\"Google::Cloud::AIPlatform::V1beta1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor,
            new java.lang.String[] {
              "BigQuerySource",
              "FeatureRegistrySource",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "SyncConfig",
              "VectorSearchConfig",
              "ServiceAgentType",
              "ServiceAccountEmail",
              "Source",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_descriptor,
            new java.lang.String[] {
              "Uri", "EntityIdColumns",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_descriptor,
            new java.lang.String[] {
              "Cron",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor,
            new java.lang.String[] {
              "TreeAhConfig",
              "BruteForceConfig",
              "EmbeddingColumn",
              "FilterColumns",
              "CrowdingColumn",
              "EmbeddingDimension",
              "DistanceMeasureType",
              "AlgorithmConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_descriptor,
            new java.lang.String[] {
              "LeafNodeEmbeddingCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor,
            new java.lang.String[] {
              "FeatureGroups",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor,
            new java.lang.String[] {
              "FeatureGroupId", "FeatureIds",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
