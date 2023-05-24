// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstancesGetEffectiveFirewallsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;</code>
   */
  java.util.List<com.google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy> 
      getFirewallPolicysList();
  /**
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;</code>
   */
  com.google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy getFirewallPolicys(int index);
  /**
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;</code>
   */
  int getFirewallPolicysCount();
  /**
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicyOrBuilder> 
      getFirewallPolicysOrBuilderList();
  /**
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;</code>
   */
  com.google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicyOrBuilder getFirewallPolicysOrBuilder(
      int index);

  /**
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Firewall> 
      getFirewallsList();
  /**
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  com.google.cloud.compute.v1.Firewall getFirewalls(int index);
  /**
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  int getFirewallsCount();
  /**
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.FirewallOrBuilder> 
      getFirewallsOrBuilderList();
  /**
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  com.google.cloud.compute.v1.FirewallOrBuilder getFirewallsOrBuilder(
      int index);
}
