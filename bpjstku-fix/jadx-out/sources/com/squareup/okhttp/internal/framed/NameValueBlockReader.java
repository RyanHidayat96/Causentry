package com.squareup.okhttp.internal.framed;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.setBrightness;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.io.encoding.Base64;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
class NameValueBlockReader {
    private int compressedLimit;
    private final setBrightness inflaterSource;
    private final RotationProvider1 source;

    public NameValueBlockReader(RotationProvider1 rotationProvider1) {
        setBrightness setbrightness = new setBrightness(new RotationProviderListenerWrapperExternalSyntheticLambda0(rotationProvider1) { // from class: com.squareup.okhttp.internal.framed.NameValueBlockReader.1
            private static final byte[] $$c = {82, Base64.padSymbol, -66, -42};
            private static final int $$f = 230;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {64, 73, -26, 82, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 19;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2612175615498968084L;

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = 144 - r8
                    byte[] r0 = com.squareup.okhttp.internal.framed.NameValueBlockReader.AnonymousClass1.$$a
                    int r1 = r6 + 1
                    int r7 = r7 * 14
                    int r7 = 98 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r8
                    r4 = r2
                    goto L29
                L12:
                    r3 = r2
                L13:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L29:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + (-11)
                    r8 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.NameValueBlockReader.AnonymousClass1.c(byte, byte, short, java.lang.Object[]):void");
            }

            @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete
            public long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                b = i2 % 128;
                int i3 = i2 % 2;
                if (NameValueBlockReader.this.compressedLimit == 0) {
                    return -1L;
                }
                long j2 = super.read(rotationProviderListenerWrapper, Math.min(j, NameValueBlockReader.this.compressedLimit));
                if (j2 != -1) {
                    NameValueBlockReader nameValueBlockReader = NameValueBlockReader.this;
                    nameValueBlockReader.compressedLimit = (int) (((long) nameValueBlockReader.compressedLimit) - j2);
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 35 / 0;
                    }
                    return j2;
                }
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 81 / 0;
                }
                return -1L;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
                int i3 = 4;
                abortcapture.b = 4;
                int i4 = $11 + 85;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (abortcapture.b < cArrB.length) {
                    int i6 = $10 + 5;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
                    int i8 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - ExpandableListView.getPackedPositionChild(0L)), 1355 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), MotionEvent.axisFromString("") + 39, 894276454, false, $$i(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 47774), 468 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Process.getGidForName("") + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        i3 = 4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r34v0, types: [android.content.Context, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r34v1 */
            /* JADX WARN: Type inference failed for: r34v10 */
            /* JADX WARN: Type inference failed for: r34v11 */
            /* JADX WARN: Type inference failed for: r34v12 */
            /* JADX WARN: Type inference failed for: r34v13 */
            /* JADX WARN: Type inference failed for: r34v14 */
            /* JADX WARN: Type inference failed for: r34v15 */
            /* JADX WARN: Type inference failed for: r34v16 */
            /* JADX WARN: Type inference failed for: r34v17 */
            /* JADX WARN: Type inference failed for: r34v2 */
            /* JADX WARN: Type inference failed for: r34v3 */
            /* JADX WARN: Type inference failed for: r34v4 */
            /* JADX WARN: Type inference failed for: r34v5 */
            /* JADX WARN: Type inference failed for: r34v6 */
            /* JADX WARN: Type inference failed for: r34v7 */
            /* JADX WARN: Type inference failed for: r34v8 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r34, int r35, int r36, int r37) {
                /*
                    Method dump skipped, instruction units count: 1911
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.NameValueBlockReader.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$i(short r6, int r7, int r8) {
                /*
                    int r8 = r8 * 4
                    int r8 = r8 + 1
                    byte[] r0 = com.squareup.okhttp.internal.framed.NameValueBlockReader.AnonymousClass1.$$c
                    int r6 = r6 * 2
                    int r6 = r6 + 107
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r8) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L25:
                    r3 = r0[r7]
                L27:
                    int r7 = r7 + 1
                    int r6 = r6 + r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.NameValueBlockReader.AnonymousClass1.$$i(short, int, int):java.lang.String");
            }
        }, new Inflater() { // from class: com.squareup.okhttp.internal.framed.NameValueBlockReader.2
            @Override // java.util.zip.Inflater
            public int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
                int iInflate = super.inflate(bArr, i, i2);
                if (iInflate != 0 || !needsDictionary()) {
                    return iInflate;
                }
                setDictionary(Spdy3.DICTIONARY);
                return super.inflate(bArr, i, i2);
            }
        });
        this.inflaterSource = setbrightness;
        this.source = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setbrightness);
    }

    public List<Header> readNameValueBlock(int i) throws IOException {
        this.compressedLimit += i;
        int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
        if (iINotificationSideChannelStubProxy < 0) {
            throw new IOException("numberOfPairs < 0: ".concat(String.valueOf(iINotificationSideChannelStubProxy)));
        }
        if (iINotificationSideChannelStubProxy > 1024) {
            throw new IOException("numberOfPairs > 1024: ".concat(String.valueOf(iINotificationSideChannelStubProxy)));
        }
        ArrayList arrayList = new ArrayList(iINotificationSideChannelStubProxy);
        for (int i2 = 0; i2 < iINotificationSideChannelStubProxy; i2++) {
            ByteString byteStringG = readByteString().g();
            ByteString byteString = readByteString();
            if (byteStringG.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new Header(byteStringG, byteString));
        }
        doneReading();
        return arrayList;
    }

    private ByteString readByteString() throws IOException {
        return this.source.TuitionPaymentFragmentbindingInflater1(this.source.INotificationSideChannelStubProxy());
    }

    private void doneReading() throws IOException {
        if (this.compressedLimit > 0) {
            this.inflaterSource.b();
            if (this.compressedLimit == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder("compressedLimit > 0: ");
            sb.append(this.compressedLimit);
            throw new IOException(sb.toString());
        }
    }

    public void close() throws IOException {
        this.source.close();
    }
}
