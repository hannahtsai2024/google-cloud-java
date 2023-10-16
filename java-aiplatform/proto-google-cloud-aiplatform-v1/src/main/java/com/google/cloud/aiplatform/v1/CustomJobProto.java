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
// source: google/cloud/aiplatform/v1/custom_job.proto

package com.google.cloud.aiplatform.v1;

public final class CustomJobProto {
  private CustomJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJobSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJobSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Scheduling_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1/custom_job."
          + "proto\022\032google.cloud.aiplatform.v1\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0320google/cloud/aiplatform/v"
          + "1/encryption_spec.proto\032(google/cloud/ai"
          + "platform/v1/env_var.proto\032#google/cloud/"
          + "aiplatform/v1/io.proto\032*google/cloud/aip"
          + "latform/v1/job_state.proto\0322google/cloud"
          + "/aiplatform/v1/machine_resources.proto\032\036"
          + "google/protobuf/duration.proto\032\037google/p"
          + "rotobuf/timestamp.proto\032\027google/rpc/stat"
          + "us.proto\"\353\006\n\tCustomJob\022\022\n\004name\030\001 \001(\tB\004\342A"
          + "\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022A\n\010job_sp"
          + "ec\030\004 \001(\0132).google.cloud.aiplatform.v1.Cu"
          + "stomJobSpecB\004\342A\001\002\0229\n\005state\030\005 \001(\0162$.googl"
          + "e.cloud.aiplatform.v1.JobStateB\004\342A\001\003\0225\n\013"
          + "create_time\030\006 \001(\0132\032.google.protobuf.Time"
          + "stampB\004\342A\001\003\0224\n\nstart_time\030\007 \001(\0132\032.google"
          + ".protobuf.TimestampB\004\342A\001\003\0222\n\010end_time\030\010 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n"
          + "\013update_time\030\t \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\022\'\n\005error\030\n \001(\0132\022.google.rpc"
          + ".StatusB\004\342A\001\003\022A\n\006labels\030\013 \003(\01321.google.c"
          + "loud.aiplatform.v1.CustomJob.LabelsEntry"
          + "\022C\n\017encryption_spec\030\014 \001(\0132*.google.cloud"
          + ".aiplatform.v1.EncryptionSpec\022W\n\017web_acc"
          + "ess_uris\030\020 \003(\01328.google.cloud.aiplatform"
          + ".v1.CustomJob.WebAccessUrisEntryB\004\342A\001\003\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\0324\n\022WebAccessUrisEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001:i\352Af\n#aiplatform.goo"
          + "gleapis.com/CustomJob\022?projects/{project"
          + "}/locations/{location}/customJobs/{custo"
          + "m_job}\"\351\004\n\rCustomJobSpec\022K\n\021worker_pool_"
          + "specs\030\001 \003(\0132*.google.cloud.aiplatform.v1"
          + ".WorkerPoolSpecB\004\342A\001\002\022:\n\nscheduling\030\003 \001("
          + "\0132&.google.cloud.aiplatform.v1.Schedulin"
          + "g\022\027\n\017service_account\030\004 \001(\t\0228\n\007network\030\005 "
          + "\001(\tB\'\342A\001\001\372A \n\036compute.googleapis.com/Net"
          + "work\022 \n\022reserved_ip_ranges\030\r \003(\tB\004\342A\001\001\022I"
          + "\n\025base_output_directory\030\006 \001(\0132*.google.c"
          + "loud.aiplatform.v1.GcsDestination\022C\n\013ten"
          + "sorboard\030\007 \001(\tB.\342A\001\001\372A\'\n%aiplatform.goog"
          + "leapis.com/Tensorboard\022\037\n\021enable_web_acc"
          + "ess\030\n \001(\010B\004\342A\001\001\022%\n\027enable_dashboard_acce"
          + "ss\030\020 \001(\010B\004\342A\001\001\022>\n\nexperiment\030\021 \001(\tB*\342A\001\001"
          + "\372A#\n!aiplatform.googleapis.com/Context\022B"
          + "\n\016experiment_run\030\022 \001(\tB*\342A\001\001\372A#\n!aiplatf"
          + "orm.googleapis.com/Context\"\207\003\n\016WorkerPoo"
          + "lSpec\022C\n\016container_spec\030\006 \001(\0132).google.c"
          + "loud.aiplatform.v1.ContainerSpecH\000\022L\n\023py"
          + "thon_package_spec\030\007 \001(\0132-.google.cloud.a"
          + "iplatform.v1.PythonPackageSpecH\000\022D\n\014mach"
          + "ine_spec\030\001 \001(\0132\'.google.cloud.aiplatform"
          + ".v1.MachineSpecB\005\342A\002\001\005\022\033\n\rreplica_count\030"
          + "\002 \001(\003B\004\342A\001\001\022>\n\nnfs_mounts\030\004 \003(\0132$.google"
          + ".cloud.aiplatform.v1.NfsMountB\004\342A\001\001\0227\n\td"
          + "isk_spec\030\005 \001(\0132$.google.cloud.aiplatform"
          + ".v1.DiskSpecB\006\n\004task\"x\n\rContainerSpec\022\027\n"
          + "\timage_uri\030\001 \001(\tB\004\342A\001\002\022\017\n\007command\030\002 \003(\t\022"
          + "\014\n\004args\030\003 \003(\t\022/\n\003env\030\004 \003(\0132\".google.clou"
          + "d.aiplatform.v1.EnvVar\"\255\001\n\021PythonPackage"
          + "Spec\022 \n\022executor_image_uri\030\001 \001(\tB\004\342A\001\002\022\032"
          + "\n\014package_uris\030\002 \003(\tB\004\342A\001\002\022\033\n\rpython_mod"
          + "ule\030\003 \001(\tB\004\342A\001\002\022\014\n\004args\030\004 \003(\t\022/\n\003env\030\005 \003"
          + "(\0132\".google.cloud.aiplatform.v1.EnvVar\"~"
          + "\n\nScheduling\022*\n\007timeout\030\001 \001(\0132\031.google.p"
          + "rotobuf.Duration\022%\n\035restart_job_on_worke"
          + "r_restart\030\003 \001(\010\022\035\n\017disable_retries\030\005 \001(\010"
          + "B\004\342A\001\001B\314\001\n\036com.google.cloud.aiplatform.v"
          + "1B\016CustomJobProtoP\001Z>cloud.google.com/go"
          + "/aiplatform/apiv1/aiplatformpb;aiplatfor"
          + "mpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Googl"
          + "e\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::A"
          + "IPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CustomJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "JobSpec",
              "State",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Error",
              "Labels",
              "EncryptionSpec",
              "WebAccessUris",
            });
    internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_CustomJobSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CustomJobSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJobSpec_descriptor,
            new java.lang.String[] {
              "WorkerPoolSpecs",
              "Scheduling",
              "ServiceAccount",
              "Network",
              "ReservedIpRanges",
              "BaseOutputDirectory",
              "Tensorboard",
              "EnableWebAccess",
              "EnableDashboardAccess",
              "Experiment",
              "ExperimentRun",
            });
    internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_descriptor,
            new java.lang.String[] {
              "ContainerSpec",
              "PythonPackageSpec",
              "MachineSpec",
              "ReplicaCount",
              "NfsMounts",
              "DiskSpec",
              "Task",
            });
    internal_static_google_cloud_aiplatform_v1_ContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri", "Command", "Args", "Env",
            });
    internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_descriptor,
            new java.lang.String[] {
              "ExecutorImageUri", "PackageUris", "PythonModule", "Args", "Env",
            });
    internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_Scheduling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor,
            new java.lang.String[] {
              "Timeout", "RestartJobOnWorkerRestart", "DisableRetries",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
