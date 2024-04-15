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
// source: google/cloud/discoveryengine/v1beta/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public final class ImportConfigProto {
  private ImportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SpannerSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SpannerSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumnFamily_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumnFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumn_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_FamiliesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_FamiliesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_BigtableSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_BigtableSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_FhirStoreSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_FhirStoreSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CloudSqlSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CloudSqlSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_FirestoreSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_FirestoreSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/discoveryengine/v1beta/im"
          + "port_config.proto\022#google.cloud.discover"
          + "yengine.v1beta\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\0324goog"
          + "le/cloud/discoveryengine/v1beta/completi"
          + "on.proto\0322google/cloud/discoveryengine/v"
          + "1beta/document.proto\0324google/cloud/disco"
          + "veryengine/v1beta/user_event.proto\032 goog"
          + "le/protobuf/field_mask.proto\032\037google/pro"
          + "tobuf/timestamp.proto\032\027google/rpc/status"
          + ".proto\032\026google/type/date.proto\"9\n\tGcsSou"
          + "rce\022\027\n\ninput_uris\030\001 \003(\tB\003\340A\002\022\023\n\013data_sch"
          + "ema\030\002 \001(\t\"\274\001\n\016BigQuerySource\022+\n\016partitio"
          + "n_date\030\005 \001(\0132\021.google.type.DateH\000\022\022\n\npro"
          + "ject_id\030\001 \001(\t\022\027\n\ndataset_id\030\002 \001(\tB\003\340A\002\022\025"
          + "\n\010table_id\030\003 \001(\tB\003\340A\002\022\027\n\017gcs_staging_dir"
          + "\030\004 \001(\t\022\023\n\013data_schema\030\006 \001(\tB\013\n\tpartition"
          + "\"\211\001\n\rSpannerSource\022\022\n\nproject_id\030\001 \001(\t\022\030"
          + "\n\013instance_id\030\002 \001(\tB\003\340A\002\022\030\n\013database_id\030"
          + "\003 \001(\tB\003\340A\002\022\025\n\010table_id\030\004 \001(\tB\003\340A\002\022\031\n\021ena"
          + "ble_data_boost\030\005 \001(\010\"\251\007\n\017BigtableOptions"
          + "\022\026\n\016key_field_name\030\001 \001(\t\022T\n\010families\030\002 \003"
          + "(\0132B.google.cloud.discoveryengine.v1beta"
          + ".BigtableOptions.FamiliesEntry\032\232\002\n\024Bigta"
          + "bleColumnFamily\022\022\n\nfield_name\030\001 \001(\t\022O\n\010e"
          + "ncoding\030\002 \001(\0162=.google.cloud.discoveryen"
          + "gine.v1beta.BigtableOptions.Encoding\022G\n\004"
          + "type\030\003 \001(\01629.google.cloud.discoveryengin"
          + "e.v1beta.BigtableOptions.Type\022T\n\007columns"
          + "\030\004 \003(\0132C.google.cloud.discoveryengine.v1"
          + "beta.BigtableOptions.BigtableColumn\032\326\001\n\016"
          + "BigtableColumn\022\026\n\tqualifier\030\001 \001(\014B\003\340A\002\022\022"
          + "\n\nfield_name\030\002 \001(\t\022O\n\010encoding\030\003 \001(\0162=.g"
          + "oogle.cloud.discoveryengine.v1beta.Bigta"
          + "bleOptions.Encoding\022G\n\004type\030\004 \001(\01629.goog"
          + "le.cloud.discoveryengine.v1beta.Bigtable"
          + "Options.Type\032z\n\rFamiliesEntry\022\013\n\003key\030\001 \001"
          + "(\t\022X\n\005value\030\002 \001(\0132I.google.cloud.discove"
          + "ryengine.v1beta.BigtableOptions.Bigtable"
          + "ColumnFamily:\0028\001\"z\n\004Type\022\024\n\020TYPE_UNSPECI"
          + "FIED\020\000\022\n\n\006STRING\020\001\022\n\n\006NUMBER\020\002\022\013\n\007INTEGE"
          + "R\020\003\022\017\n\013VAR_INTEGER\020\004\022\017\n\013BIG_NUMERIC\020\005\022\013\n"
          + "\007BOOLEAN\020\006\022\010\n\004JSON\020\007\":\n\010Encoding\022\030\n\024ENCO"
          + "DING_UNSPECIFIED\020\000\022\010\n\004TEXT\020\001\022\n\n\006BINARY\020\002"
          + "\"\252\001\n\016BigtableSource\022\022\n\nproject_id\030\001 \001(\t\022"
          + "\030\n\013instance_id\030\002 \001(\tB\003\340A\002\022\025\n\010table_id\030\003 "
          + "\001(\tB\003\340A\002\022S\n\020bigtable_options\030\004 \001(\01324.goo"
          + "gle.cloud.discoveryengine.v1beta.Bigtabl"
          + "eOptionsB\003\340A\002\"k\n\017FhirStoreSource\022?\n\nfhir"
          + "_store\030\001 \001(\tB+\340A\002\372A%\n#healthcare.googlea"
          + "pis.com/FhirStore\022\027\n\017gcs_staging_dir\030\002 \001"
          + "(\t\"\231\001\n\016CloudSqlSource\022\022\n\nproject_id\030\001 \001("
          + "\t\022\030\n\013instance_id\030\002 \001(\tB\003\340A\002\022\030\n\013database_"
          + "id\030\003 \001(\tB\003\340A\002\022\025\n\010table_id\030\004 \001(\tB\003\340A\002\022\027\n\017"
          + "gcs_staging_dir\030\005 \001(\t\022\017\n\007offload\030\006 \001(\010\"t"
          + "\n\017FirestoreSource\022\022\n\nproject_id\030\001 \001(\t\022\030\n"
          + "\013database_id\030\002 \001(\tB\003\340A\002\022\032\n\rcollection_id"
          + "\030\003 \001(\tB\003\340A\002\022\027\n\017gcs_staging_dir\030\004 \001(\t\"8\n\021"
          + "ImportErrorConfig\022\024\n\ngcs_prefix\030\001 \001(\tH\000B"
          + "\r\n\013destination\"\207\004\n\027ImportUserEventsReque"
          + "st\022b\n\rinline_source\030\002 \001(\0132I.google.cloud"
          + ".discoveryengine.v1beta.ImportUserEvents"
          + "Request.InlineSourceH\000\022D\n\ngcs_source\030\003 \001"
          + "(\0132..google.cloud.discoveryengine.v1beta"
          + ".GcsSourceH\000\022N\n\017bigquery_source\030\004 \001(\01323."
          + "google.cloud.discoveryengine.v1beta.BigQ"
          + "uerySourceH\000\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(di"
          + "scoveryengine.googleapis.com/DataStore\022L"
          + "\n\014error_config\030\005 \001(\01326.google.cloud.disc"
          + "overyengine.v1beta.ImportErrorConfig\032X\n\014"
          + "InlineSource\022H\n\013user_events\030\001 \003(\0132..goog"
          + "le.cloud.discoveryengine.v1beta.UserEven"
          + "tB\003\340A\002B\010\n\006source\"\317\001\n\030ImportUserEventsRes"
          + "ponse\022)\n\rerror_samples\030\001 \003(\0132\022.google.rp"
          + "c.Status\022L\n\014error_config\030\002 \001(\01326.google."
          + "cloud.discoveryengine.v1beta.ImportError"
          + "Config\022\033\n\023joined_events_count\030\003 \001(\003\022\035\n\025u"
          + "njoined_events_count\030\004 \001(\003\"\252\001\n\030ImportUse"
          + "rEventsMetadata\022/\n\013create_time\030\001 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\022/\n\013update_time\030"
          + "\002 \001(\0132\032.google.protobuf.Timestamp\022\025\n\rsuc"
          + "cess_count\030\003 \001(\003\022\025\n\rfailure_count\030\004 \001(\003\""
          + "\276\001\n\027ImportDocumentsMetadata\022/\n\013create_ti"
          + "me\030\001 \001(\0132\032.google.protobuf.Timestamp\022/\n\013"
          + "update_time\030\002 \001(\0132\032.google.protobuf.Time"
          + "stamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfailure_"
          + "count\030\004 \001(\003\022\023\n\013total_count\030\005 \001(\003\"\264\t\n\026Imp"
          + "ortDocumentsRequest\022a\n\rinline_source\030\002 \001"
          + "(\0132H.google.cloud.discoveryengine.v1beta"
          + ".ImportDocumentsRequest.InlineSourceH\000\022D"
          + "\n\ngcs_source\030\003 \001(\0132..google.cloud.discov"
          + "eryengine.v1beta.GcsSourceH\000\022N\n\017bigquery"
          + "_source\030\004 \001(\01323.google.cloud.discoveryen"
          + "gine.v1beta.BigQuerySourceH\000\022Q\n\021fhir_sto"
          + "re_source\030\n \001(\01324.google.cloud.discovery"
          + "engine.v1beta.FhirStoreSourceH\000\022L\n\016spann"
          + "er_source\030\013 \001(\01322.google.cloud.discovery"
          + "engine.v1beta.SpannerSourceH\000\022O\n\020cloud_s"
          + "ql_source\030\014 \001(\01323.google.cloud.discovery"
          + "engine.v1beta.CloudSqlSourceH\000\022P\n\020firest"
          + "ore_source\030\r \001(\01324.google.cloud.discover"
          + "yengine.v1beta.FirestoreSourceH\000\022N\n\017bigt"
          + "able_source\030\017 \001(\01323.google.cloud.discove"
          + "ryengine.v1beta.BigtableSourceH\000\022=\n\006pare"
          + "nt\030\001 \001(\tB-\340A\002\372A\'\n%discoveryengine.google"
          + "apis.com/Branch\022L\n\014error_config\030\005 \001(\01326."
          + "google.cloud.discoveryengine.v1beta.Impo"
          + "rtErrorConfig\022k\n\023reconciliation_mode\030\006 \001"
          + "(\0162N.google.cloud.discoveryengine.v1beta"
          + ".ImportDocumentsRequest.ReconciliationMo"
          + "de\022/\n\013update_mask\030\007 \001(\0132\032.google.protobu"
          + "f.FieldMask\022\031\n\021auto_generate_ids\030\010 \001(\010\022\020"
          + "\n\010id_field\030\t \001(\t\032U\n\014InlineSource\022E\n\tdocu"
          + "ments\030\001 \003(\0132-.google.cloud.discoveryengi"
          + "ne.v1beta.DocumentB\003\340A\002\"T\n\022Reconciliatio"
          + "nMode\022#\n\037RECONCILIATION_MODE_UNSPECIFIED"
          + "\020\000\022\017\n\013INCREMENTAL\020\001\022\010\n\004FULL\020\002B\010\n\006source\""
          + "\222\001\n\027ImportDocumentsResponse\022)\n\rerror_sam"
          + "ples\030\001 \003(\0132\022.google.rpc.Status\022L\n\014error_"
          + "config\030\002 \001(\01326.google.cloud.discoveryeng"
          + "ine.v1beta.ImportErrorConfig\"\221\003\n&ImportS"
          + "uggestionDenyListEntriesRequest\022q\n\rinlin"
          + "e_source\030\002 \001(\0132X.google.cloud.discoverye"
          + "ngine.v1beta.ImportSuggestionDenyListEnt"
          + "riesRequest.InlineSourceH\000\022D\n\ngcs_source"
          + "\030\003 \001(\0132..google.cloud.discoveryengine.v1"
          + "beta.GcsSourceH\000\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*"
          + "\n(discoveryengine.googleapis.com/DataSto"
          + "re\032b\n\014InlineSource\022R\n\007entries\030\001 \003(\0132<.go"
          + "ogle.cloud.discoveryengine.v1beta.Sugges"
          + "tionDenyListEntryB\003\340A\002B\010\n\006source\"\222\001\n\'Imp"
          + "ortSuggestionDenyListEntriesResponse\022)\n\r"
          + "error_samples\030\001 \003(\0132\022.google.rpc.Status\022"
          + "\036\n\026imported_entries_count\030\002 \001(\003\022\034\n\024faile"
          + "d_entries_count\030\003 \001(\003\"\213\001\n\'ImportSuggesti"
          + "onDenyListEntriesMetadata\022/\n\013create_time"
          + "\030\001 \001(\0132\032.google.protobuf.Timestamp\022/\n\013up"
          + "date_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\230\002\n\'com.google.cloud.discoveryengine"
          + ".v1betaB\021ImportConfigProtoP\001ZQcloud.goog"
          + "le.com/go/discoveryengine/apiv1beta/disc"
          + "overyenginepb;discoveryenginepb\242\002\017DISCOV"
          + "ERYENGINE\252\002#Google.Cloud.DiscoveryEngine"
          + ".V1Beta\312\002#Google\\Cloud\\DiscoveryEngine\\V"
          + "1beta\352\002&Google::Cloud::DiscoveryEngine::"
          + "V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.CompletionProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris", "DataSchema",
            });
    internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_descriptor,
            new java.lang.String[] {
              "PartitionDate",
              "ProjectId",
              "DatasetId",
              "TableId",
              "GcsStagingDir",
              "DataSchema",
              "Partition",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SpannerSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_SpannerSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SpannerSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "InstanceId", "DatabaseId", "TableId", "EnableDataBoost",
            });
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_descriptor,
            new java.lang.String[] {
              "KeyFieldName", "Families",
            });
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumnFamily_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumnFamily_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumnFamily_descriptor,
            new java.lang.String[] {
              "FieldName", "Encoding", "Type", "Columns",
            });
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumn_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumn_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_BigtableColumn_descriptor,
            new java.lang.String[] {
              "Qualifier", "FieldName", "Encoding", "Type",
            });
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_FamiliesEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_FamiliesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_BigtableOptions_FamiliesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_BigtableSource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_BigtableSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_BigtableSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "InstanceId", "TableId", "BigtableOptions",
            });
    internal_static_google_cloud_discoveryengine_v1beta_FhirStoreSource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_FhirStoreSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_FhirStoreSource_descriptor,
            new java.lang.String[] {
              "FhirStore", "GcsStagingDir",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CloudSqlSource_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1beta_CloudSqlSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CloudSqlSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "InstanceId", "DatabaseId", "TableId", "GcsStagingDir", "Offload",
            });
    internal_static_google_cloud_discoveryengine_v1beta_FirestoreSource_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1beta_FirestoreSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_FirestoreSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "DatabaseId", "CollectionId", "GcsStagingDir",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource", "GcsSource", "BigquerySource", "Parent", "ErrorConfig", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "UserEvents",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig", "JoinedEventsCount", "UnjoinedEventsCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount", "TotalCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource",
              "GcsSource",
              "BigquerySource",
              "FhirStoreSource",
              "SpannerSource",
              "CloudSqlSource",
              "FirestoreSource",
              "BigtableSource",
              "Parent",
              "ErrorConfig",
              "ReconciliationMode",
              "UpdateMask",
              "AutoGenerateIds",
              "IdField",
              "Source",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "Documents",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_descriptor,
            new java.lang.String[] {
              "InlineSource", "GcsSource", "Parent", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "Entries",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ImportedEntriesCount", "FailedEntriesCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ImportSuggestionDenyListEntriesMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.CompletionProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
