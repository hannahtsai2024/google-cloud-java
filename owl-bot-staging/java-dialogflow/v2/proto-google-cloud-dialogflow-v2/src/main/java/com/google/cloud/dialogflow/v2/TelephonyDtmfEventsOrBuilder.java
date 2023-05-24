// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public interface TelephonyDtmfEventsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.TelephonyDtmfEvents)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   * @return A list containing the dtmfEvents.
   */
  java.util.List<com.google.cloud.dialogflow.v2.TelephonyDtmf> getDtmfEventsList();
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   * @return The count of dtmfEvents.
   */
  int getDtmfEventsCount();
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   * @param index The index of the element to return.
   * @return The dtmfEvents at the given index.
   */
  com.google.cloud.dialogflow.v2.TelephonyDtmf getDtmfEvents(int index);
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   * @return A list containing the enum numeric values on the wire for dtmfEvents.
   */
  java.util.List<java.lang.Integer>
  getDtmfEventsValueList();
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dtmfEvents at the given index.
   */
  int getDtmfEventsValue(int index);
}
