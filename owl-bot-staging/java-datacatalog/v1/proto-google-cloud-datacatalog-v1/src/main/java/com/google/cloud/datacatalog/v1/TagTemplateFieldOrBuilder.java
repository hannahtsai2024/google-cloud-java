// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/tags.proto

package com.google.cloud.datacatalog.v1;

public interface TagTemplateFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.TagTemplateField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the tag template field in URL format.
   * Example:
   *
   * `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE}/fields/{FIELD}`
   *
   * Note: The tag template field itself might not be stored in the location
   * specified in its name.
   *
   * The name must contain only letters (a-z, A-Z), numbers (0-9),
   * or underscores (_), and must start with a letter or underscore.
   * The maximum length is 64 characters.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the tag template field in URL format.
   * Example:
   *
   * `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE}/fields/{FIELD}`
   *
   * Note: The tag template field itself might not be stored in the location
   * specified in its name.
   *
   * The name must contain only letters (a-z, A-Z), numbers (0-9),
   * or underscores (_), and must start with a letter or underscore.
   * The maximum length is 64 characters.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The display name for this field. Defaults to an empty string.
   *
   * The name must contain only Unicode letters, numbers (0-9), underscores (_),
   * dashes (-), spaces ( ), and can't start or end with spaces.
   * The maximum length is 200 characters.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name for this field. Defaults to an empty string.
   *
   * The name must contain only Unicode letters, numbers (0-9), underscores (_),
   * dashes (-), spaces ( ), and can't start or end with spaces.
   * The maximum length is 200 characters.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.cloud.datacatalog.v1.FieldType getType();
  /**
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1.FieldTypeOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * If true, this field is required. Defaults to false.
   * </pre>
   *
   * <code>bool is_required = 3;</code>
   * @return The isRequired.
   */
  boolean getIsRequired();

  /**
   * <pre>
   * The description for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The order of this field with respect to other fields in this tag
   * template.
   *
   * For example, a higher value can indicate a more important field.
   * The value can be negative. Multiple fields can have the same order and
   * field orders within a tag don't have to be sequential.
   * </pre>
   *
   * <code>int32 order = 5;</code>
   * @return The order.
   */
  int getOrder();
}
