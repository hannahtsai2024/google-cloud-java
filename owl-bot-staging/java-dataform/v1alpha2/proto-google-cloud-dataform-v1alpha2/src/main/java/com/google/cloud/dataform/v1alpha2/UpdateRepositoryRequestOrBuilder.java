// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

public interface UpdateRepositoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.UpdateRepositoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Specifies the fields to be updated in the repository. If left unset,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. Specifies the fields to be updated in the repository. If left unset,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. Specifies the fields to be updated in the repository. If left unset,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. The repository to update.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the repository field is set.
   */
  boolean hasRepository();
  /**
   * <pre>
   * Required. The repository to update.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The repository.
   */
  com.google.cloud.dataform.v1alpha2.Repository getRepository();
  /**
   * <pre>
   * Required. The repository to update.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataform.v1alpha2.RepositoryOrBuilder getRepositoryOrBuilder();
}
