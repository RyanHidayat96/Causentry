package defpackage;

import android.util.Log;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class getEventCode {
    public ByteBuffer TuitionPaymentFragmentbindingInflater1;
    public AutoValue_SurfaceRequest_Result TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[256];
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    public final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.TuitionPaymentFragmentbindingInflater1.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                byte b = bArr[i2];
                byte b2 = bArr[i2 + 1];
                int i4 = i2 + 3;
                iArr[i3] = (bArr[i2 + 2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 16) | ViewCompat.MEASURED_STATE_MASK | ((b2 & UByte.MAX_VALUE) << 8);
                i3++;
                i2 = i4;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = 1;
            return iArr;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1;
        do {
            iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            this.TuitionPaymentFragmentbindingInflater1.position(Math.min(this.TuitionPaymentFragmentbindingInflater1.position() + iTuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentbindingInflater1.limit()));
        } while (iTuitionPaymentFragmentbindingInflater1 > 0);
    }

    public final void b() {
        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iTuitionPaymentFragmentbindingInflater1;
        if (iTuitionPaymentFragmentbindingInflater1 <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.TuitionPaymentFragmentbindingInflater1.get(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = 1;
                return;
            }
        }
    }

    public final int TuitionPaymentFragmentbindingInflater1() {
        try {
            return this.TuitionPaymentFragmentbindingInflater1.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = 1;
            return 0;
        }
    }
}
