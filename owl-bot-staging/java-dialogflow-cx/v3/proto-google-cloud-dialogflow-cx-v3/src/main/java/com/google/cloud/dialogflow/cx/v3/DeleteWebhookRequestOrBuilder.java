// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/webhook.proto

package com.google.cloud.dialogflow.cx.v3;

public interface DeleteWebhookRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.DeleteWebhookRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the webhook to delete.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/webhooks/&lt;Webhook ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the webhook to delete.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/webhooks/&lt;Webhook ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This field has no effect for webhook not being used.
   * For webhooks that are used by pages/flows/transition route groups:
   *
   * *  If `force` is set to false, an error will be returned with message
   *    indicating the referenced resources.
   * *  If `force` is set to true, Dialogflow will remove the webhook, as well
   *    as any references to the webhook (i.e.
   *    [Webhook][google.cloud.dialogflow.cx.v3.Fulfillment.webhook] and
   *    [tag][google.cloud.dialogflow.cx.v3.Fulfillment.tag]in fulfillments that
   *    point to this webhook will be removed).
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
