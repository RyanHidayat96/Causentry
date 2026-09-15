package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import androidx.work.WorkInfo;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class isSticky extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> TuitionPaymentFragmentbindingInflater1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final postWhenReportersAreDone b;

    public isSticky(postWhenReportersAreDone postwhenreportersaredone, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(postwhenreportersaredone, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.b = postwhenreportersaredone;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, str2, str3)));
        final Function1 function1 = new Function1() { // from class: launchTrustedWebActivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (OtpVerificationResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: TrustedWebActivityIntentBuilder
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onCancelNotification
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getTokenStore
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, str2, str3)));
        final Function1 function1 = new Function1() { // from class: channelNameToId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (OtpVerificationResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: onAreNotificationsEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onNotifyNotificationWithChannel
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onGetSmallIconBitmap
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.TuitionPaymentFragmentbindingInflater1(str, str2, str3, str4)));
        final Function1 function1 = new Function1() { // from class: onGetSmallIconId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (OtpVerificationResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: onUnbind
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: checkCaller
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setAdditionalTrustedOrigins
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.b(str, str2, str3, str4, str5)));
        final Function1 function1 = new Function1() { // from class: onGetActiveNotifications
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (OtpVerificationResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: onExtraCommand
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: grantUriPermissionToProvider
            private static final byte[] $$a = {59, -124, -78, 46};
            private static final int $$b = 55;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722291;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -4686848287441081952L;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitD = isSticky.d(this.b, (Throwable) obj);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                return unitD;
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
                int i3 = 4;
                abortcapture.b = 4;
                int i4 = $11 + 27;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 5;
                }
                while (abortcapture.b < cArrB.length) {
                    int i6 = $10 + 111;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
                    int i8 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64838), TextUtils.indexOf((CharSequence) "", '0', 0) + 1357, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 38, 894276454, false, $$c(b, (byte) (b & 13), (byte) 0), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 468, (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        i3 = 4;
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

            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3291, (KeyEvent.getMaxKeyCode() >> 16) + 31, 1199271174, false, $$c(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (-b3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), 651 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) + 44, -450685997, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
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
                if (i3 > 0) {
                    int i6 = $11 + 3;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (!(!z)) {
                    int i8 = $10 + 71;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (-b5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Drawable.resolveOpacity(0, 0), 651 - TextUtils.indexOf("", "", 0, 0), 43 - MotionEvent.axisFromString(""), -450685997, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:138:0x0c63 A[Catch: all -> 0x0caf, TryCatch #6 {all -> 0x0caf, blocks: (B:5:0x000f, B:8:0x00a3, B:11:0x00b5, B:29:0x0430, B:31:0x04f9, B:33:0x052a, B:39:0x05a1, B:45:0x061a, B:53:0x072b, B:120:0x0c39, B:123:0x0c40, B:125:0x0c48, B:126:0x0c49, B:128:0x0c4b, B:130:0x0c53, B:131:0x0c54, B:136:0x0c5d, B:138:0x0c63, B:139:0x0c64, B:141:0x0c66, B:143:0x0c6c, B:144:0x0c6d, B:146:0x0c6f, B:148:0x0c75, B:149:0x0c76, B:151:0x0c78, B:153:0x0c7e, B:154:0x0c7f, B:156:0x0c81, B:158:0x0c87, B:159:0x0c88, B:161:0x0c8a, B:163:0x0c90, B:164:0x0c91, B:165:0x0c92, B:166:0x0ca5, B:168:0x0ca7, B:170:0x0cad, B:171:0x0cae, B:14:0x0133, B:16:0x0195, B:18:0x01fa, B:46:0x0632, B:50:0x06a4, B:52:0x0707, B:51:0x06d3, B:6:0x0075, B:12:0x00c2, B:79:0x083b, B:89:0x0902, B:27:0x034f, B:20:0x025e, B:24:0x02e8, B:26:0x0344, B:25:0x0316, B:91:0x0964), top: B:191:0x000f, inners: #0, #1, #2, #3, #4, #5, #9, #12 }] */
            /* JADX WARN: Code duplicated, block: B:139:0x0c64 A[Catch: all -> 0x0caf, TryCatch #6 {all -> 0x0caf, blocks: (B:5:0x000f, B:8:0x00a3, B:11:0x00b5, B:29:0x0430, B:31:0x04f9, B:33:0x052a, B:39:0x05a1, B:45:0x061a, B:53:0x072b, B:120:0x0c39, B:123:0x0c40, B:125:0x0c48, B:126:0x0c49, B:128:0x0c4b, B:130:0x0c53, B:131:0x0c54, B:136:0x0c5d, B:138:0x0c63, B:139:0x0c64, B:141:0x0c66, B:143:0x0c6c, B:144:0x0c6d, B:146:0x0c6f, B:148:0x0c75, B:149:0x0c76, B:151:0x0c78, B:153:0x0c7e, B:154:0x0c7f, B:156:0x0c81, B:158:0x0c87, B:159:0x0c88, B:161:0x0c8a, B:163:0x0c90, B:164:0x0c91, B:165:0x0c92, B:166:0x0ca5, B:168:0x0ca7, B:170:0x0cad, B:171:0x0cae, B:14:0x0133, B:16:0x0195, B:18:0x01fa, B:46:0x0632, B:50:0x06a4, B:52:0x0707, B:51:0x06d3, B:6:0x0075, B:12:0x00c2, B:79:0x083b, B:89:0x0902, B:27:0x034f, B:20:0x025e, B:24:0x02e8, B:26:0x0344, B:25:0x0316, B:91:0x0964), top: B:191:0x000f, inners: #0, #1, #2, #3, #4, #5, #9, #12 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v23 */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v117 */
            /* JADX WARN: Type inference failed for: r2v33, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r2v34 */
            /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r2v39, types: [int] */
            /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v99 */
            /* JADX WARN: Type inference failed for: r3v110, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
            public static Object[] b(Context context, int i, int i2) {
                int i3;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i4;
                Class<?> cls;
                Object obj;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                Class<?> cls2;
                char[] cArr;
                float maxVolume;
                float f;
                Throwable th;
                Throwable cause;
                int i11;
                int i12;
                Class<?> cls3;
                Object obj2;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int capsMode;
                int i18;
                int i19;
                int i20;
                ?? Invoke = i2;
                int i21 = 2;
                int i22 = 2 % 2;
                if (context != null) {
                    try {
                        int bitsPerPixel = 259 - ImageFormat.getBitsPerPixel(0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                        int i23 = (iCombineMeasuredStates * (-109)) + 3441 + (((~iCombineMeasuredStates) | (~((i ^ 31) | (i & 31)))) * (-220));
                        int i24 = ~((iCombineMeasuredStates ^ 31) | (iCombineMeasuredStates & 31));
                        int i25 = ~(i | 31);
                        int i26 = -(-(((i24 ^ i25) | (i24 & i25)) * 220));
                        int i27 = (i23 ^ i26) + ((i23 & i26) << 1);
                        int i28 = ~iCombineMeasuredStates;
                        int i29 = ~((i28 & 31) | (i28 ^ 31));
                        int i30 = ~(((-32) ^ iCombineMeasuredStates) | (iCombineMeasuredStates & (-32)));
                        Object[] objArr = new Object[1];
                        a(false, bitsPerPixel, (iResolveSizeAndState | 31) + (iResolveSizeAndState & 31), (i27 - (~(-(-(((i30 & i29) | (i29 ^ i30)) * 110))))) - 1, new char[]{65518, 65529, 65512, 65516, 25, 15, 29, 26, 20, 15, 65483, 65519, 16, '\r', ' ', 18, 65495, 65530, 65512, 65516, 25, 15, 29, 26, 20, 15, 65495, 65518, 65512, 0, 65534}, objArr);
                        try {
                            Object[] objArr2 = {(String) objArr[0]};
                            Object[] objArr3 = new Object[1];
                            c(new char[]{12521, 12419, 53762, 4517, 36197, 33514, 2719, 51673, 16265, 50005, 7090, 55525, 11962, 61478, 10411, 60161, 7637, 57554, 14751, 64017, 3324, 4599, 20193, 1398, 31721, 7854, 24145, 5136, 27223, 4011, 28492, 10040, 22897, 15515, 31779, 13945, 18503, 11584, 36160, 18056, 46928, 23127}, KeyEvent.getMaxKeyCode() >> 16, objArr3);
                            ?? NewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                            char[] cArr2 = {35510, 35573, 47228, 31623, 21209, 11786, 54528, 25867, 34178, 43286, 50240, 29729, 38120, 39445, 63255, 18407, 42903, 35565, 58913, 22227, 46744, 31644, 37236, 43478, 49578, 29899, 33202, 47273, 53314, 26097, 45185, 35725, 58236, 22172, 41866};
                            int i31 = TuitionPaymentFragmentbindingInflater1 + 91;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
                            if (i31 % 2 == 0) {
                                Object[] objArr4 = new Object[1];
                                c(cArr2, TextUtils.getCapsMode("", 0, 0), objArr4);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            Object[] objArr5 = new Object[1];
                            c(cArr2, TextUtils.getCapsMode("", 0, 0), objArr5);
                            try {
                                Object[] objArr6 = {(String) objArr5[0]};
                                int gidForName = Process.getGidForName("");
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i32 = gidForName * (-109);
                                int i33 = (i32 & 111) + (i32 | 111);
                                int i34 = ~gidForName;
                                int i35 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 1));
                                int i36 = i33 + (((i34 ^ i35) | (i34 & i35)) * (-220));
                                int i37 = ~((gidForName ^ 1) | (gidForName & 1));
                                int i38 = -(-(((i37 ^ i35) | (i37 & i35)) * 220));
                                int i39 = ((i36 | i38) << 1) - (i36 ^ i38);
                                int i40 = ~((i34 ^ 1) | (i34 & 1));
                                int i41 = ~(gidForName | (-2));
                                int i42 = ((i40 & i41) | (i40 ^ i41)) * 110;
                                int i43 = (i39 & i42) + (i42 | i39);
                                Object[] objArr7 = new Object[1];
                                c(new char[]{12521, 12419, 53762, 4517, 36197, 33514, 2719, 51673, 16265, 50005, 7090, 55525, 11962, 61478, 10411, 60161, 7637, 57554, 14751, 64017, 3324, 4599, 20193, 1398, 31721, 7854, 24145, 5136, 27223, 4011, 28492, 10040, 22897, 15515, 31779, 13945, 18503, 11584, 36160, 18056, 46928, 23127}, i43, objArr7);
                                Object objNewInstance = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                                try {
                                    int i44 = -ExpandableListView.getPackedPositionType(0L);
                                    int i45 = ((i44 & 276) << 1) + (i44 ^ 276);
                                    int i46 = -(ViewConfiguration.getTapTimeout() >> 16);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i47 = TuitionPaymentFragmentbindingInflater1 + 15;
                                    int i48 = i47 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i48;
                                    int i49 = i47 % 2;
                                    int i50 = 23 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i51 = ~i46;
                                    int i52 = (((628 * i46) + 14444) - (~(-(-(((i50 ^ i51) | (i50 & i51)) * (-627)))))) - 1;
                                    int i53 = (i48 ^ 3) + ((i48 & 3) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i53 % 128;
                                    int i54 = i53 % 2;
                                    int i55 = ~((-24) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                    int i56 = (i52 - (~(-(-((-627) * ((i55 & i46) | (i46 ^ i55))))))) - 1;
                                    int i57 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i58 = i56 + (((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i46) | (i46 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | (~((i57 & 23) | (i57 ^ 23)))) * 627);
                                    int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i59 = scrollBarFadeDuration * 70;
                                    int i60 = (i59 & (-748)) + (i59 | (-748));
                                    int i61 = (~scrollBarFadeDuration) | (-12);
                                    int i62 = (scrollBarFadeDuration ^ 11) | (scrollBarFadeDuration & 11);
                                    int i63 = ((~((i62 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i62 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (~((i61 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i61 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)))) * 69;
                                    int i64 = (i60 ^ i63) + ((i63 & i60) << 1);
                                    int i65 = ~scrollBarFadeDuration;
                                    int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i67 = ((i66 | 81) << 1) - (i66 ^ 81);
                                    TuitionPaymentFragmentbindingInflater1 = i67 % 128;
                                    int i68 = i67 % 2;
                                    int i69 = ~((i65 ^ 11) | (i65 & 11));
                                    int i70 = ~((i65 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i65 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                    int i71 = (i70 & i69) | (i69 ^ i70);
                                    int i72 = ~((11 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (11 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                    int i73 = i64 + ((-69) * ((i71 & i72) | (i71 ^ i72))) + ((~((-12) | scrollBarFadeDuration)) * 69);
                                    Object[] objArr8 = new Object[1];
                                    a(true, i45, i58, i73, new char[]{'\t', '\n', 65534, 65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15}, objArr8);
                                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                                    int i74 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    Object[] objArr9 = new Object[1];
                                    a(true, (i74 & 275) + (i74 | 275), 17 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), 15 - (~ExpandableListView.getPackedPositionGroup(0L)), new char[]{1, 3, 65533, '\n', 65533, 65513, 1, 3, 65533, 7, 65535, 65533, 65516, 16, 1, 3, 14}, objArr9);
                                    Object objInvoke = cls4.getMethod((String) objArr9[0], null).invoke(context, null);
                                    try {
                                        int i75 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i76 = i75 * 55;
                                        int i77 = (i76 ^ (-29425)) + ((i76 & (-29425)) << 1);
                                        int i78 = ~i75;
                                        int i79 = ~((i78 & 275) | (i78 ^ 275));
                                        int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                        int i81 = ~((i80 & 275) | (i80 ^ 275));
                                        int i82 = (i77 - (~(-(-(((i79 & i81) | (i79 ^ i81)) * (-108)))))) - 1;
                                        int i83 = ~i75;
                                        int i84 = ~((i83 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i83 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                        int i85 = ~(((-276) ^ i75) | ((-276) & i75));
                                        int i86 = (i84 ^ i85) | (i84 & i85);
                                        int i87 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                        int i88 = ~((i87 ^ i75) | (i87 & i75));
                                        int i89 = i82 + (((i86 ^ i88) | (i86 & i88)) * 54);
                                        int i90 = ~((i75 & (-276)) | ((-276) ^ i75));
                                        int i91 = -(-(((i90 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ i90)) * 54));
                                        int i92 = (i89 ^ i91) + ((i91 & i89) << 1);
                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                        int i93 = ((iKeyCodeFromString & 23) << 1) + (iKeyCodeFromString ^ 23);
                                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                        int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                                        TuitionPaymentFragmentbindingInflater1 = i94 % 128;
                                        if (i94 % 2 != 0) {
                                            int i95 = -(-iResolveSizeAndState2);
                                            Object[] objArr10 = new Object[1];
                                            a(true, i92, i93, ((i95 & 11) << 1) + (i95 ^ 11), new char[]{'\t', '\n', 65534, 65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15}, objArr10);
                                            cls = Class.forName((String) objArr10[0]);
                                            Object[] objArr11 = new Object[1];
                                            c(new char[]{11596, 11563, 55273, 5194, 18684, 21073, 52996, 6483, 8757, 50935, 56883, 2138, 13083, 62937, 60686, 15282, 'i', 58657}, View.resolveSize(1, 0), objArr11);
                                            obj = objArr11[0];
                                        } else {
                                            Object[] objArr12 = new Object[1];
                                            a(true, i92, i93, 11 - iResolveSizeAndState2, new char[]{'\t', '\n', 65534, 65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15}, objArr12);
                                            cls = Class.forName((String) objArr12[0]);
                                            Object[] objArr13 = new Object[1];
                                            c(new char[]{11596, 11563, 55273, 5194, 18684, 21073, 52996, 6483, 8757, 50935, 56883, 2138, 13083, 62937, 60686, 15282, 'i', 58657}, View.resolveSize(0, 0), objArr13);
                                            obj = objArr13[0];
                                        }
                                        try {
                                            Object[] objArr14 = {cls.getMethod((String) obj, null).invoke(context, null), 64};
                                            int i96 = 272 - (~(-ExpandableListView.getPackedPositionGroup(0L)));
                                            int i97 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i98 = i97 * 866;
                                            int i99 = ((i98 | (-28512)) << 1) - (i98 ^ (-28512));
                                            int i100 = ~i97;
                                            int i101 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                            int i102 = ~(i100 | i101);
                                            int i103 = -(-((((-34) ^ i102) | ((-34) & i102)) * (-865)));
                                            int i104 = (i99 & i103) + (i103 | i99) + ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault7 | i97)) * 865);
                                            int i105 = -(-(((~(i97 | i101)) | (~(((-34) & i101) | ((-34) ^ i101)))) * 865));
                                            int i106 = ((i104 | i105) << 1) - (i104 ^ i105);
                                            int i107 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i108 = (i107 * (-1965)) + 5904 + ((i107 | (-7)) * 983);
                                            int i109 = ~i107;
                                            int i110 = ~i;
                                            int i111 = ~(((-7) ^ i110) | ((-7) & i110));
                                            int i112 = ((i109 ^ i111) | (i111 & i109)) * (-983);
                                            int i113 = (i108 ^ i112) + ((i112 & i108) << 1);
                                            int i114 = ~i107;
                                            int i115 = ~((i114 & i110) | (i114 ^ i110));
                                            int i116 = ~(i109 | 6);
                                            int i117 = ((i115 & i116) | (i115 ^ i116)) * 983;
                                            Object[] objArr15 = new Object[1];
                                            a(true, i96, i106, ((i113 | i117) << 1) - (i113 ^ i117), new char[]{7, '\r', 16, 2, '\f', 65535, 16, 3, 5, 65535, '\f', 65535, 65515, 3, 5, 65535, '\t', 1, 65535, 65518, 65484, 11, 14, 65484, 18, '\f', 3, 18, '\f', '\r', 1, 65484, 2}, objArr15);
                                            Class<?> cls5 = Class.forName((String) objArr15[0]);
                                            Object[] objArr16 = new Object[1];
                                            c(new char[]{43453, 43482, 4197, 54214, 42969, 7155, Typography.doubleDagger, 20721, 42692, 379, 12566, 16888, 47082, 12885, 556, 29215, 33939, 8871}, TextUtils.indexOf("", "", 0, 0), objArr16);
                                            Object objInvoke2 = cls5.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                            Object[] objArr17 = new Object[1];
                                            c(new char[]{25832, 25737, 55541, 7005, 12236, 36647, 43044, 50183, 27551, 51690, 47372, 54627, 31419, 64196, 35358, 59089, 18885, 59965, 39788, 63379, 22776, 6934, 60430, 2245, 12273, 5120, 64675, 6540, 15903, 1390, 52633, 10923, 3366, 13916}, View.MeasureSpec.getSize(0), objArr17);
                                            Class<?> cls6 = Class.forName((String) objArr17[0]);
                                            int i118 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i119 = (i118 * 303) - 85484;
                                            int i120 = ~i118;
                                            int i121 = (i120 & i110) | (i120 ^ i110);
                                            int i122 = ((~((i121 & 284) | (i121 ^ 284))) | (~((i118 ^ 284) | (i118 & 284) | i))) * (-302);
                                            int i123 = ((i119 | i122) << 1) - (i119 ^ i122);
                                            int i124 = ~i118;
                                            int i125 = (i124 & 284) | (i124 ^ 284);
                                            int i126 = i123 + ((~((i125 & i) | (i125 ^ i))) * (-604));
                                            int i127 = -(-(((~(i118 | (-285))) | (~(i | 284))) * 302));
                                            int i128 = (i126 & i127) + (i127 | i126);
                                            int i129 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i130 = i129 * 758;
                                            int i131 = (i130 ^ (-7560)) + ((i130 & (-7560)) << 1);
                                            int i132 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                            int i133 = -(-(((i132 & i129) | (i129 ^ i132)) * (-757)));
                                            int i134 = (i131 ^ i133) + ((i133 & i131) << 1);
                                            int i135 = (~(((-11) ^ i129) | ((-11) & i129) | iTuitionPaymentFragmentspecialinlinedviewModeldefault8)) * 1514;
                                            int i136 = ((i134 | i135) << 1) - (i134 ^ i135);
                                            int i137 = ~i129;
                                            int i138 = ~((i137 & (-11)) | (i137 ^ (-11)));
                                            int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i140 = (i139 & 33) + (i139 | 33);
                                            TuitionPaymentFragmentbindingInflater1 = i140 % 128;
                                            int i141 = i140 % 2;
                                            int i142 = ~((-11) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                            int i143 = (i142 & i138) | (i138 ^ i142);
                                            int i144 = (i129 & 10) | (i129 ^ 10);
                                            int i145 = ~((i144 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i144 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                            int i146 = (i136 - (~(757 * ((i145 & i143) | (i143 ^ i145))))) - 1;
                                            Object[] objArr18 = new Object[1];
                                            int i147 = 10;
                                            a(false, i128, i146, 8 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), new char[]{6, 65532, 65530, 1, 65524, 7, '\b', 5, 65528, 6}, objArr18);
                                            Object[] objArr19 = (Object[]) cls6.getField((String) objArr18[0]).get(objInvoke2);
                                            int length = objArr19.length;
                                            int i148 = 0;
                                            Invoke = Invoke;
                                            while (true) {
                                                if (i148 < length) {
                                                    Object obj4 = objArr19[i148];
                                                    int i149 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                    int i150 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                                                    int i151 = i150 % 128;
                                                    TuitionPaymentFragmentbindingInflater1 = i151;
                                                    if (i150 % i21 != 0) {
                                                        i6 = ~i149;
                                                        i5 = (482 - i6) >>> i147;
                                                        i7 = (i6 & (-233)) | (i6 ^ (-233));
                                                    } else {
                                                        i5 = (i149 * 483) - (-56144);
                                                        i6 = ~i149;
                                                        i7 = (i6 ^ (-233)) | (i6 & (-233));
                                                    }
                                                    int i152 = ~i7;
                                                    int i153 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                    int i154 = ~((i6 ^ i153) | (i6 & i153));
                                                    int i155 = (-241) * ((i152 & i154) | (i152 ^ i154));
                                                    int i156 = (i5 & i155) + (i5 | i155);
                                                    int i157 = -(-((i149 | 232) * (-482)));
                                                    int i158 = (i156 ^ i157) + ((i156 & i157) << 1);
                                                    int i159 = i151 + 109;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i159 % 128;
                                                    int i160 = i159 % 2;
                                                    int i161 = ~((-233) | i149);
                                                    int i162 = (~i149) | i153;
                                                    int i163 = ~((i162 & 232) | (i162 ^ 232));
                                                    int i164 = 241 * ((i161 & i163) | (i161 ^ i163));
                                                    int i165 = (i158 & i164) + (i164 | i158);
                                                    int i166 = 5 - (~(-(-TextUtils.lastIndexOf("", '0', 0, 0))));
                                                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                    int i167 = packedPositionGroup * (-661);
                                                    int i168 = ((i167 | (-2644)) << 1) - (i167 ^ (-2644));
                                                    int i169 = ~packedPositionGroup;
                                                    int i170 = (i168 - (~(-(-(((~((i169 ^ (-5)) | (i169 & (-5)))) | i110) * 1324))))) - 1;
                                                    int i171 = TuitionPaymentFragmentbindingInflater1 + 121;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i171 % 128;
                                                    int i172 = packedPositionGroup ^ i;
                                                    if (i171 % 2 == 0) {
                                                        int i173 = ~(i172 | (packedPositionGroup & i));
                                                        int i174 = ~(i | 4);
                                                        i8 = i170 << (((i173 ^ i174) | (i173 & i174)) * (-1324));
                                                        i9 = i169 | 4;
                                                    } else {
                                                        int i175 = ~(i172 | (packedPositionGroup & i));
                                                        int i176 = ~((i ^ 4) | (i & 4));
                                                        int i177 = ((i175 & i176) | (i175 ^ i176)) * (-1324);
                                                        i8 = ((i177 & i170) << 1) + (i170 ^ i177);
                                                        int i178 = ~packedPositionGroup;
                                                        i9 = (i178 & 4) | (i178 ^ 4);
                                                    }
                                                    int i179 = ~i9;
                                                    int i180 = ~(packedPositionGroup | (-5));
                                                    int i181 = -(-(662 * ((i180 & i179) | (i179 ^ i180))));
                                                    Object[] objArr20 = new Object[1];
                                                    a(true, i165, i166, (i181 | i8) + (i8 & i181), new char[]{65526, 65531, 65524, 30, 65535}, objArr20);
                                                    try {
                                                        Object[] objArr21 = {(String) objArr20[0]};
                                                        int i182 = -ExpandableListView.getPackedPositionType(0L);
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                        int i183 = (i182 * (-244)) - (-67650);
                                                        int i184 = TuitionPaymentFragmentbindingInflater1 + 101;
                                                        int i185 = i184 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i185;
                                                        int i186 = i184 % 2;
                                                        int i187 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                        int i188 = ~(((-276) ^ i187) | ((-276) & i187));
                                                        int i189 = ~(((-276) ^ i182) | ((-276) & i182));
                                                        int i190 = ((i188 ^ i189) | (i189 & i188)) * (-245);
                                                        int i191 = ((i183 | i190) << 1) - (i183 ^ i190);
                                                        int i192 = -(-((~((-276) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10)) * (-245)));
                                                        int i193 = ((i191 | i192) << 1) - (i192 ^ i191);
                                                        int i194 = ~(((-276) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-276) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                        int i195 = ((i182 & i194) | (i182 ^ i194)) * 245;
                                                        int i196 = ((i193 | i195) << 1) - (i195 ^ i193);
                                                        int i197 = ((i185 | 81) << 1) - (i185 ^ 81);
                                                        TuitionPaymentFragmentbindingInflater1 = i197 % 128;
                                                        if (i197 % 2 != 0) {
                                                            Object[] objArr22 = new Object[1];
                                                            a(false, i196, (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1)) * 37, Color.blue(1) * 17, new char[]{16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14, 5, 16, 21, 65482, 65535, 1, 14, 16, 65482, 65503, 1, 14}, objArr22);
                                                            cls2 = Class.forName((String) objArr22[0]);
                                                            i10 = 0;
                                                        } else {
                                                            int i198 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                            Object[] objArr23 = new Object[1];
                                                            a(false, i196, (i198 ^ 37) + ((i198 & 37) << 1), Color.blue(0) + 15, new char[]{16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14, 5, 16, 21, 65482, 65535, 1, 14, 16, 65482, 65503, 1, 14}, objArr23);
                                                            i10 = 0;
                                                            cls2 = Class.forName((String) objArr23[0]);
                                                        }
                                                        Object[] objArr24 = new Object[1];
                                                        c(new char[]{36602, 36509, 42393, 26170, 28679, 63603, 63487, 45928, 33164, 46231, 59095, 41592, 37028, 34735, 54750}, View.combineMeasuredStates(i10, i10), objArr24);
                                                        String str6 = (String) objArr24[i10];
                                                        Class<?>[] clsArr = new Class[1];
                                                        clsArr[i10] = String.class;
                                                        Object objInvoke3 = cls2.getMethod(str6, clsArr).invoke(null, objArr21);
                                                        int i199 = TuitionPaymentFragmentbindingInflater1 + 37;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i199 % 128;
                                                        if (i199 % 2 == 0) {
                                                            try {
                                                                cArr = new char[]{6745, 6712, 18579, 35643, 51429, 1098, 20237, 20330, 5422, 22924, 24101, 24078, 1034, 27298, 27959, 28092, 14196, 31323, 31813, 31998, 9801, 35696, 2855, 33707, 20808, 33890, 7055, 37601, 16573, 38168, 10891, 41421};
                                                                maxVolume = AudioTrack.getMaxVolume();
                                                                f = 1.0f;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            cArr = new char[]{6745, 6712, 18579, 35643, 51429, 1098, 20237, 20330, 5422, 22924, 24101, 24078, 1034, 27298, 27959, 28092, 14196, 31323, 31813, 31998, 9801, 35696, 2855, 33707, 20808, 33890, 7055, 37601, 16573, 38168, 10891, 41421};
                                                            maxVolume = AudioTrack.getMaxVolume();
                                                            f = 0.0f;
                                                        }
                                                        int i200 = (maxVolume > f ? 1 : (maxVolume == f ? 0 : -1));
                                                        int i201 = TuitionPaymentFragmentbindingInflater1;
                                                        int i202 = (i201 & 109) + (i201 | 109);
                                                        int i203 = i202 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i203;
                                                        if (i202 % 2 == 0) {
                                                            i11 = (TypedValues.Custom.TYPE_DIMENSION / i200) / (-1);
                                                        } else {
                                                            int i204 = i200 * TypedValues.Custom.TYPE_DIMENSION;
                                                            i11 = ((i204 | TypedValues.Custom.TYPE_STRING) << 1) - (i204 ^ TypedValues.Custom.TYPE_STRING);
                                                        }
                                                        int i205 = ~i200;
                                                        int i206 = i203 + 111;
                                                        int i207 = length;
                                                        int i208 = i206 % 128;
                                                        TuitionPaymentFragmentbindingInflater1 = i208;
                                                        if (i206 % 2 != 0) {
                                                            int i209 = ~((i205 ^ i) | (i205 & i));
                                                            int i210 = ~i;
                                                            i12 = i11 % ((-1808) << (i209 | (~((i210 ^ (-1)) | i210))));
                                                        } else {
                                                            int i211 = (-1808) * (~((i205 ^ i) | (i205 & i)));
                                                            i12 = ((i11 & i211) << 1) + (i11 ^ i211);
                                                        }
                                                        int i212 = ~i200;
                                                        int i213 = ~((i212 & i) | (i212 ^ i));
                                                        int i214 = ~i;
                                                        int i215 = i214 | i200;
                                                        int i216 = i12 + (TypedValues.Custom.TYPE_BOOLEAN * ((~((i215 ^ (-1)) | i215)) | i213));
                                                        int i217 = ~i200;
                                                        int i218 = ~(i217 | (i217 ^ (-1)));
                                                        int i219 = ~i;
                                                        int i220 = (i218 ^ i219) | (i218 & i219);
                                                        int i221 = ~((i200 & i214) | (i214 ^ i200));
                                                        int i222 = i208 + 25;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i222 % 128;
                                                        if (i222 % 2 == 0) {
                                                            try {
                                                                Object[] objArr25 = new Object[1];
                                                                c(cArr, i216 * (TypedValues.Custom.TYPE_BOOLEAN >> (i220 | i221)), objArr25);
                                                                cls3 = Class.forName((String) objArr25[0]);
                                                                Object[] objArr26 = new Object[1];
                                                                c(new char[]{43158, 43234, 29973, 46780, 32821, 65144, 2043, 46419, 43002, 25607, 5840, 42080, 46804, 22315, 9712}, KeyEvent.keyCodeFromString(""), objArr26);
                                                                obj2 = objArr26[0];
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            int i223 = -(-(((i220 & i221) | (i220 ^ i221)) * TypedValues.Custom.TYPE_BOOLEAN));
                                                            int i224 = ((i216 | i223) << 1) - (i223 ^ i216);
                                                            Object[] objArr27 = new Object[1];
                                                            c(cArr, i224, objArr27);
                                                            cls3 = Class.forName((String) objArr27[0]);
                                                            Object[] objArr28 = new Object[1];
                                                            c(new char[]{43158, 43234, 29973, 46780, 32821, 65144, 2043, 46419, 43002, 25607, 5840, 42080, 46804, 22315, 9712}, KeyEvent.keyCodeFromString(""), objArr28);
                                                            obj2 = objArr28[0];
                                                        }
                                                        Invoke = (byte[]) cls3.getMethod((String) obj2, null).invoke(obj4, null);
                                                        try {
                                                            try {
                                                                Invoke = new Object[]{new ByteArrayInputStream(Invoke)};
                                                                int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                int i225 = touchSlop * 495;
                                                                int i226 = (i225 ^ (-135575)) + ((i225 & (-135575)) << 1);
                                                                int i227 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                int i228 = (i227 ^ 33) + ((i227 & 33) << 1);
                                                                int i229 = i228 % 128;
                                                                TuitionPaymentFragmentbindingInflater1 = i229;
                                                                int i230 = i228 % 2;
                                                                int i231 = (-988) * (touchSlop | (-276));
                                                                int i232 = (i226 & i231) + (i226 | i231);
                                                                int i233 = ~touchSlop;
                                                                int i234 = (275 ^ i233) | (275 & i233);
                                                                int i235 = ((i229 | 1) << 1) - (i229 ^ 1);
                                                                int i236 = i148;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i235 % 128;
                                                                int i237 = i235 % 2;
                                                                int i238 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                                if (i237 == 0) {
                                                                    i13 = i232 >>> (493 - (~(-((i238 & i234) | (i234 ^ i238)))));
                                                                    i14 = ~((i233 ^ (-276)) | (i233 & (-276)));
                                                                } else {
                                                                    int i239 = -(-(((i238 & i234) | (i234 ^ i238)) * 494));
                                                                    i13 = ((i232 | i239) << 1) - (i239 ^ i232);
                                                                    int i240 = ~touchSlop;
                                                                    i14 = ~((i240 & (-276)) | (i240 ^ (-276)));
                                                                }
                                                                int i241 = (i229 ^ 71) + ((i229 & 71) << 1);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i241 % 128;
                                                                int i242 = i241 % 2;
                                                                int i243 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                                if (i242 == 0) {
                                                                    int i244 = ~((i243 & 275) | (i243 ^ 275));
                                                                    int i245 = (i244 & i14) | (i14 ^ i244);
                                                                    int i246 = ~((touchSlop & 275) | (touchSlop ^ 275));
                                                                    int i247 = i13 << (494 >> ((i246 & i245) | (i245 ^ i246)));
                                                                    i15 = 105;
                                                                    i16 = i247;
                                                                } else {
                                                                    int i248 = ~((i243 & 275) | (i243 ^ 275));
                                                                    int i249 = (i248 & i14) | (i14 ^ i248);
                                                                    int i250 = ~((touchSlop & 275) | (touchSlop ^ 275));
                                                                    int i251 = i13 + (494 * ((i250 & i249) | (i249 ^ i250)));
                                                                    i15 = 37;
                                                                    i16 = i251;
                                                                }
                                                                int i252 = -View.resolveSize(0, 0);
                                                                int i253 = (i15 ^ i252) + ((i15 & i252) << 1);
                                                                int i254 = -(-View.resolveSize(0, 0));
                                                                Object[] objArr29 = new Object[1];
                                                                a(false, i16, i253, (i254 ^ 15) + ((i254 & 15) << 1), new char[]{16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14, 5, 16, 21, 65482, 65535, 1, 14, 16, 65482, 65503, 1, 14}, objArr29);
                                                                Class<?> cls7 = Class.forName((String) objArr29[0]);
                                                                Object[] objArr30 = new Object[1];
                                                                c(new char[]{55205, 55234, 31965, 49022, 38202, 42994, 4824, 60613, 55503, 28097, 1002, 65021, 51670, 24301, 12532, 52740, 64132, 19990, 8583, 57099, 60324, 48940, 22195}, TextUtils.indexOf("", "", 0), objArr30);
                                                                Object objInvoke4 = cls7.getMethod((String) objArr30[0], InputStream.class).invoke(objInvoke3, Invoke);
                                                                int i255 = TuitionPaymentFragmentbindingInflater1 + 109;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i255 % 128;
                                                                Invoke = i255 % 2;
                                                                try {
                                                                    int iKeyCodeFromString2 = 270 - KeyEvent.keyCodeFromString("");
                                                                    int i256 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                    int i257 = i256 * (-518);
                                                                    int i258 = (i257 & (-18130)) + (i257 | (-18130));
                                                                    int i259 = ~i256;
                                                                    int i260 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                                                    int i261 = ~(i259 | i260);
                                                                    int i262 = -(-(((i261 & 35) | (i261 ^ 35)) * 519));
                                                                    int i263 = ((i258 | i262) << 1) - (i258 ^ i262);
                                                                    int i264 = (i259 & i260) | (i259 ^ i260);
                                                                    int i265 = ~((i264 & 35) | (i264 ^ 35));
                                                                    int i266 = (i256 ^ 35) | (i256 & 35);
                                                                    int i267 = ~((i266 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i266 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                                                    int i268 = -(-(((i265 & i267) | (i265 ^ i267)) * (-519)));
                                                                    int i269 = (((i263 | i268) << 1) - (i268 ^ i263)) + ((i256 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & 35) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 ^ 35)))) * 519);
                                                                    int i270 = -(-KeyEvent.normalizeMetaState(0));
                                                                    Object[] objArr31 = new Object[1];
                                                                    a(false, iKeyCodeFromString2, i269, ((i270 | 30) << 1) - (i270 ^ 30), new char[]{65487, 20, 6, 4, 22, 19, '\n', 21, 26, 65487, 4, 6, 19, 21, 65487, 65529, 65494, 65489, 65498, 65508, 6, 19, 21, '\n', 7, '\n', 4, 2, 21, 6, 11, 2, 23, 2}, objArr31);
                                                                    Class<?> cls8 = Class.forName((String) objArr31[0]);
                                                                    int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                                                                    int i271 = touchSlop2 * (-300);
                                                                    int i272 = ((i271 | 81540) << 1) - (i271 ^ 81540);
                                                                    int i273 = (touchSlop2 ^ 270) | (touchSlop2 & 270);
                                                                    int i274 = i272 + ((~((i273 & i) | (i273 ^ i))) * (-301));
                                                                    int i275 = ~(((-271) & i) | ((-271) ^ i));
                                                                    int i276 = ~((i214 ^ touchSlop2) | (i214 & touchSlop2));
                                                                    int i277 = ~touchSlop2;
                                                                    Object[] objArr32 = new Object[1];
                                                                    a(false, ((i274 + (((i275 & i276) | (i275 ^ i276)) * (-301))) - (~(((~((i277 & i) | (i277 ^ i))) | (-271)) * 301))) - 1, 22 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16)))), 7 - Process.getGidForName(""), new char[]{19, '\n', 15, 4, '\n', 17, 2, '\r', '\b', 6, 21, 65524, 22, 3, 11, 6, 4, 21, 65529, 65494, 65489, 65489, 65521}, objArr32);
                                                                    Invoke = cls8.getMethod((String) objArr32[0], null).invoke(objInvoke4, null);
                                                                    if (!NewInstance.equals(Invoke)) {
                                                                        try {
                                                                            int i278 = -(Process.myTid() >> 22);
                                                                            int i279 = (i278 ^ 270) + ((i278 & 270) << 1);
                                                                            int i280 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                            int i281 = TuitionPaymentFragmentbindingInflater1;
                                                                            int i282 = (i281 & 21) + (i281 | 21);
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i282 % 128;
                                                                            int i283 = i282 % 2;
                                                                            int i284 = ~((-36) | i110);
                                                                            int i285 = ~i280;
                                                                            int i286 = ~((i285 & i) | (i285 ^ i));
                                                                            int i287 = (((i280 * 371) + 12985) - (~(-(-((-370) * ((i284 & i286) | (i284 ^ i286))))))) - 1;
                                                                            int i288 = ~i280;
                                                                            int i289 = ~((i288 & i110) | (i288 ^ i110));
                                                                            int i290 = ~((-36) | i);
                                                                            int i291 = i281 + 89;
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i291 % 128;
                                                                            if (i291 % 2 == 0) {
                                                                                int i292 = (i289 ^ i290) | (i290 & i289);
                                                                                int i293 = ~((i280 & 35) | (i280 ^ 35));
                                                                                int i294 = -(-(((i292 & i293) | (i292 ^ i293)) * (-370)));
                                                                                int i295 = (i287 & i294) + (i287 | i294);
                                                                                int i296 = i293 * 370;
                                                                                i17 = ((i295 | i296) << 1) - (i296 ^ i295);
                                                                            } else {
                                                                                int i297 = (i280 & 35) | (i280 ^ 35);
                                                                                int i298 = ((i289 ^ i290) | (i290 & i289) | (~i297)) * (-370);
                                                                                i17 = (((i287 | i298) << 1) - (i287 ^ i298)) + ((~i297) * 370);
                                                                            }
                                                                            int i299 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                                            Object[] objArr33 = new Object[1];
                                                                            a(false, i279, i17, (i299 ^ 29) + ((i299 & 29) << 1), new char[]{65487, 20, 6, 4, 22, 19, '\n', 21, 26, 65487, 4, 6, 19, 21, 65487, 65529, 65494, 65489, 65498, 65508, 6, 19, 21, '\n', 7, '\n', 4, 2, 21, 6, 11, 2, 23, 2}, objArr33);
                                                                            Class<?> cls9 = Class.forName((String) objArr33[0]);
                                                                            int threadPriority = Process.getThreadPriority(0);
                                                                            int i300 = TuitionPaymentFragmentbindingInflater1 + 33;
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i300 % 128;
                                                                            if (i300 % 2 == 0) {
                                                                                int i301 = 270 % ((((threadPriority | (-72)) << 1) - (threadPriority ^ (-72))) * 49);
                                                                                int iRed = 15 >>> Color.red(0);
                                                                                capsMode = TextUtils.getCapsMode("", 0, 1);
                                                                                i18 = 88;
                                                                                i20 = iRed;
                                                                                i19 = i301;
                                                                            } else {
                                                                                int i302 = ((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6;
                                                                                int i303 = (i302 & 270) + (i302 | 270);
                                                                                int i304 = -Color.red(0);
                                                                                capsMode = TextUtils.getCapsMode("", 0, 0);
                                                                                i18 = 8;
                                                                                i19 = i303;
                                                                                i20 = (i304 & 23) + (i304 | 23);
                                                                            }
                                                                            int i305 = -capsMode;
                                                                            Object[] objArr34 = new Object[1];
                                                                            a(false, i19, i20, (i18 & i305) + (i18 | i305), new char[]{19, '\n', 15, 4, '\n', 17, 2, '\r', '\b', 6, 21, 65524, 22, 3, 11, 6, 4, 21, 65529, 65494, 65489, 65489, 65521}, objArr34);
                                                                            if (!objNewInstance.equals(cls9.getMethod((String) objArr34[0], null).invoke(objInvoke4, null))) {
                                                                                Invoke = i2;
                                                                                i148 = (i236 ^ 1) + ((i236 & 1) << 1);
                                                                                length = i207;
                                                                                objArr19 = objArr19;
                                                                                i21 = 2;
                                                                                i147 = 10;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            Throwable cause2 = th4.getCause();
                                                                            if (cause2 != null) {
                                                                                throw cause2;
                                                                            }
                                                                            throw th4;
                                                                        }
                                                                    }
                                                                    int i306 = (~(i & 1)) & (i | 1);
                                                                    Object[] objArr35 = new Object[4];
                                                                    int[] iArr = new int[1];
                                                                    objArr35[0] = iArr;
                                                                    int[] iArr2 = new int[1];
                                                                    objArr35[1] = iArr2;
                                                                    int[] iArr3 = new int[1];
                                                                    objArr35[2] = iArr3;
                                                                    int i307 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                                                                    TuitionPaymentFragmentbindingInflater1 = i307 % 128;
                                                                    int i308 = i307 % 2;
                                                                    iArr[0] = i;
                                                                    iArr3[0] = i306;
                                                                    objArr35[3] = null;
                                                                    int i309 = (-1540766820) + ((~((-46139953) | i110)) * 52) + (((~(1026504077 | i110)) | (~(986193848 | i110)) | (-1072644030)) * (-52)) + (((~((-1026504078) | i110)) | 940053896) * 52);
                                                                    int i310 = (i2 - (~(-(-((i309 & 16) + (i309 | 16)))))) - 1;
                                                                    int i311 = i310 << 13;
                                                                    int i312 = (i310 | i311) & (~(i310 & i311));
                                                                    int i313 = i312 >>> 17;
                                                                    int i314 = (i312 | i313) & (~(i312 & i313));
                                                                    int i315 = i314 << 5;
                                                                    iArr2[0] = (i314 | i315) & (~(i314 & i315));
                                                                    return objArr35;
                                                                } catch (Throwable th5) {
                                                                    Throwable cause3 = th5.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th5;
                                                                }
                                                            } catch (Throwable th6) {
                                                                Throwable cause4 = th6.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th6;
                                                            }
                                                        } catch (Throwable unused) {
                                                            Invoke = i2;
                                                        }
                                                    } catch (Throwable th7) {
                                                        Throwable cause5 = th7.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th7;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            Throwable cause6 = th8.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th8;
                                        }
                                    } catch (Throwable th9) {
                                        Throwable cause7 = th9.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th9;
                                    }
                                } catch (Throwable th10) {
                                    Throwable cause8 = th10.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th10;
                                }
                            } catch (Throwable th11) {
                                Throwable cause9 = th11.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th11;
                            }
                        } catch (Throwable th12) {
                            Throwable cause10 = th12.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th12;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                Object[] objArr36 = {new int[]{i}, new int[1], new int[]{i}, null};
                int i316 = (((~(i | 1033722117)) | (-993411889)) * 56) + 74044660 + (((~((~i) | (-993411889))) | 1033722117) * 56);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i317 = i316 * (-195);
                int i318 = ~(~i316);
                int i319 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & i316) | (i316 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                int i320 = -(-(((i318 & i319) | (i318 ^ i319)) * (-196)));
                int i321 = (i317 & i320) + (i317 | i320) + (i316 * 392);
                int i322 = ~i316;
                int i323 = ~(i322 | ((-1) ^ i322));
                int i324 = (i319 & i323) | (i323 ^ i319);
                int i325 = TuitionPaymentFragmentbindingInflater1;
                int i326 = (i325 & 69) + (i325 | 69);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i326 % 128;
                if (i326 % 2 == 0) {
                    i3 = (i321 - (~(-(196 << i324)))) - 1;
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    i4 = (829 << i3) >>> (829 >>> Invoke);
                } else {
                    int i327 = i324 * 196;
                    i3 = (i321 ^ i327) + ((i327 & i321) << 1);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    i4 = (i3 * 829) + (Invoke * 829);
                }
                int i328 = ~i3;
                int i329 = ~Invoke;
                AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i330 = ~((i328 & i329) | (i328 ^ i329));
                int i331 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i332 = (i331 & i3) | (i331 ^ i3);
                int i333 = ~((i332 & Invoke) | ((i332 ^ Invoke) == true ? 1 : 0));
                int i334 = -(-((-828) * ((i330 & i333) | (i330 ^ i333))));
                int i335 = (i4 & i334) + (i4 | i334);
                int i336 = i3 | Invoke;
                int i337 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i338 = ((i335 - (~(((i337 & i336) | (i336 ^ i337)) * (-828)))) - 1) + ((~(((i3 ^ Invoke) == true ? 1 : 0) | (Invoke & i3))) * 828);
                int i339 = i338 << 13;
                int i340 = (i339 | i338) & (~(i338 & i339));
                int i341 = i340 >>> 17;
                int i342 = ((~i340) & i341) | ((~i341) & i340);
                int i343 = i342 << 5;
                ((int[]) objArr36[1])[0] = ((~i342) & i343) | ((~i343) & i342);
                return objArr36;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r6, int r7, byte r8) {
                /*
                    byte[] r0 = defpackage.grantUriPermissionToProvider.$$a
                    int r7 = 120 - r7
                    int r8 = r8 * 3
                    int r1 = 1 - r8
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L15
                    r3 = r7
                    r4 = r2
                    r7 = r6
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r6 = r6 + 1
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = r6 + r3
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.grantUriPermissionToProvider.$$c(byte, int, byte):java.lang.String");
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ensureOnCreateCalled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, str2, str3, str4)));
        final Function1 function1 = new Function1() { // from class: TrustedWebActivityService
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isSticky.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (OtpVerificationResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setShareParams
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setDisplayMode
            private static final byte[] $$c = {23, -73, 107, 5};
            private static final int $$f = 214;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {108, -26, -110, 50, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
            private static final int $$e = 198;
            private static final byte[] $$a = {1, 115, -83, 116, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
            private static final int $$b = 139;
            private static int asInterface = 0;
            private static int d = 1;
            private static char[] b = {59718, 59798, 59806, 59800, 59795, 59806, 59787, 59732, 59763, 59795, 59803, 59800, 59795, 59806, 59803, 59748, 59771, 59782, 59800, 59804, 59801, 59803, 59781, 59730, 59792, 59799, 59709, 59749, 59770, 59751, 59757, 59759, 59757, 59756, 59753, 59747, 59715, 59713, 59768, 59749, 59745, 59725, 59698, 59750, 59681, 59743, 59718, 59698, 59705, 59688, 59736, 59758, 59745, 59747, 59759, 59721, 59713, 59770, 59724, 59722, 59745, 59744, 59752, 59745, 59751, 59721, 59723, 59723, 59715, 59770, 59771, 59746, 59759, 59751, 59768, 59739, 59676, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59724, 59718, 59749, 59746, 59717, 59716, 59757, 59759, 59757, 59756, 59753, 59747, 59670, 59767, 59891, 59889, 59400, 59395, 59892, 59899, 59903, 59894, 59403, 59404, 59393, 59889, 59900, 59403, 59889, 59716, 59804, 59801, 59803, 59800, 59800, 59784, 59780, 59793, 59801, 59805, 59794, 59776, 59789, 59803, 59801, 59792, 59794, 59787, 59758, 59761, 59804, 59804, 59807, 59781, 59768, 59760, 59799, 59807, 59768, 59774, 59801, 59795, 59799, 59804, 59806, 59800, 59704, 59750, 59771, 59744, 59744, 59747, 59737, 59736, 59750, 59748, 59749, 59744, 59737, 59729, 59751, 59711, 59749, 59754, 59754, 59771, 59745, 59756, 59745, 59747, 59729, 59752, 59769, 59746, 59744, 59730, 59731, 59771, 59786, 59889, 59900, 59863, 59883, 59402, 59889, 59890, 59895, 59900, 59899, 59900, 59892, 59901, 59899, 59897, 59859, 59860, 59407, 59407, 59781, 59438, 59438, 59414, 59407, 59400, 59438, 59438, 59414, 59407, 59394, 59431, 59398, 59406, 59412, 59414, 59432, 59431, 59392, 59395, 59434, 59437, 59436, 59407, 59407, 59434, 59436, 59424, 59437, 59439, 59433, 59401, 59407, 59439, 59426, 59427, 59433, 59400, 59395, 59426, 59439, 59407, 59676, 59713, 59751, 59744, 59714, 59719, 59744, 59744, 59749, 59738, 59738, 59749, 59749, 59745, 59756, 59717, 59739, 59750};
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47415, 47417, 47402, 47374, 47421, 47419, 47411, 47376, 47409, 47389, 47406, 47410, 47413, 47407, 47408, 47381, 47416, 47343, 47316, 47398, 47332, 47344, 47418, 47400, 47423, 47397, 47404, 47387, 47401, 47403, 47375, 47371, 47420};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719646;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static boolean f1368a = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void f(int r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = 115 - r8
                    int r7 = 34 - r7
                    int r6 = 66 - r6
                    byte[] r0 = defpackage.setDisplayMode.$$a
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r8
                    r5 = r2
                    r8 = r6
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L23:
                    r3 = r0[r6]
                L25:
                    int r6 = r6 + 1
                    int r8 = r8 + r3
                    int r8 = r8 + (-2)
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setDisplayMode.f(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void g(byte r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 84
                    byte[] r0 = defpackage.setDisplayMode.$$d
                    int r8 = r8 + 4
                    int r6 = r6 * 52
                    int r1 = 53 - r6
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L15
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2d
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2d:
                    int r7 = r7 + r8
                    int r7 = r7 + (-10)
                    r8 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setDisplayMode.g(byte, byte, short, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = asInterface + 31;
                d = i2 % 128;
                int i3 = i2 % 2;
                Unit unitB = isSticky.b(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
                int i4 = asInterface + 71;
                d = i4 % 128;
                int i5 = i4 % 2;
                return unitB;
            }

            private static void e(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
                char[] cArr2;
                int i2 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i3 = -1;
                char c = 0;
                if (cArr3 != null) {
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[c] = Integer.valueOf(cArr3[i4]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i3;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31340 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 2995, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            cArr4[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i4++;
                            i3 = -1;
                            c = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - Drawable.resolveOpacity(0, 0)), ImageFormat.getBitsPerPixel(0) + 254, 22 - View.getDefaultSize(0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i5 = 1687675375;
                    float f = 0.0f;
                    if (f1368a) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 33602), 3085 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getSize(0) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            f = 0.0f;
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                            int i6 = $10 + 91;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                        }
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i8 = $10 + 27;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i9 = $10 + 101;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33601 - Process.getGidForName("")), 3085 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.green(0) + 26, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        i5 = 1687675375;
                    }
                    objArr[0] = new String(cArr2);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                int i2 = 2;
                int i3 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                char c = 0;
                int i4 = iArr[0];
                int i5 = 1;
                int i6 = iArr[1];
                int i7 = iArr[2];
                int i8 = iArr[3];
                char[] cArr = b;
                int i9 = -1;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $11 + 43;
                        $10 = i11 % 128;
                        int i12 = i11 % i2;
                        try {
                            Object[] objArr2 = new Object[i5];
                            objArr2[c] = Integer.valueOf(cArr[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i9;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 1270, 18 - (ViewConfiguration.getScrollBarSize() >> 8), 407021364, false, $$g(b2, b3, (byte) (b3 | 33)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i10++;
                            i2 = 2;
                            c = 0;
                            i5 = 1;
                            i9 = -1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i6];
                System.arraycopy(cArr, i4, cArr3, 0, i6);
                if (bArr != null) {
                    int i13 = $11 + 17;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    char[] cArr4 = new char[i6];
                    setvideostabilizationmode.b = 0;
                    char c2 = 0;
                    while (setvideostabilizationmode.b < i6) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i15 = setvideostabilizationmode.b;
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.argb(0, 0, 0, 0) + 3225, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, 2133916302, false, $$g(b4, b5, (byte) (b5 | 32)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        } else {
                            int i16 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) (-1);
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944), 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, 387247676, false, $$g(b6, b7, (byte) (b7 | 34)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        }
                        c2 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.getGidForName("") + 41242), 1705 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 20 - TextUtils.indexOf((CharSequence) "", '0'), -1434471773, false, $$g(b8, b9, (byte) (b9 | 38)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i8 > 0) {
                    char[] cArr5 = new char[i6];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i6);
                    int i17 = i6 - i8;
                    System.arraycopy(cArr5, 0, cArr3, i17, i8);
                    System.arraycopy(cArr5, i8, cArr3, 0, i17);
                } else {
                    i = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i6];
                    while (true) {
                        setvideostabilizationmode.b = i;
                        if (setvideostabilizationmode.b >= i6) {
                            break;
                        }
                        cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                    cArr3 = cArr6;
                }
                if (i7 > 0) {
                    int i18 = 0;
                    loop3: while (true) {
                        setvideostabilizationmode.b = i18;
                        while (true) {
                            if (setvideostabilizationmode.b >= i6) {
                                break loop3;
                            }
                            int i19 = $11 + 27;
                            $10 = i19 % 128;
                            if (i19 % 2 != 0) {
                                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[3]);
                                setvideostabilizationmode.b = setvideostabilizationmode.b;
                            }
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i18 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Code duplicated, block: B:113:0x09cd A[Catch: Exception -> 0x0d00, all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:116:0x0a20 A[Catch: Exception -> 0x0d00, all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:120:0x0adc A[Catch: all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:122:0x0b32 A[Catch: all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:124:0x0b4f A[Catch: all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:126:0x0be6 A[Catch: all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:128:0x0c01 A[Catch: all -> 0x0d20, IOException -> 0x0d2c, TRY_LEAVE, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:132:0x0c29  */
            /* JADX WARN: Code duplicated, block: B:174:0x0c8a A[Catch: Exception -> 0x0d00, all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:175:0x0c8b A[Catch: Exception -> 0x0d00, all -> 0x0d20, IOException -> 0x0d2c, TryCatch #0 {all -> 0x0d20, blocks: (B:110:0x09bc, B:111:0x09bf, B:113:0x09cd, B:114:0x0a0a, B:116:0x0a20, B:117:0x0a5d, B:118:0x0a6e, B:120:0x0adc, B:122:0x0b32, B:124:0x0b4f, B:126:0x0be6, B:128:0x0c01, B:130:0x0c0b, B:204:0x0d00, B:205:0x0d1f, B:155:0x0c5b, B:156:0x0c5e, B:159:0x0c63, B:161:0x0c6b, B:162:0x0c6c, B:172:0x0c82, B:174:0x0c8a, B:175:0x0c8b, B:182:0x0ca5, B:184:0x0cb1, B:185:0x0cb2, B:192:0x0cd2, B:194:0x0cde, B:195:0x0cdf), top: B:303:0x09bc }] */
            /* JADX WARN: Code duplicated, block: B:216:0x0d2e  */
            /* JADX WARN: Code duplicated, block: B:249:0x1111 A[EDGE_INSN: B:249:0x1111->B:250:0x1114 BREAK  A[LOOP:5: B:229:0x0e70->B:248:0x1103], PHI: r2
  0x1111: PHI (r2v146 java.lang.String[]) = (r2v143 java.lang.String[]), (r2v143 java.lang.String[]), (r2v150 java.lang.String[]) binds: [B:225:0x0e28, B:227:0x0e6a, B:371:0x1111] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:25:0x0362  */
            /* JADX WARN: Code duplicated, block: B:27:0x0365  */
            /* JADX WARN: Code duplicated, block: B:30:0x03f8 A[Catch: all -> 0x17b7, TryCatch #15 {all -> 0x17b7, blocks: (B:13:0x01bd, B:15:0x01d4, B:17:0x0237, B:28:0x03e1, B:30:0x03f8, B:32:0x0454, B:239:0x0fb6, B:241:0x0fce, B:243:0x1023, B:265:0x1157, B:267:0x1164, B:268:0x11a7, B:270:0x1273, B:272:0x1280, B:273:0x12c9, B:275:0x13c3, B:277:0x13d0, B:278:0x141d, B:280:0x14fe, B:282:0x150b, B:283:0x1552, B:285:0x162f, B:287:0x163c, B:288:0x1680), top: B:322:0x01bd }] */
            /* JADX WARN: Code duplicated, block: B:31:0x044e  */
            /* JADX WARN: Code duplicated, block: B:330:0x0641 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:341:0x069a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:361:0x0501 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:362:0x0515 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:367:0x0c0b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:368:0x0d2c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:36:0x0503 A[LOOP:1: B:26:0x0363->B:36:0x0503, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:370:0x0c2b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x0515 A[EDGE_INSN: B:37:0x0515->B:38:0x0520 BREAK  A[LOOP:1: B:26:0x0363->B:36:0x0503], PHI: r1 r2 r5 r6 r8 r15
  0x0515: PHI (r1v57 int) = (r1v56 int), (r1v139 int) binds: [B:24:0x0360, B:362:0x0515] A[DONT_GENERATE, DONT_INLINE]
  0x0515: PHI (r2v188 int) = (r2v187 int), (r2v279 int) binds: [B:24:0x0360, B:362:0x0515] A[DONT_GENERATE, DONT_INLINE]
  0x0515: PHI (r5v163 byte) = (r5v120 byte), (r5v209 byte) binds: [B:24:0x0360, B:362:0x0515] A[DONT_GENERATE, DONT_INLINE]
  0x0515: PHI (r6v157 java.lang.Object) = (r6v156 java.lang.Object), (r6v218 java.lang.Object) binds: [B:24:0x0360, B:362:0x0515] A[DONT_GENERATE, DONT_INLINE]
  0x0515: PHI (r8v98 byte) = (r8v97 byte), (r8v182 byte) binds: [B:24:0x0360, B:362:0x0515] A[DONT_GENERATE, DONT_INLINE]
  0x0515: PHI (r15v25 int) = (r15v7 int), (r15v52 int) binds: [B:24:0x0360, B:362:0x0515] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x05b9  */
            /* JADX WARN: Code duplicated, block: B:42:0x05dc  */
            /* JADX WARN: Code duplicated, block: B:44:0x05f9  */
            /* JADX WARN: Code duplicated, block: B:56:0x0681  */
            /* JADX WARN: Code duplicated, block: B:66:0x06d6  */
            /* JADX WARN: Multi-variable type inference failed */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                String[] strArr;
                byte b2;
                Object obj;
                byte b3;
                int i7;
                int i8;
                int i9;
                Object obj2;
                int i10;
                byte b4;
                int i11;
                int i12;
                int i13;
                byte b5;
                Object obj3;
                String str5;
                int i14;
                int i15;
                int i16;
                Object obj4;
                byte b6;
                byte b7;
                int i17;
                byte b8;
                Object obj5;
                String[] strArrSplit;
                int length;
                int i18;
                String str6;
                Object[] objArr;
                String[] strArr2;
                byte b9;
                int i19;
                Class cls;
                Process processExec;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Throwable th;
                Throwable cause;
                Throwable th2;
                String str7;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                String[] strArrSplit2;
                int length2;
                int i20;
                String str8;
                Object[] objArr2;
                String str9;
                Object[] objArr3;
                Object[] objArr4;
                String[] strArrSplit3;
                int i21;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                int i22;
                long j;
                int i23;
                int iNextInt;
                int i24 = i;
                int i25 = 1;
                if (context != null) {
                    try {
                        Object[] objArr5 = new Object[1];
                        c(new int[]{0, 23, 39, 0}, true, new byte[]{1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr5);
                        Class<?> cls2 = Class.forName((String) objArr5[0]);
                        int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                        int i26 = (tapTimeout ^ i24) | (tapTimeout & i24);
                        int i27 = ((tapTimeout * 677) - 85725) + (((i26 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i26 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * (-676));
                        int i28 = ~(((-128) ^ tapTimeout) | ((-128) & tapTimeout));
                        int i29 = ~i24;
                        int i30 = ~((i29 ^ tapTimeout) | (i29 & tapTimeout));
                        int i31 = -(-(((i28 ^ i30) | (i28 & i30)) * 676));
                        int i32 = ((i27 | i31) << 1) - (i31 ^ i27);
                        int i33 = ~tapTimeout;
                        int i34 = ~((i33 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i33 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                        int i35 = ~i24;
                        int i36 = ~(((-128) ^ i35) | ((-128) & i35));
                        int i37 = (i34 ^ i36) | (i34 & i36);
                        int i38 = tapTimeout | 127;
                        int i39 = ~((i38 & i24) | (i38 ^ i24));
                        int i40 = i37 ^ i39;
                        Object[] objArr6 = new Object[1];
                        e((i32 - (~(((i37 & i39) | i40) * 676))) - 1, null, null, new byte[]{-126, -119, -123, -120, -126, -127, -123, -121, -122, -123, -124, -125, -126, -127}, objArr6);
                        String str10 = (String) cls2.getMethod((String) objArr6[0], null).invoke(context, null);
                        Object[] objArr7 = new Object[1];
                        c(new int[]{0, 23, 39, 0}, true, new byte[]{1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[0]);
                        int i41 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i42 = i41 * 141;
                        int i43 = (((i42 & (-35433)) + (i42 | (-35433))) - (~((i24 | 127) * 140))) - 1;
                        int i44 = ~i41;
                        int i45 = ~((i44 & 127) | (i44 ^ 127));
                        int i46 = ~((i35 ^ 127) | (i35 & 127));
                        int i47 = (i43 - (~(((i45 ^ i46) | (i45 & i46)) * (-280)))) - 1;
                        int i48 = (~((-128) | i41)) | (~((i29 ^ i41) | (i29 & i41)));
                        int i49 = (~i41) | 127;
                        int i50 = ~((i49 & i24) | (i49 ^ i24));
                        int i51 = ((i50 & i48) | (i48 ^ i50)) * 140;
                        Object[] objArr8 = new Object[1];
                        e((i47 & i51) + (i47 | i51), null, null, new byte[]{-114, -111, -113, -112, -113, -114, -115, -125, -123, -122, -115, -116, -117, -117, -118, -125, -126, -127}, objArr8);
                        Object objInvoke = cls3.getMethod((String) objArr8[0], null).invoke(context, null);
                        byte b10 = (byte) 62;
                        byte[] bArr = $$a;
                        Object[] objArr9 = new Object[1];
                        f(b10, bArr[28], (byte) (-bArr[35]), objArr9);
                        Class<?> cls4 = Class.forName((String) objArr9[0]);
                        byte b11 = (byte) 29;
                        Object[] objArr10 = new Object[1];
                        f(b11, (byte) (-bArr[40]), bArr[57], objArr10);
                        int iIndexOf = ((String) cls4.getField((String) objArr10[0]).get(objInvoke)).indexOf(str10);
                        if (iIndexOf > 0) {
                            Object[] objArr11 = new Object[1];
                            f(b10, bArr[28], (byte) (-bArr[35]), objArr11);
                            Class<?> cls5 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            f(b11, (byte) (-bArr[40]), bArr[57], objArr12);
                            String str11 = (String) cls5.getField((String) objArr12[0]).get(objInvoke);
                            int length3 = str11.length();
                            int i52 = (length3 & (-16)) + (length3 | (-16));
                            if (i52 >= 0) {
                                int i53 = 0;
                                while (true) {
                                    if (i53 > i52) {
                                        i4 = i24;
                                        iIndexOf = iIndexOf;
                                        obj2 = objInvoke;
                                        i10 = i29;
                                        b4 = b10;
                                        i11 = 0;
                                        break;
                                    }
                                    String strSubstring = str11.substring(i53, (i53 & 16) + (i53 | 16));
                                    try {
                                        Object[] objArr13 = new Object[2];
                                        objArr13[i25] = 931995;
                                        objArr13[0] = strSubstring;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + i25);
                                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3393;
                                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 9;
                                            byte[] bArr2 = $$d;
                                            Object[] objArr14 = new Object[1];
                                            g(bArr2[37], (byte) (bArr2[33] - 1), bArr2[7], objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, absoluteGravity, jumpTapTimeout, 1203525406, false, (String) objArr14[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                        long j2 = 194662186;
                                        obj2 = objInvoke;
                                        long j3 = 530;
                                        long j4 = ((long) 1058) + (j3 * j2) + (j3 * jLongValue);
                                        long j5 = 529;
                                        int i54 = i29;
                                        b4 = b10;
                                        long j6 = i24;
                                        i10 = i54;
                                        long j7 = -1;
                                        long j8 = j4 + (((((j6 ^ j7) | j2) ^ j7) | ((j2 | jLongValue) ^ j7)) * j5) + (j5 * ((j7 ^ (j6 | j2)) | (jLongValue ^ j7))) + ((long) (-196732063));
                                        i4 = i;
                                        int i55 = ((int) (j8 >> 32)) & (109276564 + (((-1398542378) | i35) * (-757)) + ((~((-17039361) | i4)) * 1514) + (((~(1459198507 | i35)) | (-1476237868) | (~((-1381503018) | i4))) * 757));
                                        int i56 = ((int) j8) & (802172634 + (((-100737579) | i35) * (-369)) + (((~(1335964222 | i35)) | (-101262188)) * (-369)) + (((~((-1335964223) | i4)) | 1235226644 | (~((-524610) | i35))) * 369));
                                        if (((i55 & i56) | (i55 ^ i56)) == -725904754) {
                                            i11 = 1;
                                            break;
                                        }
                                        i53 = (((i53 | (-24)) << 1) - (i53 ^ (-24))) + 25;
                                        i24 = i4;
                                        objInvoke = obj2;
                                        b10 = b4;
                                        i29 = i10;
                                        str11 = str11;
                                        i52 = i52;
                                        iIndexOf = iIndexOf;
                                        i25 = 1;
                                    } catch (Throwable th3) {
                                        Throwable cause2 = th3.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th3;
                                    }
                                }
                                i12 = (i4 & (-21)) | (i35 & 20);
                                int i57 = -i11;
                                int i58 = ((i11 & i57) | (i11 ^ i57)) >> 31;
                                int i59 = (~i58) & i4;
                                int i60 = i58 & i12;
                                i13 = (i60 & i59) | (i59 ^ i60);
                                byte[] bArr3 = $$a;
                                Object[] objArr15 = new Object[1];
                                b5 = b4;
                                f(b5, bArr3[28], (byte) (-bArr3[35]), objArr15);
                                Class<?> cls6 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                f(b11, (byte) (-bArr3[40]), bArr3[57], objArr16);
                                Field field = cls6.getField((String) objArr16[0]);
                                obj3 = obj2;
                                str5 = (String) field.get(obj3);
                                int length4 = str5.length();
                                i14 = ((length4 | (-6)) << 1) - (length4 ^ (-6));
                                if (i14 >= 0) {
                                    i15 = i13;
                                    i16 = i12;
                                    obj4 = obj3;
                                    b6 = b5;
                                    i35 = i35;
                                    b7 = b11;
                                    i17 = 0;
                                    break;
                                }
                                i21 = 0;
                                while (true) {
                                    if (i21 <= i14) {
                                        i15 = i13;
                                        i16 = i12;
                                        obj4 = obj3;
                                        b6 = b5;
                                        i35 = i35;
                                        b7 = b11;
                                        i17 = 0;
                                        break;
                                    }
                                    int i61 = 3413 - (~(-(-(i21 * 569))));
                                    int i62 = ~i21;
                                    int i63 = ~(((-7) ^ i62) | ((-7) & i62));
                                    int i64 = ~(((-7) & i35) | ((-7) ^ i35));
                                    int i65 = (i64 & i63) | (i63 ^ i64);
                                    int i66 = ~i21;
                                    int i67 = ~(i66 | i35);
                                    int i68 = -(-(((i65 ^ i67) | (i65 & i67)) * (-1136)));
                                    int i69 = (i61 ^ i68) + ((i61 & i68) << 1);
                                    int i70 = ~(((-7) & i4) | ((-7) ^ i4));
                                    int i71 = ~((i62 & i4) | (i62 ^ i4));
                                    int i72 = (i70 & i71) | (i70 ^ i71);
                                    int i73 = (i10 ^ 6) | (i10 & 6);
                                    int i74 = ~((i73 & i21) | (i73 ^ i21));
                                    int i75 = -(-(((i72 & i74) | (i72 ^ i74)) * (-568)));
                                    int i76 = (i69 ^ i75) + ((i75 & i69) << 1);
                                    int i77 = ~((i35 ^ 6) | (i35 & 6));
                                    int i78 = ~((i35 ^ i21) | (i35 & i21));
                                    int i79 = (i77 & i78) | (i77 ^ i78);
                                    int i80 = ((-7) & i66) | ((-7) ^ i66);
                                    int i81 = -(-((i79 | (~((i80 & i4) | (i80 ^ i4)))) * 568));
                                    Object[] objArr17 = {str5.substring(i21, (i76 ^ i81) + ((i81 & i76) << 1)), 931995};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3393;
                                        int i82 = 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        byte[] bArr4 = $$d;
                                        Object[] objArr18 = new Object[1];
                                        g(bArr4[37], (byte) (bArr4[33] - 1), bArr4[7], objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, iMakeMeasureSpec, i82, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                    long j9 = 759771137;
                                    b7 = b11;
                                    obj4 = obj3;
                                    long j10 = (((long) (-665)) * j9) + (((long) 334) * jLongValue2);
                                    i15 = i13;
                                    i16 = i12;
                                    long j11 = -1;
                                    long j12 = j9 ^ j11;
                                    long j13 = 333;
                                    i22 = i21;
                                    b6 = b5;
                                    long j14 = i4;
                                    long j15 = j14 ^ j11;
                                    j = j10 + (((long) (-333)) * j12) + ((((j12 | j15) ^ j11) | ((jLongValue2 | j14) ^ j11)) * j13) + (j13 * ((j11 ^ (j15 | jLongValue2)) | ((j14 | j12) ^ j11))) + ((long) (-761841014));
                                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int i83 = ~iElapsedRealtime;
                                    i23 = ((int) (j >> 32)) & ((-677090546) + (((~(i83 | (-1428962616))) | 1428696341 | (~(1429044543 | iElapsedRealtime))) * 717) + (((~(iElapsedRealtime | (-1428962616))) | (~(i83 | 1429044543)) | 1428696341) * 717));
                                    iNextInt = new Random().nextInt();
                                    if ((i23 | (((int) j) & (2088992125 + ((2074978926 | iNextInt) * 376) + (((~((~iNextInt) | 319942370)) | 1756102668) * (-376)) + (((~(iNextInt | (-319942371))) | (-1757168781)) * 376)))) == -2096167706) {
                                        i17 = 1;
                                        break;
                                    }
                                    i21 = i22 + 1;
                                    b5 = b6;
                                    b11 = b7;
                                    str5 = str5;
                                    i14 = i14;
                                    i35 = i35;
                                    obj3 = obj4;
                                    i12 = i16;
                                    i13 = i15;
                                }
                                int i84 = -i17;
                                int i85 = ((i17 & i84) | (i17 ^ i84)) >> 31;
                                int i86 = (~i85) & i4;
                                int i87 = i16 & i85;
                                int i88 = (i87 & i86) | (i86 ^ i87);
                                int i89 = (~(i4 & i15)) & (i4 | i15);
                                int i90 = -i89;
                                int i91 = ((i89 & i90) | (i89 ^ i90)) >> 31;
                                i8 = (i88 & (~i91)) | (i15 & i91);
                                byte[] bArr5 = $$a;
                                Object[] objArr19 = new Object[1];
                                f(b6, bArr5[28], (byte) (-bArr5[35]), objArr19);
                                Class<?> cls7 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                b8 = b7;
                                f(b8, (byte) (-bArr5[40]), bArr5[57], objArr20);
                                Field field2 = cls7.getField((String) objArr20[0]);
                                obj5 = obj4;
                                int i92 = iIndexOf ^ (-1);
                                int i93 = -i92;
                                String strSubstring2 = ((String) field2.get(obj5)).substring(0, iIndexOf & (((i92 & i93) | (i92 ^ i93)) >> 31));
                                int i94 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                Object[] objArr21 = new Object[1];
                                e(((i94 | 127) << 1) - (i94 ^ 127), null, null, new byte[]{-110}, objArr21);
                                strArrSplit = strSubstring2.split((String) objArr21[0]);
                                length = strArrSplit.length;
                                i18 = 0;
                                while (i18 < length) {
                                    str6 = strArrSplit[i18];
                                    objArr = new Object[1];
                                    c(new int[]{23, 3, 87, 3}, false, new byte[]{0, 1, 1}, objArr);
                                    if (str6.split((String) objArr[0]).length > 1) {
                                        cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), 2267 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33);
                                        synchronized (cls) {
                                            try {
                                                try {
                                                    Object[] objArr22 = new Object[1];
                                                    c(new int[]{26, 16, 0, 2}, true, new byte[]{1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, objArr22);
                                                    String str12 = (String) objArr22[0];
                                                    try {
                                                        Runtime runtime = Runtime.getRuntime();
                                                        strArr2 = strArrSplit;
                                                        try {
                                                            Object[] objArr23 = new Object[1];
                                                            c(new int[]{42, 2, 0, 1}, true, new byte[]{1, 1}, objArr23);
                                                            processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                            try {
                                                                Object[] objArr24 = {processExec.getInputStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                    try {
                                                                        try {
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2142, 44 - Process.getGidForName(""), -1020714777, false, null, new Class[]{InputStream.class});
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            Throwable th5 = th;
                                                                            Throwable cause3 = th5.getCause();
                                                                            if (cause3 != null) {
                                                                                throw cause3;
                                                                            }
                                                                            throw th5;
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                    }
                                                                }
                                                                Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                                try {
                                                                    try {
                                                                        Object[] objArr25 = {processExec.getErrorStream()};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                            try {
                                                                                try {
                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), Color.blue(0) + 2142, ExpandableListView.getPackedPositionGroup(0L) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    Throwable th8 = th;
                                                                                    Throwable cause4 = th8.getCause();
                                                                                    if (cause4 != null) {
                                                                                        throw cause4;
                                                                                    }
                                                                                    throw th8;
                                                                                }
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                            }
                                                                        }
                                                                        Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                        try {
                                                                            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                            try {
                                                                                byte[] bArr6 = $$a;
                                                                                byte b12 = bArr6[44];
                                                                                b9 = b8;
                                                                                try {
                                                                                    b6 = b6;
                                                                                    i19 = i18;
                                                                                    try {
                                                                                        Object[] objArr26 = new Object[1];
                                                                                        f(b12, (byte) (b12 - 5), bArr6[58], objArr26);
                                                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                                        byte b13 = bArr6[14];
                                                                                        i8 = i8;
                                                                                        try {
                                                                                            Object[] objArr27 = new Object[1];
                                                                                            f(b13, (byte) (b13 | 21), bArr6[28], objArr27);
                                                                                            cls8.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                            try {
                                                                                                byte b14 = bArr6[44];
                                                                                                Object[] objArr28 = new Object[1];
                                                                                                f(b14, (byte) (b14 - 5), bArr6[58], objArr28);
                                                                                                Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                                                byte b15 = bArr6[14];
                                                                                                Object[] objArr29 = new Object[1];
                                                                                                f(b15, (byte) (b15 | 21), bArr6[28], objArr29);
                                                                                                cls9.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                                try {
                                                                                                    StringBuilder sb = new StringBuilder();
                                                                                                    sb.append(str12);
                                                                                                    int i95 = -View.MeasureSpec.getMode(0);
                                                                                                    int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                                                                                    int i96 = i95 * (-518);
                                                                                                    int i97 = ((i96 | (-65786)) << 1) - (i96 ^ (-65786));
                                                                                                    int i98 = ~i95;
                                                                                                    int i99 = ~iB;
                                                                                                    int i100 = ~(i98 | i99);
                                                                                                    int i101 = (i97 - (~(-(-(((i100 & 127) | (i100 ^ 127)) * 519))))) - 1;
                                                                                                    int i102 = ~((i98 & i99) | (i98 ^ i99) | 127);
                                                                                                    int i103 = (i95 ^ 127) | (i95 & 127);
                                                                                                    int i104 = i101 + ((i102 | (~((i103 & iB) | (i103 ^ iB)))) * (-519));
                                                                                                    int i105 = -(-((i95 | (~((iB & 127) | (iB ^ 127)))) * 519));
                                                                                                    Object[] objArr30 = new Object[1];
                                                                                                    e((i104 & i105) + (i105 | i104), null, null, new byte[]{-109}, objArr30);
                                                                                                    sb.append((String) objArr30[0]);
                                                                                                    String string = sb.toString();
                                                                                                    Object[] objArr31 = new Object[1];
                                                                                                    c(new int[]{44, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr31);
                                                                                                    dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                    dataOutputStream.flush();
                                                                                                    int gidForName = Process.getGidForName("");
                                                                                                    int i106 = ~gidForName;
                                                                                                    int i107 = (((gidForName * (-209)) - 26752) - (~(-(-((~((i106 ^ (-129)) | (i106 & (-129)))) * 210))))) - 1;
                                                                                                    int i108 = ~(((-129) & i35) | ((-129) ^ i35));
                                                                                                    int i109 = ~((i106 ^ i4) | (i106 & i4));
                                                                                                    int i110 = i107 + (((i108 & i109) | (i108 ^ i109)) * 210);
                                                                                                    int i111 = (i106 & i35) | (i106 ^ i35);
                                                                                                    int i112 = ~((i111 & 128) | (i111 ^ 128));
                                                                                                    int i113 = (gidForName & (-129)) | ((-129) ^ gidForName);
                                                                                                    int i114 = ~((i113 & i4) | (i113 ^ i4));
                                                                                                    Object[] objArr32 = new Object[1];
                                                                                                    e((i110 - (~(((i114 & i112) | (i112 ^ i114)) * 210))) - 1, null, null, new byte[]{-109, -125, -115, -108, -126}, objArr32);
                                                                                                    String str13 = (String) objArr32[0];
                                                                                                    Object[] objArr33 = new Object[1];
                                                                                                    c(new int[]{44, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr33);
                                                                                                    dataOutputStream.write(str13.getBytes((String) objArr33[0]));
                                                                                                    dataOutputStream.flush();
                                                                                                    try {
                                                                                                        long jNanoTime = System.nanoTime();
                                                                                                        long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                        while (true) {
                                                                                                            try {
                                                                                                                processExec.exitValue();
                                                                                                                str7 = str6;
                                                                                                                cls = cls;
                                                                                                                break;
                                                                                                            } catch (IllegalThreadStateException unused) {
                                                                                                                if (nanos > 0) {
                                                                                                                    String str14 = str6;
                                                                                                                    try {
                                                                                                                        Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                        byte[] bArr7 = $$a;
                                                                                                                        byte b16 = bArr7[44];
                                                                                                                        str7 = str14;
                                                                                                                        Object[] objArr35 = new Object[1];
                                                                                                                        f(b16, (byte) (b16 - 5), bArr7[58], objArr35);
                                                                                                                        Class<?> cls10 = Class.forName((String) objArr35[0]);
                                                                                                                        byte b17 = bArr7[61];
                                                                                                                        Object[] objArr36 = new Object[1];
                                                                                                                        f(b17, (byte) (b17 | 25), bArr7[28], objArr36);
                                                                                                                        cls10.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                    } catch (Throwable th10) {
                                                                                                                        Throwable cause5 = th10.getCause();
                                                                                                                        if (cause5 != null) {
                                                                                                                            throw cause5;
                                                                                                                        }
                                                                                                                        throw th10;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    str7 = str6;
                                                                                                                }
                                                                                                                nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                                if (nanos <= 0) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                cls = cls;
                                                                                                                str6 = str7;
                                                                                                            } catch (InterruptedException e2) {
                                                                                                                throw e2;
                                                                                                            } catch (Throwable th11) {
                                                                                                                th2 = th11;
                                                                                                                try {
                                                                                                                    processExec.destroy();
                                                                                                                    throw th2;
                                                                                                                } catch (Exception unused2) {
                                                                                                                    throw th2;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            dataOutputStream.close();
                                                                                                                                            while (true) {
                                                                                                                                                if (i20 < length2) {
                                                                                                                                                    str8 = strArrSplit2[i20];
                                                                                                                                                    int i115 = -KeyEvent.getDeadChar(0, 0);
                                                                                                                                                    int iB2 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                                                                                                                                    int i116 = i115 * 221;
                                                                                                                                                    int i117 = (i116 & (-27813)) + (i116 | (-27813));
                                                                                                                                                    int i118 = ~i115;
                                                                                                                                                    int i119 = ~((i118 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i118 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                                                                                                                    int i120 = ~iB2;
                                                                                                                                                    int i121 = ((i117 + ((i119 | (~((i120 | i115) | 127))) * 220)) - (~(((~((i120 ^ 127) | (i120 & 127))) | i115) * (-440)))) - 1;
                                                                                                                                                    int i122 = (i115 & 127) | (i115 ^ 127);
                                                                                                                                                    objArr2 = new Object[1];
                                                                                                                                                    e(i121 + (((i122 & iB2) | (i122 ^ iB2)) * 220), null, null, new byte[]{-106, -126, -116, -127, -114, -114, -127, -106, -119, -114, -122, -107, -126, -127, -123, -121, -122, -123, -117}, objArr2);
                                                                                                                                                    if (str8.startsWith((String) objArr2[0])) {
                                                                                                                                                        str9 = str7;
                                                                                                                                                    } else {
                                                                                                                                                        objArr3 = new Object[1];
                                                                                                                                                        c(new int[]{76, 20, 0, 0}, true, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1}, objArr3);
                                                                                                                                                        if (str8.startsWith((String) objArr3[0])) {
                                                                                                                                                            str9 = str7;
                                                                                                                                                        } else {
                                                                                                                                                            int i123 = -TextUtils.getOffsetBefore("", 0);
                                                                                                                                                            int iB3 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                                                                                                                                            int i124 = i123 * 868;
                                                                                                                                                            int i125 = (i124 & 110236) + (i124 | 110236);
                                                                                                                                                            int i126 = ~i123;
                                                                                                                                                            int i127 = ~iB3;
                                                                                                                                                            int i128 = ~((i127 & i126) | (i126 ^ i127));
                                                                                                                                                            int i129 = ~iB3;
                                                                                                                                                            int i130 = ~(((-128) ^ i129) | ((-128) & i129));
                                                                                                                                                            int i131 = -(-(((i128 & i130) | (i128 ^ i130)) * (-867)));
                                                                                                                                                            int i132 = (i125 & i131) + (i131 | i125);
                                                                                                                                                            int i133 = ~((i126 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i126 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                                                                                                                            int i134 = ~((i126 ^ iB3) | (i126 & iB3));
                                                                                                                                                            int i135 = (i133 & i134) | (i133 ^ i134);
                                                                                                                                                            int i136 = ~(((-128) ^ iB3) | ((-128) & iB3));
                                                                                                                                                            int i137 = -(-(((i135 & i136) | (i135 ^ i136)) * (-1734)));
                                                                                                                                                            int i138 = (i132 ^ i137) + ((i137 & i132) << 1);
                                                                                                                                                            int i139 = ~((i126 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i126 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | i129);
                                                                                                                                                            int i140 = ~i123;
                                                                                                                                                            int i141 = (i140 & 127) | (i140 ^ 127);
                                                                                                                                                            int i142 = ~((i141 & iB3) | (i141 ^ iB3));
                                                                                                                                                            int i143 = -(-(((~(((-128) & i123) | ((-128) ^ i123) | iB3)) | (i139 & i142) | (i139 ^ i142)) * 867));
                                                                                                                                                            objArr4 = new Object[1];
                                                                                                                                                            e((i138 & i143) + (i143 | i138), null, null, new byte[]{-107, -126, -127, -123, -121, -122, -123, -117}, objArr4);
                                                                                                                                                            if (str8.startsWith((String) objArr4[0])) {
                                                                                                                                                                Object[] objArr37 = new Object[1];
                                                                                                                                                                c(new int[]{96, 1, 0, 1}, true, new byte[]{0}, objArr37);
                                                                                                                                                                strArrSplit3 = str8.split((String) objArr37[0]);
                                                                                                                                                                if (strArrSplit3.length > 1) {
                                                                                                                                                                    str9 = str7;
                                                                                                                                                                    if (strArrSplit3[1].equalsIgnoreCase(str9)) {
                                                                                                                                                                        int i144 = (~(i4 & 20)) & (i4 | 20);
                                                                                                                                                                        int i145 = (~(i4 & i8)) & (i4 | i8);
                                                                                                                                                                        int i146 = -i145;
                                                                                                                                                                        int i147 = ((i145 & i146) | (i145 ^ i146)) >> 31;
                                                                                                                                                                        int i148 = i144 & (~i147);
                                                                                                                                                                        int i149 = i8 & i147;
                                                                                                                                                                        i8 = (i148 & i149) | (i148 ^ i149);
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    str9 = str7;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                str9 = str7;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    int i150 = i20 - 120;
                                                                                                                                                    i20 = ((i150 & 121) << 1) + (i150 ^ 121);
                                                                                                                                                    str7 = str9;
                                                                                                                                                }
                                                                                                                                                i18 = (i19 ^ 1) + ((i19 & 1) << 1);
                                                                                                                                                strArrSplit = strArr2;
                                                                                                                                                length = length;
                                                                                                                                                obj5 = obj5;
                                                                                                                                                b6 = b6;
                                                                                                                                                b8 = b9;
                                                                                                                                            }
                                                                                                                                        } catch (InterruptedException e3) {
                                                                                                                                            e = e3;
                                                                                                                                            throw e;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th12) {
                                                                                                                                        th = th12;
                                                                                                                                        th2 = th;
                                                                                                                                        processExec.destroy();
                                                                                                                                        throw th2;
                                                                                                                                    }
                                                                                                                                } catch (IOException unused3) {
                                                                                                                                }
                                                                                                                                processExec.destroy();
                                                                                                                            } catch (Throwable th13) {
                                                                                                                                th = th13;
                                                                                                                                Throwable th14 = th;
                                                                                                                                throw th14;
                                                                                                                            }
                                                                                                                        } catch (IOException unused4) {
                                                                                                                        }
                                                                                                                    } catch (Exception unused5) {
                                                                                                                    }
                                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                        char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                                        int i151 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2141;
                                                                                                                        int iMyPid = (Process.myPid() >> 22) + 45;
                                                                                                                        byte[] bArr8 = $$d;
                                                                                                                        byte b18 = (byte) (bArr8[37] - 1);
                                                                                                                        Object[] objArr38 = new Object[1];
                                                                                                                        g(b18, b18, bArr8[7], objArr38);
                                                                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i151, iMyPid, 399405187, false, (String) objArr38[0], null);
                                                                                                                    }
                                                                                                                    sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                        char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                                                                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2142;
                                                                                                                        int i152 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 44;
                                                                                                                        byte[] bArr9 = $$d;
                                                                                                                        byte b19 = (byte) (bArr9[37] - 1);
                                                                                                                        Object[] objArr39 = new Object[1];
                                                                                                                        g(b19, b19, bArr9[7], objArr39);
                                                                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout2, iResolveOpacity, i152, 399405187, false, (String) objArr39[0], null);
                                                                                                                    }
                                                                                                                    sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                    String string2 = sb2.toString();
                                                                                                                    int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                                                                    int i153 = fadingEdgeLength * 398;
                                                                                                                    int i154 = (i153 ^ (-50292)) + ((i153 & (-50292)) << 1);
                                                                                                                    int i155 = ~fadingEdgeLength;
                                                                                                                    int i156 = ~((i155 ^ i35) | (i155 & i35));
                                                                                                                    int i157 = ~fadingEdgeLength;
                                                                                                                    int i158 = (i157 & 127) | (i157 ^ 127);
                                                                                                                    int i159 = ~i158;
                                                                                                                    int i160 = (i156 & i159) | (i156 ^ i159);
                                                                                                                    int i161 = ~(i10 | 127);
                                                                                                                    int i162 = ((i160 & i161) | (i160 ^ i161)) * (-397);
                                                                                                                    int i163 = ((((i154 | i162) << 1) - (i162 ^ i154)) - (~((~((i155 & 127) | (i155 ^ 127))) * (-397)))) - 1;
                                                                                                                    int i164 = ~i158;
                                                                                                                    int i165 = (i164 & i4) | (i4 ^ i164);
                                                                                                                    int i166 = ~((-128) | fadingEdgeLength);
                                                                                                                    int i167 = -(-(((i166 & i165) | (i165 ^ i166)) * 397));
                                                                                                                    Object[] objArr40 = new Object[1];
                                                                                                                    e((i163 ^ i167) + ((i167 & i163) << 1), null, null, new byte[]{-109}, objArr40);
                                                                                                                    strArrSplit2 = string2.split((String) objArr40[0]);
                                                                                                                    length2 = strArrSplit2.length;
                                                                                                                    i20 = 0;
                                                                                                                } catch (Exception unused6) {
                                                                                                                    Object[] objArr41 = new Object[1];
                                                                                                                    c(new int[]{49, 27, 0, 0}, false, new byte[]{0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1}, objArr41);
                                                                                                                    throw new IOException((String) objArr41[0]);
                                                                                                                }
                                                                                                                byte b20 = bArr[44];
                                                                                                                Object[] objArr42 = new Object[1];
                                                                                                                f(b20, (byte) (b20 - 5), bArr[58], objArr42);
                                                                                                                Class<?> cls11 = Class.forName((String) objArr42[0]);
                                                                                                                byte b21 = bArr[28];
                                                                                                                Object[] objArr43 = new Object[1];
                                                                                                                f(b21, (byte) (b21 | 30), bArr[58], objArr43);
                                                                                                                cls11.getMethod((String) objArr43[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                            } catch (Throwable th15) {
                                                                                                                Throwable cause6 = th15.getCause();
                                                                                                                if (cause6 != null) {
                                                                                                                    throw cause6;
                                                                                                                }
                                                                                                                throw th15;
                                                                                                            }
                                                                                                            byte[] bArr10 = $$a;
                                                                                                            byte b22 = bArr10[44];
                                                                                                            Object[] objArr44 = new Object[1];
                                                                                                            f(b22, (byte) (b22 - 5), bArr10[58], objArr44);
                                                                                                            Class<?> cls12 = Class.forName((String) objArr44[0]);
                                                                                                            byte b23 = bArr10[28];
                                                                                                            Object[] objArr45 = new Object[1];
                                                                                                            f(b23, (byte) (b23 | 30), bArr10[58], objArr45);
                                                                                                            cls12.getMethod((String) objArr45[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                        } catch (Throwable th16) {
                                                                                                            Throwable cause7 = th16.getCause();
                                                                                                            if (cause7 != null) {
                                                                                                                throw cause7;
                                                                                                            }
                                                                                                            throw th16;
                                                                                                        }
                                                                                                    } catch (InterruptedException e4) {
                                                                                                        e = e4;
                                                                                                    } catch (Throwable th17) {
                                                                                                        th = th17;
                                                                                                    }
                                                                                                } catch (IOException unused7) {
                                                                                                    cls = cls;
                                                                                                } catch (Exception unused8) {
                                                                                                    Object[] objArr46 = new Object[1];
                                                                                                    c(new int[]{49, 27, 0, 0}, false, new byte[]{0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1}, objArr46);
                                                                                                    throw new IOException((String) objArr46[0]);
                                                                                                }
                                                                                            } catch (Throwable th18) {
                                                                                                Throwable cause8 = th18.getCause();
                                                                                                if (cause8 != null) {
                                                                                                    throw cause8;
                                                                                                }
                                                                                                throw th18;
                                                                                            }
                                                                                        } catch (Throwable th19) {
                                                                                            th = th19;
                                                                                            th = th;
                                                                                            cause = th.getCause();
                                                                                            if (cause != null) {
                                                                                                throw cause;
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (Throwable th20) {
                                                                                        th = th20;
                                                                                    }
                                                                                } catch (Throwable th21) {
                                                                                    th = th21;
                                                                                    th = th;
                                                                                    cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th22) {
                                                                                th = th22;
                                                                            }
                                                                        } catch (IOException unused9) {
                                                                            i8 = i8;
                                                                            b9 = b8;
                                                                            i19 = i18;
                                                                            cls = cls;
                                                                            i8 = i8;
                                                                            i18 = (i19 ^ 1) + ((i19 & 1) << 1);
                                                                            strArrSplit = strArr2;
                                                                            length = length;
                                                                            obj5 = obj5;
                                                                            b6 = b6;
                                                                            b8 = b9;
                                                                        } catch (Exception unused10) {
                                                                            Object[] objArr47 = new Object[1];
                                                                            c(new int[]{49, 27, 0, 0}, false, new byte[]{0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1}, objArr47);
                                                                            throw new IOException((String) objArr47[0]);
                                                                        }
                                                                    } catch (Throwable th23) {
                                                                        th = th23;
                                                                    }
                                                                } catch (IOException unused11) {
                                                                    i8 = i8;
                                                                    obj5 = obj5;
                                                                } catch (Exception unused12) {
                                                                }
                                                            } catch (Throwable th24) {
                                                                th = th24;
                                                            }
                                                        } catch (IOException unused13) {
                                                            obj5 = obj5;
                                                            length = length;
                                                            b9 = b8;
                                                            i19 = i18;
                                                            cls = cls;
                                                            i8 = i8;
                                                            i18 = (i19 ^ 1) + ((i19 & 1) << 1);
                                                            strArrSplit = strArr2;
                                                            length = length;
                                                            obj5 = obj5;
                                                            b6 = b6;
                                                            b8 = b9;
                                                        } catch (Exception unused14) {
                                                            Object[] objArr48 = new Object[1];
                                                            c(new int[]{49, 27, 0, 0}, false, new byte[]{0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1}, objArr48);
                                                            throw new IOException((String) objArr48[0]);
                                                        }
                                                    } catch (Exception unused15) {
                                                    }
                                                } catch (Throwable th25) {
                                                    th = th25;
                                                    cls = cls;
                                                }
                                            } catch (IOException unused16) {
                                                strArr2 = strArrSplit;
                                            }
                                        }
                                    } else {
                                        i8 = i8;
                                        strArr2 = strArrSplit;
                                        b6 = b6;
                                        obj5 = obj5;
                                        length = length;
                                        b9 = b8;
                                        i19 = i18;
                                    }
                                    i8 = i8;
                                    i18 = (i19 ^ 1) + ((i19 & 1) << 1);
                                    strArrSplit = strArr2;
                                    length = length;
                                    obj5 = obj5;
                                    b6 = b6;
                                    b8 = b9;
                                }
                                b3 = b6;
                                obj = obj5;
                                b2 = b8;
                                i7 = 1;
                            } else {
                                i4 = i24;
                                iIndexOf = iIndexOf;
                                obj2 = objInvoke;
                                i10 = i29;
                                b4 = b10;
                                i11 = 0;
                                i12 = (i4 & (-21)) | (i35 & 20);
                                int i510 = -i11;
                                int i511 = ((i11 & i510) | (i11 ^ i510)) >> 31;
                                int i512 = (~i511) & i4;
                                int i610 = i511 & i12;
                                i13 = (i610 & i512) | (i512 ^ i610);
                                byte[] bArr11 = $$a;
                                Object[] objArr110 = new Object[1];
                                b5 = b4;
                                f(b5, bArr11[28], (byte) (-bArr11[35]), objArr110);
                                Class<?> cls13 = Class.forName((String) objArr110[0]);
                                Object[] objArr111 = new Object[1];
                                f(b11, (byte) (-bArr11[40]), bArr11[57], objArr111);
                                Field field3 = cls13.getField((String) objArr111[0]);
                                obj3 = obj2;
                                str5 = (String) field3.get(obj3);
                                int length5 = str5.length();
                                i14 = ((length5 | (-6)) << 1) - (length5 ^ (-6));
                                if (i14 >= 0) {
                                    i15 = i13;
                                    i16 = i12;
                                    obj4 = obj3;
                                    b6 = b5;
                                    i35 = i35;
                                    b7 = b11;
                                    i17 = 0;
                                    break;
                                }
                                i21 = 0;
                                while (true) {
                                    if (i21 <= i14) {
                                        i15 = i13;
                                        i16 = i12;
                                        obj4 = obj3;
                                        b6 = b5;
                                        i35 = i35;
                                        b7 = b11;
                                        i17 = 0;
                                        break;
                                    }
                                    int i611 = 3413 - (~(-(-(i21 * 569))));
                                    int i612 = ~i21;
                                    int i613 = ~(((-7) ^ i612) | ((-7) & i612));
                                    int i614 = ~(((-7) & i35) | ((-7) ^ i35));
                                    int i615 = (i614 & i613) | (i613 ^ i614);
                                    int i616 = ~i21;
                                    int i617 = ~(i616 | i35);
                                    int i618 = -(-(((i615 ^ i617) | (i615 & i617)) * (-1136)));
                                    int i619 = (i611 ^ i618) + ((i611 & i618) << 1);
                                    int i710 = ~(((-7) & i4) | ((-7) ^ i4));
                                    int i711 = ~((i612 & i4) | (i612 ^ i4));
                                    int i712 = (i710 & i711) | (i710 ^ i711);
                                    int i713 = (i10 ^ 6) | (i10 & 6);
                                    int i714 = ~((i713 & i21) | (i713 ^ i21));
                                    int i715 = -(-(((i712 & i714) | (i712 ^ i714)) * (-568)));
                                    int i716 = (i619 ^ i715) + ((i715 & i619) << 1);
                                    int i717 = ~((i35 ^ 6) | (i35 & 6));
                                    int i718 = ~((i35 ^ i21) | (i35 & i21));
                                    int i719 = (i717 & i718) | (i717 ^ i718);
                                    int i810 = ((-7) & i616) | ((-7) ^ i616);
                                    int i811 = -(-((i719 | (~((i810 & i4) | (i810 ^ i4)))) * 568));
                                    Object[] objArr112 = {str5.substring(i21, (i716 ^ i811) + ((i811 & i716) << 1)), 931995};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 3393;
                                        int i812 = 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        byte[] bArr12 = $$d;
                                        Object[] objArr113 = new Object[1];
                                        g(bArr12[37], (byte) (bArr12[33] - 1), bArr12[7], objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState2, iMakeMeasureSpec2, i812, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                    long j16 = 759771137;
                                    b7 = b11;
                                    obj4 = obj3;
                                    long j17 = (((long) (-665)) * j16) + (((long) 334) * jLongValue3);
                                    i15 = i13;
                                    i16 = i12;
                                    long j18 = -1;
                                    long j19 = j16 ^ j18;
                                    long j110 = 333;
                                    i22 = i21;
                                    b6 = b5;
                                    long j111 = i4;
                                    long j112 = j111 ^ j18;
                                    j = j17 + (((long) (-333)) * j19) + ((((j19 | j112) ^ j18) | ((jLongValue3 | j111) ^ j18)) * j110) + (j110 * ((j18 ^ (j112 | jLongValue3)) | ((j111 | j19) ^ j18))) + ((long) (-761841014));
                                    int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                    int i813 = ~iElapsedRealtime2;
                                    i23 = ((int) (j >> 32)) & ((-677090546) + (((~(i813 | (-1428962616))) | 1428696341 | (~(1429044543 | iElapsedRealtime2))) * 717) + (((~(iElapsedRealtime2 | (-1428962616))) | (~(i813 | 1429044543)) | 1428696341) * 717));
                                    iNextInt = new Random().nextInt();
                                    if ((i23 | (((int) j) & (2088992125 + ((2074978926 | iNextInt) * 376) + (((~((~iNextInt) | 319942370)) | 1756102668) * (-376)) + (((~(iNextInt | (-319942371))) | (-1757168781)) * 376)))) == -2096167706) {
                                        i17 = 1;
                                        break;
                                    }
                                    i21 = i22 + 1;
                                    b5 = b6;
                                    b11 = b7;
                                    str5 = str5;
                                    i14 = i14;
                                    i35 = i35;
                                    obj3 = obj4;
                                    i12 = i16;
                                    i13 = i15;
                                }
                                int i814 = -i17;
                                int i815 = ((i17 & i814) | (i17 ^ i814)) >> 31;
                                int i816 = (~i815) & i4;
                                int i817 = i16 & i815;
                                int i818 = (i817 & i816) | (i816 ^ i817);
                                int i819 = (~(i4 & i15)) & (i4 | i15);
                                int i910 = -i819;
                                int i911 = ((i819 & i910) | (i819 ^ i910)) >> 31;
                                i8 = (i818 & (~i911)) | (i15 & i911);
                                byte[] bArr13 = $$a;
                                Object[] objArr114 = new Object[1];
                                f(b6, bArr13[28], (byte) (-bArr13[35]), objArr114);
                                Class<?> cls14 = Class.forName((String) objArr114[0]);
                                Object[] objArr210 = new Object[1];
                                b8 = b7;
                                f(b8, (byte) (-bArr13[40]), bArr13[57], objArr210);
                                Field field4 = cls14.getField((String) objArr210[0]);
                                obj5 = obj4;
                                int i912 = iIndexOf ^ (-1);
                                int i913 = -i912;
                                String strSubstring3 = ((String) field4.get(obj5)).substring(0, iIndexOf & (((i912 & i913) | (i912 ^ i913)) >> 31));
                                int i914 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                Object[] objArr211 = new Object[1];
                                e(((i914 | 127) << 1) - (i914 ^ 127), null, null, new byte[]{-110}, objArr211);
                                strArrSplit = strSubstring3.split((String) objArr211[0]);
                                length = strArrSplit.length;
                                i18 = 0;
                                while (i18 < length) {
                                    str6 = strArrSplit[i18];
                                    objArr = new Object[1];
                                    c(new int[]{23, 3, 87, 3}, false, new byte[]{0, 1, 1}, objArr);
                                    if (str6.split((String) objArr[0]).length > 1) {
                                        cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), 2267 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33);
                                        synchronized (cls) {
                                            Object[] objArr212 = new Object[1];
                                            c(new int[]{26, 16, 0, 2}, true, new byte[]{1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, objArr212);
                                            String str15 = (String) objArr212[0];
                                            Runtime runtime2 = Runtime.getRuntime();
                                            strArr2 = strArrSplit;
                                            Object[] objArr213 = new Object[1];
                                            c(new int[]{42, 2, 0, 1}, true, new byte[]{1, 1}, objArr213);
                                            processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                            Object[] objArr214 = {processExec.getInputStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2142, 44 - Process.getGidForName(""), -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                            Object[] objArr215 = {processExec.getErrorStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), Color.blue(0) + 2142, ExpandableListView.getPackedPositionGroup(0L) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                            DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                            byte[] bArr14 = $$a;
                                            byte b110 = bArr14[44];
                                            b9 = b8;
                                            b6 = b6;
                                            i19 = i18;
                                            Object[] objArr216 = new Object[1];
                                            f(b110, (byte) (b110 - 5), bArr14[58], objArr216);
                                            Class<?> cls15 = Class.forName((String) objArr216[0]);
                                            byte b111 = bArr14[14];
                                            i8 = i8;
                                            Object[] objArr217 = new Object[1];
                                            f(b111, (byte) (b111 | 21), bArr14[28], objArr217);
                                            cls15.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                            byte b112 = bArr14[44];
                                            Object[] objArr218 = new Object[1];
                                            f(b112, (byte) (b112 - 5), bArr14[58], objArr218);
                                            Class<?> cls16 = Class.forName((String) objArr218[0]);
                                            byte b113 = bArr14[14];
                                            Object[] objArr219 = new Object[1];
                                            f(b113, (byte) (b113 | 21), bArr14[28], objArr219);
                                            cls16.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(str15);
                                            int i915 = -View.MeasureSpec.getMode(0);
                                            int iB4 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                            int i916 = i915 * (-518);
                                            int i917 = ((i916 | (-65786)) << 1) - (i916 ^ (-65786));
                                            int i918 = ~i915;
                                            int i919 = ~iB4;
                                            int i1010 = ~(i918 | i919);
                                            int i1011 = (i917 - (~(-(-(((i1010 & 127) | (i1010 ^ 127)) * 519))))) - 1;
                                            int i1012 = ~((i918 & i919) | (i918 ^ i919) | 127);
                                            int i1013 = (i915 ^ 127) | (i915 & 127);
                                            int i1014 = i1011 + ((i1012 | (~((i1013 & iB4) | (i1013 ^ iB4)))) * (-519));
                                            int i1015 = -(-((i915 | (~((iB4 & 127) | (iB4 ^ 127)))) * 519));
                                            Object[] objArr310 = new Object[1];
                                            e((i1014 & i1015) + (i1015 | i1014), null, null, new byte[]{-109}, objArr310);
                                            sb3.append((String) objArr310[0]);
                                            String string3 = sb3.toString();
                                            Object[] objArr311 = new Object[1];
                                            c(new int[]{44, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr311);
                                            dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                            dataOutputStream2.flush();
                                            int gidForName2 = Process.getGidForName("");
                                            int i1016 = ~gidForName2;
                                            int i1017 = (((gidForName2 * (-209)) - 26752) - (~(-(-((~((i1016 ^ (-129)) | (i1016 & (-129)))) * 210))))) - 1;
                                            int i1018 = ~(((-129) & i35) | ((-129) ^ i35));
                                            int i1019 = ~((i1016 ^ i4) | (i1016 & i4));
                                            int i1110 = i1017 + (((i1018 & i1019) | (i1018 ^ i1019)) * 210);
                                            int i1111 = (i1016 & i35) | (i1016 ^ i35);
                                            int i1112 = ~((i1111 & 128) | (i1111 ^ 128));
                                            int i1113 = (gidForName2 & (-129)) | ((-129) ^ gidForName2);
                                            int i1114 = ~((i1113 & i4) | (i1113 ^ i4));
                                            Object[] objArr312 = new Object[1];
                                            e((i1110 - (~(((i1114 & i1112) | (i1112 ^ i1114)) * 210))) - 1, null, null, new byte[]{-109, -125, -115, -108, -126}, objArr312);
                                            String str16 = (String) objArr312[0];
                                            Object[] objArr313 = new Object[1];
                                            c(new int[]{44, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr313);
                                            dataOutputStream2.write(str16.getBytes((String) objArr313[0]));
                                            dataOutputStream2.flush();
                                            long jNanoTime2 = System.nanoTime();
                                            long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                            while (true) {
                                                processExec.exitValue();
                                                str7 = str6;
                                                cls = cls;
                                                break;
                                            }
                                            dataOutputStream2.close();
                                            byte[] bArr15 = $$a;
                                            byte b24 = bArr15[44];
                                            Object[] objArr49 = new Object[1];
                                            f(b24, (byte) (b24 - 5), bArr15[58], objArr49);
                                            Class<?> cls17 = Class.forName((String) objArr49[0]);
                                            byte b25 = bArr15[28];
                                            Object[] objArr410 = new Object[1];
                                            f(b25, (byte) (b25 | 30), bArr15[58], objArr410);
                                            cls17.getMethod((String) objArr410[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                            byte b26 = bArr15[44];
                                            Object[] objArr411 = new Object[1];
                                            f(b26, (byte) (b26 - 5), bArr15[58], objArr411);
                                            Class<?> cls18 = Class.forName((String) objArr411[0]);
                                            byte b27 = bArr15[28];
                                            Object[] objArr412 = new Object[1];
                                            f(b27, (byte) (b27 | 30), bArr15[58], objArr412);
                                            cls18.getMethod((String) objArr412[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                            processExec.destroy();
                                            StringBuilder sb4 = new StringBuilder();
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i1510 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2141;
                                                int iMyPid2 = (Process.myPid() >> 22) + 45;
                                                byte[] bArr16 = $$d;
                                                byte b114 = (byte) (bArr16[37] - 1);
                                                Object[] objArr314 = new Object[1];
                                                g(b114, b114, bArr16[7], objArr314);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i1510, iMyPid2, 399405187, false, (String) objArr314[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 2142;
                                                int i1511 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 44;
                                                byte[] bArr17 = $$d;
                                                byte b115 = (byte) (bArr17[37] - 1);
                                                Object[] objArr315 = new Object[1];
                                                g(b115, b115, bArr17[7], objArr315);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout3, iResolveOpacity2, i1511, 399405187, false, (String) objArr315[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                            String string4 = sb4.toString();
                                            int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                            int i1512 = fadingEdgeLength2 * 398;
                                            int i1513 = (i1512 ^ (-50292)) + ((i1512 & (-50292)) << 1);
                                            int i1514 = ~fadingEdgeLength2;
                                            int i1515 = ~((i1514 ^ i35) | (i1514 & i35));
                                            int i1516 = ~fadingEdgeLength2;
                                            int i1517 = (i1516 & 127) | (i1516 ^ 127);
                                            int i1518 = ~i1517;
                                            int i168 = (i1515 & i1518) | (i1515 ^ i1518);
                                            int i169 = ~(i10 | 127);
                                            int i1610 = ((i168 & i169) | (i168 ^ i169)) * (-397);
                                            int i1611 = ((((i1513 | i1610) << 1) - (i1610 ^ i1513)) - (~((~((i1514 & 127) | (i1514 ^ 127))) * (-397)))) - 1;
                                            int i1612 = ~i1517;
                                            int i1613 = (i1612 & i4) | (i4 ^ i1612);
                                            int i1614 = ~((-128) | fadingEdgeLength2);
                                            int i1615 = -(-(((i1614 & i1613) | (i1613 ^ i1614)) * 397));
                                            Object[] objArr413 = new Object[1];
                                            e((i1611 ^ i1615) + ((i1615 & i1611) << 1), null, null, new byte[]{-109}, objArr413);
                                            strArrSplit2 = string4.split((String) objArr413[0]);
                                            length2 = strArrSplit2.length;
                                            i20 = 0;
                                            while (true) {
                                                if (i20 < length2) {
                                                    str8 = strArrSplit2[i20];
                                                    int i1115 = -KeyEvent.getDeadChar(0, 0);
                                                    int iB5 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                                    int i1116 = i1115 * 221;
                                                    int i1117 = (i1116 & (-27813)) + (i1116 | (-27813));
                                                    int i1118 = ~i1115;
                                                    int i1119 = ~((i1118 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1118 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                    int i1210 = ~iB5;
                                                    int i1211 = ((i1117 + ((i1119 | (~((i1210 | i1115) | 127))) * 220)) - (~(((~((i1210 ^ 127) | (i1210 & 127))) | i1115) * (-440)))) - 1;
                                                    int i1212 = (i1115 & 127) | (i1115 ^ 127);
                                                    objArr2 = new Object[1];
                                                    e(i1211 + (((i1212 & iB5) | (i1212 ^ iB5)) * 220), null, null, new byte[]{-106, -126, -116, -127, -114, -114, -127, -106, -119, -114, -122, -107, -126, -127, -123, -121, -122, -123, -117}, objArr2);
                                                    if (str8.startsWith((String) objArr2[0])) {
                                                        objArr3 = new Object[1];
                                                        c(new int[]{76, 20, 0, 0}, true, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1}, objArr3);
                                                        if (str8.startsWith((String) objArr3[0])) {
                                                            int i1213 = -TextUtils.getOffsetBefore("", 0);
                                                            int iB6 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                                            int i1214 = i1213 * 868;
                                                            int i1215 = (i1214 & 110236) + (i1214 | 110236);
                                                            int i1216 = ~i1213;
                                                            int i1217 = ~iB6;
                                                            int i1218 = ~((i1217 & i1216) | (i1216 ^ i1217));
                                                            int i1219 = ~iB6;
                                                            int i1310 = ~(((-128) ^ i1219) | ((-128) & i1219));
                                                            int i1311 = -(-(((i1218 & i1310) | (i1218 ^ i1310)) * (-867)));
                                                            int i1312 = (i1215 & i1311) + (i1311 | i1215);
                                                            int i1313 = ~((i1216 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1216 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                            int i1314 = ~((i1216 ^ iB6) | (i1216 & iB6));
                                                            int i1315 = (i1313 & i1314) | (i1313 ^ i1314);
                                                            int i1316 = ~(((-128) ^ iB6) | ((-128) & iB6));
                                                            int i1317 = -(-(((i1315 & i1316) | (i1315 ^ i1316)) * (-1734)));
                                                            int i1318 = (i1312 ^ i1317) + ((i1317 & i1312) << 1);
                                                            int i1319 = ~((i1216 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1216 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | i1219);
                                                            int i1410 = ~i1213;
                                                            int i1411 = (i1410 & 127) | (i1410 ^ 127);
                                                            int i1412 = ~((i1411 & iB6) | (i1411 ^ iB6));
                                                            int i1413 = -(-(((~(((-128) & i1213) | ((-128) ^ i1213) | iB6)) | (i1319 & i1412) | (i1319 ^ i1412)) * 867));
                                                            objArr4 = new Object[1];
                                                            e((i1318 & i1413) + (i1413 | i1318), null, null, new byte[]{-107, -126, -127, -123, -121, -122, -123, -117}, objArr4);
                                                            if (str8.startsWith((String) objArr4[0])) {
                                                                Object[] objArr316 = new Object[1];
                                                                c(new int[]{96, 1, 0, 1}, true, new byte[]{0}, objArr316);
                                                                strArrSplit3 = str8.split((String) objArr316[0]);
                                                                if (strArrSplit3.length > 1) {
                                                                    str9 = str7;
                                                                    if (strArrSplit3[1].equalsIgnoreCase(str9)) {
                                                                        int i1414 = (~(i4 & 20)) & (i4 | 20);
                                                                        int i1415 = (~(i4 & i8)) & (i4 | i8);
                                                                        int i1416 = -i1415;
                                                                        int i1417 = ((i1415 & i1416) | (i1415 ^ i1416)) >> 31;
                                                                        int i1418 = i1414 & (~i1417);
                                                                        int i1419 = i8 & i1417;
                                                                        i8 = (i1418 & i1419) | (i1418 ^ i1419);
                                                                    }
                                                                } else {
                                                                    str9 = str7;
                                                                }
                                                            } else {
                                                                str9 = str7;
                                                            }
                                                        } else {
                                                            str9 = str7;
                                                        }
                                                    } else {
                                                        str9 = str7;
                                                    }
                                                    int i1519 = i20 - 120;
                                                    i20 = ((i1519 & 121) << 1) + (i1519 ^ 121);
                                                    str7 = str9;
                                                }
                                                i18 = (i19 ^ 1) + ((i19 & 1) << 1);
                                                strArrSplit = strArr2;
                                                length = length;
                                                obj5 = obj5;
                                                b6 = b6;
                                                b8 = b9;
                                            }
                                        }
                                    } else {
                                        i8 = i8;
                                        strArr2 = strArrSplit;
                                        b6 = b6;
                                        obj5 = obj5;
                                        length = length;
                                        b9 = b8;
                                        i19 = i18;
                                    }
                                    i8 = i8;
                                    i18 = (i19 ^ 1) + ((i19 & 1) << 1);
                                    strArrSplit = strArr2;
                                    length = length;
                                    obj5 = obj5;
                                    b6 = b6;
                                    b8 = b9;
                                }
                                b3 = b6;
                                obj = obj5;
                                b2 = b8;
                                i7 = 1;
                            }
                        } else {
                            i4 = i24;
                            b2 = b11;
                            obj = objInvoke;
                            b3 = b10;
                            i7 = 1;
                            i35 = i35;
                            i8 = i4;
                        }
                        String[] strArr3 = new String[i7];
                        byte[] bArr18 = $$a;
                        Object[] objArr50 = new Object[i7];
                        f(b3, bArr18[28], (byte) (-bArr18[35]), objArr50);
                        Class<?> cls19 = Class.forName((String) objArr50[0]);
                        Object[] objArr51 = new Object[1];
                        f(b2, (byte) (-bArr18[40]), bArr18[57], objArr51);
                        strArr3[0] = cls19.getField((String) objArr51[0]).get(obj);
                        Object obj6 = new Object[]{new int[i7], strArr3}[0];
                        ((int[]) obj6)[0] = i8;
                        i5 = ((int[]) obj6)[0];
                        strArr = strArr3;
                        if ((i2 & 1) == 0) {
                            Object[] objArr52 = new Object[1];
                            e(KeyEvent.keyCodeFromString("") + 127, null, null, new byte[]{-102, -122, -115, -116, -114, -117, -103, -126, -122, -115, -104, -126, -105}, objArr52);
                            try {
                                Object[] objArr53 = {(String) objArr52[0]};
                                Object[] objArr54 = new Object[1];
                                c(new int[]{0, 23, 39, 0}, true, new byte[]{1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr54);
                                Class<?> cls20 = Class.forName((String) objArr54[0]);
                                Object[] objArr55 = new Object[1];
                                c(new int[]{97, 16, 148, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0}, objArr55);
                                Object objInvoke2 = cls20.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                                if (objInvoke2 == null) {
                                    strArr = strArr;
                                    i9 = i4;
                                    break;
                                }
                                Object[] objArr56 = new Object[1];
                                c(new int[]{113, 37, 44, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr56);
                                Class<?> cls21 = Class.forName((String) objArr56[0]);
                                Object[] objArr57 = new Object[1];
                                c(new int[]{150, 15, 0, 1}, true, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1}, objArr57);
                                List list = (List) cls21.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                                if (list == null) {
                                    strArr = strArr;
                                    i9 = i4;
                                    break;
                                }
                                Iterator it = list.iterator();
                                loop5: while (true) {
                                    if (!it.hasNext()) {
                                        strArr = strArr;
                                        i9 = i4;
                                        break;
                                    }
                                    Object next = it.next();
                                    int i170 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    Object[] objArr58 = new Object[1];
                                    e((i170 ^ 127) + ((i170 & 127) << 1), null, null, new byte[]{-126, -119, -123, -120, -125, -113, -126, -113, -114, -117, -119, -114, -100, -106, -125, -113, -126, -125, -113, -114, -122, -106, -105, -115, -114, -101, -105, -113, -123}, objArr58);
                                    Class<?> cls22 = Class.forName((String) objArr58[0]);
                                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int iB7 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                    int i171 = iMakeMeasureSpec3 * (-575);
                                    int i172 = (i171 ^ (-73025)) + ((i171 & (-73025)) << 1);
                                    int i173 = ~iMakeMeasureSpec3;
                                    int i174 = ~(i173 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                    int i175 = ~(((-128) ^ iB7) | ((-128) & iB7));
                                    int i176 = -(-(((i175 & i174) | (i174 ^ i175)) * 576));
                                    int i177 = (i172 ^ i176) + ((i172 & i176) << 1);
                                    int i178 = ~((i173 & 127) | (i173 ^ 127));
                                    int i179 = ~iB7;
                                    int i180 = ((~(((-128) & i179) | ((-128) ^ i179) | iMakeMeasureSpec3)) | i178) * 576;
                                    int i181 = ((i177 | i180) << 1) - (i180 ^ i177);
                                    int i182 = -(-(i174 * 576));
                                    Object[] objArr59 = new Object[1];
                                    e(((i181 | i182) << 1) - (i182 ^ i181), null, null, new byte[]{-126, -119, -123, -120, -126, -127, -123, -121, -122, -123, -124, -125, -126, -127}, objArr59);
                                    String str17 = (String) cls22.getMethod((String) objArr59[0], null).invoke(next, null);
                                    Object[] objArr60 = new Object[1];
                                    c(new int[]{113, 37, 44, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr60);
                                    Class<?> cls23 = Class.forName((String) objArr60[0]);
                                    Object[] objArr61 = new Object[1];
                                    c(new int[]{165, 17, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0}, objArr61);
                                    if (((Boolean) cls23.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str17)).booleanValue()) {
                                        int length6 = str17.length();
                                        int iB8 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                                        int i183 = -(-(length6 * (-475)));
                                        int i184 = ((-9540) ^ i183) + ((i183 & (-9540)) << 1);
                                        int i185 = ~((19 & length6) | (19 ^ length6));
                                        int i186 = ~length6;
                                        int i187 = ~((i186 ^ (-20)) | (i186 & (-20)) | iB8);
                                        int i188 = -(-(((i185 & i187) | (i185 ^ i187)) * (-476)));
                                        int i189 = ((i184 | i188) << 1) - (i188 ^ i184);
                                        int i190 = ~length6;
                                        int i191 = (i190 & (-20)) | (i190 ^ (-20));
                                        int i192 = (~((i191 & iB8) | (i191 ^ iB8))) * 952;
                                        int i193 = (i189 ^ i192) + ((i192 & i189) << 1);
                                        int i194 = (~iB8) | i186;
                                        int i195 = (i193 - (~((~((i194 & (-20)) | (i194 ^ (-20)))) * 476))) - 1;
                                        if (i195 >= 0) {
                                            int i196 = 0;
                                            while (i196 <= i195) {
                                                Object[] objArr62 = {str17.substring(i196, i196 + 20), 931995};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char cResolveSize = (char) View.resolveSize(0, 0);
                                                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3393;
                                                    int iArgb = 9 - Color.argb(0, 0, 0, 0);
                                                    byte[] bArr19 = $$d;
                                                    Object[] objArr63 = new Object[1];
                                                    g(bArr19[37], (byte) (bArr19[33] - 1), bArr19[7], objArr63);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSize, threadPriority, iArgb, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                                }
                                                long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                                long j20 = 1778067407;
                                                Iterator it2 = it;
                                                Object obj7 = objInvoke2;
                                                String str18 = str17;
                                                long j21 = -1;
                                                long j22 = jLongValue4 ^ j21;
                                                int i197 = i196;
                                                long j23 = i4;
                                                long j24 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                long j25 = j23 ^ j21;
                                                long j26 = (((long) 319) * j20) + (((long) (-317)) * jLongValue4) + (((long) (-318)) * (j22 | (((j20 ^ j21) | j23) ^ j21))) + ((((j22 | j23) ^ j21) | (((j25 | j20) | jLongValue4) ^ j21)) * j24) + (j24 * ((((j22 | j25) | j20) ^ j21) | (j21 ^ (j23 | (j20 | jLongValue4))))) + ((long) (-1780137284));
                                                int i198 = ((int) (j26 >> 32)) & (1587634074 + (((~((-1819292871) | i4)) | 744502406 | (~((-1038448015) | i4))) * (-744)) + ((i35 | (-2113238479)) * 744) + (((-744502407) | i4) * 744));
                                                int i199 = ((int) j26) & ((-1160947273) + (((-844699433) | i4) * (-50)) + (((~(861487017 | i4)) | (~(i35 | (-268960041)))) * 50) + (((~(i35 | (-844699433))) | (~(592526977 | i35)) | 268960040) * 50));
                                                if (((i198 & i199) | (i198 ^ i199)) == 1245577864) {
                                                    i9 = (i4 & (-71)) | (i35 & 70);
                                                    break loop5;
                                                }
                                                int i200 = (i197 ^ 103) + ((i197 & 103) << 1);
                                                i196 = (i200 ^ (-102)) + ((i200 & (-102)) << 1);
                                                it = it2;
                                                objInvoke2 = obj7;
                                                strArr = strArr;
                                                str17 = str18;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    it = it;
                                    objInvoke2 = objInvoke2;
                                    strArr = strArr;
                                }
                                int i201 = i4 ^ i5;
                                int i202 = -i201;
                                int i203 = ((i201 & i202) | (i201 ^ i202)) >> 31;
                                i5 = (i5 & i203) | (i9 & (~i203));
                            } catch (Throwable th26) {
                                Throwable cause9 = th26.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th26;
                            }
                        } else {
                            strArr = strArr;
                        }
                        i6 = 0;
                    } catch (Throwable th27) {
                        Throwable cause10 = th27.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th27;
                    }
                } else {
                    i4 = i24;
                    i5 = i4;
                    i6 = 0;
                    strArr = null;
                }
                Object[] objArr64 = new Object[1];
                e(Color.red(i6) + 127, null, null, new byte[]{-114, -111, -113, -112, -96, -97, -125, -98, -126, -99, -127, -110}, objArr64);
                Object[] objArr65 = {(String) objArr64[i6]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(i6));
                    int i204 = 994 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i205 = 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr20 = $$d;
                    byte b28 = bArr20[37];
                    byte b29 = bArr20[15];
                    Object[] objArr66 = new Object[1];
                    g(b28, b29, (byte) (b29 | 32), objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(bitsPerPixel, i204, i205, -545305915, false, (String) objArr66[0], new Class[]{String.class});
                }
                long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
                long j27 = -1514530455;
                long j28 = -494;
                long j29 = -1;
                long j30 = (j28 * j27) + (j28 * jLongValue5) + (((long) (-495)) * ((j27 | jLongValue5) ^ j29));
                long j31 = 495;
                long j32 = i4;
                long j33 = j32 ^ j29;
                long j34 = j27 | j33;
                long j35 = j30 + (j31 * j34) + (j31 * ((((jLongValue5 ^ j29) | (j27 ^ j29)) ^ j29) | (j34 ^ j29))) + ((long) 2134989739);
                int iMyPid3 = Process.myPid();
                int i206 = ~iMyPid3;
                int i207 = ((int) (j35 >> 32)) & (((((~(i206 | 554650286)) | ((~((-882576125) | i206)) | 344981584)) * (-397)) - 1038937456) + ((iMyPid3 | 362037330) * 397));
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i208 = ((int) j35) & (((((~(1318712793 | startElapsedRealtime)) | 1233758729) * 262) - 1675003643) + (((~((~startElapsedRealtime) | 1318712793)) | 1233758729) * 262));
                int i209 = (i207 & i208) | (i207 ^ i208);
                int i210 = (~(i4 & 50)) & (i4 | 50);
                int i211 = -i209;
                int i212 = ((i209 & i211) | (i209 ^ i211)) >> 31;
                int i213 = (~i212) & i4;
                int i214 = i212 & i210;
                int i215 = (i214 & i213) | (i213 ^ i214);
                int i216 = (~i5) & i4;
                int i217 = ~i4;
                int i218 = i216 | (i5 & i217);
                int i219 = -i218;
                int i220 = ((i218 & i219) | (i218 ^ i219)) >> 31;
                int i221 = i215 & (~i220);
                int i222 = i5 & i220;
                int i223 = (i222 & i221) | (i221 ^ i222);
                Object[] objArr67 = new Object[1];
                c(new int[]{182, 20, 142, 16}, false, new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, objArr67);
                Object[] objArr68 = {(String) objArr67[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                    int iResolveSizeAndState = 993 - View.resolveSizeAndState(0, 0, 0);
                    int offsetBefore = 8 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr21 = $$d;
                    byte b30 = bArr21[37];
                    byte b31 = bArr21[15];
                    Object[] objArr69 = new Object[1];
                    g(b30, b31, (byte) (b31 | 32), objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAxisFromString, iResolveSizeAndState, offsetBefore, -545305915, false, (String) objArr69[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
                long j36 = 155521511;
                long j37 = -68;
                long j38 = j36 ^ j29;
                long j39 = jLongValue6 ^ j29;
                long j40 = (((long) 69) * j36) + (((long) (-67)) * jLongValue6) + (((((j38 | j39) | j33) ^ j29) | ((j36 | jLongValue6) ^ j29) | ((jLongValue6 | j32) ^ j29)) * j37) + (j37 * ((jLongValue6 | (j38 | j33)) ^ j29)) + (((long) 68) * (j38 | ((j39 | j33) ^ j29))) + ((long) 464937773);
                int iNextInt2 = new Random().nextInt();
                int i224 = ~iNextInt2;
                int i225 = (-1887081830) + (((~((-432691269) | i224)) | (~(467630180 | iNextInt2))) * 520);
                int i226 = ~((-467630181) | i224);
                int i227 = ~(iNextInt2 | 969596230);
                int i228 = ((int) (j40 >> 32)) & (i225 + ((i226 | i227) * (-1040)) + ((i227 | (~(i224 | (-969596231))) | 34938912) * 520));
                int i229 = (int) j40;
                int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                int i230 = ~iElapsedRealtime3;
                int i231 = ~((-2067883459) | i230);
                int i232 = ~((-789857428) | iElapsedRealtime3);
                int i233 = i228 | (i229 & (334239082 + ((i231 | i232) * 1150) + (((~(789857427 | i230)) | i232) * (-575)) + (((~(iElapsedRealtime3 | (-2067883459))) | (~(i230 | 2067883458))) * 575)));
                int i234 = -i233;
                int i235 = ((i233 & i234) | (i233 ^ i234)) >> 31;
                int i236 = i & (~i235);
                int i237 = i235 & ((i & (-61)) | (i217 & 60));
                int i238 = (i237 & i236) | (i236 ^ i237);
                int i239 = (i & (~i223)) | (i223 & i217);
                int i240 = -i239;
                int i241 = ((i239 & i240) | (i239 ^ i240)) >> 31;
                int i242 = i238 & (~i241);
                int i243 = i223 & i241;
                int i244 = (i243 & i242) | (i242 ^ i243);
                Object[] objArr70 = new Object[1];
                e(126 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), null, null, new byte[]{-123, -125, -123, -105, -103, -98, -111, -104, -110, -105, -115, -114, -101, -105, -113, -123, -106, -108, -114, -95, -127, -106, -119, -114, -122, -110, -123, -125, -123, -105, -110, -123, -125, -123, -105, -110}, objArr70);
                Object[] objArr71 = {(String) objArr70[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int mirror = AndroidCharacter.getMirror('0') + 945;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8;
                    byte[] bArr22 = $$d;
                    byte b32 = bArr22[37];
                    Object[] objArr72 = new Object[1];
                    g(b32, (byte) (b32 | 12), (byte) (bArr22[3] + 1), objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, mirror, keyRepeatTimeout, 349342683, false, (String) objArr72[0], new Class[]{String.class});
                }
                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
                long j41 = -743686072;
                long j42 = jLongValue7 ^ j29;
                long j43 = 676;
                long j44 = (((long) 677) * j41) + (((long) (-675)) * jLongValue7) + (((long) (-676)) * (j41 | j32 | j42)) + ((((j42 | j41) ^ j29) | ((j33 | j41) ^ j29)) * j43) + (j43 * ((((j41 ^ j29) | j42) ^ j29) | ((j42 | j33) ^ j29) | (((jLongValue7 | j41) | j32) ^ j29))) + ((long) (-103392533));
                int i245 = (((int) (j44 >> 32)) & (1900226758 + ((~(2062482303 | i)) * 623) + ((268435748 | i217) * (-623)) + (((~(446845820 | i)) | (-2062482304) | (~(1884072231 | i))) * 623))) | (((int) j44) & ((-994867713) + (((~((-1322364643) | i)) | (-1607729140)) * (-502)) + ((~((-72352897) | i217)) * (-502)) + (((-1322364643) | (~((-1535376244) | i))) * TypedValues.PositionType.TYPE_DRAWPATH)));
                int i246 = (i245 | (-i245)) >> 31;
                int i247 = (i246 & ((i & (-81)) | (i217 & 80))) | (i & (~i246));
                int i248 = (~(i & i244)) & (i | i244);
                int i249 = -i248;
                int i250 = ((i248 & i249) | (i248 ^ i249)) >> 31;
                int i251 = i247 & (~i250);
                int i252 = i244 & i250;
                int i253 = (i252 & i251) | (i251 ^ i252);
                Object[] objArr73 = new Object[1];
                c(new int[]{202, 42, 187, 10}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, objArr73);
                Object[] objArr74 = {(String) objArr73[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int minimumFlingVelocity = 993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                    byte[] bArr23 = $$d;
                    byte b33 = bArr23[37];
                    Object[] objArr75 = new Object[1];
                    g(b33, (byte) (b33 | 12), (byte) (bArr23[3] + 1), objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority2, minimumFlingVelocity, longPressTimeout, 349342683, false, (String) objArr75[0], new Class[]{String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
                long j45 = -769798601;
                long j46 = j45 ^ j29;
                long j47 = 191;
                long jMyTid = Process.myTid();
                long j48 = (((long) (-381)) * j45) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue8) + (((long) (-191)) * j46) + ((j45 | ((jLongValue8 | jMyTid) ^ j29)) * j47) + (j47 * (((jLongValue8 | (jMyTid ^ j29)) ^ j29) | ((j46 | jLongValue8) ^ j29))) + ((long) (-77280004));
                int i254 = (int) Runtime.getRuntime().totalMemory();
                int i255 = ~i254;
                int i256 = ((int) (j48 >> 32)) & (1016480234 + ((~(446718623 | i255)) * (-560)) + ((~(i254 | (-554275073))) * (-560)) + (((~(990507787 | i255)) | 10485908) * 560));
                int iElapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                int i257 = ~iElapsedRealtime4;
                int i258 = ((int) j48) & ((-534988952) + (((~(1212137051 | i257)) | 225089358) * (-865)) + ((~(iElapsedRealtime4 | (-1212137052))) * 865) + (((~(225089358 | i257)) | (~(i257 | (-1212137052)))) * 865));
                int i259 = (i256 & i258) | (i256 ^ i258);
                int i260 = -i259;
                int i261 = ((i259 & i260) | (i259 ^ i260)) >> 31;
                int i262 = i & (~i261);
                int i263 = i261 & ((i & (-91)) | (i217 & 90));
                int i264 = (i263 & i262) | (i262 ^ i263);
                int i265 = (~(i & i253)) & (i | i253);
                int i266 = -i265;
                int i267 = ((i265 & i266) | (i265 ^ i266)) >> 31;
                int i268 = i264 & (~i267);
                int i269 = i253 & i267;
                int i270 = (i269 & i268) | (i268 ^ i269);
                Object[] objArr76 = new Object[1];
                c(new int[]{244, 18, 0, 0}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1}, objArr76);
                Object[] objArr77 = {(String) objArr76[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int iIndexOf2 = 992 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int doubleTapTimeout = 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr24 = $$d;
                    byte b34 = bArr24[37];
                    Object[] objArr78 = new Object[1];
                    g(b34, (byte) (b34 | 12), (byte) (bArr24[3] + 1), objArr78);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetAfter, iIndexOf2, doubleTapTimeout, 349342683, false, (String) objArr78[0], new Class[]{String.class});
                }
                long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
                long j49 = 318213709;
                long j50 = (((long) 714) * j49) + (((long) (-712)) * jLongValue9);
                long j51 = j49 ^ j29;
                long j52 = ((j51 | j33) ^ j29) | ((j51 | jLongValue9) ^ j29);
                long j53 = jLongValue9 ^ j29;
                long j54 = ((j49 | j53) | j32) ^ j29;
                long j55 = j50 + (((long) (-713)) * (j52 | j54)) + (((long) 1426) * j54) + (((long) 713) * ((j53 | j33) ^ j29)) + ((long) (-1165292314));
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i271 = ((int) (j55 >> 32)) & (635053320 + (((-34611235) | elapsedCpuTime) * (-627)) + (((~((-1305337669) | elapsedCpuTime)) | 131888742) * (-627)) + (((~(elapsedCpuTime | 131888742)) | (~((~elapsedCpuTime) | 1305337668))) * 627));
                int iNextInt3 = new Random().nextInt();
                int i272 = ((int) j55) & (634945822 + (((~((~iNextInt3) | 635266416)) | (-801959994)) * (-235)) + (((~(635266416 | iNextInt3)) | (-801959994)) * (-470)) + (((~(iNextInt3 | (-167809034))) | 1115456) * 235));
                int i273 = (i271 & i272) | (i271 ^ i272);
                int i274 = -i273;
                int i275 = ((i273 & i274) | (i273 ^ i274)) >> 31;
                int i276 = i ^ i270;
                int i277 = (i276 | (-i276)) >> 31;
                int i278 = (i270 & i277) | (((i275 & (i ^ 100)) | (i & (~i275))) & (~i277));
                int[] iArr = new int[1];
                Object[] objArr79 = {new int[]{i}, strArr, iArr, new int[]{i278}};
                int i279 = (i & (~i278)) | (i278 & i217);
                int i280 = -i279;
                int i281 = (((((-1523907752) + (((~(i217 | (-121001493))) | 929714808) * (-1042))) + ((i | (-121001493)) * 521)) + ((((~((-929714809) | i)) | 810025064) | (~((-1311749) | i217))) * 521)) - (~(-(-((((i279 & i280) | (i279 ^ i280)) >> 31) & 16))))) - 1;
                int i282 = ((i3 | i281) << 1) - (i3 ^ i281);
                int i283 = i282 << 13;
                int i284 = (i282 | i283) & (~(i282 & i283));
                int i285 = i284 >>> 17;
                int i286 = (i284 | i285) & (~(i284 & i285));
                int i287 = i286 << 5;
                iArr[0] = ((~i286) & i287) | ((~i287) & i286);
                return objArr79;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, byte r8, byte r9) {
                /*
                    int r7 = r7 + 4
                    byte[] r0 = defpackage.setDisplayMode.$$c
                    int r9 = r9 + 67
                    int r8 = r8 * 3
                    int r8 = r8 + 1
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r9 = r7
                    r3 = r8
                    r4 = r2
                    goto L28
                L13:
                    r3 = r2
                L14:
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L23:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L28:
                    int r7 = r7 + r3
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setDisplayMode.$$g(byte, byte, byte):java.lang.String");
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setSplashScreenParams
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    public static /* synthetic */ Unit b(isSticky issticky, OtpVerificationResponse otpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = issticky.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isSticky issticky, OtpVerificationResponse otpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = issticky.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isSticky issticky, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, issticky.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isSticky issticky, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, issticky.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isSticky issticky, OtpVerificationResponse otpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = issticky.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isSticky issticky, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, issticky.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isSticky issticky, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, issticky.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isSticky issticky, OtpVerificationResponse otpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = issticky.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isSticky issticky, OtpVerificationResponse otpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = issticky.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(isSticky issticky, OtpVerificationResponse otpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<OtpVerificationResponse>> mutableLiveData = issticky.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(isSticky issticky, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, issticky.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(isSticky issticky, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, issticky.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }
}
