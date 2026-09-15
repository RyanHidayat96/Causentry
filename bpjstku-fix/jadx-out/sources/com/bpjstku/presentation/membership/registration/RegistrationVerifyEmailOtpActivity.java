package com.bpjstku.presentation.membership.registration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.databinding.ActivityRegistrationVerifyEmailOtpBinding;
import com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$1;
import com.google.android.libraries.places.internal.zzbla;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.IntegerRes;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import defpackage.setVideoStabilizationMode;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\t\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0015\u0010 \u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0017\u0010\n\u001a\u0004\u0018\u00010!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0017\u0010\u001e\u001a\u0004\u0018\u00010\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0017\u0010\u0018\u001a\u0004\u0018\u00010#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u0016R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&R\u0014\u0010\f\u001a\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010("}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationVerifyEmailOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationVerifyEmailOtpBinding;", "<init>", "()V", "", "onBackPressed", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "a", "asBinder", "onResume", "onStop", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LIntegerRes;", "Lkotlin/Lazy;", "", "d", "Ljava/lang/String;", "LgetCameraCharacteristic;", "TuitionPaymentFragmentbindingInflater1", "LgetCameraCharacteristic;", "LsetSplitTrack;", "g", "LisSticky;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationVerifyEmailOtpActivity extends BindingBaseActivity<ActivityRegistrationVerifyEmailOtpBinding> {
    private static char[] INotificationSideChannel;
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int notify;
    private getCameraCharacteristic TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {90, 46, 113, 8};
    private static final int $$f = 54;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, 66, -1, 15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 56;
    private static int cancelAll = 1;
    private static int onTransact = 0;
    private static int cancel = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: makeLayout
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationVerifyEmailOtpActivity.b(this.b);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: setupEmojiCompatLoadCallback
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: stopDrag
        private static final byte[] $$c = {31, 115, -100, -11};
        private static final int $$d = 72;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 230;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int g = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -332588420147921381L;
        private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
        private static char b = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 4
                int r5 = r5 + 84
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r0 = defpackage.stopDrag.$$a
                int r6 = r6 * 4
                int r1 = 53 - r6
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r7
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r7]
            L2a:
                int r7 = r7 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.stopDrag.c(int, int, short, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i6 = $11 + 113;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1234, 34 - ImageFormat.getBitsPerPixel(0), -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2765 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1504416861, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 43326), 253 - Color.blue(0), Color.green(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65199), 2891 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0) + 18, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                int i8 = $11 + 51;
                                $10 = i8 % 128;
                                int i9 = i8 % 2;
                                i2 = 2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            long j;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getSize(0) + 46400), (ViewConfiguration.getWindowTouchSlop() >> 8) + 40, 19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            a(new char[]{15146, 54569, 34283, 23580}, new char[]{18456, 17783, 46753, 41260}, (char) TextUtils.getTrimmedLength(""), ImageFormat.getBitsPerPixel(0) + 1, new char[]{44658, 23203, 26871, 62291, 55210, 41321, 14807, 57955, 45028, 20205, 63590, 65396, 37239, 47554, 59719, 16443, 39817, 3994, 22888, 27573, 48082, 28433}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{15146, 54569, 34283, 23580}, new char[]{20201, 36866, 27107, 63125}, (char) (38249 - (Process.myTid() >> 22)), (-477101490) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{11648, 39386, 20310, 25984, 63690, 11518, 49850, 54173, 8659, 14222, 47129, 27844, 18280, 7446, 11591}, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            int i4 = i3;
            long j2 = -1;
            long j3 = j2 ^ 3726173128070050149L;
            long j4 = j2 ^ (-1628915953328091162L);
            long jIdentityHashCode = j3 | (((long) System.identityHashCode(this)) ^ j2);
            long j5 = (((long) 483) * 3726173128070050149L) + (((long) 242) * (-1628915953328091162L)) + (((long) (-241)) * (((j3 | j4) ^ j2) | (jIdentityHashCode ^ j2))) + (((long) (-482)) * (-290781552785637401L)) + (((long) 241) * ((j2 ^ (jIdentityHashCode | (-1628915953328091162L))) | ((j4 | 3726173128070050149L) ^ j2)));
            int i5 = 0;
            long j6 = jLongValue;
            while (true) {
                if (i5 == 10) {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{15146, 54569, 34283, 23580}, new char[]{42128, 62495, 22623, 41485}, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3416), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{35550, 42994, 34063, 6906, 25918, 12349, 28981, 7672, 25546, 64666, 45856, 48215, 16763, 30140, 29447, 40224}, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{15146, 54569, 34283, 23580}, new char[]{65243, 26466, 51555, 44594}, (char) (13001 - KeyEvent.keyCodeFromString("")), View.resolveSizeAndState(0, 0, 0), new char[]{11018, 25150, 52826, 46648, 8719, 7969, 59982, 11902, 1739, 42153, 17067, 51047, 6953, 45344, 13620, 15156}, objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {548957057};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46037), 1135 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -841919050, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char defaultSize = (char) View.getDefaultSize(0, 0);
                            int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                            byte b2 = $$a[7];
                            byte b3 = b2;
                            Object[] objArr7 = new Object[1];
                            c(b2, b3, b3, objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iAxisFromString, scrollDefaultDelay, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Gravity.getAbsoluteGravity(0, 0) + 45993), 1116 - MotionEvent.axisFromString(""), (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                        if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr == null) {
                            throw null;
                        }
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i7 = i6 + 15;
                        g = i7 % 128;
                        int i8 = 2;
                        int i9 = i7 % 2;
                        int i10 = i6 + 75;
                        g = i10 % 128;
                        int i11 = i10 % 2;
                        while (i2 < strArr.length) {
                            int i12 = g + 11;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                            int i13 = i12 % i8;
                            arrayList.add(strArr[i2]);
                            i2++;
                            i8 = 2;
                        }
                        throw null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - TextUtils.indexOf("", "", 0)), View.resolveSize(0, 0) + 59, 18 - Gravity.getAbsoluteGravity(0, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i14 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                int i15 = 0;
                long j7 = j6;
                while (true) {
                    int i16 = 0;
                    while (i16 != 8) {
                        i14 = (((((int) (j7 >> i16)) & 255) + (i14 << 6)) + (i14 << 16)) - i14;
                        i16++;
                        j5 = j5;
                    }
                    j = j5;
                    if (i15 != 0) {
                        break;
                    }
                    i15++;
                    j5 = j;
                    j7 = j5;
                }
                int i17 = i4;
                if (i14 == i17) {
                    break;
                }
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                g = i18 % 128;
                int i19 = i18 % 2;
                j6 -= 1024;
                i5++;
                i4 = i17;
                j5 = j;
            }
            MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i20 = g + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
            int i21 = i20 % 2;
            return migrantWorkerRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r7, short r8, short r9) {
            /*
                int r9 = r9 + 102
                byte[] r0 = defpackage.stopDrag.$$c
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L27
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L22
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L22:
                r3 = r0[r7]
                r6 = r3
                r3 = r9
                r9 = r6
            L27:
                int r7 = r7 + 1
                int r9 = -r9
                int r9 = r9 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.stopDrag.$$e(byte, short, short):java.lang.String");
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        String str;
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i3)) | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = (~(i10 | i2)) | (~(i8 | i2));
        int i12 = ~(i7 | i10 | i8);
        int i13 = i3 + i2 + i5 + ((-2109949842) * i6) + (2078889904 * i4);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i3) + 932184064 + (61854959 * i2) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i5) + (610271232 * i6) + (922746880 * i4) + (671350784 * i14);
        int i16 = (i3 * (-573803825)) + 196542130 + (i2 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i5 * (-573803307)) + (i6 * (-843101306)) + (i4 * (-1524517520)) + (i14 * 458489856);
        int i17 = i15 + (i16 * i16 * 64749568);
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return i17 != 4 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
                }
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity = (RegistrationVerifyEmailOtpActivity) objArr[0];
            Bundle bundle = (Bundle) objArr[1];
            int i18 = 2 % 2;
            int i19 = onTransact + 101;
            cancel = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i22 = ~((-1003791181) | i8);
            if (i21 != ((((-1004317566) | i22) * (-970)) - 571043822) + ((i22 | 526385) * 970)) {
                int i23 = (-1358266460) % 2;
                throw new ArithmeticException();
            }
            if (((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) != (-1332362521) + (((~((-684935074) | i8)) | (~((-1894120892) | i))) * 217) + (((~(i | (-684935074))) | 549537185) * 217) + (((~((-1894120892) | i8)) | 684935073) * 217)) {
                int[] iArr = new int[2044281755];
                iArr[2044281754] = 1;
                int i24 = (-1161348034) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i25 = onTransact + 71;
                cancel = i25 % 128;
                int i26 = i25 % 2;
            }
            super.onCreate(bundle);
            return null;
        }
        RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity2 = (RegistrationVerifyEmailOtpActivity) objArr[0];
        int i27 = 2 % 2;
        int i28 = cancel + 57;
        onTransact = i28 % 128;
        int i29 = i28 % 2;
        RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity3 = registrationVerifyEmailOtpActivity2;
        Intrinsics.checkNotNullParameter(registrationVerifyEmailOtpActivity3, "");
        registrationVerifyEmailOtpActivity3.getWindow().addFlags(8192);
        registrationVerifyEmailOtpActivity2.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) registrationVerifyEmailOtpActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) registrationVerifyEmailOtpActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(registrationVerifyEmailOtpActivity2.getString(R.string.title_email_verification));
        TextView textView = ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) registrationVerifyEmailOtpActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEmail;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity2.asInterface.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1) == null) {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity2.g.getValue();
            if (registrationForUnregistered != null) {
                str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                int i30 = onTransact + 67;
                cancel = i30 % 128;
                int i31 = i30 % 2;
                str = null;
            }
        }
        int i32 = cancel + 115;
        onTransact = i32 % 128;
        int i33 = i32 % 2;
        textView.setText(str);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r0 = r8 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.c(byte, int, byte, java.lang.Object[]):void");
    }

    public static final /* synthetic */ int g() {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 51;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i2 + 93;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public RegistrationVerifyEmailOtpActivity() {
        final RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = registrationVerifyEmailOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = registrationVerifyEmailOtpActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<isSticky>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isSticky invoke() {
                LifecycleOwner lifecycleOwner = registrationVerifyEmailOtpActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(isSticky.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00108\u0007X\u0087D¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\t\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationVerifyEmailOtpActivity$b;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Landroid/content/Context;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;)V", "", "I", "()I", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return RegistrationVerifyEmailOtpActivity.g();
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseActivity p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) RegistrationVerifyEmailOtpActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivityForResult(intent, RegistrationVerifyEmailOtpActivity.g());
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationVerifyEmailOtpActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, MigrantWorkerRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationVerifyEmailOtpActivity.class, new Pair[]{TuplesKt.to("migration_worker_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        notify = 0;
        d();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 100;
        int i = cancelAll + 57;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationVerifyEmailOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        RegistrationVerifyEmailOtpActivity$bindingInflater$1 registrationVerifyEmailOtpActivity$bindingInflater$1 = RegistrationVerifyEmailOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = onTransact + 31;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return registrationVerifyEmailOtpActivity$bindingInflater$1;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = cancel + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        d_();
        int i4 = cancel + 27;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding = (ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegistrationVerifyEmailOtpBinding.btnChangeEmail.setOnClickListener(new View.OnClickListener() { // from class: getTextOff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationVerifyEmailOtpActivity.b(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        activityRegistrationVerifyEmailOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: setOffStateDescriptionOnRAndAbove
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException {
                RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, activityRegistrationVerifyEmailOtpBinding, view);
            }
        });
        activityRegistrationVerifyEmailOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: setOnStateDescriptionOnRAndAbove
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityRegistrationVerifyEmailOtpBinding, this);
            }
        });
        OtpView otpView = activityRegistrationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: setTextOffInternal
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(activityRegistrationVerifyEmailOtpBinding, (String) obj);
            }
        }));
        activityRegistrationVerifyEmailOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: getCompoundPaddingLeft
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.b, activityRegistrationVerifyEmailOtpBinding, view);
            }
        });
        int i2 = onTransact + 121;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity = (RegistrationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        registrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1 = new getCameraCharacteristic(((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) registrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = onTransact + 29;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i4 = onTransact + 121;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = onTransact + 11;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int length;
        char[] cArr2;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = INotificationSideChannel;
        if (cArr3 != null) {
            int i7 = $11 + 105;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr3[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i2;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(i2, i2), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1270, View.getDefaultSize(i2, i2) + 18, 407021364, false, $$i(b, b2, (byte) (b2 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i9 = $10 + 125;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i4];
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i10 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 3225, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, 2133916302, false, $$i(b3, b4, (byte) (b4 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1755 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, 387247676, false, $$i(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1705 - View.MeasureSpec.makeMeasureSpec(0, 0), 21 - Color.blue(0), -1434471773, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i12, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $11 + 47;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            int i15 = 0;
            loop2: while (true) {
                setvideostabilizationmode.b = i15;
                while (true) {
                    if (setvideostabilizationmode.b >= i4) {
                        break loop2;
                    }
                    int i16 = $11 + 69;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr6[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) % 0];
                        setvideostabilizationmode.b %= 1;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                        i15 = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i17 = $11 + 107;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                setvideostabilizationmode.b = 1;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                int i18 = $11 + 65;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).onTransact.observe(registrationVerifyEmailOtpActivity, new Observer() { // from class: getCompoundPaddingRight
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((isSticky) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.observe(registrationVerifyEmailOtpActivity, new Observer() { // from class: setTextOnInternal
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(registrationVerifyEmailOtpActivity, new Observer() { // from class: getSplitTrack
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancel + 115;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1304646161
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (getcameracharacteristic == null) {
            int i2 = onTransact + 73;
            cancel = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i3 = cancel + 33;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                obj.hashCode();
                throw null;
            }
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i2 = cancel + 41;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i3 = cancel + 7;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:14:0x0039, B:13:0x0032, B:11:0x0029), top: B:22:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancel + 91;
        onTransact = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 29 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = onTransact + 105;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
            byte[] bArr = $$a;
            byte b = bArr[132];
            short s = bArr[2];
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) (s & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, maxKeyCode, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 182, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 106, 1}, false, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
            int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
            byte b2 = $$a[132];
            short s2 = (short) (b2 | 50);
            Object[] objArr5 = new Object[1];
            c(b2, s2, (byte) (s2 + 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, absoluteGravity, packedPositionChild, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int capsMode = 1031 - TextUtils.getCapsMode("", 0, 0);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b4, (short) (b4 | 103), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, capsMode, jumpTapTimeout, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_mandiri_details).substring(87, 89).codePointAt(0) - 579279109;
            int i5 = ~iCodePointAt;
            int i6 = 1017090109 + (((~(iCodePointAt | (-294090686))) | (~((-537952259) | i5)) | 293672088) * (-68)) + ((~((-418598) | i5)) * (-68)) + (((~(294090685 | i5)) | (-538370856)) * 68) + 573197732;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 0, 5}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-123831448};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 1134, TextUtils.lastIndexOf("", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 573197732, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                    int gidForName = Process.getGidForName("") + 16;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[132];
                    short s3 = bArr2[2];
                    Object[] objArr12 = new Object[1];
                    c(b5, s3, (byte) (s3 & 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, iLastIndexOf, gidForName, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getTouchSlop() >> 8)), 1117 - Color.blue(0), TextUtils.getCapsMode("", 0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                    int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr13 = new Object[1];
                    c(b7, (short) (b7 | 103), b6, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, modifierMetaStateMask, i9, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{0, 22, 182, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{22, 15, 106, 1}, false, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 15;
                        byte b8 = $$a[132];
                        short s4 = (short) (b8 | 50);
                        Object[] objArr16 = new Object[1];
                        c(b8, s4, (byte) (s4 + 1), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumDrawingCacheSize, scrollDefaultDelay, iMyPid, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int iAlpha = 1031 - Color.alpha(0);
                        int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr3 = $$a;
                        byte b9 = bArr3[132];
                        short s5 = bArr3[2];
                        Object[] objArr17 = new Object[1];
                        c(b9, s5, (byte) (s5 & 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar, iAlpha, minimumFlingVelocity, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i10 = cancel + 63;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart).substring(0, 8).length() + 1666783848;
        int i15 = i12 + ((((-1330492805) + (((~((~length) | 465919777)) | 537952394) * 446)) + (((~(length | 1003872171)) | 172247553) * 446)) - 591400852);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr18[2])[0] = i17 ^ (i17 << 5);
        int i18 = cancel + 91;
        onTransact = i18 % 128;
        if (i18 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                int i19 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int size = 23 - View.MeasureSpec.getSize(0);
                byte b10 = $$a[132];
                short s6 = (short) (b10 | 102);
                Object[] objArr19 = new Object[1];
                c(b10, s6, (byte) (s6 & 189), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAxisFromString, i19, size, 986134021, false, (String) objArr19[0], null);
            }
            Object obj = null;
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
            int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
            int iAxisFromString = 22 - MotionEvent.axisFromString("");
            byte b11 = $$a[132];
            short s7 = (short) (b11 | 102);
            Object[] objArr20 = new Object[1];
            c(b11, s7, (byte) (s7 & 189), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(windowTouchSlop, bitsPerPixel, iAxisFromString, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i20 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                int iAlpha2 = 23 - Color.alpha(0);
                byte b12 = $$a[132];
                short s8 = (short) (b12 | 50);
                Object[] objArr21 = new Object[1];
                c(b12, s8, (byte) (s8 + 1), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(keyRepeatDelay, i20, iAlpha2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            int i21 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{i21}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 53410865;
            int i23 = ~i22;
            int i24 = (~((-495617520) | i23)) | 218136650;
            int i25 = ~(i22 | (-5534225));
            int i26 = (((-1951948971) + ((i24 | i25) * (-502))) + ((i25 | (~(i23 | (-277480870)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1685457215;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{37, 16, 0, 5}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-123831448};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (View.getDefaultSize(0, 0) + 42049), TextUtils.lastIndexOf("", '0', 0) + 1727, (ViewConfiguration.getTapTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr25), -1685457215, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                int i29 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b13 = $$a[132];
                short s9 = (short) (b13 | 50);
                Object[] objArr26 = new Object[1];
                c(b13, s9, (byte) (s9 + 1), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSize, iMakeMeasureSpec, i29, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{0, 22, 182, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{22, 15, 106, 1}, false, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                    int iResolveSize = 1755 - View.resolveSize(0, 0);
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                    Object[] objArr29 = new Object[1];
                    c($$a[132], (short) 140, (byte) ($$b - 4), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyTid, iResolveSize, tapTimeout2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                    int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b14 = $$a[132];
                    short s10 = (short) (b14 | 102);
                    Object[] objArr30 = new Object[1];
                    c(b14, s10, (byte) (s10 & 189), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(jumpTapTimeout2, scrollBarFadeDuration, scrollBarSize, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr4 != null) {
                int i30 = cancel;
                int i31 = i30 + 79;
                onTransact = i31 % 128;
                int i32 = i31 % 2;
                int i33 = i30 + 49;
                onTransact = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 5 / 2;
                }
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i35 = onTransact + 89;
        cancel = i35 % 128;
        int i36 = i35 % 2;
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        Object[] objArr31 = {new int[]{i38}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_atm_bni).substring(0, 7).length() + 696994289;
        int i39 = ~length2;
        int i40 = 891336941 + (((~((-692202298) | i39)) | 557851392 | (~(479599871 | i39)) | (~((-345248967) | length2))) * (-84));
        int i41 = (~(length2 | 479599871)) | 692202297;
        int i42 = ~(i39 | (-479599872));
        int i43 = i37 + i40 + ((i41 | i42) * (-84)) + ((345248966 | i42) * 84);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr31[3])[0] = i45 ^ (i45 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cc, code lost:
    
        if (r1 != (((1825304428 + (((~((-195006057) | r4)) | (-1910917388)) * (-602))) + ((((~(r2 | (-195006057))) | 169444960) | (~((-1885356292) | r4))) * (-301))) + ((~(r4 | (-1910917388))) * 301))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ce, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.cancel + 119;
        com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00da, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00dc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00de, code lost:
    
        r1 = 231384572 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e8, code lost:
    
        r1 = (-8757446) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f1, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r1 == ((((693371554 | r4) * (-374)) + 103151838) + ((r4 | 277457217) * 374))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0096, code lost:
    
        if (r1 == ((((-902945828) + (((-138678401) | r4) * (-381))) + (((~((~r4) | (-1548013962))) | 1988683579) * 381)) + 1296862848)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.onStart():void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        registrationVerifyEmailOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 51;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            registrationVerifyEmailOtpActivity.onBackPressed();
            ViewPortBuilder.b();
            int i4 = cancel + 31;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = onTransact + 79;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            registrationVerifyEmailOtpActivity.MediaBrowserCompat();
            int i4 = cancel + 17;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        getCameraCharacteristic getcameracharacteristic = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            registrationVerifyEmailOtpActivity.IconCompatParcelizer();
            getCameraCharacteristic getcameracharacteristic2 = registrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1;
            if (getcameracharacteristic2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                getcameracharacteristic = getcameracharacteristic2;
            }
            getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            int i6 = cancel + 31;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            registrationVerifyEmailOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration b(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = onTransact + 59;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = cancel + 19;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                registrationVerifyEmailOtpActivity.MediaBrowserCompat();
                return;
            } else {
                registrationVerifyEmailOtpActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = onTransact + 69;
            cancel = i3 % 128;
            if (i3 % 2 != 0) {
                registrationVerifyEmailOtpActivity.IconCompatParcelizer();
                registrationVerifyEmailOtpActivity.b = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
                return;
            } else {
                registrationVerifyEmailOtpActivity.IconCompatParcelizer();
                registrationVerifyEmailOtpActivity.b = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
                obj.hashCode();
                throw null;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = onTransact + 57;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                registrationVerifyEmailOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            } else {
                registrationVerifyEmailOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                obj.hashCode();
                throw null;
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationVerifyEmailOtpActivity.MediaBrowserCompat();
            return;
        }
        Object obj = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                registrationVerifyEmailOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) registrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        registrationVerifyEmailOtpActivity.IconCompatParcelizer();
        Object obj2 = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str = registrationVerifyEmailOtpActivity.b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        if (!Intrinsics.areEqual(obj2, str)) {
            String string = registrationVerifyEmailOtpActivity.getString(R.string.error_signature_checking);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(registrationVerifyEmailOtpActivity, string, "Coba Kembali", new Function0() { // from class: getShowText
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            });
            return;
        }
        int i2 = cancel + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
            registrationVerifyEmailOtpActivity.setResult(-1);
            registrationVerifyEmailOtpActivity.finish();
        }
        if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
            Intrinsics.checkNotNull(registeredMemberRegistration);
            if (registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == MembershipType.PMI) {
                int i4 = cancel + 17;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    PhoneVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = PhoneVerificationActivity.INSTANCE;
                    PhoneVerificationActivity.Companion.b(registrationVerifyEmailOtpActivity, (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue());
                    registrationVerifyEmailOtpActivity.d_();
                    obj.hashCode();
                    throw null;
                }
                PhoneVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = PhoneVerificationActivity.INSTANCE;
                PhoneVerificationActivity.Companion.b(registrationVerifyEmailOtpActivity, (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue());
                registrationVerifyEmailOtpActivity.d_();
            }
        }
        if (((RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue()) != null) {
            int i5 = cancel + 25;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            PhoneVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = PhoneVerificationActivity.INSTANCE;
            PhoneVerificationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationVerifyEmailOtpActivity, (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue());
            registrationVerifyEmailOtpActivity.d_();
        }
        if (((MigrantWorkerRegistration) registrationVerifyEmailOtpActivity.d.getValue()) != null) {
            int i7 = onTransact + 15;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
            IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationVerifyEmailOtpActivity, (MigrantWorkerRegistration) registrationVerifyEmailOtpActivity.d.getValue());
        }
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return (MigrantWorkerRegistration) registrationVerifyEmailOtpActivity.getIntent().getParcelableExtra("migration_worker_data");
        }
        int i3 = 57 / 0;
        return (MigrantWorkerRegistration) registrationVerifyEmailOtpActivity.getIntent().getParcelableExtra("migration_worker_data");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity = (RegistrationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 105;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = cancel + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            OtpView otpView = activityRegistrationVerifyEmailOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, registrationVerifyEmailOtpActivity);
            throw null;
        }
        OtpView otpView2 = activityRegistrationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView2, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, registrationVerifyEmailOtpActivity);
        int i3 = onTransact + 61;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0193  */
    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3 A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ad A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d3 A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e4 A[PHI: r1
  0x01e4: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v13 java.lang.String) binds: [B:127:0x01fe, B:118:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e6 A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f0 A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01fa A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x016e A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0178 A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x017e  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0189 A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #0 {all -> 0x0207, blocks: (B:3:0x0014, B:6:0x0021, B:8:0x002b, B:10:0x002f, B:12:0x0035, B:14:0x003d, B:18:0x0052, B:20:0x0056, B:24:0x005f, B:21:0x005b, B:22:0x005d, B:26:0x0067, B:30:0x0084, B:34:0x0099, B:61:0x00ea, B:63:0x0108, B:65:0x0112, B:72:0x0124, B:73:0x0127, B:87:0x0157, B:129:0x0203, B:75:0x012a, B:77:0x0134, B:81:0x0149, B:82:0x014f, B:35:0x009c, B:36:0x009e, B:40:0x00a3, B:41:0x00ae, B:42:0x00af, B:44:0x00b9, B:46:0x00c3, B:50:0x00ca, B:54:0x00df, B:55:0x00e2, B:56:0x00e4, B:88:0x015c, B:90:0x016e, B:92:0x0178, B:112:0x01b5, B:114:0x01d3, B:116:0x01dd, B:128:0x0200, B:121:0x01e6, B:123:0x01f0, B:125:0x01fa, B:96:0x017f, B:98:0x0189, B:101:0x019c, B:105:0x01a3, B:107:0x01ad), top: B:134:0x0014 }] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        MigrantWorkerRegistration migrantWorkerRegistration;
        String str;
        RegistrationForUnregistered registrationForUnregistered;
        RegistrationForUnregistered registrationForUnregistered2;
        String str2;
        RegisteredMemberRegistration registeredMemberRegistration;
        RegisteredMemberRegistration registeredMemberRegistration2;
        String str3;
        String str4;
        String strName;
        MembershipType membershipType;
        RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity = (RegistrationVerifyEmailOtpActivity) objArr[0];
        ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding = (ActivityRegistrationVerifyEmailOtpBinding) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[2]);
        try {
            String str5 = "";
            Object obj = null;
            if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) == null) {
                isSticky issticky = (isSticky) registrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                    registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                    if (registeredMemberRegistration2 != null) {
                        str = registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                } else if (((RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue()) != null) {
                    registrationForUnregistered = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue();
                    if (registrationForUnregistered != null) {
                        int i2 = cancel + 55;
                        onTransact = i2 % 128;
                        int i3 = i2 % 2;
                        str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                } else {
                    migrantWorkerRegistration = (MigrantWorkerRegistration) registrationVerifyEmailOtpActivity.d.getValue();
                    if (migrantWorkerRegistration != null) {
                        str = migrantWorkerRegistration.getItem;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        str = "";
                    }
                }
                String string = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyEmailOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                    registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                    if (registeredMemberRegistration != null) {
                        str2 = registeredMemberRegistration.INotificationSideChannel;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str5 = str2;
                    }
                } else if (((RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue()) != null) {
                    registrationForUnregistered2 = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue();
                    if (registrationForUnregistered2 != null) {
                        str2 = registrationForUnregistered2.connect;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str5 = str2;
                    }
                }
                issticky.b(str, string, str5);
            } else {
                RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                if (!Intrinsics.areEqual((registeredMemberRegistration3 == null || (membershipType = registeredMemberRegistration3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) ? null : membershipType.name(), "PMI")) {
                    RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                    if (registeredMemberRegistration4 != null) {
                        int i4 = onTransact + 109;
                        cancel = i4 % 128;
                        if (i4 % 2 == 0) {
                            Citizenship citizenship = registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            throw null;
                        }
                        Citizenship citizenship2 = registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (citizenship2 != null) {
                            strName = citizenship2.name();
                        } else {
                            strName = null;
                        }
                    } else {
                        strName = null;
                    }
                    if (!Intrinsics.areEqual(strName, "WNA")) {
                        isSticky issticky2 = (isSticky) registrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                            registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                            if (registeredMemberRegistration2 != null) {
                                str = registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                        } else if (((RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue()) != null) {
                            registrationForUnregistered = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue();
                            if (registrationForUnregistered != null) {
                                int i5 = cancel + 55;
                                onTransact = i5 % 128;
                                int i6 = i5 % 2;
                                str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            migrantWorkerRegistration = (MigrantWorkerRegistration) registrationVerifyEmailOtpActivity.d.getValue();
                            if (migrantWorkerRegistration != null) {
                                str = migrantWorkerRegistration.getItem;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                str = "";
                            }
                        }
                        String string2 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyEmailOtpBinding.otpVerify.getText())).toString();
                        if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                            registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                            if (registeredMemberRegistration != null) {
                                str2 = registeredMemberRegistration.INotificationSideChannel;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str5 = str2;
                            }
                        } else if (((RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue()) != null) {
                            registrationForUnregistered2 = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue();
                            if (registrationForUnregistered2 != null) {
                                str2 = registrationForUnregistered2.connect;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                str5 = str2;
                            }
                        }
                        issticky2.b(str, string2, str5);
                    }
                }
                isSticky issticky3 = (isSticky) registrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                    int i7 = cancel + 17;
                    onTransact = i7 % 128;
                    if (i7 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                    if (registeredMemberRegistration5 != null) {
                        int i8 = cancel + 55;
                        onTransact = i8 % 128;
                        if (i8 % 2 != 0) {
                            String str6 = registeredMemberRegistration5.TuitionPaymentFragmentbindingInflater1;
                            throw null;
                        }
                        str3 = registeredMemberRegistration5.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                } else if (((RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue()) != null) {
                    RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue();
                    str3 = registrationForUnregistered3 != null ? registrationForUnregistered3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                } else {
                    MigrantWorkerRegistration migrantWorkerRegistration2 = (MigrantWorkerRegistration) registrationVerifyEmailOtpActivity.d.getValue();
                    if (migrantWorkerRegistration2 != null) {
                        int i9 = onTransact + 15;
                        cancel = i9 % 128;
                        if (i9 % 2 == 0) {
                            String str7 = migrantWorkerRegistration2.getItem;
                            throw null;
                        }
                        str3 = migrantWorkerRegistration2.getItem;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                }
                String string3 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyEmailOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                    String str8 = registeredMemberRegistration6 != null ? registeredMemberRegistration6.INotificationSideChannel : null;
                    if (str8 == null) {
                        int i10 = onTransact + 101;
                        cancel = i10 % 128;
                        if (i10 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                    } else {
                        str5 = str8;
                    }
                } else if (((RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue()) != null) {
                    RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue();
                    if (registrationForUnregistered4 != null) {
                        int i11 = cancel + 57;
                        onTransact = i11 % 128;
                        if (i11 % 2 != 0) {
                            str4 = registrationForUnregistered4.connect;
                            int i12 = 37 / 0;
                        } else {
                            str4 = registrationForUnregistered4.connect;
                        }
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        str5 = str4;
                    }
                }
                issticky3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, string3, str5);
            }
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity, ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, View view) {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 61;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (((RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                if (registeredMemberRegistration != null) {
                    str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                } else {
                    str = null;
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationVerifyEmailOtpActivity.g.getValue();
                if (registrationForUnregistered != null) {
                    int i4 = cancel + 81;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str = null;
                }
            }
            activityRegistrationVerifyEmailOtpBinding.otpVerify.getEditableText().clear();
            if (str != null) {
                setSplitTrack setsplittrack = (setSplitTrack) registrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                String string = Settings.Secure.getString(registrationVerifyEmailOtpActivity.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationVerifyEmailOtpActivity.asInterface.getValue();
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new EmailVerificationRequest(string, str, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null)));
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, String str) {
        int i = 2 % 2;
        int i2 = cancel + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i4 = cancel + 103;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            MaterialButton materialButton = activityRegistrationVerifyEmailOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = activityRegistrationVerifyEmailOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentbindingInflater1(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (RegistrationForUnregistered) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1310390381, -1310390377, BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{registrationVerifyEmailOtpActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationVerifyEmailOtpActivity registrationVerifyEmailOtpActivity, ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, View view) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -151802859, 151802862, BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{registrationVerifyEmailOtpActivity, activityRegistrationVerifyEmailOtpBinding, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_registration_verify_email_otp;
        }
        int i3 = 54 / 0;
        return R.layout.activity_registration_verify_email_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        int iCodePointAt = 891098544 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_shipping_billing_address).substring(0, 26).codePointAt(6);
        int iTuitionPaymentFragmentbindingInflater2 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater1, -433706353, 433706353, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_status_title).substring(1, 3).codePointAt(1) + 463941561, iCodePointAt, new Object[]{this}, iTuitionPaymentFragmentbindingInflater2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws IllegalAccessException {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step4).substring(76, 78).length() + 151890142;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentbindingInflater1 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(length, 873578026, -873578025, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_2).substring(5, 6).length() + 570223959, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this}, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        int length = 606094358 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater1, 165430167, -165430165, com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1(), length, new Object[]{this, bundle}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7_bni).substring(105, 113).codePointAt(3) + 379198272);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
    }

    static void d() {
        INotificationSideChannel = new char[]{59776, 59414, 59412, 59434, 59437, 59433, 59415, 59892, 59407, 59436, 59405, 59901, 59415, 59431, 59426, 59433, 59412, 59397, 59398, 59432, 59412, 59414, 59756, 59844, 59865, 59867, 59865, 59856, 59869, 59845, 59854, 59854, 59846, 59867, 59857, 59859, 59870, 59676, 59724, 59744, 59744, 59758, 59744, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r8 = 105 - r8
            byte[] r0 = com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.$$c
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity.$$i(short, int, byte):java.lang.String");
    }
}
