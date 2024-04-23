// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/contact_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public interface ContactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.Contact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier. The resource name of the Contact.
   * Format: `networks/{network_code}/contacts/{contact_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Identifier. The resource name of the Contact.
   * Format: `networks/{network_code}/contacts/{contact_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. `Contact` ID.
   * </pre>
   *
   * <code>int64 contact_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The contactId.
   */
  long getContactId();
}
