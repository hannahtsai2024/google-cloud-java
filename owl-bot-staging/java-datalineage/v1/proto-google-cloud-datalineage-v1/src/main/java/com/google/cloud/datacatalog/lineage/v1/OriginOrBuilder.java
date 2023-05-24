// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface OriginOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.Origin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the source.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.Origin.SourceType source_type = 1;</code>
   * @return The enum numeric value on the wire for sourceType.
   */
  int getSourceTypeValue();
  /**
   * <pre>
   * Type of the source.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.Origin.SourceType source_type = 1;</code>
   * @return The sourceType.
   */
  com.google.cloud.datacatalog.lineage.v1.Origin.SourceType getSourceType();

  /**
   * <pre>
   * If the source_type isn't CUSTOM, the value of this field should be a GCP
   * resource name of the system, which reports lineage. The project and
   * location parts of the resource name must match the project and location of
   * the lineage resource being created. Examples:
   *
   * - `{source_type: COMPOSER, name:
   *   "projects/foo/locations/us/environments/bar"}`
   * - `{source_type: BIGQUERY, name: "projects/foo/locations/eu"}`
   * - `{source_type: CUSTOM,   name: "myCustomIntegration"}`
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * If the source_type isn't CUSTOM, the value of this field should be a GCP
   * resource name of the system, which reports lineage. The project and
   * location parts of the resource name must match the project and location of
   * the lineage resource being created. Examples:
   *
   * - `{source_type: COMPOSER, name:
   *   "projects/foo/locations/us/environments/bar"}`
   * - `{source_type: BIGQUERY, name: "projects/foo/locations/eu"}`
   * - `{source_type: CUSTOM,   name: "myCustomIntegration"}`
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
