// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

public interface RuleSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.RuleSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the rule set. Managed internally.
   * Format:
   * projects/{project_number}/locations/{location}/ruleSet/{rule_set_id}.
   *
   * The name is ignored when creating a rule set.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the rule set. Managed internally.
   * Format:
   * projects/{project_number}/locations/{location}/ruleSet/{rule_set_id}.
   *
   * The name is ignored when creating a rule set.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Short description of the rule-set.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Short description of the rule-set.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Source of the rules i.e., customer name.
   * </pre>
   *
   * <code>string source = 2;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <pre>
   * Source of the rules i.e., customer name.
   * </pre>
   *
   * <code>string source = 2;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <pre>
   * List of rules given by the customer.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule rules = 3;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.Rule> 
      getRulesList();
  /**
   * <pre>
   * List of rules given by the customer.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule rules = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.Rule getRules(int index);
  /**
   * <pre>
   * List of rules given by the customer.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule rules = 3;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * List of rules given by the customer.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule rules = 3;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.RuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * List of rules given by the customer.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule rules = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.RuleOrBuilder getRulesOrBuilder(
      int index);
}
