// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

public interface CreateTagTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the project and the template location
   * [region](https://cloud.google.com/data-catalog/docs/concepts/regions.
   *
   * Example:
   *
   * * projects/{project_id}/locations/us-central1
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the project and the template location
   * [region](https://cloud.google.com/data-catalog/docs/concepts/regions.
   *
   * Example:
   *
   * * projects/{project_id}/locations/us-central1
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagTemplateId.
   */
  java.lang.String getTagTemplateId();
  /**
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tagTemplateId.
   */
  com.google.protobuf.ByteString
      getTagTemplateIdBytes();

  /**
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagTemplate field is set.
   */
  boolean hasTagTemplate();
  /**
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagTemplate.
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplate getTagTemplate();
  /**
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder getTagTemplateOrBuilder();
}
