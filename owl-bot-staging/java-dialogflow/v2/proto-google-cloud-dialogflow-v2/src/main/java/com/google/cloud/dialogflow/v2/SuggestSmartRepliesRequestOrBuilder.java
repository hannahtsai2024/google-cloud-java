// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface SuggestSmartRepliesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SuggestSmartRepliesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the participant to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the participant to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The current natural language text segment to compile suggestion
   * for. This provides a way for user to get follow up smart reply suggestion
   * after a smart reply selection, without sending a text message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput current_text_input = 4;</code>
   * @return Whether the currentTextInput field is set.
   */
  boolean hasCurrentTextInput();
  /**
   * <pre>
   * The current natural language text segment to compile suggestion
   * for. This provides a way for user to get follow up smart reply suggestion
   * after a smart reply selection, without sending a text message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput current_text_input = 4;</code>
   * @return The currentTextInput.
   */
  com.google.cloud.dialogflow.v2.TextInput getCurrentTextInput();
  /**
   * <pre>
   * The current natural language text segment to compile suggestion
   * for. This provides a way for user to get follow up smart reply suggestion
   * after a smart reply selection, without sending a text message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput current_text_input = 4;</code>
   */
  com.google.cloud.dialogflow.v2.TextInputOrBuilder getCurrentTextInputOrBuilder();

  /**
   * <pre>
   * The name of the latest conversation message to compile suggestion
   * for. If empty, it will be the latest message of the conversation.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The latestMessage.
   */
  java.lang.String getLatestMessage();
  /**
   * <pre>
   * The name of the latest conversation message to compile suggestion
   * for. If empty, it will be the latest message of the conversation.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString
      getLatestMessageBytes();

  /**
   * <pre>
   * Max number of messages prior to and including
   * [latest_message] to use as context when compiling the
   * suggestion. By default 20 and at most 50.
   * </pre>
   *
   * <code>int32 context_size = 3;</code>
   * @return The contextSize.
   */
  int getContextSize();
}
