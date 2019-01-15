# networking-swagger-java
@umutboz :electric_plug: Networking JAVA Code Gen Tool :shipit:

#1.0.0

*networking-swagger-java -url -package -serviceName -resultJsonKey*

*networking-swagger-java
http://178.211.54.214:5000/swagger/v1/swagger.json
com.kocsistem.oneframe
Workplace*


#:computer:Output
```java
package com.kocsistem.oneframe;

import com.oneframe.android.networking.NetworkConfig;
import com.oneframe.android.networking.NetworkManager;
import com.oneframe.android.networking.NetworkingFactory;
import com.oneframe.android.networking.listener.NetworkResponseListener;
import com.oneframe.android.networking.volleywrapper.GenericObjectRequest;
import java.util.List;



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


}
```
