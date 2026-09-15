package com.bpjstku.presentation.asik.active;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.data.setting.model.request.ChangePhoneNumberRequest;
import com.bpjstku.data.setting.model.request.PhoneVerificationRequest;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.databinding.ActivityAsikVerifyOtpFromPhoneBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AlertControllerAlertParams4;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.ExperimentalCamera2Interop;
import defpackage.IntegerRes;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.collapseItemActionView;
import defpackage.createEditText;
import defpackage.deInitSession;
import defpackage.forLanguageTags;
import defpackage.getCameraCharacteristic;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getStringOrNull;
import defpackage.hasStableIds;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.suspendUseCases;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00103\u001a\u000204H\u0014J\b\u00105\u001a\u000204H\u0014J\b\u00106\u001a\u000204H\u0014J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u00020\fH\u0002J\b\u00109\u001a\u000204H\u0014J\b\u0010:\u001a\u000204H\u0002J\b\u0010;\u001a\u000204H\u0014J\b\u0010<\u001a\u000204H\u0014J\b\u0010=\u001a\u000204H\u0014J\b\u0010>\u001a\u000204H\u0014J\b\u0010?\u001a\u000204H\u0014J\b\u0010@\u001a\u000204H\u0002J\b\u0010A\u001a\u000204H\u0002J\b\u0010B\u001a\u000204H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010 \u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020,8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006D²\u0006\n\u0010E\u001a\u00020FX\u008a\u0084\u0002"}, d2 = {"Lcom/bpjstku/presentation/asik/active/AsikAccountVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikVerifyOtpFromPhoneBinding;", "<init>", "()V", "settingViewModel", "Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "getSettingViewModel", "()Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "settingViewModel$delegate", "Lkotlin/Lazy;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "countVerificationOtp", "", "countDownTimerUtil", "Lcom/bpjstku/util/utils/CountDownTimerUtil;", "accountViewModel", "Lcom/bpjstku/presentation/account/AccountViewModel;", "getAccountViewModel", "()Lcom/bpjstku/presentation/account/AccountViewModel;", "accountViewModel$delegate", "preferenceManager", "Lcom/bpjstku/data/lib/PreferenceManager;", "getPreferenceManager", "()Lcom/bpjstku/data/lib/PreferenceManager;", "preferenceManager$delegate", "forgotPasswordByPhoneViewModel", "Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "getForgotPasswordByPhoneViewModel", "()Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "forgotPasswordByPhoneViewModel$delegate", "currentLatitude", "currentLongitude", "currentCity", "currentProvince", "currentCountry", "currentFullAddress", "user", "Lcom/bpjstku/domain/user/model/User;", "getUser", "()Lcom/bpjstku/domain/user/model/User;", "user$delegate", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "layoutResource", "getLayoutResource", "()I", "initAction", "", "initIntent", "initObservers", "updatePhoneNumber", "buildLocality", "initProcess", "requestOtp", "initUI", "initLib", "onStop", "onResume", "onDestroy", "onOtpVerificationSucceed", "fetchUserLocation", "fetchLocationFromIP", "Companion", "app_release", "exceptionDialog", "Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikAccountVerificationActivity extends BindingBaseActivity<ActivityAsikVerifyOtpFromPhoneBinding> {
    private static char INotificationSideChannelStub;
    private static int RemoteActionCompatParcelizer;
    private static char[] cancelAll;
    private String INotificationSideChannel;
    private int TuitionPaymentFragmentbindingInflater1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private getCameraCharacteristic TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f461a;
    private final Lazy asBinder;
    private String asInterface;
    private final Lazy b;
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: AlertControllerAlertParams3
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {0, -94, -62, -97};
        private static final int $$d = 75;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {22, 102, 43, -6};
        private static final int $$b = 77;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = defpackage.AlertControllerAlertParams3.$$a
                int r8 = r8 * 2
                int r8 = 4 - r8
                int r6 = r6 * 2
                int r6 = 1 - r6
                int r7 = r7 + 97
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r4 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r3 = r3 + 1
                int r7 = -r7
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.AlertControllerAlertParams3.c(byte, int, int, java.lang.Object[]):void");
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            User userTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
            }
            return userTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int absoluteGravity = 2187 - Gravity.getAbsoluteGravity(0, 0);
                        int i5 = 40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b2 = $$c[0];
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, absoluteGravity, i5, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char keyRepeatTimeout = (char) (33017 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int windowTouchSlop = 3011 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i6 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte b4 = $$c[0];
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, windowTouchSlop, i6, 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 36505);
                        int threadPriority = 3376 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 17;
                        byte b6 = $$c[0];
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, threadPriority, iIndexOf, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i7 = $11 + 113;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 % 5;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i9 = $11 + 33;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb2 = (char) (Color.argb(0, 0, 0, 0) + 36505);
                        int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3376;
                        int iIndexOf2 = 17 - TextUtils.indexOf("", "", 0, 0);
                        byte b8 = $$c[0];
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb2, i10, iIndexOf2, -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i11 = 32 / 0;
                } else {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (36505 - Color.alpha(0));
                        int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3375;
                        int maximumDrawingCacheSize = 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b10 = $$c[0];
                        byte b11 = b10;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, i12, maximumDrawingCacheSize, -968507904, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr);
            int i13 = $11 + 87;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 12 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:148:0x1168 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:149:0x116a  */
        /* JADX WARN: Code duplicated, block: B:151:0x1207  */
        /* JADX WARN: Code duplicated, block: B:153:0x1214 A[Catch: all -> 0x126d, IOException -> 0x127b, TRY_ENTER, TRY_LEAVE, TryCatch #15 {IOException -> 0x127b, all -> 0x126d, blocks: (B:133:0x1127, B:134:0x112a, B:141:0x1142, B:153:0x1214, B:144:0x114f), top: B:451:0x1127 }] */
        /* JADX WARN: Code duplicated, block: B:156:0x122f A[LOOP:18: B:152:0x1212->B:156:0x122f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:167:0x1258  */
        /* JADX WARN: Code duplicated, block: B:286:0x2857  */
        /* JADX WARN: Code duplicated, block: B:288:0x2864  */
        /* JADX WARN: Code duplicated, block: B:289:0x2897  */
        /* JADX WARN: Code duplicated, block: B:300:0x2974 A[Catch: all -> 0x01e4, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:303:0x29bb  */
        /* JADX WARN: Code duplicated, block: B:304:0x29bf A[Catch: all -> 0x01e4, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:306:0x29d7 A[Catch: all -> 0x01e4, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:337:0x315f  */
        /* JADX WARN: Code duplicated, block: B:341:0x33ac  */
        /* JADX WARN: Code duplicated, block: B:343:0x33bd  */
        /* JADX WARN: Code duplicated, block: B:344:0x33cb  */
        /* JADX WARN: Code duplicated, block: B:346:0x33e0  */
        /* JADX WARN: Code duplicated, block: B:349:0x33f6 A[Catch: all -> 0x01e4, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:350:0x3448  */
        /* JADX WARN: Code duplicated, block: B:355:0x353d A[LOOP:8: B:345:0x33de->B:355:0x353d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:361:0x35e7  */
        /* JADX WARN: Code duplicated, block: B:367:0x360d  */
        /* JADX WARN: Code duplicated, block: B:373:0x362f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:376:0x3638  */
        /* JADX WARN: Code duplicated, block: B:378:0x363b A[Catch: all -> 0x3672, IOException -> 0x367f, TRY_LEAVE, TryCatch #14 {IOException -> 0x367f, all -> 0x3672, blocks: (B:364:0x3603, B:365:0x3606, B:370:0x361c, B:372:0x3622, B:374:0x3631, B:378:0x363b), top: B:453:0x3603 }] */
        /* JADX WARN: Code duplicated, block: B:381:0x3655 A[LOOP:12: B:377:0x3639->B:381:0x3655, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:386:0x366b  */
        /* JADX WARN: Code duplicated, block: B:387:0x366d  */
        /* JADX WARN: Code duplicated, block: B:402:0x3696  */
        /* JADX WARN: Code duplicated, block: B:403:0x369e  */
        /* JADX WARN: Code duplicated, block: B:405:0x36ac  */
        /* JADX WARN: Code duplicated, block: B:410:0x3783 A[Catch: all -> 0x01e4, TRY_ENTER, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:412:0x3790 A[Catch: all -> 0x01e4, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:414:0x3839 A[Catch: all -> 0x01e4, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:416:0x3846 A[Catch: all -> 0x01e4, TryCatch #3 {all -> 0x01e4, blocks: (B:6:0x00d4, B:8:0x00e1, B:9:0x011b, B:21:0x0271, B:23:0x027e, B:24:0x02bd, B:31:0x03d5, B:33:0x03e2, B:34:0x041a, B:59:0x060b, B:61:0x0611, B:62:0x0653, B:64:0x0770, B:66:0x077d, B:67:0x07c5, B:71:0x09a6, B:73:0x09b3, B:75:0x0a00, B:86:0x0b10, B:88:0x0b1e, B:89:0x0b63, B:96:0x0cb7, B:98:0x0cc4, B:99:0x0d07, B:105:0x0df2, B:107:0x0dff, B:108:0x0e42, B:117:0x103d, B:119:0x104a, B:121:0x108e, B:181:0x12d1, B:183:0x12de, B:184:0x1323, B:201:0x14ac, B:203:0x14b9, B:205:0x14f7, B:224:0x176d, B:226:0x177a, B:228:0x17c4, B:235:0x188e, B:237:0x1894, B:238:0x18c7, B:241:0x195a, B:243:0x196c, B:244:0x199e, B:250:0x1a7b, B:252:0x1a88, B:253:0x1ac4, B:255:0x1acd, B:257:0x1ae5, B:258:0x1b22, B:298:0x2967, B:300:0x2974, B:301:0x29b2, B:317:0x2eef, B:319:0x2efc, B:320:0x2f3a, B:326:0x302a, B:328:0x3037, B:329:0x306b, B:347:0x33e9, B:349:0x33f6, B:351:0x3452, B:410:0x3783, B:412:0x3790, B:413:0x37c3, B:414:0x3839, B:416:0x3846, B:417:0x3886, B:304:0x29bf, B:306:0x29d7, B:307:0x2a20, B:267:0x27bd, B:269:0x27ca, B:271:0x2819, B:210:0x15b6, B:212:0x15c3, B:213:0x1601, B:40:0x04ed, B:42:0x04fa, B:43:0x053d, B:49:0x058e, B:51:0x059b, B:52:0x05df), top: B:438:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:455:0x35f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x054e  */
        /* JADX WARN: Code duplicated, block: B:480:0x34e1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:481:0x356b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:484:0x3669 A[EDGE_INSN: B:484:0x3669->B:385:0x3669 BREAK  A[LOOP:9: B:365:0x3606->B:485:0x3606], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:488:0x3631 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:489:0x3622 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:490:0x3666 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:491:0x3664 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:492:0x3662 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:511:0x123a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:512:0x1238 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0bba  */
        public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            String str;
            String str2;
            int i5;
            int i6;
            long j;
            int i7;
            int i8;
            int i9;
            int i10;
            Throwable th;
            BufferedInputStream bufferedInputStream;
            BufferedInputStream bufferedInputStream2;
            String str3;
            int i11;
            byte[] bArr;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            long j2;
            int i17;
            int i18;
            String[] strArr;
            String str4;
            int i19;
            int i20;
            String[] strArr2;
            int i21;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objInvoke;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i22;
            String[] strArr3;
            String str5;
            int i23;
            String[][] strArr4;
            int i24;
            int i25;
            int i26;
            String str6;
            int i27;
            int i28;
            String str7;
            int i29;
            int i30;
            int i31;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            long j3;
            int i32;
            int i33;
            int i34;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String str8;
            byte[] bytes;
            int length;
            Throwable th2;
            BufferedInputStream bufferedInputStream3;
            boolean z;
            byte[] bArr2;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            String[] strArr5;
            int i44;
            int length2;
            String str9;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i45;
            int i46;
            int i47;
            int i48;
            int i49;
            int i50;
            int i51;
            String[] strArr6;
            int i52 = 2 % 2;
            String str10 = "";
            int i53 = 0;
            int i54 = 1;
            Object[] objArr = new Object[1];
            a((Process.myTid() >> 22) + 908, 7 - (~(-TextUtils.indexOf("", "", 0))), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            String str11 = (String) objArr[0];
            new ArrayList();
            Object[] objArr2 = new Object[1];
            a(View.getDefaultSize(0, 0), 26 - (~Color.alpha(0)), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
            String str12 = (String) objArr2[0];
            int iArgb = 27 - Color.argb(0, 0, 0, 0);
            int i55 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr3 = new Object[1];
            a(iArgb, (i55 ^ 25) + ((i55 & 25) << 1), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            String str13 = (String) objArr3[0];
            int i56 = -(-ExpandableListView.getPackedPositionGroup(0L));
            int i57 = (i56 & 52) + (i56 | 52);
            int i58 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            Object[] objArr4 = new Object[1];
            a(i57, ((i58 | 18) << 1) - (i58 ^ 18), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
            String str14 = (String) objArr4[0];
            int i59 = 68 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i60 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i61 = ((i60 | 27) << 1) - (i60 ^ 27);
            char c = '0';
            int i62 = -TextUtils.lastIndexOf("", '0', 0);
            Object[] objArr5 = new Object[1];
            a(i59, i61, (char) (((i62 | 543) << 1) - (i62 ^ 543)), objArr5);
            String[] strArr7 = {str12, str13, str14, (String) objArr5[0]};
            int i63 = 0;
            while (true) {
                if (i63 >= 4) {
                    i4 = i;
                    break;
                }
                try {
                    Object[] objArr6 = {strArr7[i63]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i64 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 992;
                        int iLastIndexOf = TextUtils.lastIndexOf("", c) + 9;
                        byte b2 = (byte) i53;
                        byte b3 = (byte) (b2 + 1);
                        Object[] objArr7 = new Object[i54];
                        c(b2, b3, (byte) (b3 - 1), objArr7);
                        String str15 = (String) objArr7[i53];
                        Class[] clsArr = new Class[i54];
                        clsArr[i53] = String.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, i64, iLastIndexOf, 410748506, false, str15, clsArr);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr6)).longValue();
                    long j4 = 1407348020;
                    long j5 = -574;
                    String[] strArr8 = strArr7;
                    long j6 = -1;
                    long j7 = j4 ^ j6;
                    long jMyTid = Process.myTid();
                    long j8 = jMyTid ^ j6;
                    long j9 = ((jLongValue ^ j6) | jMyTid) ^ j6;
                    long j10 = (j5 * j4) + (j5 * jLongValue) + (((long) 1150) * (((j7 | j8) ^ j6) | j9)) + (((long) (-575)) * (j9 | ((jLongValue | j8) ^ j6))) + (((long) 575) * ((j6 ^ (j8 | j4)) | ((j7 | jMyTid) ^ j6))) + ((long) (-1608266257));
                    int iMyUid = Process.myUid();
                    int i65 = ((int) (j10 >> 32)) & (((~((~iMyUid) | (-1166016833))) * 130) + 7967530 + (((~(iMyUid | (-1166016833))) | 1314816) * 130));
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i66 = ~((-341168897) | iFreeMemory);
                    int i67 = ~iFreeMemory;
                    int i68 = ((int) j10) & (1956945488 + ((i66 | (~(2120220586 | i67))) * 497) + (((~(iFreeMemory | 2120220586)) | (~((-341825281) | i67)) | 656384) * 497));
                    if (((i68 & i65) | (i65 ^ i68)) != 0) {
                        int i69 = i63 + 190;
                        i4 = ((~i69) & i) | ((~i) & i69);
                        break;
                    }
                    i63 = (i63 ^ 1) + ((i63 & 1) << 1);
                    strArr7 = strArr8;
                    i53 = 0;
                    i54 = 1;
                    c = '0';
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            }
            Object[] objArr8 = new Object[1];
            a(TextUtils.getOffsetAfter("", 0) + 98, 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr8);
            String str16 = (String) objArr8[0];
            int i70 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            int i71 = -View.resolveSizeAndState(0, 0, 0);
            Object[] objArr9 = new Object[1];
            a((i70 ^ 110) + ((i70 & 110) << 1), ((i71 | 13) << 1) - (i71 ^ 13), (char) (0 - (~TextUtils.lastIndexOf("", '0', 0))), objArr9);
            String str17 = (String) objArr9[0];
            int i72 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr10 = new Object[1];
            a((i72 ^ 124) + ((i72 & 124) << 1), 18 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), (char) ((-TextUtils.lastIndexOf("", '0', 0, 0)) - 1), objArr10);
            String[] strArr9 = {str16, str17, (String) objArr10[0]};
            int i73 = 0;
            while (true) {
                if (i73 >= 3) {
                    str = str11;
                    str2 = str10;
                    i5 = i;
                    break;
                }
                Object[] objArr11 = {strArr9[i73]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i74 = 994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int iIndexOf = TextUtils.indexOf(str10, str10, 0) + 8;
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    Object[] objArr12 = new Object[1];
                    c(b4, b5, (byte) (b5 - 1), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, i74, iIndexOf, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr11)).longValue();
                long j11 = 1223664381;
                String[] strArr10 = strArr9;
                str = str11;
                long j12 = -1;
                long j13 = jLongValue2 ^ j12;
                str2 = str10;
                long j14 = i;
                long j15 = j14 ^ j12;
                long j16 = (((long) 50) * j11) + (((long) (-97)) * jLongValue2) + (((long) 98) * (((j13 | j15) ^ j12) | ((j13 | j11) ^ j12))) + (((long) (-49)) * (j13 | (((j11 ^ j12) | j15) ^ j12) | ((j11 | j14) ^ j12))) + (((long) 49) * ((j12 ^ (jLongValue2 | j11)) | ((j13 | j14) ^ j12))) + ((long) (-1424582618));
                int i75 = ~i;
                int i76 = (~((-720043933) | i75)) | 715806220;
                int i77 = ~(721420190 | i);
                int i78 = ((int) (j16 >> 32)) & ((-5304014) + ((i76 | i77) * (-502)) + (((~(i75 | (-4237713))) | i77) * TypedValues.PositionType.TYPE_DRAWPATH));
                int iNextInt = new Random().nextInt();
                int i79 = 1764178229 + (((~((-1001302185) | iNextInt)) | (-435924226)) * 672);
                int i80 = ~iNextInt;
                if ((i78 | (((int) j16) & (i79 + (((~(iNextInt | (-435924226))) | (~(1001302184 | i80))) * (-672)) + (((~(435924225 | i80)) | 570687656) * 672)))) != 0) {
                    int i81 = ((i73 | 270) << 1) - (i73 ^ 270);
                    i5 = (i81 | i) & (~(i & i81));
                    break;
                }
                int i82 = (i73 ^ 28) + ((i73 & 28) << 1);
                i73 = ((i82 | (-27)) << 1) - (i82 ^ (-27));
                str11 = str;
                strArr9 = strArr10;
                str10 = str2;
            }
            int i83 = i ^ i4;
            int i84 = -i83;
            int i85 = ((i83 & i84) | (i83 ^ i84)) >> 31;
            int i86 = i5 & (~i85);
            int i87 = i4 & i85;
            int i88 = (i87 & i86) | (i86 ^ i87);
            int i89 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            String str18 = str2;
            Object[] objArr13 = new Object[1];
            a(((i89 | 141) << 1) - (i89 ^ 141), 13 - MotionEvent.axisFromString(str2), (char) (5011 - (~(-(-TextUtils.lastIndexOf(str18, '0', 0, 0))))), objArr13);
            Object[] objArr14 = {(String) objArr13[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int iIndexOf2 = TextUtils.indexOf(str18, str18, 0, 0) + 993;
                int iIndexOf3 = 8 - TextUtils.indexOf(str18, str18, 0);
                byte b6 = (byte) 0;
                Object[] objArr15 = new Object[1];
                c(b6, (byte) (-$$a[3]), b6, objArr15);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(pressedStateDuration, iIndexOf2, iIndexOf3, -545305915, false, (String) objArr15[0], new Class[]{String.class});
            }
            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr14)).longValue();
            long j17 = -1463245239;
            long j18 = 765;
            long j19 = -1;
            long j20 = j17 ^ j19;
            long j21 = jLongValue3 ^ j19;
            long j22 = j20 | j21;
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j23 = startUptimeMillis ^ j19;
            long j24 = (((long) (-1529)) * j17) + (((long) (-764)) * jLongValue3) + ((((j22 | j23) ^ j19) | (((j20 | jLongValue3) | startUptimeMillis) ^ j19) | (((j21 | j17) | startUptimeMillis) ^ j19)) * j18) + (((long) 1530) * ((j22 ^ j19) | ((j20 | j23) ^ j19))) + (j18 * (((j20 | startUptimeMillis) ^ j19) | (((j21 | j23) | j17) ^ j19))) + ((long) 2083704523);
            long j25 = j19;
            int i90 = ((((~(21489761 | i)) | (-1475870318)) * (-283)) + 377754128 + ((~((-1454380557) | i)) * 283)) & ((int) (j24 >> 32));
            int i91 = ~i;
            int i92 = ((int) j24) & (((~((-152408194) | i91)) * 130) + 1281475787 + (((~((-152408194) | i)) | 1082130692) * 130));
            if (((i90 & i92) | (i90 ^ i92)) != 0) {
                i6 = (~(i & 266)) & (i | 266);
            } else {
                int iIndexOf4 = TextUtils.indexOf(str18, str18, 0) + ModuleDescriptor.MODULE_VERSION;
                int i93 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                Object[] objArr16 = new Object[1];
                a(iIndexOf4, ((i93 & 24) << 1) + (i93 ^ 24), (char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), objArr16);
                Object[] objArr17 = {(String) objArr16[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char gidForName = (char) (Process.getGidForName(str18) + 33603);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085;
                    int iLastIndexOf2 = 25 - TextUtils.lastIndexOf(str18, '0');
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    Object[] objArr18 = new Object[1];
                    c(b7, b8, (byte) (b8 - 1), objArr18);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(gidForName, doubleTapTimeout, iLastIndexOf2, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                }
                String str19 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr17);
                if (str19 == null || str19.isEmpty()) {
                    int i94 = -TextUtils.getCapsMode(str18, 0, 0);
                    int i95 = (i94 & 179) + (i94 | 179);
                    int touchSlop = 24 - (ViewConfiguration.getTouchSlop() >> 8);
                    int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i97 = (i96 ^ 71) + ((i96 & 71) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i97 % 128;
                    int i98 = i97 % 2;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                    Object[] objArr19 = new Object[1];
                    a(i95, touchSlop, (char) ((1 & bitsPerPixel) + (bitsPerPixel | 1)), objArr19);
                    Object[] objArr20 = {(String) objArr19[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cLastIndexOf = (char) (33601 - TextUtils.lastIndexOf(str18, '0', 0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 1);
                        Object[] objArr21 = new Object[1];
                        c(b9, b10, (byte) (b10 - 1), objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, keyRepeatTimeout, minimumFlingVelocity, 1411172903, false, (String) objArr21[0], new Class[]{String.class});
                    }
                    String str20 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr20);
                    if (str20 == null || str20.isEmpty()) {
                        i6 = i;
                    } else {
                        i6 = (~(i & 267)) & (i | 267);
                    }
                } else {
                    i6 = (~(i & 267)) & (i | 267);
                }
            }
            int i99 = ((~i88) & i) | (i88 & i91);
            int i100 = -i99;
            int i101 = ((i99 & i100) | (i99 ^ i100)) >> 31;
            int i102 = i6 & (~i101);
            int i103 = i88 & i101;
            int i104 = (i102 & i103) | (i102 ^ i103);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 56827);
                int i105 = 2814 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int jumpTapTimeout = 9 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 + 1);
                Object[] objArr22 = new Object[1];
                c(b11, b12, (byte) (b12 - 1), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maxKeyCode, i105, jumpTapTimeout, -1639816125, false, (String) objArr22[0], new Class[0]);
            }
            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, null)).longValue();
            long j26 = 866665910;
            long j27 = -55;
            long j28 = (j27 * j26) + (j27 * jLongValue4);
            long j29 = 56;
            long jUptimeMillis = (int) SystemClock.uptimeMillis();
            long j30 = j28 + ((jLongValue4 | ((j26 | jUptimeMillis) ^ j25)) * j29) + (((long) (-56)) * ((j26 | jLongValue4) ^ j25)) + (j29 * ((((jUptimeMillis ^ j25) | jLongValue4) ^ j25) | j26)) + ((long) 1246690596);
            int i106 = ((int) (j30 >> 32)) & ((-45515696) + (((~((-1477451953) | i)) | (~(2122186749 | i91))) * 497) + (((~((-2081961209) | i91)) | 604509256 | (~(2122186749 | i))) * 497));
            int i107 = ((int) j30) & (2072280017 + ((~((-33561091) | i91)) * (-116)) + (((-313138052) | i) * 116) + (((~(1124088358 | i)) | (-1403665320)) * 116));
            int i108 = (i106 & i107) | (i106 ^ i107);
            int i109 = -(-(i108 - 1));
            int i110 = -i108;
            int i111 = ((i108 & i110) | (i108 ^ i110)) >> 31;
            int i112 = (i111 & (i ^ ((i109 ^ 200) + ((i109 & 200) << 1)))) | ((~i111) & i);
            int i113 = i ^ i104;
            int i114 = (i113 | (-i113)) >> 31;
            int i115 = i112 & (~i114);
            int i116 = i104 & i114;
            int i117 = (i116 & i115) | (i115 ^ i116);
            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
            int i118 = (fadingEdgeLength & 203) + (fadingEdgeLength | 203);
            int i119 = -TextUtils.indexOf((CharSequence) str18, '0', 0, 0);
            Object[] objArr23 = new Object[1];
            a(i118, (i119 ^ 19) + ((i119 & 19) << 1), (char) (41275 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16)))), objArr23);
            String str21 = (String) objArr23[0];
            int i120 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i121 = (i120 ^ 222) + ((i120 & 222) << 1);
            int iAxisFromString = MotionEvent.axisFromString(str18);
            int i122 = (iAxisFromString & 7) + (iAxisFromString | 7);
            int i123 = -(-TextUtils.indexOf((CharSequence) str18, '0'));
            Object[] objArr24 = new Object[1];
            a(i121, i122, (char) ((i123 ^ 539) + ((i123 & 539) << 1)), objArr24);
            Object[] objArr25 = {str21, (String) objArr24[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2385;
                int iMyPid = 32 - (Process.myPid() >> 22);
                byte b13 = (byte) 0;
                byte b14 = (byte) (b13 + 1);
                Object[] objArr26 = new Object[1];
                c(b13, b14, (byte) (b14 - 1), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, scrollBarFadeDuration2, iMyPid, -1207062455, false, (String) objArr26[0], new Class[]{String.class, String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25)).longValue();
            long j31 = 811560332;
            long j32 = -167;
            long j33 = jLongValue5 ^ j25;
            long jMyUid = Process.myUid();
            long j34 = (j32 * j31) + (j32 * jLongValue5) + (((long) 336) * ((((j31 ^ j25) | j33) ^ j25) | ((j33 | jMyUid) ^ j25))) + (((long) (-168)) * (((jLongValue5 | j31) ^ j25) | ((j31 | jMyUid) ^ j25))) + (((long) 168) * (j33 | (((jMyUid ^ j25) | j31) ^ j25))) + ((long) 1165482996);
            int i124 = (((int) (j34 >> 32)) & (570953434 + ((~(378578110 | i)) * 216) + (((-688459841) | i91) * (-216)) + (((~(378578110 | i91)) | 1058648300) * 216))) | (((int) j34) & ((-1210403061) + (((~(137490546 | i)) | 1299735863) * (-318)) + (((~(1299735863 | i)) | (~((-137388083) | i91))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~((-102465) | i91)) | (~((-137388083) | i))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)));
            int i125 = -i124;
            int i126 = ((i124 & i125) | (i124 ^ i125)) >> 31;
            int i127 = (~i126) & i;
            int i128 = i126 & ((i & (-263)) | (i91 & 262));
            int i129 = (i128 & i127) | (i127 ^ i128);
            int i130 = ((~i117) & i) | (i117 & i91);
            int i131 = -i130;
            int i132 = ((i130 & i131) | (i130 ^ i131)) >> 31;
            int i133 = i129 & (~i132);
            int i134 = i117 & i132;
            int i135 = (i134 & i133) | (i133 ^ i134);
            int i136 = 4;
            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 229;
            int size = View.MeasureSpec.getSize(0);
            Object[] objArr27 = new Object[1];
            a(maxKeyCode2, ((size | 31) << 1) - (size ^ 31), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr27);
            int i137 = -ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr28 = new Object[1];
            a((i137 & 260) + (i137 | 260), 21 - (~(-TextUtils.lastIndexOf(str18, '0', 0, 0))), (char) (Process.myTid() >> 22), objArr28);
            int i138 = -Color.red(0);
            int i139 = (i138 & 283) + (i138 | 283);
            int iAxisFromString2 = 27 - MotionEvent.axisFromString(str18);
            int i140 = -ImageFormat.getBitsPerPixel(0);
            Object[] objArr29 = new Object[1];
            a(i139, iAxisFromString2, (char) ((i140 ^ 36201) + ((i140 & 36201) << 1)), objArr29);
            int i141 = 309 - (~(-TextUtils.lastIndexOf(str18, '0', 0, 0)));
            int i142 = TuitionPaymentFragmentbindingInflater1 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i142 % 128;
            int i143 = i142 % 2;
            int i144 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i145 = (i144 * 303) - 4214;
            int i146 = ~i144;
            int i147 = ~i;
            int i148 = (i146 ^ i147) | (i146 & i147);
            int i149 = (i144 ^ 14) | (i144 & 14);
            int i150 = -(-(((~((i149 ^ i) | (i149 & i))) | (~((i148 ^ 14) | (i148 & 14)))) * (-302)));
            int i151 = ((i145 | i150) << 1) - (i145 ^ i150);
            int i152 = (i146 ^ 14) | (i146 & 14);
            int i153 = (i151 - (~(-(-((~((i152 & i) | (i152 ^ i))) * (-604)))))) - 1;
            int i154 = ~((i144 & (-15)) | ((-15) ^ i144));
            int i155 = ~(i | 14);
            int i156 = -(-(((i154 & i155) | (i154 ^ i155)) * 302));
            int i157 = (i153 ^ i156) + ((i153 & i156) << 1);
            int i158 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            Object[] objArr30 = new Object[1];
            a(i141, i157, (char) ((i158 ^ 25114) + ((i158 & 25114) << 1)), objArr30);
            String[] strArr11 = {(String) objArr27[0], (String) objArr28[0], (String) objArr29[0], (String) objArr30[0]};
            int i159 = 0;
            while (true) {
                if (i159 >= i136) {
                    j = j25;
                    i7 = i147;
                    i8 = i;
                    break;
                }
                Object[] objArr31 = {strArr11[i159]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i160 = 994 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8;
                    byte b15 = (byte) 0;
                    Object[] objArr32 = new Object[1];
                    c(b15, (byte) (-$$a[3]), b15, objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(minimumFlingVelocity2, i160, minimumFlingVelocity3, -545305915, false, (String) objArr32[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr31)).longValue();
                int i161 = i159;
                long j35 = -1335536231;
                j = j25;
                long j36 = 628;
                long j37 = (j36 * j35) + (j36 * jLongValue6);
                long j38 = -627;
                i7 = i147;
                long jMyPid = Process.myPid();
                long j39 = j37 + ((jLongValue6 | jMyPid | (j35 ^ j)) * j38) + (j38 * (j35 | (((jLongValue6 ^ j) | jMyPid) ^ j))) + (((long) 627) * (((j35 | jMyPid) ^ j) | (((jMyPid ^ j) | jLongValue6) ^ j))) + ((long) 1955995515);
                int i162 = ~new Random().nextInt(533701431);
                int i163 = ((int) (j39 >> 32)) & (1347709258 + (((-25707531) | i162) * 184) + (((~(i162 | 739346848)) | (-92882347)) * 184));
                int i164 = (((((~((-294982) | i)) | 160497664) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 389962932) + ((~((-294982) | i91)) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) & ((int) j39);
                int i165 = TuitionPaymentFragmentbindingInflater1;
                int i166 = ((i165 | 19) << 1) - (i165 ^ 19);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i166 % 128;
                if (i166 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (((i163 & i164) | (i163 ^ i164)) != 0) {
                    int i167 = i161 + 252;
                    i8 = (~(i & i167)) & (i | i167);
                    break;
                }
                i159 = i161 + 1;
                j25 = j;
                i147 = i7;
                strArr11 = strArr11;
                i136 = 4;
            }
            int i168 = i ^ i135;
            int i169 = -i168;
            int i170 = ((i168 & i169) | (i168 ^ i169)) >> 31;
            int i171 = i8 & (~i170);
            int i172 = i135 & i170;
            int i173 = (i172 & i171) | (i171 ^ i172);
            int i174 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i175 = ((i174 | 325) << 1) - (i174 ^ 325);
            int touchSlop2 = ViewConfiguration.getTouchSlop();
            int i176 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentbindingInflater1 = i176 % 128;
            int i177 = i176 % 2;
            int i178 = -(touchSlop2 >> 8);
            Object[] objArr33 = new Object[1];
            a(i175, (13 & i178) + (13 | i178), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr33);
            Object[] objArr34 = {(String) objArr33[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char c3 = (char) (33602 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3085;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 27;
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 1);
                Object[] objArr35 = new Object[1];
                c(b16, b17, (byte) (b17 - 1), objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, threadPriority, packedPositionChild, 1411172903, false, (String) objArr35[0], new Class[]{String.class});
            }
            String str22 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr34);
            if (str22 != null) {
                int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                int i179 = ((pressedStateDuration2 | 338) << 1) - (pressedStateDuration2 ^ 338);
                int i180 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int i181 = ((i180 | 9) << 1) - (i180 ^ 9);
                int i182 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                Object[] objArr36 = new Object[1];
                a(i179, i181, (char) ((i182 & 6875) + (i182 | 6875)), objArr36);
                if (str22.contains((String) objArr36[0])) {
                    int i183 = TuitionPaymentFragmentbindingInflater1;
                    int i184 = ((i183 | 21) << 1) - (i183 ^ 21);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i184 % 128;
                    int i185 = i184 % 2;
                    i9 = (i & (-251)) | (i91 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                } else {
                    i9 = i;
                }
            } else {
                i9 = i;
            }
            int i186 = ((~i173) & i) | (i173 & i91);
            int i187 = -i186;
            int i188 = ((i186 & i187) | (i186 ^ i187)) >> 31;
            int i189 = i9 & (~i188);
            int i190 = i173 & i188;
            int i191 = (i190 & i189) | (i189 ^ i190);
            int i192 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i193 = i192 * (-344);
            int i194 = (i193 & (-119024)) + (i193 | (-119024));
            int i195 = ~i192;
            int i196 = ~((i195 ^ (-347)) | (i195 & (-347)));
            int i197 = ~i192;
            int i198 = ~((i197 & i) | (i197 ^ i));
            int i199 = -(-(((i196 & i198) | (i196 ^ i198)) * 345));
            int i200 = ((i194 | i199) << 1) - (i199 ^ i194);
            int i201 = -(-(((~((i192 & (-347)) | ((-347) ^ i192))) | (~(i195 | i91))) * 345));
            int i202 = ((i200 | i201) << 1) - (i201 ^ i200);
            int i203 = (i195 ^ (-347)) | (i195 & (-347));
            int i204 = -(-((~((i203 & i) | (i203 ^ i))) * 345));
            int i205 = ((i202 | i204) << 1) - (i204 ^ i202);
            int i206 = 17 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask()))));
            int i207 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr37 = new Object[1];
            a(i205, i206, (char) ((i207 & 47065) + (i207 | 47065)), objArr37);
            String str23 = (String) objArr37[0];
            int i208 = -View.getDefaultSize(0, 0);
            int i209 = (i208 ^ 364) + ((i208 & 364) << 1);
            int i210 = -(KeyEvent.getMaxKeyCode() >> 16);
            int iB = SearchView9.b();
            int i211 = i210 * 55;
            int i212 = (i211 ^ (-642)) + ((i211 & (-642)) << 1);
            int i213 = ~i210;
            int i214 = ~(i213 | 6);
            int i215 = ~iB;
            int i216 = ~((i215 & 6) | (i215 ^ 6));
            int i217 = ((i214 & i216) | (i214 ^ i216)) * (-108);
            int i218 = ((i212 | i217) << 1) - (i212 ^ i217);
            int i219 = ((-7) & i210) | ((-7) ^ i210);
            int i220 = (~(i213 | iB)) | (~i219);
            int i221 = ~iB;
            int i222 = -(-(((~((i210 & i221) | (i221 ^ i210))) | i220) * 54));
            int i223 = (i218 & i222) + (i222 | i218);
            int i224 = ~i219;
            int i225 = -(-(((i224 & iB) | (iB ^ i224)) * 54));
            int i226 = (i223 & i225) + (i225 | i223);
            int i227 = -View.MeasureSpec.getSize(0);
            Object[] objArr38 = new Object[1];
            a(i209, i226, (char) ((i227 ^ 27823) + ((i227 & 27823) << 1)), objArr38);
            Object[] objArr39 = {str23, (String) objArr38[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2385;
                int size2 = View.MeasureSpec.getSize(0) + 32;
                byte b18 = (byte) 0;
                byte b19 = (byte) (b18 + 1);
                Object[] objArr40 = new Object[1];
                c(b18, b19, (byte) (b19 - 1), objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c4, packedPositionGroup, size2, -1207062455, false, (String) objArr40[0], new Class[]{String.class, String.class});
            }
            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr39)).longValue();
            long j40 = 1442806118;
            long j41 = 85;
            long j42 = (j41 * j40) + (j41 * jLongValue7);
            long j43 = -84;
            long j44 = j40 ^ j;
            long j45 = jLongValue7 ^ j;
            long j46 = i;
            long j47 = j46 ^ j;
            long j48 = j40 | jLongValue7;
            long j49 = (j47 | jLongValue7) ^ j;
            long j50 = j42 + ((((j44 | j45) ^ j) | ((j44 | j47) ^ j) | ((j45 | j47) ^ j) | ((j48 | j46) ^ j)) * j43) + (j43 * (j40 | ((j45 | j46) ^ j) | j49)) + (((long) 84) * (j49 | (j48 ^ j))) + ((long) 534237210);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i228 = ((int) (j50 >> 32)) & (1704617878 + (((~((-1966342986) | iMaxMemory)) | 891290377) * 305) + (((~((~iMaxMemory) | (-1966342986))) | 891397899) * 305));
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i229 = ((int) j50) & (484646344 + (((~((-1866992840) | iUptimeMillis)) | 721947782) * 345) + (((~((-1866992840) | (~iUptimeMillis))) | 268800264) * 345) + ((~(iUptimeMillis | (-721947783))) * 345));
            int i230 = ((i228 & i229) | (i228 ^ i229)) != 0 ? i ^ 251 : i;
            int i231 = (~(i & i191)) & (i | i191);
            int i232 = (i231 | (-i231)) >> 31;
            int i233 = i230 & (~i232);
            int i234 = i191 & i232;
            int i235 = (i234 & i233) | (i233 ^ i234);
            int capsMode = TextUtils.getCapsMode(str18, 0, 0);
            int i236 = ((capsMode | 370) << 1) - (capsMode ^ 370);
            int capsMode2 = TextUtils.getCapsMode(str18, 0, 0);
            Object[] objArr41 = new Object[1];
            a(i236, ((capsMode2 | 23) << 1) - (capsMode2 ^ 23), (char) KeyEvent.getDeadChar(0, 0), objArr41);
            Object[] objArr42 = {(String) objArr41[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char cMyTid = (char) (33602 - (Process.myTid() >> 22));
                int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 3085;
                int iAxisFromString3 = 25 - MotionEvent.axisFromString(str18);
                byte b20 = (byte) 0;
                byte b21 = (byte) (b20 + 1);
                Object[] objArr43 = new Object[1];
                c(b20, b21, (byte) (b21 - 1), objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cMyTid, touchSlop3, iAxisFromString3, 1411172903, false, (String) objArr43[0], new Class[]{String.class});
            }
            String lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr42)).toLowerCase();
            int iMyPid2 = (Process.myPid() >> 22) + 393;
            int i237 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
            Object[] objArr44 = new Object[1];
            a(iMyPid2, (i237 & 4) + (i237 | 4), (char) (5286 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr44);
            int i238 = lowerCase.contains((String) objArr44[0]) ? (i & (-265)) | (i91 & 264) : i;
            int i239 = ((~i235) & i) | (i235 & i91);
            int i240 = -i239;
            int i241 = ((i239 & i240) | (i239 ^ i240)) >> 31;
            int i242 = i238 & (~i241);
            int i243 = i235 & i241;
            int i244 = (i243 & i242) | (i242 ^ i243);
            int i245 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i246 = (i245 ^ 396) + ((i245 & 396) << 1);
            int i247 = -(-TextUtils.getTrimmedLength(str18));
            int i248 = (i247 & 42) + (i247 | 42);
            int i249 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr45 = new Object[1];
            a(i246, i248, (char) ((i249 ^ 26994) + ((i249 & 26994) << 1)), objArr45);
            int i250 = 438 - (~(-TextUtils.indexOf(str18, str18, 0, 0)));
            int iResolveOpacity = Drawable.resolveOpacity(0, 0);
            int i251 = (iResolveOpacity * (-963)) - 964;
            int i252 = (i251 & 38600) + (i251 | 38600);
            int i253 = ~iResolveOpacity;
            int i254 = ~(((-41) & i) | ((-41) ^ i));
            int i255 = ((i253 & i254) | (i253 ^ i254)) * (-964);
            int i256 = ((i252 | i255) << 1) - (i255 ^ i252);
            int i257 = ~(((-41) ^ i91) | ((-41) & i91));
            int i258 = ~((-41) | iResolveOpacity);
            int i259 = ((i258 & i257) | (i257 ^ i258)) * (-964);
            Object[] objArr46 = new Object[1];
            a(i250, (i256 ^ i259) + ((i259 & i256) << 1), (char) ((-2) - ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) ^ (-1))), objArr46);
            int i260 = -ExpandableListView.getPackedPositionGroup(0L);
            int i261 = ((i260 | 479) << 1) - (i260 ^ 479);
            int i262 = -View.MeasureSpec.getMode(0);
            Object[] objArr47 = new Object[1];
            a(i261, ((i262 | 27) << 1) - (i262 ^ 27), (char) View.combineMeasuredStates(0, 0), objArr47);
            int i263 = -TextUtils.indexOf((CharSequence) str18, '0', 0, 0);
            Object[] objArr48 = new Object[1];
            a((i263 ^ TypedValues.PositionType.TYPE_SIZE_PERCENT) + ((i263 & TypedValues.PositionType.TYPE_SIZE_PERCENT) << 1), 27 - (~ExpandableListView.getPackedPositionChild(0L)), (char) (56365 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr48);
            int i264 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            int i265 = ((i264 | 533) << 1) - (i264 ^ 533);
            int threadPriority2 = Process.getThreadPriority(0);
            int iB2 = SearchView9.b();
            int i266 = threadPriority2 * (-271);
            int i267 = (5460 ^ i266) + ((i266 & 5460) << 1);
            int i268 = ~threadPriority2;
            int i269 = (i268 & (-21)) | ((-21) ^ i268);
            int i270 = ~iB2;
            int i271 = ~((i269 & i270) | (i269 ^ i270));
            int i272 = (threadPriority2 ^ 20) | (threadPriority2 & 20);
            int i273 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentbindingInflater1 = i273 % 128;
            int i274 = i273 % 2;
            int i275 = ~((i272 ^ iB2) | (i272 & iB2));
            int i276 = (-272) * ((i275 & i271) | (i271 ^ i275));
            int i277 = (i267 ^ i276) + ((i276 & i267) << 1);
            int i278 = ~(((-21) & threadPriority2) | ((-21) ^ threadPriority2));
            int i279 = ~(((-21) ^ iB2) | ((-21) & iB2));
            int i280 = i277 + (((i278 & i279) | (i278 ^ i279)) * (-272));
            int i281 = ~(iB2 | 20);
            int i282 = ((i281 & threadPriority2) | (threadPriority2 ^ i281)) * 272;
            int i283 = -(((i280 & i282) + (i282 | i280)) >> 6);
            Object[] objArr49 = new Object[1];
            a(i265, (27 & i283) + (27 | i283), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43106), objArr49);
            Object[] objArr50 = new Object[1];
            a(559 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))), 26 - Process.getGidForName(str18), (char) ExpandableListView.getPackedPositionType(0L), objArr50);
            String[] strArr12 = {(String) objArr45[0], (String) objArr46[0], (String) objArr47[0], (String) objArr48[0], (String) objArr49[0], (String) objArr50[0]};
            int i284 = 0;
            while (true) {
                if (i284 >= 6) {
                    i10 = i;
                    break;
                }
                Object[] objArr51 = {strArr12[i284]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 33603);
                    int offsetAfter = TextUtils.getOffsetAfter(str18, 0) + 3085;
                    int size3 = View.MeasureSpec.getSize(0) + 26;
                    byte b22 = (byte) 0;
                    byte b23 = (byte) (b22 + 1);
                    Object[] objArr52 = new Object[1];
                    c(b22, b23, (byte) (b23 - 1), objArr52);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(bitsPerPixel2, offsetAfter, size3, 1411172903, false, (String) objArr52[0], new Class[]{String.class});
                }
                String str24 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr51);
                if (str24 != null && !str24.isEmpty()) {
                    i10 = i ^ 265;
                    break;
                }
                i284 = ((i284 | 1) << 1) - (i284 ^ 1);
                strArr12 = strArr12;
            }
            int i285 = (~(i & i244)) & (i | i244);
            int i286 = -i285;
            int i287 = ((i285 & i286) | (i285 ^ i286)) >> 31;
            int i288 = i10 & (~i287);
            int i289 = i244 & i287;
            int i290 = (i289 & i288) | (i288 ^ i289);
            int i291 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            int i292 = (i291 ^ 347) + ((i291 & 347) << 1);
            int i293 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr53 = new Object[1];
            a(i292, ((i293 | 17) << 1) - (i293 ^ 17), (char) (47065 - (~Process.getGidForName(str18))), objArr53);
            String str25 = (String) objArr53[0];
            int i294 = -View.resolveSize(0, 0);
            Object[] objArr54 = new Object[1];
            a(((i294 | 587) << 1) - (i294 ^ 587), View.combineMeasuredStates(0, 0) + 6, (char) TextUtils.getOffsetAfter(str18, 0), objArr54);
            byte[] bytes2 = ((String) objArr54[0]).getBytes();
            int length3 = bytes2.length;
            if (length3 == 0) {
                int i295 = TuitionPaymentFragmentbindingInflater1 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i295 % 128;
                int i296 = i295 % 2;
                i11 = (~(i & 260)) & (i | 260);
                str3 = str18;
            } else {
                try {
                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str25));
                    int i297 = 4096;
                    try {
                        byte[] bArr3 = new byte[4096];
                        int i298 = 0;
                        while (true) {
                            int i299 = bufferedInputStream2.read(bArr3, 0, i297);
                            if (i299 <= 0) {
                                break;
                            }
                            int i300 = 0;
                            while (i298 < length3 && i300 < i299) {
                                int i301 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                                TuitionPaymentFragmentbindingInflater1 = i301 % 128;
                                if (i301 % 2 == 0) {
                                    int i302 = 79 / 0;
                                    if (bArr3[i300] == bytes2[i298]) {
                                        int i303 = (i298 & (-27)) + (i298 | (-27));
                                        i298 = ((i303 | 28) << 1) - (i303 ^ 28);
                                        bArr = bArr3;
                                        i12 = i299;
                                        i300++;
                                    } else if (i298 != 0) {
                                        int i304 = ((-2109453171) ^ i) | ((-2109453171) & i);
                                        int i305 = ((i304 ^ 748439788) | (i304 & 748439788)) * (-381);
                                        int i306 = ((-1712948686) & i305) + ((-1712948686) | i305);
                                        int i307 = (~(((-2109453171) & i91) | (i91 ^ (-2109453171)))) | (-2109733887);
                                        int i308 = -(-(((i307 ^ 748159072) | (i307 & 748159072)) * 381));
                                        int i309 = (((i306 | i308) << 1) - (i306 ^ i308)) - 1037991478;
                                        int iB3 = SearchView9.b();
                                        bArr = bArr3;
                                        int i310 = ~iB3;
                                        int i311 = ~(((-1373191304) ^ i310) | ((-1373191304) & i310));
                                        int i312 = (i311 ^ 29441027) | (i311 & 29441027);
                                        i12 = i299;
                                        int i313 = ~(((-772047137) ^ iB3) | ((-772047137) & iB3));
                                        int i314 = ((i312 ^ i313) | (i312 & i313)) * (-713);
                                        int i315 = (((-2003156890) | i314) << 1) - (i314 ^ (-2003156890));
                                        int i316 = (~(((-772047137) & iB3) | ((-772047137) ^ iB3))) * 1426;
                                        int i317 = (i315 & i316) + (i315 | i316);
                                        int i318 = -(-((~((~iB3) | (-2115797413))) * 713));
                                        int i319 = ((i317 | i318) << 1) - (i318 ^ i317);
                                        i13 = i298 - 1;
                                        while (true) {
                                            if (i13 > 0) {
                                                i298 = 0;
                                                break;
                                            }
                                            int i320 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                                            TuitionPaymentFragmentbindingInflater1 = i320 % 128;
                                            int i321 = i320 % 2;
                                            i14 = 0;
                                            while (true) {
                                                if (i14 < i13) {
                                                    i298 = i13;
                                                    break;
                                                }
                                                int i322 = -i13;
                                                i15 = (i298 ^ i322) + ((i322 & i298) << 1);
                                                if (bytes2[i14] != bytes2[(i15 & i14) + (i15 | i14)]) {
                                                    break;
                                                }
                                                i14 = ((i14 | 1) << 1) - (i14 ^ 1);
                                            }
                                            i13 = (i13 << 1) + (~i13);
                                        }
                                    } else {
                                        bArr = bArr3;
                                        i12 = i299;
                                        i300++;
                                    }
                                } else {
                                    if (bArr3[i300] != bytes2[i298]) {
                                        if (i298 != 0) {
                                            int i3010 = ((-2109453171) ^ i) | ((-2109453171) & i);
                                            int i3011 = ((i3010 ^ 748439788) | (i3010 & 748439788)) * (-381);
                                            int i3012 = ((-1712948686) & i3011) + ((-1712948686) | i3011);
                                            int i3013 = (~(((-2109453171) & i91) | (i91 ^ (-2109453171)))) | (-2109733887);
                                            int i3014 = -(-(((i3013 ^ 748159072) | (i3013 & 748159072)) * 381));
                                            int i3015 = (((i3012 | i3014) << 1) - (i3012 ^ i3014)) - 1037991478;
                                            int iB4 = SearchView9.b();
                                            bArr = bArr3;
                                            int i3110 = ~iB4;
                                            int i3111 = ~(((-1373191304) ^ i3110) | ((-1373191304) & i3110));
                                            int i3112 = (i3111 ^ 29441027) | (i3111 & 29441027);
                                            i12 = i299;
                                            int i3113 = ~(((-772047137) ^ iB4) | ((-772047137) & iB4));
                                            int i3114 = ((i3112 ^ i3113) | (i3112 & i3113)) * (-713);
                                            int i3115 = (((-2003156890) | i3114) << 1) - (i3114 ^ (-2003156890));
                                            int i3116 = (~(((-772047137) & iB4) | ((-772047137) ^ iB4))) * 1426;
                                            int i3117 = (i3115 & i3116) + (i3115 | i3116);
                                            int i3118 = -(-((~((~iB4) | (-2115797413))) * 713));
                                            int i3119 = ((i3117 | i3118) << 1) - (i3118 ^ i3117);
                                            i13 = i298 - 1;
                                            while (true) {
                                                if (i13 > 0) {
                                                    i298 = 0;
                                                    break;
                                                    break;
                                                }
                                                int i323 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                                                TuitionPaymentFragmentbindingInflater1 = i323 % 128;
                                                int i324 = i323 % 2;
                                                i14 = 0;
                                                while (true) {
                                                    if (i14 < i13) {
                                                        i298 = i13;
                                                        break;
                                                        break;
                                                    }
                                                    int i325 = -i13;
                                                    i15 = (i298 ^ i325) + ((i325 & i298) << 1);
                                                    if (bytes2[i14] != bytes2[(i15 & i14) + (i15 | i14)]) {
                                                        break;
                                                    }
                                                    i14 = ((i14 | 1) << 1) - (i14 ^ 1);
                                                }
                                                i13 = (i13 << 1) + (~i13);
                                            }
                                        }
                                    } else {
                                        int i3016 = (i298 & (-27)) + (i298 | (-27));
                                        i298 = ((i3016 | 28) << 1) - (i3016 ^ 28);
                                    }
                                    bArr = bArr3;
                                    i12 = i299;
                                    i300++;
                                }
                                bArr3 = bArr;
                                i299 = i12;
                            }
                            bArr3 = bArr3;
                            i297 = 4096;
                        }
                        boolean z2 = i298 == length3;
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        if (z2) {
                            int i2910 = TuitionPaymentFragmentbindingInflater1 + 93;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2910 % 128;
                            int i2911 = i2910 % 2;
                            i11 = (~(i & 260)) & (i | 260);
                            str3 = str18;
                        } else {
                            int i326 = 592 - (~Gravity.getAbsoluteGravity(0, 0));
                            int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                            Object[] objArr55 = new Object[1];
                            a(i326, ((jumpTapTimeout2 | 13) << 1) - (jumpTapTimeout2 ^ 13), (char) (Process.myPid() >> 22), objArr55);
                            String str26 = (String) objArr55[0];
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 607;
                            long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
                            int i327 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
                            TuitionPaymentFragmentbindingInflater1 = i327 % 128;
                            int i328 = i327 % 2;
                            Object[] objArr56 = new Object[1];
                            a(modifierMetaStateMask, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 8, (char) Color.blue(0), objArr56);
                            Object[] objArr57 = {str26, (String) objArr56[0]};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                int i329 = 2386 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int iBlue = 32 - Color.blue(0);
                                byte b24 = (byte) 0;
                                byte b25 = (byte) (b24 + 1);
                                Object[] objArr58 = new Object[1];
                                c(b24, b25, (byte) (b25 - 1), objArr58);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(scrollBarSize, i329, iBlue, -1207062455, false, (String) objArr58[0], new Class[]{String.class, String.class});
                            }
                            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr57)).longValue();
                            long j51 = 890566092;
                            str3 = str18;
                            long j52 = j51 ^ j;
                            long j53 = 191;
                            long j54 = (((long) (-381)) * j51) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue8) + (((long) (-191)) * j52) + ((j51 | ((jLongValue8 | j46) ^ j)) * j53) + (j53 * (((j52 | jLongValue8) ^ j) | ((j47 | jLongValue8) ^ j))) + ((long) 1086477236);
                            int i330 = ((int) (j54 >> 32)) & (2112454738 + (((-335810625) | i91) * 494) + (((~((-1585765190) | i91)) | (-357831755)) * 494));
                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                            int i331 = ~elapsedCpuTime;
                            int i332 = ((int) j54) & (906197841 + (((~(1255572929 | i331)) | (-181653481)) * (-602)) + (((~(elapsedCpuTime | 1255572929)) | (-1255657450) | (~((-181568961) | i331))) * (-301)) + ((~(i331 | (-181653481))) * 301));
                            i11 = ((i330 & i332) | (i330 ^ i332)) != 0 ? i ^ 261 : i;
                        }
                    } catch (IOException unused2) {
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream == null) {
                            throw th;
                        }
                        try {
                            bufferedInputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (IOException unused5) {
                    bufferedInputStream2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedInputStream = null;
                }
            }
            int i333 = ((~i290) & i) | (i290 & i91);
            int i334 = -i333;
            int i335 = ((i333 & i334) | (i333 ^ i334)) >> 31;
            int i336 = i11 & (~i335);
            int i337 = i290 & i335;
            int i338 = (i337 & i336) | (i336 ^ i337);
            if ((i2 & 8) == 0) {
                SearchView9.b();
                String[] strArr13 = new String[3];
                int i339 = 614 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                int i340 = -(Process.myPid() >> 22);
                Object[] objArr59 = new Object[1];
                a(i339, (i340 ^ 43) + ((i340 & 43) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr59);
                strArr13[0] = (String) objArr59[0];
                int i341 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                TuitionPaymentFragmentbindingInflater1 = i341 % 128;
                int i342 = i341 % 2;
                int i343 = -Drawable.resolveOpacity(0, 0);
                int i344 = (658 & i343) + (i343 | 658);
                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 41;
                int i345 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                char c5 = (char) ((i345 & 7475) + (i345 | 7475));
                Object[] objArr60 = new Object[1];
                a(i344, iResolveOpacity2, c5, objArr60);
                strArr13[1] = (String) objArr60[0];
                int i346 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i347 = (i346 & 699) + (i346 | 699);
                int defaultSize = View.getDefaultSize(0, 0);
                int i348 = TuitionPaymentFragmentbindingInflater1;
                int i349 = (i348 & 51) + (i348 | 51);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i349 % 128;
                if (i349 % 2 != 0) {
                    Object[] objArr61 = new Object[1];
                    a(i347, 38 >>> defaultSize, (char) ((SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)) * 57639), objArr61);
                    strArr13[2] = (String) objArr61[0];
                } else {
                    int i350 = -defaultSize;
                    Object[] objArr62 = new Object[1];
                    a(i347, (i350 & 38) + (38 | i350), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 57639), objArr62);
                    strArr13[2] = (String) objArr62[0];
                }
                int i351 = 0;
                while (true) {
                    if (i351 >= 3) {
                        i50 = i338;
                        i51 = i;
                        break;
                    }
                    int i352 = TuitionPaymentFragmentbindingInflater1;
                    int i353 = (i352 ^ 37) + ((i352 & 37) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i353 % 128;
                    if (i353 % 2 != 0) {
                        Object[] objArr63 = {strArr13[i351]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int offsetBefore = TextUtils.getOffsetBefore(str3, 0) + 993;
                            int iGreen = Color.green(0) + 8;
                            byte b26 = (byte) 0;
                            byte b27 = b26;
                            Object[] objArr64 = new Object[1];
                            c(b26, b27, b27, objArr64);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cAlpha, offsetBefore, iGreen, 349342683, false, (String) objArr64[0], new Class[]{String.class});
                        }
                        long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr63)).longValue();
                        long j55 = -405577147;
                        strArr6 = strArr13;
                        long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                        long j56 = elapsedCpuTime2 ^ j;
                        long j57 = 521;
                        long j58 = j55 ^ j;
                        long j59 = (((long) 522) * j55) + (((long) (-520)) * jLongValue9) + (((long) (-1042)) * (j55 | ((j56 | jLongValue9) ^ j))) + ((jLongValue9 | elapsedCpuTime2) * j57) + (j57 * (((j58 | (jLongValue9 ^ j)) ^ j) | ((j58 | elapsedCpuTime2) ^ j) | (((j56 | j55) | jLongValue9) ^ j))) + ((long) (-441501458));
                        int i354 = (-118700208) + (((~((-980629499) | i91)) | 269551008) * (-1188));
                        int i355 = 269551008 | (~(980629498 | i));
                        int i356 = ~((-1877111387) | i91);
                        int i357 = ((int) (j59 << 100)) & (i354 + ((i355 | i356) * 594) + (((~(980629498 | i91)) | 1166032896 | i356) * 594));
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i358 = ~iElapsedRealtime;
                        if ((i357 | (((int) j59) & ((-1141375789) + (((~(1762454155 | i358)) | 325227745) * (-602)) + (((~(iElapsedRealtime | 1762454155)) | 308417632 | (~((-1745644043) | i358))) * (-301)) + ((~(i358 | 325227745)) * 301)))) != 0) {
                            int i359 = (i351 & 280) + (i351 | 280);
                            i51 = (i359 & i91) | ((~i359) & i);
                            i50 = i338;
                            break;
                        }
                        i351++;
                        strArr13 = strArr6;
                        i338 = i338;
                    } else {
                        i338 = i338;
                        strArr6 = strArr13;
                        Object[] objArr65 = {strArr6[i351]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) str3, '0'));
                            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 994;
                            int iBlue2 = 8 - Color.blue(0);
                            byte b28 = (byte) 0;
                            byte b29 = b28;
                            Object[] objArr66 = new Object[1];
                            c(b28, b29, b29, objArr66);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cIndexOf, modifierMetaStateMask2, iBlue2, 349342683, false, (String) objArr66[0], new Class[]{String.class});
                        }
                        long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr65)).longValue();
                        long j60 = 291109358;
                        long j61 = 881;
                        long j62 = (j61 * j60) + (j61 * jLongValue10);
                        long j63 = -880;
                        long j64 = j60 ^ j;
                        long j65 = jLongValue10 ^ j;
                        long j66 = (j60 | j46) ^ j;
                        long j67 = j62 + ((((j64 | j65) ^ j) | ((j64 | j46) ^ j) | ((j65 | j46) ^ j)) * j63) + (j63 * (jLongValue10 | ((j64 | j47) ^ j) | j66)) + (((long) 880) * j66) + ((long) (-1138187963));
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i360 = ((int) (j67 >> 32)) & ((((-1498409984) + ((2112585469 | startElapsedRealtime) * (-381))) + (((~((~startElapsedRealtime) | 1842048668)) | 1978300013) * 381)) - 1736179718);
                        int i361 = ((int) j67) & ((-2038855459) + (((~((-2468641) | i)) | (~(1576381418 | i91))) * 920) + (((~((-136686369) | i91)) | 2468640) * 920) + (((~((-2468641) | i91)) | (~((-134217729) | i)) | (~(1576381418 | i))) * 920));
                        if (((i360 & i361) | (i360 ^ i361)) != 0) {
                            int i3510 = (i351 & 280) + (i351 | 280);
                            i51 = (i3510 & i91) | ((~i3510) & i);
                            i50 = i338;
                            break;
                        }
                        i351++;
                        strArr13 = strArr6;
                        i338 = i338;
                    }
                }
                int i362 = ((~i50) & i) | (i50 & i91);
                int i363 = -i362;
                int i364 = ((i362 & i363) | (i362 ^ i363)) >> 31;
                i338 = (i51 & (~i364)) | (i50 & i364);
            }
            int i365 = -Color.blue(0);
            Object[] objArr67 = new Object[1];
            a((i365 & 737) + (i365 | 737), 39 - (~(-TextUtils.lastIndexOf(str3, '0'))), (char) (1882 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16))))), objArr67);
            String str27 = (String) objArr67[0];
            int i366 = -ImageFormat.getBitsPerPixel(0);
            int i367 = (i366 & 777) + (i366 | 777);
            int iLastIndexOf3 = TextUtils.lastIndexOf(str3, '0', 0);
            int iB5 = SearchView9.b();
            int i368 = iLastIndexOf3 * 375;
            int i369 = ((i368 | (-23157)) << 1) - (i368 ^ (-23157));
            int i370 = ~iLastIndexOf3;
            int i371 = ~((i370 ^ 31) | (i370 & 31));
            int i372 = ~iB5;
            int i373 = (i372 & iLastIndexOf3) | (i372 ^ iLastIndexOf3);
            int i374 = ~i373;
            int i375 = ((i371 ^ i374) | (i371 & i374)) * (-374);
            int i376 = (i369 & i375) + (i369 | i375);
            int i377 = -(-((~((iLastIndexOf3 & (-32)) | ((-32) ^ iLastIndexOf3))) * 748));
            int i378 = ~(i370 | (-32));
            int i379 = ~i373;
            Object[] objArr68 = new Object[1];
            a(i367, ((((i376 | i377) << 1) - (i377 ^ i376)) - (~(((i379 & i378) | (i378 ^ i379)) * 374))) - 1, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr68);
            String[] strArr14 = {str27, (String) objArr68[0]};
            int i380 = 0;
            int i381 = 2;
            while (true) {
                if (i380 >= i381) {
                    i16 = i338;
                    j2 = j46;
                    i17 = i;
                    break;
                }
                Object[] objArr69 = {strArr14[i380]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char c6 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int i382 = 993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i383 = 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b30 = (byte) 0;
                    byte b31 = (byte) (b30 + 1);
                    Object[] objArr70 = new Object[1];
                    c(b30, b31, (byte) (b31 - 1), objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c6, i382, i383, 410748506, false, (String) objArr70[0], new Class[]{String.class});
                }
                long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr69)).longValue();
                long j68 = 785910301;
                j2 = j46;
                long j69 = -159;
                long j70 = (j69 * j68) + (j69 * jLongValue11);
                long j71 = 160;
                i16 = i338;
                long j72 = j70 + ((jLongValue11 | (j68 ^ j)) * j71) + (((long) (-160)) * (((j47 | j68) ^ j) | ((j68 | jLongValue11) ^ j))) + (j71 * ((((jLongValue11 ^ j) | j47) ^ j) | j68)) + ((long) (-986828538));
                int iMyTid = Process.myTid();
                int i384 = ((int) (j72 >> 32)) & (1520786966 + (((~((~iMyTid) | 563497637)) | (-899042214)) * 529) + (((~(iMyTid | 563497637)) | (-873728774)) * 529));
                int i385 = ~((-888379108) | i91);
                int i386 = ~((-1969361779) | i);
                int i387 = ((int) j72) & (334239082 + ((i385 | i386) * 1150) + (((~(1969361778 | i91)) | i386) * (-575)) + (((~((-888379108) | i)) | (~(888379107 | i91))) * 575));
                if (((i387 & i384) | (i384 ^ i387)) != 0) {
                    i17 = ((i380 ^ 288) + ((i380 & 288) << 1)) ^ i;
                    break;
                }
                i380 = (i380 ^ 1) + ((i380 & 1) << 1);
                i338 = i16;
                j46 = j2;
                i381 = 2;
                strArr14 = strArr14;
            }
            int i388 = ((~i16) & i) | (i16 & i91);
            int i389 = -i388;
            int i390 = ((i388 & i389) | (i388 ^ i389)) >> 31;
            int i391 = i17 & (~i390);
            int i392 = i390 & i16;
            int i393 = (i391 & i392) | (i391 ^ i392);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char c7 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i394 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3525;
                int offsetBefore2 = TextUtils.getOffsetBefore(str3, 0) + 23;
                byte b32 = (byte) 0;
                byte b33 = (byte) (b32 + 1);
                Object[] objArr71 = new Object[1];
                c(b32, b33, (byte) (b33 - 1), objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c7, i394, offsetBefore2, 980946500, false, (String) objArr71[0], new Class[0]);
            }
            long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, null)).longValue();
            long j73 = 6384731;
            long j74 = -494;
            long j75 = (j74 * j73) + (j74 * jLongValue12) + (((long) (-495)) * ((j73 | jLongValue12) ^ j));
            long j76 = 495;
            long j77 = j73 | j47;
            long j78 = j75 + (j76 * j77) + (j76 * ((((jLongValue12 ^ j) | (j73 ^ j)) ^ j) | (j77 ^ j))) + ((long) (-186707369));
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i395 = ~(2147466991 | startUptimeMillis2);
            int i396 = ((int) (j78 >> 32)) & (1049531226 + ((161616900 | i395) * (-476)) + (i395 * 952) + ((~((~startUptimeMillis2) | 2147466991)) * 476));
            int i397 = ~new Random().nextInt();
            int i398 = ~((-167472633) | i397);
            int i399 = ((int) j78) & ((-1678744151) + (((-1269753778) | i398) * 764) + (((~(i397 | (-1269753778))) | 1107591681) * (-1528)) + ((1112902217 | i398) * 764));
            if (((i396 & i399) | (i396 ^ i399)) != 1) {
                Object[] objArr72 = {1};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iAlpha = 2673 - Color.alpha(0);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 17;
                    byte b34 = (byte) 0;
                    byte b35 = (byte) (b34 + 1);
                    Object[] objArr73 = new Object[1];
                    c(b34, b35, (byte) (b35 - 1), objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cCombineMeasuredStates, iAlpha, packedPositionChild2, -1409439630, false, (String) objArr73[0], new Class[]{Integer.TYPE});
                }
                long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr72)).longValue();
                long j79 = 1864558877;
                long j80 = 184;
                long j81 = j79 ^ j;
                long jMyTid2 = Process.myTid();
                long j82 = jMyTid2 ^ j;
                String str28 = str3;
                long j83 = (((long) (-183)) * j79) + (((long) 185) * jLongValue13) + ((((j81 | jLongValue13) ^ j) | ((j82 | jLongValue13) ^ j)) * j80) + (((long) (-184)) * (jMyTid2 | (((jLongValue13 ^ j) | j79) ^ j))) + (j80 * ((j81 | j82) ^ j)) + ((long) 3139803);
                int i400 = ~new Random().nextInt(433066752);
                int i401 = ((int) (j83 >> 32)) & ((-1491543742) + (((-138421251) | i400) * 494) + (((~(i400 | 1203214748)) | (-1246045587)) * 494));
                int i402 = ((int) j83) & (1320243365 + (((~(1361048822 | i)) | (-1436546296)) * 1504) + ((~((-75497474) | i)) * (-1504)) + 1734576816);
                int i403 = ((i401 & i402) | (i401 ^ i402)) != 0 ? i ^ 220 : i;
                int i404 = (~(i & i393)) & (i | i393);
                int i405 = -i404;
                int i406 = ((i404 & i405) | (i404 ^ i405)) >> 31;
                int i407 = i403 & (~i406);
                int i408 = i393 & i406;
                int i409 = (i408 & i407) | (i407 ^ i408);
                int iResolveSize = View.resolveSize(0, 0);
                int i410 = -(-TextUtils.indexOf((CharSequence) str28, '0'));
                Object[] objArr74 = new Object[1];
                a(((iResolveSize | 370) << 1) - (iResolveSize ^ 370), ((i410 | 24) << 1) - (i410 ^ 24), (char) (TextUtils.indexOf((CharSequence) str28, '0', 0) + 1), objArr74);
                Object[] objArr75 = {(String) objArr74[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char c8 = (char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int fadingEdgeLength2 = 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int scrollBarFadeDuration3 = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b36 = (byte) 0;
                    byte b37 = (byte) (b36 + 1);
                    Object[] objArr76 = new Object[1];
                    c(b36, b37, (byte) (b37 - 1), objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c8, fadingEdgeLength2, scrollBarFadeDuration3, 1411172903, false, (String) objArr76[0], new Class[]{String.class});
                }
                Object objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr75);
                try {
                    if (objInvoke2 != null) {
                        Object[] objArr77 = {objInvoke2, 42};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int keyRepeatTimeout2 = 3393 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iResolveSizeAndState = 9 - View.resolveSizeAndState(0, 0, 0);
                            byte b38 = (byte) 0;
                            byte b39 = (byte) (b38 + 1);
                            Object[] objArr78 = new Object[1];
                            c(b38, b39, (byte) (b39 - 1), objArr78);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cMakeMeasureSpec, keyRepeatTimeout2, iResolveSizeAndState, 1203525406, false, (String) objArr78[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr77)).longValue();
                        long j84 = 673246227;
                        long j85 = jLongValue14 ^ j;
                        long j86 = (j84 | j2) ^ j;
                        long j87 = (((long) (-813)) * j84) + (((long) 408) * jLongValue14) + (((long) (-814)) * (((j85 | j84) ^ j) | j86));
                        long j88 = 407;
                        long j89 = j84 ^ j;
                        long j90 = (j89 | jLongValue14) ^ j;
                        long j91 = j87 + ((((j85 | j47) ^ j) | j90 | j86) * j88) + (j88 * (((jLongValue14 | j2) ^ j) | j90 | ((j89 | j2) ^ j))) + ((long) (-675316104));
                        int i411 = ((int) (j91 >> 32)) & (1758119403 + (((~(1545432460 | i91)) | (~((-1312308425) | i))) * 333) + (((~(1545432460 | i)) | (~(i91 | (-1312308425)))) * 333));
                        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                        int i412 = ~startElapsedRealtime2;
                        int i413 = ((int) j91) & ((-250456390) + (((~((-413987545) | i412)) | (~((-1716717571) | startElapsedRealtime2))) * (-831)) + ((~((-134496385) | startElapsedRealtime2)) * (-1662)) + (((~(startElapsedRealtime2 | 413987544)) | (~(i412 | 1851213954)) | (~((-1851213955) | startElapsedRealtime2))) * 831));
                        if (((i411 & i413) | (i411 ^ i413)) == 1986687685) {
                            i20 = i409;
                            strArr2 = null;
                            str4 = str28;
                            i19 = i91;
                        }
                        int iAlpha2 = 889 - Color.alpha(0);
                        int i414 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        Object[] objArr79 = new Object[1];
                        a(iAlpha2, (i414 ^ 17) + ((i414 & 17) << 1), (char) (15095 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))), objArr79);
                        Object[] objArr80 = {(String) objArr79[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char threadPriority3 = (char) (33602 - ((Process.getThreadPriority(0) + 20) >> 6));
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3085;
                            int capsMode3 = TextUtils.getCapsMode(str4, 0, 0) + 26;
                            byte b40 = (byte) 0;
                            byte b41 = (byte) (b40 + 1);
                            Object[] objArr81 = new Object[1];
                            c(b40, b41, (byte) (b41 - 1), objArr81);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority3, maximumFlingVelocity, capsMode3, 1411172903, false, (String) objArr81[0], new Class[]{String.class});
                        }
                        objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr80);
                        if (objInvoke == null) {
                            i22 = 0;
                        } else {
                            Object[] objArr82 = {objInvoke, 42};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMyTid2 = (char) (Process.myTid() >> 22);
                                int i415 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3392;
                                int doubleTapTimeout2 = 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                byte b42 = (byte) 0;
                                byte b43 = (byte) (b42 + 1);
                                Object[] objArr83 = new Object[1];
                                c(b42, b43, (byte) (b43 - 1), objArr83);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid2, i415, doubleTapTimeout2, 1203525406, false, (String) objArr83[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr82)).longValue();
                            long j92 = 1818039053;
                            long jNextInt = new Random().nextInt(1646128183);
                            long j93 = (((long) 860) * j92) + (((long) (-858)) * jLongValue15) + (((long) (-859)) * (j92 | jNextInt));
                            long j94 = 859;
                            long j95 = jNextInt ^ j;
                            long j96 = jLongValue15 ^ j;
                            long j97 = j93 + ((((j95 | j92) ^ j) | ((((j92 ^ j) | j96) | jNextInt) ^ j)) * j94) + (j94 * (((j96 | j95) ^ j) | ((j96 | j92) ^ j))) + ((long) (-1820108930));
                            int i416 = ((int) (j97 >> 32)) & ((((-1019427974) + (((~(i19 | (-5263381))) | (~(i19 | (-1208287233)))) * (-184))) + ((((~((-117101280) | i19)) | 111837899) | (~((-1320125132) | i19))) * 184)) - 941649848);
                            int i417 = ((int) j97) & ((-501357939) + (((~(14691303 | i19)) | (-1424632808)) * 168) + ((~(1424632807 | i)) * 168) + (((~(1422535106 | i19)) | 2097701 | (~((-1409941505) | i))) * 168));
                            i22 = (i416 & i417) | (i416 ^ i417);
                        }
                        if (i22 != 1986687685 || i22 == -1514516938) {
                            strArr3 = strArr2;
                            str5 = str4;
                            i23 = i20;
                        } else {
                            int i418 = 19;
                            int i419 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i420 = (i419 ^ 1608) + ((i419 & 1608) << 1);
                            str5 = str4;
                            Object[] objArr84 = new Object[1];
                            a(i420, 13 - (~(-TextUtils.getCapsMode(str5, 0, 0))), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr84);
                            int i421 = 1622 - (~(-(-Process.getGidForName(str5))));
                            int i422 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            Object[] objArr85 = new Object[1];
                            a(i421, ((i422 | 25) << 1) - (i422 ^ 25), (char) Gravity.getAbsoluteGravity(0, 0), objArr85);
                            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0);
                            Object[] objArr86 = new Object[1];
                            a((iResolveOpacity3 ^ 1648) + ((iResolveOpacity3 & 1648) << 1), 15 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (char) TextUtils.getCapsMode(str5, 0, 0), objArr86);
                            int i423 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1666;
                            int i424 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            Object[] objArr87 = new Object[1];
                            a(i423, ((i424 | 18) << 1) - (i424 ^ 18), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr87);
                            int i425 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                            int i426 = -TextUtils.indexOf(str5, str5, 0);
                            Object[] objArr88 = new Object[1];
                            a((i425 & 1682) + (i425 | 1682), (i426 & 15) + (i426 | 15), (char) KeyEvent.keyCodeFromString(str5), objArr88);
                            Object[] objArr89 = new Object[1];
                            a(1696 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, (char) Color.red(0), objArr89);
                            int i427 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int i428 = ((i427 | 1733) << 1) - (i427 ^ 1733);
                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                            Object[] objArr90 = new Object[1];
                            a(i428, (packedPositionGroup2 & 12) + (packedPositionGroup2 | 12), (char) TextUtils.indexOf(str5, str5, 0), objArr90);
                            int i429 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                            int i430 = ((i429 | 1746) << 1) - (i429 ^ 1746);
                            int i431 = -Color.red(0);
                            int i432 = ((i431 | 13) << 1) - (i431 ^ 13);
                            int doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                            Object[] objArr91 = new Object[1];
                            a(i430, i432, (char) (((doubleTapTimeout3 | 34308) << 1) - (doubleTapTimeout3 ^ 34308)), objArr91);
                            int i433 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i434 = (i433 & 1759) + (i433 | 1759);
                            int i435 = 20 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i436 = -(-ExpandableListView.getPackedPositionGroup(0L));
                            Object[] objArr92 = new Object[1];
                            a(i434, i435, (char) ((i436 ^ 53102) + ((i436 & 53102) << 1)), objArr92);
                            Object[] objArr93 = new Object[1];
                            a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1781, 30 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16)))), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr93);
                            Object[] objArr94 = new Object[1];
                            a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1812, 12 - Color.alpha(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr94);
                            int i437 = 1823 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                            int i438 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i439 = -KeyEvent.normalizeMetaState(0);
                            Object[] objArr95 = new Object[1];
                            a(i437, (i438 & 11) + (i438 | 11), (char) (((i439 | 42315) << 1) - (i439 ^ 42315)), objArr95);
                            int i440 = 1835 - (~TextUtils.getOffsetAfter(str5, 0));
                            int i441 = -(Process.myPid() >> 22);
                            int i442 = (i441 ^ 12) + ((i441 & 12) << 1);
                            int i443 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i444 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                            TuitionPaymentFragmentbindingInflater1 = i444 % 128;
                            int i445 = i444 % 2;
                            Object[] objArr96 = new Object[1];
                            a(i440, i442, (char) ((i443 & 55117) + (i443 | 55117)), objArr96);
                            byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                            int iB6 = SearchView9.b();
                            int i446 = modifierMetaStateMask3 * 319;
                            int i447 = (i446 & (-586133)) + (i446 | (-586133)) + (((~((~modifierMetaStateMask3) | iB6)) | (-1850)) * (-318));
                            int i448 = ~(((-1850) ^ iB6) | ((-1850) & iB6));
                            int i449 = ~iB6;
                            int i450 = (i449 ^ modifierMetaStateMask3) | (i449 & modifierMetaStateMask3);
                            int i451 = ~((i450 & 1849) | (i450 ^ 1849));
                            int i452 = -(-(((i448 & i451) | (i448 ^ i451)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                            int i453 = (i447 ^ i452) + ((i452 & i447) << 1);
                            int i454 = ~((-1850) | i449 | modifierMetaStateMask3);
                            int i455 = (modifierMetaStateMask3 & 1849) | (modifierMetaStateMask3 ^ 1849);
                            int i456 = ~((i455 & iB6) | (i455 ^ iB6));
                            int i457 = ((i456 & i454) | (i454 ^ i456)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                            int i458 = (i453 & i457) + (i457 | i453);
                            int i459 = 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i460 = -KeyEvent.normalizeMetaState(0);
                            int i461 = i460 * 71;
                            int i462 = ((i461 | (-1324179)) << 1) - (i461 ^ (-1324179));
                            int i463 = ~((~i460) | 19191);
                            int i464 = ~((i ^ 19191) | (i & 19191));
                            int i465 = -(-(((i463 & i464) | (i463 ^ i464)) * (-140)));
                            int i466 = (i462 & i465) + (i465 | i462);
                            int i467 = (i460 ^ 19191) | (i460 & 19191);
                            int i468 = (~((i467 & i) | (i467 ^ i))) * 70;
                            int i469 = (i466 & i468) + (i468 | i466);
                            int i470 = ~((~i460) | 19191);
                            int i471 = ~(((-19192) & i460) | ((-19192) ^ i460));
                            int i472 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i473 = ((i472 | 19) << 1) - (i472 ^ 19);
                            TuitionPaymentFragmentbindingInflater1 = i473 % 128;
                            int i474 = i473 % 2;
                            int i475 = (i470 & i471) | (i470 ^ i471);
                            int i476 = ~((i460 & i) | (i460 ^ i));
                            char c9 = (char) ((i469 - (~(70 * ((i476 & i475) | (i475 ^ i476))))) - 1);
                            Object[] objArr97 = new Object[1];
                            a(i458, i459, c9, objArr97);
                            Object[] objArr98 = new Object[1];
                            a(1861 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 12 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.getOffsetAfter(str5, 0), objArr98);
                            int i477 = -((Process.getThreadPriority(0) + 20) >> 6);
                            int i478 = ((i477 | 1872) << 1) - (i477 ^ 1872);
                            int i479 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int i480 = ((i479 | 14) << 1) - (i479 ^ 14);
                            int i481 = -(-TextUtils.indexOf((CharSequence) str5, '0'));
                            Object[] objArr99 = new Object[1];
                            a(i478, i480, (char) ((i481 & 30282) + (i481 | 30282)), objArr99);
                            Object[] objArr100 = new Object[1];
                            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1885, TextUtils.getOffsetBefore(str5, 0) + 12, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr100);
                            int i482 = -TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                            int i483 = ((i482 | 1897) << 1) - (i482 ^ 1897);
                            int i484 = -View.combineMeasuredStates(0, 0);
                            Object[] objArr101 = new Object[1];
                            a(i483, (i484 ^ 24) + ((i484 & 24) << 1), (char) ((-2) - (~(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0)))), objArr101);
                            int i485 = -(-KeyEvent.keyCodeFromString(str5));
                            int i486 = (i485 ^ 1922) + ((i485 & 1922) << 1);
                            int i487 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                            Object[] objArr102 = new Object[1];
                            a(i486, i487, (char) (((windowTouchSlop | 31962) << 1) - (windowTouchSlop ^ 31962)), objArr102);
                            String[] strArr15 = {(String) objArr84[0], (String) objArr85[0], (String) objArr86[0], (String) objArr87[0], (String) objArr88[0], (String) objArr89[0], (String) objArr90[0], (String) objArr91[0], (String) objArr92[0], (String) objArr93[0], (String) objArr94[0], (String) objArr95[0], (String) objArr96[0], (String) objArr97[0], (String) objArr98[0], (String) objArr99[0], (String) objArr100[0], (String) objArr101[0], (String) objArr102[0]};
                            int i488 = 0;
                            while (true) {
                                if (i488 >= i418) {
                                    i48 = i20;
                                    strArr3 = strArr2;
                                    i49 = -1;
                                    break;
                                }
                                String str29 = strArr15[i488];
                                Object[] objArr103 = {str29};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                    int iLastIndexOf4 = 992 - TextUtils.lastIndexOf(str5, '0');
                                    int i489 = 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    byte b44 = (byte) 0;
                                    byte b45 = b44;
                                    Object[] objArr104 = new Object[1];
                                    c(b44, b45, b45, objArr104);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cNormalizeMetaState, iLastIndexOf4, i489, 349342683, false, (String) objArr104[0], new Class[]{String.class});
                                }
                                long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr103)).longValue();
                                long j98 = 1014109247;
                                String[] strArr16 = strArr15;
                                i48 = i20;
                                long j99 = -754;
                                long j100 = j98 ^ j;
                                long j101 = j100 | jLongValue16;
                                strArr3 = strArr2;
                                int i490 = i488;
                                long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                long j102 = (((long) 755) * j98) + (((long) (-753)) * jLongValue16) + (((j101 ^ j) | ((j100 | jFreeMemory) ^ j) | ((jLongValue16 | jFreeMemory) ^ j)) * j99);
                                long j103 = (j101 | jFreeMemory) ^ j;
                                long j104 = jFreeMemory ^ j;
                                long j105 = j102 + (j99 * (j103 | ((jLongValue16 | (j98 | j104)) ^ j))) + (((long) 754) * (j100 | j104)) + ((long) (-1861187852));
                                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                int i491 = ((int) (j105 >> 32)) & ((-2088991750) + (((-1427472803) | iUptimeMillis2) * 376) + (((~((~iUptimeMillis2) | 71985926)) | (-1432349607)) * (-376)) + (((~(iUptimeMillis2 | (-71985927))) | 1365240484) * 376));
                                int i492 = (~(1562842837 | i)) | (~(i19 | 125616427));
                                int i493 = ~(i19 | (-1562842838));
                                int i494 = ((int) j105) & ((-803846063) + ((i492 | i493) * (-516)) + (((~((-39371051) | i)) | (~(i19 | (-86245378)))) * 516) + ((86245377 | i493) * 516));
                                if (((i491 & i494) | (i491 ^ i494)) == 0) {
                                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 1872;
                                    int i495 = -(-Gravity.getAbsoluteGravity(0, 0));
                                    Object[] objArr105 = new Object[1];
                                    a(packedPositionGroup3, (i495 & 14) + (i495 | 14), (char) (30281 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr105);
                                    if (str29.equals((String) objArr105[0])) {
                                        Object[] objArr106 = {str29};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                            char cRed = (char) Color.red(0);
                                            int i496 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 993;
                                            int iAxisFromString4 = MotionEvent.axisFromString(str5) + 9;
                                            byte b46 = (byte) 0;
                                            byte b47 = b46;
                                            Object[] objArr107 = new Object[1];
                                            c(b46, b47, b47, objArr107);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cRed, i496, iAxisFromString4, 349342683, false, (String) objArr107[0], new Class[]{String.class});
                                        }
                                        long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(null, objArr106)).longValue();
                                        long j106 = -271591952;
                                        long j107 = (((long) (-244)) * j106) + (((long) 246) * jLongValue17);
                                        long j108 = -245;
                                        long j109 = jLongValue17 ^ j;
                                        long j110 = j107 + ((((j109 | j47) ^ j) | ((j109 | j106) ^ j)) * j108);
                                        long j111 = (j109 | j2) ^ j;
                                        long j112 = j110 + (j108 * j111) + (((long) 245) * (j111 | j106)) + ((long) (-575486653));
                                        int i497 = ((int) (j112 >> 32)) & ((-2055567968) + (((~((-1784731783) | i19)) | (-347505372)) * 226) + (((~(347505371 | i)) | (-2130107104) | (~(i19 | (-2130051)))) * (-113)) + ((~((-1784731783) | i)) * 113));
                                        int i498 = ((int) j112) & ((-1738041619) + (((~(1383799912 | i19)) | (-1400847722) | (~(53426497 | i19))) * (-1136)) + (((~(1383799912 | i)) | (~(53426497 | i)) | (~(i19 | (-36378689)))) * (-568)) + (((~(i19 | (-1383799913))) | (~(i19 | (-53426498))) | (~(1400847721 | i))) * 568));
                                        if (((i497 & i498) | (i497 ^ i498)) != 0) {
                                            int i499 = TuitionPaymentFragmentbindingInflater1 + 41;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i499 % 128;
                                            int i500 = i499 % 2;
                                        }
                                    }
                                    i488 = i490 + 1;
                                    strArr2 = strArr3;
                                    i20 = i48;
                                    strArr15 = strArr16;
                                    i418 = 19;
                                }
                                i49 = i490;
                                break;
                            }
                            int i501 = ~i49;
                            int i502 = -i501;
                            int i503 = ((i501 & i502) | (i501 ^ i502)) >> 31;
                            int i504 = (~i503) & i;
                            int i505 = (((i49 & 130) + (i49 | 130)) ^ i) & i503;
                            int i506 = (i505 & i504) | (i504 ^ i505);
                            int i507 = (~(i & i48)) & (i | i48);
                            int i508 = -i507;
                            int i509 = ((i507 & i508) | (i507 ^ i508)) >> 31;
                            int i510 = i506 & (~i509);
                            int i511 = i48 & i509;
                            i23 = (i510 ^ i511) | (i510 & i511);
                        }
                        int i512 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr108 = new Object[1];
                        a((i512 & 1950) + (i512 | 1950), 12 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), (char) (17541 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr108);
                        String str30 = (String) objArr108[0];
                        int i513 = 1964 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int packedPositionChild3 = 4 - ExpandableListView.getPackedPositionChild(0L);
                        int i514 = -(-Color.rgb(0, 0, 0));
                        Object[] objArr109 = new Object[1];
                        a(i513, packedPositionChild3, (char) ((i514 & 16822671) + (i514 | 16822671)), objArr109);
                        String[] strArr17 = {str30, (String) objArr109[0]};
                        int i515 = -Color.red(0);
                        int i516 = ((i515 | 1968) << 1) - (i515 ^ 1968);
                        int i517 = -ImageFormat.getBitsPerPixel(0);
                        Object[] objArr110 = new Object[1];
                        a(i516, (i517 & 14) + (i517 | 14), (char) (TextUtils.indexOf(str5, str5, 0) + 42449), objArr110);
                        String str31 = (String) objArr110[0];
                        int offsetAfter2 = TextUtils.getOffsetAfter(str5, 0);
                        int i518 = ((offsetAfter2 | 1983) << 1) - (offsetAfter2 ^ 1983);
                        int threadPriority4 = Process.getThreadPriority(0);
                        int i519 = -(-(((threadPriority4 ^ 20) + ((threadPriority4 & 20) << 1)) >> 6));
                        int i520 = (i519 & 19) + (i519 | 19);
                        int i521 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr111 = new Object[1];
                        a(i518, i520, (char) ((i521 ^ 20783) + ((i521 & 20783) << 1)), objArr111);
                        String str32 = (String) objArr111[0];
                        int i522 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i523 = -Color.red(0);
                        Object[] objArr112 = new Object[1];
                        a(((i522 | 2001) << 1) - (i522 ^ 2001), (i523 & 14) + (i523 | 14), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr112);
                        String[] strArr18 = {str31, str32, (String) objArr112[0]};
                        int mirror = AndroidCharacter.getMirror('0') + 1968;
                        int i524 = -(-TextUtils.indexOf(str5, str5, 0));
                        Object[] objArr113 = new Object[1];
                        a(mirror, (i524 & 21) + (i524 | 21), (char) ((-2) - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr113);
                        String str33 = (String) objArr113[0];
                        int i525 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i526 = -KeyEvent.normalizeMetaState(0);
                        Object[] objArr114 = new Object[1];
                        a((i525 ^ 2038) + ((i525 & 2038) << 1), (i526 ^ 10) + ((i526 & 10) << 1), (char) (26181 - (KeyEvent.getMaxKeyCode() >> 16)), objArr114);
                        String[] strArr19 = {str33, (String) objArr114[0]};
                        int i527 = -Color.rgb(0, 0, 0);
                        int i528 = ((i527 | (-16775169)) << 1) - (i527 ^ (-16775169));
                        int longPressTimeout = 11 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i529 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        Object[] objArr115 = new Object[1];
                        a(i528, longPressTimeout, (char) ((i529 ^ (-1)) + (i529 << 1)), objArr115);
                        String str34 = (String) objArr115[0];
                        int i530 = 586 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0))));
                        int i531 = -TextUtils.lastIndexOf(str5, '0');
                        Object[] objArr116 = new Object[1];
                        a(i530, (i531 & 5) + (i531 | 5), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr116);
                        String[] strArr20 = {str34, (String) objArr116[0]};
                        int threadPriority5 = Process.getThreadPriority(0);
                        int iB7 = SearchView9.b();
                        int i532 = threadPriority5 * (-958);
                        int i533 = ((-19160) & i532) + (i532 | (-19160));
                        int i534 = ~threadPriority5;
                        int i535 = ~iB7;
                        int i536 = ~((i534 ^ i535) | (i534 & i535));
                        int i537 = ~((-21) | iB7);
                        int i538 = (i536 ^ i537) | (i537 & i536);
                        int i539 = ~((i535 & 20) | (i535 ^ 20));
                        int i540 = ((i533 - (~(((i538 & i539) | (i538 ^ i539)) * 959))) - 1) + ((~(threadPriority5 | 20)) * (-959));
                        int i541 = ~iB7;
                        int i542 = ~(((-21) & i541) | ((-21) ^ i541));
                        int i543 = ~(i534 | iB7);
                        int i544 = ((~((iB7 & 20) | (iB7 ^ 20))) | (i542 & i543) | (i542 ^ i543)) * 959;
                        int i545 = -(-View.resolveSize(0, 0));
                        int i546 = ((i545 | 28) << 1) - (i545 ^ 28);
                        int i547 = -View.getDefaultSize(0, 0);
                        Object[] objArr117 = new Object[1];
                        a(2058 - (((i540 & i544) + (i544 | i540)) >> 6), i546, (char) (((i547 | 25058) << 1) - (i547 ^ 25058)), objArr117);
                        String str35 = (String) objArr117[0];
                        int iIndexOf5 = 2036 - TextUtils.indexOf((CharSequence) str5, '0', 0);
                        int i548 = -(-KeyEvent.getDeadChar(0, 0));
                        Object[] objArr118 = new Object[1];
                        a(iIndexOf5, (i548 ^ 10) + ((i548 & 10) << 1), (char) (26180 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))))), objArr118);
                        strArr4 = new String[][]{strArr17, strArr18, strArr19, strArr20, new String[]{str35, (String) objArr118[0]}};
                        i24 = 0;
                        i25 = -1;
                        loop7: while (true) {
                            if (i24 < 5) {
                                i26 = i23;
                                str6 = str5;
                                strArr3 = strArr3;
                                i27 = i;
                                break;
                            }
                            int i549 = TuitionPaymentFragmentbindingInflater1;
                            i43 = ((i549 | 87) << 1) - (i549 ^ 87);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
                            if (i43 % 2 != 0) {
                                String[] strArr21 = strArr4[i24];
                                str9 = strArr21[1];
                                strArr5 = (String[]) Arrays.copyOfRange(strArr21, 1, strArr21.length);
                                length2 = strArr5.length;
                                i44 = 0;
                            } else {
                                String[] strArr22 = strArr4[i24];
                                String str36 = strArr22[0];
                                strArr5 = (String[]) Arrays.copyOfRange(strArr22, 1, strArr22.length);
                                i44 = 0;
                                length2 = strArr5.length;
                                str9 = str36;
                            }
                            while (i44 < length2) {
                                i25 = ((i25 & 28) + (i25 | 28)) - 27;
                                Object[] objArr119 = {str9, strArr5[i44]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2385;
                                    int iResolveSizeAndState2 = 32 - View.resolveSizeAndState(0, 0, 0);
                                    byte b48 = (byte) 0;
                                    byte b49 = (byte) (b48 + 1);
                                    Object[] objArr120 = new Object[1];
                                    c(b48, b49, (byte) (b49 - 1), objArr120);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, maximumDrawingCacheSize, iResolveSizeAndState2, -1207062455, false, (String) objArr120[0], new Class[]{String.class, String.class});
                                }
                                long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr119)).longValue();
                                long j113 = -166659291;
                                i45 = i24;
                                long j114 = (((long) 450) * j113) + (((long) (-448)) * jLongValue18);
                                long j115 = 449;
                                long j116 = ((j113 ^ j) | jLongValue18) ^ j;
                                long j117 = jLongValue18 ^ j;
                                i26 = i23;
                                str6 = str5;
                                long j118 = j114 + ((j116 | (((j117 | j113) | j2) ^ j)) * j115) + (((long) (-1347)) * j116) + (j115 * (j116 | (((j117 | j47) | j113) ^ j))) + ((long) 2143702619);
                                i46 = ((int) (j118 >> 32)) & (((((~((-1056888400) | i)) | 676702484) * 262) - 1811943432) + (((~((-1056888400) | i19)) | 676702484) * 262));
                                i47 = ((int) j118) & ((((((~(715840405 | i19)) | 5578752) | (~(i19 | (-721386005)))) * (-397)) - 1450388152) + ((5611905 | i) * 397));
                                if (((i46 & i47) | (i46 ^ i47)) != 0) {
                                    int iB8 = SearchView9.b();
                                    int i550 = -(-(i25 * (-216)));
                                    int i551 = ((-73610) ^ i550) + ((i550 & (-73610)) << 1);
                                    int i552 = ~iB8;
                                    int i553 = ~(((-171) & i552) | ((-171) ^ i552));
                                    int i554 = ~i25;
                                    int i555 = ~((i554 ^ iB8) | (i554 & iB8));
                                    int i556 = ((i553 & i555) | (i553 ^ i555)) * 217;
                                    int i557 = ((i551 | i556) << 1) - (i551 ^ i556);
                                    int i558 = ~(((-171) ^ i554) | ((-171) & i554));
                                    int i559 = ~(iB8 | (-171));
                                    int i560 = ((i559 & i558) | (i558 ^ i559)) * 217;
                                    int i561 = ((i557 | i560) << 1) - (i560 ^ i557);
                                    int i562 = ~((i554 ^ i552) | (i552 & i554));
                                    int i563 = -(-(((i562 & 170) | (i562 ^ 170)) * 217));
                                    int i564 = ((i561 | i563) << 1) - (i563 ^ i561);
                                    i27 = ((~i564) & i) | (i564 & i19);
                                    break loop7;
                                }
                                i44++;
                                strArr4 = strArr4;
                                str9 = str9;
                                strArr3 = strArr3;
                                strArr5 = strArr5;
                                i24 = i45;
                                str5 = str6;
                                i23 = i26;
                            }
                            int i565 = i24;
                            i24 = (((i565 | (-57)) << 1) - (i565 ^ (-57))) + 58;
                            strArr4 = strArr4;
                            i23 = i23;
                        }
                        int i566 = (~(i & i26)) & (i | i26);
                        int i567 = -i566;
                        int i568 = ((i566 & i567) | (i566 ^ i567)) >> 31;
                        int i569 = i27 & (~i568);
                        int i570 = i26 & i568;
                        int i571 = (i569 & i570) | (i569 ^ i570);
                        int i572 = 2086 - (~ExpandableListView.getPackedPositionChild(0L));
                        int mode = View.MeasureSpec.getMode(0) + 13;
                        int i573 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        Object[] objArr121 = new Object[1];
                        a(i572, mode, (char) ((i573 ^ 734) + ((i573 & 734) << 1)), objArr121);
                        str8 = (String) objArr121[0];
                        int i574 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i575 = (i574 ^ 2099) + ((i574 & 2099) << 1);
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 8;
                        int i576 = -(KeyEvent.getMaxKeyCode() >> 16);
                        Object[] objArr122 = new Object[1];
                        a(i575, scrollBarSize2, (char) ((i576 & 64669) + (i576 | 64669)), objArr122);
                        bytes = ((String) objArr122[0]).getBytes();
                        length = bytes.length;
                        if (length == 0) {
                            int i577 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i578 = (i577 & 73) + (i577 | 73);
                            TuitionPaymentFragmentbindingInflater1 = i578 % 128;
                            int i579 = i578 % 2;
                            z = true;
                        } else {
                            try {
                                bufferedInputStream3 = new BufferedInputStream(new FileInputStream(str8));
                                try {
                                    bArr2 = new byte[4096];
                                    i35 = 0;
                                    while (true) {
                                        i36 = bufferedInputStream3.read(bArr2, 0, 4096);
                                        if (i36 > 0) {
                                            break;
                                        }
                                        int i580 = TuitionPaymentFragmentbindingInflater1 + 37;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i580 % 128;
                                        int i581 = i580 % 2;
                                        i37 = 0;
                                        while (i35 < length && i37 < i36) {
                                            if (bArr2[i37] == bytes[i35]) {
                                                int i582 = (i35 & (-88)) + (i35 | (-88));
                                                i35 = (i582 ^ 89) + ((i582 & 89) << 1);
                                            } else if (i35 != 0) {
                                                i38 = (i35 ^ (-1)) + (i35 << 1);
                                                while (true) {
                                                    if (i38 > 0) {
                                                        i35 = 0;
                                                        break;
                                                    }
                                                    i39 = 0;
                                                    while (true) {
                                                        if (i39 < i38) {
                                                            i35 = i38;
                                                            break;
                                                        }
                                                        int i583 = -i38;
                                                        i40 = (i35 ^ i583) + ((i583 & i35) << 1);
                                                        i41 = -(-i39);
                                                        if (bytes[i39] != bytes[(i40 ^ i41) + ((i40 & i41) << 1)]) {
                                                            break;
                                                        }
                                                        int i584 = ((i39 | (-106)) << 1) - (i39 ^ (-106));
                                                        i39 = (i584 ^ 107) + ((i584 & 107) << 1);
                                                    }
                                                    i38--;
                                                }
                                            }
                                            i37++;
                                        }
                                    }
                                    if (i35 == length) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    try {
                                        bufferedInputStream3.close();
                                    } catch (IOException unused6) {
                                    }
                                } catch (IOException unused7) {
                                    if (bufferedInputStream3 != null) {
                                        try {
                                            bufferedInputStream3.close();
                                        } catch (IOException unused8) {
                                        }
                                    }
                                    int i585 = TuitionPaymentFragmentbindingInflater1;
                                    int i586 = ((i585 | 55) << 1) - (i585 ^ 55);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i586 % 128;
                                    int i587 = i586 % 2;
                                    z = false;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    if (bufferedInputStream3 == null) {
                                        throw th2;
                                    }
                                    try {
                                        bufferedInputStream3.close();
                                        throw th2;
                                    } catch (IOException unused9) {
                                        throw th2;
                                    }
                                }
                            } catch (IOException unused10) {
                                bufferedInputStream3 = null;
                            } catch (Throwable th7) {
                                th2 = th7;
                                bufferedInputStream3 = null;
                            }
                        }
                        if (z) {
                            i18 = i19;
                            i28 = (i & (-151)) | (i18 & 150);
                        } else {
                            i18 = i19;
                            i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                            TuitionPaymentFragmentbindingInflater1 = i42 % 128;
                            if (i42 % 2 == 0) {
                                int i588 = 26 / 0;
                            }
                            i28 = i;
                        }
                        int i589 = (~(i & i571)) & (i | i571);
                        int i590 = -i589;
                        int i591 = ((i589 & i590) | (i589 ^ i590)) >> 31;
                        int i592 = i28 & (~i591);
                        int i593 = i571 & i591;
                        int i594 = (i593 & i592) | (i592 ^ i593);
                        Object[] objArr123 = new Object[1];
                        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2107, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr123);
                        str7 = (String) objArr123[0];
                        int i595 = ((~(((-907982687) & i18) | ((-907982687) ^ i18))) | 537669704) * 168;
                        int i596 = (((-1527640618) | i595) << 1) - (i595 ^ (-1527640618));
                        int i597 = -(-((~(((-537669705) & i) | ((-537669705) ^ i))) * 168));
                        int i598 = ((i596 | i597) << 1) - (i597 ^ i596);
                        int i599 = ~(((-567111785) & i18) | ((-567111785) ^ i18));
                        int i600 = (i599 & 29442080) | (i599 ^ 29442080);
                        int i601 = ~(((-370312983) & i) | ((-370312983) ^ i));
                        i29 = i598 + (((i600 & i601) | (i600 ^ i601)) * 168);
                        int iB9 = SearchView9.b();
                        int i602 = ~((2114143821 & iB9) | (2114143821 ^ iB9));
                        int i603 = (i602 & (-2134859470)) | ((-2134859470) ^ i602);
                        int i604 = ~((1195120833 & iB9) | (1195120833 ^ iB9));
                        int i605 = 820632048 + (((i603 & i604) | (i603 ^ i604)) * (-880));
                        int i606 = ~iB9;
                        int i607 = ~((i606 & 2114143821) | (2114143821 ^ i606));
                        int i608 = (i607 & (-1195120834)) | ((-1195120834) ^ i607);
                        int i609 = (iB9 & (-2114143822)) | ((-2114143822) ^ iB9);
                        int i610 = ~i609;
                        i30 = i605 + (((i608 & i610) | (i608 ^ i610)) * (-880));
                        i31 = (~i609) * 880;
                        if (i29 <= (i30 & i31) + (i31 | i30)) {
                            Object[] objArr124 = {str7};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char size4 = (char) View.MeasureSpec.getSize(0);
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 993;
                                int iGreen2 = 8 - Color.green(0);
                                byte b50 = (byte) 0;
                                byte b51 = (byte) (b50 + 1);
                                Object[] objArr125 = new Object[1];
                                c(b50, b51, (byte) (b51 - 1), objArr125);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size4, iNormalizeMetaState, iGreen2, 410748506, false, (String) objArr125[0], new Class[]{String.class});
                            }
                            long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr124)).longValue();
                            long j119 = 1848310684;
                            long j120 = -661;
                            long j121 = j119 ^ j;
                            long j122 = jLongValue19 ^ j;
                            j3 = (j120 * j119) + (j120 * jLongValue19) + (((long) 1324) * (j47 | ((j121 | j122) ^ j))) + (((long) (-1324)) * (((j119 | j2) ^ j) | ((jLongValue19 | j2) ^ j))) + (((long) 662) * (((jLongValue19 | j121) ^ j) | ((j122 | j119) ^ j))) + ((long) (-2049228921));
                            i32 = (int) (j3 << 75);
                            i33 = (-140058370) + (((~(i18 | 518156283)) | 919070127) * (-1042)) + ((518156283 | i) * 521);
                            i34 = ((~((-919070128) | i)) | 381838763 | (~(1055387647 | i18))) * 521;
                        } else {
                            Object[] objArr126 = {str7};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str6, '0'));
                                int i611 = 994 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                                byte b52 = (byte) 0;
                                byte b53 = (byte) (b52 + 1);
                                Object[] objArr127 = new Object[1];
                                c(b52, b53, (byte) (b53 - 1), objArr127);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i611, scrollBarFadeDuration4, 410748506, false, (String) objArr127[0], new Class[]{String.class});
                            }
                            long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr126)).longValue();
                            long j123 = 1019059511;
                            long j124 = -406;
                            long j125 = jLongValue20 ^ j;
                            j3 = (((long) (-405)) * j123) + (((long) 407) * jLongValue20) + ((((j125 | j2) ^ j) | (((j47 | j123) | jLongValue20) ^ j)) * j124) + (j124 * (((j125 | j47) | j123) ^ j)) + (((long) 406) * (((j47 | jLongValue20) ^ j) | (((j123 ^ j) | j2) ^ j))) + ((long) (-1219977748));
                            i32 = (int) (j3 >> 32);
                            int i612 = ~((int) Process.getStartUptimeMillis());
                            i33 = 1754752898 + (((~(853953918 | i612)) | 583272492) * (-828)) + ((i612 | 853953918) * (-828));
                            i34 = 1595758908;
                        }
                        int i613 = i32 & (i33 + i34);
                        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                        int i614 = ~((-805712481) | iFreeMemory2);
                        int i615 = ~iFreeMemory2;
                        int i616 = ((int) j3) & (906872752 + ((i614 | (~((-33571969) | i615))) * 497) + (((~(iFreeMemory2 | (-33571969))) | (~((-2018456438) | i615)) | 1212743957) * 497));
                        int i617 = (((i613 & i616) | (i613 ^ i616)) * 263) ^ i;
                        int i618 = (~(i & i594)) & (i | i594);
                        int i619 = -i618;
                        int i620 = ((i618 & i619) | (i618 ^ i619)) >> 31;
                        int i621 = i617 & (~i620);
                        int i622 = i594 & i620;
                        i393 = (i622 & i621) | (i621 ^ i622);
                        strArr = strArr3;
                    }
                    int i5710 = 2086 - (~ExpandableListView.getPackedPositionChild(0L));
                    int mode2 = View.MeasureSpec.getMode(0) + 13;
                    int i5711 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr128 = new Object[1];
                    a(i5710, mode2, (char) ((i5711 ^ 734) + ((i5711 & 734) << 1)), objArr128);
                    str8 = (String) objArr128[0];
                    int i5712 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i5713 = (i5712 ^ 2099) + ((i5712 & 2099) << 1);
                    int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 8;
                    int i5714 = -(KeyEvent.getMaxKeyCode() >> 16);
                    Object[] objArr129 = new Object[1];
                    a(i5713, scrollBarSize3, (char) ((i5714 & 64669) + (i5714 | 64669)), objArr129);
                    bytes = ((String) objArr129[0]).getBytes();
                    length = bytes.length;
                    if (length == 0) {
                        int i5715 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i5716 = (i5715 & 73) + (i5715 | 73);
                        TuitionPaymentFragmentbindingInflater1 = i5716 % 128;
                        int i5717 = i5716 % 2;
                        z = true;
                    } else {
                        bufferedInputStream3 = new BufferedInputStream(new FileInputStream(str8));
                        bArr2 = new byte[4096];
                        i35 = 0;
                        while (true) {
                            i36 = bufferedInputStream3.read(bArr2, 0, 4096);
                            if (i36 > 0) {
                                break;
                                break;
                            }
                            int i5810 = TuitionPaymentFragmentbindingInflater1 + 37;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5810 % 128;
                            int i5811 = i5810 % 2;
                            i37 = 0;
                            while (i35 < length) {
                                if (bArr2[i37] == bytes[i35]) {
                                    int i5812 = (i35 & (-88)) + (i35 | (-88));
                                    i35 = (i5812 ^ 89) + ((i5812 & 89) << 1);
                                } else if (i35 != 0) {
                                    i38 = (i35 ^ (-1)) + (i35 << 1);
                                    while (true) {
                                        if (i38 > 0) {
                                            i35 = 0;
                                            break;
                                            break;
                                        }
                                        i39 = 0;
                                        while (true) {
                                            if (i39 < i38) {
                                                i35 = i38;
                                                break;
                                                break;
                                            }
                                            int i5813 = -i38;
                                            i40 = (i35 ^ i5813) + ((i5813 & i35) << 1);
                                            i41 = -(-i39);
                                            if (bytes[i39] != bytes[(i40 ^ i41) + ((i40 & i41) << 1)]) {
                                                break;
                                            }
                                            int i5814 = ((i39 | (-106)) << 1) - (i39 ^ (-106));
                                            i39 = (i5814 ^ 107) + ((i5814 & 107) << 1);
                                        }
                                        i38--;
                                    }
                                }
                                i37++;
                            }
                        }
                        if (i35 == length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bufferedInputStream3.close();
                    }
                    if (z) {
                        i18 = i19;
                        i28 = (i & (-151)) | (i18 & 150);
                    } else {
                        i18 = i19;
                        i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                        TuitionPaymentFragmentbindingInflater1 = i42 % 128;
                        if (i42 % 2 == 0) {
                            int i5815 = 26 / 0;
                        }
                        i28 = i;
                    }
                } catch (Exception unused11) {
                    i18 = i19;
                    i28 = (~(i & 151)) & (i | 151);
                }
                int i623 = -(-ImageFormat.getBitsPerPixel(0));
                int i624 = (i623 ^ 371) + ((i623 & 371) << 1);
                int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr130 = new Object[1];
                a(i624, jumpTapTimeout3, (char) (((packedPositionChild4 | 1) << 1) - (packedPositionChild4 ^ 1)), objArr130);
                String str37 = (String) objArr130[0];
                Object[] objArr131 = new Object[1];
                a(808 - View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionType(0L) + 10, (char) Color.alpha(0), objArr131);
                String str38 = (String) objArr131[0];
                int i625 = -(-Color.blue(0));
                Object[] objArr132 = new Object[1];
                a((i625 & 818) + (i625 | 818), 6 - (~(-View.resolveSizeAndState(0, 0, 0))), (char) Color.argb(0, 0, 0, 0), objArr132);
                String str39 = (String) objArr132[0];
                int i626 = -(-Color.red(0));
                int i627 = (i626 & 825) + (i626 | 825);
                int i628 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                Object[] objArr133 = new Object[1];
                a(i627, ((i628 | 8) << 1) - (i628 ^ 8), (char) TextUtils.getOffsetAfter(str28, 0), objArr133);
                String[] strArr23 = {str37, str38, str39, (String) objArr133[0]};
                int i629 = 832 - (~(-TextUtils.indexOf(str28, str28)));
                int i630 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr134 = new Object[1];
                a(i629, (i630 & 17) + (i630 | 17), (char) View.MeasureSpec.getSize(0), objArr134);
                String str40 = (String) objArr134[0];
                int iIndexOf6 = 849 - TextUtils.indexOf((CharSequence) str28, '0');
                int jumpTapTimeout4 = ViewConfiguration.getJumpTapTimeout() >> 16;
                Object[] objArr135 = new Object[1];
                a(iIndexOf6, (jumpTapTimeout4 ^ 7) + ((jumpTapTimeout4 & 7) << 1), (char) (45434 - (~Color.argb(0, 0, 0, 0))), objArr135);
                String str41 = (String) objArr135[0];
                int i631 = 856 - (~(-Color.red(0)));
                int i632 = -Color.alpha(0);
                Object[] objArr136 = new Object[1];
                a(i631, (i632 & 7) + (i632 | 7), (char) ((-TextUtils.indexOf((CharSequence) str28, '0', 0)) - 1), objArr136);
                String str42 = (String) objArr136[0];
                int packedPositionGroup4 = 864 - ExpandableListView.getPackedPositionGroup(0L);
                int defaultSize2 = View.getDefaultSize(0, 0);
                int i633 = (defaultSize2 ^ 11) + ((defaultSize2 & 11) << 1);
                int i634 = -Color.red(0);
                int i635 = i634 * TypedValues.Custom.TYPE_DIMENSION;
                int i636 = ((-33500397) & i635) + (i635 | (-33500397));
                int i637 = ~i634;
                int i638 = (i636 - (~(-(-(((~((i637 ^ i) | (i637 & i))) | (~((i91 ^ 37099) | (i91 & 37099)))) * (-1808)))))) - 1;
                int i639 = ~((i637 & (-37100)) | ((-37100) ^ i637) | i);
                int i640 = i91 | i634;
                int i641 = ~((i640 & 37099) | (37099 ^ i640));
                int i642 = -(-(((i639 & i641) | (i639 ^ i641)) * TypedValues.Custom.TYPE_BOOLEAN));
                int i643 = (i638 & i642) + (i642 | i638);
                int i644 = ~i634;
                int i645 = ~((i644 & 37099) | (37099 ^ i644));
                int i646 = ~(((-37100) ^ i) | ((-37100) & i));
                int i647 = (i645 & i646) | (i645 ^ i646);
                int i648 = ~((i7 & i634) | (i7 ^ i634));
                int i649 = -(-(((i648 & i647) | (i647 ^ i648)) * TypedValues.Custom.TYPE_BOOLEAN));
                Object[] objArr137 = new Object[1];
                a(packedPositionGroup4, i633, (char) (((i643 | i649) << 1) - (i649 ^ i643)), objArr137);
                String str43 = (String) objArr137[0];
                int i650 = -(-TextUtils.lastIndexOf(str28, '0', 0));
                int i651 = (i650 & 876) + (i650 | 876);
                int iMyTid2 = Process.myTid() >> 22;
                Object[] objArr138 = new Object[1];
                a(i651, (iMyTid2 & 14) + (iMyTid2 | 14), (char) (24757 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), objArr138);
                String[] strArr24 = {str40, str41, str42, str43, (String) objArr138[0]};
                int i652 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i653 = (i652 & 890) + (i652 | 890);
                int i654 = -TextUtils.indexOf((CharSequence) str28, '0', 0);
                Object[] objArr139 = new Object[1];
                a(i653, ((i654 | 15) << 1) - (i654 ^ 15), (char) (15095 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr139);
                String str44 = (String) objArr139[0];
                int i655 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i656 = (i655 & TypedValues.Custom.TYPE_REFERENCE) + (i655 | TypedValues.Custom.TYPE_REFERENCE);
                int i657 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                Object[] objArr140 = new Object[1];
                a(i656, ((i657 | 3) << 1) - (i657 ^ 3), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr140);
                String str45 = (String) objArr140[0];
                int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                int i658 = edgeSlop * 765;
                int i659 = ((-1398732) & i658) + (i658 | (-1398732));
                int i660 = ~((i7 ^ edgeSlop) | (i7 & edgeSlop));
                int i661 = i659 + (((i660 ^ 916) | (i660 & 916)) * 764);
                int i662 = ~((~edgeSlop) | 916);
                int i663 = ~((i91 ^ 916) | (i91 & 916));
                int i664 = ((i662 & i663) | (i662 ^ i663)) * (-1528);
                int i665 = (i661 ^ i664) + ((i661 & i664) << 1);
                int i666 = ~edgeSlop;
                int i667 = ~((i666 & 916) | (i666 ^ 916));
                int i668 = ~(edgeSlop | (-917));
                int i669 = (i668 & i667) | (i667 ^ i668);
                int i670 = (i665 - (~(-(-(((i669 & i660) | (i669 ^ i660)) * 764))))) - 1;
                int i671 = -(-View.MeasureSpec.getMode(0));
                Object[] objArr141 = new Object[1];
                a(i670, (i671 ^ 22) + ((i671 & 22) << 1), (char) (TextUtils.lastIndexOf(str28, '0', 0) + 4728), objArr141);
                String str46 = (String) objArr141[0];
                int iIndexOf7 = 938 - TextUtils.indexOf(str28, str28);
                int i672 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i673 = (i672 & 25) + (i672 | 25);
                int i674 = -MotionEvent.axisFromString(str28);
                Object[] objArr142 = new Object[1];
                a(iIndexOf7, i673, (char) ((38731 ^ i674) + ((i674 & 38731) << 1)), objArr142);
                String str47 = (String) objArr142[0];
                int offsetBefore3 = TextUtils.getOffsetBefore(str28, 0);
                int iB10 = SearchView9.b();
                int i675 = offsetBefore3 * 253;
                int i676 = ((243639 | i675) << 1) - (i675 ^ 243639);
                int i677 = ~offsetBefore3;
                int i678 = ~((i677 ^ (-964)) | (i677 & (-964)));
                int i679 = ~iB10;
                int i680 = ~((-964) | i679);
                int i681 = (i678 ^ i680) | (i678 & i680);
                int i682 = (offsetBefore3 ^ 963) | (offsetBefore3 & 963);
                int i683 = ~((i682 ^ iB10) | (i682 & iB10));
                int i684 = (i676 - (~(-(-(((i681 ^ i683) | (i681 & i683)) * (-252)))))) - 1;
                int i685 = -(-(i682 * (-252)));
                int i686 = ((i684 | i685) << 1) - (i685 ^ i684);
                int i687 = ((-964) ^ i679) | (i679 & (-964));
                int i688 = ((~(iB10 | i682)) | (~((i687 & offsetBefore3) | (i687 ^ offsetBefore3)))) * 252;
                Object[] objArr143 = new Object[1];
                a(((i686 | i688) << 1) - (i686 ^ i688), 26 - (~(-MotionEvent.axisFromString(str28))), (char) ((-2) - ((-Process.getGidForName(str28)) ^ (-1))), objArr143);
                String str48 = (String) objArr143[0];
                int i689 = i7;
                str4 = str28;
                String[] strArr25 = {str44, str45, str, str46, str47, str48};
                int i690 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                int i691 = (i690 ^ 991) + ((i690 & 991) << 1);
                int i692 = -View.MeasureSpec.getMode(0);
                int i693 = (i692 & 11) + (i692 | 11);
                int i694 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr144 = new Object[1];
                a(i691, i693, (char) ((40322 ^ i694) + ((i694 & 40322) << 1)), objArr144);
                String str49 = (String) objArr144[0];
                int i695 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                int i696 = (i695 & 1002) + (i695 | 1002);
                int i697 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int deadChar = KeyEvent.getDeadChar(0, 0);
                Object[] objArr145 = new Object[1];
                a(i696, (i697 & 8) + (i697 | 8), (char) ((deadChar & 53035) + (deadChar | 53035)), objArr145);
                String str50 = (String) objArr145[0];
                int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + PointerIconCompat.TYPE_ALIAS;
                int i698 = -(-TextUtils.indexOf((CharSequence) str4, '0'));
                Object[] objArr146 = new Object[1];
                a(iResolveSizeAndState3, (i698 ^ 7) + ((i698 & 7) << 1), (char) (52047 - (~(-View.MeasureSpec.getSize(0)))), objArr146);
                String str51 = (String) objArr146[0];
                Object[] objArr147 = new Object[1];
                a(1016 - (~(-(-TextUtils.lastIndexOf(str4, '0', 0, 0)))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6, (char) TextUtils.indexOf(str4, str4), objArr147);
                String[] strArr26 = {str49, str50, str51, (String) objArr147[0]};
                int i699 = -ImageFormat.getBitsPerPixel(0);
                Object[] objArr148 = new Object[1];
                a(((i699 | PointerIconCompat.TYPE_GRABBING) << 1) - (i699 ^ PointerIconCompat.TYPE_GRABBING), 14 - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr148);
                String str52 = (String) objArr148[0];
                int i700 = -TextUtils.getOffsetBefore(str4, 0);
                Object[] objArr149 = new Object[1];
                a(((i700 | 857) << 1) - (i700 ^ 857), 5 - (~(-TextUtils.indexOf((CharSequence) str4, '0', 0, 0))), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr149);
                String str53 = (String) objArr149[0];
                Object[] objArr150 = new Object[1];
                a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 825, TextUtils.lastIndexOf(str4, '0') + 9, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr150);
                String[] strArr27 = {str52, str53, (String) objArr150[0]};
                int offsetBefore4 = 1038 - TextUtils.getOffsetBefore(str4, 0);
                int i701 = -View.MeasureSpec.getSize(0);
                Object[] objArr151 = new Object[1];
                a(offsetBefore4, ((i701 | 14) << 1) - (i701 ^ 14), (char) View.resolveSizeAndState(0, 0, 0), objArr151);
                String str54 = (String) objArr151[0];
                int i702 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int i703 = (i702 & 1051) + (i702 | 1051);
                int i704 = -(Process.myTid() >> 22);
                int i705 = i704 * 989;
                int i706 = ((i705 | (-987)) << 1) - (i705 ^ (-987));
                int i707 = ((-2) ^ i91) | ((-2) & i91);
                int i708 = ~((i707 & i704) | (i707 ^ i704));
                int i709 = ~(i704 | 1 | i);
                int i710 = -(-(((i708 & i709) | (i708 ^ i709)) * 988));
                int i711 = ((i706 | i710) << 1) - (i710 ^ i706);
                int i712 = -(-((i704 | (-2)) * (-988)));
                int i713 = (i711 ^ i712) + ((i712 & i711) << 1);
                int i714 = (~((~i704) | (-2))) | (~((-2) | i));
                int i715 = (i704 & i91) | (i91 ^ i704);
                int i716 = ~((i715 & 1) | (i715 ^ 1));
                int i717 = -(-(((i716 & i714) | (i714 ^ i716)) * 988));
                Object[] objArr152 = new Object[1];
                a(i703, (i713 & i717) + (i717 | i713), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr152);
                String[] strArr28 = {str54, (String) objArr152[0]};
                int i718 = -KeyEvent.getDeadChar(0, 0);
                Object[] objArr153 = new Object[1];
                a(((i718 | 1053) << 1) - (i718 ^ 1053), 8 - (~(-TextUtils.indexOf(str4, str4, 0, 0))), (char) (49759 - (~(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr153);
                String str55 = (String) objArr153[0];
                int i719 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1062;
                int i720 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                Object[] objArr154 = new Object[1];
                a(i719, i720, (char) ((45438 & iCombineMeasuredStates) + (iCombineMeasuredStates | 45438)), objArr154);
                String[] strArr29 = {str55, (String) objArr154[0]};
                int i721 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i722 = ((i721 | 1062) << 1) - (i721 ^ 1062);
                int i723 = -(-KeyEvent.keyCodeFromString(str4));
                Object[] objArr155 = new Object[1];
                a(i722, (i723 & 16) + (i723 | 16), (char) Gravity.getAbsoluteGravity(0, 0), objArr155);
                String str56 = (String) objArr155[0];
                Object[] objArr156 = new Object[1];
                a(905 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), 3 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr156);
                String str57 = (String) objArr156[0];
                int jumpTapTimeout5 = 850 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i724 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i725 = (i724 & 7) + (i724 | 7);
                int i726 = -(-TextUtils.indexOf((CharSequence) str4, '0', 0));
                Object[] objArr157 = new Object[1];
                a(jumpTapTimeout5, i725, (char) (((45436 | i726) << 1) - (i726 ^ 45436)), objArr157);
                String str58 = (String) objArr157[0];
                int bitsPerPixel3 = 1078 - ImageFormat.getBitsPerPixel(0);
                int maxKeyCode3 = KeyEvent.getMaxKeyCode() >> 16;
                int iB11 = SearchView9.b();
                int i727 = (maxKeyCode3 * 758) - 6048;
                int i728 = ~iB11;
                int i729 = -(-(((maxKeyCode3 ^ i728) | (maxKeyCode3 & i728)) * (-757)));
                int i730 = (i727 ^ i729) + ((i729 & i727) << 1);
                int i731 = ((-9) ^ maxKeyCode3) | ((-9) & maxKeyCode3);
                int i732 = (~((i731 ^ iB11) | (i731 & iB11))) * 1514;
                int i733 = ((i730 | i732) << 1) - (i730 ^ i732);
                int i734 = ~maxKeyCode3;
                int i735 = ~((i734 ^ (-9)) | (i734 & (-9)));
                int i736 = ~(((-9) ^ i728) | ((-9) & i728));
                int i737 = (i735 ^ i736) | (i736 & i735);
                int i738 = maxKeyCode3 | 8;
                int i739 = ~((i738 & iB11) | (i738 ^ iB11));
                int i740 = ((i739 & i737) | (i737 ^ i739)) * 757;
                Object[] objArr158 = new Object[1];
                a(bitsPerPixel3, ((i733 | i740) << 1) - (i733 ^ i740), (char) TextUtils.indexOf(str4, str4, 0), objArr158);
                String str59 = (String) objArr158[0];
                int i741 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i742 = (i741 ^ 864) + ((i741 & 864) << 1);
                int i743 = -(-Color.green(0));
                Object[] objArr159 = new Object[1];
                a(i742, (i743 ^ 11) + ((i743 & 11) << 1), (char) (37098 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))), objArr159);
                String str60 = (String) objArr159[0];
                int i744 = -TextUtils.indexOf((CharSequence) str4, '0', 0);
                i19 = i91;
                Object[] objArr160 = new Object[1];
                a((i744 & 874) + (i744 | 874), 13 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24757), objArr160);
                String[] strArr30 = {str56, str57, str58, str59, str60, (String) objArr160[0]};
                Object[] objArr161 = new Object[1];
                a(1087 - (~(-(-TextUtils.lastIndexOf(str4, '0')))), 19 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), (char) Color.alpha(0), objArr161);
                String str61 = (String) objArr161[0];
                int i745 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iB12 = SearchView9.b();
                int i746 = ~i745;
                int i747 = ~((i746 & (-1108)) | (i746 ^ (-1108)));
                int i748 = ~iB12;
                int i749 = (((i745 * 829) + 917703) - (~(-(-((i747 | (~(((i748 & i745) | (i748 ^ i745)) | 1107))) * (-828)))))) - 1;
                int i750 = (i745 ^ 1107) | (i745 & 1107);
                int i751 = ~iB12;
                int i752 = ((i751 & i750) | (i750 ^ i751)) * (-828);
                int i753 = (i749 ^ i752) + ((i752 & i749) << 1) + ((~(i745 | 1107)) * 828);
                int i754 = -(-ExpandableListView.getPackedPositionType(0L));
                int i755 = (i754 ^ 19) + ((i754 & 19) << 1);
                int i756 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr162 = new Object[1];
                a(i753, i755, (char) ((i756 ^ 16198) + ((i756 & 16198) << 1)), objArr162);
                String str62 = (String) objArr162[0];
                int i757 = -TextUtils.getCapsMode(str4, 0, 0);
                int i758 = -(-Gravity.getAbsoluteGravity(0, 0));
                Object[] objArr163 = new Object[1];
                a(((i757 | 1126) << 1) - (i757 ^ 1126), (i758 ^ 31) + ((i758 & 31) << 1), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4565), objArr163);
                String str63 = (String) objArr163[0];
                int i759 = -(-Color.blue(0));
                Object[] objArr164 = new Object[1];
                a(((i759 | 1157) << 1) - (i759 ^ 1157), 73 - (~(-AndroidCharacter.getMirror('0'))), (char) Color.blue(0), objArr164);
                String str64 = (String) objArr164[0];
                int i760 = -(-Color.green(0));
                int i761 = (i760 ^ 1183) + ((i760 & 1183) << 1);
                int i762 = -View.resolveSize(0, 0);
                Object[] objArr165 = new Object[1];
                a(i761, (i762 & 23) + (i762 | 23), (char) (44938 - (~(-Drawable.resolveOpacity(0, 0)))), objArr165);
                String str65 = (String) objArr165[0];
                Object[] objArr166 = new Object[1];
                a(TextUtils.getOffsetAfter(str4, 0) + 1206, 32 - (~(-TextUtils.indexOf(str4, str4, 0, 0))), (char) Color.green(0), objArr166);
                String[] strArr31 = {str61, str62, str63, str64, str65, (String) objArr166[0], str};
                int i763 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                Object[] objArr167 = new Object[1];
                a((i763 ^ 1239) + ((i763 & 1239) << 1), Color.rgb(0, 0, 0) + 16777229, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr167);
                String str66 = (String) objArr167[0];
                int i764 = 817 - (~(-Color.blue(0)));
                int i765 = 6 - (~(-Color.blue(0)));
                int i766 = -ImageFormat.getBitsPerPixel(0);
                Object[] objArr168 = new Object[1];
                a(i764, i765, (char) ((i766 ^ (-1)) + (i766 << 1)), objArr168);
                String[] strArr32 = {str66, (String) objArr168[0]};
                Object[] objArr169 = new Object[1];
                a(1251 - (~(ViewConfiguration.getLongPressTimeout() >> 16)), 29 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16)))), (char) (TextUtils.getOffsetBefore(str4, 0) + 35682), objArr169);
                String str67 = (String) objArr169[0];
                int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L);
                int i767 = (packedPositionChild5 & 1283) + (packedPositionChild5 | 1283);
                int doubleTapTimeout4 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                Object[] objArr170 = new Object[1];
                a(i767, ((doubleTapTimeout4 | 11) << 1) - (doubleTapTimeout4 ^ 11), (char) View.resolveSizeAndState(0, 0, 0), objArr170);
                String[] strArr33 = {str67, (String) objArr170[0]};
                int i768 = -TextUtils.indexOf((CharSequence) str4, '0');
                int i769 = ((i768 | 1292) << 1) - (i768 ^ 1292);
                int i770 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr171 = new Object[1];
                a(i769, (i770 & 19) + (i770 | 19), (char) (Process.myTid() >> 22), objArr171);
                String str68 = (String) objArr171[0];
                int i771 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int i772 = (i771 ^ 1312) + ((i771 & 1312) << 1);
                int i773 = -TextUtils.getOffsetAfter(str4, 0);
                int i774 = (i773 & 5) + (i773 | 5);
                int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                Object[] objArr172 = new Object[1];
                a(i772, i774, (char) ((54351 ^ maximumFlingVelocity2) + ((maximumFlingVelocity2 & 54351) << 1)), objArr172);
                String[] strArr34 = {str68, (String) objArr172[0]};
                Object[] objArr173 = new Object[1];
                a((ViewConfiguration.getTapTimeout() >> 16) + 1317, Process.getGidForName(str4) + 20, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr173);
                String[] strArr35 = {(String) objArr173[0]};
                int i775 = 1335 - (~TextUtils.getTrimmedLength(str4));
                int i776 = -(-ExpandableListView.getPackedPositionGroup(0L));
                Object[] objArr174 = new Object[1];
                a(i775, ((i776 | 16) << 1) - (i776 ^ 16), (char) ((-16777217) - (~(-Color.rgb(0, 0, 0)))), objArr174);
                String[] strArr36 = {(String) objArr174[0]};
                int i777 = -TextUtils.indexOf(str4, str4, 0);
                int i778 = ((i777 | 1352) << 1) - (i777 ^ 1352);
                int i779 = -MotionEvent.axisFromString(str4);
                Object[] objArr175 = new Object[1];
                a(i778, (i779 & 18) + (i779 | 18), (char) (39047 - TextUtils.indexOf((CharSequence) str4, '0')), objArr175);
                String[] strArr37 = {(String) objArr175[0]};
                int i780 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                Object[] objArr176 = new Object[1];
                a(((i780 | 1370) << 1) - (i780 ^ 1370), 18 - (~(-KeyEvent.keyCodeFromString(str4))), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr176);
                String[] strArr38 = {(String) objArr176[0]};
                int i781 = -(-Color.blue(0));
                int i782 = ((i781 | 1390) << 1) - (i781 ^ 1390);
                int i783 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr177 = new Object[1];
                a(i782, ((i783 | 23) << 1) - (i783 ^ 23), (char) (Color.rgb(0, 0, 0) + 16780663), objArr177);
                String[] strArr39 = {(String) objArr177[0]};
                int i784 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr178 = new Object[1];
                a((i784 & 1413) + (i784 | 1413), 21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr178);
                String[] strArr40 = {(String) objArr178[0]};
                int i785 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                int i786 = ((i785 | 1434) << 1) - (i785 ^ 1434);
                int i787 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr179 = new Object[1];
                a(i786, ((i787 | 24) << 1) - (i787 ^ 24), (char) ExpandableListView.getPackedPositionType(0L), objArr179);
                String str69 = str;
                String[] strArr41 = {(String) objArr179[0], str69};
                int i788 = -(-ExpandableListView.getPackedPositionChild(0L));
                int i789 = (i788 ^ 1459) + ((i788 & 1459) << 1);
                int i790 = -(ViewConfiguration.getTapTimeout() >> 16);
                int i791 = (i790 & 28) + (i790 | 28);
                int i792 = -TextUtils.getTrimmedLength(str4);
                Object[] objArr180 = new Object[1];
                a(i789, i791, (char) ((33103 ^ i792) + ((i792 & 33103) << 1)), objArr180);
                String[] strArr42 = {(String) objArr180[0], str69};
                int i793 = -KeyEvent.normalizeMetaState(0);
                int i794 = ((i793 | 1486) << 1) - (i793 ^ 1486);
                int i795 = 25 - (~(-TextUtils.lastIndexOf(str4, '0', 0, 0)));
                int i796 = -Process.getGidForName(str4);
                Object[] objArr181 = new Object[1];
                a(i794, i795, (char) ((i796 ^ (-1)) + (i796 << 1)), objArr181);
                String[] strArr43 = {(String) objArr181[0], str69};
                int i797 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i798 = (i797 & 1512) + (i797 | 1512);
                int i799 = -TextUtils.indexOf(str4, str4, 0, 0);
                Object[] objArr182 = new Object[1];
                a(i798, (i799 ^ 31) + ((i799 & 31) << 1), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr182);
                String[] strArr44 = {(String) objArr182[0], str69};
                int i800 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i801 = (i800 ^ 1544) + ((i800 & 1544) << 1);
                int i802 = -Color.blue(0);
                int i803 = ((i802 | 27) << 1) - (i802 ^ 27);
                int threadPriority6 = (Process.getThreadPriority(0) + 20) >> 6;
                char c10 = (char) ((46456 ^ threadPriority6) + ((threadPriority6 & 46456) << 1));
                Object[] objArr183 = new Object[1];
                a(i801, i803, c10, objArr183);
                String[] strArr45 = {(String) objArr183[0], str69};
                int i804 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr184 = new Object[1];
                a((i804 ^ 1571) + ((i804 & 1571) << 1), 32 - KeyEvent.keyCodeFromString(str4), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr184);
                String[][] strArr46 = {strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, new String[]{(String) objArr184[0], str69}};
                int i805 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                int i806 = ((i805 | 1603) << 1) - (i805 ^ 1603);
                int iIndexOf8 = TextUtils.indexOf(str4, str4, 0);
                int i807 = iIndexOf8 * 303;
                int i808 = ((i807 | (-301)) << 1) - (i807 ^ (-301));
                int i809 = (~iIndexOf8) | i689;
                int i810 = ~((i809 & 1) | (i809 ^ 1));
                int i811 = (iIndexOf8 ^ 1) | (iIndexOf8 & 1);
                int i812 = ~((i811 & i) | (i811 ^ i));
                int i813 = ((i810 & i812) | (i810 ^ i812)) * (-302);
                int i814 = ((i808 | i813) << 1) - (i813 ^ i808);
                int i815 = ~iIndexOf8;
                int i816 = (i815 & 1) | (i815 ^ 1);
                int i817 = (~((i816 & i) | (i816 ^ i))) * (-604);
                int i818 = (i814 ^ i817) + ((i817 & i814) << 1);
                int i819 = ~(((-2) ^ iIndexOf8) | ((-2) & iIndexOf8));
                int i820 = ~((i ^ 1) | (i & 1));
                int i821 = -(-(((i819 & i820) | (i819 ^ i820)) * 302));
                int i822 = (i818 & i821) + (i821 | i818);
                char c11 = 0;
                Object[] objArr185 = new Object[1];
                a(i806, i822, (char) View.getDefaultSize(0, 0), objArr185);
                StringBuilder sb = new StringBuilder((String) objArr185[0]);
                int i823 = i;
                int i824 = 0;
                int i825 = 0;
                while (i824 < 24) {
                    String[] strArr47 = strArr46[i824];
                    Object[] objArr186 = {strArr47[c11]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char jumpTapTimeout6 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33602);
                        int mode3 = 3085 - View.MeasureSpec.getMode(0);
                        int touchSlop4 = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b54 = (byte) 0;
                        byte b55 = (byte) (b54 + 1);
                        Object[] objArr187 = new Object[1];
                        c(b54, b55, (byte) (b55 - 1), objArr187);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(jumpTapTimeout6, mode3, touchSlop4, 1411172903, false, (String) objArr187[0], new Class[]{String.class});
                    }
                    String str70 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr186);
                    String[] strArr48 = (String[]) Arrays.copyOfRange(strArr47, 1, strArr47.length);
                    if (str70 != null && !str70.isEmpty()) {
                        if (strArr47.length != 1) {
                            int length4 = strArr48.length;
                            int i826 = 0;
                            while (true) {
                                if (i826 < length4) {
                                    if (str70.contains(strArr48[i826])) {
                                        int i827 = TuitionPaymentFragmentbindingInflater1 + 17;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i827 % 128;
                                        if (i827 % 2 == 0) {
                                            i823 = i ^ ((i824 ^ 10) + ((i824 & 10) << 1));
                                            i825++;
                                            if (i825 > 1) {
                                                int i828 = -KeyEvent.keyCodeFromString(str4);
                                                int i829 = (i828 & 1604) + (i828 | 1604);
                                                int i830 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                int i831 = (i830 ^ 1) + ((i830 & 1) << 1);
                                                i21 = 0;
                                                int threadPriority7 = Process.getThreadPriority(0);
                                                Object[] objArr188 = new Object[1];
                                                a(i829, i831, (char) (((threadPriority7 ^ 20) + ((threadPriority7 & 20) << 1)) >> 6), objArr188);
                                                sb.append((String) objArr188[0]);
                                            } else {
                                                i21 = 0;
                                            }
                                            sb.append(strArr47[i21]);
                                            Object[] objArr189 = new Object[1];
                                            a(1605 - (~TextUtils.getOffsetAfter(str4, i21)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) Drawable.resolveOpacity(i21, i21), objArr189);
                                            sb.append((String) objArr189[i21]);
                                            sb.append(str70);
                                        }
                                    } else {
                                        i826 = ((i826 | 1) << 1) - (i826 ^ 1);
                                    }
                                }
                            }
                        } else {
                            i823 = i ^ ((i824 ^ 10) + ((i824 & 10) << 1));
                            i825++;
                            if (i825 > 1) {
                                int i8210 = -KeyEvent.keyCodeFromString(str4);
                                int i8211 = (i8210 & 1604) + (i8210 | 1604);
                                int i832 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int i833 = (i832 ^ 1) + ((i832 & 1) << 1);
                                i21 = 0;
                                int threadPriority8 = Process.getThreadPriority(0);
                                Object[] objArr1810 = new Object[1];
                                a(i8211, i833, (char) (((threadPriority8 ^ 20) + ((threadPriority8 & 20) << 1)) >> 6), objArr1810);
                                sb.append((String) objArr1810[0]);
                            } else {
                                i21 = 0;
                            }
                            sb.append(strArr47[i21]);
                            Object[] objArr1811 = new Object[1];
                            a(1605 - (~TextUtils.getOffsetAfter(str4, i21)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) Drawable.resolveOpacity(i21, i21), objArr1811);
                            sb.append((String) objArr1811[i21]);
                            sb.append(str70);
                        }
                    }
                    i824++;
                    strArr46 = strArr46;
                    i409 = i409;
                    c11 = 0;
                }
                int i834 = i409;
                int i835 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int i836 = (i835 ^ 1606) + ((i835 & 1606) << 1);
                int maximumFlingVelocity3 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                Object[] objArr190 = new Object[1];
                a(i836, (maximumFlingVelocity3 ^ 1) + ((maximumFlingVelocity3 & 1) << 1), (char) (9588 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr190);
                sb.append((String) objArr190[0]);
                Object[] objArr191 = new Object[2];
                if (i825 > 2) {
                    objArr191[0] = new int[1];
                    String[] strArr49 = {sb.toString()};
                    ((int[]) objArr191[0])[0] = i823;
                    objArr191[1] = strArr49;
                } else {
                    objArr191[0] = new int[]{i};
                    objArr191[1] = new String[0];
                }
                int i837 = i ^ i834;
                int i838 = (i837 | (-i837)) >> 31;
                i20 = (i834 & i838) | (((int[]) objArr191[0])[0] & (~i838));
                strArr2 = (String[]) objArr191[1];
                int iAlpha3 = 889 - Color.alpha(0);
                int i4110 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr710 = new Object[1];
                a(iAlpha3, (i4110 ^ 17) + ((i4110 & 17) << 1), (char) (15095 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))), objArr710);
                Object[] objArr810 = {(String) objArr710[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char threadPriority9 = (char) (33602 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int maximumFlingVelocity4 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3085;
                    int capsMode4 = TextUtils.getCapsMode(str4, 0, 0) + 26;
                    byte b410 = (byte) 0;
                    byte b411 = (byte) (b410 + 1);
                    Object[] objArr811 = new Object[1];
                    c(b410, b411, (byte) (b411 - 1), objArr811);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority9, maximumFlingVelocity4, capsMode4, 1411172903, false, (String) objArr811[0], new Class[]{String.class});
                }
                objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr810);
                if (objInvoke == null) {
                    i22 = 0;
                } else {
                    Object[] objArr812 = {objInvoke, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cMyTid3 = (char) (Process.myTid() >> 22);
                        int i4111 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3392;
                        int doubleTapTimeout5 = 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b412 = (byte) 0;
                        byte b413 = (byte) (b412 + 1);
                        Object[] objArr813 = new Object[1];
                        c(b412, b413, (byte) (b413 - 1), objArr813);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid3, i4111, doubleTapTimeout5, 1203525406, false, (String) objArr813[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr812)).longValue();
                    long j910 = 1818039053;
                    long jNextInt2 = new Random().nextInt(1646128183);
                    long j911 = (((long) 860) * j910) + (((long) (-858)) * jLongValue110) + (((long) (-859)) * (j910 | jNextInt2));
                    long j912 = 859;
                    long j913 = jNextInt2 ^ j;
                    long j914 = jLongValue110 ^ j;
                    long j915 = j911 + ((((j913 | j910) ^ j) | ((((j910 ^ j) | j914) | jNextInt2) ^ j)) * j912) + (j912 * (((j914 | j913) ^ j) | ((j914 | j910) ^ j))) + ((long) (-1820108930));
                    int i4112 = ((int) (j915 >> 32)) & ((((-1019427974) + (((~(i19 | (-5263381))) | (~(i19 | (-1208287233)))) * (-184))) + ((((~((-117101280) | i19)) | 111837899) | (~((-1320125132) | i19))) * 184)) - 941649848);
                    int i4113 = ((int) j915) & ((-501357939) + (((~(14691303 | i19)) | (-1424632808)) * 168) + ((~(1424632807 | i)) * 168) + (((~(1422535106 | i19)) | 2097701 | (~((-1409941505) | i))) * 168));
                    i22 = (i4112 & i4113) | (i4112 ^ i4113);
                }
                if (i22 != 1986687685) {
                    strArr3 = strArr2;
                    str5 = str4;
                    i23 = i20;
                } else {
                    strArr3 = strArr2;
                    str5 = str4;
                    i23 = i20;
                }
                int i5110 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr1010 = new Object[1];
                a((i5110 & 1950) + (i5110 | 1950), 12 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), (char) (17541 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr1010);
                String str310 = (String) objArr1010[0];
                int i5111 = 1964 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int packedPositionChild6 = 4 - ExpandableListView.getPackedPositionChild(0L);
                int i5112 = -(-Color.rgb(0, 0, 0));
                Object[] objArr1011 = new Object[1];
                a(i5111, packedPositionChild6, (char) ((i5112 & 16822671) + (i5112 | 16822671)), objArr1011);
                String[] strArr110 = {str310, (String) objArr1011[0]};
                int i5113 = -Color.red(0);
                int i5114 = ((i5113 | 1968) << 1) - (i5113 ^ 1968);
                int i5115 = -ImageFormat.getBitsPerPixel(0);
                Object[] objArr1110 = new Object[1];
                a(i5114, (i5115 & 14) + (i5115 | 14), (char) (TextUtils.indexOf(str5, str5, 0) + 42449), objArr1110);
                String str311 = (String) objArr1110[0];
                int offsetAfter3 = TextUtils.getOffsetAfter(str5, 0);
                int i5116 = ((offsetAfter3 | 1983) << 1) - (offsetAfter3 ^ 1983);
                int threadPriority10 = Process.getThreadPriority(0);
                int i5117 = -(-(((threadPriority10 ^ 20) + ((threadPriority10 & 20) << 1)) >> 6));
                int i5210 = (i5117 & 19) + (i5117 | 19);
                int i5211 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr1111 = new Object[1];
                a(i5116, i5210, (char) ((i5211 ^ 20783) + ((i5211 & 20783) << 1)), objArr1111);
                String str312 = (String) objArr1111[0];
                int i5212 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i5213 = -Color.red(0);
                Object[] objArr1112 = new Object[1];
                a(((i5212 | 2001) << 1) - (i5212 ^ 2001), (i5213 & 14) + (i5213 | 14), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr1112);
                String[] strArr111 = {str311, str312, (String) objArr1112[0]};
                int mirror2 = AndroidCharacter.getMirror('0') + 1968;
                int i5214 = -(-TextUtils.indexOf(str5, str5, 0));
                Object[] objArr1113 = new Object[1];
                a(mirror2, (i5214 & 21) + (i5214 | 21), (char) ((-2) - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr1113);
                String str313 = (String) objArr1113[0];
                int i5215 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i5216 = -KeyEvent.normalizeMetaState(0);
                Object[] objArr1114 = new Object[1];
                a((i5215 ^ 2038) + ((i5215 & 2038) << 1), (i5216 ^ 10) + ((i5216 & 10) << 1), (char) (26181 - (KeyEvent.getMaxKeyCode() >> 16)), objArr1114);
                String[] strArr112 = {str313, (String) objArr1114[0]};
                int i5217 = -Color.rgb(0, 0, 0);
                int i5218 = ((i5217 | (-16775169)) << 1) - (i5217 ^ (-16775169));
                int longPressTimeout2 = 11 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int i5219 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr1115 = new Object[1];
                a(i5218, longPressTimeout2, (char) ((i5219 ^ (-1)) + (i5219 << 1)), objArr1115);
                String str314 = (String) objArr1115[0];
                int i5310 = 586 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0))));
                int i5311 = -TextUtils.lastIndexOf(str5, '0');
                Object[] objArr1116 = new Object[1];
                a(i5310, (i5311 & 5) + (i5311 | 5), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1116);
                String[] strArr210 = {str314, (String) objArr1116[0]};
                int threadPriority11 = Process.getThreadPriority(0);
                int iB13 = SearchView9.b();
                int i5312 = threadPriority11 * (-958);
                int i5313 = ((-19160) & i5312) + (i5312 | (-19160));
                int i5314 = ~threadPriority11;
                int i5315 = ~iB13;
                int i5316 = ~((i5314 ^ i5315) | (i5314 & i5315));
                int i5317 = ~((-21) | iB13);
                int i5318 = (i5316 ^ i5317) | (i5317 & i5316);
                int i5319 = ~((i5315 & 20) | (i5315 ^ 20));
                int i5410 = ((i5313 - (~(((i5318 & i5319) | (i5318 ^ i5319)) * 959))) - 1) + ((~(threadPriority11 | 20)) * (-959));
                int i5411 = ~iB13;
                int i5412 = ~(((-21) & i5411) | ((-21) ^ i5411));
                int i5413 = ~(i5314 | iB13);
                int i5414 = ((~((iB13 & 20) | (iB13 ^ 20))) | (i5412 & i5413) | (i5412 ^ i5413)) * 959;
                int i5415 = -(-View.resolveSize(0, 0));
                int i5416 = ((i5415 | 28) << 1) - (i5415 ^ 28);
                int i5417 = -View.getDefaultSize(0, 0);
                Object[] objArr1117 = new Object[1];
                a(2058 - (((i5410 & i5414) + (i5414 | i5410)) >> 6), i5416, (char) (((i5417 | 25058) << 1) - (i5417 ^ 25058)), objArr1117);
                String str315 = (String) objArr1117[0];
                int iIndexOf9 = 2036 - TextUtils.indexOf((CharSequence) str5, '0', 0);
                int i5418 = -(-KeyEvent.getDeadChar(0, 0));
                Object[] objArr1118 = new Object[1];
                a(iIndexOf9, (i5418 ^ 10) + ((i5418 & 10) << 1), (char) (26180 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))))), objArr1118);
                strArr4 = new String[][]{strArr110, strArr111, strArr112, strArr210, new String[]{str315, (String) objArr1118[0]}};
                i24 = 0;
                i25 = -1;
                loop7: while (true) {
                    if (i24 < 5) {
                        i26 = i23;
                        str6 = str5;
                        strArr3 = strArr3;
                        i27 = i;
                        break;
                    }
                    int i5419 = TuitionPaymentFragmentbindingInflater1;
                    i43 = ((i5419 | 87) << 1) - (i5419 ^ 87);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
                    if (i43 % 2 != 0) {
                        String[] strArr211 = strArr4[i24];
                        str9 = strArr211[1];
                        strArr5 = (String[]) Arrays.copyOfRange(strArr211, 1, strArr211.length);
                        length2 = strArr5.length;
                        i44 = 0;
                    } else {
                        String[] strArr212 = strArr4[i24];
                        String str316 = strArr212[0];
                        strArr5 = (String[]) Arrays.copyOfRange(strArr212, 1, strArr212.length);
                        i44 = 0;
                        length2 = strArr5.length;
                        str9 = str316;
                    }
                    while (i44 < length2) {
                        i25 = ((i25 & 28) + (i25 | 28)) - 27;
                        Object[] objArr1119 = {str9, strArr5[i44]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2385;
                            int iResolveSizeAndState4 = 32 - View.resolveSizeAndState(0, 0, 0);
                            byte b414 = (byte) 0;
                            byte b415 = (byte) (b414 + 1);
                            Object[] objArr1210 = new Object[1];
                            c(b414, b415, (byte) (b415 - 1), objArr1210);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb2, maximumDrawingCacheSize2, iResolveSizeAndState4, -1207062455, false, (String) objArr1210[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr1119)).longValue();
                        long j1110 = -166659291;
                        i45 = i24;
                        long j1111 = (((long) 450) * j1110) + (((long) (-448)) * jLongValue111);
                        long j1112 = 449;
                        long j1113 = ((j1110 ^ j) | jLongValue111) ^ j;
                        long j1114 = jLongValue111 ^ j;
                        i26 = i23;
                        str6 = str5;
                        long j1115 = j1111 + ((j1113 | (((j1114 | j1110) | j2) ^ j)) * j1112) + (((long) (-1347)) * j1113) + (j1112 * (j1113 | (((j1114 | j47) | j1110) ^ j))) + ((long) 2143702619);
                        i46 = ((int) (j1115 >> 32)) & (((((~((-1056888400) | i)) | 676702484) * 262) - 1811943432) + (((~((-1056888400) | i19)) | 676702484) * 262));
                        i47 = ((int) j1115) & ((((((~(715840405 | i19)) | 5578752) | (~(i19 | (-721386005)))) * (-397)) - 1450388152) + ((5611905 | i) * 397));
                        if (((i46 & i47) | (i46 ^ i47)) != 0) {
                            int iB14 = SearchView9.b();
                            int i5510 = -(-(i25 * (-216)));
                            int i5511 = ((-73610) ^ i5510) + ((i5510 & (-73610)) << 1);
                            int i5512 = ~iB14;
                            int i5513 = ~(((-171) & i5512) | ((-171) ^ i5512));
                            int i5514 = ~i25;
                            int i5515 = ~((i5514 ^ iB14) | (i5514 & iB14));
                            int i5516 = ((i5513 & i5515) | (i5513 ^ i5515)) * 217;
                            int i5517 = ((i5511 | i5516) << 1) - (i5511 ^ i5516);
                            int i5518 = ~(((-171) ^ i5514) | ((-171) & i5514));
                            int i5519 = ~(iB14 | (-171));
                            int i5610 = ((i5519 & i5518) | (i5518 ^ i5519)) * 217;
                            int i5611 = ((i5517 | i5610) << 1) - (i5610 ^ i5517);
                            int i5612 = ~((i5514 ^ i5512) | (i5512 & i5514));
                            int i5613 = -(-(((i5612 & 170) | (i5612 ^ 170)) * 217));
                            int i5614 = ((i5611 | i5613) << 1) - (i5613 ^ i5611);
                            i27 = ((~i5614) & i) | (i5614 & i19);
                            break loop7;
                        }
                        i44++;
                        strArr4 = strArr4;
                        str9 = str9;
                        strArr3 = strArr3;
                        strArr5 = strArr5;
                        i24 = i45;
                        str5 = str6;
                        i23 = i26;
                    }
                    int i5615 = i24;
                    i24 = (((i5615 | (-57)) << 1) - (i5615 ^ (-57))) + 58;
                    strArr4 = strArr4;
                    i23 = i23;
                }
                int i5616 = (~(i & i26)) & (i | i26);
                int i5617 = -i5616;
                int i5618 = ((i5616 & i5617) | (i5616 ^ i5617)) >> 31;
                int i5619 = i27 & (~i5618);
                int i5718 = i26 & i5618;
                int i5719 = (i5619 & i5718) | (i5619 ^ i5718);
                int i5816 = (~(i & i5719)) & (i | i5719);
                int i5910 = -i5816;
                int i5911 = ((i5816 & i5910) | (i5816 ^ i5910)) >> 31;
                int i5912 = i28 & (~i5911);
                int i5913 = i5719 & i5911;
                int i5914 = (i5913 & i5912) | (i5912 ^ i5913);
                Object[] objArr1211 = new Object[1];
                a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2107, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr1211);
                str7 = (String) objArr1211[0];
                int i5915 = ((~(((-907982687) & i18) | ((-907982687) ^ i18))) | 537669704) * 168;
                int i5916 = (((-1527640618) | i5915) << 1) - (i5915 ^ (-1527640618));
                int i5917 = -(-((~(((-537669705) & i) | ((-537669705) ^ i))) * 168));
                int i5918 = ((i5916 | i5917) << 1) - (i5917 ^ i5916);
                int i5919 = ~(((-567111785) & i18) | ((-567111785) ^ i18));
                int i6010 = (i5919 & 29442080) | (i5919 ^ 29442080);
                int i6011 = ~(((-370312983) & i) | ((-370312983) ^ i));
                i29 = i5918 + (((i6010 & i6011) | (i6010 ^ i6011)) * 168);
                int iB15 = SearchView9.b();
                int i6012 = ~((2114143821 & iB15) | (2114143821 ^ iB15));
                int i6013 = (i6012 & (-2134859470)) | ((-2134859470) ^ i6012);
                int i6014 = ~((1195120833 & iB15) | (1195120833 ^ iB15));
                int i6015 = 820632048 + (((i6013 & i6014) | (i6013 ^ i6014)) * (-880));
                int i6016 = ~iB15;
                int i6017 = ~((i6016 & 2114143821) | (2114143821 ^ i6016));
                int i6018 = (i6017 & (-1195120834)) | ((-1195120834) ^ i6017);
                int i6019 = (iB15 & (-2114143822)) | ((-2114143822) ^ iB15);
                int i6110 = ~i6019;
                i30 = i6015 + (((i6018 & i6110) | (i6018 ^ i6110)) * (-880));
                i31 = (~i6019) * 880;
                if (i29 <= (i30 & i31) + (i31 | i30)) {
                    Object[] objArr1212 = {str7};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char size5 = (char) View.MeasureSpec.getSize(0);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 993;
                        int iGreen3 = 8 - Color.green(0);
                        byte b56 = (byte) 0;
                        byte b57 = (byte) (b56 + 1);
                        Object[] objArr1213 = new Object[1];
                        c(b56, b57, (byte) (b57 - 1), objArr1213);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size5, iNormalizeMetaState2, iGreen3, 410748506, false, (String) objArr1213[0], new Class[]{String.class});
                    }
                    long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr1212)).longValue();
                    long j1116 = 1848310684;
                    long j126 = -661;
                    long j127 = j1116 ^ j;
                    long j128 = jLongValue112 ^ j;
                    j3 = (j126 * j1116) + (j126 * jLongValue112) + (((long) 1324) * (j47 | ((j127 | j128) ^ j))) + (((long) (-1324)) * (((j1116 | j2) ^ j) | ((jLongValue112 | j2) ^ j))) + (((long) 662) * (((jLongValue112 | j127) ^ j) | ((j128 | j1116) ^ j))) + ((long) (-2049228921));
                    i32 = (int) (j3 << 75);
                    i33 = (-140058370) + (((~(i18 | 518156283)) | 919070127) * (-1042)) + ((518156283 | i) * 521);
                    i34 = ((~((-919070128) | i)) | 381838763 | (~(1055387647 | i18))) * 521;
                } else {
                    Object[] objArr1214 = {str7};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str6, '0'));
                        int i6111 = 994 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int scrollBarFadeDuration5 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                        byte b58 = (byte) 0;
                        byte b59 = (byte) (b58 + 1);
                        Object[] objArr1215 = new Object[1];
                        c(b58, b59, (byte) (b59 - 1), objArr1215);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf3, i6111, scrollBarFadeDuration5, 410748506, false, (String) objArr1215[0], new Class[]{String.class});
                    }
                    long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1214)).longValue();
                    long j129 = 1019059511;
                    long j1210 = -406;
                    long j1211 = jLongValue21 ^ j;
                    j3 = (((long) (-405)) * j129) + (((long) 407) * jLongValue21) + ((((j1211 | j2) ^ j) | (((j47 | j129) | jLongValue21) ^ j)) * j1210) + (j1210 * (((j1211 | j47) | j129) ^ j)) + (((long) 406) * (((j47 | jLongValue21) ^ j) | (((j129 ^ j) | j2) ^ j))) + ((long) (-1219977748));
                    i32 = (int) (j3 >> 32);
                    int i6112 = ~((int) Process.getStartUptimeMillis());
                    i33 = 1754752898 + (((~(853953918 | i6112)) | 583272492) * (-828)) + ((i6112 | 853953918) * (-828));
                    i34 = 1595758908;
                }
                int i6113 = i32 & (i33 + i34);
                int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                int i6114 = ~((-805712481) | iFreeMemory3);
                int i6115 = ~iFreeMemory3;
                int i6116 = ((int) j3) & (906872752 + ((i6114 | (~((-33571969) | i6115))) * 497) + (((~(iFreeMemory3 | (-33571969))) | (~((-2018456438) | i6115)) | 1212743957) * 497));
                int i6117 = (((i6113 & i6116) | (i6113 ^ i6116)) * 263) ^ i;
                int i6118 = (~(i & i5914)) & (i | i5914);
                int i6119 = -i6118;
                int i6210 = ((i6118 & i6119) | (i6118 ^ i6119)) >> 31;
                int i6211 = i6117 & (~i6210);
                int i6212 = i5914 & i6210;
                i393 = (i6212 & i6211) | (i6211 ^ i6212);
                strArr = strArr3;
            } else {
                i18 = i91;
                strArr = null;
            }
            int i839 = ((~i393) & i) | (i393 & i18);
            int i840 = -i839;
            Object[] objArr192 = {new int[1], new int[]{i393}, null, new int[]{i}, strArr};
            int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
            int i841 = (-1567517621) + (((~((-201347105) | (~startElapsedRealtime3))) | (~(1572732539 | startElapsedRealtime3))) * (-272)) + (((~((-470348836) | startElapsedRealtime3)) | 269001731) * (-272)) + (((~(startElapsedRealtime3 | 470348835)) | 1303730808) * 272);
            int i842 = -(-((((i839 & i840) | (i839 ^ i840)) >> 31) & 16));
            int i843 = (i841 ^ i842) + ((i842 & i841) << 1);
            int i844 = i843 * 628;
            int i845 = -(-(i3 * 628));
            int i846 = (i844 ^ i845) + ((i844 & i845) << 1);
            int i847 = (i3 ^ i) | (i3 & i);
            int i848 = ~i843;
            int i849 = ((i847 & i848) | (i847 ^ i848)) * (-627);
            int i850 = ((i846 | i849) << 1) - (i849 ^ i846);
            int i851 = ~i3;
            int i852 = ~((i851 & i) | (i851 ^ i));
            int i853 = -(-(((i852 & i843) | (i843 ^ i852)) * (-627)));
            int i854 = ((i850 | i853) << 1) - (i853 ^ i850);
            int i855 = ~((i18 ^ i3) | (i18 & i3));
            int i856 = ~((i & i843) | (i843 ^ i));
            int i857 = -(-(((i856 & i855) | (i855 ^ i856)) * 627));
            int i858 = (i854 ^ i857) + ((i857 & i854) << 1);
            int i859 = i858 << 13;
            int i860 = (i859 & (~i858)) | ((~i859) & i858);
            int i861 = i860 >>> 17;
            int i862 = (i860 | i861) & (~(i860 & i861));
            int i863 = i862 << 5;
            ((int[]) objArr192[0])[0] = ((~i862) & i863) | ((~i863) & i862);
            return objArr192;
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u008dÃ\u0007j\u0082ò\b\u001d\u0094¥\u0019Ì\u0085T\u001cÿ¥\u0007\u0019®\u009a6\u0018A°é%pµ\u00987#\u0095K;Ò¾z-\u0085±-5±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u008dÃ\u0007j\u0082ò\b\u001d\u0094¥\u0019Ì\u0085T\u001cÿ¥\u0007\b®\u00976\fA§é\u001fp¢\u00984#¸K+Òºz(±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u008dÃ\u0007j\u0082ò\b\u001d\u0094¥\u0019Ì\u0085T\u001cÿ¥\u0007\u000b®\u00876\u0012A¡³\u0093Û±c9\u008aµ\u0012k¹§Á'hªð9\u001f¾§5ÎùV3ýµ\u00054¬º4:C\u008bë\u0013r\u008e\u009a;!\u0088I\tÐ\u009ax\u0018\u0087\u0097/\u0002¶\u008f±³Ù\u0087a\u0014\u0088\u0085\u0010K»\u008eÃ\u000fjÀò\u001c\u001d\u0080¥\u001fÌ\u0086±³Ù\u0087a\u0014\u0088\u0085\u0010K»\u0099Ã\u0001j\u0083òB\u001d\u0082¥\u0002Ì\u0099T\u0004±³Ù\u0091a\u0004\u0088\u0085\u0010\u0005»\u0098Ã\fjÁò>\u001d´¥=Ì\u0099T\u0002ÿ\u009f\u0007<®\u009f6\bA£¢ Ê\u0015r\u0092\u009b\u0001\u0003\u0096¨VÐÕy\u001eá\u008f\u000e\u0014¶\u008aß\u000bG\u0081ì\u0006±îÙ\u008daN\u0088\u0084\u0010\u000b»\u0085Ã\u001cjÀò\u001e\u001d\u0097¥\u0014Ì\u0084T\u001bÿ\u0093\u0007\u001c®¡6\u0012A§é4p\u0099\u0098 #¤K;Òÿ±îÙ\u008daN\u0088\u0084\u0010\u000b»\u0085Ã\u001cjÀò\u001e\u001d\u0097¥\u0014Ì\u0084T\u001bÿ\u0093\u0007\u001c®¡6\u0012A§é4p\u0099\u0098 #¤K;Òü\u0010\u008fx\u00adÀ%)©±,\u001a³b9ËýS<¼§\u0004.måõ$^¯¦&\u000f¬\u0097\"àÐH\u000fÑ\u0095³äÛ\u0091c\u001d\u008a\u0092\u0012\u0011¹\u0088±³Ù\u0091a\u0019\u0088\u0095\u0010\u0010»\u008fÃ\u0005jÁò\u000e\u001d\u009b¥\u001eÌÙT\u001aÿ\u009f\u0007\u0015®\u008b6*A\u008fémp¨\u0098!#§K=Òãz/\u0085½->´¢Ü&gµ\u008f4±³Ù\u0091a\u0019\u0088\u0095\u0010\u0010»\u008fÃ\u0005jÁò\u000e\u001d\u009b¥\u001eÌÙT\u001aÿ\u009f\u0007\u0015®\u008b6*A\u008fémp¶\u00986#¥K8<ÙTûìs\u0005ÿ\u009dz6åNoç«\u007fj\u0090ñ(xA³Ùrrù\u008ap#ú»sÌÅd_ýú\u0015c®ÐÆP_Ë÷V\b\u0096 I9ÓÓ©»\u009c\u0003\u001fê\u008arQÙ\u009e¡\u0017\b\u0099\u0090\u0003\u007f\u008fÇ\u001f®\u00896\u001d\u009d\u0094±îÙ\u008daN\u0088\u0084\u0010\u0011»\u0083Ã\u0004j\u008aòB\u001d\u009a¥\u001fÌ\u0085T\u0000«)Ã\\{Ú\u0092N\nÚ¡\u001fÙÝpPèÃ\u0006jnKÖË?P§Þ\f\u001ct×Ý^EÙªN\u0012Ú{VãÞHW°Ä\u0019J\u0081ÖÝ]µ(\r¢ä<|¸×#±îÙ\u008daN\u0088\u0096\u0010\u0016»\u0085Ã\fj\u009bò\u000f\u001d\u0086¥^Ì\u009bT\u0015ÿ\u0094\u0007\r®\u00986\u001dA¡é4p³\u00986#¯K:¥]Í!u¨\u009c9Ø\u009f°ô\baáæy~Òêªo\u0003³\u009bltøÌp¥«=e\u0096ín%Çé_j(Ó\u0080F\u0019Òñ\u0019JÞ\"K»È\u0013\u0011ìÇDBÝÎµB\u000eöæL\u007fÝ×Z \u008e8!\u0091°i9Â½Z>3¯\u008b:d³±ìÙ\u0087a\u0012\u0088\u0095\u0010\r»\u0099Ã\u001cjÀò\u001f\u001d\u008b¥\u0003ÌØT\u0016ÿ\u009e\u0007V®\u009a6\u0019A é5p¡\u0098j#\u00adK8Ò»zb\u0085´-1´½Ü1g\u0085\u008f?\u0016®¾)ÉýQVøÃ\u0000J«Î3GZÜ±ìÙ\u0087a\u0012\u0088\u0095\u0010\r»\u0099Ã\u001cjÀò\u001f\u001d\u008b¥\u0003ÌØT\u0016ÿ\u009e\u0007V®\u009a6\u0019A é5p¡\u0098j#¸K'Òàz/\u0085£-9mÁ\u0005ª½?T¸Ì g´\u001f1¶í.2Á¦y.\u0010õ\u0088;#³Û{r·ê4\u009d\u008d5\u0018¬\u008cDGÿ\u0095\u0097\n\u000eÍ¦\rY\u009eñ\u001e\u0019\u008fqäÉq ö¸n\u0013úk\u007fÂ£Z|µè\r`d»üuWý¯5\u0006ù\u009ezéÃAVØÂ0\t\u008bÛãDz\u0083ÒB-Ò\u0085P±ìÙ\u0087a\u0012\u0088\u0095\u0010\r»\u0099Ã\u001cjÀò\u001f\u001d\u008b¥\u0003ÌØT\u0016ÿ\u009e\u0007V®\u009a6\u0019A é5p¡\u0098j#¸K'Òàz!\u0085¼-3±êÙ\u0080a\u000f\u0088\u009e\u0010\u0017»\u008c±³Ù\u0092a\u0012\u0088\u0089\u0010\u0007»ÅÃ\u0005j\u0081ò\b\u001d\u0087¥\u001cÌ\u0093T\u0007±êÙ\u0080a\u000f\u0088\u009e\u0010\u0003»\u009fÃ\rj\u009dò\u0018±³Ù\u0091a\u0019\u0088\u0095\u0010\u0010»\u008fÃ\u0005jÁò\n\u001d\u0080¥\u0011Ì\u009bT\u0011ÿ\u008d\u0007\u0017®\u008c6\u0017Aíé7p¯\u0098*#®K'Ò¹z?\u0085ÿ-#´¯Ü'g®\u008f=\u0016³¾\u0003ÉÑQEøÔ\u0000R«Ï3ZZ\u0080âF\rÓ\u0095B¬\u0080Ä§|6\u0095»\r3¦¶Þ)wòï3\u0000¨¸!ÑóIsâæ\u001a#³º+`\\\u0090ô\u0006m\u0091\u0085\u001e>\u0096VUÏ\u008dg\r\u0098\u00880\u000e©\u0084Á\u0015z\u0090\u0092E\u000b\u009a£\u0006ÔÿLwåú\u001d`¶ê.5GîÿpP\u009b8¼\u0080-i ñ(Z\u00ad\"2\u008bé\u0013(ü³D:-èµh\u001eýæ8O¡×{ \u0082\b\u001f\u0091\u008dy\u0003Â\u008fª\u00103\u0089\u009b\u0017d\u009fÌ\nUÐ=\u000b\u0086\u009bn\u001e÷\u0092_\u001b(ý°{\u0019 á\u007fJí¶èÞÊfB\u008fÎ\u0017K¼ÔÄ^m\u009aõ[\u001aÀ¢IË\u009bS\u001bø\u008e\u0000@©É1HFìî\u007fwÂ\u009f~$øLwÕù}H\u0082à*e³ùÛj`ó\u0088e\u0011ä¹dÎ\u009cVVÿ\u009e\u0007\u000f¬\u00814]]\u0086å\u0018±³Ù\u0087a\u0014\u0088\u0085\u0010K»\u0083Ã\u0006j\u0087ò\u0018\u001dÝ¥\u0019Ì\u0098T\u001dÿ\u008e\u0007V®\u009d6\u0010A\u00adé5p¢\u00987#¯K:Ò¸z%\u0085±-5´øÜ&g¹±ÛÙ\u0087a\u000e\u0088\u009f\u0010\t»\u0085Ã\u001cj\u0087ò\u0003\u001d\u009c±éÙ\u008ca\u000b\u0088\u0088\u0010\u000b»\u009dÃ\u0006±ÿÙ\u008aa\u0012\u0088\u0089\u0010\t»\u0083Ã\u001dj\u0083±îÙ\u008daN\u0088\u0096\u0010\u0016»\u0085Ã\fj\u009bò\u000f\u001d\u0086¥^Ì\u0092T\u0011ÿ\u008c\u0007\u0011®\u009d6\u0019\u0000\u0091hûÐt9å¡'\n§rc±ûÙ\u0087a\u000e\u0088\u0083\u0010\u0016»\u0083Ã\u000b!\u0010Ilñå\u0018h\u0080ý+hSàúZbÿ\u008d!5\u00adÑN¹2\u0001»è6p£Û6£¾\n\u0004\u0092¡}\u007fÅó¬\u001c4÷\u009f{\u008b\u0016ãu[¶²n*î\u0081}ùôPcÈ÷'~\u009f¦öcnãÅf=å\u0094j±ïÙ\u0086a\u000b±ùÙ\u008fa\u0015\u0088\u008a\u0010\u0005»\u009eÃ\u0007j\u009c£ªËåsg\u009a±\u0002A©èÑqxíàr\u000fè·bÞ¡Feíâ\u0015}¼©$HSÝûEbÞ\u008a^1Ø&\u0091NÀöH\u001fØ\u0087G,ÏT@ý\u0082es\u008aú2w[\u009aÃZhÃ\u0090]9Þ¡DÖ®~jçå\u000fz´¦Ü|Eºí6±ÝÙ\u008ca\u0004\u0088\u0094\u0010\u000b»\u0083Ã\fjÎò?\u001d¶¥;ÌÖT\u0016ÿ\u008f\u0007\u0011®\u00926\bAâé&p©\u00986#êK0Òözz\u0085\u008d-f´â,lD\u000füÌ\u0015\f\u008d\u0087&\u001a^\u008e÷\u001bo\u008f\u0080\u00028\u0097~Ð\u0016¦®'G©ß)t¨\f0¥\u00adzº\u0012Ðª_CÎÛ\fp\u008c±îÙ\u0083a\u000e\u0088\u0085\u0010\f»\u009f±îÙ\u008daN\u0088\u0096\u0010\u0016»\u0085Ã\fj\u009bò\u000f\u001d\u0086¥^Ì\u0094T\u0006ÿ\u009b\u0007\u0016®\u009a±îÙ\u008daN\u0088\u008d\u0010\u0001»\u0098Ã\u0006j\u008bò\u0000\u001dÜ¥\u0001Ì\u0093T\u0019ÿ\u008f±\u00ads\u008e\u001bí£.JõÒayé\u0001}¨ü0i\u0000Ò±îÙ\u008daN\u0088\u0084\u0010\u0011»\u0083Ã\u0004j\u008aòB\u001d\u0082¥\u0002Ì\u0099T\u0010ÿ\u008f\u0007\u001b®\u008a±úÙ\u0097a\f\u0088\u008a\u0010;»\u0092ÃPjØ±îÙ\u008daN\u0088\u0084\u0010\u0011»\u0083Ã\u0004j\u008aòB\u001d\u0094¥\u0019Ì\u0098T\u0013ÿ\u009f\u0007\n®\u008e6\u000eA«é.p²\u008e½æÁ^H·Å/P\u0084ÅüMU\u0087ÍY\"Ð\u009a]ó\u009fkUÀÙ8P\u0091Ý\tH~íÖe .ÈRpÛ\u0099V\u0001ÃªVÒÞ{dãÁ\f\u001f´\u0093Ý\fEÒîK\u0016Æ¿t'ÑP/ø£a<\u0089ö2zZóÃ~kë\u0094n<æ¥\\Íùv7\u009e»±ûÙ\u0087a\u000e\u0088\u0083\u0010\u0016»\u0083Ã\u000bjÁò\u000b\u001d\u009d¥\u001fÌ\u0091T\u0018ÿ\u009f\u0007'®\u008d6\u0018A©éop¡\u0098!#¤K-Ò¼z%\u0085±\u001epv\fÎ\u0085'\b¿\u009d\u0014\bl\u0080ÅJ]\u0091²\u001b\n\u0094c\u0005ûÇPG¨\u0083\u0001Z\u0099\u0081î+F¤ß57÷\u008cwä³±ûÙ\u008da\u000f\u0088\u0081\u0010\b»\u008fÃGj\u009dò\b\u001d\u0099¥/Ì\u0091T\u0004ÿ\u0092\u0007\u0017®\u00906\u0019A\u009dé8pþ\u0098r#åK/Ò«z\"\u0085·-\"´¿Ü7g\u0085\u008f \u0016æ¾j±îÙ\u008daN\u0088\u0084\u0010\u000b»\u0085Ã\u001cj\u0082ò\u0003\u001d\u0093¥\u0014Ì\u0093T\u0006:\u008cRïê,\u0003æ\u009bi0çH~áåyc\u0096ñ.uGñß8tú\u008co%õ½rÊÄb\fûÂ\u0013O¨ÆÀMYÉñ\\\u000eÀ¦@?ÝWXìÌ±ÝÙ\u008ca\u0004\u0088\u0094\u0010\u000b»\u0083Ã\fjÃò\u0014\u001dÊ¥F±îÙ\u008daN\u0088\u0084\u0010\u0011»\u0083Ã\u0004j\u008aòB\u001d\u0096¥\u0019Ì\u0085T\u0004ÿ\u0096\u0007\u0019®\u00876RA«é$e§\rÈµ\\\\ÝÄ\u0006±õÙ\u008ca\t\u0088\u0092\u0010J»\u0099Ã\u001ej\u008dòB\u001d\u0083¥\u0015Ì\u009bT\u0001ÿ×\u0007\b®\u008c6\u0013A²é3±íÙ\u0087a\r\u0088\u0093\u0010J»\u0082Ã\u001fjÀò\u0001\u001d\u0093¥\u0019Ì\u0098T\u001fÿ\u009f\u0007\u0001®\u008d)eA\u000fù\u0085\u0010\u001b\u0088Â#\u0011[\u0086òHj\u0082\u0085\u001b=\u0093T\u001bÌ£g\u0011\u009f\u00916\u001b®\u0091Ù8q©±íÙ\u0087a\r\u0088\u0093\u0010J»\u0099Ã\u000ejÀò\u0000\u001d\u0091¥\u0014Ì©T\u0010ÿ\u009f\u0007\u0016®\u008d6\u0015A¶é9¼\u0099Ôúl9\u0085ú\u001dv¶ïÎqgüÿw\u0010«¨fÁïYgòÿ\n`£à;oL\u009bäF}Ô\u0095^.ÈF[±îÙ\u008daN\u0088\u0084\u0010\u000b»\u0085Ã\u001cjÀò\u001d\u001d\u0097¥\u001dÌ\u0083TZÿ\u009b\u0007\u000e®\u009a6#A¬é!p«\u0098!±îÙ\u008daN\u0088\u0089\u0010\u0000»\u0087ÃFj\u008cò\u0019\u001d\u009b¥\u001cÌ\u0092TZÿ\u009c\u0007\u0011®\u00906\u001bA§é2p¶\u00986#£K&Òº0¡XÂà\u0001\tÙ\u0091Y:ÊBCëÔs@\u009cÉ$\u0011MÛÕN~Ü\u0086[/Õ·\u001dÀëhfñç\u0019l¢àÊuSñûq\u0004ô¬q5í±îÙ\u008daN\u0088\u0095\u0010\u001d»\u0099Ã\u001cj\u008bò\u0001\u001dÜ¥\u0012Ì\u0083T\u001dÿ\u0096\u0007\u001c®Ð6\u001aA«é.p¡\u0098!#¸K8Ò¼z%\u0085¼-$±îÙ\u008daN\u0088\u0095\u0010\u001d»\u0099Ã\u001cj\u008bò\u0001\u001d\u00ad¥\u0015Ì\u008eT\u0000ÿÔ\u0007\u001a®\u008b6\u0015A®é$pè\u0098\"#£K&Ò©z)\u0085 - ´¤Ü=g´\u008f,\u0004\u0096lõÔ6=è¥y\u000eüvtßùGf¨¤\u0010jyûáeJî²d\u001b¨\u0083bôÓ\\VÅÙ-Y\u0096Àþ@gÄÏ]0Ä\u0098\\±îÙ\u008daN\u0088\u0090\u0010\u0001»\u0084Ã\fj\u0081ò\u001e\u001d\u00ad¥\u0014Ì\u009aT\u001fÿ\u0097\u0007V®\u009c6\tA«é,p¢\u0098j#¬K!Ò z+\u0085·-\"´¦Ü&g³\u008f6\u0016ª±´±°ÙÂ±¦\u0094Á±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u009bÃ\rj\u0083ò\u0019\u001d\u00ad¥\u0000Ì\u009fT\u0004ÿ\u009f±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u0099Ã\u0007j\u008dò\u0007\u001d\u0097¥\u0004ÌÙT\u0016ÿ\u009b\u0007\u000b®\u009b6\u001eA£é.p¢\u0098\u001b#\u00adK-Ò z5\u0085¶±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u0099Ã\u0007j\u008dò\u0007\u001d\u0097¥\u0004ÌÙT\u0013ÿ\u009f\u0007\u0016®\u00876\u0018±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u0099Ã\u0007j\u008dò\u0007\u001d\u0097¥\u0004ÌÙT\u0005ÿ\u009f\u0007\u0015®\u008b6\u0018±³Ù\u0091a\u0019\u0088\u0095\u0010K»\u009bÃ\rj\u0083ò\u0019\u001d\u00ad¥\u0004Ì\u0084T\u0015ÿ\u0099\u0007\u001d±³Ù\u0091a\u0019\u0088\u0095\u0010\u0010»\u008fÃ\u0005jÁò\u0000\u001d\u009b¥\u0012ÌÙT\u0018ÿ\u0093\u0007\u001a®\u009d6#A¯é!pª\u0098(#¥K+Ò\u0091z(\u0085·-2´£Ü3g\u0085\u008f)\u0016»¾1É×Q\u000eøÕ\u0000K±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u0088Ã\u001bj\u009aò3\u001d\u0095¥\u0000Ì\u00857·_\u0082ç\u0001\u000e\u0094\u0096O=\u008cE\u001fì\u009et7\u009b\u0082#\u001dJ\u009fÒ\u0015~Ý\u0016è®kGþß%t÷\fi¥ã=iÒùjj\u0003·\u009bx0çÈbaöù}\u008eÀ&J¿ÍWXìÀ±³Ù\u0091a\u0019\u0088\u0095\u0010\u0010»\u008fÃ\u0005jÁò\u0000\u001d\u009b¥\u0012ÌÙT\u0018ÿ\u0093\u0007\u001a®\u009c6\u000fA¶é&p©\u0098(#®K-Ò¼z\u0013\u0085¸->´¿Üzg©\u008f7±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u0088Ã\u001bj\u009aò\r\u001d\u0091¥\u0013Ì\u0093\u0014ø|ÍÄN-Ûµ\u0000\u001eÃfPÏÑW@¸À\u0000IiÒfþ\u000eË¶H_ÝÇ\u0006lÅ\u0014V½×%LÊÚrZ\u001bÕûD\u0093q+òÂgZ¼ñ\u007f\u0089ì m¸ôWwïî\u0086d±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u0088Ã\u001bj\u009aò\u001a\u001d\u009f¥\u0003Ì\u0091Çú¯Ï\u0017LþÙf\u0002ÍÁµR\u001cÓ\u0084UkÜÓXºÖ\"M\u0089Ð±³Ù\u0086a\u0005\u0088\u0090\u0010K»\u0088Ã\u001bj\u009aò3\u001d\u009b¥\u001dÌ\u0093±³Ù\u0086a\u0001\u0088\u0092\u0010\u0005»ÅÃ\fj\u0081ò\u001b\u001d\u009c¥\u001cÌ\u0099T\u0015ÿ\u009e\u0007\u000b®Ñ6RAºé\"pé\u0098&#¹K<Ò¥Íi¥U\u001dÔôHl\u0091ÇG¿Û\u0016Z\u008eÒaGÙÝ°_(\u0081\u0083b{ÑÒPJõ=p\u0095û\fnäû_t7Ô®{\u0006úùlQïÈ~õ5\u009d\u0014%\u0094Ì\u000fT\u0081ÿC\u0087\u0087.\u0007¶\u009aY\u001bá\u0084\u0088\u0004\u0010\u0081\u0000#h\u000bÐ\u00899I¡Ñ\u0014b|CÄÃ-XµÖ\u001e\u0014fÊÏZWÑ¸E\u0000\u008eiJñÄZ[¢ÚàË\u0088 01ÙºA8êµ\u0092;;ð£;L\u00adô,\u009d¢\u0005\"®£V;ÿ¦gb\u0010\u0081¸\u001f±ðÙ\u008ba\u0002\u0088¡\u0010(»¯Ã;j±ò\u000e\u001d\u0081¥\u0004ÌØT\u0007ÿ\u0095±³Ù\u0087a\u0014\u0088\u0085\u0010K»\u0087Ã\rj\u008aò\u0005\u001d\u0093¥/Ì\u0095T\u001bÿ\u009e\u0007\u001d®\u009d6\u000fAìé8p«\u0098(×»¿Ë\u0007PîÆvRÝÛ¥L\fÈ\u0094B{Ä±³Ù\u0087a\u0014\u0088\u0085\u0010K»\u0087Ã\u0007j\u009bò\u0002\u001d\u0086¥\u0003ÐQ¸d\u0000ãépqçÚ'¢î\u000bc\u0093ù|~Äþ\u00ad{5÷\u009e|féÏ3W° D\u0088Ò\u0011\u000bùÇBX*Ú³_\u001b\u0080äHLßÕX³mÛLcÌ\u008aW\u0012Ù¹\u001bÁÕh@ðÇ\u001fE§ÀÎNVÅMF%\u0010\u009d\u0091t\u001fì\u009fG\u001e?\u0086\u0096\u001b±³Ù\u0086a\u0001\u0088\u0092\u0010\u0005»ÅÃ\u0005j\u0087ò\u001f\u001d\u0091¥_Ì\u0086T\u0006ÿ\u0095\u0007\u001e®\u00976\u0010A§é3pé\u0098'#¿K:Òáz|\u0085ý-3´¹Ü9gô\u008f5\u0016·¾?ÉÐQOøÐ\u0000M«Ø3\\Z\u0080âA\r×\u0095]<ÃD]ï×w]".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -3981724226080351774L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, byte r7, byte r8) {
            /*
                int r7 = r7 * 2
                int r7 = 4 - r7
                int r6 = r6 * 3
                int r0 = r6 + 1
                byte[] r1 = defpackage.AlertControllerAlertParams3.$$c
                int r8 = r8 * 3
                int r8 = r8 + 109
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                r5 = r8
                r8 = r7
                r7 = r5
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L2d:
                int r4 = -r4
                int r7 = r7 + 1
                int r8 = r8 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.AlertControllerAlertParams3.$$e(short, byte, byte):java.lang.String");
        }
    });
    private String d;
    private String g;
    private final Lazy notify;
    private final Lazy onTransact;
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {87, -91, 60, 112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 36;
    private static int IconCompatParcelizer = 1;
    private static int getInterfaceDescriptor = 0;
    private static int INotificationSideChannelDefault = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i2 | i7 | (~i5);
        int i9 = ~i2;
        int i10 = (~(i5 | i7)) | (~(i7 | i9));
        int i11 = i3 + i2 + i + ((-92689393) * i6) + (1942122663 * i4);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i3) - 357761024) + ((-674687396) * i2) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i) + ((-1056047104) * i6) + ((-742522880) * i4) + ((-592117760) * i12);
        int i14 = (i3 * 1048061654) + 1366922925 + (i2 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i * 1048061961) + (i6 * 439444615) + (i4 * (-1279783457)) + (i12 * 173867008);
        int i15 = i13 + (i14 * i14 * (-1898250240));
        if (i15 == 1) {
            return b(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity.$$a
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    public AsikAccountVerificationActivity() {
        final AsikAccountVerificationActivity asikAccountVerificationActivity = this;
        this.onTransact = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = asikAccountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = asikAccountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.notify = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = asikAccountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asBinder = LazyKt.lazy(new Function0<forLanguageTags>() { // from class: com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity$special$$inlined$inject$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [forLanguageTags, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final forLanguageTags invoke() {
                ComponentCallbacks componentCallbacks = asikAccountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(forLanguageTags.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/asik/active/AsikAccountVerificationActivity$b;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        AsikAccountVerificationActivity$bindingInflater$1 asikAccountVerificationActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            asikAccountVerificationActivity$bindingInflater$1 = AsikAccountVerificationActivity$bindingInflater$1.b;
            int i3 = 53 / 0;
        } else {
            asikAccountVerificationActivity$bindingInflater$1 = AsikAccountVerificationActivity$bindingInflater$1.b;
        }
        int i4 = getInterfaceDescriptor + 27;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return asikAccountVerificationActivity$bindingInflater$1;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikAccountVerificationActivity.this.finish();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final AsikAccountVerificationActivity asikAccountVerificationActivity = (AsikAccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        final ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding = (ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.setOtpCompletionListener(new notifyStateAttached() { // from class: newView
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                AsikAccountVerificationActivity.b(activityAsikVerifyOtpFromPhoneBinding, asikAccountVerificationActivity);
            }
        });
        OtpView otpView = activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: onPrepareListView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityAsikVerifyOtpFromPhoneBinding, (String) obj);
            }
        }));
        activityAsikVerifyOtpFromPhoneBinding.btnPhoneNumberAsik.setOnClickListener(new View.OnClickListener() { // from class: AlertControllerButtonHandler
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        activityAsikVerifyOtpFromPhoneBinding.btnVerificationOtpPhone.setOnClickListener(new View.OnClickListener() { // from class: AlertControllerCheckedItemAdapter
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityAsikVerifyOtpFromPhoneBinding, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                AsikAccountVerificationActivity.TuitionPaymentFragmentbindingInflater1(createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -695655643, objArr2, 695655646, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        TextView textView = activityAsikVerifyOtpFromPhoneBinding.tvPhoneNumberAsik;
        String str = asikAccountVerificationActivity.INotificationSideChannel;
        if (str == null) {
            int i2 = getInterfaceDescriptor + 31;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = INotificationSideChannelDefault + 41;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        textView.setText(str);
        activityAsikVerifyOtpFromPhoneBinding.tvResendCodeAsik.setOnClickListener(new View.OnClickListener() { // from class: AlertControllerAlertParamsOnPrepareListViewListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityAsikVerifyOtpFromPhoneBinding, asikAccountVerificationActivity, view);
            }
        });
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 85;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intent intent = getIntent();
            Intrinsics.checkNotNull(intent);
            this.INotificationSideChannel = String.valueOf(intent.getStringExtra("KEY_PHONE_NUMBER"));
            int i3 = 79 / 0;
        } else {
            Intent intent2 = getIntent();
            Intrinsics.checkNotNull(intent2);
            this.INotificationSideChannel = String.valueOf(intent2.getStringExtra("KEY_PHONE_NUMBER"));
        }
        int i4 = INotificationSideChannelDefault + 11;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        AsikAccountVerificationActivity asikAccountVerificationActivity = this;
        ((forLanguageTags) this.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(asikAccountVerificationActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AlertControllerAlertParams2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.onTransact.getValue()).cancelAll.observe(asikAccountVerificationActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: bindView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikAccountVerificationActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = INotificationSideChannelDefault + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 105;
        getInterfaceDescriptor = i3 % 128;
        getCameraCharacteristic getcameracharacteristic = null;
        if (i3 % 2 != 0) {
            getcameracharacteristic.hashCode();
            throw null;
        }
        getCameraCharacteristic getcameracharacteristic2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic2 == null) {
            int i4 = i2 + 3;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ExperimentalCamera2Interop.INSTANCE.b(this, new AlertControllerAlertParams4(this), new hasStableIds(this));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        AsikAccountVerificationActivity asikAccountVerificationActivity = this;
        Intrinsics.checkNotNullParameter(asikAccountVerificationActivity, "");
        asikAccountVerificationActivity.getWindow().addFlags(8192);
        ExperimentalCamera2Interop.INSTANCE.b(this, new AlertControllerAlertParams4(this), new hasStableIds(this));
        TuitionPaymentFragmentbindingInflater1(((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number_verification));
        int i2 = INotificationSideChannelDefault + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getCameraCharacteristic(((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCodeAsik, null, 2, 0 == true ? 1 : 0);
        int i2 = getInterfaceDescriptor + 47;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i4 = getInterfaceDescriptor + 91;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        }
        getcameracharacteristic.b = null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            throw null;
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = INotificationSideChannelDefault + 13;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            getcameracharacteristic = null;
        }
        getcameracharacteristic.b();
        int i5 = INotificationSideChannelDefault + 37;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = cancelAll;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 8;
        if (cArr2 != null) {
            int i6 = $11 + 71;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 69;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iRgb = 16779483 + Color.rgb(0, 0, 0);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> i5) + 33;
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iRgb, touchSlop, -1927765101, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    int i11 = $11 + 97;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1770390596;
                    i5 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(INotificationSideChannelStub)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myPid() >> 22), 2267 - TextUtils.indexOf("", ""), 33 - (Process.myTid() >> 22), -1927765101, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char capsMode = (char) (49267 - TextUtils.getCapsMode("", 0, 0));
                        int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3260;
                        int iIndexOf = 30 - TextUtils.indexOf("", "", 0, 0);
                        byte b7 = (byte) ($$f & 7);
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i13, iIndexOf, -127612708, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 3;
                            byte b10 = (byte) (b9 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22877 - TextUtils.indexOf((CharSequence) "", '0')), 594 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - TextUtils.getTrimmedLength(""), 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i15 = $10 + 15;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                            int i19 = $10 + 99;
                            $11 = i19 % 128;
                            int i20 = i19 % 2;
                        } else {
                            int i21 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i22 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i21];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i22];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i23 = 0; i23 < i; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = INotificationSideChannelDefault + 7;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i6 = INotificationSideChannelDefault + 97;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
        int i8 = INotificationSideChannelDefault + 79;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int iAxisFromString = 1754 - MotionEvent.axisFromString("");
            int iResolveSize = 23 - View.resolveSize(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, s, (byte) (s | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAxisFromString, iResolveSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                int iMyTid = (Process.myTid() >> 22) + 23;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                Object[] objArr3 = new Object[1];
                c(b3, (short) (b3 | 36), bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, i2, iMyTid, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i3 = ~layoutDirection;
            int i4 = (-2108660432) + ((layoutDirection | 657445863) * (-859)) + (((~(layoutDirection | (-623645251))) | (~(657445863 | i3))) * 859) + (((~(444843437 | i3)) | (-1068488688)) * 859) + 756332891;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i6 ^ (i6 << 5);
            int i7 = INotificationSideChannelDefault + 89;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{3, '\t', 3, 6, 16, 7, '\t', 6, 15, 18, 1, 17, 20, 14, 6, '\f'}, (byte) (Color.rgb(0, 0, 0) + 16777291), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_challenge_token).substring(0, 15).length() + 1, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{3, 20, '\b', 6, 15, 5, 11, 15, 18, '\r', 23, 4, 7, 24, 22, '\b'}, (byte) (TextUtils.lastIndexOf("", '0') + 122), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-630826740};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 42049), TextUtils.getOffsetAfter("", 0) + 1726, Drawable.resolveOpacity(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 756332891, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                    int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    Object[] objArr8 = new Object[1];
                    c(b4, (short) (b4 | 36), bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, keyRepeatTimeout, iNormalizeMetaState, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{'\t', 6, 24, '\r', 20, 2, 22, 18, 23, 20, 22, 7, 19, 21, '\f', 5, 14, 6, 7, 21, 20, 0}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 40), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{'\b', 7, '\r', 23, 22, '\t', 22, '\r', '\b', '\t', 5, 11, 1, '\n', 13837}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 22), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_order_id_required).substring(0, 9).length() + 6, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                        int iResolveSize2 = 1755 - View.resolveSize(0, 0);
                        int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[5];
                        Object[] objArr11 = new Object[1];
                        c(b5, (short) (b5 | 88), bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, iResolveSize2, iLastIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                        int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int tapTimeout2 = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[5];
                        short s2 = bArr5[7];
                        Object[] objArr12 = new Object[1];
                        c(b6, s2, (byte) (s2 | 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, longPressTimeout, tapTimeout2, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i10 == i9) {
            int i11 = INotificationSideChannelDefault + 77;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iNextInt = new Random().nextInt();
            int i14 = (~((-853753804) | iNextInt)) | 281022026;
            int i15 = i13 + 2135982025 + (i14 * 992) + ((i14 | (~((~iNextInt) | (-68419601)))) * (-496)) + ((iNextInt | (-641151378)) * 496);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i18 = 0;
                while (i18 < strArr.length) {
                    arrayList.add(strArr[i18]);
                    i18++;
                    int i19 = getInterfaceDescriptor + 43;
                    INotificationSideChannelDefault = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i23 = i21 + 1046498805 + (((~(i22 | 782735950)) | 570133524) * (-668)) + ((782735950 | (~(570133524 | i22))) * 1336) + ((i22 | 805281374) * 668);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr14[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int iAlpha = 1031 - Color.alpha(0);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
            byte[] bArr6 = $$a;
            byte b7 = bArr6[5];
            Object[] objArr15 = new Object[1];
            c(b7, (short) (b7 | 140), bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, iAlpha, packedPositionGroup, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{'\t', 6, 24, '\r', 20, 2, 22, 18, 23, 20, 22, 7, 19, 21, '\f', 5, 14, 6, 7, 21, 20, 0}, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step3).substring(0, 1).length() + 21, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{'\b', 7, '\r', 23, 22, '\t', 22, '\r', '\b', '\t', 5, 11, 1, '\n', 13837}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 92, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
            int i26 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr7 = $$a;
            byte b8 = bArr7[5];
            Object[] objArr18 = new Object[1];
            c(b8, (short) (b8 | 36), bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(size, absoluteGravity, i26, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
                int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b9 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b9, (short) (b9 | 193), (byte) ($$b | 16), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(jumpTapTimeout, iResolveSizeAndState, scrollDefaultDelay, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr20[3])[0];
            int i28 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i29 = ~System.identityHashCode(this);
            int i30 = (-348191261) + (((-101728801) | i29) * 494) + (((~(i29 | 141531337)) | (-242240106)) * 494) + 422439963;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{3, '\t', 3, 6, 16, 7, '\t', 6, 15, 18, 1, 17, 20, 14, 6, '\f'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 39), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{3, 20, '\b', 6, 15, 5, 11, 15, 18, '\r', 23, 4, 7, 24, 22, '\b'}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 122), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-630826740};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46037), KeyEvent.getDeadChar(0, 0) + 1134, 18 - ExpandableListView.getPackedPositionType(0L), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 422439963, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int tapTimeout3 = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 15;
                byte[] bArr8 = $$a;
                byte b10 = bArr8[5];
                Object[] objArr25 = new Object[1];
                c(b10, (short) (b10 | 140), bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarSize, tapTimeout3, iResolveSizeAndState2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.lastIndexOf("", '0', 0)), 1165 - AndroidCharacter.getMirror('0'), 17 - Color.red(0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                int absoluteGravity3 = 1031 - Gravity.getAbsoluteGravity(0, 0);
                int iAlpha2 = 15 - Color.alpha(0);
                byte b11 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b11, (short) (b11 | 193), (byte) ($$b | 16), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(absoluteGravity2, absoluteGravity3, iAlpha2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{'\t', 6, 24, '\r', 20, 2, 22, 18, 23, 20, 22, 7, 19, 21, '\f', 5, 14, 6, 7, 21, 20, 0}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 59), 22 - View.combineMeasuredStates(0, 0), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{'\b', 7, '\r', 23, 22, '\t', 22, '\r', '\b', '\t', 5, 11, 1, '\n', 13837}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).codePointAt(0) - 96), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_challenge_token).substring(0, 15).codePointAt(0) - 52, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int i33 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr9 = $$a;
                    byte b12 = bArr9[5];
                    Object[] objArr29 = new Object[1];
                    c(b12, (short) (b12 | 36), bArr9[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(trimmedLength, threadPriority, i33, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int i34 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                    int mirror = AndroidCharacter.getMirror('0') - '!';
                    byte[] bArr10 = $$a;
                    byte b13 = bArr10[5];
                    Object[] objArr30 = new Object[1];
                    c(b13, (short) (b13 | 140), bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cKeyCodeFromString, i34, mirror, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[3])[0];
        if (i36 == i35) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i37 = ((int[]) objArr[2])[0];
            int i38 = ((int[]) objArr[3])[0];
            int i39 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1228119332;
            int i40 = i37 + (((~((-997093040) | length)) | 676200965) * (-566)) + 721937015 + ((~(length | (-320892075))) * 566);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr31[2])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i43 = INotificationSideChannelDefault + 19;
            getInterfaceDescriptor = i43 % 128;
            int i44 = i43 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i36];
        int i45 = i36 - 1;
        iArr[i45] = 1;
        Toast.makeText((Context) null, iArr[((i36 * i45) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i46 = ((int[]) objArr[2])[0];
        int i47 = ((int[]) objArr[3])[0];
        int i48 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i49 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i50 = ~(363954792 | i49);
        int i51 = i46 + 1607064529 + ((i50 | (-119674623)) * 764) + (((~(i49 | (-119674623))) | 85983848) * (-1528)) + (((-311661719) | i50) * 764);
        int i52 = i51 ^ (i51 << 13);
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr32[2])[0] = i53 ^ (i53 << 5);
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikAccountVerificationActivity asikAccountVerificationActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) asikAccountVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) asikAccountVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = INotificationSideChannelDefault + 103;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return userAsBinder;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikAccountVerificationActivity asikAccountVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                asikAccountVerificationActivity.finish();
                ViewPortBuilder.b();
                int i4 = 25 / 0;
            } else {
                asikAccountVerificationActivity.finish();
                ViewPortBuilder.b();
            }
            int i5 = INotificationSideChannelDefault + 31;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, AsikAccountVerificationActivity asikAccountVerificationActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            OtpView otpView = activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, asikAccountVerificationActivity);
        } else {
            OtpView otpView2 = activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik;
            Intrinsics.checkNotNullExpressionValue(otpView2, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, asikAccountVerificationActivity);
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i4 = INotificationSideChannelDefault + 59;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                MaterialButton materialButton = activityAsikVerifyOtpFromPhoneBinding.btnVerificationOtpPhone;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                Intrinsics.checkNotNullParameter(materialButton2, "");
                materialButton2.setEnabled(true);
            } else {
                MaterialButton materialButton3 = activityAsikVerifyOtpFromPhoneBinding.btnVerificationOtpPhone;
                Intrinsics.checkNotNullExpressionValue(materialButton3, "");
                MaterialButton materialButton4 = materialButton3;
                Intrinsics.checkNotNullParameter(materialButton4, "");
                materialButton4.setEnabled(false);
            }
        } else {
            MaterialButton materialButton5 = activityAsikVerifyOtpFromPhoneBinding.btnVerificationOtpPhone;
            Intrinsics.checkNotNullExpressionValue(materialButton5, "");
            MaterialButton materialButton6 = materialButton5;
            Intrinsics.checkNotNullParameter(materialButton6, "");
            materialButton6.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r1
  0x0040: PHI (r1v7 com.bpjstku.util.utils.LocationAddressInfo) = (r1v6 com.bpjstku.util.utils.LocationAddressInfo), (r1v25 com.bpjstku.util.utils.LocationAddressInfo) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit b(AsikAccountVerificationActivity asikAccountVerificationActivity, UserLocationComplete userLocationComplete) throws IOException {
        LocationAddressInfo locationAddressInfo;
        String str;
        LocationAddressInfo locationAddressInfo2;
        String str2;
        LocationAddressInfo locationAddressInfo3;
        String str3;
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 123;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        if (i4 == 0) {
            asikAccountVerificationActivity.g = String.valueOf(userLocationComplete.b);
            asikAccountVerificationActivity.d = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = 53 / 0;
            if (locationAddressInfo != null) {
                str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str != null) {
                    int i6 = INotificationSideChannelDefault + 11;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            asikAccountVerificationActivity.f461a = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
            locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (locationAddressInfo2 != null) {
                i = getInterfaceDescriptor + 115;
                INotificationSideChannelDefault = i % 128;
                if (i % 2 == 0) {
                    String str5 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    throw null;
                }
                str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (locationAddressInfo3 != null || (str3 = locationAddressInfo3.d) == null) {
                int i8 = getInterfaceDescriptor + 13;
                INotificationSideChannelDefault = i8 % 128;
                int i9 = i8 % 2;
            } else {
                str4 = str3;
            }
            asikAccountVerificationActivity.asInterface = str4;
            String str6 = asikAccountVerificationActivity.g;
            String str7 = asikAccountVerificationActivity.d;
            String str8 = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str9 = asikAccountVerificationActivity.f461a;
            String str10 = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("Location from GPS: ");
            sb.append(str6);
            sb.append(", ");
            sb.append(str7);
            sb.append(", City: ");
            sb.append(str8);
            sb.append(", Province: ");
            sb.append(str9);
            sb.append(", Country: ");
            sb.append(str10);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            return Unit.INSTANCE;
        }
        asikAccountVerificationActivity.g = String.valueOf(userLocationComplete.b);
        asikAccountVerificationActivity.d = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo != null) {
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str != null) {
                int i10 = INotificationSideChannelDefault + 11;
                getInterfaceDescriptor = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        asikAccountVerificationActivity.f461a = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 != null) {
            i = getInterfaceDescriptor + 115;
            INotificationSideChannelDefault = i % 128;
            if (i % 2 == 0) {
                String str11 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                throw null;
            }
            str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null) {
            int i12 = getInterfaceDescriptor + 13;
            INotificationSideChannelDefault = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = getInterfaceDescriptor + 13;
            INotificationSideChannelDefault = i14 % 128;
            int i15 = i14 % 2;
        }
        asikAccountVerificationActivity.asInterface = str4;
        String str12 = asikAccountVerificationActivity.g;
        String str13 = asikAccountVerificationActivity.d;
        String str14 = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str15 = asikAccountVerificationActivity.f461a;
        String str16 = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb2 = new StringBuilder("Location from GPS: ");
        sb2.append(str12);
        sb2.append(", ");
        sb2.append(str13);
        sb2.append(", City: ");
        sb2.append(str14);
        sb2.append(", Province: ");
        sb2.append(str15);
        sb2.append(", Country: ");
        sb2.append(str16);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2.toString(), new Object[0]);
        return Unit.INSTANCE;
        int i16 = getInterfaceDescriptor + 37;
        INotificationSideChannelDefault = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 3 / 4;
        }
        str = "";
        asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        asikAccountVerificationActivity.f461a = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 != null) {
            i = getInterfaceDescriptor + 115;
            INotificationSideChannelDefault = i % 128;
            if (i % 2 == 0) {
                String str17 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                throw null;
            }
            str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null) {
            int i18 = getInterfaceDescriptor + 13;
            INotificationSideChannelDefault = i18 % 128;
            int i19 = i18 % 2;
        } else {
            int i110 = getInterfaceDescriptor + 13;
            INotificationSideChannelDefault = i110 % 128;
            int i111 = i110 % 2;
        }
        asikAccountVerificationActivity.asInterface = str4;
        String str18 = asikAccountVerificationActivity.g;
        String str19 = asikAccountVerificationActivity.d;
        String str110 = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str111 = asikAccountVerificationActivity.f461a;
        String str112 = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb3 = new StringBuilder("Location from GPS: ");
        sb3.append(str18);
        sb3.append(", ");
        sb3.append(str19);
        sb3.append(", City: ");
        sb3.append(str110);
        sb3.append(", Province: ");
        sb3.append(str111);
        sb3.append(", Country: ");
        sb3.append(str112);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb3.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x0126  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikAccountVerificationActivity asikAccountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        String str3;
        User user;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        int i2 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i3 = INotificationSideChannelDefault + 29;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            asikAccountVerificationActivity.MediaBrowserCompat();
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                asikAccountVerificationActivity.IconCompatParcelizer();
                getCameraCharacteristic getcameracharacteristic = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (getcameracharacteristic == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getcameracharacteristic = null;
                }
                getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                String strJoinToString$default = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (strJoinToString$default == null) {
                    strJoinToString$default = "";
                }
                String str9 = asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = strJoinToString$default;
                if (!(!StringsKt.isBlank(str10)) || StringsKt.isBlank(str9) || StringsKt.equals(str9, "Indonesia", true)) {
                    if (StringsKt.isBlank(str10)) {
                        if (StringsKt.isBlank(str9)) {
                            str = "";
                        } else {
                            int i5 = INotificationSideChannelDefault + 121;
                            getInterfaceDescriptor = i5 % 128;
                            int i6 = i5 % 2;
                            str = str9;
                        }
                    }
                    IntegerRes integerRes = (IntegerRes) asikAccountVerificationActivity.onTransact.getValue();
                    str2 = asikAccountVerificationActivity.INotificationSideChannel;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    user = (User) asikAccountVerificationActivity.cancel.getValue();
                    if (user != null) {
                        int i7 = getInterfaceDescriptor + 83;
                        INotificationSideChannelDefault = i7 % 128;
                        int i8 = i7 % 2;
                        str4 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str4 = null;
                    }
                    String strValueOf = String.valueOf(str4);
                    String string = StringsKt.trim((CharSequence) String.valueOf(((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerifyPhoneAsik.getText())).toString();
                    str5 = asikAccountVerificationActivity.g;
                    if (str5 == null) {
                        str6 = "0.0";
                    } else {
                        str6 = str5;
                    }
                    str7 = asikAccountVerificationActivity.d;
                    if (str7 != null) {
                        i = getInterfaceDescriptor + 57;
                        INotificationSideChannelDefault = i % 128;
                        if (i % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        str8 = str7;
                    } else {
                        str8 = "0.0";
                    }
                    integerRes.TuitionPaymentFragmentbindingInflater1(new ChangePhoneNumberRequest(str3, strValueOf, string, "", str6, str8, str));
                    int i9 = INotificationSideChannelDefault + 113;
                    getInterfaceDescriptor = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    List listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str9});
                    ArrayList arrayList = new ArrayList();
                    int i11 = getInterfaceDescriptor + 97;
                    INotificationSideChannelDefault = i11 % 128;
                    int i12 = i11 % 2;
                    for (Object obj2 : listListOf) {
                        if (!StringsKt.isBlank((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                }
                str = strJoinToString$default;
                IntegerRes integerRes2 = (IntegerRes) asikAccountVerificationActivity.onTransact.getValue();
                str2 = asikAccountVerificationActivity.INotificationSideChannel;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str3 = null;
                } else {
                    str3 = str2;
                }
                user = (User) asikAccountVerificationActivity.cancel.getValue();
                if (user != null) {
                    int i13 = getInterfaceDescriptor + 83;
                    INotificationSideChannelDefault = i13 % 128;
                    int i14 = i13 % 2;
                    str4 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str4 = null;
                }
                String strValueOf2 = String.valueOf(str4);
                String string2 = StringsKt.trim((CharSequence) String.valueOf(((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerifyPhoneAsik.getText())).toString();
                str5 = asikAccountVerificationActivity.g;
                if (str5 == null) {
                    str6 = "0.0";
                } else {
                    str6 = str5;
                }
                str7 = asikAccountVerificationActivity.d;
                if (str7 != null) {
                    i = getInterfaceDescriptor + 57;
                    INotificationSideChannelDefault = i % 128;
                    if (i % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str8 = str7;
                } else {
                    str8 = "0.0";
                }
                integerRes2.TuitionPaymentFragmentbindingInflater1(new ChangePhoneNumberRequest(str3, strValueOf2, string2, "", str6, str8, str));
                int i15 = INotificationSideChannelDefault + 113;
                getInterfaceDescriptor = i15 % 128;
                int i16 = i15 % 2;
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                asikAccountVerificationActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikAccountVerificationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                ((ActivityAsikVerifyOtpFromPhoneBinding) ((ViewBinding) asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerifyPhoneAsik.getEditableText().clear();
            } else {
                asikAccountVerificationActivity.IconCompatParcelizer();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        forLanguageTags forlanguagetags;
        String str;
        final AsikAccountVerificationActivity asikAccountVerificationActivity = (AsikAccountVerificationActivity) objArr[0];
        ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding = (ActivityAsikVerifyOtpFromPhoneBinding) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[2]);
        try {
            int i2 = asikAccountVerificationActivity.TuitionPaymentFragmentbindingInflater1;
            if (i2 < 3) {
                int i3 = getInterfaceDescriptor + 49;
                INotificationSideChannelDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    asikAccountVerificationActivity.TuitionPaymentFragmentbindingInflater1 = 0;
                    forlanguagetags = (forLanguageTags) asikAccountVerificationActivity.asBinder.getValue();
                    str = asikAccountVerificationActivity.INotificationSideChannel;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str = null;
                    }
                } else {
                    asikAccountVerificationActivity.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
                    forlanguagetags = (forLanguageTags) asikAccountVerificationActivity.asBinder.getValue();
                    str = asikAccountVerificationActivity.INotificationSideChannel;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str = null;
                    }
                }
                forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ValidationOtpRequest(str, String.valueOf(activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.getText()), ""));
                int i4 = INotificationSideChannelDefault + 31;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            } else {
                Lazy lazy = LazyKt.lazy(new Function0() { // from class: AlertControllerRecycleListView
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        return (getStringOrNull) AsikAccountVerificationActivity.TuitionPaymentFragmentbindingInflater1(createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -493663024, objArr2, 493663026, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    }
                });
                getStringOrNull getstringornull = (getStringOrNull) lazy.getValue();
                FragmentManager supportFragmentManager = asikAccountVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornull.show(supportFragmentManager, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i6 = getInterfaceDescriptor + 57;
                    INotificationSideChannelDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 / 2;
                    }
                }
                ((getStringOrNull) lazy.getValue()).INotificationSideChannel = asikAccountVerificationActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            return null;
        } finally {
            ViewPortBuilder.b();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        AsikAccountVerificationActivity asikAccountVerificationActivity = (AsikAccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = asikAccountVerificationActivity.getString(R.string.label_information);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = asikAccountVerificationActivity.getString(R.string.label_exception_otp_verification);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = asikAccountVerificationActivity.getString(R.string.action_ok_back);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, string2, string3, null, 112);
        int i4 = getInterfaceDescriptor + 87;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getstringornullB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, AsikAccountVerificationActivity asikAccountVerificationActivity, View view) {
        IntegerRes integerRes;
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        String str2 = null;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.getEditableText().clear();
                integerRes = (IntegerRes) asikAccountVerificationActivity.onTransact.getValue();
                str = asikAccountVerificationActivity.INotificationSideChannel;
                int i4 = 34 / 0;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
            } else {
                activityAsikVerifyOtpFromPhoneBinding.otpVerifyPhoneAsik.getEditableText().clear();
                integerRes = (IntegerRes) asikAccountVerificationActivity.onTransact.getValue();
                str = asikAccountVerificationActivity.INotificationSideChannel;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
            }
            User user = (User) asikAccountVerificationActivity.cancel.getValue();
            if (user != null) {
                int i5 = getInterfaceDescriptor + 23;
                INotificationSideChannelDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    String str3 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    str2.hashCode();
                    throw null;
                }
                str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new PhoneVerificationRequest(String.valueOf(str2), str));
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(AsikAccountVerificationActivity asikAccountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        String str = null;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = getInterfaceDescriptor + 17;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 == 0) {
                asikAccountVerificationActivity.MediaBrowserCompat();
                str.hashCode();
                throw null;
            }
            asikAccountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            asikAccountVerificationActivity.IconCompatParcelizer();
            Intent intent = new Intent();
            String str2 = asikAccountVerificationActivity.INotificationSideChannel;
            if (str2 == null) {
                int i3 = getInterfaceDescriptor + 37;
                INotificationSideChannelDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str2;
            }
            intent.putExtra("KEY_PHONE_NUMBER", str);
            asikAccountVerificationActivity.setResult(-1, intent);
            asikAccountVerificationActivity.finish();
            int i4 = INotificationSideChannelDefault + 35;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            asikAccountVerificationActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikAccountVerificationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        } else {
            asikAccountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0091  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IOException {
        int i;
        AsikAccountVerificationActivity asikAccountVerificationActivity = (AsikAccountVerificationActivity) objArr[0];
        int i2 = 2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) asikAccountVerificationActivity.notify.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            int i3 = INotificationSideChannelDefault + 121;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 71 / 0;
                if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    asikAccountVerificationActivity.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                    asikAccountVerificationActivity.d = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControlExternalSyntheticLambda4B.b;
                    asikAccountVerificationActivity.f461a = camera2CameraControlExternalSyntheticLambda4B.g;
                    asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    asikAccountVerificationActivity.asInterface = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String str = asikAccountVerificationActivity.g;
                    String str2 = asikAccountVerificationActivity.d;
                    StringBuilder sb = new StringBuilder("Location from cache: ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(str2);
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
                } else {
                    asikAccountVerificationActivity.g = "0.0";
                    asikAccountVerificationActivity.d = "0.0";
                    ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
                    i = INotificationSideChannelDefault + 81;
                    getInterfaceDescriptor = i % 128;
                    if (i % 2 != 0) {
                        int i5 = 3 / 2;
                    }
                }
            } else if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                asikAccountVerificationActivity.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                asikAccountVerificationActivity.d = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControlExternalSyntheticLambda4B.b;
                asikAccountVerificationActivity.f461a = camera2CameraControlExternalSyntheticLambda4B.g;
                asikAccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                asikAccountVerificationActivity.asInterface = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str3 = asikAccountVerificationActivity.g;
                String str4 = asikAccountVerificationActivity.d;
                StringBuilder sb2 = new StringBuilder("Location from cache: ");
                sb2.append(str3);
                sb2.append(", ");
                sb2.append(str4);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2.toString(), new Object[0]);
            } else {
                asikAccountVerificationActivity.g = "0.0";
                asikAccountVerificationActivity.d = "0.0";
                ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
                i = INotificationSideChannelDefault + 81;
                getInterfaceDescriptor = i % 128;
                if (i % 2 != 0) {
                    int i6 = 3 / 2;
                }
            }
        } else {
            asikAccountVerificationActivity.g = "0.0";
            asikAccountVerificationActivity.d = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop4 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            i = INotificationSideChannelDefault + 81;
            getInterfaceDescriptor = i % 128;
            if (i % 2 != 0) {
                int i7 = 3 / 2;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AsikAccountVerificationActivity asikAccountVerificationActivity, ActivityAsikVerifyOtpFromPhoneBinding activityAsikVerifyOtpFromPhoneBinding, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -695655643, new Object[]{asikAccountVerificationActivity, activityAsikVerifyOtpFromPhoneBinding, view}, 695655646, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentbindingInflater1(AsikAccountVerificationActivity asikAccountVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (getStringOrNull) TuitionPaymentFragmentbindingInflater1(createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -493663024, new Object[]{asikAccountVerificationActivity}, 493663026, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikAccountVerificationActivity asikAccountVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1598454962, new Object[]{asikAccountVerificationActivity}, 1598454966, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        RemoteActionCompatParcelizer = 0;
        d();
        new b(null);
        int i = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikVerifyOtpFromPhoneBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) TuitionPaymentFragmentbindingInflater1(collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1122553738, new Object[]{this}, -1122553737, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_bank_name).substring(1, 2).codePointAt(0) - 418166958, collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 47;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return R.layout.activity_asik_verify_otp_from_phone;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_expiration_message).substring(3, 4).codePointAt(0) + 185915454, 598724026, new Object[]{this}, -598724026, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1020845462);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onCreate(bundle);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 35;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = INotificationSideChannelDefault + 3;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannelDefault + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        cancelAll = new char[]{60050, 60045, 60072, 60051, 60049, 60053, 60055, 60062, 60058, 60088, 60047, 60054, 60073, 60083, 60041, 60056, 60034, 60117, 60043, 60060, 60048, 60057, 60052, 60063, 60040};
        INotificationSideChannelStub = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = r6 + 113
            byte[] r1 = com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity.$$i(short, int, byte):java.lang.String");
    }
}
