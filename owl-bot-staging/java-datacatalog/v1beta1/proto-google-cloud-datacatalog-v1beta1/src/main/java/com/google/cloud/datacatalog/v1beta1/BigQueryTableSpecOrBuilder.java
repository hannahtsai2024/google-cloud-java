// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

package com.google.cloud.datacatalog.v1beta1;

public interface BigQueryTableSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The table source type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for tableSourceType.
   */
  int getTableSourceTypeValue();
  /**
   * <pre>
   * Output only. The table source type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The tableSourceType.
   */
  com.google.cloud.datacatalog.v1beta1.TableSourceType getTableSourceType();

  /**
   * <pre>
   * Table view specification. This field should only be populated if
   * `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   * @return Whether the viewSpec field is set.
   */
  boolean hasViewSpec();
  /**
   * <pre>
   * Table view specification. This field should only be populated if
   * `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   * @return The viewSpec.
   */
  com.google.cloud.datacatalog.v1beta1.ViewSpec getViewSpec();
  /**
   * <pre>
   * Table view specification. This field should only be populated if
   * `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   */
  com.google.cloud.datacatalog.v1beta1.ViewSpecOrBuilder getViewSpecOrBuilder();

  /**
   * <pre>
   * Spec of a BigQuery table. This field should only be populated if
   * `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
   * @return Whether the tableSpec field is set.
   */
  boolean hasTableSpec();
  /**
   * <pre>
   * Spec of a BigQuery table. This field should only be populated if
   * `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
   * @return The tableSpec.
   */
  com.google.cloud.datacatalog.v1beta1.TableSpec getTableSpec();
  /**
   * <pre>
   * Spec of a BigQuery table. This field should only be populated if
   * `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
   */
  com.google.cloud.datacatalog.v1beta1.TableSpecOrBuilder getTableSpecOrBuilder();

  com.google.cloud.datacatalog.v1beta1.BigQueryTableSpec.TypeSpecCase getTypeSpecCase();
}
