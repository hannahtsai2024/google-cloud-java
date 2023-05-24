// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface QueryInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.QueryInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.InputAudioConfig audio_config = 1;</code>
   * @return Whether the audioConfig field is set.
   */
  boolean hasAudioConfig();
  /**
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.InputAudioConfig audio_config = 1;</code>
   * @return The audioConfig.
   */
  com.google.cloud.dialogflow.v2.InputAudioConfig getAudioConfig();
  /**
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.InputAudioConfig audio_config = 1;</code>
   */
  com.google.cloud.dialogflow.v2.InputAudioConfigOrBuilder getAudioConfigOrBuilder();

  /**
   * <pre>
   * The natural language text to be processed. Text length must not exceed
   * 256 character for virtual agent interactions.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput text = 2;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The natural language text to be processed. Text length must not exceed
   * 256 character for virtual agent interactions.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput text = 2;</code>
   * @return The text.
   */
  com.google.cloud.dialogflow.v2.TextInput getText();
  /**
   * <pre>
   * The natural language text to be processed. Text length must not exceed
   * 256 character for virtual agent interactions.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput text = 2;</code>
   */
  com.google.cloud.dialogflow.v2.TextInputOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * The event to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput event = 3;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <pre>
   * The event to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput event = 3;</code>
   * @return The event.
   */
  com.google.cloud.dialogflow.v2.EventInput getEvent();
  /**
   * <pre>
   * The event to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput event = 3;</code>
   */
  com.google.cloud.dialogflow.v2.EventInputOrBuilder getEventOrBuilder();

  com.google.cloud.dialogflow.v2.QueryInput.InputCase getInputCase();
}
