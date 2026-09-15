package com.midtrans.sdk.uikit.views.banktransfer.payment;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.bpjstku.util.constant.ProgramType;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity;
import com.midtrans.sdk.uikit.views.banktransfer.status.VaOtherBankPaymentStatusActivity;
import com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getCameraSupportedHighResolutions;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.needToAddSensorResolutions;
import defpackage.onConnectionFailed;
import defpackage.search;
import defpackage.selectParentResolutions;
import defpackage.selectParentResolutionsByAspectRatio;
import defpackage.sendCustomAction;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BankTransferPaymentActivity extends BasePaymentActivity implements selectParentResolutions, getCameraSupportedHighResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    DefaultTextView INotificationSideChannel;
    private String INotificationSideChannelDefault;
    private ViewPager INotificationSideChannelStub;
    private boolean[] INotificationSideChannelStubProxy;
    private DefaultTextView MediaBrowserCompat;
    private selectParentResolutionsByAspectRatio RemoteActionCompatParcelizer;
    FancyButton asInterface;
    private TextInputLayout cancel;
    private String cancelAll;
    private TabLayout connect;
    DefaultTextView d;
    ImageView g;
    private String getInterfaceDescriptor;
    private FancyButton notify;
    private AppCompatEditText onTransact;
    private DefaultTextView read;
    private static final byte[] $$u = {6, -86, -9, -124};
    private static final int $$v = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {48, -110, 22, 55, -9, -18, 31, -44, 0, -20, 32, -41, -23, -3, -24, 6, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$n = 0;
    private static final byte[] $$j = {87, 51, -85, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 223;
    private static int getRoot = 0;
    private static int getItem = 1;
    private static long IconCompatParcelizer = -6377398940819159759L;
    private static int write = -981105359;
    private static char getExtras = 30011;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getItem + 7;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        bankTransferPaymentActivity.asBinder();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ selectParentResolutionsByAspectRatio TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 71;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        selectParentResolutionsByAspectRatio selectparentresolutionsbyaspectratio = bankTransferPaymentActivity.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        int i6 = i2 + 31;
        getRoot = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
        return selectparentresolutionsbyaspectratio;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i4 | i5));
        int i12 = i4 | i5;
        int i13 = i10 | i12;
        int i14 = (~(i | i4)) | (~i12);
        int i15 = i4 + i5 + i6 + (1068639271 * i3) + ((-1919980423) * i2);
        int i16 = i15 * i15;
        int i17 = ((i4 * 1648758371) - 594280448) + (1648758371 * i5) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i6) + ((-1693188096) * i3) + (611057664 * i2) + ((-810221568) * i16);
        int i18 = (i4 * 982247175) + 1844138806 + (i5 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i6 * 982246413) + (i3 * 1533776379) + (i2 * 1016546853) + (i16 * (-1070530560));
        int i19 = i17 + (i18 * i18 * 1708326912);
        if (i19 != 1) {
            if (i19 != 2) {
                return i19 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        BankTransferPaymentActivity bankTransferPaymentActivity = (BankTransferPaymentActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i20 = 2 % 2;
        if (!TextUtils.isEmpty(bankTransferPaymentActivity.INotificationSideChannelDefault)) {
            int i21 = getRoot + 77;
            getItem = i21 % 128;
            int i22 = i21 % 2;
            if (bankTransferPaymentActivity.INotificationSideChannelDefault.equals(PaymentType.BCA_VA)) {
                if (iIntValue == 1) {
                    int i23 = getItem + 31;
                    getRoot = i23 % 128;
                    if (i23 % 2 != 0) {
                        bankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                    } else {
                        bankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                    }
                } else {
                    bankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
                }
            } else if (bankTransferPaymentActivity.INotificationSideChannelDefault.equals(PaymentType.BNI_VA)) {
                int i24 = getItem + 53;
                getRoot = i24 % 128;
                int i25 = i24 % 2;
                if (iIntValue == 1) {
                    bankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1(true);
                } else {
                    bankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1(false);
                }
            } else if (!bankTransferPaymentActivity.INotificationSideChannelDefault.equals(PaymentType.BRI_VA)) {
                bankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1(false);
                bankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
            } else if (iIntValue == 1) {
                bankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1(true);
            } else {
                bankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1(false);
            }
        }
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        BankTransferPaymentActivity bankTransferPaymentActivity = (BankTransferPaymentActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = getRoot + 105;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        selectParentResolutionsByAspectRatio selectparentresolutionsbyaspectratio = bankTransferPaymentActivity.RemoteActionCompatParcelizer;
        Object obj = null;
        if (!TextUtils.isEmpty(str)) {
            int i4 = getRoot + 35;
            getItem = i4 % 128;
            if (i4 % 2 == 0) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
                obj.hashCode();
                throw null;
            }
            if (!onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str)) {
                int i5 = getItem + 95;
                getRoot = i5 % 128;
                int i6 = i5 % 2;
                bankTransferPaymentActivity.cancel.setError(bankTransferPaymentActivity.getString(R.string.error_invalid_email_id));
                int i7 = getItem + 123;
                getRoot = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
        }
        int i9 = getItem + 55;
        getRoot = i9 % 128;
        int i10 = i9 % 2;
        bankTransferPaymentActivity.cancel.setError("");
        int i11 = getRoot + 77;
        getItem = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getItem + 7;
        int i3 = i2 % 128;
        getRoot = i3;
        int i4 = i2 % 2;
        String str = bankTransferPaymentActivity.getInterfaceDescriptor;
        int i5 = i3 + 81;
        getItem = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ AppCompatEditText TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRoot + 15;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        AppCompatEditText appCompatEditText = bankTransferPaymentActivity.onTransact;
        if (i3 != 0) {
            return appCompatEditText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void a(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRoot + 101;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            bankTransferPaymentActivity.findViewById(R.id.other_atm_guidance).setVisibility(27);
        } else {
            bankTransferPaymentActivity.findViewById(R.id.other_atm_guidance).setVisibility(8);
        }
    }

    public static /* synthetic */ ViewPager asInterface(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRoot;
        int i3 = i2 + 101;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        ViewPager viewPager = bankTransferPaymentActivity.INotificationSideChannelStub;
        int i5 = i2 + 35;
        getItem = i5 % 128;
        if (i5 % 2 != 0) {
            return viewPager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String b(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 111;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String str = bankTransferPaymentActivity.cancelAll;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 107;
        getRoot = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean[] d(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getItem + 5;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        boolean[] zArr = bankTransferPaymentActivity.INotificationSideChannelStubProxy;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return zArr;
    }

    public static /* synthetic */ String g(BankTransferPaymentActivity bankTransferPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRoot;
        int i3 = i2 + 97;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        String str = bankTransferPaymentActivity.INotificationSideChannelDefault;
        int i5 = i2 + 117;
        getItem = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.$$j
            int r6 = r6 + 4
            int r1 = r7 + 1
            int r5 = r5 * 14
            int r5 = 98 - r5
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L12
            r5 = r6
            r3 = r7
            goto L29
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            int r5 = r5 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r0[r5]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.m(short, int, short, java.lang.Object[]):void");
    }

    private static void o(short s, short s2, byte b, Object[] objArr) {
        byte[] bArr = $$m;
        int i = (b * 32) + 84;
        int i2 = s2 * 40;
        int i3 = 15 - (s * 12);
        byte[] bArr2 = new byte[53 - i2];
        int i4 = 52 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = (i3 + (-i4)) - 11;
            i3 = i3;
        }
        while (true) {
            i5++;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + (-bArr[i6])) - 11;
                i3 = i6;
            }
        }
    }

    private static void n(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 13;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 8328), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1234, TextUtils.lastIndexOf("", '0') + 36, -653973969, false, $$w(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2764;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 15;
                    byte b3 = (byte) ($$v & 6);
                    byte b4 = (byte) (b3 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, touchSlop, iLastIndexOf, 1504416861, false, $$w(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 252, View.resolveSize(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65200);
                    int i5 = 2891 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iBlue = Color.blue(0) + 17;
                    byte b5 = (byte) ($$v & 5);
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, i5, iBlue, 2012627446, false, $$w(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (IconCompatParcelizer ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) write) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) getExtras) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 125;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    private void g() {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("transaction_response", this.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        setResult(-1, intent);
        finish();
        int i2 = getRoot + 17;
        getItem = i2 % 128;
        int i3 = i2 % 2;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TransactionResponse transactionResponse) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getRoot + 17;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(this.INotificationSideChannelDefault)) {
            if (!this.INotificationSideChannelDefault.equals("echannel")) {
                if (!this.INotificationSideChannelDefault.equals(PaymentType.ALL_VA)) {
                    TuitionPaymentFragmentbindingInflater1(transactionResponse);
                    int i4 = getRoot + 57;
                    getItem = i4 % 128;
                    if (i4 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intent intent = new Intent(this, (Class<?>) VaOtherBankPaymentStatusActivity.class);
                intent.putExtra("bank.payment.result", transactionResponse);
                intent.putExtra("bank.type", this.INotificationSideChannelDefault);
                startActivityForResult(intent, 210);
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) MandiriBillStatusActivity.class);
            intent2.putExtra("bank.payment.result", transactionResponse);
            intent2.putExtra("bank.type", this.INotificationSideChannelDefault);
            startActivityForResult(intent2, 210);
            return;
        }
        TuitionPaymentFragmentbindingInflater1(transactionResponse);
    }

    @Override // defpackage.selectParentResolutions
    public final void a() {
        int i = 2 % 2;
        int i2 = getRoot + 57;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        b();
        int i4 = getRoot + 109;
        getItem = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = getItem + 43;
        getRoot = i4 % 128;
        if (i4 % 2 != 0) {
            super.onActivityResult(i, i2, intent);
            if (i != 5416) {
                return;
            }
        } else {
            super.onActivityResult(i, i2, intent);
            if (i != 210) {
                return;
            }
        }
        if (i2 == -1) {
            int i5 = getItem + 63;
            getRoot = i5 % 128;
            int i6 = i5 % 2;
            g();
            int i7 = getItem + 33;
            getRoot = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 5;
            }
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(TransactionResponse transactionResponse) throws IllegalAccessException {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) VaPaymentStatusActivity.class);
        intent.putExtra("bank.payment.result", transactionResponse);
        intent.putExtra("bank.type", this.INotificationSideChannelDefault);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46401), 40 - (Process.myTid() >> 22), 19 - Color.alpha(0), 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 37836), 59 - KeyEvent.normalizeMetaState(0), 18 - TextUtils.getCapsMode("", 0, 0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37837 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 58 - MotionEvent.axisFromString(""), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -755;
        long j3 = -1;
        long j4 = ((765492419308693536L ^ j3) | (j3 ^ 4753761077851092703L)) ^ j3;
        long j5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        long j6 = (j2 * 765492419308693536L) + (j2 * 4753761077851092703L) + (((long) 1512) * j4) + (((long) (-756)) * (j4 | ((5476328561061560063L | j5) ^ j3))) + (((long) 756) * (5476328561061560063L | (j3 ^ j5)));
        int i5 = 0;
        while (true) {
            int i6 = 0;
            while (i6 != 8) {
                i4 = (((((int) (j >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                i6++;
                int i7 = getRoot + 123;
                getItem = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 3;
                }
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j = j6;
        }
        if (i4 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46399), TextUtils.lastIndexOf("", '0') + 41, 18 - ((byte) KeyEvent.getModifierMetaStateMask()), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
        }
        startActivityForResult(intent, 210);
        int i9 = getRoot + 117;
        getItem = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getRoot + 91;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        this.connect.setSelectedTabIndicatorColor(((BaseActivity) this).b);
        setPrimaryBackgroundColor(this.notify);
        b(this.onTransact);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.cancel);
        int i4 = getItem + 81;
        getRoot = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        if (this.RemoteActionCompatParcelizer != null) {
            int i2 = getRoot + 35;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            if (!TextUtils.isEmpty(this.getInterfaceDescriptor)) {
                this.RemoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1("Back", this.getInterfaceDescriptor);
                int i4 = getItem + 61;
                getRoot = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        super.onBackPressed();
    }

    private void TuitionPaymentFragmentbindingInflater1(boolean z) {
        int i = 2 % 2;
        int i2 = getItem + 97;
        getRoot = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!(!z)) {
            this.read.setVisibility(0);
            this.read.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_top));
            return;
        }
        this.read.setVisibility(8);
        this.read.setAnimation(null);
        int i3 = getRoot + 15;
        getItem = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
        int i = 2 % 2;
        int i2 = getItem + 89;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            this.MediaBrowserCompat.setVisibility(0);
            this.MediaBrowserCompat.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_top));
            int i4 = getItem + 47;
            getRoot = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.MediaBrowserCompat.setVisibility(8);
        this.MediaBrowserCompat.setAnimation(null);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        BankTransferPaymentActivity bankTransferPaymentActivity = (BankTransferPaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getItem + 121;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        bankTransferPaymentActivity.INotificationSideChannelStub = (ViewPager) bankTransferPaymentActivity.findViewById(R.id.tab_view_pager);
        bankTransferPaymentActivity.connect = (TabLayout) bankTransferPaymentActivity.findViewById(R.id.tab_instructions);
        bankTransferPaymentActivity.onTransact = (AppCompatEditText) bankTransferPaymentActivity.findViewById(R.id.edit_email);
        bankTransferPaymentActivity.notify = (FancyButton) bankTransferPaymentActivity.findViewById(R.id.button_primary);
        bankTransferPaymentActivity.MediaBrowserCompat = (DefaultTextView) bankTransferPaymentActivity.findViewById(R.id.text_notificationToken);
        bankTransferPaymentActivity.read = (DefaultTextView) bankTransferPaymentActivity.findViewById(R.id.text_notificationOtp);
        bankTransferPaymentActivity.cancel = (TextInputLayout) bankTransferPaymentActivity.findViewById(R.id.container_email);
        int i4 = getItem + 97;
        getRoot = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        BankTransferPaymentActivity bankTransferPaymentActivity = (BankTransferPaymentActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = getRoot + 5;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        bankTransferPaymentActivity.b();
        if (!bankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1) {
            return null;
        }
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bankTransferPaymentActivity, handleMessage.b(th, bankTransferPaymentActivity).TuitionPaymentFragmentbindingInflater1);
        int i4 = getItem + 31;
        getRoot = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        int i5 = 4 / 3;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((!isFinishing()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (isFinishing() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        g();
        r4 = com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getRoot + 1;
        com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getItem = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.midtrans.sdk.corekit.models.TransactionResponse r4) throws java.lang.IllegalAccessException {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getRoot
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getItem = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1e
            r3.b()
            boolean r1 = r3.isFinishing()
            r2 = 36
            int r2 = r2 / 0
            r1 = r1 ^ 1
            if (r1 == 0) goto L27
            goto L34
        L1e:
            r3.b()
            boolean r1 = r3.isFinishing()
            if (r1 == 0) goto L34
        L27:
            r3.g()
            int r4 = com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getRoot
            int r4 = r4 + 1
            int r1 = r4 % 128
            com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getItem = r1
            int r4 = r4 % r0
            return
        L34:
            r3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.b(com.midtrans.sdk.corekit.models.TransactionResponse):void");
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getRoot + 17;
        getItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            b();
            isFinishing();
            throw null;
        }
        b();
        if (!isFinishing()) {
            int i3 = getRoot + 111;
            getItem = i3 % 128;
            if (i3 % 2 == 0) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, transactionResponse).TuitionPaymentFragmentbindingInflater1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(transactionResponse);
                obj.hashCode();
                throw null;
            }
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, transactionResponse).TuitionPaymentFragmentbindingInflater1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(transactionResponse);
        }
        int i4 = getItem + 91;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:102:0x0500  */
    /* JADX WARN: Code duplicated, block: B:104:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:114:0x0741  */
    /* JADX WARN: Code duplicated, block: B:116:0x074a  */
    /* JADX WARN: Code duplicated, block: B:121:0x087a  */
    /* JADX WARN: Code duplicated, block: B:124:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x092f  */
    /* JADX WARN: Code duplicated, block: B:131:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0204  */
    /* JADX WARN: Code duplicated, block: B:66:0x020f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0217  */
    /* JADX WARN: Code duplicated, block: B:69:0x0219  */
    /* JADX WARN: Code duplicated, block: B:71:0x021c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0220 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0227  */
    /* JADX WARN: Code duplicated, block: B:78:0x0237  */
    /* JADX WARN: Code duplicated, block: B:79:0x0247  */
    /* JADX WARN: Code duplicated, block: B:80:0x0257  */
    /* JADX WARN: Code duplicated, block: B:81:0x0263  */
    /* JADX WARN: Code duplicated, block: B:82:0x026f  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:92:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:95:0x042f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0442  */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        byte b;
        String string;
        int i;
        String str;
        byte b2;
        int i2;
        CustomerDetails customerDetails;
        String email;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Context baseContext;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i3;
        int i4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i5 = 2 % 2;
        int i6 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i8 = 473739852 + ((i7 | 152454434) * 988);
        int i9 = ~i7;
        if (i6 != i8 + (((~(463359267 | i9)) | (-1604251644)) * (-1976)) + (((~(i7 | 1293346810)) | 152454434 | (~((-1293346811) | i9))) * 988)) {
            int i10 = (-453771538) % 2;
            throw new ArithmeticException();
        }
        int i11 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        if (i11 != 1667804949 + (((~(i12 | 2130395249)) | 448660715) * 191) + (((~((~i12) | 2130395249)) | 263306) * 191)) {
            throw null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_bank_transfer_payment);
        this.RemoteActionCompatParcelizer = new selectParentResolutionsByAspectRatio(this);
        this.INotificationSideChannelDefault = getIntent().getStringExtra("bank.type");
        this.connect.setSelectedTabIndicatorColor(((BaseActivity) this).b);
        this.INotificationSideChannelStub.setPageMargin(getResources().getDimensionPixelSize(R.dimen.twenty_dp));
        String str2 = this.INotificationSideChannelDefault;
        str2.hashCode();
        str2.hashCode();
        switch (str2.hashCode()) {
            case -1394897142:
                if (!str2.equals(PaymentType.BCA_VA)) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1384500083:
                if (!str2.equals(PaymentType.BNI_VA)) {
                    b = -1;
                } else {
                    int i13 = getItem + 101;
                    getRoot = i13 % 128;
                    int i14 = i13 % 2;
                    b = 1;
                }
                break;
            case -1380805999:
                if (!str2.equals(PaymentType.BRI_VA)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1171137990:
                if (str2.equals(PaymentType.ALL_VA)) {
                    int i15 = getItem + 85;
                    getRoot = i15 % 128;
                    int i16 = i15 % 2;
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -746273556:
                if (!str2.equals(PaymentType.PERMATA_VA)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 669135102:
                if (!str2.equals("echannel")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            string = getString(R.string.bank_bca_transfer);
        } else if (b == 1) {
            string = getString(R.string.bank_bni_transfer);
        } else {
            if (b != 2) {
                if (b != 3) {
                    if (b == 4) {
                        string = getString(R.string.bank_permata_transfer);
                        this.INotificationSideChannelStubProxy = new boolean[2];
                    } else if (b != 5) {
                        string = getString(R.string.bank_transfer);
                        i = 0;
                    } else {
                        string = getString(R.string.mandiri_bill_transfer);
                    }
                    i = 2;
                } else {
                    string = getString(R.string.other_bank_transfer);
                    this.INotificationSideChannelStubProxy = new boolean[3];
                }
                b(string);
                final sendCustomAction sendcustomaction = new sendCustomAction(this, str2, getSupportFragmentManager(), i);
                this.INotificationSideChannelStub.setAdapter(sendcustomaction);
                final ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.3
                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrollStateChanged(int i17) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrolled(int i17, float f, int i18) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageSelected(int i17) {
                        final int i18;
                        final int i19;
                        ViewPortBuilder.asInterface();
                        try {
                            Fragment item = sendcustomaction.getItem(i17);
                            if (!(item instanceof needToAddSensorResolutions) || BankTransferPaymentActivity.d(BankTransferPaymentActivity.this) == null) {
                                BankTransferPaymentActivity.a(BankTransferPaymentActivity.this);
                            } else {
                                final BankTransferPaymentActivity bankTransferPaymentActivity = BankTransferPaymentActivity.this;
                                needToAddSensorResolutions needtoaddsensorresolutions = (needToAddSensorResolutions) item;
                                int i20 = needtoaddsensorresolutions.getArguments() == null ? 0 : needtoaddsensorresolutions.getArguments().getInt("instruction.position");
                                bankTransferPaymentActivity.findViewById(R.id.other_atm_guidance).setVisibility(0);
                                if (i20 == 0) {
                                    bankTransferPaymentActivity.g.setImageResource(2131231683);
                                    bankTransferPaymentActivity.d.setText(R.string.preview_prima);
                                    bankTransferPaymentActivity.asInterface.setText(bankTransferPaymentActivity.getString(R.string.expand_link_prima));
                                    bankTransferPaymentActivity.INotificationSideChannel.setText(R.string.instruction_card_prima);
                                    bankTransferPaymentActivity.INotificationSideChannel.setCompoundDrawablesWithIntrinsicBounds(2131231682, 0, 0, 0);
                                    i18 = R.array.prima_banks;
                                    i19 = R.string.bank_list_header_prima;
                                } else if (i20 != 1) {
                                    bankTransferPaymentActivity.g.setImageResource(2131230892);
                                    bankTransferPaymentActivity.d.setText(R.string.preview_alto);
                                    bankTransferPaymentActivity.asInterface.setText(bankTransferPaymentActivity.getString(R.string.expand_link_alto));
                                    bankTransferPaymentActivity.INotificationSideChannel.setText(R.string.instruction_card_alto);
                                    bankTransferPaymentActivity.INotificationSideChannel.setCompoundDrawablesWithIntrinsicBounds(2131230891, 0, 0, 0);
                                    i18 = R.array.alto_banks;
                                    i19 = R.string.bank_list_header_alto;
                                } else {
                                    bankTransferPaymentActivity.g.setImageResource(2131230905);
                                    bankTransferPaymentActivity.d.setText(R.string.preview_atm_bersama);
                                    bankTransferPaymentActivity.asInterface.setText(bankTransferPaymentActivity.getString(R.string.expand_link_atm_bersama));
                                    bankTransferPaymentActivity.INotificationSideChannel.setText(R.string.instruction_card_atm_bersama);
                                    bankTransferPaymentActivity.INotificationSideChannel.setCompoundDrawablesWithIntrinsicBounds(2131230904, 0, 0, 0);
                                    i18 = R.array.atm_bersama_banks;
                                    i19 = R.string.bank_list_header_atm_bersama;
                                }
                                MidtransSDK midtransSDK = MidtransSDK.getInstance();
                                if (midtransSDK != null && midtransSDK.getColorTheme() != null) {
                                    bankTransferPaymentActivity.asInterface.setTextColor(midtransSDK.getColorTheme().getPrimaryDarkColor());
                                    bankTransferPaymentActivity.asInterface.setIconColorFilter(midtransSDK.getColorTheme().getPrimaryDarkColor());
                                }
                                bankTransferPaymentActivity.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                                        try {
                                            if (view.getId() == R.id.bank_toggle) {
                                                search searchVar = new search(BankTransferPaymentActivity.this.getResources().getStringArray(i18), view.getContext());
                                                final AppCompatDialog appCompatDialog = new AppCompatDialog(view.getContext());
                                                appCompatDialog.setContentView(R.layout.dialog_bank_list);
                                                RecyclerView recyclerView = (RecyclerView) appCompatDialog.findViewById(R.id.bank_list_items);
                                                recyclerView.setAdapter(searchVar);
                                                recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
                                                recyclerView.setHasFixedSize(true);
                                                ((DefaultTextView) appCompatDialog.findViewById(R.id.bank_list_title)).setText(BankTransferPaymentActivity.this.getString(i19));
                                                appCompatDialog.findViewById(R.id.bank_list_ok).setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.4.5
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                                                        try {
                                                            appCompatDialog.dismiss();
                                                        } finally {
                                                            ViewPortBuilder.b();
                                                        }
                                                    }
                                                });
                                                appCompatDialog.setCancelable(true);
                                                appCompatDialog.show();
                                            }
                                        } finally {
                                            ViewPortBuilder.b();
                                        }
                                    }
                                });
                            }
                        } finally {
                            ViewPortBuilder.d();
                        }
                    }
                };
                this.INotificationSideChannelStub.addOnPageChangeListener(onPageChangeListener);
                this.INotificationSideChannelStub.post(new Runnable() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        onPageChangeListener.onPageSelected(BankTransferPaymentActivity.asInterface(BankTransferPaymentActivity.this).getCurrentItem());
                    }
                });
                this.connect.setupWithViewPager(this.INotificationSideChannelStub);
                this.connect.addOnTabSelectedListener((TabLayout.BaseOnTabSelectedListener) new TabLayout.OnTabSelectedListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.5
                    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                    public final void onTabReselected(TabLayout.Tab tab) {
                    }

                    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                    public final void onTabSelected(TabLayout.Tab tab) {
                        BankTransferPaymentActivity.asInterface(BankTransferPaymentActivity.this).setCurrentItem(tab.getPosition());
                        Object[] objArr2 = {BankTransferPaymentActivity.this, Integer.valueOf(tab.getPosition())};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr2, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -494726943, 494726944, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }

                    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                    public final void onTabUnselected(TabLayout.Tab tab) {
                    }
                });
                str = this.INotificationSideChannelDefault;
                str.hashCode();
                str.hashCode();
                switch (str.hashCode()) {
                    case -1394897142:
                        if (str.equals(PaymentType.BCA_VA)) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case -1384500083:
                        if (str.equals(PaymentType.BNI_VA)) {
                            b2 = -1;
                        } else {
                            int i17 = getRoot + 19;
                            getItem = i17 % 128;
                            int i18 = i17 % 2;
                            b2 = 1;
                        }
                        break;
                    case -1380805999:
                        if (!str.equals(PaymentType.BRI_VA)) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1171137990:
                        if (str.equals(PaymentType.ALL_VA)) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case -746273556:
                        if (str.equals(PaymentType.PERMATA_VA)) {
                            b2 = -1;
                        } else {
                            i2 = getRoot + 57;
                            getItem = i2 % 128;
                            if (i2 % 2 == 0) {
                                b2 = 4;
                            } else {
                                b2 = 3;
                            }
                        }
                        break;
                    case 669135102:
                        if (str.equals("echannel")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    this.cancelAll = "Confirm Payment Bank Transfer BCA";
                    this.getInterfaceDescriptor = "Bank Transfer BCA Overview";
                    this.RemoteActionCompatParcelizer.b("Bank Transfer BCA Overview", false);
                } else if (b2 != 1) {
                    this.getInterfaceDescriptor = "Bank Transfer BNI Overview";
                    this.RemoteActionCompatParcelizer.b("Bank Transfer BNI Overview", false);
                } else if (b2 != 2) {
                    this.getInterfaceDescriptor = "Bank Transfer BRI Overview";
                    this.RemoteActionCompatParcelizer.b("Bank Transfer BRI Overview", false);
                } else if (b2 != 3) {
                    this.cancelAll = "Confirm Payment Bank Transfer All Bank";
                    this.getInterfaceDescriptor = "Bank Transfer Other Overview";
                    this.RemoteActionCompatParcelizer.b("Bank Transfer Other Overview", false);
                } else if (b2 != 4) {
                    this.cancelAll = "Confirm Payment Bank Transfer Permata";
                    this.getInterfaceDescriptor = "Bank Transfer Permata Overview";
                    this.RemoteActionCompatParcelizer.b("Bank Transfer Permata Overview", false);
                } else if (b2 == 5) {
                    this.cancelAll = "Confirm Payment Mandiri Bill";
                    this.getInterfaceDescriptor = "Bank Transfer Mandiri Overview";
                    this.RemoteActionCompatParcelizer.b("Bank Transfer Mandiri Overview", false);
                }
                this.notify.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.1
                    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                        try {
                            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity.this);
                            String strTrim = BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankTransferPaymentActivity.this).getText().toString().trim();
                            Object[] objArr2 = {BankTransferPaymentActivity.this, strTrim};
                            byte b3 = 0;
                            if (((Boolean) BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr2, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2109994744, 2109994746, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                                BankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1(BankTransferPaymentActivity.this);
                                if (!TextUtils.isEmpty(BankTransferPaymentActivity.b(BankTransferPaymentActivity.this))) {
                                    BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity.this).TuitionPaymentFragmentbindingInflater1(BankTransferPaymentActivity.b(BankTransferPaymentActivity.this), BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankTransferPaymentActivity.this));
                                }
                                selectParentResolutionsByAspectRatio selectparentresolutionsbyaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity.this);
                                String strG = BankTransferPaymentActivity.g(BankTransferPaymentActivity.this);
                                if (TextUtils.isEmpty(strG)) {
                                    ((selectParentResolutions) selectparentresolutionsbyaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a();
                                } else {
                                    String authenticationToken = MidtransSDK.getInstance().readAuthenticationToken();
                                    strG.hashCode();
                                    strG.hashCode();
                                    switch (strG.hashCode()) {
                                        case -1394897142:
                                            if (!strG.equals(PaymentType.BCA_VA)) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1384500083:
                                            if (!strG.equals(PaymentType.BNI_VA)) {
                                                b3 = -1;
                                            } else {
                                                b3 = 1;
                                            }
                                            break;
                                        case -1380805999:
                                            if (!strG.equals(PaymentType.BRI_VA)) {
                                                b3 = -1;
                                            } else {
                                                b3 = 2;
                                            }
                                            break;
                                        case -1171137990:
                                            if (!strG.equals(PaymentType.ALL_VA)) {
                                                b3 = -1;
                                            } else {
                                                b3 = 3;
                                            }
                                            break;
                                        case -746273556:
                                            if (!strG.equals(PaymentType.PERMATA_VA)) {
                                                b3 = -1;
                                            } else {
                                                b3 = 4;
                                            }
                                            break;
                                        case 669135102:
                                            if (!strG.equals("echannel")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 5;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    if (b3 == 0) {
                                        MidtransSDK.getInstance().paymentUsingBankTransferBCA(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.4
                                            public AnonymousClass4() {
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                            public final void onError(Throwable th) {
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onSuccess(TransactionResponse transactionResponse) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                            }
                                        });
                                    } else if (b3 == 1) {
                                        MidtransSDK.getInstance().paymentUsingBankTransferBni(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.1
                                            public AnonymousClass1() {
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                            public final void onError(Throwable th) {
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onSuccess(TransactionResponse transactionResponse) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                            }
                                        });
                                    } else if (b3 == 2) {
                                        MidtransSDK.getInstance().paymentUsingBankTransferBri(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.2
                                            private static final byte[] $$c = {5, 11, -122, -94};
                                            private static final int $$d = 25;
                                            private static int $10 = 0;
                                            private static int $11 = 1;
                                            private static final byte[] $$a = {106, -66, 28, 119, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                                            private static final int $$b = 1;
                                            private static int TuitionPaymentFragmentbindingInflater1 = 0;
                                            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60053, 60072, 60034, 60058, 60048, 60055, 60041, 60050, 60059, 60088, 60052, 60061, 60060, 60056, 60073, 60047, 60043, 60054, 59744, 60062, 60117, 60057, 60040, 60063, 59745};
                                            private static char b = 57188;

                                            public AnonymousClass2() {
                                            }

                                            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                                            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
                                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                                */
                                            private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
                                                /*
                                                    byte[] r0 = defpackage.selectParentResolutionsByAspectRatio.AnonymousClass2.$$a
                                                    int r5 = r5 * 52
                                                    int r5 = 56 - r5
                                                    int r1 = r7 + 1
                                                    int r6 = r6 * 14
                                                    int r6 = r6 + 84
                                                    byte[] r1 = new byte[r1]
                                                    r2 = -1
                                                    if (r0 != 0) goto L14
                                                    r3 = r6
                                                    r6 = r5
                                                    goto L29
                                                L14:
                                                    r4 = r6
                                                    r6 = r5
                                                    r5 = r4
                                                L17:
                                                    int r2 = r2 + 1
                                                    byte r3 = (byte) r5
                                                    r1[r2] = r3
                                                    if (r2 != r7) goto L27
                                                    java.lang.String r5 = new java.lang.String
                                                    r6 = 0
                                                    r5.<init>(r1, r6)
                                                    r8[r6] = r5
                                                    return
                                                L27:
                                                    r3 = r0[r6]
                                                L29:
                                                    int r5 = r5 + r3
                                                    int r6 = r6 + 1
                                                    int r5 = r5 + (-11)
                                                    goto L17
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.selectParentResolutionsByAspectRatio.AnonymousClass2.a(byte, byte, int, java.lang.Object[]):void");
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                            public final void onError(Throwable th) throws Throwable {
                                                int i19;
                                                Object[] objArr3;
                                                int i20 = 2 % 2;
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                                    int threadPriority = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                    int iMyPid = 44 - (Process.myPid() >> 22);
                                                    byte b4 = (byte) $$b;
                                                    byte b5 = $$a[7];
                                                    Object[] objArr4 = new Object[1];
                                                    a(b4, b5, (byte) (b5 | 52), objArr4);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, threadPriority, iMyPid, -459846511, false, (String) objArr4[0], null);
                                                }
                                                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                                                Object[] objArr5 = new Object[1];
                                                c(new char[]{4, 1, 21, '\b', '\f', 5, 24, 21, '\f', 20, 21, 0, 7, 2, 16, 15, 19, 7, '\n', 15, 14, 3}, (byte) (97 - ExpandableListView.getPackedPositionChild(0L)), 'F' - AndroidCharacter.getMirror('0'), objArr5);
                                                Class<?> cls = Class.forName((String) objArr5[0]);
                                                Object[] objArr6 = new Object[1];
                                                c(new char[]{15, '\t', 1, 18, 24, 17, 24, '\r', 18, 4, '\n', 20, '\f', 22, 13836}, (byte) (13 - View.resolveSize(0, 0)), ImageFormat.getBitsPerPixel(0) + 16, objArr6);
                                                long jLongValue2 = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int iResolveSize = 651 - View.resolveSize(0, 0);
                                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 44;
                                                    byte b6 = $$a[7];
                                                    Object[] objArr7 = new Object[1];
                                                    a(b6, (byte) $$b, b6, objArr7);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, iResolveSize, offsetBefore, -873460649, false, (String) objArr7[0], null);
                                                }
                                                if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                        int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
                                                        int iArgb = 44 - Color.argb(0, 0, 0, 0);
                                                        byte b7 = $$a[7];
                                                        byte b8 = b7;
                                                        Object[] objArr8 = new Object[1];
                                                        a(b7, b8, (byte) (b8 | 37), objArr8);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cCombineMeasuredStates, iCombineMeasuredStates, iArgb, -1595579076, false, (String) objArr8[0], null);
                                                    }
                                                    Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                                                    objArr3 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                                                    int i21 = ((int[]) objArr9[2])[0];
                                                    int i22 = ((int[]) objArr9[0])[0];
                                                    int i23 = ~((int) SystemClock.elapsedRealtime());
                                                    int i24 = 1731622945 + ((400423918 | i23) * 184) + (((~(i23 | 395164390)) | 13949866) * 184) + 1734221700;
                                                    int i25 = (i24 << 13) ^ i24;
                                                    int i26 = i25 ^ (i25 >>> 17);
                                                    ((int[]) objArr3[3])[0] = i26 ^ (i26 << 5);
                                                    i19 = 2;
                                                } else {
                                                    try {
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Process.myTid() >> 22), 1610 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 26, 2145681644, false, null, new Class[0]);
                                                        }
                                                        Object[] objArr10 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(null), 1734221700, 0};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                                            char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                            int i27 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                                                            int edgeSlop = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                            byte b9 = $$a[7];
                                                            Object[] objArr11 = new Object[1];
                                                            a(b9, (byte) $$b, b9, objArr11);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority2, i27, edgeSlop, 2075921419, false, (String) objArr11[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Gravity.getAbsoluteGravity(0, 0), 695 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 99 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 63406), 792 - MotionEvent.axisFromString(""), 83 - KeyEvent.normalizeMetaState(0)), Integer.TYPE, Integer.TYPE});
                                                        }
                                                        Object[] objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr10);
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                            char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                            int size = View.MeasureSpec.getSize(0) + 651;
                                                            int i28 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            byte b10 = $$a[7];
                                                            byte b11 = b10;
                                                            Object[] objArr13 = new Object[1];
                                                            a(b10, b11, (byte) (b11 | 37), objArr13);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, size, i28, -1595579076, false, (String) objArr13[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr12);
                                                        try {
                                                            Object[] objArr14 = new Object[1];
                                                            c(new char[]{4, 1, 21, '\b', '\f', 5, 24, 21, '\f', 20, 21, 0, 7, 2, 16, 15, 19, 7, '\n', 15, 14, 3}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 99), 22 - Gravity.getAbsoluteGravity(0, 0), objArr14);
                                                            Class<?> cls2 = Class.forName((String) objArr14[0]);
                                                            Object[] objArr15 = new Object[1];
                                                            c(new char[]{15, '\t', 1, 18, 24, 17, 24, '\r', 18, 4, '\n', 20, '\f', 22, 13836}, (byte) (13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 15 - View.MeasureSpec.getMode(0), objArr15);
                                                            long jLongValue3 = ((Long) cls2.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                            Long lValueOf = Long.valueOf(jLongValue3);
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                                                int i29 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                                                                int i30 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44;
                                                                byte b12 = $$a[7];
                                                                Object[] objArr16 = new Object[1];
                                                                a(b12, (byte) $$b, b12, objArr16);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, i29, i30, -873460649, false, (String) objArr16[0], null);
                                                            }
                                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf);
                                                            Long lValueOf2 = Long.valueOf(jLongValue3 >> 12);
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                                                char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                                                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 44;
                                                                byte b13 = (byte) $$b;
                                                                byte b14 = $$a[7];
                                                                Object[] objArr17 = new Object[1];
                                                                a(b13, b14, (byte) (b14 | 52), objArr17);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, maxKeyCode, offsetAfter, -459846511, false, (String) objArr17[0], null);
                                                            }
                                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf2);
                                                            int i31 = TuitionPaymentFragmentbindingInflater1 + 9;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
                                                            i19 = 2;
                                                            int i32 = i31 % 2;
                                                            objArr3 = objArr12;
                                                        } catch (Exception unused) {
                                                            throw new RuntimeException();
                                                        }
                                                    } catch (Throwable th2) {
                                                        Throwable cause = th2.getCause();
                                                        if (cause == null) {
                                                            throw th2;
                                                        }
                                                        throw cause;
                                                    }
                                                }
                                                int i33 = ((int[]) objArr3[0])[0];
                                                int i34 = ((int[]) objArr3[i19])[0];
                                                if (i34 == i33) {
                                                    int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                                                    TuitionPaymentFragmentbindingInflater1 = i35 % 128;
                                                    int i36 = i35 % i19;
                                                    Object[] objArr18 = new Object[4];
                                                    objArr18[0] = new int[]{i};
                                                    objArr18[i19] = new int[]{i};
                                                    objArr18[3] = new int[1];
                                                    int i37 = ((int[]) objArr3[3])[0];
                                                    int i38 = ((int[]) objArr3[i19])[0];
                                                    int i39 = ((int[]) objArr3[0])[0];
                                                    objArr18[1] = new String[0];
                                                    int iMyPid2 = Process.myPid();
                                                    int i40 = i37 + 1265398809 + (((~(709059390 | iMyPid2)) | 712490200) * (-366)) + (((~(iMyPid2 | 712507390)) | 709042200) * 366);
                                                    int i41 = (i40 << 13) ^ i40;
                                                    int i42 = i41 ^ (i41 >>> 17);
                                                    ((int[]) objArr18[3])[0] = i42 ^ (i42 << 5);
                                                } else {
                                                    ArrayList arrayList = new ArrayList();
                                                    String[] strArr = (String[]) objArr3[1];
                                                    if (strArr != null) {
                                                        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                                                        TuitionPaymentFragmentbindingInflater1 = i43 % 128;
                                                        int i44 = i43 % 2;
                                                        for (String str3 : strArr) {
                                                            arrayList.add(str3);
                                                        }
                                                    }
                                                    Toast.makeText((Context) null, i34 / (((i34 - 1) * i34) % 2), 0).show();
                                                    Object[] objArr19 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                                                    int i45 = ((int[]) objArr3[3])[0];
                                                    int i46 = ((int[]) objArr3[2])[0];
                                                    int i47 = ((int[]) objArr3[0])[0];
                                                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                    int i48 = ~iElapsedRealtime;
                                                    int i49 = i45 + (-1944118561) + (((~(i48 | (-612349625))) | 4957864 | (~((-8388675) | iElapsedRealtime))) * 717) + (((~(iElapsedRealtime | (-612349625))) | (~(i48 | (-8388675))) | 4957864) * 717);
                                                    int i50 = (i49 << 13) ^ i49;
                                                    int i51 = i50 ^ (i50 >>> 17);
                                                    ((int[]) objArr19[3])[0] = i51 ^ (i51 << 5);
                                                }
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                                int i19 = 2 % 2;
                                                int i20 = TuitionPaymentFragmentbindingInflater1 + 41;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                                                if (i20 % 2 != 0) {
                                                    selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                    ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                                } else {
                                                    selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                    ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                                    int i21 = 41 / 0;
                                                }
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onSuccess(TransactionResponse transactionResponse) {
                                                int i19 = 2 % 2;
                                                int i20 = TuitionPaymentFragmentbindingInflater1 + 67;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                                                int i21 = i20 % 2;
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                                                TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                                                if (i22 % 2 == 0) {
                                                    return;
                                                }
                                                Object obj = null;
                                                obj.hashCode();
                                                throw null;
                                            }

                                            private static void c(char[] cArr, byte b4, int i19, Object[] objArr3) throws Throwable {
                                                int i20;
                                                Object obj;
                                                int i21 = 2 % 2;
                                                deInitSession deinitsession = new deInitSession();
                                                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                int i22 = 1770390596;
                                                Object obj2 = null;
                                                int i23 = 3;
                                                if (cArr2 != null) {
                                                    int i24 = $11 + 101;
                                                    $10 = i24 % 128;
                                                    int i25 = i24 % 2;
                                                    int length = cArr2.length;
                                                    char[] cArr3 = new char[length];
                                                    int i26 = 0;
                                                    while (i26 < length) {
                                                        try {
                                                            Object[] objArr4 = {Integer.valueOf(cArr2[i26])};
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i22);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                byte b5 = (byte) i23;
                                                                byte b6 = (byte) (b5 - 3);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) Color.red(0), 2267 - Drawable.resolveOpacity(0, 0), View.getDefaultSize(0, 0) + 33, -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                                                            }
                                                            cArr3[i26] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr4)).charValue();
                                                            i26++;
                                                            i22 = 1770390596;
                                                            i23 = 3;
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
                                                    Object[] objArr5 = {Integer.valueOf(b)};
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                        byte b7 = (byte) 3;
                                                        byte b8 = (byte) (b7 - 3);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, -1927765101, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                                                    }
                                                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr5)).charValue();
                                                    char[] cArr4 = new char[i19];
                                                    if (i19 % 2 != 0) {
                                                        int i27 = $11 + 15;
                                                        $10 = i27 % 128;
                                                        int i28 = i27 % 2;
                                                        i20 = i19 - 1;
                                                        cArr4[i20] = (char) (cArr[i20] - b4);
                                                    } else {
                                                        i20 = i19;
                                                    }
                                                    if (i20 > 1) {
                                                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i20) {
                                                            int i29 = $11 + 45;
                                                            $10 = i29 % 128;
                                                            int i30 = i29 % 2;
                                                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                                int i31 = $11 + 45;
                                                                $10 = i31 % 128;
                                                                int i32 = i31 % 2;
                                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b4);
                                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b4);
                                                                obj = obj2;
                                                            } else {
                                                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                                    byte b9 = (byte) 2;
                                                                    byte b10 = (byte) (b9 - 2);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (Color.blue(0) + 49267), 3261 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 30 - (Process.myTid() >> 22), -127612708, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                                                }
                                                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr6)).intValue() == deinitsession.asBinder) {
                                                                    Object[] objArr7 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                                        byte b11 = (byte) 0;
                                                                        byte b12 = b11;
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (22877 - Process.getGidForName("")), 593 - TextUtils.indexOf((CharSequence) "", '0', 0), KeyEvent.getDeadChar(0, 0) + 17, 1570859318, false, $$e(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                                                    }
                                                                    obj = null;
                                                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr7)).intValue();
                                                                    int i33 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i33];
                                                                } else {
                                                                    obj = null;
                                                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                                        int i34 = $10 + 13;
                                                                        $11 = i34 % 128;
                                                                        int i35 = i34 % 2;
                                                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                                        int i36 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                                        int i37 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i36];
                                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i37];
                                                                    } else {
                                                                        int i38 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                                        int i39 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i38];
                                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i39];
                                                                    }
                                                                }
                                                            }
                                                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                                            obj2 = obj;
                                                        }
                                                    }
                                                    for (int i40 = 0; i40 < i19; i40++) {
                                                        int i41 = $10 + 105;
                                                        $11 = i41 % 128;
                                                        int i42 = i41 % 2;
                                                        cArr4[i40] = (char) (cArr4[i40] ^ 13722);
                                                    }
                                                    objArr3[0] = new String(cArr4);
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                        throw th2;
                                                    }
                                                    throw cause2;
                                                }
                                            }

                                            private static String $$e(int i19, byte b4, int i20) {
                                                int i21 = 116 - i19;
                                                byte[] bArr = $$c;
                                                int i22 = 3 - (b4 * 4);
                                                int i23 = i20 * 4;
                                                byte[] bArr2 = new byte[i23 + 1];
                                                int i24 = -1;
                                                if (bArr == null) {
                                                    int i25 = i22 + (-i23);
                                                    i22 = i22;
                                                    i21 = i25;
                                                }
                                                while (true) {
                                                    i24++;
                                                    bArr2[i24] = (byte) i21;
                                                    int i26 = i22 + 1;
                                                    if (i24 == i23) {
                                                        return new String(bArr2, 0);
                                                    }
                                                    i22 = i26;
                                                    i21 += -bArr[i26];
                                                }
                                            }
                                        });
                                    } else if (b3 == 3) {
                                        MidtransSDK.getInstance().paymentUsingBankTransferAllBank(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.3
                                            private static final byte[] $$c = {64, 73, -26, 82};
                                            private static final int $$f = 151;
                                            private static int $10 = 0;
                                            private static int $11 = 1;
                                            private static final byte[] $$d = {74, 60, 122, -26, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
                                            private static final int $$e = 23;
                                            private static final byte[] $$a = {48, -119, -71, 110, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
                                            private static final int $$b = 114;
                                            private static int d = 0;
                                            private static int asInterface = 1;
                                            private static char[] b = {47422, 47409, 47419, 47405, 47408, 47414, 47345, 47404, 47372, 47398, 47403, 47418, 47410, 47388, 47411, 47420, 47412, 47407, 47373, 47390, 47401, 47371, 47415, 47402};
                                            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719647;
                                            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                                            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

                                            public AnonymousClass3() {
                                            }

                                            private static void a(int i19, short s, byte b4, Object[] objArr3) {
                                                int i20 = (b4 * 14) + 84;
                                                int i21 = i19 + 4;
                                                byte[] bArr = $$a;
                                                byte[] bArr2 = new byte[53 - s];
                                                int i22 = 52 - s;
                                                int i23 = -1;
                                                if (bArr == null) {
                                                    i23 = -1;
                                                    i20 = (i22 + i21) - 10;
                                                    i21 = i21;
                                                }
                                                while (true) {
                                                    int i24 = i23 + 1;
                                                    bArr2[i24] = (byte) i20;
                                                    if (i24 == i22) {
                                                        objArr3[0] = new String(bArr2, 0);
                                                        return;
                                                    }
                                                    int i25 = i21 + 1;
                                                    i23 = i24;
                                                    i20 = (i20 + bArr[i25]) - 10;
                                                    i21 = i25;
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                                            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
                                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                                */
                                            private static void e(short r7, int r8, byte r9, java.lang.Object[] r10) {
                                                /*
                                                    byte[] r0 = defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.$$d
                                                    int r8 = r8 * 37
                                                    int r8 = 41 - r8
                                                    int r9 = r9 * 15
                                                    int r9 = r9 + 38
                                                    int r7 = r7 * 15
                                                    int r7 = 99 - r7
                                                    byte[] r1 = new byte[r9]
                                                    r2 = 0
                                                    if (r0 != 0) goto L17
                                                    r3 = r8
                                                    r8 = r9
                                                    r4 = r2
                                                    goto L2d
                                                L17:
                                                    r3 = r2
                                                L18:
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
                                                    int r3 = r3 + 1
                                                    int r8 = r8 + r7
                                                    int r7 = r8 + (-8)
                                                    r8 = r3
                                                    r3 = r4
                                                    goto L18
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.e(short, int, byte, java.lang.Object[]):void");
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                            public final void onError(Throwable th) {
                                                int i19 = 2 % 2;
                                                int i20 = d + 111;
                                                asInterface = i20 % 128;
                                                int i21 = i20 % 2;
                                                selectParentResolutionsByAspectRatio selectparentresolutionsbyaspectratio = selectParentResolutionsByAspectRatio.this;
                                                if (i21 != 0) {
                                                    ((selectParentResolutions) selectparentresolutionsbyaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                                                    return;
                                                }
                                                ((selectParentResolutions) selectparentresolutionsbyaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                                                Object obj = null;
                                                obj.hashCode();
                                                throw null;
                                            }

                                            private static void c(char[] cArr, int[] iArr, int i19, byte[] bArr, Object[] objArr3) throws Throwable {
                                                int i20 = 2;
                                                int i21 = 2 % 2;
                                                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                                                char[] cArr2 = b;
                                                long j2 = 0;
                                                int i22 = 0;
                                                if (cArr2 != null) {
                                                    int length = cArr2.length;
                                                    char[] cArr3 = new char[length];
                                                    int i23 = 0;
                                                    while (i23 < length) {
                                                        int i24 = $10 + 107;
                                                        $11 = i24 % 128;
                                                        int i25 = i24 % i20;
                                                        try {
                                                            Object[] objArr4 = new Object[1];
                                                            objArr4[i22] = Integer.valueOf(cArr2[i23]);
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                byte b4 = (byte) i22;
                                                                byte b5 = b4;
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (31340 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1))), 2993 - TextUtils.lastIndexOf("", '0'), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(i22) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i22) == 0.0d ? 0 : -1)), 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                                            }
                                                            cArr3[i23] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr4)).charValue();
                                                            i23++;
                                                            i20 = 2;
                                                            j2 = 0;
                                                            i22 = 0;
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
                                                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (43326 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 253 - (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                                                }
                                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr5)).intValue();
                                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                                                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i19] - iIntValue);
                                                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                            byte b6 = (byte) 0;
                                                            byte b7 = (byte) (b6 + 1);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (Color.rgb(0, 0, 0) + 16810818), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3085, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                                                        }
                                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr6);
                                                    }
                                                    objArr3[0] = new String(cArr4);
                                                    return;
                                                }
                                                int i26 = 0;
                                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                                                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i19] - iIntValue);
                                                        Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                            byte b8 = (byte) 0;
                                                            byte b9 = (byte) (b8 + 1);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (33602 - View.resolveSize(0, 0)), 3085 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0') + 27, -2146875848, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                                                        }
                                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr7);
                                                    }
                                                    objArr3[0] = new String(cArr5);
                                                    return;
                                                }
                                                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                                                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                                while (true) {
                                                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26;
                                                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                                        objArr3[0] = new String(cArr6);
                                                        return;
                                                    }
                                                    int i27 = $10 + 13;
                                                    $11 = i27 % 128;
                                                    int i28 = i27 % 2;
                                                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i19] - iIntValue);
                                                    i26 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                                                }
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onFailure(TransactionResponse transactionResponse, String str3) throws Throwable {
                                                Object[] objArr3;
                                                int i19 = 2 % 2;
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char tapTimeout = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                                                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                                                    int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                                                    byte[] bArr = $$a;
                                                    byte b4 = bArr[7];
                                                    Object[] objArr4 = new Object[1];
                                                    a(b4, (byte) (b4 & 52), bArr[37], objArr4);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, iResolveSizeAndState, capsMode, -1048449946, false, (String) objArr4[0], null);
                                                }
                                                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                                                Object[] objArr5 = new Object[1];
                                                c(null, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr5);
                                                Class<?> cls = Class.forName((String) objArr5[0]);
                                                Object[] objArr6 = new Object[1];
                                                c(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr6);
                                                long jLongValue2 = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                    char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                                    int i20 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                                                    int iResolveSizeAndState2 = 28 - View.resolveSizeAndState(0, 0, 0);
                                                    byte[] bArr2 = $$a;
                                                    byte b5 = bArr2[7];
                                                    byte b6 = bArr2[80];
                                                    Object[] objArr7 = new Object[1];
                                                    a(b5, b6, b6, objArr7);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(fadingEdgeLength, i20, iResolveSizeAndState2, -778300370, false, (String) objArr7[0], null);
                                                }
                                                if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                                                    int i21 = d + 23;
                                                    asInterface = i21 % 128;
                                                    int i22 = i21 % 2;
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                        char cBlue = (char) (31533 - Color.blue(0));
                                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                                                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                                                        byte[] bArr3 = $$a;
                                                        Object[] objArr8 = new Object[1];
                                                        a((byte) 51, bArr3[33], bArr3[80], objArr8);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cBlue, iLastIndexOf, keyRepeatDelay, -1142834547, false, (String) objArr8[0], null);
                                                    }
                                                    Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                                                    objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr9[1])[0]}, (Object[]) objArr9[2], new int[]{((int[]) objArr9[3])[0]}, (String[]) objArr9[4]};
                                                    int iIdentityHashCode = System.identityHashCode(this);
                                                    int i23 = ~iIdentityHashCode;
                                                    int i24 = 472914295 + (((~((-723096727) | i23)) | 704679940 | (~((-1050982918) | i23)) | (~(1069399703 | iIdentityHashCode))) * (-84));
                                                    int i25 = (~(iIdentityHashCode | (-1050982918))) | 723096726;
                                                    int i26 = ~(i23 | 1050982917);
                                                    int i27 = i24 + ((i25 | i26) * (-84)) + (((-1069399704) | i26) * 84) + 1130420970;
                                                    int i28 = (i27 << 13) ^ i27;
                                                    int i29 = i28 ^ (i28 >>> 17);
                                                    ((int[]) objArr3[0])[0] = i29 ^ (i29 << 5);
                                                } else {
                                                    Object[] objArr10 = new Object[1];
                                                    c(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr10);
                                                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                                                    Object[] objArr11 = new Object[1];
                                                    c(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr11);
                                                    Context applicationContext = (Context) cls2.getMethod((String) objArr11[0], new Class[0]).invoke(null, null);
                                                    if (applicationContext != null) {
                                                        int i30 = d + 71;
                                                        asInterface = i30 % 128;
                                                        int i31 = i30 % 2;
                                                        if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                                                            applicationContext = null;
                                                        } else {
                                                            applicationContext = applicationContext.getApplicationContext();
                                                            int i32 = asInterface + 43;
                                                            d = i32 % 128;
                                                            int i33 = i32 % 2;
                                                        }
                                                    }
                                                    int length = str3 != null ? str3.length() : 0;
                                                    int i34 = d + 71;
                                                    asInterface = i34 % 128;
                                                    int i35 = i34 % 2;
                                                    try {
                                                        Object[] objArr12 = {applicationContext, Integer.valueOf(length), 0, 1130420970};
                                                        byte[] bArr4 = $$d;
                                                        byte b7 = bArr4[51];
                                                        Object[] objArr13 = new Object[1];
                                                        e(b7, bArr4[74], b7, objArr13);
                                                        Class<?> cls3 = Class.forName((String) objArr13[0]);
                                                        byte b8 = bArr4[74];
                                                        Object[] objArr14 = new Object[1];
                                                        e(b8, bArr4[51], b8, objArr14);
                                                        objArr3 = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                            char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                                                            int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                                                            byte[] bArr5 = $$a;
                                                            Object[] objArr15 = new Object[1];
                                                            a((byte) 51, bArr5[33], bArr5[80], objArr15);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumFlingVelocity, iCombineMeasuredStates, packedPositionType, -1142834547, false, (String) objArr15[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr3);
                                                        try {
                                                            Object[] objArr16 = new Object[1];
                                                            c(null, null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                                                            Class<?> cls4 = Class.forName((String) objArr16[0]);
                                                            Object[] objArr17 = new Object[1];
                                                            c(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                                                            long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                            Long lValueOf = Long.valueOf(jLongValue3);
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                                                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                                                                int iBlue = 28 - Color.blue(0);
                                                                byte[] bArr6 = $$a;
                                                                byte b9 = bArr6[7];
                                                                byte b10 = bArr6[80];
                                                                Object[] objArr18 = new Object[1];
                                                                a(b9, b10, b10, objArr18);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, maximumDrawingCacheSize, iBlue, -778300370, false, (String) objArr18[0], null);
                                                            }
                                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf);
                                                            Long lValueOf2 = Long.valueOf(jLongValue3 >> 12);
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                                char capsMode2 = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                                                                int capsMode3 = 921 - TextUtils.getCapsMode("", 0, 0);
                                                                int iResolveSize = 28 - View.resolveSize(0, 0);
                                                                byte[] bArr7 = $$a;
                                                                byte b11 = bArr7[7];
                                                                Object[] objArr19 = new Object[1];
                                                                a(b11, (byte) (b11 & 52), bArr7[37], objArr19);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode2, capsMode3, iResolveSize, -1048449946, false, (String) objArr19[0], null);
                                                            }
                                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf2);
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
                                                int i36 = ((int[]) objArr3[1])[0];
                                                int i37 = ((int[]) objArr3[3])[0];
                                                if (i37 == i36) {
                                                    int i38 = ((int[]) objArr3[0])[0];
                                                    Object[] objArr20 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
                                                    int iIdentityHashCode2 = System.identityHashCode(this);
                                                    int i39 = ~iIdentityHashCode2;
                                                    int i40 = i38 + ((((~((-161827161) | i39)) | (~(968739835 | iIdentityHashCode2))) * 988) - 966894069) + (((~(iIdentityHashCode2 | (-967166969))) | 805339808 | (~(i39 | 968739835))) * 988);
                                                    int i41 = (i40 << 13) ^ i40;
                                                    int i42 = i41 ^ (i41 >>> 17);
                                                    ((int[]) objArr20[0])[0] = i42 ^ (i42 << 5);
                                                } else {
                                                    ArrayList arrayList = new ArrayList();
                                                    String[] strArr = (String[]) objArr3[4];
                                                    if (strArr != null) {
                                                        for (String str4 : strArr) {
                                                            arrayList.add(str4);
                                                        }
                                                    }
                                                    Toast.makeText((Context) null, i37 / (((i37 - 1) * i37) % 2), 0).show();
                                                    int i43 = ((int[]) objArr3[0])[0];
                                                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
                                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                    int i44 = ~elapsedCpuTime;
                                                    int i45 = i43 + 976312639 + ((elapsedCpuTime | 756877128) * 140) + (((~(756877128 | i44)) | 278937619) * (-280)) + (((~(elapsedCpuTime | (-278937620))) | (~(1017202515 | i44)) | 18612232) * 140);
                                                    int i46 = (i45 << 13) ^ i45;
                                                    int i47 = i46 ^ (i46 >>> 17);
                                                    ((int[]) objArr21[0])[0] = i47 ^ (i47 << 5);
                                                }
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onSuccess(TransactionResponse transactionResponse) {
                                                int i19 = 2 % 2;
                                                int i20 = asInterface + 21;
                                                d = i20 % 128;
                                                int i21 = i20 % 2;
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                                int i22 = d + 125;
                                                asInterface = i22 % 128;
                                                if (i22 % 2 == 0) {
                                                    int i23 = 0 / 0;
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                                            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
                                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                                */
                                            private static java.lang.String $$g(short r7, byte r8, short r9) {
                                                /*
                                                    int r9 = r9 * 3
                                                    int r9 = 1 - r9
                                                    int r7 = r7 * 4
                                                    int r7 = 4 - r7
                                                    byte[] r0 = defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.$$c
                                                    int r8 = 68 - r8
                                                    byte[] r1 = new byte[r9]
                                                    r2 = 0
                                                    if (r0 != 0) goto L15
                                                    r3 = r8
                                                    r4 = r2
                                                    r8 = r7
                                                    goto L29
                                                L15:
                                                    r3 = r2
                                                L16:
                                                    int r4 = r3 + 1
                                                    byte r5 = (byte) r8
                                                    r1[r3] = r5
                                                    if (r4 != r9) goto L23
                                                    java.lang.String r7 = new java.lang.String
                                                    r7.<init>(r1, r2)
                                                    return r7
                                                L23:
                                                    r3 = r0[r7]
                                                    r6 = r8
                                                    r8 = r7
                                                    r7 = r3
                                                    r3 = r6
                                                L29:
                                                    int r7 = r7 + r3
                                                    int r8 = r8 + 1
                                                    r3 = r4
                                                    r6 = r8
                                                    r8 = r7
                                                    r7 = r6
                                                    goto L16
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.$$g(short, byte, short):java.lang.String");
                                            }
                                        });
                                    } else if (b3 == 4) {
                                        MidtransSDK.getInstance().paymentUsingBankTransferPermata(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.5
                                            public AnonymousClass5() {
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                            public final void onError(Throwable th) {
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onSuccess(TransactionResponse transactionResponse) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                            }
                                        });
                                    } else if (b3 != 5) {
                                        ((selectParentResolutions) selectparentresolutionsbyaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a();
                                    } else {
                                        MidtransSDK.getInstance().paymentUsingMandiriBillPay(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.10
                                            public AnonymousClass10() {
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                            public final void onError(Throwable th) {
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                            }

                                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                            public final void onSuccess(TransactionResponse transactionResponse) {
                                                selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                                ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                            }
                                        });
                                    }
                                }
                            } else {
                                BankTransferPaymentActivity bankTransferPaymentActivity = BankTransferPaymentActivity.this;
                                Toast.makeText(bankTransferPaymentActivity, bankTransferPaymentActivity.getString(R.string.error_invalid_email_id), 0).show();
                            }
                        } finally {
                            ViewPortBuilder.b();
                        }
                    }
                });
                this.notify.setText(getString(R.string.pay_now));
                AppCompatEditText appCompatEditText = this.onTransact;
                customerDetails = this.RemoteActionCompatParcelizer.b().getTransaction().getCustomerDetails();
                if (customerDetails != null) {
                    int i19 = getRoot + 29;
                    getItem = i19 % 128;
                    int i20 = i19 % 2;
                    email = customerDetails.getEmail();
                } else {
                    email = "";
                }
                appCompatEditText.setText(email);
                this.onTransact.clearFocus();
                this.g = (ImageView) findViewById(R.id.bank_preview);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                    byte[] bArr = $$j;
                    byte b3 = bArr[28];
                    short s = bArr[5];
                    Object[] objArr2 = new Object[1];
                    m(b3, s, (byte) (s & 37), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iResolveSizeAndState, windowTouchSlop, -1650998592, false, (String) objArr2[0], null);
                }
                j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                n(new char[]{24419, 22343, 36309, 31927, 36129, 30658, 26913, 63011, 31989, 59871, 27006, 61134, 64791, 28510, 21227, 17881, 14716, 59017, 56518, 7726, 1274, 13068}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), new char[]{59996, 51785, 40335, 35077}, KeyEvent.getDeadChar(0, 0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                n(new char[]{64271, 46556, 22308, 45610, 62104, 56232, 40996, 46429, 55927, 35706, 52528, 62487, 9968, 51377, 4942}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 64498), new char[]{52554, 60191, 64811, 30971}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 736829278, objArr4);
                jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                    byte[] bArr2 = $$j;
                    byte b4 = bArr2[28];
                    short s2 = (short) (bArr2[12] + 1);
                    Object[] objArr5 = new Object[1];
                    m(b4, s2, (byte) (s2 | 16), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, windowTouchSlop2, doubleTapTimeout, 2012020043, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i21 = getRoot + 103;
                    getItem = i21 % 128;
                    int i22 = i21 % 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "") + 876;
                        int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr3 = $$j;
                        Object[] objArr6 = new Object[1];
                        m(bArr3[28], (short) ($$k & 376), (byte) (bArr3[1] + 1), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, iIndexOf, deadChar, 2012931276, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i23 = ~(325853716 | iIdentityHashCode);
                    int i24 = (((831275132 + (((-325922368) | i23) * (-814))) + ((i23 | ((~((~iIdentityHashCode) | 285543487)) | 285474836)) * 407)) + (((~(iIdentityHashCode | (-285543488))) | ((~((-325853717) | iIdentityHashCode)) | 285474836)) * 407)) - 951226918;
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
                } else {
                    baseContext = getBaseContext();
                    if (baseContext == null) {
                        Object[] objArr8 = new Object[1];
                        n(new char[]{2859, 61900, 25257, 17726, 19090, 27579, 969, 21060, 51317, 12327, 6244, 28648, 28347, 51811, 35206, 18488, 59057, 18862, 1859, 42063, 7836, 19588, 58208, 41169, 21275, 13924}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).length() + 57368), new char[]{52925, 38121, 6643, 39392}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        n(new char[]{26048, 60380, 42383, 1533, 49707, 56064, 58395, 33521, 59087, 22518, 5885, 54857, 9210, 1115, 512, 64111, 11251, 30320}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3092), new char[]{43952, 52207, 5284, 5388}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr9);
                        baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    }
                    if (baseContext != null) {
                        int i27 = getItem + 9;
                        getRoot = i27 % 128;
                        int i28 = i27 % 2;
                        if ((baseContext instanceof ContextWrapper) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                            baseContext = baseContext.getApplicationContext();
                        } else {
                            baseContext = null;
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    n(new char[]{12897, 15026, 21120, 45920, 30084, 11623, 7932, 35504, 5622, 20593, 24089, 24843, 19642, 12641, 57172, 42818}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 41817), new char[]{31967, 36090, 32171, 6819}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    n(new char[]{31803, 16547, 51141, 8023, 14698, 29380, 26567, 51766, 17477, 32363, 36014, 3107, 22450, 18000, 61516, 45893}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step5).substring(0, 3).length() + 58351), new char[]{61276, 9397, 61970, 37859}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step3).substring(35, 41).codePointAt(5) - 97, objArr11);
                    try {
                        Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -951226918};
                        byte b5 = $$m[17];
                        byte b6 = b5;
                        Object[] objArr13 = new Object[1];
                        o(b5, b6, b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = (byte) $$n;
                        byte b8 = b7;
                        Object[] objArr14 = new Object[1];
                        o(b7, b8, b8, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (baseContext != null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cRed = (char) Color.red(0);
                                int iGreen = 876 - Color.green(0);
                                int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                byte[] bArr4 = $$j;
                                Object[] objArr15 = new Object[1];
                                m(bArr4[28], (short) ($$k & 376), (byte) (bArr4[1] + 1), objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iGreen, minimumFlingVelocity, 2012931276, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                n(new char[]{24419, 22343, 36309, 31927, 36129, 30658, 26913, 63011, 31989, 59871, 27006, 61134, 64791, 28510, 21227, 17881, 14716, 59017, 56518, 7726, 1274, 13068}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_sample_valid_date).substring(0, 6).codePointAt(1) - 97), new char[]{59996, 51785, 40335, 35077}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                n(new char[]{64271, 46556, 22308, 45610, 62104, 56232, 40996, 46429, 55927, 35706, 52528, 62487, 9968, 51377, 4942}, new char[]{0, 0, 0, 0}, (char) (64509 - (ViewConfiguration.getWindowTouchSlop() >> 8)), new char[]{52554, 60191, 64811, 30971}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 736829353, objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                    int i29 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                                    int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                                    byte[] bArr5 = $$j;
                                    byte b9 = bArr5[28];
                                    short s3 = (short) (bArr5[12] + 1);
                                    Object[] objArr18 = new Object[1];
                                    m(b9, s3, (byte) (s3 | 16), objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i29, touchSlop, 2012020043, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                                    int iMyPid = 10 - (Process.myPid() >> 22);
                                    byte[] bArr6 = $$j;
                                    byte b10 = bArr6[28];
                                    short s4 = bArr6[5];
                                    Object[] objArr19 = new Object[1];
                                    m(b10, s4, (byte) (s4 & 37), objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarFadeDuration, iMyPid, -1650998592, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
                i3 = ((int[]) objArr[2])[0];
                i4 = ((int[]) objArr[0])[0];
                if (i4 == i3) {
                    int i30 = ((int[]) objArr[1])[0];
                    Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i31 = ~iIdentityHashCode2;
                    int i32 = i30 + (-12597380) + (((~(iIdentityHashCode2 | (-105778427))) | (~((-145826310) | i31)) | 105516080) * (-68)) + ((~((-262347) | i31)) * (-68)) + (((~(105778426 | i31)) | (-146088656)) * 68);
                    int i33 = (i32 << 13) ^ i32;
                    int i34 = i33 ^ (i33 >>> 17);
                    ((int[]) objArr20[1])[0] = i34 ^ (i34 << 5);
                } else {
                    Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
                    int i35 = ((int[]) objArr[1])[0];
                    Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int i36 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2093694423;
                    int i37 = ~i36;
                    int i38 = i35 + (-558092238) + (((~(i37 | (-515111053))) | 555421281) * (-1042)) + (((-515111053) | i36) * 521) + (((~(i36 | (-555421282))) | 554174049 | (~(i37 | (-513863821)))) * 521);
                    int i39 = (i38 << 13) ^ i38;
                    int i40 = i39 ^ (i39 >>> 17);
                    ((int[]) objArr21[1])[0] = i40 ^ (i40 << 5);
                }
                this.d = (DefaultTextView) findViewById(R.id.bank_description);
                this.asInterface = (FancyButton) findViewById(R.id.bank_toggle);
                this.INotificationSideChannel = (DefaultTextView) findViewById(R.id.card_description);
            }
            string = getString(R.string.bank_bri_transfer);
        }
        i = 3;
        b(string);
        final sendCustomAction sendcustomaction2 = new sendCustomAction(this, str2, getSupportFragmentManager(), i);
        this.INotificationSideChannelStub.setAdapter(sendcustomaction2);
        final ViewPager.OnPageChangeListener onPageChangeListener2 = new ViewPager.OnPageChangeListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.3
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i110) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i110, float f, int i111) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i110) {
                final int i111;
                final int i112;
                ViewPortBuilder.asInterface();
                try {
                    Fragment item = sendcustomaction2.getItem(i110);
                    if (!(item instanceof needToAddSensorResolutions) || BankTransferPaymentActivity.d(BankTransferPaymentActivity.this) == null) {
                        BankTransferPaymentActivity.a(BankTransferPaymentActivity.this);
                    } else {
                        final BankTransferPaymentActivity bankTransferPaymentActivity = BankTransferPaymentActivity.this;
                        needToAddSensorResolutions needtoaddsensorresolutions = (needToAddSensorResolutions) item;
                        int i210 = needtoaddsensorresolutions.getArguments() == null ? 0 : needtoaddsensorresolutions.getArguments().getInt("instruction.position");
                        bankTransferPaymentActivity.findViewById(R.id.other_atm_guidance).setVisibility(0);
                        if (i210 == 0) {
                            bankTransferPaymentActivity.g.setImageResource(2131231683);
                            bankTransferPaymentActivity.d.setText(R.string.preview_prima);
                            bankTransferPaymentActivity.asInterface.setText(bankTransferPaymentActivity.getString(R.string.expand_link_prima));
                            bankTransferPaymentActivity.INotificationSideChannel.setText(R.string.instruction_card_prima);
                            bankTransferPaymentActivity.INotificationSideChannel.setCompoundDrawablesWithIntrinsicBounds(2131231682, 0, 0, 0);
                            i111 = R.array.prima_banks;
                            i112 = R.string.bank_list_header_prima;
                        } else if (i210 != 1) {
                            bankTransferPaymentActivity.g.setImageResource(2131230892);
                            bankTransferPaymentActivity.d.setText(R.string.preview_alto);
                            bankTransferPaymentActivity.asInterface.setText(bankTransferPaymentActivity.getString(R.string.expand_link_alto));
                            bankTransferPaymentActivity.INotificationSideChannel.setText(R.string.instruction_card_alto);
                            bankTransferPaymentActivity.INotificationSideChannel.setCompoundDrawablesWithIntrinsicBounds(2131230891, 0, 0, 0);
                            i111 = R.array.alto_banks;
                            i112 = R.string.bank_list_header_alto;
                        } else {
                            bankTransferPaymentActivity.g.setImageResource(2131230905);
                            bankTransferPaymentActivity.d.setText(R.string.preview_atm_bersama);
                            bankTransferPaymentActivity.asInterface.setText(bankTransferPaymentActivity.getString(R.string.expand_link_atm_bersama));
                            bankTransferPaymentActivity.INotificationSideChannel.setText(R.string.instruction_card_atm_bersama);
                            bankTransferPaymentActivity.INotificationSideChannel.setCompoundDrawablesWithIntrinsicBounds(2131230904, 0, 0, 0);
                            i111 = R.array.atm_bersama_banks;
                            i112 = R.string.bank_list_header_atm_bersama;
                        }
                        MidtransSDK midtransSDK = MidtransSDK.getInstance();
                        if (midtransSDK != null && midtransSDK.getColorTheme() != null) {
                            bankTransferPaymentActivity.asInterface.setTextColor(midtransSDK.getColorTheme().getPrimaryDarkColor());
                            bankTransferPaymentActivity.asInterface.setIconColorFilter(midtransSDK.getColorTheme().getPrimaryDarkColor());
                        }
                        bankTransferPaymentActivity.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                                try {
                                    if (view.getId() == R.id.bank_toggle) {
                                        search searchVar = new search(BankTransferPaymentActivity.this.getResources().getStringArray(i111), view.getContext());
                                        final AppCompatDialog appCompatDialog = new AppCompatDialog(view.getContext());
                                        appCompatDialog.setContentView(R.layout.dialog_bank_list);
                                        RecyclerView recyclerView = (RecyclerView) appCompatDialog.findViewById(R.id.bank_list_items);
                                        recyclerView.setAdapter(searchVar);
                                        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
                                        recyclerView.setHasFixedSize(true);
                                        ((DefaultTextView) appCompatDialog.findViewById(R.id.bank_list_title)).setText(BankTransferPaymentActivity.this.getString(i112));
                                        appCompatDialog.findViewById(R.id.bank_list_ok).setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.4.5
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                                                try {
                                                    appCompatDialog.dismiss();
                                                } finally {
                                                    ViewPortBuilder.b();
                                                }
                                            }
                                        });
                                        appCompatDialog.setCancelable(true);
                                        appCompatDialog.show();
                                    }
                                } finally {
                                    ViewPortBuilder.b();
                                }
                            }
                        });
                    }
                } finally {
                    ViewPortBuilder.d();
                }
            }
        };
        this.INotificationSideChannelStub.addOnPageChangeListener(onPageChangeListener2);
        this.INotificationSideChannelStub.post(new Runnable() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.2
            @Override // java.lang.Runnable
            public final void run() {
                onPageChangeListener2.onPageSelected(BankTransferPaymentActivity.asInterface(BankTransferPaymentActivity.this).getCurrentItem());
            }
        });
        this.connect.setupWithViewPager(this.INotificationSideChannelStub);
        this.connect.addOnTabSelectedListener((TabLayout.BaseOnTabSelectedListener) new TabLayout.OnTabSelectedListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.5
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                BankTransferPaymentActivity.asInterface(BankTransferPaymentActivity.this).setCurrentItem(tab.getPosition());
                Object[] objArr22 = {BankTransferPaymentActivity.this, Integer.valueOf(tab.getPosition())};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr22, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -494726943, 494726944, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }
        });
        str = this.INotificationSideChannelDefault;
        str.hashCode();
        str.hashCode();
        switch (str.hashCode()) {
            case -1394897142:
                if (str.equals(PaymentType.BCA_VA)) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1384500083:
                if (str.equals(PaymentType.BNI_VA)) {
                    b2 = -1;
                } else {
                    int i110 = getRoot + 19;
                    getItem = i110 % 128;
                    int i111 = i110 % 2;
                    b2 = 1;
                }
                break;
            case -1380805999:
                if (!str.equals(PaymentType.BRI_VA)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                break;
            case -1171137990:
                if (str.equals(PaymentType.ALL_VA)) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -746273556:
                if (str.equals(PaymentType.PERMATA_VA)) {
                    b2 = -1;
                } else {
                    i2 = getRoot + 57;
                    getItem = i2 % 128;
                    if (i2 % 2 == 0) {
                        b2 = 4;
                    } else {
                        b2 = 3;
                    }
                }
                break;
            case 669135102:
                if (str.equals("echannel")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            this.cancelAll = "Confirm Payment Bank Transfer BCA";
            this.getInterfaceDescriptor = "Bank Transfer BCA Overview";
            this.RemoteActionCompatParcelizer.b("Bank Transfer BCA Overview", false);
        } else if (b2 != 1) {
            this.getInterfaceDescriptor = "Bank Transfer BNI Overview";
            this.RemoteActionCompatParcelizer.b("Bank Transfer BNI Overview", false);
        } else if (b2 != 2) {
            this.getInterfaceDescriptor = "Bank Transfer BRI Overview";
            this.RemoteActionCompatParcelizer.b("Bank Transfer BRI Overview", false);
        } else if (b2 != 3) {
            this.cancelAll = "Confirm Payment Bank Transfer All Bank";
            this.getInterfaceDescriptor = "Bank Transfer Other Overview";
            this.RemoteActionCompatParcelizer.b("Bank Transfer Other Overview", false);
        } else if (b2 != 4) {
            this.cancelAll = "Confirm Payment Bank Transfer Permata";
            this.getInterfaceDescriptor = "Bank Transfer Permata Overview";
            this.RemoteActionCompatParcelizer.b("Bank Transfer Permata Overview", false);
        } else if (b2 == 5) {
            this.cancelAll = "Confirm Payment Mandiri Bill";
            this.getInterfaceDescriptor = "Bank Transfer Mandiri Overview";
            this.RemoteActionCompatParcelizer.b("Bank Transfer Mandiri Overview", false);
        }
        this.notify.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.1
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity.this);
                    String strTrim = BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankTransferPaymentActivity.this).getText().toString().trim();
                    Object[] objArr22 = {BankTransferPaymentActivity.this, strTrim};
                    byte b11 = 0;
                    if (((Boolean) BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr22, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2109994744, 2109994746, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                        BankTransferPaymentActivity.TuitionPaymentFragmentbindingInflater1(BankTransferPaymentActivity.this);
                        if (!TextUtils.isEmpty(BankTransferPaymentActivity.b(BankTransferPaymentActivity.this))) {
                            BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity.this).TuitionPaymentFragmentbindingInflater1(BankTransferPaymentActivity.b(BankTransferPaymentActivity.this), BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankTransferPaymentActivity.this));
                        }
                        selectParentResolutionsByAspectRatio selectparentresolutionsbyaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BankTransferPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity.this);
                        String strG = BankTransferPaymentActivity.g(BankTransferPaymentActivity.this);
                        if (TextUtils.isEmpty(strG)) {
                            ((selectParentResolutions) selectparentresolutionsbyaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a();
                        } else {
                            String authenticationToken = MidtransSDK.getInstance().readAuthenticationToken();
                            strG.hashCode();
                            strG.hashCode();
                            switch (strG.hashCode()) {
                                case -1394897142:
                                    if (!strG.equals(PaymentType.BCA_VA)) {
                                        b11 = -1;
                                    }
                                    break;
                                case -1384500083:
                                    if (!strG.equals(PaymentType.BNI_VA)) {
                                        b11 = -1;
                                    } else {
                                        b11 = 1;
                                    }
                                    break;
                                case -1380805999:
                                    if (!strG.equals(PaymentType.BRI_VA)) {
                                        b11 = -1;
                                    } else {
                                        b11 = 2;
                                    }
                                    break;
                                case -1171137990:
                                    if (!strG.equals(PaymentType.ALL_VA)) {
                                        b11 = -1;
                                    } else {
                                        b11 = 3;
                                    }
                                    break;
                                case -746273556:
                                    if (!strG.equals(PaymentType.PERMATA_VA)) {
                                        b11 = -1;
                                    } else {
                                        b11 = 4;
                                    }
                                    break;
                                case 669135102:
                                    if (!strG.equals("echannel")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 5;
                                    }
                                    break;
                                default:
                                    b11 = -1;
                                    break;
                            }
                            if (b11 == 0) {
                                MidtransSDK.getInstance().paymentUsingBankTransferBCA(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.4
                                    public AnonymousClass4() {
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                    public final void onError(Throwable th2) {
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onSuccess(TransactionResponse transactionResponse) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                    }
                                });
                            } else if (b11 == 1) {
                                MidtransSDK.getInstance().paymentUsingBankTransferBni(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.1
                                    public AnonymousClass1() {
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                    public final void onError(Throwable th2) {
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onSuccess(TransactionResponse transactionResponse) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                    }
                                });
                            } else if (b11 == 2) {
                                MidtransSDK.getInstance().paymentUsingBankTransferBri(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.2
                                    private static final byte[] $$c = {5, 11, -122, -94};
                                    private static final int $$d = 25;
                                    private static int $10 = 0;
                                    private static int $11 = 1;
                                    private static final byte[] $$a = {106, -66, 28, 119, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                                    private static final int $$b = 1;
                                    private static int TuitionPaymentFragmentbindingInflater1 = 0;
                                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60053, 60072, 60034, 60058, 60048, 60055, 60041, 60050, 60059, 60088, 60052, 60061, 60060, 60056, 60073, 60047, 60043, 60054, 59744, 60062, 60117, 60057, 60040, 60063, 59745};
                                    private static char b = 57188;

                                    public AnonymousClass2() {
                                    }

                                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                        */
                                    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
                                        /*
                                            byte[] r0 = defpackage.selectParentResolutionsByAspectRatio.AnonymousClass2.$$a
                                            int r5 = r5 * 52
                                            int r5 = 56 - r5
                                            int r1 = r7 + 1
                                            int r6 = r6 * 14
                                            int r6 = r6 + 84
                                            byte[] r1 = new byte[r1]
                                            r2 = -1
                                            if (r0 != 0) goto L14
                                            r3 = r6
                                            r6 = r5
                                            goto L29
                                        L14:
                                            r4 = r6
                                            r6 = r5
                                            r5 = r4
                                        L17:
                                            int r2 = r2 + 1
                                            byte r3 = (byte) r5
                                            r1[r2] = r3
                                            if (r2 != r7) goto L27
                                            java.lang.String r5 = new java.lang.String
                                            r6 = 0
                                            r5.<init>(r1, r6)
                                            r8[r6] = r5
                                            return
                                        L27:
                                            r3 = r0[r6]
                                        L29:
                                            int r5 = r5 + r3
                                            int r6 = r6 + 1
                                            int r5 = r5 + (-11)
                                            goto L17
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.selectParentResolutionsByAspectRatio.AnonymousClass2.a(byte, byte, int, java.lang.Object[]):void");
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                    public final void onError(Throwable th2) throws Throwable {
                                        int i112;
                                        Object[] objArr23;
                                        int i210 = 2 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                            int threadPriority = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            int iMyPid2 = 44 - (Process.myPid() >> 22);
                                            byte b12 = (byte) $$b;
                                            byte b13 = $$a[7];
                                            Object[] objArr24 = new Object[1];
                                            a(b12, b13, (byte) (b13 | 52), objArr24);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, threadPriority, iMyPid2, -459846511, false, (String) objArr24[0], null);
                                        }
                                        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                                        Object[] objArr25 = new Object[1];
                                        c(new char[]{4, 1, 21, '\b', '\f', 5, 24, 21, '\f', 20, 21, 0, 7, 2, 16, 15, 19, 7, '\n', 15, 14, 3}, (byte) (97 - ExpandableListView.getPackedPositionChild(0L)), 'F' - AndroidCharacter.getMirror('0'), objArr25);
                                        Class<?> cls6 = Class.forName((String) objArr25[0]);
                                        Object[] objArr26 = new Object[1];
                                        c(new char[]{15, '\t', 1, 18, 24, 17, 24, '\r', 18, 4, '\n', 20, '\f', 22, 13836}, (byte) (13 - View.resolveSize(0, 0)), ImageFormat.getBitsPerPixel(0) + 16, objArr26);
                                        long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr26[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int iResolveSize = 651 - View.resolveSize(0, 0);
                                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 44;
                                            byte b14 = $$a[7];
                                            Object[] objArr27 = new Object[1];
                                            a(b14, (byte) $$b, b14, objArr27);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iResolveSize, offsetBefore, -873460649, false, (String) objArr27[0], null);
                                        }
                                        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
                                                int iArgb = 44 - Color.argb(0, 0, 0, 0);
                                                byte b15 = $$a[7];
                                                byte b16 = b15;
                                                Object[] objArr28 = new Object[1];
                                                a(b15, b16, (byte) (b16 | 37), objArr28);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cCombineMeasuredStates, iCombineMeasuredStates, iArgb, -1595579076, false, (String) objArr28[0], null);
                                            }
                                            Object[] objArr29 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                                            objArr23 = new Object[]{new int[]{i22}, new String[0], new int[]{i21}, new int[1]};
                                            int i211 = ((int[]) objArr29[2])[0];
                                            int i212 = ((int[]) objArr29[0])[0];
                                            int i213 = ~((int) SystemClock.elapsedRealtime());
                                            int i214 = 1731622945 + ((400423918 | i213) * 184) + (((~(i213 | 395164390)) | 13949866) * 184) + 1734221700;
                                            int i215 = (i214 << 13) ^ i214;
                                            int i216 = i215 ^ (i215 >>> 17);
                                            ((int[]) objArr23[3])[0] = i216 ^ (i216 << 5);
                                            i112 = 2;
                                        } else {
                                            try {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Process.myTid() >> 22), 1610 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 26, 2145681644, false, null, new Class[0]);
                                                }
                                                Object[] objArr110 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(null), 1734221700, 0};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                    int i217 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                                                    int edgeSlop = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    byte b17 = $$a[7];
                                                    Object[] objArr111 = new Object[1];
                                                    a(b17, (byte) $$b, b17, objArr111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority2, i217, edgeSlop, 2075921419, false, (String) objArr111[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Gravity.getAbsoluteGravity(0, 0), 695 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 99 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 63406), 792 - MotionEvent.axisFromString(""), 83 - KeyEvent.normalizeMetaState(0)), Integer.TYPE, Integer.TYPE});
                                                }
                                                Object[] objArr112 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr110);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                    char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                    int size = View.MeasureSpec.getSize(0) + 651;
                                                    int i218 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    byte b18 = $$a[7];
                                                    byte b19 = b18;
                                                    Object[] objArr113 = new Object[1];
                                                    a(b18, b19, (byte) (b19 | 37), objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, size, i218, -1595579076, false, (String) objArr113[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr112);
                                                try {
                                                    Object[] objArr114 = new Object[1];
                                                    c(new char[]{4, 1, 21, '\b', '\f', 5, 24, 21, '\f', 20, 21, 0, 7, 2, 16, 15, 19, 7, '\n', 15, 14, 3}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 99), 22 - Gravity.getAbsoluteGravity(0, 0), objArr114);
                                                    Class<?> cls7 = Class.forName((String) objArr114[0]);
                                                    Object[] objArr115 = new Object[1];
                                                    c(new char[]{15, '\t', 1, 18, 24, 17, 24, '\r', 18, 4, '\n', 20, '\f', 22, 13836}, (byte) (13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 15 - View.MeasureSpec.getMode(0), objArr115);
                                                    long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr115[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf3 = Long.valueOf(jLongValue4);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                                        int i219 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                                                        int i310 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44;
                                                        byte b110 = $$a[7];
                                                        Object[] objArr116 = new Object[1];
                                                        a(b110, (byte) $$b, b110, objArr116);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, i219, i310, -873460649, false, (String) objArr116[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                                                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                                        char c4 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                                                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 44;
                                                        byte b111 = (byte) $$b;
                                                        byte b112 = $$a[7];
                                                        Object[] objArr117 = new Object[1];
                                                        a(b111, b112, (byte) (b112 | 52), objArr117);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, maxKeyCode, offsetAfter, -459846511, false, (String) objArr117[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                                                    int i311 = TuitionPaymentFragmentbindingInflater1 + 9;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i311 % 128;
                                                    i112 = 2;
                                                    int i312 = i311 % 2;
                                                    objArr23 = objArr112;
                                                } catch (Exception unused2) {
                                                    throw new RuntimeException();
                                                }
                                            } catch (Throwable th3) {
                                                Throwable cause2 = th3.getCause();
                                                if (cause2 == null) {
                                                    throw th3;
                                                }
                                                throw cause2;
                                            }
                                        }
                                        int i313 = ((int[]) objArr23[0])[0];
                                        int i314 = ((int[]) objArr23[i112])[0];
                                        if (i314 == i313) {
                                            int i315 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                                            TuitionPaymentFragmentbindingInflater1 = i315 % 128;
                                            int i316 = i315 % i112;
                                            Object[] objArr118 = new Object[4];
                                            objArr118[0] = new int[]{i39};
                                            objArr118[i112] = new int[]{i38};
                                            objArr118[3] = new int[1];
                                            int i317 = ((int[]) objArr23[3])[0];
                                            int i318 = ((int[]) objArr23[i112])[0];
                                            int i319 = ((int[]) objArr23[0])[0];
                                            objArr118[1] = new String[0];
                                            int iMyPid3 = Process.myPid();
                                            int i41 = i317 + 1265398809 + (((~(709059390 | iMyPid3)) | 712490200) * (-366)) + (((~(iMyPid3 | 712507390)) | 709042200) * 366);
                                            int i42 = (i41 << 13) ^ i41;
                                            int i43 = i42 ^ (i42 >>> 17);
                                            ((int[]) objArr118[3])[0] = i43 ^ (i43 << 5);
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            String[] strArr = (String[]) objArr23[1];
                                            if (strArr != null) {
                                                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                                                TuitionPaymentFragmentbindingInflater1 = i44 % 128;
                                                int i45 = i44 % 2;
                                                for (String str3 : strArr) {
                                                    arrayList.add(str3);
                                                }
                                            }
                                            Toast.makeText((Context) null, i314 / (((i314 - 1) * i314) % 2), 0).show();
                                            Object[] objArr119 = {new int[]{i47}, new String[0], new int[]{i46}, new int[1]};
                                            int i46 = ((int[]) objArr23[3])[0];
                                            int i47 = ((int[]) objArr23[2])[0];
                                            int i48 = ((int[]) objArr23[0])[0];
                                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            int i49 = ~iElapsedRealtime;
                                            int i410 = i46 + (-1944118561) + (((~(i49 | (-612349625))) | 4957864 | (~((-8388675) | iElapsedRealtime))) * 717) + (((~(iElapsedRealtime | (-612349625))) | (~(i49 | (-8388675))) | 4957864) * 717);
                                            int i50 = (i410 << 13) ^ i410;
                                            int i51 = i50 ^ (i50 >>> 17);
                                            ((int[]) objArr119[3])[0] = i51 ^ (i51 << 5);
                                        }
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                        int i112 = 2 % 2;
                                        int i210 = TuitionPaymentFragmentbindingInflater1 + 41;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i210 % 128;
                                        if (i210 % 2 != 0) {
                                            selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                            ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                        } else {
                                            selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                            ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                            int i211 = 41 / 0;
                                        }
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onSuccess(TransactionResponse transactionResponse) {
                                        int i112 = 2 % 2;
                                        int i210 = TuitionPaymentFragmentbindingInflater1 + 67;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i210 % 128;
                                        int i211 = i210 % 2;
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                        int i212 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                                        TuitionPaymentFragmentbindingInflater1 = i212 % 128;
                                        if (i212 % 2 == 0) {
                                            return;
                                        }
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }

                                    private static void c(char[] cArr, byte b12, int i112, Object[] objArr23) throws Throwable {
                                        int i210;
                                        Object obj;
                                        int i211 = 2 % 2;
                                        deInitSession deinitsession = new deInitSession();
                                        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i212 = 1770390596;
                                        Object obj2 = null;
                                        int i213 = 3;
                                        if (cArr2 != null) {
                                            int i214 = $11 + 101;
                                            $10 = i214 % 128;
                                            int i215 = i214 % 2;
                                            int length = cArr2.length;
                                            char[] cArr3 = new char[length];
                                            int i216 = 0;
                                            while (i216 < length) {
                                                try {
                                                    Object[] objArr24 = {Integer.valueOf(cArr2[i216])};
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i212);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                        byte b13 = (byte) i213;
                                                        byte b14 = (byte) (b13 - 3);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) Color.red(0), 2267 - Drawable.resolveOpacity(0, 0), View.getDefaultSize(0, 0) + 33, -1927765101, false, $$e(b13, b14, b14), new Class[]{Integer.TYPE});
                                                    }
                                                    cArr3[i216] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24)).charValue();
                                                    i216++;
                                                    i212 = 1770390596;
                                                    i213 = 3;
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                        throw th2;
                                                    }
                                                    throw cause2;
                                                }
                                            }
                                            cArr2 = cArr3;
                                        }
                                        try {
                                            Object[] objArr25 = {Integer.valueOf(b)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                byte b15 = (byte) 3;
                                                byte b16 = (byte) (b15 - 3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, -1927765101, false, $$e(b15, b16, b16), new Class[]{Integer.TYPE});
                                            }
                                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr25)).charValue();
                                            char[] cArr4 = new char[i112];
                                            if (i112 % 2 != 0) {
                                                int i217 = $11 + 15;
                                                $10 = i217 % 128;
                                                int i218 = i217 % 2;
                                                i210 = i112 - 1;
                                                cArr4[i210] = (char) (cArr[i210] - b12);
                                            } else {
                                                i210 = i112;
                                            }
                                            if (i210 > 1) {
                                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i210) {
                                                    int i219 = $11 + 45;
                                                    $10 = i219 % 128;
                                                    int i310 = i219 % 2;
                                                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                        int i311 = $11 + 45;
                                                        $10 = i311 % 128;
                                                        int i312 = i311 % 2;
                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b12);
                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b12);
                                                        obj = obj2;
                                                    } else {
                                                        Object[] objArr26 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                            byte b17 = (byte) 2;
                                                            byte b18 = (byte) (b17 - 2);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (Color.blue(0) + 49267), 3261 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 30 - (Process.myTid() >> 22), -127612708, false, $$e(b17, b18, b18), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                                        }
                                                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr26)).intValue() == deinitsession.asBinder) {
                                                            Object[] objArr27 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                                byte b19 = (byte) 0;
                                                                byte b110 = b19;
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (22877 - Process.getGidForName("")), 593 - TextUtils.indexOf((CharSequence) "", '0', 0), KeyEvent.getDeadChar(0, 0) + 17, 1570859318, false, $$e(b19, b110, b110), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                                            }
                                                            obj = null;
                                                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr27)).intValue();
                                                            int i313 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i313];
                                                        } else {
                                                            obj = null;
                                                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                                int i314 = $10 + 13;
                                                                $11 = i314 % 128;
                                                                int i315 = i314 % 2;
                                                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                                int i316 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                                int i317 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i316];
                                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i317];
                                                            } else {
                                                                int i318 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                                int i319 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i318];
                                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i319];
                                                            }
                                                        }
                                                    }
                                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                                    obj2 = obj;
                                                }
                                            }
                                            for (int i41 = 0; i41 < i112; i41++) {
                                                int i42 = $10 + 105;
                                                $11 = i42 % 128;
                                                int i43 = i42 % 2;
                                                cArr4[i41] = (char) (cArr4[i41] ^ 13722);
                                            }
                                            objArr23[0] = new String(cArr4);
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 == null) {
                                                throw th3;
                                            }
                                            throw cause3;
                                        }
                                    }

                                    private static String $$e(int i112, byte b12, int i210) {
                                        int i211 = 116 - i112;
                                        byte[] bArr7 = $$c;
                                        int i212 = 3 - (b12 * 4);
                                        int i213 = i210 * 4;
                                        byte[] bArr8 = new byte[i213 + 1];
                                        int i214 = -1;
                                        if (bArr7 == null) {
                                            int i215 = i212 + (-i213);
                                            i212 = i212;
                                            i211 = i215;
                                        }
                                        while (true) {
                                            i214++;
                                            bArr8[i214] = (byte) i211;
                                            int i216 = i212 + 1;
                                            if (i214 == i213) {
                                                return new String(bArr8, 0);
                                            }
                                            i212 = i216;
                                            i211 += -bArr7[i216];
                                        }
                                    }
                                });
                            } else if (b11 == 3) {
                                MidtransSDK.getInstance().paymentUsingBankTransferAllBank(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.3
                                    private static final byte[] $$c = {64, 73, -26, 82};
                                    private static final int $$f = 151;
                                    private static int $10 = 0;
                                    private static int $11 = 1;
                                    private static final byte[] $$d = {74, 60, 122, -26, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
                                    private static final int $$e = 23;
                                    private static final byte[] $$a = {48, -119, -71, 110, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
                                    private static final int $$b = 114;
                                    private static int d = 0;
                                    private static int asInterface = 1;
                                    private static char[] b = {47422, 47409, 47419, 47405, 47408, 47414, 47345, 47404, 47372, 47398, 47403, 47418, 47410, 47388, 47411, 47420, 47412, 47407, 47373, 47390, 47401, 47371, 47415, 47402};
                                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719647;
                                    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                                    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

                                    public AnonymousClass3() {
                                    }

                                    private static void a(int i112, short s5, byte b12, Object[] objArr23) {
                                        int i210 = (b12 * 14) + 84;
                                        int i211 = i112 + 4;
                                        byte[] bArr7 = $$a;
                                        byte[] bArr8 = new byte[53 - s5];
                                        int i212 = 52 - s5;
                                        int i213 = -1;
                                        if (bArr7 == null) {
                                            i213 = -1;
                                            i210 = (i212 + i211) - 10;
                                            i211 = i211;
                                        }
                                        while (true) {
                                            int i214 = i213 + 1;
                                            bArr8[i214] = (byte) i210;
                                            if (i214 == i212) {
                                                objArr23[0] = new String(bArr8, 0);
                                                return;
                                            }
                                            int i215 = i211 + 1;
                                            i213 = i214;
                                            i210 = (i210 + bArr7[i215]) - 10;
                                            i211 = i215;
                                        }
                                    }

                                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                        */
                                    private static void e(short r7, int r8, byte r9, java.lang.Object[] r10) {
                                        /*
                                            byte[] r0 = defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.$$d
                                            int r8 = r8 * 37
                                            int r8 = 41 - r8
                                            int r9 = r9 * 15
                                            int r9 = r9 + 38
                                            int r7 = r7 * 15
                                            int r7 = 99 - r7
                                            byte[] r1 = new byte[r9]
                                            r2 = 0
                                            if (r0 != 0) goto L17
                                            r3 = r8
                                            r8 = r9
                                            r4 = r2
                                            goto L2d
                                        L17:
                                            r3 = r2
                                        L18:
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
                                            int r3 = r3 + 1
                                            int r8 = r8 + r7
                                            int r7 = r8 + (-8)
                                            r8 = r3
                                            r3 = r4
                                            goto L18
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.e(short, int, byte, java.lang.Object[]):void");
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                    public final void onError(Throwable th2) {
                                        int i112 = 2 % 2;
                                        int i210 = d + 111;
                                        asInterface = i210 % 128;
                                        int i211 = i210 % 2;
                                        selectParentResolutionsByAspectRatio selectparentresolutionsbyaspectratio = selectParentResolutionsByAspectRatio.this;
                                        if (i211 != 0) {
                                            ((selectParentResolutions) selectparentresolutionsbyaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                                            return;
                                        }
                                        ((selectParentResolutions) selectparentresolutionsbyaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }

                                    private static void c(char[] cArr, int[] iArr, int i112, byte[] bArr7, Object[] objArr23) throws Throwable {
                                        int i210 = 2;
                                        int i211 = 2 % 2;
                                        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                                        char[] cArr2 = b;
                                        long j2 = 0;
                                        int i212 = 0;
                                        if (cArr2 != null) {
                                            int length = cArr2.length;
                                            char[] cArr3 = new char[length];
                                            int i213 = 0;
                                            while (i213 < length) {
                                                int i214 = $10 + 107;
                                                $11 = i214 % 128;
                                                int i215 = i214 % i210;
                                                try {
                                                    Object[] objArr24 = new Object[1];
                                                    objArr24[i212] = Integer.valueOf(cArr2[i213]);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                        byte b12 = (byte) i212;
                                                        byte b13 = b12;
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (31340 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1))), 2993 - TextUtils.lastIndexOf("", '0'), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(i212) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i212) == 0.0d ? 0 : -1)), 1182129903, false, $$g(b12, b13, b13), new Class[]{Integer.TYPE});
                                                    }
                                                    cArr3[i213] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24)).charValue();
                                                    i213++;
                                                    i210 = 2;
                                                    j2 = 0;
                                                    i212 = 0;
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                        throw th2;
                                                    }
                                                    throw cause2;
                                                }
                                            }
                                            cArr2 = cArr3;
                                        }
                                        Object[] objArr25 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (43326 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 253 - (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                                        }
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr25)).intValue();
                                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr7.length;
                                            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr7[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i112] - iIntValue);
                                                Object[] objArr26 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                    byte b14 = (byte) 0;
                                                    byte b15 = (byte) (b14 + 1);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (Color.rgb(0, 0, 0) + 16810818), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3085, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, -2146875848, false, $$g(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                                                }
                                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr26);
                                            }
                                            objArr23[0] = new String(cArr4);
                                            return;
                                        }
                                        int i216 = 0;
                                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                                            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i112] - iIntValue);
                                                Object[] objArr27 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                    byte b16 = (byte) 0;
                                                    byte b17 = (byte) (b16 + 1);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (33602 - View.resolveSize(0, 0)), 3085 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0') + 27, -2146875848, false, $$g(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
                                                }
                                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr27);
                                            }
                                            objArr23[0] = new String(cArr5);
                                            return;
                                        }
                                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                                        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                        while (true) {
                                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i216;
                                            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                                objArr23[0] = new String(cArr6);
                                                return;
                                            }
                                            int i217 = $10 + 13;
                                            $11 = i217 % 128;
                                            int i218 = i217 % 2;
                                            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i112] - iIntValue);
                                            i216 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                                        }
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onFailure(TransactionResponse transactionResponse, String str3) throws Throwable {
                                        Object[] objArr23;
                                        int i112 = 2 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char tapTimeout = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 921;
                                            int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                                            byte[] bArr7 = $$a;
                                            byte b12 = bArr7[7];
                                            Object[] objArr24 = new Object[1];
                                            a(b12, (byte) (b12 & 52), bArr7[37], objArr24);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, iResolveSizeAndState2, capsMode, -1048449946, false, (String) objArr24[0], null);
                                        }
                                        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                                        Object[] objArr25 = new Object[1];
                                        c(null, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr25);
                                        Class<?> cls6 = Class.forName((String) objArr25[0]);
                                        Object[] objArr26 = new Object[1];
                                        c(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr26);
                                        long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr26[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                            char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                            int i210 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                                            int iResolveSizeAndState3 = 28 - View.resolveSizeAndState(0, 0, 0);
                                            byte[] bArr8 = $$a;
                                            byte b13 = bArr8[7];
                                            byte b14 = bArr8[80];
                                            Object[] objArr27 = new Object[1];
                                            a(b13, b14, b14, objArr27);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(fadingEdgeLength, i210, iResolveSizeAndState3, -778300370, false, (String) objArr27[0], null);
                                        }
                                        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                                            int i211 = d + 23;
                                            asInterface = i211 % 128;
                                            int i212 = i211 % 2;
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                char cBlue = (char) (31533 - Color.blue(0));
                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                                                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                                                byte[] bArr9 = $$a;
                                                Object[] objArr28 = new Object[1];
                                                a((byte) 51, bArr9[33], bArr9[80], objArr28);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cBlue, iLastIndexOf, keyRepeatDelay2, -1142834547, false, (String) objArr28[0], null);
                                            }
                                            Object[] objArr29 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                                            objArr23 = new Object[]{new int[1], new int[]{((int[]) objArr29[1])[0]}, (Object[]) objArr29[2], new int[]{((int[]) objArr29[3])[0]}, (String[]) objArr29[4]};
                                            int iIdentityHashCode3 = System.identityHashCode(this);
                                            int i213 = ~iIdentityHashCode3;
                                            int i214 = 472914295 + (((~((-723096727) | i213)) | 704679940 | (~((-1050982918) | i213)) | (~(1069399703 | iIdentityHashCode3))) * (-84));
                                            int i215 = (~(iIdentityHashCode3 | (-1050982918))) | 723096726;
                                            int i216 = ~(i213 | 1050982917);
                                            int i217 = i214 + ((i215 | i216) * (-84)) + (((-1069399704) | i216) * 84) + 1130420970;
                                            int i218 = (i217 << 13) ^ i217;
                                            int i219 = i218 ^ (i218 >>> 17);
                                            ((int[]) objArr23[0])[0] = i219 ^ (i219 << 5);
                                        } else {
                                            Object[] objArr110 = new Object[1];
                                            c(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr110);
                                            Class<?> cls7 = Class.forName((String) objArr110[0]);
                                            Object[] objArr111 = new Object[1];
                                            c(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr111);
                                            Context applicationContext = (Context) cls7.getMethod((String) objArr111[0], new Class[0]).invoke(null, null);
                                            if (applicationContext != null) {
                                                int i310 = d + 71;
                                                asInterface = i310 % 128;
                                                int i311 = i310 % 2;
                                                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                                                    applicationContext = null;
                                                } else {
                                                    applicationContext = applicationContext.getApplicationContext();
                                                    int i312 = asInterface + 43;
                                                    d = i312 % 128;
                                                    int i313 = i312 % 2;
                                                }
                                            }
                                            int length = str3 != null ? str3.length() : 0;
                                            int i314 = d + 71;
                                            asInterface = i314 % 128;
                                            int i315 = i314 % 2;
                                            try {
                                                Object[] objArr112 = {applicationContext, Integer.valueOf(length), 0, 1130420970};
                                                byte[] bArr10 = $$d;
                                                byte b15 = bArr10[51];
                                                Object[] objArr113 = new Object[1];
                                                e(b15, bArr10[74], b15, objArr113);
                                                Class<?> cls8 = Class.forName((String) objArr113[0]);
                                                byte b16 = bArr10[74];
                                                Object[] objArr114 = new Object[1];
                                                e(b16, bArr10[51], b16, objArr114);
                                                objArr23 = (Object[]) cls8.getMethod((String) objArr114[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                    char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                                                    int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                                                    byte[] bArr11 = $$a;
                                                    Object[] objArr115 = new Object[1];
                                                    a((byte) 51, bArr11[33], bArr11[80], objArr115);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumFlingVelocity, iCombineMeasuredStates, packedPositionType, -1142834547, false, (String) objArr115[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr23);
                                                try {
                                                    Object[] objArr116 = new Object[1];
                                                    c(null, null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr116);
                                                    Class<?> cls9 = Class.forName((String) objArr116[0]);
                                                    Object[] objArr117 = new Object[1];
                                                    c(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr117);
                                                    long jLongValue4 = ((Long) cls9.getDeclaredMethod((String) objArr117[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf3 = Long.valueOf(jLongValue4);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                                        char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                                                        int iBlue = 28 - Color.blue(0);
                                                        byte[] bArr12 = $$a;
                                                        byte b17 = bArr12[7];
                                                        byte b18 = bArr12[80];
                                                        Object[] objArr118 = new Object[1];
                                                        a(b17, b18, b18, objArr118);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, maximumDrawingCacheSize, iBlue, -778300370, false, (String) objArr118[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                                                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                        char capsMode2 = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                                                        int capsMode3 = 921 - TextUtils.getCapsMode("", 0, 0);
                                                        int iResolveSize = 28 - View.resolveSize(0, 0);
                                                        byte[] bArr13 = $$a;
                                                        byte b19 = bArr13[7];
                                                        Object[] objArr119 = new Object[1];
                                                        a(b19, (byte) (b19 & 52), bArr13[37], objArr119);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode2, capsMode3, iResolveSize, -1048449946, false, (String) objArr119[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                                                } catch (Exception unused2) {
                                                    throw new RuntimeException();
                                                }
                                            } catch (Throwable th2) {
                                                Throwable cause2 = th2.getCause();
                                                if (cause2 == null) {
                                                    throw th2;
                                                }
                                                throw cause2;
                                            }
                                        }
                                        int i316 = ((int[]) objArr23[1])[0];
                                        int i317 = ((int[]) objArr23[3])[0];
                                        if (i317 == i316) {
                                            int i318 = ((int[]) objArr23[0])[0];
                                            Object[] objArr210 = {new int[1], new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[]{((int[]) objArr23[3])[0]}, (String[]) objArr23[4]};
                                            int iIdentityHashCode4 = System.identityHashCode(this);
                                            int i319 = ~iIdentityHashCode4;
                                            int i41 = i318 + ((((~((-161827161) | i319)) | (~(968739835 | iIdentityHashCode4))) * 988) - 966894069) + (((~(iIdentityHashCode4 | (-967166969))) | 805339808 | (~(i319 | 968739835))) * 988);
                                            int i42 = (i41 << 13) ^ i41;
                                            int i43 = i42 ^ (i42 >>> 17);
                                            ((int[]) objArr210[0])[0] = i43 ^ (i43 << 5);
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            String[] strArr = (String[]) objArr23[4];
                                            if (strArr != null) {
                                                for (String str4 : strArr) {
                                                    arrayList.add(str4);
                                                }
                                            }
                                            Toast.makeText((Context) null, i317 / (((i317 - 1) * i317) % 2), 0).show();
                                            int i44 = ((int[]) objArr23[0])[0];
                                            Object[] objArr211 = {new int[1], new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[]{((int[]) objArr23[3])[0]}, (String[]) objArr23[4]};
                                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                            int i45 = ~elapsedCpuTime;
                                            int i46 = i44 + 976312639 + ((elapsedCpuTime | 756877128) * 140) + (((~(756877128 | i45)) | 278937619) * (-280)) + (((~(elapsedCpuTime | (-278937620))) | (~(1017202515 | i45)) | 18612232) * 140);
                                            int i47 = (i46 << 13) ^ i46;
                                            int i48 = i47 ^ (i47 >>> 17);
                                            ((int[]) objArr211[0])[0] = i48 ^ (i48 << 5);
                                        }
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onSuccess(TransactionResponse transactionResponse) {
                                        int i112 = 2 % 2;
                                        int i210 = asInterface + 21;
                                        d = i210 % 128;
                                        int i211 = i210 % 2;
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                        int i212 = d + 125;
                                        asInterface = i212 % 128;
                                        if (i212 % 2 == 0) {
                                            int i213 = 0 / 0;
                                        }
                                    }

                                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                        */
                                    private static java.lang.String $$g(short r7, byte r8, short r9) {
                                        /*
                                            int r9 = r9 * 3
                                            int r9 = 1 - r9
                                            int r7 = r7 * 4
                                            int r7 = 4 - r7
                                            byte[] r0 = defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.$$c
                                            int r8 = 68 - r8
                                            byte[] r1 = new byte[r9]
                                            r2 = 0
                                            if (r0 != 0) goto L15
                                            r3 = r8
                                            r4 = r2
                                            r8 = r7
                                            goto L29
                                        L15:
                                            r3 = r2
                                        L16:
                                            int r4 = r3 + 1
                                            byte r5 = (byte) r8
                                            r1[r3] = r5
                                            if (r4 != r9) goto L23
                                            java.lang.String r7 = new java.lang.String
                                            r7.<init>(r1, r2)
                                            return r7
                                        L23:
                                            r3 = r0[r7]
                                            r6 = r8
                                            r8 = r7
                                            r7 = r3
                                            r3 = r6
                                        L29:
                                            int r7 = r7 + r3
                                            int r8 = r8 + 1
                                            r3 = r4
                                            r6 = r8
                                            r8 = r7
                                            r7 = r6
                                            goto L16
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.selectParentResolutionsByAspectRatio.AnonymousClass3.$$g(short, byte, short):java.lang.String");
                                    }
                                });
                            } else if (b11 == 4) {
                                MidtransSDK.getInstance().paymentUsingBankTransferPermata(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.5
                                    public AnonymousClass5() {
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                    public final void onError(Throwable th2) {
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onSuccess(TransactionResponse transactionResponse) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                    }
                                });
                            } else if (b11 != 5) {
                                ((selectParentResolutions) selectparentresolutionsbyaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a();
                            } else {
                                MidtransSDK.getInstance().paymentUsingMandiriBillPay(authenticationToken, strTrim, new TransactionCallback() { // from class: selectParentResolutionsByAspectRatio.10
                                    public AnonymousClass10() {
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                                    public final void onError(Throwable th2) {
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onFailure(TransactionResponse transactionResponse, String str3) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                                    }

                                    @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                                    public final void onSuccess(TransactionResponse transactionResponse) {
                                        selectParentResolutionsByAspectRatio.this.b = transactionResponse;
                                        ((selectParentResolutions) selectParentResolutionsByAspectRatio.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                                    }
                                });
                            }
                        }
                    } else {
                        BankTransferPaymentActivity bankTransferPaymentActivity = BankTransferPaymentActivity.this;
                        Toast.makeText(bankTransferPaymentActivity, bankTransferPaymentActivity.getString(R.string.error_invalid_email_id), 0).show();
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.notify.setText(getString(R.string.pay_now));
        AppCompatEditText appCompatEditText2 = this.onTransact;
        customerDetails = this.RemoteActionCompatParcelizer.b().getTransaction().getCustomerDetails();
        if (customerDetails != null) {
            int i112 = getRoot + 29;
            getItem = i112 % 128;
            int i210 = i112 % 2;
            email = customerDetails.getEmail();
        } else {
            email = "";
        }
        appCompatEditText2.setText(email);
        this.onTransact.clearFocus();
        this.g = (ImageView) findViewById(R.id.bank_preview);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 876;
            int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
            byte[] bArr7 = $$j;
            byte b11 = bArr7[28];
            short s5 = bArr7[5];
            Object[] objArr22 = new Object[1];
            m(b11, s5, (byte) (s5 & 37), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel2, iResolveSizeAndState2, windowTouchSlop3, -1650998592, false, (String) objArr22[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr23 = new Object[1];
        n(new char[]{24419, 22343, 36309, 31927, 36129, 30658, 26913, 63011, 31989, 59871, 27006, 61134, 64791, 28510, 21227, 17881, 14716, 59017, 56518, 7726, 1274, 13068}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), new char[]{59996, 51785, 40335, 35077}, KeyEvent.getDeadChar(0, 0), objArr23);
        Class<?> cls6 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        n(new char[]{64271, 46556, 22308, 45610, 62104, 56232, 40996, 46429, 55927, 35706, 52528, 62487, 9968, 51377, 4942}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 64498), new char[]{52554, 60191, 64811, 30971}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 736829278, objArr24);
        jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAlpha2 = (char) Color.alpha(0);
            int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
            byte[] bArr8 = $$j;
            byte b12 = bArr8[28];
            short s6 = (short) (bArr8[12] + 1);
            Object[] objArr25 = new Object[1];
            m(b12, s6, (byte) (s6 | 16), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha2, windowTouchSlop4, doubleTapTimeout2, 2012020043, false, (String) objArr25[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i211 = getRoot + 103;
            getItem = i211 % 128;
            int i212 = i211 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iIndexOf2 = TextUtils.indexOf("", "") + 876;
                int deadChar2 = 10 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr9 = $$j;
                Object[] objArr26 = new Object[1];
                m(bArr9[28], (short) ($$k & 376), (byte) (bArr9[1] + 1), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay2, iIndexOf2, deadChar2, 2012931276, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr27[0])[0]}, new int[1], new int[]{((int[]) objArr27[2])[0]}, (String[]) objArr27[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i213 = ~(325853716 | iIdentityHashCode3);
            int i214 = (((831275132 + (((-325922368) | i213) * (-814))) + ((i213 | ((~((~iIdentityHashCode3) | 285543487)) | 285474836)) * 407)) + (((~(iIdentityHashCode3 | (-285543488))) | ((~((-325853717) | iIdentityHashCode3)) | 285474836)) * 407)) - 951226918;
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            ((int[]) objArr[1])[0] = i216 ^ (i216 << 5);
        } else {
            baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr28 = new Object[1];
                n(new char[]{2859, 61900, 25257, 17726, 19090, 27579, 969, 21060, 51317, 12327, 6244, 28648, 28347, 51811, 35206, 18488, 59057, 18862, 1859, 42063, 7836, 19588, 58208, 41169, 21275, 13924}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).length() + 57368), new char[]{52925, 38121, 6643, 39392}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr28);
                Class<?> cls7 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                n(new char[]{26048, 60380, 42383, 1533, 49707, 56064, 58395, 33521, 59087, 22518, 5885, 54857, 9210, 1115, 512, 64111, 11251, 30320}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3092), new char[]{43952, 52207, 5284, 5388}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr29);
                baseContext = (Context) cls7.getMethod((String) objArr29[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i217 = getItem + 9;
                getRoot = i217 % 128;
                int i218 = i217 % 2;
                if (baseContext instanceof ContextWrapper) {
                    baseContext = baseContext.getApplicationContext();
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            Object[] objArr110 = new Object[1];
            n(new char[]{12897, 15026, 21120, 45920, 30084, 11623, 7932, 35504, 5622, 20593, 24089, 24843, 19642, 12641, 57172, 42818}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 41817), new char[]{31967, 36090, 32171, 6819}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, objArr110);
            Class<?> cls8 = Class.forName((String) objArr110[0]);
            Object[] objArr111 = new Object[1];
            n(new char[]{31803, 16547, 51141, 8023, 14698, 29380, 26567, 51766, 17477, 32363, 36014, 3107, 22450, 18000, 61516, 45893}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step5).substring(0, 3).length() + 58351), new char[]{61276, 9397, 61970, 37859}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step3).substring(35, 41).codePointAt(5) - 97, objArr111);
            Object[] objArr112 = {baseContext, Integer.valueOf(((Integer) cls8.getMethod((String) objArr111[0], Object.class).invoke(null, this)).intValue()), 0, -951226918};
            byte b13 = $$m[17];
            byte b14 = b13;
            Object[] objArr113 = new Object[1];
            o(b13, b14, b14, objArr113);
            Class<?> cls9 = Class.forName((String) objArr113[0]);
            byte b15 = (byte) $$n;
            byte b16 = b15;
            Object[] objArr114 = new Object[1];
            o(b15, b16, b16, objArr114);
            objArr = (Object[]) cls9.getMethod((String) objArr114[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
            if (baseContext != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cRed2 = (char) Color.red(0);
                    int iGreen2 = 876 - Color.green(0);
                    int minimumFlingVelocity2 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr10 = $$j;
                    Object[] objArr115 = new Object[1];
                    m(bArr10[28], (short) ($$k & 376), (byte) (bArr10[1] + 1), objArr115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed2, iGreen2, minimumFlingVelocity2, 2012931276, false, (String) objArr115[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr);
                Object[] objArr116 = new Object[1];
                n(new char[]{24419, 22343, 36309, 31927, 36129, 30658, 26913, 63011, 31989, 59871, 27006, 61134, 64791, 28510, 21227, 17881, 14716, 59017, 56518, 7726, 1274, 13068}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_sample_valid_date).substring(0, 6).codePointAt(1) - 97), new char[]{59996, 51785, 40335, 35077}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr116);
                Class<?> cls10 = Class.forName((String) objArr116[0]);
                Object[] objArr117 = new Object[1];
                n(new char[]{64271, 46556, 22308, 45610, 62104, 56232, 40996, 46429, 55927, 35706, 52528, 62487, 9968, 51377, 4942}, new char[]{0, 0, 0, 0}, (char) (64509 - (ViewConfiguration.getWindowTouchSlop() >> 8)), new char[]{52554, 60191, 64811, 30971}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 736829353, objArr117);
                long jLongValue3 = ((Long) cls10.getDeclaredMethod((String) objArr117[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                    int i219 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                    int touchSlop2 = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr11 = $$j;
                    byte b17 = bArr11[28];
                    short s7 = (short) (bArr11[12] + 1);
                    Object[] objArr118 = new Object[1];
                    m(b17, s7, (byte) (s7 | 16), objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i219, touchSlop2, 2012020043, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                    int iMyPid2 = 10 - (Process.myPid() >> 22);
                    byte[] bArr12 = $$j;
                    byte b18 = bArr12[28];
                    short s8 = bArr12[5];
                    Object[] objArr119 = new Object[1];
                    m(b18, s8, (byte) (s8 & 37), objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, scrollBarFadeDuration2, iMyPid2, -1650998592, false, (String) objArr119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        i3 = ((int[]) objArr[2])[0];
        i4 = ((int[]) objArr[0])[0];
        if (i4 == i3) {
            int i310 = ((int[]) objArr[1])[0];
            Object[] objArr210 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i311 = ~iIdentityHashCode4;
            int i312 = i310 + (-12597380) + (((~(iIdentityHashCode4 | (-105778427))) | (~((-145826310) | i311)) | 105516080) * (-68)) + ((~((-262347) | i311)) * (-68)) + (((~(105778426 | i311)) | (-146088656)) * 68);
            int i313 = (i312 << 13) ^ i312;
            int i314 = i313 ^ (i313 >>> 17);
            ((int[]) objArr210[1])[0] = i314 ^ (i314 << 5);
        } else {
            Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
            int i315 = ((int[]) objArr[1])[0];
            Object[] objArr211 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i316 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2093694423;
            int i317 = ~i316;
            int i318 = i315 + (-558092238) + (((~(i317 | (-515111053))) | 555421281) * (-1042)) + (((-515111053) | i316) * 521) + (((~(i316 | (-555421282))) | 554174049 | (~(i317 | (-513863821)))) * 521);
            int i319 = (i318 << 13) ^ i318;
            int i41 = i319 ^ (i319 >>> 17);
            ((int[]) objArr211[1])[0] = i41 ^ (i41 << 5);
        }
        this.d = (DefaultTextView) findViewById(R.id.bank_description);
        this.asInterface = (FancyButton) findViewById(R.id.bank_toggle);
        this.INotificationSideChannel = (DefaultTextView) findViewById(R.id.card_description);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        float f;
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int iGreen = Color.green(0) + 1031;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m(bArr[28], (short) ($$k & 376), (byte) (bArr[1] + 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iGreen, minimumFlingVelocity, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{24419, 22343, 36309, 31927, 36129, 30658, 26913, 63011, 31989, 59871, 27006, 61134, 64791, 28510, 21227, 17881, 14716, 59017, 56518, 7726, 1274, 13068}, new char[]{0, 0, 0, 0}, (char) View.resolveSize(0, 0), new char[]{59996, 51785, 40335, 35077}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step3).substring(0, 3).length() - 3, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{64271, 46556, 22308, 45610, 62104, 56232, 40996, 46429, 55927, 35706, 52528, 62487, 9968, 51377, 4942}, new char[]{0, 0, 0, 0}, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64509), new char[]{52554, 60191, 64811, 30971}, 736829309 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step6).substring(0, 1).codePointAt(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
            int iMyTid = 15 - (Process.myTid() >> 22);
            byte[] bArr2 = $$j;
            byte b = bArr2[28];
            short s = (short) (bArr2[12] + 1);
            Object[] objArr5 = new Object[1];
            m(b, s, (byte) (s | 16), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollBarSize, iMyTid, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = getItem + 65;
            getRoot = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b2 = $$j[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                m(b3, (short) (b3 | 140), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, iResolveSizeAndState, maxKeyCode, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1145930503;
            int i8 = (-1111539135) + (((~(566173061 | i7)) | 302031386 | (~((-321892892) | i7))) * (-744)) + (((~i7) | 546311556) * 744) + ((i7 | (-302031387)) * 744) + 1729133683;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{12897, 15026, 21120, 45920, 30084, 11623, 7932, 35504, 5622, 20593, 24089, 24843, 19642, 12641, 57172, 42818}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama1).substring(30, 31).codePointAt(0) + 41738), new char[]{31967, 36090, 32171, 6819}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_userid_invalid).substring(13, 15).codePointAt(0) - 105, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{31803, 16547, 51141, 8023, 14698, 29380, 26567, 51766, 17477, 32363, 36014, 3107, 22450, 18000, 61516, 45893}, new char[]{0, 0, 0, 0}, (char) (ImageFormat.getBitsPerPixel(0) + 58355), new char[]{61276, 9397, 61970, 37859}, ViewConfiguration.getLongPressTimeout() >> 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1563941089};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.getGidForName("") + 46039), (ViewConfiguration.getLongPressTimeout() >> 16) + 1134, 18 - View.getDefaultSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1729133683, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                    int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr3 = $$j;
                    Object[] objArr12 = new Object[1];
                    m(bArr3[28], (short) ($$k & 376), (byte) (bArr3[1] + 1), objArr12);
                    String str = (String) objArr12[0];
                    f = 0.0f;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, i11, packedPositionGroup, 1298546779, false, str, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getSize(0) + 45993), 1117 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 16 - MotionEvent.axisFromString("")), Boolean.TYPE});
                } else {
                    f = 0.0f;
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int i12 = 1032 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                    int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b4 = $$j[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    m(b5, (short) (b5 | 140), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, i12, iMakeMeasureSpec, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{24419, 22343, 36309, 31927, 36129, 30658, 26913, 63011, 31989, 59871, 27006, 61134, 64791, 28510, 21227, 17881, 14716, 59017, 56518, 7726, 1274, 13068}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0) - 115), new char[]{59996, 51785, 40335, 35077}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_expiry_date).substring(16, 17).codePointAt(0) - 77, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{64271, 46556, 22308, 45610, 62104, 56232, 40996, 46429, 55927, 35706, 52528, 62487, 9968, 51377, 4942}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 64498), new char[]{52554, 60191, 64811, 30971}, (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 736829389, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                        int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                        byte[] bArr4 = $$j;
                        byte b6 = bArr4[28];
                        short s2 = (short) (bArr4[12] + 1);
                        Object[] objArr16 = new Object[1];
                        m(b6, s2, (byte) (s2 | 16), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, iIndexOf, i13, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
                        byte[] bArr5 = $$j;
                        Object[] objArr17 = new Object[1];
                        m(bArr5[28], (short) ($$k & 376), (byte) (bArr5[1] + 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf3, maximumDrawingCacheSize, keyRepeatDelay, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = getItem + 97;
        getRoot = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i21 = ~startElapsedRealtime;
        int i22 = i18 + (-483973471) + (((~((-825198515) | i21)) | 825131792) * 184) + ((startElapsedRealtime | (-1069545407)) * (-184)) + ((~((-1069478685) | i21)) * 184);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
            int i25 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int minimumFlingVelocity2 = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr6 = $$j;
            byte b7 = bArr6[28];
            short s3 = bArr6[5];
            Object[] objArr19 = new Object[1];
            m(b7, s3, (byte) (s3 & 37), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(doubleTapTimeout, i25, minimumFlingVelocity2, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i26 = getRoot + 115;
            getItem = i26 % 128;
            int i27 = i26 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cArgb2 = (char) (Color.argb(0, 0, 0, 0) + 29944);
                int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0);
                int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr7 = $$j;
                byte b8 = bArr7[28];
                short s4 = (short) (bArr7[12] + 1);
                Object[] objArr20 = new Object[1];
                m(b8, s4, (byte) (s4 | 16), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cArgb2, iIndexOf2, scrollBarFadeDuration, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i28 = ((int[]) objArr21[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i28}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_primary_cta_text).substring(0, 14).codePointAt(11) - 732378347;
            int i29 = ~iCodePointAt;
            int i30 = ~((-966047996) | i29);
            int i31 = ~(753445569 | iCodePointAt);
            int i32 = (-1774707662) + ((i30 | i31) * 1150) + (((~((-753445570) | i29)) | i31) * (-575)) + (((~(iCodePointAt | (-966047996))) | (~(i29 | 966047995))) * 575) + 1426257855;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i34 ^ (i34 << 5);
            int i35 = getItem + 1;
            getRoot = i35 % 128;
            int i36 = i35 % 2;
        } else {
            Object[] objArr22 = new Object[1];
            n(new char[]{12897, 15026, 21120, 45920, 30084, 11623, 7932, 35504, 5622, 20593, 24089, 24843, 19642, 12641, 57172, 42818}, new char[]{0, 0, 0, 0}, (char) (TextUtils.getOffsetBefore("", 0) + 41853), new char[]{31967, 36090, 32171, 6819}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            n(new char[]{31803, 16547, 51141, 8023, 14698, 29380, 26567, 51766, 17477, 32363, 36014, 3107, 22450, 18000, 61516, 45893}, new char[]{0, 0, 0, 0}, (char) (58354 - (ViewConfiguration.getEdgeSlop() >> 16)), new char[]{61276, 9397, 61970, 37859}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step5).substring(3, 4).codePointAt(0) - 117, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1563941089};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1725, (ViewConfiguration.getLongPressTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1426257855);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                int i37 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                int mirror = AndroidCharacter.getMirror('0') - 25;
                byte[] bArr8 = $$j;
                byte b9 = bArr8[28];
                short s5 = (short) (bArr8[12] + 1);
                Object[] objArr25 = new Object[1];
                m(b9, s5, (byte) (s5 | 16), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveOpacity, i37, mirror, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{24419, 22343, 36309, 31927, 36129, 30658, 26913, 63011, 31989, 59871, 27006, 61134, 64791, 28510, 21227, 17881, 14716, 59017, 56518, 7726, 1274, 13068}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_5).substring(1, 2).length() - 1), new char[]{59996, 51785, 40335, 35077}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{64271, 46556, 22308, 45610, 62104, 56232, 40996, 46429, 55927, 35706, 52528, 62487, 9968, 51377, 4942}, new char[]{0, 0, 0, 0}, (char) (64509 - KeyEvent.normalizeMetaState(0)), new char[]{52554, 60191, 64811, 30971}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step3).substring(1, 3).codePointAt(0) + 736829281, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                    int iRed = Color.red(0) + 1755;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
                    byte[] bArr9 = $$j;
                    Object[] objArr28 = new Object[1];
                    m(bArr9[28], (short) ($$k & 940), (byte) (bArr9[1] + 1), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, iRed, iLastIndexOf, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                    int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0');
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                    byte[] bArr10 = $$j;
                    byte b10 = bArr10[28];
                    short s6 = bArr10[5];
                    Object[] objArr29 = new Object[1];
                    m(b10, s6, (byte) (s6 & 37), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(absoluteGravity, iLastIndexOf2, pressedStateDuration, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArrB$5f1425da[1])[0];
        int i39 = ((int[]) objArrB$5f1425da[0])[0];
        if (i39 != i38) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$5f1425da[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i39));
        }
        int i40 = ((int[]) objArrB$5f1425da[3])[0];
        int i41 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr30 = {new int[]{i41}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i42 = ~((int) Process.getElapsedCpuTime());
        int i43 = i40 + 234099292 + (((~(623147164 | i42)) | (-835749591)) * (-983)) + (((~(i42 | (-835749591))) | 553648276) * 983);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr30[3])[0] = i45 ^ (i45 << 5);
        int i46 = getRoot + 3;
        getItem = i46 % 128;
        int i47 = i46 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c7, code lost:
    
        if (r1 != (((((-2130411456) | r2) * (-196)) - 2142960220) + ((r2 | 172642702) * 196))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c9, code lost:
    
        super.onResume();
        r1 = com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getItem + 75;
        com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.getRoot = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d5, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e1, code lost:
    
        throw new java.lang.RuntimeException("-1079806734");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0066, code lost:
    
        if (r1 == ((((-904058552) + ((~((-1099694808) | r4)) * 52)) + (((~(907246848 | r4)) | ((~(1737234391 | r4)) | (-2006941656))) * (-52))) + (((~(r4 | (-907246849))) | 637539584) * 52))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0099, code lost:
    
        if (r1 == ((r7 + ((866910009 | r4) * (-216))) + (((~(r4 | 36362809)) | (-866350353)) * 216))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009b, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = ~(new java.util.Random().nextInt(81383094) | (-1957768754));
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getRoot + 47;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = ~iMaxMemory;
            int i5 = (-1829464504) + (((~((-777989141) | i4)) | 537405460 | (~(1607976683 | i4)) | (~((-1367393004) | iMaxMemory))) * (-84));
            int i6 = (~(iMaxMemory | 1607976683)) | 777989140;
            int i7 = ~(i4 | (-1607976684));
            if (i3 != i5 + ((i6 | i7) * (-84)) + ((1367393003 | i7) * 84)) {
                throw null;
            }
        } else {
            int i8 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            if (i8 != (-64868992) + (((~(875034484 | i9)) | (-45046942) | (~((-875034485) | iIdentityHashCode))) * (-564)) + ((~(iIdentityHashCode | (-2577429))) * 1128) + (((~((-45046942) | i9)) | 872457056) * 564)) {
                throw null;
            }
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i12 = ~((-570574447) | i11);
        int i13 = ~i11;
        if (i10 != 669516476 + ((i12 | (~(i13 | (-1342439425)))) * 920) + (((~((-666042095) | i13)) | 570574446) * 920) + (((~(i11 | (-1342439425))) | (~((-570574447) | i13)) | (~((-95467649) | i11))) * 920)) {
            int i14 = (-587803914) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i15 = getItem + 69;
        getRoot = i15 % 128;
        int i16 = i15 % 2;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankTransferPaymentActivity bankTransferPaymentActivity, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{bankTransferPaymentActivity, str}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2109994744, 2109994746, iTuitionPaymentFragmentspecialinlinedviewModeldefault2)).booleanValue();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankTransferPaymentActivity bankTransferPaymentActivity, int i) {
        Object[] objArr = {bankTransferPaymentActivity, Integer.valueOf(i)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -494726943, 494726944, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int length = 361471239 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, length, 1018435661, -1018435658, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, th}, iTuitionPaymentFragmentbindingInflater1, -1889625522, 1889625522, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getRoot + 27;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getRoot + 59;
        getItem = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$w(short r6, short r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 102
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.$$u
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r8
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r7 = r7 + 1
            r3 = r0[r7]
        L25:
            int r6 = r6 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity.$$w(short, short, short):java.lang.String");
    }
}
