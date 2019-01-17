//
//
//  Networking-Swagger Code Generate Creater 1.0
//  KocHubServiceManager.java
//  Copyright © 2019 OneFrame Mobile - Koçsistem All rights reserved.
//

package com.oneframe.android.networking;;

import com.oneframe.android.networking.NetworkConfig;
import com.oneframe.android.networking.NetworkManager;
import com.oneframe.android.networking.NetworkingFactory;
import com.oneframe.android.networking.listener.NetworkResponseListener;
import com.oneframe.android.networking.volleywrapper.GenericObjectRequest;
import com.oneframe.android.networking.model.ErrorModel;
import java.util.List;


//{{model_package}}
import com.oneframe.android.networking.models.ScalesDto;
import com.oneframe.android.networking.models.CalculatedDiseasesDto;
import com.oneframe.android.networking.models.WebApiResponseListPatientInformationDto;
import com.oneframe.android.networking.models.NewbornQuestionAnswersDto;
import com.oneframe.android.networking.models.WebApiResponseApiRegisterResultDto;
import com.oneframe.android.networking.models.WebApiResponseListFsoQuestionAnswersDto;
import com.oneframe.android.networking.models.NewbornMainDto;
import com.oneframe.android.networking.models.PatientInfoSetCarePlansDto;
import com.oneframe.android.networking.models.WebApiResponseListParamsDto;
import com.oneframe.android.networking.models.WebApiResponseListPatientClinicDto;
import com.oneframe.android.networking.models.PediatriQuestionAnswersDto;
import com.oneframe.android.networking.models.WebApiResponseParamsDto;
import com.oneframe.android.networking.models.WebApiResponseListNewbornAnswerDto;
import com.oneframe.android.networking.models.ScalesAnswersDto;
import com.oneframe.android.networking.models.LoginRequest;
import com.oneframe.android.networking.models.WebApiResponseListNewbornQuestionAnswersDto;
import com.oneframe.android.networking.models.UserLoginResultDto;
import com.oneframe.android.networking.models.WebApiResponseUserLoginResultDto;
import com.oneframe.android.networking.models.UserCreditTransactionSummaryDto;
import com.oneframe.android.networking.models.WebApiResponseCarePlansDto;
import com.oneframe.android.networking.models.WebApiResponsePatientInformationDto;
import com.oneframe.android.networking.models.PatientInformationDto;
import com.oneframe.android.networking.models.FsoMainDto;
import com.oneframe.android.networking.models.WebApiResponseListPatientInfoSetCarePlansDto;
import com.oneframe.android.networking.models.WebApiResponseListCalculatedDiseasesDto;
import com.oneframe.android.networking.models.WebApiResponseListCarePlansDto;
import com.oneframe.android.networking.models.PediatriAnswerDto;
import com.oneframe.android.networking.models.WebApiResponseListScalesDto;
import com.oneframe.android.networking.models.ApiRegisterRequestDto;
import com.oneframe.android.networking.models.PediatriMainDto;
import com.oneframe.android.networking.models.CarePlansDto;
import com.oneframe.android.networking.models.WebApiResponseUserCreditTransactionsDto;
import com.oneframe.android.networking.models.FsoQuestionAnswersDto;
import com.oneframe.android.networking.models.ParamsDto;
import com.oneframe.android.networking.models.WebApiResponsePatientInfoSetCarePlansDto;
import com.oneframe.android.networking.models.WebApiResponseListFsoAnswersDto;
import com.oneframe.android.networking.models.WebApiResponseUserCreditTransactionSummaryDto;
import com.oneframe.android.networking.models.WebApiResponseListScalesAnswersDto;
import com.oneframe.android.networking.models.WebApiResponseListUserCreditTransactionsDto;
import com.oneframe.android.networking.models.NewbornAnswerDto;
import com.oneframe.android.networking.models.ScalesItakiFallDto;
import com.oneframe.android.networking.models.PatientClinicDto;
import com.oneframe.android.networking.models.WebApiResponseBoolean;
import com.oneframe.android.networking.models.UserRegisterDto;
import com.oneframe.android.networking.models.WebApiResponseListScalesItakiFallDto;
import com.oneframe.android.networking.models.ApiRegisterResultDto;
import com.oneframe.android.networking.models.UserCreditTransactionsDto;
import com.oneframe.android.networking.models.WebApiResponseListPediatriQuestionAnswersDto;
import com.oneframe.android.networking.models.WebApiResponseListPediatriAnswerDto;
import com.oneframe.android.networking.models.WebApiResponseListNewbornMainDto;
import com.oneframe.android.networking.models.WebApiResponseListFsoMainDto;
import com.oneframe.android.networking.models.WebApiResponseListPediatriMainDto;
import com.oneframe.android.networking.models.FsoAnswersDto;

