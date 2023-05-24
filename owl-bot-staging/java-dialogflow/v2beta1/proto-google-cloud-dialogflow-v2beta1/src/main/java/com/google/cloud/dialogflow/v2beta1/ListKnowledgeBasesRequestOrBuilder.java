// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListKnowledgeBasesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project to list of knowledge bases for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project to list of knowledge bases for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * The filter expression used to filter knowledge bases returned by the list
   * method. The expression has the following syntax:
   *
   *   &lt;field&gt; &lt;operator&gt; &lt;value&gt; [AND &lt;field&gt; &lt;operator&gt; &lt;value&gt;] ...
   *
   * The following fields and operators are supported:
   *
   * * display_name with has(:) operator
   * * language_code with equals(=) operator
   *
   * Examples:
   *
   * * 'language_code=en-us' matches knowledge bases with en-us language code.
   * * 'display_name:articles' matches knowledge bases whose display name
   *   contains "articles".
   * * 'display_name:"Best Articles"' matches knowledge bases whose display
   *   name contains "Best Articles".
   * * 'language_code=en-gb AND display_name=articles' matches all knowledge
   *   bases whose display name contains "articles" and whose language code is
   *   "en-gb".
   *
   * Note: An empty filter string (i.e. "") is a no-op and will result in no
   * filtering.
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
   * The filter expression used to filter knowledge bases returned by the list
   * method. The expression has the following syntax:
   *
   *   &lt;field&gt; &lt;operator&gt; &lt;value&gt; [AND &lt;field&gt; &lt;operator&gt; &lt;value&gt;] ...
   *
   * The following fields and operators are supported:
   *
   * * display_name with has(:) operator
   * * language_code with equals(=) operator
   *
   * Examples:
   *
   * * 'language_code=en-us' matches knowledge bases with en-us language code.
   * * 'display_name:articles' matches knowledge bases whose display name
   *   contains "articles".
   * * 'display_name:"Best Articles"' matches knowledge bases whose display
   *   name contains "Best Articles".
   * * 'language_code=en-gb AND display_name=articles' matches all knowledge
   *   bases whose display name contains "articles" and whose language code is
   *   "en-gb".
   *
   * Note: An empty filter string (i.e. "") is a no-op and will result in no
   * filtering.
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
