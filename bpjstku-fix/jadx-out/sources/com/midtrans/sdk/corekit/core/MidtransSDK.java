package com.midtrans.sdk.corekit.core;

import a.a.a.a.a.b;
import a.a.a.a.a.d;
import a.a.a.a.a.g;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.midtrans.sdk.analytics.MixpanelAnalyticsManager;
import com.midtrans.sdk.corekit.BuildConfig;
import com.midtrans.sdk.corekit.callback.BankBinsCallback;
import com.midtrans.sdk.corekit.callback.BanksPointCallback;
import com.midtrans.sdk.corekit.callback.CardRegistrationCallback;
import com.midtrans.sdk.corekit.callback.CheckoutCallback;
import com.midtrans.sdk.corekit.callback.DeleteCardCallback;
import com.midtrans.sdk.corekit.callback.GetCardCallback;
import com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback;
import com.midtrans.sdk.corekit.callback.SaveCardCallback;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.callback.TransactionFinishedCallback;
import com.midtrans.sdk.corekit.callback.TransactionOptionsCallback;
import com.midtrans.sdk.corekit.core.themes.BaseColorTheme;
import com.midtrans.sdk.corekit.models.PaymentDetails;
import com.midtrans.sdk.corekit.models.PaymentMethodsModel;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.SaveCardResponse;
import com.midtrans.sdk.corekit.models.TokenRequestModel;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.CreditCardPaymentModel;
import com.midtrans.sdk.corekit.models.snap.MerchantData;
import com.midtrans.sdk.corekit.models.snap.PromoResponse;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import com.midtrans.sdk.corekit.models.snap.params.IndosatDompetkuPaymentParams;
import com.midtrans.sdk.corekit.models.snap.params.NewMandiriClickPaymentParams;
import com.midtrans.sdk.corekit.models.snap.params.TelkomselCashPaymentParams;
import com.midtrans.sdk.corekit.models.snap.payment.BasePaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.CreditCardPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.DanamonOnlinePaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.GCIPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.GoPayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.IndosatDompetkuPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.NewMandiriClickPayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.ShopeePayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.TelkomselEcashPaymentRequest;
import com.midtrans.sdk.corekit.utilities.Utils;
import defpackage.abortCapture;
import defpackage.getExtras;
import defpackage.getItem;
import defpackage.getNotifyChildrenChangedOptions;
import defpackage.initSession;
import getExtras.TuitionPaymentFragmentbindingInflater1;
import getItem.INotificationSideChannel;
import getItem.INotificationSideChannelStubProxy;
import getItem.TuitionPaymentFragmentbindingInflater1;
import getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
import getItem.a;
import getItem.asBinder;
import getItem.asInterface;
import getItem.b;
import getItem.cancel;
import getItem.d;
import getItem.g;
import getItem.getInterfaceDescriptor;
import getItem.onTransact;
import getNotifyChildrenChangedOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
import getNotifyChildrenChangedOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class MidtransSDK {
    private static final String ADD_TRANSACTION_DETAILS = "Add transaction request details.";
    private static final String LANGUAGE_CODE_EN = "en";
    private static final String TAG = "MidtransSDK";
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 0;
    private static volatile MidtransSDK midtransSDK = null;
    private static BaseSdkBuilder sdkBuilder = null;
    private static boolean sdkNotAvailable = false;
    private UIKitCustomSetting UIKitCustomSetting;
    private String authenticationToken;
    private String boldText;
    private CardRegistrationCallback cardRegistrationCallback;
    private String clientKey;
    private BaseColorTheme colorTheme;
    private Context context;
    private String defaultText;
    private boolean enableBuiltInTokenStorage;
    private IScanner externalScanner;
    private String flow;
    private boolean isLogEnabled;
    private String languageCode;
    private MixpanelAnalyticsManager mMixpanelAnalyticsManager;
    private String merchantLogo;
    private String merchantName;
    private String merchantServerUrl;
    private getNotifyChildrenChangedOptions merchantServiceManager;
    private getExtras midtransServiceManager;
    private PaymentDetails paymentDetails;
    private List<PromoResponse> promoResponses;
    private int requestTimeOut;
    private String sdkBaseUrl;
    private ArrayList<PaymentMethodsModel> selectedPaymentMethods;
    private String semiBoldText;
    private getItem snapServiceManager;
    private Transaction transaction;
    private TransactionFinishedCallback transactionFinishedCallback;
    private TransactionRequest transactionRequest;
    public ISdkFlow uiflow;
    private static final byte[] $$c = {46, 126, -84, 108};
    private static final int $$f = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {27, -8, 5, 78, 20, 6, -55, 65, 16, 8, 0, 13, 1, -47, 64, 11, 17, -5, 5, 7, 26, -6, -47, Base64.padSymbol, 23, -9, 26, -3, 12, 21, 3, -3, 2, 24, -61, 32, 43, 17, -5, 5, 7, 26, -6, -26, 55, -9, 26, -3, 12, 21, 3, -3, 2, 24, -32, 49, 12, -30, 27, 10, 10, 18, 9, 6, -9, 25, -70, 39, 52, 6, 11, -7, 21, 3, 14, 7, 20, 6, -55, 69, 12, 14, 6, -3, 9, 10, 1, 25, 7, 8, -11, -43, 59, 26, 14, -3, -3, -45, 27, 58, 14, -3, -3, -8, 26, 21, 12, -9, 21, -70, 25, -9, 25, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
    private static final int $$e = 20;
    private static final byte[] $$a = {68, -119, -76, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 239;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r6
            byte[] r1 = com.midtrans.sdk.corekit.core.MidtransSDK.$$a
            int r5 = r5 * 52
            int r5 = 108 - r5
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r5]
        L28:
            int r5 = r5 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 + 84
            int r8 = 73 - r8
            byte[] r0 = com.midtrans.sdk.corekit.core.MidtransSDK.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L2a
        L10:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L14:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r7 = r7 + r9
            int r7 = r7 + (-8)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.d(int, byte, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 89;
        while (true) {
            $11 = i3 % 128;
            int i4 = i3 % 2;
            if (abortcapture.b >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - TextUtils.getTrimmedLength("")), 1356 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 38, 894276454, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - Process.getGidForName("")), 469 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $10 + 19;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private void startOtherBankTransferUIFlow(Context context, String str) throws Throwable {
        int length;
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2 = 2 % 2;
        boolean zIsTransactionRequestAvailable = isTransactionRequestAvailable();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (37567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int iResolveSize = 625 - View.resolveSize(0, 0);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[40], (byte) 52, bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, iResolveSize, edgeSlop, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{7489, 7456, 11409, 39947, 2445, 26178, 2325, 59848, 14298, 22857, 23553, 648, 18630, 35911, 30535, 16321, 40420, 59259, 35369, 26875, 46844, 55903, 56621, 34277, 52198, 3451}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{63983, 63882, 49389, 48598, 8538, 35388, 10445, 49437, 54120, 46393, 32220, 10787, 44130, 24617, 22232, 5937, 31066, 2841, 44005}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (37567 - (ViewConfiguration.getTouchSlop() >> 8));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 626;
            int i3 = 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            a(bArr2[40], bArr2[7], bArr2[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iIndexOf, i3, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0));
                int i4 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                byte[] bArr3 = $$a;
                byte b2 = bArr3[5];
                Object[] objArr7 = new Object[1];
                a(b2, bArr3[7], b2, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i4, i5, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i6};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (((916064114 + ((~(1811152895 | iIdentityHashCode)) * (-301))) + (((~((-1673752494) | iIdentityHashCode)) | (~((~iIdentityHashCode) | 149985627))) * (-301))) + (((~(iIdentityHashCode | (-149985628))) | (-1673752494)) * 301)) - 1062484674;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[]{i7}, new int[1], iArr, strArr};
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (str != null) {
                int i13 = TuitionPaymentFragmentbindingInflater1 + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                int i14 = i13 % 2;
                length = str.length();
            } else {
                length = 0;
            }
            Object[] objArr9 = new Object[1];
            c(new char[]{40943, 40925, 39637, 29090, 2774, 53261, 58558, 60032, 46458, 61190, 45482, 459, 51774, 14870, 39590, 15612, 8022, 20777, 26517, 27632, 13320, 27753, 12510, 34484, 18718, 47971, 7595, 48207, 40498, 54935, 59122, 60168, 45936, 60888, 46000, 1548, 51318, 14569, 40074, 15672, 7498, 22453, 27028, 26748, 12801, 25253, 12948, 34641, 18421, 47497, 7271, 45648, 40190, 54472, 59760, 59664, 45503, 58316, 45646, 1071, 50830, 16120, 40772, 13115, 7105, 21946, 26710, 28215}, (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            c(new char[]{25565, 25534, 10384, 63991, 45018, 25164, 27881, 20443, 18713, 23828, 14843, 42182, 13904, 34899, 4773, 39335, 58212, 58171, 61383, 52989, 51263, 56878, 47243, 9198, 46380, 2342, 38319, 6423, 25095, 25809, 28327, 19980, 20290, 24512, 15336, 41729, 13380, 35503, 5336, 38972, 57725, 58788, 57752, 52515, 52839, 53424, 47763, 8787, 48022, 2973, 37938, 5978, 24724, 26334, 24868, 19524, 19931, 20869, 14874, 41331, 15078, 36067, 5911, 38497, 59376, 59305, 57351, 52031}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr10);
            String[] strArr2 = {str2, (String) objArr10[0]};
            int i15 = TuitionPaymentFragmentbindingInflater1 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr11 = {applicationContext, strArr2, Integer.valueOf(length), 17, -1062484674};
                byte[] bArr4 = $$d;
                Object[] objArr12 = new Object[1];
                d(bArr4[146], bArr4[10], bArr4[156], objArr12);
                Class<?> cls2 = Class.forName((String) objArr12[0]);
                byte b3 = (byte) 71;
                Object[] objArr13 = new Object[1];
                d(b3, (byte) (b3 + 1), bArr4[74], objArr13);
                objArr = (Object[]) cls2.getMethod((String) objArr13[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                    TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                    int i20 = i19 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 37567);
                        int packedPositionType = 625 - ExpandableListView.getPackedPositionType(0L);
                        int i21 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14;
                        byte[] bArr5 = $$a;
                        byte b4 = bArr5[5];
                        Object[] objArr14 = new Object[1];
                        a(b4, bArr5[7], b4, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, packedPositionType, i21, -973632554, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{7489, 7456, 11409, 39947, 2445, 26178, 2325, 59848, 14298, 22857, 23553, 648, 18630, 35911, 30535, 16321, 40420, 59259, 35369, 26875, 46844, 55903, 56621, 34277, 52198, 3451}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr15);
                        Class<?> cls3 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{63983, 63882, 49389, 48598, 8538, 35388, 10445, 49437, 54120, 46393, 32220, 10787, 44130, 24617, 22232, 5937, 31066, 2841, 44005}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr16);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                            int mirror = 673 - AndroidCharacter.getMirror('0');
                            int iMyTid = 14 - (Process.myTid() >> 22);
                            byte[] bArr6 = $$a;
                            Object[] objArr17 = new Object[1];
                            a(bArr6[40], bArr6[7], bArr6[5], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, mirror, iMyTid, -976899241, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                            int iBlue = Color.blue(0) + 625;
                            int i22 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr7 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(bArr7[40], (byte) 52, bArr7[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, iBlue, i22, -477065106, false, (String) objArr18[0], null);
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
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[2])[0];
        if (i24 == i23) {
            int i25 = ((int[]) objArr[1])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i26};
            int iMyPid = Process.myPid();
            int i28 = ~iMyPid;
            int i29 = i25 + 1381064837 + (((~((-276304308) | i28)) | (~((-1547433814) | iMyPid))) * 217) + (((~(iMyPid | (-276304308))) | 272109841) * 217) + (((~((-1547433814) | i28)) | 276304307) * 217);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[1])[0] = i31 ^ (i31 << 5);
            objArr2 = new Object[]{new int[]{i27}, new int[1], iArr2, strArr3};
            i = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                TuitionPaymentFragmentbindingInflater1 = i32 % 128;
                int i33 = i32 % 2;
                for (String str3 : strArr4) {
                    arrayList.add(str3);
                }
            }
            int[] iArr3 = new int[i24];
            int i34 = i24 - 1;
            iArr3[i34] = 1;
            Toast.makeText((Context) null, iArr3[((i24 * i34) % 2) - 1], 1).show();
            int i35 = ((int[]) objArr[1])[0];
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr4 = {i36};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i38 = ~iIdentityHashCode2;
            int i39 = ~(119967743 | i38);
            int i40 = i35 + (-85185320) + ((1619619840 | i39) * (-712)) + (((~(iIdentityHashCode2 | 1739587583)) | (~(i38 | (-1619619841)))) * (-712)) + (((-1703770378) | i39) * 712);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr2[1])[0] = i42 ^ (i42 << 5);
            objArr2 = new Object[]{new int[]{i37}, new int[1], iArr4, strArr5};
            int i43 = TuitionPaymentFragmentbindingInflater1 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i43 % 128;
            i = 2;
            int i44 = i43 % 2;
        }
        if (zIsTransactionRequestAvailable) {
            int i45 = TuitionPaymentFragmentbindingInflater1 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45 % 128;
            int i46 = i45 % i;
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                iSdkFlow.runOtherBankTransfer(context, str);
                return;
            }
        }
        int i47 = ((int[]) objArr2[1])[0];
        int i48 = i47 * i47;
        int i49 = -(2038684281 * i47);
        int i50 = (i48 & i49) + (i48 | i49);
        int i51 = -(i47 * (-1440430247));
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        int i53 = (i52 & 226128913) + (226128913 | i52);
        int i54 = i53 >> 29;
        int i55 = ((i54 & (-15)) + (i54 | (-15))) / 8;
        int i56 = (i55 & 1) + (i55 | 1);
        int i57 = (i53 ^ i56) + ((i56 & i53) << 1);
        int i58 = i53 >> 18;
        int i59 = ((i58 & (-32767)) + (i58 | (-32767))) / 16384;
        int i60 = -(((i59 ^ 1) + ((i59 & 1) << 1)) ^ i57);
        int i61 = (i60 & 7) + (i60 | 7);
        int i62 = ((i61 >> 29) - 15) / 8;
        int i63 = ((i62 | 1) << 1) - (i62 ^ 1);
        Logger.e("1\\3\\25\\0\\MidtransSDK".substring(50904 / (((-(((i63 | 1) << 1) - (i63 ^ 1))) & i61) * 808)), ADD_TRANSACTION_DETAILS);
    }

    public void paymentUsingShopeePayDeeplink(String str, TransactionCallback transactionCallback) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
            int i2 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[40], (byte) 52, bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i2, scrollDefaultDelay, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{7489, 7456, 11409, 39947, 2445, 26178, 2325, 59848, 14298, 22857, 23553, 648, 18630, 35911, 30535, 16321, 40420, 59259, 35369, 26875, 46844, 55903, 56621, 34277, 52198, 3451}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{63983, 63882, 49389, 48598, 8538, 35388, 10445, 49437, 54120, 46393, 32220, 10787, 44130, 24617, 22232, 5937, 31066, 2841, 44005}, Color.rgb(0, 0, 0) + 16777217, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
            int iGreen = Color.green(0) + 921;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            Object[] objArr6 = new Object[1];
            a(b2, bArr2[7], b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iGreen, iIndexOf, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue = (char) (31533 - Color.blue(0));
                int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b3, (byte) (b3 | 15), bArr3[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, scrollDefaultDelay2, maxKeyCode, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i3 = (-403930261) + (((~((-146563611) | elapsedCpuTime)) | 24576 | (~((-1627516034) | elapsedCpuTime))) * (-880));
            int i4 = (~((-146563611) | (~elapsedCpuTime))) | 1627516033;
            int i5 = ~(elapsedCpuTime | 146563610);
            int i6 = ((i3 + ((i4 | i5) * (-880))) + (i5 * 880)) - 1958610594;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{7308, 7405, 57977, 4745, 65144, 43178, 34711, 7741, 13847, 38817, 53891, 62845, 18693, 17068, 63899, 51273, 39953, 10627, 1195, 40706, 46890, 5277, 21431, 29190, 51740, 50064, 32453, 18662, 7509, 44648}, 1 - Drawable.resolveOpacity(0, 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{62318, 62221, 33349, 37024, 9016, 51341, 1448, 50045, 55807, 63386, 20666, 10322, 42742, 8848, 31662, 5454, 29649, 18877, 34434, 16962, 22737, 29862}, KeyEvent.normalizeMetaState(0) + 1, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int length = str != null ? str.length() : 0;
            int i9 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(length), 0, -1958610594};
                byte b4 = (byte) 71;
                byte[] bArr4 = $$d;
                Object[] objArr12 = new Object[1];
                d(b4, (byte) (b4 >>> 1), bArr4[156], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                d((byte) 108, (byte) $$e, bArr4[10], objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
                    byte[] bArr5 = $$a;
                    byte b5 = bArr5[7];
                    Object[] objArr14 = new Object[1];
                    a(b5, (byte) (b5 | 15), bArr5[5], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i11, iLastIndexOf, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{7489, 7456, 11409, 39947, 2445, 26178, 2325, 59848, 14298, 22857, 23553, 648, 18630, 35911, 30535, 16321, 40420, 59259, 35369, 26875, 46844, 55903, 56621, 34277, 52198, 3451}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{63983, 63882, 49389, 48598, 8538, 35388, 10445, 49437, 54120, 46393, 32220, 10787, 44130, 24617, 22232, 5937, 31066, 2841, 44005}, KeyEvent.getDeadChar(0, 0) + 1, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (31532 - Process.getGidForName(""));
                        int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
                        int iMyTid = (Process.myTid() >> 22) + 28;
                        byte[] bArr6 = $$a;
                        byte b6 = bArr6[5];
                        Object[] objArr17 = new Object[1];
                        a(b6, bArr6[7], b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, i12, iMyTid, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                        int iAxisFromString = 920 - MotionEvent.axisFromString("");
                        int iIndexOf2 = TextUtils.indexOf("", "") + 28;
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        a(bArr7[40], (byte) 52, bArr7[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, iAxisFromString, iIndexOf2, -1048449946, false, (String) objArr18[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i16 = ~System.identityHashCode(this);
            int i17 = i15 + (-288982497) + ((~(934788603 | i16)) * 52) + (((~(865579195 | i16)) | (~((-908500449) | i16)) | 69209408) * (-52)) + (((~(i16 | (-865579196))) | 26288155) * 52);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i21 = i20 + 2139271263 + ((~((~iMyPid) | 1761492343)) * (-116)) + ((149557620 | iMyPid) * 116) + (((~(iMyPid | (-1624522024))) | 12587300) * 116);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[0])[0] = i23 ^ (i23 << 5);
        }
        if (transactionCallback != null) {
            if (!isNetworkAvailable()) {
                transactionCallback.onError(new Throwable("Failed to connect to server."));
                return;
            }
            getItem getitem = this.snapServiceManager;
            ShopeePayPaymentRequest shopeePayPaymentRequest = SdkUtil.getShopeePayPaymentRequest();
            g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
            if (gVar == null) {
                transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
                return;
            } else {
                gVar.a(str, shopeePayPaymentRequest).enqueue(getitem.new TuitionPaymentFragmentspecialinlinedviewModeldefault3(transactionCallback));
                return;
            }
        }
        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i24 % 128;
        int i25 = i24 % 2;
        int i26 = ((int[]) objArr2[0])[0];
        int i27 = i26 * i26;
        int i28 = -(948013292 * i26);
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        int i30 = -(i26 * 127360936);
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        int i32 = (i31 & (-1681709724)) + ((-1681709724) | i31);
        int i33 = i32 >> 20;
        int i34 = (((i33 | (-8191)) << 1) - (i33 ^ (-8191))) / 4096;
        int i35 = i34 ^ 1;
        int i36 = ((i34 | 1) << 1) - i35;
        int i37 = (-((((i32 | i36) << 1) - (i36 ^ i32)) ^ (i35 + ((i34 & 1) << 1)))) + 9;
        int i38 = i37 >> 26;
        int i39 = ((i38 & ComposerKt.defaultsKey) + (i38 | ComposerKt.defaultsKey)) / 64;
        int i40 = (i39 & 1) + (i39 | 1);
        Logger.e("17/MidtransSDK".substring(21546 / ((i37 & (-(((i40 | 1) << 1) - (i40 ^ 1)))) * 798)), Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
        int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentbindingInflater1 = i41 % 128;
        if (i41 % 2 == 0) {
            throw null;
        }
    }

    public void cardRegistration(String str, String str2, String str3, String str4, CardRegistrationCallback cardRegistrationCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (cardRegistrationCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
                return;
            }
            return;
        }
        if (!isNetworkAvailable()) {
            Logger.e("Failed to connect to server.");
            cardRegistrationCallback.onError(new Throwable("Failed to connect to server."));
            int i5 = TuitionPaymentFragmentbindingInflater1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
                return;
            }
            return;
        }
        int i7 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 != 0) {
            d dVar = this.midtransServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        getExtras getextras = this.midtransServiceManager;
        String str5 = this.clientKey;
        d dVar2 = getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (dVar2 == null) {
            cardRegistrationCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            dVar2.a(str, str2, str3, str4, str5).enqueue(getextras.new TuitionPaymentFragmentbindingInflater1(cardRegistrationCallback));
        }
    }

    public void deleteCard(String str, String str2, DeleteCardCallback deleteCardCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            isNetworkAvailable();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!isNetworkAvailable()) {
            deleteCardCallback.onError(new RuntimeException("Failed to connect to server."));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        getItem getitem = this.snapServiceManager;
        g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            deleteCardCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.a(str, str2).enqueue(getitem.new g(deleteCardCallback));
        }
    }

    public void getBankBins(BankBinsCallback bankBinsCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (bankBinsCallback == null) {
            int i5 = i2 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i6 != 0) {
                throw null;
            }
            int i7 = TuitionPaymentFragmentbindingInflater1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            bankBinsCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        if (i9 % 2 == 0) {
            a.a.a.a.a.g gVar = this.snapServiceManager.TuitionPaymentFragmentbindingInflater1;
            obj.hashCode();
            throw null;
        }
        getItem getitem = this.snapServiceManager;
        a.a.a.a.a.g gVar2 = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar2 == null) {
            bankBinsCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar2.a().enqueue(getitem.new a(bankBinsCallback));
        }
    }

    public void getBanksPoint(String str, Double d, BanksPointCallback banksPointCallback) {
        int i = 2 % 2;
        if (banksPointCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            banksPointCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        getItem getitem = this.snapServiceManager;
        String authenticationToken = readAuthenticationToken();
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            banksPointCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
            return;
        }
        gVar.a(authenticationToken, str, d).enqueue(getitem.new asInterface(banksPointCallback));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (com.midtrans.sdk.corekit.utilities.Utils.isNetworkAvailable(r20.context) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (com.midtrans.sdk.corekit.utilities.Utils.isNetworkAvailable(r20.context) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r3 = r20.midtransServiceManager;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r22.onError(new java.lang.Throwable(com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r21.isTwoClick() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        r2 = r21.isInstallment();
        r4 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        r5 = r21.getCardCVV();
        r6 = r21.getSavedTokenId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r2 = r4.a(r5, r6, java.lang.Boolean.valueOf(r21.isTwoClick()), r21.getGrossAmount(), r21.getBank(), r21.getClientKey(), java.lang.Boolean.valueOf(r21.isInstallment()), r21.getFormattedInstalmentTerm(), r21.getChannel(), r21.getType(), r21.getCurrency(), java.lang.Boolean.valueOf(r21.isPoint()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r2 = r4.a(r5, r6, java.lang.Boolean.valueOf(r21.isTwoClick()), r21.getGrossAmount(), r21.getBank(), r21.getClientKey(), r21.getChannel(), r21.getType(), r21.getCurrency(), java.lang.Boolean.valueOf(r21.isPoint()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        if (r21.isInstallment() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        r2 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(r21.getCardNumber(), r21.getCardCVV(), r21.getCardExpiryMonth(), r21.getCardExpiryYear(), r21.getClientKey(), r21.getBank(), java.lang.Boolean.valueOf(r21.isTwoClick()), r21.getGrossAmount(), java.lang.Boolean.valueOf(r21.isInstallment()), r21.getChannel(), r21.getFormattedInstalmentTerm(), r21.getType(), r21.getCurrency(), java.lang.Boolean.valueOf(r21.isPoint()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
    
        r4 = r21.isSecure();
        r5 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        r6 = r21.getCardNumber();
        r7 = r21.getCardCVV();
        r8 = r21.getCardExpiryMonth();
        r9 = r21.getCardExpiryYear();
        r10 = r21.getClientKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013c, code lost:
    
        if ((!r4) == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013e, code lost:
    
        r4 = r5.a(r6, r7, r8, r9, r10, r21.getBank(), java.lang.Boolean.valueOf(r21.isTwoClick()), r21.getGrossAmount(), r21.getChannel(), r21.getType(), r21.getCurrency(), java.lang.Boolean.valueOf(r21.isPoint()));
        r5 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 + 41;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
        r5 = r5 % 2;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0171, code lost:
    
        r4 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r4 % 128;
        r4 = r4 % 2;
        r2 = r5.a(r6, r7, r8, r9, r10, r21.getGrossAmount(), r21.getChannel(), r21.getType(), r21.getCurrency(), java.lang.Boolean.valueOf(r21.isPoint()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0196, code lost:
    
        r2.enqueue(new getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r3, r22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x019e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019f, code lost:
    
        r22.onError(new java.lang.Throwable("Failed to connect to server."));
        com.midtrans.sdk.corekit.core.Logger.e("Failed to connect to server.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ac, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getCardToken(com.midtrans.sdk.corekit.models.CardTokenRequest r21, com.midtrans.sdk.corekit.callback.CardTokenCallback r22) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.getCardToken(com.midtrans.sdk.corekit.models.CardTokenRequest, com.midtrans.sdk.corekit.callback.CardTokenCallback):void");
    }

    public void getCards(String str, GetCardCallback getCardCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 1;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (getCardCallback == null) {
            int i5 = i2 + 59;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            getCardCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.merchantServiceManager;
        if (getnotifychildrenchangedoptions == null) {
            getCardCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
            return;
        }
        b bVar = getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (bVar == null) {
            getCardCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
            return;
        }
        bVar.a(str).enqueue(getnotifychildrenchangedoptions.new TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCardCallback));
        int i7 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
    }

    public void getTransactionOptions(String str, TransactionOptionsCallback transactionOptionsCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (transactionOptionsCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            transactionOptionsCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionOptionsCallback.onError(new Throwable("Failed to connect to server."));
            int i3 = TuitionPaymentFragmentbindingInflater1 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        getItem getitem = this.snapServiceManager;
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionOptionsCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.b(str).enqueue(getitem.new asBinder(transactionOptionsCallback));
        }
    }

    public void getTransactionStatus(String str, GetTransactionStatusCallback getTransactionStatusCallback) {
        int i = 2 % 2;
        if (!isNetworkAvailable()) {
            getTransactionStatusCallback.onError(new RuntimeException("Failed to connect to server."));
            int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 22 / 0;
                return;
            }
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        getItem getitem = this.snapServiceManager;
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            getTransactionStatusCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.a(str).enqueue(getitem.new d(getTransactionStatusCallback));
        }
    }

    public void paymentUsingCard(String str, CreditCardPaymentModel creditCardPaymentModel, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            getItem getitem = this.snapServiceManager;
            SdkUtil.getCreditCardPaymentRequest(creditCardPaymentModel, getTransaction());
            a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getItem getitem2 = this.snapServiceManager;
        CreditCardPaymentRequest creditCardPaymentRequest = SdkUtil.getCreditCardPaymentRequest(creditCardPaymentModel, getTransaction());
        a.a.a.a.a.g gVar2 = getitem2.TuitionPaymentFragmentbindingInflater1;
        if (gVar2 != null) {
            gVar2.a(str, creditCardPaymentRequest).enqueue(getitem2.new onTransact(transactionCallback));
            return;
        }
        transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        int i3 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void paymentUsingDanamonOnline(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (transactionCallback == null) {
            int i5 = i2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i6 != 0) {
                throw null;
            }
            return;
        }
        if (!isNetworkAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            int i7 = TuitionPaymentFragmentbindingInflater1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        int i10 = i9 % 2;
        getItem getitem = this.snapServiceManager;
        DanamonOnlinePaymentRequest danamonOnlinePaymentRequest = SdkUtil.getDanamonOnlinePaymentRequest();
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.a(str, danamonOnlinePaymentRequest).enqueue(getitem.new b(transactionCallback));
        }
    }

    public void paymentUsingGCI(String str, String str2, String str3, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
                return;
            }
            return;
        }
        if (!isNetworkAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        getItem getitem = this.snapServiceManager;
        GCIPaymentRequest gCIPaymentRequest = SdkUtil.getGCIPaymentRequest(str2, str3);
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar != null) {
            gVar.a(str, gCIPaymentRequest).enqueue(getitem.new INotificationSideChannelStubProxy(transactionCallback));
            return;
        }
        transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void paymentUsingGoPay(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 88 / 0;
                return;
            }
            return;
        }
        if (!isNetworkAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        getItem getitem = this.snapServiceManager;
        GoPayPaymentRequest goPayPaymentRequest = SdkUtil.getGoPayPaymentRequest();
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
            return;
        }
        gVar.a(str, goPayPaymentRequest).enqueue(getitem.new TuitionPaymentFragmentbindingInflater1(transactionCallback));
        int i6 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void paymentUsingIndosatDompetku(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 1;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (transactionCallback == null) {
            int i5 = i2 + 21;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i6 == 0) {
                throw null;
            }
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        getItem getitem = this.snapServiceManager;
        IndosatDompetkuPaymentRequest indosatDompetkuPaymentRequest = new IndosatDompetkuPaymentRequest(PaymentType.INDOSAT_DOMPETKU, new IndosatDompetkuPaymentParams(str2));
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.a(str, indosatDompetkuPaymentRequest).enqueue(getitem.new getInterfaceDescriptor(transactionCallback));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (isTransactionRequestAvailable() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 + 87;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r3 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if ((!com.midtrans.sdk.corekit.utilities.Utils.isNetworkAvailable(r4.context)) == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (com.midtrans.sdk.corekit.utilities.Utils.isNetworkAvailable(r4.context) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r0 = r4.snapServiceManager;
        r6 = com.midtrans.sdk.corekit.core.SdkUtil.getKlikBCAPaymentRequest(r6, "bca_klikbca");
        r1 = r0.TuitionPaymentFragmentbindingInflater1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r7.onError(new java.lang.Throwable(com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r1.a(r5, r6).enqueue(new getItem.INotificationSideChannelDefault(r0, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r7.onError(new java.lang.Throwable("Failed to connect to server."));
        r5 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 + 35;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r7.onError(new java.lang.Throwable("Failed to connect to server."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 15;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
        r1 = r1 % 2;
        com.midtrans.sdk.corekit.core.Logger.e("MidtransSDK", com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void paymentUsingKlikBCA(java.lang.String r5, java.lang.String r6, com.midtrans.sdk.corekit.callback.TransactionCallback r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r1 + 51
            int r3 = r2 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L15
            r2 = 9
            int r2 = r2 / 0
            if (r7 != 0) goto L26
            goto L17
        L15:
            if (r7 != 0) goto L26
        L17:
            int r1 = r1 + 15
            int r5 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r5
            int r1 = r1 % r0
            java.lang.String r5 = "MidtransSDK"
            java.lang.String r6 = "Callback Unimplemented"
            com.midtrans.sdk.corekit.core.Logger.e(r5, r6)
            return
        L26:
            boolean r1 = r4.isTransactionRequestAvailable()
            java.lang.String r2 = "Failed to connect to server."
            if (r1 == 0) goto L86
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 87
            int r3 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L48
            android.content.Context r1 = r4.context
            boolean r1 = com.midtrans.sdk.corekit.utilities.Utils.isNetworkAvailable(r1)
            r3 = 36
            int r3 = r3 / 0
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L74
            goto L50
        L48:
            android.content.Context r1 = r4.context
            boolean r1 = com.midtrans.sdk.corekit.utilities.Utils.isNetworkAvailable(r1)
            if (r1 == 0) goto L74
        L50:
            getItem r0 = r4.snapServiceManager
            java.lang.String r1 = "bca_klikbca"
            com.midtrans.sdk.corekit.models.snap.payment.KlikBCAPaymentRequest r6 = com.midtrans.sdk.corekit.core.SdkUtil.getKlikBCAPaymentRequest(r6, r1)
            a.a.a.a.a.g r1 = r0.TuitionPaymentFragmentbindingInflater1
            if (r1 != 0) goto L67
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r6 = "Merchant base url is empty. Please set merchant base url on SDK"
            r5.<init>(r6)
            r7.onError(r5)
            return
        L67:
            retrofit2.Call r5 = r1.a(r5, r6)
            getItem$INotificationSideChannelDefault r6 = new getItem$INotificationSideChannelDefault
            r6.<init>(r7)
            r5.enqueue(r6)
            return
        L74:
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>(r2)
            r7.onError(r5)
            int r5 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1
            int r5 = r5 + 35
            int r6 = r5 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6
            int r5 = r5 % r0
            return
        L86:
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>(r2)
            r7.onError(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.paymentUsingKlikBCA(java.lang.String, java.lang.String, com.midtrans.sdk.corekit.callback.TransactionCallback):void");
    }

    public void paymentUsingMandiriClickPay(String str, NewMandiriClickPaymentParams newMandiriClickPaymentParams, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (transactionCallback == null) {
            int i4 = i3 + 93;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i5 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        getItem getitem = this.snapServiceManager;
        NewMandiriClickPayPaymentRequest newMandiriClickPayPaymentRequest = new NewMandiriClickPayPaymentRequest("mandiri_clickpay", newMandiriClickPaymentParams);
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
            return;
        }
        gVar.a(str, newMandiriClickPayPaymentRequest).enqueue(getitem.new cancel(transactionCallback));
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (isNetworkAvailable() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
        r1 = r1 % 2;
        r0 = r3.snapServiceManager;
        r1 = com.midtrans.sdk.corekit.core.SdkUtil.getShopeePayQrisPaymentRequest();
        r2 = r0.TuitionPaymentFragmentbindingInflater1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r5.onError(new java.lang.Throwable(com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r2.a(r4, r1).enqueue(new getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r0, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r5.onError(new java.lang.Throwable("Failed to connect to server."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        com.midtrans.sdk.corekit.core.Logger.e("MidtransSDK", com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void paymentUsingShopeePayQris(java.lang.String r4, com.midtrans.sdk.corekit.callback.TransactionCallback r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 67
            int r1 = r1 / 0
            if (r5 != 0) goto L1f
            goto L17
        L15:
            if (r5 != 0) goto L1f
        L17:
            java.lang.String r4 = "MidtransSDK"
            java.lang.String r5 = "Callback Unimplemented"
            com.midtrans.sdk.corekit.core.Logger.e(r4, r5)
            return
        L1f:
            boolean r1 = r3.isNetworkAvailable()
            if (r1 == 0) goto L50
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            getItem r0 = r3.snapServiceManager
            com.midtrans.sdk.corekit.models.snap.payment.ShopeePayQrisPaymentRequest r1 = com.midtrans.sdk.corekit.core.SdkUtil.getShopeePayQrisPaymentRequest()
            a.a.a.a.a.g r2 = r0.TuitionPaymentFragmentbindingInflater1
            if (r2 != 0) goto L43
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r0 = "Merchant base url is empty. Please set merchant base url on SDK"
            r4.<init>(r0)
            r5.onError(r4)
            return
        L43:
            retrofit2.Call r4 = r2.a(r4, r1)
            getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r1 = new getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r1.<init>(r5)
            r4.enqueue(r1)
            return
        L50:
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r0 = "Failed to connect to server."
            r4.<init>(r0)
            r5.onError(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.paymentUsingShopeePayQris(java.lang.String, com.midtrans.sdk.corekit.callback.TransactionCallback):void");
    }

    public void paymentUsingTelkomselEcash(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!isNetworkAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getItem getitem = this.snapServiceManager;
        TelkomselEcashPaymentRequest telkomselEcashPaymentRequest = new TelkomselEcashPaymentRequest(PaymentType.TELKOMSEL_CASH, new TelkomselCashPaymentParams(str2));
        a.a.a.a.a.g gVar = getitem.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.a(str, telkomselEcashPaymentRequest).enqueue(getitem.new INotificationSideChannel(transactionCallback));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (isNetworkAvailable() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
        r1 = r1 % 2;
        r1 = r4.snapServiceManager;
        r2 = com.midtrans.sdk.corekit.core.SdkUtil.getUobEzpayPaymentRequest();
        r3 = r1.TuitionPaymentFragmentbindingInflater1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r6.onError(new java.lang.Throwable(com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        r5 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 + 1;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r3.a(r5, r2).enqueue(new getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        r6.onError(new java.lang.Throwable("Failed to connect to server."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r2 = r2 + 13;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2 % 128;
        r2 = r2 % 2;
        com.midtrans.sdk.corekit.core.Logger.e("MidtransSDK", com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r2 != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void paymentUsingUobEzpay(java.lang.String r5, com.midtrans.sdk.corekit.callback.TransactionCallback r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L14
            r1 = 5
            int r1 = r1 / 0
            if (r6 != 0) goto L2c
            goto L16
        L14:
            if (r6 != 0) goto L2c
        L16:
            int r2 = r2 + 13
            int r5 = r2 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
            int r2 = r2 % r0
            java.lang.String r5 = "Callback Unimplemented"
            java.lang.String r6 = "MidtransSDK"
            com.midtrans.sdk.corekit.core.Logger.e(r6, r5)
            if (r2 != 0) goto L27
            return
        L27:
            r5 = 0
            r5.hashCode()
            throw r5
        L2c:
            boolean r1 = r4.isNetworkAvailable()
            if (r1 == 0) goto L66
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            getItem r1 = r4.snapServiceManager
            com.midtrans.sdk.corekit.models.snap.payment.UobEzpayPaymentRequest r2 = com.midtrans.sdk.corekit.core.SdkUtil.getUobEzpayPaymentRequest()
            a.a.a.a.a.g r3 = r1.TuitionPaymentFragmentbindingInflater1
            if (r3 != 0) goto L59
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r1 = "Merchant base url is empty. Please set merchant base url on SDK"
            r5.<init>(r1)
            r6.onError(r5)
            int r5 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1
            int r5 = r5 + 1
            int r6 = r5 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6
            int r5 = r5 % r0
            return
        L59:
            retrofit2.Call r5 = r3.a(r5, r2)
            getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault1 r0 = new getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r0.<init>(r6)
            r5.enqueue(r0)
            return
        L66:
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r0 = "Failed to connect to server."
            r5.<init>(r0)
            r6.onError(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.paymentUsingUobEzpay(java.lang.String, com.midtrans.sdk.corekit.callback.TransactionCallback):void");
    }

    public void saveCards(String str, ArrayList<SaveCardRequest> arrayList, SaveCardCallback saveCardCallback) {
        int i = 2 % 2;
        if (saveCardCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (arrayList == null) {
            saveCardCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!Utils.isNetworkAvailable(this.context)) {
            saveCardCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 13;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
        int i6 = i4 % 2;
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.merchantServiceManager;
        if (getnotifychildrenchangedoptions == null) {
            saveCardCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
            return;
        }
        int i7 = i5 + 3;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        a.a.a.a.a.b bVar = getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (bVar == null) {
            saveCardCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else if (arrayList != null) {
            bVar.a(str, arrayList).enqueue(getnotifychildrenchangedoptions.new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new SaveCardResponse(), saveCardCallback));
        } else {
            saveCardCallback.onError(new Throwable(Constants.MESSAGE_ERROR_INVALID_DATA_SUPPLIED));
        }
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        b = i % 128;
        int i2 = i % 2;
    }

    private MidtransSDK() {
        this.isLogEnabled = false;
        this.context = null;
        this.clientKey = null;
        this.merchantServerUrl = null;
        this.defaultText = null;
        this.boldText = null;
        this.semiBoldText = null;
        this.merchantName = null;
        this.merchantLogo = null;
        this.transactionRequest = null;
        this.selectedPaymentMethods = new ArrayList<>();
        this.sdkBaseUrl = "";
        this.requestTimeOut = 30;
        this.flow = null;
        this.promoResponses = new ArrayList();
    }

    private MidtransSDK(BaseSdkBuilder baseSdkBuilder) {
        this.isLogEnabled = false;
        String deviceType = null;
        this.context = null;
        this.clientKey = null;
        this.merchantServerUrl = null;
        this.defaultText = null;
        this.boldText = null;
        this.semiBoldText = null;
        this.merchantName = null;
        this.merchantLogo = null;
        this.transactionRequest = null;
        this.selectedPaymentMethods = new ArrayList<>();
        this.sdkBaseUrl = "";
        this.requestTimeOut = 30;
        this.flow = null;
        this.promoResponses = new ArrayList();
        this.context = baseSdkBuilder.context;
        this.clientKey = baseSdkBuilder.clientKey;
        this.merchantServerUrl = baseSdkBuilder.merchantServerUrl;
        this.sdkBaseUrl = BuildConfig.SNAP_BASE_URL;
        this.defaultText = baseSdkBuilder.defaultText;
        this.semiBoldText = baseSdkBuilder.semiBoldText;
        this.boldText = baseSdkBuilder.boldText;
        this.uiflow = baseSdkBuilder.sdkFlow;
        this.transactionFinishedCallback = baseSdkBuilder.transactionFinishedCallback;
        this.externalScanner = baseSdkBuilder.externalScanner;
        boolean z = baseSdkBuilder.enableLog;
        this.isLogEnabled = z;
        Logger.enabled = z;
        this.enableBuiltInTokenStorage = baseSdkBuilder.enableBuiltInTokenStorage;
        UIKitCustomSetting uIKitCustomSetting = baseSdkBuilder.UIKitCustomSetting;
        if (uIKitCustomSetting == null) {
            uIKitCustomSetting = new UIKitCustomSetting();
            int i = TuitionPaymentFragmentbindingInflater1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        this.UIKitCustomSetting = uIKitCustomSetting;
        this.flow = baseSdkBuilder.flow;
        BaseColorTheme baseColorTheme = baseSdkBuilder.colorTheme;
        if (baseColorTheme != null) {
            this.colorTheme = baseColorTheme;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        Context context = this.context;
        if (context != null) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            if (context instanceof Activity) {
                deviceType = Utils.getDeviceType((Activity) context);
                int i7 = 2 % 2;
            }
        }
        this.mMixpanelAnalyticsManager = SdkUtil.newMixpanelAnalyticsManager("1.29.3", SdkUtil.getDeviceId(this.context), this.merchantName, getFlow(this.flow), deviceType == null ? "" : deviceType, this.isLogEnabled, this.context);
        this.snapServiceManager = SdkUtil.newSnapServiceManager(this.requestTimeOut);
        this.midtransServiceManager = SdkUtil.newMidtransServiceManager(this.requestTimeOut);
        this.merchantServiceManager = SdkUtil.newMerchantServiceManager(this.merchantServerUrl, this.requestTimeOut);
        this.languageCode = baseSdkBuilder.languageCode;
    }

    public static MidtransSDK delegateInstance(BaseSdkBuilder baseSdkBuilder) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (baseSdkBuilder != null) {
            midtransSDK = new MidtransSDK(baseSdkBuilder);
            sdkBuilder = baseSdkBuilder;
        } else {
            Logger.e(Constants.ERROR_SDK_IS_NOT_INITIALIZED);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
        return midtransSDK;
    }

    private String getFlow(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return "";
        }
        if (str.equalsIgnoreCase(BaseSdkBuilder.CORE_FLOW)) {
            return MixpanelAnalyticsManager.CORE_FLOW;
        }
        if (!str.equalsIgnoreCase(BaseSdkBuilder.UI_FLOW)) {
            return MixpanelAnalyticsManager.WIDGET;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return MixpanelAnalyticsManager.UI_FLOW;
    }

    public static MidtransSDK getInstance() {
        MidtransSDK midtransSDK2;
        synchronized (MidtransSDK.class) {
            if (midtransSDK == null) {
                synchronized (MidtransSDK.class) {
                    if (midtransSDK == null) {
                        BaseSdkBuilder baseSdkBuilder = sdkBuilder;
                        if (baseSdkBuilder != null) {
                            midtransSDK = new MidtransSDK(baseSdkBuilder);
                            sdkNotAvailable = false;
                        } else {
                            midtransSDK = new MidtransSDK();
                            sdkNotAvailable = true;
                        }
                    }
                }
            } else {
                sdkNotAvailable = false;
            }
            midtransSDK2 = midtransSDK;
        }
        return midtransSDK2;
    }

    private boolean isTransactionRequestAvailable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = true;
        if (this.transactionRequest == null) {
            int i5 = i3 + 3;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            if (!(!TextUtils.isEmpty(this.authenticationToken))) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i8 = i7 + 123;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                z = i8 % 2 == 0;
                int i9 = i7 + 11;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[PHI: r1
  0x0041: PHI (r1v10 com.midtrans.sdk.corekit.callback.TransactionFinishedCallback) = 
  (r1v9 com.midtrans.sdk.corekit.callback.TransactionFinishedCallback)
  (r1v14 com.midtrans.sdk.corekit.callback.TransactionFinishedCallback)
 binds: [B:15:0x003f, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean merchantBaseUrlAvailable() {
        TransactionFinishedCallback transactionFinishedCallback;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
            if (!TextUtils.isEmpty(this.merchantServerUrl)) {
                return true;
            }
        } else if (!TextUtils.isEmpty(this.merchantServerUrl)) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        Logger.e("MidtransSDK", "merchant base url is required if you want to do checkout from SDK, please set merchant base url on Midtrans SDK");
        if (i5 == 0) {
            transactionFinishedCallback = this.transactionFinishedCallback;
            int i6 = 98 / 0;
            if (transactionFinishedCallback != null) {
                transactionFinishedCallback.onTransactionFinished(new TransactionResult(TransactionResult.STATUS_INVALID, "merchant base url is required if you want to do checkout from SDK, please set merchant base url on Midtrans SDK"));
                int i7 = TuitionPaymentFragmentbindingInflater1 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            transactionFinishedCallback = this.transactionFinishedCallback;
            if (transactionFinishedCallback != null) {
                transactionFinishedCallback.onTransactionFinished(new TransactionResult(TransactionResult.STATUS_INVALID, "merchant base url is required if you want to do checkout from SDK, please set merchant base url on Midtrans SDK"));
                int i9 = TuitionPaymentFragmentbindingInflater1 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return false;
    }

    private void runDirectPaymentUiSdk(Context context, PaymentMethod paymentMethod, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (paymentMethod.equals(PaymentMethod.CREDIT_CARD)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            startCreditCardUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            startBankTransferUIFlow(context, str);
            if (i7 == 0) {
                int i8 = 58 / 0;
                return;
            }
            return;
        }
        if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER_BCA)) {
            startBCABankTransferUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER_PERMATA)) {
            startPermataBankTransferUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER_MANDIRI)) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            startMandiriBankTransferUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER_BNI)) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            startBniBankTransferUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER_BRI)) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            startBriBankTransferUIFlow(context, str);
            if (i14 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER_OTHER)) {
            startOtherBankTransferUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.GO_PAY)) {
            startGoPayUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.SHOPEEPAY)) {
            startShopeePayUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.BCA_KLIKPAY)) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            TuitionPaymentFragmentbindingInflater1 = i15 % 128;
            int i16 = i15 % 2;
            startBCAKlikPayUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.KLIKBCA)) {
            startKlikBCAUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.MANDIRI_CLICKPAY)) {
            startMandiriClickpayUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.MANDIRI_ECASH)) {
            startMandiriECashUIFlow(context, str);
            return;
        }
        if (!(!paymentMethod.equals(PaymentMethod.EPAY_BRI))) {
            startBRIEpayUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.CIMB_CLICKS)) {
            startCIMBClicksUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.TELKOMSEL_CASH)) {
            startTelkomselCashUIFlow(context, str);
            return;
        }
        if (!(!paymentMethod.equals(PaymentMethod.INDOSAT_DOMPETKU))) {
            startIndosatDompetkuUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.XL_TUNAI)) {
            startXlTunaiUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.INDOMARET)) {
            startIndomaretUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.KIOSON)) {
            startKiosonUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.GIFT_CARD_INDONESIA)) {
            int i17 = TuitionPaymentFragmentbindingInflater1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            int i18 = i17 % 2;
            startGiftCardUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.DANAMON_ONLINE)) {
            startDanamonOnlineUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.AKULAKU)) {
            startAkulakuUIFlow(context, str);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.ALFAMART)) {
            startAlfamartUIFlow(context, str);
        } else if (TextUtils.isEmpty(str)) {
            startPaymentUiFlow(context);
        } else {
            startPaymentUiFlow(context, str);
        }
    }

    private void runUiSdk(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isTransactionRequestAvailable();
            obj.hashCode();
            throw null;
        }
        if (isTransactionRequestAvailable()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                iSdkFlow.runUIFlow(context, str);
                return;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r7
  0x002b: PHI (r7v6 com.midtrans.sdk.corekit.callback.TransactionFinishedCallback) = 
  (r7v5 com.midtrans.sdk.corekit.callback.TransactionFinishedCallback)
  (r7v10 com.midtrans.sdk.corekit.callback.TransactionFinishedCallback)
 binds: [B:10:0x0029, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean snapTokenAvailable(String str) {
        TransactionFinishedCallback transactionFinishedCallback;
        int i = 2 % 2;
        this.authenticationToken = str;
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Logger.e("MidtransSDK", "snap token cannot be null or empty, please checkout transaction to get snapToken");
        if (i3 == 0) {
            transactionFinishedCallback = this.transactionFinishedCallback;
            int i4 = 88 / 0;
            if (transactionFinishedCallback != null) {
                transactionFinishedCallback.onTransactionFinished(new TransactionResult(TransactionResult.STATUS_INVALID, "snap token cannot be null or empty, please checkout transaction to get snapToken"));
            }
        } else {
            transactionFinishedCallback = this.transactionFinishedCallback;
            if (transactionFinishedCallback != null) {
                transactionFinishedCallback.onTransactionFinished(new TransactionResult(TransactionResult.STATUS_INVALID, "snap token cannot be null or empty, please checkout transaction to get snapToken"));
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private void startAkulakuUIFlow(Context context, String str) {
        int i = 2 % 2;
        if (isTransactionRequestAvailable()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                iSdkFlow.runAkulaku(context, str);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
    }

    private void startAlfamartUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!isTransactionRequestAvailable() || (iSdkFlow = this.uiflow) == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        iSdkFlow.runAlfamart(context, str);
        if (i7 == 0) {
            int i8 = 65 / 0;
        }
    }

    private void startBCABankTransferUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isTransactionRequestAvailable();
            obj.hashCode();
            throw null;
        }
        if (!isTransactionRequestAvailable() || (iSdkFlow = this.uiflow) == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        iSdkFlow.runBCABankTransfer(context, str);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void startBCAKlikPayUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            isTransactionRequestAvailable();
            throw null;
        }
        if (!isTransactionRequestAvailable() || (iSdkFlow = this.uiflow) == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        iSdkFlow.runBCAKlikPay(context, str);
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
    }

    private void startBRIEpayUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!isTransactionRequestAvailable() || (iSdkFlow = this.uiflow) == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        iSdkFlow.runBRIEpay(context, str);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    private void startBankTransferUIFlow(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isTransactionRequestAvailable();
            throw null;
        }
        if (!isTransactionRequestAvailable()) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        ISdkFlow iSdkFlow = this.uiflow;
        if (iSdkFlow != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            iSdkFlow.runBankTransfer(context, str);
            if (i4 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private void startBniBankTransferUIFlow(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!isTransactionRequestAvailable()) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        ISdkFlow iSdkFlow = this.uiflow;
        if (iSdkFlow != null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            iSdkFlow.runBniBankTransfer(context, str);
            if (i5 != 0) {
                int i6 = 8 / 0;
            }
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
    }

    private void startBriBankTransferUIFlow(Context context, String str) {
        int i = 2 % 2;
        if (!isTransactionRequestAvailable()) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ISdkFlow iSdkFlow = this.uiflow;
        if (iSdkFlow != null) {
            iSdkFlow.runBriBankTransfer(context, str);
        }
    }

    private void startCIMBClicksUIFlow(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (isTransactionRequestAvailable()) {
            int i4 = TuitionPaymentFragmentbindingInflater1;
            int i5 = i4 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                throw null;
            }
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                int i6 = i4 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                iSdkFlow.runCIMBClicks(context, str);
                if (i7 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
    }

    private void startCreditCardUIFlow(Context context, String str) {
        int i = 2 % 2;
        if (!isTransactionRequestAvailable()) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        ISdkFlow iSdkFlow = this.uiflow;
        if (iSdkFlow != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            iSdkFlow.runCreditCard(context, str);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
        }
    }

    private void startDanamonOnlineUIFlow(Context context, String str) {
        int i = 2 % 2;
        if (isTransactionRequestAvailable()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                int i5 = i3 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                iSdkFlow.runDanamonOnline(context, str);
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 16 / 0;
                    return;
                }
                return;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
    }

    private void startGiftCardUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            isTransactionRequestAvailable();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (isTransactionRequestAvailable() && (iSdkFlow = this.uiflow) != null) {
            iSdkFlow.runGci(context, str);
            return;
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void startGoPayUIFlow(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (isTransactionRequestAvailable()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                iSdkFlow.runGoPay(context, str);
                int i6 = TuitionPaymentFragmentbindingInflater1 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
    }

    private void startIndomaretUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            isTransactionRequestAvailable();
            throw null;
        }
        if (!isTransactionRequestAvailable() || (iSdkFlow = this.uiflow) == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        iSdkFlow.runIndomaret(context, str);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void startIndosatDompetkuUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        if (!isTransactionRequestAvailable() || (iSdkFlow = this.uiflow) == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        iSdkFlow.runIndosatDompetku(context, str);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    private void startKiosonUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
            if (!(!isTransactionRequestAvailable())) {
                iSdkFlow = this.uiflow;
                if (iSdkFlow != null) {
                    iSdkFlow.runKioson(context, str);
                    return;
                }
            }
        } else if (isTransactionRequestAvailable()) {
            iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                iSdkFlow.runKioson(context, str);
                return;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void startKlikBCAUIFlow(Context context, String str) {
        int i = 2 % 2;
        if (isTransactionRequestAvailable()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                iSdkFlow.runKlikBCA(context, str);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
    }

    private void startMandiriBankTransferUIFlow(Context context, String str) {
        int i = 2 % 2;
        if (!isTransactionRequestAvailable()) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ISdkFlow iSdkFlow = this.uiflow;
        if (iSdkFlow != null) {
            iSdkFlow.runMandiriBankTransfer(context, str);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void startMandiriClickpayUIFlow(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (isTransactionRequestAvailable()) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 9;
            int i5 = i4 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
            int i6 = i4 % 2;
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                int i7 = i5 + 105;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                iSdkFlow.runMandiriClickpay(context, str);
                if (i8 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        int i10 = i9 % 2;
    }

    private void startMandiriECashUIFlow(Context context, String str) {
        int i = 2 % 2;
        if (isTransactionRequestAvailable()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            ISdkFlow iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                int i5 = i3 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                iSdkFlow.runMandiriECash(context, str);
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
    }

    private void startPermataBankTransferUIFlow(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isTransactionRequestAvailable();
            throw null;
        }
        if (!isTransactionRequestAvailable()) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            return;
        }
        ISdkFlow iSdkFlow = this.uiflow;
        if (iSdkFlow != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            iSdkFlow.runPermataBankTransfer(context, str);
            if (i4 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    private void startShopeePayUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
            if (isTransactionRequestAvailable()) {
                iSdkFlow = this.uiflow;
                if (iSdkFlow != null) {
                    iSdkFlow.runShopeePay(context, str);
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
            }
        } else if (isTransactionRequestAvailable()) {
            iSdkFlow = this.uiflow;
            if (iSdkFlow != null) {
                iSdkFlow.runShopeePay(context, str);
                int i6 = TuitionPaymentFragmentbindingInflater1 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
    }

    private void startTelkomselCashUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            isTransactionRequestAvailable();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((!isTransactionRequestAvailable()) || (iSdkFlow = this.uiflow) == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 13 / 0;
                return;
            }
            return;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        iSdkFlow.runTelkomselCash(context, str);
        if (i6 != 0) {
            int i7 = 76 / 0;
        }
    }

    private void startXlTunaiUIFlow(Context context, String str) {
        ISdkFlow iSdkFlow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!isTransactionRequestAvailable()) && (iSdkFlow = this.uiflow) != null) {
            iSdkFlow.runXlTunai(context, str);
            return;
        }
        Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void UiCardRegistration(Context context, CardRegistrationCallback cardRegistrationCallback) {
        int i = 2 % 2;
        ISdkFlow iSdkFlow = this.uiflow;
        if (iSdkFlow == null) {
            Logger.e("MidtransSDK", "uikit sdk is needed to use this feature");
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.cardRegistrationCallback = cardRegistrationCallback;
        iSdkFlow.runCardRegistration(context, cardRegistrationCallback);
        if (i4 == 0) {
            int i5 = 45 / 0;
        }
    }

    public void changeSdkConfig(String str, String str2, String str3, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.sdkBaseUrl = str;
        this.merchantServerUrl = str2;
        if (i4 == 0) {
            this.clientKey = str3;
            this.requestTimeOut = i;
        } else {
            this.clientKey = str3;
            this.requestTimeOut = i;
            int i5 = 93 / 0;
        }
    }

    public void checkout(CheckoutCallback checkoutCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (checkoutCallback == null) {
            int i4 = i2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i5 != 0) {
                throw null;
            }
            return;
        }
        if (this.transactionRequest == null) {
            checkoutCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            checkoutCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        TokenRequestModel snapTokenRequestModel = SdkUtil.getSnapTokenRequestModel(this.transactionRequest);
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.merchantServiceManager;
        if (getnotifychildrenchangedoptions != null) {
            getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(snapTokenRequestModel, checkoutCallback);
        } else {
            checkoutCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        }
    }

    public void checkout(String str, CheckoutCallback checkoutCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (checkoutCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (this.transactionRequest == null) {
            checkoutCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            checkoutCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        TokenRequestModel snapTokenRequestModel = SdkUtil.getSnapTokenRequestModel(this.transactionRequest);
        if (isEnableBuiltInTokenStorage()) {
            snapTokenRequestModel.setUserId(str);
        }
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.merchantServiceManager;
        if (getnotifychildrenchangedoptions == null) {
            checkoutCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
            return;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(snapTokenRequestModel, checkoutCallback);
        if (i4 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v5 com.midtrans.sdk.corekit.models.snap.MerchantData) = (r1v4 com.midtrans.sdk.corekit.models.snap.MerchantData), (r1v8 com.midtrans.sdk.corekit.models.snap.MerchantData) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public ArrayList<String> getBanksPointEnabled() {
        MerchantData merchantData;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            merchantData = getMerchantData();
            int i3 = 81 / 0;
            if (merchantData.getPointBanks() == null) {
                merchantData.setPointBanks(new ArrayList<>());
            }
        } else {
            merchantData = getMerchantData();
            if (merchantData.getPointBanks() == null) {
                merchantData.setPointBanks(new ArrayList<>());
            }
        }
        ArrayList<String> pointBanks = merchantData.getPointBanks();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return pointBanks;
    }

    public String getBoldText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.boldText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getClientKey() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.clientKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseColorTheme getColorTheme() {
        BaseColorTheme baseColorTheme;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 27;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            baseColorTheme = this.colorTheme;
            int i4 = 55 / 0;
        } else {
            baseColorTheme = this.colorTheme;
        }
        int i5 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return baseColorTheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Context context = this.context;
        int i5 = i3 + 119;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    public CreditCard getCreditCard() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Transaction transaction = getTransaction();
        if (transaction.getCreditCard() == null) {
            transaction.setCreditCard(new CreditCard());
        }
        CreditCard creditCard = transaction.getCreditCard();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return creditCard;
        }
        throw null;
    }

    public String getDefaultText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.defaultText;
        int i5 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public IScanner getExternalScanner() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IScanner iScanner = this.externalScanner;
        int i4 = i3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return iScanner;
    }

    public String getFlow() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.flow;
        }
        throw null;
    }

    public String getLanguageCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.languageCode;
        if (str != null) {
            return str;
        }
        int i5 = i3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return LANGUAGE_CODE_EN;
        }
        throw null;
    }

    public MerchantData getMerchantData() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            getTransaction().getMerchantData();
            throw null;
        }
        Transaction transaction = getTransaction();
        if (transaction.getMerchantData() == null) {
            transaction.setMerchantData(new MerchantData());
        }
        MerchantData merchantData = transaction.getMerchantData();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return merchantData;
        }
        throw null;
    }

    public String getMerchantLogo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.merchantLogo;
        int i5 = i3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMerchantName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 1;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.merchantName;
        int i5 = i2 + 87;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getMerchantServerUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.merchantServerUrl;
        int i5 = i2 + 53;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public getNotifyChildrenChangedOptions getMerchantServiceManager() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.merchantServiceManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getExtras getMidtransServiceManager() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        getExtras getextras = this.midtransServiceManager;
        int i5 = i3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return getextras;
    }

    public PaymentDetails getPaymentDetails() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paymentDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<PromoResponse> getPromoResponses() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<PromoResponse> list = this.promoResponses;
        int i4 = i3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public int getRequestTimeOut() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.requestTimeOut;
        if (i3 != 0) {
            int i5 = 66 / 0;
        }
        return i4;
    }

    public String getSdkBaseUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sdkBaseUrl;
        }
        throw null;
    }

    @Deprecated
    public ArrayList<PaymentMethodsModel> getSelectedPaymentMethods() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        ArrayList<PaymentMethodsModel> arrayList = this.selectedPaymentMethods;
        int i5 = i3 + 103;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public String getSemiBoldText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.semiBoldText;
        int i5 = i3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public getItem getSnapServiceManager() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 3;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        getItem getitem = this.snapServiceManager;
        int i5 = i2 + 67;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return getitem;
    }

    public Transaction getTransaction() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.transaction == null) {
            this.transaction = new Transaction();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.transaction;
    }

    public TransactionRequest getTransactionRequest() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        TransactionRequest transactionRequest = this.transactionRequest;
        int i5 = i2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return transactionRequest;
    }

    public UIKitCustomSetting getUIKitCustomSetting() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.UIKitCustomSetting == null) {
            this.UIKitCustomSetting = new UIKitCustomSetting();
            int i3 = TuitionPaymentFragmentbindingInflater1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 5;
            }
        }
        return this.UIKitCustomSetting;
    }

    public CardRegistrationCallback getUiCardRegistrationCallback() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cardRegistrationCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MixpanelAnalyticsManager getmMixpanelAnalyticsManager() {
        int i = 2 % 2;
        Context context = this.context;
        String deviceType = null;
        if (context != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            if (context instanceof Activity) {
                int i5 = i2 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                Activity activity = (Activity) context;
                if (i5 % 2 != 0) {
                    Utils.getDeviceType(activity);
                    throw null;
                }
                deviceType = Utils.getDeviceType(activity);
            }
        }
        if (this.mMixpanelAnalyticsManager == null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            String deviceId = SdkUtil.getDeviceId(this.context);
            String str = this.merchantName;
            String flow = getFlow(this.flow);
            if (deviceType == null) {
                deviceType = "";
            }
            this.mMixpanelAnalyticsManager = SdkUtil.newMixpanelAnalyticsManager("1.29.3", deviceId, str, flow, deviceType, this.isLogEnabled, this.context);
            int i8 = TuitionPaymentFragmentbindingInflater1 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
        }
        return this.mMixpanelAnalyticsManager;
    }

    public boolean isEnableBuiltInTokenStorage() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.enableBuiltInTokenStorage;
        int i5 = i2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public boolean isLogEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isLogEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isNetworkAvailable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Utils.isNetworkAvailable(this.context);
            throw null;
        }
        boolean zIsNetworkAvailable = Utils.isNetworkAvailable(this.context);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return zIsNetworkAvailable;
        }
        obj.hashCode();
        throw null;
    }

    public boolean isSdkNotAvailable() {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            z = sdkNotAvailable;
            int i4 = 9 / 0;
        } else {
            z = sdkNotAvailable;
        }
        int i5 = i3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void notifyTransactionFinished(TransactionResult transactionResult) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        TransactionFinishedCallback transactionFinishedCallback = this.transactionFinishedCallback;
        if (transactionFinishedCallback != null) {
            transactionFinishedCallback.onTransactionFinished(transactionResult);
            return;
        }
        Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
    }

    public void paymentUsingAkulaku(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (transactionCallback == null) {
            int i5 = i3 + 79;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i6 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest(PaymentType.AKULAKU), transactionCallback);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void paymentUsingAlfamart(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        if (Utils.isNetworkAvailable(this.context)) {
            this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest(PaymentType.ALFAMART), transactionCallback);
        } else {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
        }
    }

    public void paymentUsingBCAKlikpay(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (Utils.isNetworkAvailable(this.context)) {
            this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest("bca_klikpay"), transactionCallback);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        transactionCallback.onError(new Throwable("Failed to connect to server."));
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
    }

    public void paymentUsingBankTransferAllBank(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (isTransactionRequestAvailable()) {
            if (!isNetworkAvailable()) {
                transactionCallback.onError(new Throwable("Failed to connect to server."));
                return;
            } else {
                this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, PaymentType.ALL_VA), transactionCallback);
                return;
            }
        }
        transactionCallback.onError(new Throwable("Failed to connect to server."));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void paymentUsingBankTransferBCA(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            int i4 = TuitionPaymentFragmentbindingInflater1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        if (Utils.isNetworkAvailable(this.context)) {
            this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, PaymentType.BCA_VA), transactionCallback);
        } else {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
        }
    }

    public void paymentUsingBankTransferBni(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, PaymentType.BNI_VA), transactionCallback);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
    }

    public void paymentUsingBankTransferBri(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, PaymentType.BRI_VA), transactionCallback);
            return;
        }
        this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, PaymentType.BRI_VA), transactionCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void paymentUsingBankTransferPermata(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (!Utils.isNetworkAvailable(this.context)) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, PaymentType.PERMATA_VA), transactionCallback);
        } else {
            this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, PaymentType.PERMATA_VA), transactionCallback);
            throw null;
        }
    }

    public void paymentUsingCIMBClick(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        if (Utils.isNetworkAvailable(this.context)) {
            this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest("cimb_clicks"), transactionCallback);
        } else {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (isTransactionRequestAvailable() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 + 113;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (isNetworkAvailable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r4.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, new com.midtrans.sdk.corekit.models.snap.payment.BasePaymentRequest("bri_epay"), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r6.onError(new java.lang.Throwable("Failed to connect to server."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r6.onError(new java.lang.Throwable("Failed to connect to server."));
        r5 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 + 7;
        com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if ((r5 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        com.midtrans.sdk.corekit.core.Logger.e("MidtransSDK", com.midtrans.sdk.corekit.core.Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void paymentUsingEpayBRI(java.lang.String r5, com.midtrans.sdk.corekit.callback.TransactionCallback r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            r1 = 61
            int r1 = r1 / 0
            if (r6 != 0) goto L1f
            goto L17
        L15:
            if (r6 != 0) goto L1f
        L17:
            java.lang.String r5 = "MidtransSDK"
            java.lang.String r6 = "Callback Unimplemented"
            com.midtrans.sdk.corekit.core.Logger.e(r5, r6)
            return
        L1f:
            boolean r1 = r4.isTransactionRequestAvailable()
            java.lang.String r2 = "Failed to connect to server."
            if (r1 == 0) goto L4c
            int r1 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 113
            int r3 = r1 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            boolean r0 = r4.isNetworkAvailable()
            if (r0 == 0) goto L43
            getItem r0 = r4.snapServiceManager
            com.midtrans.sdk.corekit.models.snap.payment.BasePaymentRequest r1 = new com.midtrans.sdk.corekit.models.snap.payment.BasePaymentRequest
            java.lang.String r2 = "bri_epay"
            r1.<init>(r2)
            r0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, r1, r6)
            return
        L43:
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>(r2)
            r6.onError(r5)
            return
        L4c:
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>(r2)
            r6.onError(r5)
            int r5 = com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentbindingInflater1
            int r5 = r5 + 7
            int r6 = r5 % 128
            com.midtrans.sdk.corekit.core.MidtransSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L60
            return
        L60:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.paymentUsingEpayBRI(java.lang.String, com.midtrans.sdk.corekit.callback.TransactionCallback):void");
    }

    public void paymentUsingIndomaret(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (transactionCallback == null) {
            int i5 = i2 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i6 != 0) {
                throw null;
            }
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
        } else if (Utils.isNetworkAvailable(this.context)) {
            this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest(PaymentType.INDOMARET), transactionCallback);
        } else {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
        }
    }

    public void paymentUsingKiosan(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        Object obj = null;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (isTransactionRequestAvailable()) {
            if (Utils.isNetworkAvailable(this.context)) {
                this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest(PaymentType.KIOSON), transactionCallback);
                return;
            } else {
                transactionCallback.onError(new Throwable("Failed to connect to server."));
                return;
            }
        }
        transactionCallback.onError(new Throwable("Failed to connect to server."));
        int i3 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void paymentUsingMandiriBillPay(String str, String str2, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (isTransactionRequestAvailable()) {
            if (Utils.isNetworkAvailable(this.context)) {
                this.snapServiceManager.TuitionPaymentFragmentbindingInflater1(str, SdkUtil.getBankTransferPaymentRequest(str2, "echannel"), transactionCallback);
                return;
            } else {
                transactionCallback.onError(new Throwable("Failed to connect to server."));
                return;
            }
        }
        transactionCallback.onError(new Throwable("Failed to connect to server."));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void paymentUsingMandiriEcash(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (transactionCallback == null) {
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if (Utils.isNetworkAvailable(this.context)) {
            this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest("mandiri_ecash"), transactionCallback);
        } else {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
        }
    }

    public void paymentUsingXLTunai(String str, TransactionCallback transactionCallback) {
        int i = 2 % 2;
        if (transactionCallback == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Logger.e("MidtransSDK", Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            if (i3 == 0) {
                int i4 = 48 / 0;
                return;
            }
            return;
        }
        if (!isTransactionRequestAvailable()) {
            transactionCallback.onError(new Throwable("Failed to connect to server."));
            return;
        }
        if (Utils.isNetworkAvailable(this.context)) {
            this.snapServiceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new BasePaymentRequest(PaymentType.XL_TUNAI), transactionCallback);
            return;
        }
        transactionCallback.onError(new Throwable("Failed to connect to server."));
        int i5 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    public String readAuthenticationToken() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.authenticationToken;
        int i5 = i3 + 57;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public void resetPaymentDetails() {
        int i = 2 % 2;
        this.paymentDetails = new PaymentDetails(getTransaction().getTransactionDetails(), getTransaction().getItemDetails());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
    }

    public void setAuthenticationToken(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.authenticationToken = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public void setBoldText(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.boldText = str;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
    }

    public void setClientKey(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.clientKey = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setColorTheme(BaseColorTheme baseColorTheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 119;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.colorTheme = baseColorTheme;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public void setCreditCard(CreditCard creditCard) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
            if (creditCard != null) {
                getTransaction().setCreditCard(creditCard);
            }
        } else if (creditCard != null) {
            getTransaction().setCreditCard(creditCard);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
    }

    public void setDefaultText(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.defaultText = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFlow(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.flow = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 107;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setMerchantLogo(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.merchantLogo = str;
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        int i6 = i3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setMerchantName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.merchantName = str;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    public void setMerchantServiceManager(getNotifyChildrenChangedOptions getnotifychildrenchangedoptions) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.merchantServiceManager = getnotifychildrenchangedoptions;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setMidtransServiceManager(getExtras getextras) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.midtransServiceManager = getextras;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.paymentDetails = paymentDetails;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
    }

    public void setPromoResponses(List<PromoResponse> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.promoResponses = list;
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        int i6 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Deprecated
    public void setSelectedPaymentMethods(ArrayList<PaymentMethodsModel> arrayList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.selectedPaymentMethods = arrayList;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setSemiBoldText(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.semiBoldText = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSnapServiceManager(getItem getitem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.snapServiceManager = getitem;
        int i5 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setTransaction(Transaction transaction) {
        int i = 2 % 2;
        if (transaction != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            this.transaction = transaction;
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setTransactionFinishedCallback(TransactionFinishedCallback transactionFinishedCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.transactionFinishedCallback = transactionFinishedCallback;
        int i5 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setTransactionRequest(TransactionRequest transactionRequest) {
        int i = 2 % 2;
        if (transactionRequest == null) {
            Logger.e("MidtransSDK", ADD_TRANSACTION_DETAILS);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        this.transactionRequest = transactionRequest;
        if (i5 != 0) {
            int i6 = 99 / 0;
        }
    }

    public void setUIKitCustomSetting(UIKitCustomSetting uIKitCustomSetting) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (uIKitCustomSetting != null) {
            this.UIKitCustomSetting = uIKitCustomSetting;
            int i4 = i3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void startPaymentUiFlow(Context context) {
        int i = 2 % 2;
        if (!merchantBaseUrlAvailable()) {
            return;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        runUiSdk(context, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void startPaymentUiFlow(Context context, PaymentMethod paymentMethod) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            merchantBaseUrlAvailable();
            throw null;
        }
        if (merchantBaseUrlAvailable()) {
            runDirectPaymentUiSdk(context, paymentMethod, null);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void startPaymentUiFlow(Context context, PaymentMethod paymentMethod, String str) throws Throwable {
        int i = 2 % 2;
        if (snapTokenAvailable(str)) {
            runDirectPaymentUiSdk(context, paymentMethod, str);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public void startPaymentUiFlow(Context context, String str) {
        int i = 2 % 2;
        if (snapTokenAvailable(str)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            runUiSdk(context, str);
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6036893057458724645L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.midtrans.sdk.corekit.core.MidtransSDK.$$c
            int r8 = r8 * 2
            int r8 = r8 + 107
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2d
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.MidtransSDK.$$g(short, byte, short):java.lang.String");
    }
}
