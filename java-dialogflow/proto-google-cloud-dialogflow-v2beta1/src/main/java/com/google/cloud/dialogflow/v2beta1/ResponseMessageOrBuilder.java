/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ResponseMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Returns a text response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.Text text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * Returns a text response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.Text text = 1;</code>
   *
   * @return The text.
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.Text getText();
  /**
   *
   *
   * <pre>
   * Returns a text response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.Text text = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.TextOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Returns a response containing a custom, platform-specific payload.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 2;</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Returns a response containing a custom, platform-specific payload.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 2;</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Returns a response containing a custom, platform-specific payload.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Hands off conversation to a live agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.LiveAgentHandoff live_agent_handoff = 3;
   * </code>
   *
   * @return Whether the liveAgentHandoff field is set.
   */
  boolean hasLiveAgentHandoff();
  /**
   *
   *
   * <pre>
   * Hands off conversation to a live agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.LiveAgentHandoff live_agent_handoff = 3;
   * </code>
   *
   * @return The liveAgentHandoff.
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.LiveAgentHandoff getLiveAgentHandoff();
  /**
   *
   *
   * <pre>
   * Hands off conversation to a live agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.LiveAgentHandoff live_agent_handoff = 3;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.LiveAgentHandoffOrBuilder
      getLiveAgentHandoffOrBuilder();

  /**
   *
   *
   * <pre>
   * A signal that indicates the interaction with the Dialogflow agent has
   * ended.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.EndInteraction end_interaction = 4;
   * </code>
   *
   * @return Whether the endInteraction field is set.
   */
  boolean hasEndInteraction();
  /**
   *
   *
   * <pre>
   * A signal that indicates the interaction with the Dialogflow agent has
   * ended.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.EndInteraction end_interaction = 4;
   * </code>
   *
   * @return The endInteraction.
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.EndInteraction getEndInteraction();
  /**
   *
   *
   * <pre>
   * A signal that indicates the interaction with the Dialogflow agent has
   * ended.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.EndInteraction end_interaction = 4;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.EndInteractionOrBuilder
      getEndInteractionOrBuilder();

  /**
   *
   *
   * <pre>
   * An audio response message composed of both the synthesized Dialogflow
   * agent responses and the audios hosted in places known to the client.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.MixedAudio mixed_audio = 5;</code>
   *
   * @return Whether the mixedAudio field is set.
   */
  boolean hasMixedAudio();
  /**
   *
   *
   * <pre>
   * An audio response message composed of both the synthesized Dialogflow
   * agent responses and the audios hosted in places known to the client.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.MixedAudio mixed_audio = 5;</code>
   *
   * @return The mixedAudio.
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.MixedAudio getMixedAudio();
  /**
   *
   *
   * <pre>
   * An audio response message composed of both the synthesized Dialogflow
   * agent responses and the audios hosted in places known to the client.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ResponseMessage.MixedAudio mixed_audio = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.MixedAudioOrBuilder getMixedAudioOrBuilder();

  /**
   *
   *
   * <pre>
   * A signal that the client should transfer the phone call connected to
   * this agent to a third-party endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ResponseMessage.TelephonyTransferCall telephony_transfer_call = 6;
   * </code>
   *
   * @return Whether the telephonyTransferCall field is set.
   */
  boolean hasTelephonyTransferCall();
  /**
   *
   *
   * <pre>
   * A signal that the client should transfer the phone call connected to
   * this agent to a third-party endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ResponseMessage.TelephonyTransferCall telephony_transfer_call = 6;
   * </code>
   *
   * @return The telephonyTransferCall.
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.TelephonyTransferCall
      getTelephonyTransferCall();
  /**
   *
   *
   * <pre>
   * A signal that the client should transfer the phone call connected to
   * this agent to a third-party endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ResponseMessage.TelephonyTransferCall telephony_transfer_call = 6;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage.TelephonyTransferCallOrBuilder
      getTelephonyTransferCallOrBuilder();

  public com.google.cloud.dialogflow.v2beta1.ResponseMessage.MessageCase getMessageCase();
}
