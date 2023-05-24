// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface LookupEntryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.LookupEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. For more information, see [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name).
   *
   * Full names are case-sensitive. For example:
   *
   *  * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   *  * `//pubsub.googleapis.com/projects/{PROJECT_ID}/topics/{TOPIC_ID}`
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   * @return Whether the linkedResource field is set.
   */
  boolean hasLinkedResource();
  /**
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. For more information, see [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name).
   *
   * Full names are case-sensitive. For example:
   *
   *  * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   *  * `//pubsub.googleapis.com/projects/{PROJECT_ID}/topics/{TOPIC_ID}`
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   * @return The linkedResource.
   */
  java.lang.String getLinkedResource();
  /**
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. For more information, see [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name).
   *
   * Full names are case-sensitive. For example:
   *
   *  * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   *  * `//pubsub.googleapis.com/projects/{PROJECT_ID}/topics/{TOPIC_ID}`
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   * @return The bytes for linkedResource.
   */
  com.google.protobuf.ByteString
      getLinkedResourceBytes();

  /**
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   *
   * Examples:
   *
   * * `pubsub.topic.{PROJECT_ID}.{TOPIC_ID}`
   * * `pubsub.topic.{PROJECT_ID}.`&#92;``{TOPIC.ID.SEPARATED.WITH.DOTS}`&#92;`
   * * `bigquery.table.{PROJECT_ID}.{DATASET_ID}.{TABLE_ID}`
   * * `bigquery.dataset.{PROJECT_ID}.{DATASET_ID}`
   * * `datacatalog.entry.{PROJECT_ID}.{LOCATION_ID}.{ENTRY_GROUP_ID}.{ENTRY_ID}`
   *
   * Identifiers (`*_ID`) should comply with the
   * [Lexical structure in Standard SQL]
   * (https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical).
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   * @return Whether the sqlResource field is set.
   */
  boolean hasSqlResource();
  /**
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   *
   * Examples:
   *
   * * `pubsub.topic.{PROJECT_ID}.{TOPIC_ID}`
   * * `pubsub.topic.{PROJECT_ID}.`&#92;``{TOPIC.ID.SEPARATED.WITH.DOTS}`&#92;`
   * * `bigquery.table.{PROJECT_ID}.{DATASET_ID}.{TABLE_ID}`
   * * `bigquery.dataset.{PROJECT_ID}.{DATASET_ID}`
   * * `datacatalog.entry.{PROJECT_ID}.{LOCATION_ID}.{ENTRY_GROUP_ID}.{ENTRY_ID}`
   *
   * Identifiers (`*_ID`) should comply with the
   * [Lexical structure in Standard SQL]
   * (https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical).
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   * @return The sqlResource.
   */
  java.lang.String getSqlResource();
  /**
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   *
   * Examples:
   *
   * * `pubsub.topic.{PROJECT_ID}.{TOPIC_ID}`
   * * `pubsub.topic.{PROJECT_ID}.`&#92;``{TOPIC.ID.SEPARATED.WITH.DOTS}`&#92;`
   * * `bigquery.table.{PROJECT_ID}.{DATASET_ID}.{TABLE_ID}`
   * * `bigquery.dataset.{PROJECT_ID}.{DATASET_ID}`
   * * `datacatalog.entry.{PROJECT_ID}.{LOCATION_ID}.{ENTRY_GROUP_ID}.{ENTRY_ID}`
   *
   * Identifiers (`*_ID`) should comply with the
   * [Lexical structure in Standard SQL]
   * (https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical).
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   * @return The bytes for sqlResource.
   */
  com.google.protobuf.ByteString
      getSqlResourceBytes();

  /**
   * <pre>
   * Fully qualified name (FQN) of the resource.
   *
   * FQNs take two forms:
   *
   * * For non-regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * * For regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * Example for a DPMS table:
   *
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * </pre>
   *
   * <code>string fully_qualified_name = 5;</code>
   * @return Whether the fullyQualifiedName field is set.
   */
  boolean hasFullyQualifiedName();
  /**
   * <pre>
   * Fully qualified name (FQN) of the resource.
   *
   * FQNs take two forms:
   *
   * * For non-regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * * For regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * Example for a DPMS table:
   *
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * </pre>
   *
   * <code>string fully_qualified_name = 5;</code>
   * @return The fullyQualifiedName.
   */
  java.lang.String getFullyQualifiedName();
  /**
   * <pre>
   * Fully qualified name (FQN) of the resource.
   *
   * FQNs take two forms:
   *
   * * For non-regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * * For regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * Example for a DPMS table:
   *
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * </pre>
   *
   * <code>string fully_qualified_name = 5;</code>
   * @return The bytes for fullyQualifiedName.
   */
  com.google.protobuf.ByteString
      getFullyQualifiedNameBytes();

  com.google.cloud.datacatalog.v1.LookupEntryRequest.TargetNameCase getTargetNameCase();
}
