// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/environment.proto

package com.google.cloud.dialogflow.v2beta1;

public final class EnvironmentProto {
  private EnvironmentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_Environment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/dialogflow/v2beta1/enviro" +
      "nment.proto\022\037google.cloud.dialogflow.v2b" +
      "eta1\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "2google/cloud/dialogflow/v2beta1/audio_c" +
      "onfig.proto\0321google/cloud/dialogflow/v2b" +
      "eta1/fulfillment.proto\032\033google/protobuf/" +
      "empty.proto\032 google/protobuf/field_mask." +
      "proto\032\037google/protobuf/timestamp.proto\"\232" +
      "\005\n\013Environment\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\031\n\013de" +
      "scription\030\002 \001(\tB\004\342A\001\001\022A\n\ragent_version\030\003" +
      " \001(\tB*\342A\001\001\372A#\n!dialogflow.googleapis.com" +
      "/Version\022G\n\005state\030\004 \001(\01622.google.cloud.d" +
      "ialogflow.v2beta1.Environment.StateB\004\342A\001" +
      "\003\0225\n\013update_time\030\005 \001(\0132\032.google.protobuf" +
      ".TimestampB\004\342A\001\003\022\\\n\027text_to_speech_setti" +
      "ngs\030\007 \001(\01325.google.cloud.dialogflow.v2be" +
      "ta1.TextToSpeechSettingsB\004\342A\001\001\022G\n\013fulfil" +
      "lment\030\010 \001(\0132,.google.cloud.dialogflow.v2" +
      "beta1.FulfillmentB\004\342A\001\001\"E\n\005State\022\025\n\021STAT" +
      "E_UNSPECIFIED\020\000\022\013\n\007STOPPED\020\001\022\013\n\007LOADING\020" +
      "\002\022\013\n\007RUNNING\020\003:\252\001\352A\246\001\n%dialogflow.google" +
      "apis.com/Environment\0223projects/{project}" +
      "/agent/environments/{environment}\022Hproje" +
      "cts/{project}/locations/{location}/agent" +
      "/environments/{environment}\"\255\003\n\024TextToSp" +
      "eechSettings\022#\n\025enable_text_to_speech\030\001 " +
      "\001(\010B\004\342A\001\001\022Y\n\025output_audio_encoding\030\002 \001(\016" +
      "24.google.cloud.dialogflow.v2beta1.Outpu" +
      "tAudioEncodingB\004\342A\001\002\022\037\n\021sample_rate_hert" +
      "z\030\003 \001(\005B\004\342A\001\001\022{\n\031synthesize_speech_confi" +
      "gs\030\004 \003(\0132R.google.cloud.dialogflow.v2bet" +
      "a1.TextToSpeechSettings.SynthesizeSpeech" +
      "ConfigsEntryB\004\342A\001\001\032w\n\034SynthesizeSpeechCo" +
      "nfigsEntry\022\013\n\003key\030\001 \001(\t\022F\n\005value\030\002 \001(\01327" +
      ".google.cloud.dialogflow.v2beta1.Synthes" +
      "izeSpeechConfig:\0028\001\"\214\001\n\027ListEnvironments" +
      "Request\022>\n\006parent\030\001 \001(\tB.\342A\001\002\372A\'\022%dialog" +
      "flow.googleapis.com/Environment\022\027\n\tpage_" +
      "size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A" +
      "\001\001\"w\n\030ListEnvironmentsResponse\022B\n\014enviro" +
      "nments\030\001 \003(\0132,.google.cloud.dialogflow.v" +
      "2beta1.Environment\022\027\n\017next_page_token\030\002 " +
      "\001(\t\"U\n\025GetEnvironmentRequest\022<\n\004name\030\001 \001" +
      "(\tB.\342A\001\002\372A\'\n%dialogflow.googleapis.com/E" +
      "nvironment\"\301\001\n\030CreateEnvironmentRequest\022" +
      ">\n\006parent\030\001 \001(\tB.\342A\001\002\372A\'\022%dialogflow.goo" +
      "gleapis.com/Environment\022G\n\013environment\030\002" +
      " \001(\0132,.google.cloud.dialogflow.v2beta1.E" +
      "nvironmentB\004\342A\001\002\022\034\n\016environment_id\030\003 \001(\t" +
      "B\004\342A\001\002\"\321\001\n\030UpdateEnvironmentRequest\022G\n\013e" +
      "nvironment\030\001 \001(\0132,.google.cloud.dialogfl" +
      "ow.v2beta1.EnvironmentB\004\342A\001\002\0225\n\013update_m" +
      "ask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\004\342" +
      "A\001\002\0225\n\'allow_load_to_draft_and_discard_c" +
      "hanges\030\003 \001(\010B\004\342A\001\001\"X\n\030DeleteEnvironmentR" +
      "equest\022<\n\004name\030\001 \001(\tB.\342A\001\002\372A\'\n%dialogflo" +
      "w.googleapis.com/Environment\"\221\001\n\034GetEnvi" +
      "ronmentHistoryRequest\022>\n\006parent\030\001 \001(\tB.\342" +
      "A\001\002\372A\'\n%dialogflow.googleapis.com/Enviro" +
      "nment\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_t" +
      "oken\030\003 \001(\tB\004\342A\001\001\"\201\002\n\022EnvironmentHistory\022" +
      "\024\n\006parent\030\001 \001(\tB\004\342A\001\003\022P\n\007entries\030\002 \003(\01329" +
      ".google.cloud.dialogflow.v2beta1.Environ" +
      "mentHistory.EntryB\004\342A\001\003\022\035\n\017next_page_tok" +
      "en\030\003 \001(\tB\004\342A\001\003\032d\n\005Entry\022\025\n\ragent_version" +
      "\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022/\n\013create_ti" +
      "me\030\003 \001(\0132\032.google.protobuf.Timestamp2\277\r\n" +
      "\014Environments\022\210\002\n\020ListEnvironments\0228.goo" +
      "gle.cloud.dialogflow.v2beta1.ListEnviron" +
      "mentsRequest\0329.google.cloud.dialogflow.v" +
      "2beta1.ListEnvironmentsResponse\"\177\332A\006pare" +
      "nt\202\323\344\223\002p\022//v2beta1/{parent=projects/*/ag" +
      "ent}/environmentsZ=\022;/v2beta1/{parent=pr" +
      "ojects/*/locations/*/agent}/environments" +
      "\022\356\001\n\016GetEnvironment\0226.google.cloud.dialo" +
      "gflow.v2beta1.GetEnvironmentRequest\032,.go" +
      "ogle.cloud.dialogflow.v2beta1.Environmen" +
      "t\"v\202\323\344\223\002p\022//v2beta1/{name=projects/*/age" +
      "nt/environments/*}Z=\022;/v2beta1/{name=pro" +
      "jects/*/locations/*/agent/environments/*" +
      "}\022\220\002\n\021CreateEnvironment\0229.google.cloud.d" +
      "ialogflow.v2beta1.CreateEnvironmentReque" +
      "st\032,.google.cloud.dialogflow.v2beta1.Env" +
      "ironment\"\221\001\202\323\344\223\002\212\001\"//v2beta1/{parent=pro" +
      "jects/*/agent}/environments:\013environment" +
      "ZJ\";/v2beta1/{parent=projects/*/location" +
      "s/*/agent}/environments:\013environment\022\250\002\n" +
      "\021UpdateEnvironment\0229.google.cloud.dialog" +
      "flow.v2beta1.UpdateEnvironmentRequest\032,." +
      "google.cloud.dialogflow.v2beta1.Environm" +
      "ent\"\251\001\202\323\344\223\002\242\0012;/v2beta1/{environment.nam" +
      "e=projects/*/agent/environments/*}:\013envi" +
      "ronmentZV2G/v2beta1/{environment.name=pr" +
      "ojects/*/locations/*/agent/environments/" +
      "*}:\013environment\022\336\001\n\021DeleteEnvironment\0229." +
      "google.cloud.dialogflow.v2beta1.DeleteEn" +
      "vironmentRequest\032\026.google.protobuf.Empty" +
      "\"v\202\323\344\223\002p*//v2beta1/{name=projects/*/agen" +
      "t/environments/*}Z=*;/v2beta1/{name=proj" +
      "ects/*/locations/*/agent/environments/*}" +
      "\022\231\002\n\025GetEnvironmentHistory\022=.google.clou" +
      "d.dialogflow.v2beta1.GetEnvironmentHisto" +
      "ryRequest\0323.google.cloud.dialogflow.v2be" +
      "ta1.EnvironmentHistory\"\213\001\202\323\344\223\002\204\001\0229/v2bet" +
      "a1/{parent=projects/*/agent/environments" +
      "/*}/historyZG\022E/v2beta1/{parent=projects" +
      "/*/locations/*/agent/environments/*}/his" +
      "tory\032x\312A\031dialogflow.googleapis.com\322AYhtt" +
      "ps://www.googleapis.com/auth/cloud-platf" +
      "orm,https://www.googleapis.com/auth/dial" +
      "ogflowB\250\001\n#com.google.cloud.dialogflow.v" +
      "2beta1B\020EnvironmentProtoP\001ZCcloud.google" +
      ".com/go/dialogflow/apiv2beta1/dialogflow" +
      "pb;dialogflowpb\370\001\001\242\002\002DF\252\002\037Google.Cloud.D" +
      "ialogflow.V2Beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.FulfillmentProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2beta1_Environment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Environment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_Environment_descriptor,
        new java.lang.String[] { "Name", "Description", "AgentVersion", "State", "UpdateTime", "TextToSpeechSettings", "Fulfillment", });
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor,
        new java.lang.String[] { "EnableTextToSpeech", "OutputAudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfigs", });
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_descriptor =
      internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_descriptor,
        new java.lang.String[] { "Environments", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_descriptor,
        new java.lang.String[] { "Parent", "Environment", "EnvironmentId", });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor,
        new java.lang.String[] { "Environment", "UpdateMask", "AllowLoadToDraftAndDiscardChanges", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor,
        new java.lang.String[] { "Parent", "Entries", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_descriptor =
      internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_descriptor,
        new java.lang.String[] { "AgentVersion", "Description", "CreateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.FulfillmentProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
