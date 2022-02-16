package com.codepath.mypizza;

import android.app.Application;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.internal.Log;

public class App extends Application {

   @Override
   public void onCreate() {
      super.onCreate();

      Leanplum.setLogLevel(Log.Level.DEBUG);
      Leanplum.setApplicationContext(this);
      LeanplumActivityHelper.enableLifecycleCallbacks(this);
      if (BuildConfig.DEBUG) {
         Leanplum.setAppIdForDevelopmentMode("app_g8Le44ADv4tHn9M1RGDlDTjXnyWXBrpiBePoTR1GkqY", "dev_hpIWCzFBNmU0FQZbJIXXwaXMhaRj8ypXf6RRUJPTXpU");
      } else {
         Leanplum.setAppIdForProductionMode("app_g8Le44ADv4tHn9M1RGDlDTjXnyWXBrpiBePoTR1GkqY", "prod_WCCMvy9LgQmOoPKcapUTCb4NZJUSO6oS8QiI021ERkY");
      }
      Leanplum.start(this);
   }
}
