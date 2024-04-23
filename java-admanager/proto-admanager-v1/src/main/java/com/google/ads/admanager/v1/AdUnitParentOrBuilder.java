// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/ad_unit_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public interface AdUnitParentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.AdUnitParent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The parent of the current AdUnit
   * Format: `networks/{network_code}/adUnits/{ad_unit_id}`
   * </pre>
   *
   * <code>string parent_ad_unit = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The parentAdUnit.
   */
  java.lang.String getParentAdUnit();
  /**
   * <pre>
   * Output only. The parent of the current AdUnit
   * Format: `networks/{network_code}/adUnits/{ad_unit_id}`
   * </pre>
   *
   * <code>string parent_ad_unit = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parentAdUnit.
   */
  com.google.protobuf.ByteString
      getParentAdUnitBytes();

  /**
   * <pre>
   * Output only. The display name of the parent AdUnit.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Output only. The display name of the parent AdUnit.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. A string used to uniquely identify the ad unit for the
   * purposes of serving the ad.
   * </pre>
   *
   * <code>string ad_unit_code = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adUnitCode.
   */
  java.lang.String getAdUnitCode();
  /**
   * <pre>
   * Output only. A string used to uniquely identify the ad unit for the
   * purposes of serving the ad.
   * </pre>
   *
   * <code>string ad_unit_code = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for adUnitCode.
   */
  com.google.protobuf.ByteString
      getAdUnitCodeBytes();
}
