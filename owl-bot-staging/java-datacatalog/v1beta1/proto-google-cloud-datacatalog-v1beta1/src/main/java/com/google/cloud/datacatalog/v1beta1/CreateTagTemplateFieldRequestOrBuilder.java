// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

public interface CreateTagTemplateFieldRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateTagTemplateFieldRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the project and the template location
   * [region](https://cloud.google.com/data-catalog/docs/concepts/regions).
   *
   * Example:
   *
   * * projects/{project_id}/locations/us-central1/tagTemplates/{tag_template_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the project and the template location
   * [region](https://cloud.google.com/data-catalog/docs/concepts/regions).
   *
   * Example:
   *
   * * projects/{project_id}/locations/us-central1/tagTemplates/{tag_template_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The ID of the tag template field to create.
   * Field ids can contain letters (both uppercase and lowercase), numbers
   * (0-9), underscores (_) and dashes (-). Field IDs must be at least 1
   * character long and at most 128 characters long. Field IDs must also be
   * unique within their template.
   * </pre>
   *
   * <code>string tag_template_field_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagTemplateFieldId.
   */
  java.lang.String getTagTemplateFieldId();
  /**
   * <pre>
   * Required. The ID of the tag template field to create.
   * Field ids can contain letters (both uppercase and lowercase), numbers
   * (0-9), underscores (_) and dashes (-). Field IDs must be at least 1
   * character long and at most 128 characters long. Field IDs must also be
   * unique within their template.
   * </pre>
   *
   * <code>string tag_template_field_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tagTemplateFieldId.
   */
  com.google.protobuf.ByteString
      getTagTemplateFieldIdBytes();

  /**
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagTemplateField field is set.
   */
  boolean hasTagTemplateField();
  /**
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagTemplateField.
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplateField getTagTemplateField();
  /**
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplateFieldOrBuilder getTagTemplateFieldOrBuilder();
}
