package okhttp3.logging;

import defpackage.RotationProviderListenerWrapper;
import defpackage.recalculate;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRotationProviderListenerWrapper;", "", "isProbablyUtf8", "(LRotationProviderListenerWrapper;)Z"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(RotationProviderListenerWrapper rotationProviderListenerWrapper) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        try {
            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
            rotationProviderListenerWrapper.b(rotationProviderListenerWrapper2, 0L, RangesKt.coerceAtMost(rotationProviderListenerWrapper.size, 64L));
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 >= 16) {
                    break;
                }
                i4++;
                if (rotationProviderListenerWrapper2.size == 0) {
                    break;
                }
                if (rotationProviderListenerWrapper2.size == 0) {
                    throw new EOFException();
                }
                byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListenerWrapper2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
                int i6 = 65533;
                if ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & ByteCompanionObject.MIN_VALUE) == 0) {
                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & ByteCompanionObject.MAX_VALUE;
                    i3 = 0;
                    i2 = 1;
                } else if ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 224) == 192) {
                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 31;
                    i2 = 2;
                    i3 = 128;
                } else if ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 240) == 224) {
                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 15;
                    i2 = 3;
                    i3 = 2048;
                } else {
                    if ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 248) == 240) {
                        i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 7;
                        i2 = 4;
                        i3 = 65536;
                    } else {
                        rotationProviderListenerWrapper2.g(1L);
                    }
                    if (!Character.isISOControl(i6) && !Character.isWhitespace(i6)) {
                        return false;
                    }
                }
                long j = i2;
                if (rotationProviderListenerWrapper2.size >= j) {
                    while (true) {
                        if (i5 < i2) {
                            long j2 = i5;
                            byte bTuitionPaymentFragmentspecialinlinedviewModeldefault4 = rotationProviderListenerWrapper2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2);
                            if ((bTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 192) != 128) {
                                rotationProviderListenerWrapper2.g(j2);
                                break;
                            }
                            i = (i << 6) | (bTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 63);
                            i5++;
                        } else {
                            rotationProviderListenerWrapper2.g(j);
                            if (i > 1114111 || ((55296 <= i && i < 57344) || i < i3)) {
                                break;
                            }
                            i6 = i;
                            break;
                        }
                    }
                    if (!Character.isISOControl(i6)) {
                    }
                } else {
                    StringBuilder sb = new StringBuilder("size < ");
                    sb.append(i2);
                    sb.append(": ");
                    sb.append(rotationProviderListenerWrapper2.size);
                    sb.append(" (to read code point prefixed 0x");
                    sb.append(recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    sb.append(')');
                    throw new EOFException(sb.toString());
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
