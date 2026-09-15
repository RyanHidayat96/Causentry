package com.bpjstku.databinding;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentAsikActiveParticipantCitizenshipDocumentBinding implements ViewBinding {
    public final MaterialButton btnMin;
    public final MaterialButton btnNext;
    public final MaterialButton btnPlus;
    public final ConstraintLayout childrenContainer;
    public final LinearLayout childrenNameContainer;
    public final CardView cvScanKK;
    public final CardView cvScanKtp;
    public final TextInputEditText edtBirthDateFather;
    public final TextInputEditText edtBirthDateFirstChildren;
    public final TextInputEditText edtBirthDateMother;
    public final TextInputEditText edtBirthDateSecondChildren;
    public final TextInputEditText edtBirthDateSpouse;
    public final TextInputEditText edtChildren;
    public final TextInputEditText edtMaritalStatus;
    public final ImageView imgKKPhoto;
    public final ImageView imgKKUpload;
    public final ImageView imgKtpPhoto;
    public final ImageView imgKtpUpload;
    public final ConstraintLayout mainContainer;
    public final AppCompatRadioButton rbFemale;
    public final AppCompatRadioButton rbMale;
    public final RadioGroup rgChooseGender;
    private final ScrollView rootView;
    public final TextInputLayout tilBirthDateFather;
    public final TextInputLayout tilBirthDateFirstChildren;
    public final TextInputLayout tilBirthDateMother;
    public final TextInputLayout tilBirthDateSecondChildren;
    public final TextInputLayout tilBirthDateSpouse;
    public final TextInputLayout tilChildren;
    public final TextInputLayout tilFatherName;
    public final TextInputLayout tilFirstChild;
    public final TextInputLayout tilMaritalStatus;
    public final TextInputLayout tilMotherName;
    public final TextInputLayout tilSecondChild;
    public final TextInputLayout tilSpouseName;
    public final TextView tvChildren;
    public final TextView tvGender;
    public final TextView tvKKError;
    public final TextView tvKtpError;
    public final TextView tvReminderVerifyDataPersonal;
    public final TextView tvScanKK;
    public final TextView tvScanKKLabel;
    public final TextView tvScanKTP;
    public final TextView tvScanKTPLabel;
    private static final byte[] $$c = {46, 126, -84, 108};
    private static final int $$d = 62;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {5, -91, 77, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 209;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {43223, 52070, 28587, 33760, 9746, 23200, 65275, 4358, 45560, 53833, 30340, 39626, 16181, 17280, 59353, 19041, 10714, 36125, 24954, 50405, 47127, 7242, 62389, 22508, 51989, 44735, 755, 58937, 17812, 14812, 40250, 29033, 54487, 18446, 45548, 53854, 30357, 39650, 16168, 17343, 59336, 2093, 44159, 12487, 21800, 63870, 7613, 48655, 49753, 59203, 35011, 60284, 20390, 41920, 1549, 31419, 57062, 12636, 38211, 2530, 27698, 49180, 9379, 34609, 64374, 24475, 46036, 5755, 35510, 61131, 16694, 42426, 6640, 31767, 53315, 13558, 45567, 53849, 30350, 39678, 16185, 17282, 59336, 2061, 44140, 12508, 21776, 63845, 7615, 48653, 49736, 26277, 35571, 12098};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -5806913415575973332L;

    private static void c(int i, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i * 52;
        int i3 = 98 - (b2 * 14);
        int i4 = (s * 3) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + i4) - 11;
            i4++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i4;
            i3 = (i3 + bArr[i4]) - 11;
            i4 = i7 + 1;
            i5 = i6;
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        ScrollView root = getRoot();
        int i3 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        char c2 = 0;
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[c2] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int packedPositionChild = 2186 - ExpandableListView.getPackedPositionChild(0L);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 41;
                    byte b2 = (byte) ($$d & 3);
                    byte b3 = (byte) (b2 - 2);
                    String str$$e = $$e(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[c2] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, packedPositionChild, packedPositionChild2, 841711447, false, str$$e, clsArr);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getSize(0) + 33017), 3011 - Gravity.getAbsoluteGravity(0, 0), Color.blue(0) + 26, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSize(0, 0) + 36505), TextUtils.getOffsetBefore("", 0) + 3376, 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -968507904, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                c2 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 31;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 1;
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36505), TextUtils.lastIndexOf("", '0', 0, 0) + 3377, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -968507904, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i9 = $10 + 1;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private FragmentAsikActiveParticipantCitizenshipDocumentBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ConstraintLayout constraintLayout, LinearLayout linearLayout, CardView cardView, CardView cardView2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, TextInputEditText textInputEditText7, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = scrollView;
        this.btnMin = materialButton;
        this.btnNext = materialButton2;
        this.btnPlus = materialButton3;
        this.childrenContainer = constraintLayout;
        this.childrenNameContainer = linearLayout;
        this.cvScanKK = cardView;
        this.cvScanKtp = cardView2;
        this.edtBirthDateFather = textInputEditText;
        this.edtBirthDateFirstChildren = textInputEditText2;
        this.edtBirthDateMother = textInputEditText3;
        this.edtBirthDateSecondChildren = textInputEditText4;
        this.edtBirthDateSpouse = textInputEditText5;
        this.edtChildren = textInputEditText6;
        this.edtMaritalStatus = textInputEditText7;
        this.imgKKPhoto = imageView;
        this.imgKKUpload = imageView2;
        this.imgKtpPhoto = imageView3;
        this.imgKtpUpload = imageView4;
        this.mainContainer = constraintLayout2;
        this.rbFemale = appCompatRadioButton;
        this.rbMale = appCompatRadioButton2;
        this.rgChooseGender = radioGroup;
        this.tilBirthDateFather = textInputLayout;
        this.tilBirthDateFirstChildren = textInputLayout2;
        this.tilBirthDateMother = textInputLayout3;
        this.tilBirthDateSecondChildren = textInputLayout4;
        this.tilBirthDateSpouse = textInputLayout5;
        this.tilChildren = textInputLayout6;
        this.tilFatherName = textInputLayout7;
        this.tilFirstChild = textInputLayout8;
        this.tilMaritalStatus = textInputLayout9;
        this.tilMotherName = textInputLayout10;
        this.tilSecondChild = textInputLayout11;
        this.tilSpouseName = textInputLayout12;
        this.tvChildren = textView;
        this.tvGender = textView2;
        this.tvKKError = textView3;
        this.tvKtpError = textView4;
        this.tvReminderVerifyDataPersonal = textView5;
        this.tvScanKK = textView6;
        this.tvScanKKLabel = textView7;
        this.tvScanKTP = textView8;
        this.tvScanKTPLabel = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        ScrollView scrollView = this.rootView;
        int i5 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return scrollView;
        }
        throw null;
    }

    public static FragmentAsikActiveParticipantCitizenshipDocumentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingInflate = inflate(layoutInflater, null, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentAsikActiveParticipantCitizenshipDocumentBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static FragmentAsikActiveParticipantCitizenshipDocumentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_citizenship_document, viewGroup, true);
            if (!(!z)) {
                viewGroup.addView(viewInflate);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                b = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_citizenship_document, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                b = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0267  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:105:0x027c A[PHI: r2
  0x027c: PHI (r2v117 android.widget.TextView) = (r2v116 android.widget.TextView), (r2v132 android.widget.TextView) binds: [B:104:0x027a, B:101:0x0271] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x028b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0298  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:148:0x0356 A[PHI: r3
  0x0356: PHI (r3v5 int) = 
  (r3v4 int)
  (r3v8 int)
  (r3v16 int)
  (r3v19 int)
  (r3v21 int)
  (r3v23 int)
  (r3v25 int)
  (r3v27 int)
  (r3v27 int)
  (r3v25 int)
  (r3v21 int)
 binds: [B:11:0x003f, B:17:0x0062, B:31:0x00c0, B:41:0x00ff, B:74:0x01cb, B:82:0x01ff, B:93:0x023b, B:104:0x027a, B:101:0x0271, B:90:0x0232, B:71:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd A[PHI: r2
  0x01cd: PHI (r2v83 com.google.android.material.textfield.TextInputLayout) = 
  (r2v82 com.google.android.material.textfield.TextInputLayout)
  (r2v136 com.google.android.material.textfield.TextInputLayout)
 binds: [B:74:0x01cb, B:71:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0201  */
    /* JADX WARN: Code duplicated, block: B:85:0x020e  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x0235  */
    /* JADX WARN: Code duplicated, block: B:94:0x023d A[PHI: r2
  0x023d: PHI (r2v105 android.widget.TextView) = (r2v104 android.widget.TextView), (r2v134 android.widget.TextView) binds: [B:93:0x023b, B:90:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x024c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0259  */
    public static FragmentAsikActiveParticipantCitizenshipDocumentBinding bind(View view) {
        TextInputLayout textInputLayout;
        TextInputLayout textInputLayout2;
        TextInputLayout textInputLayout3;
        TextInputLayout textInputLayout4;
        int i;
        TextInputLayout textInputLayout5;
        TextInputLayout textInputLayout6;
        TextView textView;
        int i2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        int i3;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        int i4 = 2 % 2;
        int i5 = R.id.btnMin;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnMin);
        if (materialButton != null) {
            i5 = R.id.btnNext;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton2 != null) {
                i5 = R.id.btnPlus;
                MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnPlus);
                if (materialButton3 != null) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = R.id.childrenContainer;
                    Object obj = null;
                    if (i7 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.childrenContainer);
                    if (constraintLayout != null) {
                        i5 = R.id.childrenNameContainer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.childrenNameContainer);
                        if (linearLayout != null) {
                            int i9 = b + 83;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            int i10 = i9 % 2;
                            i8 = R.id.cvScanKK;
                            if (i10 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvScanKK);
                            if (cardView != null) {
                                i5 = R.id.cvScanKtp;
                                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvScanKtp);
                                if (cardView2 != null) {
                                    i5 = R.id.edtBirthDateFather;
                                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFather);
                                    if (textInputEditText != null) {
                                        i5 = R.id.edtBirthDateFirstChildren;
                                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFirstChildren);
                                        if (textInputEditText2 != null) {
                                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                                            b = i11 % 128;
                                            int i12 = i11 % 2;
                                            i5 = R.id.edtBirthDateMother;
                                            TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateMother);
                                            if (textInputEditText3 != null) {
                                                i5 = R.id.edtBirthDateSecondChildren;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSecondChildren);
                                                if (textInputEditText4 != null) {
                                                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                                                    b = i13 % 128;
                                                    int i14 = i13 % 2;
                                                    i8 = R.id.edtBirthDateSpouse;
                                                    if (i14 == 0) {
                                                        throw null;
                                                    }
                                                    TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSpouse);
                                                    if (textInputEditText5 != null) {
                                                        i5 = R.id.edtChildren;
                                                        TextInputEditText textInputEditText6 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChildren);
                                                        if (textInputEditText6 != null) {
                                                            TextInputEditText textInputEditText7 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtMaritalStatus);
                                                            if (textInputEditText7 != null) {
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKKPhoto);
                                                                if (imageView != null) {
                                                                    int i15 = b + 119;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                                                                    int i16 = i15 % 2;
                                                                    i8 = R.id.imgKKUpload;
                                                                    if (i16 != 0) {
                                                                        obj.hashCode();
                                                                        throw null;
                                                                    }
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKKUpload);
                                                                    if (imageView2 == null) {
                                                                        i5 = i8;
                                                                    } else {
                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpPhoto);
                                                                        if (imageView3 != null) {
                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpUpload);
                                                                            if (imageView4 != null) {
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.mainContainer);
                                                                                if (constraintLayout2 != null) {
                                                                                    AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbFemale);
                                                                                    if (appCompatRadioButton != null) {
                                                                                        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbMale);
                                                                                        if (appCompatRadioButton2 != null) {
                                                                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseGender);
                                                                                            if (radioGroup != null) {
                                                                                                TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFather);
                                                                                                if (textInputLayout7 != null) {
                                                                                                    TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFirstChildren);
                                                                                                    if (textInputLayout8 != null) {
                                                                                                        TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateMother);
                                                                                                        if (textInputLayout9 != null) {
                                                                                                            TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSecondChildren);
                                                                                                            if (textInputLayout10 != null) {
                                                                                                                TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSpouse);
                                                                                                                if (textInputLayout11 != null) {
                                                                                                                    TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChildren);
                                                                                                                    if (textInputLayout12 != null) {
                                                                                                                        TextInputLayout textInputLayout13 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFatherName);
                                                                                                                        if (textInputLayout13 != null) {
                                                                                                                            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                                                                                                                            b = i17 % 128;
                                                                                                                            int i18 = i17 % 2;
                                                                                                                            i8 = R.id.tilFirstChild;
                                                                                                                            if (i18 == 0) {
                                                                                                                                textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFirstChild);
                                                                                                                                int i19 = 74 / 0;
                                                                                                                                if (textInputLayout != null) {
                                                                                                                                    textInputLayout2 = textInputLayout;
                                                                                                                                    textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMaritalStatus);
                                                                                                                                    if (textInputLayout3 != null) {
                                                                                                                                        textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMotherName);
                                                                                                                                        if (textInputLayout4 != null) {
                                                                                                                                            int i20 = b + 109;
                                                                                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                                                                                                                                            i = i20 % 2;
                                                                                                                                            i8 = R.id.tilSecondChild;
                                                                                                                                            if (i == 0) {
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSecondChild);
                                                                                                                                            if (textInputLayout5 == null) {
                                                                                                                                                textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSpouseName);
                                                                                                                                                if (textInputLayout6 != null) {
                                                                                                                                                    textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChildren);
                                                                                                                                                    if (textView != null) {
                                                                                                                                                        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                                                                                                                                                        b = i21 % 128;
                                                                                                                                                        i2 = i21 % 2;
                                                                                                                                                        i8 = R.id.tvGender;
                                                                                                                                                        if (i2 == 0) {
                                                                                                                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGender);
                                                                                                                                                            int i22 = 6 / 0;
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                textView3 = textView2;
                                                                                                                                                                textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKKError);
                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                    textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKtpError);
                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                        int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                                                                                                                                                                        b = i23 % 128;
                                                                                                                                                                        i3 = i23 % 2;
                                                                                                                                                                        i8 = R.id.tvReminderVerifyDataPersonal;
                                                                                                                                                                        if (i3 == 0) {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            int i24 = 24 / 0;
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i25 % 128;
                                                                                                                                                                                            int i26 = i25 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i27 % 128;
                                                                                                                                                                                            int i28 = i27 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i5 = R.id.tvKtpError;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i5 = R.id.tvKKError;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGender);
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                textView3 = textView2;
                                                                                                                                                                textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKKError);
                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                    textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKtpError);
                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                        int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                                                                                                                                                                        b = i29 % 128;
                                                                                                                                                                        i3 = i29 % 2;
                                                                                                                                                                        i8 = R.id.tvReminderVerifyDataPersonal;
                                                                                                                                                                        if (i3 == 0) {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            int i210 = 24 / 0;
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i211 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i211 % 128;
                                                                                                                                                                                            int i212 = i211 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i213 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i213 % 128;
                                                                                                                                                                                            int i214 = i213 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i5 = R.id.tvKtpError;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i5 = R.id.tvKKError;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i5 = R.id.tvChildren;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i5 = R.id.tilSpouseName;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i5 = R.id.tilMotherName;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i5 = R.id.tilMaritalStatus;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFirstChild);
                                                                                                                                if (textInputLayout != null) {
                                                                                                                                    textInputLayout2 = textInputLayout;
                                                                                                                                    textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMaritalStatus);
                                                                                                                                    if (textInputLayout3 != null) {
                                                                                                                                        textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMotherName);
                                                                                                                                        if (textInputLayout4 != null) {
                                                                                                                                            int i215 = b + 109;
                                                                                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i215 % 128;
                                                                                                                                            i = i215 % 2;
                                                                                                                                            i8 = R.id.tilSecondChild;
                                                                                                                                            if (i == 0) {
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSecondChild);
                                                                                                                                            if (textInputLayout5 == null) {
                                                                                                                                                textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSpouseName);
                                                                                                                                                if (textInputLayout6 != null) {
                                                                                                                                                    textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChildren);
                                                                                                                                                    if (textView != null) {
                                                                                                                                                        int i216 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                                                                                                                                                        b = i216 % 128;
                                                                                                                                                        i2 = i216 % 2;
                                                                                                                                                        i8 = R.id.tvGender;
                                                                                                                                                        if (i2 == 0) {
                                                                                                                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGender);
                                                                                                                                                            int i217 = 6 / 0;
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                textView3 = textView2;
                                                                                                                                                                textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKKError);
                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                    textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKtpError);
                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                        int i218 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                                                                                                                                                                        b = i218 % 128;
                                                                                                                                                                        i3 = i218 % 2;
                                                                                                                                                                        i8 = R.id.tvReminderVerifyDataPersonal;
                                                                                                                                                                        if (i3 == 0) {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            int i219 = 24 / 0;
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i2110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i2110 % 128;
                                                                                                                                                                                            int i2111 = i2110 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i2112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i2112 % 128;
                                                                                                                                                                                            int i2113 = i2112 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i5 = R.id.tvKtpError;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i5 = R.id.tvKKError;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGender);
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                textView3 = textView2;
                                                                                                                                                                textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKKError);
                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                    textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKtpError);
                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                        int i2114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                                                                                                                                                                        b = i2114 % 128;
                                                                                                                                                                        i3 = i2114 % 2;
                                                                                                                                                                        i8 = R.id.tvReminderVerifyDataPersonal;
                                                                                                                                                                        if (i3 == 0) {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            int i2115 = 24 / 0;
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i2116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i2116 % 128;
                                                                                                                                                                                            int i2117 = i2116 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                textView7 = textView6;
                                                                                                                                                                                textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            int i2118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                                                                                                                                                                            b = i2118 % 128;
                                                                                                                                                                                            int i2119 = i2118 % 2;
                                                                                                                                                                                            textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                return new FragmentAsikActiveParticipantCitizenshipDocumentBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView3, textView4, textView5, textView7, textView8, textView9, textView10, textView11);
                                                                                                                                                                                            }
                                                                                                                                                                                            i5 = R.id.tvScanKTPLabel;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i5 = R.id.tvScanKTP;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i5 = R.id.tvScanKKLabel;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i5 = R.id.tvScanKK;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i5 = R.id.tvKtpError;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i5 = R.id.tvKKError;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i5 = R.id.tvChildren;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i5 = R.id.tilSpouseName;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i5 = R.id.tilMotherName;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i5 = R.id.tilMaritalStatus;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i5 = i8;
                                                                                                                        } else {
                                                                                                                            i5 = R.id.tilFatherName;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i5 = R.id.tilChildren;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i5 = R.id.tilBirthDateSpouse;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i5 = R.id.tilBirthDateSecondChildren;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i5 = R.id.tilBirthDateMother;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i5 = R.id.tilBirthDateFirstChildren;
                                                                                                    }
                                                                                                } else {
                                                                                                    i5 = R.id.tilBirthDateFather;
                                                                                                }
                                                                                            } else {
                                                                                                i5 = R.id.rgChooseGender;
                                                                                            }
                                                                                        } else {
                                                                                            i5 = R.id.rbMale;
                                                                                        }
                                                                                    } else {
                                                                                        i5 = R.id.rbFemale;
                                                                                    }
                                                                                } else {
                                                                                    i5 = R.id.mainContainer;
                                                                                }
                                                                            } else {
                                                                                i5 = R.id.imgKtpUpload;
                                                                            }
                                                                        } else {
                                                                            i5 = R.id.imgKtpPhoto;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i5 = R.id.imgKKPhoto;
                                                                }
                                                            } else {
                                                                i5 = R.id.edtMaritalStatus;
                                                            }
                                                        }
                                                    } else {
                                                        i5 = i8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i5 = i8;
                            }
                        }
                    } else {
                        i5 = i8;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 30541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Class r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 3054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.FragmentAsikActiveParticipantCitizenshipDocumentBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Class, int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, int r8, byte r9) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r0 = com.bpjstku.databinding.FragmentAsikActiveParticipantCitizenshipDocumentBinding.$$c
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.FragmentAsikActiveParticipantCitizenshipDocumentBinding.$$e(byte, int, byte):java.lang.String");
    }
}
