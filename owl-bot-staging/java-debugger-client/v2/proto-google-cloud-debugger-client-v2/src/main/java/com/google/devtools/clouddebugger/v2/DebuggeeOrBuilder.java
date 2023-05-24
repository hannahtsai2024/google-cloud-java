// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/data.proto

package com.google.devtools.clouddebugger.v2;

public interface DebuggeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.Debuggee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique identifier for the debuggee generated by the controller service.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique identifier for the debuggee generated by the controller service.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Project the debuggee is associated with.
   * Use project number or id when registering a Google Cloud Platform project.
   * </pre>
   *
   * <code>string project = 2;</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project the debuggee is associated with.
   * Use project number or id when registering a Google Cloud Platform project.
   * </pre>
   *
   * <code>string project = 2;</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Uniquifier to further distinguish the application.
   * It is possible that different applications might have identical values in
   * the debuggee message, thus, incorrectly identified as a single application
   * by the Controller service. This field adds salt to further distinguish the
   * application. Agents should consider seeding this field with value that
   * identifies the code, binary, configuration and environment.
   * </pre>
   *
   * <code>string uniquifier = 3;</code>
   * @return The uniquifier.
   */
  java.lang.String getUniquifier();
  /**
   * <pre>
   * Uniquifier to further distinguish the application.
   * It is possible that different applications might have identical values in
   * the debuggee message, thus, incorrectly identified as a single application
   * by the Controller service. This field adds salt to further distinguish the
   * application. Agents should consider seeding this field with value that
   * identifies the code, binary, configuration and environment.
   * </pre>
   *
   * <code>string uniquifier = 3;</code>
   * @return The bytes for uniquifier.
   */
  com.google.protobuf.ByteString
      getUniquifierBytes();

  /**
   * <pre>
   * Human readable description of the debuggee.
   * Including a human-readable project name, environment name and version
   * information is recommended.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable description of the debuggee.
   * Including a human-readable project name, environment name and version
   * information is recommended.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * If set to `true`, indicates that Controller service does not detect any
   * activity from the debuggee agents and the application is possibly stopped.
   * </pre>
   *
   * <code>bool is_inactive = 5;</code>
   * @return The isInactive.
   */
  boolean getIsInactive();

  /**
   * <pre>
   * Version ID of the agent.
   * Schema: `domain/language-platform/vmajor.minor` (for example
   * `google.com/java-gcp/v1.1`).
   * </pre>
   *
   * <code>string agent_version = 6;</code>
   * @return The agentVersion.
   */
  java.lang.String getAgentVersion();
  /**
   * <pre>
   * Version ID of the agent.
   * Schema: `domain/language-platform/vmajor.minor` (for example
   * `google.com/java-gcp/v1.1`).
   * </pre>
   *
   * <code>string agent_version = 6;</code>
   * @return The bytes for agentVersion.
   */
  com.google.protobuf.ByteString
      getAgentVersionBytes();

  /**
   * <pre>
   * If set to `true`, indicates that the agent should disable itself and
   * detach from the debuggee.
   * </pre>
   *
   * <code>bool is_disabled = 7;</code>
   * @return The isDisabled.
   */
  boolean getIsDisabled();

  /**
   * <pre>
   * Human readable message to be displayed to the user about this debuggee.
   * Absence of this field indicates no status. The message can be either
   * informational or an error status.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage status = 8;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Human readable message to be displayed to the user about this debuggee.
   * Absence of this field indicates no status. The message can be either
   * informational or an error status.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage status = 8;</code>
   * @return The status.
   */
  com.google.devtools.clouddebugger.v2.StatusMessage getStatus();
  /**
   * <pre>
   * Human readable message to be displayed to the user about this debuggee.
   * Absence of this field indicates no status. The message can be either
   * informational or an error status.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage status = 8;</code>
   */
  com.google.devtools.clouddebugger.v2.StatusMessageOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  java.util.List<com.google.devtools.source.v1.SourceContext> 
      getSourceContextsList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  com.google.devtools.source.v1.SourceContext getSourceContexts(int index);
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  int getSourceContextsCount();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  java.util.List<? extends com.google.devtools.source.v1.SourceContextOrBuilder> 
      getSourceContextsOrBuilderList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  com.google.devtools.source.v1.SourceContextOrBuilder getSourceContextsOrBuilder(
      int index);

  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.google.devtools.source.v1.ExtendedSourceContext> 
      getExtSourceContextsList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.devtools.source.v1.ExtendedSourceContext getExtSourceContexts(int index);
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getExtSourceContextsCount();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.google.devtools.source.v1.ExtendedSourceContextOrBuilder> 
      getExtSourceContextsOrBuilderList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.devtools.source.v1.ExtendedSourceContextOrBuilder getExtSourceContextsOrBuilder(
      int index);

  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
