/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/channel/v1/customers.proto

package com.google.cloud.channel.v1;

public interface CustomerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Customer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the customer.
   * Format: accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the customer.
   * Format: accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Name of the organization that the customer entity represents.
   * </pre>
   *
   * <code>string org_display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The orgDisplayName.
   */
  java.lang.String getOrgDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Name of the organization that the customer entity represents.
   * </pre>
   *
   * <code>string org_display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for orgDisplayName.
   */
  com.google.protobuf.ByteString getOrgDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The organization address for the customer. To enforce US laws and
   * embargoes, we require a region, postal code, and address lines. You must
   * provide valid addresses for every customer. To set the customer's
   * language, use the Customer-level language code.
   * </pre>
   *
   * <code>
   * .google.type.PostalAddress org_postal_address = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the orgPostalAddress field is set.
   */
  boolean hasOrgPostalAddress();
  /**
   *
   *
   * <pre>
   * Required. The organization address for the customer. To enforce US laws and
   * embargoes, we require a region, postal code, and address lines. You must
   * provide valid addresses for every customer. To set the customer's
   * language, use the Customer-level language code.
   * </pre>
   *
   * <code>
   * .google.type.PostalAddress org_postal_address = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The orgPostalAddress.
   */
  com.google.type.PostalAddress getOrgPostalAddress();
  /**
   *
   *
   * <pre>
   * Required. The organization address for the customer. To enforce US laws and
   * embargoes, we require a region, postal code, and address lines. You must
   * provide valid addresses for every customer. To set the customer's
   * language, use the Customer-level language code.
   * </pre>
   *
   * <code>
   * .google.type.PostalAddress org_postal_address = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.type.PostalAddressOrBuilder getOrgPostalAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * Primary contact info.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ContactInfo primary_contact_info = 4;</code>
   *
   * @return Whether the primaryContactInfo field is set.
   */
  boolean hasPrimaryContactInfo();
  /**
   *
   *
   * <pre>
   * Primary contact info.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ContactInfo primary_contact_info = 4;</code>
   *
   * @return The primaryContactInfo.
   */
  com.google.cloud.channel.v1.ContactInfo getPrimaryContactInfo();
  /**
   *
   *
   * <pre>
   * Primary contact info.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ContactInfo primary_contact_info = 4;</code>
   */
  com.google.cloud.channel.v1.ContactInfoOrBuilder getPrimaryContactInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Secondary contact email. You need to provide an alternate email to create
   * different domains if a primary contact email already exists. Users will
   * receive a notification with credentials when you create an admin.google.com
   * account. Secondary emails are also recovery email addresses. Alternate
   * emails are optional when you create Team customers.
   * </pre>
   *
   * <code>string alternate_email = 5;</code>
   *
   * @return The alternateEmail.
   */
  java.lang.String getAlternateEmail();
  /**
   *
   *
   * <pre>
   * Secondary contact email. You need to provide an alternate email to create
   * different domains if a primary contact email already exists. Users will
   * receive a notification with credentials when you create an admin.google.com
   * account. Secondary emails are also recovery email addresses. Alternate
   * emails are optional when you create Team customers.
   * </pre>
   *
   * <code>string alternate_email = 5;</code>
   *
   * @return The bytes for alternateEmail.
   */
  com.google.protobuf.ByteString getAlternateEmailBytes();

  /**
   *
   *
   * <pre>
   * Required. The customer's primary domain. Must match the primary contact
   * email's domain.
   * </pre>
   *
   * <code>string domain = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   *
   *
   * <pre>
   * Required. The customer's primary domain. Must match the primary contact
   * email's domain.
   * </pre>
   *
   * <code>string domain = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when the customer was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the customer was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the customer was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the customer was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the customer was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the customer was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The customer's Cloud Identity ID if the customer has a Cloud
   * Identity resource.
   * </pre>
   *
   * <code>string cloud_identity_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The cloudIdentityId.
   */
  java.lang.String getCloudIdentityId();
  /**
   *
   *
   * <pre>
   * Output only. The customer's Cloud Identity ID if the customer has a Cloud
   * Identity resource.
   * </pre>
   *
   * <code>string cloud_identity_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for cloudIdentityId.
   */
  com.google.protobuf.ByteString getCloudIdentityIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Cloud Identity information for the customer.
   * Populated only if a Cloud Identity account exists for this customer.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.CloudIdentityInfo cloud_identity_info = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the cloudIdentityInfo field is set.
   */
  boolean hasCloudIdentityInfo();
  /**
   *
   *
   * <pre>
   * Output only. Cloud Identity information for the customer.
   * Populated only if a Cloud Identity account exists for this customer.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.CloudIdentityInfo cloud_identity_info = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The cloudIdentityInfo.
   */
  com.google.cloud.channel.v1.CloudIdentityInfo getCloudIdentityInfo();
  /**
   *
   *
   * <pre>
   * Output only. Cloud Identity information for the customer.
   * Populated only if a Cloud Identity account exists for this customer.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.CloudIdentityInfo cloud_identity_info = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.channel.v1.CloudIdentityInfoOrBuilder getCloudIdentityInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Identity ID of the customer's channel partner.
   * Populated only if a channel partner exists for this customer.
   * </pre>
   *
   * <code>string channel_partner_id = 13;</code>
   *
   * @return The channelPartnerId.
   */
  java.lang.String getChannelPartnerId();
  /**
   *
   *
   * <pre>
   * Cloud Identity ID of the customer's channel partner.
   * Populated only if a channel partner exists for this customer.
   * </pre>
   *
   * <code>string channel_partner_id = 13;</code>
   *
   * @return The bytes for channelPartnerId.
   */
  com.google.protobuf.ByteString getChannelPartnerIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. External CRM ID for the customer.
   * Populated only if a CRM ID exists for this customer.
   * </pre>
   *
   * <code>string correlation_id = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The correlationId.
   */
  java.lang.String getCorrelationId();
  /**
   *
   *
   * <pre>
   * Optional. External CRM ID for the customer.
   * Populated only if a CRM ID exists for this customer.
   * </pre>
   *
   * <code>string correlation_id = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for correlationId.
   */
  com.google.protobuf.ByteString getCorrelationIdBytes();
}
