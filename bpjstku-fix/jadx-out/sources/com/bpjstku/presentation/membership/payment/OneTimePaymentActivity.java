package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.model.request.InsertVasTxPaymentRequest;
import com.bpjstku.data.payment.model.response.OneTimePaymentResponse;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityOneTimePaymentBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.OneTimePaymentActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.internal.MultiViewUpdateListener;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2InteropExtender;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.InputConfigurationCompat;
import defpackage.ListPopupWindow2;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.createButton;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.layoutHorizontal;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCameraAvailable;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setSessionStateCallback;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0012\u001a\u00020\u00108BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0015\u0010\u0006\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0011R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001cR\u0015\u0010\u000b\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0017\u0010\r\u001a\u0004\u0018\u00010\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/OneTimePaymentActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityOneTimePaymentBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "onTransact", "asBinder", "", "g", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LInputConfigurationCompat;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "d", "TuitionPaymentFragmentbindingInflater1", "LListPopupWindow2;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;", "Lcom/bpjstku/domain/registration/general/model/Registration;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OneTimePaymentActivity extends BindingBaseActivity<ActivityOneTimePaymentBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f529a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy a;
    private static final byte[] $$a = {89, 107, -36, -112, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 117;
    private static int INotificationSideChannel = 0;
    private static int cancelAll = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new layoutHorizontal(this));

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String b = ExifInterface.GPS_DIRECTION_TRUE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: setBaselineAligned
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final Lazy g = LazyKt.lazy(new Function0() { // from class: setDividerPadding
        private static short[] g;
        private static final byte[] $$c = {117, -15, -81, 1};
        private static final int $$d = 36;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {114, -115, 48, 84, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 244;
        private static int asInterface = 0;
        private static int d = 1;
        private static int b = 1254716777;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795601;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 969516989;
        private static byte[] TuitionPaymentFragmentbindingInflater1 = {40, 26, -11, 23, -32, 25, -54, -13, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, 47, -17, 30, -61, Base64.padSymbol, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -23, 24, 63, -17, 30, -61, Base64.padSymbol, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, -11, 39, 27, -92, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, 90, -22, -32, 19, -32, 53, 23, -94, 47, 31, -20, -25, 28, -26, 20, -11, 27, -25, -47, 47, 31, 25, -26, -37, 93, -19, 29, -29, -36, 42, 9, -23, -48, 94, 34, 31, -20, -25, 28, -26, 20, -11, 27, -25, -48, 89, 27};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = defpackage.setDividerPadding.$$a
                int r9 = r9 + 4
                int r8 = r8 * 14
                int r8 = r8 + 84
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r9
                r4 = r2
                goto L2b
            L12:
                r3 = r2
            L13:
                r6 = r9
                r9 = r8
                r8 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2b:
                int r9 = r9 + 1
                int r3 = r3 + r8
                int r8 = r3 + (-11)
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.setDividerPadding.c(int, short, short, java.lang.Object[]):void");
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = d + 53;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Registration registrationTuitionPaymentFragmentbindingInflater1 = OneTimePaymentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i4 = asInterface + 3;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return registrationTuitionPaymentFragmentbindingInflater1;
        }

        private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            boolean z;
            int i5 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                char c = 3;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int iArgb = Color.argb(0, 0, 0, 0) + 2267;
                    int packedPositionType2 = 33 - ExpandableListView.getPackedPositionType(0L);
                    byte b3 = (byte) (-$$c[3]);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iArgb, packedPositionType2, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                if (z2) {
                    byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = 0;
                        while (i6 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int iLastIndexOf = 3357 - TextUtils.lastIndexOf("", '0');
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18;
                                byte[] bArr3 = $$c;
                                byte b5 = (byte) (-bArr3[c]);
                                byte length2 = (byte) bArr3.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iLastIndexOf, maximumFlingVelocity, -1054011043, false, $$e(b5, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i6++;
                            c = 3;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cBlue = (char) Color.blue(0);
                            int iIndexOf = 2267 - TextUtils.indexOf("", "");
                            int i7 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte b6 = (byte) (-$$c[3]);
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, iIndexOf, i7, 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                        j = 3046761265686732006L;
                    } else {
                        j = 3046761265686732006L;
                        iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    }
                } else {
                    j = 3046761265686732006L;
                }
                if (iIntValue > 0) {
                    int i8 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ j));
                    if (!z2) {
                        i4 = 0;
                    } else {
                        int i9 = $11 + 13;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        i4 = 1;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i8 + i4;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 55903);
                        int doubleTapTimeout = 2855 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int defaultSize = 13 - View.getDefaultSize(0, 0);
                        byte b8 = $$c[3];
                        byte b9 = (byte) (-b8);
                        byte b10 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, doubleTapTimeout, defaultSize, -1529949196, false, $$e(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentbindingInflater1;
                    if (bArr5 != null) {
                        int length3 = bArr5.length;
                        byte[] bArr6 = new byte[length3];
                        int i11 = $10 + 9;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        for (int i13 = 0; i13 < length3; i13++) {
                            bArr6[i13] = (byte) (((long) bArr5[i13]) ^ 3046761265686732006L);
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i14 = $10 + 47;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            byte[] bArr7 = TuitionPaymentFragmentbindingInflater1;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = g;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                            int i18 = $10 + 89;
                            $11 = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x0964 A[PHI: r33
  0x0964: PHI (r33v4 ??) = (r33v3 ??), (r33v6 ??), (r33v7 ??) binds: [B:103:0x0962, B:132:0x0964, B:96:0x0955] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:107:0x0999  */
        /* JADX WARN: Code duplicated, block: B:125:0x0b23  */
        /* JADX WARN: Code duplicated, block: B:142:0x0430 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x0417  */
        /* JADX WARN: Code duplicated, block: B:35:0x041d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0428  */
        /* JADX WARN: Code duplicated, block: B:42:0x0436  */
        /* JADX WARN: Code duplicated, block: B:44:0x0444 A[Catch: Exception -> 0x0962, TRY_ENTER, TryCatch #5 {Exception -> 0x0962, blocks: (B:39:0x0430, B:44:0x0444, B:48:0x04cc, B:52:0x0523, B:58:0x05e8, B:60:0x0627, B:66:0x06a9, B:59:0x05fe, B:53:0x0537, B:45:0x044f), top: B:142:0x0430 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x044f A[Catch: Exception -> 0x0962, TRY_LEAVE, TryCatch #5 {Exception -> 0x0962, blocks: (B:39:0x0430, B:44:0x0444, B:48:0x04cc, B:52:0x0523, B:58:0x05e8, B:60:0x0627, B:66:0x06a9, B:59:0x05fe, B:53:0x0537, B:45:0x044f), top: B:142:0x0430 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0519  */
        /* JADX WARN: Code duplicated, block: B:53:0x0537 A[Catch: Exception -> 0x0962, TRY_LEAVE, TryCatch #5 {Exception -> 0x0962, blocks: (B:39:0x0430, B:44:0x0444, B:48:0x04cc, B:52:0x0523, B:58:0x05e8, B:60:0x0627, B:66:0x06a9, B:59:0x05fe, B:53:0x0537, B:45:0x044f), top: B:142:0x0430 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x05d9  */
        /* JADX WARN: Code duplicated, block: B:59:0x05fe A[Catch: Exception -> 0x0962, TryCatch #5 {Exception -> 0x0962, blocks: (B:39:0x0430, B:44:0x0444, B:48:0x04cc, B:52:0x0523, B:58:0x05e8, B:60:0x0627, B:66:0x06a9, B:59:0x05fe, B:53:0x0537, B:45:0x044f), top: B:142:0x0430 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0656 A[Catch: all -> 0x0735, TryCatch #0 {all -> 0x0735, blocks: (B:61:0x0649, B:63:0x0656, B:64:0x0698), top: B:133:0x0649, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0740 A[Catch: Exception -> 0x0964, TRY_LEAVE, TryCatch #4 {Exception -> 0x0964, blocks: (B:70:0x0738, B:72:0x073e, B:73:0x073f, B:74:0x0740, B:77:0x07cc, B:83:0x082e, B:85:0x085c, B:88:0x089a, B:90:0x08d0, B:95:0x0951, B:99:0x095a, B:101:0x0960, B:102:0x0961, B:89:0x08a7, B:84:0x0846, B:78:0x07ef, B:61:0x0649, B:63:0x0656, B:64:0x0698, B:91:0x08fe, B:93:0x090b, B:94:0x094a), top: B:141:0x0434, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x07cc A[Catch: Exception -> 0x0964, TRY_ENTER, TryCatch #4 {Exception -> 0x0964, blocks: (B:70:0x0738, B:72:0x073e, B:73:0x073f, B:74:0x0740, B:77:0x07cc, B:83:0x082e, B:85:0x085c, B:88:0x089a, B:90:0x08d0, B:95:0x0951, B:99:0x095a, B:101:0x0960, B:102:0x0961, B:89:0x08a7, B:84:0x0846, B:78:0x07ef, B:61:0x0649, B:63:0x0656, B:64:0x0698, B:91:0x08fe, B:93:0x090b, B:94:0x094a), top: B:141:0x0434, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x07ef A[Catch: Exception -> 0x0964, TRY_LEAVE, TryCatch #4 {Exception -> 0x0964, blocks: (B:70:0x0738, B:72:0x073e, B:73:0x073f, B:74:0x0740, B:77:0x07cc, B:83:0x082e, B:85:0x085c, B:88:0x089a, B:90:0x08d0, B:95:0x0951, B:99:0x095a, B:101:0x0960, B:102:0x0961, B:89:0x08a7, B:84:0x0846, B:78:0x07ef, B:61:0x0649, B:63:0x0656, B:64:0x0698, B:91:0x08fe, B:93:0x090b, B:94:0x094a), top: B:141:0x0434, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0825  */
        /* JADX WARN: Code duplicated, block: B:84:0x0846 A[Catch: Exception -> 0x0964, TryCatch #4 {Exception -> 0x0964, blocks: (B:70:0x0738, B:72:0x073e, B:73:0x073f, B:74:0x0740, B:77:0x07cc, B:83:0x082e, B:85:0x085c, B:88:0x089a, B:90:0x08d0, B:95:0x0951, B:99:0x095a, B:101:0x0960, B:102:0x0961, B:89:0x08a7, B:84:0x0846, B:78:0x07ef, B:61:0x0649, B:63:0x0656, B:64:0x0698, B:91:0x08fe, B:93:0x090b, B:94:0x094a), top: B:141:0x0434, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x089a A[Catch: Exception -> 0x0964, TRY_ENTER, TryCatch #4 {Exception -> 0x0964, blocks: (B:70:0x0738, B:72:0x073e, B:73:0x073f, B:74:0x0740, B:77:0x07cc, B:83:0x082e, B:85:0x085c, B:88:0x089a, B:90:0x08d0, B:95:0x0951, B:99:0x095a, B:101:0x0960, B:102:0x0961, B:89:0x08a7, B:84:0x0846, B:78:0x07ef, B:61:0x0649, B:63:0x0656, B:64:0x0698, B:91:0x08fe, B:93:0x090b, B:94:0x094a), top: B:141:0x0434, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x08a7 A[Catch: Exception -> 0x0964, TryCatch #4 {Exception -> 0x0964, blocks: (B:70:0x0738, B:72:0x073e, B:73:0x073f, B:74:0x0740, B:77:0x07cc, B:83:0x082e, B:85:0x085c, B:88:0x089a, B:90:0x08d0, B:95:0x0951, B:99:0x095a, B:101:0x0960, B:102:0x0961, B:89:0x08a7, B:84:0x0846, B:78:0x07ef, B:61:0x0649, B:63:0x0656, B:64:0x0698, B:91:0x08fe, B:93:0x090b, B:94:0x094a), top: B:141:0x0434, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:93:0x090b A[Catch: all -> 0x0959, TryCatch #3 {all -> 0x0959, blocks: (B:91:0x08fe, B:93:0x090b, B:94:0x094a), top: B:139:0x08fe, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:97:0x0957  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r33v0, types: [android.content.Context, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r33v1 */
        /* JADX WARN: Type inference failed for: r33v10 */
        /* JADX WARN: Type inference failed for: r33v11 */
        /* JADX WARN: Type inference failed for: r33v12 */
        /* JADX WARN: Type inference failed for: r33v2 */
        /* JADX WARN: Type inference failed for: r33v3 */
        /* JADX WARN: Type inference failed for: r33v4 */
        /* JADX WARN: Type inference failed for: r33v5 */
        /* JADX WARN: Type inference failed for: r33v6 */
        /* JADX WARN: Type inference failed for: r33v7 */
        /* JADX WARN: Type inference failed for: r33v9 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r4v4 */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            ?? r33;
            int i7;
            int i8;
            Object[] objArr;
            int i9;
            int i10;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i11;
            int i12;
            int i13;
            ?? r34;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            short windowTouchSlop;
            byte b2;
            int i19;
            int i20;
            String str;
            int jumpTapTimeout;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i29;
            int i30;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i31;
            int offsetBefore;
            int i32;
            int keyRepeatDelay;
            int i33;
            byte b3;
            int i34;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i41 = 2 % 2;
            if (context != 0) {
                int i42 = asInterface + 19;
                int i43 = i42 % 128;
                d = i43;
                int i44 = i42 % 2;
                int i45 = (i43 & 73) + (i43 | 73);
                asInterface = i45 % 128;
                int i46 = i45 % 2;
                try {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i47 = iIndexOf * 221;
                    int i48 = (i47 & 761443075) + (i47 | 761443075);
                    int i49 = ~((~iIndexOf) | (-1251673352));
                    int i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i51 = i50 | iIndexOf;
                    int i52 = ~((i51 ^ 1251673351) | (i51 & 1251673351));
                    int i53 = ((i49 ^ i52) | (i52 & i49)) * 220;
                    int i54 = ((((i48 | i53) << 1) - (i48 ^ i53)) - (~(-(-(((~((i50 & 1251673351) | (i50 ^ 1251673351))) | iIndexOf) * (-440)))))) - 1;
                    int i55 = (iIndexOf ^ 1251673351) | (iIndexOf & 1251673351);
                    int i56 = (i54 - (~(-(-(((i55 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i55 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * 220))))) - 1;
                    int i57 = -ExpandableListView.getPackedPositionType(0L);
                    int i58 = ~i;
                    int i59 = ~(73 | i58);
                    int i60 = ~((73 ^ i57) | (73 & i57));
                    int i61 = (((i57 * (-244)) - 18204) - (~(-(-(((i59 ^ i60) | (i59 & i60)) * (-245)))))) - 1;
                    int i62 = -(-((~(73 | i)) * (-245)));
                    int i63 = (i61 & i62) + (i61 | i62);
                    int i64 = (i57 | (~(73 | i))) * 245;
                    int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                    short sIndexOf = (short) TextUtils.indexOf("", "");
                    byte b4 = (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iResolveSize = View.resolveSize(0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i66 = d + 123;
                    asInterface = i66 % 128;
                    int i67 = i66 % 2;
                    int i68 = ~(((-966514290) ^ iResolveSize) | ((-966514290) & iResolveSize));
                    int i69 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i70 = (((iResolveSize * (-711)) - (-1929920697)) - (~(-(-(((~((i69 & iResolveSize) | (i69 ^ iResolveSize))) | i68) * (-712)))))) - 1;
                    int i71 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i72 = ((-966514290) ^ i71) | ((-966514290) & i71);
                    int i73 = ~((i72 ^ iResolveSize) | (i72 & iResolveSize));
                    int i74 = ~(iResolveSize | 966514289 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i75 = ((i70 - (~(-(-(((i73 ^ i74) | (i74 & i73)) * (-712)))))) - 1) + (((~((i71 & iResolveSize) | (i71 ^ iResolveSize))) | (-966514290)) * 712);
                    Object[] objArr3 = new Object[1];
                    a(i56, i65, sIndexOf, b4, i75, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    int i76 = -TextUtils.getOffsetAfter("", 0);
                    int i77 = (i76 ^ 1251673356) + ((i76 & 1251673356) << 1);
                    int i78 = asInterface + 95;
                    d = i78 % 128;
                    int i79 = i78 % 2;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr4 = new Object[1];
                    a(i77, (packedPositionGroup & (-74)) + (packedPositionGroup | (-74)), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.normalizeMetaState(0) + 966514312, objArr4);
                    Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                    int i80 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i81 = ((i80 | 1251673350) << 1) - (i80 ^ 1251673350);
                    int i82 = -View.getDefaultSize(0, 0);
                    int i83 = (i82 ^ (-74)) + ((i82 & (-74)) << 1);
                    short sMakeMeasureSpec = (short) View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte bIndexOf = (byte) TextUtils.indexOf("", "", 0, 0);
                    int i84 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    int i85 = i84 * (-1939);
                    int i86 = (i58 ^ 966514330) | (i58 & 966514330);
                    int i87 = (((i85 & (-2112423394)) + (i85 | (-2112423394))) - (~(-(-(((~(((-966514331) & i84) | ((-966514331) ^ i84))) | (~i86)) * (-970)))))) - 1;
                    int i88 = ~i84;
                    int i89 = i87 + ((~((i88 ^ 966514330) | (966514330 & i88))) * 1940);
                    int i90 = ~((i88 & (-966514331)) | (i88 ^ (-966514331)));
                    int i91 = ~i86;
                    int i92 = i89 + (((i90 & i91) | (i90 ^ i91)) * 970);
                    Object[] objArr5 = new Object[1];
                    a(i81, i83, sMakeMeasureSpec, bIndexOf, i92, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    int i93 = -TextUtils.indexOf("", "");
                    int i94 = d + 33;
                    asInterface = i94 % 128;
                    int i95 = i94 % 2;
                    int i96 = (i93 * (-515)) - 1424937161;
                    int i97 = ~(((-1251673356) & i) | ((-1251673356) ^ i));
                    int i98 = ~i;
                    int i99 = ~((i98 ^ i93) | (i98 & i93));
                    int i100 = (i97 & i99) | (i97 ^ i99);
                    int i101 = ~(i98 | 1251673355);
                    int i102 = -(-(((i100 & i101) | (i100 ^ i101)) * (-516)));
                    int i103 = (i96 & i102) + (i96 | i102);
                    int i104 = ~i93;
                    int i105 = ~(((-1251673356) & i104) | (i104 ^ (-1251673356)) | i);
                    int i106 = (i104 ^ i58) | (i104 & i58);
                    int i107 = ~((i106 & 1251673355) | (i106 ^ 1251673355));
                    int i108 = -(-(((i105 & i107) | (i105 ^ i107)) * 516));
                    int i109 = (i103 ^ i108) + ((i108 & i103) << 1);
                    int i110 = ~((i104 & 1251673355) | (i104 ^ 1251673355));
                    int i111 = ~(i58 | 1251673355);
                    int i112 = ((i110 & i111) | (i110 ^ i111)) * 516;
                    int i113 = (i109 ^ i112) + ((i112 & i109) << 1);
                    int i114 = (-75) - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                    int iRgb = Color.rgb(0, 0, 0);
                    int i115 = iRgb * (-721);
                    int i116 = (i115 & 788529152) + (i115 | 788529152);
                    int i117 = ~iRgb;
                    int i118 = ~((i117 & (-16777217)) | (i117 ^ (-16777217)));
                    int i119 = (i118 & i58) | (i58 ^ i118);
                    int i120 = ~(iRgb | 16777216);
                    int i121 = -(-(((i119 & i120) | (i119 ^ i120)) * 1444));
                    int i122 = ((i116 | i121) << 1) - (i121 ^ i116);
                    int i123 = (~((iRgb ^ 16777216) | (iRgb & 16777216))) | (~(iRgb | i));
                    int i124 = ~((i ^ 16777216) | (i & 16777216));
                    int i125 = i122 + (((i123 & i124) | (i123 ^ i124)) * (-1444));
                    int i126 = ~iRgb;
                    int i127 = ~((i126 & 16777216) | (i126 ^ 16777216));
                    int i128 = d + 19;
                    asInterface = i128 % 128;
                    int i129 = i128 % 2;
                    int i130 = ~((iRgb & (-16777217)) | ((-16777217) ^ iRgb));
                    int i131 = 722 * ((i130 & i127) | (i127 ^ i130));
                    short s = (short) (((i125 | i131) << 1) - (i131 ^ i125));
                    byte b5 = (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int i132 = (maximumDrawingCacheSize & 966514364) + (maximumDrawingCacheSize | 966514364);
                    Object[] objArr6 = new Object[1];
                    a(i113, i114, s, b5, i132, objArr6);
                    int i133 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                    int i134 = -i133;
                    int i135 = ((i133 & i134) | (i133 ^ i134)) >> 31;
                    int i136 = (~i135) & i;
                    int i137 = i135 & (i ^ 1);
                    i4 = (i137 & i136) | (i136 ^ i137);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char defaultSize = (char) (16949 - View.getDefaultSize(0, 0));
                    int gidForName = 2738 - Process.getGidForName("");
                    int i138 = 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b6 = (byte) ($$b & 63);
                    byte b7 = $$a[7];
                    Object[] objArr7 = new Object[1];
                    c(b6, b7, b7, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, gidForName, i138, 1501733736, false, (String) objArr7[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char fadingEdgeLength = (char) (16949 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int size = 2739 - View.MeasureSpec.getSize(0);
                    int edgeSlop = 13 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b8 = (byte) ($$b & 63);
                    byte b9 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(b8, b9, (short) (b9 | 52), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, size, edgeSlop, 47863026, false, (String) objArr8[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 16949);
                        int iIndexOf2 = 2739 - TextUtils.indexOf("", "");
                        int iIndexOf3 = 13 - TextUtils.indexOf("", "", 0, 0);
                        byte b10 = $$a[7];
                        Object[] objArr9 = new Object[1];
                        c((byte) 37, b10, (short) (b10 | 104), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout2, iIndexOf2, iIndexOf3, 631063962, false, (String) objArr9[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i139 = d;
                            i31 = (i139 & 121) + (i139 | 121);
                            asInterface = i31 % 128;
                            if (i31 % 2 != 0) {
                                offsetBefore = TextUtils.getOffsetBefore("", 0);
                                i32 = (141 % offsetBefore) >> 4095;
                            } else {
                                offsetBefore = TextUtils.getOffsetBefore("", 0);
                                i32 = (offsetBefore * 141) - (-2111070436);
                            }
                            int i140 = ~offsetBefore;
                            int i141 = ~((i140 & 1251673300) | (i140 ^ 1251673300));
                            int i142 = ~offsetBefore;
                            int i143 = ~((i142 ^ i) | (i142 & i));
                            int i144 = i32 + ((-280) * ((i141 & i143) | (i141 ^ i143)));
                            int i145 = ~offsetBefore;
                            int i146 = -(-(((~((i145 ^ i) | (i145 & i))) | (~(((-1251673301) ^ i) | ((-1251673301) & i)))) * 140));
                            int i147 = ((i144 | i146) << 1) - (i144 ^ i146);
                            int i148 = d;
                            int i149 = (i148 & 115) + (i148 | 115);
                            asInterface = i149 % 128;
                            int i150 = i149 % 2;
                            int i151 = ~((i142 ^ (-1251673301)) | (i142 & (-1251673301)) | i);
                            int i152 = ~i;
                            int i153 = (i145 & i152) | (i145 ^ i152);
                            int i154 = ~((i153 & 1251673300) | (i153 ^ 1251673300));
                            int i155 = (i151 & i154) | (i151 ^ i154);
                            int i156 = (-1251673301) | i152;
                            int i157 = ~((offsetBefore & i156) | (i156 ^ offsetBefore));
                            MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i158 = -(-(140 * ((i157 & i155) | (i155 ^ i157))));
                            int i159 = ((i147 | i158) << 1) - (i147 ^ i158);
                            int i160 = (-76) - (~(-TextUtils.lastIndexOf("", '0', 0)));
                            int i161 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i162 = 609 - (~(-(-(i161 * 306))));
                            int i163 = ((i162 | (-306)) << 1) - (i162 ^ (-306));
                            int i164 = ~((~i161) | i161);
                            int i165 = ~(i161 | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                            int i166 = i163 + (((i164 & i165) | (i164 ^ i165)) * 305);
                            int i167 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i168 = -(-((~((i161 & i167) | (i167 ^ i161))) * 305));
                            short s2 = (short) (((i166 | i168) << 1) - (i168 ^ i166));
                            keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
                            i33 = asInterface + 81;
                            d = i33 % 128;
                            if (i33 % 2 == 0) {
                                b3 = (byte) (((keyRepeatDelay | 20) << 1) - (keyRepeatDelay ^ 20));
                                i34 = -(TypedValue.complexToFraction(0, 0.0f, 2.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 2.0f) == 2.0f ? 0 : -1));
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i35 = ((-743) >> i34) >> (-743);
                            } else {
                                b3 = (byte) (keyRepeatDelay >> 16);
                                i34 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i169 = i34 * (-743);
                                i35 = (i169 | (-860637735)) + (i169 & (-860637735));
                            }
                            byte b11 = b3;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i171 = ~(((-1867537724) & i170) | ((-1867537724) ^ i170));
                            int i172 = (i171 ^ 1765806096) | (i171 & 1765806096);
                            int i173 = ~((i170 ^ 113004527) | (i170 & 113004527));
                            int i174 = ((i173 & i172) | (i172 ^ i173)) * (-397);
                            int i175 = ((-1549448186) ^ i174) + ((i174 & (-1549448186)) << 1);
                            int i176 = (i175 & (-945350864)) + ((-945350864) | i175);
                            int i177 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 1765806096) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 1765806096) | 11272900) * 397;
                            i36 = ((i176 | i177) << 1) - (i177 ^ i176);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i178 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i179 = (~((i178 ^ 1522594522) | (1522594522 & i178))) * (-560);
                            int i180 = (((-1263432267) | i179) << 1) - ((-1263432267) ^ i179);
                            int i181 = (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault9 | 2079915742)) * (-560);
                            i37 = ((i180 | i181) << 1) - (i180 ^ i181);
                            i38 = ~((i178 ^ (-2075709013)) | ((-2075709013) & i178));
                            if (i36 <= i37 + (((1518387792 ^ i38) | (i38 & 1518387792)) * 560)) {
                                int i182 = ~(i34 | 966514369);
                                int i183 = ~(i34 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                i39 = i35 >>> ((-744) / (((i182 ^ i183) | (i182 & i183)) | (~(966514369 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4))));
                                int i184 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i185 = ~i34;
                                int i186 = ~((i185 ^ (-966514370)) | (i185 & (-966514370)));
                                i40 = 744 / ((i184 & i186) | (i184 ^ i186));
                            } else {
                                i39 = (i35 - (~((-744) * (((~(i34 | 966514369)) | (~((i34 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i34 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) | (~((966514369 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (966514369 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4))))))) - 1;
                                int i187 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i188 = ~i34;
                                int i189 = ~((i188 ^ (-966514370)) | (i188 & (-966514370)));
                                i40 = ((i187 & i189) | (i187 ^ i189)) * 744;
                            }
                            int i190 = (i39 - (~(-(-i40)))) - 1;
                            int i191 = (i34 & 966514369) | (i34 ^ 966514369);
                            int i192 = ((i191 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i191 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 744;
                            int i193 = ((i190 | i192) << 1) - (i190 ^ i192);
                            Object[] objArr10 = new Object[1];
                            a(i159, i160, s2, b11, i193, objArr10);
                            Object[] objArr11 = {(String) objArr10[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                                byte[] bArr = $$a;
                                byte b12 = bArr[7];
                                byte b13 = bArr[132];
                                Object[] objArr12 = new Object[1];
                                c(b12, b13, (short) (b13 | 140), objArr12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, minimumFlingVelocity, scrollBarFadeDuration, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                            long j = 1753955584;
                            long j2 = -919;
                            long j3 = (j2 * j) + (j2 * jLongValue);
                            long j4 = 920;
                            r34 = i4;
                            long j5 = -1;
                            long j6 = j ^ j5;
                            long j7 = jLongValue ^ j5;
                            long j8 = j6 | j7;
                            long jNextInt = new Random().nextInt();
                            long j9 = jNextInt ^ j5;
                            long j10 = ((long) (-1954873821)) + j3 + ((((j8 | jNextInt) ^ j5) | (((j7 | j9) | j) ^ j5)) * j4) + (((j8 ^ j5) | ((j6 | j9) ^ j5)) * j4) + (j4 * ((j5 ^ ((j7 | j) | jNextInt)) | ((j8 | j9) ^ j5) | (((j6 | jLongValue) | jNextInt) ^ j5)));
                            int i194 = ((int) (j10 >> 32)) & ((-830121054) + (((~((-276933206) | i)) | 1714159616) * (-756)) + (((-276933206) | i152) * 756));
                            int i195 = ((int) j10) & ((-1704616964) + (((~((-96148390) | i)) | 95099396) * 305) + (((~((-96148390) | i152)) | 1341078020) * 305));
                            i13 = (i194 & i195) | (i194 ^ i195);
                        } else {
                            context = i4;
                            int i196 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i197 = i196 * 1773;
                            int i198 = (i197 ^ 370690983) + ((i197 & 370690983) << 1);
                            int i199 = ~((~i196) | (-1251673302));
                            int i200 = ~(((-1251673302) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-1251673302) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                            int i201 = (i199 & i200) | (i199 ^ i200);
                            int i202 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                            int i203 = i202 | i196;
                            int i204 = ~((i203 & 1251673301) | (i203 ^ 1251673301));
                            int i205 = ((i201 & i204) | (i201 ^ i204)) * 886;
                            int i206 = ((i198 | i205) << 1) - (i205 ^ i198);
                            int i207 = ~((i202 ^ 1251673301) | (i202 & 1251673301));
                            i17 = ((i206 + (((i207 & i196) | (i196 ^ i207)) * (-1772))) - (~((~((i196 & i202) | (i202 ^ i196))) * 886))) - 1;
                            i18 = (-76) - (~(-ExpandableListView.getPackedPositionChild(0L)));
                            windowTouchSlop = (short) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            b2 = (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                            i19 = 966514396 - (~View.MeasureSpec.makeMeasureSpec(0, 0));
                            i20 = d + 27;
                            asInterface = i20 % 128;
                            if (i20 % 2 != 0) {
                                Object[] objArr13 = new Object[1];
                                a(i17, i18, windowTouchSlop, b2, i19, objArr13);
                                str = (String) objArr13[0];
                                int jumpTapTimeout3 = ViewConfiguration.getJumpTapTimeout();
                                jumpTapTimeout = (jumpTapTimeout3 ^ (-123)) + ((jumpTapTimeout3 & (-123)) << 1);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i22 = ((-109) % jumpTapTimeout) >>> 111;
                                i23 = ~jumpTapTimeout;
                                i21 = 1;
                            } else {
                                Object[] objArr14 = new Object[1];
                                a(i17, i18, windowTouchSlop, b2, i19, objArr14);
                                str = (String) objArr14[0];
                                jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i208 = jumpTapTimeout * (-109);
                                i21 = 1;
                                i22 = ((i208 & 1496790265) << 1) + (i208 ^ 1496790265);
                                i23 = ~jumpTapTimeout;
                            }
                            int i209 = d;
                            i24 = (i209 ^ 95) + ((i209 & 95) << i21);
                            asInterface = i24 % 128;
                            if (i24 % 2 != 0) {
                                int i210 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 1251673367) | (1251673367 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                int i211 = ~i210;
                                int i212 = ~((jumpTapTimeout ^ 1251673367) | (jumpTapTimeout & 1251673367));
                                int i213 = ~i210;
                                i25 = (i22 >>> ((-220) % ((i23 & i211) | (i23 ^ i211)))) * (219 - (~(-((i213 & i212) | (i212 ^ i213)))));
                                int i214 = ~jumpTapTimeout;
                                i26 = (i214 & 1251673367) | (i214 ^ 1251673367);
                            } else {
                                int i215 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 1251673367) | (1251673367 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                int i216 = (-220) * (i23 | (~i215));
                                i25 = (i22 & i216) + (i22 | i216) + (((~i215) | (~(jumpTapTimeout | 1251673367))) * 220);
                                i26 = (~jumpTapTimeout) | 1251673367;
                            }
                            int i217 = ~i26;
                            int i218 = ~(jumpTapTimeout | (-1251673368));
                            int i219 = i25 + (110 * ((i217 & i218) | (i217 ^ i218)));
                            int i220 = (-76) - (~(-TextUtils.lastIndexOf("", '0')));
                            short s3 = (short) (47 - (~(-AndroidCharacter.getMirror('0'))));
                            byte bCombineMeasuredStates = (byte) View.combineMeasuredStates(0, 0);
                            i27 = -Process.getGidForName("");
                            int i221 = asInterface;
                            i28 = (i221 ^ 65) + ((i221 & 65) << 1);
                            d = i28 % 128;
                            if (i28 % 2 == 0) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i30 = ((-966514398) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-966514398) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                i29 = 0;
                            } else {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i222 = i27 * (-300);
                                int i223 = (i222 & (-170428234)) + (i222 | (-170428234));
                                int i224 = (966514397 & i27) | (i27 ^ 966514397);
                                i29 = (i223 - (~(-(-((~((i224 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i224 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-301)))))) - 1;
                                i30 = ((-966514398) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-966514398) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                            int i225 = ~i30;
                            int i226 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i227 = ~((i226 & i27) | (i226 ^ i27));
                            int i228 = ~i27;
                            int i229 = ~((i228 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i228 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            Object[] objArr15 = new Object[1];
                            a(i219, i220, s3, bCombineMeasuredStates, ((i29 + ((-301) * ((i225 & i227) | (i225 ^ i227)))) - (~(((i229 & (-966514398)) | ((-966514398) ^ i229)) * 301))) - 1, objArr15);
                            objArr2 = new Object[]{(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 33602);
                                int defaultSize2 = View.getDefaultSize(0, 0) + 3085;
                                int trimmedLength2 = TextUtils.getTrimmedLength("") + 26;
                                byte[] bArr2 = $$a;
                                byte b14 = bArr2[7];
                                byte b15 = bArr2[132];
                                Object[] objArr16 = new Object[1];
                                c(b14, b15, (short) (b15 | 140), objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, defaultSize2, trimmedLength2, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                i13 = 1;
                                r34 = context;
                            } else {
                                i13 = 0;
                                r34 = context;
                            }
                        }
                        int i230 = -i13;
                        int i231 = ((i13 & i230) | (i13 ^ i230)) >> 31;
                        int i232 = (~i231) & i;
                        int i233 = i231 & (i ^ 10);
                        int i234 = (i233 & i232) | (i232 ^ i233);
                        int i235 = d;
                        int i236 = (i235 ^ 49) + ((i235 & 49) << 1);
                        int i237 = i236 % 128;
                        asInterface = i237;
                        int i238 = i236 % 2;
                        int i239 = i2 & 32;
                        i14 = (i239 | (-i239)) >> 31;
                        i15 = i234 & (~i14);
                        i16 = (i237 & 5) + (i237 | 5);
                        d = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        int i240 = i & i14;
                        i6 = (i15 & i240) | (i15 ^ i240);
                        r33 = r34;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i5 = asInterface + 81;
                        d = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i241 = 15 / 0;
                        }
                        i6 = i;
                        r33 = i4;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i1310 = d;
                                    i31 = (i1310 & 121) + (i1310 | 121);
                                    asInterface = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        offsetBefore = TextUtils.getOffsetBefore("", 0);
                                        i32 = (141 % offsetBefore) >> 4095;
                                    } else {
                                        offsetBefore = TextUtils.getOffsetBefore("", 0);
                                        i32 = (offsetBefore * 141) - (-2111070436);
                                    }
                                    int i1410 = ~offsetBefore;
                                    int i1411 = ~((i1410 & 1251673300) | (i1410 ^ 1251673300));
                                    int i1412 = ~offsetBefore;
                                    int i1413 = ~((i1412 ^ i) | (i1412 & i));
                                    int i1414 = i32 + ((-280) * ((i1411 & i1413) | (i1411 ^ i1413)));
                                    int i1415 = ~offsetBefore;
                                    int i1416 = -(-(((~((i1415 ^ i) | (i1415 & i))) | (~(((-1251673301) ^ i) | ((-1251673301) & i)))) * 140));
                                    int i1417 = ((i1414 | i1416) << 1) - (i1414 ^ i1416);
                                    int i1418 = d;
                                    int i1419 = (i1418 & 115) + (i1418 | 115);
                                    asInterface = i1419 % 128;
                                    int i1510 = i1419 % 2;
                                    int i1511 = ~((i1412 ^ (-1251673301)) | (i1412 & (-1251673301)) | i);
                                    int i1512 = ~i;
                                    int i1513 = (i1415 & i1512) | (i1415 ^ i1512);
                                    int i1514 = ~((i1513 & 1251673300) | (i1513 ^ 1251673300));
                                    int i1515 = (i1511 & i1514) | (i1511 ^ i1514);
                                    int i1516 = (-1251673301) | i1512;
                                    int i1517 = ~((offsetBefore & i1516) | (i1516 ^ offsetBefore));
                                    MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1518 = -(-(140 * ((i1517 & i1515) | (i1515 ^ i1517))));
                                    int i1519 = ((i1417 | i1518) << 1) - (i1417 ^ i1518);
                                    int i1610 = (-76) - (~(-TextUtils.lastIndexOf("", '0', 0)));
                                    int i1611 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1612 = 609 - (~(-(-(i1611 * 306))));
                                    int i1613 = ((i1612 | (-306)) << 1) - (i1612 ^ (-306));
                                    int i1614 = ~((~i1611) | i1611);
                                    int i1615 = ~(i1611 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                                    int i1616 = i1613 + (((i1614 & i1615) | (i1614 ^ i1615)) * 305);
                                    int i1617 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i1618 = -(-((~((i1611 & i1617) | (i1617 ^ i1611))) * 305));
                                    short s4 = (short) (((i1616 | i1618) << 1) - (i1618 ^ i1616));
                                    keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
                                    i33 = asInterface + 81;
                                    d = i33 % 128;
                                    if (i33 % 2 == 0) {
                                        b3 = (byte) (((keyRepeatDelay | 20) << 1) - (keyRepeatDelay ^ 20));
                                        i34 = -(TypedValue.complexToFraction(0, 0.0f, 2.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 2.0f) == 2.0f ? 0 : -1));
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i35 = ((-743) >> i34) >> (-743);
                                    } else {
                                        b3 = (byte) (keyRepeatDelay >> 16);
                                        i34 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i1619 = i34 * (-743);
                                        i35 = (i1619 | (-860637735)) + (i1619 & (-860637735));
                                    }
                                    byte b16 = b3;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1710 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i1711 = ~(((-1867537724) & i1710) | ((-1867537724) ^ i1710));
                                    int i1712 = (i1711 ^ 1765806096) | (i1711 & 1765806096);
                                    int i1713 = ~((i1710 ^ 113004527) | (i1710 & 113004527));
                                    int i1714 = ((i1713 & i1712) | (i1712 ^ i1713)) * (-397);
                                    int i1715 = ((-1549448186) ^ i1714) + ((i1714 & (-1549448186)) << 1);
                                    int i1716 = (i1715 & (-945350864)) + ((-945350864) | i1715);
                                    int i1717 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & 1765806096) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 ^ 1765806096) | 11272900) * 397;
                                    i36 = ((i1716 | i1717) << 1) - (i1717 ^ i1716);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1718 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                    int i1719 = (~((i1718 ^ 1522594522) | (1522594522 & i1718))) * (-560);
                                    int i1810 = (((-1263432267) | i1719) << 1) - ((-1263432267) ^ i1719);
                                    int i1811 = (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault13 | 2079915742)) * (-560);
                                    i37 = ((i1810 | i1811) << 1) - (i1810 ^ i1811);
                                    i38 = ~((i1718 ^ (-2075709013)) | ((-2075709013) & i1718));
                                    if (i36 <= i37 + (((1518387792 ^ i38) | (i38 & 1518387792)) * 560)) {
                                        int i1812 = ~(i34 | 966514369);
                                        int i1813 = ~(i34 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                        i39 = i35 >>> ((-744) / (((i1812 ^ i1813) | (i1812 & i1813)) | (~(966514369 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4))));
                                        int i1814 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1815 = ~i34;
                                        int i1816 = ~((i1815 ^ (-966514370)) | (i1815 & (-966514370)));
                                        i40 = 744 / ((i1814 & i1816) | (i1814 ^ i1816));
                                    } else {
                                        i39 = (i35 - (~((-744) * (((~(i34 | 966514369)) | (~((i34 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i34 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) | (~((966514369 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (966514369 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4))))))) - 1;
                                        int i1817 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1818 = ~i34;
                                        int i1819 = ~((i1818 ^ (-966514370)) | (i1818 & (-966514370)));
                                        i40 = ((i1817 & i1819) | (i1817 ^ i1819)) * 744;
                                    }
                                    int i1910 = (i39 - (~(-(-i40)))) - 1;
                                    int i1911 = (i34 & 966514369) | (i34 ^ 966514369);
                                    int i1912 = ((i1911 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1911 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 744;
                                    int i1913 = ((i1910 | i1912) << 1) - (i1910 ^ i1912);
                                    Object[] objArr17 = new Object[1];
                                    a(i1519, i1610, s4, b16, i1913, objArr17);
                                    try {
                                        Object[] objArr18 = {(String) objArr17[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
                                            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                                            byte[] bArr3 = $$a;
                                            byte b17 = bArr3[7];
                                            byte b18 = bArr3[132];
                                            Object[] objArr19 = new Object[1];
                                            c(b17, b18, (short) (b18 | 140), objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec2, minimumFlingVelocity2, scrollBarFadeDuration2, 410748506, false, (String) objArr19[0], new Class[]{String.class});
                                        }
                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr18)).longValue();
                                        long j11 = 1753955584;
                                        long j12 = -919;
                                        long j13 = (j12 * j11) + (j12 * jLongValue2);
                                        long j14 = 920;
                                        r34 = i4;
                                        long j15 = -1;
                                        long j16 = j11 ^ j15;
                                        long j17 = jLongValue2 ^ j15;
                                        long j18 = j16 | j17;
                                        long jNextInt2 = new Random().nextInt();
                                        long j19 = jNextInt2 ^ j15;
                                        long j110 = ((long) (-1954873821)) + j13 + ((((j18 | jNextInt2) ^ j15) | (((j17 | j19) | j11) ^ j15)) * j14) + (((j18 ^ j15) | ((j16 | j19) ^ j15)) * j14) + (j14 * ((j15 ^ ((j17 | j11) | jNextInt2)) | ((j18 | j19) ^ j15) | (((j16 | jLongValue2) | jNextInt2) ^ j15)));
                                        int i1914 = ((int) (j110 >> 32)) & ((-830121054) + (((~((-276933206) | i)) | 1714159616) * (-756)) + (((-276933206) | i1512) * 756));
                                        int i1915 = ((int) j110) & ((-1704616964) + (((~((-96148390) | i)) | 95099396) * 305) + (((~((-96148390) | i1512)) | 1341078020) * 305));
                                        i13 = (i1914 & i1915) | (i1914 ^ i1915);
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    context = i4;
                                    int i1916 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1917 = i1916 * 1773;
                                    int i1918 = (i1917 ^ 370690983) + ((i1917 & 370690983) << 1);
                                    int i1919 = ~((~i1916) | (-1251673302));
                                    int i2010 = ~(((-1251673302) & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | ((-1251673302) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                                    int i2011 = (i1919 & i2010) | (i1919 ^ i2010);
                                    int i2012 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                    int i2013 = i2012 | i1916;
                                    int i2014 = ~((i2013 & 1251673301) | (i2013 ^ 1251673301));
                                    int i2015 = ((i2011 & i2014) | (i2011 ^ i2014)) * 886;
                                    int i2016 = ((i1918 | i2015) << 1) - (i2015 ^ i1918);
                                    int i2017 = ~((i2012 ^ 1251673301) | (i2012 & 1251673301));
                                    i17 = ((i2016 + (((i2017 & i1916) | (i1916 ^ i2017)) * (-1772))) - (~((~((i1916 & i2012) | (i2012 ^ i1916))) * 886))) - 1;
                                    i18 = (-76) - (~(-ExpandableListView.getPackedPositionChild(0L)));
                                    windowTouchSlop = (short) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    b2 = (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                                    i19 = 966514396 - (~View.MeasureSpec.makeMeasureSpec(0, 0));
                                    i20 = d + 27;
                                    asInterface = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        Object[] objArr110 = new Object[1];
                                        a(i17, i18, windowTouchSlop, b2, i19, objArr110);
                                        str = (String) objArr110[0];
                                        int jumpTapTimeout4 = ViewConfiguration.getJumpTapTimeout();
                                        jumpTapTimeout = (jumpTapTimeout4 ^ (-123)) + ((jumpTapTimeout4 & (-123)) << 1);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i22 = ((-109) % jumpTapTimeout) >>> 111;
                                        i23 = ~jumpTapTimeout;
                                        i21 = 1;
                                    } else {
                                        Object[] objArr111 = new Object[1];
                                        a(i17, i18, windowTouchSlop, b2, i19, objArr111);
                                        str = (String) objArr111[0];
                                        jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i2018 = jumpTapTimeout * (-109);
                                        i21 = 1;
                                        i22 = ((i2018 & 1496790265) << 1) + (i2018 ^ 1496790265);
                                        i23 = ~jumpTapTimeout;
                                    }
                                    int i2019 = d;
                                    i24 = (i2019 ^ 95) + ((i2019 & 95) << i21);
                                    asInterface = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        int i2110 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 1251673367) | (1251673367 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        int i2111 = ~i2110;
                                        int i2112 = ~((jumpTapTimeout ^ 1251673367) | (jumpTapTimeout & 1251673367));
                                        int i2113 = ~i2110;
                                        i25 = (i22 >>> ((-220) % ((i23 & i2111) | (i23 ^ i2111)))) * (219 - (~(-((i2113 & i2112) | (i2112 ^ i2113)))));
                                        int i2114 = ~jumpTapTimeout;
                                        i26 = (i2114 & 1251673367) | (i2114 ^ 1251673367);
                                    } else {
                                        int i2115 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 1251673367) | (1251673367 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        int i2116 = (-220) * (i23 | (~i2115));
                                        i25 = (i22 & i2116) + (i22 | i2116) + (((~i2115) | (~(jumpTapTimeout | 1251673367))) * 220);
                                        i26 = (~jumpTapTimeout) | 1251673367;
                                    }
                                    int i2117 = ~i26;
                                    int i2118 = ~(jumpTapTimeout | (-1251673368));
                                    int i2119 = i25 + (110 * ((i2117 & i2118) | (i2117 ^ i2118)));
                                    int i2210 = (-76) - (~(-TextUtils.lastIndexOf("", '0')));
                                    short s5 = (short) (47 - (~(-AndroidCharacter.getMirror('0'))));
                                    byte bCombineMeasuredStates2 = (byte) View.combineMeasuredStates(0, 0);
                                    i27 = -Process.getGidForName("");
                                    int i2211 = asInterface;
                                    i28 = (i2211 ^ 65) + ((i2211 & 65) << 1);
                                    d = i28 % 128;
                                    if (i28 % 2 == 0) {
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i30 = ((-966514398) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-966514398) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        i29 = 0;
                                    } else {
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i2212 = i27 * (-300);
                                        int i2213 = (i2212 & (-170428234)) + (i2212 | (-170428234));
                                        int i2214 = (966514397 & i27) | (i27 ^ 966514397);
                                        i29 = (i2213 - (~(-(-((~((i2214 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i2214 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-301)))))) - 1;
                                        i30 = ((-966514398) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-966514398) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                    int i2215 = ~i30;
                                    int i2216 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i2217 = ~((i2216 & i27) | (i2216 ^ i27));
                                    int i2218 = ~i27;
                                    int i2219 = ~((i2218 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i2218 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    Object[] objArr112 = new Object[1];
                                    a(i2119, i2210, s5, bCombineMeasuredStates2, ((i29 + ((-301) * ((i2215 & i2217) | (i2215 ^ i2217)))) - (~(((i2219 & (-966514398)) | ((-966514398) ^ i2219)) * 301))) - 1, objArr112);
                                    try {
                                        objArr2 = new Object[]{(String) objArr112[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char trimmedLength3 = (char) (TextUtils.getTrimmedLength("") + 33602);
                                            int defaultSize3 = View.getDefaultSize(0, 0) + 3085;
                                            int trimmedLength4 = TextUtils.getTrimmedLength("") + 26;
                                            byte[] bArr4 = $$a;
                                            byte b19 = bArr4[7];
                                            byte b110 = bArr4[132];
                                            Object[] objArr113 = new Object[1];
                                            c(b19, b110, (short) (b110 | 140), objArr113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength3, defaultSize3, trimmedLength4, 1411172903, false, (String) objArr113[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                            i13 = 1;
                                            r34 = context;
                                        } else {
                                            i13 = 0;
                                            r34 = context;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                                i13 = 0;
                                r34 = context;
                            }
                        } catch (Exception unused2) {
                            context = i4;
                        }
                        int i2310 = -i13;
                        int i2311 = ((i13 & i2310) | (i13 ^ i2310)) >> 31;
                        int i2312 = (~i2311) & i;
                        int i2313 = i2311 & (i ^ 10);
                        int i2314 = (i2313 & i2312) | (i2312 ^ i2313);
                        int i2315 = d;
                        int i2316 = (i2315 ^ 49) + ((i2315 & 49) << 1);
                        int i2317 = i2316 % 128;
                        asInterface = i2317;
                        int i2318 = i2316 % 2;
                        int i2319 = i2 & 32;
                        i14 = (i2319 | (-i2319)) >> 31;
                        i15 = i2314 & (~i14);
                        i16 = (i2317 & 5) + (i2317 | 5);
                        d = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        int i242 = i & i14;
                        i6 = (i15 & i242) | (i15 ^ i242);
                        r33 = r34;
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = asInterface + 81;
                    d = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i243 = 15 / 0;
                    }
                    i6 = i;
                    r33 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i1311 = d;
                        i31 = (i1311 & 121) + (i1311 | 121);
                        asInterface = i31 % 128;
                        if (i31 % 2 != 0) {
                            offsetBefore = TextUtils.getOffsetBefore("", 0);
                            i32 = (141 % offsetBefore) >> 4095;
                        } else {
                            offsetBefore = TextUtils.getOffsetBefore("", 0);
                            i32 = (offsetBefore * 141) - (-2111070436);
                        }
                        int i14110 = ~offsetBefore;
                        int i14111 = ~((i14110 & 1251673300) | (i14110 ^ 1251673300));
                        int i14112 = ~offsetBefore;
                        int i14113 = ~((i14112 ^ i) | (i14112 & i));
                        int i14114 = i32 + ((-280) * ((i14111 & i14113) | (i14111 ^ i14113)));
                        int i14115 = ~offsetBefore;
                        int i14116 = -(-(((~((i14115 ^ i) | (i14115 & i))) | (~(((-1251673301) ^ i) | ((-1251673301) & i)))) * 140));
                        int i14117 = ((i14114 | i14116) << 1) - (i14114 ^ i14116);
                        int i14118 = d;
                        int i14119 = (i14118 & 115) + (i14118 | 115);
                        asInterface = i14119 % 128;
                        int i15110 = i14119 % 2;
                        int i15111 = ~((i14112 ^ (-1251673301)) | (i14112 & (-1251673301)) | i);
                        int i15112 = ~i;
                        int i15113 = (i14115 & i15112) | (i14115 ^ i15112);
                        int i15114 = ~((i15113 & 1251673300) | (i15113 ^ 1251673300));
                        int i15115 = (i15111 & i15114) | (i15111 ^ i15114);
                        int i15116 = (-1251673301) | i15112;
                        int i15117 = ~((offsetBefore & i15116) | (i15116 ^ offsetBefore));
                        MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i15118 = -(-(140 * ((i15117 & i15115) | (i15115 ^ i15117))));
                        int i15119 = ((i14117 | i15118) << 1) - (i14117 ^ i15118);
                        int i16110 = (-76) - (~(-TextUtils.lastIndexOf("", '0', 0)));
                        int i16111 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i16112 = 609 - (~(-(-(i16111 * 306))));
                        int i16113 = ((i16112 | (-306)) << 1) - (i16112 ^ (-306));
                        int i16114 = ~((~i16111) | i16111);
                        int i16115 = ~(i16111 | iTuitionPaymentFragmentspecialinlinedviewModeldefault15);
                        int i16116 = i16113 + (((i16114 & i16115) | (i16114 ^ i16115)) * 305);
                        int i16117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                        int i16118 = -(-((~((i16111 & i16117) | (i16117 ^ i16111))) * 305));
                        short s6 = (short) (((i16116 | i16118) << 1) - (i16118 ^ i16116));
                        keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
                        i33 = asInterface + 81;
                        d = i33 % 128;
                        if (i33 % 2 == 0) {
                            b3 = (byte) (((keyRepeatDelay | 20) << 1) - (keyRepeatDelay ^ 20));
                            i34 = -(TypedValue.complexToFraction(0, 0.0f, 2.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 2.0f) == 2.0f ? 0 : -1));
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i35 = ((-743) >> i34) >> (-743);
                        } else {
                            b3 = (byte) (keyRepeatDelay >> 16);
                            i34 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i16119 = i34 * (-743);
                            i35 = (i16119 | (-860637735)) + (i16119 & (-860637735));
                        }
                        byte b111 = b3;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i17110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                        int i17111 = ~(((-1867537724) & i17110) | ((-1867537724) ^ i17110));
                        int i17112 = (i17111 ^ 1765806096) | (i17111 & 1765806096);
                        int i17113 = ~((i17110 ^ 113004527) | (i17110 & 113004527));
                        int i17114 = ((i17113 & i17112) | (i17112 ^ i17113)) * (-397);
                        int i17115 = ((-1549448186) ^ i17114) + ((i17114 & (-1549448186)) << 1);
                        int i17116 = (i17115 & (-945350864)) + ((-945350864) | i17115);
                        int i17117 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault16 & 1765806096) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault16 ^ 1765806096) | 11272900) * 397;
                        i36 = ((i17116 | i17117) << 1) - (i17117 ^ i17116);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i17118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                        int i17119 = (~((i17118 ^ 1522594522) | (1522594522 & i17118))) * (-560);
                        int i18110 = (((-1263432267) | i17119) << 1) - ((-1263432267) ^ i17119);
                        int i18111 = (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault17 | 2079915742)) * (-560);
                        i37 = ((i18110 | i18111) << 1) - (i18110 ^ i18111);
                        i38 = ~((i17118 ^ (-2075709013)) | ((-2075709013) & i17118));
                        if (i36 <= i37 + (((1518387792 ^ i38) | (i38 & 1518387792)) * 560)) {
                            int i18112 = ~(i34 | 966514369);
                            int i18113 = ~(i34 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                            i39 = i35 >>> ((-744) / (((i18112 ^ i18113) | (i18112 & i18113)) | (~(966514369 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4))));
                            int i18114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i18115 = ~i34;
                            int i18116 = ~((i18115 ^ (-966514370)) | (i18115 & (-966514370)));
                            i40 = 744 / ((i18114 & i18116) | (i18114 ^ i18116));
                        } else {
                            i39 = (i35 - (~((-744) * (((~(i34 | 966514369)) | (~((i34 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i34 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) | (~((966514369 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (966514369 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4))))))) - 1;
                            int i18117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i18118 = ~i34;
                            int i18119 = ~((i18118 ^ (-966514370)) | (i18118 & (-966514370)));
                            i40 = ((i18117 & i18119) | (i18117 ^ i18119)) * 744;
                        }
                        int i19110 = (i39 - (~(-(-i40)))) - 1;
                        int i19111 = (i34 & 966514369) | (i34 ^ 966514369);
                        int i19112 = ((i19111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i19111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 744;
                        int i19113 = ((i19110 | i19112) << 1) - (i19110 ^ i19112);
                        Object[] objArr114 = new Object[1];
                        a(i15119, i16110, s6, b111, i19113, objArr114);
                        Object[] objArr115 = {(String) objArr114[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
                            int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                            byte[] bArr5 = $$a;
                            byte b112 = bArr5[7];
                            byte b113 = bArr5[132];
                            Object[] objArr116 = new Object[1];
                            c(b112, b113, (short) (b113 | 140), objArr116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec3, minimumFlingVelocity3, scrollBarFadeDuration3, 410748506, false, (String) objArr116[0], new Class[]{String.class});
                        }
                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr115)).longValue();
                        long j111 = 1753955584;
                        long j112 = -919;
                        long j113 = (j112 * j111) + (j112 * jLongValue3);
                        long j114 = 920;
                        r34 = i4;
                        long j115 = -1;
                        long j116 = j111 ^ j115;
                        long j117 = jLongValue3 ^ j115;
                        long j118 = j116 | j117;
                        long jNextInt3 = new Random().nextInt();
                        long j119 = jNextInt3 ^ j115;
                        long j1110 = ((long) (-1954873821)) + j113 + ((((j118 | jNextInt3) ^ j115) | (((j117 | j119) | j111) ^ j115)) * j114) + (((j118 ^ j115) | ((j116 | j119) ^ j115)) * j114) + (j114 * ((j115 ^ ((j117 | j111) | jNextInt3)) | ((j118 | j119) ^ j115) | (((j116 | jLongValue3) | jNextInt3) ^ j115)));
                        int i19114 = ((int) (j1110 >> 32)) & ((-830121054) + (((~((-276933206) | i)) | 1714159616) * (-756)) + (((-276933206) | i15112) * 756));
                        int i19115 = ((int) j1110) & ((-1704616964) + (((~((-96148390) | i)) | 95099396) * 305) + (((~((-96148390) | i15112)) | 1341078020) * 305));
                        i13 = (i19114 & i19115) | (i19114 ^ i19115);
                    } else {
                        context = i4;
                        int i19116 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i19117 = i19116 * 1773;
                        int i19118 = (i19117 ^ 370690983) + ((i19117 & 370690983) << 1);
                        int i19119 = ~((~i19116) | (-1251673302));
                        int i20110 = ~(((-1251673302) & iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | ((-1251673302) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
                        int i20111 = (i19119 & i20110) | (i19119 ^ i20110);
                        int i20112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                        int i20113 = i20112 | i19116;
                        int i20114 = ~((i20113 & 1251673301) | (i20113 ^ 1251673301));
                        int i20115 = ((i20111 & i20114) | (i20111 ^ i20114)) * 886;
                        int i20116 = ((i19118 | i20115) << 1) - (i20115 ^ i19118);
                        int i20117 = ~((i20112 ^ 1251673301) | (i20112 & 1251673301));
                        i17 = ((i20116 + (((i20117 & i19116) | (i19116 ^ i20117)) * (-1772))) - (~((~((i19116 & i20112) | (i20112 ^ i19116))) * 886))) - 1;
                        i18 = (-76) - (~(-ExpandableListView.getPackedPositionChild(0L)));
                        windowTouchSlop = (short) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        b2 = (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        i19 = 966514396 - (~View.MeasureSpec.makeMeasureSpec(0, 0));
                        i20 = d + 27;
                        asInterface = i20 % 128;
                        if (i20 % 2 != 0) {
                            Object[] objArr117 = new Object[1];
                            a(i17, i18, windowTouchSlop, b2, i19, objArr117);
                            str = (String) objArr117[0];
                            int jumpTapTimeout5 = ViewConfiguration.getJumpTapTimeout();
                            jumpTapTimeout = (jumpTapTimeout5 ^ (-123)) + ((jumpTapTimeout5 & (-123)) << 1);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i22 = ((-109) % jumpTapTimeout) >>> 111;
                            i23 = ~jumpTapTimeout;
                            i21 = 1;
                        } else {
                            Object[] objArr118 = new Object[1];
                            a(i17, i18, windowTouchSlop, b2, i19, objArr118);
                            str = (String) objArr118[0];
                            jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i20118 = jumpTapTimeout * (-109);
                            i21 = 1;
                            i22 = ((i20118 & 1496790265) << 1) + (i20118 ^ 1496790265);
                            i23 = ~jumpTapTimeout;
                        }
                        int i20119 = d;
                        i24 = (i20119 ^ 95) + ((i20119 & 95) << i21);
                        asInterface = i24 % 128;
                        if (i24 % 2 != 0) {
                            int i21110 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 1251673367) | (1251673367 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            int i21111 = ~i21110;
                            int i21112 = ~((jumpTapTimeout ^ 1251673367) | (jumpTapTimeout & 1251673367));
                            int i21113 = ~i21110;
                            i25 = (i22 >>> ((-220) % ((i23 & i21111) | (i23 ^ i21111)))) * (219 - (~(-((i21113 & i21112) | (i21112 ^ i21113)))));
                            int i21114 = ~jumpTapTimeout;
                            i26 = (i21114 & 1251673367) | (i21114 ^ 1251673367);
                        } else {
                            int i21115 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 1251673367) | (1251673367 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            int i21116 = (-220) * (i23 | (~i21115));
                            i25 = (i22 & i21116) + (i22 | i21116) + (((~i21115) | (~(jumpTapTimeout | 1251673367))) * 220);
                            i26 = (~jumpTapTimeout) | 1251673367;
                        }
                        int i21117 = ~i26;
                        int i21118 = ~(jumpTapTimeout | (-1251673368));
                        int i21119 = i25 + (110 * ((i21117 & i21118) | (i21117 ^ i21118)));
                        int i22110 = (-76) - (~(-TextUtils.lastIndexOf("", '0')));
                        short s7 = (short) (47 - (~(-AndroidCharacter.getMirror('0'))));
                        byte bCombineMeasuredStates3 = (byte) View.combineMeasuredStates(0, 0);
                        i27 = -Process.getGidForName("");
                        int i22111 = asInterface;
                        i28 = (i22111 ^ 65) + ((i22111 & 65) << 1);
                        d = i28 % 128;
                        if (i28 % 2 == 0) {
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i30 = ((-966514398) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-966514398) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            i29 = 0;
                        } else {
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i22112 = i27 * (-300);
                            int i22113 = (i22112 & (-170428234)) + (i22112 | (-170428234));
                            int i22114 = (966514397 & i27) | (i27 ^ 966514397);
                            i29 = (i22113 - (~(-(-((~((i22114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i22114 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-301)))))) - 1;
                            i30 = ((-966514398) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-966514398) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                        int i22115 = ~i30;
                        int i22116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i22117 = ~((i22116 & i27) | (i22116 ^ i27));
                        int i22118 = ~i27;
                        int i22119 = ~((i22118 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i22118 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        Object[] objArr119 = new Object[1];
                        a(i21119, i22110, s7, bCombineMeasuredStates3, ((i29 + ((-301) * ((i22115 & i22117) | (i22115 ^ i22117)))) - (~(((i22119 & (-966514398)) | ((-966514398) ^ i22119)) * 301))) - 1, objArr119);
                        objArr2 = new Object[]{(String) objArr119[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char trimmedLength5 = (char) (TextUtils.getTrimmedLength("") + 33602);
                            int defaultSize4 = View.getDefaultSize(0, 0) + 3085;
                            int trimmedLength6 = TextUtils.getTrimmedLength("") + 26;
                            byte[] bArr6 = $$a;
                            byte b114 = bArr6[7];
                            byte b115 = bArr6[132];
                            Object[] objArr1110 = new Object[1];
                            c(b114, b115, (short) (b115 | 140), objArr1110);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength5, defaultSize4, trimmedLength6, 1411172903, false, (String) objArr1110[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                            i13 = 1;
                            r34 = context;
                        } else {
                            i13 = 0;
                            r34 = context;
                        }
                    }
                    int i23110 = -i13;
                    int i23111 = ((i13 & i23110) | (i13 ^ i23110)) >> 31;
                    int i23112 = (~i23111) & i;
                    int i23113 = i23111 & (i ^ 10);
                    int i23114 = (i23113 & i23112) | (i23112 ^ i23113);
                    int i23115 = d;
                    int i23116 = (i23115 ^ 49) + ((i23115 & 49) << 1);
                    int i23117 = i23116 % 128;
                    asInterface = i23117;
                    int i23118 = i23116 % 2;
                    int i23119 = i2 & 32;
                    i14 = (i23119 | (-i23119)) >> 31;
                    i15 = i23114 & (~i14);
                    i16 = (i23117 & 5) + (i23117 | 5);
                    d = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                    int i244 = i & i14;
                    i6 = (i15 & i244) | (i15 ^ i244);
                    r33 = r34;
                }
                int i245 = (~((i & r33) == true ? 1 : 0)) & ((i | r33) == true ? 1 : 0);
                int i246 = (i245 | (-i245)) >> 31;
                int i247 = asInterface + 61;
                int i248 = i247 % 128;
                d = i248;
                if (i247 % 2 == 0) {
                    int i249 = i6 & (~i246);
                    int i250 = r33 & i246;
                    i8 = (i249 & i250) | (i249 ^ i250);
                    objArr = new Object[3];
                    i7 = 1;
                    objArr[0] = new int[1];
                    objArr[0] = new int[0];
                    i9 = 2;
                    objArr[2] = new int[1];
                } else {
                    i7 = 1;
                    int i251 = i6 & (~i246);
                    int i252 = r33 & i246;
                    i8 = (i251 & i252) | (i251 ^ i252);
                    objArr = new Object[4];
                    objArr[0] = new int[1];
                    objArr[1] = new int[1];
                    i9 = 2;
                    objArr[2] = new int[1];
                }
                int i253 = (i248 ^ 103) + ((i248 & 103) << i7);
                asInterface = i253 % 128;
                int i254 = i253 % i9;
                int i255 = (~(i & i8)) & (i | i8);
                int i256 = ((i255 | (-i255)) >> 31) & 16;
                int i257 = (i248 & 69) + (i248 | 69);
                int i258 = i257 % 128;
                asInterface = i258;
                int i259 = i257 % 2;
                ((int[]) objArr[0])[0] = i;
                ((int[]) objArr[2])[0] = i8;
                objArr[3] = null;
                int i260 = (i258 & 41) + (i258 | 41);
                d = i260 % 128;
                if (i260 % 2 == 0) {
                    i10 = (((953892492 + (((-74454561) | (~i)) * (-490))) + (((~(839770571 | i)) | (-914225132)) * 490)) - 1742862890) >>> i256;
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i11 = (-949) % i10;
                } else {
                    int iNextInt = new Random().nextInt();
                    int i261 = ~iNextInt;
                    int i262 = (-566638316) + (((~((-168401668) | i261)) | 134254592) * (-108)) + (((~(i261 | 208711896)) | (~((-208711897) | iNextInt)) | (-242858972)) * 54) + ((iNextInt | (-242858972)) * 54);
                    i10 = (i262 ^ i256) + ((i262 & i256) << 1);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i11 = i10 * (-949);
                }
                int i263 = asInterface;
                int i264 = i263 + 3;
                d = i264 % 128;
                if (i264 % 2 == 0) {
                    int i265 = ~i3;
                    int i266 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i267 = ~((i265 & i266) | (i265 ^ i266));
                    int i268 = ~i10;
                    int i269 = ~((i268 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i268 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    i12 = (i11 % ((-949) >> i3)) << (1900 >>> ((i267 & i269) | (i267 ^ i269)));
                } else {
                    int i270 = (-949) * i3;
                    int i271 = (i11 ^ i270) + ((i11 & i270) << 1);
                    int i272 = ~i3;
                    int i273 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i274 = ~((i272 & i273) | (i272 ^ i273));
                    int i275 = ~i10;
                    int i276 = ~((i275 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i275 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    i12 = (((i274 & i276) | (i274 ^ i276)) * 1900) + i271;
                }
                int i277 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i278 = ~((i277 & i10) | (i277 ^ i10));
                int i279 = ~(i3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i280 = -(-((-950) * ((i278 & i279) | (i278 ^ i279))));
                int i281 = (i12 & i280) + (i12 | i280);
                int i282 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i283 = ~((i3 & i282) | (i282 ^ i3));
                int i284 = ~((i10 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i10 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i285 = -(-(((i284 & i283) | (i283 ^ i284)) * 950));
                int i286 = (i281 & i285) + (i285 | i281);
                int i287 = i286 << 13;
                int i288 = (i287 & (~i286)) | ((~i287) & i286);
                int i289 = i288 ^ (i288 >>> 17);
                int i290 = i289 << 5;
                ((int[]) objArr[1])[0] = ((~i289) & i290) | ((~i290) & i289);
                int i291 = i263 + 101;
                d = i291 % 128;
                if (i291 % 2 != 0) {
                    return objArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, byte r7, byte r8) {
            /*
                int r8 = r8 * 4
                int r0 = 1 - r8
                int r7 = r7 + 117
                int r6 = r6 + 4
                byte[] r1 = defpackage.setDividerPadding.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L21:
                int r3 = r3 + 1
                int r6 = r6 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = -r6
                int r6 = r6 + r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.setDividerPadding.$$e(short, byte, byte):java.lang.String");
        }
    });

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r6
            int r5 = 197 - r5
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public OneTimePaymentActivity() {
        final OneTimePaymentActivity oneTimePaymentActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<InputConfigurationCompat>() { // from class: com.bpjstku.presentation.membership.payment.OneTimePaymentActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [InputConfigurationCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ InputConfigurationCompat invoke() {
                LifecycleOwner lifecycleOwner = oneTimePaymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputConfigurationCompat.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.OneTimePaymentActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = oneTimePaymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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
        this.a = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.OneTimePaymentActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = oneTimePaymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
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

    public static final /* synthetic */ OneTimePaymentResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(OneTimePaymentActivity oneTimePaymentActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        OneTimePaymentResponse oneTimePaymentResponse = (OneTimePaymentResponse) oneTimePaymentActivity.asBinder.getValue();
        int i4 = cancelAll + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return oneTimePaymentResponse;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.OneTimePaymentActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/OneTimePaymentActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;", "p1", "Lcom/bpjstku/domain/registration/general/model/Registration;", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;Lcom/bpjstku/domain/registration/general/model/Registration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, OneTimePaymentResponse p1, Registration p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, OneTimePaymentActivity.class, new Pair[]{TuplesKt.to("one_time_payment_response", p1), TuplesKt.to("successful_unregistered_registration_data", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityOneTimePaymentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        OneTimePaymentActivity$bindingInflater$1 oneTimePaymentActivity$bindingInflater$1 = OneTimePaymentActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return oneTimePaymentActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 19472), 2624 - (Process.myPid() >> 22), 13 - TextUtils.indexOf("", "", 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (f529a ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), 481 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $11 + 109;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 2;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 117;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (Process.myTid() >> 22) + 481, ImageFormat.getBitsPerPixel(0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((ListPopupWindow2) this.a.getValue()).INotificationSideChannelDefault.observe(this, new Observer() { // from class: measureChildBeforeLayout
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                OneTimePaymentActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = onTransact + 113;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v7 com.bpjstku.domain.registration.general.model.Registration) = 
  (r1v6 com.bpjstku.domain.registration.general.model.Registration)
  (r1v52 com.bpjstku.domain.registration.general.model.Registration)
 binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        Registration registration;
        String str;
        int i = 2 % 2;
        int i2 = cancelAll + 69;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            registration = (Registration) this.g.getValue();
            int i3 = 60 / 0;
            if (registration != null) {
                str = registration.getInterfaceDescriptor;
            } else {
                str = null;
            }
        } else {
            registration = (Registration) this.g.getValue();
            if (registration != null) {
                str = registration.getInterfaceDescriptor;
            } else {
                str = null;
            }
        }
        if (!Intrinsics.areEqual(str, "cross_selling")) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1659217783, 1627457476, new Object[]{this}, createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 221567760, -1627457474);
            return;
        }
        int i4 = onTransact + 21;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String strValueOf = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        if (strValueOf == null || strValueOf.length() == 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "session berakhir..silakan login kembali", 0).show();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            finish();
            return;
        }
        int i6 = onTransact + 55;
        cancelAll = i6 % 128;
        if (i6 % 2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1659217783, 1627457476, new Object[]{this}, createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 221567760, -1627457474);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1659217783, 1627457476, new Object[]{this}, createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 221567760, -1627457474);
            int i7 = 77 / 0;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends WebViewClient {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            URL url = new URL(OneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(OneTimePaymentActivity.this).getSuccessRedirectUrl().toString());
            Intrinsics.checkNotNull(webResourceRequest);
            String string = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!StringsKt.contains$default((CharSequence) string, (CharSequence) url.getHost().toString(), false, 2, (Object) null)) {
                return false;
            }
            OneTimePaymentActivity oneTimePaymentActivity = OneTimePaymentActivity.this;
            Registration registration = (Registration) oneTimePaymentActivity.g.getValue();
            Registration registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = registration != null ? Registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registration, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), "yyyy-MM-dd HH:mm:ss"), null, false, false, 2013265919) : null;
            PaymentOneTimeSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = PaymentOneTimeSuccessActivity.INSTANCE;
            PaymentOneTimeSuccessActivity.Companion.TuitionPaymentFragmentbindingInflater1(oneTimePaymentActivity, registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            oneTimePaymentActivity.d_();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Double doubleOrNull;
        String str;
        String str2;
        String str3;
        OneTimePaymentActivity oneTimePaymentActivity = (OneTimePaymentActivity) objArr[0];
        int i = 2 % 2;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Registration registration = (Registration) oneTimePaymentActivity.g.getValue();
        Object obj = null;
        if (registration != null) {
            int i2 = onTransact + 51;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            String str4 = registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str4 != null) {
                doubleOrNull = StringsKt.toDoubleOrNull(str4);
            } else {
                doubleOrNull = null;
            }
        } else {
            doubleOrNull = null;
        }
        if (!Intrinsics.areEqual(doubleOrNull, 0.0d)) {
            oneTimePaymentActivity.b = "L";
        }
        final ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) oneTimePaymentActivity.a.getValue();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        Registration registration2 = (Registration) oneTimePaymentActivity.g.getValue();
        String str5 = registration2 != null ? registration2.RemoteActionCompatParcelizer : null;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append("#");
        sb.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion, sb.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        Registration registration3 = (Registration) oneTimePaymentActivity.g.getValue();
        String str6 = registration3 != null ? registration3.RemoteActionCompatParcelizer : null;
        String str7 = oneTimePaymentActivity.b;
        Registration registration4 = (Registration) oneTimePaymentActivity.g.getValue();
        String str8 = registration4 != null ? registration4.cancel : null;
        Registration registration5 = (Registration) oneTimePaymentActivity.g.getValue();
        if (registration5 != null) {
            int i4 = onTransact + 79;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                String str9 = registration5.disconnect;
                obj.hashCode();
                throw null;
            }
            str = registration5.disconnect;
        } else {
            str = null;
        }
        Registration registration6 = (Registration) oneTimePaymentActivity.g.getValue();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = registration6 != null ? registration6.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str6);
        sb2.append("#");
        sb2.append(str7);
        sb2.append("#");
        sb2.append(str8);
        sb2.append("#");
        sb2.append(str);
        sb2.append("#");
        sb2.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion2, sb2.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string, oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        Registration registration7 = (Registration) oneTimePaymentActivity.g.getValue();
        String str10 = registration7 != null ? registration7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str10);
        sb3.append("#");
        sb3.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion3, sb3.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        Registration registration8 = (Registration) oneTimePaymentActivity.g.getValue();
        String str11 = registration8 != null ? registration8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str11);
        sb4.append("#");
        sb4.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion4, sb4.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        Registration registration9 = (Registration) oneTimePaymentActivity.g.getValue();
        if (registration9 != null) {
            int i5 = onTransact + 55;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            str2 = registration9.TuitionPaymentFragmentbindingInflater1;
        } else {
            str2 = null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append("#");
        sb5.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion5, sb5.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
        Registration registration10 = (Registration) oneTimePaymentActivity.g.getValue();
        String str12 = registration10 != null ? registration10.a : null;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str12);
        sb6.append("#");
        sb6.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion6, sb6.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
        Registration registration11 = (Registration) oneTimePaymentActivity.g.getValue();
        String str13 = registration11 != null ? registration11.asBinder : null;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str13);
        sb7.append("#");
        sb7.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion7, sb7.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion8 = Camera2InteropExtender.INSTANCE;
        Registration registration12 = (Registration) oneTimePaymentActivity.g.getValue();
        String str14 = registration12 != null ? registration12.cancel : null;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(str14);
        sb8.append("#");
        sb8.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault10 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion8, sb8.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion9 = Camera2InteropExtender.INSTANCE;
        Registration registration13 = (Registration) oneTimePaymentActivity.g.getValue();
        String str15 = registration13 != null ? registration13.g : null;
        StringBuilder sb9 = new StringBuilder();
        sb9.append(str15);
        sb9.append("#");
        sb9.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault11 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion9, sb9.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion10 = Camera2InteropExtender.INSTANCE;
        Registration registration14 = (Registration) oneTimePaymentActivity.g.getValue();
        if (registration14 != null) {
            str3 = registration14.disconnect;
        } else {
            int i7 = cancelAll + 21;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            str3 = null;
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(str3);
        sb10.append("#");
        sb10.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault12 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion10, sb10.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion11 = Camera2InteropExtender.INSTANCE;
        Registration registration15 = (Registration) oneTimePaymentActivity.g.getValue();
        String str16 = registration15 != null ? registration15.g : null;
        StringBuilder sb11 = new StringBuilder();
        sb11.append(str16);
        sb11.append("#");
        sb11.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault13 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion11, sb11.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Camera2InteropExtender.Companion companion12 = Camera2InteropExtender.INSTANCE;
        Registration registration16 = (Registration) oneTimePaymentActivity.g.getValue();
        String str17 = registration16 != null ? registration16.RemoteActionCompatParcelizer : null;
        Registration registration17 = (Registration) oneTimePaymentActivity.g.getValue();
        String str18 = registration17 != null ? registration17.a : null;
        StringBuilder sb12 = new StringBuilder();
        sb12.append(str17);
        sb12.append("#");
        sb12.append(str18);
        sb12.append("#");
        sb12.append(string);
        InsertVasTxPaymentRequest insertVasTxPaymentRequest = new InsertVasTxPaymentRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault8, strTuitionPaymentFragmentspecialinlinedviewModeldefault9, strTuitionPaymentFragmentspecialinlinedviewModeldefault10, strTuitionPaymentFragmentspecialinlinedviewModeldefault11, strTuitionPaymentFragmentspecialinlinedviewModeldefault12, strTuitionPaymentFragmentspecialinlinedviewModeldefault13, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion12, sb12.toString(), oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        Intrinsics.checkNotNullParameter(insertVasTxPaymentRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = listPopupWindow2.INotificationSideChannelDefault;
        VirtualCameraAdapter1.Companion companion13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(listPopupWindow2.write.TuitionPaymentFragmentbindingInflater1(insertVasTxPaymentRequest)));
        final Function1 function1 = new Function1() { // from class: PopupMenu3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(listPopupWindow2, (BaseItem) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: createTintFilter
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: put
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listPopupWindow2, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getDimensionPixelSize
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        listPopupWindow2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:19:0x0191  */
    /* JADX WARN: Code duplicated, block: B:22:0x022b A[Catch: all -> 0x0b06, TryCatch #2 {all -> 0x0b06, blocks: (B:20:0x0217, B:22:0x022b, B:23:0x025b, B:59:0x0765, B:61:0x0779, B:62:0x07a9, B:64:0x07db, B:65:0x0858), top: B:105:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0271  */
    /* JADX WARN: Code duplicated, block: B:31:0x0304  */
    /* JADX WARN: Code duplicated, block: B:34:0x035c  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrB$5f1425da;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = onTransact + 85;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cRed = (char) (Color.red(0) + 29944);
                int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((short) 193, (byte) (bArr[27] - 1), bArr[28], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iNormalizeMetaState, jumpTapTimeout, 986134021, false, (String) objArr2[0], null);
            }
            int i3 = 93 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cRed2 = (char) (Color.red(0) + 29944);
                    int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                    int iMyTid = (Process.myTid() >> 22) + 23;
                    byte[] bArr2 = $$a;
                    Object[] objArr3 = new Object[1];
                    c((short) 156, bArr2[7], bArr2[28], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed2, iRgb, iMyTid, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i4 = ~startElapsedRealtime;
                int i5 = ~(575047286 | i4);
                int i6 = (-1561875359) + (((-937361023) | i5) * (-712)) + (((~(startElapsedRealtime | (-362313737))) | (~(i4 | 937361022))) * (-712)) + ((362444860 | i5) * 712) + 1913283648;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArrB$5f1425da[3])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{41699, 961, 57517, 16787, 9731, 34600, 25630, 51960, 43942, 2262, 59712, 20019, 12054, 36328, 29394, 54147}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step4).substring(23, 24).length() + 41256, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{41696, 40490, 56162, 5298, 20961, 36099, 52823, 2945, 17657, 32791, 64828, 15980, 31646, 46333, 61455, 11589}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 15523, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {1615286065};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), 1725 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 1913283648);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                        byte[] bArr3 = $$a;
                        Object[] objArr8 = new Object[1];
                        c((short) 156, bArr3[7], bArr3[28], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iIndexOf, iKeyCodeFromString, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$5f1425da);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{41704, 55094, 18767, 50056, 30114, 61429, 24587, 39440, 3182, 34467, 14477, 44321, 10044, 22887, 54163, 17875, 65524, 28715, 59991, 7269, 38590, 2247}, TextUtils.lastIndexOf("", '0', 0) + 30162, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{41708, 62866, 3078, 42140, 65318, 6079, 44583, 50842, 6484, 45511, 51267, 24800, 47988, 54255, 27246}, 22391 - ((Process.getThreadPriority(0) + 20) >> 6), objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                            int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                            byte[] bArr4 = $$a;
                            Object[] objArr11 = new Object[1];
                            c((short) 104, bArr4[7], bArr4[28], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, touchSlop, maxKeyCode, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                            int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                            byte[] bArr5 = $$a;
                            Object[] objArr12 = new Object[1];
                            c((short) 193, (byte) (bArr5[27] - 1), bArr5[28], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, iArgb, maxKeyCode2, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char gidForName = (char) (29943 - Process.getGidForName(""));
                int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr6 = $$a;
                Object[] objArr13 = new Object[1];
                c((short) 193, (byte) (bArr6[27] - 1), bArr6[28], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, keyRepeatTimeout, iIndexOf2, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cRed3 = (char) (Color.red(0) + 29944);
                    int iRgb2 = (-16775461) - Color.rgb(0, 0, 0);
                    int iMyTid2 = (Process.myTid() >> 22) + 23;
                    byte[] bArr7 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) 156, bArr7[7], bArr7[28], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed3, iRgb2, iMyTid2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                int i9 = ~startElapsedRealtime2;
                int i10 = ~(575047286 | i9);
                int i11 = (-1561875359) + (((-937361023) | i10) * (-712)) + (((~(startElapsedRealtime2 | (-362313737))) | (~(i9 | 937361022))) * (-712)) + ((362444860 | i10) * 712) + 1913283648;
                int i12 = (i11 << 13) ^ i11;
                int i13 = i12 ^ (i12 >>> 17);
                ((int[]) objArrB$5f1425da[3])[0] = i13 ^ (i13 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{41699, 961, 57517, 16787, 9731, 34600, 25630, 51960, 43942, 2262, 59712, 20019, 12054, 36328, 29394, 54147}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step4).substring(23, 24).length() + 41256, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{41696, 40490, 56162, 5298, 20961, 36099, 52823, 2945, 17657, 32791, 64828, 15980, 31646, 46333, 61455, 11589}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 15523, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {1615286065};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), 1725 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 1913283648);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAxisFromString2 = (char) (29943 - MotionEvent.axisFromString(""));
                    int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1755;
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 23;
                    byte[] bArr8 = $$a;
                    Object[] objArr19 = new Object[1];
                    c((short) 156, bArr8[7], bArr8[28], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString2, iIndexOf3, iKeyCodeFromString2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$5f1425da);
                Object[] objArr20 = new Object[1];
                e(new char[]{41704, 55094, 18767, 50056, 30114, 61429, 24587, 39440, 3182, 34467, 14477, 44321, 10044, 22887, 54163, 17875, 65524, 28715, 59991, 7269, 38590, 2247}, TextUtils.lastIndexOf("", '0', 0) + 30162, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{41708, 62866, 3078, 42140, 65318, 6079, 44583, 50842, 6484, 45511, 51267, 24800, 47988, 54255, 27246}, 22391 - ((Process.getThreadPriority(0) + 20) >> 6), objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask2 = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                    int maxKeyCode3 = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr9 = $$a;
                    Object[] objArr111 = new Object[1];
                    c((short) 104, bArr9[7], bArr9[28], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask2, touchSlop2, maxKeyCode3, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cArgb2 = (char) (Color.argb(0, 0, 0, 0) + 29944);
                    int iArgb2 = 1755 - Color.argb(0, 0, 0, 0);
                    int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                    byte[] bArr10 = $$a;
                    Object[] objArr112 = new Object[1];
                    c((short) 193, (byte) (bArr10[27] - 1), bArr10[28], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb2, iArgb2, maxKeyCode4, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i14 = ((int[]) objArrB$5f1425da[1])[0];
        int i15 = ((int[]) objArrB$5f1425da[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int iMyPid = Process.myPid();
            int i17 = ~(698370224 | iMyPid);
            int i18 = i16 + (-1464075416) + (((-1039432439) | i17) * (-814)) + ((i17 | (~((~iMyPid) | 485767798)) | 144705584) * 407) + (((~(iMyPid | (-485767799))) | (~((-698370225) | iMyPid)) | 144705584) * 407);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                int i21 = onTransact + 113;
                cancelAll = i21 % 128;
                int i22 = 2;
                int i23 = i21 % 2;
                int i24 = 0;
                while (i24 < strArr.length) {
                    int i25 = onTransact + 119;
                    cancelAll = i25 % 128;
                    int i26 = i25 % i22;
                    arrayList.add(strArr[i24]);
                    i24++;
                    i22 = 2;
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i27 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i29 = ~i28;
            int i30 = i27 + (-1144866607) + (((~((-155040151) | i29)) | 19665026) * 168) + ((~((-19665027) | i28)) * 168) + (((~(i28 | (-135375125))) | (~(i29 | (-57562276))) | 37897249) * 168);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr22[3])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
            int i33 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
            short s = (short) ($$b & 190);
            byte[] bArr11 = $$a;
            Object[] objArr23 = new Object[1];
            c(s, bArr11[7], bArr11[28], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, pressedStateDuration, i33, 1357589585, false, (String) objArr23[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        e(new char[]{41704, 55094, 18767, 50056, 30114, 61429, 24587, 39440, 3182, 34467, 14477, 44321, 10044, 22887, 54163, 17875, 65524, 28715, 59991, 7269, 38590, 2247}, ((Process.getThreadPriority(0) + 20) >> 6) + 30161, objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(new char[]{41708, 62866, 3078, 42140, 65318, 6079, 44583, 50842, 6484, 45511, 51267, 24800, 47988, 54255, 27246}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_all_bank).substring(13, 15).codePointAt(0) + 22294, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int maxKeyCode5 = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
            int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
            byte[] bArr12 = $$a;
            Object[] objArr26 = new Object[1];
            c((short) 156, bArr12[7], bArr12[28], objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, maxKeyCode5, modifierMetaStateMask3, 1344079056, false, (String) objArr26[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iIndexOf4 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                byte b = $$a[7];
                short s2 = b;
                Object[] objArr27 = new Object[1];
                c(s2, (byte) (s2 | 52), b, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cKeyCodeFromString, iIndexOf4, fadingEdgeLength, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr28[3])[0];
            int i35 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int i36 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i37 = (((-40898970) + (((~((-218658546) | i36)) | (-25621625)) * (-933))) + (((~(i36 | (-25621625))) | 8814600) * 933)) - 2048149920;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr[2])[0] = i39 ^ (i39 << 5);
            int i40 = cancelAll + 121;
            onTransact = i40 % 128;
            int i41 = i40 % 2;
        } else {
            Object[] objArr29 = new Object[1];
            e(new char[]{41699, 961, 57517, 16787, 9731, 34600, 25630, 51960, 43942, 2262, 59712, 20019, 12054, 36328, 29394, 54147}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 41221, objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            e(new char[]{41696, 40490, 56162, 5298, 20961, 36099, 52823, 2945, 17657, 32791, 64828, 15980, 31646, 46333, 61455, 11589}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_mandiri_debit_card_no).substring(22, 23).length() + 15558, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {1615286065};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1134, KeyEvent.normalizeMetaState(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, -269102206, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
                short s3 = (short) ($$b & 190);
                byte[] bArr13 = $$a;
                Object[] objArr33 = new Object[1];
                c(s3, bArr13[7], bArr13[28], objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, tapTimeout, offsetBefore, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionGroup(0L)), 1118 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                byte b2 = $$a[7];
                short s4 = b2;
                Object[] objArr34 = new Object[1];
                c(s4, (byte) (s4 | 52), b2, objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay, iLastIndexOf, jumpTapTimeout2, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                e(new char[]{41704, 55094, 18767, 50056, 30114, 61429, 24587, 39440, 3182, 34467, 14477, 44321, 10044, 22887, 54163, 17875, 65524, 28715, 59991, 7269, 38590, 2247}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30161, objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                e(new char[]{41708, 62866, 3078, 42140, 65318, 6079, 44583, 50842, 6484, 45511, 51267, 24800, 47988, 54255, 27246}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 22355, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                    byte[] bArr14 = $$a;
                    Object[] objArr37 = new Object[1];
                    c((short) 156, bArr14[7], bArr14[28], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollDefaultDelay2, scrollDefaultDelay3, iCombineMeasuredStates, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                    int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    short s5 = (short) ($$b & 190);
                    byte[] bArr15 = $$a;
                    byte b3 = bArr15[7];
                    byte b4 = bArr15[28];
                    Object[] objArr38 = new Object[1];
                    c(s5, b3, b4, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cResolveOpacity2, minimumFlingVelocity, jumpTapTimeout3, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArr[1])[0];
        int i43 = ((int[]) objArr[3])[0];
        if (i43 == i42) {
            Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i44 = ((int[]) objArr[2])[0];
            int i45 = ((int[]) objArr[3])[0];
            int i46 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i48 = (~((-331017315) | i47)) | 311454722;
            int i49 = i44 + (-659599367) + (i48 * 992) + ((i48 | (~((~i47) | (-67174553)))) * (-496)) + ((i47 | (-86737145)) * 496);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr39[2])[0] = i51 ^ (i51 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i43];
        int i52 = i43 - 1;
        iArr[i52] = 1;
        Toast.makeText((Context) null, iArr[((i43 * i52) % 2) - 1], 1).show();
        Object[] objArr40 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i53 = ((int[]) objArr[2])[0];
        int i54 = ((int[]) objArr[3])[0];
        int i55 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i56 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i57 = (-2018450513) + ((i56 | 829657218) * (-50));
        int i58 = ~((-286494851) | i56);
        int i59 = ~i56;
        int i60 = i53 + i57 + ((i58 | (~(871871898 | i59))) * 50) + (((~(i59 | 829657218)) | (~(585377048 | i59)) | (-871871899)) * 50);
        int i61 = i60 ^ (i60 << 13);
        int i62 = i61 ^ (i61 >>> 17);
        ((int[]) objArr40[2])[0] = i62 ^ (i62 << 5);
        int i63 = onTransact + 107;
        cancelAll = i63 % 128;
        if (i63 % 2 != 0) {
            int i64 = 68 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cb, code lost:
    
        if (r1 != ((1965013087 + ((~((-67108941) | r2)) * (-783))) + (((~(r2 | 2069709968)) | (-509345997)) * 783))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cd, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.cancelAll + 7;
        com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        r1 = 1518503042 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e3, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00eb, code lost:
    
        throw new java.lang.RuntimeException("-1012953181");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        if (r1 == ((((~((~r2) | 2130574079)) * 130) + 686862332) + (((~(r2 | 2130574079)) | 4460566) * 130))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a3, code lost:
    
        if (r1 == (((1563865192 + (((~(r2 | 2076163451)) | (~((-154669057) | r2))) * (-184))) + (((545753426 | (~r3)) | (~(1530410025 | r2))) * 184)) + 266731984)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a5, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = ~java.lang.System.identityHashCode(r9);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancelAll + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i6 = ~i5;
        if (i4 != (-740105264) + ((i5 | (-1248357218)) * 140) + (((~((-1248357218) | i6)) | 141049856) * (-280)) + (((~(i5 | (-141049857))) | (~(418369674 | i6)) | (-1525677036)) * 140)) {
            throw null;
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i9 = ~i8;
        if (i7 != 737658380 + (((~(i9 | 2037710172)) | 541345792) * 220) + (((~(i9 | 2035570964)) | 543485000) * (-440)) + ((i8 | 2037710172) * 220)) {
            throw null;
        }
        super.onStart();
        int i10 = cancelAll + 45;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1560018369
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void b(OneTimePaymentActivity oneTimePaymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll + 113;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i3 + 111;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            oneTimePaymentActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                oneTimePaymentActivity.IconCompatParcelizer();
                ((ActivityOneTimePaymentBinding) ((ViewBinding) oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webViewOneTimePayment.setWebViewClient(oneTimePaymentActivity.new TuitionPaymentFragmentbindingInflater1());
                WebSettings settings = ((ActivityOneTimePaymentBinding) ((ViewBinding) oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webViewOneTimePayment.getSettings();
                Intrinsics.checkNotNullExpressionValue(settings, "");
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                ((ActivityOneTimePaymentBinding) ((ViewBinding) oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webViewOneTimePayment.loadUrl(((OneTimePaymentResponse) oneTimePaymentActivity.asBinder.getValue()).getInvoiceUrl().toString());
                return;
            }
            return;
        }
        int i7 = i3 + 81;
        cancelAll = i7 % 128;
        int i8 = i7 % 2;
        oneTimePaymentActivity.IconCompatParcelizer();
        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oneTimePaymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        int i9 = onTransact + 11;
        cancelAll = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 47 / 0;
        }
    }

    public static /* synthetic */ OneTimePaymentResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(OneTimePaymentActivity oneTimePaymentActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = oneTimePaymentActivity.getIntent().getParcelableExtra("one_time_payment_response");
        Intrinsics.checkNotNull(parcelableExtra);
        OneTimePaymentResponse oneTimePaymentResponse = (OneTimePaymentResponse) parcelableExtra;
        int i4 = onTransact + 73;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return oneTimePaymentResponse;
        }
        throw null;
    }

    public static /* synthetic */ User b(OneTimePaymentActivity oneTimePaymentActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) oneTimePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = cancelAll + 43;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return userAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentbindingInflater1(OneTimePaymentActivity oneTimePaymentActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = oneTimePaymentActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            return (Registration) parcelableExtra;
        }
        Parcelable parcelableExtra2 = oneTimePaymentActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
        Intrinsics.checkNotNull(parcelableExtra2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i4));
        int i12 = i8 | i2;
        int i13 = ~(i12 | i6);
        int i14 = (~(i4 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i2 + i6 + i + (1650861130 * i5) + ((-924421097) * i3);
        int i16 = i15 * i15;
        int i17 = (i2 * (-405912681)) + 1474035712 + ((-405912681) * i6) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i) + (986710016 * i5) + ((-948436992) * i3) + ((-1864630272) * i16);
        int i18 = ((i2 * (-959335331)) - 587927435) + (i6 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i * (-959334869)) + (i5 * 22983790) + (i3 * 637852125) + (i16 * (-1124859904));
        int i19 = i17 + (i18 * i18 * (-1807482880));
        if (i19 == 1) {
            return b(objArr);
        }
        if (i19 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i20 = 2 % 2;
        int i21 = cancelAll + 35;
        onTransact = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    static {
        cancel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 9;
        cancel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onTransact() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1659217783, 1627457476, new Object[]{this}, createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 221567760, -1627457474);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 47;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 91;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return R.layout.activity_one_time_payment;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -300439053, new Object[]{this}, (-707320086) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 300439054);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancelAll + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 431020463 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_1).substring(1, 3).codePointAt(0) + 1606472171, -88884267, new Object[]{this}, createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 88884267);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onTransact + 55;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        f529a = 6897604801395035026L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelAll + 69;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return null;
    }
}
