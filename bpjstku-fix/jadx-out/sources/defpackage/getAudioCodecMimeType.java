package defpackage;

import android.content.Context;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class getAudioCodecMimeType {
    static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final byte[] TuitionPaymentFragmentbindingInflater1;
    static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[0][i] = i - 63;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[1][i2] = i2 - 95;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[2][i3] = i3 - 46;
        }
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public getAudioCodecMimeType(byte[] bArr) {
        this.TuitionPaymentFragmentbindingInflater1 = bArr;
    }

    /* JADX INFO: renamed from: getAudioCodecMimeType$3, reason: invalid class name */
    public class AnonymousClass3 implements Comparator<ExtendedCameraConfigProviderStore> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public static int b;

        AnonymousClass3() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore, ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore2) {
            return extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - extendedCameraConfigProviderStore2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public static int b() {
            int i = b;
            int i2 = i % 5108390;
            b = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            return i3;
        }
    }

    static Collection<ExtendedCameraConfigProviderStore> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Iterable<ExtendedCameraConfigProviderStore> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore : iterable) {
            ExtendedCameraConfigProviderStore extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2 = extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
            linkedList.add(extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4, i2));
            if (extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != 4) {
                linkedList.add(extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2.b(4, i2));
            }
            if (i2 == 3 || i2 == 4) {
                linkedList.add(extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(2, 16 - i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2(2, 1));
            }
            if (extendedCameraConfigProviderStore.b > 0) {
                linkedList.add(extendedCameraConfigProviderStore.TuitionPaymentFragmentbindingInflater1(i).TuitionPaymentFragmentbindingInflater1(i + 1));
            }
        }
        return TuitionPaymentFragmentbindingInflater1(linkedList);
    }

    static Collection<ExtendedCameraConfigProviderStore> TuitionPaymentFragmentbindingInflater1(Iterable<ExtendedCameraConfigProviderStore> iterable) {
        LinkedList linkedList = new LinkedList();
        for (ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore2 = (ExtendedCameraConfigProviderStore) it.next();
                    if (extendedCameraConfigProviderStore2.b(extendedCameraConfigProviderStore)) {
                        break;
                    }
                    if (extendedCameraConfigProviderStore.b(extendedCameraConfigProviderStore2)) {
                        it.remove();
                    }
                } else {
                    linkedList.add(extendedCameraConfigProviderStore);
                    break;
                }
            }
        }
        return linkedList;
    }
}
