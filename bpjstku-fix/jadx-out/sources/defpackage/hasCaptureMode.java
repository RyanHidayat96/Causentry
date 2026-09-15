package defpackage;

import com.google.zxing.NotFoundException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public class hasCaptureMode extends DeferrableSurfaces {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new byte[0];
    private byte[] TuitionPaymentFragmentbindingInflater1;
    private final int[] b;

    public hasCaptureMode(DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0) {
        super(deferrableSurfacesExternalSyntheticLambda0);
        this.TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.b = new int[32];
    }

    @Override // defpackage.DeferrableSurfaces
    public DeferrableSurfaces TuitionPaymentFragmentbindingInflater1(DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0) {
        return new hasCaptureMode(deferrableSurfacesExternalSyntheticLambda0);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        if (this.TuitionPaymentFragmentbindingInflater1.length < i) {
            this.TuitionPaymentFragmentbindingInflater1 = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.b[i2] = 0;
        }
    }

    private static int TuitionPaymentFragmentbindingInflater1(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 <= length / 16) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int i12 = i3 - 1;
        int i13 = -1;
        int i14 = i12;
        while (i12 > i6) {
            int i15 = i12 - i6;
            int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
            if (i16 > i13) {
                i14 = i12;
                i13 = i16;
            }
            i12--;
        }
        return i14 << 3;
    }

    @Override // defpackage.DeferrableSurfaces
    public getBufferFormat TuitionPaymentFragmentbindingInflater1() throws NotFoundException {
        DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1;
        int i2 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getBufferFormat getbufferformat = new getBufferFormat(i, i2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        int[] iArr = this.b;
        for (int i3 = 1; i3 < 5; i3++) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((i2 * i3) / 5, this.TuitionPaymentFragmentbindingInflater1);
            int i4 = (i << 2) / 5;
            for (int i5 = i / 5; i5 < i4; i5++) {
                int i6 = (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i5] & UByte.MAX_VALUE) >> 3;
                iArr[i6] = iArr[i6] + 1;
            }
        }
        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(iArr);
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        for (int i7 = 0; i7 < i2; i7++) {
            for (int i8 = 0; i8 < i; i8++) {
                if ((bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[(i7 * i) + i8] & UByte.MAX_VALUE) < iTuitionPaymentFragmentbindingInflater1) {
                    int i9 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i7) + (i8 / 32);
                    int[] iArr2 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr2[i9] = (1 << (i8 & 31)) | iArr2[i9];
                }
            }
        }
        return getbufferformat;
    }

    @Override // defpackage.DeferrableSurfaces
    public final getFlashType TuitionPaymentFragmentbindingInflater1(int i, getFlashType getflashtype) throws NotFoundException {
        DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1;
        if (getflashtype == null || getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            getflashtype = new getFlashType(i2);
        } else {
            int length = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length;
            for (int i3 = 0; i3 < length; i3++) {
                getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3] = 0;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, this.TuitionPaymentFragmentbindingInflater1);
        int[] iArr = this.b;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i4] & UByte.MAX_VALUE) >> 3;
            iArr[i5] = iArr[i5] + 1;
        }
        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(iArr);
        if (i2 < 3) {
            for (int i6 = 0; i6 < i2; i6++) {
                if ((bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i6] & UByte.MAX_VALUE) < iTuitionPaymentFragmentbindingInflater1) {
                    int[] iArr2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i7 = i6 / 32;
                    iArr2[i7] = (1 << (i6 & 31)) | iArr2[i7];
                }
            }
        } else {
            byte b = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
            byte b2 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1];
            int i8 = b & UByte.MAX_VALUE;
            int i9 = b2 & UByte.MAX_VALUE;
            int i10 = 1;
            int i11 = i8;
            int i12 = i9;
            while (i10 < i2 - 1) {
                int i13 = i10 + 1;
                int i14 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i13] & UByte.MAX_VALUE;
                if ((((i12 << 2) - i11) - i14) / 2 < iTuitionPaymentFragmentbindingInflater1) {
                    int[] iArr3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i15 = i10 / 32;
                    iArr3[i15] = (1 << (i10 & 31)) | iArr3[i15];
                }
                i11 = i12;
                i10 = i13;
                i12 = i14;
            }
        }
        return getflashtype;
    }
}
