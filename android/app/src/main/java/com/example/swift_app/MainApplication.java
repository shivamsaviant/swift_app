package com.example.swift_app;

import com.squareup.sdk.reader.ReaderSdk;
import io.flutter.app.FlutterApplication;
import io.flutter.view.FlutterMain;


public class MainApplication extends FlutterApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        ReaderSdk.initialize(this);
        FlutterMain.startInitialization(this);
    }
}