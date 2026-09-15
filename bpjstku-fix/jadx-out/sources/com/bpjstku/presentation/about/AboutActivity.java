package com.bpjstku.presentation.about;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.about.model.request.AboutEventRequest;
import com.bpjstku.databinding.ActivityAboutBinding;
import com.bpjstku.domain.about.model.About;
import com.bpjstku.presentation.about.AboutActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import defpackage.ActivityResultContracts;
import defpackage.BufferProviderState;
import defpackage.CameraManagerCompatAvailabilityCallbackExecutorWrapper;
import defpackage.CameraUseCaseAdapter;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCaptureSessionEnd;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0015\u0010\u000e\u001a\u00020\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00158\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/about/AboutActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAboutBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "LActivityResultContracts;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/about/model/About;", "Lcom/bpjstku/domain/about/model/About;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutActivity extends BindingBaseActivity<ActivityAboutBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private About TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.activity_about;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {119, -103, 14, -22};
    private static final int $$f = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {81, 125, 2, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 41;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f448a = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 15438;
    private static char b = 22054;
    private static char asBinder = 30822;
    private static char g = 41251;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i | i2 | i4);
        int i8 = ~i2;
        int i9 = (~(i8 | i4)) | (~((~i4) | i));
        int i10 = (~(i4 | (~i))) | i8;
        int i11 = i + i2 + i3 + ((-2044576983) * i6) + (1743660113 * i5);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i) - 713031680) + (164951516 * i2) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i3) + (689963008 * i6) + ((-299892736) * i5) + ((-1081737216) * i12);
        int i14 = ((i * 2048727874) - 782056376) + (i2 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i3 * 2048728315) + (i6 * 2142076211) + (i5 * (-1448904853)) + (i12 * 1885470720);
        return i13 + ((i14 * i14) * (-1618345984)) != 1 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.about.AboutActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.AboutActivity.c(int, short, byte, java.lang.Object[]):void");
    }

    public AboutActivity() {
        final AboutActivity aboutActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContracts>() { // from class: com.bpjstku.presentation.about.AboutActivity$special$$inlined$viewModel$default$1
            private static final byte[] $$c = {17, 104, 102, -28};
            private static final int $$d = 36;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 87;
            private static int b = 0;
            private static int asBinder = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2781;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 12395;
            private static char TuitionPaymentFragmentbindingInflater1 = 33390;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 19445;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 4
                    int r8 = 3 - r8
                    int r9 = r9 * 3
                    int r9 = 84 - r9
                    int r7 = r7 * 4
                    int r7 = r7 + 53
                    byte[] r0 = com.bpjstku.presentation.about.AboutActivity$special$$inlined$viewModel$default$1.$$a
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r9 = r8
                    r5 = r2
                    goto L2f
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L2f:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + (-11)
                    r3 = r5
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.AboutActivity$special$$inlined$viewModel$default$1.c(int, byte, short, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    char c = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        break;
                    }
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    char c2 = 1;
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i3 = 58224;
                    int i4 = 0;
                    while (i4 < 16) {
                        int i5 = $11 + 67;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
                        char c3 = cArr3[c2];
                        char c4 = cArr3[c];
                        int i7 = (c4 + i3) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                        int i8 = c4 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            objArr2[2] = Integer.valueOf(i8);
                            objArr2[c2] = Integer.valueOf(i7);
                            objArr2[0] = Integer.valueOf(c3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char mode = (char) (47773 - View.MeasureSpec.getMode(0));
                                int iMyPid = (Process.myPid() >> 22) + 468;
                                int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                                Class[] clsArr = new Class[4];
                                clsArr[0] = Integer.TYPE;
                                clsArr[c2] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iMyPid, trimmedLength, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[c2] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.resolveSizeAndState(0, 0, 0)), Color.blue(0) + 468, 13 - KeyEvent.keyCodeFromString(""), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i3 -= 40503;
                            i4++;
                            c2 = 1;
                            c = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetAfter("", 0) + 2323, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i);
                int i9 = $11 + 103;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [ActivityResultContracts, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ ActivityResultContracts invoke() throws Throwable {
                int i;
                int i2 = 2 % 2;
                LifecycleOwner lifecycleOwner = aboutActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                float f = 0.0f;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46400), (Process.myPid() >> 22) + 40, 19 - KeyEvent.getDeadChar(0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                a(new char[]{64141, 30608, 47212, 17182, 35291, 15215, 16099, 59767, 43895, 2436, 31563, 25555, 44387, 49060, 27190, 7380, 51177, 50588, 22352, 6522, 21496, 33260, 24284, 29449}, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(new char[]{5976, 52456, 44999, 33511, 23206, 15874, 40676, 31536, 37560, 10270, 43131, 5959, 30962, 28552, 61797, 54921, 57720, 25964}, (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -721;
                long j2 = jLongValue;
                long startUptimeMillis = (int) Process.getStartUptimeMillis();
                long j3 = -1;
                long j4 = j3 ^ 442054354946766420L;
                long j5 = j3 ^ 1655202819795192567L;
                long j6 = 1655774591980551927L ^ j3;
                long j7 = (j * 442054354946766420L) + (j * 1655202819795192567L) + (((long) 1444) * ((startUptimeMillis ^ j3) | ((j4 | j5) ^ j3) | j6)) + (((long) (-1444)) * (j6 | ((startUptimeMillis | 442054354946766420L) ^ j3) | ((startUptimeMillis | 1655202819795192567L) ^ j3))) + (((long) 722) * (((j5 | 442054354946766420L) ^ j3) | ((j4 | 1655202819795192567L) ^ j3)));
                int i4 = 0;
                while (true) {
                    int i5 = 3;
                    if (i4 == 10) {
                        Object[] objArr3 = new Object[1];
                        a(new char[]{22449, 2691, 53205, 23292, 64907, 973, 60425, 57753, 11981, 13848, 23298, 27916, 57496, 20482, 4490, 32341, 57081, 13506}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        a(new char[]{29872, 36552, 45797, 47771, 34672, 19518, 59010, 1588, 12666, 'T', 52043, 12859, 64984, 28618, 12399, 24761, 10343, 25996}, Color.argb(0, 0, 0, 0) + 16, objArr4);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr5 = {302759077};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1134 - Color.alpha(0), 18 - View.getDefaultSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1812316051, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                                byte b2 = $$a[7];
                                byte b3 = b2;
                                Object[] objArr7 = new Object[1];
                                c(b2, b3, b3, objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, packedPositionGroup, iLastIndexOf, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.blue(0)), (Process.myPid() >> 22) + 1117, Drawable.resolveOpacity(0, 0) + 17), Boolean.TYPE});
                            }
                            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                            int i6 = ((int[]) objArr8[1])[0];
                            int i7 = ((int[]) objArr8[3])[0];
                            if (i7 == i6) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[0];
                            if (strArr != null) {
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            int[] iArr = new int[i7];
                            int i8 = i7 - 1;
                            iArr[i8] = 1;
                            Toast.makeText((Context) null, iArr[((i7 * i8) % 2) - 1], 1).show();
                            break;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i9 = asBinder + 113;
                    b = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))), 59 - TextUtils.indexOf("", "", 0, 0), 17 - TextUtils.lastIndexOf("", '0'), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                    } else {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (37836 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 59, 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getInt(null);
                    }
                    int i10 = asBinder + 17;
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 4 % 3;
                    }
                    int i12 = 0;
                    long j8 = j2;
                    while (true) {
                        int i13 = asBinder + i5;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        for (int i15 = 0; i15 != 8; i15++) {
                            i = (((((int) (j8 >> i15)) & 255) + (i << 6)) + (i << 16)) - i;
                        }
                        if (i12 != 0) {
                            break;
                        }
                        i12++;
                        j8 = j7;
                        i5 = 3;
                    }
                    if (i == i3) {
                        break;
                    }
                    int i16 = asBinder + 77;
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        j2 += 1024;
                        i4 += 28;
                    } else {
                        j2 -= 1024;
                        i4++;
                    }
                    f = 0.0f;
                }
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContracts.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
            }

            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r6, byte r7, byte r8) {
                /*
                    byte[] r0 = com.bpjstku.presentation.about.AboutActivity$special$$inlined$viewModel$default$1.$$c
                    int r8 = r8 * 3
                    int r8 = r8 + 108
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    int r6 = r6 * 2
                    int r6 = 3 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L19
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L2f
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r8
                    int r6 = r6 + 1
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L29:
                    r3 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r3
                    r3 = r5
                L2f:
                    int r6 = r6 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.AboutActivity$special$$inlined$viewModel$default$1.$$e(short, byte, byte):java.lang.String");
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAboutBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f448a + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AboutActivity$bindingInflater$1 aboutActivity$bindingInflater$1 = AboutActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            return aboutActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f448a;
        int i3 = i2 + 37;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i2 + 45;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        f448a = i2 % 128;
        int i3 = i2 % 2;
        AboutActivity aboutActivity = this;
        Intrinsics.checkNotNullParameter(aboutActivity, "");
        aboutActivity.getWindow().addFlags(8192);
        int i4 = f448a + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityResultContracts) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new Observer() { // from class: ActivityResultContract
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AboutActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f448a + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        final ActivityResultContracts activityResultContracts = (ActivityResultContracts) this.TuitionPaymentFragmentbindingInflater1.getValue();
        MutableLiveData<VirtualCameraAdapter1<About>> mutableLiveData = activityResultContracts.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(activityResultContracts.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AboutEventRequest(0, 1, null))));
        final Function1 function1 = new Function1() { // from class: ActivityResultContractsGetContent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContracts.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityResultContracts, (About) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ActivityResultContractsGetMultipleContents
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ActivityResultContractsCaptureVideo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContracts.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContracts, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ActivityResultContractsCreateDocument
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        activityResultContracts.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = asInterface + 27;
        f448a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
            int i2 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
            byte b2 = $$a[7];
            short s = b2;
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s | 37), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, threadPriority, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr3 = new Object[1];
                c((short) ($$b - 4), (byte) 52, $$a[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i3, absoluteGravity, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iMyPid = Process.myPid();
            int i4 = (((((~(536674010 | iMyPid)) | 272662528) * 449) + 623250516) + (((~((~iMyPid) | 536674010)) | 272662528) * 449)) - 1655146915;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{2311, 64386, 50344, 37311, 37926, 55283, 25657, 30705, 11762, 44608, 59592, 35844, 64734, 43082, 42906, 221, 40472, 27906}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{1681, 32822, 6073, 22376, 48336, 35299, 25506, 47161, 15869, 12440, 58462, 44310, 6094, 52399, 15293, 21204, 6413, 7344}, 16 - (KeyEvent.getMaxKeyCode() >> 16), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {683443817};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 42050), MotionEvent.axisFromString("") + 1727, TextUtils.indexOf((CharSequence) "", '0') + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1655146915, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
                    Object[] objArr8 = new Object[1];
                    c((short) ($$b - 4), (byte) 52, $$a[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, capsMode, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{12118, 30747, 57143, 42408, 41478, 8316, 25204, 15343, 39580, 33361, 43446, 17610, 43848, 32256, 35469, 39040, 36904, 42781, 56729, 50018, 50013, 65151, 23105, 62072}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_far).substring(0, 25).codePointAt(8) - 10, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{23657, 37494, 13423, 26699, 52693, 12072, 19309, 25432, 49082, 22430, 47639, 50414, 56582, 56832, 64843, 34024, 57105, 38553}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step1).substring(28, 30).length() + 13, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                        int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                        Object[] objArr11 = new Object[1];
                        c((short) 89, (byte) 52, $$a[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, windowTouchSlop, i7, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 1755;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                        byte b3 = $$a[7];
                        short s2 = b3;
                        Object[] objArr12 = new Object[1];
                        c(s2, (byte) (s2 | 37), b3, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, deadChar, maximumDrawingCacheSize, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i8 = asInterface + 79;
                    f448a = i8 % 128;
                    int i9 = i8 % 2;
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
        int i10 = ((int[]) objArrB$7879113[1])[0];
        int i11 = ((int[]) objArrB$7879113[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iMyTid = Process.myTid();
            int i13 = i12 + 808568798 + ((~(200797689 | iMyTid)) * (-301)) + (((~((-28811722) | iMyTid)) | (~((~iMyTid) | 183790704))) * (-301)) + (((~(iMyTid | (-183790705))) | (-28811722)) * 301);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i16 = asInterface + 53;
                f448a = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i11];
            int i18 = i11 - 1;
            iArr[i18] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i18) % 2) - 1], 1).show();
            int i19 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = i19 + 631833220 + (((~(iIdentityHashCode | 847771521)) | 89655366) * 305) + (((~((~iIdentityHashCode) | 847771521)) | 635169095) * 305);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int iMyTid2 = 1031 - (Process.myTid() >> 22);
            int i23 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
            Object[] objArr15 = new Object[1];
            c((short) 141, (byte) 52, $$a[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, iMyTid2, i23, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{12118, 30747, 57143, 42408, 41478, 8316, 25204, 15343, 39580, 33361, 43446, 17610, 43848, 32256, 35469, 39040, 36904, 42781, 56729, 50018, 50013, 65151, 23105, 62072}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_shopeepay_qris).substring(0, 10).length() + 12, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{23657, 37494, 13423, 26699, 52693, 12072, 19309, 25432, 49082, 22430, 47639, 50414, 56582, 56832, 64843, 34024, 57105, 38553}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 91, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
            int i24 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr18 = new Object[1];
            c((short) ($$b - 4), (byte) 52, $$a[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, packedPositionType, i24, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int windowTouchSlop2 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int gidForName = 14 - Process.getGidForName("");
                byte[] bArr = $$a;
                Object[] objArr19 = new Object[1];
                c((short) 193, bArr[7], bArr[5], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, windowTouchSlop2, gidForName, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i27 = ~iElapsedRealtime;
            int i28 = ~((-700039319) | i27);
            int i29 = ~(455759148 | iElapsedRealtime);
            int i30 = 1517103762 + ((i28 | i29) * 1150) + (((~((-455759149) | i27)) | i29) * (-575)) + (((~(iElapsedRealtime | (-700039319))) | (~(i27 | 700039318))) * 575) + 1437682355;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{2311, 64386, 50344, 37311, 37926, 55283, 25657, 30705, 11762, 44608, 59592, 35844, 64734, 43082, 42906, 221, 40472, 27906}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_redirecting_to_shopee).substring(1, 2).length() + 15, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{1681, 32822, 6073, 22376, 48336, 35299, 25506, 47161, 15869, 12440, 58462, 44310, 6094, 52399, 15293, 21204, 6413, 7344}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_frame_your_face_out_of_box).substring(15, 16).length() + 15, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {683443817};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46037), (Process.myTid() >> 22) + 1134, 18 - Gravity.getAbsoluteGravity(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 1437682355, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int iRgb = Color.rgb(0, 0, 0) + 16778247;
                int mode = 15 - View.MeasureSpec.getMode(0);
                Object[] objArr25 = new Object[1];
                c((short) 141, (byte) 52, $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(packedPositionType2, iRgb, mode, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getSize(0) + 45993), Color.alpha(0) + 1117, 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                int absoluteGravity2 = 15 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr27 = new Object[1];
                c((short) 193, bArr2[7], bArr2[5], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf2, trimmedLength, absoluteGravity2, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{12118, 30747, 57143, 42408, 41478, 8316, 25204, 15343, 39580, 33361, 43446, 17610, 43848, 32256, 35469, 39040, 36904, 42781, 56729, 50018, 50013, 65151, 23105, 62072}, 21 - ImageFormat.getBitsPerPixel(0), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{23657, 37494, 13423, 26699, 52693, 12072, 19309, 25432, 49082, 22430, 47639, 50414, 56582, 56832, 64843, 34024, 57105, 38553}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_5).substring(16, 17).codePointAt(0) - 101, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                    int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                    int iMyPid2 = 15 - (Process.myPid() >> 22);
                    Object[] objArr30 = new Object[1];
                    c((short) ($$b - 4), (byte) 52, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(deadChar2, iCombineMeasuredStates, iMyPid2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i33 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iMyPid3 = 15 - (Process.myPid() >> 22);
                    Object[] objArr31 = new Object[1];
                    c((short) 141, (byte) 52, $$a[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(threadPriority2, i33, iMyPid3, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArr[1])[0];
        int i35 = ((int[]) objArr[3])[0];
        if (i35 == i34) {
            int i36 = f448a + 37;
            asInterface = i36 % 128;
            int i37 = i36 % 2;
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i41 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i42 = ~i41;
            int i43 = i38 + 1214321677 + (((~((-11761484) | i42)) | 256041653) * (-328)) + ((i41 | 256041653) * 164) + (((~(i41 | 11761483)) | 255885492 | (~(i42 | (-11605323)))) * 164);
            int i44 = i43 ^ (i43 << 13);
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr32[2])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i46 = f448a + 45;
            asInterface = i46 % 128;
            int i47 = i46 % 2 == 0 ? 1 : 0;
            while (i47 < strArr4.length) {
                int i48 = f448a + 83;
                asInterface = i48 % 128;
                if (i48 % 2 == 0) {
                    arrayList2.add(strArr4[i47]);
                    i47 += 69;
                } else {
                    arrayList2.add(strArr4[i47]);
                    i47++;
                }
            }
        }
        Toast.makeText((Context) null, i35 / (((i35 - 1) * i35) % 2), 0).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i49 = ((int[]) objArr[2])[0];
        int i50 = ((int[]) objArr[3])[0];
        int i51 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i52 = ~iIdentityHashCode2;
        int i53 = i49 + 973583127 + (((~((-959700026) | i52)) | (~(715419855 | iIdentityHashCode2))) * 217) + (((~(iIdentityHashCode2 | (-959700026))) | 286493744) * 217) + (((~(715419855 | i52)) | 959700025) * 217);
        int i54 = (i53 << 13) ^ i53;
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr33[2])[0] = i55 ^ (i55 << 5);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = 58224;
            char c = 1;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $11 + 77;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) asBinder) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(g);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cGreen = (char) (47773 - Color.green(i3));
                        int bitsPerPixel = 467 - ImageFormat.getBitsPerPixel(i3);
                        int threadPriority = 13 - ((Process.getThreadPriority(i3) + 20) >> 6);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, bitsPerPixel, threadPriority, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getPressedStateDuration() >> 16)), 468 - Color.argb(0, 0, 0, 0), 13 - (ViewConfiguration.getPressedStateDuration() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), 2324 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -181527020
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
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.AboutActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        f448a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i4 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i5 = ~(264651944 | i4);
            if (i3 != 1367494280 + ((i5 | (-1094639488)) * 764) + (((~(i4 | (-1094639488))) | 17187880) * (-1528)) + (((-1324915672) | i5) * 764)) {
                throw null;
            }
        } else {
            int i6 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i8 = ~i7;
            if (i6 != ((((~(1408872379 | i8)) | (~((-1117298689) | i7))) * 988) - 913558404) + (((~(i7 | 1121561234)) | 287311145 | (~(i8 | (-1117298689)))) * 988)) {
                throw null;
            }
        }
        int i9 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        if (i9 != (-920531508) + (((-1629626369) | i10) * 184) + (((~(i10 | 479040446)) | (-1638277665)) * 184)) {
            throw new RuntimeException("-1347958210");
        }
        super.onStart();
        int i11 = f448a + 11;
        asInterface = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        f448a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 511395737;
        int i5 = ~length;
        if (i4 != (-350803016) + (((~((-1424724462) | i5)) | 594736918) * (-328)) + ((length | 594736918) * 164) + (((~(length | 1424724461)) | 588277266 | (~(i5 | (-1418264810)))) * 164)) {
            int i6 = 2094706826 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i9 = ~i8;
        int i10 = (-2079977188) + (((~((-537526371) | i9)) | (~(1747583082 | i8))) * 520);
        int i11 = ~((-1747583083) | i9);
        int i12 = ~(i8 | 831472882);
        if (i7 != i10 + ((i11 | i12) * (-1040)) + ((i12 | (~(i9 | (-831472883))) | 1210056712) * 520)) {
            int i13 = f448a + 81;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            int[] iArr = new int[522177747];
            iArr[522177746] = 1;
            int i15 = 970664214 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onCreate(bundle);
        int i16 = f448a + 113;
        asInterface = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if ((r8 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r1 = r1 + 107;
        com.bpjstku.presentation.about.AboutActivity.f448a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r7 = ((com.bpjstku.databinding.ActivityAboutBinding) ((androidx.viewbinding.ViewBinding) r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msv;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r7.setViewState(com.kennyc.view.MultiStateView.ViewState.EMPTY);
        r7 = kotlin.Unit.INSTANCE;
        r7 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r7 = ((com.bpjstku.databinding.ActivityAboutBinding) ((androidx.viewbinding.ViewBinding) r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msv;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r7.setViewState(com.kennyc.view.MultiStateView.ViewState.EMPTY);
        r7 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r7 = com.bpjstku.presentation.about.AboutActivity.f448a + 41;
        com.bpjstku.presentation.about.AboutActivity.asInterface = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if ((r7 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if ((r8 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        r0 = ((com.bpjstku.databinding.ActivityAboutBinding) ((androidx.viewbinding.ViewBinding) r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msv;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        defpackage.getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(r0, null, null, null, null);
        r8 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r8).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r8, "");
        r7 = android.widget.Toast.makeText(r7, r8, 0);
        r7.show();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if ((r8 instanceof VirtualCameraAdapter1.asBinder) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        r1 = ((com.bpjstku.databinding.ActivityAboutBinding) ((androidx.viewbinding.ViewBinding) r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msv;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1.setViewState(com.kennyc.view.MultiStateView.ViewState.CONTENT);
        r7.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (com.bpjstku.domain.about.model.About) ((VirtualCameraAdapter1.asBinder) r8).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        r8 = (com.bpjstku.databinding.ActivityAboutBinding) ((androidx.viewbinding.ViewBinding) r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        r7 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        r1 = com.bpjstku.presentation.about.AboutActivity.asInterface + 25;
        com.bpjstku.presentation.about.AboutActivity.f448a = r1 % 128;
        r1 = r1 % 2;
        r8.tvAbout.setText(r7.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        r8.tvPhone.setText(r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        r8.tvEmail.setText(r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        r7 = com.bpjstku.presentation.about.AboutActivity.asInterface + 115;
        com.bpjstku.presentation.about.AboutActivity.f448a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        r7 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0112, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        r7 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((r8 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((r8 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3 = r3 + 119;
        com.bpjstku.presentation.about.AboutActivity.asInterface = r3 % 128;
        r3 = r3 % 2;
        r7 = ((com.bpjstku.databinding.ActivityAboutBinding) ((androidx.viewbinding.ViewBinding) r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msv;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r7.setViewState(com.kennyc.view.MultiStateView.ViewState.LOADING);
        r7 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.bpjstku.presentation.about.AboutActivity r7, defpackage.VirtualCameraAdapter1 r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.AboutActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.bpjstku.presentation.about.AboutActivity, VirtualCameraAdapter1):void");
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentbindingInflater1 = SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1524500141, 1524500141, new Object[]{this}, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f448a + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(450427744, -450427743, new Object[]{this}, CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        f448a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = f448a + 7;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f448a + 99;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f448a + 53;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, short r6, short r7) {
        /*
            byte[] r0 = com.bpjstku.presentation.about.AboutActivity.$$c
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r5 = r5 + 108
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.AboutActivity.$$i(byte, short, short):java.lang.String");
    }
}
