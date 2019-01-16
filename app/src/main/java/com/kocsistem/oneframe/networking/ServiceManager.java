//
//
//  Networking-Swagger Code Generate Creater 1.0
//  WorkplaceServiceManager.java
//  Copyright © 2019 OneFrame Mobile - Koçsistem All rights reserved.
//

package com.kocsistem.oneframe;

import com.oneframe.android.networking.NetworkConfig;
import com.oneframe.android.networking.NetworkManager;
import com.oneframe.android.networking.NetworkingFactory;
import com.oneframe.android.networking.listener.NetworkResponseListener;
import com.oneframe.android.networking.volleywrapper.GenericObjectRequest;
import java.util.List;

//{{model_package}}
import com.kocsistem.oneframe.networking.models.ScalesDto;
import com.kocsistem.oneframe.networking.models.CalculatedDiseasesDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListPatientInformationDto;
import com.kocsistem.oneframe.networking.models.NewbornQuestionAnswersDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseApiRegisterResultDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListFsoQuestionAnswersDto;
import com.kocsistem.oneframe.networking.models.NewbornMainDto;
import com.kocsistem.oneframe.networking.models.PatientInfoSetCarePlansDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListParamsDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListPatientClinicDto;
import com.kocsistem.oneframe.networking.models.PediatriQuestionAnswersDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseParamsDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListNewbornAnswerDto;
import com.kocsistem.oneframe.networking.models.ScalesAnswersDto;
import com.kocsistem.oneframe.networking.models.LoginRequest;
import com.kocsistem.oneframe.networking.models.WebApiResponseListNewbornQuestionAnswersDto;
import com.kocsistem.oneframe.networking.models.UserLoginResultDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseUserLoginResultDto;
import com.kocsistem.oneframe.networking.models.UserCreditTransactionSummaryDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseCarePlansDto;
import com.kocsistem.oneframe.networking.models.WebApiResponsePatientInformationDto;
import com.kocsistem.oneframe.networking.models.PatientInformationDto;
import com.kocsistem.oneframe.networking.models.FsoMainDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListPatientInfoSetCarePlansDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListCalculatedDiseasesDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListCarePlansDto;
import com.kocsistem.oneframe.networking.models.PediatriAnswerDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListScalesDto;
import com.kocsistem.oneframe.networking.models.ApiRegisterRequestDto;
import com.kocsistem.oneframe.networking.models.PediatriMainDto;
import com.kocsistem.oneframe.networking.models.CarePlansDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseUserCreditTransactionsDto;
import com.kocsistem.oneframe.networking.models.FsoQuestionAnswersDto;
import com.kocsistem.oneframe.networking.models.ParamsDto;
import com.kocsistem.oneframe.networking.models.WebApiResponsePatientInfoSetCarePlansDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListFsoAnswersDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseUserCreditTransactionSummaryDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListScalesAnswersDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListUserCreditTransactionsDto;
import com.kocsistem.oneframe.networking.models.NewbornAnswerDto;
import com.kocsistem.oneframe.networking.models.ScalesItakiFallDto;
import com.kocsistem.oneframe.networking.models.PatientClinicDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseBoolean;
import com.kocsistem.oneframe.networking.models.UserRegisterDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListScalesItakiFallDto;
import com.kocsistem.oneframe.networking.models.ApiRegisterResultDto;
import com.kocsistem.oneframe.networking.models.UserCreditTransactionsDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListPediatriQuestionAnswersDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListPediatriAnswerDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListNewbornMainDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListFsoMainDto;
import com.kocsistem.oneframe.networking.models.WebApiResponseListPediatriMainDto;
import com.kocsistem.oneframe.networking.models.FsoAnswersDto;

public class WorkplaceServiceManager {

    private static final String RESULT_TAG = "[JSON_KEY]";

    private NetworkManager manager;

