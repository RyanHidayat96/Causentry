package com.midtrans.sdk.uikit.views.creditcard.saved;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.google.android.libraries.places.internal.zzbla;
import com.midtrans.sdk.corekit.callback.GetCardCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.MerchantData;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.StreamSharing;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.computeAreaOverlapping;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.getPreferredChildSizePair;
import defpackage.initSession;
import defpackage.onCameraAvailable;
import defpackage.onCaptureSessionEnd;
import defpackage.onConnectionFailed;
import defpackage.unsubscribe;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class SavedCreditCardActivity extends BasePaymentActivity implements getPreferredChildSizePair {
    private unsubscribe asInterface;
    private SemiBoldTextView cancelAll;
    public StreamSharing d;
    private FancyButton g;
    private RecyclerView notify;
    private static final byte[] $$m = {109, 48, -62, 38};
    private static final int $$n = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {74, 60, 122, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$k = 81;
    private static int INotificationSideChannel = 0;
    private static int getInterfaceDescriptor = 1;
    private static char[] onTransact = {60088, 60072, 60083, 60062, 60053, 60091, 60048, 60052, 60117, 60049, 60073, 60054, 60055, 60058, 60063, 60056, 60034, 60040, 60043, 60051, 60045, 60047, 60050, 60041, 60060};
    private static char cancel = 57188;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SavedCreditCardActivity savedCreditCardActivity, final SaveCardRequest saveCardRequest) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        if (savedCreditCardActivity.TuitionPaymentFragmentbindingInflater1) {
            new AlertDialog.Builder(savedCreditCardActivity).setMessage(R.string.card_delete_message).setPositiveButton(R.string.text_yes, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    dialogInterface.dismiss();
                    SavedCreditCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SavedCreditCardActivity.this);
                    Object[] objArr = {SavedCreditCardActivity.this};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    StreamSharing streamSharing = (StreamSharing) SavedCreditCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -307121700, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 307121701, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    streamSharing.TuitionPaymentFragmentspecialinlinedviewModeldefault3(saveCardRequest, (computeAreaOverlapping) streamSharing.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }).setNegativeButton(R.string.text_no, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.4
                private static final byte[] $$c = {21, -108, 100, 114};
                private static final int $$f = 43;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {0, -94, -62, -97, -10, 4, 65, -49, -13, 2, -1, 15, -4, -11, 22, -11, 70, -57, -3, -4, 17, -11, 6, 15, -9, 64, -17, -3, -29, 54, -71, 41, 17, -5, 41, -27, -3, -25, 50, -70, 40, 17, -5, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 69};
                private static final int $$e = 230;
                private static final byte[] $$a = {2, -84, 82, -15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
                private static final int $$b = 191;
                private static int d = 0;
                private static int g = 1;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 50158;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 18842;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4953;
                private static char b = 46010;

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
                    /*
                        int r8 = r8 + 4
                        int r7 = r7 * 14
                        int r7 = r7 + 84
                        byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.AnonymousClass4.$$a
                        int r9 = r9 * 52
                        int r9 = r9 + 1
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r3 = r8
                        r8 = r9
                        r4 = r2
                        goto L2d
                    L15:
                        r3 = r2
                    L16:
                        int r8 = r8 + 1
                        int r4 = r3 + 1
                        byte r5 = (byte) r7
                        r1[r3] = r5
                        if (r4 != r9) goto L27
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L27:
                        r3 = r0[r8]
                        r6 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r6
                    L2d:
                        int r7 = -r7
                        int r8 = r8 + r7
                        int r7 = r8 + (-11)
                        r8 = r3
                        r3 = r4
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.AnonymousClass4.a(int, int, int, java.lang.Object[]):void");
                }

                private static void e(short s, byte b2, byte b3, Object[] objArr) {
                    int i4 = b3 * 13;
                    int i5 = 99 - (s * 15);
                    byte[] bArr = $$d;
                    int i6 = 43 - (b2 * 39);
                    byte[] bArr2 = new byte[53 - i4];
                    int i7 = 52 - i4;
                    int i8 = -1;
                    if (bArr == null) {
                        i6++;
                        i5 = i6 + (-i7) + 2;
                    }
                    while (true) {
                        i8++;
                        bArr2[i8] = (byte) i5;
                        if (i8 == i7) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        } else {
                            i6++;
                            i5 = i5 + (-bArr[i6]) + 2;
                        }
                    }
                }

                private static void c(char[] cArr, int i4, Object[] objArr) throws Throwable {
                    int i5 = 2 % 2;
                    onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                    char[] cArr2 = new char[cArr.length - 2];
                    oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i6 = 0;
                        if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                            objArr[0] = new String(cArr2, 0, i4);
                            return;
                        }
                        int i7 = $11 + 109;
                        $10 = i7 % 128;
                        int i8 = 58224;
                        char c = 1;
                        if (i7 % 2 != 0) {
                            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        } else {
                            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        }
                        int i9 = 0;
                        while (i9 < 16) {
                            char c2 = cArr3[c];
                            char c3 = cArr3[i6];
                            int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                            int i11 = c3 >>> 5;
                            try {
                                Object[] objArr2 = new Object[4];
                                objArr2[3] = Integer.valueOf(b);
                                objArr2[2] = Integer.valueOf(i11);
                                objArr2[c] = Integer.valueOf(i10);
                                objArr2[i6] = Integer.valueOf(c2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char threadPriority = (char) (((Process.getThreadPriority(i6) + 20) >> 6) + 47773);
                                    int i12 = (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)) + 468;
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 13;
                                    Class[] clsArr = new Class[4];
                                    clsArr[i6] = Integer.TYPE;
                                    clsArr[c] = Integer.TYPE;
                                    clsArr[2] = Integer.TYPE;
                                    clsArr[3] = Integer.TYPE;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, i12, packedPositionType, -2007001706, false, "o", clsArr);
                                }
                                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                cArr3[c] = cCharValue;
                                Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.MeasureSpec.getMode(0)), 468 - Color.blue(0), MotionEvent.axisFromString("") + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i8 -= 40503;
                                i9++;
                                int i13 = $11 + 93;
                                $10 = i13 % 128;
                                int i14 = i13 % 2;
                                i6 = 0;
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
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2323, 44 - Color.green(0), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                    Object[] objArr;
                    int i5 = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cRgb = (char) ((-16739649) - Color.rgb(0, 0, 0));
                        int iRgb = (-16776591) - Color.rgb(0, 0, 0);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 14;
                        byte[] bArr = $$a;
                        byte b2 = bArr[5];
                        Object[] objArr2 = new Object[1];
                        a(b2, (byte) (-b2), bArr[7], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iRgb, windowTouchSlop, -477065106, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{23468, 38569, 6708, 30466, 40294, 63289, 58893, 16125, 2023, 11545, 43462, 44097, 511, 48321, 37487, 57772, 52163, 55821, 52818, 20040, 27729, 5019, 35221, 21254}, 21 - ImageFormat.getBitsPerPixel(0), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{17500, 2479, 31315, 45924, 64599, 36634, 29883, 55715, 11527, 5750, 65081, 57789, 61619, 20901, 4572, 12780, 26295, 10854}, View.resolveSize(0, 0) + 15, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37568);
                        int keyRepeatTimeout = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int doubleTapTimeout = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[7];
                        byte b4 = bArr2[5];
                        Object[] objArr5 = new Object[1];
                        a(b3, (byte) (-b4), b4, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, keyRepeatTimeout, doubleTapTimeout, -976899241, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i6 = g + 81;
                        d = i6 % 128;
                        int i7 = i6 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char packedPositionChild = (char) (37566 - ExpandableListView.getPackedPositionChild(0L));
                            int iLastIndexOf = 624 - TextUtils.lastIndexOf("", '0', 0);
                            int iMyTid = 14 - (Process.myTid() >> 22);
                            byte[] bArr3 = $$a;
                            byte b5 = bArr3[7];
                            Object[] objArr6 = new Object[1];
                            a(b5, (byte) (b5 | 51), bArr3[5], objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, iLastIndexOf, iMyTid, -973632554, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        int i8 = ((int[]) objArr7[2])[0];
                        int i9 = ((int[]) objArr7[0])[0];
                        String[] strArr = (String[]) objArr7[3];
                        int[] iArr = {i9};
                        int i10 = ~i4;
                        int i11 = (((193776488 + ((~(929824520 | i10)) * 52)) + (((~(927541768 | i10)) | ((~((-896196353) | i10)) | 2282752)) * (-52))) + (((~(i10 | (-927541769))) | 33628168) * 52)) - 777442848;
                        int i12 = (i11 << 13) ^ i11;
                        int i13 = i12 ^ (i12 >>> 17);
                        objArr = new Object[]{iArr, new int[]{i13 ^ (i13 << 5)}, new int[]{i8}, strArr};
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new char[]{21711, 53219, 60782, 56286, 35786, 50199, 59467, 6653, 31344, 14614, 9128, 38579, 18237, 30449, 903, 12736, 21477, 19054, 63572, 1872, 39917, 24987, 15994, 19017, 3531, 39853, 42478, 23981}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{55241, 58314, 51818, 41784, 54922, 55333, 33954, 20751, 38240, 27168, 41884, 44687, 4627, 43627, 36298, 65250, 34043, 57395, 63363, 18921}, 18 - KeyEvent.getDeadChar(0, 0), objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                                int i14 = g + 33;
                                d = i14 % 128;
                                int i15 = i14 % 2;
                                applicationContext = null;
                            } else {
                                applicationContext = applicationContext.getApplicationContext();
                            }
                        }
                        Object[] objArr10 = new Object[1];
                        c(new char[]{61809, 36814, 35131, 21079, 39297, 2729, 55090, 24803, 34537, 50934, 57879, 53096, 2211, 45309, 63378, 9514, 61177, 42971, 20250, 32519, 53608, 42034, 634, 27663, 39787, 47088, 16949, 53520, 44513, 47549, 55517, 13932, 25336, 60043, 20742, 36937, 61548, 45101, 3381, 46114, 59518, 46603, 61146, 36542, 37479, 63511, 52428, 27437, 39314, 37180, 10179, 52997, 30652, 32230, 46861, 22826, 58761, 626, 56896, 35211, 64173, 44123, 5072, 53879, 35543, 27859}, 64 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr10);
                        String str = (String) objArr10[0];
                        Object[] objArr11 = new Object[1];
                        c(new char[]{65152, 62786, 34259, 16707, 39023, 50635, 49452, 50160, 52927, 15111, 44333, 37629, 7934, 57604, 27362, 6497, 18371, 14275, 53795, 37252, 33940, 31073, 62423, 25794, 46525, 58459, 7761, 13914, 5264, 18618, 49507, 57443, 36363, 33688, 36238, 4289, 7832, 60229, 33584, 20409, 53377, 50799, 30295, 48633, 20339, 34766, 15439, 6497, 51959, 43573, 15225, 43800, 52030, 5722, 57113, 63858, 5051, 17886, 35260, 49971, 9710, 44279, 13328, 27788, 25906, 57763}, 64 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr11);
                        try {
                            Object[] objArr12 = {applicationContext, new String[]{str, (String) objArr11[0]}, Integer.valueOf(i4), 17, -777442848};
                            byte[] bArr4 = $$d;
                            byte b6 = bArr4[0];
                            byte b7 = bArr4[85];
                            Object[] objArr13 = new Object[1];
                            e(b6, b7, b7, objArr13);
                            Class<?> cls3 = Class.forName((String) objArr13[0]);
                            byte b8 = bArr4[85];
                            byte b9 = bArr4[0];
                            Object[] objArr14 = new Object[1];
                            e(b8, b9, b9, objArr14);
                            Object[] objArr15 = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            int i16 = ((int[]) objArr15[0])[0];
                            int i17 = ((int[]) objArr15[2])[0];
                            if (applicationContext != null) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cIndexOf2 = (char) (37567 - TextUtils.indexOf("", "", 0));
                                    int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                                    int i18 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14;
                                    byte[] bArr5 = $$a;
                                    byte b10 = bArr5[7];
                                    Object[] objArr16 = new Object[1];
                                    a(b10, (byte) (b10 | 51), bArr5[5], objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, deadChar, i18, -973632554, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                try {
                                    Object[] objArr17 = new Object[1];
                                    c(new char[]{23468, 38569, 6708, 30466, 40294, 63289, 58893, 16125, 2023, 11545, 43462, 44097, 511, 48321, 37487, 57772, 52163, 55821, 52818, 20040, 27729, 5019, 35221, 21254}, TextUtils.indexOf("", "", 0, 0) + 22, objArr17);
                                    Class<?> cls4 = Class.forName((String) objArr17[0]);
                                    Object[] objArr18 = new Object[1];
                                    c(new char[]{17500, 2479, 31315, 45924, 64599, 36634, 29883, 55715, 11527, 5750, 65081, 57789, 61619, 20901, 4572, 12780, 26295, 10854}, 15 - (Process.myTid() >> 22), objArr18);
                                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cIndexOf3 = (char) (37567 - TextUtils.indexOf("", "", 0));
                                        int mirror = AndroidCharacter.getMirror('0') + 577;
                                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 14;
                                        byte[] bArr6 = $$a;
                                        byte b11 = bArr6[7];
                                        byte b12 = bArr6[5];
                                        Object[] objArr19 = new Object[1];
                                        a(b11, (byte) (-b12), b12, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf3, mirror, scrollBarSize, -976899241, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 37567);
                                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 625;
                                        int i19 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                                        byte[] bArr7 = $$a;
                                        byte b13 = bArr7[5];
                                        Object[] objArr20 = new Object[1];
                                        a(b13, (byte) (-b13), bArr7[7], objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iCombineMeasuredStates, i19, -477065106, false, (String) objArr20[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr = objArr15;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i20 = ((int[]) objArr[0])[0];
                    int i21 = ((int[]) objArr[2])[0];
                    if (i21 == i20) {
                        int i22 = ((int[]) objArr[1])[0];
                        int i23 = ((int[]) objArr[2])[0];
                        int i24 = ((int[]) objArr[0])[0];
                        String[] strArr2 = (String[]) objArr[3];
                        int[] iArr2 = {i23};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i25 = i22 + 723513704 + ((~((~iIdentityHashCode) | 1790174974)) * (-116)) + ((169042670 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | (-1654695451))) | 33563146) * 116);
                        int i26 = (i25 << 13) ^ i25;
                        int i27 = i26 ^ (i26 >>> 17);
                        ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
                        Object[] objArr21 = {new int[]{i24}, new int[1], iArr2, strArr2};
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr[3];
                        if (strArr3 != null) {
                            for (String str2 : strArr3) {
                                int i28 = d + 65;
                                g = i28 % 128;
                                int i29 = i28 % 2;
                                arrayList.add(str2);
                            }
                        }
                        Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
                        int i30 = ((int[]) objArr[1])[0];
                        int i31 = ((int[]) objArr[2])[0];
                        int i32 = ((int[]) objArr[0])[0];
                        String[] strArr4 = (String[]) objArr[3];
                        int[] iArr3 = {i31};
                        int[] iArr4 = {i32};
                        int iIdentityHashCode2 = System.identityHashCode(this);
                        int i33 = (-476361272) + ((~(iIdentityHashCode2 | 81354280)) * 216);
                        int i34 = ~iIdentityHashCode2;
                        int i35 = i30 + i33 + (((-1661116609) | i34) * (-216)) + (((~(i34 | 81354280)) | 1742383840) * 216);
                        int i36 = (i35 << 13) ^ i35;
                        int i37 = i36 ^ (i36 >>> 17);
                        ((int[]) objArr[1])[0] = i37 ^ (i37 << 5);
                        Object[] objArr22 = {iArr4, new int[1], iArr3, strArr4};
                    }
                    dialogInterface.dismiss();
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(int r7, byte r8, int r9) {
                    /*
                        byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.AnonymousClass4.$$c
                        int r9 = r9 * 3
                        int r9 = r9 + 1
                        int r8 = r8 * 4
                        int r8 = 4 - r8
                        int r7 = r7 * 4
                        int r7 = 108 - r7
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L17
                        r3 = r8
                        r7 = r9
                        r4 = r2
                        goto L2a
                    L17:
                        r3 = r2
                    L18:
                        int r4 = r3 + 1
                        byte r5 = (byte) r7
                        r1[r3] = r5
                        if (r4 != r9) goto L25
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L25:
                        r3 = r0[r8]
                        r6 = r3
                        r3 = r8
                        r8 = r6
                    L2a:
                        int r8 = -r8
                        int r3 = r3 + 1
                        int r7 = r7 + r8
                        r8 = r3
                        r3 = r4
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.AnonymousClass4.$$g(int, byte, int):java.lang.String");
                }
            }).create().show();
            int i4 = INotificationSideChannel + 95;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(List<SaveCardRequest> list) {
        int i = 2 % 2;
        unsubscribe unsubscribeVar = this.asInterface;
        ArrayList arrayList = new ArrayList(list);
        unsubscribeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
        unsubscribeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.addAll(arrayList);
        unsubscribeVar.notifyDataSetChanged();
        int i2 = INotificationSideChannel + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i5) | i2);
        int i8 = ~i;
        int i9 = i7 | (~(i8 | i2));
        int i10 = ~i2;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i5);
        int i13 = (~(i8 | i5)) | i11 | i12;
        int i14 = (~(i | i10)) | i12;
        int i15 = i5 + i2 + i6 + (1039959776 * i4) + ((-2046201414) * i3);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i5) - 8388608) + ((-1785926397) * i2) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i6) + ((-201326592) * i4) + ((-406847488) * i3) + (529399808 * i16);
        int i18 = ((i5 * 868240256) - 1765242424) + (i2 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i6 * 868239597) + (i4 * 817356128) + (i3 * 406493490) + (i16 * 645267456);
        if (i17 + (i18 * i18 * 681705472) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        SavedCreditCardActivity savedCreditCardActivity = (SavedCreditCardActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = getInterfaceDescriptor;
        int i21 = i20 + 37;
        INotificationSideChannel = i21 % 128;
        int i22 = i21 % 2;
        StreamSharing streamSharing = savedCreditCardActivity.d;
        int i23 = i20 + 113;
        INotificationSideChannel = i23 % 128;
        int i24 = i23 % 2;
        return streamSharing;
    }

    public static /* synthetic */ unsubscribe TuitionPaymentFragmentspecialinlinedviewModeldefault1(SavedCreditCardActivity savedCreditCardActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        unsubscribe unsubscribeVar = savedCreditCardActivity.asInterface;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return unsubscribeVar;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        SavedCreditCardActivity savedCreditCardActivity = (SavedCreditCardActivity) objArr[0];
        SaveCardRequest saveCardRequest = (SaveCardRequest) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        savedCreditCardActivity.TuitionPaymentFragmentbindingInflater1(saveCardRequest);
        if (i3 != 0) {
            return null;
        }
        int i4 = 13 / 0;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SavedCreditCardActivity savedCreditCardActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        savedCreditCardActivity.asBinder();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.$$j
            int r8 = 53 - r8
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
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
            int r6 = r6 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.m(short, short, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            setTextColor(this.g);
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            throw null;
        }
        setTextColor(this.g);
        FancyButton fancyButton = this.g;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != 0) {
            int i5 = INotificationSideChannel + 55;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            fancyButton.setIconColorFilter(i4);
            int i7 = getInterfaceDescriptor + 19;
            INotificationSideChannel = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = getInterfaceDescriptor + 123;
        INotificationSideChannel = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.cancelAll = (SemiBoldTextView) findViewById(R.id.text_page_title);
            this.g = (FancyButton) findViewById(R.id.btn_add_card);
            this.notify = (RecyclerView) findViewById(R.id.container_saved_card);
        } else {
            this.cancelAll = (SemiBoldTextView) findViewById(R.id.text_page_title);
            this.g = (FancyButton) findViewById(R.id.btn_add_card);
            this.notify = (RecyclerView) findViewById(R.id.container_saved_card);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        SavedToken next;
        int i = 2 % 2;
        StreamSharing streamSharing = this.d;
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        CreditCard creditCard = MidtransSDK.getInstance().getCreditCard();
        List<SavedToken> savedTokens = creditCard.getSavedTokens();
        Iterator<SavedToken> it = savedTokens.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = getInterfaceDescriptor + 121;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                it.next().getMaskedCard().equals(str);
                throw null;
            }
            next = it.next();
        } while (!next.getMaskedCard().equals(str));
        if (next != null) {
            int i3 = getInterfaceDescriptor + 105;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            savedTokens.remove(savedTokens.indexOf(next));
            creditCard.setSavedTokens(savedTokens);
            midtransSDK.setCreditCard(creditCard);
        }
        List<SaveCardRequest> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(savedTokens);
        streamSharing.f213a.clear();
        streamSharing.f213a.addAll(listTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        List<SaveCardRequest> list = this.d.f213a;
        if (list == null || list.isEmpty()) {
            TuitionPaymentFragmentbindingInflater1((SaveCardRequest) null);
            return;
        }
        int i5 = INotificationSideChannel;
        int i6 = i5 + 65;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 13;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
        TuitionPaymentFragmentbindingInflater1(this.d.f213a);
    }

    private void TuitionPaymentFragmentbindingInflater1(SaveCardRequest saveCardRequest) {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) CreditCardDetailsActivity.class);
        intent.putExtra("extra.card.saved", saveCardRequest);
        intent.putExtra("First Page", getIntent().getBooleanExtra("First Page", true));
        startActivityForResult(intent, TypedValues.PositionType.TYPE_TRANSITION_EASING);
        int i2 = INotificationSideChannel + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (((TransactionResponse) intent.getSerializableExtra("transaction_response")) != null) {
                setResult(i2, intent);
                finish();
                return;
            }
            return;
        }
        if (i2 == 503) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(intent.getStringExtra("card.deleted.details"));
            return;
        }
        if (this.d.TuitionPaymentFragmentbindingInflater1()) {
            int i4 = getInterfaceDescriptor + 83;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                List<SaveCardRequest> list = this.d.f213a;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<SaveCardRequest> list2 = this.d.f213a;
            if (list2 != null && !list2.isEmpty()) {
                int i5 = getInterfaceDescriptor + 39;
                int i6 = i5 % 128;
                INotificationSideChannel = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 39;
                int i9 = i8 % 128;
                getInterfaceDescriptor = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 117;
                INotificationSideChannel = i11 % 128;
                int i12 = i11 % 2;
                j_().resetPaymentDetails();
                int i13 = INotificationSideChannel + 31;
                getInterfaceDescriptor = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 70 / 0;
                    return;
                }
                return;
            }
        }
        finish();
    }

    @Override // defpackage.computeAreaOverlapping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = INotificationSideChannel + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.getPreferredChildSizePair
    public final void a() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            obj.hashCode();
            throw null;
        }
        if (this.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentbindingInflater1((SaveCardRequest) null);
            int i3 = INotificationSideChannel + 67;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // defpackage.computeAreaOverlapping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
            int i4 = INotificationSideChannel + 55;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = INotificationSideChannel + 111;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.getPreferredChildSizePair
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<SaveCardRequest> list) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            if (!list.isEmpty()) {
                int i3 = getInterfaceDescriptor + 9;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                TuitionPaymentFragmentbindingInflater1(list);
                return;
            }
            TuitionPaymentFragmentbindingInflater1((SaveCardRequest) null);
        }
        int i5 = getInterfaceDescriptor + 57;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        String string;
        int i = 2 % 2;
        Object obj = null;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~iIdentityHashCode;
        if (i2 != 183490024 + (((~((-943561356) | i3)) | 269060745 | (~(1773548898 | i3))) * (-1136)) + (((~((-943561356) | iIdentityHashCode)) | (~(1773548898 | iIdentityHashCode)) | (~((-1099048289) | i3))) * (-568)) + (((~(iIdentityHashCode | (-269060746))) | (~(i3 | (-1773548899))) | (~(943561355 | i3))) * 568)) {
            throw new RuntimeException("-166037740");
        }
        int i4 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i6 = ~i5;
        if (i4 != 931106940 + ((~(316962139 | i6)) * (-560)) + ((~(i5 | 2079293439)) * (-560)) + (((~((-2032873471) | i6)) | 270542170) * 560)) {
            int i7 = (-1704118244) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_saved_credit_card);
        this.d = new StreamSharing(this, this);
        unsubscribe unsubscribeVar = new unsubscribe();
        this.asInterface = unsubscribeVar;
        unsubscribeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new unsubscribe.TuitionPaymentFragmentbindingInflater1() { // from class: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.5
            @Override // unsubscribe.TuitionPaymentFragmentbindingInflater1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i8) {
                Object[] objArr = {SavedCreditCardActivity.this, SavedCreditCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SavedCreditCardActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i8)};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                SavedCreditCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -498791762, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 498791762, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        };
        this.asInterface.TuitionPaymentFragmentbindingInflater1 = new unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.2
            @Override // unsubscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i8) {
                SavedCreditCardActivity.TuitionPaymentFragmentbindingInflater1(SavedCreditCardActivity.this, SavedCreditCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SavedCreditCardActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i8));
            }
        };
        this.cancelAll.setText(getString(R.string.saved_card));
        this.notify.setLayoutManager(new LinearLayoutManager(this));
        this.notify.setAdapter(this.asInterface);
        setTextColor(this.g);
        FancyButton fancyButton = this.g;
        int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i8 != 0) {
            fancyButton.setIconColorFilter(i8);
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    Object[] objArr = {SavedCreditCardActivity.this, null};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    SavedCreditCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -498791762, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 498791762, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        if (!this.d.TuitionPaymentFragmentbindingInflater1()) {
            TuitionPaymentFragmentbindingInflater1((SaveCardRequest) null);
            return;
        }
        int i9 = INotificationSideChannel + 25;
        getInterfaceDescriptor = i9 % 128;
        int i10 = i9 % 2;
        List<SaveCardRequest> list = this.d.f213a;
        if (list != null) {
            int i11 = INotificationSideChannel + 21;
            getInterfaceDescriptor = i11 % 128;
            if (i11 % 2 == 0) {
                list.isEmpty();
                throw null;
            }
            if (!list.isEmpty()) {
                int i12 = getInterfaceDescriptor + 117;
                INotificationSideChannel = i12 % 128;
                if (i12 % 2 == 0) {
                    TuitionPaymentFragmentbindingInflater1(this.d.f213a);
                    return;
                } else {
                    TuitionPaymentFragmentbindingInflater1(this.d.f213a);
                    obj.hashCode();
                    throw null;
                }
            }
        }
        if (MidtransSDK.getInstance().isEnableBuiltInTokenStorage()) {
            TuitionPaymentFragmentbindingInflater1((SaveCardRequest) null);
            int i13 = INotificationSideChannel + 101;
            getInterfaceDescriptor = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        asBinder();
        StreamSharing streamSharing = this.d;
        CustomerDetails customerDetails = streamSharing.b().getTransactionRequest().getCustomerDetails();
        if (customerDetails.getEmail() != null) {
            int i14 = INotificationSideChannel + 91;
            getInterfaceDescriptor = i14 % 128;
            if (i14 % 2 == 0) {
                customerDetails.getEmail();
                obj.hashCode();
                throw null;
            }
            string = customerDetails.getEmail();
        } else {
            string = UUID.randomUUID().toString();
            int i15 = getInterfaceDescriptor + 23;
            INotificationSideChannel = i15 % 128;
            int i16 = i15 % 2;
        }
        streamSharing.b().getCards(string, new GetCardCallback() { // from class: StreamSharing.3
            private static final byte[] $$d = {117, 50, 102, 124, 62, 9, 5, -15, 21, 21, 19, -6, 4, -8, 34, 9, 15, 2, -4, 43, 5, 13, -3, -12, 48, 9, 6, 15, 9, -27, 43, 14, -1, 16, 9, 15, -10, -8, 34, 9, 15, 2, -4, 43, 5, 13, -3, -12, 48, 9, 6, 15, 9, -27, 43, 14, -1, 16, 9, 15, -32, 47, 16, -5, 23, 6, -3, 21, -62, 23, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$e = 109;
            private static final byte[] $$a = {12, 11, -9, -106, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 201;

            public AnonymousClass3() {
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 52
                    int r6 = 55 - r6
                    int r8 = r8 * 14
                    int r8 = r8 + 84
                    int r0 = 53 - r7
                    byte[] r1 = defpackage.StreamSharing.AnonymousClass3.$$a
                    byte[] r0 = new byte[r0]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r1 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L2e
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r8
                    int r6 = r6 + 1
                    r0[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    r4 = r1[r6]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2e:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + (-10)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.StreamSharing.AnonymousClass3.a(int, byte, short, java.lang.Object[]):void");
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
            private static void b(byte r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r9 = r9 * 66
                    int r9 = 70 - r9
                    int r8 = r8 * 19
                    int r8 = 84 - r8
                    int r7 = r7 * 29
                    int r7 = r7 + 38
                    byte[] r0 = defpackage.StreamSharing.AnonymousClass3.$$d
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r9
                    r4 = r2
                    goto L2b
                L16:
                    r3 = r2
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L26
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L26:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L2b:
                    int r8 = r8 + r9
                    int r9 = r3 + 1
                    int r8 = r8 + (-10)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.StreamSharing.AnonymousClass3.b(byte, int, int, java.lang.Object[]):void");
            }

            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
            public final void onError(Throwable th) {
                ((getPreferredChildSizePair) StreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a();
                String str = StreamSharing.TuitionPaymentFragmentbindingInflater1;
                StringBuilder sb = new StringBuilder("getCards:");
                sb.append(th.getMessage());
                Logger.e(str, sb.toString());
            }

            @Override // com.midtrans.sdk.corekit.callback.GetCardCallback
            public final void onFailure(String str) {
                ((getPreferredChildSizePair) StreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a();
                Logger.d(StreamSharing.TuitionPaymentFragmentbindingInflater1, "getCards:".concat(String.valueOf(str)));
            }

            @Override // com.midtrans.sdk.corekit.callback.GetCardCallback
            public final void onSuccess(ArrayList<SaveCardRequest> arrayList) throws Throwable {
                Object[] objArr;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (arrayList != null) {
                        Collections.reverse(arrayList);
                        HashSet hashSet = new HashSet();
                        Iterator<SaveCardRequest> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!hashSet.add(it.next().getMaskedCard())) {
                                it.remove();
                            }
                        }
                    }
                    StreamSharing.this.f213a.clear();
                    StreamSharing.this.f213a.addAll(arrayList);
                    StreamSharing streamSharing2 = StreamSharing.this;
                    List<SaveCardRequest> list2 = streamSharing2.f213a;
                    CreditCard creditCard = MidtransSDK.getInstance().getCreditCard();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char size = (char) (31533 - View.MeasureSpec.getSize(0));
                        int i17 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iGreen = Color.green(0) + 28;
                        byte b = $$a[7];
                        Object[] objArr2 = new Object[1];
                        a(b, (byte) 52, b, objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, i17, iGreen, -1048449946, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                        int iAlpha = Color.alpha(0) + 921;
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        byte b3 = bArr[80];
                        Object[] objArr3 = new Object[1];
                        a(b2, b3, b3, objArr3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iAlpha, maximumFlingVelocity, -778300370, false, (String) objArr3[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char size2 = (char) (31533 - View.MeasureSpec.getSize(0));
                            int iBlue = Color.blue(0) + 921;
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
                            byte[] bArr2 = $$a;
                            byte b4 = bArr2[80];
                            Object[] objArr4 = new Object[1];
                            a(b4, (byte) (-bArr2[33]), b4, objArr4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size2, iBlue, iIndexOf, -1142834547, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
                        int iIdentityHashCode2 = System.identityHashCode(this);
                        int i18 = ((((-398041160) + (((~((-946408421) | iIdentityHashCode2)) | 809566884) * 345)) + (((~((-946408421) | (~iIdentityHashCode2))) | 18104339) * 345)) + ((~(iIdentityHashCode2 | (-809566885))) * 345)) - 1433012111;
                        int i19 = (i18 << 13) ^ i18;
                        int i20 = i19 ^ (i19 >>> 17);
                        ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
                    } else {
                        Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        try {
                            Object[] objArr6 = {applicationContext, Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, streamSharing2)).intValue()), 0, -1433012111};
                            byte[] bArr3 = $$d;
                            byte b5 = (byte) (-bArr3[32]);
                            byte b6 = b5;
                            Object[] objArr7 = new Object[1];
                            b(b5, b6, b6, objArr7);
                            Class<?> cls = Class.forName((String) objArr7[0]);
                            byte b7 = bArr3[94];
                            byte b8 = b7;
                            Object[] objArr8 = new Object[1];
                            b(b7, b8, b8, objArr8);
                            objArr = (Object[]) cls.getMethod((String) objArr8[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
                                int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                int iMyTid = (Process.myTid() >> 22) + 28;
                                byte[] bArr4 = $$a;
                                byte b9 = bArr4[80];
                                Object[] objArr9 = new Object[1];
                                a(b9, (byte) (-bArr4[33]), b9, objArr9);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, longPressTimeout, iMyTid, -1142834547, false, (String) objArr9[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                                    int iMyPid = 921 - (Process.myPid() >> 22);
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
                                    byte[] bArr5 = $$a;
                                    byte b10 = bArr5[7];
                                    byte b11 = bArr5[80];
                                    Object[] objArr10 = new Object[1];
                                    a(b10, b11, b11, objArr10);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, iMyPid, iLastIndexOf, -778300370, false, (String) objArr10[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char scrollDefaultDelay = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                                    byte b12 = $$a[7];
                                    Object[] objArr11 = new Object[1];
                                    a(b12, (byte) 52, b12, objArr11);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, windowTouchSlop, tapTimeout, -1048449946, false, (String) objArr11[0], null);
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
                    int i21 = ((int[]) objArr[1])[0];
                    int i22 = ((int[]) objArr[3])[0];
                    if (i22 == i21) {
                        int i23 = ((int[]) objArr[0])[0];
                        Object[] objArr12 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i24 = i23 + ((((~(iMaxMemory | 357432450)) | 1416647193) * 56) - 72560941) + (((~((~iMaxMemory) | 1416647193)) | 357432450) * 56);
                        int i25 = (i24 << 13) ^ i24;
                        int i26 = i25 ^ (i25 >>> 17);
                        ((int[]) objArr12[0])[0] = i26 ^ (i26 << 5);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        String[] strArr = (String[]) objArr[4];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList2.add(str);
                            }
                        }
                        int[] iArr = new int[i22];
                        int i27 = i22 - 1;
                        iArr[i27] = 1;
                        Toast.makeText((Context) null, iArr[((i22 * i27) % 2) - 1], 1).show();
                        int i28 = ((int[]) objArr[0])[0];
                        Object[] objArr13 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                        int iIdentityHashCode3 = System.identityHashCode(this);
                        int i29 = ~iIdentityHashCode3;
                        int i30 = i28 + 1175584090 + ((~((-1420377692) | i29)) * 979) + ((iIdentityHashCode3 | 353701952) * (-979)) + (((~(iIdentityHashCode3 | (-1420377692))) | (~(i29 | 353701952))) * 979);
                        int i31 = (i30 << 13) ^ i30;
                        int i32 = i31 ^ (i31 >>> 17);
                        ((int[]) objArr13[0])[0] = i32 ^ (i32 << 5);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    MerchantData merchantData = MidtransSDK.getInstance().getMerchantData();
                    String priorityCardFeature = merchantData.getPriorityCardFeature();
                    if (list2 != null && !list2.isEmpty()) {
                        for (SaveCardRequest saveCardRequest : list2) {
                            SavedToken savedToken = new SavedToken();
                            String type = saveCardRequest.getType();
                            if ((priorityCardFeature != null && !priorityCardFeature.isEmpty() && priorityCardFeature.equals(SavedToken.TWO_CLICKS)) || !merchantData.getRecurringMidIsActive().booleanValue()) {
                                type = priorityCardFeature;
                            }
                            savedToken.setTokenType(type);
                            savedToken.setMaskedCard(saveCardRequest.getMaskedCard());
                            savedToken.setToken(saveCardRequest.getSavedTokenId());
                            arrayList3.add(savedToken);
                        }
                    }
                    creditCard.setSavedTokens(arrayList3);
                }
                ((getPreferredChildSizePair) StreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3(StreamSharing.this.f213a);
            }
        });
        int i17 = getInterfaceDescriptor + 89;
        INotificationSideChannel = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 33 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1755;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                byte[] bArr = $$j;
                byte b = bArr[7];
                short s = bArr[28];
                Object[] objArr2 = new Object[1];
                m(b, s, (byte) (s & 15), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iIndexOf, packedPositionType, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int size = View.MeasureSpec.getSize(0) + 1755;
            int iRed = 23 - Color.red(0);
            byte[] bArr2 = $$j;
            byte b2 = bArr2[7];
            short s2 = bArr2[28];
            Object[] objArr3 = new Object[1];
            m(b2, s2, (byte) (s2 & 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, size, iRed, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                int iResolveSize = 1755 - View.resolveSize(0, 0);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                byte b3 = $$j[7];
                byte b4 = b3;
                Object[] objArr4 = new Object[1];
                m(b4, (short) (b4 | 36), b3, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, iResolveSize, scrollBarFadeDuration, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i4 = ~i3;
            int i5 = (-1922115791) + (((~((-557975117) | i4)) | (~((-345897012) | i3))) * 520);
            int i6 = ~(345897011 | i4);
            int i7 = ~(i3 | 558499437);
            int i8 = i5 + ((i6 | i7) * (-1040)) + ((i7 | (~(i4 | (-558499438))) | (-903872128)) * 520) + 497023397;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            n(Drawable.resolveOpacity(0, 0) + 16, new char[]{'\b', 14, 23, '\n', 7, '\r', 14, 3, 23, '\t', 6, 21, 16, 22, 1, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_6).substring(7, 8).codePointAt(0) + 37), objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.timeout_message).substring(3, 4).codePointAt(0) - 99, new char[]{24, '\f', 4, 0, 22, 23, 1, 21, 3, '\f', 18, 15, 2, 5, '\r', 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_7).substring(0, 2).codePointAt(1) - 74), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {1872904899};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1774 - AndroidCharacter.getMirror('0'), Color.argb(0, 0, 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 497023397, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                    int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                    byte b5 = $$j[7];
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    m(b6, (short) (b6 | 36), b5, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, iNormalizeMetaState, iResolveSizeAndState, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{14, 3, '\r', 24, '\f', 2, '\r', '\t', '\f', 22, 6, 3, 17, 18, 23, 1, '\n', 1, 17, '\f', 16, 5}, (byte) (22 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_kioson).substring(0, 6).length() + 9, new char[]{2, '\r', 18, 23, 18, 2, '\n', 11, '\b', 18, 11, 22, 21, '\f', 13875}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 52), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                        int iRed2 = 1755 - Color.red(0);
                        int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
                        byte b7 = $$j[7];
                        byte b8 = b7;
                        Object[] objArr12 = new Object[1];
                        m(b8, (short) (b8 | 88), b7, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, iRed2, iLastIndexOf, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                        int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        byte[] bArr3 = $$j;
                        byte b9 = bArr3[7];
                        short s3 = bArr3[28];
                        Object[] objArr13 = new Object[1];
                        m(b9, s3, (byte) (s3 & 15), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode, tapTimeout, longPressTimeout, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        if (i12 == i11) {
            int i13 = getInterfaceDescriptor + 3;
            INotificationSideChannel = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = i15 + (((~(1073518302 | iIdentityHashCode)) | 176718872) * 449) + 1406226216 + (((~((~iIdentityHashCode) | 1073518302)) | 176718872) * 449);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr14[3])[0] = i18 ^ (i18 << 5);
            int i19 = INotificationSideChannel + 85;
            getInterfaceDescriptor = i19 % 128;
            int i20 = i19 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr != null) {
                int i21 = getInterfaceDescriptor + 9;
                INotificationSideChannel = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i23 = i12 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode2;
            int i26 = ~(240800224 | i25);
            int i27 = i24 + 1959538369 + (((-268325863) | i26) * (-712)) + (((~(iIdentityHashCode2 | (-27525639))) | (~(i25 | 268325862))) * (-712)) + ((28197798 | i26) * 712);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr15[3])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 15;
            byte b10 = $$j[7];
            byte b11 = b10;
            Object[] objArr16 = new Object[1];
            m(b11, (short) (b11 | 140), b10, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(jumpTapTimeout, iIndexOf2, iResolveSizeAndState2, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr17 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{14, 3, '\r', 24, '\f', 2, '\r', '\t', '\f', 22, 6, 3, 17, 18, 23, 1, '\n', 1, 17, '\f', 16, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_sdk_not_initialized).substring(0, 52).length() - 30), objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_expiration_message).substring(3, 4).codePointAt(0) - 82, new char[]{2, '\r', 18, 23, 18, 2, '\n', 11, '\b', 18, 11, 22, 21, '\f', 13875}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 46), objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int iResolveSizeAndState3 = 1031 - View.resolveSizeAndState(0, 0, 0);
            int iAlpha = 15 - Color.alpha(0);
            byte b12 = $$j[7];
            byte b13 = b12;
            Object[] objArr19 = new Object[1];
            m(b13, (short) (b13 | 36), b12, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(tapTimeout2, iResolveSizeAndState3, iAlpha, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i30 = INotificationSideChannel + 95;
            getInterfaceDescriptor = i30 % 128;
            int i31 = i30 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int gidForName = 1030 - Process.getGidForName("");
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                Object[] objArr20 = new Object[1];
                m($$j[5], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) 52, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore, gidForName, maxKeyCode, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr21[3])[0];
            int i33 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int i34 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i35 = ~((-808973888) | i34);
            int i36 = (-715783451) + ((539001365 | i35) * (-280)) + ((i35 | (~(564693717 | i34))) * 140);
            int i37 = ~((-269972523) | i34);
            int i38 = ~i34;
            int i39 = (i36 + (((~(i38 | 834666239)) | (i37 | (~((-539001366) | i38)))) * 140)) - 184812329;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr[2])[0] = i41 ^ (i41 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            n((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, new char[]{'\b', 14, 23, '\n', 7, '\r', 14, 3, 23, '\t', 6, 21, 16, 22, 1, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_8).substring(21, 22).length() + 68), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{24, '\f', 4, 0, 22, 23, 1, 21, 3, '\f', 18, 15, 2, 5, '\r', 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step8).substring(31, 33).length() + 29), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1872904899};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46038), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1134, 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, -184812329, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int jumpTapTimeout2 = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i42 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
                byte b14 = $$j[7];
                byte b15 = b14;
                Object[] objArr26 = new Object[1];
                m(b15, (short) (b15 | 140), b14, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, jumpTapTimeout2, i42, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.argb(0, 0, 0, 0) + 45993), View.resolveSizeAndState(0, 0, 0) + 1117, (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr27 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char size2 = (char) View.MeasureSpec.getSize(0);
                int i43 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0');
                Object[] objArr28 = new Object[1];
                m($$j[5], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) 52, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(size2, i43, iLastIndexOf2, 632103528, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr27);
            try {
                Object[] objArr29 = new Object[1];
                n(22 - Color.alpha(0), new char[]{14, 3, '\r', 24, '\f', 2, '\r', '\t', '\f', 22, 6, 3, 17, 18, 23, 1, '\n', 1, 17, '\f', 16, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).length() + 21), objArr29);
                Class<?> cls5 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                n(15 - Color.blue(0), new char[]{2, '\r', 18, 23, 18, 2, '\n', 11, '\b', 18, 11, 22, 21, '\f', 13875}, (byte) (53 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr30);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int mode2 = 1031 - View.MeasureSpec.getMode(0);
                    int iMyPid = (Process.myPid() >> 22) + 15;
                    byte b16 = $$j[7];
                    byte b17 = b16;
                    Object[] objArr31 = new Object[1];
                    m(b17, (short) (b17 | 36), b16, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(pressedStateDuration, mode2, iMyPid, 1344079056, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
                    int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b18 = $$j[7];
                    byte b19 = b18;
                    Object[] objArr32 = new Object[1];
                    m(b19, (short) (b19 | 140), b18, objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionChild, bitsPerPixel, threadPriority, 1357589585, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                int i44 = INotificationSideChannel + 45;
                getInterfaceDescriptor = i44 % 128;
                int i45 = i44 % 2;
                objArr = objArr27;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw null;
        }
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i46 = ((int[]) objArr[2])[0];
        int i47 = ((int[]) objArr[3])[0];
        int i48 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i49 = i46 + (((~(417492341 | iIdentityHashCode3)) | (-1066644907)) * 262) + 887969841 + (((~((~iIdentityHashCode3) | 417492341)) | (-1066644907)) * 262);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr33[2])[0] = i51 ^ (i51 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:37:0x015f  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ac A[Catch: all -> 0x0390, TryCatch #0 {all -> 0x0390, blocks: (B:7:0x0021, B:9:0x002f, B:10:0x0066, B:14:0x008b, B:16:0x009c, B:17:0x00d1, B:38:0x0161, B:40:0x01ac, B:41:0x0220, B:45:0x0235, B:47:0x0270, B:49:0x02d5), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0233  */
    /* JADX WARN: Code duplicated, block: B:47:0x0270 A[Catch: all -> 0x0390, TryCatch #0 {all -> 0x0390, blocks: (B:7:0x0021, B:9:0x002f, B:10:0x0066, B:14:0x008b, B:16:0x009c, B:17:0x00d1, B:38:0x0161, B:40:0x01ac, B:41:0x0220, B:45:0x0235, B:47:0x0270, B:49:0x02d5), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0300  */
    /* JADX WARN: Code duplicated, block: B:53:0x0308  */
    /* JADX WARN: Code duplicated, block: B:54:0x033a  */
    private static void n(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = onTransact;
        int i4 = 1770390596;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                        int i6 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 34;
                        byte b2 = (byte) ($$n & 7);
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, maxKeyCode, i6, -1927765101, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i5++;
                    i4 = 1770390596;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(cancel)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int scrollDefaultDelay = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iCombineMeasuredStates = 33 - View.combineMeasuredStates(0, 0);
            byte b4 = (byte) ($$n & 7);
            byte b5 = (byte) (b4 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, scrollDefaultDelay, iCombineMeasuredStates, -1927765101, false, $$u(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $10 + 41;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                i2 = i + 87;
                cArr4[i2] = (char) (cArr[i2] * b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 75;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i11 = $11 + 1;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char capsMode = (char) (49267 - TextUtils.getCapsMode("", 0, 0));
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 3261;
                            int packedPositionChild = 29 - ExpandableListView.getPackedPositionChild(0L);
                            byte b6 = (byte) ($$n & 6);
                            byte b7 = (byte) (b6 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, iResolveSizeAndState, packedPositionChild, -127612708, false, $$u(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22878), Color.blue(0) + 594, ExpandableListView.getPackedPositionChild(0L) + 18, 1570859318, false, $$u(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            int i14 = $11 + 21;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i16 = $11 + 117;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            } else {
                                int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i110 = $11 + 1;
                        $10 = i110 % 128;
                        int i111 = i110 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char capsMode2 = (char) (49267 - TextUtils.getCapsMode("", 0, 0));
                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 3261;
                            int packedPositionChild2 = 29 - ExpandableListView.getPackedPositionChild(0L);
                            byte b10 = (byte) ($$n & 6);
                            byte b11 = (byte) (b10 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode2, iResolveSizeAndState2, packedPositionChild2, -127612708, false, $$u(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22878), Color.blue(0) + 594, ExpandableListView.getPackedPositionChild(0L) + 18, 1570859318, false, $$u(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                            int i113 = $11 + 21;
                            $10 = i113 % 128;
                            int i114 = i113 % 2;
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i115 = $11 + 117;
                                $10 = i115 % 128;
                                int i116 = i115 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i117 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i118 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i117];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i118];
                            } else {
                                int i22 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i22];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i24 = $11 + 63;
        $10 = i24 % 128;
        int i25 = i24 % 2;
        int i26 = 0;
        while (i26 < i) {
            int i27 = $11 + 61;
            $10 = i27 % 128;
            if (i27 % 2 != 0) {
                cArr4[i26] = (char) (cArr4[i26] ^ 1217);
                i26 += 13;
            } else {
                cArr4[i26] = (char) (cArr4[i26] ^ 13722);
                i26++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i4 = ~i3;
        if (i2 != (-1879043760) + (((~(1383052946 | i4)) | (-553065404) | (~((-1383052947) | i3))) * (-564)) + ((~(i3 | (-6754963))) * 1128) + (((~((-553065404) | i4)) | 1376297984) * 564)) {
            int i5 = INotificationSideChannel + 19;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                int[] iArr = new int[1548886907];
                iArr[1548886906] = 1;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1548886907];
                iArr2[1548886906] = 1;
                int i6 = (-882591330) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp | 1922683868);
        if (i7 != ((1350599260 | i8) * (-196)) + 549105100 + ((i8 | 572084608) * 196)) {
            throw new RuntimeException("1007056173");
        }
        super.onResume();
        int i9 = getInterfaceDescriptor + 63;
        INotificationSideChannel = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 808089224;
            if (i3 != 268358600 + (((~((-252208429) | i4)) | (~((~i4) | (-1082195972)))) * (-318)) + (((~(521959228 | i4)) | (-1604155200)) * (-318)) + (((~(i4 | (-521959229))) | 1351946771) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i7 = ~i6;
            if (i5 != 1168966376 + (((~(1749147476 | i7)) | 378011689) * 168) + ((~((-378011690) | i6)) * 168) + (((~(i6 | 2127159165)) | (~(i7 | (-919159934))) | 541148244) * 168)) {
                throw null;
            }
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        if (i8 != (-778344900) + (((-1174843931) | i9) * 376) + (((~((~i9) | 735701427)) | (-1876949948)) * (-376)) + (((~(i9 | (-735701428))) | 1843354537) * 376)) {
            int i10 = 563602994 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i11 = INotificationSideChannel + 61;
        getInterfaceDescriptor = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(SavedCreditCardActivity savedCreditCardActivity, SaveCardRequest saveCardRequest) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{savedCreditCardActivity, saveCardRequest}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -498791762, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 498791762, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static /* synthetic */ StreamSharing TuitionPaymentFragmentspecialinlinedviewModeldefault2(SavedCreditCardActivity savedCreditCardActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (StreamSharing) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{savedCreditCardActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -307121700, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 307121701, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 69;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
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
    private static java.lang.String $$u(byte r5, int r6, byte r7) {
        /*
            int r5 = 116 - r5
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.$$m
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
        L27:
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity.$$u(byte, int, byte):java.lang.String");
    }
}
