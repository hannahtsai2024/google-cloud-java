// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface CloudRunMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CloudRunMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`. Format is
   * projects/{project}/locations/{location}/services/{service}.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`. Format is
   * projects/{project}/locations/{location}/services/{service}.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the serviceUrls.
   */
  java.util.List<java.lang.String>
      getServiceUrlsList();
  /**
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of serviceUrls.
   */
  int getServiceUrlsCount();
  /**
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The serviceUrls at the given index.
   */
  java.lang.String getServiceUrls(int index);
  /**
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the serviceUrls at the given index.
   */
  com.google.protobuf.ByteString
      getServiceUrlsBytes(int index);

  /**
   * <pre>
   * Output only. The Cloud Run Revision id associated with a `Rollout`.
   * </pre>
   *
   * <code>string revision = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   * <pre>
   * Output only. The Cloud Run Revision id associated with a `Rollout`.
   * </pre>
   *
   * <code>string revision = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString
      getRevisionBytes();
}
