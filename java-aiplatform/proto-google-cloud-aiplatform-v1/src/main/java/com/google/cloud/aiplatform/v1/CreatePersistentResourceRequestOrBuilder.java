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
// source: google/cloud/aiplatform/v1/persistent_resource_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface CreatePersistentResourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreatePersistentResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * PersistentResource in. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * PersistentResource in. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The PersistentResource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PersistentResource persistent_resource = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the persistentResource field is set.
   */
  boolean hasPersistentResource();
  /**
   *
   *
   * <pre>
   * Required. The PersistentResource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PersistentResource persistent_resource = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The persistentResource.
   */
  com.google.cloud.aiplatform.v1.PersistentResource getPersistentResource();
  /**
   *
   *
   * <pre>
   * Required. The PersistentResource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PersistentResource persistent_resource = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.PersistentResourceOrBuilder getPersistentResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the PersistentResource, which become the final
   * component of the PersistentResource's resource name.
   *
   * The maximum length is 63 characters, and valid characters
   * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
   * </pre>
   *
   * <code>string persistent_resource_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The persistentResourceId.
   */
  java.lang.String getPersistentResourceId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the PersistentResource, which become the final
   * component of the PersistentResource's resource name.
   *
   * The maximum length is 63 characters, and valid characters
   * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
   * </pre>
   *
   * <code>string persistent_resource_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for persistentResourceId.
   */
  com.google.protobuf.ByteString getPersistentResourceIdBytes();
}
