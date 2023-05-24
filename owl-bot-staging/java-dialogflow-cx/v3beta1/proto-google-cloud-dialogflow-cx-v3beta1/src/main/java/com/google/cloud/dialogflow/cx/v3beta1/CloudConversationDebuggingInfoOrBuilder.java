// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface CloudConversationDebuggingInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.CloudConversationDebuggingInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of input audio data chunks in streaming requests.
   * </pre>
   *
   * <code>int32 audio_data_chunks = 1;</code>
   * @return The audioDataChunks.
   */
  int getAudioDataChunks();

  /**
   * <pre>
   * Time offset of the end of speech utterance relative to the
   * beginning of the first audio chunk.
   * </pre>
   *
   * <code>.google.protobuf.Duration result_end_time_offset = 2;</code>
   * @return Whether the resultEndTimeOffset field is set.
   */
  boolean hasResultEndTimeOffset();
  /**
   * <pre>
   * Time offset of the end of speech utterance relative to the
   * beginning of the first audio chunk.
   * </pre>
   *
   * <code>.google.protobuf.Duration result_end_time_offset = 2;</code>
   * @return The resultEndTimeOffset.
   */
  com.google.protobuf.Duration getResultEndTimeOffset();
  /**
   * <pre>
   * Time offset of the end of speech utterance relative to the
   * beginning of the first audio chunk.
   * </pre>
   *
   * <code>.google.protobuf.Duration result_end_time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getResultEndTimeOffsetOrBuilder();

  /**
   * <pre>
   * Duration of first audio chunk.
   * </pre>
   *
   * <code>.google.protobuf.Duration first_audio_duration = 3;</code>
   * @return Whether the firstAudioDuration field is set.
   */
  boolean hasFirstAudioDuration();
  /**
   * <pre>
   * Duration of first audio chunk.
   * </pre>
   *
   * <code>.google.protobuf.Duration first_audio_duration = 3;</code>
   * @return The firstAudioDuration.
   */
  com.google.protobuf.Duration getFirstAudioDuration();
  /**
   * <pre>
   * Duration of first audio chunk.
   * </pre>
   *
   * <code>.google.protobuf.Duration first_audio_duration = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getFirstAudioDurationOrBuilder();

  /**
   * <pre>
   * Whether client used single utterance mode.
   * </pre>
   *
   * <code>bool single_utterance = 5;</code>
   * @return The singleUtterance.
   */
  boolean getSingleUtterance();

  /**
   * <pre>
   * Time offsets of the speech partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_partial_results_end_times = 6;</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getSpeechPartialResultsEndTimesList();
  /**
   * <pre>
   * Time offsets of the speech partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_partial_results_end_times = 6;</code>
   */
  com.google.protobuf.Duration getSpeechPartialResultsEndTimes(int index);
  /**
   * <pre>
   * Time offsets of the speech partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_partial_results_end_times = 6;</code>
   */
  int getSpeechPartialResultsEndTimesCount();
  /**
   * <pre>
   * Time offsets of the speech partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_partial_results_end_times = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getSpeechPartialResultsEndTimesOrBuilderList();
  /**
   * <pre>
   * Time offsets of the speech partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_partial_results_end_times = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getSpeechPartialResultsEndTimesOrBuilder(
      int index);

  /**
   * <pre>
   * Time offsets of the speech final results (is_final=true) relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_final_results_end_times = 7;</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getSpeechFinalResultsEndTimesList();
  /**
   * <pre>
   * Time offsets of the speech final results (is_final=true) relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_final_results_end_times = 7;</code>
   */
  com.google.protobuf.Duration getSpeechFinalResultsEndTimes(int index);
  /**
   * <pre>
   * Time offsets of the speech final results (is_final=true) relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_final_results_end_times = 7;</code>
   */
  int getSpeechFinalResultsEndTimesCount();
  /**
   * <pre>
   * Time offsets of the speech final results (is_final=true) relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_final_results_end_times = 7;</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getSpeechFinalResultsEndTimesOrBuilderList();
  /**
   * <pre>
   * Time offsets of the speech final results (is_final=true) relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration speech_final_results_end_times = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getSpeechFinalResultsEndTimesOrBuilder(
      int index);

  /**
   * <pre>
   * Total number of partial responses.
   * </pre>
   *
   * <code>int32 partial_responses = 8;</code>
   * @return The partialResponses.
   */
  int getPartialResponses();

  /**
   * <pre>
   * Time offset of Speaker ID stream close time relative to the Speech stream
   * close time in milliseconds. Only meaningful for conversations involving
   * passive verification.
   * </pre>
   *
   * <code>int32 speaker_id_passive_latency_ms_offset = 9;</code>
   * @return The speakerIdPassiveLatencyMsOffset.
   */
  int getSpeakerIdPassiveLatencyMsOffset();

  /**
   * <pre>
   * Whether a barge-in event is triggered in this request.
   * </pre>
   *
   * <code>bool bargein_event_triggered = 10;</code>
   * @return The bargeinEventTriggered.
   */
  boolean getBargeinEventTriggered();

  /**
   * <pre>
   * Whether speech uses single utterance mode.
   * </pre>
   *
   * <code>bool speech_single_utterance = 11;</code>
   * @return The speechSingleUtterance.
   */
  boolean getSpeechSingleUtterance();

  /**
   * <pre>
   * Time offsets of the DTMF partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_partial_results_times = 12;</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getDtmfPartialResultsTimesList();
  /**
   * <pre>
   * Time offsets of the DTMF partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_partial_results_times = 12;</code>
   */
  com.google.protobuf.Duration getDtmfPartialResultsTimes(int index);
  /**
   * <pre>
   * Time offsets of the DTMF partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_partial_results_times = 12;</code>
   */
  int getDtmfPartialResultsTimesCount();
  /**
   * <pre>
   * Time offsets of the DTMF partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_partial_results_times = 12;</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getDtmfPartialResultsTimesOrBuilderList();
  /**
   * <pre>
   * Time offsets of the DTMF partial results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_partial_results_times = 12;</code>
   */
  com.google.protobuf.DurationOrBuilder getDtmfPartialResultsTimesOrBuilder(
      int index);

  /**
   * <pre>
   * Time offsets of the DTMF final results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_final_results_times = 13;</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getDtmfFinalResultsTimesList();
  /**
   * <pre>
   * Time offsets of the DTMF final results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_final_results_times = 13;</code>
   */
  com.google.protobuf.Duration getDtmfFinalResultsTimes(int index);
  /**
   * <pre>
   * Time offsets of the DTMF final results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_final_results_times = 13;</code>
   */
  int getDtmfFinalResultsTimesCount();
  /**
   * <pre>
   * Time offsets of the DTMF final results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_final_results_times = 13;</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getDtmfFinalResultsTimesOrBuilderList();
  /**
   * <pre>
   * Time offsets of the DTMF final results relative to the beginning of
   * the stream.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration dtmf_final_results_times = 13;</code>
   */
  com.google.protobuf.DurationOrBuilder getDtmfFinalResultsTimesOrBuilder(
      int index);

  /**
   * <pre>
   * Time offset of the end-of-single-utterance signal relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Duration single_utterance_end_time_offset = 14;</code>
   * @return Whether the singleUtteranceEndTimeOffset field is set.
   */
  boolean hasSingleUtteranceEndTimeOffset();
  /**
   * <pre>
   * Time offset of the end-of-single-utterance signal relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Duration single_utterance_end_time_offset = 14;</code>
   * @return The singleUtteranceEndTimeOffset.
   */
  com.google.protobuf.Duration getSingleUtteranceEndTimeOffset();
  /**
   * <pre>
   * Time offset of the end-of-single-utterance signal relative to the
   * beginning of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Duration single_utterance_end_time_offset = 14;</code>
   */
  com.google.protobuf.DurationOrBuilder getSingleUtteranceEndTimeOffsetOrBuilder();

  /**
   * <pre>
   * No speech timeout settings observed at runtime.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_speech_timeout = 15;</code>
   * @return Whether the noSpeechTimeout field is set.
   */
  boolean hasNoSpeechTimeout();
  /**
   * <pre>
   * No speech timeout settings observed at runtime.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_speech_timeout = 15;</code>
   * @return The noSpeechTimeout.
   */
  com.google.protobuf.Duration getNoSpeechTimeout();
  /**
   * <pre>
   * No speech timeout settings observed at runtime.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_speech_timeout = 15;</code>
   */
  com.google.protobuf.DurationOrBuilder getNoSpeechTimeoutOrBuilder();

  /**
   * <pre>
   * Whether the streaming terminates with an injected text query.
   * </pre>
   *
   * <code>bool is_input_text = 16;</code>
   * @return The isInputText.
   */
  boolean getIsInputText();

  /**
   * <pre>
   * Client half close time in terms of input audio duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_half_close_time_offset = 17;</code>
   * @return Whether the clientHalfCloseTimeOffset field is set.
   */
  boolean hasClientHalfCloseTimeOffset();
  /**
   * <pre>
   * Client half close time in terms of input audio duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_half_close_time_offset = 17;</code>
   * @return The clientHalfCloseTimeOffset.
   */
  com.google.protobuf.Duration getClientHalfCloseTimeOffset();
  /**
   * <pre>
   * Client half close time in terms of input audio duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_half_close_time_offset = 17;</code>
   */
  com.google.protobuf.DurationOrBuilder getClientHalfCloseTimeOffsetOrBuilder();

  /**
   * <pre>
   * Client half close time in terms of API streaming duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_half_close_streaming_time_offset = 18;</code>
   * @return Whether the clientHalfCloseStreamingTimeOffset field is set.
   */
  boolean hasClientHalfCloseStreamingTimeOffset();
  /**
   * <pre>
   * Client half close time in terms of API streaming duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_half_close_streaming_time_offset = 18;</code>
   * @return The clientHalfCloseStreamingTimeOffset.
   */
  com.google.protobuf.Duration getClientHalfCloseStreamingTimeOffset();
  /**
   * <pre>
   * Client half close time in terms of API streaming duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_half_close_streaming_time_offset = 18;</code>
   */
  com.google.protobuf.DurationOrBuilder getClientHalfCloseStreamingTimeOffsetOrBuilder();
}
