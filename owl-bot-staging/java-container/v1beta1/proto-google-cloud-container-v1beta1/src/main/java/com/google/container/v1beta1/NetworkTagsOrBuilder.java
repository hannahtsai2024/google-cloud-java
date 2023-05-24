// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface NetworkTagsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NetworkTags)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of network tags.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * List of network tags.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * List of network tags.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * List of network tags.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);
}
