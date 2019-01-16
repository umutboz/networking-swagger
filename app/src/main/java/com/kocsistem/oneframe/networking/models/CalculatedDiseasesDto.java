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


package com.kocsistem.oneframe.networking.models

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CalculatedDiseasesDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-16T02:53:50.763+03:00")
public class CalculatedDiseasesDto {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("formAnswer")
  private String formAnswer = null;

  @SerializedName("mapAnswer")
  private String mapAnswer = null;

  @SerializedName("mapQuestion")
  private String mapQuestion = null;

  @SerializedName("patientInformationId")
  private Long patientInformationId = null;

  @SerializedName("diseasesId")
  private Integer diseasesId = null;

  @SerializedName("rate")
  private Integer rate = null;

  @SerializedName("diseases")
  private String diseases = null;

  public CalculatedDiseasesDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CalculatedDiseasesDto formAnswer(String formAnswer) {
    this.formAnswer = formAnswer;
    return this;
  }

   /**
   * Get formAnswer
   * @return formAnswer
  **/
  @ApiModelProperty(value = "")
  public String getFormAnswer() {
    return formAnswer;
  }

  public void setFormAnswer(String formAnswer) {
    this.formAnswer = formAnswer;
  }

  public CalculatedDiseasesDto mapAnswer(String mapAnswer) {
    this.mapAnswer = mapAnswer;
    return this;
  }

   /**
   * Get mapAnswer
   * @return mapAnswer
  **/
  @ApiModelProperty(value = "")
  public String getMapAnswer() {
    return mapAnswer;
  }

  public void setMapAnswer(String mapAnswer) {
    this.mapAnswer = mapAnswer;
  }

  public CalculatedDiseasesDto mapQuestion(String mapQuestion) {
    this.mapQuestion = mapQuestion;
    return this;
  }

   /**
   * Get mapQuestion
   * @return mapQuestion
  **/
  @ApiModelProperty(value = "")
  public String getMapQuestion() {
    return mapQuestion;
  }

  public void setMapQuestion(String mapQuestion) {
    this.mapQuestion = mapQuestion;
  }

  public CalculatedDiseasesDto patientInformationId(Long patientInformationId) {
    this.patientInformationId = patientInformationId;
    return this;
  }

   /**
   * Get patientInformationId
   * @return patientInformationId
  **/
  @ApiModelProperty(value = "")
  public Long getPatientInformationId() {
    return patientInformationId;
  }

  public void setPatientInformationId(Long patientInformationId) {
    this.patientInformationId = patientInformationId;
  }

  public CalculatedDiseasesDto diseasesId(Integer diseasesId) {
    this.diseasesId = diseasesId;
    return this;
  }

   /**
   * Get diseasesId
   * @return diseasesId
  **/
  @ApiModelProperty(value = "")
  public Integer getDiseasesId() {
    return diseasesId;
  }

  public void setDiseasesId(Integer diseasesId) {
    this.diseasesId = diseasesId;
  }

  public CalculatedDiseasesDto rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public CalculatedDiseasesDto diseases(String diseases) {
    this.diseases = diseases;
    return this;
  }

   /**
   * Get diseases
   * @return diseases
  **/
  @ApiModelProperty(value = "")
  public String getDiseases() {
    return diseases;
  }

  public void setDiseases(String diseases) {
    this.diseases = diseases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatedDiseasesDto calculatedDiseasesDto = (CalculatedDiseasesDto) o;
    return Objects.equals(this.id, calculatedDiseasesDto.id) &&
        Objects.equals(this.formAnswer, calculatedDiseasesDto.formAnswer) &&
        Objects.equals(this.mapAnswer, calculatedDiseasesDto.mapAnswer) &&
        Objects.equals(this.mapQuestion, calculatedDiseasesDto.mapQuestion) &&
        Objects.equals(this.patientInformationId, calculatedDiseasesDto.patientInformationId) &&
        Objects.equals(this.diseasesId, calculatedDiseasesDto.diseasesId) &&
        Objects.equals(this.rate, calculatedDiseasesDto.rate) &&
        Objects.equals(this.diseases, calculatedDiseasesDto.diseases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, formAnswer, mapAnswer, mapQuestion, patientInformationId, diseasesId, rate, diseases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatedDiseasesDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    formAnswer: ").append(toIndentedString(formAnswer)).append("\n");
    sb.append("    mapAnswer: ").append(toIndentedString(mapAnswer)).append("\n");
    sb.append("    mapQuestion: ").append(toIndentedString(mapQuestion)).append("\n");
    sb.append("    patientInformationId: ").append(toIndentedString(patientInformationId)).append("\n");
    sb.append("    diseasesId: ").append(toIndentedString(diseasesId)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    diseases: ").append(toIndentedString(diseases)).append("\n");
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
