/*
 * Copyright 2021 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.whispersystems.textsecuregcm.configuration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;

public class StripeConfiguration {

  private final String apiKey;
  private final byte[] idempotencyKeyGenerator;

  @JsonCreator
  public StripeConfiguration(
      @JsonProperty("apiKey") final String apiKey,
      @JsonProperty("idempotencyKeyGenerator") final byte[] idempotencyKeyGenerator) {
    this.apiKey = apiKey;
    this.idempotencyKeyGenerator = idempotencyKeyGenerator;
  }

  @NotEmpty
  public String getApiKey() {
    return apiKey;
  }

  @NotEmpty
  public byte[] getIdempotencyKeyGenerator() {
    return idempotencyKeyGenerator;
  }
}
