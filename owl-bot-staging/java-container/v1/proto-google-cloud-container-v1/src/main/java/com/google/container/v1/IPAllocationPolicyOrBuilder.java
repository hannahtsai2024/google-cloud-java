// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface IPAllocationPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.IPAllocationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether alias IPs will be used for pod IPs in the cluster.
   * This is used in conjunction with use_routes. It cannot
   * be true if use_routes is true. If both use_ip_aliases and use_routes are
   * false, then the server picks the default IP allocation mode
   * </pre>
   *
   * <code>bool use_ip_aliases = 1;</code>
   * @return The useIpAliases.
   */
  boolean getUseIpAliases();

  /**
   * <pre>
   * Whether a new subnetwork will be created automatically for the cluster.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>bool create_subnetwork = 2;</code>
   * @return The createSubnetwork.
   */
  boolean getCreateSubnetwork();

  /**
   * <pre>
   * A custom subnetwork name to be used if `create_subnetwork` is true.  If
   * this field is empty, then an automatic name will be chosen for the new
   * subnetwork.
   * </pre>
   *
   * <code>string subnetwork_name = 3;</code>
   * @return The subnetworkName.
   */
  java.lang.String getSubnetworkName();
  /**
   * <pre>
   * A custom subnetwork name to be used if `create_subnetwork` is true.  If
   * this field is empty, then an automatic name will be chosen for the new
   * subnetwork.
   * </pre>
   *
   * <code>string subnetwork_name = 3;</code>
   * @return The bytes for subnetworkName.
   */
  com.google.protobuf.ByteString
      getSubnetworkNameBytes();

  /**
   * <pre>
   * This field is deprecated, use cluster_ipv4_cidr_block.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr = 4 [deprecated = true];</code>
   * @deprecated google.container.v1.IPAllocationPolicy.cluster_ipv4_cidr is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1377
   * @return The clusterIpv4Cidr.
   */
  @java.lang.Deprecated java.lang.String getClusterIpv4Cidr();
  /**
   * <pre>
   * This field is deprecated, use cluster_ipv4_cidr_block.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr = 4 [deprecated = true];</code>
   * @deprecated google.container.v1.IPAllocationPolicy.cluster_ipv4_cidr is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1377
   * @return The bytes for clusterIpv4Cidr.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIpv4CidrBytes();

  /**
   * <pre>
   * This field is deprecated, use node_ipv4_cidr_block.
   * </pre>
   *
   * <code>string node_ipv4_cidr = 5 [deprecated = true];</code>
   * @deprecated google.container.v1.IPAllocationPolicy.node_ipv4_cidr is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1380
   * @return The nodeIpv4Cidr.
   */
  @java.lang.Deprecated java.lang.String getNodeIpv4Cidr();
  /**
   * <pre>
   * This field is deprecated, use node_ipv4_cidr_block.
   * </pre>
   *
   * <code>string node_ipv4_cidr = 5 [deprecated = true];</code>
   * @deprecated google.container.v1.IPAllocationPolicy.node_ipv4_cidr is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1380
   * @return The bytes for nodeIpv4Cidr.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNodeIpv4CidrBytes();

  /**
   * <pre>
   * This field is deprecated, use services_ipv4_cidr_block.
   * </pre>
   *
   * <code>string services_ipv4_cidr = 6 [deprecated = true];</code>
   * @deprecated google.container.v1.IPAllocationPolicy.services_ipv4_cidr is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1383
   * @return The servicesIpv4Cidr.
   */
  @java.lang.Deprecated java.lang.String getServicesIpv4Cidr();
  /**
   * <pre>
   * This field is deprecated, use services_ipv4_cidr_block.
   * </pre>
   *
   * <code>string services_ipv4_cidr = 6 [deprecated = true];</code>
   * @deprecated google.container.v1.IPAllocationPolicy.services_ipv4_cidr is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1383
   * @return The bytes for servicesIpv4Cidr.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getServicesIpv4CidrBytes();

  /**
   * <pre>
   * The name of the secondary range to be used for the cluster CIDR
   * block.  The secondary range will be used for pod IP
   * addresses. This must be an existing secondary range associated
   * with the cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 7;</code>
   * @return The clusterSecondaryRangeName.
   */
  java.lang.String getClusterSecondaryRangeName();
  /**
   * <pre>
   * The name of the secondary range to be used for the cluster CIDR
   * block.  The secondary range will be used for pod IP
   * addresses. This must be an existing secondary range associated
   * with the cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 7;</code>
   * @return The bytes for clusterSecondaryRangeName.
   */
  com.google.protobuf.ByteString
      getClusterSecondaryRangeNameBytes();

  /**
   * <pre>
   * The name of the secondary range to be used as for the services
   * CIDR block.  The secondary range will be used for service
   * ClusterIPs. This must be an existing secondary range associated
   * with the cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string services_secondary_range_name = 8;</code>
   * @return The servicesSecondaryRangeName.
   */
  java.lang.String getServicesSecondaryRangeName();
  /**
   * <pre>
   * The name of the secondary range to be used as for the services
   * CIDR block.  The secondary range will be used for service
   * ClusterIPs. This must be an existing secondary range associated
   * with the cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string services_secondary_range_name = 8;</code>
   * @return The bytes for servicesSecondaryRangeName.
   */
  com.google.protobuf.ByteString
      getServicesSecondaryRangeNameBytes();

  /**
   * <pre>
   * The IP address range for the cluster pod IPs. If this field is set, then
   * `cluster.cluster_ipv4_cidr` must be left blank.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 9;</code>
   * @return The clusterIpv4CidrBlock.
   */
  java.lang.String getClusterIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range for the cluster pod IPs. If this field is set, then
   * `cluster.cluster_ipv4_cidr` must be left blank.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 9;</code>
   * @return The bytes for clusterIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getClusterIpv4CidrBlockBytes();

  /**
   * <pre>
   * The IP address range of the instance IPs in this cluster.
   *
   * This is applicable only if `create_subnetwork` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string node_ipv4_cidr_block = 10;</code>
   * @return The nodeIpv4CidrBlock.
   */
  java.lang.String getNodeIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range of the instance IPs in this cluster.
   *
   * This is applicable only if `create_subnetwork` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string node_ipv4_cidr_block = 10;</code>
   * @return The bytes for nodeIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getNodeIpv4CidrBlockBytes();

  /**
   * <pre>
   * The IP address range of the services IPs in this cluster. If blank, a range
   * will be automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 11;</code>
   * @return The servicesIpv4CidrBlock.
   */
  java.lang.String getServicesIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range of the services IPs in this cluster. If blank, a range
   * will be automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 11;</code>
   * @return The bytes for servicesIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getServicesIpv4CidrBlockBytes();

  /**
   * <pre>
   * The IP address range of the Cloud TPUs in this cluster. If unspecified, a
   * range will be automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * If unspecified, the range will use the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string tpu_ipv4_cidr_block = 13;</code>
   * @return The tpuIpv4CidrBlock.
   */
  java.lang.String getTpuIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range of the Cloud TPUs in this cluster. If unspecified, a
   * range will be automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * If unspecified, the range will use the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string tpu_ipv4_cidr_block = 13;</code>
   * @return The bytes for tpuIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getTpuIpv4CidrBlockBytes();

  /**
   * <pre>
   * Whether routes will be used for pod IPs in the cluster.
   * This is used in conjunction with use_ip_aliases. It cannot be true if
   * use_ip_aliases is true. If both use_ip_aliases and use_routes are false,
   * then the server picks the default IP allocation mode
   * </pre>
   *
   * <code>bool use_routes = 15;</code>
   * @return The useRoutes.
   */
  boolean getUseRoutes();

  /**
   * <pre>
   * The IP stack type of the cluster
   * </pre>
   *
   * <code>.google.container.v1.StackType stack_type = 16;</code>
   * @return The enum numeric value on the wire for stackType.
   */
  int getStackTypeValue();
  /**
   * <pre>
   * The IP stack type of the cluster
   * </pre>
   *
   * <code>.google.container.v1.StackType stack_type = 16;</code>
   * @return The stackType.
   */
  com.google.container.v1.StackType getStackType();

  /**
   * <pre>
   * The ipv6 access type (internal or external) when create_subnetwork is true
   * </pre>
   *
   * <code>.google.container.v1.IPv6AccessType ipv6_access_type = 17;</code>
   * @return The enum numeric value on the wire for ipv6AccessType.
   */
  int getIpv6AccessTypeValue();
  /**
   * <pre>
   * The ipv6 access type (internal or external) when create_subnetwork is true
   * </pre>
   *
   * <code>.google.container.v1.IPv6AccessType ipv6_access_type = 17;</code>
   * @return The ipv6AccessType.
   */
  com.google.container.v1.IPv6AccessType getIpv6AccessType();

  /**
   * <pre>
   * [PRIVATE FIELD]
   * Pod CIDR size overprovisioning config for the cluster.
   *
   * Pod CIDR size per node depends on max_pods_per_node. By default, the value
   * of max_pods_per_node is doubled and then rounded off to next power of 2 to
   * get the size of pod CIDR block per node.
   * Example: max_pods_per_node of 30 would result in 64 IPs (/26).
   *
   * This config can disable the doubling of IPs (we still round off to next
   * power of 2)
   * Example: max_pods_per_node of 30 will result in 32 IPs (/27) when
   * overprovisioning is disabled.
   * </pre>
   *
   * <code>.google.container.v1.PodCIDROverprovisionConfig pod_cidr_overprovision_config = 21;</code>
   * @return Whether the podCidrOverprovisionConfig field is set.
   */
  boolean hasPodCidrOverprovisionConfig();
  /**
   * <pre>
   * [PRIVATE FIELD]
   * Pod CIDR size overprovisioning config for the cluster.
   *
   * Pod CIDR size per node depends on max_pods_per_node. By default, the value
   * of max_pods_per_node is doubled and then rounded off to next power of 2 to
   * get the size of pod CIDR block per node.
   * Example: max_pods_per_node of 30 would result in 64 IPs (/26).
   *
   * This config can disable the doubling of IPs (we still round off to next
   * power of 2)
   * Example: max_pods_per_node of 30 will result in 32 IPs (/27) when
   * overprovisioning is disabled.
   * </pre>
   *
   * <code>.google.container.v1.PodCIDROverprovisionConfig pod_cidr_overprovision_config = 21;</code>
   * @return The podCidrOverprovisionConfig.
   */
  com.google.container.v1.PodCIDROverprovisionConfig getPodCidrOverprovisionConfig();
  /**
   * <pre>
   * [PRIVATE FIELD]
   * Pod CIDR size overprovisioning config for the cluster.
   *
   * Pod CIDR size per node depends on max_pods_per_node. By default, the value
   * of max_pods_per_node is doubled and then rounded off to next power of 2 to
   * get the size of pod CIDR block per node.
   * Example: max_pods_per_node of 30 would result in 64 IPs (/26).
   *
   * This config can disable the doubling of IPs (we still round off to next
   * power of 2)
   * Example: max_pods_per_node of 30 will result in 32 IPs (/27) when
   * overprovisioning is disabled.
   * </pre>
   *
   * <code>.google.container.v1.PodCIDROverprovisionConfig pod_cidr_overprovision_config = 21;</code>
   */
  com.google.container.v1.PodCIDROverprovisionConfigOrBuilder getPodCidrOverprovisionConfigOrBuilder();

  /**
   * <pre>
   * Output only. [Output only] The subnet's IPv6 CIDR block used by nodes and
   * pods.
   * </pre>
   *
   * <code>string subnet_ipv6_cidr_block = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The subnetIpv6CidrBlock.
   */
  java.lang.String getSubnetIpv6CidrBlock();
  /**
   * <pre>
   * Output only. [Output only] The subnet's IPv6 CIDR block used by nodes and
   * pods.
   * </pre>
   *
   * <code>string subnet_ipv6_cidr_block = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for subnetIpv6CidrBlock.
   */
  com.google.protobuf.ByteString
      getSubnetIpv6CidrBlockBytes();

  /**
   * <pre>
   * Output only. [Output only] The services IPv6 CIDR block for the cluster.
   * </pre>
   *
   * <code>string services_ipv6_cidr_block = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The servicesIpv6CidrBlock.
   */
  java.lang.String getServicesIpv6CidrBlock();
  /**
   * <pre>
   * Output only. [Output only] The services IPv6 CIDR block for the cluster.
   * </pre>
   *
   * <code>string services_ipv6_cidr_block = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for servicesIpv6CidrBlock.
   */
  com.google.protobuf.ByteString
      getServicesIpv6CidrBlockBytes();

  /**
   * <pre>
   * Output only. [Output only] The additional pod ranges that are added to the
   * cluster. These pod ranges can be used by new node pools to allocate pod IPs
   * automatically. Once the range is removed it will not show up in
   * IPAllocationPolicy.
   * </pre>
   *
   * <code>.google.container.v1.AdditionalPodRangesConfig additional_pod_ranges_config = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the additionalPodRangesConfig field is set.
   */
  boolean hasAdditionalPodRangesConfig();
  /**
   * <pre>
   * Output only. [Output only] The additional pod ranges that are added to the
   * cluster. These pod ranges can be used by new node pools to allocate pod IPs
   * automatically. Once the range is removed it will not show up in
   * IPAllocationPolicy.
   * </pre>
   *
   * <code>.google.container.v1.AdditionalPodRangesConfig additional_pod_ranges_config = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The additionalPodRangesConfig.
   */
  com.google.container.v1.AdditionalPodRangesConfig getAdditionalPodRangesConfig();
  /**
   * <pre>
   * Output only. [Output only] The additional pod ranges that are added to the
   * cluster. These pod ranges can be used by new node pools to allocate pod IPs
   * automatically. Once the range is removed it will not show up in
   * IPAllocationPolicy.
   * </pre>
   *
   * <code>.google.container.v1.AdditionalPodRangesConfig additional_pod_ranges_config = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.container.v1.AdditionalPodRangesConfigOrBuilder getAdditionalPodRangesConfigOrBuilder();
}
