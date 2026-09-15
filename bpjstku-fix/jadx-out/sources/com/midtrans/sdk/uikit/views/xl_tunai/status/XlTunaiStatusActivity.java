package com.midtrans.sdk.uikit.views.xl_tunai.status;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class XlTunaiStatusActivity extends BasePaymentActivity {
    private DefaultTextView INotificationSideChannel;
    private FancyButton asInterface;
    private SemiBoldTextView cancel;
    private SemiBoldTextView cancelAll;
    private FancyButton d;
    private FancyButton g;
    private DefaultTextView notify;
    private FancyButton onTransact;
    private static final byte[] $$m = {49, 84, -120, 101};
    private static final int $$n = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {101, 89, 94, -73, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 38;
    private static int RemoteActionCompatParcelizer = 0;
    private static int connect = 1;
    private static char INotificationSideChannelStub = 16380;
    private static char INotificationSideChannelDefault = 44960;
    private static char INotificationSideChannelStubProxy = 34424;
    private static char getInterfaceDescriptor = 63756;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r4.setPrimaryClip(r5);
        r4 = com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.connect + 21;
        com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.RemoteActionCompatParcelizer = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.RemoteActionCompatParcelizer
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.connect = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "clipboard"
            if (r1 != 0) goto L21
            java.lang.Object r4 = r4.getSystemService(r3)
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
            android.content.ClipData r5 = android.content.ClipData.newPlainText(r5, r6)
            r6 = 38
            int r6 = r6 / r2
            if (r4 == 0) goto L3b
            goto L2d
        L21:
            java.lang.Object r4 = r4.getSystemService(r3)
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
            android.content.ClipData r5 = android.content.ClipData.newPlainText(r5, r6)
            if (r4 == 0) goto L3b
        L2d:
            r4.setPrimaryClip(r5)
            int r4 = com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.connect
            int r4 = r4 + 21
            int r5 = r4 % 128
            com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.RemoteActionCompatParcelizer = r5
            int r4 = r4 % r0
            r4 = 1
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.TuitionPaymentFragmentbindingInflater1(com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity, java.lang.String, java.lang.String):boolean");
    }

    public static /* synthetic */ DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault2(XlTunaiStatusActivity xlTunaiStatusActivity) {
        int i = 2 % 2;
        int i2 = connect + 19;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        DefaultTextView defaultTextView = xlTunaiStatusActivity.notify;
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = i3 + 5;
        connect = i6 % 128;
        int i7 = i6 % 2;
        return defaultTextView;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(XlTunaiStatusActivity xlTunaiStatusActivity, String str, String str2) {
        int i = 2 % 2;
        ClipboardManager clipboardManager = (ClipboardManager) xlTunaiStatusActivity.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        if (clipboardManager == null) {
            return false;
        }
        int i2 = RemoteActionCompatParcelizer + 105;
        connect = i2 % 128;
        int i3 = i2 % 2;
        clipboardManager.setPrimaryClip(clipDataNewPlainText);
        int i4 = connect + 71;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static /* synthetic */ DefaultTextView b(XlTunaiStatusActivity xlTunaiStatusActivity) {
        int i = 2 % 2;
        int i2 = connect + 13;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        DefaultTextView defaultTextView = xlTunaiStatusActivity.INotificationSideChannel;
        if (i3 == 0) {
            return defaultTextView;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 53 - r7
            int r6 = 197 - r6
            byte[] r0 = com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.$$j
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.m(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1 r2
  0x0033: PHI (r1v7 com.midtrans.sdk.uikit.widgets.FancyButton) = (r1v6 com.midtrans.sdk.uikit.widgets.FancyButton), (r1v13 com.midtrans.sdk.uikit.widgets.FancyButton) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r2v2 int) = (r2v1 int), (r2v5 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FancyButton fancyButton;
        int i;
        int i2 = 2 % 2;
        int i3 = connect + 113;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            setPrimaryBackgroundColor(this.g);
            setTextColor(this.onTransact);
            fancyButton = this.onTransact;
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = 26 / 0;
            if (i != 0) {
                fancyButton.setIconColorFilter(i);
            }
        } else {
            setPrimaryBackgroundColor(this.g);
            setTextColor(this.onTransact);
            fancyButton = this.onTransact;
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i != 0) {
                fancyButton.setIconColorFilter(i);
            }
        }
        FancyButton fancyButton2 = this.asInterface;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i5 != 0) {
            int i6 = RemoteActionCompatParcelizer + 111;
            connect = i6 % 128;
            if (i6 % 2 == 0) {
                fancyButton2.setBorderColor(i5);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fancyButton2.setBorderColor(i5);
        }
        setTextColor(this.asInterface);
        FancyButton fancyButton3 = this.d;
        int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i7 != 0) {
            int i8 = connect + 45;
            RemoteActionCompatParcelizer = i8 % 128;
            if (i8 % 2 != 0) {
                fancyButton3.setBorderColor(i7);
                int i9 = 94 / 0;
            } else {
                fancyButton3.setBorderColor(i7);
            }
        }
        setTextColor(this.d);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        connect = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = (FancyButton) findViewById(R.id.btn_copy_order_id);
        this.d = (FancyButton) findViewById(R.id.btn_copy_merchant_code);
        this.g = (FancyButton) findViewById(R.id.button_primary);
        this.onTransact = (FancyButton) findViewById(R.id.button_instruction);
        this.cancelAll = (SemiBoldTextView) findViewById(R.id.text_validity);
        this.cancel = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.notify = (DefaultTextView) findViewById(R.id.text_order_id);
        this.INotificationSideChannel = (DefaultTextView) findViewById(R.id.text_merchant_code);
        int i4 = connect + 117;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -843798330
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.onCreate(android.os.Bundle):void");
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 117;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $11 + 35;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) INotificationSideChannelStubProxy) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 47774);
                        int iArgb = Color.argb(i5, i5, i5, i5) + 468;
                        int i12 = (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, iArgb, i12, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i13 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) INotificationSideChannelStub) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(INotificationSideChannelDefault)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i13 + 1;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 2324, TextUtils.indexOf("", "") + 44, -1312321721, false, $$u(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
            int size = View.MeasureSpec.getSize(0) + 1755;
            int iIndexOf = TextUtils.indexOf("", "", 0) + 23;
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m((short) 193, (byte) (bArr[27] - 1), bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, size, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = RemoteActionCompatParcelizer + 51;
            connect = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                byte[] bArr2 = $$j;
                Object[] objArr3 = new Object[1];
                m((short) 156, bArr2[7], bArr2[28], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, maximumDrawingCacheSize, i5, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i6 = ((int[]) objArr4[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i7 = ((((~((-606781841) | startElapsedRealtime)) * 521) + 1732062464) + (((~((~startElapsedRealtime) | (-606781841))) | (-939446239)) * 521)) - 690735405;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(new char[]{60821, 38681, 44616, 41532, 62928, 27992, 15357, 60363, 32386, 64657, 14380, 9260, 34115, 40279, 34078, 458, 2546, 45499}, ExpandableListView.getPackedPositionChild(0L) + 17, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new char[]{21613, 4442, 2639, 53039, 37017, 716, 58458, 44800, 9966, 56504, 51141, 50482, 11869, 39854, 39225, 19704, 9243, 32047}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_not_enabled).substring(11, 12).codePointAt(0) - 85, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {372091482};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 42050), ((byte) KeyEvent.getModifierMetaStateMask()) + 1727, Gravity.getAbsoluteGravity(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -690735405);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                    int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                    byte[] bArr3 = $$j;
                    Object[] objArr8 = new Object[1];
                    m((short) 156, bArr3[7], bArr3[28], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, deadChar, scrollDefaultDelay, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new char[]{49534, 13940, 43472, 55525, 20899, 57958, 40496, 61436, 12812, 47115, 21888, 35414, 42297, 46013, 48139, 3793, 44312, 12631, 47431, 4865, 15330, 6172, 29256, 57935}, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new char[]{44470, 13365, 35113, 30591, 57935, 35247, 59969, 4034, 60158, 45381, 21947, 32000, 38447, 38060, 52187, 33625, 32188, 4715}, (ViewConfiguration.getScrollBarSize() >> 8) + 15, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (29943 - Process.getGidForName(""));
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                        byte[] bArr4 = $$j;
                        Object[] objArr11 = new Object[1];
                        m((short) 104, bArr4[7], bArr4[28], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, i10, iKeyCodeFromString, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char gidForName2 = (char) (Process.getGidForName("") + 29945);
                        int maximumDrawingCacheSize2 = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                        byte[] bArr5 = $$j;
                        Object[] objArr12 = new Object[1];
                        m((short) 193, (byte) (bArr5[27] - 1), bArr5[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName2, maximumDrawingCacheSize2, i11, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i12 = ((int[]) objArrB$5f1425da[3])[0];
        int i13 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i13}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i14 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i15 = ~i14;
        int i16 = i12 + 1353485922 + ((110857711 | i15) * (-369)) + (((~((-102468683) | i15)) | 110133743) * (-369)) + (((~(i14 | 102468682)) | 8389029 | (~(i15 | (-723969)))) * 369);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        int i19 = connect + 61;
        RemoteActionCompatParcelizer = i19 % 128;
        int i20 = i19 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
            int i21 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
            byte[] bArr6 = $$j;
            Object[] objArr14 = new Object[1];
            m((short) 52, bArr6[7], bArr6[28], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, tapTimeout, i21, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        n(new char[]{49534, 13940, 43472, 55525, 20899, 57958, 40496, 61436, 12812, 47115, 21888, 35414, 42297, 46013, 48139, 3793, 44312, 12631, 47431, 4865, 15330, 6172, 29256, 57935}, 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        n(new char[]{44470, 13365, 35113, 30591, 57935, 35247, 59969, 4034, 60158, 45381, 21947, 32000, 38447, 38060, 52187, 33625, 32188, 4715}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char gidForName3 = (char) (Process.getGidForName("") + 1);
            int capsMode = 1031 - TextUtils.getCapsMode("", 0, 0);
            int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr7 = $$j;
            Object[] objArr17 = new Object[1];
            m((short) 156, bArr7[7], bArr7[28], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName3, capsMode, jumpTapTimeout, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i22 = RemoteActionCompatParcelizer + 111;
            connect = i22 % 128;
            int i23 = i22 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char size2 = (char) View.MeasureSpec.getSize(0);
                int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
                int size3 = View.MeasureSpec.getSize(0) + 15;
                byte b = $$j[7];
                short s = b;
                Object[] objArr18 = new Object[1];
                m(s, (byte) (s | 52), b, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(size2, iIndexOf2, size3, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr19[3])[0];
            int i25 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i26 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i27 = ((((-1745931398) + ((~((~i26) | (-141295617))) * 433)) + (((~((-85125094) | i26)) | (-159155077)) * (-433))) + (((~(i26 | (-159155077))) | (-226420710)) * 433)) - 1109078263;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            n(new char[]{60821, 38681, 44616, 41532, 62928, 27992, 15357, 60363, 32386, 64657, 14380, 9260, 34115, 40279, 34078, 458, 2546, 45499}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            n(new char[]{21613, 4442, 2639, 53039, 37017, 716, 58458, 44800, 9966, 56504, 51141, 50482, 11869, 39854, 39225, 19704, 9243, 32047}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {372091482};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46038), 1133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1109078263, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                int iBlue = Color.blue(0) + 15;
                byte[] bArr8 = $$j;
                Object[] objArr24 = new Object[1];
                m((short) 52, bArr8[7], bArr8[28], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(doubleTapTimeout2, packedPositionGroup, iBlue, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45993), ((byte) KeyEvent.getModifierMetaStateMask()) + 1118, TextUtils.getTrimmedLength("") + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int defaultSize = 1031 - View.getDefaultSize(0, 0);
                int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                byte b2 = $$j[7];
                short s2 = b2;
                Object[] objArr25 = new Object[1];
                m(s2, (byte) (s2 | 52), b2, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, defaultSize, iResolveOpacity, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{49534, 13940, 43472, 55525, 20899, 57958, 40496, 61436, 12812, 47115, 21888, 35414, 42297, 46013, 48139, 3793, 44312, 12631, 47431, 4865, 15330, 6172, 29256, 57935}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step1).substring(3, 4).codePointAt(0) - 95, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{44470, 13365, 35113, 30591, 57935, 35247, 59969, 4034, 60158, 45381, 21947, 32000, 38447, 38060, 52187, 33625, 32188, 4715}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iIndexOf3 = 1031 - TextUtils.indexOf("", "", 0);
                    int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr9 = $$j;
                    Object[] objArr28 = new Object[1];
                    m((short) 156, bArr9[7], bArr9[28], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cCombineMeasuredStates, iIndexOf3, iMakeMeasureSpec, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int gidForName4 = Process.getGidForName("") + 16;
                    byte[] bArr10 = $$j;
                    Object[] objArr29 = new Object[1];
                    m((short) 52, bArr10[7], bArr10[28], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, longPressTimeout, gidForName4, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArr[1])[0];
        int i31 = ((int[]) objArr[3])[0];
        if (i31 != i30) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i31));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i32 = ((int[]) objArr[2])[0];
        int i33 = ((int[]) objArr[3])[0];
        int i34 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
        int i35 = ~startElapsedRealtime2;
        int i36 = i32 + (-1507452736) + (((~(395757142 | i35)) | (~((-294700567) | startElapsedRealtime2))) * (-831)) + ((~(934737878 | startElapsedRealtime2)) * (-1662)) + (((~(startElapsedRealtime2 | (-395757143))) | (~(i35 | (-640037313))) | (~(640037312 | startElapsedRealtime2))) * 831);
        int i37 = (i36 << 13) ^ i36;
        int i38 = i37 ^ (i37 >>> 17);
        ((int[]) objArr30[2])[0] = i38 ^ (i38 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        connect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = ~elapsedCpuTime;
        if (i4 != (-1530675584) + (((~(1260291685 | i5)) | 430304142) * 226) + (((~(i5 | 1539305455)) | (~((-430304143) | elapsedCpuTime)) | 151290372) * (-113)) + ((~(elapsedCpuTime | 1260291685)) * 113)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i7 = ~iMyPid;
        int i8 = (~((-404848894) | i7)) | 404750496;
        int i9 = ~(iMyPid | 2120858621);
        if (i6 != (-547907222) + ((i8 | i9) * (-713)) + (i9 * 1426) + ((~(2120760224 | i7)) * 713)) {
            throw new RuntimeException("-581383465");
        }
        super.onResume();
        int i10 = connect + 3;
        RemoteActionCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        connect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = ~elapsedCpuTime;
        if (i4 != (-1608870690) + (((~((-679400272) | i5)) | 1509387814) * (-865)) + ((~(elapsedCpuTime | 679400271)) * 865) + (((~(1509387814 | i5)) | (~(i5 | 679400271))) * 865)) {
            throw new RuntimeException("-1260815403");
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i6 != (((~((-256080893) | iIdentityHashCode)) | 84030108) * (-283)) + 589772752 + ((~(iIdentityHashCode | (-172050785))) * 283)) {
            throw new RuntimeException("-1192921047");
        }
        super.onStart();
        int i7 = RemoteActionCompatParcelizer + 77;
        connect = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = connect + 7;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r5 = 108 - r5
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r0 = com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.$$m
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity.$$u(short, byte, byte):java.lang.String");
    }
}
