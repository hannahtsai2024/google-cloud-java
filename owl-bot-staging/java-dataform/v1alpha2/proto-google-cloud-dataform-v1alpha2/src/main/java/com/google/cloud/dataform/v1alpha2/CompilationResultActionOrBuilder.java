// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

public interface CompilationResultActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.CompilationResultAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This action's identifier. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target target = 1;</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <pre>
   * This action's identifier. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target target = 1;</code>
   * @return The target.
   */
  com.google.cloud.dataform.v1alpha2.Target getTarget();
  /**
   * <pre>
   * This action's identifier. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target target = 1;</code>
   */
  com.google.cloud.dataform.v1alpha2.TargetOrBuilder getTargetOrBuilder();

  /**
   * <pre>
   * The action's identifier if the project had been compiled without any
   * overrides configured. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target canonical_target = 2;</code>
   * @return Whether the canonicalTarget field is set.
   */
  boolean hasCanonicalTarget();
  /**
   * <pre>
   * The action's identifier if the project had been compiled without any
   * overrides configured. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target canonical_target = 2;</code>
   * @return The canonicalTarget.
   */
  com.google.cloud.dataform.v1alpha2.Target getCanonicalTarget();
  /**
   * <pre>
   * The action's identifier if the project had been compiled without any
   * overrides configured. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target canonical_target = 2;</code>
   */
  com.google.cloud.dataform.v1alpha2.TargetOrBuilder getCanonicalTargetOrBuilder();

  /**
   * <pre>
   * The full path including filename in which this action is located, relative
   * to the workspace root.
   * </pre>
   *
   * <code>string file_path = 3;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <pre>
   * The full path including filename in which this action is located, relative
   * to the workspace root.
   * </pre>
   *
   * <code>string file_path = 3;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <pre>
   * The database relation created/updated by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Relation relation = 4;</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * The database relation created/updated by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Relation relation = 4;</code>
   * @return The relation.
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.Relation getRelation();
  /**
   * <pre>
   * The database relation created/updated by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Relation relation = 4;</code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.RelationOrBuilder getRelationOrBuilder();

  /**
   * <pre>
   * The database operations executed by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Operations operations = 5;</code>
   * @return Whether the operations field is set.
   */
  boolean hasOperations();
  /**
   * <pre>
   * The database operations executed by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Operations operations = 5;</code>
   * @return The operations.
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.Operations getOperations();
  /**
   * <pre>
   * The database operations executed by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Operations operations = 5;</code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.OperationsOrBuilder getOperationsOrBuilder();

  /**
   * <pre>
   * The assertion executed by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Assertion assertion = 6;</code>
   * @return Whether the assertion field is set.
   */
  boolean hasAssertion();
  /**
   * <pre>
   * The assertion executed by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Assertion assertion = 6;</code>
   * @return The assertion.
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.Assertion getAssertion();
  /**
   * <pre>
   * The assertion executed by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Assertion assertion = 6;</code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.AssertionOrBuilder getAssertionOrBuilder();

  /**
   * <pre>
   * The declaration declared by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Declaration declaration = 7;</code>
   * @return Whether the declaration field is set.
   */
  boolean hasDeclaration();
  /**
   * <pre>
   * The declaration declared by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Declaration declaration = 7;</code>
   * @return The declaration.
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.Declaration getDeclaration();
  /**
   * <pre>
   * The declaration declared by this action.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.CompilationResultAction.Declaration declaration = 7;</code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction.DeclarationOrBuilder getDeclarationOrBuilder();

  com.google.cloud.dataform.v1alpha2.CompilationResultAction.CompiledObjectCase getCompiledObjectCase();
}
