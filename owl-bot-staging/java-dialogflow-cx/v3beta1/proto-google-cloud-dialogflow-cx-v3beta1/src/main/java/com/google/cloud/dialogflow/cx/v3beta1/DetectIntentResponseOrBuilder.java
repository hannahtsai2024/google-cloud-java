// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface DetectIntentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.DetectIntentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   * @return The responseId.
   */
  java.lang.String getResponseId();
  /**
   * <pre>
   * Output only. The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   * @return The bytes for responseId.
   */
  com.google.protobuf.ByteString
      getResponseIdBytes();

  /**
   * <pre>
   * The result of the conversational query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.QueryResult query_result = 2;</code>
   * @return Whether the queryResult field is set.
   */
  boolean hasQueryResult();
  /**
   * <pre>
   * The result of the conversational query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.QueryResult query_result = 2;</code>
   * @return The queryResult.
   */
  com.google.cloud.dialogflow.cx.v3beta1.QueryResult getQueryResult();
  /**
   * <pre>
   * The result of the conversational query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.QueryResult query_result = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.QueryResultOrBuilder getQueryResultOrBuilder();

  /**
   * <pre>
   * The audio data bytes encoded as specified in the request.
   * Note: The output audio is generated based on the values of default platform
   * text responses found in the
   * [`query_result.response_messages`][google.cloud.dialogflow.cx.v3beta1.QueryResult.response_messages]
   * field. If multiple default text responses exist, they will be concatenated
   * when generating audio. If no default platform text responses exist, the
   * generated audio content will be empty.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>bytes output_audio = 4;</code>
   * @return The outputAudio.
   */
  com.google.protobuf.ByteString getOutputAudio();

  /**
   * <pre>
   * The config used by the speech synthesizer to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 5;</code>
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();
  /**
   * <pre>
   * The config used by the speech synthesizer to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 5;</code>
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig getOutputAudioConfig();
  /**
   * <pre>
   * The config used by the speech synthesizer to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();

  /**
   * <pre>
   * Response type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.DetectIntentResponse.ResponseType response_type = 6;</code>
   * @return The enum numeric value on the wire for responseType.
   */
  int getResponseTypeValue();
  /**
   * <pre>
   * Response type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.DetectIntentResponse.ResponseType response_type = 6;</code>
   * @return The responseType.
   */
  com.google.cloud.dialogflow.cx.v3beta1.DetectIntentResponse.ResponseType getResponseType();

  /**
   * <pre>
   * Indicates whether the partial response can be cancelled when a later
   * response arrives. e.g. if the agent specified some music as partial
   * response, it can be cancelled.
   * </pre>
   *
   * <code>bool allow_cancellation = 7;</code>
   * @return The allowCancellation.
   */
  boolean getAllowCancellation();
}
