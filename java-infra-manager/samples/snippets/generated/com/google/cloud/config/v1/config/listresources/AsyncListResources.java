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

package com.google.cloud.config.v1.samples;

// [START config_v1_generated_Config_ListResources_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.config.v1.ConfigClient;
import com.google.cloud.config.v1.ListResourcesRequest;
import com.google.cloud.config.v1.Resource;
import com.google.cloud.config.v1.RevisionName;

public class AsyncListResources {

  public static void main(String[] args) throws Exception {
    asyncListResources();
  }

  public static void asyncListResources() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConfigClient configClient = ConfigClient.create()) {
      ListResourcesRequest request =
          ListResourcesRequest.newBuilder()
              .setParent(
                  RevisionName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[REVISION]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      ApiFuture<Resource> future = configClient.listResourcesPagedCallable().futureCall(request);
      // Do something.
      for (Resource element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END config_v1_generated_Config_ListResources_async]
