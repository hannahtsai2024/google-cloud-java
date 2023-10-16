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
// source: google/analytics/data/v1beta/data.proto

package com.google.analytics.data.v1beta;

public interface PivotOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.Pivot)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @return A list containing the fieldNames.
   */
  java.util.List<java.lang.String> getFieldNamesList();
  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @return The count of fieldNames.
   */
  int getFieldNamesCount();
  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The fieldNames at the given index.
   */
  java.lang.String getFieldNames(int index);
  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the fieldNames at the given index.
   */
  com.google.protobuf.ByteString getFieldNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.OrderBy> getOrderBysList();
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 2;</code>
   */
  com.google.analytics.data.v1beta.OrderBy getOrderBys(int index);
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 2;</code>
   */
  int getOrderBysCount();
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.OrderByOrBuilder>
      getOrderBysOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 2;</code>
   */
  com.google.analytics.data.v1beta.OrderByOrBuilder getOrderBysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The row count of the start row. The first row is counted as row 0.
   * </pre>
   *
   * <code>int64 offset = 3;</code>
   *
   * @return The offset.
   */
  long getOffset();

  /**
   *
   *
   * <pre>
   * The number of unique combinations of dimension values to return in this
   * pivot. The `limit` parameter is required. A `limit` of 10,000 is common for
   * single pivot requests.
   *
   * The product of the `limit` for each `pivot` in a `RunPivotReportRequest`
   * must not exceed 250,000. For example, a two pivot request with `limit:
   * 1000` in each pivot will fail because the product is `1,000,000`.
   * </pre>
   *
   * <code>int64 limit = 4;</code>
   *
   * @return The limit.
   */
  long getLimit();

  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 5;</code>
   *
   * @return A list containing the metricAggregations.
   */
  java.util.List<com.google.analytics.data.v1beta.MetricAggregation> getMetricAggregationsList();
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 5;</code>
   *
   * @return The count of metricAggregations.
   */
  int getMetricAggregationsCount();
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The metricAggregations at the given index.
   */
  com.google.analytics.data.v1beta.MetricAggregation getMetricAggregations(int index);
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for metricAggregations.
   */
  java.util.List<java.lang.Integer> getMetricAggregationsValueList();
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of metricAggregations at the given index.
   */
  int getMetricAggregationsValue(int index);
}
