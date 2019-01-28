//
//
//  Networking-Swagger Code Generate Creater 1.1
//
//  Copyright © 2019 OneFrame Mobile - Koçsistem All rights reserved.
//

package com.oneframe.android;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.oneframe.android.networking.KocHubServiceManager;
import com.oneframe.android.networking.NetworkConfig;
import com.oneframe.android.networking.NetworkingFactory;
import com.oneframe.android.networking.listener.NetworkResponseListener;
import com.oneframe.android.networking.model.ErrorModel;
import com.oneframe.android.networking.model.ResultModel;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;





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


@RunWith(AndroidJUnit4.class)
public class KocHubNetworkingInstrumentedTest {

    Context context;
    KocHubServiceManager serviceManager;

    @Before
    public void setUp() {
        context = InstrumentationRegistry.getTargetContext();
        NetworkingFactory.init(context);
        NetworkConfig
                .getInstance()
                .enableLog(true);

    }

    //{{unit_test_func}}
    @Test
    public void testapiFsoSetFsoQuestionAnswersPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            List<FsoQuestionAnswersDto> model = new List<FsoQuestionAnswersDto>();
            serviceManager.apiFsoSetFsoQuestionAnswersPost(model, new NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseBoolean> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiFsoGetFsoQuestionAnswersListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiFsoGetFsoQuestionAnswersListGet(new NetworkResponseListener<WebApiResponseListFsoQuestionAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListFsoQuestionAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiFsoGetFsoQuestionAnswersByPatientInformationIdGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiFsoGetFsoQuestionAnswersByPatientInformationIdGet(new NetworkResponseListener<WebApiResponseListFsoQuestionAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListFsoQuestionAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiFsoGetFsoListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiFsoGetFsoListGet(new NetworkResponseListener<WebApiResponseListFsoMainDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListFsoMainDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiFsoGetFsoAnswersListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiFsoGetFsoAnswersListGet(new NetworkResponseListener<WebApiResponseListFsoAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListFsoAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiParamsGetParamsOperationsGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiParamsGetParamsOperationsGet(new NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListParamsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiParamsGetParamsInvasiveProcedureGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiParamsGetParamsInvasiveProcedureGet(new NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListParamsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiParamsGetParamsDrugTypeGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiParamsGetParamsDrugTypeGet(new NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListParamsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiParamsGetParamsDiseasesGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiParamsGetParamsDiseasesGet(new NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListParamsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiParamsGetParamsChronicDiseasesGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiParamsGetParamsChronicDiseasesGet(new NetworkResponseListener<WebApiResponseListParamsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListParamsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiParamsGetEcareDbVersionGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiParamsGetEcareDbVersionGet(new NetworkResponseListener<WebApiResponseParamsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseParamsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPatientSetSelectedPatientCarePlansPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            PatientInfoSetCarePlansDto model = new PatientInfoSetCarePlansDto();
            serviceManager.apiPatientSetSelectedPatientCarePlansPost(model, new NetworkResponseListener<WebApiResponsePatientInfoSetCarePlansDto, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponsePatientInfoSetCarePlansDto> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiPatientSetPatientInformationPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            PatientInformationDto model = new PatientInformationDto();
            serviceManager.apiPatientSetPatientInformationPost(model, new NetworkResponseListener<WebApiResponsePatientInformationDto, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponsePatientInformationDto> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiPatientListPatientInfoSetCarePlansGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPatientListPatientInfoSetCarePlansGet(new NetworkResponseListener<WebApiResponseListPatientInfoSetCarePlansDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListPatientInfoSetCarePlansDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPatientListClinicsGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPatientListClinicsGet(new NetworkResponseListener<WebApiResponseListPatientClinicDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListPatientClinicDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPatientGetSelectedPatientCarePlansByIdGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPatientGetSelectedPatientCarePlansByIdGet(new NetworkResponseListener<WebApiResponsePatientInfoSetCarePlansDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponsePatientInfoSetCarePlansDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1,1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPatientGetPatientInformationListByCreaterGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPatientGetPatientInformationListByCreaterGet(new NetworkResponseListener<WebApiResponseListPatientInformationDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListPatientInformationDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPatientGetPatientInformationByNameGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPatientGetPatientInformationByNameGet(new NetworkResponseListener<WebApiResponsePatientInformationDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponsePatientInformationDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },"test");

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPatientGetPatientInformationByIdGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPatientGetPatientInformationByIdGet(new NetworkResponseListener<WebApiResponsePatientInformationDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponsePatientInformationDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiDiagnosisGetCarePlansListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiDiagnosisGetCarePlansListGet(new NetworkResponseListener<WebApiResponseListCarePlansDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListCarePlansDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiDiagnosisGetCarePlanByIdGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiDiagnosisGetCarePlanByIdGet(new NetworkResponseListener<WebApiResponseCarePlansDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseCarePlansDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiDiagnosisGetCarePlanByDiagnosisNameGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiDiagnosisGetCarePlanByDiagnosisNameGet(new NetworkResponseListener<WebApiResponseCarePlansDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseCarePlansDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },"test");

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiAccountUserRegisterPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            UserRegisterDto model = new UserRegisterDto();
            serviceManager.apiAccountUserRegisterPost(model, new NetworkResponseListener<WebApiResponseUserLoginResultDto, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseUserLoginResultDto> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiAccountLoginPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            LoginRequest model = new LoginRequest();
            serviceManager.apiAccountLoginPost(model, new NetworkResponseListener<WebApiResponseUserLoginResultDto, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseUserLoginResultDto> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiAccountForgotPasswordPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            LoginRequest model = new LoginRequest();
            serviceManager.apiAccountForgotPasswordPost(model, new NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseBoolean> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiDiseasesGetCalculatedDiseasesGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiDiseasesGetCalculatedDiseasesGet(new NetworkResponseListener<WebApiResponseListCalculatedDiseasesDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListCalculatedDiseasesDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1,"test");

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiUserCreditSetUserCreditTransactionPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            UserCreditTransactionsDto model = new UserCreditTransactionsDto();
            serviceManager.apiUserCreditSetUserCreditTransactionPost(model, new NetworkResponseListener<WebApiResponseUserCreditTransactionsDto, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseUserCreditTransactionsDto> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiUserCreditListUserCreditTransactionsGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiUserCreditListUserCreditTransactionsGet(new NetworkResponseListener<WebApiResponseListUserCreditTransactionsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListUserCreditTransactionsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiUserCreditListUserCreditTransactionsByUserGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiUserCreditListUserCreditTransactionsByUserGet(new NetworkResponseListener<WebApiResponseListUserCreditTransactionsDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListUserCreditTransactionsDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiUserCreditGetUserCreditTransactionSummaryGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiUserCreditGetUserCreditTransactionSummaryGet(new NetworkResponseListener<WebApiResponseUserCreditTransactionSummaryDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseUserCreditTransactionSummaryDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiNewbornSetNewbornQuestionAnswersPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            List<NewbornQuestionAnswersDto> model = new List<NewbornQuestionAnswersDto>();
            serviceManager.apiNewbornSetNewbornQuestionAnswersPost(model, new NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseBoolean> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiNewbornGetNewbornQuestionAnswersListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiNewbornGetNewbornQuestionAnswersListGet(new NetworkResponseListener<WebApiResponseListNewbornQuestionAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListNewbornQuestionAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet(new NetworkResponseListener<WebApiResponseListNewbornQuestionAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListNewbornQuestionAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiNewbornGetNewbornListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiNewbornGetNewbornListGet(new NetworkResponseListener<WebApiResponseListNewbornMainDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListNewbornMainDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiNewbornGetNewbornAnswersListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiNewbornGetNewbornAnswersListGet(new NetworkResponseListener<WebApiResponseListNewbornAnswerDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListNewbornAnswerDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiSecurityApiRegisterPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            ApiRegisterRequestDto model = new ApiRegisterRequestDto();
            serviceManager.apiSecurityApiRegisterPost(model, new NetworkResponseListener<WebApiResponseApiRegisterResultDto, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseApiRegisterResultDto> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiScalesGetScalesListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiScalesGetScalesListGet(new NetworkResponseListener<WebApiResponseListScalesDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListScalesDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiScalesGetScalesItakiFallListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiScalesGetScalesItakiFallListGet(new NetworkResponseListener<WebApiResponseListScalesItakiFallDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListScalesItakiFallDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiScalesGetScalesAnswersListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiScalesGetScalesAnswersListGet(new NetworkResponseListener<WebApiResponseListScalesAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListScalesAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPediatriSetPediatriQuestionAnswersPost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            List<PediatriQuestionAnswersDto> model = new List<PediatriQuestionAnswersDto>();
            serviceManager.apiPediatriSetPediatriQuestionAnswersPost(model, new NetworkResponseListener<WebApiResponseBoolean, ErrorModel<String>>() {
                        @Override
                        public void onSuccess(ResultModel<WebApiResponseBoolean> resultModel) {
                            //Log.d("jsonData", resultModel.getJsonObject().get("resultData").toString());
                            Log.d("data", "data : "+ resultModel.getJson());
                            countDownLatch.countDown();
                        }

                        @Override
                        public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                            Log.e("error", errorModel.getErrorModel().getErrorModel());
                            countDownLatch.countDown();
                        }});

            countDownLatch.await();
        }
        catch (Exception ex){
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();

        }
    }

    @Test
    public void testapiPediatriGetPediatriQuestionAnswersListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPediatriGetPediatriQuestionAnswersListGet(new NetworkResponseListener<WebApiResponseListPediatriQuestionAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListPediatriQuestionAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet(new NetworkResponseListener<WebApiResponseListPediatriQuestionAnswersDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListPediatriQuestionAnswersDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            },1);

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPediatriGetPediatriListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPediatriGetPediatriListGet(new NetworkResponseListener<WebApiResponseListPediatriMainDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListPediatriMainDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

    @Test
    public void testapiPediatriGetPediatriAnswersListGet() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            serviceManager = new KocHubServiceManager();
            serviceManager.apiPediatriGetPediatriAnswersListGet(new NetworkResponseListener<WebApiResponseListPediatriAnswerDto, ErrorModel<String>>() {
                @Override
                public void onSuccess(ResultModel<WebApiResponseListPediatriAnswerDto> resultModel) {
                    //Log.d("KocHub", resultModel.getJsonObject().get("resultData").toString());
                    Log.d("KocHub", "response : " + resultModel.getJson());
                    countDownLatch.countDown();
                }

                @Override
                public void onError(ErrorModel<ErrorModel<String>> errorModel) {
                    Log.d("KocHub", "error : " + errorModel.getErrorModel().getErrorModel());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        } catch (Exception ex) {
            Log.e("KocHub", "exception : " + ex.getMessage());
            countDownLatch.countDown();
        }
    }

}