// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface MysqlSourceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.MysqlSourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
   * @return Whether the includeObjects field is set.
   */
  boolean hasIncludeObjects();
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
   * @return The includeObjects.
   */
  com.google.cloud.datastream.v1.MysqlRdbms getIncludeObjects();
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
   */
  com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getIncludeObjectsOrBuilder();

  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
   * @return Whether the excludeObjects field is set.
   */
  boolean hasExcludeObjects();
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
   * @return The excludeObjects.
   */
  com.google.cloud.datastream.v1.MysqlRdbms getExcludeObjects();
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
   */
  com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getExcludeObjectsOrBuilder();

  /**
   * <pre>
   * Maximum number of concurrent CDC tasks. The number should be non negative.
   * If not set (or set to 0), the system's default value will be used.
   * </pre>
   *
   * <code>int32 max_concurrent_cdc_tasks = 3;</code>
   * @return The maxConcurrentCdcTasks.
   */
  int getMaxConcurrentCdcTasks();

  /**
   * <pre>
   * Maximum number of concurrent backfill tasks. The number should be non
   * negative. If not set (or set to 0), the system's default value will be
   * used.
   * </pre>
   *
   * <code>int32 max_concurrent_backfill_tasks = 4;</code>
   * @return The maxConcurrentBackfillTasks.
   */
  int getMaxConcurrentBackfillTasks();
}
