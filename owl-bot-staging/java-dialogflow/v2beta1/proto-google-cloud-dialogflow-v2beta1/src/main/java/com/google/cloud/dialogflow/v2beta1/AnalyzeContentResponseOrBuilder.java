// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface AnalyzeContentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AnalyzeContentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The output text content.
   * This field is set if the automated agent responded with text to show to
   * the user.
   * </pre>
   *
   * <code>string reply_text = 1;</code>
   * @return The replyText.
   */
  java.lang.String getReplyText();
  /**
   * <pre>
   * Output only. The output text content.
   * This field is set if the automated agent responded with text to show to
   * the user.
   * </pre>
   *
   * <code>string reply_text = 1;</code>
   * @return The bytes for replyText.
   */
  com.google.protobuf.ByteString
      getReplyTextBytes();

  /**
   * <pre>
   * Optional. The audio data bytes encoded as specified in the request.
   * This field is set if:
   *
   *  - `reply_audio_config` was specified in the request, or
   *  - The automated agent responded with audio to play to the user. In such
   *    case, `reply_audio.config` contains settings used to synthesize the
   *    speech.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudio reply_audio = 2;</code>
   * @return Whether the replyAudio field is set.
   */
  boolean hasReplyAudio();
  /**
   * <pre>
   * Optional. The audio data bytes encoded as specified in the request.
   * This field is set if:
   *
   *  - `reply_audio_config` was specified in the request, or
   *  - The automated agent responded with audio to play to the user. In such
   *    case, `reply_audio.config` contains settings used to synthesize the
   *    speech.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudio reply_audio = 2;</code>
   * @return The replyAudio.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudio getReplyAudio();
  /**
   * <pre>
   * Optional. The audio data bytes encoded as specified in the request.
   * This field is set if:
   *
   *  - `reply_audio_config` was specified in the request, or
   *  - The automated agent responded with audio to play to the user. In such
   *    case, `reply_audio.config` contains settings used to synthesize the
   *    speech.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudio reply_audio = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioOrBuilder getReplyAudioOrBuilder();

  /**
   * <pre>
   * Optional. Only set if a Dialogflow automated agent has responded.
   * Note that: [AutomatedAgentReply.detect_intent_response.output_audio][]
   * and [AutomatedAgentReply.detect_intent_response.output_audio_config][]
   * are always empty, use
   * [reply_audio][google.cloud.dialogflow.v2beta1.AnalyzeContentResponse.reply_audio]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AutomatedAgentReply automated_agent_reply = 3;</code>
   * @return Whether the automatedAgentReply field is set.
   */
  boolean hasAutomatedAgentReply();
  /**
   * <pre>
   * Optional. Only set if a Dialogflow automated agent has responded.
   * Note that: [AutomatedAgentReply.detect_intent_response.output_audio][]
   * and [AutomatedAgentReply.detect_intent_response.output_audio_config][]
   * are always empty, use
   * [reply_audio][google.cloud.dialogflow.v2beta1.AnalyzeContentResponse.reply_audio]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AutomatedAgentReply automated_agent_reply = 3;</code>
   * @return The automatedAgentReply.
   */
  com.google.cloud.dialogflow.v2beta1.AutomatedAgentReply getAutomatedAgentReply();
  /**
   * <pre>
   * Optional. Only set if a Dialogflow automated agent has responded.
   * Note that: [AutomatedAgentReply.detect_intent_response.output_audio][]
   * and [AutomatedAgentReply.detect_intent_response.output_audio_config][]
   * are always empty, use
   * [reply_audio][google.cloud.dialogflow.v2beta1.AnalyzeContentResponse.reply_audio]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AutomatedAgentReply automated_agent_reply = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AutomatedAgentReplyOrBuilder getAutomatedAgentReplyOrBuilder();

  /**
   * <pre>
   * Output only. Message analyzed by CCAI.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message message = 5;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * Output only. Message analyzed by CCAI.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message message = 5;</code>
   * @return The message.
   */
  com.google.cloud.dialogflow.v2beta1.Message getMessage();
  /**
   * <pre>
   * Output only. Message analyzed by CCAI.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message message = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.MessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult human_agent_suggestion_results = 6;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SuggestionResult> 
      getHumanAgentSuggestionResultsList();
  /**
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult human_agent_suggestion_results = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionResult getHumanAgentSuggestionResults(int index);
  /**
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult human_agent_suggestion_results = 6;</code>
   */
  int getHumanAgentSuggestionResultsCount();
  /**
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult human_agent_suggestion_results = 6;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SuggestionResultOrBuilder> 
      getHumanAgentSuggestionResultsOrBuilderList();
  /**
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult human_agent_suggestion_results = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionResultOrBuilder getHumanAgentSuggestionResultsOrBuilder(
      int index);

  /**
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult end_user_suggestion_results = 7;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SuggestionResult> 
      getEndUserSuggestionResultsList();
  /**
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult end_user_suggestion_results = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionResult getEndUserSuggestionResults(int index);
  /**
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult end_user_suggestion_results = 7;</code>
   */
  int getEndUserSuggestionResultsCount();
  /**
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult end_user_suggestion_results = 7;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SuggestionResultOrBuilder> 
      getEndUserSuggestionResultsOrBuilderList();
  /**
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SuggestionResult end_user_suggestion_results = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionResultOrBuilder getEndUserSuggestionResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Indicates the parameters of DTMF.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.DtmfParameters dtmf_parameters = 9;</code>
   * @return Whether the dtmfParameters field is set.
   */
  boolean hasDtmfParameters();
  /**
   * <pre>
   * Indicates the parameters of DTMF.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.DtmfParameters dtmf_parameters = 9;</code>
   * @return The dtmfParameters.
   */
  com.google.cloud.dialogflow.v2beta1.DtmfParameters getDtmfParameters();
  /**
   * <pre>
   * Indicates the parameters of DTMF.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.DtmfParameters dtmf_parameters = 9;</code>
   */
  com.google.cloud.dialogflow.v2beta1.DtmfParametersOrBuilder getDtmfParametersOrBuilder();
}
