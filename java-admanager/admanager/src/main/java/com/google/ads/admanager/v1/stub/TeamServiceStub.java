/*
 * Copyright 2024 Google LLC
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

package com.google.ads.admanager.v1.stub;

import static com.google.ads.admanager.v1.TeamServiceClient.ListTeamsPagedResponse;

import com.google.ads.admanager.v1.GetTeamRequest;
import com.google.ads.admanager.v1.ListTeamsRequest;
import com.google.ads.admanager.v1.ListTeamsResponse;
import com.google.ads.admanager.v1.Team;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the TeamService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class TeamServiceStub implements BackgroundResource {

  public UnaryCallable<GetTeamRequest, Team> getTeamCallable() {
    throw new UnsupportedOperationException("Not implemented: getTeamCallable()");
  }

  public UnaryCallable<ListTeamsRequest, ListTeamsPagedResponse> listTeamsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTeamsPagedCallable()");
  }

  public UnaryCallable<ListTeamsRequest, ListTeamsResponse> listTeamsCallable() {
    throw new UnsupportedOperationException("Not implemented: listTeamsCallable()");
  }

  @Override
  public abstract void close();
}
