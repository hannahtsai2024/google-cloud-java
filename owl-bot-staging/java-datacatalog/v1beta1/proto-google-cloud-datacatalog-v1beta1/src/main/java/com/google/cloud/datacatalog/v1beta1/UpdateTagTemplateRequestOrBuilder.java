// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

public interface UpdateTagTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.UpdateTagTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The template to update. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagTemplate field is set.
   */
  boolean hasTagTemplate();
  /**
   * <pre>
   * Required. The template to update. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagTemplate.
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplate getTagTemplate();
  /**
   * <pre>
   * Required. The template to update. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder getTagTemplateOrBuilder();

  /**
   * <pre>
   * The field mask specifies the parts of the template to overwrite.
   *
   * Allowed fields:
   *
   *   * `display_name`
   *
   * If absent or empty, all of the allowed fields above will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The field mask specifies the parts of the template to overwrite.
   *
   * Allowed fields:
   *
   *   * `display_name`
   *
   * If absent or empty, all of the allowed fields above will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The field mask specifies the parts of the template to overwrite.
   *
   * Allowed fields:
   *
   *   * `display_name`
   *
   * If absent or empty, all of the allowed fields above will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
