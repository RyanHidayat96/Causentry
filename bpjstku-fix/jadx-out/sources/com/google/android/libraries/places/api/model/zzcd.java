package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.getSurfaceInfo;
import java.lang.reflect.Member;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcd implements Parcelable.Creator {
    private static final byte[] $$a = {1, -81, 2, 79, -2, -25, -2, -15, -10, -32, -11, -20, 24, -40, 18, -47, -10, -20, 0, -8, -14, 8, -47, 0, -30, 0, -9, -31, 23, -47, -10, -1, -8, -15, -15, 38, -60, -26, -3, -27, -10, -7, -8, -33, 8, -11, -25, -5, -26, 4, -34, 0, -9, -31, 22, -30, -32, -9, -14, -10, 0, 2, -32, -9, -31, 33, -49, -16, -9, -6, -21, -5, -22, -19, 6, -32, -2, -19, -12, Base64.padSymbol, -61, -46, -1, -24, -2, -19, -12, 17, -30, -37, -1, -5, -22, -19, 33, -57, 4, -19, -19, -5, -22, -19, 5, -20, -18, -3, -18, -18, -6, 17, -50, -5, -19, -2, -32, 2, -26, 52};
    private static final int $$b = 55;

    private static void a(short s, byte b, byte b2, Object[] objArr) {
        int i = 3 - (b2 * 4);
        int i2 = 108 - (s * 2);
        byte[] bArr = $$a;
        int i3 = b * 4;
        byte[] bArr2 = new byte[i3 + 115];
        int i4 = i3 + 114;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i)) - 13;
            i = i;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i7])) - 13;
                i = i7;
                i5 = i6;
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzce((LatLng) parcel.readParcelable(CircularBounds.class.getClassLoader()), parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzce[i];
    }

    zzcd() {
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
        Member[] memberArr = getSurfaceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        byte b = $$a[18];
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        memberArr[0] = Class.forName((String) objArr[0]).getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault3");
    }
}
