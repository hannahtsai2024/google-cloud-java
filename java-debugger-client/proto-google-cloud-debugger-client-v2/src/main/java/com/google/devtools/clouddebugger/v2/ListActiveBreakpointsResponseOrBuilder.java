/*
 * Copyright 2020 Google LLC
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
// source: google/devtools/clouddebugger/v2/controller.proto

package com.google.devtools.clouddebugger.v2;

public interface ListActiveBreakpointsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  java.util.List<com.google.devtools.clouddebugger.v2.Breakpoint> getBreakpointsList();
  /**
   *
   *
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoints(int index);
  /**
   *
   *
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  int getBreakpointsCount();
  /**
   *
   *
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  java.util.List<? extends com.google.devtools.clouddebugger.v2.BreakpointOrBuilder>
      getBreakpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token that can be used in the next method call to block until
   * the list of breakpoints changes.
   * </pre>
   *
   * <code>string next_wait_token = 2;</code>
   *
   * @return The nextWaitToken.
   */
  java.lang.String getNextWaitToken();
  /**
   *
   *
   * <pre>
   * A token that can be used in the next method call to block until
   * the list of breakpoints changes.
   * </pre>
   *
   * <code>string next_wait_token = 2;</code>
   *
   * @return The bytes for nextWaitToken.
   */
  com.google.protobuf.ByteString getNextWaitTokenBytes();

  /**
   *
   *
   * <pre>
   * If set to `true`, indicates that there is no change to the
   * list of active breakpoints and the server-selected timeout has expired.
   * The `breakpoints` field would be empty and should be ignored.
   * </pre>
   *
   * <code>bool wait_expired = 3;</code>
   *
   * @return The waitExpired.
   */
  boolean getWaitExpired();
}