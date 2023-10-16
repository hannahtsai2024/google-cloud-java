/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface GenericInsightOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.GenericInsight)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Represents a globally unique message id for
   * this insight, can be used for localization purposes, in case message_code
   * is not yet known by the client use default_message instead.
   * </pre>
   *
   * <code>int64 message_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The messageId.
   */
  long getMessageId();

  /**
   *
   *
   * <pre>
   * Output only. In case message_code is not yet known by the client
   * default_message will be the message to be used instead.
   * </pre>
   *
   * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The defaultMessage.
   */
  java.lang.String getDefaultMessage();
  /**
   *
   *
   * <pre>
   * Output only. In case message_code is not yet known by the client
   * default_message will be the message to be used instead.
   * </pre>
   *
   * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for defaultMessage.
   */
  com.google.protobuf.ByteString getDefaultMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the additionalInformation.
   */
  java.util.List<java.lang.String> getAdditionalInformationList();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of additionalInformation.
   */
  int getAdditionalInformationCount();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The additionalInformation at the given index.
   */
  java.lang.String getAdditionalInformation(int index);
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the additionalInformation at the given index.
   */
  com.google.protobuf.ByteString getAdditionalInformationBytes(int index);
}
