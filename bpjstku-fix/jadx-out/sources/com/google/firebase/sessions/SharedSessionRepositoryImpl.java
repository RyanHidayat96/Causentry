package com.google.firebase.sessions;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.content.core.DataStore;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.mlkit.common.MlKitException;
import defpackage.abortCapture;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.getExtraEncoderProfiles;
import defpackage.getRealtimeCaptureLatency;
import defpackage.handleStopped;
import defpackage.initSession;
import defpackage.isSamsungJ6;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
@getExtraEncoderProfiles
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0001\u0018\u00002\u00020\u0001:\u0001?BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u000b8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001b8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\"\u00107\u001a\u00020\u00188\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "p0", "Lcom/google/firebase/sessions/SessionGenerator;", "p1", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "p2", "Lcom/google/firebase/sessions/TimeProvider;", "p3", "Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/SessionData;", "p4", "Lcom/google/firebase/sessions/ProcessDataManager;", "p5", "Lkotlin/coroutines/CoroutineContext;", "p6", "<init>", "(Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/SessionGenerator;Lcom/google/firebase/sessions/SessionFirelogPublisher;Lcom/google/firebase/sessions/TimeProvider;Landroidx/datastore/core/DataStore;Lcom/google/firebase/sessions/ProcessDataManager;Lkotlin/coroutines/CoroutineContext;)V", "", "appBackground", "()V", "appForeground", "", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "notifySubscribers", "(Ljava/lang/String;Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSessionExpired", "(Lcom/google/firebase/sessions/SessionData;)Z", "isColdStart", "isMyProcessStale", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "sessionDataStore", "Landroidx/datastore/core/DataStore;", "processDataManager", "Lcom/google/firebase/sessions/ProcessDataManager;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "localSessionData", "Lcom/google/firebase/sessions/SessionData;", "getLocalSessionData$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SessionData;", "setLocalSessionData$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;)V", "isInForeground", "Z", "()Z", "previousNotificationType", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;)V", "previousSessionId", "Ljava/lang/String;", "NotificationType"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {
    private final CoroutineContext backgroundDispatcher;
    private boolean isInForeground;
    public SessionData localSessionData;
    private NotificationType previousNotificationType;
    private String previousSessionId;
    private final ProcessDataManager processDataManager;
    private final DataStore<SessionData> sessionDataStore;
    private final SessionFirelogPublisher sessionFirelogPublisher;
    private final SessionGenerator sessionGenerator;
    private final SessionsSettings sessionsSettings;
    private final TimeProvider timeProvider;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @isSamsungJ6
    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore<SessionData> dataStore, ProcessDataManager processDataManager, @Background CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(sessionsSettings, "");
        Intrinsics.checkNotNullParameter(sessionGenerator, "");
        Intrinsics.checkNotNullParameter(sessionFirelogPublisher, "");
        Intrinsics.checkNotNullParameter(timeProvider, "");
        Intrinsics.checkNotNullParameter(dataStore, "");
        Intrinsics.checkNotNullParameter(processDataManager, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = dataStore;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = coroutineContext;
        this.previousNotificationType = NotificationType.GENERAL;
        this.previousSessionId = "";
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(coroutineContext), null, null, new AnonymousClass1(null), 3, null);
    }

    public final SessionData getLocalSessionData$com_google_firebase_firebase_sessions() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(SessionData sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "");
        this.localSessionData = sessionData;
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    static final class C07071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private static final byte[] $$c = {7, 15, 25, 25};
        private static final int $$f = 254;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {106, -22, 107, 95, -14, 0, Base64.padSymbol, -56, 1, -21, 17, -5, -13, 6, 55, -53, -15, 8, -16, 1, 4, 3, 52, -70, -5, 6, Base64.padSymbol, -65, -4, 9, -3, -9, 60, -32, -37, -1, 5, 17, -15, -20, 6, 36, -51, 15, -11, -8, 78, -77, -1, 24, -32, 15, -15, -7, 16, -4, -19, 78, -64};
        private static final int $$e = 156;
        private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 80;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2623068683951316082L;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.firebase.sessions.SharedSessionRepositoryImpl.C07071.$$a
                int r9 = 53 - r9
                int r8 = r8 * 52
                int r8 = 56 - r8
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r8
                r3 = r9
                r5 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                r6 = r8
                r8 = r7
                r7 = r6
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2d:
                int r8 = r8 + 1
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-10)
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C07071.a(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 55
                int r8 = 59 - r8
                int r6 = r6 * 55
                int r0 = r6 + 1
                byte[] r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.C07071.$$d
                int r7 = r7 + 98
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r3 = r3 + 1
                int r7 = -r7
                int r8 = r8 + r7
                int r7 = r8 + (-2)
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C07071.c(int, int, byte, java.lang.Object[]):void");
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            int i3 = $11 + 7;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (abortcapture.b < cArrB.length) {
                int i5 = $10 + 91;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i7 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64838), 1355 - MotionEvent.axisFromString(""), 38 - (KeyEvent.getMaxKeyCode() >> 16), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - ((byte) KeyEvent.getModifierMetaStateMask())), Color.blue(0) + 468, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        }

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "sessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C01551 extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return SessionData.copy$default((SessionData) this.L$0, null, this.this$0.timeProvider.currentTime(), null, 5, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01551(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super C01551> continuation) {
                super(2, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01551 c01551 = new C01551(this.this$0, continuation);
                c01551.L$0 = obj;
                return c01551;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((C01551) create(sessionData, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (SharedSessionRepositoryImpl.this.sessionDataStore.updateData(new C01551(SharedSessionRepositoryImpl.this, null), this) == coroutine_suspended) {
                        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                        int i4 = i3 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i4;
                        int i5 = i3 % 2;
                        int i6 = i4 + 95;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 14 / 0;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = TuitionPaymentFragmentbindingInflater1 + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e2) {
                e2.getMessage();
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(sharedSessionRepositoryImpl.getLocalSessionData$com_google_firebase_firebase_sessions(), null, SharedSessionRepositoryImpl.this.timeProvider.currentTime(), null, 5, null));
            }
            Unit unit = Unit.INSTANCE;
            int i10 = TuitionPaymentFragmentbindingInflater1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x022a  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            C07071 c07071 = (C07071) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 31485);
                int maximumDrawingCacheSize = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b = $$a[7];
                Object[] objArr2 = new Object[1];
                a(b, b, (byte) 52, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, maximumDrawingCacheSize, keyRepeatTimeout, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new char[]{57473, 7041, 57333, 57568, 9527, 37383, 52289, 47357, 51022, 43616, 58593, 57409, 44974, 49882, 48331, 51612, 38424, 6970, 21809, 12746, 32364, 13226, 28105, 6496, 9922, 19426}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new char[]{36153, 48437, 55943, 36188, 54920, 13489, 51510, 19264, 43754, 3288, 57747, 4994, 49692, 25724, 47611, 14852, 64432, 48528, 20562}, (-1) - Process.getGidForName(""), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                byte[] bArr = $$a;
                byte b2 = bArr[80];
                Object[] objArr5 = new Object[1];
                a(b2, bArr[7], b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, windowTouchSlop, iIndexOf, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                    int i4 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[80];
                    Object[] objArr6 = new Object[1];
                    a(b3, b3, (byte) (-bArr2[33]), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, maximumDrawingCacheSize2, i4, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iNextInt = new Random().nextInt();
                int i5 = ~iNextInt;
                int i6 = 1798927092 + (((~((-1073118338) | i5)) | (~(1073217179 | iNextInt))) * (-831)) + ((~((-372255874) | iNextInt)) * (-1662)) + (((~(iNextInt | 1073118337)) | (~(i5 | (-700961307))) | (~(700961306 | iNextInt))) * 831) + 1307222754;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(new char[]{225, 50534, 11149, 128, 4894, 19680, 14393, 36564, 10030, 29831, 4249, 54888, 20416, 7230, 18669, 65480, 30272, 50637, 41289, 2031, 40471, 60775, 39337, 12127, 50837, 38150, 61967, 28835, 60736, 45738}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(new char[]{7822, 15185, 20486, 7917, 37955, 45772, 17316, 2441, 14667, 35511, 27394, 20826, 20926, 57865, 13178, 30930, 26637, 15352, 56002, 32946, 32865, 4951}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i9 = TuitionPaymentFragmentbindingInflater1 + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                        int i10 = i9 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i11 = TuitionPaymentFragmentbindingInflater1 + 75;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            int i12 = i11 % 2;
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                b(new char[]{25414, 43824, 60431, 25388, 41108, 8889, 65449, 15693, 17608, 6868, 55070, 26018, 11361, 29238, 36684, 19477, 5589, 43916, 26330, 46177}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(new char[]{64986, 45627, 21229, 64947, 13417, 15287, 16728, 43455, 55822, 986, 27113, 61768, 45778, 27506, 12686, 55545, 35705, 45724, 55353, 8340}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i13 = TuitionPaymentFragmentbindingInflater1 + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                int i14 = i13 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1307222754};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[8];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[5];
                    byte b7 = b6;
                    Object[] objArr14 = new Object[1];
                    c(b6, b7, b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
                        int iGreen = Color.green(0) + 921;
                        int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[80];
                        Object[] objArr15 = new Object[1];
                        a(b8, b8, (byte) (-bArr4[33]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, iGreen, fadingEdgeLength, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        b(new char[]{57473, 7041, 57333, 57568, 9527, 37383, 52289, 47357, 51022, 43616, 58593, 57409, 44974, 49882, 48331, 51612, 38424, 6970, 21809, 12746, 32364, 13226, 28105, 6496, 9922, 19426}, KeyEvent.getMaxKeyCode() >> 16, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        b(new char[]{36153, 48437, 55943, 36188, 54920, 13489, 51510, 19264, 43754, 3288, 57747, 4994, 49692, 25724, 47611, 14852, 64432, 48528, 20562}, ExpandableListView.getPackedPositionGroup(0L), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char longPressTimeout2 = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            int i15 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[80];
                            Object[] objArr18 = new Object[1];
                            a(b9, bArr5[7], b9, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout2, i15, iIndexOf2, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                            int keyRepeatDelay = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                            byte b10 = $$a[7];
                            Object[] objArr19 = new Object[1];
                            a(b10, b10, (byte) 52, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, keyRepeatDelay, iResolveOpacity, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[3])[0];
            if (i17 != i16) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        int i19 = i18 % 2;
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i17));
            }
            int i20 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i21 = ~((int) Process.getElapsedCpuTime());
            int i22 = ~(376891132 | i21);
            int i23 = i20 + 1650796963 + ((i22 | 1397188511) * 764) + (((~(i21 | 1397188511)) | 70287456) * (-1528)) + ((1160872291 | i22) * 764);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr20[0])[0] = i25 ^ (i25 << 5);
            int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            TuitionPaymentFragmentbindingInflater1 = i26 % 128;
            int i27 = i26 % 2;
            return c07071.invokeSuspend(unit);
        }

        C07071(Continuation<? super C07071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            C07071 c07071 = SharedSessionRepositoryImpl.this.new C07071(continuation);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return c07071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return invoke2(coroutineScope2, continuation2);
            }
            invoke2(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r5, short r6, int r7) {
            /*
                int r6 = r6 * 2
                int r0 = 1 - r6
                int r7 = r7 * 2
                int r7 = 107 - r7
                int r5 = r5 * 2
                int r5 = 4 - r5
                byte[] r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.C07071.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L19
                r4 = r7
                r3 = r2
                r7 = r6
                goto L29
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L25:
                int r3 = r3 + 1
                r4 = r1[r5]
            L29:
                int r7 = r7 + r4
                int r5 = r5 + 1
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C07071.$$g(byte, short, int):java.lang.String");
        }
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public final boolean getIsInForeground() {
        return this.isInForeground;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "FALLBACK"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum NotificationType {
        GENERAL,
        FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<NotificationType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", i = {0, 0}, l = {199}, m = "notifySubscribers", n = {"sessionId", "type"}, s = {"L$0", "L$1"})
    public static final class C07091 extends ContinuationImpl {
        private static int $10 = 0;
        private static int $11 = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        private static final byte[] $$a = {23, -73, 107, 5};
        private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long b = 7567319531247011490L;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 + 4
                byte[] r0 = com.google.firebase.sessions.SharedSessionRepositoryImpl.C07091.$$a
                int r7 = r7 * 3
                int r1 = r7 + 1
                int r5 = r5 * 4
                int r5 = r5 + 98
                byte[] r1 = new byte[r1]
                r2 = -1
                if (r0 != 0) goto L14
                r5 = r6
                r3 = r7
                goto L2b
            L14:
                r4 = r6
                r6 = r5
                r5 = r4
            L17:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r1[r2] = r3
                int r5 = r5 + 1
                if (r2 != r7) goto L29
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r1, r6)
                r8[r6] = r5
                return
            L29:
                r3 = r0[r5]
            L2b:
                int r6 = r6 + r3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C07091.c(short, int, int, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i4 = $11 + 111;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19472), 2624 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 39422), Color.blue(0) + 481, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i7 = $11 + 59;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            int i9 = $11 + 49;
            $10 = i9 % 128;
            while (true) {
                int i10 = i9 % 2;
                do {
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        objArr[0] = new String(cArr2);
                        return;
                    }
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 481 - (ViewConfiguration.getScrollBarSize() >> 8), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i2 = $11 + 19;
                    $10 = i2 % 128;
                } while (i2 % 2 == 0);
                i9 = 3;
            }
        }

        C07091(Continuation<? super C07091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objNotifySubscribers = SharedSessionRepositoryImpl.this.notifySubscribers(null, null, this);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return objNotifySubscribers;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int r22, int r23) {
            /*
                Method dump skipped, instruction units count: 1826
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C07091.TuitionPaymentFragmentspecialinlinedviewModeldefault2(int, int):java.lang.Object[]");
        }
    }

    /* JADX INFO: renamed from: getPreviousNotificationType$com_google_firebase_firebase_sessions, reason: from getter */
    public final NotificationType getPreviousNotificationType() {
        return this.previousNotificationType;
    }

    public final void setPreviousNotificationType$com_google_firebase_firebase_sessions(NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(notificationType, "");
        this.previousNotificationType = notificationType;
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                handleStopped.b bVar = new handleStopped.b(SharedSessionRepositoryImpl.this.sessionDataStore.getData(), new C01541(SharedSessionRepositoryImpl.this, null));
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                this.label = 1;
                if (bVar.collect(new addSignalEosTimeoutIfNeeded() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // defpackage.addSignalEosTimeoutIfNeeded
                    public final /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SessionData) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SessionData sessionData, Continuation<? super Unit> continuation) {
                        sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(sessionData);
                        Object objNotifySubscribers = sharedSessionRepositoryImpl.notifySubscribers(sessionData.getSessionDetails().getSessionId(), NotificationType.GENERAL, continuation);
                        return objNotifySubscribers == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifySubscribers : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/google/firebase/sessions/SessionData;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        static final class C01541 extends SuspendLambda implements Function3<addSignalEosTimeoutIfNeeded<? super SessionData>, Throwable, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = (addSignalEosTimeoutIfNeeded) this.L$0;
                    Throwable th = (Throwable) this.L$1;
                    SessionData sessionData = new SessionData(this.this$0.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    th.getMessage();
                    sessionData.getSessionDetails().getSessionId();
                    this.L$0 = null;
                    this.label = 1;
                    if (addsignaleostimeoutifneeded.emit(sessionData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01541(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super C01541> continuation) {
                super(3, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(addSignalEosTimeoutIfNeeded<? super SessionData> addsignaleostimeoutifneeded, Throwable th, Continuation<? super Unit> continuation) {
                C01541 c01541 = new C01541(this.this$0, continuation);
                c01541.L$0 = addsignaleostimeoutifneeded;
                c01541.L$1 = th;
                return c01541.invokeSuspend(Unit.INSTANCE);
            }
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void appBackground() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            return;
        }
        this.processDataManager.getMyProcessName();
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new C07071(null), 3, null);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void appForeground() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            return;
        }
        SessionData localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        this.processDataManager.getMyProcessName();
        if (isSessionExpired(localSessionData$com_google_firebase_firebase_sessions) || isMyProcessStale(localSessionData$com_google_firebase_firebase_sessions)) {
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new C07081(localSessionData$com_google_firebase_firebase_sessions, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", i = {}, l = {135, 186}, m = "invokeSuspend", n = {}, s = {})
    static final class C07081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionData $sessionData;
        int label;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r9.this$0.sessionDataStore.updateData(new com.google.firebase.sessions.SharedSessionRepositoryImpl.C07081.C01561(r9.this$0, null), r9) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        
            if (r9.this$0.notifySubscribers(r10.getSessionId(), com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.FALLBACK, r9) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r10)
                goto L89
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L3e
                goto L89
            L1f:
                kotlin.ResultKt.throwOnFailure(r10)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L3e
                androidx.datastore.core.DataStore r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionDataStore$p(r10)     // Catch: java.lang.Exception -> L3e
                com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 r1 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1     // Catch: java.lang.Exception -> L3e
                com.google.firebase.sessions.SharedSessionRepositoryImpl r4 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L3e
                r5 = 0
                r1.<init>(r4, r5)     // Catch: java.lang.Exception -> L3e
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Exception -> L3e
                r4 = r9
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Exception -> L3e
                r9.label = r3     // Catch: java.lang.Exception -> L3e
                java.lang.Object r10 = r10.updateData(r1, r4)     // Catch: java.lang.Exception -> L3e
                if (r10 != r0) goto L89
                goto L88
            L3e:
                r10 = move-exception
                r10.getMessage()
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r1 = r9.$sessionData
                boolean r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$isSessionExpired(r10, r1)
                if (r10 == 0) goto L89
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionGenerator r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionGenerator$p(r10)
                com.google.firebase.sessions.SessionData r1 = r9.$sessionData
                com.google.firebase.sessions.SessionDetails r1 = r1.getSessionDetails()
                com.google.firebase.sessions.SessionDetails r10 = r10.generateNewSession(r1)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r3 = r9.$sessionData
                r5 = 0
                r6 = 0
                r7 = 4
                r8 = 0
                r4 = r10
                com.google.firebase.sessions.SessionData r3 = com.google.firebase.sessions.SessionData.copy$default(r3, r4, r5, r6, r7, r8)
                r1.setLocalSessionData$com_google_firebase_firebase_sessions(r3)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionFirelogPublisher r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionFirelogPublisher$p(r1)
                r1.mayLogSession(r10)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                java.lang.String r10 = r10.getSessionId()
                com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r3 = com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.FALLBACK
                r4 = r9
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r9.label = r2
                java.lang.Object r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$notifySubscribers(r1, r10, r3, r4)
                if (r10 != r0) goto L89
            L88:
                return r0
            L89:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C07081.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C01561 extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Map<String, ProcessData> mapUpdateProcessDataMap;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    SessionData sessionData = (SessionData) this.L$0;
                    boolean zIsSessionExpired = this.this$0.isSessionExpired(sessionData);
                    boolean zIsColdStart = this.this$0.isColdStart(sessionData);
                    boolean zIsMyProcessStale = this.this$0.isMyProcessStale(sessionData);
                    if (zIsColdStart) {
                        mapUpdateProcessDataMap = this.this$0.processDataManager.generateProcessDataMap();
                    } else {
                        mapUpdateProcessDataMap = zIsMyProcessStale ? this.this$0.processDataManager.updateProcessDataMap(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                    }
                    SessionDetails sessionDetails = zIsColdStart ? null : sessionData.getSessionDetails();
                    if (!zIsSessionExpired && !zIsColdStart) {
                        return zIsMyProcessStale ? SessionData.copy$default(sessionData, null, null, this.this$0.processDataManager.updateProcessDataMap(mapUpdateProcessDataMap), 3, null) : sessionData;
                    }
                    SessionDetails sessionDetailsGenerateNewSession = this.this$0.sessionGenerator.generateNewSession(sessionDetails);
                    this.this$0.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                    this.this$0.processDataManager.onSessionGenerated();
                    return sessionData.copy(sessionDetailsGenerateNewSession, null, mapUpdateProcessDataMap);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01561(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super C01561> continuation) {
                super(2, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01561 c01561 = new C01561(this.this$0, continuation);
                c01561.L$0 = obj;
                return c01561;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((C01561) create(sessionData, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07081(SessionData sessionData, Continuation<? super C07081> continuation) {
            super(2, continuation);
            this.$sessionData = sessionData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new C07081(this.$sessionData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object notifySubscribers(String str, NotificationType notificationType, Continuation<? super Unit> continuation) {
        C07091 c07091;
        if (continuation instanceof C07091) {
            c07091 = (C07091) continuation;
            if ((c07091.label & Integer.MIN_VALUE) != 0) {
                c07091.label -= Integer.MIN_VALUE;
            } else {
                c07091 = new C07091(continuation);
            }
        } else {
            c07091 = new C07091(continuation);
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = c07091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07091.label;
        if (i == 0) {
            ResultKt.throwOnFailure(registeredSubscribers$com_google_firebase_firebase_sessions);
            this.previousNotificationType = notificationType;
            if (Intrinsics.areEqual(this.previousSessionId, str)) {
                return Unit.INSTANCE;
            }
            this.previousSessionId = str;
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            c07091.L$0 = str;
            c07091.L$1 = notificationType;
            c07091.label = 1;
            registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(c07091);
            if (registeredSubscribers$com_google_firebase_firebase_sessions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationType = (NotificationType) c07091.L$1;
            str = (String) c07091.L$0;
            ResultKt.throwOnFailure(registeredSubscribers$com_google_firebase_firebase_sessions);
        }
        for (SessionSubscriber sessionSubscriber : ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            int i2 = WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()];
            if (i2 == 1) {
                Objects.toString(sessionSubscriber.getSessionSubscriberName());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Objects.toString(sessionSubscriber.getSessionSubscriberName());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSessionExpired(SessionData p0) {
        Time backgroundTime = p0.getBackgroundTime();
        if (backgroundTime != null) {
            boolean z = Duration.m9373compareToLRDsOJo(this.timeProvider.currentTime().m8004minus5sfh64U(backgroundTime), this.sessionsSettings.m8008getSessionRestartTimeoutUwyO8pc()) > 0;
            if (z) {
                p0.getSessionDetails().getSessionId();
            }
            return z;
        }
        p0.getSessionDetails().getSessionId();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isColdStart(SessionData p0) {
        Map<String, ProcessData> processDataMap = p0.getProcessDataMap();
        if (processDataMap != null) {
            return this.processDataManager.isColdStart(processDataMap);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMyProcessStale(SessionData p0) {
        Map<String, ProcessData> processDataMap = p0.getProcessDataMap();
        if (processDataMap != null) {
            boolean zIsMyProcessStale = this.processDataManager.isMyProcessStale(processDataMap);
            if (zIsMyProcessStale) {
                this.processDataManager.getMyProcessName();
            }
            return zIsMyProcessStale;
        }
        this.processDataManager.getMyProcessName();
        return true;
    }
}
