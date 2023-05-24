// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface ListDeliveryPipelinesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.ListDeliveryPipelinesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The `DeliveryPipeline` objects.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.DeliveryPipeline delivery_pipelines = 1;</code>
   */
  java.util.List<com.google.cloud.deploy.v1.DeliveryPipeline> 
      getDeliveryPipelinesList();
  /**
   * <pre>
   * The `DeliveryPipeline` objects.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.DeliveryPipeline delivery_pipelines = 1;</code>
   */
  com.google.cloud.deploy.v1.DeliveryPipeline getDeliveryPipelines(int index);
  /**
   * <pre>
   * The `DeliveryPipeline` objects.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.DeliveryPipeline delivery_pipelines = 1;</code>
   */
  int getDeliveryPipelinesCount();
  /**
   * <pre>
   * The `DeliveryPipeline` objects.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.DeliveryPipeline delivery_pipelines = 1;</code>
   */
  java.util.List<? extends com.google.cloud.deploy.v1.DeliveryPipelineOrBuilder> 
      getDeliveryPipelinesOrBuilderList();
  /**
   * <pre>
   * The `DeliveryPipeline` objects.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.DeliveryPipeline delivery_pipelines = 1;</code>
   */
  com.google.cloud.deploy.v1.DeliveryPipelineOrBuilder getDeliveryPipelinesOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
