package com.midtrans.sdk.uikit.views.banktransfer.list;

import android.content.Context;
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
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.models.EnabledPayments;
import com.midtrans.sdk.uikit.views.banktransfer.payment.BankTransferPaymentActivity;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.getChildrenRequiredResolutions;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.removeDuplicates;
import defpackage.selectOtherAspectRatioParentResolutionsWithFovPriority;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class BankTransferListActivity extends BasePaymentActivity implements selectOtherAspectRatioParentResolutionsWithFovPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    private final String asInterface = "Select Bank Transfer";
    private removeDuplicates cancel;
    private RecyclerView d;
    private selectOtherAspectRatioParentResolutionsWithFovPriority g;
    private SemiBoldTextView notify;
    private static final byte[] $$m = {0, -94, -62, -97};
    private static final int $$n = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {106, -93, -11, -74, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 225;
    private static int RemoteActionCompatParcelizer = 0;
    private static int getInterfaceDescriptor = 1;
    private static char[] onTransact = {47324, 47311, 47321, 47307, 47310, 47316, 47247, 47306, 47274, 47300, 47305, 47320, 47312, 47290, 47313, 47322, 47314, 47309, 47275, 47315, 47303, 47318, 47285, 47317};
    private static int cancelAll = 2047719549;
    private static boolean INotificationSideChannel = true;
    private static boolean INotificationSideChannelStub = true;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity.$$j
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r6]
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity.m(short, byte, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.cancel != null) {
            int i4 = i3 + 41;
            RemoteActionCompatParcelizer = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    MidtransSDK.getInstance().getmMixpanelAnalyticsManager().trackButtonClicked(MidtransSDK.getInstance().readAuthenticationToken(), "Back", "Select Bank Transfer");
                    int i5 = 7 / 0;
                } else {
                    MidtransSDK.getInstance().getmMixpanelAnalyticsManager().trackButtonClicked(MidtransSDK.getInstance().readAuthenticationToken(), "Back", "Select Bank Transfer");
                }
            } catch (NullPointerException e2) {
                StringBuilder sb = new StringBuilder("trackButtonClick():");
                sb.append(e2.getMessage());
                Logger.e(Constants.TAG, sb.toString());
            }
        }
        super.onBackPressed();
    }

    private void g() {
        int i = 2 % 2;
        this.cancel = new removeDuplicates(this, (EnabledPayments) getIntent().getSerializableExtra("extra.bank.list"));
        selectOtherAspectRatioParentResolutionsWithFovPriority selectotheraspectratioparentresolutionswithfovpriority = new selectOtherAspectRatioParentResolutionsWithFovPriority(this);
        this.g = selectotheraspectratioparentresolutionswithfovpriority;
        List<getChildrenRequiredResolutions> listB = this.cancel.b();
        selectotheraspectratioparentresolutionswithfovpriority.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
        selectotheraspectratioparentresolutionswithfovpriority.TuitionPaymentFragmentspecialinlinedviewModeldefault3.addAll(listB);
        selectotheraspectratioparentresolutionswithfovpriority.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_bank_list);
        this.d = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            this.d.setHasFixedSize(true);
            this.d.setAdapter(this.g);
        } else {
            Toast.makeText(this, getString(R.string.message_error_internal_server), 0).show();
            int i2 = RemoteActionCompatParcelizer + 109;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 108) {
            int i5 = getInterfaceDescriptor;
            int i6 = i5 + 41;
            RemoteActionCompatParcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 41 / 0;
                if (i2 == -1) {
                    if (intent != null) {
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                }
            } else if (i2 == -1) {
                if (intent != null) {
                    setResult(-1, intent);
                    finish();
                    return;
                }
            }
            if (i2 == 0) {
                int i8 = i5 + 61;
                RemoteActionCompatParcelizer = i8 % 128;
                int i9 = i8 % 2;
                if (intent != null) {
                    setResult(-1, intent);
                    finish();
                    return;
                }
                int i10 = i5 + 43;
                RemoteActionCompatParcelizer = i10 % 128;
                if (i10 % 2 != 0) {
                    this.cancel.b();
                    if (this.cancel.b().size() != 0) {
                        if (!getIntent().getBooleanExtra("bt_permata", false) && !getIntent().getBooleanExtra("bt_mandiri", false) && !getIntent().getBooleanExtra("bt_bca", false) && !getIntent().getBooleanExtra("bt_bni", false)) {
                            i3 = getInterfaceDescriptor + 109;
                            RemoteActionCompatParcelizer = i3 % 128;
                            if (i3 % 2 != 0 ? !getIntent().getBooleanExtra("bt_bri", false) : !getIntent().getBooleanExtra("bt_bri", false)) {
                                if (!getIntent().getBooleanExtra("bt_other", false)) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    this.cancel.b();
                    if (this.cancel.b().size() != 1) {
                        if (!getIntent().getBooleanExtra("bt_permata", false)) {
                            i3 = getInterfaceDescriptor + 109;
                            RemoteActionCompatParcelizer = i3 % 128;
                            if (i3 % 2 != 0) {
                                if (!getIntent().getBooleanExtra("bt_other", false)) {
                                    return;
                                }
                            } else if (!getIntent().getBooleanExtra("bt_other", false)) {
                                return;
                            }
                        }
                    }
                }
                finish();
            }
        }
    }

    private void a() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.notify = (SemiBoldTextView) findViewById(R.id.text_page_title);
            obj.hashCode();
            throw null;
        }
        SemiBoldTextView semiBoldTextView = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.notify = semiBoldTextView;
        if (semiBoldTextView != null) {
            semiBoldTextView.setText(getString(R.string.activity_select_bank));
        }
        try {
            MidtransSDK.getInstance().getmMixpanelAnalyticsManager().trackPageViewed(MidtransSDK.getInstance().readAuthenticationToken(), "Select Bank Transfer", getIntent().getBooleanExtra("First Page", true));
            int i3 = getInterfaceDescriptor + 33;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
        } catch (NullPointerException e2) {
            StringBuilder sb = new StringBuilder("trackPageView():");
            sb.append(e2.getMessage());
            Logger.e(Constants.TAG, sb.toString());
        }
        List<getChildrenRequiredResolutions> listB = this.cancel.b();
        if (listB.isEmpty()) {
            finish();
            return;
        }
        if (listB.size() == 1) {
            String str = this.cancel.b().get(0).b;
            Intent intent = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
            intent.putExtra("bank.type", str);
            startActivityForResult(intent, 108);
            return;
        }
        if (getIntent().getBooleanExtra("bt_permata", false)) {
            Intent intent2 = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
            intent2.putExtra("bank.type", PaymentType.PERMATA_VA);
            startActivityForResult(intent2, 108);
            return;
        }
        if (getIntent().getBooleanExtra("bt_mandiri", false)) {
            Intent intent3 = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
            intent3.putExtra("bank.type", "echannel");
            startActivityForResult(intent3, 108);
            int i5 = RemoteActionCompatParcelizer + 25;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (getIntent().getBooleanExtra("bt_bca", false)) {
            Intent intent4 = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
            intent4.putExtra("bank.type", PaymentType.BCA_VA);
            startActivityForResult(intent4, 108);
            int i7 = RemoteActionCompatParcelizer + 19;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (getIntent().getBooleanExtra("bt_bni", false)) {
            Intent intent5 = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
            intent5.putExtra("bank.type", PaymentType.BNI_VA);
            startActivityForResult(intent5, 108);
        } else if (getIntent().getBooleanExtra("bt_bri", false)) {
            Intent intent6 = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
            intent6.putExtra("bank.type", PaymentType.BRI_VA);
            startActivityForResult(intent6, 108);
        } else if (getIntent().getBooleanExtra("bt_other", false)) {
            Intent intent7 = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
            intent7.putExtra("bank.type", PaymentType.ALL_VA);
            startActivityForResult(intent7, 108);
        }
    }

    @Override // selectOtherAspectRatioParentResolutionsWithFovPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int i2 = 2 % 2;
        String str = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).b;
        Intent intent = new Intent(this, (Class<?>) BankTransferPaymentActivity.class);
        intent.putExtra("bank.type", str);
        startActivityForResult(intent, 108);
        int i3 = RemoteActionCompatParcelizer + 63;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i4 != (((~((-16859137) | startElapsedRealtime)) | (-1939464176)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 322463192 + ((~((~startElapsedRealtime) | (-16859137))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            throw new RuntimeException("-632477367");
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(181497988);
        int i6 = ~iNextInt;
        if (i5 != (-217316779) + (((~((-287406140) | i6)) | (-2003317471)) * (-602)) + (((~(iNextInt | (-287406140))) | 84001 | (~((-1715995333) | i6))) * (-301)) + ((~(i6 | (-2003317471))) * 301)) {
            throw null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_bank_transfer_list);
        g();
        a();
        int i7 = RemoteActionCompatParcelizer + 43;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void n(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = onTransact;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i3, i3) + 31340);
                        int iCombineMeasuredStates = 2994 - View.combineMeasuredStates(i3, i3);
                        int iResolveOpacity = 17 - Drawable.resolveOpacity(i3, i3);
                        byte b = $$m[i3];
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iCombineMeasuredStates, iResolveOpacity, 1182129903, false, $$u(b2, (byte) (b2 + 1), b), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $10 + 91;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(cancelAll)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.MeasureSpec.getMode(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 252, 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i7 = 1687675375;
        if (!(!INotificationSideChannelStub)) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(j) + 33603);
                    int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3085;
                    int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                    byte b3 = $$m[0];
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, i8, offsetBefore, -2146875848, false, $$u(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i7 = 1687675375;
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!INotificationSideChannel) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i9 = $10 + 91;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i11 = $11 + 113;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i13 = $10 + 29;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char bitsPerPixel = (char) (33601 - ImageFormat.getBitsPerPixel(0));
                int bitsPerPixel2 = 3084 - ImageFormat.getBitsPerPixel(0);
                int i15 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                byte b5 = $$m[0];
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, bitsPerPixel2, i15, -2146875848, false, $$u(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) Color.blue(0);
            int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
            int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr = $$j;
            Object[] objArr3 = new Object[1];
            m(bArr[5], bArr[7], bArr[132], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, bitsPerPixel, capsMode, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 16, null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        n(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iRed = Color.red(0) + 1031;
            int iRed2 = 15 - Color.red(0);
            byte[] bArr2 = $$j;
            byte b = bArr2[5];
            byte b2 = bArr2[7];
            Object[] objArr6 = new Object[1];
            m(b, b2, (short) (b2 | 51), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iRed, iRed2, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = getInterfaceDescriptor + 119;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int iAlpha = 15 - Color.alpha(0);
                byte b3 = $$j[7];
                Object[] objArr7 = new Object[1];
                m(b3, (byte) (b3 | 52), (short) 103, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, threadPriority, iAlpha, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iNextInt = new Random().nextInt(1544690135);
            int i8 = 1735288292 + (((~(iNextInt | 190892506)) | (-191818208)) * 305) + (((~((~iNextInt) | 190892506)) | (-53387664)) * 305) + 362204057;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step6).substring(20, 21).codePointAt(0) + 12, null, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_shopeepay_deeplink).substring(0, 9).codePointAt(3) + 15, null, null, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-393358003};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - ExpandableListView.getPackedPositionType(0L)), TextUtils.getCapsMode("", 0, 0) + 1134, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 362204057, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte[] bArr3 = $$j;
                    Object[] objArr13 = new Object[1];
                    m(bArr3[5], bArr3[7], bArr3[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, fadingEdgeLength, iArgb, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45993), 1117 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int iBlue = Color.blue(0) + 1031;
                    int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b4 = $$j[7];
                    Object[] objArr14 = new Object[1];
                    m(b4, (byte) (b4 | 52), (short) 103, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iBlue, pressedStateDuration, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_bank_name).substring(1, 2).length() + 126, null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i11 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 15;
                        byte[] bArr4 = $$j;
                        byte b5 = bArr4[5];
                        byte b6 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        m(b5, b6, (short) (b6 | 51), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, i11, deadChar2, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                        int deadChar3 = KeyEvent.getDeadChar(0, 0) + 1031;
                        int iArgb2 = Color.argb(0, 0, 0, 0) + 15;
                        byte[] bArr5 = $$j;
                        Object[] objArr18 = new Object[1];
                        m(bArr5[5], bArr5[7], bArr5[132], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, deadChar3, iArgb2, 1357589585, false, (String) objArr18[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i17 = ~(new Random().nextInt() | (-272662095));
            int i18 = i14 + ((((-712853401) + (((-516942265) | i17) * (-220))) + ((i17 | 5702) * 220)) - 1102269474);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr19[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[3])[0];
            int i23 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_city).substring(0, 1).length() + 1755944451;
            int i24 = (~((-438887042) | length)) | 270565504;
            int i25 = i21 + (-659599367) + (i24 * 992) + ((i24 | (~((~length) | (-26285335)))) * (-496)) + ((length | (-194606872)) * 496);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[2])[0] = i27 ^ (i27 << 5);
            int i28 = getInterfaceDescriptor + 7;
            RemoteActionCompatParcelizer = i28 % 128;
            int i29 = i28 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
            int i30 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
            int i31 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte b7 = $$j[5];
            Object[] objArr21 = new Object[1];
            m(b7, (byte) (b7 | 14), (short) 103, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, i30, i31, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i32 = getInterfaceDescriptor + 105;
            RemoteActionCompatParcelizer = i32 % 128;
            int i33 = i32 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c5 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int i34 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr6 = $$j;
                byte b8 = bArr6[5];
                byte b9 = bArr6[7];
                Object[] objArr22 = new Object[1];
                m(b8, b9, (short) (b9 | 51), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c5, scrollDefaultDelay, i34, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i35 = (((((~((-738778992) | iElapsedRealtime)) | 201904421) * (-283)) + 1516978720) + ((~(iElapsedRealtime | (-536874571))) * 283)) - 319434114;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[3])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, null, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, null, null, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {-393358003};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 42049), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1726, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), -319434114);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                int pressedStateDuration2 = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr7 = $$j;
                byte b10 = bArr7[5];
                byte b11 = bArr7[7];
                Object[] objArr27 = new Object[1];
                m(b10, b11, (short) (b11 | 51), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMakeMeasureSpec, iAxisFromString, pressedStateDuration2, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr28 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf3 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int i38 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                    byte[] bArr8 = $$j;
                    byte b12 = bArr8[5];
                    byte b13 = bArr8[7];
                    Object[] objArr30 = new Object[1];
                    m(b12, b13, (short) (b13 | 140), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf3, i38, maxKeyCode, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                    int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                    byte b14 = $$j[5];
                    Object[] objArr31 = new Object[1];
                    m(b14, (byte) (b14 | 14), (short) 103, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf4, edgeSlop, offsetBefore, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrB$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArr2[1])[0];
        int i40 = ((int[]) objArr2[0])[0];
        if (i40 == i39) {
            int i41 = getInterfaceDescriptor + 5;
            RemoteActionCompatParcelizer = i41 % 128;
            int i42 = i41 % 2;
            int i43 = ((int[]) objArr2[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
            int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i45 = i43 + (-594413423) + (((~(234952423 | i44)) | (-447554850)) * (-964)) + (((~((~i44) | 234952423)) | (-514668520)) * (-964));
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr32[3])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArr2[4];
        if (strArr5 != null) {
            for (String str2 : strArr5) {
                int i48 = getInterfaceDescriptor + 119;
                RemoteActionCompatParcelizer = i48 % 128;
                int i49 = i48 % 2;
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i40 / (((i40 - 1) * i40) % 2), 0).show();
        int i50 = ((int[]) objArr2[3])[0];
        Object[] objArr33 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i51 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i52 = i50 + (((~(669213853 | i51)) | (-325850699)) * 262) + 1636761649 + (((~((~i51) | 669213853)) | (-325850699)) * 262);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr33[3])[0] = i54 ^ (i54 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -637330483
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r7)
            r5 = -1409772665(0xffffffffabf89387, float:-1.7662407E-12)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = 409632(0x64020, float:5.74017E-40)
            r5 = r5 | r6
            int r5 = r5 * (-140)
            r6 = 1000104004(0x3b9c6044, float:0.004772218)
            int r6 = r6 + r5
            r5 = -1409363033(0xffffffffabfed3a7, float:-1.8106531E-12)
            r5 = r5 | r4
            int r5 = ~r5
            int r5 = r5 * 70
            int r6 = r6 + r5
            r5 = 579785121(0x228ed1a1, float:3.871113E-18)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = -1988738522(0xffffffff89764226, float:-2.9642276E-33)
            r4 = r4 | r5
            int r4 = r4 * 70
            int r6 = r6 + r4
            if (r1 != r6) goto La8
            java.lang.reflect.Member[] r1 = defpackage.checkUnsupportedFeatureCombinationAndThrow.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r7)
            r4 = -1723417950(0xffffffff9946baa2, float:-1.027405E-23)
            r4 = r4 | r2
            int r4 = r4 * 614
            r5 = 764568784(0x2d9264d0, float:1.6643048E-11)
            int r5 = r5 + r4
            int r2 = ~r2
            r4 = -406672734(0xffffffffe7c2aaa2, float:-1.8385734E24)
            r4 = r4 | r2
            int r4 = ~r4
            r6 = 402919424(0x18041000, float:1.7068678E-24)
            r4 = r4 | r6
            r6 = -2122584065(0xffffffff817befff, float:-4.6273608E-38)
            r6 = r6 | r2
            int r6 = ~r6
            r4 = r4 | r6
            int r4 = r4 * (-1228)
            int r5 = r5 + r4
            r4 = -3753310(0xffffffffffc6baa2, float:NaN)
            r4 = r4 | r2
            int r4 = ~r4
            r6 = -1719664641(0xffffffff997fffff, float:-1.3234889E-23)
            r2 = r2 | r6
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = r2 * 614
            int r5 = r5 + r2
            if (r1 == r5) goto L95
            int r1 = com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity.getInterfaceDescriptor
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r1 = -637330483(0xffffffffda031bcd, float:-9.225947E15)
            int[] r1 = new int[r1]
            r2 = -637330484(0xffffffffda031bcc, float:-9.225946E15)
            r4 = 1
            r1[r2] = r4
            r2 = -204487076(0xfffffffff3cfc65c, float:-3.2923238E31)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
        L95:
            super.onResume()
            int r1 = com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity.RemoteActionCompatParcelizer
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            if (r1 == 0) goto La4
            return
        La4:
            r3.hashCode()
            throw r3
        La8:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        if (i4 != (-1241492844) + ((~(1071640383 | i5)) * 623) + (((~i5) | 223772692) * (-623)) + (((~(i5 | 232712766)) | (~(1062700309 | i5)) | (-1071640384)) * 623)) {
            throw null;
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i6 != (((~((-1672996184) | iIdentityHashCode)) | 1438025042) * 398) + 940536478 + (((~((~iIdentityHashCode) | (-1672996184))) | 1438025042) * 398)) {
            throw null;
        }
        super.onStart();
        int i7 = getInterfaceDescriptor + 5;
        RemoteActionCompatParcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = getInterfaceDescriptor + 103;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
    }

    private static String $$u(byte b, byte b2, short s) {
        int i = b * 2;
        int i2 = b2 + 67;
        byte[] bArr = $$m;
        int i3 = 3 - (s * 3);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = i + i3;
            i3 = i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i6];
            i3 = i6;
            i4 = i5;
        }
    }
}
