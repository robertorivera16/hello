package com.example.plugin;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin {



  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

  }

  @Override
  public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

    if (true) {
      String name = data.getString(0);
      String message = "Hello, " + name;
      callbackContext.success(message);

      return true;

    } else {

      callbackContext.error();
      return false;

    }
  }
}
