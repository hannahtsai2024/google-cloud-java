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

package com.google.cloud.vpcaccess.v1.samples;

// [START vpcaccess_v1_generated_vpcaccessserviceclient_deleteconnector_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vpcaccess.v1.ConnectorName;
import com.google.cloud.vpcaccess.v1.DeleteConnectorRequest;
import com.google.cloud.vpcaccess.v1.VpcAccessServiceClient;
import com.google.longrunning.Operation;

public class AsyncDeleteConnector {

  public static void main(String[] args) throws Exception {
    asyncDeleteConnector();
  }

  public static void asyncDeleteConnector() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (VpcAccessServiceClient vpcAccessServiceClient = VpcAccessServiceClient.create()) {
      DeleteConnectorRequest request =
          DeleteConnectorRequest.newBuilder()
              .setName(ConnectorName.of("[PROJECT]", "[LOCATION]", "[CONNECTOR]").toString())
              .build();
      ApiFuture<Operation> future =
          vpcAccessServiceClient.deleteConnectorCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END vpcaccess_v1_generated_vpcaccessserviceclient_deleteconnector_async]
