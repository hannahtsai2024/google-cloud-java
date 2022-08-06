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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_dataplexserviceclient_updatetask_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.dataplex.v1.DataplexServiceClient;
import com.google.cloud.dataplex.v1.OperationMetadata;
import com.google.cloud.dataplex.v1.Task;
import com.google.cloud.dataplex.v1.UpdateTaskRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateTaskLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateTaskLRO();
  }

  public static void asyncUpdateTaskLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataplexServiceClient dataplexServiceClient = DataplexServiceClient.create()) {
      UpdateTaskRequest request =
          UpdateTaskRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setTask(Task.newBuilder().build())
              .setValidateOnly(true)
              .build();
      OperationFuture<Task, OperationMetadata> future =
          dataplexServiceClient.updateTaskOperationCallable().futureCall(request);
      // Do something.
      Task response = future.get();
    }
  }
}
// [END dataplex_v1_generated_dataplexserviceclient_updatetask_lro_async]
