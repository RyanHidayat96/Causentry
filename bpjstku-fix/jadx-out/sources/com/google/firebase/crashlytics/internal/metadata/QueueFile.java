package com.google.firebase.crashlytics.internal.metadata;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
class QueueFile implements Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f821a;
    private static int b;
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;
    private static final byte[] $$c = {68, 83, 49, -116};
    private static final int $$d = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {17, 104, 102, -28, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 188;
    private static int g = 0;
    private static int asInterface = 1;
    private static int d = 0;

    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 3
            int r6 = 84 - r6
            byte[] r0 = com.google.firebase.crashlytics.internal.metadata.QueueFile.$$a
            int r7 = r7 * 2
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + 1
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.QueueFile.e(byte, int, int, java.lang.Object[]):void");
    }

    static /* synthetic */ int access$100(QueueFile queueFile, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 95;
        g = i3 % 128;
        int i4 = i3 % 2;
        int iWrapPosition = queueFile.wrapPosition(i);
        int i5 = g + 61;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return iWrapPosition;
    }

    static /* synthetic */ Object access$200(Object obj, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objNonNull = nonNull(obj, str);
        int i4 = asInterface + 1;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return objNonNull;
    }

    static /* synthetic */ void access$300(QueueFile queueFile, int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        int i5 = g + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        queueFile.ringRead(i, bArr, i2, i3);
        int i7 = asInterface + 63;
        g = i7 % 128;
        int i8 = i7 % 2;
    }

    static /* synthetic */ RandomAccessFile access$400(QueueFile queueFile) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 79;
        g = i3 % 128;
        int i4 = i3 % 2;
        RandomAccessFile randomAccessFile = queueFile.raf;
        int i5 = i2 + 7;
        g = i5 % 128;
        int i6 = i5 % 2;
        return randomAccessFile;
    }

    static {
        f821a = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        LOGGER = Logger.getLogger(QueueFile.class.getName());
        int i = d + 73;
        f821a = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    public QueueFile(File file) throws IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
            int i = g + 91;
            asInterface = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        this.raf = open(file);
        readHeader();
        int i3 = asInterface + 23;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.buffer = new byte[16];
        this.raf = randomAccessFile;
        readHeader();
    }

    private static void writeInt(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = g + 93;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            bArr[i] = (byte) (i2 * 84);
            bArr[i] = (byte) 0;
            bArr[i % 5] = (byte) (i2 << 25);
            bArr[i >> 2] = (byte) i2;
            return;
        }
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i = 2 % 2;
        int i2 = g + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = g + 23;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            writeInt(bArr, i5, iArr[i4]);
            i5 += 4;
            i4++;
            int i8 = g + 41;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 4;
            }
        }
    }

    private static int readInt(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 119;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2 != 0 ? ((((bArr[i] & 1789) << 117) << ((bArr[0] & 18025) % 37)) >>> ((bArr[i % 3] & 29012) >>> 106)) / (bArr[i * 5] & 17640) : ((bArr[i] & UByte.MAX_VALUE) << 24) + ((bArr[i + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i + 2] & UByte.MAX_VALUE) << 8) + (bArr[i + 3] & UByte.MAX_VALUE);
        int i6 = i4 + 121;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    private void readHeader() throws IOException {
        int i = 2 % 2;
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        int i2 = readInt(this.buffer, 0);
        this.fileLength = i2;
        if (i2 > this.raf.length()) {
            StringBuilder sb = new StringBuilder("File is truncated. Expected length: ");
            sb.append(this.fileLength);
            sb.append(", Actual length: ");
            sb.append(this.raf.length());
            throw new IOException(sb.toString());
        }
        int i3 = g + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.elementCount = readInt(this.buffer, 4);
        int i5 = readInt(this.buffer, 8);
        int i6 = readInt(this.buffer, 12);
        this.first = readElement(i5);
        this.last = readElement(i6);
        int i7 = asInterface + 113;
        g = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private void writeHeader(int i, int i2, int i3, int i4) throws IOException {
        int i5 = 2 % 2;
        int i6 = asInterface + 27;
        g = i6 % 128;
        int i7 = i6 % 2;
        writeInts(this.buffer, i, i2, i3, i4);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
        int i8 = g + 29;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private Element readElement(int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = g + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (i == 0) {
            return Element.NULL;
        }
        this.raf.seek(i);
        Element element = new Element(i, this.raf.readInt());
        int i5 = asInterface + 31;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return element;
    }

    private static void initialize(File file) throws IOException {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile randomAccessFileOpen = open(file2);
        try {
            randomAccessFileOpen.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            randomAccessFileOpen.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, 4096, 0, 0, 0);
            randomAccessFileOpen.write(bArr);
            randomAccessFileOpen.close();
            if (file2.renameTo(file)) {
                int i2 = asInterface + 33;
                g = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th) {
            randomAccessFileOpen.close();
            throw th;
        }
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        int i = 2 % 2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        int i2 = asInterface + 81;
        g = i2 % 128;
        int i3 = i2 % 2;
        return randomAccessFile;
    }

    private int wrapPosition(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        int i6 = this.fileLength;
        if (i >= i6) {
            return (i + 16) - i6;
        }
        int i7 = i4 + 83;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 2 / 0;
        }
        return i;
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iResolveSizeAndState = 2267 - View.resolveSizeAndState(0, 0, 0);
                int capsMode = 33 - TextUtils.getCapsMode("", 0, 0);
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSizeAndState, capsMode, 1387473586, false, $$e((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i4 = 1;
            } else {
                int i6 = $11 + 71;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 0;
            }
            if ((i4 ^ 1) != 1) {
                int i8 = $11 + 75;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 3358, (ViewConfiguration.getScrollBarSize() >> 8) + 18, -1054011043, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 33;
                            byte length3 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iCombineMeasuredStates, scrollBarSize, 1387473586, false, $$e((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                        int i11 = $10 + 107;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        j = 3046761265686732006L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ j)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 55904), ((Process.getThreadPriority(0) + 20) >> 6) + 2855, (ViewConfiguration.getLongPressTimeout() >> 16) + 13, -1529949196, false, $$e(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i13 = 0; i13 < length4; i13++) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r5.raf.seek(r6);
        r5.raf.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r5.raf.seek(r6);
        r5.raf.write(r7, r8, r9);
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r1 = r1 - r6;
        r5.raf.seek(r6);
        r5.raf.write(r7, r8, r1);
        r5.raf.seek(16);
        r5.raf.write(r7, r8 + r1, r9 - r1);
        r6 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface + 123;
        com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((r6 - r9) <= r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r6 + r9) <= r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface + 51;
        com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ringWrite(int r6, byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            int r6 = r5.wrapPosition(r6)
            int r1 = r5.fileLength
            int r2 = r6 - r9
            if (r2 > r1) goto L4a
            goto L23
        L19:
            int r6 = r5.wrapPosition(r6)
            int r1 = r5.fileLength
            int r2 = r6 + r9
            if (r2 > r1) goto L4a
        L23:
            int r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3a
            java.io.RandomAccessFile r0 = r5.raf
            long r1 = (long) r6
            r0.seek(r1)
            java.io.RandomAccessFile r6 = r5.raf
            r6.write(r7, r8, r9)
            return
        L3a:
            java.io.RandomAccessFile r0 = r5.raf
            long r1 = (long) r6
            r0.seek(r1)
            java.io.RandomAccessFile r6 = r5.raf
            r6.write(r7, r8, r9)
            r6 = 0
            r6.hashCode()
            throw r6
        L4a:
            int r1 = r1 - r6
            java.io.RandomAccessFile r2 = r5.raf
            long r3 = (long) r6
            r2.seek(r3)
            java.io.RandomAccessFile r6 = r5.raf
            r6.write(r7, r8, r1)
            java.io.RandomAccessFile r6 = r5.raf
            r2 = 16
            r6.seek(r2)
            java.io.RandomAccessFile r6 = r5.raf
            int r8 = r8 + r1
            int r9 = r9 - r1
            r6.write(r7, r8, r9)
            int r6 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface
            int r6 = r6 + 123
            int r7 = r6 % 128
            com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r7
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.QueueFile.ringWrite(int, byte[], int, int):void");
    }

    private void ringRead(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        int i5 = asInterface + 89;
        g = i5 % 128;
        int i6 = i5 % 2;
        int iWrapPosition = wrapPosition(i);
        int i7 = this.fileLength;
        if (iWrapPosition + i3 <= i7) {
            this.raf.seek(iWrapPosition);
            this.raf.readFully(bArr, i2, i3);
            return;
        }
        int i8 = i7 - iWrapPosition;
        this.raf.seek(iWrapPosition);
        this.raf.readFully(bArr, i2, i8);
        this.raf.seek(16L);
        this.raf.readFully(bArr, i2 + i8, i3 - i8);
        int i9 = g + 59;
        asInterface = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void add(byte[] bArr) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        g = i2 % 128;
        int i3 = i2 % 2;
        add(bArr, 0, bArr.length);
        int i4 = g + 117;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    public void add(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            nonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            expandIfNecessary(i2);
            boolean zIsEmpty = isEmpty();
            Element element = new Element(zIsEmpty ? 16 : wrapPosition(this.last.position + 4 + this.last.length), i2);
            writeInt(this.buffer, 0, i2);
            ringWrite(element.position, this.buffer, 0, 4);
            ringWrite(element.position + 4, bArr, i, i2);
            writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element.position : this.first.position, element.position);
            this.last = element;
            this.elementCount++;
            if (zIsEmpty) {
                this.first = element;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r4.last.position < r4.first.position) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface + 45;
        com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return (((r4.last.position - r4.first.position) + 4) + r4.last.length) + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        return (((r4.last.position + 4) + r4.last.length) + r4.fileLength) - r4.first.position;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return (((r4.last.position * r4.first.position) % 4) + r4.last.length) * 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.elementCount == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4.elementCount == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        return 16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int usedBytes() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.g
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface = r2
            int r1 = r1 % r0
            r2 = 16
            if (r1 != 0) goto L19
            int r1 = r4.elementCount
            r3 = 47
            int r3 = r3 / 0
            if (r1 != 0) goto L1e
            goto L1d
        L19:
            int r1 = r4.elementCount
            if (r1 != 0) goto L1e
        L1d:
            return r2
        L1e:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r4.last
            int r1 = r1.position
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r3 = r4.first
            int r3 = r3.position
            if (r1 < r3) goto L58
            int r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface
            int r1 = r1 + 45
            int r3 = r1 % 128
            com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L46
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r4.last
            int r0 = r0.position
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r4.first
            int r1 = r1.position
            int r0 = r0 * r1
            int r0 = r0 % 4
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r4.last
            int r1 = r1.length
            int r0 = r0 + r1
            int r0 = r0 * 63
            goto L57
        L46:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r4.last
            int r0 = r0.position
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r4.first
            int r1 = r1.position
            int r0 = r0 - r1
            int r0 = r0 + 4
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r4.last
            int r1 = r1.length
            int r0 = r0 + r1
            int r0 = r0 + r2
        L57:
            return r0
        L58:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r4.last
            int r0 = r0.position
            int r0 = r0 + 4
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r4.last
            int r1 = r1.length
            int r0 = r0 + r1
            int r1 = r4.fileLength
            int r0 = r0 + r1
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r4.first
            int r1 = r1.position
            int r0 = r0 - r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.QueueFile.usedBytes():int");
    }

    private int remainingBytes() {
        int i = 2 % 2;
        int i2 = g + 111;
        asInterface = i2 % 128;
        int iUsedBytes = (i2 % 2 == 0 ? this.fileLength : this.fileLength) - usedBytes();
        int i3 = asInterface + 61;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            return iUsedBytes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isEmpty() {
        boolean z;
        synchronized (this) {
            z = this.elementCount == 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[PHI: r10
  0x0063: PHI (r10v11 int) = (r10v10 int), (r10v27 int) binds: [B:19:0x0061, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r8.transferTo(16, r0, r8) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r8.transferTo(16, r0, r8) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        throw new java.lang.AssertionError("Copied insufficient number of bytes!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void expandIfNecessary(int r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.QueueFile.expandIfNecessary(int):void");
    }

    final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        private ElementInputStream(Element element) {
            this.position = QueueFile.access$100(QueueFile.this, element.position + 4);
            this.remaining = element.length;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.access$200(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.remaining;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            QueueFile.access$300(QueueFile.this, this.position, bArr, i, i2);
            this.position = QueueFile.access$100(QueueFile.this, this.position + i2);
            this.remaining -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.access$400(QueueFile.this).seek(this.position);
            int i = QueueFile.access$400(QueueFile.this).read();
            this.position = QueueFile.access$100(QueueFile.this, this.position + 1);
            this.remaining--;
            return i;
        }
    }

    private void setLength(int i) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        long j = i;
        this.raf.setLength(j);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 46401), 40 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c((ViewConfiguration.getDoubleTapTimeout() >> 16) - 2084988747, Process.getGidForName("") + 12, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (13 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.combineMeasuredStates(0, 0) - 682184418, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(TextUtils.lastIndexOf("", '0') - 2084988742, AndroidCharacter.getMirror('0') - ',', (short) (AndroidCharacter.getMirror('0') - '0'), (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 54), (-682184397) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -958;
        long j3 = (j2 * 3798035308462927583L) + (j2 * (-1700778133720968596L));
        long j4 = 959;
        long j5 = -1;
        long j6 = j5 ^ (-1700778133720968596L);
        long j7 = j ^ j5;
        long j8 = j5 ^ 3798035308462927583L;
        long j9 = j3 + ((((j6 | j7) ^ j5) | ((j8 | j) ^ j5) | ((j7 | 3798035308462927583L) ^ j5)) * j4) + (((long) (-959)) * ((-219022727026049281L) ^ j5)) + (j4 * (((j8 | j7) ^ j5) | ((j6 | j) ^ j5) | ((j | 3798035308462927583L) ^ j5)));
        int i5 = 0;
        while (true) {
            if (i5 == 10) {
                try {
                    Object[] objArr3 = {-1288094263};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 46038), 1134 - View.resolveSizeAndState(0, 0, 0), 18 - View.getDefaultSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(i), 0, -123304720, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iRgb = Color.rgb(0, 0, 0) + 16778247;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        e(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iRgb, fadingEdgeLength, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1117, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i6 = ((int[]) objArr6[1])[0];
                    int i7 = ((int[]) objArr6[3])[0];
                    if (i7 == i6) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i7 / (((i7 - 1) * i7) % 2), 0).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = g + 121;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37835), TextUtils.getTrimmedLength("") + 59, Gravity.getAbsoluteGravity(0, 0) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (37836 - ExpandableListView.getPackedPositionType(0L)), 59 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getInt(null);
            }
            long j10 = jLongValue;
            int i9 = 0;
            while (true) {
                for (int i10 = 0; i10 != 8; i10++) {
                    i2 = (((((int) (j10 >> i10)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                }
                if (i9 != 0) {
                    break;
                }
                int i11 = g + 111;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                i9++;
                j10 = j9;
            }
            if (i2 == i4) {
                break;
            }
            int i13 = g + 27;
            asInterface = i13 % 128;
            if (i13 % 2 == 0) {
                jLongValue -= 1024;
                i5 += 96;
            } else {
                jLongValue -= 1024;
                i5++;
            }
        }
        this.raf.getChannel().force(true);
        int i14 = g + 103;
        asInterface = i14 % 128;
        int i15 = i14 % 2;
    }

    public byte[] peek() throws IOException {
        synchronized (this) {
            if (isEmpty()) {
                return null;
            }
            int i = this.first.length;
            byte[] bArr = new byte[i];
            ringRead(this.first.position + 4, bArr, 0, i);
            return bArr;
        }
    }

    static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final int position;

        Element(int i, int i2) {
            this.position = i;
            this.length = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.position);
            sb.append(", length = ");
            sb.append(this.length);
            sb.append("]");
            return sb.toString();
        }
    }

    public void peek(ElementReader elementReader) throws IOException {
        synchronized (this) {
            if (this.elementCount > 0) {
                elementReader.read(new ElementInputStream(this.first), this.first.length);
            }
        }
    }

    public void forEach(ElementReader elementReader) throws IOException {
        synchronized (this) {
            int iWrapPosition = this.first.position;
            for (int i = 0; i < this.elementCount; i++) {
                Element element = readElement(iWrapPosition);
                elementReader.read(new ElementInputStream(element), element.length);
                iWrapPosition = wrapPosition(element.position + 4 + element.length);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        throw new java.lang.NullPointerException(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 105;
        com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r2 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> T nonNull(T r3, java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.google.firebase.crashlytics.internal.metadata.QueueFile.g = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 44
            int r1 = r1 / 0
            if (r3 == 0) goto L23
            goto L17
        L15:
            if (r3 == 0) goto L23
        L17:
            int r2 = r2 + 105
            int r4 = r2 % 128
            com.google.firebase.crashlytics.internal.metadata.QueueFile.asInterface = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L21
            return r3
        L21:
            r3 = 0
            throw r3
        L23:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.QueueFile.nonNull(java.lang.Object, java.lang.String):java.lang.Object");
    }

    public int size() {
        int i;
        synchronized (this) {
            i = this.elementCount;
        }
        return i;
    }

    public void remove() throws IOException {
        synchronized (this) {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.elementCount == 1) {
                clear();
            } else {
                int iWrapPosition = wrapPosition(this.first.position + 4 + this.first.length);
                ringRead(iWrapPosition, this.buffer, 0, 4);
                int i = readInt(this.buffer, 0);
                writeHeader(this.fileLength, this.elementCount - 1, iWrapPosition, this.last.position);
                this.elementCount--;
                this.first = new Element(iWrapPosition, i);
            }
        }
    }

    public void clear() throws IOException {
        synchronized (this) {
            writeHeader(4096, 0, 0, 0);
            this.elementCount = 0;
            this.first = Element.NULL;
            this.last = Element.NULL;
            if (this.fileLength > 4096) {
                setLength(4096);
            }
            this.fileLength = 4096;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.raf.close();
        }
    }

    public boolean hasSpaceFor(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = g + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (usedBytes() + 4 + i <= i2) {
            return true;
        }
        int i6 = asInterface + 87;
        g = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public String toString() {
        int i = 2 % 2;
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.fileLength);
        sb.append(", size=");
        sb.append(this.elementCount);
        sb.append(", first=");
        sb.append(this.first);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", element lengths=[");
        try {
            forEach(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1
                boolean first = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i2) throws IOException {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i2);
                }
            });
        } catch (IOException e2) {
            LOGGER.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        String string = sb.toString();
        int i2 = g + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = -1543237116;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795539;
        TuitionPaymentFragmentbindingInflater1 = -253019318;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{-29, 31, -24, -62, Base64.padSymbol, -29, 26, -22, 17, -51, -50, 80, -17, -86, 33, 16, 17, 22, -27, 29, -26, -44, 40, -39, 36, 39, -48, 63, -62, -45, -34, 47, 35, -39, 43, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, int r8) {
        /*
            byte[] r0 = com.google.firebase.crashlytics.internal.metadata.QueueFile.$$c
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = 121 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.QueueFile.$$e(int, short, int):java.lang.String");
    }
}
