package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.RegistrationRepository;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.EmailActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.GenerateKeyRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.NewActivationRequest;
import com.bpjstku.data.registration.general.model.request.NewRegisterRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.request.PhoneActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.data.registration.general.model.request.UpdateActivationRequest;
import com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.domain.registration.general.model.Verification;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import kotlin.UByte;
import kotlin.io.FileTreeWalk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dark implements BackHandlerKtExternalSyntheticLambda1 {
    private final RegistrationRepository TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public dark(RegistrationRepository registrationRepository) {
        Intrinsics.checkNotNullParameter(registrationRepository, "");
        this.TuitionPaymentFragmentbindingInflater1 = registrationRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1().get(0));
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<BaseModel> b(RegisterRequest registerRequest) {
        Intrinsics.checkNotNullParameter(registerRequest, "");
        deriveCodec<BaseItem> derivecodecPostRegistration = this.TuitionPaymentFragmentbindingInflater1.postRegistration(registerRequest);
        final Function1 function1 = new Function1() { // from class: findOwner
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ActivityResultLauncherHolder
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.onTransact(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostRegistration, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailVerificationRequest emailVerificationRequest) {
        Intrinsics.checkNotNullParameter(emailVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostEmailVerification = this.TuitionPaymentFragmentbindingInflater1.postEmailVerification(emailVerificationRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerlambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault2((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaDHmOxO09dMvcnR0D7W6U1r_6GY
            private static final byte[] $$c = {27, -8, 5, 78};
            private static final int $$d = 153;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {68, 104, -93, -37};
            private static final int $$b = 66;
            private static int asBinder = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f1332a = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {47437, 47427, 47410, 47441, 47444, 47425, 47439, 47428, 47411, 47431, 47432, 47443, 47426, 47442, 47487, 47445, 47408, 47368, 47367, 47485, 47435, 47434, 47447, 47430, 47440, 47365};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719670;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            private static boolean b = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.r8lambdaDHmOxO09dMvcnR0D7W6U1r_6GY.$$a
                    int r7 = r7 * 2
                    int r1 = r7 + 1
                    int r8 = r8 * 3
                    int r8 = r8 + 4
                    int r6 = r6 * 4
                    int r6 = r6 + 98
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2b
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L2b:
                    int r8 = -r8
                    int r6 = r6 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambdaDHmOxO09dMvcnR0D7W6U1r_6GY.d(byte, int, int, java.lang.Object[]):void");
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                int i = 2 % 2;
                int i2 = asBinder + 101;
                f1332a = i2 % 128;
                int i3 = i2 % 2;
                Verification interfaceDescriptor = dark.getInterfaceDescriptor(function1, obj);
                int i4 = f1332a + 45;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    return interfaceDescriptor;
                }
                throw null;
            }

            private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                long j = 0;
                int i4 = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $11 + 45;
                        $10 = i6 % 128;
                        int i7 = i6 % i2;
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i4] = Integer.valueOf(cArr2[i5]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 31338);
                                int iIndexOf = TextUtils.indexOf("", "", i4, i4) + 2994;
                                int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16;
                                byte b2 = (byte) ($$d & 7);
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, i8, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i5++;
                            i2 = 2;
                            j = 0;
                            i4 = 0;
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
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 253, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                if (!(!b)) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085, 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    int i9 = $11 + 105;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (Process.myTid() >> 22)), 3084 - TextUtils.lastIndexOf("", '0', 0), Color.alpha(0) + 26, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr5);
                    int i11 = $11 + 79;
                    $10 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                int i12 = 0;
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        i12 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                    }
                }
            }

            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) throws Throwable {
                int i3;
                String line;
                char c;
                Object[] objArr;
                String str;
                boolean z;
                char c2;
                int i4;
                Class<?> cls;
                Class<?>[] clsArr;
                int i5 = 2 % 2;
                try {
                    int i6 = -Color.blue(0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i7 = i6 * 866;
                    int i8 = ((i7 | (-109728)) << 1) - (i7 ^ (-109728));
                    int i9 = ~i6;
                    int i10 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i11 = ~((i9 & i10) | (i9 ^ i10));
                    int i12 = ((i11 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i11)) * (-865);
                    int i13 = (i8 ^ i12) + ((i12 & i8) << 1);
                    int i14 = (~(i6 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 865;
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    int i16 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i17 = ~((i16 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i16));
                    int i18 = ~((i6 & i10) | (i10 ^ i6));
                    int i19 = -(-(((i18 & i17) | (i17 ^ i18)) * 865));
                    Object[] objArr2 = new Object[1];
                    c(null, null, (i15 & i19) + (i19 | i15), new byte[]{-114, -124, -115, -116, -124, -117, -117, -118, -119, -120, -124, -121, -121, -122, -123, -124, -125, -126, -127}, objArr2);
                    int i20 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i21 = (i20 * (-501)) + 63378;
                    int i22 = ((~(((-127) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-127) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | (~((i20 ^ 126) | (i20 & 126)))) * (-502);
                    int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                    int i24 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i25 = (i24 & ComposerKt.defaultsKey) | ((-127) ^ i24);
                    int i26 = -(-((~((i25 & i20) | (i25 ^ i20))) * (-502)));
                    int i27 = ~i20;
                    int i28 = ~((i27 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i27 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    Object[] objArr3 = new Object[1];
                    c(null, null, (((i23 ^ i26) + ((i26 & i23) << 1)) - (~(-(-(((i28 & ComposerKt.defaultsKey) | ((-127) ^ i28)) * TypedValues.PositionType.TYPE_DRAWPATH))))) - 1, new byte[]{-120, -124, -121, -121, -122, -123, -124, -125, -120, -118, -111, -121, -117, -127, -115, -127, -112, -113}, objArr3);
                    String[] strArr = {(String) objArr2[0], (String) objArr3[0]};
                    int i29 = 0;
                    while (true) {
                        if (i29 >= 2) {
                            i3 = i;
                            break;
                        }
                        String str2 = strArr[i29];
                        int i30 = -View.getDefaultSize(0, 0);
                        int i31 = asBinder;
                        int i32 = ((i31 | 9) << 1) - (i31 ^ 9);
                        f1332a = i32 % 128;
                        int i33 = i32 % 2;
                        int i34 = (i30 * 69) - 8509;
                        int i35 = ~i30;
                        int i36 = i35 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                        int i37 = ~i;
                        int i38 = (i36 ^ i37) | (i37 & i36);
                        int i39 = ((i31 | 105) << 1) - (i31 ^ 105);
                        int i40 = i39 % 128;
                        f1332a = i40;
                        if (i39 % 2 == 0) {
                            int i41 = (~i38) | (~((i30 ^ 127) | (i30 & 127)));
                            int i42 = ~((i ^ 127) | (i & 127));
                            i4 = (-68) % ((i41 ^ i42) | (i41 & i42));
                        } else {
                            int i43 = (~i38) | (~((i30 ^ 127) | (i30 & 127)));
                            int i44 = ~((i ^ 127) | (i & 127));
                            i4 = ((i43 ^ i44) | (i43 & i44)) * (-68);
                        }
                        int i45 = (i40 & 41) + (i40 | 41);
                        asBinder = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = i34 + i4;
                        int i48 = ~i;
                        int i49 = (i35 & i48) | (i35 ^ i48);
                        int i50 = (~((i49 & 127) | (i49 ^ 127))) * (-68);
                        int i51 = (i47 ^ i50) + ((i47 & i50) << 1);
                        int i52 = ~i30;
                        int i53 = ~((i48 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i48));
                        int i54 = i40 + 113;
                        asBinder = i54 % 128;
                        if (i54 % 2 != 0) {
                            Object[] objArr4 = new Object[1];
                            c(null, null, i51 >> (68 / ((i53 & i52) | (i52 ^ i53))), new byte[]{-121, -122, -123, -124, -125, -110, -126, -118, -110, -114, -127, -118, -120, -114, -117, -112}, objArr4);
                            cls = Class.forName((String) objArr4[0]);
                            clsArr = new Class[1];
                        } else {
                            int i55 = i52 ^ i53;
                            Object[] objArr5 = new Object[1];
                            c(null, null, i51 + (((i53 & i52) | i55) * 68), new byte[]{-121, -122, -123, -124, -125, -110, -126, -118, -110, -114, -127, -118, -120, -114, -117, -112}, objArr5);
                            cls = Class.forName((String) objArr5[0]);
                            clsArr = new Class[0];
                        }
                        if (((Boolean) cls.getMethod(str2, clsArr).invoke(cls, null)).booleanValue()) {
                            i3 = (~(i & 1)) & (i | 1);
                            int i56 = f1332a;
                            int i57 = ((i56 | 97) << 1) - (i56 ^ 97);
                            asBinder = i57 % 128;
                            int i58 = i57 % 2;
                            break;
                        }
                        i29++;
                    }
                } catch (Exception unused) {
                    i3 = (~(i & 2)) & (i | 2);
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char doubleTapTimeout = (char) (2419 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int i59 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2845;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 5;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr6 = new Object[1];
                        d(b2, b3, b3, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, i59, jumpTapTimeout, -501222268, false, (String) objArr6[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = 197639207;
                    long j2 = 983;
                    long j3 = -1;
                    long j4 = jLongValue ^ j3;
                    long j5 = j ^ j3;
                    long startElapsedRealtime = ((long) ((int) Process.getStartElapsedRealtime())) ^ j3;
                    long j6 = (((long) (-1965)) * j) + (((long) 984) * jLongValue) + ((j | j4) * j2) + (((long) (-983)) * (j5 | ((j4 | startElapsedRealtime) ^ j3))) + (j2 * (((startElapsedRealtime | j5) ^ j3) | (j3 ^ (j5 | jLongValue)))) + ((long) (-1356825893));
                    int iMyUid = Process.myUid();
                    int i60 = ((int) (j6 >> 32)) & (501358106 + (((~((-1386906042) | iMyUid)) | 44728753) * 336) + (((~(50320369 | iMyUid)) | (-1392497658)) * (-168)) + (((~((~iMyUid) | 50320369)) | (-1386906042)) * 168));
                    int i61 = (((~((-537478162) | i)) | 159383616) * 449) + 655648772;
                    int i62 = ~i;
                    int i63 = ((int) j6) & (i61 + ((159383616 | (~((-537478162) | i62))) * 449));
                    int i64 = (i60 & i63) | (i60 ^ i63);
                    int i65 = (~(i & 10)) & (i | 10);
                    int i66 = (i64 | 1) & (~(i64 & 1));
                    int i67 = (i66 | (-i66)) >> 31;
                    int i68 = i65 & (~i67);
                    int i69 = i67 & i;
                    int i70 = (i69 & i68) | (i68 ^ i69);
                    int i71 = ((~i3) & i) | (i3 & i62);
                    int i72 = (i71 | (-i71)) >> 31;
                    int i73 = i70 & (~i72);
                    int i74 = i3 & i72;
                    int i75 = (i73 ^ i74) | (i74 & i73);
                    try {
                        Object[] objArr7 = new Object[1];
                        c(null, null, 126 - (~(-(-Color.red(0)))), new byte[]{-120, -124, -116, -112, -120, -115, -105, -115, -117, -124, -120, -120, -122, -116, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr7);
                        File file = new File((String) objArr7[0]);
                        if (file.canRead()) {
                            FileReader fileReader = new FileReader(file);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            int i76 = asBinder + 71;
                            f1332a = i76 % 128;
                            int i77 = i76 % 2;
                            try {
                                line = bufferedReader.readLine();
                                int i78 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int i79 = ((i78 * 758) - 95256) + (((i78 ^ i62) | (i78 & i62)) * (-757)) + ((~((-127) | i78 | i)) * 1514);
                                int i80 = f1332a + 17;
                                asBinder = i80 % 128;
                                if (i80 % 2 != 0) {
                                    throw null;
                                }
                                int i81 = ~i78;
                                int i82 = (~((i62 & ComposerKt.defaultsKey) | ((-127) ^ i62))) | (~((i81 & ComposerKt.defaultsKey) | (i81 ^ ComposerKt.defaultsKey)));
                                int i83 = ~((i78 & 126) | (i78 ^ 126) | i);
                                int i84 = 757 * ((i82 & i83) | (i82 ^ i83));
                                Object[] objArr8 = new Object[1];
                                c(null, null, (i79 ^ i84) + ((i84 & i79) << 1), new byte[]{-104, -118, -117}, objArr8);
                                if (line.equals((String) objArr8[0])) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i85 = f1332a + 71;
                                    asBinder = i85 % 128;
                                    int i86 = i85 % 2;
                                    int i87 = asBinder;
                                    int i88 = (i87 & 117) + (i87 | 117);
                                    f1332a = i88 % 128;
                                    int i89 = i88 % 2;
                                    line = null;
                                } else {
                                    fileReader.close();
                                    bufferedReader.close();
                                }
                            } catch (Throwable th) {
                                fileReader.close();
                                bufferedReader.close();
                                throw th;
                            }
                        } else {
                            int i90 = asBinder;
                            int i91 = (i90 ^ 85) + ((i90 & 85) << 1);
                            f1332a = i91 % 128;
                            if (i91 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            line = null;
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                        Object[] objArr9 = new Object[1];
                        c(null, null, ((edgeSlop | 127) << 1) - (edgeSlop ^ 127), new byte[]{-114, -124, -106, -123, -112, -117, -124, -105, -124, -116, -112, -120, -115, -103, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109, -116, -118, -120, -104, -109}, objArr9);
                        File file2 = new File((String) objArr9[0]);
                        if (file2.canRead()) {
                            FileReader fileReader2 = new FileReader(file2);
                            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                            int i92 = asBinder;
                            int i93 = ((i92 | 125) << 1) - (i92 ^ 125);
                            f1332a = i93 % 128;
                            int i94 = i93 % 2;
                            try {
                                String line2 = bufferedReader2.readLine();
                                int i95 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i96 = f1332a + 83;
                                int i97 = i96 % 128;
                                asBinder = i97;
                                int i98 = i96 % 2;
                                int i99 = i95 * (-496);
                                int i100 = ((i99 | (-62992)) << 1) - (i99 ^ (-62992));
                                int i101 = ~i95;
                                int i102 = i97 + 117;
                                f1332a = i102 % 128;
                                int i103 = i102 % 2;
                                int i104 = (i100 - (~(-(-(497 * (~((i101 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i101 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)))))))) - 1;
                                int i105 = ~i95;
                                int i106 = i105 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                int i107 = (i97 ^ 37) + ((i97 & 37) << 1);
                                int i108 = i107 % 128;
                                f1332a = i108;
                                int i109 = i107 % 2;
                                int i110 = ~((i106 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i106 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i112 = ((-128) ^ i111) | ((-128) & i111);
                                int i113 = ~((i112 ^ i95) | (i112 & i95));
                                int i114 = i104 + (497 * ((i110 ^ i113) | (i110 & i113)));
                                int i115 = ~((i105 ^ i111) | (i111 & i105));
                                int i116 = ~(i105 | 127);
                                int i117 = (i116 & i115) | (i115 ^ i116);
                                int i118 = i108 + 65;
                                asBinder = i118 % 128;
                                if (i118 % 2 != 0) {
                                    int i119 = i95 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                    int i120 = ~((i119 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i119 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    Object[] objArr10 = new Object[1];
                                    c(null, null, i114 >> (497 >>> ((i120 & i117) | (i117 ^ i120))), new byte[]{-102}, objArr10);
                                    str = (String) objArr10[0];
                                } else {
                                    int i121 = i95 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                    int i122 = ~((i121 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i121 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    Object[] objArr11 = new Object[1];
                                    c(null, null, (i114 - (~(((i122 & i117) | (i117 ^ i122)) * 497))) - 1, new byte[]{-102}, objArr11);
                                    str = (String) objArr11[0];
                                }
                                boolean zEquals = line2.equals(str);
                                int i123 = f1332a + 99;
                                asBinder = i123 % 128;
                                if (i123 % 2 != 0) {
                                    fileReader2.close();
                                    bufferedReader2.close();
                                    throw null;
                                }
                                fileReader2.close();
                                bufferedReader2.close();
                                if (zEquals) {
                                    Object[] objArr12 = new Object[1];
                                    c(null, null, 127 - Color.red(0), new byte[]{-117, -118, -105, -121, -117, -127, -116, -112, -120, -115, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr12);
                                    File file3 = new File((String) objArr12[0]);
                                    if (!file3.canRead()) {
                                        int i124 = f1332a;
                                        int i125 = (i124 & 67) + (i124 | 67);
                                        asBinder = i125 % 128;
                                        z = i125 % 2 != 0;
                                    } else {
                                        FileReader fileReader3 = new FileReader(file3);
                                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                        try {
                                            String line3 = bufferedReader3.readLine();
                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                            int i126 = asBinder;
                                            int i127 = (i126 & 41) + (i126 | 41);
                                            f1332a = i127 % 128;
                                            int i128 = i127 % 2;
                                            int i129 = -(-iCombineMeasuredStates);
                                            Object[] objArr13 = new Object[1];
                                            c(null, null, (127 & i129) + (i129 | 127), new byte[]{-102}, objArr13);
                                            boolean zEquals2 = line3.equals((String) objArr13[0]);
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            int i130 = f1332a + 65;
                                            asBinder = i130 % 128;
                                            int i131 = i130 % 2;
                                            z = zEquals2;
                                        } catch (Throwable th2) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            throw th2;
                                        }
                                    }
                                    if (z) {
                                        int i132 = asBinder + 35;
                                        int i133 = i132 % 128;
                                        f1332a = i133;
                                        if (i132 % 2 == 0) {
                                            throw null;
                                        }
                                        if (line != null) {
                                            objArr = new Object[2];
                                            objArr[0] = new int[1];
                                            int i134 = ((i133 | 5) << 1) - (i133 ^ 5);
                                            int i135 = i134 % 128;
                                            asBinder = i135;
                                            int i136 = i134 % 2;
                                            int i137 = i ^ 20;
                                            String[] strArr2 = new String[1];
                                            int i138 = i135 + 1;
                                            f1332a = i138 % 128;
                                            if (i138 % 2 == 0) {
                                                c2 = 0;
                                                strArr2[0] = line;
                                                int i139 = 10 / 0;
                                            } else {
                                                c2 = 0;
                                                strArr2[0] = line;
                                            }
                                            ((int[]) objArr[c2])[c2] = i137;
                                            objArr[1] = strArr2;
                                            c = 0;
                                        }
                                    }
                                }
                                int i140 = ((int[]) objArr[c])[c];
                                int i141 = (~(i & i75)) & (i | i75);
                                int i142 = (i141 | (-i141)) >> 31;
                                int i143 = (~i142) & i140;
                                int i144 = i75 & i142;
                                int i145 = (i144 & i143) | (i143 ^ i144);
                                String[] strArr3 = (String[]) objArr[1];
                                Object[] objArr14 = new Object[2];
                                int i146 = i140 ^ i;
                                int i147 = -i146;
                                int i148 = (((i146 & i147) | (i146 ^ i147)) >> 31) & 1;
                                int i149 = (~(((-i148) | i148) >> 31)) & 1;
                                objArr14[i148] = null;
                                objArr14[i149] = strArr3;
                                String[] strArr4 = (String[]) objArr14[0];
                                int i150 = (~(i & i145)) & (i | i145);
                                int i151 = -i150;
                                Object[] objArr15 = {new int[]{i}, new int[]{i ^ (i << 5)}, new int[]{i145}, strArr4};
                                int i152 = ~((-204420469) | i);
                                int i153 = ((((-247431038) | i152) * (-196)) - 1051669896) + ((i152 | 43010569) * 196);
                                int i154 = -(-((((i150 & i151) | (i150 ^ i151)) >> 31) & 16));
                                int i155 = -(-((i153 ^ i154) + ((i154 & i153) << 1)));
                                int i156 = ((i2 | i155) << 1) - (i2 ^ i155);
                                int i157 = (i156 << 13) ^ i156;
                                int i158 = i157 >>> 17;
                                int i159 = ((~i157) & i158) | ((~i158) & i157);
                                return objArr15;
                            } catch (Throwable th3) {
                                fileReader2.close();
                                bufferedReader2.close();
                                throw th3;
                            }
                        }
                        int i160 = f1332a;
                        int i161 = (i160 & 125) + (i160 | 125);
                        int i162 = i161 % 128;
                        asBinder = i162;
                        int i163 = i161 % 2;
                        int i164 = ((i162 | 107) << 1) - (i162 ^ 107);
                        f1332a = i164 % 128;
                        int i165 = i164 % 2;
                    } catch (Exception unused3) {
                    }
                    objArr = new Object[2];
                    int[] iArr = new int[1];
                    objArr[0] = iArr;
                    int i166 = asBinder;
                    int i167 = (i166 & 97) + (i166 | 97);
                    f1332a = i167 % 128;
                    if (i167 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    c = 0;
                    iArr[0] = i;
                    objArr[1] = new String[0];
                    int i1410 = ((int[]) objArr[c])[c];
                    int i1411 = (~(i & i75)) & (i | i75);
                    int i1412 = (i1411 | (-i1411)) >> 31;
                    int i1413 = (~i1412) & i1410;
                    int i1414 = i75 & i1412;
                    int i1415 = (i1414 & i1413) | (i1413 ^ i1414);
                    String[] strArr5 = (String[]) objArr[1];
                    Object[] objArr16 = new Object[2];
                    int i1416 = i1410 ^ i;
                    int i1417 = -i1416;
                    int i1418 = (((i1416 & i1417) | (i1416 ^ i1417)) >> 31) & 1;
                    int i1419 = (~(((-i1418) | i1418) >> 31)) & 1;
                    objArr16[i1418] = null;
                    objArr16[i1419] = strArr5;
                    String[] strArr6 = (String[]) objArr16[0];
                    int i1510 = (~(i & i1415)) & (i | i1415);
                    int i1511 = -i1510;
                    Object[] objArr17 = {new int[]{i}, new int[]{i159 ^ (i159 << 5)}, new int[]{i1415}, strArr6};
                    int i1512 = ~((-204420469) | i);
                    int i1513 = ((((-247431038) | i1512) * (-196)) - 1051669896) + ((i1512 | 43010569) * 196);
                    int i1514 = -(-((((i1510 & i1511) | (i1510 ^ i1511)) >> 31) & 16));
                    int i1515 = -(-((i1513 ^ i1514) + ((i1514 & i1513) << 1)));
                    int i1516 = ((i2 | i1515) << 1) - (i2 ^ i1515);
                    int i1517 = (i1516 << 13) ^ i1516;
                    int i1518 = i1517 >>> 17;
                    int i1519 = ((~i1517) & i1518) | ((~i1518) & i1517);
                    return objArr17;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r5, int r6, byte r7) {
                /*
                    int r6 = r6 * 3
                    int r6 = 3 - r6
                    int r5 = r5 + 67
                    byte[] r0 = defpackage.r8lambdaDHmOxO09dMvcnR0D7W6U1r_6GY.$$c
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    int r6 = r6 + 1
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L24:
                    r4 = r0[r6]
                    int r3 = r3 + 1
                L28:
                    int r4 = -r4
                    int r5 = r5 + r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambdaDHmOxO09dMvcnR0D7W6U1r_6GY.$$e(short, int, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostEmailVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, EmailVerificationRequest emailVerificationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(emailVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostEmailVerification = this.TuitionPaymentFragmentbindingInflater1.postEmailVerification(str, emailVerificationRequest);
        final Function1 function1 = new Function1() { // from class: getScrimactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.g((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: SystemBarStyleCompanionExternalSyntheticLambda0
            private static final byte[] $$c = {14, 70, 6, -35};
            private static final int $$d = 115;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {14, 70, 6, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 239;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-646357948, -469647780, 1059535910, 1590925184, 1869440000, 863223180, 1434674543, -351362686, -2055113628, 841159992, 1288418759, -27234139, -602189412, -910928198, 2109905806, -352543563, 989691822, 328335915};

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
                /*
                    int r9 = 145 - r9
                    int r7 = 53 - r7
                    byte[] r0 = defpackage.SystemBarStyleCompanionExternalSyntheticLambda0.$$a
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r9
                    r5 = r2
                    r9 = r7
                    goto L29
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L23:
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L29:
                    int r8 = -r8
                    int r3 = r3 + 1
                    int r9 = r9 + r8
                    int r8 = r9 + (-11)
                    r9 = r3
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.SystemBarStyleCompanionExternalSyntheticLambda0.b(int, int, short, java.lang.Object[]):void");
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                Verification verificationINotificationSideChannelStubProxy;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 == 0) {
                    verificationINotificationSideChannelStubProxy = dark.INotificationSideChannelStubProxy(function1, obj);
                    int i3 = 88 / 0;
                } else {
                    verificationINotificationSideChannelStubProxy = dark.INotificationSideChannelStubProxy(function1, obj);
                }
                int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return verificationINotificationSideChannelStubProxy;
                }
                throw null;
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i3 = -1870535734;
                int i4 = 1;
                int i5 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i5] = Integer.valueOf(iArr2[i6]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) i5;
                                byte b2 = b;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 3292, 31 - TextUtils.getTrimmedLength(""), 1948206109, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i6++;
                            i3 = -1870535734;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i7 = 0;
                    while (i7 < length3) {
                        Object[] objArr3 = new Object[i4];
                        objArr3[0] = Integer.valueOf(iArr5[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 3291 - Color.blue(0), TextUtils.getCapsMode("", 0, 0) + 31, 1948206109, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr6[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i7++;
                        iArr5 = iArr5;
                        i4 = 1;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                sessionConfigValidatingBuilder.b = 2;
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = 5;
                if (i8 % 2 != 0) {
                    int i10 = 5 % 5;
                }
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i11 = 17;
                    for (int i12 = 1; i11 > i12; i12 = 1) {
                        int i13 = $11 + 49;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + UByte.MIN_VALUE;
                                int iArgb = 29 - Color.argb(0, 0, 0, 0);
                                byte b5 = (byte) ($$d & i9);
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, modifierMetaStateMask, iArgb, 683220507, false, $$e(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i11 += 60;
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                int iArgb2 = Color.argb(0, 0, 0, 0) + 2559;
                                int iBlue = Color.blue(0) + 29;
                                byte b7 = (byte) ($$d & i9);
                                byte b8 = (byte) (b7 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iArgb2, iBlue, 683220507, false, $$e(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i11--;
                        }
                    }
                    int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28880 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 348 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    i9 = 5;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x05c9 A[Catch: all -> 0x0610, TryCatch #0 {all -> 0x0610, blocks: (B:99:0x05bc, B:101:0x05c9, B:102:0x0602), top: B:137:0x05bc, outer: #4 }] */
            /* JADX WARN: Code duplicated, block: B:105:0x060e  */
            /* JADX WARN: Code duplicated, block: B:111:0x0619  */
            /* JADX WARN: Code duplicated, block: B:114:0x063f  */
            /* JADX WARN: Code duplicated, block: B:115:0x0642  */
            /* JADX WARN: Code duplicated, block: B:118:0x066f  */
            /* JADX WARN: Code duplicated, block: B:145:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:146:0x041d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:36:0x01f9  */
            /* JADX WARN: Code duplicated, block: B:38:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:42:0x0223  */
            /* JADX WARN: Code duplicated, block: B:44:0x0233  */
            /* JADX WARN: Code duplicated, block: B:46:0x0248 A[Catch: Exception -> 0x0619, TRY_LEAVE, TryCatch #4 {Exception -> 0x0619, blocks: (B:39:0x021b, B:45:0x0235, B:51:0x0326, B:58:0x0415, B:60:0x041b, B:61:0x041c, B:62:0x041d, B:46:0x0248, B:67:0x042d, B:71:0x044c, B:75:0x04b2, B:77:0x04ce, B:85:0x0541, B:90:0x059b, B:94:0x05a3, B:96:0x05a9, B:97:0x05aa, B:98:0x05ab, B:103:0x0608, B:107:0x0611, B:109:0x0617, B:110:0x0618, B:99:0x05bc, B:101:0x05c9, B:102:0x0602, B:86:0x054b, B:88:0x0558, B:89:0x0595, B:52:0x032f, B:54:0x033c, B:55:0x0373), top: B:145:0x021b, inners: #0, #1, #3 }] */
            /* JADX WARN: Code duplicated, block: B:50:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:54:0x033c A[Catch: all -> 0x0414, TryCatch #3 {all -> 0x0414, blocks: (B:52:0x032f, B:54:0x033c, B:55:0x0373), top: B:143:0x032f, outer: #4 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x0421  */
            /* JADX WARN: Code duplicated, block: B:70:0x044b  */
            /* JADX WARN: Code duplicated, block: B:73:0x045f  */
            /* JADX WARN: Code duplicated, block: B:80:0x04e1  */
            /* JADX WARN: Code duplicated, block: B:81:0x04f7  */
            /* JADX WARN: Code duplicated, block: B:84:0x052f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0558 A[Catch: all -> 0x05a2, TryCatch #1 {all -> 0x05a2, blocks: (B:86:0x054b, B:88:0x0558, B:89:0x0595), top: B:139:0x054b, outer: #4 }] */
            /* JADX WARN: Code duplicated, block: B:92:0x05a1  */
            /* JADX WARN: Code duplicated, block: B:98:0x05ab A[Catch: Exception -> 0x0619, TRY_LEAVE, TryCatch #4 {Exception -> 0x0619, blocks: (B:39:0x021b, B:45:0x0235, B:51:0x0326, B:58:0x0415, B:60:0x041b, B:61:0x041c, B:62:0x041d, B:46:0x0248, B:67:0x042d, B:71:0x044c, B:75:0x04b2, B:77:0x04ce, B:85:0x0541, B:90:0x059b, B:94:0x05a3, B:96:0x05a9, B:97:0x05aa, B:98:0x05ab, B:103:0x0608, B:107:0x0611, B:109:0x0617, B:110:0x0618, B:99:0x05bc, B:101:0x05c9, B:102:0x0602, B:86:0x054b, B:88:0x0558, B:89:0x0595, B:52:0x032f, B:54:0x033c, B:55:0x0373), top: B:145:0x021b, inners: #0, #1, #3 }] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                Object[] objArr;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int iAlpha;
                int iB;
                int i14;
                int i15;
                int i16;
                int i17;
                String str2;
                int[] iArr;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i27;
                int[] iArr2;
                int i28;
                int i29;
                int i30;
                int i31;
                int i32;
                int i33;
                int i34;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i35;
                int i36 = 2 % 2;
                int i37 = TuitionPaymentFragmentbindingInflater1;
                int i38 = i37 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                Object obj = null;
                if (i38 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i39 = i37 + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39 % 128;
                int i40 = i39 % 2;
                if (context != null) {
                    int i41 = ~i;
                    zzn.b();
                    try {
                        int i42 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int i43 = (i42 & 23) + (i42 | 23);
                        Object[] objArr4 = new Object[1];
                        a(new int[]{-180323939, 166109548, 490115521, 1936224120, 409075233, -1059007064, 715347015, -430050478, -115783497, -1591981875, -1702696612, -1917455668, 1111574025, -727003949}, i43, objArr4);
                        Class<?> cls = Class.forName((String) objArr4[0]);
                        int i44 = TuitionPaymentFragmentbindingInflater1;
                        int i45 = (i44 & 15) + (i44 | 15);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        Object[] objArr5 = new Object[1];
                        a(new int[]{422883484, 442173374, -283622544, -819248500, 812800020, -1277280247, -370741619, 1621133938, 1609211878, 371577497, 1384788911, 432877279}, (i47 ^ 19) + ((i47 & 19) << 1), objArr5);
                        Object objInvoke = cls.getMethod((String) objArr5[0], null).invoke(context, null);
                        int i48 = -View.resolveSize(0, 0);
                        int i49 = (i48 & 34) + (i48 | 34);
                        Object[] objArr6 = new Object[1];
                        a(new int[]{1748066375, 302730598, -1377777004, 608741352, 1649153482, 1962228181, -125681853, -1772917070, 130284900, -783169591, -1473497409, -815401810, 1490696108, 537065713, -1109215812, -1104326693, -222698415, 35063927, 1373541711, -890577633}, i49, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        a(new int[]{-285340494, -656074564, 1158460830, -1664676022, 833068975, 914672884}, 5 - TextUtils.indexOf("", ""), objArr7);
                        String str3 = (String) objArr7[0];
                        int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                        TuitionPaymentFragmentbindingInflater1 = i50 % 128;
                        int i51 = i50 % 2;
                        int i52 = cls2.getField(str3).getInt(objInvoke) & 2;
                        int i53 = (i & (-2)) | (i41 & 1);
                        int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i55 = (i54 ^ 113) + ((i54 & 113) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i55 % 128;
                        if (i55 % 2 == 0) {
                            int i56 = -i52;
                            i35 = ((i52 & i56) | (i52 ^ i56)) / 47;
                        } else {
                            i35 = (i52 | (-i52)) >> 31;
                        }
                        int i57 = (~i35) & i;
                        int i58 = i35 & i53;
                        int i59 = (i54 & 99) + (i54 | 99);
                        TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                        int i60 = i59 % 2;
                        i4 = (i58 & i57) | (i57 ^ i58);
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
                        char cIndexOf = (char) (16949 - TextUtils.indexOf("", ""));
                        int pressedStateDuration = 2739 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 14;
                        byte[] bArr = $$a;
                        byte b = bArr[7];
                        byte b2 = bArr[5];
                        Object[] objArr8 = new Object[1];
                        b(b, b2, (short) (b2 | 140), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, pressedStateDuration, iLastIndexOf, 1501733736, false, (String) objArr8[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (16950 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2739;
                        int i61 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12;
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[7];
                        byte b4 = bArr2[5];
                        Object[] objArr9 = new Object[1];
                        b(b3, b4, (short) (b4 | 88), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iNormalizeMetaState, i61, 47863026, false, (String) objArr9[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16949);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2739;
                            int modifierMetaStateMask = 12 - ((byte) KeyEvent.getModifierMetaStateMask());
                            byte b5 = (byte) ($$b & 31);
                            byte b6 = $$a[5];
                            Object[] objArr10 = new Object[1];
                            b(b5, b6, (short) (b6 | 36), objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, touchSlop, modifierMetaStateMask, 631063962, false, (String) objArr10[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i62 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                i27 = ((i62 | 49) << 1) - (i62 ^ 49);
                                TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                                if (i27 % 2 == 0) {
                                    iArr2 = new int[]{1737498655, -184431466, -1027966072, 1186966081, -215309157, 979056026, 1693855997, 144895906, -783191717, -44572461, -712836964, -1024922791, -698635327, -13322204, -2053057270, -193413955};
                                    int tapTimeout = ViewConfiguration.getTapTimeout();
                                    i28 = -(((tapTimeout | (-123)) << 1) - (tapTimeout ^ (-123)));
                                    i29 = 57;
                                } else {
                                    iArr2 = new int[]{1737498655, -184431466, -1027966072, 1186966081, -215309157, 979056026, 1693855997, 144895906, -783191717, -44572461, -712836964, -1024922791, -698635327, -13322204, -2053057270, -193413955};
                                    i28 = -(ViewConfiguration.getTapTimeout() >> 16);
                                    i29 = 28;
                                }
                                int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i64 = ((i63 | 93) << 1) - (i63 ^ 93);
                                TuitionPaymentFragmentbindingInflater1 = i64 % 128;
                                int i65 = i64 % 2;
                                i30 = (i28 * (-830)) + (i29 * 832);
                                int iB2 = zzn.b();
                                int i66 = ~iB2;
                                int i67 = (~((i66 & 1783210201) | (1783210201 ^ i66) | 38113929)) * (-783);
                                int i68 = (((-2134312456) | i67) << 1) - (i67 ^ (-2134312456));
                                int i69 = ~iB2;
                                int i70 = ~((i69 & 38113929) | (i69 ^ 38113929));
                                int i71 = ((i70 & 1783210201) | (1783210201 ^ i70)) * 783;
                                i31 = (i68 & i71) + (i68 | i71);
                                int iB3 = zzn.b();
                                i32 = ~iB3;
                                i33 = 560540638 + ((~(133315012 | i32)) * (-560));
                                i34 = (~((2012741061 ^ iB3) | (iB3 & 2012741061))) * (-560);
                                if (i31 <= (((i33 & i34) + (i33 | i34)) - (~(-(-(((~((-1902633990) | i32)) | 23207940) * 560))))) - 1) {
                                    throw null;
                                }
                                int i72 = ~i29;
                                int i73 = ~i;
                                int i74 = ~((i72 & i73) | (i72 ^ i73));
                                int i75 = (i28 ^ i29) | (i28 & i29);
                                int i76 = ~((i75 & i) | (i75 ^ i));
                                int i77 = -(-((-831) * ((i74 & i76) | (i74 ^ i76))));
                                int i78 = (i30 ^ i77) + ((i30 & i77) << 1);
                                int i79 = (~i29) | i28;
                                int i80 = (~((i79 & i) | (i79 ^ i))) * (-1662);
                                int i81 = ((i78 | i80) << 1) - (i80 ^ i78);
                                int i82 = ~i28;
                                int i83 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                                TuitionPaymentFragmentbindingInflater1 = i83 % 128;
                                int i84 = i83 % 2;
                                int i85 = i ^ (-1);
                                int i86 = ~((i82 & i85) | (i82 ^ i85));
                                int i87 = ~((i28 & i) | (i28 ^ i));
                                int i88 = (i87 & i86) | (i86 ^ i87);
                                int i89 = ~((i29 & i) | (i29 ^ i));
                                int i90 = ((i88 & i89) | (i88 ^ i89)) * 831;
                                int i91 = ((i81 | i90) << 1) - (i90 ^ i81);
                                Object[] objArr11 = new Object[1];
                                a(iArr2, i91, objArr11);
                                Object[] objArr12 = {(String) objArr11[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 993;
                                    int i92 = 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    byte b7 = $$a[7];
                                    Object[] objArr13 = new Object[1];
                                    b((byte) 52, b7, b7, objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, packedPositionGroup, i92, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr12)).longValue();
                                long j = 1255900465;
                                long j2 = -1;
                                long j3 = j ^ j2;
                                long j4 = jLongValue ^ j2;
                                long j5 = i;
                                long j6 = (((long) 592) * j) + (((long) (-590)) * jLongValue) + (((long) (-1182)) * ((j3 | jLongValue) ^ j2)) + (((long) (-591)) * ((((j3 | j4) | (j5 ^ j2)) ^ j2) | ((jLongValue | j) ^ j2))) + (((long) 591) * (j5 | j3 | j4)) + ((long) (-1456818702));
                                int i93 = ~i;
                                int i94 = ((int) (j6 >> 32)) & ((-354307540) + (((~(1187750936 | i93)) | (~(1669989948 | i))) * 210) + (((~((-71409665) | i93)) | (~((-553648677) | i))) * 210));
                                int i95 = ((int) j6) & ((-1083461046) + (((~(1387223439 | i93)) | 5284880) * 98) + (((~(i93 | 50002970)) | 1387223439 | (~((-50002971) | i))) * (-49)) + (((~(1387223439 | i)) | 44718090) * 49));
                                i10 = (i94 & i95) | (i94 ^ i95);
                                i10 = 0;
                            } else {
                                int[] iArr3 = {-2045871803, -680685352, 198291083, 899906855};
                                iAlpha = Color.alpha(0);
                                iB = zzn.b();
                                i14 = iAlpha * (-380);
                                int i96 = TuitionPaymentFragmentbindingInflater1;
                                i15 = (i96 & 67) + (i96 | 67);
                                int i97 = i15 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i97;
                                if (i15 % 2 != 0) {
                                    int i98 = i14 % 0;
                                    i16 = ~iAlpha;
                                    int i99 = -(-((iB ^ 1) | (iB & 1) | i16));
                                    i17 = i98 * (((i99 | (-381)) << 1) - (i99 ^ (-381)));
                                } else {
                                    int i100 = i14 + 382;
                                    i16 = ~iAlpha;
                                    int i101 = ((iB ^ 1) | (iB & 1) | i16) * (-381);
                                    i17 = (i100 | i101) + (i100 & i101);
                                }
                                int i102 = (i97 & 55) + (i97 | 55);
                                TuitionPaymentFragmentbindingInflater1 = i102 % 128;
                                int i103 = i102 % 2;
                                int i104 = ~((i16 ^ (-2)) | (i16 & (-2)));
                                int i105 = ~iB;
                                int i106 = ~((i105 & 1) | (i105 ^ 1));
                                int i107 = (i106 & i104) | (i104 ^ i106);
                                int i108 = ~((iAlpha ^ 1) | (iAlpha & 1));
                                int i109 = 381 * ((i107 & i108) | (i107 ^ i108));
                                int i110 = ((i97 | 73) << 1) - (i97 ^ 73);
                                TuitionPaymentFragmentbindingInflater1 = i110 % 128;
                                int i111 = i110 % 2;
                                int i112 = (i17 - (~i109)) - 1;
                                int i113 = ~iAlpha;
                                int i114 = (i112 - (~((~((i113 & 1) | (i113 ^ 1))) * 381))) - 1;
                                Object[] objArr14 = new Object[1];
                                a(iArr3, i114, objArr14);
                                str2 = (String) objArr14[0];
                                iArr = new int[]{1938758672, -1789088114, -27990329, 2026330924, -882856875, 367536595, -780518495, 1761629168, 1467399036, -728785906};
                                int i115 = TuitionPaymentFragmentbindingInflater1 + 53;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i115 % 128;
                                int i116 = i115 % 2;
                                i18 = -TextUtils.indexOf("", "", 0, 0);
                                i19 = i18 * (-665);
                                int i117 = TuitionPaymentFragmentbindingInflater1;
                                i20 = i117 + 27;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int i118 = (i19 & 25) + (i19 | 25);
                                    i22 = ~i18;
                                    int i119 = -(-i22);
                                    int i120 = -((i119 ^ (-333)) + ((i119 & (-333)) << 1));
                                    i21 = ((i118 | i120) << 1) - (i118 ^ i120);
                                } else {
                                    int i121 = (i19 & 4342) + (i19 | 4342);
                                    int i122 = -(-((~i18) * (-333)));
                                    i21 = (i121 & i122) + (i122 | i121);
                                    i22 = ~i18;
                                }
                                int i123 = ~i;
                                int i124 = ~((i22 & i123) | (i22 ^ i123));
                                int i125 = ~((13 ^ i) | (13 & i));
                                i23 = i21 + (333 * ((i124 & i125) | (i124 ^ i125)));
                                i24 = ~((~i18) | i);
                                int i126 = (i117 ^ 33) + ((33 & i117) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i126 % 128;
                                i25 = i126 % 2;
                                i26 = ~i;
                                if (i25 != 0) {
                                    int i127 = ~((i26 & 13) | (i26 ^ 13));
                                    int i128 = -((i127 & i24) | (i24 ^ i127));
                                    Object[] objArr15 = new Object[1];
                                    a(iArr, i23 >>> ((i128 & 333) + (i128 | 333)), objArr15);
                                    objArr3 = new Object[]{(String) objArr15[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33602);
                                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3085;
                                        int windowTouchSlop2 = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        byte b8 = $$a[7];
                                        Object[] objArr16 = new Object[1];
                                        b((byte) 52, b8, b8, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iCombineMeasuredStates, windowTouchSlop2, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                                    }
                                    if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                } else {
                                    int i129 = i23 + (((~(i26 | 13)) | i24) * 333);
                                    Object[] objArr17 = new Object[1];
                                    a(iArr, i129, objArr17);
                                    objArr2 = new Object[]{(String) objArr17[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char size = (char) (33602 - View.MeasureSpec.getSize(0));
                                        int touchSlop2 = 3085 - (ViewConfiguration.getTouchSlop() >> 8);
                                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 26;
                                        byte b9 = $$a[7];
                                        Object[] objArr18 = new Object[1];
                                        b((byte) 52, b9, b9, objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, touchSlop2, iNormalizeMetaState2, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                                    }
                                    if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                            }
                            int i130 = (~(i & 10)) & (i | 10);
                            int i131 = -i10;
                            int i132 = ((i10 & i131) | (i10 ^ i131)) >> 31;
                            int i133 = (~i132) & i;
                            int i134 = i132 & i130;
                            int i135 = (i134 & i133) | (i133 ^ i134);
                            int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i11 = ((i136 | 15) << 1) - (i136 ^ 15);
                            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                            if (i11 % 2 == 0) {
                                i12 = i2 & 85;
                            } else {
                                i12 = i2 & 32;
                            }
                            int i137 = (i136 ^ 31) + ((i136 & 31) << 1);
                            int i138 = i137 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i138;
                            int i139 = i137 % 2;
                            int i140 = -i12;
                            int i141 = ((i12 & i140) | (i12 ^ i140)) >> 31;
                            int i142 = i135 & (~i141);
                            i13 = (i138 ^ 55) + ((i138 & 55) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            int i143 = i & i141;
                            i5 = (i142 & i143) | (i142 ^ i143);
                            if (i13 % 2 != 0) {
                                int i144 = 95 / 0;
                            }
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i145 = TuitionPaymentFragmentbindingInflater1;
                            int i146 = ((i145 | 125) << 1) - (i145 ^ 125);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i146 % 128;
                            int i147 = i146 % 2;
                            int i148 = ((i145 | 115) << 1) - (i145 ^ 115);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i148 % 128;
                            int i149 = i148 % 2;
                            i5 = i;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i610 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                i27 = ((i610 | 49) << 1) - (i610 ^ 49);
                                TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                                if (i27 % 2 == 0) {
                                    iArr2 = new int[]{1737498655, -184431466, -1027966072, 1186966081, -215309157, 979056026, 1693855997, 144895906, -783191717, -44572461, -712836964, -1024922791, -698635327, -13322204, -2053057270, -193413955};
                                    int tapTimeout2 = ViewConfiguration.getTapTimeout();
                                    i28 = -(((tapTimeout2 | (-123)) << 1) - (tapTimeout2 ^ (-123)));
                                    i29 = 57;
                                } else {
                                    iArr2 = new int[]{1737498655, -184431466, -1027966072, 1186966081, -215309157, 979056026, 1693855997, 144895906, -783191717, -44572461, -712836964, -1024922791, -698635327, -13322204, -2053057270, -193413955};
                                    i28 = -(ViewConfiguration.getTapTimeout() >> 16);
                                    i29 = 28;
                                }
                                int i611 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i612 = ((i611 | 93) << 1) - (i611 ^ 93);
                                TuitionPaymentFragmentbindingInflater1 = i612 % 128;
                                int i613 = i612 % 2;
                                i30 = (i28 * (-830)) + (i29 * 832);
                                int iB4 = zzn.b();
                                int i614 = ~iB4;
                                int i615 = (~((i614 & 1783210201) | (1783210201 ^ i614) | 38113929)) * (-783);
                                int i616 = (((-2134312456) | i615) << 1) - (i615 ^ (-2134312456));
                                int i617 = ~iB4;
                                int i710 = ~((i617 & 38113929) | (i617 ^ 38113929));
                                int i711 = ((i710 & 1783210201) | (1783210201 ^ i710)) * 783;
                                i31 = (i616 & i711) + (i616 | i711);
                                int iB5 = zzn.b();
                                i32 = ~iB5;
                                i33 = 560540638 + ((~(133315012 | i32)) * (-560));
                                i34 = (~((2012741061 ^ iB5) | (iB5 & 2012741061))) * (-560);
                                if (i31 <= (((i33 & i34) + (i33 | i34)) - (~(-(-(((~((-1902633990) | i32)) | 23207940) * 560))))) - 1) {
                                    throw null;
                                }
                                int i712 = ~i29;
                                int i713 = ~i;
                                int i714 = ~((i712 & i713) | (i712 ^ i713));
                                int i715 = (i28 ^ i29) | (i28 & i29);
                                int i716 = ~((i715 & i) | (i715 ^ i));
                                int i717 = -(-((-831) * ((i714 & i716) | (i714 ^ i716))));
                                int i718 = (i30 ^ i717) + ((i30 & i717) << 1);
                                int i719 = (~i29) | i28;
                                int i810 = (~((i719 & i) | (i719 ^ i))) * (-1662);
                                int i811 = ((i718 | i810) << 1) - (i810 ^ i718);
                                int i812 = ~i28;
                                int i813 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                                TuitionPaymentFragmentbindingInflater1 = i813 % 128;
                                int i814 = i813 % 2;
                                int i815 = i ^ (-1);
                                int i816 = ~((i812 & i815) | (i812 ^ i815));
                                int i817 = ~((i28 & i) | (i28 ^ i));
                                int i818 = (i817 & i816) | (i816 ^ i817);
                                int i819 = ~((i29 & i) | (i29 ^ i));
                                int i910 = ((i818 & i819) | (i818 ^ i819)) * 831;
                                int i911 = ((i811 | i910) << 1) - (i910 ^ i811);
                                Object[] objArr19 = new Object[1];
                                a(iArr2, i911, objArr19);
                                Object[] objArr110 = {(String) objArr19[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 993;
                                    int i912 = 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    byte b10 = $$a[7];
                                    Object[] objArr111 = new Object[1];
                                    b((byte) 52, b10, b10, objArr111);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity2, packedPositionGroup2, i912, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                                long j7 = 1255900465;
                                long j8 = -1;
                                long j9 = j7 ^ j8;
                                long j10 = jLongValue2 ^ j8;
                                long j11 = i;
                                long j12 = (((long) 592) * j7) + (((long) (-590)) * jLongValue2) + (((long) (-1182)) * ((j9 | jLongValue2) ^ j8)) + (((long) (-591)) * ((((j9 | j10) | (j11 ^ j8)) ^ j8) | ((jLongValue2 | j7) ^ j8))) + (((long) 591) * (j11 | j9 | j10)) + ((long) (-1456818702));
                                int i913 = ~i;
                                int i914 = ((int) (j12 >> 32)) & ((-354307540) + (((~(1187750936 | i913)) | (~(1669989948 | i))) * 210) + (((~((-71409665) | i913)) | (~((-553648677) | i))) * 210));
                                int i915 = ((int) j12) & ((-1083461046) + (((~(1387223439 | i913)) | 5284880) * 98) + (((~(i913 | 50002970)) | 1387223439 | (~((-50002971) | i))) * (-49)) + (((~(1387223439 | i)) | 44718090) * 49));
                                i10 = (i914 & i915) | (i914 ^ i915);
                                i10 = 0;
                            } else {
                                int[] iArr4 = {-2045871803, -680685352, 198291083, 899906855};
                                iAlpha = Color.alpha(0);
                                iB = zzn.b();
                                i14 = iAlpha * (-380);
                                int i916 = TuitionPaymentFragmentbindingInflater1;
                                i15 = (i916 & 67) + (i916 | 67);
                                int i917 = i15 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i917;
                                if (i15 % 2 != 0) {
                                    int i918 = i14 % 0;
                                    i16 = ~iAlpha;
                                    int i919 = -(-((iB ^ 1) | (iB & 1) | i16));
                                    i17 = i918 * (((i919 | (-381)) << 1) - (i919 ^ (-381)));
                                } else {
                                    int i1010 = i14 + 382;
                                    i16 = ~iAlpha;
                                    int i1011 = ((iB ^ 1) | (iB & 1) | i16) * (-381);
                                    i17 = (i1010 | i1011) + (i1010 & i1011);
                                }
                                int i1012 = (i917 & 55) + (i917 | 55);
                                TuitionPaymentFragmentbindingInflater1 = i1012 % 128;
                                int i1013 = i1012 % 2;
                                int i1014 = ~((i16 ^ (-2)) | (i16 & (-2)));
                                int i1015 = ~iB;
                                int i1016 = ~((i1015 & 1) | (i1015 ^ 1));
                                int i1017 = (i1016 & i1014) | (i1014 ^ i1016);
                                int i1018 = ~((iAlpha ^ 1) | (iAlpha & 1));
                                int i1019 = 381 * ((i1017 & i1018) | (i1017 ^ i1018));
                                int i1110 = ((i917 | 73) << 1) - (i917 ^ 73);
                                TuitionPaymentFragmentbindingInflater1 = i1110 % 128;
                                int i1111 = i1110 % 2;
                                int i1112 = (i17 - (~i1019)) - 1;
                                int i1113 = ~iAlpha;
                                int i1114 = (i1112 - (~((~((i1113 & 1) | (i1113 ^ 1))) * 381))) - 1;
                                Object[] objArr112 = new Object[1];
                                a(iArr4, i1114, objArr112);
                                str2 = (String) objArr112[0];
                                iArr = new int[]{1938758672, -1789088114, -27990329, 2026330924, -882856875, 367536595, -780518495, 1761629168, 1467399036, -728785906};
                                int i1115 = TuitionPaymentFragmentbindingInflater1 + 53;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1115 % 128;
                                int i1116 = i1115 % 2;
                                i18 = -TextUtils.indexOf("", "", 0, 0);
                                i19 = i18 * (-665);
                                int i1117 = TuitionPaymentFragmentbindingInflater1;
                                i20 = i1117 + 27;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int i1118 = (i19 & 25) + (i19 | 25);
                                    i22 = ~i18;
                                    int i1119 = -(-i22);
                                    int i1210 = -((i1119 ^ (-333)) + ((i1119 & (-333)) << 1));
                                    i21 = ((i1118 | i1210) << 1) - (i1118 ^ i1210);
                                } else {
                                    int i1211 = (i19 & 4342) + (i19 | 4342);
                                    int i1212 = -(-((~i18) * (-333)));
                                    i21 = (i1211 & i1212) + (i1212 | i1211);
                                    i22 = ~i18;
                                }
                                int i1213 = ~i;
                                int i1214 = ~((i22 & i1213) | (i22 ^ i1213));
                                int i1215 = ~((13 ^ i) | (13 & i));
                                i23 = i21 + (333 * ((i1214 & i1215) | (i1214 ^ i1215)));
                                i24 = ~((~i18) | i);
                                int i1216 = (i1117 ^ 33) + ((33 & i1117) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1216 % 128;
                                i25 = i1216 % 2;
                                i26 = ~i;
                                if (i25 != 0) {
                                    int i1217 = ~((i26 & 13) | (i26 ^ 13));
                                    int i1218 = -((i1217 & i24) | (i24 ^ i1217));
                                    Object[] objArr113 = new Object[1];
                                    a(iArr, i23 >>> ((i1218 & 333) + (i1218 | 333)), objArr113);
                                    objArr3 = new Object[]{(String) objArr113[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char windowTouchSlop3 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33602);
                                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 3085;
                                        int windowTouchSlop4 = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        byte b11 = $$a[7];
                                        Object[] objArr114 = new Object[1];
                                        b((byte) 52, b11, b11, objArr114);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop3, iCombineMeasuredStates2, windowTouchSlop4, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                                    }
                                    if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                } else {
                                    int i1219 = i23 + (((~(i26 | 13)) | i24) * 333);
                                    Object[] objArr115 = new Object[1];
                                    a(iArr, i1219, objArr115);
                                    objArr2 = new Object[]{(String) objArr115[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char size2 = (char) (33602 - View.MeasureSpec.getSize(0));
                                        int touchSlop3 = 3085 - (ViewConfiguration.getTouchSlop() >> 8);
                                        int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 26;
                                        byte b12 = $$a[7];
                                        Object[] objArr116 = new Object[1];
                                        b((byte) 52, b12, b12, objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size2, touchSlop3, iNormalizeMetaState3, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                    }
                                    if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                            }
                            int i1310 = (~(i & 10)) & (i | 10);
                            int i1311 = -i10;
                            int i1312 = ((i10 & i1311) | (i10 ^ i1311)) >> 31;
                            int i1313 = (~i1312) & i;
                            int i1314 = i1312 & i1310;
                            int i1315 = (i1314 & i1313) | (i1313 ^ i1314);
                            int i1316 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i11 = ((i1316 | 15) << 1) - (i1316 ^ 15);
                            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                            if (i11 % 2 == 0) {
                                i12 = i2 & 85;
                            } else {
                                i12 = i2 & 32;
                            }
                            int i1317 = (i1316 ^ 31) + ((i1316 & 31) << 1);
                            int i1318 = i1317 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i1318;
                            int i1319 = i1317 % 2;
                            int i1410 = -i12;
                            int i1411 = ((i12 & i1410) | (i12 ^ i1410)) >> 31;
                            int i1412 = i1315 & (~i1411);
                            i13 = (i1318 ^ 55) + ((i1318 & 55) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            int i1413 = i & i1411;
                            i5 = (i1412 & i1413) | (i1412 ^ i1413);
                            if (i13 % 2 != 0) {
                                int i1414 = 95 / 0;
                            }
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i1415 = TuitionPaymentFragmentbindingInflater1;
                        int i1416 = ((i1415 | 125) << 1) - (i1415 ^ 125);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1416 % 128;
                        int i1417 = i1416 % 2;
                        int i1418 = ((i1415 | 115) << 1) - (i1415 ^ 115);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1418 % 128;
                        int i1419 = i1418 % 2;
                        i5 = i;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i618 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                i27 = ((i618 | 49) << 1) - (i618 ^ 49);
                                TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                                if (i27 % 2 == 0) {
                                    iArr2 = new int[]{1737498655, -184431466, -1027966072, 1186966081, -215309157, 979056026, 1693855997, 144895906, -783191717, -44572461, -712836964, -1024922791, -698635327, -13322204, -2053057270, -193413955};
                                    int tapTimeout3 = ViewConfiguration.getTapTimeout();
                                    i28 = -(((tapTimeout3 | (-123)) << 1) - (tapTimeout3 ^ (-123)));
                                    i29 = 57;
                                } else {
                                    iArr2 = new int[]{1737498655, -184431466, -1027966072, 1186966081, -215309157, 979056026, 1693855997, 144895906, -783191717, -44572461, -712836964, -1024922791, -698635327, -13322204, -2053057270, -193413955};
                                    i28 = -(ViewConfiguration.getTapTimeout() >> 16);
                                    i29 = 28;
                                }
                                int i619 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i6110 = ((i619 | 93) << 1) - (i619 ^ 93);
                                TuitionPaymentFragmentbindingInflater1 = i6110 % 128;
                                int i6111 = i6110 % 2;
                                i30 = (i28 * (-830)) + (i29 * 832);
                                int iB6 = zzn.b();
                                int i6112 = ~iB6;
                                int i6113 = (~((i6112 & 1783210201) | (1783210201 ^ i6112) | 38113929)) * (-783);
                                int i6114 = (((-2134312456) | i6113) << 1) - (i6113 ^ (-2134312456));
                                int i6115 = ~iB6;
                                int i7110 = ~((i6115 & 38113929) | (i6115 ^ 38113929));
                                int i7111 = ((i7110 & 1783210201) | (1783210201 ^ i7110)) * 783;
                                i31 = (i6114 & i7111) + (i6114 | i7111);
                                int iB7 = zzn.b();
                                i32 = ~iB7;
                                i33 = 560540638 + ((~(133315012 | i32)) * (-560));
                                i34 = (~((2012741061 ^ iB7) | (iB7 & 2012741061))) * (-560);
                                if (i31 <= (((i33 & i34) + (i33 | i34)) - (~(-(-(((~((-1902633990) | i32)) | 23207940) * 560))))) - 1) {
                                    throw null;
                                }
                                int i7112 = ~i29;
                                int i7113 = ~i;
                                int i7114 = ~((i7112 & i7113) | (i7112 ^ i7113));
                                int i7115 = (i28 ^ i29) | (i28 & i29);
                                int i7116 = ~((i7115 & i) | (i7115 ^ i));
                                int i7117 = -(-((-831) * ((i7114 & i7116) | (i7114 ^ i7116))));
                                int i7118 = (i30 ^ i7117) + ((i30 & i7117) << 1);
                                int i7119 = (~i29) | i28;
                                int i8110 = (~((i7119 & i) | (i7119 ^ i))) * (-1662);
                                int i8111 = ((i7118 | i8110) << 1) - (i8110 ^ i7118);
                                int i8112 = ~i28;
                                int i8113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                                TuitionPaymentFragmentbindingInflater1 = i8113 % 128;
                                int i8114 = i8113 % 2;
                                int i8115 = i ^ (-1);
                                int i8116 = ~((i8112 & i8115) | (i8112 ^ i8115));
                                int i8117 = ~((i28 & i) | (i28 ^ i));
                                int i8118 = (i8117 & i8116) | (i8116 ^ i8117);
                                int i8119 = ~((i29 & i) | (i29 ^ i));
                                int i9110 = ((i8118 & i8119) | (i8118 ^ i8119)) * 831;
                                int i9111 = ((i8111 | i9110) << 1) - (i9110 ^ i8111);
                                Object[] objArr117 = new Object[1];
                                a(iArr2, i9111, objArr117);
                                try {
                                    Object[] objArr118 = {(String) objArr117[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cResolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                                        int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 993;
                                        int i9112 = 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        byte b13 = $$a[7];
                                        Object[] objArr119 = new Object[1];
                                        b((byte) 52, b13, b13, objArr119);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity3, packedPositionGroup3, i9112, 410748506, false, (String) objArr119[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr118)).longValue();
                                    long j13 = 1255900465;
                                    long j14 = -1;
                                    long j15 = j13 ^ j14;
                                    long j16 = jLongValue3 ^ j14;
                                    long j17 = i;
                                    long j18 = (((long) 592) * j13) + (((long) (-590)) * jLongValue3) + (((long) (-1182)) * ((j15 | jLongValue3) ^ j14)) + (((long) (-591)) * ((((j15 | j16) | (j17 ^ j14)) ^ j14) | ((jLongValue3 | j13) ^ j14))) + (((long) 591) * (j17 | j15 | j16)) + ((long) (-1456818702));
                                    int i9113 = ~i;
                                    int i9114 = ((int) (j18 >> 32)) & ((-354307540) + (((~(1187750936 | i9113)) | (~(1669989948 | i))) * 210) + (((~((-71409665) | i9113)) | (~((-553648677) | i))) * 210));
                                    int i9115 = ((int) j18) & ((-1083461046) + (((~(1387223439 | i9113)) | 5284880) * 98) + (((~(i9113 | 50002970)) | 1387223439 | (~((-50002971) | i))) * (-49)) + (((~(1387223439 | i)) | 44718090) * 49));
                                    i10 = (i9114 & i9115) | (i9114 ^ i9115);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                                i10 = 0;
                            } else {
                                int[] iArr5 = {-2045871803, -680685352, 198291083, 899906855};
                                iAlpha = Color.alpha(0);
                                iB = zzn.b();
                                i14 = iAlpha * (-380);
                                int i9116 = TuitionPaymentFragmentbindingInflater1;
                                i15 = (i9116 & 67) + (i9116 | 67);
                                int i9117 = i15 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9117;
                                if (i15 % 2 != 0) {
                                    int i9118 = i14 % 0;
                                    i16 = ~iAlpha;
                                    int i9119 = -(-((iB ^ 1) | (iB & 1) | i16));
                                    i17 = i9118 * (((i9119 | (-381)) << 1) - (i9119 ^ (-381)));
                                } else {
                                    int i10110 = i14 + 382;
                                    i16 = ~iAlpha;
                                    int i10111 = ((iB ^ 1) | (iB & 1) | i16) * (-381);
                                    i17 = (i10110 | i10111) + (i10110 & i10111);
                                }
                                int i10112 = (i9117 & 55) + (i9117 | 55);
                                TuitionPaymentFragmentbindingInflater1 = i10112 % 128;
                                int i10113 = i10112 % 2;
                                int i10114 = ~((i16 ^ (-2)) | (i16 & (-2)));
                                int i10115 = ~iB;
                                int i10116 = ~((i10115 & 1) | (i10115 ^ 1));
                                int i10117 = (i10116 & i10114) | (i10114 ^ i10116);
                                int i10118 = ~((iAlpha ^ 1) | (iAlpha & 1));
                                int i10119 = 381 * ((i10117 & i10118) | (i10117 ^ i10118));
                                int i11110 = ((i9117 | 73) << 1) - (i9117 ^ 73);
                                TuitionPaymentFragmentbindingInflater1 = i11110 % 128;
                                int i11111 = i11110 % 2;
                                int i11112 = (i17 - (~i10119)) - 1;
                                int i11113 = ~iAlpha;
                                int i11114 = (i11112 - (~((~((i11113 & 1) | (i11113 ^ 1))) * 381))) - 1;
                                Object[] objArr1110 = new Object[1];
                                a(iArr5, i11114, objArr1110);
                                str2 = (String) objArr1110[0];
                                iArr = new int[]{1938758672, -1789088114, -27990329, 2026330924, -882856875, 367536595, -780518495, 1761629168, 1467399036, -728785906};
                                int i11115 = TuitionPaymentFragmentbindingInflater1 + 53;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11115 % 128;
                                int i11116 = i11115 % 2;
                                i18 = -TextUtils.indexOf("", "", 0, 0);
                                i19 = i18 * (-665);
                                int i11117 = TuitionPaymentFragmentbindingInflater1;
                                i20 = i11117 + 27;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int i11118 = (i19 & 25) + (i19 | 25);
                                    i22 = ~i18;
                                    int i11119 = -(-i22);
                                    int i12110 = -((i11119 ^ (-333)) + ((i11119 & (-333)) << 1));
                                    i21 = ((i11118 | i12110) << 1) - (i11118 ^ i12110);
                                } else {
                                    int i12111 = (i19 & 4342) + (i19 | 4342);
                                    int i12112 = -(-((~i18) * (-333)));
                                    i21 = (i12111 & i12112) + (i12112 | i12111);
                                    i22 = ~i18;
                                }
                                int i12113 = ~i;
                                int i12114 = ~((i22 & i12113) | (i22 ^ i12113));
                                int i12115 = ~((13 ^ i) | (13 & i));
                                i23 = i21 + (333 * ((i12114 & i12115) | (i12114 ^ i12115)));
                                i24 = ~((~i18) | i);
                                int i12116 = (i11117 ^ 33) + ((33 & i11117) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12116 % 128;
                                i25 = i12116 % 2;
                                i26 = ~i;
                                if (i25 != 0) {
                                    int i12117 = ~((i26 & 13) | (i26 ^ 13));
                                    int i12118 = -((i12117 & i24) | (i24 ^ i12117));
                                    Object[] objArr1111 = new Object[1];
                                    a(iArr, i23 >>> ((i12118 & 333) + (i12118 | 333)), objArr1111);
                                    try {
                                        objArr3 = new Object[]{(String) objArr1111[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char windowTouchSlop5 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33602);
                                            int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 3085;
                                            int windowTouchSlop6 = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            byte b14 = $$a[7];
                                            Object[] objArr1112 = new Object[1];
                                            b((byte) 52, b14, b14, objArr1112);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop5, iCombineMeasuredStates3, windowTouchSlop6, 1411172903, false, (String) objArr1112[0], new Class[]{String.class});
                                        }
                                        if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                            i10 = 1;
                                        } else {
                                            i10 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                } else {
                                    int i12119 = i23 + (((~(i26 | 13)) | i24) * 333);
                                    Object[] objArr1113 = new Object[1];
                                    a(iArr, i12119, objArr1113);
                                    try {
                                        objArr2 = new Object[]{(String) objArr1113[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char size3 = (char) (33602 - View.MeasureSpec.getSize(0));
                                            int touchSlop4 = 3085 - (ViewConfiguration.getTouchSlop() >> 8);
                                            int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 26;
                                            byte b15 = $$a[7];
                                            Object[] objArr1114 = new Object[1];
                                            b((byte) 52, b15, b15, objArr1114);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size3, touchSlop4, iNormalizeMetaState4, 1411172903, false, (String) objArr1114[0], new Class[]{String.class});
                                        }
                                        if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                            i10 = 1;
                                        } else {
                                            i10 = 0;
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
                        int i13110 = (~(i & 10)) & (i | 10);
                        int i13111 = -i10;
                        int i13112 = ((i10 & i13111) | (i10 ^ i13111)) >> 31;
                        int i13113 = (~i13112) & i;
                        int i13114 = i13112 & i13110;
                        int i13115 = (i13114 & i13113) | (i13113 ^ i13114);
                        int i13116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i11 = ((i13116 | 15) << 1) - (i13116 ^ 15);
                        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                        if (i11 % 2 == 0) {
                            i12 = i2 & 85;
                        } else {
                            i12 = i2 & 32;
                        }
                        int i13117 = (i13116 ^ 31) + ((i13116 & 31) << 1);
                        int i13118 = i13117 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i13118;
                        int i13119 = i13117 % 2;
                        int i14110 = -i12;
                        int i14111 = ((i12 & i14110) | (i12 ^ i14110)) >> 31;
                        int i14112 = i13115 & (~i14111);
                        i13 = (i13118 ^ 55) + ((i13118 & 55) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                        int i14113 = i & i14111;
                        i5 = (i14112 & i14113) | (i14112 ^ i14113);
                        if (i13 % 2 != 0) {
                            int i14114 = 95 / 0;
                        }
                    }
                    int i150 = i ^ i4;
                    int i151 = -i150;
                    int i152 = ((i150 & i151) | (i150 ^ i151)) >> 31;
                    int i153 = TuitionPaymentFragmentbindingInflater1;
                    int i154 = (i153 ^ 75) + ((i153 & 75) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i154 % 128;
                    if (i154 % 2 != 0) {
                        i7 = (i5 & (~i152)) | (i152 & i4);
                        objArr = new Object[4];
                        i6 = 1;
                        objArr[1] = new int[0];
                        objArr[1] = new int[0];
                    } else {
                        i6 = 1;
                        int i155 = i5 & (~i152);
                        int i156 = i152 & i4;
                        i7 = (i155 & i156) | (i155 ^ i156);
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                    }
                    int[] iArr6 = new int[i6];
                    objArr[2] = iArr6;
                    int i157 = ((~i7) & i) | ((~i) & i7);
                    int i158 = -i157;
                    int i159 = (((i157 & i158) | (i157 ^ i158)) >> 31) & 16;
                    ((int[]) objArr[0])[0] = i;
                    iArr6[0] = i7;
                    objArr[3] = null;
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i160 = 1546486847 + (((~((~iMaxMemory) | (-238699304))) | (-198389075)) * (-235)) + (((~((-238699304) | iMaxMemory)) | (-198389075)) * (-470)) + (((~(iMaxMemory | (-168952067))) | (-268136312)) * 235);
                    int i161 = TuitionPaymentFragmentbindingInflater1 + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i161 % 128;
                    if (i161 % 2 != 0) {
                        int i162 = -(-i159);
                        i8 = (i160 ^ i162) + ((i162 & i160) << 1);
                        i9 = ((-55) % i8) << ((-55) >> i3);
                    } else {
                        int i163 = -(-i159);
                        i8 = ((i160 | i163) << 1) - (i163 ^ i160);
                        int i164 = i8 * (-55);
                        int i165 = -(-(i3 * (-55)));
                        i9 = ((i164 & i165) << 1) + (i164 ^ i165);
                    }
                    int i166 = ~((i8 ^ i) | (i8 & i));
                    int i167 = i9 + (56 * ((i3 & i166) | (i3 ^ i166)));
                    int i168 = -(-((~((i8 ^ i3) | (i8 & i3))) * (-56)));
                    int i169 = (i167 & i168) + (i167 | i168);
                    int i170 = ~i;
                    int i171 = ~((i170 & i3) | (i170 ^ i3));
                    int i172 = (i169 - (~(-(-(((i171 & i8) | (i8 ^ i171)) * 56))))) - 1;
                    int i173 = i172 << 13;
                    int i174 = (i173 | i172) & (~(i172 & i173));
                    int i175 = i174 >>> 17;
                    int i176 = (i174 | i175) & (~(i174 & i175));
                    int i177 = i176 << 5;
                    ((int[]) objArr[1])[0] = (i176 | i177) & (~(i176 & i177));
                    return objArr;
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, byte r7, byte r8) {
                /*
                    byte[] r0 = defpackage.SystemBarStyleCompanionExternalSyntheticLambda0.$$c
                    int r6 = r6 * 56
                    int r6 = r6 + 66
                    int r8 = r8 * 2
                    int r8 = 3 - r8
                    int r7 = r7 * 2
                    int r1 = r7 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L27:
                    r3 = r0[r8]
                    r5 = r8
                    r8 = r6
                    r6 = r3
                    r3 = r5
                L2d:
                    int r6 = -r6
                    int r6 = r6 + r8
                    r8 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.SystemBarStyleCompanionExternalSyntheticLambda0.$$e(int, byte, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostEmailVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PhoneVerificationRequest phoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(phoneVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostPhoneVerification = this.TuitionPaymentFragmentbindingInflater1.postPhoneVerification(phoneVerificationRequest);
        final Function1 function1 = new Function1() { // from class: darklambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault1((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: lightlambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPhoneVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, PhoneVerificationRequest phoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(phoneVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostPhoneVerification = this.TuitionPaymentFragmentbindingInflater1.postPhoneVerification(str, phoneVerificationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambda2SMSRMsR_o8bttbeiNTrGUUAiWg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdalj_TT9Ycs622xDrDAPZnwcLqwA
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPhoneVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<MembershipCheckItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(MembershipCheckRequest membershipCheckRequest) {
        Intrinsics.checkNotNullParameter(membershipCheckRequest, "");
        deriveCodec<MembershipCheckItem> derivecodecPostMembershipCheckInfo = this.TuitionPaymentFragmentbindingInflater1.postMembershipCheckInfo(membershipCheckRequest);
        final Function1 function1 = new Function1() { // from class: ActivityResultRegistryKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault1((MembershipCheckItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: rememberLauncherForActivityResultlambda00
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostMembershipCheckInfo, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<MembershipCheckNew> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, MembershipCheckRequest membershipCheckRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(membershipCheckRequest, "");
        deriveCodec<MembershipCheckItem> derivecodecPostMembershipCheckInfo = this.TuitionPaymentFragmentbindingInflater1.postMembershipCheckInfo(str, membershipCheckRequest);
        final Function1 function1 = new Function1() { // from class: ViewTreeFullyDrawnReporterOwner
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault2((MembershipCheckItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: SystemBarStyleCompanionExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostMembershipCheckInfo, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<ActivationItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivationRequest activationRequest) {
        Intrinsics.checkNotNullParameter(activationRequest, "");
        deriveCodec<ActivationItem> derivecodecPostMembershipCheckEligibleResetAccount = this.TuitionPaymentFragmentbindingInflater1.postMembershipCheckEligibleResetAccount(activationRequest);
        final Function1 function1 = new Function1() { // from class: rememberLauncherForActivityResult
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (ActivationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaYAfMonS2ROkWVWyfbsXWPpLpnb0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.read(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostMembershipCheckEligibleResetAccount, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<ActivationItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, ActivationRequest activationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activationRequest, "");
        deriveCodec<ActivationItem> derivecodecPostMembershipCheckEligibleResetAccount = this.TuitionPaymentFragmentbindingInflater1.postMembershipCheckEligibleResetAccount(str, activationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdac5ZuH01e8cSiKvRvj_RHuspalJQ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ActivationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: SystemBarStyleCompanion
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostMembershipCheckEligibleResetAccount, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault3(EmailActivationVerificationRequest emailActivationVerificationRequest) {
        Intrinsics.checkNotNullParameter(emailActivationVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostEmailActivationVerification = this.TuitionPaymentFragmentbindingInflater1.postEmailActivationVerification(emailActivationVerificationRequest);
        final Function1 function1 = new Function1() { // from class: ActivityResultRegistryKtExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentbindingInflater1((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: rememberLauncherForActivityResultlambda40
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostEmailActivationVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> b(String str, EmailActivationVerificationRequest emailActivationVerificationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(emailActivationVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostEmailActivationVerification = this.TuitionPaymentFragmentbindingInflater1.postEmailActivationVerification(str, emailActivationVerificationRequest);
        final Function1 function1 = new Function1() { // from class: ActivityResultRegistryKtExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.asInterface((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ActivityResultRegistryKtExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.write(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostEmailActivationVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(PhoneActivationVerificationRequest phoneActivationVerificationRequest) {
        Intrinsics.checkNotNullParameter(phoneActivationVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostPhoneActivationVerification = this.TuitionPaymentFragmentbindingInflater1.postPhoneActivationVerification(phoneActivationVerificationRequest);
        final Function1 function1 = new Function1() { // from class: unregister
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.asBinder((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getLauncher
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.connect(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPhoneActivationVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(String str, PhoneActivationVerificationRequest phoneActivationVerificationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(phoneActivationVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostPhoneActivationVerification = this.TuitionPaymentFragmentbindingInflater1.postPhoneActivationVerification(str, phoneActivationVerificationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdaS8UlOnD71n3GOIFiR5ppWOIaAkk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.b((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerlambda20
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.INotificationSideChannel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPhoneActivationVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(UpdateActivationRequest updateActivationRequest) {
        Intrinsics.checkNotNullParameter(updateActivationRequest, "");
        deriveCodec<BaseItem> derivecodecPostActivation = this.TuitionPaymentFragmentbindingInflater1.postActivation(updateActivationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdagcIK6Em3026emcFeXEknnn_tB4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.b((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambda3CvmGOvkwZLY6ksF4ULs20ma2UE
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostActivation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<VerifyBiometricResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, VerifyCountBiometricRequest verifyCountBiometricRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(verifyCountBiometricRequest, "");
        deriveCodec<VerifyBiometricResponse> derivecodecVerifyCountBiometric = this.TuitionPaymentFragmentbindingInflater1.verifyCountBiometric(str, verifyCountBiometricRequest);
        final Function1 function1 = new Function1() { // from class: autodefault
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: autolambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.RemoteActionCompatParcelizer(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyCountBiometric, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<VerifyBiometricResponse> b(VerifyBiometricRequest verifyBiometricRequest) {
        Intrinsics.checkNotNullParameter(verifyBiometricRequest, "");
        String flData = verifyBiometricRequest.getFlData();
        deriveCodec<VerifyBiometricResponse> derivecodecVerifyBiometric = this.TuitionPaymentFragmentbindingInflater1.verifyBiometric(new VerifyBiometricRequest(flData != null ? Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault2(flData, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 2) : null, verifyBiometricRequest.getBrand(), verifyBiometricRequest.getDeviceId(), verifyBiometricRequest.getModel(), verifyBiometricRequest.getSdk(), verifyBiometricRequest.getManufacture(), verifyBiometricRequest.getFile(), verifyBiometricRequest.getFile2(), verifyBiometricRequest.getFile3(), verifyBiometricRequest.getNik(), verifyBiometricRequest.getEmail(), verifyBiometricRequest.getHandphone(), verifyBiometricRequest.getTransactionIdSdk(), verifyBiometricRequest.getScoreLiveness(), verifyBiometricRequest.getScoreManipulation()));
        final Function1 function1 = new Function1() { // from class: dispose
            private static final byte[] $$c = {114, -115, 48, 84};
            private static final int $$f = 10;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {58, 66, -1, 15, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 54, -3, 19, -19, -51, 71, -2, -14, 13, -68, 63, 2, -11, 1, 7, -62, 68, -13, 12, 4, -16, 14, 1, -70, 39, 27, -12, -3, 19, -15, -33, 33, 17, -13, -6, 2, -17, 27, -4, -6, 9};
            private static final int $$e = 44;
            private static final byte[] $$a = {117, -15, -81, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 77;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-905021351, 2054889184, -545171501, -1501851255, -1295901103, 992761337, 1608185460, -1070296062, 111060948, -552580855, -23935770, 1534705446, -2099566796, 2044889185, 1740622608, -626304379, -1522787828, 1484975314};

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 + 4
                    byte[] r0 = defpackage.dispose.$$a
                    int r7 = r7 * 52
                    int r7 = r7 + 1
                    int r9 = r9 * 14
                    int r9 = r9 + 84
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L2b
                L14:
                    r3 = r2
                L15:
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r7) goto L26
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L26:
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L2b:
                    int r9 = -r9
                    int r3 = r3 + r9
                    int r9 = r3 + (-11)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dispose.a(int, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.dispose.$$d
                    int r7 = r7 * 52
                    int r1 = 53 - r7
                    int r6 = 99 - r6
                    int r8 = r8 * 52
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2b
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r8]
                    r5 = r3
                    r3 = r6
                    r6 = r5
                L2b:
                    int r8 = r8 + 1
                    int r6 = r6 + r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dispose.d(int, short, int, java.lang.Object[]):void");
            }

            private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                int length;
                int[] iArr2;
                int i2 = 2;
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i4 = -1870535734;
                int i5 = 1;
                int i6 = 0;
                if (iArr3 != null) {
                    int i7 = $11 + 35;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $11 + 63;
                        $10 = i10 % 128;
                        if (i10 % i2 != 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i6] = Integer.valueOf(iArr3[i9]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 1;
                                    byte b3 = (byte) (-b2);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(i6, i6) + 3291, 'O' - AndroidCharacter.getMirror('0'), 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                                }
                                iArr4[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                i9 %= 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(iArr3[i9])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 1;
                                    byte b5 = (byte) (-b4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0), Color.alpha(0) + 3291, 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                                }
                                iArr4[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                                i9++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i2 = 2;
                        i4 = -1870535734;
                        i6 = 0;
                    }
                    int i11 = $11 + 39;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    iArr3 = iArr4;
                }
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (iArr6 != null) {
                    int i13 = $11 + 29;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                    }
                    int i14 = 0;
                    while (i14 < length) {
                        Object[] objArr4 = new Object[i5];
                        objArr4[0] = Integer.valueOf(iArr6[i14]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) i5;
                            byte b7 = (byte) (-b6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + i5), 3291 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.rgb(0, 0, 0) + 16777247, 1948206109, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr2[i14] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i14++;
                        iArr6 = iArr6;
                        i5 = 1;
                    }
                    iArr6 = iArr2;
                }
                System.arraycopy(iArr6, 0, iArr5, 0, length3);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i15 = $10 + 11;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i17 = 17;
                    for (int i18 = 1; i17 > i18; i18 = 1) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i17];
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "") + 2559, 29 - Color.argb(0, 0, 0, 0), 683220507, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i17--;
                    }
                    int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 348 - KeyEvent.keyCodeFromString(""), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37567);
                    int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int keyRepeatTimeout = 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    byte b3 = bArr[3];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) (-b3), b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, pressedStateDuration, keyRepeatTimeout, -477065106, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{-1371239144, 1273028020, -357442622, 1501261632, 2070802007, -1715668117, 13274203, -1377639038, -1456249768, 730095962, 949586237, -377085765, 1058826905, -1739404808}, 22 - Drawable.resolveOpacity(0, 0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{-1122401666, -447776551, -1273724435, -1210620500, -1111341620, -2035073056, 1330421517, 1408308005, -1819616772, 1869354774}, (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                    int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 626;
                    int threadPriority = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[3];
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) (-b4), bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, i2, threadPriority, -976899241, false, (String) objArr5[0], null);
                }
                if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object[] objArr6 = new Object[1];
                    c(new int[]{-1470236236, -989010115, -777164534, 69177507, -1892997058, -1960049804, 1254389685, -542247719, -1668259337, 1708870376, 809963947, 44878199, 1732778086, -347212085, 264855702, 1168773353}, 26 - TextUtils.indexOf("", "", 0), objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    c(new int[]{-1168481930, 920974825, 1047599387, 1167150974, -2140471493, -2110771085, -704486354, 744599993, -154700262, -1046156284, 2093171202, -263252301}, 18 - View.combineMeasuredStates(0, 0), objArr7);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr7[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr8 = new Object[1];
                    c(new int[]{1220911466, 351816454, -2008925258, -749238734, 353301069, -1250808276, -1900705973, -144833381, -9215461, 643969070}, 16 - KeyEvent.keyCodeFromString(""), objArr8);
                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{-451785400, 295482317, 826633916, -1696215051, -1926353180, -1108608913, -1210488885, 568838582, 1386157700, -259355800}, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr10 = new Object[1];
                    c(new int[]{-1055286666, 348450102, 1097557515, 192665373, 1190990577, -223014711, -1238309477, 170640657, -697862643, -792330781, 2049755944, -376153845, 999320328, 1590142070, 993264575, -1678818109, -1028959499, -1239306889, 73969384, -1440992744, 170856380, -383257329, 1433357109, -1380403811, -1376935059, 1098655435, -692963990, 836981249, -857414596, -1127887273, -645468540, -1882382148, -1265416499, -651477886}, 63 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr10);
                    String str = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    c(new int[]{-412775583, -665944919, 38732561, 340541691, 520154871, -136717075, -439196202, 752629411, 376938992, 391258334, 566845918, 2100533359, -1551584022, 2136796577, 1727804845, -1300499390, 429905101, -200604038, -1289382080, -742794990, -1088361443, 1480879962, -156074612, -70691853, -1148443128, -497152338, 1049565446, 873146998, 639533558, -756263366, -388928761, 1217223478, 842696632, -2062639897}, 64 - (ViewConfiguration.getTouchSlop() >> 8), objArr11);
                    String[] strArr = {str, (String) objArr11[0]};
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                    b = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, strArr, Integer.valueOf(iIntValue), 17, 236897268};
                        byte[] bArr3 = $$d;
                        byte b5 = (byte) (bArr3[11] - 1);
                        byte b6 = b5;
                        Object[] objArr13 = new Object[1];
                        d(b5, b6, b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = bArr3[11];
                        byte b8 = b7;
                        Object[] objArr14 = new Object[1];
                        d(b7, b8, b8, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        int i5 = ((int[]) objArr15[0])[0];
                        int i6 = ((int[]) objArr15[2])[0];
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37567);
                                int iMyTid = 625 - (Process.myTid() >> 22);
                                int offsetAfter = 14 - TextUtils.getOffsetAfter("", 0);
                                byte[] bArr4 = $$a;
                                byte b9 = bArr4[3];
                                Object[] objArr16 = new Object[1];
                                a(b9, (byte) (b9 | 50), bArr4[7], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, iMyTid, offsetAfter, -973632554, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new int[]{-1371239144, 1273028020, -357442622, 1501261632, 2070802007, -1715668117, 13274203, -1377639038, -1456249768, 730095962, 949586237, -377085765, 1058826905, -1739404808}, ImageFormat.getBitsPerPixel(0) + 23, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new int[]{-1122401666, -447776551, -1273724435, -1210620500, -1111341620, -2035073056, 1330421517, 1408308005, -1819616772, 1869354774}, 15 - Drawable.resolveOpacity(0, 0), objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char defaultSize = (char) (37567 - View.getDefaultSize(0, 0));
                                    int edgeSlop2 = 625 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    int i7 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    byte[] bArr5 = $$a;
                                    byte b10 = bArr5[3];
                                    Object[] objArr19 = new Object[1];
                                    a(b10, (byte) (-b10), bArr5[7], objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, edgeSlop2, i7, -976899241, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                                    int maxKeyCode = 625 - (KeyEvent.getMaxKeyCode() >> 16);
                                    int packedPositionChild = 13 - ExpandableListView.getPackedPositionChild(0L);
                                    byte[] bArr6 = $$a;
                                    byte b11 = bArr6[7];
                                    byte b12 = bArr6[3];
                                    Object[] objArr20 = new Object[1];
                                    a(b11, (byte) (-b12), b12, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout2, maxKeyCode, packedPositionChild, -477065106, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr15;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37567);
                        int iNormalizeMetaState = 625 - KeyEvent.normalizeMetaState(0);
                        int trimmedLength = 14 - TextUtils.getTrimmedLength("");
                        byte[] bArr7 = $$a;
                        byte b13 = bArr7[3];
                        Object[] objArr21 = new Object[1];
                        a(b13, (byte) (b13 | 50), bArr7[7], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, iNormalizeMetaState, trimmedLength, -973632554, false, (String) objArr21[0], null);
                    }
                    Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                    int i8 = ((int[]) objArr22[2])[0];
                    int i9 = ((int[]) objArr22[0])[0];
                    String[] strArr2 = (String[]) objArr22[3];
                    int[] iArr = {i8};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i10 = (-1611613572) + (((~((~iIdentityHashCode) | (-1237159))) | (~(1601437695 | iIdentityHashCode))) * (-302)) + ((~((-1237159) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | 1600200537)) | 1377900112) * 302) + 236897268;
                    int i11 = (i10 << 13) ^ i10;
                    int i12 = i11 ^ (i11 >>> 17);
                    ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
                    objArr = new Object[]{new int[]{i9}, new int[1], iArr, strArr2};
                }
                if (((int[]) objArr[2])[0] == ((int[]) objArr[0])[0]) {
                    int i13 = ((int[]) objArr[1])[0];
                    int i14 = ((int[]) objArr[2])[0];
                    int i15 = ((int[]) objArr[0])[0];
                    String[] strArr3 = (String[]) objArr[3];
                    int[] iArr2 = {i14};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i16 = ~iIdentityHashCode2;
                    int i17 = ~(664928555 | i16);
                    int i18 = i13 + 1279698968 + ((1074792148 | i17) * (-712)) + (((~(iIdentityHashCode2 | 1739720703)) | (~(i16 | (-1074792149)))) * (-712)) + (((-1158809566) | i17) * 712);
                    int i19 = (i18 << 13) ^ i18;
                    int i20 = i19 ^ (i19 >>> 17);
                    ((int[]) objArr[1])[0] = i20 ^ (i20 << 5);
                    Object[] objArr23 = {new int[]{i15}, new int[1], iArr2, strArr3};
                    int i21 = b;
                    int i22 = i21 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = i21 + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                    if (i24 % 2 != 0) {
                        return dark.TuitionPaymentFragmentbindingInflater1((VerifyBiometricResponse) obj);
                    }
                    int i25 = 12 / 0;
                    return dark.TuitionPaymentFragmentbindingInflater1((VerifyBiometricResponse) obj);
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr4 = (String[]) objArr[3];
                if (strArr4 != null) {
                    for (String str2 : strArr4) {
                        arrayList.add(str2);
                    }
                    throw null;
                }
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, short r7, int r8) {
                /*
                    int r6 = r6 * 56
                    int r6 = 122 - r6
                    byte[] r0 = defpackage.dispose.$$c
                    int r7 = r7 + 4
                    int r8 = r8 * 4
                    int r1 = 1 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L17
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L27:
                    r3 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L2d:
                    int r6 = -r6
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dispose.$$g(int, short, int):java.lang.String");
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdakM0UcaP40dPddLQ78INQJofAtI
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyBiometric, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<VerifyBiometricResponse> b(String str, VerifyBiometricRequest verifyBiometricRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(verifyBiometricRequest, "");
        String flData = verifyBiometricRequest.getFlData();
        deriveCodec<VerifyBiometricResponse> derivecodecVerifyBiometric = this.TuitionPaymentFragmentbindingInflater1.verifyBiometric(str, new VerifyBiometricRequest(flData != null ? Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault2(flData, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 2) : null, verifyBiometricRequest.getBrand(), verifyBiometricRequest.getDeviceId(), verifyBiometricRequest.getModel(), verifyBiometricRequest.getSdk(), verifyBiometricRequest.getManufacture(), verifyBiometricRequest.getFile(), verifyBiometricRequest.getFile2(), verifyBiometricRequest.getFile3(), verifyBiometricRequest.getNik(), verifyBiometricRequest.getEmail(), verifyBiometricRequest.getHandphone(), verifyBiometricRequest.getTransactionIdSdk(), verifyBiometricRequest.getScoreLiveness(), verifyBiometricRequest.getScoreManipulation()));
        final Function1 function1 = new Function1() { // from class: SystemBarStyleCompanionExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.b((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: launch
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyBiometric, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<KeyResponse> b(GenerateKeyRequest generateKeyRequest) {
        Intrinsics.checkNotNullParameter(generateKeyRequest, "");
        deriveCodec<KeyResponse> derivecodecGenerateKey = this.TuitionPaymentFragmentbindingInflater1.generateKey(new GenerateKeyRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, generateKeyRequest.getData(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), generateKeyRequest.getEmail()));
        final Function1 function1 = new Function1() { // from class: BackHandlerKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.b((KeyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerInfo
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.cancelAll(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecGenerateKey, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, NewRegisterRequest newRegisterRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(newRegisterRequest, "");
        deriveCodec<BaseItem> derivecodecPostNewRegistration = this.TuitionPaymentFragmentbindingInflater1.postNewRegistration(str, newRegisterRequest);
        final Function1 function1 = new Function1() { // from class: getCompositeKey
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault3((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ActivityResultRegistryKtrememberLauncherForActivityResultlambda40inlinedonDispose1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostNewRegistration, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, NewActivationRequest newActivationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(newActivationRequest, "");
        deriveCodec<BaseItem> derivecodecPostNewActivation = this.TuitionPaymentFragmentbindingInflater1.postNewActivation(str, newActivationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdaB1Fin5hf49c20rDAvK1Q7mhIkmo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandler
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.cancel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostNewActivation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<VerifyBiometricResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, VerifyCountBiometricRequest verifyCountBiometricRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(verifyCountBiometricRequest, "");
        deriveCodec<VerifyBiometricResponse> derivecodecVerifyCountActivationBiometric = this.TuitionPaymentFragmentbindingInflater1.verifyCountActivationBiometric(str, verifyCountBiometricRequest);
        final Function1 function1 = new Function1() { // from class: getScrimWithEnforcedContrastactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault1((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaziobQyLM8yHaWA0oXjc6WazfbqA
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyCountActivationBiometric, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<VerifyBiometricResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, VerifyBiometricRequest verifyBiometricRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(verifyBiometricRequest, "");
        String flData = verifyBiometricRequest.getFlData();
        deriveCodec<VerifyBiometricResponse> derivecodecVerifyActivationBiometric = this.TuitionPaymentFragmentbindingInflater1.verifyActivationBiometric(str, new VerifyBiometricRequest(flData != null ? Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault2(flData, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 2) : null, verifyBiometricRequest.getBrand(), verifyBiometricRequest.getDeviceId(), verifyBiometricRequest.getModel(), verifyBiometricRequest.getSdk(), verifyBiometricRequest.getManufacture(), verifyBiometricRequest.getFile(), verifyBiometricRequest.getFile2(), verifyBiometricRequest.getFile3(), verifyBiometricRequest.getNik(), verifyBiometricRequest.getEmail(), verifyBiometricRequest.getHandphone(), verifyBiometricRequest.getTransactionIdSdk(), verifyBiometricRequest.getScoreLiveness(), verifyBiometricRequest.getScoreManipulation()));
        final Function1 function1 = new Function1() { // from class: setLauncher
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault2((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: rememberLauncherForActivityResultlambda400
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.INotificationSideChannelStub(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyActivationBiometric, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<OcrKtpResponse> b(OcrKtpRequest ocrKtpRequest) {
        Intrinsics.checkNotNullParameter(ocrKtpRequest, "");
        deriveCodec<OcrKtpResponse> derivecodecOcrKtp = this.TuitionPaymentFragmentbindingInflater1.ocrKtp(ocrKtpRequest);
        final Function1 function1 = new Function1() { // from class: ActivityComposeUtilsKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentspecialinlinedviewModeldefault2((OcrKtpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ViewTreeOnBackPressedDispatcherOwner
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.MediaBrowserCompat(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecOcrKtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.BackHandlerKtExternalSyntheticLambda1
    public final deriveCodec<OcrKtpResponse> b(String str, OcrKtpRequest ocrKtpRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ocrKtpRequest, "");
        deriveCodec<OcrKtpResponse> derivecodecOcrKtp = this.TuitionPaymentFragmentbindingInflater1.ocrKtp(str, ocrKtpRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdauh0XynCQ53WgWF1AJSb8Svr1cqM
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dark.TuitionPaymentFragmentbindingInflater1((OcrKtpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerlambda30
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dark.INotificationSideChannelDefault(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecOcrKtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ BaseModel b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ BaseModel b(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ VerifyBiometricResponse b(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ MembershipCheckItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MembershipCheckItem) function1.invoke(obj);
    }

    public static /* synthetic */ OcrKtpResponse TuitionPaymentFragmentbindingInflater1(OcrKtpResponse ocrKtpResponse) {
        Intrinsics.checkNotNullParameter(ocrKtpResponse, "");
        return ocrKtpResponse;
    }

    public static /* synthetic */ MembershipCheckItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(MembershipCheckItem membershipCheckItem) {
        Intrinsics.checkNotNullParameter(membershipCheckItem, "");
        return membershipCheckItem;
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ Verification b(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ VerifyBiometricResponse a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    public static /* synthetic */ VerifyBiometricResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse);
    }

    public static /* synthetic */ VerifyBiometricResponse asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ VerifyBiometricResponse asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    public static /* synthetic */ Verification d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ ActivationItem g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ActivationItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel cancel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ Verification INotificationSideChannel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ KeyResponse cancelAll(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (KeyResponse) function1.invoke(obj);
    }

    public static /* synthetic */ VerifyBiometricResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse);
    }

    public static /* synthetic */ MembershipCheckNew notify(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MembershipCheckNew) function1.invoke(obj);
    }

    public static /* synthetic */ Verification getInterfaceDescriptor(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ VerifyBiometricResponse TuitionPaymentFragmentbindingInflater1(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse);
    }

    public static /* synthetic */ OcrKtpResponse INotificationSideChannelDefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OcrKtpResponse) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentbindingInflater1(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ OcrKtpResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(OcrKtpResponse ocrKtpResponse) {
        Intrinsics.checkNotNullParameter(ocrKtpResponse, "");
        return ocrKtpResponse;
    }

    public static /* synthetic */ VerifyBiometricResponse RemoteActionCompatParcelizer(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    public static /* synthetic */ VerifyBiometricResponse INotificationSideChannelStub(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    public static /* synthetic */ ActivationItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(dark darkVar, ActivationItem activationItem) {
        Intrinsics.checkNotNullParameter(activationItem, "");
        String checkSum = activationItem.getCheckSum();
        String signature = activationItem.getSignature();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String resetAccCheckSum = activationItem.getResetAccCheckSum();
        return new ActivationItem(checkSum, signature, activationItem.getEligibleResetAcc(), activationItem.getEligibleRegistration(), companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(resetAccCheckSum != null ? resetAccCheckSum : "", darkVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    public static /* synthetic */ ActivationItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(dark darkVar, ActivationItem activationItem) {
        Intrinsics.checkNotNullParameter(activationItem, "");
        String checkSum = activationItem.getCheckSum();
        String signature = activationItem.getSignature();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String resetAccCheckSum = activationItem.getResetAccCheckSum();
        return new ActivationItem(checkSum, signature, activationItem.getEligibleResetAcc(), activationItem.getEligibleRegistration(), companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(resetAccCheckSum != null ? resetAccCheckSum : "", darkVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    public static /* synthetic */ MembershipCheckNew TuitionPaymentFragmentspecialinlinedviewModeldefault2(MembershipCheckItem membershipCheckItem) {
        Intrinsics.checkNotNullParameter(membershipCheckItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(membershipCheckItem);
    }

    public static /* synthetic */ Verification INotificationSideChannelStubProxy(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ Verification asInterface(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Verification write(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ VerifyBiometricResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse);
    }

    public static /* synthetic */ Verification g(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ ActivationItem read(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ActivationItem) function1.invoke(obj);
    }

    public static /* synthetic */ Verification asBinder(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Verification connect(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ KeyResponse b(KeyResponse keyResponse) {
        Intrinsics.checkNotNullParameter(keyResponse, "");
        return ReportDrawnKtExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(keyResponse);
    }

    public static /* synthetic */ OcrKtpResponse MediaBrowserCompat(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OcrKtpResponse) function1.invoke(obj);
    }
}
