// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/document.proto

package com.google.cloud.dialogflow.v2;

public interface ListDocumentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ListDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The knowledge base to list all documents for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The knowledge base to list all documents for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of items to return in a single page. By
   * default 10 and at most 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The filter expression used to filter documents returned by the list method.
   * The expression has the following syntax:
   *
   *   &lt;field&gt; &lt;operator&gt; &lt;value&gt; [AND &lt;field&gt; &lt;operator&gt; &lt;value&gt;] ...
   *
   * The following fields and operators are supported:
   *
   * * knowledge_types with has(:) operator
   * * display_name with has(:) operator
   * * state with equals(=) operator
   *
   * Examples:
   *
   * * "knowledge_types:FAQ" matches documents with FAQ knowledge type.
   * * "display_name:customer" matches documents whose display name contains
   *   "customer".
   * * "state=ACTIVE" matches documents with ACTIVE state.
   * * "knowledge_types:FAQ AND state=ACTIVE" matches all active FAQ documents.
   *
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The filter expression used to filter documents returned by the list method.
   * The expression has the following syntax:
   *
   *   &lt;field&gt; &lt;operator&gt; &lt;value&gt; [AND &lt;field&gt; &lt;operator&gt; &lt;value&gt;] ...
   *
   * The following fields and operators are supported:
   *
   * * knowledge_types with has(:) operator
   * * display_name with has(:) operator
   * * state with equals(=) operator
   *
   * Examples:
   *
   * * "knowledge_types:FAQ" matches documents with FAQ knowledge type.
   * * "display_name:customer" matches documents whose display name contains
   *   "customer".
   * * "state=ACTIVE" matches documents with ACTIVE state.
   * * "knowledge_types:FAQ AND state=ACTIVE" matches all active FAQ documents.
   *
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
