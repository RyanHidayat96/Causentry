package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.widget.Toast;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import defpackage.AllCapsTransformationMethod;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/google/firebase/sessions/SessionEvents;", "", "<init>", "()V", "Lcom/google/firebase/FirebaseApp;", "p0", "Lcom/google/firebase/sessions/SessionDetails;", "p1", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "p2", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "p3", "", "p4", "p5", "Lcom/google/firebase/sessions/SessionEvent;", "buildSession", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/settings/SessionsSettings;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/sessions/SessionEvent;", "Lcom/google/firebase/sessions/ApplicationInfo;", "getApplicationInfo", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/DataCollectionState;", "toDataCollectionState", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/DataCollectionState;", "Lcom/google/firebase/encoders/DataEncoder;", "SESSION_EVENT_ENCODER", "Lcom/google/firebase/encoders/DataEncoder;", "getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/encoders/DataEncoder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionEvents {
    public static final SessionEvents INSTANCE = new SessionEvents();
    private static final DataEncoder SESSION_EVENT_ENCODER;

    private SessionEvents() {
    }

    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }

    static {
        DataEncoder dataEncoderBuild = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        Intrinsics.checkNotNullExpressionValue(dataEncoderBuild, "");
        SESSION_EVENT_ENCODER = dataEncoderBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionEvent buildSession$default(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map map, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, map, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2);
    }

    public final SessionEvent buildSession(FirebaseApp p0, SessionDetails p1, SessionsSettings p2, Map<SessionSubscriber.Name, ? extends SessionSubscriber> p3, String p4, String p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(p1.getSessionId(), p1.getFirstSessionId(), p1.getSessionIndex(), p1.getSessionStartTimestampUs(), new DataCollectionStatus(toDataCollectionState(p3.get(SessionSubscriber.Name.PERFORMANCE)), toDataCollectionState(p3.get(SessionSubscriber.Name.CRASHLYTICS)), p2.getSamplingRate()), p4, p5), getApplicationInfo(p0));
    }

    public final ApplicationInfo getApplicationInfo(FirebaseApp p0) throws PackageManager.NameNotFoundException {
        String strValueOf;
        Intrinsics.checkNotNullParameter(p0, "");
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        if (AllCapsTransformationMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
            Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
        }
        Context applicationContext = p0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            strValueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = strValueOf;
        String applicationId = p0.getOptions().getApplicationId();
        Intrinsics.checkNotNullExpressionValue(applicationId, "");
        String str2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        String str3 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNull(packageName);
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? str : str4;
        String str6 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str6, "");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        Context applicationContext2 = p0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        ProcessDetails myProcessDetails = processDetailsProvider.getMyProcessDetails(applicationContext2);
        ProcessDetailsProvider processDetailsProvider2 = ProcessDetailsProvider.INSTANCE;
        Context applicationContext3 = p0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
        return new ApplicationInfo(applicationId, str2, BuildConfig.VERSION_NAME, str3, logEnvironment, new AndroidApplicationInfo(packageName, str5, str, str6, myProcessDetails, processDetailsProvider2.getAppProcessDetails(applicationContext3)));
    }

    private final DataCollectionState toDataCollectionState(SessionSubscriber p0) {
        if (p0 == null) {
            return DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (p0.isDataCollectionEnabled()) {
            return DataCollectionState.COLLECTION_ENABLED;
        }
        return DataCollectionState.COLLECTION_DISABLED;
    }
}
