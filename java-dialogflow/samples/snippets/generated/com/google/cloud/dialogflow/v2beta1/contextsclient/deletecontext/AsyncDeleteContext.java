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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_contextsclient_deletecontext_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.ContextName;
import com.google.cloud.dialogflow.v2beta1.ContextsClient;
import com.google.cloud.dialogflow.v2beta1.DeleteContextRequest;
import com.google.protobuf.Empty;

public class AsyncDeleteContext {

  public static void main(String[] args) throws Exception {
    asyncDeleteContext();
  }

  public static void asyncDeleteContext() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ContextsClient contextsClient = ContextsClient.create()) {
      DeleteContextRequest request =
          DeleteContextRequest.newBuilder()
              .setName(
                  ContextName.ofProjectSessionContextName("[PROJECT]", "[SESSION]", "[CONTEXT]")
                      .toString())
              .build();
      ApiFuture<Empty> future = contextsClient.deleteContextCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_contextsclient_deletecontext_async]
