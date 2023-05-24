// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation_event.proto

package com.google.cloud.dialogflow.v2beta1;

public final class ConversationEventProto {
  private ConversationEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ConversationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ConversationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/dialogflow/v2beta1/conver" +
      "sation_event.proto\022\037google.cloud.dialogf" +
      "low.v2beta1\0321google/cloud/dialogflow/v2b" +
      "eta1/participant.proto\032\027google/rpc/statu" +
      "s.proto\"\213\003\n\021ConversationEvent\022\024\n\014convers" +
      "ation\030\001 \001(\t\022E\n\004type\030\002 \001(\01627.google.cloud" +
      ".dialogflow.v2beta1.ConversationEvent.Ty" +
      "pe\022(\n\014error_status\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022G\n\023new_message_payload\030\004 \001(\0132(.goog" +
      "le.cloud.dialogflow.v2beta1.MessageH\000\"\232\001" +
      "\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\030\n\024CONVERSA" +
      "TION_STARTED\020\001\022\031\n\025CONVERSATION_FINISHED\020" +
      "\002\022\035\n\031HUMAN_INTERVENTION_NEEDED\020\003\022\017\n\013NEW_" +
      "MESSAGE\020\005\022\027\n\023UNRECOVERABLE_ERROR\020\004B\t\n\007pa" +
      "yloadB\256\001\n#com.google.cloud.dialogflow.v2" +
      "beta1B\026ConversationEventProtoP\001ZCcloud.g" +
      "oogle.com/go/dialogflow/apiv2beta1/dialo" +
      "gflowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\037Google.Cl" +
      "oud.Dialogflow.V2Beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2beta1_ConversationEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_ConversationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ConversationEvent_descriptor,
        new java.lang.String[] { "Conversation", "Type", "ErrorStatus", "NewMessagePayload", "Payload", });
    com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
