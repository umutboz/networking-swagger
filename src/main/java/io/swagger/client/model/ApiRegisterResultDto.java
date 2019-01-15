/*
 * ECare API
 * ECare Core Web API
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;

/**
 * ApiRegisterResultDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-15T10:03:33.818+03:00[Europe/Istanbul]")public class ApiRegisterResultDto {

  @SerializedName("apiKey")
  private UUID apiKey = null;
  public ApiRegisterResultDto apiKey(UUID apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  

  /**
  * Get apiKey
  * @return apiKey
  **/
  @Schema(description = "")
  public UUID getApiKey() {
    return apiKey;
  }
  public void setApiKey(UUID apiKey) {
    this.apiKey = apiKey;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRegisterResultDto apiRegisterResultDto = (ApiRegisterResultDto) o;
    return Objects.equals(this.apiKey, apiRegisterResultDto.apiKey);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRegisterResultDto {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
