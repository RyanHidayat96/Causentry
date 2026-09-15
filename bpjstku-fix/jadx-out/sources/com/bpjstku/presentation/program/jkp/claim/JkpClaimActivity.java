package com.bpjstku.presentation.program.jkp.claim;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
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
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJkpBiometricBinding;
import com.bpjstku.presentation.program.jkp.claim.JkpClaimActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_common.zzjq;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.r8lambda1GtIzncz4245_HpTJbEZFoVqMQY;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.wrapCallback;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001bR\u0015\u0010\u0014\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/claim/JkpClaimActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJkpBiometricBinding;", "<init>", "()V", "", "b", "asInterface", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/io/File;", "LoutputFormatToAudioProfile;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LacquireBuffer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkpClaimActivity extends BindingBaseActivity<ActivityJkpBiometricBinding> {
    private static int asBinder;
    private static int asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private File b;
    private static final byte[] $$c = {82, Base64.padSymbol, -66, -42};
    private static final int $$f = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {21, -108, 100, 114, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 255;
    private static int g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f604a = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: applyImplementationOptionToCaptureBuilder
        private static final byte[] $$c = {109, 48, -62, 38};
        private static final int $$d = 249;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {46, 47, -18, 64, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 173;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] b = {60047, 60058, 60051, 59751, 60118, 60035, 60053, 60057, 60082, 60040, 59746, 59749, 60117, 60059, 60063, 60050, 59747, 60052, 59744, 60062, 60043, 59745, 60056, 59748, 60055, 60090, 60061, 60116, 60048, 60049, 60046, 60054, 60041, 60088, 60060, 60106};
        private static char TuitionPaymentFragmentbindingInflater1 = 57191;

        private static void c(byte b2, short s, short s2, Object[] objArr) {
            int i = 144 - s2;
            byte[] bArr = $$a;
            int i2 = (s * 14) + 84;
            byte[] bArr2 = new byte[b2 + 1];
            int i3 = -1;
            if (bArr == null) {
                i2 = (b2 + (-i)) - 11;
                i = i;
                i3 = -1;
            }
            while (true) {
                int i4 = i3 + 1;
                bArr2[i4] = (byte) i2;
                if (i4 == b2) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i5 = i + 1;
                i2 = (i2 + (-bArr[i5])) - 11;
                i = i5;
                i3 = i4;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            outputFormatToAudioProfile outputformattoaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                outputformattoaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault2 = JkpClaimActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i3 = 32 / 0;
            } else {
                outputformattoaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault2 = JkpClaimActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return outputformattoaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = b;
            int i4 = 1770390596;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 33 - View.MeasureSpec.getMode(0), -1927765101, false, $$e(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i5++;
                        i4 = 1770390596;
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
            try {
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 2267 - (Process.myTid() >> 22), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, -1927765101, false, $$e(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
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
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getTapTimeout() >> 16)), 3261 - (ViewConfiguration.getPressedStateDuration() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 31, -127612708, false, $$e(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                int i6 = $11 + 55;
                                $10 = i6 % 128;
                                int i7 = i6 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22878), ExpandableListView.getPackedPositionChild(0L) + 595, 17 - TextUtils.indexOf("", "", 0, 0), 1570859318, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i8 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i8];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i9 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i9];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                                } else {
                                    int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                int i13 = 0;
                while (i13 < i) {
                    int i14 = $11 + 13;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[i13] = (char) (cArr4[i13] ^ 24059);
                        i13 += 16;
                    } else {
                        cArr4[i13] = (char) (cArr4[i13] ^ 13722);
                        i13++;
                    }
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0756  */
        /* JADX WARN: Code duplicated, block: B:110:0x0782  */
        /* JADX WARN: Code duplicated, block: B:111:0x078a  */
        /* JADX WARN: Code duplicated, block: B:114:0x0799  */
        /* JADX WARN: Code duplicated, block: B:115:0x07a0  */
        /* JADX WARN: Code duplicated, block: B:118:0x07af  */
        /* JADX WARN: Code duplicated, block: B:119:0x07b6  */
        /* JADX WARN: Code duplicated, block: B:143:0x033e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x0333  */
        /* JADX WARN: Code duplicated, block: B:36:0x0339  */
        /* JADX WARN: Code duplicated, block: B:39:0x0344 A[Catch: Exception -> 0x076f, TRY_LEAVE, TryCatch #1 {Exception -> 0x076f, blocks: (B:37:0x033e, B:39:0x0344, B:43:0x03a2), top: B:143:0x033e }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0361  */
        /* JADX WARN: Code duplicated, block: B:46:0x03be A[Catch: all -> 0x04fa, TryCatch #4 {all -> 0x04fa, blocks: (B:44:0x03b1, B:46:0x03be, B:47:0x03fb), top: B:149:0x03b1, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0459  */
        /* JADX WARN: Code duplicated, block: B:52:0x04ae A[Catch: Exception -> 0x0771, TryCatch #7 {Exception -> 0x0771, blocks: (B:51:0x045e, B:52:0x04ae, B:54:0x04fb, B:56:0x0503, B:57:0x0504, B:59:0x0508, B:60:0x050b, B:64:0x0511, B:70:0x05a4, B:79:0x0657, B:84:0x06c3, B:88:0x06ce, B:90:0x06d4, B:91:0x06d5, B:92:0x06d6, B:97:0x0744, B:102:0x0767, B:104:0x076d, B:105:0x076e, B:93:0x06f4, B:95:0x0701, B:96:0x073d, B:44:0x03b1, B:46:0x03be, B:47:0x03fb, B:80:0x066d, B:82:0x067a, B:83:0x06bc), top: B:155:0x0342, inners: #3, #4, #6 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0505  */
        /* JADX WARN: Code duplicated, block: B:63:0x050e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0535  */
        /* JADX WARN: Code duplicated, block: B:68:0x0556  */
        /* JADX WARN: Code duplicated, block: B:73:0x05d4  */
        /* JADX WARN: Code duplicated, block: B:75:0x05e8  */
        /* JADX WARN: Code duplicated, block: B:78:0x0648  */
        /* JADX WARN: Code duplicated, block: B:82:0x067a A[Catch: all -> 0x06cd, TryCatch #6 {all -> 0x06cd, blocks: (B:80:0x066d, B:82:0x067a, B:83:0x06bc), top: B:153:0x066d, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:86:0x06cb  */
        /* JADX WARN: Code duplicated, block: B:92:0x06d6 A[Catch: Exception -> 0x0771, TRY_LEAVE, TryCatch #7 {Exception -> 0x0771, blocks: (B:51:0x045e, B:52:0x04ae, B:54:0x04fb, B:56:0x0503, B:57:0x0504, B:59:0x0508, B:60:0x050b, B:64:0x0511, B:70:0x05a4, B:79:0x0657, B:84:0x06c3, B:88:0x06ce, B:90:0x06d4, B:91:0x06d5, B:92:0x06d6, B:97:0x0744, B:102:0x0767, B:104:0x076d, B:105:0x076e, B:93:0x06f4, B:95:0x0701, B:96:0x073d, B:44:0x03b1, B:46:0x03be, B:47:0x03fb, B:80:0x066d, B:82:0x067a, B:83:0x06bc), top: B:155:0x0342, inners: #3, #4, #6 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x0701 A[Catch: all -> 0x0766, TryCatch #3 {all -> 0x0766, blocks: (B:93:0x06f4, B:95:0x0701, B:96:0x073d), top: B:147:0x06f4, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:99:0x074a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r27v0, types: [android.content.Context, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r27v1 */
        /* JADX WARN: Type inference failed for: r27v11 */
        /* JADX WARN: Type inference failed for: r27v12 */
        /* JADX WARN: Type inference failed for: r27v13 */
        /* JADX WARN: Type inference failed for: r27v14 */
        /* JADX WARN: Type inference failed for: r27v15 */
        /* JADX WARN: Type inference failed for: r27v2 */
        /* JADX WARN: Type inference failed for: r27v3 */
        /* JADX WARN: Type inference failed for: r27v4 */
        /* JADX WARN: Type inference failed for: r27v5 */
        /* JADX WARN: Type inference failed for: r27v6 */
        /* JADX WARN: Type inference failed for: r27v7 */
        /* JADX WARN: Type inference failed for: r2v1 */
        public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            ?? r27;
            int i6;
            int i7;
            int iB;
            int i8;
            int i9;
            ?? r28;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int iB2;
            int i22;
            int i23;
            int i24;
            int i25;
            String str;
            char[] cArr;
            int iGreen;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            char[] cArr2;
            int i33;
            int i34;
            int i35;
            int i36;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i37;
            long j;
            int i38;
            int i39 = 2 % 2;
            int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
            int i41 = i40 % 2;
            if (context != 0) {
                try {
                    int i42 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i43 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iB3 = zzjq.b();
                    int i44 = i43 * 615;
                    int i45 = ((i44 | (-14099)) << 1) - (i44 ^ (-14099));
                    int i46 = ~i43;
                    int i47 = ~(i46 | 23);
                    int i48 = (iB3 ^ i47) | (i47 & iB3);
                    int i49 = ~(((-24) ^ i43) | ((-24) & i43));
                    int i50 = ((i49 & i48) | (i48 ^ i49)) * 614;
                    int i51 = (i45 ^ i50) + ((i50 & i45) << 1);
                    int i52 = ~i43;
                    int i53 = ~iB3;
                    int i54 = (~((i52 ^ 23) | (i52 & 23))) | (~((i52 ^ i53) | (i52 & i53)));
                    int i55 = ~iB3;
                    int i56 = ~(i55 | 23);
                    int i57 = -(-(((i54 ^ i56) | (i54 & i56)) * (-1228)));
                    int i58 = ((i51 | i57) << 1) - (i57 ^ i51);
                    int i59 = ~((i46 ^ (-24)) | (i46 & (-24)) | i53);
                    int i60 = (i55 ^ i43) | (i55 & i43);
                    int i61 = ~((i60 & 23) | (i60 ^ 23));
                    int i62 = ((i59 & i61) | (i59 ^ i61)) * 614;
                    int i63 = (i58 & i62) + (i62 | i58);
                    Object[] objArr3 = new Object[1];
                    a(new char[]{0, 7, 20, 2, '\f', 16, 15, '\r', 23, 16, '\f', 6, 18, 7, 6, 18, '#', 15, '\f', 6, 23, 1, 13844}, (byte) ((i42 ^ 38) + ((i42 & 38) << 1)), i63, objArr3);
                    String str2 = (String) objArr3[0];
                    int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i64 % 128;
                    int i65 = i64 % 2;
                    Class<?> cls = Class.forName(str2);
                    char[] cArr3 = {31, 22, 1, 24, 13911, 13911, 27, '\f', 19, 4, 3, '\f', '\f', 11, '\t', 7, 29, 14};
                    int i66 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iB4 = zzjq.b();
                    int i67 = i66 * 567;
                    int i68 = ((i67 | (-62150)) << 1) - (i67 ^ (-62150));
                    int i69 = ~i66;
                    int i70 = ~((i69 ^ 110) | (i69 & 110));
                    int i71 = ~((i69 ^ iB4) | (i69 & iB4));
                    int i72 = -(-(((i70 & i71) | (i70 ^ i71)) * (-566)));
                    int i73 = (((i68 | i72) << 1) - (i72 ^ i68)) + ((~((i66 & (-111)) | ((-111) ^ i66))) * 566);
                    int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i74 % 128;
                    int i75 = i74 % 2;
                    int i76 = (i69 ^ (-111)) | (i69 & (-111));
                    int i77 = (~((i76 & iB4) | (i76 ^ iB4))) * 566;
                    byte b2 = (byte) ((i73 ^ i77) + ((i77 & i73) << 1));
                    int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                    int iB5 = zzjq.b();
                    int i78 = (fadingEdgeLength * (-167)) - 3006;
                    int i79 = ~fadingEdgeLength;
                    int i80 = ~((i79 & (-19)) | (i79 ^ (-19)));
                    int i81 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i82 = ((i81 | 77) << 1) - (i81 ^ 77);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i82 % 128;
                    int i83 = i82 % 2;
                    int i84 = ~(((-19) ^ iB5) | ((-19) & iB5));
                    int i85 = 336 * ((i80 ^ i84) | (i80 & i84));
                    int i86 = (i78 & i85) + (i78 | i85);
                    int i87 = ~((fadingEdgeLength ^ 18) | (fadingEdgeLength & 18));
                    int i88 = ~((fadingEdgeLength ^ iB5) | (fadingEdgeLength & iB5));
                    int i89 = i86 + (((i87 ^ i88) | (i87 & i88)) * (-168));
                    int i90 = ~(fadingEdgeLength | (~iB5));
                    int i91 = ((i90 & (-19)) | ((-19) ^ i90)) * 168;
                    int i92 = ((i89 | i91) << 1) - (i91 ^ i89);
                    Object[] objArr4 = new Object[1];
                    a(cArr3, b2, i92, objArr4);
                    Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                    byte bMakeMeasureSpec = (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 14);
                    int i93 = -MotionEvent.axisFromString("");
                    int i94 = (i93 * (-523)) + 8679;
                    int i95 = ~i93;
                    int i96 = ~((i95 & 33) | (i95 ^ 33));
                    int i97 = ~(((-34) ^ i93) | ((-34) & i93));
                    int i98 = (i96 & i97) | (i96 ^ i97);
                    int i99 = ~(((-34) ^ i) | ((-34) & i));
                    int i100 = ((i98 & i99) | (i98 ^ i99)) * 262;
                    int i101 = (i94 & i100) + (i94 | i100);
                    int i102 = ((-34) & i93) | ((-34) ^ i93);
                    int i103 = (i101 - (~(-(-((~i102) * (-786)))))) - 1;
                    int i104 = ~i;
                    int i105 = ~((-34) | i104);
                    int i106 = ~i93;
                    int i107 = (~((i106 & 33) | (i106 ^ 33))) | i105;
                    int i108 = ~i102;
                    int i109 = i103 + (((i107 & i108) | (i107 ^ i108)) * 262);
                    Object[] objArr5 = new Object[1];
                    a(new char[]{0, 7, 20, 2, '\f', 16, 15, '\r', 23, 16, '\f', 6, 18, 7, 6, 18, 19, ' ', '\r', 24, 13816, 13816, 27, '\f', 19, 4, 3, '\f', '\f', 11, '\t', 7, 29, 14}, bMakeMeasureSpec, i109, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    int i110 = -((byte) KeyEvent.getModifierMetaStateMask());
                    int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                    int i111 = (edgeSlop ^ 5) + ((edgeSlop & 5) << 1);
                    Object[] objArr6 = new Object[1];
                    a(new char[]{27, 25, 4, 31, 13891}, (byte) ((i110 & 89) + (i110 | 89)), i111, objArr6);
                    int i112 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                    int i113 = -i112;
                    int i114 = ((i112 & i113) | (i112 ^ i113)) >> 31;
                    i4 = (i114 & ((i & (-2)) | (i104 & 1))) | ((~i114) & i);
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
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char tapTimeout = (char) (16949 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i115 = 2740 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i116 = 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b3 = $$a[7];
                    Object[] objArr7 = new Object[1];
                    c((byte) 52, b3, (short) (b3 | 141), objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, i115, i116, 1501733736, false, (String) objArr7[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                int i117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i118 = (i117 & 97) + (i117 | 97);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i118 % 128;
                int i119 = i118 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cCombineMeasuredStates = (char) (16949 - View.combineMeasuredStates(0, 0));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2739;
                    int i120 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12;
                    byte b4 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((byte) 52, b4, (short) (b4 | 89), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, longPressTimeout, i120, 47863026, false, (String) objArr8[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (16949 - TextUtils.indexOf("", "", 0, 0));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2739;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 13;
                        byte b5 = (byte) ($$b & 119);
                        byte b6 = $$a[7];
                        Object[] objArr9 = new Object[1];
                        c(b5, b6, (short) (b6 | 37), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iResolveSizeAndState, deadChar, 631063962, false, (String) objArr9[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            cArr2 = new char[]{25, 21, 4, 18, '!', 21, '\t', '\f', 3, 24, 13878, 13878, 26, 16, 2, 16, 25, '\r', 31, '#', 31, 4, 6, 25, 18, '\r', Typography.quote, 20};
                            i33 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            i34 = (i33 * (-337)) + 21696;
                            i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
                            if (i35 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i121 = ~i33;
                            int i122 = ~i;
                            int i123 = ~((i121 & i122) | (i121 ^ i122));
                            int i124 = ~((-65) | i33);
                            int i125 = (i123 & i124) | (i123 ^ i124);
                            int i126 = ~((i33 ^ i) | (i33 & i));
                            int i127 = ((i34 - (~((-338) * ((i125 & i126) | (i125 ^ i126))))) - 1) + ((~((~i33) | 64)) * 338);
                            int i128 = ~i33;
                            i36 = ~i;
                            int i129 = ~((i128 & i36) | (i128 ^ i36));
                            int i130 = (i33 & 64) | (i33 ^ 64);
                            int i131 = ~((i130 & i) | (i130 ^ i));
                            byte b7 = (byte) ((i127 - (~(((i131 & i129) | (i129 ^ i131)) * 338))) - 1);
                            Object[] objArr10 = new Object[1];
                            a(cArr2, b7, TextUtils.indexOf("", "", 0, 0) + 28, objArr10);
                            Object[] objArr11 = {(String) objArr10[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                int iGreen2 = Color.green(0) + 993;
                                int iMyTid = (Process.myTid() >> 22) + 8;
                                byte[] bArr = $$a;
                                byte b8 = bArr[7];
                                Object[] objArr12 = new Object[1];
                                c(b8, bArr[5], b8, objArr12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar2, iGreen2, iMyTid, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11)).longValue();
                            long j2 = 916024889;
                            long j3 = -1;
                            long j4 = j2 ^ j3;
                            i37 = i4;
                            long j5 = i;
                            j = (((long) 236) * j2) + (((long) 471) * jLongValue) + (((long) (-235)) * (jLongValue | ((j4 | (j5 ^ j3)) ^ j3))) + (((long) (-470)) * (jLongValue | ((j4 | j5) ^ j3))) + (((long) 235) * (((j5 | (j4 | jLongValue)) ^ j3) | (((jLongValue ^ j3) | j2) ^ j3))) + ((long) (-1116943126));
                            int i132 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i38 = (i132 & 45) + (i132 | 45);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                            if (i38 % 2 != 0) {
                                int i133 = (int) (j >>> 73);
                                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                int i134 = ~iElapsedRealtime;
                                int i135 = i133 & ((-712429613) + (((~(1167686736 | i134)) | (~((-1690054149) | iElapsedRealtime))) * 333) + (((~(iElapsedRealtime | 1167686736)) | (~(i134 | (-1690054149)))) * 333));
                                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                int i136 = ~iUptimeMillis;
                                i9 = i135 | (((int) j) & ((-635053777) + (((~(1045564943 | i136)) | (~(391661466 | iUptimeMillis))) * (-370)) + (((~(iUptimeMillis | 1045564943)) | (~(i136 | 391661466)) | 374343178) * (-370)) + 1068022388));
                                r28 = i37;
                            } else {
                                int i137 = ((int) (j >> 32)) & ((((~((-27295809) | i)) | 537199880) * 449) + 697155418 + ((537199880 | (~((-27295809) | i36))) * 449));
                                int iMyUid = Process.myUid();
                                int i138 = ((int) j) & ((-635053948) + (((-268698626) | iMyUid) * (-627)) + (((~(313427125 | iMyUid)) | (-1123799285)) * (-627)) + (((~(iMyUid | (-1123799285))) | (~((~iMyUid) | (-313427126)))) * 627));
                                i9 = (i137 & i138) | (i137 ^ i138);
                                r28 = i37;
                            }
                            i9 = 0;
                            r28 = context;
                        } else {
                            context = i4;
                            char[] cArr4 = {13830};
                            i21 = -TextUtils.getOffsetBefore("", 0);
                            iB2 = zzjq.b();
                            i22 = i21 * (-500);
                            int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i23 = (i139 & 91) + (i139 | 91);
                            int i140 = i23 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i140;
                            if (i23 % 2 != 0) {
                                int i141 = i22 << (-45500);
                                int i142 = ~(((-92) & i21) | ((-92) ^ i21));
                                int i143 = ~i21;
                                int i144 = (i143 & 91) | (i143 ^ 91);
                                int i145 = ~((i144 & iB2) | (i144 ^ iB2));
                                int i146 = -(-(TypedValues.PositionType.TYPE_TRANSITION_EASING << ((i142 & i145) | (i142 ^ i145))));
                                i24 = i141 & i146;
                                i25 = i141 | i146;
                            } else {
                                int i147 = i22 - 45500;
                                int i148 = ~(((-92) & i21) | ((-92) ^ i21));
                                int i149 = ~i21;
                                int i150 = (i149 & 91) | (i149 ^ 91);
                                int i151 = ~((i150 & iB2) | (i150 ^ iB2));
                                int i152 = -(-(((i148 & i151) | (i148 ^ i151)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                i24 = i147 ^ i152;
                                i25 = (i147 & i152) << 1;
                            }
                            int i153 = ~i21;
                            int i154 = ((i24 + i25) - (~(1002 * (~((i153 ^ (-92)) | (i153 & (-92))))))) - 1;
                            int i155 = ~iB2;
                            int i156 = (i153 & i155) | (i153 ^ i155);
                            byte b9 = (byte) ((i154 - (~((~((i156 & 91) | (i156 ^ 91))) * TypedValues.PositionType.TYPE_TRANSITION_EASING))) - 1);
                            int i157 = ((i140 | 123) << 1) - (i140 ^ 123);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i157 % 128;
                            int i158 = i157 % 2;
                            int i159 = -Color.rgb(0, 0, 0);
                            Object[] objArr13 = new Object[1];
                            a(cArr4, b9, (i159 & (-16777215)) + (i159 | (-16777215)), objArr13);
                            str = (String) objArr13[0];
                            cArr = new char[]{'#', 14, '\r', 15, 25, '\r', 31, '#', 31, 4, 6, 25, 13876};
                            iGreen = Color.green(0);
                            int i160 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i26 = ((i160 | 57) << 1) - (i160 ^ 57);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                            if (i26 % 2 == 0) {
                                i27 = (iGreen + TypedValues.Custom.TYPE_DIMENSION) >> 2047;
                                int i161 = ~iGreen;
                                i28 = ~((i161 & i) | (i161 ^ i));
                                i29 = (~i) | 53;
                            } else {
                                i27 = (iGreen * TypedValues.Custom.TYPE_DIMENSION) - 47859;
                                int i162 = ~iGreen;
                                i28 = ~((i162 & i) | (i162 ^ i));
                                int i163 = ~i;
                                i29 = (i163 & 53) | (i163 ^ 53);
                            }
                            int i164 = ~i29;
                            int i165 = i27 + ((-1808) * ((i28 & i164) | (i28 ^ i164)));
                            int i166 = ~iGreen;
                            int i167 = (i166 ^ (-54)) | (i166 & (-54));
                            int i168 = ~((i167 & i) | (i167 ^ i));
                            int i169 = ~i;
                            int i170 = (i169 ^ iGreen) | (i169 & iGreen);
                            int i171 = ~((i170 & 53) | (i170 ^ 53));
                            int i172 = ((i168 & i171) | (i168 ^ i171)) * TypedValues.Custom.TYPE_BOOLEAN;
                            i30 = (i165 ^ i172) + ((i165 & i172) << 1);
                            int i173 = ~((i166 ^ 53) | (i166 & 53));
                            int i174 = ~(((-54) & i) | ((-54) ^ i));
                            int i175 = (i173 & i174) | (i173 ^ i174);
                            int i176 = (i160 & 7) + (i160 | 7);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i176 % 128;
                            i31 = i176 % 2;
                            int i177 = ~((iGreen & i169) | (i169 ^ iGreen));
                            i32 = (i177 & i175) | (i175 ^ i177);
                            if (i31 == 0) {
                                int i178 = -(((i32 | TypedValues.Custom.TYPE_BOOLEAN) << 1) - (i32 ^ TypedValues.Custom.TYPE_BOOLEAN));
                                byte b10 = (byte) ((i30 ^ i178) + ((i178 & i30) << 1));
                                int i179 = -(-KeyEvent.getDeadChar(0, 1));
                                int i180 = (i179 ^ 56) + ((i179 & 56) << 1);
                                Object[] objArr14 = new Object[1];
                                a(cArr, b10, i180, objArr14);
                                objArr2 = new Object[]{(String) objArr14[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char minimumFlingVelocity = (char) (33602 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 3085;
                                    int i181 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                                    byte[] bArr2 = $$a;
                                    byte b11 = bArr2[7];
                                    Object[] objArr15 = new Object[1];
                                    c(b11, bArr2[5], b11, objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, pressedStateDuration, i181, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                    int i182 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i183 = ((i182 | 85) << 1) - (i182 ^ 85);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i183 % 128;
                                    int i184 = i183 % 2;
                                    i9 = 0;
                                    r28 = context;
                                } else {
                                    int i185 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i185 % 128;
                                    int i186 = i185 % 2;
                                    i9 = 1;
                                    r28 = context;
                                }
                            } else {
                                byte b12 = (byte) ((i30 - (~(-(-(i32 * TypedValues.Custom.TYPE_BOOLEAN))))) - 1);
                                int i187 = -KeyEvent.getDeadChar(0, 0);
                                int i188 = ((i187 | 13) << 1) - (i187 ^ 13);
                                Object[] objArr16 = new Object[1];
                                a(cArr, b12, i188, objArr16);
                                objArr = new Object[]{(String) objArr16[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cKeyCodeFromString = (char) (33602 - KeyEvent.keyCodeFromString(""));
                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3085;
                                    int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                                    byte[] bArr3 = $$a;
                                    byte b13 = bArr3[7];
                                    Object[] objArr17 = new Object[1];
                                    c(b13, bArr3[5], b13, objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iNormalizeMetaState, packedPositionType, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i189 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i189 % 128;
                                    int i1810 = i189 % 2;
                                    i9 = 1;
                                    r28 = context;
                                } else {
                                    int i1811 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1812 = ((i1811 | 85) << 1) - (i1811 ^ 85);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1812 % 128;
                                    int i1813 = i1812 % 2;
                                    i9 = 0;
                                    r28 = context;
                                }
                            }
                        }
                        int i190 = i ^ 10;
                        i10 = i9 | (-i9);
                        i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                        int i191 = i11 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i191;
                        if (i11 % 2 == 0) {
                            i12 = (i10 ^ 31) + ((i10 & 31) << 1);
                        } else {
                            i12 = i10 >> 31;
                        }
                        i13 = (~i12) & i;
                        i14 = i191 + 5;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                        i15 = i190 & i12;
                        if (i14 % 2 != 0) {
                            i16 = (i13 & i15) | (i13 ^ i15);
                            i17 = i2 & 63;
                        } else {
                            i16 = i13 | i15;
                            i17 = i2 & 32;
                        }
                        i18 = i191 + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                        i19 = -i17;
                        if (i18 % 2 != 0) {
                            i20 = ((i17 & i19) | (i17 ^ i19)) * 94;
                        } else {
                            i20 = ((i17 & i19) | (i17 ^ i19)) >> 31;
                        }
                        int i192 = i16 & (~i20);
                        int i193 = i20 & i;
                        i5 = (i192 & i193) | (i192 ^ i193);
                        r27 = r28;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i5 = i;
                        r27 = i4;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            cArr2 = new char[]{25, 21, 4, 18, '!', 21, '\t', '\f', 3, 24, 13878, 13878, 26, 16, 2, 16, 25, '\r', 31, '#', 31, 4, 6, 25, 18, '\r', Typography.quote, 20};
                            i33 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            i34 = (i33 * (-337)) + 21696;
                            i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
                            if (i35 % 2 != 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int i1210 = ~i33;
                            int i1211 = ~i;
                            int i1212 = ~((i1210 & i1211) | (i1210 ^ i1211));
                            int i1213 = ~((-65) | i33);
                            int i1214 = (i1212 & i1213) | (i1212 ^ i1213);
                            int i1215 = ~((i33 ^ i) | (i33 & i));
                            int i1216 = ((i34 - (~((-338) * ((i1214 & i1215) | (i1214 ^ i1215))))) - 1) + ((~((~i33) | 64)) * 338);
                            int i1217 = ~i33;
                            i36 = ~i;
                            int i1218 = ~((i1217 & i36) | (i1217 ^ i36));
                            int i1310 = (i33 & 64) | (i33 ^ 64);
                            int i1311 = ~((i1310 & i) | (i1310 ^ i));
                            byte b14 = (byte) ((i1216 - (~(((i1311 & i1218) | (i1218 ^ i1311)) * 338))) - 1);
                            Object[] objArr18 = new Object[1];
                            a(cArr2, b14, TextUtils.indexOf("", "", 0, 0) + 28, objArr18);
                            Object[] objArr19 = {(String) objArr18[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                                int iGreen3 = Color.green(0) + 993;
                                int iMyTid2 = (Process.myTid() >> 22) + 8;
                                byte[] bArr4 = $$a;
                                byte b15 = bArr4[7];
                                Object[] objArr110 = new Object[1];
                                c(b15, bArr4[5], b15, objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar3, iGreen3, iMyTid2, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                            long j6 = 916024889;
                            long j7 = -1;
                            long j8 = j6 ^ j7;
                            i37 = i4;
                            long j9 = i;
                            j = (((long) 236) * j6) + (((long) 471) * jLongValue2) + (((long) (-235)) * (jLongValue2 | ((j8 | (j9 ^ j7)) ^ j7))) + (((long) (-470)) * (jLongValue2 | ((j8 | j9) ^ j7))) + (((long) 235) * (((j9 | (j8 | jLongValue2)) ^ j7) | (((jLongValue2 ^ j7) | j6) ^ j7))) + ((long) (-1116943126));
                            int i1312 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i38 = (i1312 & 45) + (i1312 | 45);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                            if (i38 % 2 != 0) {
                                int i1313 = (int) (j >>> 73);
                                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                int i1314 = ~iElapsedRealtime2;
                                int i1315 = i1313 & ((-712429613) + (((~(1167686736 | i1314)) | (~((-1690054149) | iElapsedRealtime2))) * 333) + (((~(iElapsedRealtime2 | 1167686736)) | (~(i1314 | (-1690054149)))) * 333));
                                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                int i1316 = ~iUptimeMillis2;
                                i9 = i1315 | (((int) j) & ((-635053777) + (((~(1045564943 | i1316)) | (~(391661466 | iUptimeMillis2))) * (-370)) + (((~(iUptimeMillis2 | 1045564943)) | (~(i1316 | 391661466)) | 374343178) * (-370)) + 1068022388));
                                r28 = i37;
                            } else {
                                int i1317 = ((int) (j >> 32)) & ((((~((-27295809) | i)) | 537199880) * 449) + 697155418 + ((537199880 | (~((-27295809) | i36))) * 449));
                                int iMyUid2 = Process.myUid();
                                int i1318 = ((int) j) & ((-635053948) + (((-268698626) | iMyUid2) * (-627)) + (((~(313427125 | iMyUid2)) | (-1123799285)) * (-627)) + (((~(iMyUid2 | (-1123799285))) | (~((~iMyUid2) | (-313427126)))) * 627));
                                i9 = (i1317 & i1318) | (i1317 ^ i1318);
                                r28 = i37;
                            }
                            i9 = 0;
                            r28 = context;
                        } else {
                            context = i4;
                            char[] cArr5 = {13830};
                            i21 = -TextUtils.getOffsetBefore("", 0);
                            iB2 = zzjq.b();
                            i22 = i21 * (-500);
                            int i1319 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i23 = (i1319 & 91) + (i1319 | 91);
                            int i1410 = i23 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1410;
                            if (i23 % 2 != 0) {
                                int i1411 = i22 << (-45500);
                                int i1412 = ~(((-92) & i21) | ((-92) ^ i21));
                                int i1413 = ~i21;
                                int i1414 = (i1413 & 91) | (i1413 ^ 91);
                                int i1415 = ~((i1414 & iB2) | (i1414 ^ iB2));
                                int i1416 = -(-(TypedValues.PositionType.TYPE_TRANSITION_EASING << ((i1412 & i1415) | (i1412 ^ i1415))));
                                i24 = i1411 & i1416;
                                i25 = i1411 | i1416;
                            } else {
                                int i1417 = i22 - 45500;
                                int i1418 = ~(((-92) & i21) | ((-92) ^ i21));
                                int i1419 = ~i21;
                                int i1510 = (i1419 & 91) | (i1419 ^ 91);
                                int i1511 = ~((i1510 & iB2) | (i1510 ^ iB2));
                                int i1512 = -(-(((i1418 & i1511) | (i1418 ^ i1511)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                i24 = i1417 ^ i1512;
                                i25 = (i1417 & i1512) << 1;
                            }
                            int i1513 = ~i21;
                            int i1514 = ((i24 + i25) - (~(1002 * (~((i1513 ^ (-92)) | (i1513 & (-92))))))) - 1;
                            int i1515 = ~iB2;
                            int i1516 = (i1513 & i1515) | (i1513 ^ i1515);
                            byte b16 = (byte) ((i1514 - (~((~((i1516 & 91) | (i1516 ^ 91))) * TypedValues.PositionType.TYPE_TRANSITION_EASING))) - 1);
                            int i1517 = ((i1410 | 123) << 1) - (i1410 ^ 123);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1517 % 128;
                            int i1518 = i1517 % 2;
                            int i1519 = -Color.rgb(0, 0, 0);
                            Object[] objArr111 = new Object[1];
                            a(cArr5, b16, (i1519 & (-16777215)) + (i1519 | (-16777215)), objArr111);
                            str = (String) objArr111[0];
                            cArr = new char[]{'#', 14, '\r', 15, 25, '\r', 31, '#', 31, 4, 6, 25, 13876};
                            iGreen = Color.green(0);
                            int i1610 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i26 = ((i1610 | 57) << 1) - (i1610 ^ 57);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                            if (i26 % 2 == 0) {
                                i27 = (iGreen + TypedValues.Custom.TYPE_DIMENSION) >> 2047;
                                int i1611 = ~iGreen;
                                i28 = ~((i1611 & i) | (i1611 ^ i));
                                i29 = (~i) | 53;
                            } else {
                                i27 = (iGreen * TypedValues.Custom.TYPE_DIMENSION) - 47859;
                                int i1612 = ~iGreen;
                                i28 = ~((i1612 & i) | (i1612 ^ i));
                                int i1613 = ~i;
                                i29 = (i1613 & 53) | (i1613 ^ 53);
                            }
                            int i1614 = ~i29;
                            int i1615 = i27 + ((-1808) * ((i28 & i1614) | (i28 ^ i1614)));
                            int i1616 = ~iGreen;
                            int i1617 = (i1616 ^ (-54)) | (i1616 & (-54));
                            int i1618 = ~((i1617 & i) | (i1617 ^ i));
                            int i1619 = ~i;
                            int i1710 = (i1619 ^ iGreen) | (i1619 & iGreen);
                            int i1711 = ~((i1710 & 53) | (i1710 ^ 53));
                            int i1712 = ((i1618 & i1711) | (i1618 ^ i1711)) * TypedValues.Custom.TYPE_BOOLEAN;
                            i30 = (i1615 ^ i1712) + ((i1615 & i1712) << 1);
                            int i1713 = ~((i1616 ^ 53) | (i1616 & 53));
                            int i1714 = ~(((-54) & i) | ((-54) ^ i));
                            int i1715 = (i1713 & i1714) | (i1713 ^ i1714);
                            int i1716 = (i1610 & 7) + (i1610 | 7);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1716 % 128;
                            i31 = i1716 % 2;
                            int i1717 = ~((iGreen & i1619) | (i1619 ^ iGreen));
                            i32 = (i1717 & i1715) | (i1715 ^ i1717);
                            if (i31 == 0) {
                                int i1718 = -(((i32 | TypedValues.Custom.TYPE_BOOLEAN) << 1) - (i32 ^ TypedValues.Custom.TYPE_BOOLEAN));
                                byte b17 = (byte) ((i30 ^ i1718) + ((i1718 & i30) << 1));
                                int i1719 = -(-KeyEvent.getDeadChar(0, 1));
                                int i1814 = (i1719 ^ 56) + ((i1719 & 56) << 1);
                                Object[] objArr112 = new Object[1];
                                a(cArr, b17, i1814, objArr112);
                                objArr2 = new Object[]{(String) objArr112[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char minimumFlingVelocity2 = (char) (33602 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 3085;
                                    int i1815 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                                    byte[] bArr5 = $$a;
                                    byte b18 = bArr5[7];
                                    Object[] objArr113 = new Object[1];
                                    c(b18, bArr5[5], b18, objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity2, pressedStateDuration2, i1815, 1411172903, false, (String) objArr113[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                    int i1816 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1817 = ((i1816 | 85) << 1) - (i1816 ^ 85);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1817 % 128;
                                    int i1818 = i1817 % 2;
                                    i9 = 0;
                                    r28 = context;
                                } else {
                                    int i1819 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1819 % 128;
                                    int i18110 = i1819 % 2;
                                    i9 = 1;
                                    r28 = context;
                                }
                            } else {
                                byte b19 = (byte) ((i30 - (~(-(-(i32 * TypedValues.Custom.TYPE_BOOLEAN))))) - 1);
                                int i1820 = -KeyEvent.getDeadChar(0, 0);
                                int i1821 = ((i1820 | 13) << 1) - (i1820 ^ 13);
                                Object[] objArr114 = new Object[1];
                                a(cArr, b19, i1821, objArr114);
                                objArr = new Object[]{(String) objArr114[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cKeyCodeFromString2 = (char) (33602 - KeyEvent.keyCodeFromString(""));
                                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 3085;
                                    int packedPositionType2 = 26 - ExpandableListView.getPackedPositionType(0L);
                                    byte[] bArr6 = $$a;
                                    byte b110 = bArr6[7];
                                    Object[] objArr115 = new Object[1];
                                    c(b110, bArr6[5], b110, objArr115);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString2, iNormalizeMetaState2, packedPositionType2, 1411172903, false, (String) objArr115[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i18111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18111 % 128;
                                    int i18112 = i18111 % 2;
                                    i9 = 1;
                                    r28 = context;
                                } else {
                                    int i18113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i18114 = ((i18113 | 85) << 1) - (i18113 ^ 85);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18114 % 128;
                                    int i18115 = i18114 % 2;
                                    i9 = 0;
                                    r28 = context;
                                }
                            }
                        }
                        int i194 = i ^ 10;
                        i10 = i9 | (-i9);
                        i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                        int i195 = i11 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i195;
                        if (i11 % 2 == 0) {
                            i12 = (i10 ^ 31) + ((i10 & 31) << 1);
                        } else {
                            i12 = i10 >> 31;
                        }
                        i13 = (~i12) & i;
                        i14 = i195 + 5;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                        i15 = i194 & i12;
                        if (i14 % 2 != 0) {
                            i16 = (i13 & i15) | (i13 ^ i15);
                            i17 = i2 & 63;
                        } else {
                            i16 = i13 | i15;
                            i17 = i2 & 32;
                        }
                        i18 = i195 + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                        i19 = -i17;
                        if (i18 % 2 != 0) {
                            i20 = ((i17 & i19) | (i17 ^ i19)) * 94;
                        } else {
                            i20 = ((i17 & i19) | (i17 ^ i19)) >> 31;
                        }
                        int i196 = i16 & (~i20);
                        int i197 = i20 & i;
                        i5 = (i196 & i197) | (i196 ^ i197);
                        r27 = r28;
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = i;
                    r27 = i4;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                cArr2 = new char[]{25, 21, 4, 18, '!', 21, '\t', '\f', 3, 24, 13878, 13878, 26, 16, 2, 16, 25, '\r', 31, '#', 31, 4, 6, 25, 18, '\r', Typography.quote, 20};
                                i33 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                i34 = (i33 * (-337)) + 21696;
                                i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
                                if (i35 % 2 != 0) {
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                int i1219 = ~i33;
                                int i12110 = ~i;
                                int i12111 = ~((i1219 & i12110) | (i1219 ^ i12110));
                                int i12112 = ~((-65) | i33);
                                int i12113 = (i12111 & i12112) | (i12111 ^ i12112);
                                int i12114 = ~((i33 ^ i) | (i33 & i));
                                int i12115 = ((i34 - (~((-338) * ((i12113 & i12114) | (i12113 ^ i12114))))) - 1) + ((~((~i33) | 64)) * 338);
                                int i12116 = ~i33;
                                i36 = ~i;
                                int i12117 = ~((i12116 & i36) | (i12116 ^ i36));
                                int i13110 = (i33 & 64) | (i33 ^ 64);
                                int i13111 = ~((i13110 & i) | (i13110 ^ i));
                                byte b111 = (byte) ((i12115 - (~(((i13111 & i12117) | (i12117 ^ i13111)) * 338))) - 1);
                                Object[] objArr116 = new Object[1];
                                a(cArr2, b111, TextUtils.indexOf("", "", 0, 0) + 28, objArr116);
                                try {
                                    Object[] objArr117 = {(String) objArr116[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char deadChar4 = (char) KeyEvent.getDeadChar(0, 0);
                                        int iGreen4 = Color.green(0) + 993;
                                        int iMyTid3 = (Process.myTid() >> 22) + 8;
                                        byte[] bArr7 = $$a;
                                        byte b112 = bArr7[7];
                                        Object[] objArr118 = new Object[1];
                                        c(b112, bArr7[5], b112, objArr118);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar4, iGreen4, iMyTid3, 410748506, false, (String) objArr118[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr117)).longValue();
                                    long j10 = 916024889;
                                    long j11 = -1;
                                    long j12 = j10 ^ j11;
                                    i37 = i4;
                                    long j13 = i;
                                    j = (((long) 236) * j10) + (((long) 471) * jLongValue3) + (((long) (-235)) * (jLongValue3 | ((j12 | (j13 ^ j11)) ^ j11))) + (((long) (-470)) * (jLongValue3 | ((j12 | j13) ^ j11))) + (((long) 235) * (((j13 | (j12 | jLongValue3)) ^ j11) | (((jLongValue3 ^ j11) | j10) ^ j11))) + ((long) (-1116943126));
                                    int i13112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i38 = (i13112 & 45) + (i13112 | 45);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                                    if (i38 % 2 != 0) {
                                        int i13113 = (int) (j >>> 73);
                                        int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                        int i13114 = ~iElapsedRealtime3;
                                        int i13115 = i13113 & ((-712429613) + (((~(1167686736 | i13114)) | (~((-1690054149) | iElapsedRealtime3))) * 333) + (((~(iElapsedRealtime3 | 1167686736)) | (~(i13114 | (-1690054149)))) * 333));
                                        int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                                        int i13116 = ~iUptimeMillis3;
                                        i9 = i13115 | (((int) j) & ((-635053777) + (((~(1045564943 | i13116)) | (~(391661466 | iUptimeMillis3))) * (-370)) + (((~(iUptimeMillis3 | 1045564943)) | (~(i13116 | 391661466)) | 374343178) * (-370)) + 1068022388));
                                        r28 = i37;
                                    } else {
                                        int i13117 = ((int) (j >> 32)) & ((((~((-27295809) | i)) | 537199880) * 449) + 697155418 + ((537199880 | (~((-27295809) | i36))) * 449));
                                        int iMyUid3 = Process.myUid();
                                        int i13118 = ((int) j) & ((-635053948) + (((-268698626) | iMyUid3) * (-627)) + (((~(313427125 | iMyUid3)) | (-1123799285)) * (-627)) + (((~(iMyUid3 | (-1123799285))) | (~((~iMyUid3) | (-313427126)))) * 627));
                                        i9 = (i13117 & i13118) | (i13117 ^ i13118);
                                        r28 = i37;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                                i9 = 0;
                                r28 = context;
                            } else {
                                context = i4;
                                char[] cArr6 = {13830};
                                i21 = -TextUtils.getOffsetBefore("", 0);
                                iB2 = zzjq.b();
                                i22 = i21 * (-500);
                                int i13119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i23 = (i13119 & 91) + (i13119 | 91);
                                int i14110 = i23 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14110;
                                if (i23 % 2 != 0) {
                                    int i14111 = i22 << (-45500);
                                    int i14112 = ~(((-92) & i21) | ((-92) ^ i21));
                                    int i14113 = ~i21;
                                    int i14114 = (i14113 & 91) | (i14113 ^ 91);
                                    int i14115 = ~((i14114 & iB2) | (i14114 ^ iB2));
                                    int i14116 = -(-(TypedValues.PositionType.TYPE_TRANSITION_EASING << ((i14112 & i14115) | (i14112 ^ i14115))));
                                    i24 = i14111 & i14116;
                                    i25 = i14111 | i14116;
                                } else {
                                    int i14117 = i22 - 45500;
                                    int i14118 = ~(((-92) & i21) | ((-92) ^ i21));
                                    int i14119 = ~i21;
                                    int i15110 = (i14119 & 91) | (i14119 ^ 91);
                                    int i15111 = ~((i15110 & iB2) | (i15110 ^ iB2));
                                    int i15112 = -(-(((i14118 & i15111) | (i14118 ^ i15111)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                    i24 = i14117 ^ i15112;
                                    i25 = (i14117 & i15112) << 1;
                                }
                                int i15113 = ~i21;
                                int i15114 = ((i24 + i25) - (~(1002 * (~((i15113 ^ (-92)) | (i15113 & (-92))))))) - 1;
                                int i15115 = ~iB2;
                                int i15116 = (i15113 & i15115) | (i15113 ^ i15115);
                                byte b113 = (byte) ((i15114 - (~((~((i15116 & 91) | (i15116 ^ 91))) * TypedValues.PositionType.TYPE_TRANSITION_EASING))) - 1);
                                int i15117 = ((i14110 | 123) << 1) - (i14110 ^ 123);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15117 % 128;
                                int i15118 = i15117 % 2;
                                int i15119 = -Color.rgb(0, 0, 0);
                                Object[] objArr119 = new Object[1];
                                a(cArr6, b113, (i15119 & (-16777215)) + (i15119 | (-16777215)), objArr119);
                                str = (String) objArr119[0];
                                cArr = new char[]{'#', 14, '\r', 15, 25, '\r', 31, '#', 31, 4, 6, 25, 13876};
                                iGreen = Color.green(0);
                                int i16110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                i26 = ((i16110 | 57) << 1) - (i16110 ^ 57);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                                if (i26 % 2 == 0) {
                                    i27 = (iGreen + TypedValues.Custom.TYPE_DIMENSION) >> 2047;
                                    int i16111 = ~iGreen;
                                    i28 = ~((i16111 & i) | (i16111 ^ i));
                                    i29 = (~i) | 53;
                                } else {
                                    i27 = (iGreen * TypedValues.Custom.TYPE_DIMENSION) - 47859;
                                    int i16112 = ~iGreen;
                                    i28 = ~((i16112 & i) | (i16112 ^ i));
                                    int i16113 = ~i;
                                    i29 = (i16113 & 53) | (i16113 ^ 53);
                                }
                                int i16114 = ~i29;
                                int i16115 = i27 + ((-1808) * ((i28 & i16114) | (i28 ^ i16114)));
                                int i16116 = ~iGreen;
                                int i16117 = (i16116 ^ (-54)) | (i16116 & (-54));
                                int i16118 = ~((i16117 & i) | (i16117 ^ i));
                                int i16119 = ~i;
                                int i17110 = (i16119 ^ iGreen) | (i16119 & iGreen);
                                int i17111 = ~((i17110 & 53) | (i17110 ^ 53));
                                int i17112 = ((i16118 & i17111) | (i16118 ^ i17111)) * TypedValues.Custom.TYPE_BOOLEAN;
                                i30 = (i16115 ^ i17112) + ((i16115 & i17112) << 1);
                                int i17113 = ~((i16116 ^ 53) | (i16116 & 53));
                                int i17114 = ~(((-54) & i) | ((-54) ^ i));
                                int i17115 = (i17113 & i17114) | (i17113 ^ i17114);
                                int i17116 = (i16110 & 7) + (i16110 | 7);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17116 % 128;
                                i31 = i17116 % 2;
                                int i17117 = ~((iGreen & i16119) | (i16119 ^ iGreen));
                                i32 = (i17117 & i17115) | (i17115 ^ i17117);
                                if (i31 == 0) {
                                    int i17118 = -(((i32 | TypedValues.Custom.TYPE_BOOLEAN) << 1) - (i32 ^ TypedValues.Custom.TYPE_BOOLEAN));
                                    byte b114 = (byte) ((i30 ^ i17118) + ((i17118 & i30) << 1));
                                    int i17119 = -(-KeyEvent.getDeadChar(0, 1));
                                    int i18116 = (i17119 ^ 56) + ((i17119 & 56) << 1);
                                    Object[] objArr1110 = new Object[1];
                                    a(cArr, b114, i18116, objArr1110);
                                    try {
                                        objArr2 = new Object[]{(String) objArr1110[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char minimumFlingVelocity3 = (char) (33602 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 3085;
                                            int i18117 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                                            byte[] bArr8 = $$a;
                                            byte b115 = bArr8[7];
                                            Object[] objArr1111 = new Object[1];
                                            c(b115, bArr8[5], b115, objArr1111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity3, pressedStateDuration3, i18117, 1411172903, false, (String) objArr1111[0], new Class[]{String.class});
                                        }
                                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                            int i18118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i18119 = ((i18118 | 85) << 1) - (i18118 ^ 85);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18119 % 128;
                                            int i181110 = i18119 % 2;
                                            i9 = 0;
                                            r28 = context;
                                        } else {
                                            int i181111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i181111 % 128;
                                            int i181112 = i181111 % 2;
                                            i9 = 1;
                                            r28 = context;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                } else {
                                    byte b116 = (byte) ((i30 - (~(-(-(i32 * TypedValues.Custom.TYPE_BOOLEAN))))) - 1);
                                    int i1822 = -KeyEvent.getDeadChar(0, 0);
                                    int i1823 = ((i1822 | 13) << 1) - (i1822 ^ 13);
                                    Object[] objArr1112 = new Object[1];
                                    a(cArr, b116, i1823, objArr1112);
                                    try {
                                        objArr = new Object[]{(String) objArr1112[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cKeyCodeFromString3 = (char) (33602 - KeyEvent.keyCodeFromString(""));
                                            int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 3085;
                                            int packedPositionType3 = 26 - ExpandableListView.getPackedPositionType(0L);
                                            byte[] bArr9 = $$a;
                                            byte b117 = bArr9[7];
                                            Object[] objArr1113 = new Object[1];
                                            c(b117, bArr9[5], b117, objArr1113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString3, iNormalizeMetaState3, packedPositionType3, 1411172903, false, (String) objArr1113[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            int i181113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i181113 % 128;
                                            int i181114 = i181113 % 2;
                                            i9 = 1;
                                            r28 = context;
                                        } else {
                                            int i181115 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i181116 = ((i181115 | 85) << 1) - (i181115 ^ 85);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i181116 % 128;
                                            int i181117 = i181116 % 2;
                                            i9 = 0;
                                            r28 = context;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        context = i4;
                    }
                    int i198 = i ^ 10;
                    i10 = i9 | (-i9);
                    i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                    int i199 = i11 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i199;
                    if (i11 % 2 == 0) {
                        i12 = (i10 ^ 31) + ((i10 & 31) << 1);
                    } else {
                        i12 = i10 >> 31;
                    }
                    i13 = (~i12) & i;
                    i14 = i199 + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    i15 = i198 & i12;
                    if (i14 % 2 != 0) {
                        i16 = (i13 & i15) | (i13 ^ i15);
                        i17 = i2 & 63;
                    } else {
                        i16 = i13 | i15;
                        i17 = i2 & 32;
                    }
                    i18 = i199 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                    i19 = -i17;
                    if (i18 % 2 != 0) {
                        i20 = ((i17 & i19) | (i17 ^ i19)) * 94;
                    } else {
                        i20 = ((i17 & i19) | (i17 ^ i19)) >> 31;
                    }
                    int i1910 = i16 & (~i20);
                    int i1911 = i20 & i;
                    i5 = (i1910 & i1911) | (i1910 ^ i1911);
                    r27 = r28;
                }
                ?? r2 = i ^ r27;
                int i200 = -(r2 == true ? 1 : 0);
                int i201 = (((r2 == true ? 1 : 0) & i200) | ((r2 == true ? 1 : 0) ^ i200)) >> 31;
                int i202 = (i5 & (~i201)) | (r27 & i201);
                Object[] objArr20 = new Object[4];
                int[] iArr = new int[1];
                objArr20[0] = iArr;
                objArr20[1] = new int[1];
                int[] iArr2 = new int[1];
                objArr20[2] = iArr2;
                int i203 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                int i204 = i203 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i204;
                int i205 = i203 % 2;
                int i206 = (~i202) & i;
                if (i205 == 0) {
                    int i207 = i206 | ((~i) & i202);
                    int i208 = -i207;
                    int i209 = ((i207 & i208) | (i207 ^ i208)) / 17;
                    i6 = (i209 & 118) ^ ((~i209) & 1);
                } else {
                    int i210 = i206 | ((~i) & i202);
                    int i211 = -i210;
                    i6 = (((i210 & i211) | (i210 ^ i211)) >> 31) & 16;
                }
                iArr[0] = i;
                iArr2[0] = i202;
                objArr20[3] = null;
                int i212 = i204 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i212 % 128;
                if (i212 % 2 != 0) {
                    i7 = (((-959542884) + (((~(193308376 | i)) | (-233618606)) * (-948))) + ((~((-73930790) | (~i))) * (-948))) - 60342044;
                    iB = zzjq.b();
                    i8 = 1773 / i6;
                } else {
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i213 = ~iFreeMemory;
                    int i214 = (-60310652) + (((~((-256448620) | i213)) | 16779328) * (-1188));
                    int i215 = (~(iFreeMemory | 256448619)) | 16779328;
                    int i216 = ~(296758848 | i213);
                    i7 = i214 + ((i215 | i216) * 594) + (((~(256448619 | i213)) | (-536428140) | i216) * 594);
                    iB = zzjq.b();
                    i8 = i6 * 1773;
                }
                int i217 = (i8 - (~(-(-((-885) * i7))))) - 1;
                int i218 = ~i6;
                int i219 = ~i7;
                int i220 = (~((i218 & i219) | (i218 ^ i219))) | (~((i219 & iB) | (i219 ^ iB)));
                int i221 = ~iB;
                int i222 = (i221 ^ i6) | (i221 & i6);
                int i223 = -(-((i220 | (~((i222 & i7) | (i222 ^ i7)))) * 886));
                int i224 = ((i217 | i223) << 1) - (i217 ^ i223);
                int i225 = ~iB;
                int i226 = ~((i225 & i7) | (i225 ^ i7));
                int i227 = ((i226 & i6) | (i6 ^ i226)) * (-1772);
                int i228 = (i224 & i227) + (i227 | i224);
                int i229 = (~(i221 | i6)) * 886;
                int i230 = (i228 ^ i229) + ((i229 & i228) << 1);
                int i231 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i231 % 128;
                if (i231 % 2 != 0) {
                    int i232 = i3 << i230;
                    int i233 = i232 >> 107;
                    int i234 = (i232 | i233) & (~(i232 & i233));
                    int i235 = i234 ^ ((i234 ^ 27) + ((i234 & 27) << 1));
                    int i236 = i235 / 4;
                    ((int[]) objArr20[0])[0] = ((~i235) & i236) | ((~i236) & i235);
                    return objArr20;
                }
                int i237 = (i3 & i230) + (i3 | i230);
                int i238 = i237 << 13;
                int i239 = (i237 | i238) & (~(i237 & i238));
                int i240 = i239 >>> 17;
                int i241 = ((~i239) & i240) | ((~i240) & i239);
                ((int[]) objArr20[1])[0] = i241 ^ (i241 << 5);
                return objArr20;
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r7, byte r8, int r9) {
            /*
                int r9 = r9 * 4
                int r9 = 3 - r9
                int r8 = 116 - r8
                byte[] r0 = defpackage.applyImplementationOptionToCaptureBuilder.$$c
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2a:
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.applyImplementationOptionToCaptureBuilder.$$e(int, byte, int):java.lang.String");
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_jkp_biometric;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        if (((java.lang.reflect.Field) defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) == (((-297401611) + (((~(r7 | (-1144418611))) | 314431067) * 191)) + (((~((~r7) | (-1144418611))) | 3428370) * 191))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        r7 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r8 = android.os.Process.myUid();
        r11 = ~r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0104, code lost:
    
        if (r7 != (((-1954141791) + (((~((-129083715) | r11)) | (~(r8 | (-1844995046)))) * 333)) + (((~(r8 | (-129083715))) | (~(r11 | (-1844995046)))) * 333))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0106, code lost:
    
        super.onResume();
        r7 = com.bpjstku.presentation.program.jkp.claim.JkpClaimActivity.f604a + 77;
        com.bpjstku.presentation.program.jkp.claim.JkpClaimActivity.d = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011a, code lost:
    
        throw new java.lang.RuntimeException("-767781658");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011b, code lost:
    
        r7 = (-976939700) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0124, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b1, code lost:
    
        if (r7 == ((953725432 + (((-137494677) | r8) * 494)) + (((~(r8 | (-968007829))) | 831038761) * 494))) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int r7, int r8, int r9, java.lang.Object[] r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.claim.JkpClaimActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(int, int, int, java.lang.Object[], int, int, int):java.lang.Object");
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
    private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jkp.claim.JkpClaimActivity.$$a
            int r5 = r5 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r5]
        L24:
            int r6 = r6 + r3
            int r5 = r5 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.claim.JkpClaimActivity.c(short, byte, short, java.lang.Object[]):void");
    }

    public JkpClaimActivity() {
        final JkpClaimActivity jkpClaimActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.program.jkp.claim.JkpClaimActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = jkpClaimActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        JkpClaimActivity jkpClaimActivity = (JkpClaimActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 97;
        f604a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = jkpClaimActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            int i5 = 95 / 0;
        }
        return Integer.valueOf(i4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJkpBiometricBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f604a + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        JkpClaimActivity$bindingInflater$1 jkpClaimActivity$bindingInflater$1 = JkpClaimActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = d + 93;
        f604a = i4 % 128;
        if (i4 % 2 == 0) {
            return jkpClaimActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f604a + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        JkpClaimActivity jkpClaimActivity = this;
        Intrinsics.checkNotNullParameter(jkpClaimActivity, "");
        jkpClaimActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJkpBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJkpBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_simulation_pension_ansurance));
        int i4 = d + 93;
        f604a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        CardView cardView = ((ActivityJkpBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvLivenessCheck;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: applyVideoStabilization
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkpClaimActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
        int i2 = d + 55;
        f604a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = d + 51;
        f604a = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = d + 29;
                f604a = i3 % 128;
                int i4 = i3 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x01eb  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i6 = $11 + 91;
        $10 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i8 = $10 + 37;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i10 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(asBinder)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int maximumDrawingCacheSize = 3291 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32;
                    byte b = (byte) ($$f & 1);
                    byte b2 = (byte) (-b);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, maximumDrawingCacheSize, iIndexOf, 1199271174, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), 651 - View.getDefaultSize(0, 0), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -450685997, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i6 = $10 + 113;
                $11 = i6 % 128;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i11 = $10 + 27;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i13 = $10 + 9;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i2];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 651 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, -450685997, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i4 = 29209604;
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 652, 44 - (ViewConfiguration.getTapTimeout() >> 16), -450685997, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i4 = 29209604;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr2;
        JkpClaimActivity jkpClaimActivity = (JkpClaimActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
            int iBlue = Color.blue(0) + 23;
            byte[] bArr = $$a;
            short s = bArr[7];
            byte b = bArr[28];
            Object[] objArr3 = new Object[1];
            c(s, b, (byte) (b | 36), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iLastIndexOf, iBlue, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = d + 37;
            f604a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                int i4 = $$b;
                Object[] objArr4 = new Object[1];
                c((short) (i4 & 37), $$a[28], (byte) (i4 & 52), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, iKeyCodeFromString, windowTouchSlop, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i5 = ~iElapsedRealtime;
            int i6 = 1958332176 + (((~(139417257 | i5)) | 352019683) * 226) + (((~(i5 | 486504171)) | 4932769 | (~((-352019684) | iElapsedRealtime))) * (-113)) + ((~(iElapsedRealtime | 139417257)) * 113) + 170050058;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_3).substring(21, 22).codePointAt(0) + 48, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).codePointAt(0) - 94, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step5).substring(1, 7).length() - 2, new char[]{17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 48, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, (-16777202) - Color.rgb(0, 0, 0), new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, jkpClaimActivity)).intValue();
            try {
                Object[] objArr8 = {-1293483185};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - TextUtils.lastIndexOf("", '0', 0)), 1726 - ((Process.getThreadPriority(0) + 20) >> 6), 28 - MotionEvent.axisFromString(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 170050058);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cGreen = (char) (Color.green(0) + 29944);
                    int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i9 = $$b;
                    Object[] objArr9 = new Object[1];
                    c((short) (i9 & 37), $$a[28], (byte) (i9 & 52), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, maximumFlingVelocity, iIndexOf, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_1).substring(0, 3).codePointAt(1) + 43, 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_image_too_dark).substring(0, 24).codePointAt(6) - 77, new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_message_link).substring(0, 22).length() + 136, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 22, new char[]{5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                        int i10 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                        int i11 = $$b;
                        Object[] objArr12 = new Object[1];
                        c((short) (i11 & 345), $$a[28], (byte) (i11 & 52), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i10, tapTimeout, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                        int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte[] bArr2 = $$a;
                        short s2 = bArr2[7];
                        byte b2 = bArr2[28];
                        Object[] objArr13 = new Object[1];
                        c(s2, b2, (byte) (b2 | 36), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, edgeSlop, iIndexOf2, 986134021, false, (String) objArr13[0], null);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i13 == i12) {
            int i14 = d + 69;
            f604a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iNextInt = new Random().nextInt();
            int i17 = i16 + 2116171508 + (((~(iNextInt | (-696993540))) | (-909595966)) * (-465)) + (((-696993540) | (~((-909595966) | iNextInt))) * 930) + ((iNextInt | (-537085186)) * 465);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr14[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i20 = f604a + 99;
                    d = i20 % 128;
                    int i21 = i20 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iMyTid = Process.myTid();
            int i23 = 842260959 + ((iMyTid | 1014540930) * (-50));
            int i24 = ~((-271590019) | iMyTid);
            int i25 = ~iMyTid;
            int i26 = i22 + i23 + ((i24 | (~(1073528522 | i25))) * 50) + (((~(i25 | 1014540930)) | (~(801938504 | i25)) | (-1073528523)) * 50);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr15[3])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int i29 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i30 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i31 = $$b;
            Object[] objArr16 = new Object[1];
            c((short) (i31 & 909), $$a[28], (byte) (i31 & 52), objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, i29, i30, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        e(true, 154 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 9, new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1052).substring(0, 25).codePointAt(2) + 51, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step3).substring(25, 26).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_5).substring(16, 17).codePointAt(0) - 102, new char[]{5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
            int i32 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i33 = $$b;
            Object[] objArr19 = new Object[1];
            c((short) (i33 & 37), $$a[28], (byte) (i33 & 52), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyTid, offsetBefore, i32, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                int i34 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                short s3 = (short) ($$b & 961);
                byte b3 = $$a[7];
                Object[] objArr20 = new Object[1];
                c(s3, b3, b3, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid2, iMakeMeasureSpec, i34, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr21[3])[0];
            int i36 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i37 = (((-32342713) + (((~startUptimeMillis) | (-156139626)) * 1444)) + (((~(startUptimeMillis | 65172960)) | ((~(179107209 | startUptimeMillis)) | (-200209898))) * (-1444))) - 44506652;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr2[2])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(false, 154 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step2).substring(3, 4).codePointAt(0) - 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_bni_point).substring(1, 3).codePointAt(0) - 93, new char[]{17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(false, 156 - TextUtils.indexOf((CharSequence) "", '0'), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, TextUtils.getTrimmedLength("") + 14, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, jkpClaimActivity)).intValue();
            Object[] objArr24 = {-1293483185};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.keyCodeFromString("") + 1134, 18 - Gravity.getAbsoluteGravity(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, -1108166206, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iBlue2 = Color.blue(0) + 1031;
                int maximumDrawingCacheSize2 = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i40 = $$b;
                Object[] objArr26 = new Object[1];
                c((short) (i40 & 909), $$a[28], (byte) (i40 & 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cKeyCodeFromString, iBlue2, maximumDrawingCacheSize2, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1117 - (ViewConfiguration.getTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iBlue3 = 1031 - Color.blue(0);
                int iIndexOf3 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                short s4 = (short) ($$b & 961);
                byte b4 = $$a[7];
                Object[] objArr27 = new Object[1];
                c(s4, b4, b4, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop2, iBlue3, iIndexOf3, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 118, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (ViewConfiguration.getJumpTapTimeout() >> 16) + 20, new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 122, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_info).substring(8, 9).codePointAt(0) - 82, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 101, new char[]{5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                    int trimmedLength = TextUtils.getTrimmedLength("") + 15;
                    int i41 = $$b;
                    Object[] objArr30 = new Object[1];
                    c((short) (i41 & 37), $$a[28], (byte) (i41 & 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, touchSlop, trimmedLength, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
                    int i42 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                    int i43 = $$b;
                    Object[] objArr31 = new Object[1];
                    c((short) (i43 & 909), $$a[28], (byte) (i43 & 52), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(gidForName, bitsPerPixel, i42, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i44 = ((int[]) objArr2[1])[0];
        int i45 = ((int[]) objArr2[3])[0];
        if (i45 == i44) {
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i46 = ((int[]) objArr2[2])[0];
            int i47 = ((int[]) objArr2[3])[0];
            int i48 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int i49 = (~((int) Process.getStartElapsedRealtime())) | 623274746;
            int i50 = i46 + 28221538 + (i49 * 495) + (((~i49) | 555745386) * 495);
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr32[2])[0] = i52 ^ (i52 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i53 = f604a + 81;
            d = i53 % 128;
            for (int i54 = i53 % 2 == 0 ? 1 : 0; i54 < strArr4.length; i54++) {
                arrayList2.add(strArr4[i54]);
            }
        }
        Toast.makeText((Context) null, i45 / (((i45 - 1) * i45) % 2), 0).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i55 = ((int[]) objArr2[2])[0];
        int i56 = ((int[]) objArr2[3])[0];
        int i57 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i58 = ~iMaxMemory;
        int i59 = i55 + (((~(402109935 | i58)) | (~((-28382529) | iMaxMemory))) * 988) + 1311965841 + (((~(iMaxMemory | 129447237)) | 272662698 | (~(i58 | (-28382529)))) * 988);
        int i60 = (i59 << 13) ^ i59;
        int i61 = i60 ^ (i60 >>> 17);
        ((int[]) objArr33[2])[0] = i61 ^ (i61 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        Object obj = null;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ~((~System.identityHashCode(this)) | 728885631);
        if (i2 != (((140542038 | i3) * (-374)) - 804044570) + ((i3 | 588343593) * 374)) {
            int i4 = d + 117;
            f604a = i4 % 128;
            if (i4 % 2 != 0) {
                int[] iArr = new int[1198074686];
                iArr[1198074685] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1198074686];
                iArr2[1198074685] = 1;
                int i5 = (-1665091642) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i6 = f604a + 7;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 4;
            }
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = 902855288 + (((~((-348212488) | iIdentityHashCode)) | 2064123818) * (-318));
        int i10 = ~(2064123818 | iIdentityHashCode);
        int i11 = ~iIdentityHashCode;
        if (i8 != i9 + ((i10 | (~(i11 | (-1795687081)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | (-1795687081))) | (~(2143899567 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int i12 = d + 77;
            f604a = i12 % 128;
            int i13 = i12 % 2;
            int[] iArr3 = new int[350317936];
            iArr3[350317935] = 1;
            int i14 = (-121166960) % 2;
            Toast.makeText((Context) null, iArr3[-1], 1).show();
        }
        super.onStart();
        int i15 = f604a + 25;
        d = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f604a + 109;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (((~(1056960491 | iIdentityHashCode)) | 134677696) * 449) + 617384084 + (((~((~iIdentityHashCode) | 1056960491)) | 134677696) * 449)) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i5 != (-683167236) + (((~(990233856 | iIdentityHashCode2)) | (-2142750045) | (~(1588822108 | iIdentityHashCode2))) * (-744)) + (((~iIdentityHashCode2) | 436305920) * 744) + ((iIdentityHashCode2 | 2142750044) * 744)) {
            throw new RuntimeException("-1475652468");
        }
        super.onCreate(bundle);
        int i6 = f604a + 13;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = d + 9;
        f604a = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final JkpClaimActivity jkpClaimActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        jkpClaimActivity.b = null;
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) jkpClaimActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: applyTemplateParamsOverrideWorkaround
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkpClaimActivity.TuitionPaymentFragmentbindingInflater1(this.b, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: applyAeFpsRange
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                JkpClaimActivity.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) jkpClaimActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        Unit unit = Unit.INSTANCE;
        int i2 = d + 27;
        f604a = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(JkpClaimActivity jkpClaimActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = f604a + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!bool.booleanValue()) {
            int i4 = d + 63;
            f604a = i4 % 128;
            if (i4 % 2 != 0) {
                Context baseContext = jkpClaimActivity.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "");
                String string = jkpClaimActivity.getString(R.string.message_camera_storage_permission_required);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AutoValue_LifecycleCameraRepository_Key.b(baseContext, string);
                throw null;
            }
            Context baseContext2 = jkpClaimActivity.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext2, "");
            String string2 = jkpClaimActivity.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            AutoValue_LifecycleCameraRepository_Key.b(baseContext2, string2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2(JkpClaimActivity jkpClaimActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(jkpClaimActivity);
        int i2 = d + 77;
        f604a = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    static {
        asInterface = 0;
        g();
        INSTANCE = new Companion(null);
        int i = g + 97;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -369036475, new Object[]{this}, 85049344 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_email_invalid_optional).substring(30, 31).codePointAt(0), 369036477, wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 115;
        f604a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = d + 109;
        f604a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 113;
        f604a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 2036489452, new Object[]{this}, r8lambda1GtIzncz4245_HpTJbEZFoVqMQY.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2036489452, r8lambda1GtIzncz4245_HpTJbEZFoVqMQY.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 51;
        f604a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 21;
        f604a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = r8lambda1GtIzncz4245_HpTJbEZFoVqMQY.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambda1GtIzncz4245_HpTJbEZFoVqMQY.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 11584044, new Object[]{this, context}, r8lambda1GtIzncz4245_HpTJbEZFoVqMQY.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -11584043, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 676168512);
    }

    static void g() {
        asBinder = -83722411;
    }

    private static String $$i(int i, short s, short s2) {
        byte[] bArr = $$c;
        int i2 = s2 * 2;
        int i3 = i + 119;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += i2;
        }
        while (true) {
            i5++;
            i4++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i4];
        }
    }
}
