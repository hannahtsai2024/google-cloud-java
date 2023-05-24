// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface BatchUpdateIntentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the agent to update or create intents in.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the agent to update or create intents in.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The URI to a Google Cloud Storage file containing intents to update or
   * create. The file format can either be a serialized proto (of IntentBatch
   * type) or JSON object. Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string intent_batch_uri = 2;</code>
   * @return Whether the intentBatchUri field is set.
   */
  boolean hasIntentBatchUri();
  /**
   * <pre>
   * The URI to a Google Cloud Storage file containing intents to update or
   * create. The file format can either be a serialized proto (of IntentBatch
   * type) or JSON object. Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string intent_batch_uri = 2;</code>
   * @return The intentBatchUri.
   */
  java.lang.String getIntentBatchUri();
  /**
   * <pre>
   * The URI to a Google Cloud Storage file containing intents to update or
   * create. The file format can either be a serialized proto (of IntentBatch
   * type) or JSON object. Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string intent_batch_uri = 2;</code>
   * @return The bytes for intentBatchUri.
   */
  com.google.protobuf.ByteString
      getIntentBatchUriBytes();

  /**
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentBatch intent_batch_inline = 3;</code>
   * @return Whether the intentBatchInline field is set.
   */
  boolean hasIntentBatchInline();
  /**
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentBatch intent_batch_inline = 3;</code>
   * @return The intentBatchInline.
   */
  com.google.cloud.dialogflow.v2beta1.IntentBatch getIntentBatchInline();
  /**
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentBatch intent_batch_inline = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentBatchOrBuilder getIntentBatchInlineOrBuilder();

  /**
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 6;</code>
   * @return The enum numeric value on the wire for intentView.
   */
  int getIntentViewValue();
  /**
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 6;</code>
   * @return The intentView.
   */
  com.google.cloud.dialogflow.v2beta1.IntentView getIntentView();

  com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest.IntentBatchCase getIntentBatchCase();
}
