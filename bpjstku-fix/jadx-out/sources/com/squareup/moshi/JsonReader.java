package com.squareup.moshi;

import defpackage.RotationProviderListenerWrapper;
import defpackage.getInProgressTransformationInfo;
import defpackage.getStreamState;
import defpackage.lambdagetPreviewBitmap1;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonReader implements Closeable {
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public boolean b;
    public int g;
    public int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[32];
    public String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new String[32];
    public int[] TuitionPaymentFragmentbindingInflater1 = new int[32];

    /* JADX INFO: loaded from: classes5.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract <T> T INotificationSideChannel() throws IOException;

    public abstract void INotificationSideChannelDefault() throws IOException;

    public abstract void RemoteActionCompatParcelizer() throws IOException;

    public abstract int TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws IOException;

    public abstract void TuitionPaymentFragmentbindingInflater1() throws IOException;

    public abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws IOException;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException;

    public abstract boolean a() throws IOException;

    public abstract double asBinder() throws IOException;

    public abstract boolean asInterface() throws IOException;

    public abstract void b() throws IOException;

    public abstract String cancel() throws IOException;

    public abstract Token cancelAll() throws IOException;

    public abstract long d() throws IOException;

    public abstract int g() throws IOException;

    public abstract void onTransact() throws IOException;

    protected final void TuitionPaymentFragmentbindingInflater1(int i) {
        int i2 = this.g;
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                StringBuilder sb = new StringBuilder("Nesting too deep at ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw new JsonDataException(sb.toString());
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr3[i3] = i;
    }

    protected final JsonEncodingException TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws JsonEncodingException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        throw new JsonEncodingException(sb.toString());
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return getStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        public final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final lambdagetPreviewBitmap1 b;

        private TuitionPaymentFragmentbindingInflater1(String[] strArr, lambdagetPreviewBitmap1 lambdagetpreviewbitmap1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strArr;
            this.b = lambdagetpreviewbitmap1;
        }

        public static TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                for (int i = 0; i < strArr.length; i++) {
                    getInProgressTransformationInfo.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper, strArr[i]);
                    rotationProviderListenerWrapper.cancel();
                    byteStringArr[i] = rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
                }
                return new TuitionPaymentFragmentbindingInflater1((String[]) strArr.clone(), lambdagetPreviewBitmap1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteStringArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
