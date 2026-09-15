package com.midtrans.sdk.corekit.models;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.PaymentType;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class IndosatDompetkuRequest {

    @SerializedName("customer_details")
    private CustomerDetailsEntity customerDetails;

    @SerializedName(PaymentType.INDOSAT_DOMPETKU)
    private IndosatDompetkuEntity indosatDompetku;

    @SerializedName("item_details")
    private List<ItemDetails> itemDetails;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("transaction_details")
    private TransactionDetails transactionDetails;

    public static class CustomerDetailsEntity {
        private String email;

        @SerializedName("first_name")
        private String firstName;

        @SerializedName("last_name")
        private String lastName;
        private String phone;

        public String getEmail() {
            return this.email;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getPhone() {
            return this.phone;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setFirstName(String str) {
            this.firstName = str;
        }

        public void setLastName(String str) {
            this.lastName = str;
        }

        public void setPhone(String str) {
            this.phone = str;
        }
    }

    public CustomerDetailsEntity getCustomerDetails() {
        return this.customerDetails;
    }

    public IndosatDompetkuEntity getIndosatDompetku() {
        return this.indosatDompetku;
    }

    public List<ItemDetails> getItemDetails() {
        return this.itemDetails;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails, ArrayList<ShippingAddress> arrayList, ArrayList<BillingAddress> arrayList2) {
        if (customerDetails != null) {
            CustomerDetailsEntity customerDetailsEntity = new CustomerDetailsEntity();
            this.customerDetails = customerDetailsEntity;
            customerDetailsEntity.setPhone(customerDetails.getPhone());
            this.customerDetails.setFirstName(customerDetails.getFirstName());
            this.customerDetails.setLastName(customerDetails.getLastName());
            this.customerDetails.setEmail(customerDetails.getEmail());
        }
    }

    public void setIndosatDompetku(IndosatDompetkuEntity indosatDompetkuEntity) {
        this.indosatDompetku = indosatDompetkuEntity;
    }

    public void setItemDetails(List<ItemDetails> list) {
        this.itemDetails = list;
    }

    public void setPaymentType(String str) {
        this.paymentType = str;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public static class IndosatDompetkuEntity {
        private String msisdn;
        private static final byte[] $$a = {93, -122, -23, -24};
        private static final int $$b = 207;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60045, 60095, 60075, 60085, 60061, 60072, 60117, 60102, 60059, 60043, 60098, 59745, 60035, 60119, 60088, 60093, 60048, 60034, 60107, 60053, 60078, 59747, 60056, 60050, 60040, 60052, 60067, 60058, 60082, 60057, 60044, 59746, 60047, 60054, 60090, 60084, 60062, 60049, 60089, 59744, 60123, 60060, 60063, 60041, 60110, 60051, 60055, 60046, 60086};
        private static char TuitionPaymentFragmentbindingInflater1 = 57190;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59724, 59779, 59777, 59781, 59779, 59777, 59782, 59780, 59784, 59753, 59737, 59743, 59747, 59758, 59738, 59737, 59743, 59763, 59774, 59750, 59803, 59805, 59782, 59746, 59774, 59795, 59803, 59780, 59806, 59781, 59789, 59781, 59769, 59774, 59781, 59782, 59782, 59788, 59742, 59822, 59807, 59822, 59848, 59842, 59846, 59843, 59853, 59839, 59799, 59816, 59793, 59799, 59834, 59821, 59798, 59833, 59840, 59843, 59851, 59834, 59780, 59796, 59848, 59842, 59846, 59843, 59853, 59839, 59799, 59704, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59740, 59756, 59746, 59732, 59836, 59833, 59835, 59832, 59832, 59816, 59822, 59833, 59835, 59833, 59832, 59813, 59823, 59776, 59794, 59825, 59792, 59798, 59830, 59838, 59827, 59830, 59825, 59838, 59807, 59806, 59833, 59827, 59831, 59836, 59838, 59832, 59741, 59811, 59821, 59822, 59836, 59704, 59757, 59751, 59733, 59728, 59771, 59768, 59745, 59756, 59747, 59759};

        private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
            int i;
            int i2;
            int i3 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i4 = 0;
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(i4), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1270, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 407021364, false, $$c(b2, b3, (byte) (b3 | 16)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i9++;
                        i4 = 0;
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
            System.arraycopy(cArr, i5, cArr3, 0, i6);
            if (bArr != null) {
                char[] cArr4 = new char[i6];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i6) {
                    int i10 = $11 + 43;
                    $10 = i10 % 128;
                    if (i10 % 2 == 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 1) {
                        int i11 = setvideostabilizationmode.b;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755, 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 387247676, false, $$c(b4, b5, (byte) (b5 | 15)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myTid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3224, 12 - TextUtils.lastIndexOf("", '0', 0, 0), 2133916302, false, $$c(b6, b7, (byte) (b7 | 17)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        int i13 = $11 + 99;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    c = cArr4[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - TextUtils.getTrimmedLength("")), View.combineMeasuredStates(0, 0) + 1705, Color.red(0) + 21, -1434471773, false, $$c(b8, b9, (byte) (b9 | 11)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                int i15 = $10 + 27;
                $11 = i15 % 128;
                i = 2;
                int i16 = i15 % 2;
                cArr3 = cArr4;
            } else {
                i = 2;
            }
            if (i8 > 0) {
                int i17 = $11 + 111;
                $10 = i17 % 128;
                int i18 = i17 % i;
                char[] cArr5 = new char[i6];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i19 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i19, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i19);
            } else {
                i2 = 0;
            }
            if (z) {
                char[] cArr6 = new char[i6];
                while (true) {
                    setvideostabilizationmode.b = i2;
                    if (setvideostabilizationmode.b >= i6) {
                        break;
                    }
                    int i20 = $10 + 53;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                    i2 = setvideostabilizationmode.b + 1;
                }
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                int i22 = 0;
                while (true) {
                    setvideostabilizationmode.b = i22;
                    if (setvideostabilizationmode.b >= i6) {
                        break;
                    }
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    i22 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr3);
            int i23 = $10 + 69;
            $11 = i23 % 128;
            if (i23 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            char c;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            char c2 = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = $11 + 15;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror(c2) - '0'), ((byte) KeyEvent.getModifierMetaStateMask()) + 2268, (-16777183) - Color.rgb(0, 0, 0), -1927765101, false, $$c(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
                        c2 = '0';
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
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            char c3 = '\b';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getSize(0) + 2267, 33 - ExpandableListView.getPackedPositionType(0L), -1927765101, false, $$c(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
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
                        int i7 = $11 + 51;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >>> b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> b2);
                        } else {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        }
                        c = c3;
                    } else {
                        try {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = deinitsession;
                            objArr4[11] = Integer.valueOf(cCharValue);
                            objArr4[10] = deinitsession;
                            objArr4[9] = deinitsession;
                            objArr4[c3] = Integer.valueOf(cCharValue);
                            objArr4[7] = deinitsession;
                            objArr4[6] = deinitsession;
                            objArr4[5] = Integer.valueOf(cCharValue);
                            objArr4[4] = deinitsession;
                            objArr4[3] = deinitsession;
                            objArr4[2] = Integer.valueOf(cCharValue);
                            objArr4[1] = deinitsession;
                            objArr4[0] = deinitsession;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49267), (ViewConfiguration.getLongPressTimeout() >> 16) + 3261, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31, -127612708, false, $$c(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                int i8 = $10 + 123;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                try {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b9 = (byte) 0;
                                        byte b10 = b9;
                                        c = '\b';
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 594, 16 - TextUtils.indexOf((CharSequence) "", '0'), 1570859318, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    } else {
                                        c = '\b';
                                    }
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                    int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                c = '\b';
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                                    int i13 = $11 + 109;
                                    $10 = i13 % 128;
                                    int i14 = i13 % 2;
                                } else {
                                    int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    c3 = c;
                }
            }
            int i17 = 0;
            while (i17 < i) {
                int i18 = $11 + 69;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 12353);
                    i17 += 38;
                } else {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public String getMsisdn() {
            int i = 2 % 2;
            int i2 = b + 53;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            String str = this.msisdn;
            int i5 = i3 + 51;
            b = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setMsisdn(String str) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            this.msisdn = str;
            int i5 = i2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r23v2 */
        /* JADX WARN: Type inference failed for: r23v3 */
        /* JADX WARN: Type inference failed for: r23v4 */
        /* JADX WARN: Type inference failed for: r24v14 */
        /* JADX WARN: Type inference failed for: r2v250, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v100, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v105, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r6v107, types: [char[]] */
        /* JADX WARN: Type inference failed for: r6v147 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v35, types: [int] */
        /* JADX WARN: Type inference failed for: r6v36 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.reflect.Constructor] */
        /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v56 */
        /* JADX WARN: Type inference failed for: r6v85 */
        /* JADX WARN: Type inference failed for: r6v86 */
        /* JADX WARN: Type inference failed for: r6v87 */
        /* JADX WARN: Type inference failed for: r6v90 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r27, int r28, int r29) {
            /*
                Method dump skipped, instruction units count: 4049
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.IndosatDompetkuRequest.IndosatDompetkuEntity.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int):java.lang.Object[]");
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
        private static java.lang.String $$c(short r6, short r7, byte r8) {
            /*
                byte[] r0 = com.midtrans.sdk.corekit.models.IndosatDompetkuRequest.IndosatDompetkuEntity.$$a
                int r6 = r6 * 2
                int r6 = 3 - r6
                int r7 = r7 * 3
                int r1 = r7 + 1
                int r8 = 116 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2a
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L2a:
                int r4 = -r4
                int r6 = r6 + r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.IndosatDompetkuRequest.IndosatDompetkuEntity.$$c(short, short, byte):java.lang.String");
        }
    }
}
