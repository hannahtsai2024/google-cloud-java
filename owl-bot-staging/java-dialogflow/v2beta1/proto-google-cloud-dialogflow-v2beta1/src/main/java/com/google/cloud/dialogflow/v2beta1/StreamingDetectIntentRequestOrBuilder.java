// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface StreamingDetectIntentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the session the query is sent to.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;`,
   *
   * If `Location ID` is not specified we assume default 'us' location. If
   * `Environment ID` is not specified, we assume default 'draft' environment.
   * If `User ID` is not specified, we are using "-". It's up to the API caller
   * to choose an appropriate `Session ID` and `User Id`. They can be a random
   * number or some type of user and session identifiers (preferably hashed).
   * The length of the `Session ID` and `User ID` must not exceed 36 characters.
   *
   * For more information, see the [API interactions
   * guide](https://cloud.google.com/dialogflow/docs/api-overview).
   *
   * Note: Always use agent versions for production traffic.
   * See [Versions and
   * environments](https://cloud.google.com/dialogflow/es/docs/agents-versions).
   * </pre>
   *
   * <code>string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The session.
   */
  java.lang.String getSession();
  /**
   * <pre>
   * Required. The name of the session the query is sent to.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;`,
   *
   * If `Location ID` is not specified we assume default 'us' location. If
   * `Environment ID` is not specified, we assume default 'draft' environment.
   * If `User ID` is not specified, we are using "-". It's up to the API caller
   * to choose an appropriate `Session ID` and `User Id`. They can be a random
   * number or some type of user and session identifiers (preferably hashed).
   * The length of the `Session ID` and `User ID` must not exceed 36 characters.
   *
   * For more information, see the [API interactions
   * guide](https://cloud.google.com/dialogflow/docs/api-overview).
   *
   * Note: Always use agent versions for production traffic.
   * See [Versions and
   * environments](https://cloud.google.com/dialogflow/es/docs/agents-versions).
   * </pre>
   *
   * <code>string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString
      getSessionBytes();

  /**
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();
  /**
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.v2beta1.QueryParameters getQueryParams();
  /**
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   * <pre>
   * Required. The input specification. It can be set to:
   *
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   *
   * 2.  a conversational query in the form of text, or
   *
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the queryInput field is set.
   */
  boolean hasQueryInput();
  /**
   * <pre>
   * Required. The input specification. It can be set to:
   *
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   *
   * 2.  a conversational query in the form of text, or
   *
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queryInput.
   */
  com.google.cloud.dialogflow.v2beta1.QueryInput getQueryInput();
  /**
   * <pre>
   * Required. The input specification. It can be set to:
   *
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   *
   * 2.  a conversational query in the form of text, or
   *
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   * <pre>
   * DEPRECATED. Please use
   * [InputAudioConfig.single_utterance][google.cloud.dialogflow.v2beta1.InputAudioConfig.single_utterance]
   * instead. If `false` (default), recognition does not cease until the client
   * closes the stream. If `true`, the recognizer will detect a single spoken
   * utterance in input audio. Recognition ceases when it detects the audio's
   * voice has stopped or paused. In this case, once a detected intent is
   * received, the client should close the stream and start a new request with a
   * new stream as needed. This setting is ignored when `query_input` is a piece
   * of text or an event.
   * </pre>
   *
   * <code>bool single_utterance = 4 [deprecated = true];</code>
   * @deprecated google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.single_utterance is deprecated.
   *     See google/cloud/dialogflow/v2beta1/session.proto;l=564
   * @return The singleUtterance.
   */
  @java.lang.Deprecated boolean getSingleUtterance();

  /**
   * <pre>
   * Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 5;</code>
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();
  /**
   * <pre>
   * Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 5;</code>
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfig getOutputAudioConfig();
  /**
   * <pre>
   * Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();

  /**
   * <pre>
   * Mask for
   * [output_audio_config][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.output_audio_config]
   * indicating which settings in this request-level config should override
   * speech synthesizer settings defined at agent-level.
   *
   * If unspecified or empty,
   * [output_audio_config][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.output_audio_config]
   * replaces the agent-level config in its entirety.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask output_audio_config_mask = 7;</code>
   * @return Whether the outputAudioConfigMask field is set.
   */
  boolean hasOutputAudioConfigMask();
  /**
   * <pre>
   * Mask for
   * [output_audio_config][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.output_audio_config]
   * indicating which settings in this request-level config should override
   * speech synthesizer settings defined at agent-level.
   *
   * If unspecified or empty,
   * [output_audio_config][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.output_audio_config]
   * replaces the agent-level config in its entirety.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask output_audio_config_mask = 7;</code>
   * @return The outputAudioConfigMask.
   */
  com.google.protobuf.FieldMask getOutputAudioConfigMask();
  /**
   * <pre>
   * Mask for
   * [output_audio_config][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.output_audio_config]
   * indicating which settings in this request-level config should override
   * speech synthesizer settings defined at agent-level.
   *
   * If unspecified or empty,
   * [output_audio_config][google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.output_audio_config]
   * replaces the agent-level config in its entirety.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask output_audio_config_mask = 7;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getOutputAudioConfigMaskOrBuilder();

  /**
   * <pre>
   * The input audio content to be recognized. Must be sent if
   * `query_input` was set to a streaming input audio config. The complete audio
   * over all streaming messages must not exceed 1 minute.
   * </pre>
   *
   * <code>bytes input_audio = 6;</code>
   * @return The inputAudio.
   */
  com.google.protobuf.ByteString getInputAudio();

  /**
   * <pre>
   * If true, `StreamingDetectIntentResponse.debugging_info` will get populated.
   * </pre>
   *
   * <code>bool enable_debugging_info = 8;</code>
   * @return The enableDebuggingInfo.
   */
  boolean getEnableDebuggingInfo();
}
