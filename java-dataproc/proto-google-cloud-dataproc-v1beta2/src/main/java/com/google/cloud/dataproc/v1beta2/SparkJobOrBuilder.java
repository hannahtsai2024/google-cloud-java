/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dataproc/v1beta2/jobs.proto

package com.google.cloud.dataproc.v1beta2;

public interface SparkJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.SparkJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HCFS URI of the jar file that contains the main class.
   * </pre>
   *
   * <code>string main_jar_file_uri = 1;</code>
   */
  java.lang.String getMainJarFileUri();
  /**
   *
   *
   * <pre>
   * The HCFS URI of the jar file that contains the main class.
   * </pre>
   *
   * <code>string main_jar_file_uri = 1;</code>
   */
  com.google.protobuf.ByteString getMainJarFileUriBytes();

  /**
   *
   *
   * <pre>
   * The name of the driver's main class. The jar file that contains the class
   * must be in the default CLASSPATH or specified in `jar_file_uris`.
   * </pre>
   *
   * <code>string main_class = 2;</code>
   */
  java.lang.String getMainClass();
  /**
   *
   *
   * <pre>
   * The name of the driver's main class. The jar file that contains the class
   * must be in the default CLASSPATH or specified in `jar_file_uris`.
   * </pre>
   *
   * <code>string main_class = 2;</code>
   */
  com.google.protobuf.ByteString getMainClassBytes();

  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver. Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   */
  java.util.List<java.lang.String> getArgsList();
  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver. Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   */
  int getArgsCount();
  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver. Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   */
  java.lang.String getArgs(int index);
  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver. Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   */
  com.google.protobuf.ByteString getArgsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Spark driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4;</code>
   */
  java.util.List<java.lang.String> getJarFileUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Spark driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4;</code>
   */
  int getJarFileUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Spark driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4;</code>
   */
  java.lang.String getJarFileUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Spark driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4;</code>
   */
  com.google.protobuf.ByteString getJarFileUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * Spark drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5;</code>
   */
  java.util.List<java.lang.String> getFileUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * Spark drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5;</code>
   */
  int getFileUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * Spark drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5;</code>
   */
  java.lang.String getFileUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * Spark drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5;</code>
   */
  com.google.protobuf.ByteString getFileUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory
   * of Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6;</code>
   */
  java.util.List<java.lang.String> getArchiveUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory
   * of Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6;</code>
   */
  int getArchiveUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory
   * of Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6;</code>
   */
  java.lang.String getArchiveUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory
   * of Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6;</code>
   */
  com.google.protobuf.ByteString getArchiveUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Spark.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7;</code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Spark.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7;</code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Spark.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Spark.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7;</code>
   */
  java.lang.String getPropertiesOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Spark.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7;</code>
   */
  java.lang.String getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.LoggingConfig logging_config = 8;</code>
   */
  boolean hasLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.LoggingConfig logging_config = 8;</code>
   */
  com.google.cloud.dataproc.v1beta2.LoggingConfig getLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.LoggingConfig logging_config = 8;</code>
   */
  com.google.cloud.dataproc.v1beta2.LoggingConfigOrBuilder getLoggingConfigOrBuilder();

  public com.google.cloud.dataproc.v1beta2.SparkJob.DriverCase getDriverCase();
}
