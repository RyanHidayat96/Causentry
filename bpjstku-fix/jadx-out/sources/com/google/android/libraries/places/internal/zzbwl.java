package com.google.android.libraries.places.internal;

import com.google.common.io.BaseEncoding;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwl {
    private static final Logger zza = Logger.getLogger(zzbwl.class.getName());
    private static final byte[] zzb = "-bin".getBytes(StandardCharsets.US_ASCII);

    public static byte[][] zza(zzbip zzbipVar) {
        int length;
        int i;
        byte[][] bArrZzc = zzbhh.zzc(zzbipVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArrZzc.length;
            if (i2 >= length) {
                break;
            }
            byte[] bArr = bArrZzc[i2];
            byte[] bArr2 = bArrZzc[i2 + 1];
            if (zzc(bArr, zzb)) {
                i = i3 + 2;
                bArrZzc[i3] = bArr;
                bArrZzc[i3 + 1] = zzbhh.zzb.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr2, bArr2.length).getBytes(StandardCharsets.US_ASCII);
            } else {
                int length2 = bArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = i3 + 2;
                        bArrZzc[i3] = bArr;
                        bArrZzc[i3 + 1] = bArr2;
                    } else {
                        byte b = bArr2[i4];
                        if (b < 32 || b > 126) {
                            String str = new String(bArr, StandardCharsets.US_ASCII);
                            Logger logger = zza;
                            Level level = Level.WARNING;
                            String string = Arrays.toString(bArr2);
                            StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(string).length() + 34);
                            sb.append("Metadata key=");
                            sb.append(str);
                            sb.append(", value=");
                            sb.append(string);
                            sb.append(" contains invalid ASCII characters");
                            logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb.toString());
                        } else {
                            i4++;
                        }
                    }
                    i2 += 2;
                }
            }
            i3 = i;
            i2 += 2;
        }
        return i3 == length ? bArrZzc : (byte[][]) Arrays.copyOfRange(bArrZzc, 0, i3);
    }

    public static byte[][] zzb(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            byte[] bArr4 = zzb;
            if (zzc(bArr2, bArr4)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr5 = bArr[i];
                            byte[] bArr6 = bArr[i + 1];
                            if (zzc(bArr5, bArr4)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr6[i4] == 44) {
                                            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(new String(bArr6, i5, i4 - i5, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    private zzbwl() {
    }
}
