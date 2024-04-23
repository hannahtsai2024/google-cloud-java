// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/team_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public interface GetTeamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.GetTeamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Team.
   * Format: `networks/{network_code}/teams/{team_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the Team.
   * Format: `networks/{network_code}/teams/{team_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
