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
import io.swagger.client.model.UserCreditTransactionsDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * WebApiResponseUserCreditTransactionsDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-15T10:03:33.818+03:00[Europe/Istanbul]")public class WebApiResponseUserCreditTransactionsDto {

  @SerializedName("resultData")
  private UserCreditTransactionsDto resultData = null;

  @SerializedName("resultMessage")
  private String resultMessage = null;

  @SerializedName("resultCode")
  private Integer resultCode = null;

  @SerializedName("extraInfo")
  private String extraInfo = null;
  public WebApiResponseUserCreditTransactionsDto resultData(UserCreditTransactionsDto resultData) {
    this.resultData = resultData;
    return this;
  }

  

  /**
  * Get resultData
  * @return resultData
  **/
  @Schema(description = "")
  public UserCreditTransactionsDto getResultData() {
    return resultData;
  }
  public void setResultData(UserCreditTransactionsDto resultData) {
    this.resultData = resultData;
  }
  public WebApiResponseUserCreditTransactionsDto resultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
    return this;
  }

  

  /**
  * Get resultMessage
  * @return resultMessage
  **/
  @Schema(description = "")
  public String getResultMessage() {
    return resultMessage;
  }
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }
  public WebApiResponseUserCreditTransactionsDto resultCode(Integer resultCode) {
    this.resultCode = resultCode;
    return this;
  }

  

  /**
  * Get resultCode
  * @return resultCode
  **/
  @Schema(description = "")
  public Integer getResultCode() {
    return resultCode;
  }
  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }
  public WebApiResponseUserCreditTransactionsDto extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  

  /**
  * Get extraInfo
  * @return extraInfo
  **/
  @Schema(description = "")
  public String getExtraInfo() {
    return extraInfo;
  }
  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebApiResponseUserCreditTransactionsDto webApiResponseUserCreditTransactionsDto = (WebApiResponseUserCreditTransactionsDto) o;
    return Objects.equals(this.resultData, webApiResponseUserCreditTransactionsDto.resultData) &&
        Objects.equals(this.resultMessage, webApiResponseUserCreditTransactionsDto.resultMessage) &&
        Objects.equals(this.resultCode, webApiResponseUserCreditTransactionsDto.resultCode) &&
        Objects.equals(this.extraInfo, webApiResponseUserCreditTransactionsDto.extraInfo);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(resultData, resultMessage, resultCode, extraInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebApiResponseUserCreditTransactionsDto {\n");
    
    sb.append("    resultData: ").append(toIndentedString(resultData)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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
