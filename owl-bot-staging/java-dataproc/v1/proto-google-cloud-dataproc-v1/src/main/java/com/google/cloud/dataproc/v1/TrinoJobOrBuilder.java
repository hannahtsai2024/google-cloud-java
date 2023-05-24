// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface TrinoJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.TrinoJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The HCFS URI of the script that contains SQL queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   * @return Whether the queryFileUri field is set.
   */
  boolean hasQueryFileUri();
  /**
   * <pre>
   * The HCFS URI of the script that contains SQL queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   * @return The queryFileUri.
   */
  java.lang.String getQueryFileUri();
  /**
   * <pre>
   * The HCFS URI of the script that contains SQL queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   * @return The bytes for queryFileUri.
   */
  com.google.protobuf.ByteString
      getQueryFileUriBytes();

  /**
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   * @return Whether the queryList field is set.
   */
  boolean hasQueryList();
  /**
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   * @return The queryList.
   */
  com.google.cloud.dataproc.v1.QueryList getQueryList();
  /**
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   */
  com.google.cloud.dataproc.v1.QueryListOrBuilder getQueryListOrBuilder();

  /**
   * <pre>
   * Optional. Whether to continue executing queries if a query fails.
   * The default value is `false`. Setting to `true` can be useful when
   * executing independent parallel queries.
   * </pre>
   *
   * <code>bool continue_on_failure = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The continueOnFailure.
   */
  boolean getContinueOnFailure();

  /**
   * <pre>
   * Optional. The format in which query output will be displayed. See the
   * Trino documentation for supported output formats
   * </pre>
   *
   * <code>string output_format = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The outputFormat.
   */
  java.lang.String getOutputFormat();
  /**
   * <pre>
   * Optional. The format in which query output will be displayed. See the
   * Trino documentation for supported output formats
   * </pre>
   *
   * <code>string output_format = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for outputFormat.
   */
  com.google.protobuf.ByteString
      getOutputFormatBytes();

  /**
   * <pre>
   * Optional. Trino client tags to attach to this query
   * </pre>
   *
   * <code>repeated string client_tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the clientTags.
   */
  java.util.List<java.lang.String>
      getClientTagsList();
  /**
   * <pre>
   * Optional. Trino client tags to attach to this query
   * </pre>
   *
   * <code>repeated string client_tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of clientTags.
   */
  int getClientTagsCount();
  /**
   * <pre>
   * Optional. Trino client tags to attach to this query
   * </pre>
   *
   * <code>repeated string client_tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The clientTags at the given index.
   */
  java.lang.String getClientTags(int index);
  /**
   * <pre>
   * Optional. Trino client tags to attach to this query
   * </pre>
   *
   * <code>repeated string client_tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the clientTags at the given index.
   */
  com.google.protobuf.ByteString
      getClientTagsBytes(int index);

  /**
   * <pre>
   * Optional. A mapping of property names to values. Used to set Trino
   * [session properties](https://trino.io/docs/current/sql/set-session.html)
   * Equivalent to using the --session flag in the Trino CLI
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Optional. A mapping of property names to values. Used to set Trino
   * [session properties](https://trino.io/docs/current/sql/set-session.html)
   * Equivalent to using the --session flag in the Trino CLI
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProperties();
  /**
   * <pre>
   * Optional. A mapping of property names to values. Used to set Trino
   * [session properties](https://trino.io/docs/current/sql/set-session.html)
   * Equivalent to using the --session flag in the Trino CLI
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPropertiesMap();
  /**
   * <pre>
   * Optional. A mapping of property names to values. Used to set Trino
   * [session properties](https://trino.io/docs/current/sql/set-session.html)
   * Equivalent to using the --session flag in the Trino CLI
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. A mapping of property names to values. Used to set Trino
   * [session properties](https://trino.io/docs/current/sql/set-session.html)
   * Equivalent to using the --session flag in the Trino CLI
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getPropertiesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the loggingConfig field is set.
   */
  boolean hasLoggingConfig();
  /**
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The loggingConfig.
   */
  com.google.cloud.dataproc.v1.LoggingConfig getLoggingConfig();
  /**
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.LoggingConfigOrBuilder getLoggingConfigOrBuilder();

  com.google.cloud.dataproc.v1.TrinoJob.QueriesCase getQueriesCase();
}
