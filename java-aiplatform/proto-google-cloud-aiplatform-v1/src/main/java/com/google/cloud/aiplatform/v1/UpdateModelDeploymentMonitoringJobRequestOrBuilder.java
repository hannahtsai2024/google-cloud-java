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
// source: google/cloud/aiplatform/v1/job_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface UpdateModelDeploymentMonitoringJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.UpdateModelDeploymentMonitoringJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The model monitoring configuration which replaces the resource on
   * the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the modelDeploymentMonitoringJob field is set.
   */
  boolean hasModelDeploymentMonitoringJob();
  /**
   *
   *
   * <pre>
   * Required. The model monitoring configuration which replaces the resource on
   * the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The modelDeploymentMonitoringJob.
   */
  com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob getModelDeploymentMonitoringJob();
  /**
   *
   *
   * <pre>
   * Required. The model monitoring configuration which replaces the resource on
   * the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder
      getModelDeploymentMonitoringJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask is used to specify the fields to be overwritten
   * in the ModelDeploymentMonitoringJob resource by the update. The fields
   * specified in the update_mask are relative to the resource, not the full
   * request. A field will be overwritten if it is in the mask. If the user does
   * not provide a mask then only the non-empty fields present in the request
   * will be overwritten. Set the update_mask to `*` to override all fields. For
   * the objective config, the user can either provide the update mask for
   * model_deployment_monitoring_objective_configs or any combination of its
   * nested fields, such as:
   * model_deployment_monitoring_objective_configs.objective_config.training_dataset.
   *
   * Updatable fields:
   *
   *   * `display_name`
   *   * `model_deployment_monitoring_schedule_config`
   *   * `model_monitoring_alert_config`
   *   * `logging_sampling_strategy`
   *   * `labels`
   *   * `log_ttl`
   *   * `enable_monitoring_pipeline_logs`
   * .  and
   *   * `model_deployment_monitoring_objective_configs`
   * .  or
   *   * `model_deployment_monitoring_objective_configs.objective_config.training_dataset`
   *   * `model_deployment_monitoring_objective_configs.objective_config.training_prediction_skew_detection_config`
   *   * `model_deployment_monitoring_objective_configs.objective_config.prediction_drift_detection_config`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask is used to specify the fields to be overwritten
   * in the ModelDeploymentMonitoringJob resource by the update. The fields
   * specified in the update_mask are relative to the resource, not the full
   * request. A field will be overwritten if it is in the mask. If the user does
   * not provide a mask then only the non-empty fields present in the request
   * will be overwritten. Set the update_mask to `*` to override all fields. For
   * the objective config, the user can either provide the update mask for
   * model_deployment_monitoring_objective_configs or any combination of its
   * nested fields, such as:
   * model_deployment_monitoring_objective_configs.objective_config.training_dataset.
   *
   * Updatable fields:
   *
   *   * `display_name`
   *   * `model_deployment_monitoring_schedule_config`
   *   * `model_monitoring_alert_config`
   *   * `logging_sampling_strategy`
   *   * `labels`
   *   * `log_ttl`
   *   * `enable_monitoring_pipeline_logs`
   * .  and
   *   * `model_deployment_monitoring_objective_configs`
   * .  or
   *   * `model_deployment_monitoring_objective_configs.objective_config.training_dataset`
   *   * `model_deployment_monitoring_objective_configs.objective_config.training_prediction_skew_detection_config`
   *   * `model_deployment_monitoring_objective_configs.objective_config.prediction_drift_detection_config`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask is used to specify the fields to be overwritten
   * in the ModelDeploymentMonitoringJob resource by the update. The fields
   * specified in the update_mask are relative to the resource, not the full
   * request. A field will be overwritten if it is in the mask. If the user does
   * not provide a mask then only the non-empty fields present in the request
   * will be overwritten. Set the update_mask to `*` to override all fields. For
   * the objective config, the user can either provide the update mask for
   * model_deployment_monitoring_objective_configs or any combination of its
   * nested fields, such as:
   * model_deployment_monitoring_objective_configs.objective_config.training_dataset.
   *
   * Updatable fields:
   *
   *   * `display_name`
   *   * `model_deployment_monitoring_schedule_config`
   *   * `model_monitoring_alert_config`
   *   * `logging_sampling_strategy`
   *   * `labels`
   *   * `log_ttl`
   *   * `enable_monitoring_pipeline_logs`
   * .  and
   *   * `model_deployment_monitoring_objective_configs`
   * .  or
   *   * `model_deployment_monitoring_objective_configs.objective_config.training_dataset`
   *   * `model_deployment_monitoring_objective_configs.objective_config.training_prediction_skew_detection_config`
   *   * `model_deployment_monitoring_objective_configs.objective_config.prediction_drift_detection_config`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
