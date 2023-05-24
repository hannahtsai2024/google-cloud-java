// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface SearchLinksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.SearchLinksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location you want search in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location you want search in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Send asset information in the **source** field to retrieve all
   * links that lead from the specified asset to downstream assets.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference source = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * Optional. Send asset information in the **source** field to retrieve all
   * links that lead from the specified asset to downstream assets.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference source = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The source.
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReference getSource();
  /**
   * <pre>
   * Optional. Send asset information in the **source** field to retrieve all
   * links that lead from the specified asset to downstream assets.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference source = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReferenceOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * Optional. Send asset information in the **target** field to retrieve all
   * links that lead from upstream assets to the specified asset.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference target = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <pre>
   * Optional. Send asset information in the **target** field to retrieve all
   * links that lead from upstream assets to the specified asset.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference target = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The target.
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReference getTarget();
  /**
   * <pre>
   * Optional. Send asset information in the **target** field to retrieve all
   * links that lead from upstream assets to the specified asset.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference target = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReferenceOrBuilder getTargetOrBuilder();

  /**
   * <pre>
   * Optional. The maximum number of links to return in a single page of the
   * response. A page may contain fewer links than this value. If unspecified,
   * at most 10 links are returned.
   *
   * Maximum value is 100; values greater than 100 are reduced to 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The page token received from a previous `SearchLinksRequest`
   * call. Use it to get the next page.
   *
   * When requesting subsequent pages of a response, remember that
   * all parameters must match the values you provided
   * in the original request.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The page token received from a previous `SearchLinksRequest`
   * call. Use it to get the next page.
   *
   * When requesting subsequent pages of a response, remember that
   * all parameters must match the values you provided
   * in the original request.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  com.google.cloud.datacatalog.lineage.v1.SearchLinksRequest.CriteriaCase getCriteriaCase();
}
