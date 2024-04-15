/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/discoveryengine/v1beta/conversational_search_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public interface AnswerQueryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.AnswerQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Answer resource object.
   * If [AnswerQueryRequest.StepSpec.max_step_count][] is greater than 1,
   * use [Answer.name][google.cloud.discoveryengine.v1beta.Answer.name] to fetch
   * answer information using
   * [ConversationalSearchService.GetAnswer][google.cloud.discoveryengine.v1beta.ConversationalSearchService.GetAnswer]
   * API.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Answer answer = 1;</code>
   *
   * @return Whether the answer field is set.
   */
  boolean hasAnswer();
  /**
   *
   *
   * <pre>
   * Answer resource object.
   * If [AnswerQueryRequest.StepSpec.max_step_count][] is greater than 1,
   * use [Answer.name][google.cloud.discoveryengine.v1beta.Answer.name] to fetch
   * answer information using
   * [ConversationalSearchService.GetAnswer][google.cloud.discoveryengine.v1beta.ConversationalSearchService.GetAnswer]
   * API.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Answer answer = 1;</code>
   *
   * @return The answer.
   */
  com.google.cloud.discoveryengine.v1beta.Answer getAnswer();
  /**
   *
   *
   * <pre>
   * Answer resource object.
   * If [AnswerQueryRequest.StepSpec.max_step_count][] is greater than 1,
   * use [Answer.name][google.cloud.discoveryengine.v1beta.Answer.name] to fetch
   * answer information using
   * [ConversationalSearchService.GetAnswer][google.cloud.discoveryengine.v1beta.ConversationalSearchService.GetAnswer]
   * API.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Answer answer = 1;</code>
   */
  com.google.cloud.discoveryengine.v1beta.AnswerOrBuilder getAnswerOrBuilder();

  /**
   *
   *
   * <pre>
   * Session resource object.
   * It will be only available when session field is set and valid in the
   * [AnswerQueryRequest][google.cloud.discoveryengine.v1beta.AnswerQueryRequest]
   * request.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Session session = 2;</code>
   *
   * @return Whether the session field is set.
   */
  boolean hasSession();
  /**
   *
   *
   * <pre>
   * Session resource object.
   * It will be only available when session field is set and valid in the
   * [AnswerQueryRequest][google.cloud.discoveryengine.v1beta.AnswerQueryRequest]
   * request.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Session session = 2;</code>
   *
   * @return The session.
   */
  com.google.cloud.discoveryengine.v1beta.Session getSession();
  /**
   *
   *
   * <pre>
   * Session resource object.
   * It will be only available when session field is set and valid in the
   * [AnswerQueryRequest][google.cloud.discoveryengine.v1beta.AnswerQueryRequest]
   * request.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Session session = 2;</code>
   */
  com.google.cloud.discoveryengine.v1beta.SessionOrBuilder getSessionOrBuilder();
}
