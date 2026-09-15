package com.google.firebase.remoteconfig;

import defpackage.getReleasedFuture;
import defpackage.onEncodePaused;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1;", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "p0", "", "onError", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;)V", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "onUpdate", "(Lcom/google/firebase/remoteconfig/ConfigUpdate;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ onEncodePaused<ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    /* JADX WARN: Multi-variable type inference failed */
    RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, onEncodePaused<? super ConfigUpdate> onencodepaused) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = onencodepaused;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$0(onEncodePaused onencodepaused, ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter(onencodepaused, "");
        Intrinsics.checkNotNullParameter(configUpdate, "");
        getReleasedFuture.TuitionPaymentFragmentbindingInflater1(onencodepaused, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void onUpdate(final ConfigUpdate p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
        final onEncodePaused<ConfigUpdate> onencodepaused = this.$$this$callbackFlow;
        firebaseRemoteConfig.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$registration$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RemoteConfigKt$configUpdates$1$registration$1.onUpdate$lambda$0(onencodepaused, p0);
            }
        });
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void onError(FirebaseRemoteConfigException p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        CoroutineScopeKt.b(this.$$this$callbackFlow, "Error listening for config updates.", p0);
    }
}
