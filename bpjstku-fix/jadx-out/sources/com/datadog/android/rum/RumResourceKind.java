package com.datadog.android.rum;

import androidx.core.os.EnvironmentCompat;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/datadog/android/rum/RumResourceKind;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "value", "Ljava/lang/String;", "getValue$dd_sdk_android_rum_release", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "cancel", "asBinder", "a", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "notify"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum RumResourceKind {
    BEACON("beacon"),
    FETCH(RemoteConfigComponent.FETCH_FILE_NAME),
    XHR("xhr"),
    DOCUMENT("document"),
    NATIVE("native"),
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN),
    IMAGE("image"),
    JS("js"),
    FONT("font"),
    CSS("css"),
    MEDIA("media"),
    OTHER("other");

    private final String value;

    RumResourceKind(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: getValue$dd_sdk_android_rum_release, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
