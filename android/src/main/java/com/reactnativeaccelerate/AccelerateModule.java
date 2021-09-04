package com.reactnativeaccelerate;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class AccelerateModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Accelerate";

    public AccelerateModule(ReactApplicationContext reactContext) {
      super(reactContext);
    }

    static {
      System.loadLibrary("example");
    }

    private static native void setup(long jsiPtr);
    private static native void cleanUp();

    @NonNull
    @Override
    public String getName() {
      return NAME;
    }

    @NonNull
    @Override
    public void initialize() {
      super.initialize();

      AccelerateModule.setup(this.getReactApplicationContext().getJavaScriptContextHolder().get());
    }

    @Override
    public void onCatalystInstanceDestroy() {
      AccelerateModule.cleanUp();
    }
}
