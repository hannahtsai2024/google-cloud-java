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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_MetadataService_ListMetadataSchemas_Paged_async]
import com.google.cloud.aiplatform.v1.ListMetadataSchemasRequest;
import com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse;
import com.google.cloud.aiplatform.v1.MetadataSchema;
import com.google.cloud.aiplatform.v1.MetadataServiceClient;
import com.google.cloud.aiplatform.v1.MetadataStoreName;
import com.google.common.base.Strings;

public class AsyncListMetadataSchemasPaged {

  public static void main(String[] args) throws Exception {
    asyncListMetadataSchemasPaged();
  }

  public static void asyncListMetadataSchemasPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MetadataServiceClient metadataServiceClient = MetadataServiceClient.create()) {
      ListMetadataSchemasRequest request =
          ListMetadataSchemasRequest.newBuilder()
              .setParent(
                  MetadataStoreName.of("[PROJECT]", "[LOCATION]", "[METADATA_STORE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      while (true) {
        ListMetadataSchemasResponse response =
            metadataServiceClient.listMetadataSchemasCallable().call(request);
        for (MetadataSchema element : response.getMetadataSchemasList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END aiplatform_v1_generated_MetadataService_ListMetadataSchemas_Paged_async]
