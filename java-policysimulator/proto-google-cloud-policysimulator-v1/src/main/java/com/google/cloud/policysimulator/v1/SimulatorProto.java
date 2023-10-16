/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/policysimulator/v1/simulator.proto

package com.google.cloud.policysimulator.v1;

public final class SimulatorProto {
  private SimulatorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_Replay_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_Replay_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_Replay_ResultsSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_Replay_ResultsSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ReplayResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ReplayResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_CreateReplayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_CreateReplayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ReplayOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ReplayOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_GetReplayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_GetReplayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ListReplayResultsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ListReplayResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ListReplayResultsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ListReplayResultsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ReplayConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ReplayConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ReplayConfig_PolicyOverlayEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ReplayConfig_PolicyOverlayEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ReplayDiff_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ReplayDiff_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_AccessStateDiff_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_AccessStateDiff_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_policysimulator_v1_ExplainedAccess_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_policysimulator_v1_ExplainedAccess_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/policysimulator/v1/simula"
          + "tor.proto\022\037google.cloud.policysimulator."
          + "v1\032\034google/api/annotations.proto\032\027google"
          + "/api/client.proto\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\0322g"
          + "oogle/cloud/policysimulator/v1/explanati"
          + "ons.proto\032\032google/iam/v1/policy.proto\032#g"
          + "oogle/longrunning/operations.proto\032\037goog"
          + "le/protobuf/timestamp.proto\032\027google/rpc/"
          + "status.proto\032\026google/type/date.proto\"\363\005\n"
          + "\006Replay\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022B\n\005state\030\002 \001"
          + "(\0162-.google.cloud.policysimulator.v1.Rep"
          + "lay.StateB\004\342A\001\003\022C\n\006config\030\003 \001(\0132-.google"
          + ".cloud.policysimulator.v1.ReplayConfigB\004"
          + "\342A\001\002\022U\n\017results_summary\030\005 \001(\01326.google.c"
          + "loud.policysimulator.v1.Replay.ResultsSu"
          + "mmaryB\004\342A\001\003\032\273\001\n\016ResultsSummary\022\021\n\tlog_co"
          + "unt\030\001 \001(\005\022\027\n\017unchanged_count\030\002 \001(\005\022\030\n\020di"
          + "fference_count\030\003 \001(\005\022\023\n\013error_count\030\004 \001("
          + "\005\022&\n\013oldest_date\030\005 \001(\0132\021.google.type.Dat"
          + "e\022&\n\013newest_date\030\006 \001(\0132\021.google.type.Dat"
          + "e\"S\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PEN"
          + "DING\020\001\022\013\n\007RUNNING\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n\006FA"
          + "ILED\020\004:\341\001\352A\335\001\n%policysimulator.googleapi"
          + "s.com/Replay\0228projects/{project}/locatio"
          + "ns/{location}/replays/{replay}\0226folders/"
          + "{folder}/locations/{location}/replays/{r"
          + "eplay}\022Borganizations/{organization}/loc"
          + "ations/{location}/replays/{replay}\"\345\004\n\014R"
          + "eplayResult\022;\n\004diff\030\005 \001(\0132+.google.cloud"
          + ".policysimulator.v1.ReplayDiffH\000\022#\n\005erro"
          + "r\030\006 \001(\0132\022.google.rpc.StatusH\000\022\014\n\004name\030\001 "
          + "\001(\t\022:\n\006parent\030\002 \001(\tB*\372A\'\n%policysimulato"
          + "r.googleapis.com/Replay\022B\n\014access_tuple\030"
          + "\003 \001(\0132,.google.cloud.policysimulator.v1."
          + "AccessTuple\022)\n\016last_seen_date\030\004 \001(\0132\021.go"
          + "ogle.type.Date:\257\002\352A\253\002\n+policysimulator.g"
          + "oogleapis.com/ReplayResult\022Pprojects/{pr"
          + "oject}/locations/{location}/replays/{rep"
          + "lay}/results/{replay_result}\022Nfolders/{f"
          + "older}/locations/{location}/replays/{rep"
          + "lay}/results/{replay_result}\022Zorganizati"
          + "ons/{organization}/locations/{location}/"
          + "replays/{replay}/results/{replay_result}"
          + "B\010\n\006result\"j\n\023CreateReplayRequest\022\024\n\006par"
          + "ent\030\001 \001(\tB\004\342A\001\002\022=\n\006replay\030\002 \001(\0132\'.google"
          + ".cloud.policysimulator.v1.ReplayB\004\342A\001\002\"I"
          + "\n\027ReplayOperationMetadata\022.\n\nstart_time\030"
          + "\001 \001(\0132\032.google.protobuf.Timestamp\"P\n\020Get"
          + "ReplayRequest\022<\n\004name\030\001 \001(\tB.\342A\001\002\372A\'\n%po"
          + "licysimulator.googleapis.com/Replay\"\201\001\n\030"
          + "ListReplayResultsRequest\022>\n\006parent\030\001 \001(\t"
          + "B.\342A\001\002\372A\'\n%policysimulator.googleapis.co"
          + "m/Replay\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke"
          + "n\030\003 \001(\t\"{\n\031ListReplayResultsResponse\022E\n\016"
          + "replay_results\030\001 \003(\0132-.google.cloud.poli"
          + "cysimulator.v1.ReplayResult\022\027\n\017next_page"
          + "_token\030\002 \001(\t\"\300\002\n\014ReplayConfig\022X\n\016policy_"
          + "overlay\030\001 \003(\0132@.google.cloud.policysimul"
          + "ator.v1.ReplayConfig.PolicyOverlayEntry\022"
          + "K\n\nlog_source\030\002 \001(\01627.google.cloud.polic"
          + "ysimulator.v1.ReplayConfig.LogSource\032K\n\022"
          + "PolicyOverlayEntry\022\013\n\003key\030\001 \001(\t\022$\n\005value"
          + "\030\002 \001(\0132\025.google.iam.v1.Policy:\0028\001\"<\n\tLog"
          + "Source\022\032\n\026LOG_SOURCE_UNSPECIFIED\020\000\022\023\n\017RE"
          + "CENT_ACCESSES\020\001\"S\n\nReplayDiff\022E\n\013access_"
          + "diff\030\002 \001(\01320.google.cloud.policysimulato"
          + "r.v1.AccessStateDiff\"\252\003\n\017AccessStateDiff"
          + "\022B\n\010baseline\030\001 \001(\01320.google.cloud.policy"
          + "simulator.v1.ExplainedAccess\022C\n\tsimulate"
          + "d\030\002 \001(\01320.google.cloud.policysimulator.v"
          + "1.ExplainedAccess\022X\n\raccess_change\030\003 \001(\016"
          + "2A.google.cloud.policysimulator.v1.Acces"
          + "sStateDiff.AccessChangeType\"\263\001\n\020AccessCh"
          + "angeType\022\"\n\036ACCESS_CHANGE_TYPE_UNSPECIFI"
          + "ED\020\000\022\r\n\tNO_CHANGE\020\001\022\022\n\016UNKNOWN_CHANGE\020\002\022"
          + "\022\n\016ACCESS_REVOKED\020\003\022\021\n\rACCESS_GAINED\020\004\022\030"
          + "\n\024ACCESS_MAYBE_REVOKED\020\005\022\027\n\023ACCESS_MAYBE"
          + "_GAINED\020\006\"\275\001\n\017ExplainedAccess\022B\n\014access_"
          + "state\030\001 \001(\0162,.google.cloud.policysimulat"
          + "or.v1.AccessState\022B\n\010policies\030\002 \003(\01320.go"
          + "ogle.cloud.policysimulator.v1.ExplainedP"
          + "olicy\022\"\n\006errors\030\003 \003(\0132\022.google.rpc.Statu"
          + "s2\201\010\n\tSimulator\022\207\002\n\tGetReplay\0221.google.c"
          + "loud.policysimulator.v1.GetReplayRequest"
          + "\032\'.google.cloud.policysimulator.v1.Repla"
          + "y\"\235\001\332A\004name\202\323\344\223\002\217\001\022+/v1/{name=projects/*"
          + "/locations/*/replays/*}Z,\022*/v1/{name=fol"
          + "ders/*/locations/*/replays/*}Z2\0220/v1/{na"
          + "me=organizations/*/locations/*/replays/*"
          + "}\022\310\002\n\014CreateReplay\0224.google.cloud.policy"
          + "simulator.v1.CreateReplayRequest\032\035.googl"
          + "e.longrunning.Operation\"\342\001\312A!\n\006Replay\022\027R"
          + "eplayOperationMetadata\332A\rparent,replay\202\323"
          + "\344\223\002\247\001\"+/v1/{parent=projects/*/locations/"
          + "*}/replays:\006replayZ4\"*/v1/{parent=folder"
          + "s/*/locations/*}/replays:\006replayZ:\"0/v1/"
          + "{parent=organizations/*/locations/*}/rep"
          + "lays:\006replay\022\312\002\n\021ListReplayResults\0229.goo"
          + "gle.cloud.policysimulator.v1.ListReplayR"
          + "esultsRequest\032:.google.cloud.policysimul"
          + "ator.v1.ListReplayResultsResponse\"\275\001\332A\006p"
          + "arent\202\323\344\223\002\255\001\0225/v1/{parent=projects/*/loc"
          + "ations/*/replays/*}/resultsZ6\0224/v1/{pare"
          + "nt=folders/*/locations/*/replays/*}/resu"
          + "ltsZ<\022:/v1/{parent=organizations/*/locat"
          + "ions/*/replays/*}/results\032R\312A\036policysimu"
          + "lator.googleapis.com\322A.https://www.googl"
          + "eapis.com/auth/cloud-platformB\362\001\n#com.go"
          + "ogle.cloud.policysimulator.v1B\016Simulator"
          + "ProtoP\001ZMcloud.google.com/go/policysimul"
          + "ator/apiv1/policysimulatorpb;policysimul"
          + "atorpb\370\001\001\252\002\037Google.Cloud.PolicySimulator"
          + ".V1\312\002\037Google\\Cloud\\PolicySimulator\\V1\352\002\""
          + "Google::Cloud::PolicySimulator::V1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.policysimulator.v1.ExplanationsProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_policysimulator_v1_Replay_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_policysimulator_v1_Replay_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_Replay_descriptor,
            new java.lang.String[] {
              "Name", "State", "Config", "ResultsSummary",
            });
    internal_static_google_cloud_policysimulator_v1_Replay_ResultsSummary_descriptor =
        internal_static_google_cloud_policysimulator_v1_Replay_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_policysimulator_v1_Replay_ResultsSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_Replay_ResultsSummary_descriptor,
            new java.lang.String[] {
              "LogCount",
              "UnchangedCount",
              "DifferenceCount",
              "ErrorCount",
              "OldestDate",
              "NewestDate",
            });
    internal_static_google_cloud_policysimulator_v1_ReplayResult_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_policysimulator_v1_ReplayResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ReplayResult_descriptor,
            new java.lang.String[] {
              "Diff", "Error", "Name", "Parent", "AccessTuple", "LastSeenDate", "Result",
            });
    internal_static_google_cloud_policysimulator_v1_CreateReplayRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_policysimulator_v1_CreateReplayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_CreateReplayRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Replay",
            });
    internal_static_google_cloud_policysimulator_v1_ReplayOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_policysimulator_v1_ReplayOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ReplayOperationMetadata_descriptor,
            new java.lang.String[] {
              "StartTime",
            });
    internal_static_google_cloud_policysimulator_v1_GetReplayRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_policysimulator_v1_GetReplayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_GetReplayRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_policysimulator_v1_ListReplayResultsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_policysimulator_v1_ListReplayResultsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ListReplayResultsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_policysimulator_v1_ListReplayResultsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_policysimulator_v1_ListReplayResultsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ListReplayResultsResponse_descriptor,
            new java.lang.String[] {
              "ReplayResults", "NextPageToken",
            });
    internal_static_google_cloud_policysimulator_v1_ReplayConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_policysimulator_v1_ReplayConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ReplayConfig_descriptor,
            new java.lang.String[] {
              "PolicyOverlay", "LogSource",
            });
    internal_static_google_cloud_policysimulator_v1_ReplayConfig_PolicyOverlayEntry_descriptor =
        internal_static_google_cloud_policysimulator_v1_ReplayConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_policysimulator_v1_ReplayConfig_PolicyOverlayEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ReplayConfig_PolicyOverlayEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_policysimulator_v1_ReplayDiff_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_policysimulator_v1_ReplayDiff_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ReplayDiff_descriptor,
            new java.lang.String[] {
              "AccessDiff",
            });
    internal_static_google_cloud_policysimulator_v1_AccessStateDiff_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_policysimulator_v1_AccessStateDiff_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_AccessStateDiff_descriptor,
            new java.lang.String[] {
              "Baseline", "Simulated", "AccessChange",
            });
    internal_static_google_cloud_policysimulator_v1_ExplainedAccess_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_policysimulator_v1_ExplainedAccess_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_policysimulator_v1_ExplainedAccess_descriptor,
            new java.lang.String[] {
              "AccessState", "Policies", "Errors",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.policysimulator.v1.ExplanationsProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
