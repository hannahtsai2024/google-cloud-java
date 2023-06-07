/*
 * Copyright 2020 Google LLC
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
// source: google/monitoring/dashboard/v1/xychart.proto

package com.google.monitoring.dashboard.v1;

public final class XyChartProto {
  private XyChartProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_XyChart_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_XyChart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_XyChart_DataSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_XyChart_DataSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_XyChart_Axis_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_XyChart_Axis_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_ChartOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ChartOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/monitoring/dashboard/v1/xychart"
          + ".proto\022\036google.monitoring.dashboard.v1\032\037"
          + "google/api/field_behavior.proto\032,google/"
          + "monitoring/dashboard/v1/metrics.proto\032\036g"
          + "oogle/protobuf/duration.proto\"\315\010\n\007XyChar"
          + "t\022G\n\tdata_sets\030\001 \003(\0132/.google.monitoring"
          + ".dashboard.v1.XyChart.DataSetB\003\340A\002\0225\n\022ti"
          + "meshift_duration\030\004 \001(\0132\031.google.protobuf"
          + ".Duration\022=\n\nthresholds\030\005 \003(\0132).google.m"
          + "onitoring.dashboard.v1.Threshold\022<\n\006x_ax"
          + "is\030\006 \001(\0132,.google.monitoring.dashboard.v"
          + "1.XyChart.Axis\022<\n\006y_axis\030\007 \001(\0132,.google."
          + "monitoring.dashboard.v1.XyChart.Axis\022=\n\007"
          + "y2_axis\030\t \001(\0132,.google.monitoring.dashbo"
          + "ard.v1.XyChart.Axis\022C\n\rchart_options\030\010 \001"
          + "(\0132,.google.monitoring.dashboard.v1.Char"
          + "tOptions\032\360\003\n\007DataSet\022O\n\021time_series_quer"
          + "y\030\001 \001(\0132/.google.monitoring.dashboard.v1"
          + ".TimeSeriesQueryB\003\340A\002\022K\n\tplot_type\030\002 \001(\016"
          + "28.google.monitoring.dashboard.v1.XyChar"
          + "t.DataSet.PlotType\022\027\n\017legend_template\030\003 "
          + "\001(\t\022<\n\024min_alignment_period\030\004 \001(\0132\031.goog"
          + "le.protobuf.DurationB\003\340A\001\022T\n\013target_axis"
          + "\030\005 \001(\0162:.google.monitoring.dashboard.v1."
          + "XyChart.DataSet.TargetAxisB\003\340A\001\"_\n\010PlotT"
          + "ype\022\031\n\025PLOT_TYPE_UNSPECIFIED\020\000\022\010\n\004LINE\020\001"
          + "\022\020\n\014STACKED_AREA\020\002\022\017\n\013STACKED_BAR\020\003\022\013\n\007H"
          + "EATMAP\020\004\"9\n\nTargetAxis\022\033\n\027TARGET_AXIS_UN"
          + "SPECIFIED\020\000\022\006\n\002Y1\020\001\022\006\n\002Y2\020\002\032\217\001\n\004Axis\022\r\n\005"
          + "label\030\001 \001(\t\022A\n\005scale\030\002 \001(\01622.google.moni"
          + "toring.dashboard.v1.XyChart.Axis.Scale\"5"
          + "\n\005Scale\022\025\n\021SCALE_UNSPECIFIED\020\000\022\n\n\006LINEAR"
          + "\020\001\022\t\n\005LOG10\020\002\"\216\001\n\014ChartOptions\022?\n\004mode\030\001"
          + " \001(\01621.google.monitoring.dashboard.v1.Ch"
          + "artOptions.Mode\"=\n\004Mode\022\024\n\020MODE_UNSPECIF"
          + "IED\020\000\022\t\n\005COLOR\020\001\022\t\n\005X_RAY\020\002\022\t\n\005STATS\020\003B\365"
          + "\001\n\"com.google.monitoring.dashboard.v1B\014X"
          + "yChartProtoP\001ZFcloud.google.com/go/monit"
          + "oring/dashboard/apiv1/dashboardpb;dashbo"
          + "ardpb\252\002$Google.Cloud.Monitoring.Dashboar"
          + "d.V1\312\002$Google\\Cloud\\Monitoring\\Dashboard"
          + "\\V1\352\002(Google::Cloud::Monitoring::Dashboa"
          + "rd::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_XyChart_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_XyChart_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_XyChart_descriptor,
            new java.lang.String[] {
              "DataSets",
              "TimeshiftDuration",
              "Thresholds",
              "XAxis",
              "YAxis",
              "Y2Axis",
              "ChartOptions",
            });
    internal_static_google_monitoring_dashboard_v1_XyChart_DataSet_descriptor =
        internal_static_google_monitoring_dashboard_v1_XyChart_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_XyChart_DataSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_XyChart_DataSet_descriptor,
            new java.lang.String[] {
              "TimeSeriesQuery", "PlotType", "LegendTemplate", "MinAlignmentPeriod", "TargetAxis",
            });
    internal_static_google_monitoring_dashboard_v1_XyChart_Axis_descriptor =
        internal_static_google_monitoring_dashboard_v1_XyChart_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_XyChart_Axis_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_XyChart_Axis_descriptor,
            new java.lang.String[] {
              "Label", "Scale",
            });
    internal_static_google_monitoring_dashboard_v1_ChartOptions_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_ChartOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_ChartOptions_descriptor,
            new java.lang.String[] {
              "Mode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
