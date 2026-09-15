package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public class setParameters {
    private final double[] INotificationSideChannel;
    public long TuitionPaymentFragmentbindingInflater1;
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1376a;
    public Object asBinder;
    public Object asInterface;
    public int b;
    private final Object[] cancel;
    private final long[] cancelAll;
    private final int[] d;
    private int g;
    private final float[] onTransact;

    public setParameters(Object obj) {
        this.d = new int[38];
        this.cancelAll = new long[38];
        this.onTransact = new float[38];
        this.INotificationSideChannel = new double[38];
        Object[] objArr = new Object[38];
        this.cancel = objArr;
        objArr[9] = obj;
        this.g = 0;
        this.f1376a = -1;
    }

    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                iArr[i2] = this.b;
                return 0;
            case 2:
                int i3 = this.g - 1;
                this.g = i3;
                int[] iArr2 = this.d;
                iArr2[10] = iArr2[i3];
                return 0;
            case 3:
                Object[] objArr = this.cancel;
                int i4 = this.g;
                this.g = i4 + 1;
                objArr[i4] = objArr[9];
                return 0;
            case 4:
                int i5 = this.g - this.b;
                this.g = i5;
                this.f1376a = i5;
                return 0;
            case 5:
                Object[] objArr2 = this.cancel;
                int i6 = this.f1376a;
                this.f1376a = i6 + 1;
                Object obj = objArr2[i6];
                objArr2[i6] = null;
                this.asBinder = obj;
                return 0;
            case 6:
                int[] iArr3 = this.d;
                int i7 = this.f1376a;
                this.f1376a = i7 + 1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr3[i7];
                return 0;
            case 7:
                int[] iArr4 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                iArr4[i8] = iArr4[10];
                return 0;
            case 8:
                Object[] objArr3 = this.cancel;
                int i9 = this.g;
                this.g = i9 + 1;
                objArr3[i9] = this.asInterface;
                return 0;
            case 9:
                int[] iArr5 = this.d;
                int i10 = this.g;
                this.g = i10 + 1;
                iArr5[i10] = 18;
                return 0;
            case 10:
                int i11 = this.g;
                int i12 = i11 - 1;
                this.g = i12;
                int[] iArr6 = this.d;
                Object[] objArr4 = this.cancel;
                Object obj2 = objArr4[i11 - 2];
                objArr4[i11 - 2] = null;
                iArr6[i11 - 2] = ((byte[]) obj2)[iArr6[i12]];
                iArr6[i11 - 2] = -iArr6[i11 - 2];
                return 0;
            case 11:
                int[] iArr7 = this.d;
                int i13 = this.g;
                this.g = i13 + 1;
                iArr7[i13] = iArr7[i13 - 1];
                return 0;
            case 12:
                int i14 = this.g;
                int i15 = i14 - 1;
                this.g = i15;
                int[] iArr8 = this.d;
                Object[] objArr5 = this.cancel;
                Object obj3 = objArr5[i14 - 2];
                objArr5[i14 - 2] = null;
                iArr8[i14 - 2] = ((byte[]) obj3)[iArr8[i15]];
                return 0;
            case 13:
                int[] iArr9 = this.d;
                int i16 = this.g;
                this.g = i16 + 1;
                iArr9[i16] = 1;
                return 0;
            case 14:
                Object[] objArr6 = this.cancel;
                int i17 = this.g;
                objArr6[i17] = objArr6[i17 - 1];
                this.g = i17;
                Object obj4 = objArr6[i17];
                objArr6[i17] = null;
                objArr6[11] = obj4;
                return 0;
            case 15:
                Object[] objArr7 = this.cancel;
                int i18 = this.g;
                objArr7[i18] = objArr7[11];
                int[] iArr10 = this.d;
                iArr10[i18 + 1] = 0;
                int i19 = i18 + 1;
                this.g = i19;
                Object obj5 = objArr7[i18];
                objArr7[i18] = null;
                objArr7[i18] = ((Object[]) obj5)[iArr10[i19]];
                return 0;
            case 16:
                int[] iArr11 = this.d;
                int i20 = this.g;
                iArr11[i20] = 18;
                this.g = i20;
                Object[] objArr8 = this.cancel;
                Object obj6 = objArr8[i20 - 1];
                objArr8[i20 - 1] = null;
                iArr11[i20 - 1] = ((byte[]) obj6)[iArr11[i20]];
                this.g = i20 + 1;
                iArr11[i20] = 1;
                return 0;
            case 17:
                int i21 = this.g;
                int i22 = i21 - 1;
                int[] iArr12 = this.d;
                iArr12[i21 - 2] = iArr12[i21 - 2] + iArr12[i22];
                this.g = i21;
                iArr12[i22] = iArr12[i21 - 2];
                return 0;
            case 18:
                int[] iArr13 = this.d;
                int i23 = this.g;
                iArr13[i23] = iArr13[i23 - 1];
                iArr13[i23 + 1] = 14;
                int i24 = i23 + 1;
                this.g = i24;
                iArr13[i23] = iArr13[i24] | iArr13[i23];
                return 0;
            case 19:
                Object[] objArr9 = this.cancel;
                int i25 = this.g;
                objArr9[i25] = objArr9[i25 - 1];
                int[] iArr14 = this.d;
                this.g = i25 + 2;
                iArr14[i25 + 1] = 0;
                return 0;
            case 20:
                int i26 = this.g;
                int i27 = i26 - 3;
                this.g = i27;
                Object[] objArr10 = this.cancel;
                Object obj7 = objArr10[i27];
                objArr10[i27] = null;
                int i28 = this.d[i26 - 2];
                Object obj8 = objArr10[i26 - 1];
                objArr10[i26 - 1] = null;
                ((Object[]) obj7)[i28] = obj8;
                return 0;
            case 21:
                Object[] objArr11 = this.cancel;
                int i29 = this.g;
                this.g = i29 + 1;
                objArr11[i29] = null;
                return 0;
            case 22:
                long[] jArr = this.cancelAll;
                int i30 = this.g;
                this.g = i30 + 1;
                jArr[i30] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                return 0;
            case 23:
                long[] jArr2 = this.cancelAll;
                int i31 = this.f1376a;
                this.f1376a = i31 + 1;
                this.TuitionPaymentFragmentbindingInflater1 = jArr2[i31];
                return 0;
            case 24:
                int i32 = this.g - 1;
                this.g = i32;
                this.cancel[i32] = null;
                return 0;
            case 25:
                int i33 = this.g - 1;
                this.g = i33;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d[i33] == 0 ? 0 : 1;
                return 0;
            case 26:
                int[] iArr15 = this.d;
                int i34 = this.g;
                this.g = i34 + 1;
                iArr15[i34] = 2;
                return 0;
            case 27:
                int i35 = this.g;
                int i36 = i35 - 1;
                this.g = i36;
                int[] iArr16 = this.d;
                iArr16[i35 - 2] = iArr16[i35 - 2] % iArr16[i36];
                return 0;
            case 28:
                int[] iArr17 = this.d;
                int i37 = this.g;
                iArr17[i37] = 2;
                this.g = i37;
                iArr17[i37 - 1] = iArr17[i37 - 1] % iArr17[i37];
                int i38 = i37 - 1;
                this.g = i38;
                this.cancel[i38] = null;
                return 0;
            case 29:
                int[] iArr18 = this.d;
                int i39 = this.g;
                iArr18[i39] = 27;
                iArr18[i39 - 1] = iArr18[i39 - 1] + iArr18[i39];
                this.g = i39 + 1;
                iArr18[i39] = iArr18[i39 - 1];
                return 0;
            case 30:
                int[] iArr19 = this.d;
                int i40 = this.g;
                iArr19[i40] = 128;
                this.g = i40;
                iArr19[i40 - 1] = iArr19[i40 - 1] % iArr19[i40];
                return 0;
            case 31:
                int i41 = this.g - 1;
                this.g = i41;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d[i41] != 0 ? 0 : 1;
                return 0;
            case 32:
                int[] iArr20 = this.d;
                int i42 = this.g;
                this.g = i42 + 1;
                iArr20[i42] = 3;
                return 0;
            case 33:
                int[] iArr21 = this.d;
                int i43 = this.g;
                this.g = i43 + 1;
                iArr21[i43] = 4;
                return 0;
            case 34:
                int i44 = this.g;
                int i45 = i44 - 1;
                this.g = i45;
                int[] iArr22 = this.d;
                iArr22[i44 - 2] = iArr22[i44 - 2] + iArr22[i45];
                return 0;
            case 35:
                int[] iArr23 = this.d;
                int i46 = this.g;
                iArr23[i46] = 23;
                this.g = i46;
                iArr23[i46 - 1] = iArr23[i46 - 1] + iArr23[i46];
                return 0;
            case 36:
                int[] iArr24 = this.d;
                int i47 = this.g;
                iArr24[i47] = iArr24[i47 - 1];
                this.g = i47 + 2;
                iArr24[i47 + 1] = 128;
                return 0;
            case 37:
                int[] iArr25 = this.d;
                int i48 = this.g;
                iArr25[i48] = 2;
                this.g = i48;
                iArr25[i48 - 1] = iArr25[i48 - 1] % iArr25[i48];
                return 0;
            case 38:
                int[] iArr26 = this.d;
                int i49 = this.g;
                iArr26[i49] = 81;
                iArr26[i49 - 1] = iArr26[i49 - 1] + iArr26[i49];
                this.g = i49 + 1;
                iArr26[i49] = iArr26[i49 - 1];
                return 0;
            case 39:
                Object[] objArr12 = this.cancel;
                int i50 = this.g;
                Object obj9 = objArr12[i50 - 1];
                objArr12[i50 - 1] = null;
                this.asBinder = obj9;
                return 0;
            case 40:
                int[] iArr27 = this.d;
                int i51 = this.g - 1;
                this.g = i51;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr27[i51];
                return 0;
            case 41:
                int[] iArr28 = this.d;
                int i52 = this.g;
                this.g = i52 + 1;
                iArr28[i52] = 0;
                return 0;
            case 42:
                int[] iArr29 = this.d;
                int i53 = this.g;
                this.g = i53 + 1;
                iArr29[i53] = 51;
                return 0;
            case 43:
                int[] iArr30 = this.d;
                int i54 = this.g;
                this.g = i54 + 1;
                iArr30[i54] = 0;
                return 0;
            case 44:
                for (int i55 = this.g - 1; i55 >= 0; i55--) {
                    this.cancel[i55] = null;
                }
                Object[] objArr13 = this.cancel;
                this.g = 1;
                objArr13[0] = this.asInterface;
                return 0;
            case 45:
                Object[] objArr14 = this.cancel;
                int i56 = this.g;
                this.g = i56 + 1;
                objArr14[i56] = objArr14[i56 - 1];
                return 0;
            case 46:
                int i57 = this.g;
                int i58 = i57 - 1;
                Object[] objArr15 = this.cancel;
                Object obj10 = objArr15[i58];
                objArr15[i58] = null;
                objArr15[10] = obj10;
                int i59 = i57 - 2;
                Object obj11 = objArr15[i59];
                objArr15[i59] = null;
                objArr15[37] = obj11;
                this.g = i57 - 1;
                objArr15[i59] = obj11;
                return 0;
            case 47:
                int[] iArr31 = this.d;
                int i60 = this.g;
                iArr31[i60] = 1;
                this.g = i60;
                Object[] objArr16 = this.cancel;
                Object obj12 = objArr16[i60 - 1];
                objArr16[i60 - 1] = null;
                objArr16[i60 - 1] = ((Object[]) obj12)[iArr31[i60]];
                return 0;
            case 48:
                int i61 = this.g;
                int i62 = i61 - 1;
                this.g = i62;
                int[] iArr32 = this.d;
                Object[] objArr17 = this.cancel;
                Object obj13 = objArr17[i61 - 2];
                objArr17[i61 - 2] = null;
                iArr32[i61 - 2] = ((int[]) obj13)[iArr32[i62]];
                int i63 = i61 - 2;
                this.g = i63;
                iArr32[12] = iArr32[i63];
                return 0;
            case 49:
                Object[] objArr18 = this.cancel;
                int i64 = this.g;
                this.g = i64 + 1;
                objArr18[i64] = objArr18[10];
                return 0;
            case 50:
                int i65 = this.g;
                int i66 = i65 - 1;
                Object[] objArr19 = this.cancel;
                Object obj14 = objArr19[i66];
                objArr19[i66] = null;
                objArr19[37] = obj14;
                this.g = i65;
                objArr19[i66] = obj14;
                return 0;
            case 51:
                int[] iArr33 = this.d;
                int i67 = this.g;
                iArr33[i67] = 3;
                this.g = i67;
                Object[] objArr20 = this.cancel;
                Object obj15 = objArr20[i67 - 1];
                objArr20[i67 - 1] = null;
                objArr20[i67 - 1] = ((Object[]) obj15)[iArr33[i67]];
                return 0;
            case 52:
                int i68 = this.g;
                int i69 = i68 - 1;
                this.g = i69;
                int[] iArr34 = this.d;
                Object[] objArr21 = this.cancel;
                Object obj16 = objArr21[i68 - 2];
                objArr21[i68 - 2] = null;
                iArr34[i68 - 2] = ((int[]) obj16)[iArr34[i69]];
                return 0;
            case 53:
                int[] iArr35 = this.d;
                int i70 = this.g;
                iArr35[i70] = iArr35[i70 - 1];
                this.g = i70;
                iArr35[11] = iArr35[i70];
                return 0;
            case 54:
                int i71 = this.g;
                int i72 = i71 - 2;
                this.g = i72;
                int[] iArr36 = this.d;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr36[i72] != iArr36[i71 - 1] ? 0 : 1;
                return 0;
            case 55:
                int[] iArr37 = this.d;
                int i73 = this.g;
                this.g = i73 + 1;
                iArr37[i73] = iArr37[12];
                return 0;
            case 56:
                Object[] objArr22 = this.cancel;
                int i74 = this.g;
                objArr22[i74] = objArr22[i74 - 1];
                int[] iArr38 = this.d;
                this.g = i74 + 2;
                iArr38[i74 + 1] = 1;
                return 0;
            case 57:
                int[] iArr39 = this.d;
                int i75 = this.g;
                this.g = i75 + 1;
                iArr39[i75] = 1;
                Object[] objArr23 = this.cancel;
                objArr23[i75] = new int[iArr39[i75]];
                int i76 = i75 - 2;
                this.g = i76;
                Object obj17 = objArr23[i76];
                objArr23[i76] = null;
                int i77 = iArr39[i75 - 1];
                Object obj18 = objArr23[i75];
                objArr23[i75] = null;
                ((Object[]) obj17)[i77] = obj18;
                return 0;
            case 58:
                Object[] objArr24 = this.cancel;
                int i78 = this.g;
                objArr24[i78] = objArr24[i78 - 1];
                objArr24[i78] = null;
                this.g = i78 + 1;
                objArr24[i78] = objArr24[i78 - 1];
                return 0;
            case 59:
                Object[] objArr25 = this.cancel;
                int i79 = this.g;
                objArr25[i79] = objArr25[i79 - 1];
                this.g = i79;
                Object obj19 = objArr25[i79];
                objArr25[i79] = null;
                objArr25[37] = obj19;
                return 0;
            case 60:
                Object[] objArr26 = this.cancel;
                int i80 = this.g;
                this.g = i80 + 1;
                objArr26[i80] = objArr26[37];
                return 0;
            case 61:
                int[] iArr40 = this.d;
                int i81 = this.g;
                iArr40[i81] = 2;
                this.g = i81;
                Object[] objArr27 = this.cancel;
                Object obj20 = objArr27[i81 - 1];
                objArr27[i81 - 1] = null;
                objArr27[i81 - 1] = ((Object[]) obj20)[iArr40[i81]];
                return 0;
            case 62:
                int[] iArr41 = this.d;
                int i82 = this.g;
                iArr41[i82] = 0;
                this.g = i82;
                iArr41[30] = iArr41[i82];
                return 0;
            case 63:
                int i83 = this.g - 1;
                this.g = i83;
                int[] iArr42 = this.d;
                iArr42[29] = iArr42[i83];
                return 0;
            case 64:
                int i84 = this.g;
                int i85 = i84 - 1;
                Object[] objArr28 = this.cancel;
                Object obj21 = objArr28[i85];
                objArr28[i85] = null;
                objArr28[28] = obj21;
                int i86 = i84 - 2;
                Object obj22 = objArr28[i86];
                objArr28[i86] = null;
                objArr28[27] = obj22;
                this.g = i84 - 1;
                objArr28[i86] = obj22;
                return 0;
            case 65:
                Object[] objArr29 = this.cancel;
                int i87 = this.g;
                this.g = i87 + 1;
                objArr29[i87] = objArr29[28];
                return 0;
            case 66:
                int i88 = this.g;
                int i89 = i88 - 1;
                this.g = i89;
                Object[] objArr30 = this.cancel;
                Object obj23 = objArr30[i88 - 2];
                objArr30[i88 - 2] = null;
                objArr30[i88 - 2] = ((Object[]) obj23)[this.d[i89]];
                return 0;
            case 67:
                int i90 = this.g;
                int i91 = i90 - 1;
                this.g = i91;
                int[] iArr43 = this.d;
                Object[] objArr31 = this.cancel;
                Object obj24 = objArr31[i90 - 2];
                objArr31[i90 - 2] = null;
                iArr43[i90 - 2] = ((int[]) obj24)[iArr43[i91]];
                this.g = i90;
                objArr31[i91] = objArr31[28];
                return 0;
            case 68:
                int[] iArr44 = this.d;
                int i92 = this.g;
                iArr44[i92] = iArr44[29];
                this.g = i92 + 2;
                iArr44[i92 + 1] = iArr44[30];
                return 0;
            case 69:
                Object[] objArr32 = this.cancel;
                int i93 = this.g;
                objArr32[i93] = objArr32[28];
                int[] iArr45 = this.d;
                this.g = i93 + 2;
                iArr45[i93 + 1] = 0;
                return 0;
            case 70:
                int i94 = this.g;
                int i95 = i94 - 1;
                Object[] objArr33 = this.cancel;
                Object obj25 = objArr33[i95];
                objArr33[i95] = null;
                objArr33[36] = obj25;
                int i96 = i94 - 2;
                this.g = i96;
                int[] iArr46 = this.d;
                iArr46[35] = iArr46[i96];
                return 0;
            case 71:
                int i97 = this.g - 1;
                this.g = i97;
                int[] iArr47 = this.d;
                iArr47[34] = iArr47[i97];
                return 0;
            case 72:
                int i98 = this.g;
                int[] iArr48 = this.d;
                iArr48[33] = iArr48[i98 - 1];
                int i99 = i98 - 2;
                this.g = i99;
                iArr48[32] = iArr48[i99];
                return 0;
            case 73:
                int i100 = this.g;
                int i101 = i100 - 1;
                Object[] objArr34 = this.cancel;
                Object obj26 = objArr34[i101];
                objArr34[i101] = null;
                objArr34[31] = obj26;
                this.g = i100;
                objArr34[i101] = obj26;
                return 0;
            case 74:
                Object[] objArr35 = this.cancel;
                int i102 = this.g;
                this.g = i102 + 1;
                objArr35[i102] = objArr35[31];
                return 0;
            case 75:
                int[] iArr49 = this.d;
                int i103 = this.g;
                this.g = i103 + 1;
                iArr49[i103] = iArr49[32];
                Object[] objArr36 = this.cancel;
                Object obj27 = objArr36[i103 - 1];
                objArr36[i103 - 1] = null;
                objArr36[i103] = obj27;
                iArr49[i103 - 1] = iArr49[i103];
                return 0;
            case 76:
                int[] iArr50 = this.d;
                int i104 = this.g;
                iArr50[i104 - 1] = iArr50[i104 - 2];
                Object[] objArr37 = this.cancel;
                Object obj28 = objArr37[i104 - 1];
                objArr37[i104 - 1] = null;
                objArr37[i104 - 2] = obj28;
                return 0;
            case 77:
                int[] iArr51 = this.d;
                int i105 = this.g;
                this.g = i105 + 1;
                iArr51[i105] = 0;
                int i106 = iArr51[i105];
                iArr51[i105] = iArr51[i105 - 1];
                iArr51[i105 - 1] = i106;
                return 0;
            case 78:
                int i107 = this.g;
                int i108 = i107 - 3;
                this.g = i108;
                Object[] objArr38 = this.cancel;
                Object obj29 = objArr38[i108];
                objArr38[i108] = null;
                int[] iArr52 = this.d;
                ((int[]) obj29)[iArr52[i107 - 2]] = iArr52[i107 - 1];
                objArr38[i108] = objArr38[31];
                this.g = i107 - 1;
                iArr52[i107 - 2] = iArr52[33];
                return 0;
            case 79:
                Object[] objArr39 = this.cancel;
                int i109 = this.g;
                Object obj30 = objArr39[i109 - 2];
                objArr39[i109 - 2] = null;
                objArr39[i109 - 1] = obj30;
                int[] iArr53 = this.d;
                iArr53[i109 - 2] = iArr53[i109 - 1];
                iArr53[i109] = 1;
                this.g = i109;
                Object obj31 = objArr39[i109 - 1];
                objArr39[i109 - 1] = null;
                objArr39[i109 - 1] = ((Object[]) obj31)[iArr53[i109]];
                return 0;
            case 80:
                int[] iArr54 = this.d;
                int i110 = this.g;
                iArr54[i110 - 1] = iArr54[i110 - 2];
                Object[] objArr40 = this.cancel;
                Object obj32 = objArr40[i110 - 1];
                objArr40[i110 - 1] = null;
                objArr40[i110 - 2] = obj32;
                this.g = i110 + 1;
                iArr54[i110] = 0;
                int i111 = iArr54[i110];
                iArr54[i110] = iArr54[i110 - 1];
                iArr54[i110 - 1] = i111;
                return 0;
            case 81:
                int i112 = this.g;
                int i113 = i112 - 3;
                this.g = i113;
                Object[] objArr41 = this.cancel;
                Object obj33 = objArr41[i113];
                objArr41[i113] = null;
                int[] iArr55 = this.d;
                ((int[]) obj33)[iArr55[i112 - 2]] = iArr55[i112 - 1];
                objArr41[i113] = objArr41[31];
                this.g = i112 - 1;
                objArr41[i112 - 2] = objArr41[36];
                return 0;
            case 82:
                int[] iArr56 = this.d;
                int i114 = this.g;
                iArr56[i114] = 0;
                Object[] objArr42 = this.cancel;
                Object obj34 = objArr42[i114 - 1];
                objArr42[i114 - 1] = null;
                objArr42[i114] = obj34;
                iArr56[i114 - 1] = iArr56[i114];
                int i115 = i114 - 2;
                this.g = i115;
                Object obj35 = objArr42[i115];
                objArr42[i115] = null;
                int i116 = iArr56[i114 - 1];
                Object obj36 = objArr42[i114];
                objArr42[i114] = null;
                ((Object[]) obj35)[i116] = obj36;
                return 0;
            case 83:
                Object[] objArr43 = this.cancel;
                int i117 = this.g;
                objArr43[i117] = objArr43[31];
                int[] iArr57 = this.d;
                iArr57[i117 + 1] = iArr57[34];
                this.g = i117 + 3;
                iArr57[i117 + 2] = iArr57[35];
                return 0;
            case 84:
                int i118 = this.g - 1;
                this.g = i118;
                int[] iArr58 = this.d;
                iArr58[33] = iArr58[i118];
                return 0;
            case 85:
                int[] iArr59 = this.d;
                int i119 = this.g;
                this.g = i119 + 1;
                iArr59[i119] = iArr59[34];
                return 0;
            case 86:
                int[] iArr60 = this.d;
                int i120 = this.g;
                iArr60[i120] = iArr60[33];
                iArr60[i120 - 1] = iArr60[i120 - 1] + iArr60[i120];
                int i121 = i120 - 1;
                this.g = i121;
                iArr60[i120 - 2] = iArr60[i120 - 2] + iArr60[i121];
                return 0;
            case 87:
                int[] iArr61 = this.d;
                int i122 = this.g;
                iArr61[i122] = iArr61[i122 - 1];
                iArr61[i122 + 1] = 13;
                int i123 = i122 + 1;
                this.g = i123;
                iArr61[i122] = iArr61[i122] << iArr61[i123];
                return 0;
            case 88:
                int i124 = this.g;
                int i125 = i124 - 1;
                this.g = i125;
                int[] iArr62 = this.d;
                iArr62[i124 - 2] = iArr62[i124 - 2] ^ iArr62[i125];
                return 0;
            case 89:
                int[] iArr63 = this.d;
                int i126 = this.g;
                this.g = i126 + 1;
                iArr63[i126] = 17;
                return 0;
            case 90:
                int i127 = this.g;
                int[] iArr64 = this.d;
                iArr64[i127 - 2] = iArr64[i127 - 2] >>> iArr64[i127 - 1];
                int i128 = i127 - 2;
                this.g = i128;
                iArr64[i127 - 3] = iArr64[i127 - 3] ^ iArr64[i128];
                return 0;
            case 91:
                int[] iArr65 = this.d;
                int i129 = this.g;
                iArr65[i129] = iArr65[i129 - 1];
                iArr65[i129 + 1] = 5;
                int i130 = i129 + 1;
                this.g = i130;
                iArr65[i129] = iArr65[i129] << iArr65[i130];
                return 0;
            case 92:
                Object[] objArr44 = this.cancel;
                int i131 = this.g;
                Object obj37 = objArr44[i131 - 2];
                objArr44[i131 - 2] = null;
                objArr44[i131 - 1] = obj37;
                int[] iArr66 = this.d;
                iArr66[i131 - 2] = iArr66[i131 - 1];
                iArr66[i131] = 2;
                this.g = i131;
                Object obj38 = objArr44[i131 - 1];
                objArr44[i131 - 1] = null;
                objArr44[i131 - 1] = ((Object[]) obj38)[iArr66[i131]];
                return 0;
            case 93:
                int[] iArr67 = this.d;
                int i132 = this.g;
                iArr67[i132 - 1] = iArr67[i132 - 2];
                Object[] objArr45 = this.cancel;
                Object obj39 = objArr45[i132 - 1];
                objArr45[i132 - 1] = null;
                objArr45[i132 - 2] = obj39;
                this.g = i132 + 1;
                iArr67[i132] = 0;
                return 0;
            case 94:
                int[] iArr68 = this.d;
                int i133 = this.g;
                int i134 = iArr68[i133 - 1];
                iArr68[i133 - 1] = iArr68[i133 - 2];
                iArr68[i133 - 2] = i134;
                return 0;
            case 95:
                int i135 = this.g;
                int i136 = i135 - 3;
                this.g = i136;
                Object[] objArr46 = this.cancel;
                Object obj40 = objArr46[i136];
                objArr46[i136] = null;
                int[] iArr69 = this.d;
                ((int[]) obj40)[iArr69[i135 - 2]] = iArr69[i135 - 1];
                return 0;
            case 96:
                int i137 = this.g - 1;
                this.g = i137;
                Object[] objArr47 = this.cancel;
                Object obj41 = objArr47[i137];
                objArr47[i137] = null;
                objArr47[10] = obj41;
                return 0;
            case 97:
                Object[] objArr48 = this.cancel;
                int i138 = this.g;
                objArr48[i138 - 1] = new int[this.d[i138 - 1]];
                return 0;
            case 98:
                int i139 = this.g;
                int i140 = i139 - 3;
                this.g = i140;
                Object[] objArr49 = this.cancel;
                Object obj42 = objArr49[i140];
                objArr49[i140] = null;
                int i141 = this.d[i139 - 2];
                Object obj43 = objArr49[i139 - 1];
                objArr49[i139 - 1] = null;
                ((Object[]) obj42)[i141] = obj43;
                this.g = i139 - 2;
                objArr49[i140] = objArr49[i139 - 4];
                return 0;
            case 99:
                int[] iArr70 = this.d;
                int i142 = this.g;
                iArr70[i142] = 2;
                this.g = i142 + 2;
                iArr70[i142 + 1] = 1;
                return 0;
            case 100:
                int[] iArr71 = this.d;
                int i143 = this.g;
                this.g = i143 + 1;
                iArr71[i143] = 1;
                this.cancel[i143] = new int[iArr71[i143]];
                return 0;
            case 101:
                int i144 = this.g;
                int i145 = i144 - 1;
                Object[] objArr50 = this.cancel;
                objArr50[i145] = null;
                this.g = i144;
                objArr50[i145] = objArr50[i144 - 2];
                return 0;
            case 102:
                int i146 = this.g - 1;
                this.g = i146;
                Object[] objArr51 = this.cancel;
                Object obj44 = objArr51[i146];
                objArr51[i146] = null;
                objArr51[28] = obj44;
                return 0;
            case 103:
                int i147 = this.g - 1;
                this.g = i147;
                Object[] objArr52 = this.cancel;
                Object obj45 = objArr52[i147];
                objArr52[i147] = null;
                objArr52[27] = obj45;
                return 0;
            case 104:
                Object[] objArr53 = this.cancel;
                int i148 = this.g;
                objArr53[i148] = objArr53[27];
                objArr53[i148 + 1] = objArr53[28];
                int[] iArr72 = this.d;
                this.g = i148 + 3;
                iArr72[i148 + 2] = 3;
                return 0;
            case 105:
                int i149 = this.g;
                int i150 = i149 - 1;
                this.g = i150;
                int[] iArr73 = this.d;
                Object[] objArr54 = this.cancel;
                Object obj46 = objArr54[i149 - 2];
                objArr54[i149 - 2] = null;
                iArr73[i149 - 2] = ((int[]) obj46)[iArr73[i150]];
                objArr54[i150] = objArr54[28];
                this.g = i149 + 1;
                iArr73[i149] = 1;
                return 0;
            case 106:
                int[] iArr74 = this.d;
                int i151 = this.g;
                iArr74[i151] = 0;
                this.g = i151;
                Object[] objArr55 = this.cancel;
                Object obj47 = objArr55[i151 - 1];
                objArr55[i151 - 1] = null;
                iArr74[i151 - 1] = ((int[]) obj47)[iArr74[i151]];
                return 0;
            case 107:
                int[] iArr75 = this.d;
                int i152 = this.g;
                iArr75[i152] = 0;
                this.g = i152;
                Object[] objArr56 = this.cancel;
                Object obj48 = objArr56[i152 - 1];
                objArr56[i152 - 1] = null;
                objArr56[i152 - 1] = ((Object[]) obj48)[iArr75[i152]];
                return 0;
            case 108:
                int i153 = this.g;
                int i154 = i153 - 1;
                Object[] objArr57 = this.cancel;
                Object obj49 = objArr57[i154];
                objArr57[i154] = null;
                objArr57[36] = obj49;
                int[] iArr76 = this.d;
                iArr76[35] = iArr76[i153 - 2];
                int i155 = i153 - 3;
                this.g = i155;
                iArr76[34] = iArr76[i155];
                return 0;
            case 109:
                int i156 = this.g - 1;
                this.g = i156;
                int[] iArr77 = this.d;
                iArr77[32] = iArr77[i156];
                return 0;
            case 110:
                int i157 = this.g;
                int i158 = i157 - 1;
                Object[] objArr58 = this.cancel;
                objArr58[i158] = null;
                this.g = i157;
                objArr58[i158] = objArr58[31];
                return 0;
            case 111:
                int[] iArr78 = this.d;
                int i159 = this.g;
                iArr78[i159] = iArr78[32];
                Object[] objArr59 = this.cancel;
                Object obj50 = objArr59[i159 - 1];
                objArr59[i159 - 1] = null;
                objArr59[i159] = obj50;
                iArr78[i159 - 1] = iArr78[i159];
                this.g = i159 + 2;
                iArr78[i159 + 1] = 3;
                return 0;
            case 112:
                Object[] objArr60 = this.cancel;
                int i160 = this.g;
                objArr60[i160] = objArr60[31];
                int[] iArr79 = this.d;
                this.g = i160 + 2;
                iArr79[i160 + 1] = iArr79[33];
                return 0;
            case 113:
                Object[] objArr61 = this.cancel;
                int i161 = this.g;
                Object obj51 = objArr61[i161 - 2];
                objArr61[i161 - 2] = null;
                objArr61[i161 - 1] = obj51;
                int[] iArr80 = this.d;
                iArr80[i161 - 2] = iArr80[i161 - 1];
                return 0;
            case 114:
                int[] iArr81 = this.d;
                int i162 = this.g;
                int i163 = iArr81[i162 - 1];
                iArr81[i162 - 1] = iArr81[i162 - 2];
                iArr81[i162 - 2] = i163;
                int i164 = i162 - 3;
                this.g = i164;
                Object[] objArr62 = this.cancel;
                Object obj52 = objArr62[i164];
                objArr62[i164] = null;
                ((int[]) obj52)[iArr81[i162 - 2]] = iArr81[i162 - 1];
                this.g = i162 - 2;
                objArr62[i164] = objArr62[31];
                return 0;
            case 115:
                Object[] objArr63 = this.cancel;
                int i165 = this.g;
                objArr63[i165] = objArr63[36];
                int[] iArr82 = this.d;
                this.g = i165 + 2;
                iArr82[i165 + 1] = 0;
                Object obj53 = objArr63[i165];
                objArr63[i165] = null;
                objArr63[i165 + 1] = obj53;
                iArr82[i165] = iArr82[i165 + 1];
                return 0;
            case 116:
                int i166 = this.g;
                int i167 = i166 - 3;
                this.g = i167;
                Object[] objArr64 = this.cancel;
                Object obj54 = objArr64[i167];
                objArr64[i167] = null;
                int i168 = this.d[i166 - 2];
                Object obj55 = objArr64[i166 - 1];
                objArr64[i166 - 1] = null;
                ((Object[]) obj54)[i168] = obj55;
                this.g = i166 - 2;
                objArr64[i167] = objArr64[31];
                return 0;
            case 117:
                int[] iArr83 = this.d;
                int i169 = this.g;
                this.g = i169 + 1;
                iArr83[i169] = iArr83[35];
                return 0;
            case 118:
                int i170 = this.g;
                int i171 = i170 - 1;
                int[] iArr84 = this.d;
                iArr84[33] = iArr84[i171];
                iArr84[i171] = iArr84[34];
                this.g = i170 + 1;
                iArr84[i170] = iArr84[33];
                return 0;
            case 119:
                int i172 = this.g;
                int[] iArr85 = this.d;
                iArr85[i172 - 2] = iArr85[i172 - 2] + iArr85[i172 - 1];
                int i173 = i172 - 2;
                iArr85[i172 - 3] = iArr85[i172 - 3] + iArr85[i173];
                this.g = i172 - 1;
                iArr85[i173] = iArr85[i172 - 3];
                return 0;
            case 120:
                int[] iArr86 = this.d;
                int i174 = this.g;
                iArr86[i174] = 13;
                iArr86[i174 - 1] = iArr86[i174 - 1] << iArr86[i174];
                int i175 = i174 - 1;
                this.g = i175;
                iArr86[i174 - 2] = iArr86[i174 - 2] ^ iArr86[i175];
                return 0;
            case 121:
                int[] iArr87 = this.d;
                int i176 = this.g;
                iArr87[i176] = 17;
                this.g = i176;
                iArr87[i176 - 1] = iArr87[i176 - 1] >>> iArr87[i176];
                return 0;
            case 122:
                int i177 = this.g;
                int i178 = i177 - 1;
                int[] iArr88 = this.d;
                iArr88[i177 - 2] = iArr88[i177 - 2] ^ iArr88[i178];
                iArr88[i178] = iArr88[i177 - 2];
                this.g = i177 + 1;
                iArr88[i177] = 5;
                return 0;
            case 123:
                int i179 = this.g;
                int i180 = i179 - 1;
                this.g = i180;
                int[] iArr89 = this.d;
                iArr89[i179 - 2] = iArr89[i179 - 2] << iArr89[i180];
                return 0;
            case 124:
                int i181 = this.g;
                int i182 = i181 - 1;
                this.g = i182;
                int[] iArr90 = this.d;
                iArr90[i181 - 2] = iArr90[i182] ^ iArr90[i181 - 2];
                Object[] objArr65 = this.cancel;
                Object obj56 = objArr65[i181 - 3];
                objArr65[i181 - 3] = null;
                objArr65[i181 - 2] = obj56;
                iArr90[i181 - 3] = iArr90[i181 - 2];
                return 0;
            case 125:
                int i183 = this.g;
                int i184 = i183 - 3;
                this.g = i184;
                Object[] objArr66 = this.cancel;
                Object obj57 = objArr66[i184];
                objArr66[i184] = null;
                int[] iArr91 = this.d;
                ((int[]) obj57)[iArr91[i183 - 2]] = iArr91[i183 - 1];
                int i185 = i183 - 4;
                this.g = i185;
                Object obj58 = objArr66[i185];
                objArr66[i185] = null;
                objArr66[10] = obj58;
                return 0;
            case 126:
                int i186 = this.g;
                int i187 = i186 - 1;
                Object[] objArr67 = this.cancel;
                Object obj59 = objArr67[i187];
                objArr67[i187] = null;
                objArr67[12] = obj59;
                this.g = i186;
                objArr67[i187] = objArr67[10];
                return 0;
            case 127:
                int i188 = this.g - 1;
                this.g = i188;
                Object[] objArr68 = this.cancel;
                Object obj60 = objArr68[i188];
                objArr68[i188] = null;
                objArr68[37] = obj60;
                return 0;
            case 128:
                Object[] objArr69 = this.cancel;
                int i189 = this.g;
                objArr69[i189] = objArr69[37];
                int[] iArr92 = this.d;
                this.g = i189 + 2;
                iArr92[i189 + 1] = 0;
                return 0;
            case 129:
                int i190 = this.g - 1;
                this.g = i190;
                Object[] objArr70 = this.cancel;
                Object obj61 = objArr70[i190];
                objArr70[i190] = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj61 == null ? 0 : 1;
                return 0;
            case 130:
                int i191 = this.g - 1;
                this.g = i191;
                Object[] objArr71 = this.cancel;
                Object obj62 = objArr71[i191];
                objArr71[i191] = null;
                objArr71[14] = obj62;
                return 0;
            case 131:
                int i192 = this.g - 1;
                this.g = i192;
                int[] iArr93 = this.d;
                iArr93[13] = iArr93[i192];
                return 0;
            case 132:
                int[] iArr94 = this.d;
                int i193 = this.g;
                iArr94[i193] = iArr94[13];
                Object[] objArr72 = this.cancel;
                this.g = i193 + 2;
                objArr72[i193 + 1] = objArr72[14];
                Object obj63 = objArr72[i193 + 1];
                objArr72[i193 + 1] = null;
                iArr94[i193 + 1] = ((Object[]) obj63).length;
                return 0;
            case 133:
                int i194 = this.g;
                int i195 = i194 - 2;
                this.g = i195;
                int[] iArr95 = this.d;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr95[i195] >= iArr95[i194 - 1] ? 0 : 1;
                return 0;
            case 134:
                Object[] objArr73 = this.cancel;
                int i196 = this.g;
                objArr73[i196] = objArr73[12];
                objArr73[i196 + 1] = objArr73[14];
                int[] iArr96 = this.d;
                this.g = i196 + 3;
                iArr96[i196 + 2] = iArr96[13];
                return 0;
            case 135:
                int[] iArr97 = this.d;
                iArr97[13] = iArr97[13] + 1;
                return 0;
            case 136:
                Object[] objArr74 = this.cancel;
                int i197 = this.g;
                this.g = i197 + 1;
                objArr74[i197] = objArr74[12];
                return 0;
            case 137:
                Object[] objArr75 = this.cancel;
                int i198 = this.g;
                Object obj64 = objArr75[i198 - 1];
                objArr75[i198 - 1] = null;
                Object obj65 = objArr75[i198 - 2];
                objArr75[i198 - 2] = null;
                objArr75[i198 - 1] = obj65;
                objArr75[i198 - 2] = obj64;
                int i199 = i198 - 1;
                this.g = i199;
                objArr75[i199] = null;
                return 0;
            case 138:
                int[] iArr98 = this.d;
                int i200 = this.g;
                iArr98[i200] = 0;
                this.g = i200 + 2;
                iArr98[i200 + 1] = 0;
                return 0;
            case 139:
                int[] iArr99 = this.d;
                int i201 = this.g;
                this.g = i201 + 1;
                iArr99[i201] = 13;
                return 0;
            case 140:
                int[] iArr100 = this.d;
                int i202 = this.g;
                this.g = i202 + 1;
                iArr100[i202] = 16;
                return 0;
            case 141:
                int i203 = this.g;
                int[] iArr101 = this.d;
                iArr101[i203 - 2] = iArr101[i203 - 2] >> iArr101[i203 - 1];
                int i204 = i203 - 2;
                this.g = i204;
                iArr101[i203 - 3] = iArr101[i203 - 3] + iArr101[i204];
                return 0;
            case 142:
                Object[] objArr76 = this.cancel;
                int i205 = this.g;
                objArr76[i205] = null;
                this.g = i205 + 2;
                objArr76[i205 + 1] = null;
                return 0;
            case 143:
                Object[] objArr77 = this.cancel;
                int i206 = this.g;
                this.g = i206 + 1;
                Object obj66 = objArr77[i206 - 1];
                objArr77[i206 - 1] = null;
                objArr77[i206] = obj66;
                Object obj67 = objArr77[i206 - 2];
                objArr77[i206 - 2] = null;
                objArr77[i206 - 1] = obj67;
                objArr77[i206 - 2] = obj66;
                Object obj68 = objArr77[i206];
                objArr77[i206] = null;
                Object obj69 = objArr77[i206 - 1];
                objArr77[i206 - 1] = null;
                objArr77[i206] = obj69;
                objArr77[i206 - 1] = obj68;
                return 0;
            case 144:
                long[] jArr3 = this.cancelAll;
                int i207 = this.g;
                jArr3[i207] = 0;
                int[] iArr102 = this.d;
                iArr102[i207 - 1] = (jArr3[i207 - 1] > jArr3[i207] ? 1 : (jArr3[i207 - 1] == jArr3[i207] ? 0 : -1));
                int i208 = i207 - 1;
                this.g = i208;
                iArr102[i207 - 2] = iArr102[i207 - 2] + iArr102[i208];
                return 0;
            case 145:
                int i209 = this.g;
                int i210 = i209 - 1;
                this.g = i210;
                int[] iArr103 = this.d;
                iArr103[i209 - 2] = iArr103[i209 - 2] - iArr103[i210];
                return 0;
            case 146:
                Object[] objArr78 = this.cancel;
                int i211 = this.g;
                Object obj70 = objArr78[i211 - 1];
                objArr78[i211 - 1] = null;
                Object obj71 = objArr78[i211 - 2];
                objArr78[i211 - 2] = null;
                objArr78[i211 - 1] = obj71;
                objArr78[i211 - 2] = obj70;
                return 0;
            case 147:
                int[] iArr104 = this.d;
                int i212 = this.g;
                this.g = i212 + 1;
                iArr104[i212] = iArr104[11];
                return 0;
            case 148:
                Object[] objArr79 = this.cancel;
                int i213 = this.g;
                this.g = i213 + 1;
                Object obj72 = objArr79[i213 - 1];
                objArr79[i213 - 1] = null;
                objArr79[i213] = obj72;
                Object obj73 = objArr79[i213 - 2];
                objArr79[i213 - 2] = null;
                objArr79[i213 - 1] = obj73;
                objArr79[i213 - 2] = obj72;
                return 0;
            case 149:
                Object[] objArr80 = this.cancel;
                int i214 = this.g;
                Object obj74 = objArr80[i214 - 1];
                objArr80[i214 - 1] = null;
                Object obj75 = objArr80[i214 - 2];
                objArr80[i214 - 2] = null;
                objArr80[i214 - 1] = obj75;
                objArr80[i214 - 2] = obj74;
                int[] iArr105 = this.d;
                this.g = i214 + 1;
                iArr105[i214] = 0;
                Object obj76 = objArr80[i214 - 1];
                objArr80[i214 - 1] = null;
                objArr80[i214] = obj76;
                iArr105[i214 - 1] = iArr105[i214];
                return 0;
            case 150:
                int[] iArr106 = this.d;
                int i215 = this.g;
                this.g = i215 + 1;
                iArr106[i215] = 19;
                return 0;
            case 151:
                int[] iArr107 = this.d;
                int i216 = this.g;
                this.g = i216 + 1;
                iArr107[i216] = 48;
                return 0;
            case 152:
                double[] dArr = this.INotificationSideChannel;
                int i217 = this.g;
                this.g = i217 + 1;
                dArr[i217] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                return 0;
            case 153:
                int[] iArr108 = this.d;
                int i218 = this.g;
                iArr108[i218] = 4;
                this.g = i218 + 2;
                iArr108[i218 + 1] = 0;
                return 0;
            case 154:
                double[] dArr2 = this.INotificationSideChannel;
                int i219 = this.g;
                this.g = i219 + 1;
                dArr2[i219] = 0.0d;
                return 0;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                int i220 = this.g;
                int i221 = i220 - 1;
                this.g = i221;
                double[] dArr3 = this.INotificationSideChannel;
                this.d[i220 - 2] = (dArr3[i220 - 2] > dArr3[i221] ? 1 : (dArr3[i220 - 2] == dArr3[i221] ? 0 : -1));
                return 0;
            case 156:
                Object[] objArr81 = this.cancel;
                int i222 = this.g;
                Object obj77 = objArr81[i222 - 1];
                objArr81[i222 - 1] = null;
                objArr81[i222] = obj77;
                Object obj78 = objArr81[i222 - 2];
                objArr81[i222 - 2] = null;
                objArr81[i222 - 1] = obj78;
                Object obj79 = objArr81[i222 - 3];
                objArr81[i222 - 3] = null;
                objArr81[i222 - 2] = obj79;
                objArr81[i222 - 3] = obj77;
                this.g = i222;
                objArr81[i222] = null;
                return 0;
            case 157:
                int[] iArr109 = this.d;
                int i223 = this.g;
                iArr109[i223] = 1;
                this.g = i223 + 2;
                iArr109[i223 + 1] = 1;
                this.cancel[i223 + 1] = new int[iArr109[i223 + 1]];
                return 0;
            case 158:
                Object[] objArr82 = this.cancel;
                int i224 = this.g;
                objArr82[i224] = objArr82[i224 - 1];
                int[] iArr110 = this.d;
                iArr110[i224 + 1] = 2;
                this.g = i224 + 3;
                iArr110[i224 + 2] = 1;
                return 0;
            case 159:
                Object[] objArr83 = this.cancel;
                int i225 = this.g;
                objArr83[i225] = objArr83[i225 - 1];
                this.g = i225;
                objArr83[i225] = null;
                return 0;
            case 160:
                Object[] objArr84 = this.cancel;
                int i226 = this.g;
                objArr84[i226] = objArr84[i226 - 1];
                this.g = i226 + 2;
                objArr84[i226 + 1] = objArr84[10];
                return 0;
            case 161:
                Object[] objArr85 = this.cancel;
                int i227 = this.g;
                objArr85[i227] = objArr85[37];
                int[] iArr111 = this.d;
                this.g = i227 + 2;
                iArr111[i227 + 1] = 2;
                return 0;
            case 162:
                int[] iArr112 = this.d;
                int i228 = this.g;
                iArr112[i228] = 0;
                this.g = i228;
                Object[] objArr86 = this.cancel;
                Object obj80 = objArr86[i228 - 1];
                objArr86[i228 - 1] = null;
                iArr112[i228 - 1] = ((int[]) obj80)[iArr112[i228]];
                this.g = i228 + 1;
                iArr112[i228] = 0;
                return 0;
            case 163:
                int i229 = this.g - 1;
                this.g = i229;
                int[] iArr113 = this.d;
                iArr113[30] = iArr113[i229];
                return 0;
            case 164:
                int i230 = this.g;
                int i231 = i230 - 1;
                Object[] objArr87 = this.cancel;
                Object obj81 = objArr87[i231];
                objArr87[i231] = null;
                objArr87[27] = obj81;
                this.g = i230;
                objArr87[i231] = obj81;
                return 0;
            case 165:
                int[] iArr114 = this.d;
                int i232 = this.g;
                iArr114[i232] = 0;
                this.g = i232;
                Object[] objArr88 = this.cancel;
                Object obj82 = objArr88[i232 - 1];
                objArr88[i232 - 1] = null;
                iArr114[i232 - 1] = ((int[]) obj82)[iArr114[i232]];
                this.g = i232 + 1;
                objArr88[i232] = objArr88[28];
                return 0;
            case 166:
                int[] iArr115 = this.d;
                int i233 = this.g;
                iArr115[i233] = 0;
                this.g = i233;
                Object[] objArr89 = this.cancel;
                Object obj83 = objArr89[i233 - 1];
                objArr89[i233 - 1] = null;
                iArr115[i233 - 1] = ((int[]) obj83)[iArr115[i233]];
                this.g = i233 + 1;
                iArr115[i233] = iArr115[29];
                return 0;
            case 167:
                int[] iArr116 = this.d;
                int i234 = this.g;
                iArr116[i234] = iArr116[30];
                Object[] objArr90 = this.cancel;
                this.g = i234 + 2;
                objArr90[i234 + 1] = objArr90[28];
                return 0;
            case 168:
                int i235 = this.g - 1;
                this.g = i235;
                Object[] objArr91 = this.cancel;
                Object obj84 = objArr91[i235];
                objArr91[i235] = null;
                objArr91[36] = obj84;
                return 0;
            case 169:
                int i236 = this.g;
                int[] iArr117 = this.d;
                iArr117[35] = iArr117[i236 - 1];
                iArr117[34] = iArr117[i236 - 2];
                int i237 = i236 - 3;
                this.g = i237;
                iArr117[33] = iArr117[i237];
                return 0;
            case 170:
                int i238 = this.g - 1;
                this.g = i238;
                Object[] objArr92 = this.cancel;
                Object obj85 = objArr92[i238];
                objArr92[i238] = null;
                objArr92[31] = obj85;
                return 0;
            case 171:
                Object[] objArr93 = this.cancel;
                int i239 = this.g;
                objArr93[i239] = objArr93[31];
                int[] iArr118 = this.d;
                this.g = i239 + 2;
                iArr118[i239 + 1] = iArr118[32];
                return 0;
            case 172:
                Object[] objArr94 = this.cancel;
                int i240 = this.g;
                Object obj86 = objArr94[i240 - 2];
                objArr94[i240 - 2] = null;
                objArr94[i240 - 1] = obj86;
                int[] iArr119 = this.d;
                iArr119[i240 - 2] = iArr119[i240 - 1];
                iArr119[i240] = 3;
                this.g = i240;
                Object obj87 = objArr94[i240 - 1];
                objArr94[i240 - 1] = null;
                objArr94[i240 - 1] = ((Object[]) obj87)[iArr119[i240]];
                return 0;
            case 173:
                int[] iArr120 = this.d;
                int i241 = this.g;
                iArr120[i241] = iArr120[33];
                Object[] objArr95 = this.cancel;
                Object obj88 = objArr95[i241 - 1];
                objArr95[i241 - 1] = null;
                objArr95[i241] = obj88;
                iArr120[i241 - 1] = iArr120[i241];
                this.g = i241 + 2;
                iArr120[i241 + 1] = 1;
                return 0;
            case 174:
                int[] iArr121 = this.d;
                int i242 = this.g;
                int i243 = iArr121[i242 - 1];
                iArr121[i242 - 1] = iArr121[i242 - 2];
                iArr121[i242 - 2] = i243;
                int i244 = i242 - 3;
                this.g = i244;
                Object[] objArr96 = this.cancel;
                Object obj89 = objArr96[i244];
                objArr96[i244] = null;
                ((int[]) obj89)[iArr121[i242 - 2]] = iArr121[i242 - 1];
                return 0;
            case 175:
                Object[] objArr97 = this.cancel;
                int i245 = this.g;
                objArr97[i245] = objArr97[31];
                objArr97[i245 + 1] = objArr97[36];
                int[] iArr122 = this.d;
                this.g = i245 + 3;
                iArr122[i245 + 2] = 0;
                return 0;
            case 176:
                Object[] objArr98 = this.cancel;
                int i246 = this.g;
                Object obj90 = objArr98[i246 - 2];
                objArr98[i246 - 2] = null;
                objArr98[i246 - 1] = obj90;
                int[] iArr123 = this.d;
                iArr123[i246 - 2] = iArr123[i246 - 1];
                int i247 = i246 - 3;
                this.g = i247;
                Object obj91 = objArr98[i247];
                objArr98[i247] = null;
                int i248 = iArr123[i246 - 2];
                Object obj92 = objArr98[i246 - 1];
                objArr98[i246 - 1] = null;
                ((Object[]) obj91)[i248] = obj92;
                return 0;
            case 177:
                int[] iArr124 = this.d;
                int i249 = this.g;
                this.g = i249 + 1;
                iArr124[i249] = iArr124[33];
                return 0;
            case 178:
                int i250 = this.g;
                int[] iArr125 = this.d;
                iArr125[i250 - 2] = iArr125[i250 - 2] << iArr125[i250 - 1];
                int i251 = i250 - 2;
                this.g = i251;
                iArr125[i250 - 3] = iArr125[i250 - 3] ^ iArr125[i251];
                return 0;
            case 179:
                int i252 = this.g;
                int[] iArr126 = this.d;
                iArr126[i252 - 2] = iArr126[i252 - 2] >>> iArr126[i252 - 1];
                int i253 = i252 - 2;
                iArr126[i252 - 3] = iArr126[i252 - 3] ^ iArr126[i253];
                this.g = i252 - 1;
                iArr126[i253] = iArr126[i252 - 3];
                return 0;
            case 180:
                int[] iArr127 = this.d;
                int i254 = this.g;
                iArr127[i254] = 5;
                this.g = i254;
                iArr127[i254 - 1] = iArr127[i254 - 1] << iArr127[i254];
                return 0;
            case 181:
                int i255 = this.g;
                int i256 = i255 - 1;
                int[] iArr128 = this.d;
                iArr128[i255 - 2] = iArr128[i255 - 2] ^ iArr128[i256];
                Object[] objArr99 = this.cancel;
                Object obj93 = objArr99[i255 - 3];
                objArr99[i255 - 3] = null;
                objArr99[i255 - 2] = obj93;
                iArr128[i255 - 3] = iArr128[i255 - 2];
                this.g = i255;
                iArr128[i256] = 2;
                return 0;
            case 182:
                Object[] objArr100 = this.cancel;
                int i257 = this.g;
                objArr100[i257] = null;
                int[] iArr129 = this.d;
                this.g = i257 + 2;
                iArr129[i257 + 1] = iArr129[11];
                return 0;
            case 183:
                int[] iArr130 = this.d;
                int i258 = this.g;
                iArr130[i258] = iArr130[i258 - 1];
                iArr130[i258 + 1] = iArr130[11];
                this.g = i258 + 3;
                iArr130[i258 + 2] = 1;
                return 0;
            case 184:
                int i259 = this.g;
                int[] iArr131 = this.d;
                iArr131[i259 - 2] = iArr131[i259 - 2] - iArr131[i259 - 1];
                int i260 = i259 - 2;
                iArr131[i259 - 3] = iArr131[i259 - 3] * iArr131[i260];
                this.g = i259 - 1;
                iArr131[i260] = 2;
                return 0;
            case 185:
                int i261 = this.g;
                int i262 = i261 - 1;
                this.g = i262;
                int[] iArr132 = this.d;
                iArr132[i261 - 2] = iArr132[i261 - 2] / iArr132[i262];
                return 0;
            case 186:
                int[] iArr133 = this.d;
                int i263 = this.g;
                iArr133[i263] = 1;
                this.g = i263 + 2;
                iArr133[i263 + 1] = 1;
                return 0;
            case 187:
                Object[] objArr101 = this.cancel;
                int i264 = this.g;
                int[] iArr134 = this.d;
                objArr101[i264 - 1] = new int[iArr134[i264 - 1]];
                int i265 = i264 - 3;
                this.g = i265;
                Object obj94 = objArr101[i265];
                objArr101[i265] = null;
                int i266 = iArr134[i264 - 2];
                Object obj95 = objArr101[i264 - 1];
                objArr101[i264 - 1] = null;
                ((Object[]) obj94)[i266] = obj95;
                this.g = i264 - 2;
                objArr101[i265] = objArr101[i264 - 4];
                return 0;
            case 188:
                int i267 = this.g;
                int i268 = i267 - 1;
                Object[] objArr102 = this.cancel;
                objArr102[i268] = null;
                objArr102[i268] = objArr102[i267 - 2];
                this.g = i267 + 1;
                objArr102[i267] = objArr102[10];
                return 0;
            case 189:
                int i269 = this.g;
                int i270 = i269 - 1;
                Object[] objArr103 = this.cancel;
                Object obj96 = objArr103[i270];
                objArr103[i270] = null;
                objArr103[37] = obj96;
                objArr103[i270] = obj96;
                int[] iArr135 = this.d;
                this.g = i269 + 1;
                iArr135[i269] = 2;
                return 0;
            case 190:
                int[] iArr136 = this.d;
                int i271 = this.g;
                this.g = i271 + 1;
                iArr136[i271] = iArr136[30];
                return 0;
            case 191:
                int i272 = this.g - 1;
                this.g = i272;
                int[] iArr137 = this.d;
                iArr137[35] = iArr137[i272];
                return 0;
            case DerHeader.TAG_CLASS_PRIVATE /* 192 */:
                int i273 = this.g;
                int[] iArr138 = this.d;
                iArr138[32] = iArr138[i273 - 1];
                int i274 = i273 - 2;
                this.g = i274;
                Object[] objArr104 = this.cancel;
                Object obj97 = objArr104[i274];
                objArr104[i274] = null;
                objArr104[31] = obj97;
                return 0;
            case 193:
                Object[] objArr105 = this.cancel;
                int i275 = this.g;
                objArr105[i275] = objArr105[31];
                int[] iArr139 = this.d;
                this.g = i275 + 2;
                iArr139[i275 + 1] = iArr139[32];
                Object obj98 = objArr105[i275];
                objArr105[i275] = null;
                objArr105[i275 + 1] = obj98;
                iArr139[i275] = iArr139[i275 + 1];
                return 0;
            case 194:
                Object[] objArr106 = this.cancel;
                int i276 = this.g;
                Object obj99 = objArr106[i276 - 2];
                objArr106[i276 - 2] = null;
                objArr106[i276 - 1] = obj99;
                int[] iArr140 = this.d;
                iArr140[i276 - 2] = iArr140[i276 - 1];
                this.g = i276 + 1;
                iArr140[i276] = 1;
                return 0;
            case 195:
                int i277 = this.g;
                int i278 = i277 - 1;
                int[] iArr141 = this.d;
                iArr141[33] = iArr141[i278];
                this.g = i277;
                iArr141[i278] = iArr141[34];
                return 0;
            case 196:
                int[] iArr142 = this.d;
                int i279 = this.g;
                iArr142[i279] = iArr142[i279 - 1];
                this.g = i279 + 2;
                iArr142[i279 + 1] = 5;
                return 0;
            case 197:
                Object[] objArr107 = this.cancel;
                int i280 = this.g;
                objArr107[i280] = objArr107[10];
                Object obj100 = objArr107[i280];
                objArr107[i280] = null;
                objArr107[37] = obj100;
                this.g = i280 + 1;
                objArr107[i280] = obj100;
                return 0;
            case 198:
                long[] jArr4 = this.cancelAll;
                int i281 = this.g;
                jArr4[i281 - 1] = this.d[i281 - 1];
                int i282 = i281 - 1;
                this.g = i282;
                jArr4[15] = jArr4[i282];
                return 0;
            case 199:
                int i283 = this.g - 1;
                this.g = i283;
                long[] jArr5 = this.cancelAll;
                jArr5[17] = jArr5[i283];
                return 0;
            case 200:
                int i284 = this.g;
                int i285 = i284 - 1;
                int[] iArr143 = this.d;
                iArr143[10] = iArr143[i285];
                long[] jArr6 = this.cancelAll;
                this.g = i284;
                jArr6[i285] = jArr6[15];
                return 0;
            case 201:
                int i286 = this.g - 1;
                this.g = i286;
                long[] jArr7 = this.cancelAll;
                jArr7[19] = jArr7[i286];
                return 0;
            case 202:
                int i287 = this.g - 1;
                this.g = i287;
                int[] iArr144 = this.d;
                iArr144[11] = iArr144[i287];
                return 0;
            case 203:
                int i288 = this.g - 1;
                this.g = i288;
                int[] iArr145 = this.d;
                iArr145[12] = iArr145[i288];
                return 0;
            case 204:
                int[] iArr146 = this.d;
                int i289 = this.g;
                iArr146[i289] = iArr146[12];
                this.g = i289 + 2;
                iArr146[i289 + 1] = 8;
                return 0;
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                int i290 = this.g;
                int i291 = i290 - 2;
                this.g = i291;
                int[] iArr147 = this.d;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr147[i291] == iArr147[i290 - 1] ? 0 : 1;
                return 0;
            case 206:
                long[] jArr8 = this.cancelAll;
                int i292 = this.g;
                jArr8[i292] = jArr8[19];
                int[] iArr148 = this.d;
                iArr148[i292 + 1] = iArr148[12];
                int i293 = i292 + 1;
                this.g = i293;
                jArr8[i292] = jArr8[i292] >> iArr148[i293];
                return 0;
            case 207:
                int[] iArr149 = this.d;
                int i294 = this.g;
                iArr149[i294 - 1] = (int) this.cancelAll[i294 - 1];
                return 0;
            case 208:
                int[] iArr150 = this.d;
                int i295 = this.g;
                this.g = i295 + 1;
                iArr150[i295] = 255;
                return 0;
            case 209:
                int i296 = this.g;
                int i297 = i296 - 1;
                int[] iArr151 = this.d;
                iArr151[i296 - 2] = iArr151[i296 - 2] & iArr151[i297];
                iArr151[i297] = iArr151[10];
                this.g = i296 + 1;
                iArr151[i296] = 6;
                return 0;
            case 210:
                int i298 = this.g;
                int[] iArr152 = this.d;
                iArr152[i298 - 2] = iArr152[i298 - 2] << iArr152[i298 - 1];
                int i299 = i298 - 2;
                this.g = i299;
                iArr152[i298 - 3] = iArr152[i298 - 3] + iArr152[i299];
                return 0;
            case 211:
                int[] iArr153 = this.d;
                int i300 = this.g;
                iArr153[i300] = 16;
                iArr153[i300 - 1] = iArr153[i300 - 1] << iArr153[i300];
                int i301 = i300 - 1;
                this.g = i301;
                iArr153[i300 - 2] = iArr153[i300 - 2] + iArr153[i301];
                return 0;
            case 212:
                int i302 = this.g;
                int[] iArr154 = this.d;
                iArr154[i302 - 2] = iArr154[i302 - 2] - iArr154[i302 - 1];
                int i303 = i302 - 2;
                this.g = i303;
                iArr154[10] = iArr154[i303];
                return 0;
            case 213:
                int[] iArr155 = this.d;
                iArr155[12] = iArr155[12] + 1;
                return 0;
            case 214:
                long[] jArr9 = this.cancelAll;
                int i304 = this.g;
                this.g = i304 + 1;
                jArr9[i304] = jArr9[17];
                return 0;
            case 215:
                int i305 = this.g - 1;
                this.g = i305;
                long[] jArr10 = this.cancelAll;
                jArr10[19] = jArr10[i305];
                int[] iArr156 = this.d;
                iArr156[11] = iArr156[11] + 1;
                return 0;
            case 216:
                int[] iArr157 = this.d;
                int i306 = this.g;
                this.g = i306 + 1;
                iArr157[i306] = 23;
                return 0;
            case 217:
                int[] iArr158 = this.d;
                int i307 = this.g;
                this.g = i307 + 1;
                iArr158[i307] = 15;
                return 0;
            case 218:
                int i308 = this.g;
                int i309 = i308 - 1;
                this.g = i309;
                long[] jArr11 = this.cancelAll;
                jArr11[i308 - 2] = jArr11[i309] & jArr11[i308 - 2];
                return 0;
            case 219:
                int i310 = this.g - 1;
                this.g = i310;
                long[] jArr12 = this.cancelAll;
                jArr12[21] = jArr12[i310];
                return 0;
            case 220:
                int i311 = this.g - 1;
                this.g = i311;
                long[] jArr13 = this.cancelAll;
                jArr13[23] = jArr13[i311];
                return 0;
            case 221:
                int i312 = this.g;
                int i313 = i312 - 1;
                int[] iArr159 = this.d;
                iArr159[10] = iArr159[i313];
                long[] jArr14 = this.cancelAll;
                this.g = i312;
                jArr14[i313] = jArr14[21];
                return 0;
            case 222:
                int i314 = this.g;
                int i315 = i314 - 1;
                long[] jArr15 = this.cancelAll;
                jArr15[25] = jArr15[i315];
                int[] iArr160 = this.d;
                this.g = i314;
                iArr160[i315] = 0;
                return 0;
            case 223:
                int[] iArr161 = this.d;
                int i316 = this.g;
                iArr161[i316] = 0;
                this.g = i316;
                iArr161[12] = iArr161[i316];
                return 0;
            case 224:
                long[] jArr16 = this.cancelAll;
                int i317 = this.g;
                this.g = i317 + 1;
                jArr16[i317] = jArr16[25];
                return 0;
            case 225:
                int[] iArr162 = this.d;
                int i318 = this.g;
                iArr162[i318] = iArr162[12];
                this.g = i318;
                long[] jArr17 = this.cancelAll;
                jArr17[i318 - 1] = jArr17[i318 - 1] >> iArr162[i318];
                return 0;
            case 226:
                int[] iArr163 = this.d;
                int i319 = this.g;
                iArr163[i319 - 1] = (int) this.cancelAll[i319 - 1];
                iArr163[i319] = 255;
                this.g = i319;
                iArr163[i319 - 1] = iArr163[i319] & iArr163[i319 - 1];
                return 0;
            case 227:
                int[] iArr164 = this.d;
                int i320 = this.g;
                iArr164[i320] = 6;
                this.g = i320;
                iArr164[i320 - 1] = iArr164[i320 - 1] << iArr164[i320];
                return 0;
            case 228:
                int[] iArr165 = this.d;
                int i321 = this.g;
                iArr165[i321] = 16;
                this.g = i321;
                iArr165[i321 - 1] = iArr165[i321 - 1] << iArr165[i321];
                return 0;
            case 229:
                int i322 = this.g;
                int i323 = i322 - 1;
                int[] iArr166 = this.d;
                iArr166[i322 - 2] = iArr166[i322 - 2] + iArr166[i323];
                iArr166[i323] = iArr166[10];
                int i324 = i322 - 1;
                this.g = i324;
                iArr166[i322 - 2] = iArr166[i322 - 2] - iArr166[i324];
                return 0;
            case 230:
                long[] jArr18 = this.cancelAll;
                int i325 = this.g;
                jArr18[i325] = jArr18[23];
                this.g = i325;
                jArr18[25] = jArr18[i325];
                return 0;
            case 231:
                int[] iArr167 = this.d;
                iArr167[11] = iArr167[11] + 1;
                return 0;
            case 232:
                int[] iArr168 = this.d;
                int i326 = this.g;
                iArr168[i326] = 2;
                iArr168[i326 + 1] = 2;
                int i327 = i326 + 1;
                this.g = i327;
                iArr168[i326] = iArr168[i326] % iArr168[i327];
                return 0;
            case 233:
                int[] iArr169 = this.d;
                int i328 = this.g;
                iArr169[i328] = 2;
                this.g = i328 + 2;
                iArr169[i328 + 1] = 2;
                return 0;
            case 234:
                int i329 = this.g;
                int i330 = i329 - 1;
                this.g = i330;
                int[] iArr170 = this.d;
                iArr170[i329 - 2] = iArr170[i329 - 2] % iArr170[i330];
                int i331 = i329 - 2;
                this.g = i331;
                this.cancel[i331] = null;
                return 0;
            case 236:
                int[] iArr171 = this.d;
                int i332 = this.g;
                iArr171[i332] = 105;
                iArr171[i332 - 1] = iArr171[i332 - 1] + iArr171[i332];
                this.g = i332 + 1;
                iArr171[i332] = iArr171[i332 - 1];
            case 235:
                return 0;
            case 237:
                int[] iArr172 = this.d;
                int i333 = this.g;
                this.g = i333 + 1;
                iArr172[i333] = 128;
                return 0;
            case 238:
                int[] iArr173 = this.d;
                int i334 = this.g;
                iArr173[i334] = 61;
                this.g = i334;
                iArr173[i334 - 1] = iArr173[i334 - 1] + iArr173[i334];
                return 0;
            case 239:
                Object[] objArr108 = this.cancel;
                int i335 = this.g;
                objArr108[i335] = objArr108[12];
                this.g = i335 + 2;
                objArr108[i335 + 1] = objArr108[14];
                return 0;
            case 240:
                int[] iArr174 = this.d;
                int i336 = this.g;
                iArr174[i336] = iArr174[13];
                this.g = i336;
                Object[] objArr109 = this.cancel;
                Object obj101 = objArr109[i336 - 1];
                objArr109[i336 - 1] = null;
                objArr109[i336 - 1] = ((Object[]) obj101)[iArr174[i336]];
                return 0;
            case 241:
                int[] iArr175 = this.d;
                iArr175[13] = iArr175[13] + 33;
                return 0;
            case 242:
                int[] iArr176 = this.d;
                int i337 = this.g;
                this.g = i337 + 1;
                iArr176[i337] = 3;
                return 0;
            case 243:
                int i338 = this.g;
                int i339 = i338 - 1;
                int[] iArr177 = this.d;
                iArr177[i338 - 2] = iArr177[i338 - 2] + iArr177[i339];
                iArr177[i339] = iArr177[i338 - 2];
                this.g = i338 + 1;
                iArr177[i338] = 128;
                return 0;
            case 244:
                long[] jArr19 = this.cancelAll;
                int i340 = this.g;
                this.g = i340 + 1;
                jArr19[i340] = jArr19[19];
                return 0;
            case 245:
                int i341 = this.g;
                int i342 = i341 - 1;
                long[] jArr20 = this.cancelAll;
                long j = jArr20[i341 - 2];
                int[] iArr178 = this.d;
                jArr20[i341 - 2] = j << iArr178[i342];
                iArr178[i341 - 2] = (int) jArr20[i341 - 2];
                this.g = i341;
                iArr178[i342] = 32221;
                return 0;
            case 246:
                int i343 = this.g;
                int i344 = i343 - 1;
                int[] iArr179 = this.d;
                iArr179[i343 - 2] = iArr179[i343 - 2] & iArr179[i344];
                iArr179[i344] = iArr179[10];
                this.g = i343 + 1;
                iArr179[i343] = 3;
                return 0;
            case 247:
                int i345 = this.g;
                int i346 = i345 - 1;
                int[] iArr180 = this.d;
                iArr180[i345 - 2] = iArr180[i345 - 2] - iArr180[i346];
                this.g = i345;
                iArr180[i346] = iArr180[10];
                return 0;
            case 248:
                int i347 = this.g;
                int[] iArr181 = this.d;
                iArr181[i347 - 2] = iArr181[i347 - 2] - iArr181[i347 - 1];
                int i348 = i347 - 2;
                iArr181[i347 - 3] = iArr181[i347 - 3] - iArr181[i348];
                this.g = i347 - 1;
                iArr181[i348] = iArr181[10];
                return 0;
            case 249:
                int i349 = this.g;
                int[] iArr182 = this.d;
                iArr182[i349 - 2] = iArr182[i349 - 2] >>> iArr182[i349 - 1];
                int i350 = i349 - 2;
                this.g = i350;
                iArr182[10] = iArr182[i350];
                return 0;
            case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                int[] iArr183 = this.d;
                iArr183[12] = iArr183[12] + 25;
                return 0;
            case 251:
                int[] iArr184 = this.d;
                int i351 = this.g;
                iArr184[i351] = 63;
                this.g = i351;
                iArr184[i351 - 1] = iArr184[i351 - 1] + iArr184[i351];
                return 0;
            case 252:
                int[] iArr185 = this.d;
                int i352 = this.g;
                this.g = i352 + 1;
                iArr185[i352] = 1;
                return 0;
            case 253:
                int[] iArr186 = this.d;
                int i353 = this.g;
                iArr186[i353] = 3;
                iArr186[i353 + 1] = 3;
                int i354 = i353 + 1;
                this.g = i354;
                iArr186[i353] = iArr186[i353] / iArr186[i354];
                return 0;
            case 254:
                int[] iArr187 = this.d;
                int i355 = this.g;
                this.g = i355 + 1;
                iArr187[i355] = 64;
                return 0;
            case 255:
                int[] iArr188 = this.d;
                int i356 = this.g;
                this.g = i356 + 1;
                iArr188[i356] = 82;
                return 0;
            case 256:
                int[] iArr189 = this.d;
                int i357 = this.g;
                this.g = i357 + 1;
                iArr189[i357] = 6;
                return 0;
            case 257:
                int[] iArr190 = this.d;
                int i358 = this.g;
                this.g = i358 + 1;
                iArr190[i358] = 22;
                return 0;
            case 258:
                int[] iArr191 = this.d;
                int i359 = this.g;
                this.g = i359 + 1;
                iArr191[i359] = 63;
                return 0;
            case 259:
                int[] iArr192 = this.d;
                int i360 = this.g;
                this.g = i360 + 1;
                iArr192[i360] = 20;
                return 0;
            case 260:
                int[] iArr193 = this.d;
                int i361 = this.g;
                this.g = i361 + 1;
                iArr193[i361] = 10;
                return 0;
            default:
                return i;
        }
    }

    public setParameters(Object obj, int i) {
        int[] iArr = new int[38];
        this.d = iArr;
        this.cancelAll = new long[38];
        this.onTransact = new float[38];
        this.INotificationSideChannel = new double[38];
        Object[] objArr = new Object[38];
        this.cancel = objArr;
        objArr[9] = obj;
        iArr[10] = i;
        this.g = 0;
        this.f1376a = -1;
    }
}
