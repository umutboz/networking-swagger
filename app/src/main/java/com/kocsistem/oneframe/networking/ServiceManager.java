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
public GenericObjectRequest apiDiagnosisGetCarePlansListGet(final NetworkResponseListener<WebApiResponseListCarePlansDto, ServiceErrorModel> listener) {
         return manager.get(""api/Diagnosis/GetCarePlansList"", listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlanByIdGet(final NetworkResponseListener<WebApiResponseCarePlansDto, ServiceErrorModel> listener) {
         return manager.get(""api/Diagnosis/GetCarePlanById" + "?" + "id=" + id", listener);
     }
public GenericObjectRequest apiDiagnosisGetCarePlanByDiagnosisNameGet(final NetworkResponseListener<WebApiResponseCarePlansDto, ServiceErrorModel> listener) {
         return manager.get(""api/Diagnosis/GetCarePlanByDiagnosisName" + "?" + "name=" + name", listener);
     }
}