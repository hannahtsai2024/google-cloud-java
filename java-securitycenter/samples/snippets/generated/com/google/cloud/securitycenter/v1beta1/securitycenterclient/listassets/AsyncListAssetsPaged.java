/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.securitycenter.v1beta1.samples;

// [START securitycenter_v1beta1_generated_securitycenterclient_listassets_paged_async]
import com.google.cloud.securitycenter.v1beta1.ListAssetsRequest;
import com.google.cloud.securitycenter.v1beta1.ListAssetsResponse;
import com.google.cloud.securitycenter.v1beta1.OrganizationName;
import com.google.cloud.securitycenter.v1beta1.SecurityCenterClient;
import com.google.common.base.Strings;
import com.google.protobuf.Duration;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;

public class AsyncListAssetsPaged {

  public static void main(String[] args) throws Exception {
    asyncListAssetsPaged();
  }

  public static void asyncListAssetsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      ListAssetsRequest request =
          ListAssetsRequest.newBuilder()
              .setParent(OrganizationName.of("[ORGANIZATION]").toString())
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .setReadTime(Timestamp.newBuilder().build())
              .setCompareDuration(Duration.newBuilder().build())
              .setFieldMask(FieldMask.newBuilder().build())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      while (true) {
        ListAssetsResponse response = securityCenterClient.listAssetsCallable().call(request);
        for (ListAssetsResponse.ListAssetsResult element : response.getListAssetsResultsList()) {
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
// [END securitycenter_v1beta1_generated_securitycenterclient_listassets_paged_async]