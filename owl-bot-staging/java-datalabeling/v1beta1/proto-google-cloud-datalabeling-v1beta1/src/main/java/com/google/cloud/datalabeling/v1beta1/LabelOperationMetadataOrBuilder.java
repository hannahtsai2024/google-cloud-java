// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/operations.proto

package com.google.cloud.datalabeling.v1beta1;

public interface LabelOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.LabelOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Details of label image classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata image_classification_details = 3;</code>
   * @return Whether the imageClassificationDetails field is set.
   */
  boolean hasImageClassificationDetails();
  /**
   * <pre>
   * Details of label image classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata image_classification_details = 3;</code>
   * @return The imageClassificationDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata getImageClassificationDetails();
  /**
   * <pre>
   * Details of label image classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata image_classification_details = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadataOrBuilder getImageClassificationDetailsOrBuilder();

  /**
   * <pre>
   * Details of label image bounding box operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageBoundingBoxOperationMetadata image_bounding_box_details = 4;</code>
   * @return Whether the imageBoundingBoxDetails field is set.
   */
  boolean hasImageBoundingBoxDetails();
  /**
   * <pre>
   * Details of label image bounding box operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageBoundingBoxOperationMetadata image_bounding_box_details = 4;</code>
   * @return The imageBoundingBoxDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageBoundingBoxOperationMetadata getImageBoundingBoxDetails();
  /**
   * <pre>
   * Details of label image bounding box operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageBoundingBoxOperationMetadata image_bounding_box_details = 4;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageBoundingBoxOperationMetadataOrBuilder getImageBoundingBoxDetailsOrBuilder();

  /**
   * <pre>
   * Details of label image bounding poly operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageBoundingPolyOperationMetadata image_bounding_poly_details = 11;</code>
   * @return Whether the imageBoundingPolyDetails field is set.
   */
  boolean hasImageBoundingPolyDetails();
  /**
   * <pre>
   * Details of label image bounding poly operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageBoundingPolyOperationMetadata image_bounding_poly_details = 11;</code>
   * @return The imageBoundingPolyDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageBoundingPolyOperationMetadata getImageBoundingPolyDetails();
  /**
   * <pre>
   * Details of label image bounding poly operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageBoundingPolyOperationMetadata image_bounding_poly_details = 11;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageBoundingPolyOperationMetadataOrBuilder getImageBoundingPolyDetailsOrBuilder();

  /**
   * <pre>
   * Details of label image oriented bounding box operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageOrientedBoundingBoxOperationMetadata image_oriented_bounding_box_details = 14;</code>
   * @return Whether the imageOrientedBoundingBoxDetails field is set.
   */
  boolean hasImageOrientedBoundingBoxDetails();
  /**
   * <pre>
   * Details of label image oriented bounding box operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageOrientedBoundingBoxOperationMetadata image_oriented_bounding_box_details = 14;</code>
   * @return The imageOrientedBoundingBoxDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageOrientedBoundingBoxOperationMetadata getImageOrientedBoundingBoxDetails();
  /**
   * <pre>
   * Details of label image oriented bounding box operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageOrientedBoundingBoxOperationMetadata image_oriented_bounding_box_details = 14;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageOrientedBoundingBoxOperationMetadataOrBuilder getImageOrientedBoundingBoxDetailsOrBuilder();

  /**
   * <pre>
   * Details of label image polyline operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImagePolylineOperationMetadata image_polyline_details = 12;</code>
   * @return Whether the imagePolylineDetails field is set.
   */
  boolean hasImagePolylineDetails();
  /**
   * <pre>
   * Details of label image polyline operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImagePolylineOperationMetadata image_polyline_details = 12;</code>
   * @return The imagePolylineDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelImagePolylineOperationMetadata getImagePolylineDetails();
  /**
   * <pre>
   * Details of label image polyline operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImagePolylineOperationMetadata image_polyline_details = 12;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelImagePolylineOperationMetadataOrBuilder getImagePolylineDetailsOrBuilder();

  /**
   * <pre>
   * Details of label image segmentation operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageSegmentationOperationMetadata image_segmentation_details = 15;</code>
   * @return Whether the imageSegmentationDetails field is set.
   */
  boolean hasImageSegmentationDetails();
  /**
   * <pre>
   * Details of label image segmentation operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageSegmentationOperationMetadata image_segmentation_details = 15;</code>
   * @return The imageSegmentationDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageSegmentationOperationMetadata getImageSegmentationDetails();
  /**
   * <pre>
   * Details of label image segmentation operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelImageSegmentationOperationMetadata image_segmentation_details = 15;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelImageSegmentationOperationMetadataOrBuilder getImageSegmentationDetailsOrBuilder();

  /**
   * <pre>
   * Details of label video classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoClassificationOperationMetadata video_classification_details = 5;</code>
   * @return Whether the videoClassificationDetails field is set.
   */
  boolean hasVideoClassificationDetails();
  /**
   * <pre>
   * Details of label video classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoClassificationOperationMetadata video_classification_details = 5;</code>
   * @return The videoClassificationDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoClassificationOperationMetadata getVideoClassificationDetails();
  /**
   * <pre>
   * Details of label video classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoClassificationOperationMetadata video_classification_details = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoClassificationOperationMetadataOrBuilder getVideoClassificationDetailsOrBuilder();

  /**
   * <pre>
   * Details of label video object detection operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoObjectDetectionOperationMetadata video_object_detection_details = 6;</code>
   * @return Whether the videoObjectDetectionDetails field is set.
   */
  boolean hasVideoObjectDetectionDetails();
  /**
   * <pre>
   * Details of label video object detection operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoObjectDetectionOperationMetadata video_object_detection_details = 6;</code>
   * @return The videoObjectDetectionDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoObjectDetectionOperationMetadata getVideoObjectDetectionDetails();
  /**
   * <pre>
   * Details of label video object detection operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoObjectDetectionOperationMetadata video_object_detection_details = 6;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoObjectDetectionOperationMetadataOrBuilder getVideoObjectDetectionDetailsOrBuilder();

  /**
   * <pre>
   * Details of label video object tracking operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoObjectTrackingOperationMetadata video_object_tracking_details = 7;</code>
   * @return Whether the videoObjectTrackingDetails field is set.
   */
  boolean hasVideoObjectTrackingDetails();
  /**
   * <pre>
   * Details of label video object tracking operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoObjectTrackingOperationMetadata video_object_tracking_details = 7;</code>
   * @return The videoObjectTrackingDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoObjectTrackingOperationMetadata getVideoObjectTrackingDetails();
  /**
   * <pre>
   * Details of label video object tracking operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoObjectTrackingOperationMetadata video_object_tracking_details = 7;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoObjectTrackingOperationMetadataOrBuilder getVideoObjectTrackingDetailsOrBuilder();

  /**
   * <pre>
   * Details of label video event operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoEventOperationMetadata video_event_details = 8;</code>
   * @return Whether the videoEventDetails field is set.
   */
  boolean hasVideoEventDetails();
  /**
   * <pre>
   * Details of label video event operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoEventOperationMetadata video_event_details = 8;</code>
   * @return The videoEventDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoEventOperationMetadata getVideoEventDetails();
  /**
   * <pre>
   * Details of label video event operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelVideoEventOperationMetadata video_event_details = 8;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelVideoEventOperationMetadataOrBuilder getVideoEventDetailsOrBuilder();

  /**
   * <pre>
   * Details of label text classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextClassificationOperationMetadata text_classification_details = 9;</code>
   * @return Whether the textClassificationDetails field is set.
   */
  boolean hasTextClassificationDetails();
  /**
   * <pre>
   * Details of label text classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextClassificationOperationMetadata text_classification_details = 9;</code>
   * @return The textClassificationDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelTextClassificationOperationMetadata getTextClassificationDetails();
  /**
   * <pre>
   * Details of label text classification operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextClassificationOperationMetadata text_classification_details = 9;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelTextClassificationOperationMetadataOrBuilder getTextClassificationDetailsOrBuilder();

  /**
   * <pre>
   * Details of label text entity extraction operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextEntityExtractionOperationMetadata text_entity_extraction_details = 13;</code>
   * @return Whether the textEntityExtractionDetails field is set.
   */
  boolean hasTextEntityExtractionDetails();
  /**
   * <pre>
   * Details of label text entity extraction operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextEntityExtractionOperationMetadata text_entity_extraction_details = 13;</code>
   * @return The textEntityExtractionDetails.
   */
  com.google.cloud.datalabeling.v1beta1.LabelTextEntityExtractionOperationMetadata getTextEntityExtractionDetails();
  /**
   * <pre>
   * Details of label text entity extraction operation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextEntityExtractionOperationMetadata text_entity_extraction_details = 13;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelTextEntityExtractionOperationMetadataOrBuilder getTextEntityExtractionDetailsOrBuilder();

  /**
   * <pre>
   * Output only. Progress of label operation. Range: [0, 100].
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   * @return The progressPercent.
   */
  int getProgressPercent();

  /**
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<com.google.rpc.Status> 
      getPartialFailuresList();
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.Status getPartialFailures(int index);
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  int getPartialFailuresCount();
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getPartialFailuresOrBuilderList();
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Timestamp when labeling request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when labeling request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when labeling request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata.DetailsCase getDetailsCase();
}
