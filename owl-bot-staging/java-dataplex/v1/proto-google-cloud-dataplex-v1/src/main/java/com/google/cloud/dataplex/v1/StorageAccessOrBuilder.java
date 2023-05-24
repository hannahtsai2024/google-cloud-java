// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

public interface StorageAccessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.StorageAccess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Describes the read access mechanism of the data. Not user
   * settable.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for read.
   */
  int getReadValue();
  /**
   * <pre>
   * Output only. Describes the read access mechanism of the data. Not user
   * settable.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The read.
   */
  com.google.cloud.dataplex.v1.StorageAccess.AccessMode getRead();
}
