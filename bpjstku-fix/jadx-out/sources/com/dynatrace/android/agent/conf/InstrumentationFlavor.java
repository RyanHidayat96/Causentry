package com.dynatrace.android.agent.conf;

/* JADX INFO: loaded from: classes3.dex */
public enum InstrumentationFlavor {
    PLAIN("pl"),
    XAMARIN("xm"),
    CORDOVA("cd"),
    FLUTTER("fl"),
    REACT_NATIVE("rn"),
    JETPACK_COMPOSE("jc"),
    MAUI("ma");

    public final String protocolValue;

    InstrumentationFlavor(String str) {
        this.protocolValue = str;
    }
}
