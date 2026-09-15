package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
public interface ConfigUpdateListener {
    void onError(FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(ConfigUpdate configUpdate);
}
