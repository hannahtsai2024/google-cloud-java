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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_FeatureRegistryService_DeleteFeatureGroup_sync]
import com.google.cloud.aiplatform.v1beta1.DeleteFeatureGroupRequest;
import com.google.cloud.aiplatform.v1beta1.FeatureGroupName;
import com.google.cloud.aiplatform.v1beta1.FeatureRegistryServiceClient;
import com.google.protobuf.Empty;

public class SyncDeleteFeatureGroup {

  public static void main(String[] args) throws Exception {
    syncDeleteFeatureGroup();
  }

  public static void syncDeleteFeatureGroup() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FeatureRegistryServiceClient featureRegistryServiceClient =
        FeatureRegistryServiceClient.create()) {
      DeleteFeatureGroupRequest request =
          DeleteFeatureGroupRequest.newBuilder()
              .setName(FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
              .setForce(true)
              .build();
      featureRegistryServiceClient.deleteFeatureGroupAsync(request).get();
    }
  }
}
// [END aiplatform_v1beta1_generated_FeatureRegistryService_DeleteFeatureGroup_sync]
