package com.midtrans.sdk.uikit.activities;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.core.UIKitCustomSetting;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.uikit.fragments.UserAddressFragment;
import com.midtrans.sdk.uikit.fragments.UserDetailFragment;
import defpackage.DualSurfaceProcessorNodeExternalSyntheticLambda0;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getSessionToken;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.setMediaTypeactivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class UserDetailsActivity extends BaseActivity {
    private static short[] d;
    private static final byte[] $$s = {56, 94, 119, -19};
    private static final int $$t = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {104, 27, -72, 120, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -62, 3, 7, -16, 17, -17, 9, 4, -14, 69, -66, 4, 11, -2, -2, -14, 69, -36, 46, -69, 5, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67};
    private static final int $$n = 171;
    private static final byte[] $$g = {43, 23, 22, -14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$h = 255;
    private static int asBinder = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1446782725;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795576;
    private static int TuitionPaymentFragmentbindingInflater1 = -1378965754;
    private static byte[] asInterface = {14, 10, 62, 1, -21, 92, 10, 51, 3, 56, -20, -17, 121, 14, -61, 72, 57, 56, 7, 20, 60, 23, 7, -125, -105, -124, -109, -98, -113, 102, -67, -118, -71, -106, -102, -124, -110, 10, -28, 29, 20, -17, -11, 60, -30, -20, 20, -22, 18, -10, -57, -12, 91, 25, -24, -44, 47, 28, 31, 26, -21, 19, -22, 2, 34, 45, 92, 62, 37, 89, 36, 39, 35, 18, 116, 45, 40, 94, 35, 36, 49, 4, -78, -37, -85, -96, -108, -105, -11, -93, -65, -89, 108, -1, -47, -121, -91, 4, -86, -90, -111, -64, -90, -69, -126, -4, -74, -80, -90, -73, -78, -86, -96, -12, -52, 32, 24, 28, -50, 16, 31, 55, -52, 18, 24, 43, -59, -28, 47, -64, 26, 46, 31, -50, 24, 31, 47, 25, -59, -25, 28, 20, -25, 45, -60, 28, 25, 44, -51, 26, 47, -61, 42, 27, -61, 28, 26, 44, -49, 25, 18, 26, 40, 16, 28, -52, 47, 28, -63, 27, 44, 24, 29, 28, 19, 29, -53, -12, -121, -47, -26, -72, -43, 27, -46, -124, -42, -42, -27, -68, -41, -31, -67, -47, -41, -42, -56, -44, -25, -44, -126, -41, -28, -53, -124, -46, -53, -30, -68, -44, -42, -41, -47, -51, -18, -71, -27, -69, -25, -122, -43, -43, -56, -46, -44, -55, 25, -125, 24, -46, -123, 29, -44, -71, -32, -72, -48, -51, -27, -46, -55};

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements View.OnClickListener {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                UserDetailsActivity.this.onBackPressed();
            } finally {
                ViewPortBuilder.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void k(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r0 = com.midtrans.sdk.uikit.activities.UserDetailsActivity.$$g
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2a
        L13:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L17:
            byte r4 = (byte) r8
            int r9 = r9 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.UserDetailsActivity.k(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.activities.UserDetailsActivity.$$m
            int r8 = r8 * 13
            int r8 = 53 - r8
            int r6 = r6 * 39
            int r6 = 43 - r6
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.UserDetailsActivity.m(byte, int, byte, java.lang.Object[]):void");
    }

    private void a() {
        int i = 2 % 2;
        int i2 = g + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            setContentView(R.layout.activity_user_details);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(toolbar);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw null;
        }
        setContentView(R.layout.activity_user_details);
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(toolbar2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i3 = g + 15;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private void b() throws Throwable {
        int i = 2 % 2;
        try {
            MidtransSDK midtransSDK = MidtransSDK.getInstance();
            if (midtransSDK == null) {
                String string = getString(R.string.error_sdk_not_initialized);
                Logger.e("UserDetailsActivity", string);
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, string);
                finish();
                return;
            }
            UIKitCustomSetting uIKitCustomSetting = midtransSDK.getUIKitCustomSetting();
            if (uIKitCustomSetting != null && uIKitCustomSetting.isSkipCustomerDetailsPages()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            CustomerDetails customerDetails = MidtransSDK.getInstance().getTransactionRequest().getCustomerDetails();
            if (customerDetails == null) {
                a();
                UserDetailFragment userDetailFragmentNewInstance = UserDetailFragment.newInstance();
                if (userDetailFragmentNewInstance != null) {
                    FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionBeginTransaction.replace(R.id.user_detail_container, userDetailFragmentNewInstance);
                    fragmentTransactionBeginTransaction.commit();
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(customerDetails.getFirstName())) {
                if (customerDetails.getShippingAddress() != null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
                a();
                UserAddressFragment userAddressFragmentNewInstance = UserAddressFragment.newInstance();
                if (userAddressFragmentNewInstance != null) {
                    int i2 = g + 57;
                    asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    FragmentTransaction fragmentTransactionBeginTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionBeginTransaction2.replace(R.id.user_detail_container, userAddressFragmentNewInstance);
                    fragmentTransactionBeginTransaction2.commit();
                    return;
                }
                return;
            }
            a();
            UserDetailFragment userDetailFragmentNewInstance2 = UserDetailFragment.newInstance();
            if (userDetailFragmentNewInstance2 != null) {
                int i4 = asBinder + 119;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    FragmentTransaction fragmentTransactionBeginTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionBeginTransaction3.replace(R.id.user_detail_container, userDetailFragmentNewInstance2);
                    fragmentTransactionBeginTransaction3.commit();
                } else {
                    FragmentTransaction fragmentTransactionBeginTransaction4 = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionBeginTransaction4.replace(R.id.user_detail_container, userDetailFragmentNewInstance2);
                    fragmentTransactionBeginTransaction4.commit();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("invalid customerDetails info:");
            sb.append(e2.getMessage());
            String string2 = sb.toString();
            Logger.e("UserDetailsActivity", string2);
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, string2);
            finish();
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {33, -59, 107, -108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 85;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int b = 1;
        private static long TuitionPaymentFragmentbindingInflater1 = -3772967857987407913L;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        private static void a(short s, short s2, int i, Object[] objArr) {
            int i2 = s + 4;
            int i3 = i * 15;
            int i4 = 84 - (s2 * 2);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[53 - i3];
            int i5 = 52 - i3;
            int i6 = -1;
            if (bArr == null) {
                i4 = (i4 + (-i5)) - 11;
                i2++;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i4;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i4 = (i4 + (-bArr[i2])) - 11;
                    i2++;
                }
            }
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $11 + 21;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (Process.myPid() >> 22)), Color.blue(0) + 2624, 13 - TextUtils.getCapsMode("", 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 39422), 480 - Process.getGidForName(""), 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $10 + 75;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 39422), 482 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
            Object[] objArr;
            int i2 = 2 % 2;
            if (!UserDetailsActivity.this.isFinishing()) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                b = i3 % 128;
                int i4 = i3 % 2;
                dialogInterface.dismiss();
                int i5 = b + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 4;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                int iResolveSize = View.resolveSize(0, 0) + 23;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b2, bArr[5], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, i7, iResolveSize, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{1709, 38049, 8878, 45239, 20143, 56490, 27322, 63735, 38587, 9380, 45820, 16574, 56977, 27800, 64146, 34948, 9873, 46268, 17046, 53402, 28307, 64664}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37378, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{1705, 16147, 30155, 43941, 57459, 9942, 23706, 38267, 52017, 486, 18014, 31753, 45761, 59574, 8547}, (ViewConfiguration.getEdgeSlop() >> 16) + 14771, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int i8 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b3 = $$a[7];
                Object[] objArr5 = new Object[1];
                a((byte) 37, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i8, longPressTimeout, 1596667560, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                    int i9 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b4 = (byte) ($$b + 4);
                    byte b5 = $$a[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, b5, b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, threadPriority, i9, 1599039318, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i ^ (i << 5)}, (String[]) objArr7[4]};
                int i10 = (-693617377) + (((~(i | (-300832407))) | 513434832) * 191) + (((~((~i) | (-300832407))) | 277496976) * 191) + 1481330579;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
            } else {
                try {
                    Object[] objArr8 = {1549444659};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.rgb(0, 0, 0) + 16819265), (ViewConfiguration.getEdgeSlop() >> 16) + 1726, ((byte) KeyEvent.getModifierMetaStateMask()) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(i, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 1481330579);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                        int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                        byte b6 = (byte) ($$b + 4);
                        byte b7 = $$a[7];
                        Object[] objArr9 = new Object[1];
                        a(b6, b7, b7, objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, keyRepeatTimeout, iRgb, 1599039318, false, (String) objArr9[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                    try {
                        Object[] objArr10 = new Object[1];
                        c(new char[]{1709, 38049, 8878, 45239, 20143, 56490, 27322, 63735, 38587, 9380, 45820, 16574, 56977, 27800, 64146, 34948, 9873, 46268, 17046, 53402, 28307, 64664}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37380, objArr10);
                        Class<?> cls2 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(new char[]{1705, 16147, 30155, 43941, 57459, 9942, 23706, 38267, 52017, 486, 18014, 31753, 45761, 59574, 8547}, TextUtils.lastIndexOf("", '0', 0, 0) + 14772, objArr11);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
                            int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            byte b8 = $$a[7];
                            Object[] objArr12 = new Object[1];
                            a((byte) 37, b8, b8, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, iIndexOf, maximumDrawingCacheSize, 1596667560, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                            int i13 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                            byte[] bArr2 = $$a;
                            byte b9 = bArr2[7];
                            Object[] objArr13 = new Object[1];
                            a(b9, b9, bArr2[5], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType, i13, iLastIndexOf, 986134021, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        objArr = objArrB$5f1425da;
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
            int i14 = ((int[]) objArr[1])[0];
            int i15 = ((int[]) objArr[0])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            b = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((int[]) objArr[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i19 = ~iElapsedRealtime;
            int i20 = i18 + 1345237229 + (((~(757018770 | i19)) | (-969621197) | (~((-757018771) | iElapsedRealtime))) * (-564)) + ((~(iElapsedRealtime | (-688599169))) * 1128) + (((~((-969621197) | i19)) | 68419602) * 564);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            b = i23 % 128;
            if (i23 % 2 == 0) {
                UserDetailsActivity.this.finish();
                throw null;
            }
            UserDetailsActivity.this.finish();
        }
    }

    private static void l(int i, int i2, short s, int i3, byte b, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i7 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSize(0, 0), 2267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, 1387473586, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr2 = asInterface;
                long j2 = 0;
                if (bArr2 != null) {
                    int i8 = $10 + 81;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3358;
                            int i10 = 18 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1));
                            byte length2 = (byte) $$s.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, edgeSlop, i10, -1054011043, false, $$u((byte) i7, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i9++;
                        i7 = -1;
                        j2 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i11 = $11 + 67;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        byte[] bArr3 = asInterface;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2267 - (ViewConfiguration.getEdgeSlop() >> 16), 33 - View.resolveSizeAndState(0, 0, 0), 1387473586, false, $$u(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) / ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) * 3046761265686732006L));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr4 = asInterface;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2268 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.green(0) + 33, 1387473586, false, $$u(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i5;
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) d[i + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ j));
                if (z) {
                    int i13 = $10 + 5;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (-b8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55904), 2855 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, -1529949196, false, $$u(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = asInterface;
                if (bArr5 != null) {
                    int length3 = bArr5.length;
                    byte[] bArr6 = new byte[length3];
                    for (int i15 = 0; i15 < length3; i15++) {
                        bArr6[i15] = (byte) (((long) bArr5[i15]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr7 = asInterface;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i16]) ^ 3046761265686732006L)) + s)) ^ b));
                        int i17 = $11 + 81;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        short[] sArr = d;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            super.finish();
        } else {
            DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            super.finish();
            int i3 = 63 / 0;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (37567 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 14;
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            k(bArr[7], bArr[5], bArr[132], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, pressedStateDuration, touchSlop, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 627999871, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_dompetku).substring(0, 16).codePointAt(15) - 560200692, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 17), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 58, (byte) (Process.myPid() >> 22), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 627999787, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 560200669, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 215), View.getDefaultSize(0, 0) - 47, (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37567);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 625;
            int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte b = (byte) ($$h & 52);
            byte[] bArr2 = $$g;
            Object[] objArr6 = new Object[1];
            k(b, bArr2[5], bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, iNormalizeMetaState, iLastIndexOf, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 37567);
                int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                int iArgb = Color.argb(0, 0, 0, 0) + 14;
                byte b2 = (byte) ($$h & 52);
                Object[] objArr7 = new Object[1];
                k(b2, (short) (b2 - 1), $$g[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, deadChar, iArgb, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr8[2])[0];
            int i3 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i2};
            int[] iArr2 = {i3};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).length() + 2073987941;
            int i4 = ~((-183878486) | length);
            int i5 = ~length;
            int i6 = ((((-123228904) + ((i4 | (~(1639859635 | i5))) * (-1808))) + (((~((-11813138) | length)) | (~(i5 | 1811924983))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(length | (-1639859636))) | 172065348) | (~(183878485 | i5))) * TypedValues.Custom.TYPE_BOOLEAN)) - 1167290732;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{iArr2, new int[1], iArr, strArr};
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama5).substring(12, 13).codePointAt(0) - 627999844, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 560200576, (short) (-Process.getGidForName("")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_empty).substring(7, 8).codePointAt(0) - 157, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 627999746, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 560200609, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_ecash).substring(0, 32).length() + 27), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 48, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_5).substring(17, 19).length() - 2), objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i9 = asBinder + 123;
                g = i9 % 128;
                int i10 = i9 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 627999728, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_encryption_error_empty).substring(0, 37).codePointAt(17) - 560200682, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).length() - 78), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 83, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_invalid_progress_configuration).substring(0, 134).codePointAt(15) - 97), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            l((-627999676) - View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 560200603, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step2).substring(76, 78).length() - 77), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).codePointAt(1) - 93, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106), objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_smile).substring(4, 5).codePointAt(0) - 627999761, (-560200622) - (ViewConfiguration.getTouchSlop() >> 8), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).codePointAt(3) - 91), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 83, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            l((-627999597) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 560200573, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).length() - 51), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 83, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr14);
            String[] strArr2 = {str, (String) objArr14[0]};
            int i11 = g + 3;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr15 = {baseContext, strArr2, Integer.valueOf(iIntValue), 17, -1167290732};
                byte[] bArr3 = $$m;
                byte b3 = bArr3[48];
                Object[] objArr16 = new Object[1];
                m(b3, bArr3[9], b3, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b4 = bArr3[9];
                Object[] objArr17 = new Object[1];
                m(b4, bArr3[48], b4, objArr17);
                objArr = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (baseContext != null) {
                    int i15 = g + 33;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (37568 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i17 = 625 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iAlpha = Color.alpha(0) + 14;
                        byte b5 = (byte) ($$h & 52);
                        Object[] objArr18 = new Object[1];
                        k(b5, (short) (b5 - 1), $$g[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i17, iAlpha, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr19 = new Object[1];
                        l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 627999809, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 560200611, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step6).substring(38, 43).length() + 23), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_hat_text).substring(0, 4).codePointAt(1) - 158, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        l(ExpandableListView.getPackedPositionChild(0L) - 627999750, Color.argb(0, 0, 0, 0) - 560200571, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 145), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 47, (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37567);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 625;
                            int windowTouchSlop = 14 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b6 = (byte) ($$h & 52);
                            byte[] bArr4 = $$g;
                            Object[] objArr21 = new Object[1];
                            k(b6, bArr4[5], bArr4[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, jumpTapTimeout, windowTouchSlop, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int capsMode = 625 - TextUtils.getCapsMode("", 0, 0);
                            int defaultSize = View.getDefaultSize(0, 0) + 14;
                            byte[] bArr5 = $$g;
                            Object[] objArr22 = new Object[1];
                            k(bArr5[7], bArr5[5], bArr5[132], objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, capsMode, defaultSize, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = g + 99;
            asBinder = i20 % 128;
            int i21 = i20 % 2;
            int i22 = ((int[]) objArr[1])[0];
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr3 = {i23};
            int[] iArr4 = {i24};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i25 = ~((-1402707757) | startElapsedRealtime);
            int i26 = ~startElapsedRealtime;
            int i27 = i25 | (~(421030364 | i26));
            int i28 = ~(1402707756 | i26);
            int i29 = i22 + 1563131464 + ((i27 | i28) * (-516)) + (((~(startElapsedRealtime | (-286787853))) | (~((-134242513) | i26))) * 516) + ((134242512 | i28) * 516);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[1])[0] = i31 ^ (i31 << 5);
            objArr2 = new Object[]{iArr4, new int[1], iArr3, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i32 = g + 101;
                asBinder = i32 % 128;
                int i33 = i32 % 2;
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i34 = ((int[]) objArr[1])[0];
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr5 = {i35};
            int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i38 = ~i37;
            int i39 = i34 + 378411976 + (((~((-1538114340) | i38)) | 285491489) * 168) + ((~((-285491490) | i37)) * 168) + (((~(i37 | (-1252622851))) | (~(i38 | (-285623782))) | 132292) * 168);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr2[1])[0] = i41 ^ (i41 << 5);
            objArr2 = new Object[]{new int[]{i36}, new int[1], iArr5, strArr5};
        }
        Intent intent = new Intent(this, (Class<?>) PaymentMethodsActivity.class);
        Intent intent2 = getIntent();
        int i42 = ((int[]) objArr2[1])[0];
        int i43 = i42 * i42;
        int i44 = -(555894278 * i42);
        int i45 = (i43 & i44) + (i43 | i44);
        int i46 = -(i42 * 194638464);
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        int i48 = ((i47 | 1213381001) << 1) - (1213381001 ^ i47);
        int i49 = i48 >> 17;
        int i50 = ((((-65535) | i49) << 1) - (i49 ^ (-65535))) / 32768;
        int i51 = (i50 & 1) + (i50 | 1);
        int i52 = ((i48 | i51) << 1) - (i51 ^ i48);
        int i53 = ((i48 >> 21) - 4095) / 2048;
        int i54 = -(i52 ^ (((i53 | 1) << 1) - (i53 ^ 1)));
        int i55 = ((i54 | 5) << 1) - (i54 ^ 5);
        if (intent2.getBooleanExtra("4|7|cconly".substring(11640 / (((-((((i55 >> 23) - 1023) / 512) + 2)) & i55) * 582)), false)) {
            intent.putExtra("cconly", true);
        } else if (getIntent().getBooleanExtra("btonly", false)) {
            intent.putExtra("btonly", true);
            if (getIntent().getBooleanExtra("bt_permata", false)) {
                intent.putExtra("bt_permata", true);
            } else if (getIntent().getBooleanExtra("bt_mandiri", false)) {
                intent.putExtra("bt_mandiri", true);
            } else if (getIntent().getBooleanExtra("bt_bca", false)) {
                intent.putExtra("bt_bca", true);
            } else if (getIntent().getBooleanExtra("bt_other", false)) {
                intent.putExtra("bt_other", true);
            } else if (getIntent().getBooleanExtra("bt_bni", false)) {
                int i56 = g + 109;
                asBinder = i56 % 128;
                int i57 = i56 % 2;
                intent.putExtra("bt_bni", true);
            } else if (getIntent().getBooleanExtra("bt_bri", false)) {
                intent.putExtra("bt_bri", true);
            }
        } else if (getIntent().getBooleanExtra(PaymentType.GOPAY, false)) {
            int i58 = asBinder + 69;
            g = i58 % 128;
            if (i58 % 2 == 0) {
                intent.putExtra(PaymentType.GOPAY, true);
            } else {
                intent.putExtra(PaymentType.GOPAY, true);
            }
        } else if (getIntent().getBooleanExtra(PaymentType.SHOPEEPAY, false)) {
            intent.putExtra(PaymentType.SHOPEEPAY, true);
        } else if (getIntent().getBooleanExtra("bcaklikpay", false)) {
            int i59 = g + 21;
            asBinder = i59 % 128;
            if (i59 % 2 != 0) {
                intent.putExtra("bcaklikpay", false);
            } else {
                intent.putExtra("bcaklikpay", true);
            }
        } else if (getIntent().getBooleanExtra("klikbca", false)) {
            intent.putExtra("klikbca", true);
        } else if (getIntent().getBooleanExtra("mandiriclickpay", false)) {
            intent.putExtra("mandiriclickpay", true);
        } else if (getIntent().getBooleanExtra("mandiriecash", false)) {
            intent.putExtra("mandiriecash", true);
        } else if (getIntent().getBooleanExtra("cimbclicks", false)) {
            intent.putExtra("cimbclicks", true);
        } else if (getIntent().getBooleanExtra("briepay", false)) {
            intent.putExtra("briepay", true);
        } else if (getIntent().getBooleanExtra("tcash", false)) {
            intent.putExtra("tcash", true);
        } else if (getIntent().getBooleanExtra("indosatdompetku", false)) {
            intent.putExtra("indosatdompetku", true);
        } else if (getIntent().getBooleanExtra("xltunai", false)) {
            intent.putExtra("xltunai", true);
        } else if (getIntent().getBooleanExtra(PaymentType.INDOMARET, false)) {
            intent.putExtra(PaymentType.INDOMARET, true);
        } else if (getIntent().getBooleanExtra(PaymentType.KIOSON, false)) {
            intent.putExtra(PaymentType.KIOSON, true);
        } else if (getIntent().getBooleanExtra(PaymentType.GCI, false)) {
            intent.putExtra(PaymentType.GCI, true);
        } else if (getIntent().getBooleanExtra(PaymentType.DANAMON_ONLINE, false)) {
            int i60 = g + 13;
            asBinder = i60 % 128;
            int i61 = i60 % 2;
            intent.putExtra(PaymentType.DANAMON_ONLINE, true);
        } else if (getIntent().getBooleanExtra(PaymentType.AKULAKU, false)) {
            intent.putExtra(PaymentType.AKULAKU, true);
        } else if (getIntent().getBooleanExtra(PaymentType.ALFAMART, false)) {
            intent.putExtra(PaymentType.ALFAMART, true);
        } else if (getIntent().getBooleanExtra("uob", false)) {
            intent.putExtra("uob", true);
            if (getIntent().getBooleanExtra(PaymentType.UOB_WEB, false)) {
                intent.putExtra(PaymentType.UOB_WEB, true);
            } else if (getIntent().getBooleanExtra(PaymentType.UOB_APP, false)) {
                intent.putExtra(PaymentType.UOB_APP, true);
                int i62 = asBinder + 61;
                g = i62 % 128;
                int i63 = i62 % 2;
            }
        }
        intent.putExtra("snap.token", getIntent().getStringExtra("snap.token"));
        startActivity(intent);
        if (MidtransSDK.getInstance().getUIKitCustomSetting() != null && MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        }
        finish();
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = g + 1;
        asBinder = i2 % 128;
        String string = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = (~(1135789836 | iMaxMemory)) | 268970033;
            int i5 = ~((~iMaxMemory) | (-1098957577));
            if (i3 != 1031876382 + ((i4 | i5) * (-470)) + (((~(iMaxMemory | 1404759869)) | i5) * 470)) {
                throw null;
            }
        } else {
            int i6 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-1911316136) + (((~((-778603529) | iIdentityHashCode)) | 1608591071) * (-318));
            int i8 = ~(1608591071 | iIdentityHashCode);
            int i9 = ~iIdentityHashCode;
            if (i6 != i7 + ((i8 | (~(i9 | (-1367417560)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | (-1367417560))) | (~(2146021087 | i9))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
                throw null;
            }
        }
        int i10 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i10 != 1698834276 + (((~(1970738712 | iIdentityHashCode2)) | 10564) * (-140)) + ((~(1970749276 | iIdentityHashCode2)) * 70) + (((~(iIdentityHashCode2 | 608317252)) | 1362442588) * 70)) {
            throw null;
        }
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1 = getString(R.string.ISSUE_TRACKER_API_KEY);
        DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = applicationContext;
        try {
            if (setMediaTypeactivity.b(new ArrayList()) != 0) {
                throw new NullPointerException();
            }
            str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            if (str != null) {
                int i11 = asBinder + 109;
                g = i11 % 128;
                int i12 = i11 % 2;
                DualSurfaceProcessorNodeExternalSyntheticLambda0.b = str;
                int i13 = asBinder + 61;
                g = i13 % 128;
                int i14 = i13 % 2;
            } else {
                DualSurfaceProcessorNodeExternalSyntheticLambda0.b = "Not provided";
            }
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1)) {
                Thread.setDefaultUncaughtExceptionHandler(new DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(defaultUncaughtExceptionHandler));
            }
            DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getSessionToken(this);
            MidtransSDK midtransSDK = MidtransSDK.getInstance();
            if (midtransSDK != null) {
                int i15 = asBinder + 75;
                g = i15 % 128;
                if (i15 % 2 == 0) {
                    TextUtils.isEmpty(midtransSDK.getClientKey());
                    string.hashCode();
                    throw null;
                }
                if (TextUtils.isEmpty(midtransSDK.getClientKey()) || midtransSDK.getContext() == null) {
                    string = getString(R.string.message_sdk_invalid);
                } else if (!midtransSDK.isEnableBuiltInTokenStorage() && TextUtils.isEmpty(midtransSDK.getMerchantServerUrl())) {
                    string = getString(R.string.message_invalid_merchant_url);
                }
            }
            if (!(!TextUtils.isEmpty(string))) {
                b();
                return;
            }
            if (!isFinishing()) {
                try {
                    new AlertDialog.Builder(this, R.style.AlertDialogCustom).setPositiveButton(R.string.btn_close, new TuitionPaymentFragmentspecialinlinedviewModeldefault3()).setCancelable(false).setMessage(string).create().show();
                    return;
                } catch (Exception unused) {
                }
            }
            finish();
        } catch (PackageManager.NameNotFoundException unused2) {
            str = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #2 {Exception -> 0x0065, blocks: (B:3:0x000a, B:7:0x001b, B:9:0x0021, B:16:0x002e, B:20:0x0043, B:22:0x0052, B:26:0x0057, B:14:0x0028), top: B:37:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[Catch: Exception -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0065, blocks: (B:3:0x000a, B:7:0x001b, B:9:0x0021, B:16:0x002e, B:20:0x0043, B:22:0x0052, B:26:0x0057, B:14:0x0028), top: B:37:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057 A[Catch: Exception -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0065, blocks: (B:3:0x000a, B:7:0x001b, B:9:0x0021, B:16:0x002e, B:20:0x0043, B:22:0x0052, B:26:0x0057, B:14:0x0028), top: B:37:0x000a }] */
    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Toolbar toolbar) {
        int i;
        int i2 = 2 % 2;
        Drawable drawable = ContextCompat.getDrawable(this, 2131231099);
        try {
            MidtransSDK midtransSDK = MidtransSDK.getInstance();
            if (midtransSDK != null) {
                int i3 = g + 115;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 50 / 0;
                    if (midtransSDK.getColorTheme() != null) {
                        if (midtransSDK.getColorTheme().getPrimaryDarkColor() != 0) {
                            i = g + 3;
                            asBinder = i % 128;
                            if (i % 2 != 0) {
                                drawable.setColorFilter(midtransSDK.getColorTheme().getPrimaryDarkColor(), PorterDuff.Mode.SRC_ATOP);
                                int i5 = 29 / 0;
                            } else {
                                drawable.setColorFilter(midtransSDK.getColorTheme().getPrimaryDarkColor(), PorterDuff.Mode.SRC_ATOP);
                            }
                        }
                    }
                } else if (midtransSDK.getColorTheme() != null) {
                    if (midtransSDK.getColorTheme().getPrimaryDarkColor() != 0) {
                        i = g + 3;
                        asBinder = i % 128;
                        if (i % 2 != 0) {
                            drawable.setColorFilter(midtransSDK.getColorTheme().getPrimaryDarkColor(), PorterDuff.Mode.SRC_ATOP);
                            int i6 = 29 / 0;
                        } else {
                            drawable.setColorFilter(midtransSDK.getColorTheme().getPrimaryDarkColor(), PorterDuff.Mode.SRC_ATOP);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("render toolbar:");
            sb.append(e2.getMessage());
            Logger.d("UserDetailsActivity", sb.toString());
        }
        toolbar.setNavigationIcon(drawable);
        toolbar.setNavigationOnClickListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int i3 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
            byte b = (byte) ($$h & 37);
            Object[] objArr2 = new Object[1];
            k(b, (short) (b | 66), $$g[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i3, iCombineMeasuredStates, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                byte b2 = (byte) ($$h & 52);
                Object[] objArr3 = new Object[1];
                k(b2, (short) (b2 - 1), $$g[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iLastIndexOf, i4, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (-1880313061) + (((~(581001449 | i6)) | (~((-793603876) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | 804089835)) | (~(i6 | (-570515490)))) * 210) + 796694148;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 627999803, (ViewConfiguration.getFadingEdgeLength() >> 16) - 560200566, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 112), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_empty_tcash_token_field).substring(0, 6).length() - 53, (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto2).substring(8, 9).length() - 627999677, (-560200567) - View.resolveSize(0, 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 182), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 83, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_tunai_payment_instruction).substring(12, 13).length() - 1), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1588874301};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 42049), 1726 - TextUtils.indexOf("", "", 0, 0), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 796694148);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                    int mirror = AndroidCharacter.getMirror('0') + 1707;
                    int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b3 = (byte) ($$h & 52);
                    Object[] objArr8 = new Object[1];
                    k(b3, (short) (b3 - 1), $$g[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, mirror, iMakeMeasureSpec, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    l((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 627999773, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 560200575, (short) (28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-47) - KeyEvent.keyCodeFromString(""), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    l(ExpandableListView.getPackedPositionGroup(0L) - 627999751, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).length() - 560200572, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 155), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step1).substring(30, 32).length() - 49, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
                        int iAlpha = Color.alpha(0) + 1755;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                        int i10 = $$h;
                        Object[] objArr11 = new Object[1];
                        k((byte) (i10 & 52), (short) (i10 & 908), $$g[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iAlpha, modifierMetaStateMask, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int size = View.MeasureSpec.getSize(0) + 1755;
                        int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                        byte b4 = (byte) ($$h & 37);
                        Object[] objArr12 = new Object[1];
                        k(b4, (short) (b4 | 66), $$g[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, size, deadChar, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i12}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_atm_bersama).substring(1, 3).codePointAt(1) - 931237805;
        int i13 = 996256155 + (((~((-497013530) | iCodePointAt)) | 278118425 | (~((-284411104) | iCodePointAt))) * (-754));
        int i14 = ~((-278118426) | iCodePointAt);
        int i15 = ~iCodePointAt;
        int i16 = i11 + i13 + ((i14 | (~((-6292679) | i15))) * (-754)) + ((i15 | (-497013530)) * 754);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i19 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
            int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
            byte b5 = (byte) ($$h & 52);
            byte[] bArr = $$g;
            Object[] objArr14 = new Object[1];
            k(b5, bArr[5], bArr[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveOpacity, i19, iResolveSizeAndState, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        l((ViewConfiguration.getScrollDefaultDelay() >> 16) - 627999773, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_kioson).substring(19, 20).codePointAt(0) - 560200672, (short) (29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 162, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 627999787, (ViewConfiguration.getScrollBarSize() >> 8) - 560200571, (short) ((-109) - (ViewConfiguration.getScrollBarSize() >> 8)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 83, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_permata).substring(19, 20).codePointAt(0) - 101), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
            int i20 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b6 = (byte) ($$h & 52);
            Object[] objArr17 = new Object[1];
            k(b6, (short) (b6 - 1), $$g[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, keyRepeatDelay, i20, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i21 = asBinder + 51;
            g = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                int i23 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr2 = $$g;
                Object[] objArr18 = new Object[1];
                k(bArr2[7], bArr2[5], bArr2[132], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetAfter, iMakeMeasureSpec2, i23, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr19[3])[0];
            int i25 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i26 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i27 = ~i26;
            int i28 = (((1187598717 + ((i26 | 235430656) * 988)) + (((~(772302594 | i27)) | (-1064894363)) * (-1976))) + ((((~(i26 | 528022424)) | 235430656) | (~((-528022425) | i27))) * 988)) - 1380112246;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_text).substring(9, 10).length() - 627999693, (-560200566) - Color.blue(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_network_not_available).substring(0, 23).length() - 99), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 83, (byte) (ViewConfiguration.getTouchSlop() >> 8), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            l((-627999677) - MotionEvent.axisFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 560200603, (short) ((-75) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-47) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_unable_to_decrypt_message).substring(0, 26).codePointAt(2) - 97), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1588874301};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46037), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1134, 18 - ((Process.getThreadPriority(0) + 20) >> 6), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1380112246, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                int i31 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                byte b7 = (byte) ($$h & 52);
                byte[] bArr3 = $$g;
                Object[] objArr24 = new Object[1];
                k(b7, bArr3[5], bArr3[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, i31, absoluteGravity, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getTrimmedLength("") + 45993), View.combineMeasuredStates(0, 0) + 1117, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                int i32 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                byte[] bArr4 = $$g;
                Object[] objArr25 = new Object[1];
                k(bArr4[7], bArr4[5], bArr4[132], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAxisFromString, i32, tapTimeout, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                l((-627999773) - TextUtils.getCapsMode("", 0, 0), (-560200576) - TextUtils.lastIndexOf("", '0', 0), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 28), (-47) - Color.argb(0, 0, 0, 0), (byte) (ViewConfiguration.getTouchSlop() >> 8), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 627999762, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_name_on_card).substring(0, 3).length() - 560200574, (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 110), Process.getGidForName("") - 46, (byte) ExpandableListView.getPackedPositionType(0L), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                    int iGreen = 15 - Color.green(0);
                    byte b8 = (byte) ($$h & 52);
                    Object[] objArr28 = new Object[1];
                    k(b8, (short) (b8 - 1), $$g[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState, iMakeMeasureSpec3, iGreen, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                    int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b9 = (byte) ($$h & 52);
                    byte[] bArr5 = $$g;
                    Object[] objArr29 = new Object[1];
                    k(b9, bArr5[5], bArr5[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, edgeSlop2, touchSlop, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt();
            int i36 = ~iNextInt;
            int i37 = i33 + (-573056771) + ((iNextInt | 73681440) * 988) + (((~(83151522 | i36)) | 151658565) * (-1976)) + (((~(iNextInt | (-161128648))) | 73681440 | (~(161128647 | i36))) * 988);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr30[2])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i40 = asBinder + 43;
        g = i40 % 128;
        int i41 = i40 % 2;
        while (i2 < strArr4.length) {
            int i42 = asBinder + 109;
            g = i42 % 128;
            int i43 = i42 % 2;
            arrayList2.add(strArr4[i2]);
            i2++;
        }
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 631480923;
        int i5 = (~(1655894262 | length)) | 285738505;
        int i6 = ~((~length) | (-1115726049));
        if (i4 != 323123630 + ((i5 | i6) * (-470)) + (((~(length | 1941632767)) | i6) * 470)) {
            int i7 = 1788186136 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i8 != (-1128608756) + (((~(iIdentityHashCode | 11190320)) | 1727101651) * (-668)) + ((11190320 | (~(1727101651 | iIdentityHashCode))) * 1336) + ((iIdentityHashCode | 1727789811) * 668)) {
            int i9 = 138934208 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = asBinder + 103;
        g = i10 % 128;
        int i11 = i10 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1238509568
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.UserDetailsActivity.onStart():void");
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = g + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 111;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(int r6, short r7, int r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.midtrans.sdk.uikit.activities.UserDetailsActivity.$$s
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.UserDetailsActivity.$$u(int, short, int):java.lang.String");
    }
}