public class KocHubServiceManager {

    private static final String RESULT_TAG = "[JSON_KEY]";

    private NetworkManager manager;

    public KocHubServiceManager() {
        manager = NetworkingFactory
                .create()
                .setJsonKey(RESULT_TAG);
                //.setNetworkLearning(new AdvancedNetworkLearning());

        NetworkConfig.getInstance().deleteAllHeaders();
        NetworkConfig.getInstance().setURL("http://178.211.54.214:5000/");
        //NetworkConfig.getInstance().setBodyContentType("application/json; charset=utf-8");

        /*
        NetworkConfig
                .getInstance()
                .addHeader("Cache-Control", "no-cache")
                .addHeader("LanguageCode", "en")
                .addErrorCodes(500);
        */
    }

    //{{request_func}}
public GenericObjectRequest apiFsoSetFsoQuestionAnswersPost(List<FsoQuestionAnswersDto> model, final NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>> listener) {
         return manager.post("api/Fso/SetFsoQuestionAnswers", model, listener);
     }
public GenericObjectRequest apiFsoGetFsoQuestionAnswersListGet(final NetworkResponseListener<WebApiResponseListFsoQuestionAnswersDto, ErrorModel<String>> listener) {
         return manager.get("api/Fso/GetFsoQuestionAnswersList", listener);
     }
public GenericObjectRequest apiFsoGetFsoQuestionAnswersByPatientInformationIdGet(final NetworkResponseListener<WebApiResponseListFsoQuestionAnswersDto, ErrorModel<String>> listener,Long id) {
         return manager.get("api/Fso/GetFsoQuestionAnswersByPatientInformationId" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiFsoGetFsoListGet(final NetworkResponseListener<WebApiResponseListFsoMainDto, ErrorModel<String>> listener) {
         return manager.get("api/Fso/GetFsoList", listener);
     }
public GenericObjectRequest apiFsoGetFsoAnswersListGet(final NetworkResponseListener<WebApiResponseListFsoAnswersDto, ErrorModel<String>> listener) {
         return manager.get("api/Fso/GetFsoAnswersList", listener);
     }
public GenericObjectRequest apiParamsGetParamsOperationsGet(final NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>> listener) {
         return manager.get("api/Params/GetParamsOperations", listener);
     }
public GenericObjectRequest apiParamsGetParamsInvasiveProcedureGet(final NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>> listener) {
         return manager.get("api/Params/GetParamsInvasiveProcedure", listener);
     }
public GenericObjectRequest apiParamsGetParamsDrugTypeGet(final NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>> listener) {
         return manager.get("api/Params/GetParamsDrugType", listener);
     }
public GenericObjectRequest apiParamsGetParamsDiseasesGet(final NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>> listener) {
         return manager.get("api/Params/GetParamsDiseases", listener);
     }
public GenericObjectRequest apiParamsGetParamsChronicDiseasesGet(final NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>> listener) {
         return manager.get("api/Params/GetParamsChronicDiseases", listener);
     }
public GenericObjectRequest apiParamsGetEcareDbVersionGet(final NetworkResponseListener<WebApiResponseParamsDto, ErrorModel<String>> listener) {
         return manager.get("api/Params/GetEcareDbVersion", listener);
     }
public GenericObjectRequest apiPatientSetSelectedPatientCarePlansPost(PatientInfoSetCarePlansDto model, final NetworkResponseListener<WebApiResponsePatientInfoSetCarePlansDto, ErrorModel<String>> listener) {
         return manager.post("api/Patient/SetSelectedPatientCarePlans", model, listener);
     }
public GenericObjectRequest apiPatientSetPatientInformationPost(PatientInformationDto model, final NetworkResponseListener<WebApiResponsePatientInformationDto, ErrorModel<String>> listener) {
         return manager.post("api/Patient/SetPatientInformation", model, listener);
     }
public GenericObjectRequest apiPatientListPatientInfoSetCarePlansGet(final NetworkResponseListener<WebApiResponseListPatientInfoSetCarePlansDto, ErrorModel<String>> listener) {
         return manager.get("api/Patient/ListPatientInfoSetCarePlans", listener);
     }
public GenericObjectRequest apiPatientListClinicsGet(final NetworkResponseListener<WebApiResponseListPatientClinicDto, ErrorModel<String>> listener) {
         return manager.get("api/Patient/ListClinics", listener);
     }
public GenericObjectRequest apiPatientGetSelectedPatientCarePlansByIdGet(final NetworkResponseListener<WebApiResponsePatientInfoSetCarePlansDto, ErrorModel<String>> listener,Integer patientInformationId,Integer carePlansId) {
         return manager.get("api/Patient/GetSelectedPatientCarePlansById" + "?" + "PatientInformationId=" + patientInformationId + "&" + "CarePlansId=" + carePlansId, listener);
     }
public GenericObjectRequest apiPatientGetPatientInformationListByCreaterGet(final NetworkResponseListener<WebApiResponseListPatientInformationDto, ErrorModel<String>> listener,Long id) {
         return manager.get("api/Patient/GetPatientInformationListByCreater" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiPatientGetPatientInformationByNameGet(final NetworkResponseListener<WebApiResponsePatientInformationDto, ErrorModel<String>> listener,String name) {
         return manager.get("api/Patient/GetPatientInformationByName" + "?" + "name=" + name, listener);
     }
public GenericObjectRequest apiPatientGetPatientInformationByIdGet(final NetworkResponseListener<WebApiResponsePatientInformationDto, ErrorModel<String>> listener,Long id) {
         return manager.get("api/Patient/GetPatientInformationById" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlansListGet(final NetworkResponseListener<WebApiResponseListCarePlansDto, ErrorModel<String>> listener) {
         return manager.get("api/Diagnosis/GetCarePlansList", listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlanByIdGet(final NetworkResponseListener<WebApiResponseCarePlansDto, ErrorModel<String>> listener,Integer id) {
         return manager.get("api/Diagnosis/GetCarePlanById" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlanByDiagnosisNameGet(final NetworkResponseListener<WebApiResponseCarePlansDto, ErrorModel<String>> listener,String name) {
         return manager.get("api/Diagnosis/GetCarePlanByDiagnosisName" + "?" + "name=" + name, listener);
     }
public GenericObjectRequest apiAccountUserRegisterPost(UserRegisterDto model, final NetworkResponseListener<WebApiResponseUserLoginResultDto, ErrorModel<String>> listener) {
         return manager.post("api/Account/UserRegister", model, listener);
     }
public GenericObjectRequest apiAccountLoginPost(LoginRequest model, final NetworkResponseListener<WebApiResponseUserLoginResultDto, ErrorModel<String>> listener) {
         return manager.post("api/Account/Login", model, listener);
     }
public GenericObjectRequest apiAccountForgotPasswordPost(LoginRequest model, final NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>> listener) {
         return manager.post("api/Account/ForgotPassword", model, listener);
     }
public GenericObjectRequest apiDiseasesGetCalculatedDiseasesGet(final NetworkResponseListener<WebApiResponseListCalculatedDiseasesDto, ErrorModel<String>> listener,Integer patientInformationId,String type) {
         return manager.get("api/Diseases/GetCalculatedDiseases" + "?" + "patientInformationId=" + patientInformationId + "&" + "type=" + type, listener);
     }
public GenericObjectRequest apiUserCreditSetUserCreditTransactionPost(UserCreditTransactionsDto model, final NetworkResponseListener<WebApiResponseUserCreditTransactionsDto, ErrorModel<String>> listener) {
         return manager.post("api/UserCredit/SetUserCreditTransaction", model, listener);
     }
public GenericObjectRequest apiUserCreditListUserCreditTransactionsGet(final NetworkResponseListener<WebApiResponseListUserCreditTransactionsDto, ErrorModel<String>> listener) {
         return manager.get("api/UserCredit/ListUserCreditTransactions", listener);
     }
public GenericObjectRequest apiUserCreditListUserCreditTransactionsByUserGet(final NetworkResponseListener<WebApiResponseListUserCreditTransactionsDto, ErrorModel<String>> listener,Long userId) {
         return manager.get("api/UserCredit/ListUserCreditTransactionsByUser" + "?" + "userId=" + userId, listener);
     }
public GenericObjectRequest apiUserCreditGetUserCreditTransactionSummaryGet(final NetworkResponseListener<WebApiResponseUserCreditTransactionSummaryDto, ErrorModel<String>> listener,Long userId) {
         return manager.get("api/UserCredit/GetUserCreditTransactionSummary" + "?" + "userId=" + userId, listener);
     }
public GenericObjectRequest apiNewbornSetNewbornQuestionAnswersPost(List<NewbornQuestionAnswersDto> model, final NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>> listener) {
         return manager.post("api/Newborn/SetNewbornQuestionAnswers", model, listener);
     }
public GenericObjectRequest apiNewbornGetNewbornQuestionAnswersListGet(final NetworkResponseListener<WebApiResponseListNewbornQuestionAnswersDto, ErrorModel<String>> listener) {
         return manager.get("api/Newborn/GetNewbornQuestionAnswersList", listener);
     }
public GenericObjectRequest apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet(final NetworkResponseListener<WebApiResponseListNewbornQuestionAnswersDto, ErrorModel<String>> listener,Long id) {
         return manager.get("api/Newborn/GetNewbornQuestionAnswersByPatientInformationId" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiNewbornGetNewbornListGet(final NetworkResponseListener<WebApiResponseListNewbornMainDto, ErrorModel<String>> listener) {
         return manager.get("api/Newborn/GetNewbornList", listener);
     }
public GenericObjectRequest apiNewbornGetNewbornAnswersListGet(final NetworkResponseListener<WebApiResponseListNewbornAnswerDto, ErrorModel<String>> listener) {
         return manager.get("api/Newborn/GetNewbornAnswersList", listener);
     }
public GenericObjectRequest apiSecurityApiRegisterPost(ApiRegisterRequestDto model, final NetworkResponseListener<WebApiResponseApiRegisterResultDto, ErrorModel<String>> listener) {
         return manager.post("api/Security/ApiRegister", model, listener);
     }
public GenericObjectRequest apiScalesGetScalesListGet(final NetworkResponseListener<WebApiResponseListScalesDto, ErrorModel<String>> listener) {
         return manager.get("api/Scales/GetScalesList", listener);
     }
public GenericObjectRequest apiScalesGetScalesItakiFallListGet(final NetworkResponseListener<WebApiResponseListScalesItakiFallDto, ErrorModel<String>> listener) {
         return manager.get("api/Scales/GetScalesItakiFallList", listener);
     }
public GenericObjectRequest apiScalesGetScalesAnswersListGet(final NetworkResponseListener<WebApiResponseListScalesAnswersDto, ErrorModel<String>> listener) {
         return manager.get("api/Scales/GetScalesAnswersList", listener);
     }
public GenericObjectRequest apiPediatriSetPediatriQuestionAnswersPost(List<PediatriQuestionAnswersDto> model, final NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>> listener) {
         return manager.post("api/Pediatri/SetPediatriQuestionAnswers", model, listener);
     }
public GenericObjectRequest apiPediatriGetPediatriQuestionAnswersListGet(final NetworkResponseListener<WebApiResponseListPediatriQuestionAnswersDto, ErrorModel<String>> listener) {
         return manager.get("api/Pediatri/GetPediatriQuestionAnswersList", listener);
     }
public GenericObjectRequest apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet(final NetworkResponseListener<WebApiResponseListPediatriQuestionAnswersDto, ErrorModel<String>> listener,Long id) {
         return manager.get("api/Pediatri/GetPediatriQuestionAnswersByPatientInformationId" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiPediatriGetPediatriListGet(final NetworkResponseListener<WebApiResponseListPediatriMainDto, ErrorModel<String>> listener) {
         return manager.get("api/Pediatri/GetPediatriList", listener);
     }
public GenericObjectRequest apiPediatriGetPediatriAnswersListGet(final NetworkResponseListener<WebApiResponseListPediatriAnswerDto, ErrorModel<String>> listener) {
         return manager.get("api/Pediatri/GetPediatriAnswersList", listener);
     }
}