    public WorkplaceServiceManager() {
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
public GenericObjectRequest apiFsoSetFsoQuestionAnswersPost(List<FsoQuestionAnswersDto> model, final NetworkResponseListener<WebApiResponseBoolean, ServiceErrorModel> listener) {
         return manager.post("api/Fso/SetFsoQuestionAnswers", model, listener);
     }
public GenericObjectRequest apiFsoGetFsoQuestionAnswersListGet(final NetworkResponseListener<WebApiResponseListFsoQuestionAnswersDto, ServiceErrorModel> listener) {
         return manager.get("api/Fso/GetFsoQuestionAnswersList", listener);
     }
public GenericObjectRequest apiFsoGetFsoQuestionAnswersByPatientInformationIdGet(final NetworkResponseListener<WebApiResponseListFsoQuestionAnswersDto, ServiceErrorModel> listener,Long id) {
         return manager.get("api/Fso/GetFsoQuestionAnswersByPatientInformationId" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiFsoGetFsoListGet(final NetworkResponseListener<WebApiResponseListFsoMainDto, ServiceErrorModel> listener) {
         return manager.get("api/Fso/GetFsoList", listener);
     }
public GenericObjectRequest apiFsoGetFsoAnswersListGet(final NetworkResponseListener<WebApiResponseListFsoAnswersDto, ServiceErrorModel> listener) {
         return manager.get("api/Fso/GetFsoAnswersList", listener);
     }
public GenericObjectRequest apiParamsGetParamsOperationsGet(final NetworkResponseListener<WebApiResponseListParamsDto, ServiceErrorModel> listener) {
         return manager.get("api/Params/GetParamsOperations", listener);
     }
public GenericObjectRequest apiParamsGetParamsInvasiveProcedureGet(final NetworkResponseListener<WebApiResponseListParamsDto, ServiceErrorModel> listener) {
         return manager.get("api/Params/GetParamsInvasiveProcedure", listener);
     }
public GenericObjectRequest apiParamsGetParamsDrugTypeGet(final NetworkResponseListener<WebApiResponseListParamsDto, ServiceErrorModel> listener) {
         return manager.get("api/Params/GetParamsDrugType", listener);
     }
public GenericObjectRequest apiParamsGetParamsDiseasesGet(final NetworkResponseListener<WebApiResponseListParamsDto, ServiceErrorModel> listener) {
         return manager.get("api/Params/GetParamsDiseases", listener);
     }
public GenericObjectRequest apiParamsGetParamsChronicDiseasesGet(final NetworkResponseListener<WebApiResponseListParamsDto, ServiceErrorModel> listener) {
         return manager.get("api/Params/GetParamsChronicDiseases", listener);
     }
public GenericObjectRequest apiParamsGetEcareDbVersionGet(final NetworkResponseListener<WebApiResponseParamsDto, ServiceErrorModel> listener) {
         return manager.get("api/Params/GetEcareDbVersion", listener);
     }
public GenericObjectRequest apiPatientSetSelectedPatientCarePlansPost(PatientInfoSetCarePlansDto model, final NetworkResponseListener<WebApiResponsePatientInfoSetCarePlansDto, ServiceErrorModel> listener) {
         return manager.post("api/Patient/SetSelectedPatientCarePlans", model, listener);
     }
public GenericObjectRequest apiPatientSetPatientInformationPost(PatientInformationDto model, final NetworkResponseListener<WebApiResponsePatientInformationDto, ServiceErrorModel> listener) {
         return manager.post("api/Patient/SetPatientInformation", model, listener);
     }
public GenericObjectRequest apiPatientListPatientInfoSetCarePlansGet(final NetworkResponseListener<WebApiResponseListPatientInfoSetCarePlansDto, ServiceErrorModel> listener) {
         return manager.get("api/Patient/ListPatientInfoSetCarePlans", listener);
     }
public GenericObjectRequest apiPatientListClinicsGet(final NetworkResponseListener<WebApiResponseListPatientClinicDto, ServiceErrorModel> listener) {
         return manager.get("api/Patient/ListClinics", listener);
     }
public GenericObjectRequest apiPatientGetSelectedPatientCarePlansByIdGet(final NetworkResponseListener<WebApiResponsePatientInfoSetCarePlansDto, ServiceErrorModel> listener,Integer patientInformationId,Integer carePlansId) {
         return manager.get("api/Patient/GetSelectedPatientCarePlansById" + "?" + "PatientInformationId=" + patientInformationId + "&" + "CarePlansId=" + carePlansId, listener);
     }
public GenericObjectRequest apiPatientGetPatientInformationListByCreaterGet(final NetworkResponseListener<WebApiResponseListPatientInformationDto, ServiceErrorModel> listener,Long id) {
         return manager.get("api/Patient/GetPatientInformationListByCreater" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiPatientGetPatientInformationByNameGet(final NetworkResponseListener<WebApiResponsePatientInformationDto, ServiceErrorModel> listener,String name) {
         return manager.get("api/Patient/GetPatientInformationByName" + "?" + "name=" + name, listener);
     }
public GenericObjectRequest apiPatientGetPatientInformationByIdGet(final NetworkResponseListener<WebApiResponsePatientInformationDto, ServiceErrorModel> listener,Long id) {
         return manager.get("api/Patient/GetPatientInformationById" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlansListGet(final NetworkResponseListener<WebApiResponseListCarePlansDto, ServiceErrorModel> listener) {
         return manager.get("api/Diagnosis/GetCarePlansList", listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlanByIdGet(final NetworkResponseListener<WebApiResponseCarePlansDto, ServiceErrorModel> listener,Integer id) {
         return manager.get("api/Diagnosis/GetCarePlanById" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlanByDiagnosisNameGet(final NetworkResponseListener<WebApiResponseCarePlansDto, ServiceErrorModel> listener,String name) {
         return manager.get("api/Diagnosis/GetCarePlanByDiagnosisName" + "?" + "name=" + name, listener);
     }
public GenericObjectRequest apiAccountUserRegisterPost(UserRegisterDto model, final NetworkResponseListener<WebApiResponseUserLoginResultDto, ServiceErrorModel> listener) {
         return manager.post("api/Account/UserRegister", model, listener);
     }
public GenericObjectRequest apiAccountLoginPost(LoginRequest model, final NetworkResponseListener<WebApiResponseUserLoginResultDto, ServiceErrorModel> listener) {
         return manager.post("api/Account/Login", model, listener);
     }
public GenericObjectRequest apiAccountForgotPasswordPost(LoginRequest model, final NetworkResponseListener<WebApiResponseBoolean, ServiceErrorModel> listener) {
         return manager.post("api/Account/ForgotPassword", model, listener);
     }
public GenericObjectRequest apiDiseasesGetCalculatedDiseasesGet(final NetworkResponseListener<WebApiResponseListCalculatedDiseasesDto, ServiceErrorModel> listener,Integer patientInformationId,String type) {
         return manager.get("api/Diseases/GetCalculatedDiseases" + "?" + "patientInformationId=" + patientInformationId + "&" + "type=" + type, listener);
     }
public GenericObjectRequest apiUserCreditSetUserCreditTransactionPost(UserCreditTransactionsDto model, final NetworkResponseListener<WebApiResponseUserCreditTransactionsDto, ServiceErrorModel> listener) {
         return manager.post("api/UserCredit/SetUserCreditTransaction", model, listener);
     }
public GenericObjectRequest apiUserCreditListUserCreditTransactionsGet(final NetworkResponseListener<WebApiResponseListUserCreditTransactionsDto, ServiceErrorModel> listener) {
         return manager.get("api/UserCredit/ListUserCreditTransactions", listener);
     }
public GenericObjectRequest apiUserCreditListUserCreditTransactionsByUserGet(final NetworkResponseListener<WebApiResponseListUserCreditTransactionsDto, ServiceErrorModel> listener,Long userId) {
         return manager.get("api/UserCredit/ListUserCreditTransactionsByUser" + "?" + "userId=" + userId, listener);
     }
public GenericObjectRequest apiUserCreditGetUserCreditTransactionSummaryGet(final NetworkResponseListener<WebApiResponseUserCreditTransactionSummaryDto, ServiceErrorModel> listener,Long userId) {
         return manager.get("api/UserCredit/GetUserCreditTransactionSummary" + "?" + "userId=" + userId, listener);
     }
public GenericObjectRequest apiNewbornSetNewbornQuestionAnswersPost(List<NewbornQuestionAnswersDto> model, final NetworkResponseListener<WebApiResponseBoolean, ServiceErrorModel> listener) {
         return manager.post("api/Newborn/SetNewbornQuestionAnswers", model, listener);
     }
public GenericObjectRequest apiNewbornGetNewbornQuestionAnswersListGet(final NetworkResponseListener<WebApiResponseListNewbornQuestionAnswersDto, ServiceErrorModel> listener) {
         return manager.get("api/Newborn/GetNewbornQuestionAnswersList", listener);
     }
public GenericObjectRequest apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet(final NetworkResponseListener<WebApiResponseListNewbornQuestionAnswersDto, ServiceErrorModel> listener,Long id) {
         return manager.get("api/Newborn/GetNewbornQuestionAnswersByPatientInformationId" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiNewbornGetNewbornListGet(final NetworkResponseListener<WebApiResponseListNewbornMainDto, ServiceErrorModel> listener) {
         return manager.get("api/Newborn/GetNewbornList", listener);
     }
public GenericObjectRequest apiNewbornGetNewbornAnswersListGet(final NetworkResponseListener<WebApiResponseListNewbornAnswerDto, ServiceErrorModel> listener) {
         return manager.get("api/Newborn/GetNewbornAnswersList", listener);
     }
public GenericObjectRequest apiSecurityApiRegisterPost(ApiRegisterRequestDto model, final NetworkResponseListener<WebApiResponseApiRegisterResultDto, ServiceErrorModel> listener) {
         return manager.post("api/Security/ApiRegister", model, listener);
     }
public GenericObjectRequest apiScalesGetScalesListGet(final NetworkResponseListener<WebApiResponseListScalesDto, ServiceErrorModel> listener) {
         return manager.get("api/Scales/GetScalesList", listener);
     }
public GenericObjectRequest apiScalesGetScalesItakiFallListGet(final NetworkResponseListener<WebApiResponseListScalesItakiFallDto, ServiceErrorModel> listener) {
         return manager.get("api/Scales/GetScalesItakiFallList", listener);
     }
public GenericObjectRequest apiScalesGetScalesAnswersListGet(final NetworkResponseListener<WebApiResponseListScalesAnswersDto, ServiceErrorModel> listener) {
         return manager.get("api/Scales/GetScalesAnswersList", listener);
     }
public GenericObjectRequest apiPediatriSetPediatriQuestionAnswersPost(List<PediatriQuestionAnswersDto> model, final NetworkResponseListener<WebApiResponseBoolean, ServiceErrorModel> listener) {
         return manager.post("api/Pediatri/SetPediatriQuestionAnswers", model, listener);
     }
public GenericObjectRequest apiPediatriGetPediatriQuestionAnswersListGet(final NetworkResponseListener<WebApiResponseListPediatriQuestionAnswersDto, ServiceErrorModel> listener) {
         return manager.get("api/Pediatri/GetPediatriQuestionAnswersList", listener);
     }
public GenericObjectRequest apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet(final NetworkResponseListener<WebApiResponseListPediatriQuestionAnswersDto, ServiceErrorModel> listener,Long id) {
         return manager.get("api/Pediatri/GetPediatriQuestionAnswersByPatientInformationId" + "?" + "id=" + id, listener);
     }
public GenericObjectRequest apiPediatriGetPediatriListGet(final NetworkResponseListener<WebApiResponseListPediatriMainDto, ServiceErrorModel> listener) {
         return manager.get("api/Pediatri/GetPediatriList", listener);
     }
public GenericObjectRequest apiPediatriGetPediatriAnswersListGet(final NetworkResponseListener<WebApiResponseListPediatriAnswerDto, ServiceErrorModel> listener) {
         return manager.get("api/Pediatri/GetPediatriAnswersList", listener);
     }
}