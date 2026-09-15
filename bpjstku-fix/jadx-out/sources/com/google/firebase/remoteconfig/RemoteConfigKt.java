package com.google.firebase.remoteconfig;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import defpackage.EncoderImpl;
import defpackage.clampVideoBitrateIfNotSupported;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\n\u001a\u00020\t2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/CustomSignals$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lcom/google/firebase/remoteconfig/CustomSignals;", RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, "(Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/remoteconfig/CustomSignals;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "remoteConfigSettings", "(Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "get", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", "remoteConfig", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "LclampVideoBitrateIfNotSupported;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)LclampVideoBitrateIfNotSupported;", "configUpdates", "getRemoteConfig", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RemoteConfigKt {
    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebase, "");
        Intrinsics.checkNotNullParameter(firebaseApp, "");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String str) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(str);
        Intrinsics.checkNotNullExpressionValue(value, "");
        return value;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(Function1<? super FirebaseRemoteConfigSettings.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        function1.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfigSettingsBuild, "");
        return firebaseRemoteConfigSettingsBuild;
    }

    public static final CustomSignals customSignals(Function1<? super CustomSignals.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        CustomSignals.Builder builder = new CustomSignals.Builder();
        function1.invoke(builder);
        CustomSignals customSignalsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(customSignalsBuild, "");
        return customSignalsBuild;
    }

    public static final clampVideoBitrateIfNotSupported<ConfigUpdate> getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "");
        return new EncoderImpl(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null), null, 0, null, 14, null);
    }
}
