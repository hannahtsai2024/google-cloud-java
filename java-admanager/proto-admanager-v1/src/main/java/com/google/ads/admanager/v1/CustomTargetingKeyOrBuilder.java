// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/custom_targeting_key_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public interface CustomTargetingKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.CustomTargetingKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier. The resource name of the `CustomTargetingKey`.
   * Format:
   * `networks/{network_code}/customTargetingKeys/{custom_targeting_key_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Identifier. The resource name of the `CustomTargetingKey`.
   * Format:
   * `networks/{network_code}/customTargetingKeys/{custom_targeting_key_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. `CustomTargetingKey` ID.
   * </pre>
   *
   * <code>int64 custom_targeting_key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The customTargetingKeyId.
   */
  long getCustomTargetingKeyId();

  /**
   * <pre>
   * Immutable. Name of the key. Keys can contain up to 10 characters each. You
   * can use alphanumeric characters and symbols other than the following:
   * ", ', =, !, +, #, *, ~, ;, ^, (, ), &lt;, &gt;, [, ], the white space character.
   * </pre>
   *
   * <code>string ad_tag_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The adTagName.
   */
  java.lang.String getAdTagName();
  /**
   * <pre>
   * Immutable. Name of the key. Keys can contain up to 10 characters each. You
   * can use alphanumeric characters and symbols other than the following:
   * ", ', =, !, +, #, *, ~, ;, ^, (, ), &lt;, &gt;, [, ], the white space character.
   * </pre>
   *
   * <code>string ad_tag_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for adTagName.
   */
  com.google.protobuf.ByteString
      getAdTagNameBytes();

  /**
   * <pre>
   * Optional. Descriptive name for the `CustomTargetingKey`.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Optional. Descriptive name for the `CustomTargetingKey`.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required. Indicates whether users will select from predefined values or
   * create new targeting values, while specifying targeting criteria for a line
   * item.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.CustomTargetingKeyTypeEnum.CustomTargetingKeyType type = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. Indicates whether users will select from predefined values or
   * create new targeting values, while specifying targeting criteria for a line
   * item.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.CustomTargetingKeyTypeEnum.CustomTargetingKeyType type = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.ads.admanager.v1.CustomTargetingKeyTypeEnum.CustomTargetingKeyType getType();

  /**
   * <pre>
   * Output only. Status of the `CustomTargetingKey`.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.CustomTargetingKeyStatusEnum.CustomTargetingKeyStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the `CustomTargetingKey`.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.CustomTargetingKeyStatusEnum.CustomTargetingKeyStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.admanager.v1.CustomTargetingKeyStatusEnum.CustomTargetingKeyStatus getStatus();

  /**
   * <pre>
   * Required. Reportable state of the `CustomTargetingKey`.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.CustomTargetingKeyReportableTypeEnum.CustomTargetingKeyReportableType reportable_type = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for reportableType.
   */
  int getReportableTypeValue();
  /**
   * <pre>
   * Required. Reportable state of the `CustomTargetingKey`.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.CustomTargetingKeyReportableTypeEnum.CustomTargetingKeyReportableType reportable_type = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The reportableType.
   */
  com.google.ads.admanager.v1.CustomTargetingKeyReportableTypeEnum.CustomTargetingKeyReportableType getReportableType();
}
