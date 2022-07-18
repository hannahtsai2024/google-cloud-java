/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/eventarc/v1/channel_connection.proto

package com.google.cloud.eventarc.v1;

public final class ChannelConnectionProto {
  private ChannelConnectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_ChannelConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_ChannelConnection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/eventarc/v1/channel_conne"
          + "ction.proto\022\030google.cloud.eventarc.v1\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\032\037google/protobuf/times"
          + "tamp.proto\"\247\003\n\021ChannelConnection\022\021\n\004name"
          + "\030\001 \001(\tB\003\340A\002\022\020\n\003uid\030\002 \001(\tB\003\340A\003\0228\n\007channel"
          + "\030\005 \001(\tB\'\340A\002\372A!\n\037eventarc.googleapis.com/"
          + "Channel\0224\n\013create_time\030\006 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0224\n\013update_time\030\007 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\022\035\n\020a"
          + "ctivation_token\030\010 \001(\tB\003\340A\004:\247\001\352A\243\001\n)event"
          + "arc.googleapis.com/ChannelConnection\022Opr"
          + "ojects/{project}/locations/{location}/ch"
          + "annelConnections/{channel_connection}*\022c"
          + "hannelConnections2\021channelConnectionB\316\001\n"
          + "\034com.google.cloud.eventarc.v1B\026ChannelCo"
          + "nnectionProtoP\001Z@google.golang.org/genpr"
          + "oto/googleapis/cloud/eventarc/v1;eventar"
          + "c\252\002\030Google.Cloud.Eventarc.V1\312\002\030Google\\Cl"
          + "oud\\Eventarc\\V1\352\002\033Google::Cloud::Eventar"
          + "c::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_eventarc_v1_ChannelConnection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_v1_ChannelConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_ChannelConnection_descriptor,
            new java.lang.String[] {
              "Name", "Uid", "Channel", "CreateTime", "UpdateTime", "ActivationToken",
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}