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
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface IntentSuggestionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.IntentSuggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The display name of the intent.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the intent.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The unique identifier of this
   * [intent][google.cloud.dialogflow.v2.Intent]. Format: `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string intent_v2 = 2;</code>
   *
   * @return Whether the intentV2 field is set.
   */
  boolean hasIntentV2();
  /**
   *
   *
   * <pre>
   * The unique identifier of this
   * [intent][google.cloud.dialogflow.v2.Intent]. Format: `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string intent_v2 = 2;</code>
   *
   * @return The intentV2.
   */
  java.lang.String getIntentV2();
  /**
   *
   *
   * <pre>
   * The unique identifier of this
   * [intent][google.cloud.dialogflow.v2.Intent]. Format: `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string intent_v2 = 2;</code>
   *
   * @return The bytes for intentV2.
   */
  com.google.protobuf.ByteString getIntentV2Bytes();

  /**
   *
   *
   * <pre>
   * Human readable description for better understanding an intent like its
   * scope, content, result etc. Maximum character limit: 140 characters.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Human readable description for better understanding an intent like its
   * scope, content, result etc. Maximum character limit: 140 characters.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  com.google.cloud.dialogflow.v2.IntentSuggestion.IntentCase getIntentCase();
}
