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
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public interface BatchDeleteJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.BatchDeleteJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
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
   * Required. The resource name of the tenant under which the job is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
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
   * Required. The filter string specifies the jobs to be deleted.
   *
   * Supported operator: =, AND
   *
   * The fields eligible for filtering are:
   *
   * * `companyName` (Required)
   * * `requisitionId` (Required)
   *
   * Sample Query: companyName = "projects/foo/companies/bar" AND
   * requisitionId = "req-1"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Required. The filter string specifies the jobs to be deleted.
   *
   * Supported operator: =, AND
   *
   * The fields eligible for filtering are:
   *
   * * `companyName` (Required)
   * * `requisitionId` (Required)
   *
   * Sample Query: companyName = "projects/foo/companies/bar" AND
   * requisitionId = "req-1"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
