// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface GatewayAPIConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.GatewayAPIConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Gateway API release channel to use for Gateway API.
   * </pre>
   *
   * <code>.google.container.v1beta1.GatewayAPIConfig.Channel channel = 1;</code>
   * @return The enum numeric value on the wire for channel.
   */
  int getChannelValue();
  /**
   * <pre>
   * The Gateway API release channel to use for Gateway API.
   * </pre>
   *
   * <code>.google.container.v1beta1.GatewayAPIConfig.Channel channel = 1;</code>
   * @return The channel.
   */
  com.google.container.v1beta1.GatewayAPIConfig.Channel getChannel();
}
