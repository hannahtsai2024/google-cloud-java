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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

public interface MultiEntityRenameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.MultiEntityRename)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The pattern used to generate the new entity's name. This pattern
   * must include the characters '{name}', which will be replaced with the name
   * of the original entity. For example, the pattern 't_{name}' for an entity
   * name jobs would be converted to 't_jobs'.
   *
   * If unspecified, the default value for this field is '{name}'
   * </pre>
   *
   * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The newNamePattern.
   */
  java.lang.String getNewNamePattern();
  /**
   *
   *
   * <pre>
   * Optional. The pattern used to generate the new entity's name. This pattern
   * must include the characters '{name}', which will be replaced with the name
   * of the original entity. For example, the pattern 't_{name}' for an entity
   * name jobs would be converted to 't_jobs'.
   *
   * If unspecified, the default value for this field is '{name}'
   * </pre>
   *
   * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for newNamePattern.
   */
  com.google.protobuf.ByteString getNewNamePatternBytes();

  /**
   *
   *
   * <pre>
   * Optional. Additional transformation that can be done on the source entity
   * name before it is being used by the new_name_pattern, for example lower
   * case. If no transformation is desired, use NO_TRANSFORMATION
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for sourceNameTransformation.
   */
  int getSourceNameTransformationValue();
  /**
   *
   *
   * <pre>
   * Optional. Additional transformation that can be done on the source entity
   * name before it is being used by the new_name_pattern, for example lower
   * case. If no transformation is desired, use NO_TRANSFORMATION
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sourceNameTransformation.
   */
  com.google.cloud.clouddms.v1.EntityNameTransformation getSourceNameTransformation();
}
