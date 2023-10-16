/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface FirewallActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.FirewallAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The user request did not match any policy and should be allowed
   * access to the requested resource.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.AllowAction allow = 1;</code>
   *
   * @return Whether the allow field is set.
   */
  boolean hasAllow();
  /**
   *
   *
   * <pre>
   * The user request did not match any policy and should be allowed
   * access to the requested resource.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.AllowAction allow = 1;</code>
   *
   * @return The allow.
   */
  com.google.recaptchaenterprise.v1.FirewallAction.AllowAction getAllow();
  /**
   *
   *
   * <pre>
   * The user request did not match any policy and should be allowed
   * access to the requested resource.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.AllowAction allow = 1;</code>
   */
  com.google.recaptchaenterprise.v1.FirewallAction.AllowActionOrBuilder getAllowOrBuilder();

  /**
   *
   *
   * <pre>
   * This action will deny access to a given page. The user will get an HTTP
   * error code.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.BlockAction block = 2;</code>
   *
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   *
   *
   * <pre>
   * This action will deny access to a given page. The user will get an HTTP
   * error code.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.BlockAction block = 2;</code>
   *
   * @return The block.
   */
  com.google.recaptchaenterprise.v1.FirewallAction.BlockAction getBlock();
  /**
   *
   *
   * <pre>
   * This action will deny access to a given page. The user will get an HTTP
   * error code.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.BlockAction block = 2;</code>
   */
  com.google.recaptchaenterprise.v1.FirewallAction.BlockActionOrBuilder getBlockOrBuilder();

  /**
   *
   *
   * <pre>
   * This action will redirect the request to a ReCaptcha interstitial to
   * attach a token.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.RedirectAction redirect = 5;</code>
   *
   * @return Whether the redirect field is set.
   */
  boolean hasRedirect();
  /**
   *
   *
   * <pre>
   * This action will redirect the request to a ReCaptcha interstitial to
   * attach a token.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.RedirectAction redirect = 5;</code>
   *
   * @return The redirect.
   */
  com.google.recaptchaenterprise.v1.FirewallAction.RedirectAction getRedirect();
  /**
   *
   *
   * <pre>
   * This action will redirect the request to a ReCaptcha interstitial to
   * attach a token.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.RedirectAction redirect = 5;</code>
   */
  com.google.recaptchaenterprise.v1.FirewallAction.RedirectActionOrBuilder getRedirectOrBuilder();

  /**
   *
   *
   * <pre>
   * This action will transparently serve a different page to an offending
   * user.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.SubstituteAction substitute = 3;
   * </code>
   *
   * @return Whether the substitute field is set.
   */
  boolean hasSubstitute();
  /**
   *
   *
   * <pre>
   * This action will transparently serve a different page to an offending
   * user.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.SubstituteAction substitute = 3;
   * </code>
   *
   * @return The substitute.
   */
  com.google.recaptchaenterprise.v1.FirewallAction.SubstituteAction getSubstitute();
  /**
   *
   *
   * <pre>
   * This action will transparently serve a different page to an offending
   * user.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.SubstituteAction substitute = 3;
   * </code>
   */
  com.google.recaptchaenterprise.v1.FirewallAction.SubstituteActionOrBuilder
      getSubstituteOrBuilder();

  /**
   *
   *
   * <pre>
   * This action will set a custom header but allow the request to continue
   * to the customer backend.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.SetHeaderAction set_header = 4;
   * </code>
   *
   * @return Whether the setHeader field is set.
   */
  boolean hasSetHeader();
  /**
   *
   *
   * <pre>
   * This action will set a custom header but allow the request to continue
   * to the customer backend.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.SetHeaderAction set_header = 4;
   * </code>
   *
   * @return The setHeader.
   */
  com.google.recaptchaenterprise.v1.FirewallAction.SetHeaderAction getSetHeader();
  /**
   *
   *
   * <pre>
   * This action will set a custom header but allow the request to continue
   * to the customer backend.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.FirewallAction.SetHeaderAction set_header = 4;
   * </code>
   */
  com.google.recaptchaenterprise.v1.FirewallAction.SetHeaderActionOrBuilder getSetHeaderOrBuilder();

  com.google.recaptchaenterprise.v1.FirewallAction.FirewallActionOneofCase
      getFirewallActionOneofCase();
}
