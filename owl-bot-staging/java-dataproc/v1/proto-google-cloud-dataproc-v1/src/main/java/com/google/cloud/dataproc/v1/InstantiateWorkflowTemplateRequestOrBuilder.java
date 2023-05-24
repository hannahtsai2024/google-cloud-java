// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface InstantiateWorkflowTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.InstantiateWorkflowTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.workflowTemplates.instantiate`, the resource name
   * of the template has the following format:
   *   `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *
   * * For `projects.locations.workflowTemplates.instantiate`, the resource name
   *   of the template has the following format:
   *   `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.workflowTemplates.instantiate`, the resource name
   * of the template has the following format:
   *   `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *
   * * For `projects.locations.workflowTemplates.instantiate`, the resource name
   *   of the template has the following format:
   *   `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The version of workflow template to instantiate. If specified,
   * the workflow will be instantiated only if the current version of
   * the workflow template has the supplied version.
   *
   * This option cannot be used to instantiate a previous version of
   * workflow template.
   * </pre>
   *
   * <code>int32 version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   *
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   *
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   *
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   *
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Optional. Map from parameter names to values that should be used for those
   * parameters. Values may not exceed 1000 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * Optional. Map from parameter names to values that should be used for those
   * parameters. Values may not exceed 1000 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getParameters();
  /**
   * <pre>
   * Optional. Map from parameter names to values that should be used for those
   * parameters. Values may not exceed 1000 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getParametersMap();
  /**
   * <pre>
   * Optional. Map from parameter names to values that should be used for those
   * parameters. Values may not exceed 1000 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getParametersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Map from parameter names to values that should be used for those
   * parameters. Values may not exceed 1000 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getParametersOrThrow(
      java.lang.String key);
}
