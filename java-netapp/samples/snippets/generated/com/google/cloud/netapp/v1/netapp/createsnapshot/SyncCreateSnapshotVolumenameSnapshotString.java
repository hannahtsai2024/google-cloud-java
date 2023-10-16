/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.netapp.v1.samples;

// [START netapp_v1_generated_NetApp_CreateSnapshot_VolumenameSnapshotString_sync]
import com.google.cloud.netapp.v1.NetAppClient;
import com.google.cloud.netapp.v1.Snapshot;
import com.google.cloud.netapp.v1.VolumeName;

public class SyncCreateSnapshotVolumenameSnapshotString {

  public static void main(String[] args) throws Exception {
    syncCreateSnapshotVolumenameSnapshotString();
  }

  public static void syncCreateSnapshotVolumenameSnapshotString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetAppClient netAppClient = NetAppClient.create()) {
      VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
      Snapshot snapshot = Snapshot.newBuilder().build();
      String snapshotId = "snapshotId-1113817601";
      Snapshot response = netAppClient.createSnapshotAsync(parent, snapshot, snapshotId).get();
    }
  }
}
// [END netapp_v1_generated_NetApp_CreateSnapshot_VolumenameSnapshotString_sync]
