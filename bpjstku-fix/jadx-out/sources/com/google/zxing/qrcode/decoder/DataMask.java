package com.google.zxing.qrcode.decoder;

import defpackage.getBufferFormat;

/* JADX INFO: loaded from: classes6.dex */
public enum DataMask {
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_000 { // from class: com.google.zxing.qrcode.decoder.DataMask.1
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_001 { // from class: com.google.zxing.qrcode.decoder.DataMask.2
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_010 { // from class: com.google.zxing.qrcode.decoder.DataMask.3
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_011 { // from class: com.google.zxing.qrcode.decoder.DataMask.4
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_100 { // from class: com.google.zxing.qrcode.decoder.DataMask.5
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_101 { // from class: com.google.zxing.qrcode.decoder.DataMask.6
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_110 { // from class: com.google.zxing.qrcode.decoder.DataMask.7
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MASK_111 { // from class: com.google.zxing.qrcode.decoder.DataMask.8
        @Override // com.google.zxing.qrcode.decoder.DataMask
        final boolean b(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    abstract boolean b(int i, int i2);

    /* synthetic */ DataMask(byte b2) {
        this();
    }

    public final void b(getBufferFormat getbufferformat, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (b(i2, i3)) {
                    int i4 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i2) + (i3 / 32);
                    int[] iArr = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr[i4] = (1 << (i3 & 31)) ^ iArr[i4];
                }
            }
        }
    }
}
