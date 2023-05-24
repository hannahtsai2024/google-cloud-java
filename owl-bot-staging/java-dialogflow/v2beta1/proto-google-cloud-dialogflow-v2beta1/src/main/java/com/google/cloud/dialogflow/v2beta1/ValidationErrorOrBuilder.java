// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/validation_result.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ValidationErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ValidationError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The severity of the error.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ValidationError.Severity severity = 1;</code>
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   * <pre>
   * The severity of the error.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ValidationError.Severity severity = 1;</code>
   * @return The severity.
   */
  com.google.cloud.dialogflow.v2beta1.ValidationError.Severity getSeverity();

  /**
   * <pre>
   * The names of the entries that the error is associated with.
   * Format:
   *
   * - "projects/&lt;Project ID&gt;/agent", if the error is associated with the entire
   * agent.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;", if the error is
   * associated with certain intents.
   * - "projects/&lt;Project
   * ID&gt;/agent/intents/&lt;Intent Id&gt;/trainingPhrases/&lt;Training Phrase ID&gt;", if the
   * error is associated with certain intent training phrases.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent Id&gt;/parameters/&lt;Parameter
   * ID&gt;", if the error is associated with certain intent parameters.
   * - "projects/&lt;Project ID&gt;/agent/entities/&lt;Entity ID&gt;", if the error is
   * associated with certain entities.
   * </pre>
   *
   * <code>repeated string entries = 3;</code>
   * @return A list containing the entries.
   */
  java.util.List<java.lang.String>
      getEntriesList();
  /**
   * <pre>
   * The names of the entries that the error is associated with.
   * Format:
   *
   * - "projects/&lt;Project ID&gt;/agent", if the error is associated with the entire
   * agent.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;", if the error is
   * associated with certain intents.
   * - "projects/&lt;Project
   * ID&gt;/agent/intents/&lt;Intent Id&gt;/trainingPhrases/&lt;Training Phrase ID&gt;", if the
   * error is associated with certain intent training phrases.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent Id&gt;/parameters/&lt;Parameter
   * ID&gt;", if the error is associated with certain intent parameters.
   * - "projects/&lt;Project ID&gt;/agent/entities/&lt;Entity ID&gt;", if the error is
   * associated with certain entities.
   * </pre>
   *
   * <code>repeated string entries = 3;</code>
   * @return The count of entries.
   */
  int getEntriesCount();
  /**
   * <pre>
   * The names of the entries that the error is associated with.
   * Format:
   *
   * - "projects/&lt;Project ID&gt;/agent", if the error is associated with the entire
   * agent.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;", if the error is
   * associated with certain intents.
   * - "projects/&lt;Project
   * ID&gt;/agent/intents/&lt;Intent Id&gt;/trainingPhrases/&lt;Training Phrase ID&gt;", if the
   * error is associated with certain intent training phrases.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent Id&gt;/parameters/&lt;Parameter
   * ID&gt;", if the error is associated with certain intent parameters.
   * - "projects/&lt;Project ID&gt;/agent/entities/&lt;Entity ID&gt;", if the error is
   * associated with certain entities.
   * </pre>
   *
   * <code>repeated string entries = 3;</code>
   * @param index The index of the element to return.
   * @return The entries at the given index.
   */
  java.lang.String getEntries(int index);
  /**
   * <pre>
   * The names of the entries that the error is associated with.
   * Format:
   *
   * - "projects/&lt;Project ID&gt;/agent", if the error is associated with the entire
   * agent.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;", if the error is
   * associated with certain intents.
   * - "projects/&lt;Project
   * ID&gt;/agent/intents/&lt;Intent Id&gt;/trainingPhrases/&lt;Training Phrase ID&gt;", if the
   * error is associated with certain intent training phrases.
   * - "projects/&lt;Project ID&gt;/agent/intents/&lt;Intent Id&gt;/parameters/&lt;Parameter
   * ID&gt;", if the error is associated with certain intent parameters.
   * - "projects/&lt;Project ID&gt;/agent/entities/&lt;Entity ID&gt;", if the error is
   * associated with certain entities.
   * </pre>
   *
   * <code>repeated string entries = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the entries at the given index.
   */
  com.google.protobuf.ByteString
      getEntriesBytes(int index);

  /**
   * <pre>
   * The detailed error message.
   * </pre>
   *
   * <code>string error_message = 4;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * The detailed error message.
   * </pre>
   *
   * <code>string error_message = 4;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
