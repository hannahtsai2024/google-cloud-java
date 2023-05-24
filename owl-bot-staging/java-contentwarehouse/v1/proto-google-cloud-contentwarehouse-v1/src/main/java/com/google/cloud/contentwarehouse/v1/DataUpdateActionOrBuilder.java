// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

public interface DataUpdateActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.DataUpdateAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  boolean containsEntries(
      java.lang.String key);
  /**
   * Use {@link #getEntriesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEntries();
  /**
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEntriesMap();
  /**
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  /* nullable */
java.lang.String getEntriesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  java.lang.String getEntriesOrThrow(
      java.lang.String key);
}
