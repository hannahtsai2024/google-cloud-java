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
// source: google/cloud/dataplex/v1/data_quality.proto

package com.google.cloud.dataplex.v1;

public final class DataQualityProto {
  private DataQualityProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_BigQueryExport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_BigQueryExport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_BigQueryExportResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_BigQueryExportResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityDimension_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityDimension_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dataplex/v1/data_quality."
          + "proto\022\030google.cloud.dataplex.v1\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032)google/cloud/dataplex/v1/pr"
          + "ocessing.proto\"\223\003\n\017DataQualitySpec\022>\n\005ru"
          + "les\030\001 \003(\0132).google.cloud.dataplex.v1.Dat"
          + "aQualityRuleB\004\342A\001\002\022\036\n\020sampling_percent\030\004"
          + " \001(\002B\004\342A\001\001\022\030\n\nrow_filter\030\005 \001(\tB\004\342A\001\001\022Z\n\021"
          + "post_scan_actions\030\006 \001(\01329.google.cloud.d"
          + "ataplex.v1.DataQualitySpec.PostScanActio"
          + "nsB\004\342A\001\001\032\251\001\n\017PostScanActions\022g\n\017bigquery"
          + "_export\030\001 \001(\0132H.google.cloud.dataplex.v1"
          + ".DataQualitySpec.PostScanActions.BigQuer"
          + "yExportB\004\342A\001\001\032-\n\016BigQueryExport\022\033\n\rresul"
          + "ts_table\030\001 \001(\tB\004\342A\001\001\"\353\005\n\021DataQualityResu"
          + "lt\022\016\n\006passed\030\005 \001(\010\022H\n\ndimensions\030\002 \003(\01324"
          + ".google.cloud.dataplex.v1.DataQualityDim"
          + "ensionResult\022>\n\005rules\030\003 \003(\0132/.google.clo"
          + "ud.dataplex.v1.DataQualityRuleResult\022\021\n\t"
          + "row_count\030\004 \001(\003\022;\n\014scanned_data\030\007 \001(\0132%."
          + "google.cloud.dataplex.v1.ScannedData\022i\n\030"
          + "post_scan_actions_result\030\010 \001(\0132A.google."
          + "cloud.dataplex.v1.DataQualityResult.Post"
          + "ScanActionsResultB\004\342A\001\003\032\200\003\n\025PostScanActi"
          + "onsResult\022|\n\026bigquery_export_result\030\001 \001("
          + "\0132V.google.cloud.dataplex.v1.DataQuality"
          + "Result.PostScanActionsResult.BigQueryExp"
          + "ortResultB\004\342A\001\003\032\350\001\n\024BigQueryExportResult"
          + "\022q\n\005state\030\001 \001(\0162\\.google.cloud.dataplex."
          + "v1.DataQualityResult.PostScanActionsResu"
          + "lt.BigQueryExportResult.StateB\004\342A\001\003\022\025\n\007m"
          + "essage\030\002 \001(\tB\004\342A\001\003\"F\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n\006FAILED\020\002\022\013\n"
          + "\007SKIPPED\020\003\"\323\001\n\025DataQualityRuleResult\0227\n\004"
          + "rule\030\001 \001(\0132).google.cloud.dataplex.v1.Da"
          + "taQualityRule\022\016\n\006passed\030\007 \001(\010\022\027\n\017evaluat"
          + "ed_count\030\t \001(\003\022\024\n\014passed_count\030\010 \001(\003\022\022\n\n"
          + "null_count\030\005 \001(\003\022\022\n\npass_ratio\030\006 \001(\001\022\032\n\022"
          + "failing_rows_query\030\n \001(\t\"u\n\032DataQualityD"
          + "imensionResult\022G\n\tdimension\030\001 \001(\0132..goog"
          + "le.cloud.dataplex.v1.DataQualityDimensio"
          + "nB\004\342A\001\003\022\016\n\006passed\030\003 \001(\010\"$\n\024DataQualityDi"
          + "mension\022\014\n\004name\030\001 \001(\t\"\211\r\n\017DataQualityRul"
          + "e\022W\n\021range_expectation\030\001 \001(\0132:.google.cl"
          + "oud.dataplex.v1.DataQualityRule.RangeExp"
          + "ectationH\000\022\\\n\024non_null_expectation\030\002 \001(\013"
          + "2<.google.cloud.dataplex.v1.DataQualityR"
          + "ule.NonNullExpectationH\000\022S\n\017set_expectat"
          + "ion\030\003 \001(\01328.google.cloud.dataplex.v1.Dat"
          + "aQualityRule.SetExpectationH\000\022W\n\021regex_e"
          + "xpectation\030\004 \001(\0132:.google.cloud.dataplex"
          + ".v1.DataQualityRule.RegexExpectationH\000\022a"
          + "\n\026uniqueness_expectation\030d \001(\0132?.google."
          + "cloud.dataplex.v1.DataQualityRule.Unique"
          + "nessExpectationH\000\022j\n\033statistic_range_exp"
          + "ectation\030e \001(\0132C.google.cloud.dataplex.v"
          + "1.DataQualityRule.StatisticRangeExpectat"
          + "ionH\000\022g\n\031row_condition_expectation\030\310\001 \001("
          + "\0132A.google.cloud.dataplex.v1.DataQuality"
          + "Rule.RowConditionExpectationH\000\022k\n\033table_"
          + "condition_expectation\030\311\001 \001(\0132C.google.cl"
          + "oud.dataplex.v1.DataQualityRule.TableCon"
          + "ditionExpectationH\000\022\025\n\006column\030\364\003 \001(\tB\004\342A"
          + "\001\001\022\032\n\013ignore_null\030\365\003 \001(\010B\004\342A\001\001\022\030\n\tdimens"
          + "ion\030\366\003 \001(\tB\004\342A\001\002\022\030\n\tthreshold\030\367\003 \001(\001B\004\342A"
          + "\001\001\022\023\n\004name\030\370\003 \001(\tB\004\342A\001\001\022\032\n\013description\030\371"
          + "\003 \001(\tB\004\342A\001\001\032\210\001\n\020RangeExpectation\022\027\n\tmin_"
          + "value\030\001 \001(\tB\004\342A\001\001\022\027\n\tmax_value\030\002 \001(\tB\004\342A"
          + "\001\001\022 \n\022strict_min_enabled\030\003 \001(\010B\004\342A\001\001\022 \n\022"
          + "strict_max_enabled\030\004 \001(\010B\004\342A\001\001\032\024\n\022NonNul"
          + "lExpectation\032&\n\016SetExpectation\022\024\n\006values"
          + "\030\001 \003(\tB\004\342A\001\001\032\'\n\020RegexExpectation\022\023\n\005rege"
          + "x\030\001 \001(\tB\004\342A\001\001\032\027\n\025UniquenessExpectation\032\307"
          + "\002\n\031StatisticRangeExpectation\022l\n\tstatisti"
          + "c\030\001 \001(\0162S.google.cloud.dataplex.v1.DataQ"
          + "ualityRule.StatisticRangeExpectation.Col"
          + "umnStatisticB\004\342A\001\001\022\027\n\tmin_value\030\002 \001(\tB\004\342"
          + "A\001\001\022\027\n\tmax_value\030\003 \001(\tB\004\342A\001\001\022 \n\022strict_m"
          + "in_enabled\030\004 \001(\010B\004\342A\001\001\022 \n\022strict_max_ena"
          + "bled\030\005 \001(\010B\004\342A\001\001\"F\n\017ColumnStatistic\022\027\n\023S"
          + "TATISTIC_UNDEFINED\020\000\022\010\n\004MEAN\020\001\022\007\n\003MIN\020\002\022"
          + "\007\n\003MAX\020\003\0327\n\027RowConditionExpectation\022\034\n\016s"
          + "ql_expression\030\001 \001(\tB\004\342A\001\001\0329\n\031TableCondit"
          + "ionExpectation\022\034\n\016sql_expression\030\001 \001(\tB\004"
          + "\342A\001\001B\013\n\trule_typeB\304\001\n\034com.google.cloud.d"
          + "ataplex.v1B\020DataQualityProtoP\001Z8cloud.go"
          + "ogle.com/go/dataplex/apiv1/dataplexpb;da"
          + "taplexpb\352AU\n\035bigquery.googleapis.com/Tab"
          + "le\0224projects/{project}/datasets/{dataset"
          + "}/tables/{table}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor,
            new java.lang.String[] {
              "Rules", "SamplingPercent", "RowFilter", "PostScanActions",
            });
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_descriptor,
            new java.lang.String[] {
              "BigqueryExport",
            });
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_BigQueryExport_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_BigQueryExport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualitySpec_PostScanActions_BigQueryExport_descriptor,
            new java.lang.String[] {
              "ResultsTable",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityResult_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataQualityResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityResult_descriptor,
            new java.lang.String[] {
              "Passed", "Dimensions", "Rules", "RowCount", "ScannedData", "PostScanActionsResult",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_descriptor,
            new java.lang.String[] {
              "BigqueryExportResult",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_BigQueryExportResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_BigQueryExportResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityResult_PostScanActionsResult_BigQueryExportResult_descriptor,
            new java.lang.String[] {
              "State", "Message",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_descriptor,
            new java.lang.String[] {
              "Rule",
              "Passed",
              "EvaluatedCount",
              "PassedCount",
              "NullCount",
              "PassRatio",
              "FailingRowsQuery",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_descriptor,
            new java.lang.String[] {
              "Dimension", "Passed",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityDimension_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_DataQualityDimension_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityDimension_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor,
            new java.lang.String[] {
              "RangeExpectation",
              "NonNullExpectation",
              "SetExpectation",
              "RegexExpectation",
              "UniquenessExpectation",
              "StatisticRangeExpectation",
              "RowConditionExpectation",
              "TableConditionExpectation",
              "Column",
              "IgnoreNull",
              "Dimension",
              "Threshold",
              "Name",
              "Description",
              "RuleType",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "StrictMinEnabled", "StrictMaxEnabled",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_descriptor,
            new java.lang.String[] {
              "Regex",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_descriptor,
            new java.lang.String[] {
              "Statistic", "MinValue", "MaxValue", "StrictMinEnabled", "StrictMaxEnabled",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_descriptor,
            new java.lang.String[] {
              "SqlExpression",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(7);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_descriptor,
            new java.lang.String[] {
              "SqlExpression",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
