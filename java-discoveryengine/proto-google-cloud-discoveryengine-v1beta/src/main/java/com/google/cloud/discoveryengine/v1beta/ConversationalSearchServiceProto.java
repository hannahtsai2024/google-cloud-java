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
// source: google/cloud/discoveryengine/v1beta/conversational_search_service.proto

package com.google.cloud.discoveryengine.v1beta;

public final class ConversationalSearchServiceProto {
  private ConversationalSearchServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/discoveryengine/v1beta/co"
          + "nversational_search_service.proto\022#googl"
          + "e.cloud.discoveryengine.v1beta\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\0326google/cloud/"
          + "discoveryengine/v1beta/conversation.prot"
          + "o\0328google/cloud/discoveryengine/v1beta/s"
          + "earch_service.proto\032\033google/protobuf/emp"
          + "ty.proto\032 google/protobuf/field_mask.pro"
          + "to\"\321\004\n\033ConverseConversationRequest\022B\n\004na"
          + "me\030\001 \001(\tB4\342A\001\002\372A-\n+discoveryengine.googl"
          + "eapis.com/Conversation\022C\n\005query\030\002 \001(\0132.."
          + "google.cloud.discoveryengine.v1beta.Text"
          + "InputB\004\342A\001\002\022I\n\016serving_config\030\003 \001(\tB1\372A."
          + "\n,discoveryengine.googleapis.com/Serving"
          + "Config\022G\n\014conversation\030\005 \001(\01321.google.cl"
          + "oud.discoveryengine.v1beta.Conversation\022"
          + "\023\n\013safe_search\030\006 \001(\010\022e\n\013user_labels\030\007 \003("
          + "\0132P.google.cloud.discoveryengine.v1beta."
          + "ConverseConversationRequest.UserLabelsEn"
          + "try\022f\n\014summary_spec\030\010 \001(\0132P.google.cloud"
          + ".discoveryengine.v1beta.SearchRequest.Co"
          + "ntentSearchSpec.SummarySpec\0321\n\017UserLabel"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\227"
          + "\002\n\034ConverseConversationResponse\0229\n\005reply"
          + "\030\001 \001(\0132*.google.cloud.discoveryengine.v1"
          + "beta.Reply\022G\n\014conversation\030\002 \001(\01321.googl"
          + "e.cloud.discoveryengine.v1beta.Conversat"
          + "ion\022\031\n\021related_questions\030\006 \003(\t\022X\n\016search"
          + "_results\030\003 \003(\0132@.google.cloud.discoverye"
          + "ngine.v1beta.SearchResponse.SearchResult"
          + "\"\255\001\n\031CreateConversationRequest\022A\n\006parent"
          + "\030\001 \001(\tB1\342A\001\002\372A*\n(discoveryengine.googlea"
          + "pis.com/DataStore\022M\n\014conversation\030\002 \001(\0132"
          + "1.google.cloud.discoveryengine.v1beta.Co"
          + "nversationB\004\342A\001\002\"\233\001\n\031UpdateConversationR"
          + "equest\022M\n\014conversation\030\001 \001(\01321.google.cl"
          + "oud.discoveryengine.v1beta.ConversationB"
          + "\004\342A\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google.prot"
          + "obuf.FieldMask\"_\n\031DeleteConversationRequ"
          + "est\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+discoveryeng"
          + "ine.googleapis.com/Conversation\"\\\n\026GetCo"
          + "nversationRequest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-"
          + "\n+discoveryengine.googleapis.com/Convers"
          + "ation\"\246\001\n\030ListConversationsRequest\022A\n\006pa"
          + "rent\030\001 \001(\tB1\342A\001\002\372A*\n(discoveryengine.goo"
          + "gleapis.com/DataStore\022\021\n\tpage_size\030\002 \001(\005"
          + "\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010"
          + "order_by\030\005 \001(\t\"~\n\031ListConversationsRespo"
          + "nse\022H\n\rconversations\030\001 \003(\01321.google.clou"
          + "d.discoveryengine.v1beta.Conversation\022\027\n"
          + "\017next_page_token\030\002 \001(\t2\266\020\n\033Conversationa"
          + "lSearchService\022\342\002\n\024ConverseConversation\022"
          + "@.google.cloud.discoveryengine.v1beta.Co"
          + "nverseConversationRequest\032A.google.cloud"
          + ".discoveryengine.v1beta.ConverseConversa"
          + "tionResponse\"\304\001\332A\nname,query\202\323\344\223\002\260\001\"K/v1"
          + "beta/{name=projects/*/locations/*/dataSt"
          + "ores/*/conversations/*}:converse:\001*Z^\"Y/"
          + "v1beta/{name=projects/*/locations/*/coll"
          + "ections/*/dataStores/*/conversations/*}:"
          + "converse:\001*\022\333\002\n\022CreateConversation\022>.goo"
          + "gle.cloud.discoveryengine.v1beta.CreateC"
          + "onversationRequest\0321.google.cloud.discov"
          + "eryengine.v1beta.Conversation\"\321\001\332A\023paren"
          + "t,conversation\202\323\344\223\002\264\001\"B/v1beta/{parent=p"
          + "rojects/*/locations/*/dataStores/*}/conv"
          + "ersations:\014conversationZ`\"P/v1beta/{pare"
          + "nt=projects/*/locations/*/collections/*/"
          + "dataStores/*}/conversations:\014conversatio"
          + "n\022\225\002\n\022DeleteConversation\022>.google.cloud."
          + "discoveryengine.v1beta.DeleteConversatio"
          + "nRequest\032\026.google.protobuf.Empty\"\246\001\332A\004na"
          + "me\202\323\344\223\002\230\001*B/v1beta/{name=projects/*/loca"
          + "tions/*/dataStores/*/conversations/*}ZR*"
          + "P/v1beta/{name=projects/*/locations/*/co"
          + "llections/*/dataStores/*/conversations/*"
          + "}\022\372\002\n\022UpdateConversation\022>.google.cloud."
          + "discoveryengine.v1beta.UpdateConversatio"
          + "nRequest\0321.google.cloud.discoveryengine."
          + "v1beta.Conversation\"\360\001\332A\030conversation,up"
          + "date_mask\202\323\344\223\002\316\0012O/v1beta/{conversation."
          + "name=projects/*/locations/*/dataStores/*"
          + "/conversations/*}:\014conversationZm2]/v1be"
          + "ta/{conversation.name=projects/*/locatio"
          + "ns/*/collections/*/dataStores/*/conversa"
          + "tions/*}:\014conversation\022\252\002\n\017GetConversati"
          + "on\022;.google.cloud.discoveryengine.v1beta"
          + ".GetConversationRequest\0321.google.cloud.d"
          + "iscoveryengine.v1beta.Conversation\"\246\001\332A\004"
          + "name\202\323\344\223\002\230\001\022B/v1beta/{name=projects/*/lo"
          + "cations/*/dataStores/*/conversations/*}Z"
          + "R\022P/v1beta/{name=projects/*/locations/*/"
          + "collections/*/dataStores/*/conversations"
          + "/*}\022\275\002\n\021ListConversations\022=.google.cloud"
          + ".discoveryengine.v1beta.ListConversation"
          + "sRequest\032>.google.cloud.discoveryengine."
          + "v1beta.ListConversationsResponse\"\250\001\332A\006pa"
          + "rent\202\323\344\223\002\230\001\022B/v1beta/{parent=projects/*/"
          + "locations/*/dataStores/*}/conversationsZ"
          + "R\022P/v1beta/{parent=projects/*/locations/"
          + "*/collections/*/dataStores/*}/conversati"
          + "ons\032R\312A\036discoveryengine.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\247\002\n\'com.google.cloud.discoveryen"
          + "gine.v1betaB ConversationalSearchService"
          + "ProtoP\001ZQcloud.google.com/go/discoveryen"
          + "gine/apiv1beta/discoveryenginepb;discove"
          + "ryenginepb\242\002\017DISCOVERYENGINE\252\002#Google.Cl"
          + "oud.DiscoveryEngine.V1Beta\312\002#Google\\Clou"
          + "d\\DiscoveryEngine\\V1beta\352\002&Google::Cloud"
          + "::DiscoveryEngine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ConversationProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.SearchServiceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "Query",
              "ServingConfig",
              "Conversation",
              "SafeSearch",
              "UserLabels",
              "SummarySpec",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationRequest_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ConverseConversationResponse_descriptor,
            new java.lang.String[] {
              "Reply", "Conversation", "RelatedQuestions", "SearchResults",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateConversationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Conversation",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UpdateConversationRequest_descriptor,
            new java.lang.String[] {
              "Conversation", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_GetConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListConversationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListConversationsResponse_descriptor,
            new java.lang.String[] {
              "Conversations", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ConversationProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.SearchServiceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
