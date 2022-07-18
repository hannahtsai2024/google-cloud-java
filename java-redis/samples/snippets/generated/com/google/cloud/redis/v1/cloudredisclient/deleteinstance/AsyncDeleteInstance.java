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

package com.google.cloud.redis.v1.samples;

// [START redis_v1_generated_cloudredisclient_deleteinstance_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.redis.v1.CloudRedisClient;
import com.google.cloud.redis.v1.DeleteInstanceRequest;
import com.google.cloud.redis.v1.InstanceName;
import com.google.longrunning.Operation;

public class AsyncDeleteInstance {

  public static void main(String[] args) throws Exception {
    asyncDeleteInstance();
  }

  public static void asyncDeleteInstance() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
      DeleteInstanceRequest request =
          DeleteInstanceRequest.newBuilder()
              .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .build();
      ApiFuture<Operation> future = cloudRedisClient.deleteInstanceCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END redis_v1_generated_cloudredisclient_deleteinstance_async]