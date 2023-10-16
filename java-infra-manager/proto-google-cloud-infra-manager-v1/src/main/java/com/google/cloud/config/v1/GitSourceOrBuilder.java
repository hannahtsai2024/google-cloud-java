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
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

public interface GitSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.GitSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Repository URL.
   * Example: 'https://github.com/kubernetes/examples.git'
   * </pre>
   *
   * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the repo field is set.
   */
  boolean hasRepo();
  /**
   *
   *
   * <pre>
   * Optional. Repository URL.
   * Example: 'https://github.com/kubernetes/examples.git'
   * </pre>
   *
   * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The repo.
   */
  java.lang.String getRepo();
  /**
   *
   *
   * <pre>
   * Optional. Repository URL.
   * Example: 'https://github.com/kubernetes/examples.git'
   * </pre>
   *
   * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for repo.
   */
  com.google.protobuf.ByteString getRepoBytes();

  /**
   *
   *
   * <pre>
   * Optional. Subdirectory inside the repository.
   * Example: 'staging/my-package'
   * </pre>
   *
   * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the directory field is set.
   */
  boolean hasDirectory();
  /**
   *
   *
   * <pre>
   * Optional. Subdirectory inside the repository.
   * Example: 'staging/my-package'
   * </pre>
   *
   * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The directory.
   */
  java.lang.String getDirectory();
  /**
   *
   *
   * <pre>
   * Optional. Subdirectory inside the repository.
   * Example: 'staging/my-package'
   * </pre>
   *
   * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for directory.
   */
  com.google.protobuf.ByteString getDirectoryBytes();

  /**
   *
   *
   * <pre>
   * Optional. Git reference (e.g. branch or tag).
   * </pre>
   *
   * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the ref field is set.
   */
  boolean hasRef();
  /**
   *
   *
   * <pre>
   * Optional. Git reference (e.g. branch or tag).
   * </pre>
   *
   * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ref.
   */
  java.lang.String getRef();
  /**
   *
   *
   * <pre>
   * Optional. Git reference (e.g. branch or tag).
   * </pre>
   *
   * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for ref.
   */
  com.google.protobuf.ByteString getRefBytes();
}
