package com.airbnb.lottie.parser.moshi;

import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.lambdagetPreviewBitmap1;
import defpackage.onPrepare;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] d = new String[128];
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int asBinder;
    public boolean b;
    public int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new int[32];
    public String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new String[32];
    public int[] TuitionPaymentFragmentbindingInflater1 = new int[32];

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

    public abstract String INotificationSideChannel() throws IOException;

    public abstract void TuitionPaymentFragmentbindingInflater1() throws IOException;

    public abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) throws IOException;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException;

    public abstract String a() throws IOException;

    public abstract boolean asBinder() throws IOException;

    public abstract boolean asInterface() throws IOException;

    public abstract void b() throws IOException;

    public abstract Token cancel() throws IOException;

    public abstract void cancelAll() throws IOException;

    public abstract double d() throws IOException;

    public abstract int g() throws IOException;

    public abstract void onTransact() throws IOException;

    static {
        for (int i = 0; i <= 31; i++) {
            d[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = d;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader b(RotationProvider1 rotationProvider1) {
        return new onPrepare(rotationProvider1);
    }

    protected final void TuitionPaymentFragmentbindingInflater1(int i) {
        int i2 = this.asBinder;
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                StringBuilder sb = new StringBuilder("Nesting too deep at ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                throw new JsonDataException(sb.toString());
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = this.asBinder;
        this.asBinder = i3 + 1;
        iArr3[i3] = i;
    }

    protected final JsonEncodingException TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) throws JsonEncodingException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        throw new JsonEncodingException(sb.toString());
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = this.asBinder;
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String[] strArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public final String[] TuitionPaymentFragmentbindingInflater1;
        public final lambdagetPreviewBitmap1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3(String[] strArr, lambdagetPreviewBitmap1 lambdagetpreviewbitmap1) {
            this.TuitionPaymentFragmentbindingInflater1 = strArr;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdagetpreviewbitmap1;
        }

        public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProviderListenerWrapper, strArr[i]);
                    rotationProviderListenerWrapper.cancel();
                    byteStringArr[i] = rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
                }
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault3((String[]) strArr.clone(), lambdagetPreviewBitmap1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteStringArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RotationProviderListener rotationProviderListener, String str) throws IOException {
        String str2;
        String[] strArr = d;
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        rotationProviderListener.b(str, i, i2);
                    }
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    rotationProviderListener.b(str, i, i2);
                }
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            rotationProviderListener.b(str, i, length);
        }
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(34);
    }
}
