// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore_federation.proto

package com.google.cloud.metastore.v1alpha;

public interface BackendMetastoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.BackendMetastore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The relative resource name of the metastore that is being federated.
   * The formats of the relative resource names for the currently supported
   * metastores are listed below:
   *
   * * BigQuery
   *     * `projects/{project_id}`
   * * Dataproc Metastore
   *     * `projects/{project_id}/locations/{location}/services/{service_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The relative resource name of the metastore that is being federated.
   * The formats of the relative resource names for the currently supported
   * metastores are listed below:
   *
   * * BigQuery
   *     * `projects/{project_id}`
   * * Dataproc Metastore
   *     * `projects/{project_id}/locations/{location}/services/{service_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The type of the backend metastore.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.BackendMetastore.MetastoreType metastore_type = 2;</code>
   * @return The enum numeric value on the wire for metastoreType.
   */
  int getMetastoreTypeValue();
  /**
   * <pre>
   * The type of the backend metastore.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.BackendMetastore.MetastoreType metastore_type = 2;</code>
   * @return The metastoreType.
   */
  com.google.cloud.metastore.v1alpha.BackendMetastore.MetastoreType getMetastoreType();
}
