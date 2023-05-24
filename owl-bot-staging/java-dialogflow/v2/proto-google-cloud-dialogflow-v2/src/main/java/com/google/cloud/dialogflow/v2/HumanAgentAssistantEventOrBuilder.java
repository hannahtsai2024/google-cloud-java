// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/human_agent_assistant_event.proto

package com.google.cloud.dialogflow.v2;

public interface HumanAgentAssistantEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.HumanAgentAssistantEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The conversation this notification refers to.
   * Format: `projects/&lt;Project ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string conversation = 1;</code>
   * @return The conversation.
   */
  java.lang.String getConversation();
  /**
   * <pre>
   * The conversation this notification refers to.
   * Format: `projects/&lt;Project ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string conversation = 1;</code>
   * @return The bytes for conversation.
   */
  com.google.protobuf.ByteString
      getConversationBytes();

  /**
   * <pre>
   * The participant that the suggestion is compiled for.
   * Format: `projects/&lt;Project ID&gt;/conversations/&lt;Conversation
   * ID&gt;/participants/&lt;Participant ID&gt;`. It will not be set in legacy workflow.
   * </pre>
   *
   * <code>string participant = 3;</code>
   * @return The participant.
   */
  java.lang.String getParticipant();
  /**
   * <pre>
   * The participant that the suggestion is compiled for.
   * Format: `projects/&lt;Project ID&gt;/conversations/&lt;Conversation
   * ID&gt;/participants/&lt;Participant ID&gt;`. It will not be set in legacy workflow.
   * </pre>
   *
   * <code>string participant = 3;</code>
   * @return The bytes for participant.
   */
  com.google.protobuf.ByteString
      getParticipantBytes();

  /**
   * <pre>
   * The suggestion results payload that this notification refers to.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult suggestion_results = 5;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.SuggestionResult> 
      getSuggestionResultsList();
  /**
   * <pre>
   * The suggestion results payload that this notification refers to.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult suggestion_results = 5;</code>
   */
  com.google.cloud.dialogflow.v2.SuggestionResult getSuggestionResults(int index);
  /**
   * <pre>
   * The suggestion results payload that this notification refers to.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult suggestion_results = 5;</code>
   */
  int getSuggestionResultsCount();
  /**
   * <pre>
   * The suggestion results payload that this notification refers to.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult suggestion_results = 5;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.SuggestionResultOrBuilder> 
      getSuggestionResultsOrBuilderList();
  /**
   * <pre>
   * The suggestion results payload that this notification refers to.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult suggestion_results = 5;</code>
   */
  com.google.cloud.dialogflow.v2.SuggestionResultOrBuilder getSuggestionResultsOrBuilder(
      int index);
}
