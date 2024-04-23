// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/ad_partner_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public interface AdPartnerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.AdPartner)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier. The resource name of the AdPartner.
   * Format: `networks/{network_code}/adPartners/{ad_partner_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Identifier. The resource name of the AdPartner.
   * Format: `networks/{network_code}/adPartners/{ad_partner_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
