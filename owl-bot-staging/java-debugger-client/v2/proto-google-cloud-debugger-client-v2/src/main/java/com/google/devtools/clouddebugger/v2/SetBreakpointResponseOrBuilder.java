// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

public interface SetBreakpointResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.SetBreakpointResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Breakpoint resource.
   * The field `id` is guaranteed to be set (in addition to the echoed fileds).
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   * @return Whether the breakpoint field is set.
   */
  boolean hasBreakpoint();
  /**
   * <pre>
   * Breakpoint resource.
   * The field `id` is guaranteed to be set (in addition to the echoed fileds).
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   * @return The breakpoint.
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint();
  /**
   * <pre>
   * Breakpoint resource.
   * The field `id` is guaranteed to be set (in addition to the echoed fileds).
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder();
}
