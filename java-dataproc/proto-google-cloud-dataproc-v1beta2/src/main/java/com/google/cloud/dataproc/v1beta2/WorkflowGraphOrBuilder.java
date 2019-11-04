/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface WorkflowGraphOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.WorkflowGraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1beta2.WorkflowNode> getNodesList();
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.WorkflowNode getNodes(int index);
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getNodesCount();
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder>
      getNodesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder getNodesOrBuilder(int index);
}
