/*
 * ECare API
 * ECare Core Web API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.oneframe.android.networking.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * UserCreditTransactionSummaryDto
 */
public class UserCreditTransactionSummaryDto {
  @SerializedName("totalCredit")
  private Double totalCredit = null;

  @SerializedName("userId")
  private Long userId = null;

  public UserCreditTransactionSummaryDto totalCredit(Double totalCredit) {
    this.totalCredit = totalCredit;
    return this;
  }

   /**
   * Get totalCredit
   * @return totalCredit
  **/
  public Double getTotalCredit() {
    return totalCredit;
  }

  public void setTotalCredit(Double totalCredit) {
    this.totalCredit = totalCredit;
  }

  public UserCreditTransactionSummaryDto userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreditTransactionSummaryDto userCreditTransactionSummaryDto = (UserCreditTransactionSummaryDto) o;
    return Objects.equals(this.totalCredit, userCreditTransactionSummaryDto.totalCredit) &&
        Objects.equals(this.userId, userCreditTransactionSummaryDto.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCredit, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreditTransactionSummaryDto {\n");
    
    sb.append("    totalCredit: ").append(toIndentedString(totalCredit)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

