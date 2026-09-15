package defpackage;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class setRatingType implements onPrepareFromUri<getAudioAttributes> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public setRatingType(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
    }

    @Override // defpackage.onPrepareFromUri
    public final /* synthetic */ getAudioAttributes TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, float f) throws IOException {
        double dB;
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.cancel() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        while (jsonReader.asInterface()) {
            arrayList.add(Float.valueOf((float) jsonReader.d()));
        }
        if (z) {
            jsonReader.b();
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList.size() / 4;
        }
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 4; i4++) {
            int i5 = i4 / 4;
            double dFloatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) dFloatValue;
            } else if (i6 == 1) {
                i2 = (int) (dFloatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (dFloatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (dFloatValue * 255.0d));
            }
        }
        getAudioAttributes getaudioattributes = new getAudioAttributes(fArr, iArr);
        int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 4;
        if (arrayList.size() > i7) {
            int size = (arrayList.size() - i7) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i8 = 0;
            while (i7 < arrayList.size()) {
                if (i7 % 2 == 0) {
                    dArr[i8] = ((Float) arrayList.get(i7)).floatValue();
                } else {
                    dArr2[i8] = ((Float) arrayList.get(i7)).floatValue();
                    i8++;
                }
                i7++;
            }
            for (int i9 = 0; i9 < getaudioattributes.b.length; i9++) {
                int i10 = getaudioattributes.b[i9];
                double d = getaudioattributes.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i9];
                int i11 = 1;
                while (true) {
                    if (i11 < size) {
                        int i12 = i11 - 1;
                        double d2 = dArr[i12];
                        double d3 = dArr[i11];
                        if (d3 >= d) {
                            dB = onSetRepeatMode.b(dArr2[i12], dArr2[i11], (d - d2) / (d3 - d2));
                            break;
                        }
                        i11++;
                    } else {
                        dB = dArr2[size - 1];
                        break;
                    }
                }
                getaudioattributes.b[i9] = Color.argb((int) (dB * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        return getaudioattributes;
    }
}
