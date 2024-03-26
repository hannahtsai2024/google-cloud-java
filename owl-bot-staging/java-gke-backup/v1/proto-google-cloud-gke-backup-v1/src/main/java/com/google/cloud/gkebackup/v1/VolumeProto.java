// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/volume.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkebackup.v1;

public final class VolumeProto {
  private VolumeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_VolumeBackup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_VolumeBackup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_VolumeRestore_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_VolumeRestore_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/gkebackup/v1/volume.proto" +
      "\022\031google.cloud.gkebackup.v1\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032&google/cloud/gkebackup/v1/commo" +
      "n.proto\032\037google/protobuf/timestamp.proto" +
      "\"\250\007\n\014VolumeBackup\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003" +
      "uid\030\002 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.go" +
      "ogle.protobuf.TimestampB\003\340A\003\0224\n\013update_t" +
      "ime\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340" +
      "A\003\022B\n\nsource_pvc\030\005 \001(\0132).google.cloud.gk" +
      "ebackup.v1.NamespacedNameB\003\340A\003\022!\n\024volume" +
      "_backup_handle\030\006 \001(\tB\003\340A\003\022O\n\006format\030\007 \001(" +
      "\0162:.google.cloud.gkebackup.v1.VolumeBack" +
      "up.VolumeBackupFormatB\003\340A\003\022\032\n\rstorage_by" +
      "tes\030\010 \001(\003B\003\340A\003\022\034\n\017disk_size_bytes\030\t \001(\003B" +
      "\003\340A\003\0226\n\rcomplete_time\030\n \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\003\022A\n\005state\030\013 \001(\0162-.go" +
      "ogle.cloud.gkebackup.v1.VolumeBackup.Sta" +
      "teB\003\340A\003\022\032\n\rstate_message\030\014 \001(\tB\003\340A\003\022\021\n\004e" +
      "tag\030\r \001(\tB\003\340A\003\"S\n\022VolumeBackupFormat\022$\n " +
      "VOLUME_BACKUP_FORMAT_UNSPECIFIED\020\000\022\027\n\023GC" +
      "E_PERSISTENT_DISK\020\001\"v\n\005State\022\025\n\021STATE_UN" +
      "SPECIFIED\020\000\022\014\n\010CREATING\020\001\022\020\n\014SNAPSHOTTIN" +
      "G\020\002\022\r\n\tUPLOADING\020\003\022\r\n\tSUCCEEDED\020\004\022\n\n\006FAI" +
      "LED\020\005\022\014\n\010DELETING\020\006:\235\001\352A\231\001\n%gkebackup.go" +
      "ogleapis.com/VolumeBackup\022pprojects/{pro" +
      "ject}/locations/{location}/backupPlans/{" +
      "backup_plan}/backups/{backup}/volumeBack" +
      "ups/{volume_backup}\"\347\006\n\rVolumeRestore\022\021\n" +
      "\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid\030\002 \001(\tB\003\340A\003\0224\n\013cr" +
      "eate_time\030\003 \001(\0132\032.google.protobuf.Timest" +
      "ampB\003\340A\003\0224\n\013update_time\030\004 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\003\340A\003\022\032\n\rvolume_backup\030" +
      "\005 \001(\tB\003\340A\003\022B\n\ntarget_pvc\030\006 \001(\0132).google." +
      "cloud.gkebackup.v1.NamespacedNameB\003\340A\003\022\032" +
      "\n\rvolume_handle\030\007 \001(\tB\003\340A\003\022M\n\013volume_typ" +
      "e\030\010 \001(\01623.google.cloud.gkebackup.v1.Volu" +
      "meRestore.VolumeTypeB\003\340A\003\0226\n\rcomplete_ti" +
      "me\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A" +
      "\003\022B\n\005state\030\n \001(\0162..google.cloud.gkebacku" +
      "p.v1.VolumeRestore.StateB\003\340A\003\022\032\n\rstate_m" +
      "essage\030\013 \001(\tB\003\340A\003\022\021\n\004etag\030\014 \001(\tB\003\340A\003\"B\n\n" +
      "VolumeType\022\033\n\027VOLUME_TYPE_UNSPECIFIED\020\000\022" +
      "\027\n\023GCE_PERSISTENT_DISK\020\001\"d\n\005State\022\025\n\021STA" +
      "TE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\r\n\tRESTOR" +
      "ING\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n\006FAILED\020\004\022\014\n\010DELE" +
      "TING\020\005:\244\001\352A\240\001\n&gkebackup.googleapis.com/" +
      "VolumeRestore\022vprojects/{project}/locati" +
      "ons/{location}/restorePlans/{restore_pla" +
      "n}/restores/{restore}/volumeRestores/{vo" +
      "lume_restore}B\302\001\n\035com.google.cloud.gkeba" +
      "ckup.v1B\013VolumeProtoP\001Z;cloud.google.com" +
      "/go/gkebackup/apiv1/gkebackuppb;gkebacku" +
      "ppb\252\002\031Google.Cloud.GkeBackup.V1\312\002\031Google" +
      "\\Cloud\\GkeBackup\\V1\352\002\034Google::Cloud::Gke" +
      "Backup::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.gkebackup.v1.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_gkebackup_v1_VolumeBackup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_VolumeBackup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_VolumeBackup_descriptor,
        new java.lang.String[] { "Name", "Uid", "CreateTime", "UpdateTime", "SourcePvc", "VolumeBackupHandle", "Format", "StorageBytes", "DiskSizeBytes", "CompleteTime", "State", "StateMessage", "Etag", });
    internal_static_google_cloud_gkebackup_v1_VolumeRestore_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_VolumeRestore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_VolumeRestore_descriptor,
        new java.lang.String[] { "Name", "Uid", "CreateTime", "UpdateTime", "VolumeBackup", "TargetPvc", "VolumeHandle", "VolumeType", "CompleteTime", "State", "StateMessage", "Etag", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkebackup.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
