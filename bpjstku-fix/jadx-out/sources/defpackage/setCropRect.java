package defpackage;

import android.content.Context;
import android.location.Location;
import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setCropRect implements Function1 {
    private static final byte[] $$a = {111, 40, 23, -13, 10, -4, -65, 55, 6, -2, -10, 3, -9, -57, 54, 1, 7, -15, -5, -3, 16, -16, -57, 66, -15, 6, 0, 3, -17, -4, 10, -3, -10, 1, -4, -59, 22, 33, 7, -15, -5, -3, 16, -16, -21, 17, 6, 0, 3, -17, -36, 42, -3, -10, 1, -4, -38, 39, -5, -6, 7, 4, -49, 49, -23, 0, 9, 2, -13, 4, -3};
    private static final int $$b = 21;
    private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ Context b;

    public /* synthetic */ setCropRect(Context context, Function1 function1, String str) {
        this.b = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    private static void a(byte b, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 3 - (b2 * 3);
        int i3 = (i * 3) + 99;
        int i4 = b * 2;
        byte[] bArr2 = new byte[68 - i4];
        int i5 = 67 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = i3 + i5 + 2;
        }
        while (true) {
            i6++;
            i2++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + bArr[i2] + 2;
        }
    }

    public static /* synthetic */ void b() {
        Member[] memberArr = readDouble.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        byte b = $$a[26];
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        memberArr[0] = Class.forName((String) objArr[0]).getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault2");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ExperimentalCamera2Interop.TuitionPaymentFragmentbindingInflater1(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Location) obj);
    }
}
